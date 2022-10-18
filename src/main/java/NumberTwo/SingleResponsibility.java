package NumberTwo;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SingleResponsibility {
    public static void main(String[] args) {

    }
}

class ProductService {

    private NotificationService notificationService;

    public void addProduct() {
        System.out.println("add product logic...");
    }

    public Product getProduct() {
        return null;
    }

    public Product getProductById(Long id) {
        return null;
    }
}

class NotificationService {

    public void sendSms() {
        System.out.println("sms sent");
    }

    public void sendHtmlEmail() {
        System.out.println("email sent");
    }

    public void sendTextEmail() {
        System.out.println("email sent");
    }
}

@Data
@AllArgsConstructor
class Product {
    private String name;
}
