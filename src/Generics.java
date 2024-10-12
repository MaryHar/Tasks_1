//import java.util.ArrayList;
//import java.util.List;
//
//public class Generics {
//    public static void main(String[]args){
//        Tiger[] tigers = new Tiger[10];
//        tigers[0] = new Tiger();
//        Animal[] animals = tigers;
//
//        Animal[] tiger = new Tiger[3];
//
//        Generic<Animal> animalGeneric = new Generic<>();
//       // animalList.add(new Animal());
//        Generic<Tiger> tigerGeneric = new Generic<>();
//      //  animalGeneric = tigerGeneric;
//      Object object = tigerList;
//      animalList.add(new Animal());
//
//    }
//
//    private void casting(Animal animal){
//        Tiger tiger = null; if(animal instanceof  Tiger){
//            tiger =(Tiger) animal;
//        }
//    }
//}
//
//
//
//class Generic1<T> {
//    private T value;
//    public T setValue(T value){
//        this.value = value;
//    }
//    public T getValue(){
//        return value;
//    }
//
//    public T animalValue() {
//        System.out.println("This is my value $value");
//    }
//
//}
//class Animal {
//    protected String name;
//}
//class Tiger extends Animal{
//
//}
//
//
