import kotlin.properties.Delegates

class Account {
    companion object{
        var nama:String = ""
        var debitCard:String = ""
        var creditCard:String = ""
        var balance:Double = 0.0
    }

    fun inputData(){
        println("Your are a new member in this application")
        println("Please fill in your personal data first")
        print("Name : ")
        Account.nama = readLine()!!.toString()
        print("First Balance : Rp ")
        Account.balance = readLine()!!.toDouble()
        print("Debit Card number (If not present give -) : ")
        Account.debitCard = readLine()!!.toString()
        print("Credit Card number (If not present give -) : ")
        Account.creditCard = readLine()!!.toString()
    }

    fun showData(){
        println("\n\n------------- ACCOUNT DATA -------------")
        println("Name\t\t: ${Account.nama}")
        println("Debit Card\t: ${Account.debitCard}")
        println("Credit Card\t: ${Account.creditCard}")
    }

    fun editData(){
        println("\n\n---------- EDIT ACCOUNT DATA ----------")
        print("Name : ")
        Account.nama = readLine()!!.toString()
        print("Debit Card number (If not present give -) : ")
        Account.debitCard = readLine()!!.toString()
        print("Credit Card number (If not present give -) : ")
        Account.creditCard = readLine()!!.toString()
    }

    fun addBalance(){
        println("\n\n---------- ADD INCOME ----------")
        print("Income : ")
        var inc = readLine()!!.toInt()
        Account.balance += inc
    }
}