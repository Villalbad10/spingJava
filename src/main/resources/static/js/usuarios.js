// Call the dataTables jQuery plugin
$(document).ready(function () {
  cargarUsuarios();
  $('#usuarios').DataTable();
});

const cargarUsuarios = async () => {

  const request = await fetch('api/usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const usuarios = await request.json();

  let users = "";
  usuarios.forEach(user =>
    users += ` <tr>
                          <td>${user.id}</td>
                          <td>${user.nombre}</td>
                          <td>${user.apellido}</td>
                          <td>${user.email}</td>
                          <td>
                                <a href="#" onClick="eliminarUsuario(${user.id})" class="btn btn-danger btn-circle">
                                     <i class="fas fa-trash"></i>
                                 </a>
                           </td>
                 </tr>`
  )

  document.querySelector('#usuarios tbody').outerHTML = users;

}

const eliminarUsuario = async (id) => {
  await fetch(`api/usuario/${id}`, {
    method: 'DELETE',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
}