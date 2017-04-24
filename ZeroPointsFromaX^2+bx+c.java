 public double zeroPoint2(double a, double b, double c) {

        //Let´s use the pq-formula
        double p_halbe = b / 2;
        double hoch2 = Math.pow(p_halbe, 2);
        double Wurzel_phalbe = Math.sqrt(hoch2 - c);
        double ergb = 0.0;
        if (a == 1) {

            System.out.println(-p_halbe + Wurzel_phalbe);
            ergb = +p_halbe + Wurzel_phalbe;

        } else {

            double aa = a;
            double bb;
            double cc;

            bb = b / a;
            cc = c / a;

            double p_halbe2 = bb / 2;
            double hoch2_2 = Math.pow(p_halbe2, 2);
            double Wurzel_phalbe2 = Math.sqrt(hoch2_2 - cc);

            ergb = +p_halbe2 + Wurzel_phalbe2;

        }

        return ergb;
}

public double zeroPoint1(double a, double b, double c) {

        //Let´s use the pq-formula
        double p_halbe = b / 2;
        double hoch2 = Math.pow(p_halbe, 2);
        double Wurzel_phalbe = Math.sqrt(hoch2 - c);
        double ergb = 0.0;
        if (a == 1) {

            System.out.println(-p_halbe + Wurzel_phalbe);
            ergb = -p_halbe + Wurzel_phalbe;

        } else {


            double bb;
            double cc;

            bb = b / a;
            cc = c / a;

            double p_halbe2 = bb / 2;
            double hoch2_2 = Math.pow(p_halbe2, 2);
            double Wurzel_phalbe2 = Math.sqrt(hoch2_2 - cc);

            ergb = -p_halbe2 + Wurzel_phalbe2;

        }

        return ergb;

    }
