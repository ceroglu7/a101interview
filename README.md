# a101interview

Neleri Kullandım?

Dil: Java<br>
Framework: JUnit<br>
IDE: IntelliJ IDEA Community Edition


Ne yaptım?

Patika&A101 Test Automation Practicum'a kabul için verilen case'i tamamladığım proje.

Akış

a101.com.tr -> Bayan İç Giyim -> Dizaltı Çorap -> Siyah Filtrelemesi ->
Tükenen Ürünleri Liste Dışı Bırakarak Oluşturulan Listeden Random Bir Ürüne Tıklayarak Sepete Ekleme ->
Üyeliksiz Şekilde Ödeme Ekranına Gitme -> Ödeme Ekranında Olunduğunu Doğrulama.

Kullandığım Bazı Metodlar

- Mevcut ürün sayfasından liste oluşturma ve tükenen ürünlerin eklenmediği yeni bir listeye aktarma.<br>
- ListBox'tan rastgele il-ilçe-mahalle seçimi.<br>
- Rastgele telefon numarası üretimi.<br>

Clean Code İçin Neler Yaptım?

- JUnit ile @Before, @Test metodlarını kullandım.<br>
- Metodları yaptığı işi açıklar şekilde İngilizce isimlendirdim.
- Ana metodumda sadece alt metodları çağırdım. Ana metodum bundan başka bir şey içermedi.
- Tarayıcıda görüntülenen her sayfa için ayrı bir Java Class oluşturarak ilgili sayfada kullanığım Selector'leri bu Class'larda tuttum.