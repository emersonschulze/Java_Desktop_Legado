/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package backupmysqlgmail;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Frank
 */
public class enviaEmail {

    public enviaEmail(String email, String senha, String caminho, String arquivo) throws EmailException {

        enviarEmail(email, senha, caminho, arquivo);

    }

    private void enviarEmail(String email, String senha, String caminho, String arquivo) throws EmailException {
     
        try {
            EmailAttachment anexo1 = new EmailAttachment();
            anexo1.setPath(caminho);
            anexo1.setDisposition(EmailAttachment.INLINE);
            anexo1.setDescription("backup");
            anexo1.setName(arquivo+".zip");
            MultiPartEmail em = new MultiPartEmail();
            em.setHostName("smtp.gmail.com");
            em.setSubject("Backup " + arquivo);
            em.setMsg("backup base dados" + new Date());

            try {
                em.addTo(email, "Backup");
                em.setFrom(email, "backup");
                em.setAuthentication(email, senha);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Não foi possivel autenticar o email e senha informado");
            }
            em.setSmtpPort(465);
            em.setSSL(true);
            em.setTLS(true);
            em.attach(anexo1);


            em.send();
            JOptionPane.showMessageDialog(null, "O backup foi enviado para o email informado", "Menssagem", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new enviaEmail("nada", "nada", "test.txt", "text.txt");
                } catch (EmailException ex) {
                    Logger.getLogger(enviaEmail.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
