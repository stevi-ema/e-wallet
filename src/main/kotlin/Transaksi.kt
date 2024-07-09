import kotlin.math.tan
import kotlin.system.exitProcess

data class Transaksi(var tanggal:String, var kategori:String, var nominal:Double, var keterangan:String) {
    companion object{
        val data = mutableListOf(Transaksi("09/07/2024","Food",10000.0,"makan siang"))
    }
}

