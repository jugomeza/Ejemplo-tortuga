/*/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

/**
 *
 * @author dmadero
 */
public class turtle{

  Turtle joe = new Turtle();

  {
    for (int i = 0; i <90 ; i++)
    {
      if (i < 50)
        joe.forward(2);
      else
        if (i < 100)
        {
          joe.right(3.6);
          joe.forward(2);
        }
        else
          if (i < 150)
          {
            joe.hideTurtle();
            
            joe.left(3.6);
            joe.forward(2);
          }
          else
            joe.forward(20);
    }
  }

  public static void main(String[] args)
  {
    new Tu7();
  }
}
}
