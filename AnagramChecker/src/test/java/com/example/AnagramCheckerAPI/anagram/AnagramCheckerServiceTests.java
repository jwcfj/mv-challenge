package com.example.AnagramCheckerAPI.anagram;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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