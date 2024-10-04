public class Main {
    public static void main(String[] args) {
        Printable[] animals = new Printable[3];

        animals[0] = createObject("mammal");
        animals[1] = createObject("bird");
        animals[2] = createObject("fish");

        for (Printable animal : animals) {
            animal.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className.toLowerCase()) {
            case "mammal":
                return new Mammal("Elephant", "Savannah");
            case "bird":
                return new Bird("Eagle", 2.5);
            case "fish":
                return new Fish("Shark", "Saltwater");
            default:
                return null;
        }
    }
}

/*b) Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
c) Создать Интерфейс Printable с методом void print();
d) Реализовать интерфейс Printable классами 2й, 3й и 4й,
ереопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
e) В классе Main создать возвращаемый метод createObject(String className),
который умеет создавать объекты класса 2й, 3й и 4й и после создания и задания свойств объекту метод возвращает ссылку на объект (пульт). Можно использовать switch для того чтоб определить какого типа нужно создать экземпляр объекта. Например если в параметре передается “2й” метод должен создать объект именно этого типа.
f) В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createObject,
j) Добавить созданных объектов в один массив и c помощью цикла вызвать метод print()
который распечатает всю информацию об объекте;*/