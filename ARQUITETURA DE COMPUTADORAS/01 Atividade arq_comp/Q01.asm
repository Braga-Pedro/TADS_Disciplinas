# template
.text 
main:	#lendo o n�mero inteiro
	addi $2, $0, 5
	syscall
	# pegando o numero e colocando no registrador 9
	add $9, $0, $2
	# multiplacador
	addi $8, $0, 2
	# dobrando o numero
	mult $8, $9
	# pegando multiplica��o
	mflo $12
	# inserindo no registrador 4
	add $4, $0, $12
	# imprimindo o valor
	addi $2, $0, 1
	syscall
	