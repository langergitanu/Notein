package oO0o0O0o;

import Oooo0oO.o0Oo0oo;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: oO0o0O0o.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33600OooOo0o extends C33599OooOo0O {
    public static String Oooooo(int i, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static char OoooooO(String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (str.length() != 0) {
            return str.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char Ooooooo(CharSequence charSequence) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(C33599OooOo0O.Oooo000(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String o0OoOo0(int i, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        kotlin.jvm.internal.OooOOO0.OooO0o(strSubstring, "substring(...)");
        return strSubstring;
    }
}
