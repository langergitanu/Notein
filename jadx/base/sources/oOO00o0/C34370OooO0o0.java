package oOO00o0;

import android.content.Context;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.OooOOO0;
import oOO00ooo.C34407OooO00o;

/* JADX INFO: renamed from: oOO00o0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34370OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static C34369OooO0Oo f123357OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f123358OooO0O0 = 0;

    public static final byte[] OooO00o(SecretKeySpec secret, byte[] label, byte[] bArr, int i) throws NoSuchAlgorithmException, InvalidKeyException {
        OooOOO0.OooO0oO(secret, "secret");
        OooOOO0.OooO0oO(label, "label");
        byte[] bArrOooOOoo = Oooo.OooO0OO.OooOOoo(label, bArr);
        Mac mac = Mac.getInstance(secret.getAlgorithm());
        OooOOO0.OooO0o(mac, "getInstance(secret.algorithm)");
        if (i < 12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byte[] bArrOooOOoo2 = new byte[0];
        byte[] bArrDoFinal = bArrOooOOoo;
        while (bArrOooOOoo2.length < i) {
            mac.reset();
            mac.init(secret);
            mac.update(bArrDoFinal);
            bArrDoFinal = mac.doFinal();
            OooOOO0.OooO0o(bArrDoFinal, "mac.doFinal()");
            mac.reset();
            mac.init(secret);
            mac.update(bArrDoFinal);
            mac.update(bArrOooOOoo);
            byte[] bArrDoFinal2 = mac.doFinal();
            OooOOO0.OooO0o(bArrDoFinal2, "mac.doFinal()");
            bArrOooOOoo2 = Oooo.OooO0OO.OooOOoo(bArrOooOOoo2, bArrDoFinal2);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArrOooOOoo2, i);
        OooOOO0.OooO0o(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }

    public static synchronized void OooO0O0(Context context) {
        f123357OooO00o = C34369OooO0Oo.OooO0OO(context);
    }

    public static void OooO0OO(String str, String str2) {
        if (f123357OooO00o != null) {
            C34369OooO0Oo.OooO0O0(6, str, str2);
            C34407OooO00o.C20359OooO00o c20359OooO00o = new C34407OooO00o.C20359OooO00o(6, str);
            c20359OooO00o.f123409OooO0oO = str2;
            OooO0OO.OooO00o(new C34407OooO00o(c20359OooO00o));
        }
    }

    public static void OooO0Oo(String str, String str2) {
        if (f123357OooO00o != null) {
            C34369OooO0Oo.OooO0O0(4, str, str2);
            C34407OooO00o.C20359OooO00o c20359OooO00o = new C34407OooO00o.C20359OooO00o(4, str);
            c20359OooO00o.f123409OooO0oO = str2;
            OooO0OO.OooO00o(new C34407OooO00o(c20359OooO00o));
        }
    }

    public static void OooO0o(String str, String str2) {
        if (f123357OooO00o != null) {
            C34369OooO0Oo.OooO0O0(4, str, str2);
            C34407OooO00o.C20359OooO00o c20359OooO00o = new C34407OooO00o.C20359OooO00o(4, str);
            c20359OooO00o.f123409OooO0oO = str2;
            OooO0OO.OooO00o(new C34407OooO00o(c20359OooO00o));
        }
    }

    public static void OooO0o0(String str, String str2) {
        if (f123357OooO00o != null) {
            C34369OooO0Oo.OooO0O0(3, str, str2);
        }
    }
}
