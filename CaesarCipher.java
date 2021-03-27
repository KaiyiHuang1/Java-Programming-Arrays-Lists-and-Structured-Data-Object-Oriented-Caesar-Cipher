
/**
 * 在这里给出对类 CaesarCipher 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class CaesarCipher {
    private String alphabetUpper;
    private String alphabetLower;
    private String shiftedAlphabetUpper;
    private String shiftedAlphabetLower;
    public CaesarCipher(int key){
        alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        alphabetLower = "abcdefghijklmnopqrstuvwxyz";
        shiftedAlphabetUpper = alphabetUpper.substring(key) + alphabetUpper.substring(0, key);
        shiftedAlphabetLower = alphabetLower.substring(key)+ alphabetLower.substring(0, key);
    }
    
    public String encrypt(String input){
        StringBuilder encrypted = new StringBuilder(input);

        for(int i = 0; i < encrypted.length(); i++){
            char currChar = encrypted.charAt(i);
            if(Character.isUpperCase(currChar)){
            int idx =alphabetUpper.indexOf(currChar);
            if(idx != -1){
                char newChar = shiftedAlphabetUpper.charAt(idx);
                encrypted.setCharAt(i, newChar);
            }
        }else{
            int idx =alphabetLower.indexOf(currChar);
            if(idx != -1){
                char newChar = shiftedAlphabetLower.charAt(idx);
                encrypted.setCharAt(i, newChar);
            }
        }
        }
        return encrypted.toString();
    }

}
