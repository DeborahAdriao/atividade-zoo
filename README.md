# Sistema de Cadastro do Zoológico
Docentes: Augusto César Oliveira e Domingos Savio de Oliveira Santos Junior.
**Discente: Deborah Adrião Cavalcanti Silva.**
**Disciplina: Paradigmas de Linguagens de Programação.**
*Curso: 5º Sistemas de Informação*

## RESPOSTAS  
### 1. Por que Zoologico tem uma lista de animais, em vez de ser uma lista?
* Zoologico tem uma lista de animais porque ele é uma classe responsável por representar e gerenciar o zoológico, enquanto a lista é apenas a estrutura usada para armazenar os animais. Dessa forma, o zoológico pode ter outros atributos e métodos, como o método visitar(), além de possuir uma lista de objetos do tipo Animal.

### 2. Por que Pato pode implementar duas interfaces, mas não poderia herdar de duas classes ao mesmo tempo?
* Pato pode implementar duas interfaces porque, em Java, uma classe pode implementar várias interfaces ao mesmo tempo. Assim, o pato pode implementar Nadador e Voador, pois ele possui as duas capacidades. Já uma classe só pode herdar diretamente de uma outra classe, porque Java não permite herança múltipla de classes, evitando conflitos entre atributos e métodos de diferentes classes.

### 3. Por que a mesma linha a.emitirSom() executa um código diferente pra cada animal?
* Por causa do polimorfismo. Embora a seja uma referência do tipo Animal, ela pode apontar para objetos de diferentes subclasses. Como cada subclassse sobrescreve o método emitirSom() com seu próprio comportamento, o Java executa automaticamente a versão correspondente ao objeto que a está representando. 
