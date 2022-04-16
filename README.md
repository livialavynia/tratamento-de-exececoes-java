
Exercício resolvido utilizando o conceito de tratamento de exceções em java
# Enunciado:

1. Utilize exceções para sinalizar erros em um sistema de contas.
- Para obter o saldo, deve-se verificar a corretude da senha (usar método validarSenha)
- Caso a senha seja validada, deve-se devolver o saldo
- Caso a senha não seja validada, deve-se sinalizar o erro “ErroPermissaoException”
- Para o depósito, só são permitidos valores positivos
- Caso seja fornecido um valor positivo, deve-se realizar o depósito desse valor.
- Caso seja fornecido um valor <= 0, deve-se sinalizar o erro “ErroValorException”
- Para saques, só é permitido realizar se a senha for correta
- Caso a senha seja validada, deve-se prosseguir com a operação do saque
- Caso a senha não seja validada, deve-se sinalizar o erro “ErroPermissaoException”
- Para saques, só é permitido sacar valores positivos e que tenham saldo suficiente
- Caso seja fornecido um valor positivo, deve-se verificar a existência de saldo.
- Se houver saldo suficiente, deve-se efetuar o saque normalmente.
- Se não houver saldo suficiente, deve-se sinalizar o erro “ErroSaldoException”
- Caso seja fornecido um valor <= 0, deve-se sinalizar o erro “ErroValorException”
- Para saques em contas corrente, pode-se ter saldo negativo, desde que não ultrapasse o
limite disponível
- Se mesmo somando o saldo e o limite o valor não for suficiente, deve-se sinalizar o erro
“ErroSaldoException”

