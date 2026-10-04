package com.huawei.hms.hatool;

import Oooo0oO.C21081o00000o0;
import android.util.Pair;
import java.nio.charset.Charset;
import o00OO0o0.C24998OooO0O0;
import o0O00o0o.C25846OooO00o;

/* JADX INFO: renamed from: com.huawei.hms.hatool.d */
/* JADX INFO: loaded from: classes8.dex */
public class C17976d {

    /* JADX INFO: renamed from: a */
    public static final Charset f53768a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static Pair<byte[], String> m77269a(String str) {
        if (str == null || str.length() < 32) {
            return new Pair<>(new byte[0], str);
        }
        String strSubstring = str.substring(0, 32);
        return new Pair<>(C24998OooO0O0.OooO0o0(strSubstring), str.substring(32));
    }

    /* JADX INFO: renamed from: b */
    public static String m77272b(String str, String str2) {
        byte[] bytes = str.getBytes(f53768a);
        byte[] bArrOooO0o0 = C24998OooO0O0.OooO0o0(str2);
        byte[] bArrOooO00o = C25846OooO00o.OooO00o(16);
        byte[] bArrOooO0o = C21081o00000o0.OooO0o(bytes, bArrOooO0o0, bArrOooO00o);
        byte[] bArr = new byte[bArrOooO00o.length + bArrOooO0o.length];
        System.arraycopy(bArrOooO00o, 0, bArr, 0, bArrOooO00o.length);
        System.arraycopy(bArrOooO0o, 0, bArr, bArrOooO00o.length, bArrOooO0o.length);
        return C24998OooO0O0.OooO0OO(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m77270a(String str, String str2) {
        Pair<byte[], String> pairM77269a = m77269a(str);
        return new String(C21081o00000o0.OooO0Oo(C24998OooO0O0.OooO0o0((String) pairM77269a.second), C24998OooO0O0.OooO0o0(str2), (byte[]) pairM77269a.first), f53768a);
    }

    /* JADX INFO: renamed from: a */
    public static String m77271a(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0 || str == null) {
            C18030y.m77583b("AesCipher", "cbc encrypt(byte) param is not right");
            return "";
        }
        byte[] bArrOooO0o0 = C24998OooO0O0.OooO0o0(str);
        if (bArrOooO0o0.length < 16) {
            C18030y.m77583b("AesCipher", "key length is not right");
            return "";
        }
        byte[] bArrOooO00o = C25846OooO00o.OooO00o(16);
        byte[] bArrOooO0o = C21081o00000o0.OooO0o(bArr, bArrOooO0o0, bArrOooO00o);
        byte[] bArr2 = new byte[bArrOooO00o.length + bArrOooO0o.length];
        System.arraycopy(bArrOooO00o, 0, bArr2, 0, bArrOooO00o.length);
        System.arraycopy(bArrOooO0o, 0, bArr2, bArrOooO00o.length, bArrOooO0o.length);
        return C24998OooO0O0.OooO0OO(bArr2);
    }
}
