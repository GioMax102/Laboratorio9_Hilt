package mx.tec.tareas.data

import mx.tec.tareas.domain.Tarea

class TareasRepository {

    // El repositorio construye su propia API
    private val api = ApiRemota()

    suspend fun obtenerTareas(): List<Tarea> = api.descargarTareas()
}
