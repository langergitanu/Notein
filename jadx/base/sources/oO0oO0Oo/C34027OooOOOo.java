package oO0oO0Oo;

import Oooo0.C20855OooooOO;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: oO0oO0Oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34027OooOOOo extends FilterInputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f122343OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f122344OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final byte[][] f122345OooOoO0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34027OooOOOo(ByteArrayInputStream byteArrayInputStream) {
        this(byteArrayInputStream, byteArrayInputStream.available(), true);
        int i = o0000O0.f122434OooO00o;
    }

    public static AbstractC34036OooOoOO OooO0OO(int i, C34072o00000oO c34072o00000oO, byte[][] bArr) throws IOException {
        switch (i) {
            case 1:
                return C34018OooO0o0.OooOOo0(OooOOO0(c34072o00000oO, bArr));
            case 2:
                return new C34029OooOOo0(c34072o00000oO.OooO0OO());
            case 3:
                return AbstractC34015OooO0OO.OooOOo0(c34072o00000oO.OooO0OO());
            case 4:
                return new C34075o00o0O(c34072o00000oO.OooO0OO());
            case 5:
                if (c34072o00000oO.OooO0OO().length == 0) {
                    return o00Oo0.f122442OooOo;
                }
                throw new IllegalStateException("malformed NULL encoding encountered");
            case 6:
                return C34032OooOo0O.OooOOo(OooOOO0(c34072o00000oO, bArr), true);
            case 7:
                return new C34031OooOo0(new C34080ooOO(c34072o00000oO.OooO0OO()));
            case 8:
            case 9:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                throw new IOException(Oooo0oO.o0Oo0oo.OooO0O0(i, "unknown tag ", " encountered"));
            case 10:
                return C34012OooO.OooOOo0(OooOOO0(c34072o00000oO, bArr), true);
            case 12:
                return new o0OOO0o(c34072o00000oO.OooO0OO());
            case 13:
                return new C34037OooOoo(c34072o00000oO.OooO0OO());
            case 18:
                return new o00Ooo(c34072o00000oO.OooO0OO());
            case 19:
                return new C34076o00oO0o(c34072o00000oO.OooO0OO());
            case 20:
                return new o0ooOOo(c34072o00000oO.OooO0OO());
            case 21:
                return new o0OO00O(c34072o00000oO.OooO0OO());
            case 22:
                return new o00O0O(c34072o00000oO.OooO0OO());
            case 23:
                return new C34044Oooo0O0(c34072o00000oO.OooO0OO());
            case 24:
                return new C34025OooOOO0(c34072o00000oO.OooO0OO());
            case 25:
                return new C34080ooOO(c34072o00000oO.OooO0OO());
            case 26:
                return new oo0o0Oo(c34072o00000oO.OooO0OO());
            case 27:
                return new C34068Ooooooo(c34072o00000oO.OooO0OO());
            case 28:
                return new o0Oo0oo(c34072o00000oO.OooO0OO());
            case 30:
                int i2 = c34072o00000oO.f122432OooOoO;
                if ((i2 & 1) != 0) {
                    throw new IOException("malformed BMPString encoding encountered");
                }
                int i3 = i2 / 2;
                char[] cArr = new char[i3];
                byte[] bArr2 = new byte[8];
                int i4 = 0;
                int i5 = 0;
                while (i2 >= 8) {
                    if (oOO00.OooO00o.OooO0O0(c34072o00000oO, bArr2, 0, 8) != 8) {
                        throw new EOFException("EOF encountered in middle of BMPString");
                    }
                    cArr[i5] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
                    cArr[i5 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
                    cArr[i5 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
                    cArr[i5 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
                    i5 += 4;
                    i2 -= 8;
                }
                if (i2 > 0) {
                    if (oOO00.OooO00o.OooO0O0(c34072o00000oO, bArr2, 0, i2) != i2) {
                        throw new EOFException("EOF encountered in middle of BMPString");
                    }
                    do {
                        int i6 = i4 + 1;
                        int i7 = bArr2[i4] << 8;
                        i4 += 2;
                        cArr[i5] = (char) ((bArr2[i6] & 255) | i7);
                        i5++;
                    } while (i4 < i2);
                }
                if (c34072o00000oO.f122432OooOoO == 0 && i3 == i5) {
                    return new C34064OooooOo(cArr);
                }
                throw new IllegalStateException();
        }
    }

    public static byte[] OooOOO0(C34072o00000oO c34072o00000oO, byte[][] bArr) throws IOException {
        int i = c34072o00000oO.f122432OooOoO;
        if (i >= bArr.length) {
            return c34072o00000oO.OooO0OO();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i != bArr2.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i == 0) {
            return bArr2;
        }
        int i2 = c34072o00000oO.f122438OooOo;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + c34072o00000oO.f122432OooOoO + " >= " + i2);
        }
        int iOooO0O0 = i - oOO00.OooO00o.OooO0O0(c34072o00000oO.f122439OooOo0o, bArr2, 0, bArr2.length);
        c34072o00000oO.f122432OooOoO = iOooO0O0;
        if (iOooO0O0 == 0) {
            c34072o00000oO.OooO00o();
            return bArr2;
        }
        throw new EOFException("DEF length " + c34072o00000oO.f122433OooOoO0 + " object truncated by " + c34072o00000oO.f122432OooOoO);
    }

    public static int OooOOo0(InputStream inputStream, int i, boolean z) throws IOException {
        int i2 = inputStream.read();
        if ((i2 >>> 7) == 0) {
            return i2;
        }
        if (128 == i2) {
            return -1;
        }
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == i2) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i3 = i2 & 127;
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i4 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i4 = (i4 << 8) + i6;
            i5++;
        } while (i5 < i3);
        if (i4 < i || z) {
            return i4;
        }
        throw new IOException(C20855OooooOO.OooO0OO(i4, i, "corrupted stream - out of bounds length found: ", " >= "));
    }

    public static int OooOooo(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if (i3 < 31) {
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        if ((i3 & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i4 = 0;
        while ((i3 & 128) != 0) {
            if ((i4 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            i4 = ((i3 & 127) | i4) << 7;
            i3 = inputStream.read();
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
        }
        return (i3 & 127) | i4;
    }

    public final AbstractC34036OooOoOO OooO00o(int i, int i2, int i3) throws IOException {
        C34072o00000oO c34072o00000oO = new C34072o00000oO(this, i3, this.f122344OooOo0o);
        if ((i & 224) == 0) {
            return OooO0OO(i2, c34072o00000oO, this.f122345OooOoO0);
        }
        int i4 = i & 192;
        if (i4 != 0) {
            if ((i & 32) != 0) {
                return Oooo0.OooOOo0(i4, i2, Oooo000(c34072o00000oO));
            }
            C34071o00000o0 c34071o00000o0 = new C34071o00000o0(4, i4, i2, new C34075o00o0O(c34072o00000oO.OooO0OO()));
            return i4 != 64 ? c34071o00000o0 : new o0O0O00(c34071o00000o0);
        }
        int i5 = 0;
        if (i2 == 3) {
            C34020OooO0oo c34020OooO0ooOooo000 = Oooo000(c34072o00000oO);
            int i6 = c34020OooO0ooOooo000.f122326OooO0O0;
            AbstractC34015OooO0OO[] abstractC34015OooO0OOArr = new AbstractC34015OooO0OO[i6];
            while (i5 != i6) {
                InterfaceC34019OooO0oO interfaceC34019OooO0oOOooO0O0 = c34020OooO0ooOooo000.OooO0O0(i5);
                if (!(interfaceC34019OooO0oOOooO0O0 instanceof AbstractC34015OooO0OO)) {
                    throw new C34021OooOO0("unknown object encountered in constructed BIT STRING: " + interfaceC34019OooO0oOOooO0O0.getClass());
                }
                abstractC34015OooO0OOArr[i5] = (AbstractC34015OooO0OO) interfaceC34019OooO0oOOooO0O0;
                i5++;
            }
            return new C34051OoooO0(abstractC34015OooO0OOArr);
        }
        if (i2 == 4) {
            C34020OooO0oo c34020OooO0ooOooo0002 = Oooo000(c34072o00000oO);
            int i7 = c34020OooO0ooOooo0002.f122326OooO0O0;
            AbstractC34033OooOo0o[] abstractC34033OooOo0oArr = new AbstractC34033OooOo0o[i7];
            while (i5 != i7) {
                InterfaceC34019OooO0oO interfaceC34019OooO0oOOooO0O02 = c34020OooO0ooOooo0002.OooO0O0(i5);
                if (!(interfaceC34019OooO0oOOooO0O02 instanceof AbstractC34033OooOo0o)) {
                    throw new C34021OooOO0("unknown object encountered in constructed OCTET STRING: " + interfaceC34019OooO0oOOooO0O02.getClass());
                }
                abstractC34033OooOo0oArr[i5] = (AbstractC34033OooOo0o) interfaceC34019OooO0oOOooO0O02;
                i5++;
            }
            return new C34054OoooOO0(C34054OoooOO0.OooOOoo(abstractC34033OooOo0oArr), abstractC34033OooOo0oArr);
        }
        if (i2 == 8) {
            o00000O0 o00000o0OooO00o = C34069o000000o.OooO00o(Oooo000(c34072o00000oO));
            o00000o0OooO00o.getClass();
            return new o000000O(o00000o0OooO00o);
        }
        if (i2 == 16) {
            if (c34072o00000oO.f122432OooOoO < 1) {
                return C34069o000000o.f122425OooO00o;
            }
            if (!this.f122343OooOo) {
                return C34069o000000o.OooO00o(Oooo000(c34072o00000oO));
            }
            byte[] bArrOooO0OO = c34072o00000oO.OooO0OO();
            C34074o0000oo c34074o0000oo = new C34074o0000oo();
            c34074o0000oo.f122440OooOoO0 = bArrOooO0OO;
            return c34074o0000oo;
        }
        if (i2 != 17) {
            throw new IOException(Oooo0oO.o0Oo0oo.OooO0O0(i2, "unknown tag ", " encountered"));
        }
        C34020OooO0oo c34020OooO0ooOooo0003 = Oooo000(c34072o00000oO);
        o00000O0 o00000o02 = C34069o000000o.f122425OooO00o;
        if (c34020OooO0ooOooo0003.f122326OooO0O0 < 1) {
            return C34069o000000o.f122426OooO0O0;
        }
        o00000OO o00000oo2 = new o00000OO(c34020OooO0ooOooo0003);
        o00000oo2.f122429OooOoO = -1;
        return o00000oo2;
    }

    public final AbstractC34036OooOoOO OooOOoo() throws IOException {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iOooOooo = OooOooo(this, i);
        int i2 = this.f122344OooOo0o;
        int iOooOOo0 = OooOOo0(this, i2, false);
        if (iOooOOo0 >= 0) {
            try {
                return OooO00o(i, iOooOooo, iOooOOo0);
            } catch (IllegalArgumentException e) {
                throw new C34021OooOO0("corrupted stream detected", e);
            }
        }
        if ((i & 32) == 0) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        Oooo000 oooo000 = new Oooo000(new o0000(this, i2), i2, this.f122345OooOoO0);
        int i3 = i & 192;
        if (i3 != 0) {
            return oooo000.OooO0O0(i3, iOooOooo);
        }
        if (iOooOooo == 3) {
            return C34053OoooO0O.OooO00o(oooo000);
        }
        if (iOooOooo == 4) {
            return o000oOoO.OooO00o(oooo000);
        }
        if (iOooOooo == 8) {
            return C34067OoooooO.OooO00o(oooo000);
        }
        if (iOooOooo == 16) {
            return new C34055OoooOOO(oooo000.OooO0OO());
        }
        if (iOooOooo == 17) {
            return new C34057OoooOo0(oooo000.OooO0OO());
        }
        throw new IOException("unknown BER object encountered");
    }

    public final C34020OooO0oo Oooo000(C34072o00000oO c34072o00000oO) throws IOException {
        C34027OooOOOo c34027OooOOOo;
        AbstractC34036OooOoOO abstractC34036OooOoOOOooOOoo;
        int i = c34072o00000oO.f122432OooOoO;
        if (i >= 1 && (abstractC34036OooOoOOOooOOoo = (c34027OooOOOo = new C34027OooOOOo(c34072o00000oO, i, this.f122343OooOo, this.f122345OooOoO0)).OooOOoo()) != null) {
            C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
            do {
                c34020OooO0oo.OooO00o(abstractC34036OooOoOOOooOOoo);
                abstractC34036OooOoOOOooOOoo = c34027OooOOOo.OooOOoo();
            } while (abstractC34036OooOoOOOooOOoo != null);
            return c34020OooO0oo;
        }
        return new C34020OooO0oo(0);
    }

    public C34027OooOOOo(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
        this(byteArrayInputStream, i, z, new byte[11][]);
    }

    public C34027OooOOOo(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.f122344OooOo0o = i;
        this.f122343OooOo = z;
        this.f122345OooOoO0 = bArr;
    }

    public C34027OooOOOo(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    public C34027OooOOOo(byte[] bArr, int i) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }
}
