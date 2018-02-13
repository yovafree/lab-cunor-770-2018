Algoritmo prueba4
	Escribir "Ingrese la tabla que desea mostrar: "
	Leer tabla
	
	//Ejemplo de ciclo For o Ciclo Para
	Para n<-1 Hasta 10 Con Paso 1 Hacer
		Escribir "     ", tabla, " x ", n, " = ", (tabla*n)
	Fin Para
	
	//Ejemplo de ciclo While o Ciclo Mientras
	n<-1
	Mientras n<=10 Hacer
		Escribir "     ", tabla, " x ", n, " = ", (tabla*n)
		n<-n+1
	Fin Mientras
	
	//Ejemplo de ciclo Do While o Ciclo Repetir
	n<-0
	Repetir
		n<-n+1
		Escribir "     ", tabla, " x ", n, " = ", (tabla*n)
	Hasta Que n>9
FinAlgoritmo
