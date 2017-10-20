    

    public class EstacionDeTren
{
    private String ciudad;
    private TicketMachine maquina1;
    private TicketMachine maquina2;
    
    
    /** 
     * Constructor de la estacion de tren
     */
    public EstacionDeTren (String nombreCiudad, int precioMaquina1,int precioMaquina2)
    { 
     ciudad = nombreCiudad;  
     maquina1 = new TicketMachine(precioMaquina1);
     maquina2 = new TicketMachine(precioMaquina2);
     
    }
    /**
     * simula la venta de un billete en la maquina 1
     *
     */
    public void ventaBilleteMaquina1()
    {
        maquina1.insertMoney(500);
        maquina1.printTicket();
    }
    /**
     * simula la venta de un billete en la maquina 2
     *
     */
    public void ventaBilleteMaquina2()
    {
        maquina2.insertMoney(800);
        maquina2.printTicket();
    }
    
    /**
     * Devuelve el total del dinero recaudado por las maquinas de la estacion hasta el momento
     *
     */
    public int dineroRecaudadoMaquinas()
    {
       return maquina1.getTotal() + maquina2.getTotal();
        
    }
    /**
     * imprime por pantalla la cantidad recaudada
     * por la maquina 1 y por la maquina 2 y el total de ambas
     */
    public void dineroTotalPorPantalla()
    {
        System.out.println("Dinero de la maquina 1 " + maquina1.getTotal() + " Dinero de la maquina 2 " + maquina2.getTotal() );
        System.out.println("Total de dinero de las dos maquinas " + (maquina1.getTotal() + maquina2.getTotal()));
        
     }
     
    
}