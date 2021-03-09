publicclass Jarra {//variables de instancia
privateint cantidad;
privateint capacidad;
publicJarra(int capacidadInicial){
if(capacidadInicial<=0){
thrownew RuntimeException("ERROR: no se pueden crear jarras “ + "con capacidad menor o igual que cero.");
}
this.capacidad=capacidadInicial;
}
//  Aquí vendrán después los métodos creados en la siguiente fasepublicvoid metodoComunitario(){ 
// Comentario incluido para pruebas System.out.println("Aqui escribimos todos");
}
}