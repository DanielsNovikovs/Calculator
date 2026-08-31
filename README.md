
Java CLI Calculator 

Tehnoloģijas: Java 17, Git, GitHub Codespaces, OOP, CLI

Apretīgs un modulārs komandrindas kalkulators, kas izstrādāts, ievērojot labākos objektorientētās programmēšanas (OOP) un Clean Code principus.

Funkcionalitāte: Nodrošina pamata aritmētiskās darbības (saskaitīšana, atņemšana, reizināšana, dalīšana), kā arī kāpināšanu un atlikuma aprēķināšanu (modulus).

Arhitektūra un izņēmumi (Exception Handling): Implementēta droša lietotāja ievades pārbaude (novērsta lietotāja kļūdainu simbolu ievade) un izņēmuma apstrāde dalīšanai ar nulli (ArithmeticException), nodrošinot stabilu lietotnes darbību.

Koda strukturēšana: Aprēķinu loģika ir pilnībā atdalīta no termināļa ievades/izvades nolasīšanas (Single Responsibility Principle).

Izmantotie datu tipi un to pamatojums
Intervijā vai CV aprakstā vari paskaidrot, kāpēc tika izvēlēti tieši šie datu tipi:

double (Primitīvais datu tips)

Pielietojums: Mainīgajiem num1, num2 un result, kā arī matemātisko metožu argumentiem un atgriežamajām vērtībām.

Kāpēc izmantots: 64-bitu peldošā komata skaitlis ļauj veikt precīzas darbības ne tikai ar veseliem skaitļiem, bet arī ar daļskaitļiem (piemēram, 12.5 + 7.5).

int (Primitīvais datu tips)

Pielietojums: Mainīgajam choice (izvēlnes punkta atlasei no 0 līdz 6).

Kāpēc izmantots: Vesels skaitlis ir ideāli piemērots precīzu izvēlnes opciju atpazīšanai switch konstrukcijā.

boolean (Primitīvais datu tips)

Pielietojums: Mainīgajam running galvenajā while ciklā.

Kāpēc izmantots: Glabā loģisko stāvokli (true/false), lai kontrolētu, kad lietotne turpina darboties un kad apstrāde jāpārtrauc (nospiežot 0).

String (Objekts / Atsauces datu tips)

Pielietojums: Paziņojumu un izvēlnes teksta izvadīšanai konsolē (System.out.println), kā arī kļūdu ziņojumiem (e.getMessage()).

Kāpēc izmantots: Standarta teksta virkņu apstrādei Java valodā.

Scanner (Objekts / Klasiskā bibliotēka)

Pielietojums: Objekts lietotāja ievades nolasīšanai no komandrindas (System.in).

Calculator (Pielāgots atsauces datu tips / Klase)

Pielietojums: Calculator calculator = new Calculator();

Kāpēc izmantots: Instancēts objekts, lai izsauktu aritmētiskās metodes un nodrošinātu objektorientētās programmēšanas pieeju.
    


Select Operation:
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Power (^)
6. Modulus (%)
0. Exit
Enter choice (0-6): 1
Enter first number: 12.5
Enter second number: 7.5
Result: 20.0000
    