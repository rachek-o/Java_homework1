package com.company.exercise5c;

import java.lang.Math;
import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        HTTPError http = HTTPError.BAD_REQUEST;
        System.out.print("Enter a code: ");
        Scanner input = new Scanner(System.in);
        int codeC = input.nextInt();
        System.out.println(" " + http.message);
    }

    public enum HTTPError {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required");

        private final int code;
        private final String message;

        HTTPError(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}

