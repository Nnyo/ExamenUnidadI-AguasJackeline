import java.util.*
class ProgramingCourse (id : Int, name : String, description : String) : Course (id, name, description) {

    open fun addProgramingCourse(programingCourse: ProgramingCourse, listProgramingCourse: MutableList<ProgramingCourse>) : MutableList<ProgramingCourse>{
        listProgramingCourse.add(programingCourse)
        return listProgramingCourse;
    }

    open fun deleteProgramingCourse(programingCourse: ProgramingCourse, listProgramingCourse: MutableList<ProgramingCourse>) : MutableList<ProgramingCourse>{
        listProgramingCourse.remove(programingCourse)
        return listProgramingCourse
    }

    open fun updateProgramingCourse(programingCourse: ProgramingCourse, listProgramingCourse: MutableList<ProgramingCourse>, indice : Int) : MutableList<ProgramingCourse>{
        listProgramingCourse[indice] = programingCourse
        return listProgramingCourse;
    }

    open fun getProgramingCourse(listProgramingCourse: MutableList<ProgramingCourse>, indice : Int) : ProgramingCourse{
        return listProgramingCourse[indice];
    }

}