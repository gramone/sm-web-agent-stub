package com.demo.sm;

/**
 * Mockup class to simulate the behavior of a session validator
 */
public class Stub {

    /**
     *  Vslidates token based on whether the token is more than 8 character long.
     *  Obviously, a real implementation would have a completely different logic
     *  but we are only interested in simulating the output
     *
     * @param token
     * @return
     */
    public boolean validateToken(String token){

        boolean validated = false;
        if (token != null && token.length() > 8){
            validated = true;
        }

        return validated;

    }
}
