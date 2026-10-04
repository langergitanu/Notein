package oO0oO0Oo;

import Oooo0oO.C21111o0ooOoO;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oO0Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34015OooO0OO extends AbstractC34036OooOoOO implements InterfaceC34042Oooo00O, InterfaceC34016OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122317OooOo = new OooO00o(AbstractC34015OooO0OO.class);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final char[] f122318OooOoO0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122319OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooO0OO$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0OO(AbstractC34039OooOooO abstractC34039OooOooO) {
            return abstractC34039OooOooO.OooOo0o();
        }

        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return AbstractC34015OooO0OO.OooOOo0(c34075o00o0O.f122362OooOo0o);
        }
    }

    public AbstractC34015OooO0OO(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i;
        this.f122319OooOo0o = bArr2;
    }

    public static AbstractC34015OooO0OO OooOOo0(byte[] bArr) {
        int length = bArr.length;
        if (length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i = bArr[0] & 255;
        if (i > 0) {
            if (i > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b = bArr[length - 1];
            if (b != ((byte) ((255 << i) & b))) {
                return new o000OOo(bArr, false);
            }
        }
        return new C34066Oooooo0(bArr, false);
    }

    public static AbstractC34015OooO0OO OooOOoo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        if (interfaceC34019OooO0oO == null || (interfaceC34019OooO0oO instanceof AbstractC34015OooO0OO)) {
            return (AbstractC34015OooO0OO) interfaceC34019OooO0oO;
        }
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = interfaceC34019OooO0oO.OooO0o();
        if (abstractC34036OooOoOOOooO0o instanceof AbstractC34015OooO0OO) {
            return (AbstractC34015OooO0OO) abstractC34036OooOoOOOooO0o;
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(interfaceC34019OooO0oO.getClass().getName()));
    }

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() {
        return this;
    }

    @Override // oO0oO0Oo.InterfaceC34016OooO0Oo
    public final InputStream OooO0OO() throws IOException {
        byte[] bArr = this.f122319OooOo0o;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // oO0oO0Oo.InterfaceC34016OooO0Oo
    public final int OooO0o0() {
        return this.f122319OooOo0o[0] & 255;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof AbstractC34015OooO0OO)) {
            return false;
        }
        byte[] bArr = ((AbstractC34015OooO0OO) abstractC34036OooOoOO).f122319OooOo0o;
        byte[] bArr2 = this.f122319OooOo0o;
        int length = bArr2.length;
        if (bArr.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr2[i2] != bArr[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr2[0] & 255);
        return ((byte) (bArr2[i] & i3)) == ((byte) (bArr[i] & i3));
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOO() {
        return new C34066Oooooo0(this.f122319OooOo0o, false);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOo() {
        return new o000OOo(this.f122319OooOo0o, false);
    }

    public final byte[] OooOOo() {
        byte[] bArr = this.f122319OooOo0o;
        if (bArr.length == 1) {
            return AbstractC34033OooOo0o.f122361OooOoO0;
        }
        int i = bArr[0] & 255;
        byte[] bArrOooO0Oo = C34332OooO00o.OooO0Oo(bArr, 1, bArr.length);
        int length = bArrOooO0Oo.length - 1;
        bArrOooO0Oo[length] = (byte) (((byte) (255 << i)) & bArrOooO0Oo[length]);
        return bArrOooO0Oo;
    }

    public final byte[] OooOo00() {
        byte[] bArr = this.f122319OooOo0o;
        if (bArr[0] == 0) {
            return C34332OooO00o.OooO0Oo(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    @Override // oO0oO0Oo.InterfaceC34042Oooo00O
    public final String getString() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != encoded.length; i++) {
                byte b = encoded[i];
                char[] cArr = f122318OooOoO0;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new C34034OooOoO(C21111o0ooOoO.OooO00o(e, new StringBuilder("Internal error encoding BitString: ")), e);
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        byte[] bArr = this.f122319OooOo0o;
        if (bArr.length < 2) {
            return 1;
        }
        int i = 0;
        int i2 = bArr[0] & 255;
        int length = bArr.length;
        int i3 = length - 1;
        byte b = (byte) ((255 << i2) & bArr[i3]);
        if (bArr != null) {
            i = length;
            while (true) {
                i3--;
                if (i3 < 0) {
                    break;
                }
                i = (i * 257) ^ bArr[i3];
            }
        }
        return (i * 257) ^ b;
    }

    public final String toString() {
        return getString();
    }

    public AbstractC34015OooO0OO(byte[] bArr, boolean z) {
        if (z) {
            if (bArr == null) {
                throw new NullPointerException("'contents' cannot be null");
            }
            if (bArr.length < 1) {
                throw new IllegalArgumentException("'contents' cannot be empty");
            }
            int i = bArr[0] & 255;
            if (i > 0) {
                if (bArr.length < 2) {
                    throw new IllegalArgumentException("zero length data with non-zero pad bits");
                }
                if (i > 7) {
                    throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.f122319OooOo0o = bArr;
    }
}
