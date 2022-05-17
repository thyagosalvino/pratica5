/**
 * 
 */
package pratica5;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * @author 11510313
 *
 */
@SuppressWarnings("unused")
public class q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
	     ArrayList<String> cadastro = new ArrayList<String>();

	      
	     do
	     {
	     String menu= JOptionPane.showInputDialog("CADASTRO REDE SOCIAL \n1-CADASTRAR \n2-EXCLUIR\n3-PESQUISAR\n4-SAIR");
	     i = Integer.parseInt(menu);
	     switch (i)
	        {
	             case 1:
	                String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	                String telefone= JOptionPane.showInputDialog("Digite o telefone: ");
	                String instagram= JOptionPane.showInputDialog("Digite o usuário Instagram @: ");
	                String email= JOptionPane.showInputDialog("Digite o e-mail: ");
	                
	                cadastro.add(nome+";"+telefone+";"+"@"+instagram+";"+email);
	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                 break;
	             case 2:
	                 String nomeexcluir= JOptionPane.showInputDialog("Digite o Nome: ");
	                int n=cadastro.size();
	                for (i=0; i<n; i++){
	                	if(cadastro.get(i).contains(nomeexcluir))
	                	{
	               cadastro.remove(i);
	                	}
	                }
	        
	                JOptionPane.showMessageDialog(null, "Excluído com Sucesso");
	                 try {
	                  } catch (IndexOutOfBoundsException e) {
	                      System.out.printf("\nErro: Posição inválida (%s).",
	                        e.getMessage());
	                  }
	                 break;
	             case 3:
	                   j = 0;
	                    Iterator<String> iterator = cadastro.iterator();
	                    while (iterator.hasNext()) {
	                      System.out.printf("Posição %d- %s\n", j, iterator.next());
	                      j++;
	                    }
	                    break;
	             case 4:
	                 break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas:");
	        }
	     } while (i!=4);
	}
	}
