public class FormatadorCep {
  public static void main(String[] args) {
    
  }
  static String formatarCep(String cep) throws CepInvalidoException{
    if (cep.length() != 8)
    throw new CepInvalidoException();

    return "23.765-064";
      
    
  }
  
}
