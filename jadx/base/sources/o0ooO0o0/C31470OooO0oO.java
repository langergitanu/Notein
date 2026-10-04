package o0ooO0o0;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31453OooOo0O;
import o0ooO0o.C31455OooO00o;
import o0ooO0o.C31460OooO0o0;

/* JADX INFO: renamed from: o0ooO0o0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31470OooO0oO extends AbstractC31473OooOO0O {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3 A[EDGE_INSN: B:45:0x00b3->B:38:0x00b3 BREAK  A[LOOP:0: B:34:0x00a7->B:47:?], SYNTHETIC] */
    @Override // o0ooO0o0.AbstractC31473OooOO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31472OooOO0 OooO00o(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws IOException {
        InputStream inputStream2;
        long j;
        int i2;
        C31469OooO0o0 c31469OooO0o0;
        int i3;
        int i4;
        C31436OooO0Oo c31436OooO0OoOooO0Oo = AbstractC31473OooOO0O.OooO0Oo(c31448OooOOo, i);
        int iO000O00O = c31436OooO0OoOooO0Oo.o000O00O(C31441OooOO0.f112434o00o0O, null, 1728);
        int iO000O00O2 = c31436OooO0OoOooO0Oo.o000O00O(C31441OooOO0.f112391o00O0Ooo, null, 0);
        int iO000O00O3 = c31448OooOOo.o000O00O(C31441OooOO0.f112314o000O00O, C31441OooOO0.f112312o000O00, 0);
        if (iO000O00O2 <= 0 || iO000O00O3 <= 0) {
            iO000O00O3 = Math.max(iO000O00O2, iO000O00O3);
        }
        int iO000O00O4 = c31436OooO0OoOooO0Oo.o000O00O(C31441OooOO0.f112333o000Oo0O, null, 0);
        boolean zOooo00o = c31436OooO0OoOooO0Oo.Oooo00o(C31441OooOO0.o0000O0);
        int i5 = ((iO000O00O + 7) / 8) * iO000O00O3;
        byte[] bArr = new byte[i5];
        int i6 = 4;
        if (iO000O00O4 == 0) {
            byte[] bArr2 = new byte[20];
            if (inputStream.read(bArr2) != 20) {
                throw new EOFException("Can't read 20 bytes");
            }
            PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 20);
            pushbackInputStream.unread(bArr2);
            byte b = bArr2[0];
            if (b == 0) {
                byte b2 = bArr2[1];
                if ((b2 >> 4) == 1 || b2 == 1) {
                    i6 = 3;
                    j = 0;
                    inputStream2 = pushbackInputStream;
                } else {
                    short s = (short) (((b << 8) + (bArr2[1] & 255)) >> 4);
                    for (int i7 = 12; i7 < 160; i7++) {
                        s = (short) ((s << 1) + ((bArr2[i7 / 8] >> (7 - (i7 % 8))) & 1));
                        if ((s & 4095) == 1) {
                            i6 = 3;
                            break;
                        }
                    }
                    i6 = 2;
                    j = 0;
                    inputStream2 = pushbackInputStream;
                }
            }
            c31469OooO0o0 = new C31469OooO0o0(inputStream2, iO000O00O, i2, j, zOooo00o);
            i3 = 0;
            do {
                i4 = c31469OooO0o0.read(bArr, i3, i5 - i3);
                if (i4 <= -1) {
                    break;
                }
                i3 += i4;
            } while (i3 < i5);
            if (!c31436OooO0OoOooO0Oo.Oooo00o(C31441OooOO0.f112262OoooOOo)) {
                for (int i8 = 0; i8 < i5; i8++) {
                    bArr[i8] = (byte) ((~bArr[i8]) & 255);
                }
            }
            outputStream.write(bArr);
            return new C31472OooOO0(c31448OooOOo);
        }
        if (iO000O00O4 > 0) {
            j = 1;
            i2 = 3;
            inputStream2 = inputStream;
            c31469OooO0o0 = new C31469OooO0o0(inputStream2, iO000O00O, i2, j, zOooo00o);
            i3 = 0;
            do {
                i4 = c31469OooO0o0.read(bArr, i3, i5 - i3);
                if (i4 <= -1) {
                }
            } while (i3 < i5);
            if (!c31436OooO0OoOooO0Oo.Oooo00o(C31441OooOO0.f112262OoooOOo)) {
            }
            outputStream.write(bArr);
            return new C31472OooOO0(c31448OooOOo);
        }
        inputStream2 = inputStream;
        j = 0;
        i2 = i6;
        c31469OooO0o0 = new C31469OooO0o0(inputStream2, iO000O00O, i2, j, zOooo00o);
        i3 = 0;
        do {
            i4 = c31469OooO0o0.read(bArr, i3, i5 - i3);
            if (i4 <= -1) {
            }
        } while (i3 < i5);
        if (!c31436OooO0OoOooO0Oo.Oooo00o(C31441OooOO0.f112262OoooOOo)) {
        }
        outputStream.write(bArr);
        return new C31472OooOO0(c31448OooOOo);
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final void OooO0OO(C31460OooO0o0 c31460OooO0o0, OutputStream outputStream, C31453OooOo0O c31453OooOo0O) throws IOException {
        C31455OooO00o.OooO0OO(c31460OooO0o0, new C31468OooO0o(outputStream, c31453OooOo0O.o000O00O(C31441OooOO0.f112434o00o0O, null, -1), c31453OooOo0O.o000O00O(C31441OooOO0.f112391o00O0Ooo, null, -1)));
    }
}
