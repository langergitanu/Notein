package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.oo000o;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o0000o0O.o0Oo0oo;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21794OooOO0o extends AbstractC21792OooO0oO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Logger f64440OooO0O0 = Logger.getLogger(AbstractC21794OooOO0o.class.getName());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f64441OooO0OO = C21843o00ooo.f64587OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooOOO0 f64442OooO00o;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOO0o$OooO00o */
    public static abstract class OooO00o extends AbstractC21794OooOO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte[] f64443OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f64444OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f64445OooO0o0;

        public OooO00o(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f64443OooO0Oo = bArr;
            this.f64445OooO0o0 = bArr.length;
        }

        public final void Oooo0(long j) {
            int i = this.f64444OooO0o;
            int i2 = i + 1;
            this.f64444OooO0o = i2;
            byte[] bArr = this.f64443OooO0Oo;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.f64444OooO0o = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.f64444OooO0o = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.f64444OooO0o = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.f64444OooO0o = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f64444OooO0o = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f64444OooO0o = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f64444OooO0o = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        public final void Oooo00o(int i) {
            int i2 = this.f64444OooO0o;
            int i3 = i2 + 1;
            this.f64444OooO0o = i3;
            byte[] bArr = this.f64443OooO0Oo;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f64444OooO0o = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f64444OooO0o = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f64444OooO0o = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        public final void Oooo0O0(int i, int i2) {
            Oooo0OO((i << 3) | i2);
        }

        public final void Oooo0OO(int i) {
            boolean z = AbstractC21794OooOO0o.f64441OooO0OO;
            byte[] bArr = this.f64443OooO0Oo;
            if (z) {
                while ((i & (-128)) != 0) {
                    int i2 = this.f64444OooO0o;
                    this.f64444OooO0o = i2 + 1;
                    C21843o00ooo.OooOO0(bArr, i2, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
                int i3 = this.f64444OooO0o;
                this.f64444OooO0o = i3 + 1;
                C21843o00ooo.OooOO0(bArr, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                int i4 = this.f64444OooO0o;
                this.f64444OooO0o = i4 + 1;
                bArr[i4] = (byte) ((i | 128) & 255);
                i >>>= 7;
            }
            int i5 = this.f64444OooO0o;
            this.f64444OooO0o = i5 + 1;
            bArr[i5] = (byte) i;
        }

        public final void Oooo0o0(long j) {
            boolean z = AbstractC21794OooOO0o.f64441OooO0OO;
            byte[] bArr = this.f64443OooO0Oo;
            if (z) {
                while ((j & (-128)) != 0) {
                    int i = this.f64444OooO0o;
                    this.f64444OooO0o = i + 1;
                    C21843o00ooo.OooOO0(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                int i2 = this.f64444OooO0o;
                this.f64444OooO0o = i2 + 1;
                C21843o00ooo.OooOO0(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                int i3 = this.f64444OooO0o;
                this.f64444OooO0o = i3 + 1;
                bArr[i3] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            }
            int i4 = this.f64444OooO0o;
            this.f64444OooO0o = i4 + 1;
            bArr[i4] = (byte) j;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOO0o$OooO0O0 */
    public static class OooO0O0 extends AbstractC21794OooOO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte[] f64446OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f64447OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f64448OooO0o0;

        public OooO0O0(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.f64446OooO0Oo = bArr;
            this.f64447OooO0o = 0;
            this.f64448OooO0o0 = i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21792OooO0oO
        public final void OooO00o(byte[] bArr, int i, int i2) throws IOException {
            Oooo00o(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOO0o(byte b) throws IOException {
            try {
                byte[] bArr = this.f64446OooO0Oo;
                int i = this.f64447OooO0o;
                this.f64447OooO0o = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OooO0OO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f64447OooO0o), Integer.valueOf(this.f64448OooO0o0), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOO(int i, byte[] bArr) throws IOException {
            OooOooo(i);
            Oooo00o(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOO0(int i, boolean z) throws IOException {
            OooOoo(i, 0);
            OooOO0o(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOOO(int i, OooO oooO) throws IOException {
            OooOoo(i, 2);
            OooOOOo(oooO);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOOo(OooO oooO) throws IOException {
            OooOooo(oooO.size());
            oooO.OooO(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOo(int i) throws IOException {
            try {
                byte[] bArr = this.f64446OooO0Oo;
                int i2 = this.f64447OooO0o;
                int i3 = i2 + 1;
                this.f64447OooO0o = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.f64447OooO0o = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.f64447OooO0o = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f64447OooO0o = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OooO0OO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f64447OooO0o), Integer.valueOf(this.f64448OooO0o0), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOo0(int i, int i2) throws IOException {
            OooOoo(i, 5);
            OooOOo(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOoo(int i, long j) throws IOException {
            OooOoo(i, 1);
            OooOo00(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOo(InterfaceC21822OoooO0 interfaceC21822OoooO0) throws IOException {
            OooOooo(interfaceC21822OoooO0.getSerializedSize());
            interfaceC21822OoooO0.OooO0O0(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOo0(int i, int i2) throws IOException {
            OooOoo(i, 0);
            OooOo0O(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOo00(long j) throws IOException {
            try {
                byte[] bArr = this.f64446OooO0Oo;
                int i = this.f64447OooO0o;
                int i2 = i + 1;
                this.f64447OooO0o = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.f64447OooO0o = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.f64447OooO0o = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.f64447OooO0o = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.f64447OooO0o = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.f64447OooO0o = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.f64447OooO0o = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f64447OooO0o = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OooO0OO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f64447OooO0o), Integer.valueOf(this.f64448OooO0o0), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOo0O(int i) throws IOException {
            if (i >= 0) {
                OooOooo(i);
            } else {
                Oooo00O(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOo0o(int i, InterfaceC21822OoooO0 interfaceC21822OoooO0, InterfaceC21836Oooooo interfaceC21836Oooooo) throws IOException {
            OooOoo(i, 2);
            OooOooo(((androidx.datastore.preferences.protobuf.OooO00o) interfaceC21822OoooO0).OooO0Oo(interfaceC21836Oooooo));
            interfaceC21836Oooooo.OooO0OO(interfaceC21822OoooO0, this.f64442OooO00o);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOoO(int i, OooO oooO) throws IOException {
            OooOoo(1, 3);
            OooOooO(2, i);
            OooOOOO(3, oooO);
            OooOoo(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOoO0(int i, InterfaceC21822OoooO0 interfaceC21822OoooO0) throws IOException {
            OooOoo(1, 3);
            OooOooO(2, i);
            OooOoo(3, 2);
            OooOo(interfaceC21822OoooO0);
            OooOoo(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOoOO(int i, String str) throws IOException {
            OooOoo(i, 2);
            OooOoo0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOoo(int i, int i2) throws IOException {
            OooOooo((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOoo0(String str) throws IOException {
            int i = this.f64447OooO0o;
            try {
                int iOooO = AbstractC21794OooOO0o.OooO(str.length() * 3);
                int iOooO2 = AbstractC21794OooOO0o.OooO(str.length());
                int i2 = this.f64448OooO0o0;
                byte[] bArr = this.f64446OooO0Oo;
                if (iOooO2 != iOooO) {
                    OooOooo(oo000o.OooO00o(str));
                    int i3 = this.f64447OooO0o;
                    this.f64447OooO0o = oo000o.f64604OooO00o.OooO0O0(str, bArr, i3, i2 - i3);
                    return;
                }
                int i4 = i + iOooO2;
                this.f64447OooO0o = i4;
                int iOooO0O0 = oo000o.f64604OooO00o.OooO0O0(str, bArr, i4, i2 - i4);
                this.f64447OooO0o = i;
                OooOooo((iOooO0O0 - i) - iOooO2);
                this.f64447OooO0o = iOooO0O0;
            } catch (oo000o.C21847OooO0Oo e) {
                this.f64447OooO0o = i;
                OooOO0O(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OooO0OO(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOooO(int i, int i2) throws IOException {
            OooOoo(i, 0);
            OooOooo(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOooo(int i) throws IOException {
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.f64446OooO0Oo;
                if (i2 == 0) {
                    int i3 = this.f64447OooO0o;
                    this.f64447OooO0o = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    try {
                        int i4 = this.f64447OooO0o;
                        this.f64447OooO0o = i4 + 1;
                        bArr[i4] = (byte) ((i | 128) & 255);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OooO0OO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f64447OooO0o), Integer.valueOf(this.f64448OooO0o0), 1), e);
                    }
                }
                throw new OooO0OO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f64447OooO0o), Integer.valueOf(this.f64448OooO0o0), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void Oooo000(int i, long j) throws IOException {
            OooOoo(i, 0);
            Oooo00O(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void Oooo00O(long j) throws IOException {
            boolean z = AbstractC21794OooOO0o.f64441OooO0OO;
            int i = this.f64448OooO0o0;
            byte[] bArr = this.f64446OooO0Oo;
            if (z && i - this.f64447OooO0o >= 10) {
                while ((j & (-128)) != 0) {
                    int i2 = this.f64447OooO0o;
                    this.f64447OooO0o = i2 + 1;
                    C21843o00ooo.OooOO0(bArr, i2, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                int i3 = this.f64447OooO0o;
                this.f64447OooO0o = i3 + 1;
                C21843o00ooo.OooOO0(bArr, i3, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i4 = this.f64447OooO0o;
                    this.f64447OooO0o = i4 + 1;
                    bArr[i4] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OooO0OO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f64447OooO0o), Integer.valueOf(i), 1), e);
                }
            }
            int i5 = this.f64447OooO0o;
            this.f64447OooO0o = i5 + 1;
            bArr[i5] = (byte) j;
        }

        public final void Oooo00o(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f64446OooO0Oo, this.f64447OooO0o, i2);
                this.f64447OooO0o += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OooO0OO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f64447OooO0o), Integer.valueOf(this.f64448OooO0o0), Integer.valueOf(i2)), e);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOO0o$OooO0OO */
    public static class OooO0OO extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OooO0OO(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public OooO0OO(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOO0o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C21795OooO0Oo extends OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final o0Oo0oo f64449OooO0oO;

        public C21795OooO0Oo(o0Oo0oo o0oo0oo2, int i) {
            super(i);
            this.f64449OooO0oO = o0oo0oo2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21792OooO0oO
        public final void OooO00o(byte[] bArr, int i, int i2) throws IOException {
            Oooo0oo(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOO0o(byte b) throws IOException {
            if (this.f64444OooO0o == this.f64445OooO0o0) {
                Oooo0o();
            }
            int i = this.f64444OooO0o;
            this.f64444OooO0o = i + 1;
            this.f64443OooO0Oo[i] = b;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOO(int i, byte[] bArr) throws IOException {
            OooOooo(i);
            Oooo0oo(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOO0(int i, boolean z) throws IOException {
            Oooo0oO(11);
            Oooo0O0(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            int i2 = this.f64444OooO0o;
            this.f64444OooO0o = i2 + 1;
            this.f64443OooO0Oo[i2] = b;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOOO(int i, OooO oooO) throws IOException {
            OooOoo(i, 2);
            OooOOOo(oooO);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOOo(OooO oooO) throws IOException {
            OooOooo(oooO.size());
            oooO.OooO(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOo(int i) throws IOException {
            Oooo0oO(4);
            Oooo00o(i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOo0(int i, int i2) throws IOException {
            Oooo0oO(14);
            Oooo0O0(i, 5);
            Oooo00o(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOOoo(int i, long j) throws IOException {
            Oooo0oO(18);
            Oooo0O0(i, 1);
            Oooo0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOo(InterfaceC21822OoooO0 interfaceC21822OoooO0) throws IOException {
            OooOooo(interfaceC21822OoooO0.getSerializedSize());
            interfaceC21822OoooO0.OooO0O0(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOo0(int i, int i2) throws IOException {
            Oooo0oO(20);
            Oooo0O0(i, 0);
            if (i2 >= 0) {
                Oooo0OO(i2);
            } else {
                Oooo0o0(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOo00(long j) throws IOException {
            Oooo0oO(8);
            Oooo0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOo0O(int i) throws IOException {
            if (i >= 0) {
                OooOooo(i);
            } else {
                Oooo00O(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOo0o(int i, InterfaceC21822OoooO0 interfaceC21822OoooO0, InterfaceC21836Oooooo interfaceC21836Oooooo) throws IOException {
            OooOoo(i, 2);
            OooOooo(((androidx.datastore.preferences.protobuf.OooO00o) interfaceC21822OoooO0).OooO0Oo(interfaceC21836Oooooo));
            interfaceC21836Oooooo.OooO0OO(interfaceC21822OoooO0, this.f64442OooO00o);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOoO(int i, OooO oooO) throws IOException {
            OooOoo(1, 3);
            OooOooO(2, i);
            OooOOOO(3, oooO);
            OooOoo(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOoO0(int i, InterfaceC21822OoooO0 interfaceC21822OoooO0) throws IOException {
            OooOoo(1, 3);
            OooOooO(2, i);
            OooOoo(3, 2);
            OooOo(interfaceC21822OoooO0);
            OooOoo(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOoOO(int i, String str) throws IOException {
            OooOoo(i, 2);
            OooOoo0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOoo(int i, int i2) throws IOException {
            OooOooo((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOoo0(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int iOooO = AbstractC21794OooOO0o.OooO(length);
                int i = iOooO + length;
                int i2 = this.f64445OooO0o0;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iOooO0O0 = oo000o.f64604OooO00o.OooO0O0(str, bArr, 0, length);
                    OooOooo(iOooO0O0);
                    Oooo0oo(bArr, 0, iOooO0O0);
                    return;
                }
                if (i > i2 - this.f64444OooO0o) {
                    Oooo0o();
                }
                int iOooO2 = AbstractC21794OooOO0o.OooO(str.length());
                int i3 = this.f64444OooO0o;
                byte[] bArr2 = this.f64443OooO0Oo;
                try {
                    if (iOooO2 == iOooO) {
                        int i4 = i3 + iOooO2;
                        this.f64444OooO0o = i4;
                        int iOooO0O02 = oo000o.f64604OooO00o.OooO0O0(str, bArr2, i4, i2 - i4);
                        this.f64444OooO0o = i3;
                        Oooo0OO((iOooO0O02 - i3) - iOooO2);
                        this.f64444OooO0o = iOooO0O02;
                    } else {
                        int iOooO00o = oo000o.OooO00o(str);
                        Oooo0OO(iOooO00o);
                        this.f64444OooO0o = oo000o.f64604OooO00o.OooO0O0(str, bArr2, this.f64444OooO0o, iOooO00o);
                    }
                } catch (oo000o.C21847OooO0Oo e) {
                    this.f64444OooO0o = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OooO0OO(e2);
                }
            } catch (oo000o.C21847OooO0Oo e3) {
                OooOO0O(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOooO(int i, int i2) throws IOException {
            Oooo0oO(20);
            Oooo0O0(i, 0);
            Oooo0OO(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void OooOooo(int i) throws IOException {
            Oooo0oO(5);
            Oooo0OO(i);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void Oooo000(int i, long j) throws IOException {
            Oooo0oO(20);
            Oooo0O0(i, 0);
            Oooo0o0(j);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC21794OooOO0o
        public final void Oooo00O(long j) throws IOException {
            Oooo0oO(10);
            Oooo0o0(j);
        }

        public final void Oooo0o() throws IOException {
            this.f64449OooO0oO.write(this.f64443OooO0Oo, 0, this.f64444OooO0o);
            this.f64444OooO0o = 0;
        }

        public final void Oooo0oO(int i) throws IOException {
            if (this.f64445OooO0o0 - this.f64444OooO0o < i) {
                Oooo0o();
            }
        }

        public final void Oooo0oo(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f64444OooO0o;
            int i4 = this.f64445OooO0o0;
            int i5 = i4 - i3;
            byte[] bArr2 = this.f64443OooO0Oo;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f64444OooO0o += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f64444OooO0o = i4;
            Oooo0o();
            if (i7 > i4) {
                this.f64449OooO0oO.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.f64444OooO0o = i7;
            }
        }
    }

    public static int OooO(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int OooO0O0(int i, OooO oooO) {
        return OooO0OO(oooO) + OooO0oo(i);
    }

    public static int OooO0OO(OooO oooO) {
        int size = oooO.size();
        return OooO(size) + size;
    }

    public static int OooO0Oo(C21810OooOooO c21810OooOooO) {
        int size = c21810OooOooO.f64502OooO0O0 != null ? c21810OooOooO.f64502OooO0O0.size() : c21810OooOooO.f64501OooO00o != null ? c21810OooOooO.f64501OooO00o.getSerializedSize() : 0;
        return OooO(size) + size;
    }

    public static int OooO0o(long j) {
        return OooOO0((j >> 63) ^ (j << 1));
    }

    public static int OooO0o0(int i) {
        return OooO((i >> 31) ^ (i << 1));
    }

    public static int OooO0oO(String str) {
        int length;
        try {
            length = oo000o.OooO00o(str);
        } catch (oo000o.C21847OooO0Oo unused) {
            length = str.getBytes(C21805OooOoO.f64482OooO00o).length;
        }
        return OooO(length) + length;
    }

    public static int OooO0oo(int i) {
        return OooO(i << 3);
    }

    public static int OooOO0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void OooOO0O(String str, oo000o.C21847OooO0Oo c21847OooO0Oo) throws IOException {
        f64440OooO0O0.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c21847OooO0Oo);
        byte[] bytes = str.getBytes(C21805OooOoO.f64482OooO00o);
        try {
            OooOooo(bytes.length);
            OooO00o(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OooO0OO(e);
        }
    }

    public abstract void OooOO0o(byte b) throws IOException;

    public abstract void OooOOO(int i, byte[] bArr) throws IOException;

    public abstract void OooOOO0(int i, boolean z) throws IOException;

    public abstract void OooOOOO(int i, OooO oooO) throws IOException;

    public abstract void OooOOOo(OooO oooO) throws IOException;

    public abstract void OooOOo(int i) throws IOException;

    public abstract void OooOOo0(int i, int i2) throws IOException;

    public abstract void OooOOoo(int i, long j) throws IOException;

    public abstract void OooOo(InterfaceC21822OoooO0 interfaceC21822OoooO0) throws IOException;

    public abstract void OooOo0(int i, int i2) throws IOException;

    public abstract void OooOo00(long j) throws IOException;

    public abstract void OooOo0O(int i) throws IOException;

    public abstract void OooOo0o(int i, InterfaceC21822OoooO0 interfaceC21822OoooO0, InterfaceC21836Oooooo interfaceC21836Oooooo) throws IOException;

    public abstract void OooOoO(int i, OooO oooO) throws IOException;

    public abstract void OooOoO0(int i, InterfaceC21822OoooO0 interfaceC21822OoooO0) throws IOException;

    public abstract void OooOoOO(int i, String str) throws IOException;

    public abstract void OooOoo(int i, int i2) throws IOException;

    public abstract void OooOoo0(String str) throws IOException;

    public abstract void OooOooO(int i, int i2) throws IOException;

    public abstract void OooOooo(int i) throws IOException;

    public abstract void Oooo000(int i, long j) throws IOException;

    public abstract void Oooo00O(long j) throws IOException;
}
