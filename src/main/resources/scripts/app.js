// Функция для загрузки всех продуктов
const productList = document.getElementById('product-list');
const formTitle = document.getElementById('form-title');
const productForm = document.getElementById('product-form');
const productIdInput = document.getElementById('product-id');
const nameInput = document.getElementById('name');
const priceInput = document.getElementById('price');

// URL API
const apiUrl = 'http://localhost:8080/api/products';

// Загрузка всех продуктов при загрузке страницы
window.addEventListener('DOMContentLoaded', loadProducts);

function loadProducts() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(products => {
            productList.innerHTML = '';
            products.forEach(product => {
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>
                        <button class="edit-btn action-btn" onclick="editProduct(${product.id})">Edit</button>
                        <button class="delete-btn action-btn" onclick="deleteProduct(${product.id})">Delete</button>
                    </td>
                `;
                productList.appendChild(row);
            });
        })
        .catch(error => console.error('Error loading products:', error));
}

// Функция для добавления или обновления продукта
productForm.addEventListener('submit', function (e) {
    e.preventDefault();

    const id = productIdInput.value;
    const name = nameInput.value;
    const price = priceInput.value;

    const productData = {
        name: name,
        price: parseFloat(price)
    };

    if (id) {
        // Обновить продукт
        fetch(`${apiUrl}/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(productData)
        })
            .then(response => response.json())
            .then(() => {
                loadProducts();
                resetForm();
            })
            .catch(error => console.error('Error updating product:', error));
    } else {
        // Создать новый продукт
        fetch(apiUrl, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(productData)
        })
            .then(response => response.json())
            .then(() => {
                loadProducts();
                resetForm();
            })
            .catch(error => console.error('Error creating product:', error));
    }
});

// Функция для редактирования продукта
function editProduct(id) {
    fetch(`${apiUrl}/${id}`)
        .then(response => response.json())
        .then(product => {
            productIdInput.value = product.id;
            nameInput.value = product.name;
            priceInput.value = product.price;
            formTitle.textContent = 'Edit Product';
        })
        .catch(error => console.error('Error loading product:', error));
}

// Функция для удаления продукта
function deleteProduct(id) {
    if (confirm('Are you sure you want to delete this product?')) {
        fetch(`${apiUrl}/${id}`, {
            method: 'DELETE'
        })
            .then(() => {
                loadProducts();
            })
            .catch(error => console.error('Error deleting product:', error));
    }
}

// Сброс формы после добавления/обновления продукта
function resetForm() {
    productIdInput.value = '';
    nameInput.value = '';
    priceInput.value = '';
    formTitle.textContent = 'Add Product';
}
