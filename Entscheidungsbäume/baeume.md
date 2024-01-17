
**Entscheidungsbäume**



| Kunde    | Alter    | Einkommen | Kredit- Score |Kredit Zurückgezahlt (Ziel)|
| -------- | -------- | --------- | ------------- |-------------------------- |
| 1        | 25       | 50000     | 700           | Ja                        |
| 2        | 35       | 80000     | 750           | Nein                      |
| 3        | 45       | 60000     | 700           | Ja                        |
| 4        | 30       | 70000     | 650           | Ja                        |
| 5        | 40       | 90000     | 800           | Nein                      |
| 6        | 28       | 55000     | 720           | Ja                        |
| 7        | 38       | 75000     | 680           | Nein                      |
| 8        | 42       | 85000     | 780           | Nein                      |
























***Lösung***
**1. Wurzelknoten**
- Gini-Wert für den gesamten Datensatz berechnen
-Der Wurzelknoten basiert auf dem Merkmal mit dem höchsten Informationsgewinn.
Der Gini-Wert für diese Gruppe beträgt:


**2. Entscheidungsknoten 1: Alter <= 30**
-Subgruppen: {1,4,6}
-Gini-Wert für jede Subgruppe berechnen und gewichten Gini-Wert für Entscheidungsknoten berechnen.


**3. Entscheidungsknoten 2: Einkommen <= 6000**
-Subgruppen erstellen {1,3,6}
-Gini-Wert für jede Subgruppe berechnen und gewichten Gini-Wert für Entscheidungsknoten berechnen

**4. Entscheidungskoten 3: Kredit-Score <=720**
-Subgruppen erstellen {1,6}
-Gini-Wert für jede Subgruppe berechnen und gewichten Gini-Wert für Entscheidungsknoten berechnen


            Wurzel
      /       |        \
     /        |         \
 [D1:<=30] [D2:<=60000] [D3:<=720]
 /   \        |         
Ja   Nein     Ja