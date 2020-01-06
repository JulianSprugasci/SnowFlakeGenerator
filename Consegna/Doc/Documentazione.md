1. [Introduzione](#introduzione)

    - [Informazioni sul progetto](#informazioni-sul-progetto)

    - [Abstract](#abstract)

    - [Scopo](#scopo)

2. [Analisi](#analisi)

    - [Analisi del dominio](#analisi-del-dominio)

    - [Analisi dei mezzi](#analisi-dei-mezzi)

    - [Analisi e specifica dei requisiti](#analisi-e-specifica-dei-requisiti)

    - [Use case](#use-case)

    - [Pianificazione](#pianificazione)

3. [Progettazione](#progettazione)

    - [Design dell’architettura del sistema](#design-dell’architettura-del-sistema)

    - [Design dei dati e database](#design-dei-dati-e-database)

4. [Implementazione](#implementazione)

5. [Test](#test)

    - [Protocollo di test](#protocollo-di-test)

    - [Risultati test](#risultati-test)

    - [Mancanze/limitazioni conosciute](#mancanze/limitazioni-conosciute)

6. [Consuntivo](#consuntivo)

7. [Conclusioni](#conclusioni)

    - [Sviluppi futuri](#sviluppi-futuri)

    - [Considerazioni personali](#considerazioni-personali)

8. [Sitografia](#sitografia)

9. [Allegati](#allegati)


## Introduzione

### Informazioni sul progetto


   -   Allievo coinvolto: Julian Sprugasci (Programmatore)

  -   Docenti responsabili: Luca Muggiasca e Geo Petrini

  -   Scuola: SAMT Trevano - Sezione Informatica

  -   Classe: I3AC

  -   Materia: Modulo 306 + progetti

  -   Data d'inizio: 06.09.2019

  -   Data di fine: 20.12.2019


### Abstract

Sono partito con l'idea che dovevo partire da un semplice triangolo di "carta" bianco e tramite dei tagli consecutivi simulati dal programma si potesse generare un ficco di neve e poi salvarlo.

Il problema da risolvere era quello che bisognava riuscire a creare un programma comodo e utile per creare tanti fiocchi di neve senza sprecare della carta. Se il progetto verrà portato a termine con successo, non ci saranno più spreghi di carta e si protranno creare dei fiocchi di neve molto più precisi e dettagliati di quelli su carta.

In questo progetto bisognava di certo avere della base di trigonometria. Per riuscire a trovare dei metodi per risolvere i vari problemi, come per esempio girare il poligono, servino delle librerie come Affine Trasform che sono appunto dei calcoli di trigonometria. Il metodo migliore per trovare un approccio di risoluzione di un problema secondo me è quello di provare tutte le idee su carta, e una volta pensata e trovata una soluzione plausibile si può passare al codice. Bisogna sempre pensare e pianificare tutto prima di iniziare un lavoro, questo perchè se non si hanno le idee nitide si rischia di sbagliare e ricominciare da capo. Il fattore importante per risolvere il progetto è stato quello di suddividere i problemi e scomporli in sotto-problemi, iniziando da quelli più semplici per poi focalizzarsi su quelli più difficili. Questo metodo porta a non sprecare tempo e risorse in modo inutile.

Per il risultato è difficile da dirlo, visto che non esistono dei prodotti del genere sul mercato. Di certo deve essere un programma semplice e veloce, con una interfaccia fatta bene e facile da usare dall'utente.

### Scopo

  Questo progetto ha lo scopo didattico principale di imparare a gestire in modo individuale
  un progetto IT. Per fare ciò dobbiamo ricorrere a tutte nozioni apprese durante
  la nostra formazione, utilizzando molti aspetti visti in varie materie, come per
  esempio la creazione e gestione di un Gantt oppure la creazione di una applicazione
  con il linguaggio Java. L'altro scopo di questo progetto sarà quello di creare un applicativo che rappresenta un triangolo di "carta", su cui tramite dei tagli consecutivi possa creare un fiocco di neve.


## Analisi

### Analisi del dominio

  I docenti supervisori che hanno stipolato le specifiche del progetto sono dalla parte del cliente e ci hanno consegnato un diario di lavoro. Il risultato finale, come spiegato nelle specifiche sarà un applicativo che avrà il compito di generare un fiocco di neve.
  L'applicazione sarà implementata in Java quindi potrà essere facilmente supportata per qualsiasi computer con una versione di Java recente. Questo prodotto non esiste sul mercato e non è un prodotto progettato per importanti lavori ma solamente per il divertimento, fornendo a qualsiasi tipo di utente, esperto o neofita, una piacevole grafica e un semplice utilizzo. Una volta soddisfatti del risultato finale sarà possibile salvarlo in un'immagine all'interno del vostro Pc.
  L'applicazione potrà essere scaricata dal nostro sito web nel quale fornirò una guida semplice e chiara su come utilizzare il prodotto e avviata tramite l'eseguibile.  


### Analisi e specifica dei requisiti


  |**ID**       |Req - 001                                                                          |
  |------------------|---------------------------------------------------------|
  |**Nome** |L'applicativo deve essere in Java o in JS.<div style="width:850px;"></div>                        |
  |**Priorità**      |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|Se fatto in Java, necessita di un sito web con descrizione e download.   |
  |002|Se fatto in JS, necessita un sito web che ospiti l'applicativo.          |

  |**ID**       |Req - 002                                                                          |
  |------------------|---------------------------------------------------------|
  |**Nome** |Deve esserci una interfaccia grafica.<div style="width:850px;"></div>                         |
  |**Priorità**      |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|La finestra deve essere ridimensionabile. |
  |002|Le dimensioni minime per la finestra sono di 1024X768                   |

  |**ID**       |Req - 003                                                                          |
  |------------------|---------------------------------------------------------|
  |**Nome** |L'area di lavoro deve essere un triangolo la cui grandezza è il 50% della finestra.<div style="width:850px;"></div>                       |
  |**Priorità** |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|Il triangolo deve sempre essere centrato.   |                                                                    

  |**ID**       |Req - 004                                                                          |
  |------------------|---------------------------------------------------------|
  |**Nome** |I tagli del triangolo devono avvenire tramite un click del mouse.<div style="width:850px;"></div>                    |
  |**Priorità** |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|Una volta chiuso il poligono il punto di chiusura deve essere verde.   |
  |002|Ci possono essere uno o più poligoni.   |
  |003|Non ci sono limiti per quanto riguarda la quantità di punti. Ovviamente ci si aspetta un certo buon senso da parte dell'utente.   |
  |004|I punti posso essere spostati o rimossi.   |
  |005|Con il tasto sinistro si possono spostare i punti.   |
  |006|Con il tasto destro si possono rimuovere i punti.   |

  |**ID**       |Req - 005                                                                          |
  |------------------|---------------------------------------------------------|
  |**Nome** |Deve essere possibile resettare i punti di taglio. <div style="width:850px;"></div>                      |
  |**Priorità** |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          | |                                                                          |

  |**ID**       |Req - 006                                                                          |
  |------------------|---------------------------------------------------------|
  |**Nome** |Deve essere presente un tasto che permette di generare il fiocco di neve.<div style="width:850px;"></div>                       |
  |**Priorità** |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          | |                                                                          |


  |**ID**       |Req -  007                                                                          |
  |------------------|------------------------------------------------------------|
  |**Nome** |La generazione del fiocco deve avvenire in tempo reale, ogni modifica dei punti l'immagine del fiocco cambia di conseguenza. <div style="width:850px;"></div>         |
  |**Priorità** |2                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|Si può inserire questa funzione tramite un bottone.   |



  |**ID**       |Req - 008                                                                         |
  |------------------|---------------------------------------------------------|
  |**Nome** |Il lavoro deve poter essere salvato tramite un bottone.<div style="width:850px;"></div>                         |
  |**Priorità**      |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|Il salvataggio deve essere in formato PNG o SVG.   |
  |002|Le dimensioni dell'immagine da salvare dovranno essere definite dall'utente al momento del salvataggio.         |

  |**ID**       |Req - 009                                                                          |
  |------------------|---------------------------------------------------------|
  |**Nome** |I punti di taglio possono essere spostati o rimossi.<div style="width:850px;"></div>                       |
  |**Priorità** |2                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          | |                                                                          |

  |**ID**       |Req - 010                                                                         |
  |------------------|---------------------------------------------------------|
  |**Nome** |I punti di taglio potranno essere salvati tramite un bottone oppure essere importati da un altro bottone. <div style="width:850px;"></div>                        |
  |**Priorità**      |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|Il salvataggio deve essere in formato PNG o SVG.   |
  |002|Le dimensioni dell'immagine da salvare dovranno essere definite dall'utente al momento del salvataggio.         |
  |003|Il tipo di file del salvataggio sarà un txt all'interno di una cartella del programma.         |
  |004|Il file contenente i punti viene caricato all'interno del programma tramite un bottone importa.         |

  |**ID**       |Req - 011                                                                         |
  |------------------|---------------------------------------------------------|
  |**Nome** |Creare un sito web con descrizione e possibilità di scaricare il .jar della nostra applicazione. <div style="width:850px;"></div>                        |
  |**Priorità**      |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|Il sito deve essere con dei colori adatti per tutti gli utenti.   |
  |002|Deve contenere la lista dei riquisiti di sistema.  |
  |003|Deve esserci il file per scaricare la JRE.   |
  |004|Deve contenere una guida con degli screenshots.   |

  |**ID**       |Req - 012                                                                         |
  |------------------|---------------------------------------------------------|
  |**Nome** |I punti di taglio potranno essere salvati tramite un bottone oppure essere importati da un altro bottone. <div style="width:850px;"></div>                        |
  |**Priorità**      |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|Il salvataggio deve essere in formato PNG, SVG o Raster. Sarà l'utente a decidere la scelta.   |
  |002|Le dimensioni dell'immagine da salvare sono quelle correnti, 500 0 1000.         |

  |**ID**       |Req - 013                                                                         |
  |------------------|---------------------------------------------------------|
  |**Nome** |Deve essere presente una schermata di caricamento che porterà al menu principale. <div style="width:850px;"></div>                        |
  |**Priorità**      |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|Al menu principale ci saranno delle miniature dei file precedenti.   |

  |**ID**       |Req - 014                                                                         |
  |------------------|---------------------------------------------------------|
  |**Nome** |Deve essere presente un menu principale. <div style="width:850px;"></div>                        |
  |**Priorità**      |1                                                                           |
  |**Versione**      |1.0                                                                         |
  |**Note**          |                                                                            |
  ||**Sotto requisiti**                                                        |
  |001|Una schermata con la possibilità di caricare file recenti salvati in una cartella del programma.   |
  |002|Un bottone di start che fa partire l'applicazione.   |
  |003|Un bottone di credits dove vengono mostrate le informazioni del creatore.   |
  |003|Un bottone di help dove viene mostrata una guida su come usare l'applicazione.   |






**Spiegazione elementi tabella dei requisiti:**

**ID**: identificativo univoco del requisito

**Nome**: breve descrizione del requisito

**Priorità**: indica l’importanza di un requisito nell’insieme del
progetto, definita assieme al committente. Ad esempio poter disporre di
report con colonne di colori diversi ha priorità minore rispetto al
fatto di avere un database con gli elementi al suo interno. Solitamente
si definiscono al massimo di 2-3 livelli di priorità.

**Versione**: indica la versione del requisito. Ogni modifica del
requisito avrà una versione aggiornata.

Sulla documentazione apparirà solamente l’ultima versione, mentre le
vecchie dovranno essere inserite nei diari.

**Note**: eventuali osservazioni importanti o riferimenti ad altri
requisiti.

**Sotto requisiti**: elementi che compongono il requisito.


### Pianificazione


![Gantt](gantt.png)


### Analisi dei mezzi

Per realizzare questo progetto ho utilizzato i seguenti programmi:
 - Netbeans 11.0
 - Atom 4.0.75
 - Paint.net

Per quanto riguarda l'hardware, per il progetto ho utilizzato solamente il mio Pc perchè è un software in java e il sito verrà hostato sul dominio della scuola.

Per il progetto ho utilizzato le seguenti librerie:
 - java.awt.* Per questo progetto ho utilizzato diversi componenti grafici situati all'interno della classe nativa awt come per esempio:
    - Graphics: Per disegnare componenti e colorarli.
    - Graphics2D: Estensione di Graphics ma con al suo interno la possibilità di stampare anche gli Shapes.
    - Frame: Componente grafico che funge da finestra per la mia applicazione
    - Oltre a ciò ci sono anche tutte le varie librerie delle figure come punti, ecc... e i relativi eventi.

 - javax.swing.* In questa libreria è una estensione di awt e contiene tutti i componenti grafici che ho utilizzato come JPanel, JButton, ecc...

 - javax.io.* Questa invece l'ho utilizzato per gestire i file al mio programma.

 - Tab pane X: Questa è una classe che va a modificare il tab pane esistente con l'aggiunta di una x per chiudere il tab. Questo mi permette di poter gestire più finestre contemporaneamente.


Questo programma è un semplice file .jar e quindi può essere eseguito su qualsiasi sistema operativo Windows/Mac/Linux con al suo interno la versione di java 12 aggiornata. La versione giusta verrà inserita nelle note di questa documentazione. Non bisogna avere un hardware particolare, basta avere un normale Pc.
L'applicazione potrebbe però avere qualche problema sui sistemi Windows, visto che non ha una grande performance per quanto riguarda java. Al contrario, su Linux e Mac non ci sono problemi di lag e funziona bene.

## Progettazione


![c](Img/UML.png)

### Spiegazione delle classi

![c](Img/TabFrameClass.png)

Questa classe TabFrame è una specie di frame modificato per utilizzale il TabbedPane.

##### Spiegazione classe

- **ClosableTabbedPane tabbedPane:** Oggetto di tipo ClosableTabbedPane

- **TabFrame():** Metodo costruttore della classe

- **void addMenu():** Crea il menu per aggiungerci dei tab.

- **void addTabbedPane():** Crea un ClosableTabbedPane e sovrascrive il tabAboutToClose.

- **static void main():** Metodo principale dell'applicazioni.


![c](Img/ClosableTappedPane.png)

Questa classe ClosableTabbedPane è praticamenta una classe che funge da tab all'interno del nostro menu e gestisce tutti i tab.

##### Spiegazione classe

- **closeUI:** Classe interna che gestisce gli eventi del Tab come la chiusura, ecc...

- **paint():** Permette di disegnare all'interno della finestra.

- **addTab():** Metodo che aggiunge un tab.

- **getTabTitleAt():** Metodo che ritorna il titolo del tab.

- **tabAboutToClose():** Metodo che ritorna true.

![c](Img/TriangleClass.png)

Questa classe Triangle rappresenta il triangolo della applicazione.

##### Spiegazione classe

- **resultX** Coordinate X del triangolo.

- **resultY** Coordinate Y del triangolo.

- **triangle** Poligono del triangolo.

- **triangleArea:** Area del triangolo.

- **windowWidth:** Larghezza della finestra.

- **windowHeight:** Altezza della finestra.

- **triangleColor:** Colore del triangolo.

- **Triangle():** Metodo costruttore del triangolo.

- **paintComponent():** Permette di disegnare la grafica e i componenti grafici all'interno della finestra.

- **createTriangle():** Permette di creare il triangolo calcolandolo in modo proporzionato grazie alla trigonometria.

- **getPolygon():** Permette di ritornare il triangolo.

- **getArea():** Permette di ritornare l'area del triangolo.

- **getResultX():** Permette di ritornare l'array contenente le coordinate X del triangolo.

- **getResultY():** Permette di ritornare l'array contenente le coordinate Y del triangolo.

- **resize():** Permette di ridimensionare il triangolo aggiornandolo con dei nuovi valori.

- **getWindowWidth():** Permette di ritornare la larghezza della finestra.

- **setColor():** Permette di modificare dall'esterno il colore di sfondo del triangolo.



![c](Img/MyPolygonClass.png)

Questa classe gestisce i poligoni che vengono creati dall'utente all'interno della finestra.

##### Spiegazione classe

- **points:** Lista di punti del poligono.

- **isClosed:** Booleano che controlla se il poligono è chiuso oppure è ancora aperto.

- **RADIUS:** Raggio dei punti di taglio.

- **polygon:** Poligono di taglio.

- **polygonArea** Area del poligono di taglio.

- **MyPolygon()** Metodo costruttore del poligono di taglio.

- **addPoint()** Permette di aggiungere punti al poligono.

- **recalculatePolygon()** Permette di aggiornate i punti del poligono e magari anche le dimensioni se esso viene spostato.

- **removePointAt()** Permette di rimuovere i punti dal poligono.

- **movePoint()** Permette di muovere i punti del poligono.

- **distanceOfPoints()** Permette di controllare la distanza fra 2 punti.

- **paint()** Permette di stampare all'interno della finestra.

- **getIsClosed()** Permette di ritornare il booleano che controlla se un poligono è chiuso oppure aperto.

- **getPoints()** Permette di ritornare la lista di punti del poligono di taglio.

- **getArea()** Permette di ritornare l'area del poligono di taglio.



![c](Img/PreviewModelClass.png)

Questa classe PreviewModel ha lo scopo di stampare il fiocco di neve all'interno della preview.

##### Spiegazione classe

- **shapes:** Array di shapes da disegnare.

- **reversedShape:** Array di shapes specchiati da disegnare.

- **PreviewModel():** Metodo costruttore della classe.

- **paint():** Permette di stampare all'interno della finestra.


![c](Img/HelpPanelClass.png)

Questa classe HelpPanel ha lo scopo di aiutare l'utente per qualche semplice dritta sul programma.

##### Spiegazione classe

Per questa classe non c'è bisogno di una spiegazione perchè è solamente un Panel grafico che fornisce all'utente qualche aiuto di base per iniziare.


![c](Img/PreviewPanelClass.png)

Questa classe PreviewModel ha lo scopo di stampare il fiocco di neve all'interno della preview.

##### Spiegazione classe

- **shapes:** Array di shapes da disegnare.

- **reversedShape:** Array di shapes specchiati da disegnare.

- **PreviewPanel():** Metodo costruttore della classe.

- **paintComponent():** Permette di stampare all'interno della finestra.


![c](Img/SnowFlakeFrame2Class.png)

Questa classe SnowFlakeFrame2 è il menu principale della nostra applicazione.

##### Spiegazione classe

- **closableTabbedPanel:** Oggetto della classe ClosableTabbedPane che mi permette di avere un tab menu ogni volta che creo un editor.

- **creditsButton:** Bottone riservato ai crediti.

- **helpButton:** Bottone riservato alla pagina di aiuto.

- **jPanel2:** Panel riservato alla creazione di un tab.

- **startButton:** Bottone riservato alla creazione di un nuovo editor.

- **titleLabel:** Titolo del menu principale.



- **PreviewPanel():** Metodo costruttore della classe.

- **paintComponent():** Permette di stampare all'interno della finestra.


![c](Img/SnowFlakePanelClass1.png)

![c](Img/SnowFlakePanelClass2.png)

Questa classe SnowFlakePanel è il cuore di questo progetto. È la classe principale, editor nel quale vengono fatte quasi tutte le operazioni della nostra applicazione.

##### Spiegazione classe

- **POINTS_SIZE:** Grandezza dei punti.

- **xMouse:** Coordinata x del mouse.

- **yMouse:** Coordinata y del mouse.

- **isPressed:** Controlla se è stato premuto un botttone del mouse.

- **myPolygons:** Lista dei poligoni di taglio.

- **lastPoint:** Ultime coordinate del mouse.

- **clearArea:** Controlla se bisogna di pulire lo schermo.

- **triangle:** Oggetto di tipo triangolo. Il triangolo del programma.

- **triangleArea:** L'area del triangolo.

- **drawFinalPolygon:** Controlla se bisogna creare il poligono finale oppure no.

- **finalPolygon:** Il triangolo finale tutto tagliato.

- **imgFinalPolygon:** L'immagine in cui verrà salvato il fiocco di neve finale.

- **lastWidth:** Larghezza precedente della finestra.

- **lastHeight:** Altezza precedenza della finestra.

- **isReset:** Controlla se bisogna eseguire un reset dell'editor oppure no.

- **backgroundColor:** Il colore di sfondo della finestra.

- **areaColor:** Il colore dei poligoni di taglio.

- **pointsColor:** Il col
￼
Questa classe SnowFlakePanel è il cuore di questo progetto. È la classe principale, editor nel quale vengono fatte quasi tutte le operazioni della nostra applicazione.

- **xCoord:** Coordinata x attuale del mouse.

- **yCoord:** Coordinata y attuale del mouse.

- **isNull:** Controlla se la lista di poligoni è null oppure no.

- **shapes:** Array contenente tutti gli shape normali.

- **reversedShape:** Array contenente tutti gli shape specchiati.

- **shapesList:** Lista contenente tutti gli shape.

- **SnowFlakePanel():** Metodo costruttore dell'applicazione.

- **init():** Si occupa di istanziare le varie variabili.

- **calculatePolygon():** Permette di calcolare i poligoni.

- **paintComponent():** Permette di stampare all'interno della nostra finestra.

- **containsPoints():** Permette di controllare la distanza di due punti.

- **mouseClicked():** Permette di controllare l'evento click del mouse.

- **mousePressed():** Permette di controllare l'evento pressed del mouse.

- **mouseReleased():** Permette di controllare l'evento rilasciato del mouse.

- **mouseEntered():** Permette di controllare l'evento del mouse di quando entra all'interno della finestra.

- **mouseExited():** Permette di controllare l'evento del mouse di quando esce dalla finestra.

- **mouseDragged():** Permette di controllare l'evento dragged del mouse.

- **mouseMoved():** Permette di controllare l'evento move del mouse.

- **savePoints():** Permette di salvare i punti di taglio.

- **importPoints():** Permette di importare i punti di taglio.

- **saveImage():** Permette di salvare l'immagine del fiocco di neve.

- **resetAll():** Permette di resettare l'editor.

- **controlFileName():** Permette di controllare l'estenzione del file.

- **subtractArea():** Permette di sottrarre le aree in sovrapposizione al triangolo.

- **convertAreaToPolygon():** Permette di convertire un area in poligono.

- **generate():** Permette di generare il fiocco.

- **getFinalPolygon():** Permette di ritornare il poligono finale.

- **componentResized():** Permette di aggiornare dei dati ad ogni resize della finestra.

- **rotatePointMatrix():** Permette di ruotare dei punti.

- **scaleFinaliPolygon():** Permette di scalare la grandezza del poligono.

- **reversePolygon():** Permette di specchiare il poligono.

- **getTriangle():** Permette di ritornare il triangolo.

- **setPointsColor():** Permette di modificare il colore dei punti.

- **setAreaColor():** Permette di modificare il colore dei poligoni di taglio.

- **setBackgroundColor():** Permette di modificare il colore di sfondo dell'editor.

- **getIsNull():** Ritorna se la lista di poligoni è nulla.

- **setIsReset():** Permette di modifare **isReset**.

- **getShape():** Permette di ritornare l'array di shape.

- **getReversedShape():** Permette di ritornare l'array di shape specchiati.

- **getShapesList():** Permette di ritornare la lista di array.


![c](Img/EditorPanelClass.png)
![c](Img/EditorPanelClass2.png)

Questa classe EditorPanel ha lo scopo di rappresentare l'editor del programma. Principalmente in questo Panel è presente uno SnowFlakePanel e un EditorControlPanel sulla sinistra con 2 sezioni: una riservata per i vari controlli e l'altra per salvare l'immagine.

Per questa classe non c'è molto da spiegare perchè sono presenti veramente tante variabili di componenti grafici e dei metodi eventi che sono molto intuitivi ma che comunque verranno spiegati nell'implementazione.


### Design delle interfacce

Descrizione delle interfacce interne ed esterne del sistema e
dell’interfaccia utente. La progettazione delle interfacce è basata
sulle informazioni ricavate durante la fase di analisi e realizzata
tramite mockups.

#### Interfaccia applicazione

##### Menu principale
![Gantt](Img/Menu.png)

Il menu principale dell'applicazione sarà suddiviso nel seguente modo.
Sarà presente un bottone di **Start** nel quale, una volta premuto apparirà un popup dove dovrà essere inserito il nome dell'editor che si sta creando.

![Gantt](Img/Popup.png)

**Nota:** Ogni volta che si crea una nuova finestra esse appariranno qui sopra nella barra.

![Gantt](Img/Barra.png)

Successivamente sarà presente anche un pulsante **Help** che conterrà una breve guida semplice e descrittiva su come funziona, a grandi linee il programma.

Tramite il bottone **New** si potranno creare tutti gli editor che si vogliano.


##### Creazione del fiocco

![Gantt](Img/triangleInterface.png)

La seguente interfaccia funziona nel seguente modo.

L'utente può inserire i poligoni di taglio sopra il triangolo con il click del mouse.

![Gantt](Img/triangle.png)

###### Control panel

![Gantt](Img/control.png)

In questo control panel c'è una sezione dedicata ai colori.
I 4 bottoni permettono di cambiare i colori del triangolo, punti, background e poligoni.

**Nota:** Il colore di sfondo dei bottoni cambia automaticamente in base al colore attuale del componente.

Poi è presente un check box che permette di attivare oppure disattivare la Dark Mode.

Successivamente ci sono un paio di label utili per il debug dell'applicazione che indicano la grandezza della finestra e lo stato del mouse.

Infine in fondo ci sono i bottoni che permettono di importare i punti dai file, salvare i punti in un file, Resettare la finestra ed infine generare il fiocco di neve che comparirà in fondo nello spazio Preview.

![Gantt](Img/save.png)

Questa sezione è invece quella che permette di salvare il fiocco di neve finale nei vari formati proposti. Poi ci sono tre bottoni che servono per scegliere il tipo di immagine da salvare.

**Nota:** Bisogna per forza scegliere il tipo di immagine sennò non sarà possibile effettuare il salvataggio.

Sotto è possibile inserire il nome dell'immagine, la grandezza e l'altezza dell'immagine. Una volta inserito tutto ciò si potrà premere su **Save Snowflake** e se tutto va a buon fine uscirà un messaggio di conferma.


La finestra ha come grandezza minima 1024,748 e si può estendere fino a schermo intero. Il triangolo rimarrà sempre centrato di conseguenza.



### Design procedurale

Descrive i concetti dettagliati dell’architettura/sviluppo utilizzando
ad esempio:

-   Diagrammi di flusso e Nassi.

-   Tabelle.

-   Classi e metodi.

-   Tabelle di routing

-   Diritti di accesso a condivisioni …

Questi documenti permetteranno di rappresentare i dettagli procedurali
per la realizzazione del prodotto.

## Implementazione

In questo capitolo dovrà essere mostrato come è stato realizzato il
lavoro. Questa parte può differenziarsi dalla progettazione in quanto il
risultato ottenuto non per forza può essere come era stato progettato.

Sulla base di queste informazioni il lavoro svolto dovrà essere
riproducibile.

In questa parte è richiesto l’inserimento di codice sorgente/print
screen di maschere solamente per quei passaggi particolarmente
significativi e/o critici.

Inoltre dovranno essere descritte eventuali varianti di soluzione o scelte di prodotti con motivazione delle scelte.

Non deve apparire nessuna forma di guida d’uso di librerie o di componenti utilizzati. Eventualmente questa va allegata.

Per eventuali dettagli si possono inserire riferimenti ai diari.

##### Metodo addPoint
![c](Img/addPoint.png)

Questo metodo controlla la distanza tra il primo punto del poligono di taglio inserito con il click sinistro del mouse e l'ultimo inserito. Se la distanza fra i due è minore del valore prestabilito, in questo caso 5, setta il booleano **isClosed**, chiude il poligono e crea l'area del poligono.

##### Metodo recalculatePolygon
![c](Img/recalculatePolygon.png)

Questo metodo permette di resettare il poligono attuale e, ciclando con un for each riassegna i valori al poligono aggiornandolo. Successivamente ricrea l'area del poligono. Esso viene utilizzato nel mouse Dragged per ricalcolare i poligoni ogni volta che vengono trascinati.

##### Metodo removePointAt
![c](Img/removePointAt.png)

Questo metodo permette di controllare se il click del mouse coincide con uno dei punti disegnati del poligono. Se, premendo col tasto destro del mouse il due punti coincidono, allora esso viene tolto dal poligono e richiama il **recalculatePolygon()**. Questo metodo viene utilizzato nel **mouseClick** per controllare se l'utente vuole cancellare un punto.

##### Metodo movePoint
![c](Img/movePoint.png)

Questo metodo controlla se la distanza tra il punto "selezionato" e il click sinistro del mouse coincidono con i valori prestabiliti. Se tutto va a buon fine il punto viene aggiornato con il **newPosition**.

##### Metodo distanceOfPoints
![c](Img/distanceOfPoints.png)

Questo metodo ritorna se la distanza fra due punti coincide con il valore di **RADIUS * 2** altrimenti ritorna false.

#### SnowFlakeFrame2.java

##### Metodo startButton1ActionPerformed
![c](Img/startButton1ActionPerformed.png)

Questo metodo permette di creare un nuovo EditorPanel all'interno del mio TabbedPane.

##### Metodo helpButtonActionPerformed
![c](Img/helpButton.png)

Questo metodo permette di creare una pagina di Help all'interno del nostro TappedPane.

##### Metodo createTriangle
![c](Img/createTriangle.png)

Questo metodo permette di creare un triangolo sempre centrato al centro dello schermo attraverso dei calcoli matematici. Esso viene richiamato ogni volta che voglio ridimensionare il triangolo con un resize.

##### Metodo jButton6ActionPerformed
![c](Img/saveImagAP.png)

Questo metodo controlla se l'utente ha scelto il tipo di immagine da salvare. Se non lo sceglie esce un messaggio di errore, altrimenti salva l'immagine e stampa il messaggio che tutto è andato a buon fine.

##### Metodo jpgButtonActionPerformed
![c](Img/jpgButtonAP.png)

Questo metodo controlla se l'utente ha scelto come tipo di immagine jpg. Se ha scelto esso di conseguenza resetta gli altri colori dei bottoni e si setta attivo.

##### Metodo pngButtonActionPerformed
![c](Img/pngButtonAP.png)

Questo metodo controlla se l'utente ha scelto come tipo di immagine png. Se ha scelto esso di conseguenza resetta gli altri colori dei bottoni e si setta attivo.

##### Metodo svgButtonActionPerformed
![c](Img/svgButtonAP.png)

Questo metodo controlla se l'utente ha scelto come tipo di immagine svg. Se ha scelto esso di conseguenza resetta gli altri colori dei bottoni e si setta attivo.

##### Metodo polygonsColorButtonActionPerformed
![c](Img/polygonsColorButtonAP.png)

Questo metodo si occupa di cambiare il colore dei poligoni di taglio e cambiare il colore di sfondo del bottone.

##### Metodo darkModeCheckBoxActionPerformed
![c](Img/darkModeCheckBoxAP.png)

Questo metodo è un po' un casino ma si occupa solamente di controllare se il checkBox della Dark Mode è attivo oppure è disattivato.

##### Metodo backgroundColorButtonActionPerformed
![c](Img/backgroundColorButtonAP.png)

Questo metodo si occupa di cambiare il colore dello sfondo dell'applicazione e cambiare il colore di sfondo del bottone.

##### Metodo pointsColorButtonActionPerformed
![c](Img/pointsColorButtonAP.png)

Questo metodo si occupa di cambiare il colore dei punti e cambiare il colore di sfondo del bottone.

##### Metodo generateButtonActionPerformed
![c](Img/generateButtonAP.png)

Questo metodo ogni volta che viene richiamato aumenta una variabile chiamata **countGenerate**. Questa variabile serve per un semplice motivo, se è uguale a 1 crea il panel della Preview e lo aggiunge all'editor mentre se è maggiore di 1 si limita semplicemente di fare repaint della finestra e del PreviewPanel. Al suo interno c'è una condizione che si avvera solamente quando l'utente preme **Yes** per generare il fiocco di neve.

##### Metodo resetButtonActionPerformed
![c](Img/resetButtonAP.png)

Questo metodo si occupa di resettare tutti i punti e poligoni presenti in quel momento sulla finestra dell'editor.

##### Metodo savePointsButtonActionPerformed
![c](Img/savePointsButtonAP.png)

Questo metodo invoca il metodo **savePoints** di SnowFlakePanel e permette semplicemente di salvare i punti in un file .txt.

##### Metodo importPointsButtonActionPerformed
![c](Img/importPointsButtonAP.png)

Questo metodo invoca il metodo **importPoints** di SnowFlakePanel e permette semplicemente di importare i file .txt.

##### Metodo triangleColorButtonActionPerformed
![c](Img/triangleColorButtonAP.png)

Questo metodo si occupa di cambiare il colore del triangolo di base e cambiare il colore di sfondo del bottone.

##### Metodo calculatePolygon
![c](Img/calculatePolygon.png)

Questo metodo crea innanzitutto un **lastPolygon** che corrisponde all'ultimo poligono di **myPolygons**. Con esso controllo, se non è chiuso inserisco i punti al suo interno mentre se esso è chiuso allora lo aggiungo alla lista.

##### Metodo calculateShape
![c](Img/calculateShape.png)

Questo metodo come prima cosa crea una variabile **count**. Essa verrà incrementata e utilizzata per girare gli shape con un determinato angolo di rotazione. Poi fa passare prima tutti gli shape e li ruota ad ogni ciclo di 60 gradi grazie a count ma anche al metodo **rotatePointMatrix**. Una volta fatto con gli shape normali lo stesso processo viene effettuato anche per gli Shape specchiati, perchè come sappiamo un esagono è formato da sei triangoli normali e sei specchiati come in questo caso.

##### Metodo containsPoints
![c](Img/containsPoints.png)

Questo metodo verifica se due punti sono all'interno di una determinata distanza. In questo caso deve essere minore di **POINTS_SIZE / 2**.

##### Metodo mouseClicked
![c](Img/mouseClicked.png)

Questo metodo gestisce gli eventi click del mouse. Come prima cosa vengono inizializzate due variabili che permettono di tenere traccia dell'ultimo punto in cui si ha cliccato col mouse. Poi controlla se il viene cliccato il tasto **sinistro** del mouse richiamo il metodo **calculatePolygon**, altrimenti se viene premuto quello destro è possibile cancellare il punto selezionato.

##### Metodo mouseDragged
![c](Img/mouseDragged.png)

Questo metodo permette di trascinare i punti all'interno della finestra dell'editor. Infatti salvando le vecchie coordinate del mouse posso spostarle e modificarle in quelle nuove attraverso **movePoint** e a **recalculatePolygon**.

##### Metodo mouseMoved
![c](Img/mouseMoved.png)

Questo metodo si occupa principalmente ad aggiornare le coordinate di **xCoord e yCoord** per ogni movimento del mouse.

##### Metodo savePoints
![c](Img/savePoints.png)

Questo metodo ha lo scopo di salvare i punti dei vari poligoni presenti sull'editor. Come prima cosa chiede all'utente di inserire il nome del file nel quale si desidera salvare i punti.

**Nota:** Il nome del file deve contenere alla fine l'estensione .txt per funzionare correttamente sennò scatenerà un errore.

Una volta preso il nome controlla con un metodo se l'estensione del file e giusta, se tutto ciò va a buon fine procederà a salvare i vari punti nel file.

I punti verranno salvati del seguente modo seguendo questo stile:

![c](Img/fileExample.png)

##### Metodo importPoints
![c](Img/importPoints.png)

Questo metodo permette di importare i punti da un file .txt all'interno del programma. Il processo è molto semplice. Tutto parte dalla scelta del file tramite il file Chooser. Una volta scelto il file viene passato il file finchè non trova la scritta **endPolygon** e allora capisce che li finisce un poligono. Una volta fatti passare tutti i poligoni ed aver inserito man mano i punti in sue liste, essi li converto in Integer e li aggiungo alla lista di poligoni.

##### Metodo saveImage
![c](Img/saveImage.png)

Questo metodo permette di salvare il fiocco di neve finale nei formati richesti **(png,jpg,svg)**. Si può salvare l'immagine con le grandezze 500, 1000 oppure con quella corrente che viene mostrata con un jLabel sull'editor.

##### Metodo controlFileName
![c](Img/controlFileName.png)

Questo metodo controlla se l'estensione del file corrisponde a quella del .txt.

##### Metodo subtractArea
![c](Img/subtractArea.png)

Questo metodo permette di sottrarre tutte le aree dei poligoni che sono in sovrapposizione con il triangolo.

##### Metodo convertAreaToPolygon
![c](Img/convertAreaToPolygon.png)

Questo metodo permette convertire l'area finale del triangolo di nuovo ad un poligono. Per farlo o utilizzato il Path Iterator che funziona nel seguente modo. Esso parte da type 0 percorre tutti i punti di un poligono a type 1 e all'ultimo punto arriva a 4. in questo modo si possono passare tutti i punti dell'area e recuperare quelli originali per rimetterli in un poligono.

##### Metodo generate
![c](Img/generate.png)

Questo metodo permette di generare il fiocco di neve finale, richiamando i vari metodi che gli serviranno durante il progesso di creazione.

##### Metodo componentResized
![c](Img/componentResized.png)

Questo metodo viene richiamato ogni qual volta viene effettuato un ridimensionamento della finestra e permette di aggiornale la grandezza e la posizione del triangolo per far si che rimanga sempre centrato.

##### Metodo rotatePointMatrix
![c](Img/rotatePointMatrix.png)

Questo metodo permette di ruotare i punti del poligono utilizzando la classe AffineTrasform. Questa classe non è altro che la rappresentazione delle trasformazioni affini matematiche e fornisce dei metodi molto interessanti. Utilizzando il metodo **scale** è possibile scalare la grandezza del poligono e renderlo più piccolo mentre il metodo **rotate** permett di scegliere l'angolo di rotazione, e i punti da fissare durante la rotazione (in questo caso il punto più in basso del triangolo) e visto che deve essere spostato al centro c'è bisogno di creare un metodo che faccia il sequente lavoro. Una volta fatto tutto ciò si può creare **createTrasformedShape** e ritornare lo shape trasformato.

##### Metodo reversePolygon
![c](Img/reversePolygon.png)

Questo metodo permette di specchiare uno shape per permettere di disegnare il fiocco di neve nel modo corretto. Il come è molto semplice. si calcola la differenza tra i punti sull'asse x fino al centro della figura. Dopodichè si usa quella differenza per spostare i punti dall'altra parte e specchiarli correttamente.


## Test

### Protocollo di test

Definire in modo accurato tutti i test che devono essere realizzati per
garantire l’adempimento delle richieste formulate nei requisiti. I test
fungono da garanzia di qualità del prodotto. Ogni test deve essere
ripetibile alle stesse condizioni.


|Test Case      | TC-001                               |
|---------------|--------------------------------------|
|**Nome**       |	L'applicativo deve essere in Java o in JS. |
|**Riferimento**|REQ-001                              |
|**Descrizione**|	L'applicativo deve essere in Java o in JS. |
|**Prerequisiti**|- |
|**Procedura**     | - Sviluppare l'applicazione in Java |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-001.1                              |
|---------------|--------------------------------------|
|**Nome**       |	L'applicativo deve disporre di un sito web. |
|**Riferimento**|REQ-001.1                             |
|**Descrizione**|	L'applicativo deve disporre di un sito web. |
|**Prerequisiti**|- |
|**Procedura**     | - Creare sito web in html e hostarlo su un dominio. |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-002                              |
|---------------|--------------------------------------|
|**Nome**       |	Deve esserci una interfaccia grafica. |
|**Riferimento**|REQ-002                              |
|**Descrizione**|	Deve esserci una interfaccia grafica. |
|**Prerequisiti**|- |
|**Procedura**     | - Creare una interfaccia grafica |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-002.1                              |
|---------------|--------------------------------------|
|**Nome**       |	La finestra deve essere ridimensionabile. |
|**Riferimento**|REQ-002.1                              |
|**Descrizione**|	La finestra deve essere ridimensionabile. |
|**Prerequisiti**|- |
|**Procedura**     | - Bisogna fare in modo che il triangolo e la finestra sia responsive correttamente. |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-002.2                              |
|---------------|--------------------------------------|
|**Nome**       |	Le dimensioni minime per la finestra sono di 1024X768. |
|**Riferimento**|REQ-002.2                              |
|**Descrizione**|	Le dimensioni minime per la finestra sono di 1024X768. |
|**Prerequisiti**|- |
|**Procedura**     | - Bisogna mettere il minimumSize(1024X768). |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-003                              |
|---------------|--------------------------------------|
|**Nome**       |	L'area di lavoro deve essere un triangolo la cui grandezza è il 50% della finestra. |
|**Riferimento**|REQ-003                              |
|**Descrizione**|	L'area di lavoro deve essere un triangolo la cui grandezza è il 50% della finestra. |
|**Prerequisiti**|- |
|**Procedura**     | - Bisogna fare dei calcoli matematici per renderlo grande al 50%. |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-003.1                              |
|---------------|--------------------------------------|
|**Nome**       |		Il triangolo deve sempre essere centrato. |
|**Riferimento**|REQ-003.1                          |
|**Descrizione**|		Il triangolo deve sempre essere centrato. |
|**Prerequisiti**|- |
|**Procedura**     | - Bisogna fare dei calcoli matematici per renderlo responsive. |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-004                              |
|---------------|--------------------------------------|
|**Nome**       |		I tagli del triangolo devono avvenire tramite un click del mouse. |
|**Riferimento**|REQ-004                          |
|**Descrizione**|		I tagli del triangolo devono avvenire tramite un click del mouse. |
|**Prerequisiti**|- |
|**Procedura**     | - Bisogna utilizzare il metodo MouseClicked per gestire gli eventi. |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-004.1                             |
|---------------|--------------------------------------|
|**Nome**       |		Una volta chiuso il poligono il punto di chiusura deve essere verde. |
|**Riferimento**|REQ-004.1                          |
|**Descrizione**|		Una volta chiuso il poligono il punto di chiusura deve essere verde. |
|**Prerequisiti**|- |
|**Procedura**     | - Una volta chiuso il polygon si stampa esso in verde. |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-004.2                             |
|---------------|--------------------------------------|
|**Nome**       |	Ci possono essere uno o più poligoni. |
|**Riferimento**|REQ-004.2                          |
|**Descrizione**|	Ci possono essere uno o più poligoni. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-004.3                             |
|---------------|--------------------------------------|
|**Nome**       |	Non ci sono limiti per quanto riguarda la quantità di punti. |
|**Riferimento**|REQ-004.3                          |
|**Descrizione**|	Non ci sono limiti per quanto riguarda la quantità di punti. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-004.4                             |
|---------------|--------------------------------------|
|**Nome**       |	I punti posso essere spostati o rimossi. |
|**Riferimento**|REQ-004.4                          |
|**Descrizione**|	I punti posso essere spostati o rimossi. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-004.5                             |
|---------------|--------------------------------------|
|**Nome**       |	Con il tasto sinistro si possono spostare i punti. |
|**Riferimento**|REQ-004.5                          |
|**Descrizione**|	Con il tasto sinistro si possono spostare i punti. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-004.6                             |
|---------------|--------------------------------------|
|**Nome**       |	Con il tasto destro si possono rimuovere i punti. |
|**Riferimento**|REQ-004.6                          |
|**Descrizione**|	Con il tasto destro si possono rimuovere i punti. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-005                             |
|---------------|--------------------------------------|
|**Nome**       |	Deve essere possibile resettare i punti di taglio. |
|**Riferimento**|REQ-005                          |
|**Descrizione**|	Deve essere possibile resettare i punti di taglio. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-006                             |
|---------------|--------------------------------------|
|**Nome**       |	Deve essere presente un tasto che permette di generare il fiocco di neve. |
|**Riferimento**|REQ-006                          |
|**Descrizione**|	Deve essere presente un tasto che permette di generare il fiocco di neve. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-007                             |
|---------------|--------------------------------------|
|**Nome**       |	La generazione del fiocco deve avvenire in tempo reale, ogni modifica dei punti l'immagine del fiocco cambia di conseguenza. |
|**Riferimento**|REQ-007                          |
|**Descrizione**|	La generazione del fiocco deve avvenire in tempo reale, ogni modifica dei punti l'immagine del fiocco cambia di conseguenza. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-008                             |
|---------------|--------------------------------------|
|**Nome**       |	Il lavoro deve poter essere salvato tramite un bottone. |
|**Riferimento**|REQ-008                          |
|**Descrizione**|	Il lavoro deve poter essere salvato tramite un bottone. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-008.1                             |
|---------------|--------------------------------------|
|**Nome**       |	Il salvataggio deve essere in formato PNG o SVG. |
|**Riferimento**|REQ-008.1                          |
|**Descrizione**|	Il salvataggio deve essere in formato PNG o SVG. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona parzialmente |

|Test Case      | TC-008.2                             |
|---------------|--------------------------------------|
|**Nome**       |	Le dimensioni dell'immagine da salvare dovranno essere definite dall'utente al momento del salvataggio. |
|**Riferimento**|REQ-008.2                          |
|**Descrizione**|	Le dimensioni dell'immagine da salvare dovranno essere definite dall'utente al momento del salvataggio. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-009                             |
|---------------|--------------------------------------|
|**Nome**       |	I punti di taglio possono essere spostati o rimossi. |
|**Riferimento**|REQ-009                          |
|**Descrizione**|	I punti di taglio possono essere spostati o rimossi. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-010                             |
|---------------|--------------------------------------|
|**Nome**       |	I punti di taglio potranno essere salvati tramite un bottone oppure essere importati da un altro bottone. |
|**Riferimento**|REQ-010                          |
|**Descrizione**|	Nome	I punti di taglio potranno essere salvati tramite un bottone oppure essere importati da un altro bottone. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-010.1                           |
|---------------|--------------------------------------|
|**Nome**       |	Il tipo di file del salvataggio sarà un txt all'interno di una cartella del programma. |
|**Riferimento**|REQ-010.1                          |
|**Descrizione**|	Il tipo di file del salvataggio sarà un txt all'interno di una cartella del programma. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-010.2                           |
|---------------|--------------------------------------|
|**Nome**       |	Il file contenente i punti viene caricato all'interno del programma tramite un bottone importa. |
|**Riferimento**|REQ-010.2                          |
|**Descrizione**|	Il file contenente i punti viene caricato all'interno del programma tramite un bottone importa. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-011                           |
|---------------|--------------------------------------|
|**Nome**       |	Creare un sito web con descrizione e possibilità di scaricare il .jar della nostra applicazione. |
|**Riferimento**|REQ-011                          |
|**Descrizione**|	Creare un sito web con descrizione e possibilità di scaricare il .jar della nostra applicazione. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-011.1                           |
|---------------|--------------------------------------|
|**Nome**       |	Il sito deve essere con dei colori adatti per tutti gli utenti. |
|**Riferimento**|REQ-011.1                          |
|**Descrizione**|	Il sito deve essere con dei colori adatti per tutti gli utenti. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-011.2                           |
|---------------|--------------------------------------|
|**Nome**       |	Deve contenere la lista dei riquisiti di sistema.|
|**Riferimento**|REQ-011.2                          |
|**Descrizione**|	Deve contenere la lista dei riquisiti di sistema. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-011.3                          |
|---------------|--------------------------------------|
|**Nome**       |	Deve esserci il file per scaricare la JRE.|
|**Riferimento**|REQ-011.3                          |
|**Descrizione**|	Deve esserci il file per scaricare la JRE. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-011.4                          |
|---------------|--------------------------------------|
|**Nome**       |	Deve contenere una guida con degli screenshots.|
|**Riferimento**|REQ-011.4                          |
|**Descrizione**|	Deve contenere una guida con degli screenshots. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-012                          |
|---------------|--------------------------------------|
|**Nome**       |	I punti di taglio potranno essere salvati tramite un bottone oppure essere importati da un altro bottone.|
|**Riferimento**|REQ-012                          |
|**Descrizione**|	I punti di taglio potranno essere salvati tramite un bottone oppure essere importati da un altro bottone. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-012.1                          |
|---------------|--------------------------------------|
|**Nome**       |	Il salvataggio deve essere in formato PNG, SVG o Raster. Sarà l'utente a decidere la scelta.|
|**Riferimento**|REQ-012.1                          |
|**Descrizione**|	Il salvataggio deve essere in formato PNG, SVG o Raster. Sarà l'utente a decidere la scelta. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-012.2                          |
|---------------|--------------------------------------|
|**Nome**       |	Le dimensioni dell'immagine da salvare sono quelle correnti, 500 0 1000.|
|**Riferimento**|REQ-012.2                          |
|**Descrizione**|	Le dimensioni dell'immagine da salvare sono quelle correnti, 500 0 1000. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-013                          |
|---------------|--------------------------------------|
|**Nome**       |	Deve essere presente un menu principale.|
|**Riferimento**|REQ-014                          |
|**Descrizione**|	Deve essere presente un menu principale. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-013.1                          |
|---------------|--------------------------------------|
|**Nome**       |	Una schermata con la possibilità di caricare file recenti salvati in una cartella del programma.|
|**Riferimento**|REQ-014.1                          |
|**Descrizione**|	Una schermata con la possibilità di caricare file recenti salvati in una cartella del programma. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-013.2                          |
|---------------|--------------------------------------|
|**Nome**       |	Un bottone di start che fa partire l'applicazione.|
|**Riferimento**|REQ-014.2                          |
|**Descrizione**|	Un bottone di start che fa partire l'applicazione. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-013.3                          |
|---------------|--------------------------------------|
|**Nome**       |	Un bottone di credits dove vengono mostrate le informazioni del creatore.|
|**Riferimento**|REQ-014.3                          |
|**Descrizione**|	Un bottone di credits dove vengono mostrate le informazioni del creatore. |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

|Test Case      | TC-013.4                          |
|---------------|--------------------------------------|
|**Nome**       |	Un bottone di help dove viene mostrata una guida su come usare l'applicazione.
|
|**Riferimento**|REQ-014.4                          |
|**Descrizione**|	Un bottone di help dove viene mostrata una guida su come usare l'applicazione.
 |
|**Prerequisiti**|- |
|**Procedura**     | -  |
|**Risultati attesi** |Funziona correttamente |

### Risultati test

I risultati dei test sono andati tutti a buon fine tranne uno.

### Mancanze/limitazioni conosciute

Ci sono state alcune dimenticanze e alcune limitazioni nel programma. L'utente non
può salvare correttamente le immagini in SVG e i punti di taglio non sono responsive.

## Consuntivo

Il tempo reso disponibile a lezione non era sufficiente di certo per completare tutti
i requisiti richiesti per il completamento del progetto. Di norma sono riuscito a recuperare a casa il tempo perso oppure rallentare un po' per far si che restassi sempre all'interno dei tempi pianificati.

## Conclusioni

Questo programma non avrà un impatto di nessun genere sul mondo. È stato creato solamente per scopi didattici, dando agli studenti delle possibilità per assimilare a sufficienza le nozioni apprese in questi anni. Il programma non pu?o essere utilizzato per uso quiatidiano ma semolicemente a solo scopo di intrattenimento.

### Sviluppi futuri
  Non sono previsti delle migliorie per quanto riguarda una fotura estensione del progetto. Di sicuro verranno migliorati pian piano tutti i piccoli bug ancora prenenti andando verso un programma compatto e performante.

### Considerazioni personali
 In questo progetto ho imparato molte cose:
  - assimilazione delle nozioni
  - gestione del tempo
  - ...


### Sitografia

Non ho utilizzato nessun sito web durante la creazione di questo progetto.


## Allegati

Tutti gli allegati posso essere recuperati dalla mia repository di GitHub.
