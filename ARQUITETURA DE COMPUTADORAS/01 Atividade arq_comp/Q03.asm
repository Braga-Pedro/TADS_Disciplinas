# template
.text 
main:	#lendo o primeiro número inteiro do teclado
	addi $2, $0, 5
	syscall
	# pegando o numero e colocando no registrador 8
	add $8, $0, $2
	#lendo o segundo número inteiro do teclado
	addi $2, $0, 5
	syscall	
	# pegando o numero e colocando no registrador 9
	add $9, $0, $2
	# multiplacador
	add $8, $0, $9
	# dobrando o numero
	mult $8, $9
	# pegando multiplicação
	mflo $12
	# inserindo no registrador 4
	add $4, $0, $12
	# imprimindo o valor
	addi $2, $0, 1
	syscall