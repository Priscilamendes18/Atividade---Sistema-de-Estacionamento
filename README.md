# Atividade---Sistema-de-Estacionamento

🚗 Sistema de Estacionamento em Kotlin

Este projeto é uma aplicação em Kotlin desenvolvida como atividade prática para a disciplina de Programação para Dispositivos Móveis I da Fatec Diadema - Luigi Papaiz.

O objetivo da atividade é aplicar os conceitos fundamentais de Programação Orientada a Objetos (POO) e Coleções na linguagem Kotlin para gerenciar o controle de vagas e veículos de um estacionamento.

🛠️ Funcionalidades

Cadastro de Veículos: Representação de veículos por placa, modelo e tipo (ex: Carro, Moto).

Controle de Entrada: Permite a entrada de veículos verificando se há vagas disponíveis no estacionamento.

Bloqueio por Lotação: Impede o registro de novos veículos caso a capacidade máxima do estacionamento tenha sido atingida.

Controle de Saída: Remove o veículo do estacionamento através da consulta por placa.

Consulta de Vagas: Exibe em tempo real a quantidade de vagas ainda disponíveis.

📚 Conceitos Aplicados

Neste projeto foram utilizados os seguintes tópicos da linguagem Kotlin:

Classes e Objetos: Definição da estrutura e comportamentos das entidades (Veiculo e Estacionamento).

Propriedades (val/var): Gerenciamento de atributos imutáveis e mutáveis.

Métodos: Implementação das regras de negócio dentro da classe (registrarEntrada, registrarSaida, vagasDisponiveis).

Coleções Mutáveis (MutableList): Armazenamento dinâmico dos veículos atualmente estacionados.

📁 Estrutura do Código

├── Veiculo.kt         # Classe com as propriedades placa, modelo e tipo
├── Estacionamento.kt  # Classe principal contendo as regras do estacionamento
└── Main.kt            # Função principal para execução e teste do fluxo


🚀 Como Executar

Tenha o JDK (Java Development Kit) e o compilador Kotlin configurados, ou utilize uma IDE como o IntelliJ IDEA ou Android Studio.

Clone este repositório:

git clone https://github.com/seu-usuario/nome-do-repositorio.git


Abra o projeto na sua IDE favorita.

Execute o arquivo Main.kt.

💡 Exemplo de Execução Online

Você também pode rodar o código diretamente no navegador pelo Kotlin Playground:

Copie o código Kotlin completo.

Cole no editor do Kotlin Playground.

Clique no botão Run.

🎓 Autor

Desenvolvido para a aula de Programação para Dispositivos Móveis I — Prof. Rafael Miranda

Fatec Diadema - Luigi Papaiz
