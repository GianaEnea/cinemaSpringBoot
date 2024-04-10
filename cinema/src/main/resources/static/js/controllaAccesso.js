function effettuaLogin() {
    var url = '/login?username=' + encodeURIComponent(document.getElementById("username").value) + '&password=' + encodeURIComponent(document.getElementById("password").value);

    fetch(url)
    .then(response => {
        if (response.ok) {
            return response.json();
        } else {
            throw new Error('Errore nella richiesta di login');
        }
    })
    .then(data => {
        if (data.success) {
            window.location.href = 'home.html';
        } else {
            window.location.href = 'index.html';
        }
    })
    .catch(error => {
        console.error('Si è verificato un errore:', error);
    });
}