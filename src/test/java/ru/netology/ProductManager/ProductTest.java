package ru.netology.ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductRepositoryTest {

    ProductRepository productRepository = new ProductRepository();
    Book book1 = new Book(1, "Алиса в репозитории", 100, "Алиса");
    Book book2 = new Book(10, "Гарри Поттер и распредвал", 200, "Джоан Роулинг");
    Smartphone smartphone1 = new Smartphone(5, "Samsung", 15_000, "Japan");
    Smartphone smartphone2 = new Smartphone(7, "Xiaomi", 10_000, "China");

    @BeforeEach
    public void setup() {
        productRepository.add(book1);
        productRepository.add(book2);
        productRepository.add(smartphone1);
        productRepository.add(smartphone2);
    }


    @Test

    public void RemoveById() {

        Assertions.assertThrows(NotFoundException.class, () -> {
            productRepository.removeById(1);
        });
    }

//  @Test

//   public void FindById() {

//       Assertions.assertThrows(NotFoundException.class, () -> {
//           productRepository.findById(10);
//       });
//   }
}
