

    public class Lift {
        private int currentFloor;
        private int capacity;
        private int maxFloor;

//        private int bonus;

        public Lift() {
        }

        public Lift(int currentFloor, int capacity, int maxFloor) {
            this.currentFloor = currentFloor;
            this.capacity = capacity;
            this.maxFloor = maxFloor;
//            this.bonus = bonus;
        }



//        public int getBonus() {
//            return bonus;
//        }
//
//        public void setBonus(int bonus) {
//            this.bonus = bonus;
//        }

        public int getCurrentFloor() {
            return currentFloor;
        }

        public void setCurrentFloor(int currentFloor) {
            this.currentFloor = currentFloor;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public int getMaxFloor() {
            return maxFloor;
        }

        public void setMaxFloor(int maxFloor) {
            this.maxFloor = maxFloor;
        }

        @Override
        public String toString() {
            return "До какого этажа отвезти груз : "+  currentFloor +"\n"+
                    "Какой вес товара : "+capacity +
                    "\nMAX-этаж : "+  maxFloor ;
//      +              "\nBonus : " + bonus ;
        }



        public void toFloor(){
            int count=0;
            for (int i = currentFloor; i <=maxFloor ; i++) {
                count++;
            }
            System.out.println("Сколько пройдено этажей-"+count);
        }


        public void floor(){
            if (currentFloor>18){
                System.out.println("Данный ЭТАЖ не допустим!");
            }else {
                System.out.println("Данный ЭТАЖ допустим!");
            }
        }

        public void weight(){
            if (capacity>200){
                System.out.println("Данный ВЕС не допустим!");
            }else {
                System.out.println("Данный ВЕС допустим");
            }
        }
    }
