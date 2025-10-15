# Projeto_SistemaLocadora
Repositório criado para montar um sistema para locação de filmes, com foco na disciplina eletiva Arquitetura e Desenvolvimento Back-End.

# 🎬 Sistema de Locadora de Filmes - Java POO

Projeto desenvolvido como exercício acadêmico da disciplina **Eletiva 01 – Arquitetura e Desenvolvimento Back-end** (Faculdade SENAC, Professor **Danilo Farias**).

Este sistema demonstra a aplicação de Orientação a Objetos em Java, simulando as funcionalidades de uma locadora de filmes (locação, histórico e pagamento de débitos).

---

## 🛠 Estrutura do Projeto

O código é composto por classes de domínio que seguem o diagrama UML fornecido:
---

SistemaLocadoraFilme/
├── Cliente.java      # Dados e informações de contato do cliente.
├── Filme.java        # Item do catálogo com valor de locação.
├── Locacao.java      # Transação que agrega filmes e calcula o valor total.
├── Conta.java        # Gerencia o saldo devedor e o histórico de locações.
└── Principal.java    # Ponto de execução e simulação de clientes e locações.

## 🧩 Funcionalidades Chave

| Classe | Atributo/Método | Descrição |
| :--- | :--- | :--- |
| `Conta` | `saldoDevedor` | Inicializado em `0.0` e acumulado após cada locação. |
| `Conta` | `+ locarFilmes(Filme[] filmes)` | Cria uma `Locacao` e registra no histórico. |
| `Conta` | `+ extratoHistorico()` | Retorna o extrato completo e formatado, incluindo o saldo devedor. |
| `Locacao` | `+ addFilme(Filme filme)` | Adiciona o filme à lista e atualiza o `valorTotalAPagar`. |

---

## 📌 Observações Importantes

1.  **Ajustes de Tipagem:** O `CPF` e o `Telefone` (Classe `Cliente`), e o `valorTotalAPagar` (Classe `Locacao`) foram implementados como **String** e **double**, respectivamente, para melhor adequação a tipos monetários e identificadores de texto em Java, em relação aos tipos `int` sugeridos no diagrama.
2.  **Uso de Arrays:** Os atributos `historicoLocacao` (20 posições em `Conta`) e `listaFilmes` (10 posições em `Locacao`) foram implementados como arrays de tamanho fixo, conforme o diagrama.
3.  **Classe Principal:** A `Principal.java` contém a simulação completa, garantindo: 10 filmes criados, 3 clientes com contas ativas, e 4 a 6 locações por cliente, finalizando com a impressão de todos os extratos.

---

## 🚀 Como Executar

O projeto assume que as classes estão dentro do pacote `locadora`. A execução deve ser feita a partir do diretório que contém a pasta `locadora/`.

### 1. Compilação
Navegue até o diretório apropriado (ex: `src/`) e compile os arquivos:

```bash
javac locadora/*.java

java locadora.Principal
