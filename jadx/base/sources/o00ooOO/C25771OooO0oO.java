package o00ooOO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;
import oO0O00oo.C32520OooO0oo;
import oO0O00oo.OooO;
import oOo000Oo.Oooo000;

/* JADX INFO: renamed from: o00ooOO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25771OooO0oO {
    public static boolean OooO00o(String str, byte[] bArr) {
        if (bArr.length == str.length()) {
            Iterable oooO = new OooO(0, bArr.length - 1, 1);
            if (!(oooO instanceof Collection) || !((Collection) oooO).isEmpty()) {
                Iterator<Integer> it = oooO.iterator();
                while (((C32520OooO0oo) it).f116817OooOoO0) {
                    int iNextInt = ((Oooo000) it).nextInt();
                    if (((byte) str.charAt(iNextInt)) != bArr[iNextInt]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String OooO0O0(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append((char) (b & 65535));
        }
        String string = sb.toString();
        OooOOO0.OooO0o(string, "toString(...)");
        return string;
    }

    public static void OooO0OO(InputStream inputStream) throws IOException {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static C32443OooOOO OooO0Oo(InputStream inputStream) throws IOException {
        inputStream.skip(7L);
        int i = inputStream.read() & 255;
        int i2 = inputStream.read() & 255;
        int i3 = inputStream.read() & 255;
        if (i != 157 || i2 != 1 || i3 != 42) {
            return null;
        }
        return new C32443OooOOO(Integer.valueOf((inputStream.read() & 255) | ((inputStream.read() & 255) << 8)), Integer.valueOf(((inputStream.read() & 255) << 8) | (inputStream.read() & 255)));
    }

    public static C32443OooOOO OooO0o0(InputStream inputStream) throws IOException {
        OooO0OO(inputStream);
        if ((inputStream.read() & 255) != 47) {
            return null;
        }
        int i = inputStream.read() & 255;
        int i2 = inputStream.read();
        return new C32443OooOOO(Integer.valueOf((i | ((i2 & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((i2 & 192) >> 6)) + 1));
    }
}
