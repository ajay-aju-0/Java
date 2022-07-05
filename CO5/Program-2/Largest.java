import java.awt.*;
import java.applet.*;   
/* 
<applet code="Largest" width=500 height=500>
<param name=num1 value=5>
<param name=num2 value=2>
<param name=num3 value=3>
</applet>
*/
public class Largest extends Applet
{
    String param;
    int large;
    public void start()
    {
        
        param=getParameter("num1");
        int a=Integer.parseInt(param);
        param=getParameter("num2");
        int b=Integer.parseInt(param);
        param=getParameter("num3");
        int c=Integer.parseInt(param);
        if((a>b) && (a>c))
        {
            large=a;
        }
        else if ((b>c) && (b>a))
        {
            large=b;
        }
        else
        {
            large=c;
        }
    
     

    }
    public void paint(Graphics g)
    {
        g.drawString("Largest : "+large,100,100);
    }
}