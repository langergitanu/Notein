package oO0OOOO0;

import OooooO0.C21286OooO0O0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import oO0OOOO0.OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public class OooOOOO extends OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final byte[] f119101OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f119102OooOoO0 = 0;

    public class OooO00o implements OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f119103OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f119104OooOo0o = 0;

        public OooO00o() {
            this.f119103OooOo = OooOOOO.this.f119101OooOo.length;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f119104OooOo0o < this.f119103OooOo;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final byte nextByte() {
            try {
                byte[] bArr = OooOOOO.this.f119101OooOo;
                int i = this.f119104OooOo0o;
                this.f119104OooOo0o = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public OooOOOO(byte[] bArr) {
        this.f119101OooOo = bArr;
    }

    @Override // oO0OOOO0.OooO0OO
    /* JADX INFO: renamed from: OooO */
    public OooO0OO.OooO00o iterator() {
        return new OooO00o();
    }

    @Override // oO0OOOO0.OooO0OO
    public final int OooO0o() {
        return 0;
    }

    @Override // oO0OOOO0.OooO0OO
    public void OooO0o0(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f119101OooOo, i, bArr, i2, i3);
    }

    @Override // oO0OOOO0.OooO0OO
    public final boolean OooO0oO() {
        return true;
    }

    @Override // oO0OOOO0.OooO0OO
    public final boolean OooO0oo() {
        byte[] bArr = this.f119101OooOo;
        return C21286OooO0O0.OooO0Oo(bArr, 0, bArr.length) == 0;
    }

    @Override // oO0OOOO0.OooO0OO
    public final int OooOO0O(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f119101OooOo[i4];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // oO0OOOO0.OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooOO0o(int i, int i2, int i3) {
        byte b;
        int i4;
        int i5;
        int i6 = i3 + i2;
        byte[] bArr = this.f119101OooOo;
        if (i != 0) {
            if (i2 >= i6) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i7 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i7 >= i6) {
                        return C21286OooO0O0.OooO0O0(b2, b4);
                    }
                    i2 = i7;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i5 = i2 + 1;
                }
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = bArr[i2];
                    if (i4 >= i6) {
                        return C21286OooO0O0.OooO0O0(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i8 = i4 + 1;
                    byte b6 = bArr[i4];
                    if (i8 >= i6) {
                        if (b2 > -12 || b5 > -65 || b6 > -65) {
                            return -1;
                        }
                        return (b6 << 16) ^ ((b5 << 8) ^ b2);
                    }
                    b = b6;
                    i4 = i8;
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && b <= -65) {
                        i2 = i4 + 1;
                    }
                }
            }
            return -1;
        }
        return C21286OooO0O0.OooO0Oo(bArr, i2, i6);
    }

    @Override // oO0OOOO0.OooO0OO
    public final int OooOOO() {
        return this.f119102OooOoO0;
    }

    @Override // oO0OOOO0.OooO0OO
    public final String OooOOOO() throws UnsupportedEncodingException {
        byte[] bArr = this.f119101OooOo;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    public final boolean OooOOo(OooOOOO oooOOOO, int i, int i2) {
        byte[] bArr = oooOOOO.f119101OooOo;
        int length = bArr.length;
        byte[] bArr2 = this.f119101OooOo;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        int length3 = bArr.length;
        byte[] bArr3 = oooOOOO.f119101OooOo;
        if (i3 <= length3) {
            int i4 = 0;
            while (i4 < i2) {
                if (bArr2[i4] != bArr3[i]) {
                    return false;
                }
                i4++;
                i++;
            }
            return true;
        }
        int length4 = bArr3.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(length4);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // oO0OOOO0.OooO0OO
    public final void OooOOo0(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f119101OooOo, i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0OO) || size() != ((OooO0OO) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof OooOOOO) {
            return OooOOo((OooOOOO) obj, 0, size());
        }
        if (obj instanceof C32961OooOOoo) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    public final int hashCode() {
        int iOooOO0O = this.f119102OooOoO0;
        if (iOooOO0O == 0) {
            int size = size();
            iOooOO0O = OooOO0O(size, 0, size);
            if (iOooOO0O == 0) {
                iOooOO0O = 1;
            }
            this.f119102OooOoO0 = iOooOO0O;
        }
        return iOooOO0O;
    }

    @Override // oO0OOOO0.OooO0OO, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new OooO00o();
    }

    @Override // oO0OOOO0.OooO0OO
    public int size() {
        return this.f119101OooOo.length;
    }
}
