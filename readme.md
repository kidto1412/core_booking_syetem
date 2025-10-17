## Penjelasan dari class Book diatas :

### @Entity : merepresentasikan bahwa class tersebut adalah sebuah entitas, yang nantinya akan ada

```sebuah Tabel di database dengan nama Book
@Id : menunjukan bahwa variable itu adalah sebuah ID atau Primary Key dari suatu table. Penggunaan
@Id di Spring Data JPA sangat lah mandatory /wajib. Setiap class yang diberi annotasi @Entity harus
mempunyai @Id.
@GeneratedValue : sebuah mekanisme dalam memberikan nilai. Karena disini menggunakan
strategy = GenerationType.IDENTITY yang artinya nilai akan diberikan secara increment atau
fungsi nya sama dengan AUTO_INCREMENT pada sebuah table.
@Column(nullable = false) : Memberikan info bahwa variable tersebut yang akan menjadi kolom
di table Book, tidak boleh null atau not null.
```
