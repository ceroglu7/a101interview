# a101interview

<b>Neleri Kullandım?</b>

Dil: Java<br>
Framework: JUnit<br>
IDE: IntelliJ IDEA Community Edition<br>
Driver: Chrome Driver<br>

<b>Akış</b>

a101.com.tr -> Bayan İç Giyim -> Dizaltı Çorap -> Siyah Filtrelemesi ->
Tükenen Ürünleri Liste Dışı Bırakarak Oluşturulan Listeden Random Bir Ürüne Tıklayarak Sepete Ekleme ->
Üyeliksiz Şekilde Ödeme Ekranına Gitme -> Ödeme Ekranında Olunduğunu Doğrulama.<br>

<b>Ne İçin?</b>

Patika.dev & A101 Test Automation Practicum'a kabul için verilen case'i tamamladığım proje.


<b>Kullandığım Bazı Metodlar</b>

- Mevcut ürünleri içeren listeden stokta olmayan ürünleri eleyerek yeni bir liste oluşturma ve bu listeden rastgele bir ürüne tıklama.<br>
- ListBox'tan rastgele il-ilçe-mahalle seçimi.<br>
- Rastgele telefon numarası üretimi.<br>

<b>Clean Code İçin Neler Yaptım?</b>

- JUnit ile @Before, @Test metodlarını kullandım.<br>
- Metodları yaptığı işi açıklar şekilde İngilizce isimlendirdim.<br>
- Ana metodumda sadece alt metodları çağırdım. Ana metodum bundan başka bir şey içermedi.<br>
- Tarayıcıda görüntülenen her sayfa için ayrı bir Java Class oluşturarak ilgili sayfada kullanığım Selector'leri bu Class'larda tuttum.
