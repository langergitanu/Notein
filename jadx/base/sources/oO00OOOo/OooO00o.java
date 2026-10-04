package oO00OOOo;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f115758OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte[] f115759OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final byte[] f115760OooO0OO;

    public OooO00o(Charset charset) {
        byte[] bArrOooO0OO;
        byte[] bArrOooO0OO2;
        byte[] bArrOooO0OO3;
        OooOOO0.OooO0oO(charset, "charset");
        Charset charset2 = C33580OooO00o.f121231OooO0O0;
        if (charset.equals(charset2)) {
            bArrOooO0OO = C33595OooOOo.OooOOOo("[");
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            OooOOO0.OooO0o(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrOooO0OO = oO00Oo00.OooO00o.OooO0OO(charsetEncoderNewEncoder, "[", 1);
        }
        this.f115758OooO00o = bArrOooO0OO;
        if (charset.equals(charset2)) {
            bArrOooO0OO2 = C33595OooOOo.OooOOOo("]");
        } else {
            CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
            OooOOO0.OooO0o(charsetEncoderNewEncoder2, "charset.newEncoder()");
            bArrOooO0OO2 = oO00Oo00.OooO00o.OooO0OO(charsetEncoderNewEncoder2, "]", 1);
        }
        this.f115759OooO0O0 = bArrOooO0OO2;
        if (charset.equals(charset2)) {
            bArrOooO0OO3 = C33595OooOOo.OooOOOo(",");
        } else {
            CharsetEncoder charsetEncoderNewEncoder3 = charset.newEncoder();
            OooOOO0.OooO0o(charsetEncoderNewEncoder3, "charset.newEncoder()");
            bArrOooO0OO3 = oO00Oo00.OooO00o.OooO0OO(charsetEncoderNewEncoder3, ",", 1);
        }
        this.f115760OooO0OO = bArrOooO0OO3;
    }
}
