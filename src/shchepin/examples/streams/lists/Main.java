package shchepin.examples.streams.lists;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> list = null;

        list.stream().filter(Objects::isNull).filter(s -> s.equals("Dima")).findFirst();


  /*      list.stream().filter(Objects::nonNull)
                .map(listElement -> listElement.getCandyType())
                .forEach(candyType -> Assert.assertEquals(ValueType.CANDY, candyType));


        return list.stream().
               .filter(androidRight -> formName.startsWith(androidRight.getFormName()))
                .findFirst()
                .map(AndroidRight::getDescription)
                .orElse(formName);*/
    }
}


