import kotlin.system.exitProcess

class Controller {
    var acc = Account()
    var trx = Transaction()

    fun showMenu(){
        var ulang = "N"
        do{
            if(Account.nama != ""){
                println("WELCOME BACK TO THE E-WALLET APPLICATION")
                println("Hello " + Account.nama)
                println("Your balance : Rp " + Account.balance)
                //menu
                menu()
                print("Back to Main Menu ? [Y/N] ? ")
                ulang = readLine().toString()
            }else {
                acc.inputData()
                ulang = "Y"
            }
        }while (ulang == "Y" || ulang == "y")
    }

    fun menu(){
        var pilih = 0
        println("Menu Available : ")
        println("1. Show Account")
        println("2. Income Data")
        println("3. Expense Transaction")
        println("4. Exit")
        print("Which menu do you choose? ")
        pilih = readLine()!!.toInt()

        if(pilih == 1){
            var opsi = 0
            acc.showData()
            print("1. Back to Main Menu | 2. Edit Account | 3. Exit : ")
            opsi = readLine()!!.toInt()
            if(opsi == 1){
                showMenu()
            }else if (opsi == 2){
                acc.editData()
                showMenu()
            }else if (opsi == 3){
                exitProcess(0)
            }
        }else if(pilih == 2){
            acc.addBalance()
            showMenu()
        }else if(pilih == 3){
            trx.showTrx()
        }else if (pilih == 4){
            exitProcess(0)
        }
    }

}