using System.Configuration.Assemblies;
using DesafioPOO.Models;
class Program
{
    static void Main()
    {
        Smartphone nokia = new Nokia("9999-0000", "Nokia Tijolão", "123456789", 8);
        nokia.Ligar();
        nokia.InstalarAplicativo("Snake");

        Console.WriteLine();

        Smartphone iphone = new Iphone("8888-0000", "iPhone 13", "987654321", 512);
        iphone.ReceberLigacao();
        iphone.InstalarAplicativo("Instagram");
    }   
}