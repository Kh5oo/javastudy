package com.java.study;

import javax.xml.namespace.QName;

//package 안에 같은 이름의 클래스가 2개 있을 수 없다.
//생성자 : 객체의 필드값 대입(초기화)를 강제
class Animal{
    String name;
    String [] legs;
    String mouth;
    int tail;

    public Animal(String name) {
        this.name=name;
    }

    public String drink(String a){
        System.out.println(name+" drink "+a);
        return "오줌";
    }

    @Override
    public String toString() {
        return "동물의 이름은"+this.name;
    }
}
class Giraff extends Animal{
public Giraff(String name) {
        super(name);
        }


//this super 필드접근
//this(), super() : 생성자 실행
// == this.name=name;

@Override // @ : 어노테이즈
// >>>>컴파일할 때 (저장,javac) @이 있는 대상을 검사하거나 자동구현하는 기능
// @Override : 부모의 함수를 재정의하는지 검사해서 컴파일
// 만약 부모의 함수중에 같은 이름이 없으면 오버라이드 대상이 아니라서 오류남.
public String drink(String a) {
        System.out.print("목을 내려서");
        return super.drink(a);
        }
public int neckattack(){
        System.out.println(name+"이 목을 휘두른다.");
        return 7;
        }
        }
class Zebra extends Animal{
    //상속하는 대상을 부모 (super로 접근)
    //상속받는 자식을 자식 (this로 접근)
    //자식은 부모의 필드를 물려받는다. 부모의 재산은 내거!(this. 로 접근가능)
    //생성자를 정의하면 default 생성자가 만들어지지 않는다.(생성시 초기화를 강제)
    //public Zebra(){}
    public Zebra(String name){
        super(name);
    }

class Hippo extends Animal{
        public Hippo (String name){
            super(name);
        }
}

}
public class L03Inheritance {


    public static void main(String[] args) {
        Zebra zebra = new Zebra("zebra");

        String a =zebra.drink("milk");
        a+= zebra.drink("water");
        System.out.println(a);

        Giraff giraff = new Giraff("목 긴 기린 ");
        giraff.drink("water");
        int attack = giraff.neckattack();
        System.out.println("zebra "+attack+" 데미지를 입는다");

        Animal giraffe2 = new Giraff("목 짧은 기린");
        giraffe2.drink("에너지드링크");
        System.out.println(a);
        // 해당 변수는 정의된 타입의 멤버만 호출가능(Animal)
        //giraffe2.attack();
        //Object : 자료형 타입의 근원
        //자료형 타입(class)을 정의하면 무조건 Object가 상속받게된다.
        //재정의용 함수 2개
        //equals.(data) : 두개의 자료가 같은지 비교 (재정의하지 않으면 동작하지 않는다)
        //toString() : 객체의 설명서 (default : 클래스명 + 해시코드)
        Object o=giraffe2;
        System.out.println(o.toString());
        //변수 o가 Giraff.attack()을 사용하려면?
        System.out.println(((Giraff)o).neckattack());
        Giraff g = (Giraff)  o ;

    }
}
// 타입의 다형성
// 객체를 참조하는 변수는 부모타입이 될 수 있다.
//==객체는 부모타입으로 참조될 수 있다.
//==>객체가 부모타입에 참조되면 객체는 바뀐다
// 다형성 : 오버로드, 오버라이드, 타입
