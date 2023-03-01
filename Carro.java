public clas Carro{
	private int speed;
	public int acelerar(int a){
		speed += a;
		return speed;
	}
	public int frenar(int a){
		speed -= a;
		return speed;
	}
}