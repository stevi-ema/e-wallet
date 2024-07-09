import kotlin.system.exitProcess

class Transaction {
    fun inputTrx(){
        println("\n\n----------- ADD TRANSACTION -----------")
        print("tanggal [dd/mm/yyyy] : ")
        var tanggal = readLine().toString()
        print("kategori [1. Groceries | 2. Housing | 3. Food | 4. Transportation | 5. Entertaiment | 6. Education]: ")
        var kat = readLine()!!.toInt()
        var kategori = ""
        if(kat == 1){
            kategori = "Groceries"
        }else if (kat == 2){
            kategori = "Housing"
        }else if (kat == 3){
            kategori = "Food"
        }else if (kat == 4){
            kategori = "Transportation"
        }else if (kat == 5){
            kategori = "Entertaiment"
        }else if (kat == 6){
            kategori = "Education"
        }else{
            kategori = "none"
        }
        print("amount \t\t\t: ")
        var nominal = readLine()!!.toDouble()
        print("description \t: ")
        var keterangan = readLine().toString()
        Transaksi.data.add(Transaksi(tanggal, kategori,nominal,keterangan))
        Account.balance -= nominal
    }

    fun showTrx(){
        var opsi = 0
        println("\n\n----------- SHOW TRANSACTION -----------")
        var a = 0
        var no = 1
        println("No \t Date \t\t Category \t\t\t Amount \t\t\t Description")
        print(Transaksi.data)
        print("\n1. Back to Main Menu | 2. Add Transaction | 3. Edit Transaction | 4. Delete Transaction | 5. Exit : ")
        opsi = readLine()!!.toInt()
        if(opsi == 1){
            var ctr = Controller()
            ctr.showMenu()
        }else if (opsi == 2){
            inputTrx()
            showTrx()
        }else if (opsi == 3){
            editTrx()
            showTrx()
        }else if (opsi == 4){
            delTrx()
            showTrx()
        }else if (opsi == 5){
            exitProcess(0)
        }
    }

    fun editTrx(){
        println("\n\n----------- EDIT TRANSACTION -----------")
        print("What number data do you want to change? ")
        var no = readLine()!!.toInt()
        Account.balance += Transaksi.data.get(no-1).nominal
        print("tanggal [dd/mm/yyyy] : ")
        var tanggal = readLine().toString()
        print("kategori [1. Groceries | 2. Housing | 3. Food | 4. Transportation | 5. Entertaiment | 6. Education]: ")
        var kat = readLine()!!.toInt()
        var kategori = ""
        if(kat == 1){
            kategori = "Groceries"
        }else if (kat == 2){
            kategori = "Housing"
        }else if (kat == 3){
            kategori = "Food"
        }else if (kat == 4){
            kategori = "Transportation"
        }else if (kat == 5){
            kategori = "Entertaiment"
        }else if (kat == 6){
            kategori = "Education"
        }else{
            kategori = "none"
        }
        print("amount \t\t\t: ")
        var nominal = readLine()!!.toDouble()
        print("description \t: ")
        var keterangan = readLine().toString()
        Account.balance -= nominal
        Transaksi.data.set(no-1,Transaksi(tanggal,kategori,nominal,keterangan))
    }

    fun delTrx(){
        println("\n\n----------- DELETE TRANSACTION -----------")
        print("What number data do you want to delete ? ")
        var no = readLine()!!.toInt()
        Account.balance += Transaksi.data.get(no-1).nominal
        Transaksi.data.removeAt(no-1)
    }
}