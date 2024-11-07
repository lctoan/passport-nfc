package com.tananaev.passportreader;


import java.io.UnsupportedEncodingException;

public class KeyI implements KeySP {
    private byte[] a;
    private byte b;

    public KeyI(String str, byte b2) {
        this(j(str), b2);
    }

    public KeyI(byte[] bArr, byte b2) {
        this.b = b2;
        this.a = bArr;
    }

    public static KeyI a(String str) {
        return new KeyI(str, (byte) 2);
    }

    public byte b() {
        return this.b;
    }

    public byte[] getKey() {
        return this.a;
    }

    public static byte[] j(String str) {
        byte[] bytes = str.getBytes();
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            return bytes;
        }
    }
}