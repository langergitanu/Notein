package o000ooOO;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;

/* JADX INFO: renamed from: o000ooOO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24741OooOO0o {
    public static byte[] OooO00o(String str, String str2, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(C24734OooO0O0.OooO00o(cipher, str2)));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] OooO0O0(String str, String str2, byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(C24734OooO0O0.OooO00o(cipher, str2)));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final int OooO0OO(InterfaceC24747OooO0O0 connection) throws Exception {
        kotlin.jvm.internal.OooOOO0.OooO0oO(connection, "connection");
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = connection.o0ooOOo("SELECT changes()");
        try {
            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
            int i = (int) interfaceC24749OooO0OoO0ooOOo.getLong(0);
            interfaceC24749OooO0OoO0ooOOo.close();
            return i;
        } finally {
        }
    }
}
