open class Course (var id : Int, var name : String, var description : String) {

        open fun addCocina(cursoProg: ProgramingCourse): String {

            return "Registro exitoso"
        }

        open fun updateCocina(): String {

            return "Modificación exitosa"
        }

        open fun eliminarCocina(): String {

            return "Eliminacion Exitosa"
        }

        
        open fun getCocina(id: Int): ProgramingCourse {

               return listaCursos.[id]
        }
         


        open fun addProgra(cursoProg: ProgramingCourse): String {

            return "Registro exitoso"
        }

        open fun updateProgra(): String {

            return "Modificación exitosa"
        }

        open fun eliminarProgra(): String {

            return "Eliminacion Exitosa"
        }

        
        open fun getProgra(id: Int): ProgramingCourse {

               return listaCursos.[id]
        }
         

    }
    


}