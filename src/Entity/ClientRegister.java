/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;
import Entity.Client;
import Entity.Product;
/**
 *
 * @author pupil
 */
public class ClientRegister {
    private Scanner scanner;

    public ClientRegister() {
    this.scanner = new Scanner(System.in);
    }
    

private Client createClient(){
     System.out.print("Введите число авторов книги: ");
     Client client = new Client();
     int countClients = scanner.nextInt();
        scanner.nextLine();
        client.setClients(createClient2(countClients));
        return client;    
}


public Client[] createClient2(int countClients){
         Client[] clients = new Client[countClients];
        for (int i = 0; i < countClients; i++) {
            Client client = new Client();
            System.out.print("Имя клиента: "+(i+1)+": ");
            client.setFirstName(scanner.nextLine());
            System.out.print("Фамилия клиента: "+(i+1)+": ");
            client.setLastName(scanner.nextLine());
            clients[i] = client;
        }
        return clients;  
}

    public void printListClients(Client[] clients){;
            System.out.print("\tClients = [\n");
            for (int j = 0; j < clients.length; j++) {
                clients[j].getClients();
                System.out.printf("\t\t%s %s%n"
                        ,client1.getFirstName(),client1.getLastName());
    }
            System.out.println("\t]");

    }
    
}
        





