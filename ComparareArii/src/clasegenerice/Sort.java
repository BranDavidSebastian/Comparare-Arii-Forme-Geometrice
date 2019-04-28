/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerice;

/**
 *
 * @author David PC
 */

public final class Sort
{
public static void sortareComp(Compara [] a)
{
Compara temp;

for (int i = 0; i <= a.length - 2; i++)
{ for (int j = i+1; j <= a.length - 1; j++)
{ if (a[i].comparaCu(a[j]) == 1)
{ temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
}}
