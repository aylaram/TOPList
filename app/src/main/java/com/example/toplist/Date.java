package com.example.toplist;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {

    private int[] Dat=new int[3];
    private int[] FecP=new int[3];


    //Intance the date
    Date() {
        Calendar D=new GregorianCalendar();
        D.getInstance();
        Dat[0]=D.get(Calendar.DAY_OF_MONTH);
        Dat[1]=D.get(Calendar.MONTH)+1;
        Dat[2]=D.get(Calendar.YEAR);
    }

    public int getDay() {
        return Dat[0];
    }

    public void setDay(int day) {
        this.Dat[0]=day;
    }

    public int getMonth() {
        return Dat[1];
    }

    public int getYear() {
        return Dat[2];
    }

    //Method for showing the Date
    public void showDate(String cad) {
        System.out.println(cad+": "+Dat[0]+"/"+Dat[1]+"/"+Dat[2]);
    }

    //Method that calculate the years of antique
    public int antiguedad() {
        int a=0;

        Calendar c=new GregorianCalendar();
        c.getInstance();

        a=c.get(Calendar.YEAR)-Dat[2];

        if((c.get(Calendar.MONTH)+1<Dat[1])||((c.get(Calendar.MONTH)+1==Dat[1])&&(c.get(Calendar.DAY_OF_MONTH)<Dat[0]))) {
            a--;
        }
        return a;
    }

/*      If we want someday to ask for the date or expiration date

        public String AskDate(String Cad) throws NumberFormatException, IOException {
        boolean bisiesto=false, mismoA=false, mismoM, mismoD=false,Sig;

        //Año

        if (Cad.equals("Caducidad"))
            do {
                System.out.print("Introduzca el año de "+Cad+": ");
                FecP[2]=Integer.parseInt(objeto.readLine());

                if (FecP[2]<Dat[2])
                    System.out.println("Error... La fecha no puede ser en el pasado.\n");
                else if (FecP[2]==Dat[2])
                    mismoA=true;
            }
            while (FecP[2]<Dat[2]);
        else {
            do {
                System.out.print("Introduzca el año de "+Cad+": ");
                FecP[2]=Integer.parseInt(objeto.readLine());

                if (FecP[2]>Dat[2])
                    System.out.println("Error... La fecha no puede ser en el futuro.\n");
                else if (FecP[2]==Dat[2])
                    mismoA=true;
            }
            while (FecP[2]>Dat[2]);
        }

        if ((FecP[2] % 4 == 0) && ((FecP[2] % 100 != 0) || (FecP[2] % 400 == 0)))
            bisiesto=true;

        //Mes

        do {
            mismoM=false;
            do {
                System.out.print("Introduzca el mes de "+Cad+": ");
                FecP[1]=Integer.parseInt(objeto.readLine());

                if (FecP[1]<1)
                    System.out.println("Error... No existe ningún mes menor de 1.\n");
                else if (FecP[1]>12)
                    System.out.println("Error... No existe ningún mes mayor de 12.\n");
            }
            while (FecP[1]<1 || FecP[1]>12);

            if (Cad.equals("Caducidad")) {
                if ((mismoA==true) && (FecP[1]<Dat[1])) {
                    System.out.println("Error... La fecha no puede ser en el pasado.\n");
                    mismoM=true;
                }
                else if (FecP[1]==Dat[1])
                    mismoD=true;
            }
            else {
                if ((mismoA==true) && (FecP[1]>Dat[1])) {
                    System.out.println("Error... La fecha no puede ser en el futuro.\n");
                    mismoM=true;
                }
                else if (FecP[1]==Dat[1])
                    mismoD=true;
            }
        }
        while (mismoM==true);

        //Día

        do {
            do {
                Sig=true;

                System.out.print("Introduzca el día de "+Cad+": ");
                FecP[0]=Integer.parseInt(objeto.readLine());

                if (bisiesto==true && FecP[1]==2 && (FecP[0]<1 || FecP[0]>29)) {
                    System.out.println("Error... El día ha de estar entre 1 y 29.\n");
                    Sig=false;
                }
                else if (bisiesto==false && FecP[1]==2 && (FecP[0]<1 || FecP[0]>28)) {
                    System.out.println("Error... El día ha de estar entre 1 y 28.\n");
                    Sig=false;
                }
                else if (FecP[1]==4 || FecP[1]==6 || FecP[1]==9 || FecP[1]==11 && (FecP[0]<1 || FecP[0]>30)) {
                    System.out.println("Error... El día ha de estar entre 1 y 30.\n");
                    Sig=false;
                }
                else if (FecP[0]<1 || FecP[0]>31) {
                    System.out.println("Error... El día ha de estar entre 1 y 31.\n");
                    Sig=false;
                }
            }
            while (Sig==false);

            if (Cad.equals("Caducidad")) {
                if (mismoD==true && FecP[0]<=Dat[0])
                    System.out.println("Error... La fecha no puede ser en el pasado.\n");
                else
                    mismoD=false;
            }
            else {
                if (mismoD==true && FecP[0]>=Dat[0])
                    System.out.println("Error... La fecha no puede ser en el futuro.\n");
                else
                    mismoD=false;
            }
        }
        while (mismoD==true);

        return (FecP[0]+"/"+FecP[1]+"/"+FecP[2]);
    } */
}