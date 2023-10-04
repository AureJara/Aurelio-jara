const aplicacion = document.querySelector('.container')

const url = 'https://jsonplaceholder.typicode.com/users'

fetch(url)
.then(respons => respons.json())
.then(data => {
    data.forEach(usuario => {
        console.log(usuario.name)
        const p = document.createElement('p')
        p.innerHTML = usuario.name
        aplicacion.appendChild(p)
    });
    //console.log(data)
})
.catch(error => console.log(error))