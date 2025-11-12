package Exercicio14;

/*
 * Escreve uma hierarquia de classes para criação de relógios para diferentes
 * lugares do mundo, defina uma classe pai que tenha as propriedades Hora,
 * minuto e segundo com seus respectivos getters e setters (atendendo as regras
 * do funcionamento de um relógio) e um método que deverá retornar a hora no
 * formato HH:MM:SS, a partir dessa classe crie 2 implementações, uma chamada
 * relógio Americano e outra chamada relógio Brasileiro, lembrando que para o
 * relógio americano não existem as horas de 13 até 24. Defina também na super
 * classe um método que ficará por responsabilidade da classe que extender-la
 * definir seu funcionamento, esse método deve receber um relógio (
 * independente da implementação) e deve-se extrair as informações dele e usa-la
 * no objeto que recebeu para setar as novas informações do relógio.
 */

//Main

public class Exercicio14 {

  public static void main(String[] args) {
    Clock brClock = new BRClock();
    brClock.setSecond(0);
    brClock.setMinute(0);
    brClock.setHour(0);

    System.out.println(brClock.getTime());
    System.out.println(new USClock().convert(brClock).getTime());

  }

}
