package exercicios;

import java.text.DecimalFormat;

public class Distribuidora {
    public static void main(String[] args) {

        float sp, rj, mg, es, out, total;
        float psp, prj, pmg, pes, pout;

        //Formatando os numero decimais em até 2 casas
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);

        sp = 67.83643F;
        rj = 36.67866F;
        mg = 29.22988F;
        es = 27.16548F;
        out = 19.84953F;
        total = (sp + rj + mg + es + out);

        System.out.println(total);

        psp = ((sp/total)*100);
        prj = ((rj/total)*100);
        pmg = ((mg/total)*100);
        pes = ((es/total)*100);
        pout = ((out/total)*100);

        System.out.println("Porcentagem de SP " + frmt.format(psp) + "%");
        System.out.println("Porcentagem de RJ " + frmt.format(prj) + "%");
        System.out.println("Porcentagem de MG " + frmt.format(pmg) + "%");
        System.out.println("Porcentagem de ES " + frmt.format(pes) + "%");
        System.out.println("Porcentagem de OUT " + frmt.format(pout) + "%");
    }
}
