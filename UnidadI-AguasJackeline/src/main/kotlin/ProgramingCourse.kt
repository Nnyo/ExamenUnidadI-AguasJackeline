import java.util.*
class ProgramingCourse (id : Int, name : String, description : String) : Course (id, name, description) {

    fun addProgramingCourse(programingCourse: ProgramingCourse, listProgramingCourse: MutableList<ProgramingCourse>) : MutableList<ProgramingCourse>{
        listProgramingCourse.add(programingCourse)
        return listProgramingCourse;
    }

    fun deleteProgramingCourse(programingCourse: ProgramingCourse, listProgramingCourse: MutableList<ProgramingCourse>) : MutableList<ProgramingCourse>{
        listProgramingCourse.remove(programingCourse)
        return listProgramingCourse
    }

    fun updateProgramingCourse(programingCourse: ProgramingCourse, listProgramingCourse: MutableList<ProgramingCourse>, indice : Int) : MutableList<ProgramingCourse>{
        listProgramingCourse[indice] = programingCourse
        return listProgramingCourse;
    }

    fun getProgramingCourse(listProgramingCourse: MutableList<ProgramingCourse>, indice : Int) : ProgramingCourse{
        return listProgramingCourse[indice];
    }

}