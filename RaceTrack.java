class RaceTrack{
	public static void main(String[] args){
		Car c1=new Car(2022,"Volkwagen",300.0);
		
		System.out.println("Year of manufacturing = "+c1.getYear());
		System.out.println("Maker name = "+c1.getMake());
		System.out.println("Speed of car = "+c1.getSpeed());
		c1.Accelerate();
		System.out.println("Speed of Car = "+c1.getSpeed());
	}
}