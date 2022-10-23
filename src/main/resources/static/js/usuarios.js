// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarUsuarios();
  $('#usuarios').DataTable();
});

const cargarUsuarios=async()=>{

      const request = await fetch('usuarios', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }
      });
      const usuarios = await request.json();

      console.log(usuarios);

let users="";
    usuarios.forEach(user=>
     users +=  ` <tr>
                          <td>${user.id}</td>
                          <td>${user.nombre}</td>
                          <td>${user.apellido}</td>
                          <td>${user.email}</td>
                          <td>
                                <a href="#" class="btn btn-danger btn-circle">
                                     <i class="fas fa-trash"></i>
                                 </a>
                           </td>
                 </tr>`
    )

       document.querySelector('#usuarios tbody').outerHTML = users;

}