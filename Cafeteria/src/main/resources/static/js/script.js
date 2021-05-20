/*
Parte del api que anima las letras
*/
 const element = document.querySelector('.my-element');
element.classList.add('animate__animated', 'animate__tada');


/* funcion que valida el formulario */
function validacion() {

  const nombre = document.getElementById("nombre");
  const pvp = document.getElementById("pvp");
  const descripcion = document.getElementById("descripcion");
  const categoria = document.getElementById("categoria");

  if (nombre.value === "") {
    document.getElementById("name-error").innerHTML = "Debes escribir un nombre para el producto";
    return false; 
  }else if (pvp.value === "" || pvp.value <= 0){
    document.getElementById("pvp-error").innerHTML = "Debes rellenar el campo o poner un precio mayor a cero";
    return false; 
  }else if(descripcion.value === ""){
    document.getElementById("descripcion-error").innerHTML = "Debes escribir la descripción del producto";
    return false; 
  }else if(categoria.value === "-1"){
    document.getElementById("categoria-error").innerHTML = "Por favor, introduce una categoría";
    return false; 
  }
  return true;
  
  
}
/* Función que hace que el apartado de pvp admita números flotantes*/
function setTwoNumberDecimal(event){
	this.value= parseFLoat(this.value).toFixed(2);
}

