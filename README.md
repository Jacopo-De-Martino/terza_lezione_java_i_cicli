# I CICLI IN JAVA

### finche è true esegui il "corpo" del ciclo

## IL CICLO WHILE (FINCHE)

Statemant:
while(predicate){
blocco di codice che si esegue finche la condizione del while non diventa falsa
o si incontra un breack
}
ES:
int num = 1
while(nume < 5){
system.out.println(num);
num ++
}

## breack e continue

ES ciclo infinito, breack:
Scanner scanner = new Scanner(System.in)
while(true){
sys.out.print("ciclo in corso");
sys.out.print("vuoi uscire?");
String uscita = scanner.nextline();
if(uscita.toLowerCase().equals("si")){
breack;
}
}
ES ciclo con continue:
int num = 0;
while(num<10){
num++;
if(num==5){
continue;
}
sys.out.print(num);
}

# Ciclo For

## viene utilizzato per eseguire un blocco di codice per un numero "prestabilito" di volte

for(int i=0; i<array.length; i++){
//stampa elementi di un array
sys.out.print(array[i]);
}
