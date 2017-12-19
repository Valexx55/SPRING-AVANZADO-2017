package edu.val.indra.spring.salamanca;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

//@Configuration
//@EnableScheduling
public class ServicioProgramado {
	
	private final static Logger log = Logger.getLogger("mylog");
	

	/**
	 * CONSIDERACIONES IMPORTANTES
	 * 
	 * - La anotación Configuration debe estar presente para que esta clase sea toamda en cuenta
	 * por el Contexto y se registren las tareas
	 * 
	 * Los métodos deben ser precedidos de la anotación Scheduled y su cabecera No recibe ningún parámetro
	 * y devuelven void
	 * 
	 *  La programación puede hacerse indicando:
	 *  
	 *  mommento inicial de ejecución 
	 *  
	 *  
     *  initialDelay: milisegundos desde la instanciación del bean hasta la primera ejecución.
     *  fixedDelay: milisegundos de intervalo entre ejecuciones finalizadas tras el fin de la última ejecución del método que deben pasar hasta una nueva ejecución del método. Lo usaremos para métodos que se deban ejecutar con una frecuencia muy alta y que sean susceptibles de durar bastante.
     *  fixedRate: milisegundos de intervalo entre inicios de ejecución, (sin tenerse en cuenta si la última ejecución finalizó).
     *
     *
     *  cron:Permite definir una regla cron estilo UNIX CRONTAB, 
     *  estableciendo un periodo regular de ejecución de forma más precisa.
     *  
     *  
		---------------------- minuto (0-59) 
		|  .------------ hora (0-23)
		|  |  .--------- día del mes (1-31)
		|  |  |  .------ mes (1-12) o jan,feb,mar,apr,may,jun,jul... (meses en inglés)
		|  |  |  |  .--- día de la semana (0-6) (domingo=0 ó 7) o sun,mon,tue,wed,thu,fri,sat (días en inglés) 
		|  |  |  |  |
		*  *  *  *  *  
		*  
		*  EJEMPLOS CRON
		*  
		*   1.- 30 10 * * 1 --> Los lunes, a las 10:30
		*   2.- 0,30 * * * 1 --> Los lunes, cada media hora
		*   3.-	0,15,30,45 * * * * --> Cada 15 minutos */
	
	//MÁS EEJMPLOS CRON
	

//    "0 0 * * * *" = TODOS LOS DÍAS A EN PUNTO.
//    "*/10 * * * * *" CADA 10 SEGUNDOS.
//    "0 0 8-10 * * *" A LAS 8, 9 Y 10 TODOS LOS DÍAS.
//    "0 * 6,19 * * *" A LAS 6 Y LAS 19 CADA DÍA
//    "0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30 y 10 CADA DÍA.
//    "0 0 9-17 * * MON-FRI" =En diario, a las 9, cada hora hasta las 17
//    "0 0 0 25 12 ?" = a las 24, todas las navidades

	
	
	 @Scheduled(initialDelay=30000, fixedDelay = 1500)
	    public void task1()
	    {
	       	log.info("tarea1");
	    }
	     
	    @Scheduled(cron="*/10 * * * * ?")
	    public void task2()
	    {
	        log.info("tarea2");
	    }

}
