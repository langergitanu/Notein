package oO00O;

import java.nio.charset.Charset;
import javax.crypto.spec.SecretKeySpec;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO00O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32142OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f115268OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f115269OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f115270OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final byte[] f115271OooO0Oo;

    static {
        Charset charset = C33580OooO00o.f121231OooO0O0;
        byte[] bytes = "master secret".getBytes(charset);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes, "this as java.lang.String).getBytes(charset)");
        f115268OooO00o = bytes;
        byte[] bytes2 = "key expansion".getBytes(charset);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes2, "this as java.lang.String).getBytes(charset)");
        f115269OooO0O0 = bytes2;
        byte[] bytes3 = "client finished".getBytes(charset);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes3, "this as java.lang.String).getBytes(charset)");
        f115270OooO0OO = bytes3;
        byte[] bytes4 = "server finished".getBytes(charset);
        kotlin.jvm.internal.OooOOO0.OooO0o(bytes4, "this as java.lang.String).getBytes(charset)");
        f115271OooO0Oo = bytes4;
    }

    public static final SecretKeySpec OooO00o(C32139OooO0Oo suite, byte[] bArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(suite, "suite");
        return new SecretKeySpec(bArr, suite.f115260OooOOOo * 2, suite.f115259OooOOOO, C33599OooOo0O.OooooO0(suite.f115251OooO0o0, "/"));
    }

    public static final SecretKeySpec OooO0O0(C32139OooO0Oo suite, byte[] bArr) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(suite, "suite");
        int i = suite.f115260OooOOOo * 2;
        int i2 = suite.f115259OooOOOO;
        return new SecretKeySpec(bArr, i + i2, i2, C33599OooOo0O.OooooO0(suite.f115251OooO0o0, "/"));
    }
}
