/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formegeometrice;

/**
 *
 * @author David PC
 */

import clasegenerice.*;
public abstract class FormaGeo implements Compara
{
private final String nume;
abstract public double arie();
public FormaGeo(String numeForma) {
nume = numeForma;
}
@Override
public int comparaCu(Compara rhs) {
if (arie() < ((FormaGeo) rhs).arie())
return -1;
else
if (arie() == ((FormaGeo) rhs).arie())
return 0;
else
return 1;
}
@Override
final public String toString() {
return nume + ", avand aria " + arie();
}
}