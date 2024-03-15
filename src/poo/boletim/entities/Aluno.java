package poo.boletim.entities;

public class Aluno {
    public String name;
    public double firstTri;
    public double secondTri;
    public double thirdTri;
    public double finalGrade;

    public void sumGrade(){
        finalGrade = firstTri + secondTri + thirdTri;
    }
    public String approved(){
        if (finalGrade < 60){
            return "FAILED";
        } else {
            return "PASS";
        }
    }
    public String pointsLeft(){
        return "MISSING "+(60 - finalGrade)+" POINTS";
    }
}

