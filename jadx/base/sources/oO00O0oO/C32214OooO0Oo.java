package oO00O0oO;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.OooOOO0;
import o000ooo.C24746OooO00o;
import oO00O0o0.C32183OooO0Oo;
import oO00O0o0.C32194OooOo0o;
import oO00O0oO.OooO0OO;
import oO0o0O0o.C33580OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33600OooOo0o;

/* JADX INFO: renamed from: oO00O0oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32214OooO0Oo extends OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f115613OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32183OooO0Oo f115614OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final byte[] f115615OooO0OO;

    public C32214OooO0Oo(String text, C32183OooO0Oo contentType) {
        byte[] bArrOooO0OO;
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(contentType, "contentType");
        this.f115613OooO00o = text;
        this.f115614OooO0O0 = contentType;
        Charset charsetOooO0Oo = C24746OooO00o.OooO0Oo(contentType);
        charsetOooO0Oo = charsetOooO0Oo == null ? C33580OooO00o.f121231OooO0O0 : charsetOooO0Oo;
        if (OooOOO0.OooO0O0(charsetOooO0Oo, C33580OooO00o.f121231OooO0O0)) {
            bArrOooO0OO = C33595OooOOo.OooOOOo(text);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charsetOooO0Oo.newEncoder();
            OooOOO0.OooO0o(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrOooO0OO = oO00Oo00.OooO00o.OooO0OO(charsetEncoderNewEncoder, text, text.length());
        }
        this.f115615OooO0OO = bArrOooO0OO;
    }

    @Override // oO00O0oO.OooO0OO
    public final Long OooO00o() {
        return Long.valueOf(this.f115615OooO0OO.length);
    }

    @Override // oO00O0oO.OooO0OO
    public final C32183OooO0Oo OooO0O0() {
        return this.f115614OooO0O0;
    }

    @Override // oO00O0oO.OooO0OO
    public final C32194OooOo0o OooO0Oo() {
        return null;
    }

    @Override // oO00O0oO.OooO0OO.OooO00o
    public final byte[] OooO0o0() {
        return this.f115615OooO0OO;
    }

    public final String toString() {
        return "TextContent[" + this.f115614OooO0O0 + "] \"" + C33600OooOo0o.o0OoOo0(30, this.f115613OooO00o) + '\"';
    }
}
