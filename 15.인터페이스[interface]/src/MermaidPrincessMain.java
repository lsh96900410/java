
public class MermaidPrincessMain {

	public static void main(String[] args) {
		System.out.println("--------- MermaidPrincess ---------");
		MermaidPrincess mp = new MermaidPrincess();
		mp.speak();
		mp.think();
		mp.liveSea();
		mp.fastSwim();
		System.out.println("--------- Mermaid ---------");
		Mermaid m=mp;
		/*
		m.speak();
		m.think();
		*/
		m.liveSea();
		m.fastSwim();
		System.out.println("--------- Princess ---------");
		Princess p=mp;
		p.speak();
		p.think();
		/*
		p.liveSea();
		p.fastSwim();
		*/
		System.out.println("--------- Mermaid < -- > Princess ---------");
		Mermaid m2 =new MermaidPrincess();
		m2.fastSwim();
		m2.liveSea();
		Princess p2=(Princess)m2;
		p2.speak();
		p2.think();
		System.out.println("--------- Object ---------");
		/*
		Object o = new MermaidPrincess();
		o.speak();
		o.think();
		o.fastSwim();
		o.liveSea();
 		*/
	}

}
