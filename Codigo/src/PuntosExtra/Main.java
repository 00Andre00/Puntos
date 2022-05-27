package PuntosExtra;

public class Main {
    public static void main(String args[]) {
        Docente ethel = new Docente("Ethel");
        Docente freddy = new Docente("Freddy");

        Docente sarita = new Docente("Sarita");
        Docente godofredo = new Docente("Godofredo");

        Docente cesar = new Docente("Cesar");
        Docente edwin = new Docente("Edwin");

        Curso cursoIngles = new Curso("Ingles");
        cursoIngles.setDocente(ethel);
        cursoIngles.setDocente(freddy);

        Curso cursoCalculo = new Curso("Calculo");
        cursoCalculo.setDocente(sarita);
        cursoCalculo.setDocente(godofredo);

        Curso cursoProgramacion = new Curso("Programacion");
        cursoProgramacion.setDocente(cesar);
        cursoProgramacion.setDocente(edwin);

        Estudiante estudiante = new Estudiante("Leonardo Perez Marin", 21);

        estudiante.setCurso(cursoIngles);
        estudiante.setCurso(cursoCalculo);
        estudiante.setCurso(cursoProgramacion);

        Matricula matricula = new Matricula("2022-I Ing.Sistemas", 2344);
        matricula.setEstudiante(estudiante);

        for (Estudiante e : matricula.getEstudiante()) {
            System.out.println("nombre:" + e.getNombre());
            System.out.println("edad:" + e.getEdad());
            System.out.println("semestre: " + matricula.getSemestre());
            System.out.println("Estas matriculandote a: ");

            for (Curso c : e.getCurso()) {
                System.out.println();
                System.out.println("Curso: " + c.getNombre());

                for (Docente d : c.getDocente()) {
                    System.out.println("Docente: " + d.getNombre());
                }
            }
        }

    }

}
