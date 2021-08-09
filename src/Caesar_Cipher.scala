object Caesar_Cipher extends App{
  
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"


  //We will shift our plaintext by this much
  //Notice: shift = (# + 26) % 26 <-- This allows us to take any number (even if it is negative, or bigger than our alphabet size)
  val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

  //What is the code we want to encrypt/decrypt
  val inputText = scala.io.StdIn.readLine("Secret Message: ")

  //Lets Encrypt/Decrypt the code
  val outputText = inputText.map( (c: Char) => {

    //We find the c char in our allowed alphabet
    val x = alphabet.indexOf(c.toUpper)

    //If the c char is in our alphabet then we encrypt it
    //If it is not then we leave it be.
    if (x == -1){
      c
    }
    else{
      alphabet((x + shift) % alphabet.size)
    }
  })

  //Print the result
  println(outputText)
}
