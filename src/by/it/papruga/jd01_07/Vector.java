package by.it.papruga.jd01_07;


import java.util.StringJoiner;

public class Vector extends Var {

    private  double[] value;

    public Vector(double[] value) {
        this.value = value;
    }

    public Vector(Vector otherVector) {
        this.value = otherVector.value;
    }

   /* public Vector(String strVector) {

       String[] num = strVector.split( "[{},]");
       double [] mas = new double [num.length];

        for (int i = 0; i < num.length; i++) {
            mas [i] = Double.parseDouble(num[i]);
        }
        this.value = mas;

    }
*/



    @Override
    public String toString() {
        // {1.0, 3.5, 5.8}

        StringJoiner stringJoiner = new StringJoiner(", ", "{", "}");
        for (Double v : value) {
            stringJoiner.add(v.toString());
        }

        return stringJoiner.toString();

    }
}
