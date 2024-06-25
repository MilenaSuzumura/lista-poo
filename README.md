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

## 👥 Informações gerais 👥

### 💼 Sistema de Recursos Humanos 💼️

<details>
    <summary><strong>🗒️ Sobre 🗒️</strong></summary>

A classe `PessoaFuncionaria` é focada em cadastrar funcionários, ver e alterar as informações cadastradas. São elas: nome completo, cpf, endereço e salário.

</details>

<details>
  <summary><strong>💁‍♀️ Cadastrar Funcionário 💁‍♀️</strong></summary><br>

Para cadastrar um funcionário, deve chamar a classe `PessoaFuncionaria` mandando os seguintes parâmetros:
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

Readme Trybe

### 2. Conta Poupança

<details>
  <summary>Descrição</summary><br />

Suponha que você está trabalhando em uma equipe responsável pela construção de um sistema bancário e deve desenvolver a classe que representa a conta poupança. Como missão dada é missão cumprida, implemente a classe `ContaPoupanca` do pacote `com.trybe.acc.contapoupanca`, que deve contemplar os seguintes aspectos:

- Atributos:
    - `saldo`: atributo do tipo `double` para armazenar o valor em dinheiro que a conta possui;
    - `titularConta`: atributo do tipo `String` para armazenar o nome da pessoa portadora da conta.

- Métodos:
    - `depositar`: esse método é responsável por receber um valor do tipo `double` e somá-lo ao saldo da conta;
    - `sacar`: esse método é responsável por receber um valor do tipo `double` e subtraí-lo do saldo da conta;
    - `mostrarSaldo`: esse método deve retornar um valor do tipo `double` representando o saldo da conta.
    - `mostrarTitularConta`: esse método deve retornar o nome da pessoa titular da conta.

Essa conta poupança tem duas restrições a serem levadas em conta no seu projeto:

- ela só pode ser aberta se um depósito for feito no momento da sua abertura;
- ela deve ter o nome da pessoa titular da conta.

Requisitos:  
1 - Criar uma classe ContaPoupanca  
2 - Implementar o método 'depositar'  
3 - Implementar o método 'sacar'  
4 - Implementar o método 'mostrarSaldo'  
5 - Implementar o método 'mostrarTitularConta'

**Dica: use o construtor para adicionar o valor do depósito inicial ao saldo na abertura da conta e o nome da pessoa titular da conta.**

Por exemplo,

Considerando que uma pessoa abra a conta poupança com o valor inicial de R$ 50, cada método deve se comportar da seguinte maneira:

- `depositar`: supondo que o saldo da conta seja R$ 50 e na chamada do método `depositar` seja passado o valor de R$ 100 como argumento, o método deve somar o valor 100 ao saldo, fazendo o valor do saldo ser atualizado para 150;
- `sacar`: supondo que o saldo da conta seja R$ 50 e na chamada do método `sacar` seja passado o valor de R$ 30 como argumento, o método deve subtrair o valor 30 do saldo, fazendo o valor do saldo ser atualizado para 20;
- `mostrarSaldo`: supondo que o saldo da conta seja R$ 50, então o retorno desse método deve ser 50.
- `mostrarTitularConta`: supondo que o nome da pessoa dona da conta seja Carla Pereira, esse método deve retornar um valor do tipo `String` contendo `Carla Pereira`.
</details>

### 3. Pessoa Usuárias

<details>
  <summary>Descrição</summary><br />
  Na ACME Companhia Limitada os nomes das contas de pessoas usuárias são gerados com o nome e o sobrenome da pessoa separados por um ponto. Crie um sistema que gere o nome de uma pessoa usuária seguindo os seguintes critérios:

1. uma classe `Pessoa` que possui dois atributos **protegidos**, _nome_ e _sobrenome_.
2. uma classe `PessoaUsuaria` que deve ter um construtor passando _nome_ e _sobrenome_.
3. na classe `PessoaUsuaria` deve-se adicionar uma função `getPessoaUsuaria()`, que não recebe nenhum parâmetro, e retorna o nome.sobrenome.

    Requisitos:  
    1 - Valida se usuário executa regra  
    2 - Valida se usuário é sub-classe de pessoa  
    3 - Valida se usuário executa regra com nome nulo  
    4 - Valida se usuário executa regra com sobrenome nulo  
    5 - Valida se usuário executa regra com nome vazio  
    6 - Valida se usuário executa regra com sobrenome vazio  
    7 - Valida se método implementa na sub-classe  
    8 - Valida se método implementado tem nome correto  
    9 - Valida se atributos estão declarados  
    10 - Valida se atributos declarados tem nomes corretos  

Por exemplo,

Iniciei a classe `new PessoaUsuaria("bruce", "wayne")`, então a saída da função `getPessoaUsuaria()` deve ser `bruce.wayne`.

Iniciei a classe `new PessoaUsuaria(null, "wayne")`, então a saída da função `getPessoaUsuaria()` deve ser `Pessoa usuária inválida`. O mesmo deve ocorrer se o sobrenome for nulo.

Iniciei a classe `new PessoaUsuaria("", "wayne")`, então a saída da função `getPessoaUsuaria()` deve ser `Pessoa usuária inválida`. O mesmo deve ocorrer se o sobrenome for vazio.


</details>

<details>
<summary><strong> 🗣 Nos dê feedbacks sobre o exercício!</strong></summary>

Ao finalizar e submeter o exercício, não se esqueça de avaliar sua experiência preenchendo o [formulário](https://be-trybe.typeform.com/to/ZTeR4IbH#cohort_hidden=CH1&template=betrybe/java-0x-exercicio-lista-poo).
**Leva menos de 3 minutos!**

</details>

---