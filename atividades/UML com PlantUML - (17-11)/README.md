# AT-11-17 · UML com PlantUML

| | |
| --- | --- |
| **Universidade** | Universidade Federal de Goiás (UFG) |
| **Curso e disciplina** | Engenharia de Computação · Programação Orientada a Objetos (INF0396) |
| **Professor** | Marcelo Akira Inuzuka |
| **Atividade** | Laboratório de UML básico com PlantUML, com entrega até 23/11/2026 |

O AlphaField é um sistema de controle de estoque para pequenas mercearias. Nesta atividade, o objetivo é mostrar as operações de estoque de um Operador e detalhar o que acontece quando ele registra uma saída.

## Diagrama de caso de uso

![Operador do AlphaField ligado a cinco casos de uso de controle de estoque](docs/uml/caso-de-uso.png)

O Operador representa quem usa o sistema no dia a dia da mercearia. O retângulo delimita o AlphaField e as elipses representam as operações que ele oferece. Cada linha liga o Operador a uma operação da qual participa. O diagrama usa associações simples. A checagem do saldo durante uma saída é um passo dessa operação, enquanto **Consultar estoque** representa uma operação que pode ser iniciada por conta própria.

| Arquivo | O que mostra |
| --- | --- |
| [caso-de-uso.puml](docs/uml/caso-de-uso.puml) | Fonte do diagrama para edição no PlantUML. |
| [caso-de-uso.png](docs/uml/caso-de-uso.png) | Imagem gerada a partir do arquivo `.puml`. |
| [descricao-caso-de-uso.md](docs/uml/descricao-caso-de-uso.md) | Fluxo de uma saída, condições de sucesso e alternativas quando o registro não pode ser concluído. |

## Garantia de qualidade

A contribuição de QA foi explicitar o que acontece com o saldo e com o histórico depois de uma operação. Em uma saída válida, os dois são atualizados. Um código inexistente, uma quantidade inválida ou um saldo insuficiente leva à rejeição da tentativa, preservando o saldo e o histórico. A descrição serve de base para definir testes de comportamento após a revisão do grupo. A verificação feita nesta atividade foi a renderização do diagrama.

## Escopo e premissas

A proposta inicial, nas seções 1 e 2.2, documenta o papel de QA, o cadastro e a atualização de produtos, a consulta de estoque, as entradas e saídas e os perfis Gerente e Operador. O diagrama considera que o Operador tem permissão para as cinco operações do recorte. A distribuição dessas permissões entre os perfis ainda precisa ser confirmada.

O fluxo de saída, a quantidade em unidades inteiras, o bloqueio de saldo negativo e o tratamento de falhas foram detalhados como propostas. O recorte cobre uma saída de um produto por vez. A equipe ainda precisa decidir como tratar unidades fracionárias. As regras deste laboratório descrevem um comportamento esperado para discussão e integração com o grupo.

## Como editar e gerar a imagem

O GitHub mostra o PNG acima. Para alterar o diagrama, abra [caso-de-uso.puml](docs/uml/caso-de-uso.puml) e edite o texto. Com Java e Graphviz instalados, salve o [JAR do PlantUML](https://plantuml.com/download) com o nome `plantuml.jar` na pasta da atividade e execute:

```sh
java -jar plantuml.jar -charset UTF-8 -tpng docs/uml/caso-de-uso.puml
```

O comando gera `docs/uml/caso-de-uso.png`. Versione a fonte e a imagem juntas ao atualizar o diagrama.

## Como levar os arquivos ao repositório do grupo

1. Acesse o repositório oficial quando ele estiver disponível. Com acesso de escrita, crie uma branch a partir da branch indicada pelo grupo, por exemplo `docs/at-11-17-uml`. Se tiver somente leitura e o repositório permitir, use um fork. Caso contrário, peça acesso de escrita ao líder.
2. Baixe os três arquivos de `docs/uml/` pelos links acima. No GitHub, abra a pasta de destino na branch de trabalho, use **Add file → Upload files** e mantenha os três arquivos juntos.
3. Se a equipe quiser aproveitar este README, copie as seções desejadas para a documentação do projeto e confira os caminhos da imagem e dos arquivos a partir do novo local.
4. Faça o commit na branch de trabalho. Confira no GitHub a imagem e a descrição. Quando decidir apresentar a contribuição, abra o pull request com destino à branch indicada pelo grupo e sinalize as regras propostas para revisão.

## Referências

- Proposta Inicial do Projeto Alphafield, seções 1 e 2.2, e enunciado da AT-11-17 na Plataforma Turing.
- [Tutorial do professor · UML Básico com PlantUML](https://github.com/poo-ee-2025-1/tutorials/tree/main/uml-b%C3%A1sico)
- [PlantUML · Diagrama de caso de uso](https://plantuml.com/use-case-diagram)
- [GitHub Docs · Branches](https://docs.github.com/pt/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-and-deleting-branches-within-your-repository) · [Forks](https://docs.github.com/pt/pull-requests/collaborating-with-pull-requests/working-with-forks/fork-a-repo) · [Pull requests](https://docs.github.com/pt/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/creating-a-pull-request)
- Plano de ensino de INF0396 e [Guia de Integridade Acadêmica da UFG](https://ufg.br/n/185267-nova-versao-do-guia-de-integridade-academica-traz-capitulo-sobre-ia).

## Uso de inteligência artificial

O Codex auxiliou na leitura das fontes, na elaboração do diagrama e do texto, na conferência da renderização e na organização dos arquivos. A revisão das premissas com o grupo e a explicação dos artefatos fazem parte da preparação do estudante para a entrega.
