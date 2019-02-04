package romain

import java.util.Locale
import java.util.Scanner



val chiffresRomains = arrayOf('M', 'D', 'C', 'L', 'X', 'V', 'I')
val soustractifs = arrayOf("IV","IX","XL","XC","CD")


fun main(args: Array<String>) {
    println("Hello world !!!")
    //println(checkIfRomanNumeral("AAAAAAAA"))
    val a = scannou()
    val b = scannou()

    println("a = " + a + " b = " + b)
}

fun scannou() :String{
    println("Veuillez entrer une valeur s'il vous plait")
    val scan = Scanner(System.`in`)
    val n = scan.nextLine();

    return n
}


//function used to check if the given number is a boolean
fun checkIfRomanNumeral(numerals:String) : Boolean{


    //numerals.matches("M{0,4}")

    for(i in 1..numerals.length){
        if(numerals[i] in chiffresRomains){

        }

        else{
            return false
        }
    }

    return true;
}


//Simplifie le chiffre romain en enlevant les soustractifs
fun convert(numerals:String):String{
    var chaine = StringBuilder();
    var sc = ""
    for( i in 1..numerals.length){

        if(numerals[i] == 'I' || numerals[i] == 'X' || numerals[i] == 'C'){

        }

        else{
            // value 5
        }
        if(sc == "IV"){

        }

    }

    return chaine.toString();
}


fun addition(number1:String,nomber2:String){

}

// simplifie la chaine, exemple IV en IIII
fun decomposition(numerals:String){

}