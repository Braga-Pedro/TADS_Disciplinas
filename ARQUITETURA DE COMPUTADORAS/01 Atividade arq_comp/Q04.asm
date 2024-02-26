# template
.text 
main:	#lendo o primeiro número inteiro do teclado
	addi $2, $0, 5
	syscall
	# alocando no resgistrador 8
	add $8, $0, $2
	#lendo o segundo número inteiro do teclado
	addi $2, $0, 5
	syscall	
	# alocando no resgistrador 9
	add $9, $0, $2
	
	# formula media ifrn: MD = (2N1+3N2)/5
	# N1: media 1° bimestre
	# N2: media 2° bimestre
	# MD = 2 * N1 + 2 * N2 = X
	# X / 5 = MD
	
	# adicionando o multiplicador da nota 1
	addi $10, $0, 2
	# adicionando o multiplicador da nota 2
	addi $11, $0, 3
	
	# nota1 * 2
	mult $8, $10
	# pegando multiplicação
	mflo $12
	# inserindo resultado da multiplicação no $13
	add $13, $0, $12
	
	# nota2 * 3
	mult $9, $11
	# pegando multiplicação
	mflo $12
	# inserindo resultado da multiplicação no $13
	add $14, $0, $12
	
	# somando resultados multiplicação
	add $15, $13, $14
	
	# inserindo divisor em $16
	addi $16, $0, 5
	# dividindo notas por 5
	div $15, $16
	
	# pegando divisao e alocando em $17
	mflo $4
	# imprimindo o valor
	addi $2, $0, 1
	syscall