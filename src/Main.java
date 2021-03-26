public class Main {
    public static void main(String[] args) {
        double minTemp = 32, maxTemp = 40, middleTemp = 0, countPatient = 30;
        double minHealthyTemp = 36.2;
        double maxHealthyTemp = 36.9;
        int countHealthyPatients = 0;
        System.out.print("Температура пациентов: ");
        double temperature[] = new double[30];
        for (int i = 0; i < temperature.length; i++) {
            double value = (minTemp + (maxTemp - minTemp)* Math.random());
            temperature[i] = value;
            String result = String.format("%.1f", value);
            System.out.print(" " + result + " ");
            middleTemp += temperature[i];
            if (temperature[i] >= minHealthyTemp && temperature[i] <= maxHealthyTemp) {
                countHealthyPatients += 1;
            }
        }
        middleTemp = Math.round(((middleTemp / temperature.length)* 100.0)/ 100.0);
        System.out.println("\n Средняя температура: " + middleTemp);
        System.out.println("Количество здоровых: " + countHealthyPatients);
    }
}
