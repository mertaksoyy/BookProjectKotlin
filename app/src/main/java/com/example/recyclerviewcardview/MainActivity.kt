package com.example.recyclerviewcardview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recyclerviewcardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),BookClickListener {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply { layoutManager = GridLayoutManager(applicationContext,3)
        adapter = CardAdapter(bookList,mainActivity)
        }
    }


    override fun onClick(book: Book) {
        val intent = Intent(applicationContext,DetailActivity::class.java)
        intent.putExtra(BOOK_ID_EXTRA,book.id)
        startActivity(intent)
    }



    private fun populateBooks()
    {
        val book1 = Book(
            R.drawable.book1, "Soner Yalçın", "Teşkilatın İki Silahşörü",
            "Meşrutiyet'i ilan eden İttihat ve Terakki Cemiyeti'nin ünlü silahşoru Yakub Cemil'in hayat hikâyesi ile onun torunu olduğunu iddia eden ve Milli İstihbarat Teşkilatı'na mensup olduğu günlerde ASALA'ya karşı yapılan operasyonlardaki maceralarını anlatan birinin hikâyesini kendi ağızlarından anlatmaktadır."
        )
        bookList.add(book1)

        val book2 = Book(
            R.drawable.book2, "George Orwell", "Hayvan Çiftliği",
            "Bir çiftlikte yaşayan hayvanlar, kendilerini sömüren insanlara başkaldırıp çiftliğin yönetimini ele geçirir. Amaçları daha eşitlikçi bir topluluk oluşturmaktır. Aralarında en akıllı olan domuzlar, kısa sürede önder bir takım oluşturur; ama devrimi de yine onlar yolundan saptırır."
        )
        bookList.add(book2)
        val book3 = Book(
         R.drawable.book3jpg, "Eflatun","Sokratesin Savunması",
            "Eser, Yunan filozof Platon tarafından yazılmış, Sokrates'in bir grup Atinalı tarafından şehrin tanrılarına inanmayışı ve gençlerin ahlakını bozması gerekçesiyle suçlanışını, Atina demokrasisi tarafından yargılanışını ve cezalandırılmasını konu alır."
        )
        bookList.add(book3)

        val book4 = Book(
            R.drawable.book4,"Şevket Rado","Pariste Bir Osmanlı Sefiri",
            "XV. Louis'ye yolladığı elçi ve eşliğindeki heyetin iftar sofrası. yerlere akın etmektedir. Çelebi, Fransızların savaş meydanlarındaki izlenimler üzerinden yarattıkları Türk imgesini alt üst eder: Kültürü, yaşam tarzı, edebi bilgisi bu imgenin eksik kalan taraflarını bütünler."
        )
        bookList.add(book4)

        val book5 = Book(
            R.drawable.book5,"Albert Camus","Yabancı",
            "Romanda, işlediği bir suçtan çok, gerçek duygularını dile getirdiği ve toplumun istediği kalıba girmeyi reddettiği için dışlanan bir “yabancı” aracılığıyla, XX. yüzyıl insanının içine düştüğü yabancılaşma anlatılır."
        )
        bookList.add(book5)

        val book6 = Book(
            R.drawable.book6,"Tahsin Paşa","Yıldız Hatıraları",
            "Saltanatının ve kısa bir süre sonra da vefatının üzerinden 100 yıl geçmiş olmasına rağmen, Abdülhamid ismi halen tartışılmaya devam etmektedir. Bu eser, Sultan II. Abdülhamid'in en yakın isimlerinden biri olan Tahsin Paşa'nın, tarihin en cilveli dönemlerinde Yıldız Sarayı'nda yaşadığı tanıklıkların bir belgesidir."
        )
        bookList.add(book6)

        val book7 = Book(
            R.drawable.book7,"Robert Kiyosaki","Rich Dad Poor Dad",
            "Zengin Baba Yoksul Baba kitap özeti (1997), mali açıdan bağımsız birine dönüşmek için izlemeniz gereken adımları, kişisel tavsiyelerle birleştiriyor. Yazar, üst sınıflara mensup ailelerde, çocuklara zenginliği korumak için öğretilen bilgilerin, okullarda öğretilmediğini savunuyor."
        )
        bookList.add(book7)

        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)

    }
}