object Caesar_Cipher extends App{

  val Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
  val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + Alphabet.size) % Alphabet.size
  val inputText = scala.io.StdIn.readLine("Secret Message: ")
  val outputText = inputText.map( (c: Char) => {
    val x = Alphabet.indexOf(c.toUpper)
    if (x == -1){
      c
    }
    else{
      Alphabet((x + shift) % Alphabet.size)
    }
  })
  println(outputText)
}
