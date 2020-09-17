public class Main {
    public static void main(String[] args) {
        Head head = new Head("Русые","Голубой");
        Leg leg = new Leg(94.2,"Правая");
        Hand hand = new Hand(52.7,"Правая");

        System.out.println(head);
        System.out.println(leg);
        System.out.println(hand);

        Human human = new Human(head,leg,hand);

        System.out.println("\n" + human);

        Leg leg1 = new Leg(74.2,"Левая");
        Head head1 = new Head("Рыжие", "Карие");
        Hand hand1 = new Hand(46.7,"Левая");

        human.setLeg(leg1);
        human.setHead(head1);
        human.setHand(hand1);

        System.out.println("\n" + human);
    }
}
