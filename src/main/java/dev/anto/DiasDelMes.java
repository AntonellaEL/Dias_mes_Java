package dev.anto;

public class DiasDelMes {
    int mes;
    int numDias;

    public DiasDelMes(int mes) {
        this.mes = mes;

        switch(mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                numDias = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDias = 30;
                break;
            case 2:
                numDias = 28;
                break;
            default:
                numDias = 0; 
                break;
        }
    }

    public int getNumDias() {
        return numDias;
    }
}
