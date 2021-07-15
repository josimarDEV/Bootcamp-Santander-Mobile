package one.digitalinnovation.collections

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, Value: T) {     //adicionar um mapa inicial atraves de variaveis
        map[id] = Value
    }

    fun remove(id: String) = map.remove(id)  //remove elementos do mapa

    fun findById(id: String) = map[id]  //encontrando elementos especifico no mapa

    fun findAll() = map.values  // encontrando todos os elementos no mapa
}