package stack.and.queue;

public class AnimalShelter {
    Queue  dogsAn = new Queue() ;
    int catTime = 0;
    int dogTime = 0;
    Queue  catsAn = new Queue() ;
    public void enq( String animal){
        if(animal.equals("cat") || animal.equals("Cat")){
            catsAn.enqueue("cat");
            catTime++;
        }else if (animal.equals("dog") || animal.equals("Dog")){
            dogsAn.enqueue("dog");
            dogTime++;
        } else if (!animal.equals("dog") || !animal.equals("Dog") || !animal.equals("cat") || !animal.equals("Cat") ){
            System.out.println("Sorry, Only for cats and dogs");
        }
    }
    public String deqDog(){
        return "The oldest poor dog ===> " + dogsAn.dequeue();
    }
    public String deqCat(){
        return "The oldest poor cat===>  " + catsAn.dequeue();
    }
    public String deqAny(){
        if(catsAn.isEmpty()){
            return deqDog();
        }
        if(dogsAn.isEmpty()){
            return deqCat();
        }
        if(catTime > dogTime){
            return deqCat();
        }else{
            return deqDog();
        }
    }
}