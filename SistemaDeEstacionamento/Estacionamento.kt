/*

Atividade - Sistema de Estacionamento

Crie um sistema para controlar veículos e vagas de um estacionamento.
    - Veiculo: placa, modelo e tipo.
    - estacionamento: capacidade e veículois estacionados.
    
O sistema devera permitir registrar entradas e saidas, impedir a entrada quando 
estacionamento estiver lotado e informar a qauntidade de vagas disponiveis.

*/

class Veiculo(
    val placa: String,
    val modelo: String,
    val tipo: String
)

class Estacionamento(
    val capacidade: Int
) {
    val veiculosEstacionados = mutableListOf<Veiculo>()

    fun registrarEntrada(veiculo: Veiculo): Boolean {
        if (vagasDisponiveis() <= 0) {
            println("Entrada não permitida: Estacionamento lotado!")
            return false
        }
        veiculosEstacionados.add(veiculo)
        println("Veículo modelo ${veiculo.modelo} (Placa: ${veiculo.placa}) entrou no estacionamento.")
        return true
    }

    fun registrarSaida(placa: String): Boolean {
        val veiculo = veiculosEstacionados.find { it.placa == placa }
        return if (veiculo != null) {
            veiculosEstacionados.remove(veiculo)
            println("Veículo modelo ${veiculo.modelo} (Placa: $placa) saiu do estacionamento.")
            true
        } else {
            println("Veículo com a placa $placa não foi encontrado.")
            false
        }
    }

    fun vagasDisponiveis(): Int {
        return capacidade - veiculosEstacionados.size
    }
}

fun main() {
    val estacionamento = Estacionamento(capacidade = 2)

    val carro1 = Veiculo("ABC-1234", "Civic", "Carro")
    val carro2 = Veiculo("XYZ-5678", "Corolla", "Carro")
    val moto1 = Veiculo("JKL-9012", "CG 160", "Moto")

    println("--- TESTANDO ENTRADAS ---")
    println("Vagas disponíveis: ${estacionamento.vagasDisponiveis()}")
    
    estacionamento.registrarEntrada(carro1)
    estacionamento.registrarEntrada(carro2)
    
    println("Vagas disponíveis: ${estacionamento.vagasDisponiveis()}")


    estacionamento.registrarEntrada(moto1)

    println("\n--- TESTANDO SAÍDAS ---")
    estacionamento.registrarSaida("ABC-1234")

    println("Vagas disponíveis: ${estacionamento.vagasDisponiveis()}")

    estacionamento.registrarEntrada(moto1)
}