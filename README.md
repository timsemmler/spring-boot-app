# Entwicklungsaufgabe für den Bewerbertag

## Einleitung

Um deine Arbeitsorganisation zu verbessern, hast du dir vorgenommen, für dich eine kleine ToDo - App zu entwickeln.
Für einen ersten PoC möchtest du daher das Service-Backend auf Basis von Spring Boot entwickeln. 
Glücklicherweise hast du dafür schon ein kleines Projekt angelegt.

Natürlich hast du bereits jetzt schon eine Menge von Anforderungen im Kopf, die du in einem ersten Schritt bereits runtergeschrieben hast.


## Anforderungen

### Funktionale Anforderungen
- Ein User kann mehrere ToDo-Liste haben
- Jede ToDo-Liste kann mehrere Aufgaben beinhalten
- Es können ToDo-Listen neu angezeigt, angelegt und gelöscht werden
- Über einen REST-Endpoint können die ToDo-Listen ausgelesen werden.
- Optional können auch Create, Update und Delete Operationen über einen REST-Service angeboten werden.

### Nicht-Funktionale Anforderungen
- Um die Qualität deiner Software sicherzustellen, möchtests du sinnvolle automatische Tests für deine Software entwickeln.
- Der Code soll allgemeinen Anforderungen an Qualität und Wartbarkeit genügen.


## Aufgabenstellung

Deine Aufgabe ist es die o. g. Anforderungen im Rahmen einer Spring Boot Anwendungen zu implementieren.
Hierfür muss auch ein geeignetes Datenbank- bzw. Objektmodell entwickelt werden. 
Zudem ist es notwendig, das Datenbankschema anzulegen. Dir steht es frei dies mittels SQL zu tun oder es durch dein Objektmodell generieren zu lassen.
Dir stehen grundsätzlich alle möglichen Quellen zur Bearbeitung der Aufgabe zur Verfügung. Inbesondere sind auch Fragen an anwesende Person ausdrücklich erwünscht.


### WICHTIG !!!
Die Aufgabe ist absichtlich derart gestaltet, dass du vermutlich nicht alles vollständig erfüllen kannst. 
Viel wichtiger für uns ist es, zu verstehen, wie deine Herangehensweise an eine solche Aufgabe ist.

## Zustätzliche Informationen

Nachdem du die Anwendung geklont hast, kannst du diese mit dem Maven-Befehl `mvn spring-boot:run` starten.
Auf die Datenbank kann mit der H2-Webconsole zugegriffen werden.

URL: [`http://localhost:8080/h2-console`](http://localhost:8080/h2-console) \
JDBC-URL: `jdbc:h2:mem:todo` \
Username: `sa`\
Passwort: `password`

Mittels der Dateien import.sql und schema.sql kann die Datenbank in einen bestimmten Ausgangszustand versetzt werden.
