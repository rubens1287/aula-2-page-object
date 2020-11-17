# language: pt


Funcionalidade: Login

  Contexto:
    Dado que eu seja um usuario

  Cenario: Executar Login com credencias validas
    Quando eu logar com usuario "teste123@teste.com.br" e senha "12345"
    Entao serie redirecionado para o menu principal

  Cenario: Executar Login com credencias invalidas
    Quando eu logar com usuario "teste123@teste.com.br" e senha "12345"
    Entao sera apresentado a mensagem "Problemas com o login do usuário"


  Esquema do Cenario: Executar Login invalido - "<Mensagen>"
    Quando eu logar com usuario "<Usuario>" e senha "<Senha>"
    Entao sera apresentado a mensagem "<Mensagen>"

    Exemplos:
      | Usuario                | Senha | Mensagen                         |
      | teste123@teste.com.br  | 12345 | Problemas com o login do usuário |