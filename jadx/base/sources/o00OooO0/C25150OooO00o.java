package o00OooO0;

import Oooo0.o000000;
import Oooo0oO.o0Oo0oo;
import OooooO0.C21294OooOO0O;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.OooOOO0;
import o00oo0O0.C25679OooOo0o;
import o00oo0O0.InterfaceC25676OooOo0;
import oO00Oo0.AbstractC32268OooO0oO;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0O.C32271OooO00o;
import oO00Oo0O.C32273OooO0Oo;
import oO0o0O0o.C33580OooO00o;
import oO0o0OO.C33621OooOo0;

/* JADX INFO: renamed from: o00OooO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25150OooO00o implements InterfaceC25676OooOo0 {
    public static final void OooO(oO00Oo0.OooO0OO oooO0OO, CharSequence text, int i, int i2, Charset charset) {
        OooOOO0.OooO0oO(oooO0OO, "<this>");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(charset, "charset");
        if (charset != C33580OooO00o.f121231OooO0O0) {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            OooOOO0.OooO0o(charsetEncoderNewEncoder, "charset.newEncoder()");
            C25679OooOo0o.OooO0OO(charsetEncoderNewEncoder, oooO0OO, text, i, i2);
            return;
        }
        C32271OooO00o c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(oooO0OO, 1, null);
        int i3 = i;
        while (true) {
            try {
                CharSequence charSequence = text;
                int i4 = i2;
                int iOooO0O0 = o000000.OooO0O0(c32271OooO00oOooO0OO.f115944OooO00o, charSequence, i3, i4, c32271OooO00oOooO0OO.f115946OooO0OO, c32271OooO00oOooO0OO.f115949OooO0o0);
                int i5 = ((short) (iOooO0O0 >>> 16)) & 65535;
                i3 += i5;
                c32271OooO00oOooO0OO.OooO00o(((short) (iOooO0O0 & 65535)) & 65535);
                int i6 = (i5 != 0 || i3 >= i4) ? i3 < i4 ? 1 : 0 : 8;
                if (i6 <= 0) {
                    return;
                }
                c32271OooO00oOooO0OO = C32273OooO0Oo.OooO0OO(oooO0OO, i6, c32271OooO00oOooO0OO);
                text = charSequence;
                i2 = i4;
            } finally {
                oooO0OO.OooO00o();
            }
        }
    }

    public static C33621OooOo0 OooO0Oo() {
        C33621OooOo0 c33621OooOo0 = new C33621OooOo0(true);
        c33621OooOo0.Oooo0oO(null);
        return c33621OooOo0;
    }

    public static final byte[] OooO0o(int i, C32266OooO0Oo c32266OooO0Oo) {
        OooOOO0.OooO0oO(c32266OooO0Oo, "<this>");
        if (i == 0) {
            return C32273OooO0Oo.f115991OooO00o;
        }
        byte[] bArr = new byte[i];
        C21294OooOO0O.OooO0o0(c32266OooO0Oo, bArr, i);
        return bArr;
    }

    public static final void OooO0o0(int i) throws EOFException {
        throw new EOFException(o0Oo0oo.OooO0O0(i, "Premature end of stream: expected ", " bytes"));
    }

    public static /* synthetic */ byte[] OooO0oO(C32266OooO0Oo c32266OooO0Oo) {
        long jOooo0 = c32266OooO0Oo.Oooo0();
        if (jOooo0 <= 2147483647L) {
            return OooO0o((int) jOooo0, c32266OooO0Oo);
        }
        throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
    }

    public static String OooO0oo(AbstractC32268OooO0oO abstractC32268OooO0oO, Charset charset) {
        OooOOO0.OooO0oO(abstractC32268OooO0oO, "<this>");
        OooOOO0.OooO0oO(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        OooOOO0.OooO0o(charsetDecoderNewDecoder, "charset.newDecoder()");
        return C25679OooOo0o.OooO00o(charsetDecoderNewDecoder, abstractC32268OooO0oO);
    }

    @Override // o00oo0O0.InterfaceC25676OooOo0
    public void OooO00o(Object obj) {
    }

    @Override // o00oo0O0.InterfaceC25676OooOo0
    public void OooO0O0(Object obj) {
    }

    @Override // o00oo0O0.InterfaceC25676OooOo0
    public void OooO0OO(Object obj) {
    }
}
