package racingcar.util;

import java.util.Scanner;

public class Input {
    public int setInputValue(){
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        return Integer.parseInt(inputValue);
    }
}
