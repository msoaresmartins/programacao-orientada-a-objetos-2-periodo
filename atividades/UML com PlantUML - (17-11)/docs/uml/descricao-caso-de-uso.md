# Registrar saída de produto

| Campo | Descrição |
| --- | --- |
| **Nome** | Registrar saída de produto |
| **Ator principal** | Operador |
| **Descrição** | Registrar a retirada de um produto do estoque por venda ou baixa. |
| **Pré-condição** | O Operador tem permissão para registrar saídas. Essa permissão está sujeita à confirmação do grupo. |
| **Pós-condição em caso de sucesso** | A saída entra no histórico e o saldo diminui pela quantidade retirada. |
| **Pós-condição em caso de rejeição** | O saldo e o histórico ficam como estavam. |

A proposta do AlphaField prevê a saída de produtos. O fluxo e as regras a seguir são propostas para discussão com o grupo.

## Fluxo principal

1. O Operador abre **Registrar saída de produto**.
2. Informa o código do produto e a quantidade a retirar, depois solicita o registro.
3. O sistema busca o produto pelo código.
4. O sistema verifica se a quantidade é um número inteiro maior que zero.
5. O sistema verifica se há saldo suficiente.
6. O sistema registra a saída e desconta a quantidade do saldo.
7. O sistema confirma a saída e mostra o novo saldo.

## Fluxos alternativos

| Passo | Se acontecer | O sistema faz o quê |
| --- | --- | --- |
| **3a** | Código de produto inexistente. | Informa que o produto não foi encontrado. |
| **4a** | Quantidade em branco, menor ou igual a zero ou que não é um número inteiro. | Pede uma quantidade inteira maior que zero. |
| **5a** | Quantidade maior que o saldo. | Informa que o estoque é insuficiente e mostra o saldo disponível. |
| **6a** | Falha ao gravar a saída ou atualizar o saldo. | Informa a falha e encerra a tentativa sem deixar alterações parciais. |

Nos casos 3a, 4a e 5a, o Operador pode voltar ao passo 2 para corrigir os dados ou encerrar a operação.

## Regras de negócio propostas

- A quantidade é contada em unidades inteiras. O grupo ainda precisa definir como tratar produtos vendidos por peso ou volume.
- Se a quantidade retirada for igual ao saldo disponível, o saldo fica em zero.
- A saída só é confirmada depois de gravar a movimentação e atualizar o saldo.
