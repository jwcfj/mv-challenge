package com.example.mvchallenge.anagram;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.rules.ExpectedException;

public class AnagramCheckerServiceTests {
    private AnagramCheckerService anagramCheckerService;

    @BeforeEach
    public void setUp(){
        this.anagramCheckerService = new AnagramCheckerService();
    }


    @Test
    public void returnTrueAnagramChecker(){
        assertTrue(this.anagramCheckerService.check("listen", "silent"));
        assertTrue(this.anagramCheckerService.check(
                "hqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwu",
                "mhvzcawiysuqgbgexdjzjbhdgzzsemvcyugaxwqiidhsjgqagzzxbemcwyvujdgwqzezihvxguymscbavswygaxubhqmigzcdjezwghjiemzcbasyqxgdzvuxygzzvjwaqsdeuihgmcbmhvzcawiysuqgbgexdjzjbhdgzzsemvcyugaxwqiidhsjgqagzzxbemcwyvujdgwqzezihvxguymscbavswygaxubhqmigzcdjezwghjiemzcbasyqxgdzvuxygzzvjwaqsdeuihgmcbmhvzcawiysuqgbgexdjzjbhdgzzsemvcyugaxwqiidhsjgqagzzxbemcwyvujdgwqzezihvxguymscbavswygaxubhqmigzcdjezwghjiemzcbasyqxgdzvuxygzzvjwaqsdeuihgmcbgyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwuhqxaecwgimydsuvzjbzggyejuvigwcmhqzbasdzxibwmvqjdezxgyzcsaughdzybcieashgxzvjqgmwu"));
    }

    @Test
    public void returnFalseAnagramChecker(){
        assertFalse(this.anagramCheckerService.check("hello", "world"));
        assertFalse(this.anagramCheckerService.check("hello", "wor"));
        assertFalse(this.anagramCheckerService.check("hello", ""));
    }

}
