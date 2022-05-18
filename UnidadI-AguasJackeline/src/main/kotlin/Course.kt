open class Course (var id : Int, var name : String, var description : String) {

        companion object {
            //Aqui van las listas globales
            var listaCursosCocina =  mutableListOf<CookingCourse>()
            var listaCursosPrograming =  mutableListOf<ProgramingCourse>()
        }

        open fun add(cursoProg: ProgramingCourse): String {

            return "Registro exitoso"
        }

        open fun update(): String {

            return "Modificación exitosa"
        }

        open fun eliminar(): String {

            return "Eliminacion Exitosa"
        }
        
        open fun get(id: Int): String {

               return "Consulta"
        }
}
