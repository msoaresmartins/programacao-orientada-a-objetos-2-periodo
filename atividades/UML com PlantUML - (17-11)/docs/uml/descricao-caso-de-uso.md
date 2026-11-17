# Registrar saída de produto

| Campo | Descrição |
| --- | --- |
| **Nome** | Registrar saída de produto |
| **Ator principal** | Operador |
| **Descrição** | O Operador registra a retirada de uma quantidade de um produto do estoque, por venda ou baixa. |
| **Pré-condições** | O Operador tem acesso à função de registrar saídas (permissão proposta). |
| **Pós-condições em caso de sucesso** | A saída aparece no histórico de movimentações e o saldo do produto diminui pela quantidade informada. |
| **Pós-condições em caso de rejeição** | A tentativa rejeitada mantém o saldo e o histórico de movimentações como estavam. |

A proposta inicial do AlphaField prevê saídas por venda ou baixa e consulta ao histórico de movimentações. Os passos de interação e as regras abaixo detalham esse escopo para o laboratório e ficam sujeitos à validação do grupo.

## Fluxo principal

1. O Operador abre a função **Registrar saída de produto**.
2. O Operador informa o código do produto e a quantidade que deseja retirar, então solicita o registro.
3. O AlphaField localiza o produto pelo código.
4. O AlphaField verifica se a quantidade informada é válida.
5. O AlphaField verifica se o saldo atual cobre a quantidade solicitada.
6. O AlphaField registra a saída no histórico e atualiza o saldo.
7. O AlphaField confirma o registro e informa o saldo resultante.

## Fluxos alternativos

| Passo | Situação | Resposta do sistema |
| --- | --- | --- |
| **3a** | O código informado não corresponde a um produto cadastrado. | Informa que o produto não foi encontrado. O Operador pode corrigir o código no passo 2 ou encerrar a operação. |
| **4a** | A quantidade está em branco, não é um número inteiro ou é menor ou igual a zero. | Informa que é preciso digitar uma quantidade inteira maior que zero. O Operador pode corrigi-la no passo 2 ou encerrar a operação. |
| **5a** | A quantidade solicitada é maior que o saldo disponível. | Informa que o estoque é insuficiente e mostra o saldo disponível. O Operador pode ajustar a quantidade no passo 2 ou encerrar a operação. |
| **6a** | O sistema não consegue concluir o registro da saída ou a atualização do saldo. | Informa que a saída não foi registrada e encerra a tentativa sem deixar alteração parcial no saldo ou no histórico. |

## Regras de negócio propostas

- A quantidade é medida em unidades inteiras neste recorte. A venda por peso ou volume depende de definição do grupo.
- A saída pode consumir todo o saldo disponível. Se a quantidade solicitada for igual ao saldo, o saldo final será zero.
- A saída só é confirmada quando o registro da movimentação e a atualização do saldo forem concluídos. O saldo final é o saldo anterior menos a quantidade retirada.

O caso de uso detalha a interação e o comportamento esperado do AlphaField. Esses critérios podem orientar testes futuros depois da validação com a equipe.
