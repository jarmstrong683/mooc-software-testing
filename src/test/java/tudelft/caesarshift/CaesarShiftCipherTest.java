package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CaesarShiftCipherTest {
    private CaesarShiftCipher cipher;

    @BeforeEach
    public void initialize() {
        this.cipher = new CaesarShiftCipher();
    }


    @ParameterizedTest(name = "message={0},  shift={1}, expectedResult{2}")
    @CsvSource({ "abc,3,def", "abc,-3,xyz", "xyz,3,abc","xyz,-3,uvw", "xxx,3,aaa","xya,-3,uvx", "x x,3,a a"})
    public void len3(String str,int shift,String  expectedResult) {
        String result = cipher.CreateCaesarShiftCipher(str, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "message={0},  shift={1}, expectedResult{2}")
    @CsvSource({ "'a',3,'d", "'a',-3,'x", "'',-3,'invalid","' ',-3,' '" })
    public void single(String str,int shift,String  expectedResult) {
        String result = cipher.CreateCaesarShiftCipher(str, shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
