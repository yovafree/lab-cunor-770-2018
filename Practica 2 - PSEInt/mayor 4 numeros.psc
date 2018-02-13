Algoritmo prueba2
	Escribir 'Ingrese el primer número'
	Leer num1
	Escribir 'Ingrese el segundo número'
	Leer num2
	Escribir 'Ingrese el tercer número'
	Leer num3
	Escribir 'Ingrese el cuarto número'
	Leer num4
	
	Si num1>num2 && num1>num3 && num1>num4 Entonces
		Escribir "El mayor es ", num1
	Fin Si
	
	Si num2>num1 && num2>num3 && num2>num4 Entonces
		Escribir "El mayor es ", num2
	Fin Si
	
	Si num3>num2 && num3>num1 && num3>num4 Entonces
		Escribir "El mayor es ", num3
	Fin Si
	
	Si num4>num2 && num4>num3 && num4>num1 Entonces
		Escribir "El mayor es ", num4
	Fin Si
FinAlgoritmo
