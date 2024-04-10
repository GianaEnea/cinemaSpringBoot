function getfilm() {
    var url = '/home';

    fetch(url)
    .then(response => {
        if (response.ok) {
            return response.json();
        } else {
            throw new Error('Errore nella richiesta dei film');
        }
    })
    .then(data => {
        if (data.success) {

            faitablella(response);

            window.location.href = 'home.html';

        } else {

            window.location.href = 'home.html';
            window.alert('Errore: Impossibile trovare i film');
        }
    })
    .catch(error => {
        console.error('Si è verificato un errore:', error);
    });
}

// Funzione per visualizzare i dati nella tabella
function faitablella(films) {
    var table = document.getElementById("filmTable");

    // Cicla sui film e riempi la tabella
    films.forEach(function(film) {
        var row = table.insertRow();
        
        var idCell = row.insertCell();
        idCell.appendChild(document.createTextNode(film.id));
        
        var locandinaCell = row.insertCell();
        var locandinaImg = document.createElement("img");
        locandinaImg.src = "images/"+film.locandina;
        locandinaImg.alt = film.titolo;
        locandinaImg.width = 100;
        locandinaCell.appendChild(locandinaImg);
        
        var titoloCell = row.insertCell();
        titoloCell.appendChild(document.createTextNode(film.titolo));
        
        var durataCell = row.insertCell();
        durataCell.appendChild(document.createTextNode(film.durata + " min"));
    });
}

// Richiedi i dati al caricamento della pagina
window.onload = function () {
    fetchData();
};
