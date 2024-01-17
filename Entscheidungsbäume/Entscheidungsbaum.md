# Entscheidungsbäume

<table>
  <tr style="background-color: #f2f2f2;">
    <th>Kunde</th>
    <th>Alter</th>
    <th>Einkommen</th>
    <th>Kredit-Score</th>
    <th>Kredit zurückgezahlt (Ziel)</th>
  </tr>
  <tr>
    <td>1</td>
    <td>25</td>
    <td>50000</td>
    <td>700</td>
    <td>Ja</td>
  </tr>
  <tr>
    <td>2</td>
    <td>35</td>
    <td>80000</td>
    <td>750</td>
    <td>Nein</td>
  </tr>
  <tr>
    <td>3</td>
    <td>45</td>
    <td>60000</td>
    <td>700</td>
    <td>Ja</td>
  </tr>
  <tr>
    <td>4</td>
    <td>30</td>
    <td>70000</td>
    <td>650</td>
    <td>Ja</td>
  </tr>
  <tr>
    <td>5</td>
    <td>40</td>
    <td>90000</td>
    <td>800</td>
    <td>Nein</td>
  </tr>
  <tr>
    <td>6</td>
    <td>28</td>
    <td>55000</td>
    <td>720</td>
    <td>Ja</td>
  </tr>
  <tr>
    <td>7</td>
    <td>38</td>
    <td>75000</td>
    <td>680</td>
    <td>Nein</td>
  </tr>
  <tr>
    <td>8</td>
    <td>42</td>
    <td>85000</td>
    <td>780</td>
    <td>Nein</td>
  </tr>
</table>









## Wurzelknoten:

1. Gini-Wert für den gesamten Datensatz berechnen.
2. Der Wurzelknoten basiert auf dem Merkmal mit dem höchsten Informationsgewinn.
3. Der Gini-Wert für den gesamten Datensatz beträgt:

\[Gini(D) = 1 - \sum_{i=1}^{n} p_i^2 \]

\[ Gini(D) = 1 - \left( \left(\frac{3}{8}\right)^2 + \left(\frac{5}{8}\right)^2 \right) = 0.46875 \]

Nun evaluieren wir die Informationsgewinne für jedes Merkmal (Alter, Einkommen, Kredit-Score).

## Entscheidungsknoten 1: Alter <= 30

- Subgruppen erstellen: {1, 4, 6}
- Gini-Wert für jede Subgruppe berechnen und gewichteten Gini-Wert für den Entscheidungsknoten berechnen.
- Der Gini-Wert für diese Gruppe beträgt:

\[ Gini(D_1) = 1 - \left( \left(\frac{1}{3}\right)^2 + \left(\frac{2}{3}\right)^2 \right) = 0.444 \]

- Der gewichtete Gini-Wert für den Knoten ist dann:

\[ Gini_{\text{gewichtet}}(D_1) = \frac{3}{8} \cdot Gini(D_1) = \frac{3}{8} \cdot 0.444 = 0.1665 \]

## Entscheidungsknoten 2: Einkommen <= 60000

- Subgruppen erstellen: {1, 3, 6}
- Gini-Wert für jede Subgruppe berechnen und gewichteten Gini-Wert für den Entscheidungsknoten berechnen.
- Der Gini-Wert für diese Gruppe beträgt:

\[ Gini(D_2) = 1 - \left( \left(\frac{1}{3}\right)^2 + \left(\frac{2}{3}\right)^2 \right) = 0.444 \]

- Der gewichtete Gini-Wert für den Knoten ist dann:

\[ Gini_{\text{gewichtet}}(D_2) = \frac{3}{8} \cdot Gini(D_2) = \frac{3}{8} \cdot 0.444 = 0.1665 \]

## Entscheidungsknoten 3: Kredit-Score <= 720

- Subgruppen erstellen: {1, 6}
- Gini-Wert für jede Subgruppe berechnen und gewichteten Gini-Wert für den Entscheidungsknoten berechnen.
- Der Gini-Wert für diese Gruppe beträgt:

\[ Gini(D_3) = 1 - \left( \left(\frac{1}{2}\right)^2 + \left(\frac{1}{2}\right)^2 \right) = 0.5 \]

- Der gewichtete Gini-Wert für den Knoten ist dann:

\[ Gini_{\text{gewichtet}}(D_3) = \frac{2}{8} \cdot Gini(D_3) = \frac{2}{8} \cdot 0.5 = 0.125 \]

Der Entscheidungsbaum sieht also folgendermaßen aus:


                 [Wurzel]
           /         |            \
     [D1:<=30]  [D2:<=60000] [D3:<=720]
       /   \         |         
     Ja   Nein       Ja