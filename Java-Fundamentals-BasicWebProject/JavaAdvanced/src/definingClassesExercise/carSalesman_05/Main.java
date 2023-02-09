package definingClassesExercise.carSalesman_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> engines = new ArrayList<>();

        int enginesCount = Integer.parseInt(scanner.nextLine());

        String efficiency = null;
        int displacement = 0;
        String model = null;
        int power = 0;
        for (int i = 1; i <= enginesCount; i++) {
            String[] engineData = scanner.nextLine().split("\\s+");
            //задължителни
            model = engineData[0];
            power = Integer.parseInt(engineData[1]);

            //опционални
            displacement = 0;
            efficiency = null;
            //проверка дали са въведени опционалните данни
            if (engineData.length == 4) {
                displacement = Integer.parseInt(engineData[2]);
                efficiency = engineData[3];
            } else if (engineData.length == 3) {
                if (Character.isDigit(engineData[2].charAt(0))) {
                    displacement = Integer.parseInt(engineData[2]);
                } else {
                    efficiency = engineData[2];
                }
            }
            //съхраняваме обекта в списък
            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.add(engine);
        }

        int carCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= carCount ; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            //задължителни
             String carModel = carData[0];
             String engineModel = carData[1];
             //опционални
            int weight = 0;
            String color = null;

            //проверяваме дали са въведени опционалните данни
            if (carData.length == 4) {
                weight = Integer.parseInt(carData[2]);
                color = carData[3];
            } else if (carData.length == 3) {
                if (Character.isDigit(carData[2].charAt(0))) {
                    weight = Integer.parseInt(carData[2]);
                } else {
                    color = carData[2];
                }
            }

            //намираме кой е двигателя от въведените
            Engine carEngine = null;
            for (Engine engine : engines) {
                if (engineModel.equals(engine.getModel())) {
                    carEngine = engine;
                    break;
                }
            }

            Car car = new Car(carModel, carEngine, weight, color);

            System.out.print(car);
        }
    }
}
