package Ch3;

import java.util.LinkedList;

public class Q6 {

    public class Animal{
        private char type;
        private int order;

        public Animal (char type){
            this.type = type;
        }

        public char getType(){
            return type;

        }

        public void setOrder(int o){
            order = o;
        }

        public int getOrder(){
            return order;
        }
    }

    public static class AnimalShelter{
        private LinkedList<Animal> cat;
        private LinkedList<Animal> dog;
        private int order;

        public AnimalShelter(){
            cat = new LinkedList<Animal>();
            dog = new LinkedList<Animal>();
            order = 1;
        }

        public void enqueue(Animal a){
            a.setOrder(order++);
            if(a.getType() == 'c'){
                cat.add(a);
            }
            else{
                dog.add(a);
            }
        }

        public Animal dequeueCat(){
            if(cat.peekFirst() != null)
                return cat.removeFirst();
            else
                return null;
        }

        public Animal dequeueDog(){
            if(dog.peekFirst() != null)
                return dog.removeFirst();
            else    
                return null;
        }

        public Animal dequeueAny(){
            if(cat.peekFirst() == null && dog.peekFirst() == null){
                return null;
            }

            else if (cat.peekFirst() == null){
                return dequeueDog();
            }

            else if (dog.peekFirst() == null){
                return dequeueCat();
            }

            else{
                Animal c = cat.peekFirst();
                Animal d = dog.peekFirst();

                if(c.getOrder() < d.getOrder()){
                    return dequeueCat();
                }
                else{
                    return dequeueDog();
                }
            }
        }
    }

    public static void main(String [] args){
        AnimalShelter as = new AnimalShelter();
        as.enqueue(new Q6().new Animal('c'));
        as.enqueue(new Q6().new Animal('d'));
        as.enqueue(new Q6().new Animal('d'));
        as.enqueue(new Q6().new Animal('c'));

        System.out.println(as.dequeueAny().getType());
        System.out.println(as.dequeueAny().getType());
        System.out.println(as.dequeueCat().getType());
        System.out.println(as.dequeueDog().getType());
        
    }
    
}