## 📋 Lista de Exercícios - Programação Orientada a Objetos 📋

Lista de Exercícios - Programação Orientada a Objetos são 3 atividades focadas em Programação Orientada a Objetos. 

<strong>OBS:</strong> ESSA ATIVIDADE FOI DESENVOLVIDA NA TRYBE.

<br>

## 📑 Informações básicas e Orientações 📑

<details>
  <summary><strong>⚙️ Técnologias usadas ⚙️</strong></summary><br>

* Java;
* Maven;
</details>

<details>
  <summary><strong>⌨️ Instalando Dependências ⌨️</strong></summary><br>

Execute: `maven install`
</details>
<!--
<details>
  <summary><strong>🛠 Executando Testes 🛠</strong></summary><br>
  
  Para executar todos os testes basta rodar o comando: `mvn test`
  
  Para executar apenas uma classe de testes: `mvn test -Dtest="TestClassName"`
</details>
-->

<br>

## 👥 Informações gerais 👥

### 💼 Sistema de Recursos Humanos 💼️

<details>
    <summary><strong>🗒️ Sobre 🗒️</strong></summary>

A classe `PessoaFuncionaria` é focada em cadastrar funcionários, ver e alterar as informações cadastradas. São elas: nome completo, cpf, endereço e salário.

</details>

<details>
  <summary><strong>💁‍♀️ Cadastrar Funcionário 💁‍♀️</strong></summary><br>

Para cadastrar um funcionário deve chamar a classe `PessoaFuncionaria` mandando os seguintes parâmetros:
1. `nomeCompleto` é o nome completo do funcionário e é do tipo `String`;
2. `cpf` é o cpf do funcionário e é do tipo `String`;
3. `endereco` é o endereço do funcionário e é do tipo `String`;
4. `salario` é o salário do funcionário e é do tipo `double`.

</details>
<details>
<summary><strong>💁‍♂️ Visualizar Informações do funcionário 💁‍♂️</strong></summary>

Para visualizar as informações do funcionário que você criou, pegue o funcionário que você acabou de criar e acesse o `getter`.
1. `getNomeCompleto()` retornará `Nome completo`;
2. `getCpf()` retornará `CPF`;
3. `getEndereco()` retornará `Endereço`;
4. `getSalario()` retornará `Salário`;

</details>
<details>
<summary><strong>💁 Alterar Informações do funcionário 💁</strong></summary>

Para alterar as informações do funcionário que você criou, pegue o funcionário que você acabou de criar e acesse o `setter`.
1. `setNomeCompleto()` altera o `Nome completo` e precisa enviar um parâmetro tipo `String`;
2. `setEndereco()` altera o `Endereço` e precisa enviar um parâmetro tipo `String`;
3. `setSalario()` altera o `Salário` e precisa enviar um parâmetro tipo `double`;

<strong>OBS:</strong> O `CPF` NÃO PODE SER ALTERADO.
</details>

<br>

### 🏦 Conta Poupança 🏦

<details>
    <summary><strong>🗒️ Sobre 🗒️</strong></summary>

A classe `ContaPoupanca` é focada em criar uma conta poupança, sacar, depositar, mostrar o saldo da conta e mostrar o nome do dono da conta.

</details>
<details>
<summary><strong>💰 Cadastrar Conta Poupança 💰</strong></summary>

Para cadastrar uma conta poupança deve chamar a classe `ContaPoupanca` mandando os parâmetros:
1. `titularConta` é o nome do dono da conta e é do tipo `String`;
2. `saldo` é o valor em dinheiro que a conta possui e é do tipo `double`.

</details>
<details>
<summary><strong>💵 Depositar 💵</strong></summary>

Para depositar, deve chamar a função `depositar()` utilizando a conta criada, mandando o valor que gostaria de depositar que deve ser do tipo `double`. O código irá somar com o saldo da conta.

</details>
<details>
<summary><strong>💸 Sacar 💸</strong></summary>

Para sacar, deve chamar a função `sacar()` utilizando a conta criada, mandando o valor que gostaria de depositar que deve ser do tipo `double`. O código irá subtrair com o saldo da conta.

</details>

<details>
<summary><strong>🧾 Mostrar o Saldo 🧾</strong></summary>

Para mostrar o saldo, deve chamar a função `mostrarSaldo()` utilizando a conta criada.

</details>
<details>
<summary><strong>🧑‍💼 Mostrar o Titular da Conta 🧑‍💼</strong></summary>

Para mostrar o nome do titular da conta, deve chamar a função `mostrarTitularConta()` utilizando a conta criada.

</details>

<br>

### 🕵️‍♂️ Pessoa usuária 🕵️‍♂️

<details>
    <summary><strong>🗒️ Sobre 🗒️</strong></summary>

A classe `Pessoa` possui 2 atributos `protegidos`: `nome` e `sobrenome`.

A classe `PessoaUsuaria` extende a classe `Pessoa` e é focada em validar se `nome` e `sobrenome` do novo usuário são válidos ou não.

</details>

<details>
    <summary><strong>🙆‍♀️ Cadastrar Novo Usuário 🙆‍♀️</strong></summary>

Para cadastrar uma nova pessoa usuária deve chamar a classe `PessoaUsuaria` mandando os parâmetros:
1. `nome` é o nome do usuário e é do tipo `String`;
2. `sobrenome` é o sobrenome do usuário e é do tipo `String`.

</details>

<details>
    <summary><strong>🙆 Validar Novo Usuário 🙆</strong></summary>

Para validar o novo usuário, deve chamar a função `getPessoaUsuaria()` utilizando a pessoa usuária criada.
* Caso o usuário seja inválido(alguns dos atributos seja null ou uma String vazia), a mensagem que receberá será: `Pessoa usuária inválida`.
* Se for válida, a mensagem será  nome.sobrenome. **Exemplo:** `milena.suzumura`

</details>
