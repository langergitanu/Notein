package androidx.datastore.preferences.protobuf;

import OooOo.C20485OooOoO;
import Oooo0.C20855OooooOO;
import Oooo0oO.o0Oo0oo;
import OooooOO.C21355Ooooooo;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO0o f64403OooOo = new OooO0o(C21805OooOoO.f64483OooO0O0);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final InterfaceC21787OooO0Oo f64404OooOoO0;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f64405OooOo0o = 0;

    public static abstract class OooO00o implements Iterator {
        @Override // java.util.Iterator
        public final Object next() {
            C21793OooO0oo c21793OooO0oo = (C21793OooO0oo) this;
            int i = c21793OooO0oo.f64415OooOo0o;
            if (i >= c21793OooO0oo.f64414OooOo) {
                throw new NoSuchElementException();
            }
            c21793OooO0oo.f64415OooOo0o = i + 1;
            return Byte.valueOf(c21793OooO0oo.f64416OooOoO0.OooO0o(i));
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class OooO0O0 implements InterfaceC21787OooO0Oo {
        @Override // androidx.datastore.preferences.protobuf.OooO.InterfaceC21787OooO0Oo
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public static final class OooO0OO extends OooO0o {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final int f64406OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final int f64407OooOoo0;

        public OooO0OO(byte[] bArr, int i, int i2) {
            super(bArr);
            OooO.OooO0OO(i, i + i2, bArr.length);
            this.f64406OooOoOO = i;
            this.f64407OooOoo0 = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.OooO.OooO0o, androidx.datastore.preferences.protobuf.OooO
        public final byte OooO0O0(int i) {
            int i2 = this.f64407OooOoo0;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.f64408OooOoO[this.f64406OooOoOO + i];
            }
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(C21532OooOOo.OooO0OO(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "Index > length: ", ", "));
        }

        @Override // androidx.datastore.preferences.protobuf.OooO.OooO0o, androidx.datastore.preferences.protobuf.OooO
        public final byte OooO0o(int i) {
            return this.f64408OooOoO[this.f64406OooOoOO + i];
        }

        @Override // androidx.datastore.preferences.protobuf.OooO.OooO0o, androidx.datastore.preferences.protobuf.OooO
        public final void OooO0o0(int i, byte[] bArr) {
            System.arraycopy(this.f64408OooOoO, this.f64406OooOoOO, bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.OooO.OooO0o
        public final int OooOO0() {
            return this.f64406OooOoOO;
        }

        @Override // androidx.datastore.preferences.protobuf.OooO.OooO0o, androidx.datastore.preferences.protobuf.OooO
        public final int size() {
            return this.f64407OooOoo0;
        }

        public Object writeReplace() {
            byte[] bArr;
            int size = size();
            if (size == 0) {
                bArr = C21805OooOoO.f64483OooO0O0;
            } else {
                byte[] bArr2 = new byte[size];
                OooO0o0(size, bArr2);
                bArr = bArr2;
            }
            return new OooO0o(bArr);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooO$OooO0Oo, reason: case insensitive filesystem */
    public interface InterfaceC21787OooO0Oo {
        byte[] copyFrom(byte[] bArr, int i, int i2);
    }

    public static class OooO0o extends AbstractC21788OooO0o0 {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final byte[] f64408OooOoO;

        public OooO0o(byte[] bArr) {
            bArr.getClass();
            this.f64408OooOoO = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.OooO
        public final void OooO(AbstractC21794OooOO0o abstractC21794OooOO0o) throws IOException {
            abstractC21794OooOO0o.OooO00o(this.f64408OooOoO, OooOO0(), size());
        }

        @Override // androidx.datastore.preferences.protobuf.OooO
        public byte OooO0O0(int i) {
            return this.f64408OooOoO[i];
        }

        @Override // androidx.datastore.preferences.protobuf.OooO
        public byte OooO0o(int i) {
            return this.f64408OooOoO[i];
        }

        @Override // androidx.datastore.preferences.protobuf.OooO
        public void OooO0o0(int i, byte[] bArr) {
            System.arraycopy(this.f64408OooOoO, 0, bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.OooO
        public final int OooO0oO(int i, int i2) {
            int iOooOO0 = OooOO0();
            Charset charset = C21805OooOoO.f64482OooO00o;
            for (int i3 = iOooOO0; i3 < iOooOO0 + i2; i3++) {
                i = (i * 31) + this.f64408OooOoO[i3];
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.OooO
        public final OooO0o OooO0oo(int i) {
            int iOooO0OO = OooO.OooO0OO(0, i, size());
            if (iOooO0OO == 0) {
                return OooO.f64403OooOo;
            }
            return new OooO0OO(this.f64408OooOoO, OooOO0(), iOooO0OO);
        }

        public int OooOO0() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.OooO
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO) || size() != ((OooO) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return obj.equals(this);
            }
            OooO0o oooO0o = (OooO0o) obj;
            int i = this.f64405OooOo0o;
            int i2 = oooO0o.f64405OooOo0o;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > oooO0o.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (size > oooO0o.size()) {
                StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(size, "Ran off end of other: 0, ", ", ");
                sbOooO0OO.append(oooO0o.size());
                throw new IllegalArgumentException(sbOooO0OO.toString());
            }
            int iOooOO0 = OooOO0() + size;
            int iOooOO02 = OooOO0();
            int iOooOO03 = oooO0o.OooOO0();
            while (iOooOO02 < iOooOO0) {
                if (this.f64408OooOoO[iOooOO02] != oooO0o.f64408OooOoO[iOooOO03]) {
                    return false;
                }
                iOooOO02++;
                iOooOO03++;
            }
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.OooO
        public int size() {
            return this.f64408OooOoO.length;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooO$OooO0o0, reason: case insensitive filesystem */
    public static abstract class AbstractC21788OooO0o0 extends OooO {
        private static final long serialVersionUID = 1;

        @Override // androidx.datastore.preferences.protobuf.OooO, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new C21793OooO0oo(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooO$OooO0oO, reason: case insensitive filesystem */
    public static final class C21789OooO0oO implements InterfaceC21787OooO0Oo {
        @Override // androidx.datastore.preferences.protobuf.OooO.InterfaceC21787OooO0Oo
        public final byte[] copyFrom(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        f64404OooOoO0 = C21790OooO0Oo.OooO00o() ? new C21789OooO0oO() : new OooO0O0();
    }

    public static int OooO0OO(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(o0Oo0oo.OooO0O0(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i2, i3, "End index: ", " >= "));
    }

    public static OooO0o OooO0Oo(int i, int i2, byte[] bArr) {
        OooO0OO(i, i + i2, bArr.length);
        return new OooO0o(f64404OooOoO0.copyFrom(bArr, i, i2));
    }

    public abstract void OooO(AbstractC21794OooOO0o abstractC21794OooOO0o) throws IOException;

    public abstract byte OooO0O0(int i);

    public abstract byte OooO0o(int i);

    public abstract void OooO0o0(int i, byte[] bArr);

    public abstract int OooO0oO(int i, int i2);

    public abstract OooO0o OooO0oo(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iOooO0oO = this.f64405OooOo0o;
        if (iOooO0oO == 0) {
            int size = size();
            iOooO0oO = OooO0oO(size, size);
            if (iOooO0oO == 0) {
                iOooO0oO = 1;
            }
            this.f64405OooOo0o = iOooO0oO;
        }
        return iOooO0oO;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new C21793OooO0oo(this);
    }

    public abstract int size();

    public final String toString() {
        String strOooO0O0;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strOooO0O0 = C21355Ooooooo.OooO0O0(this);
        } else {
            strOooO0O0 = C21355Ooooooo.OooO0O0(OooO0oo(47)) + "...";
        }
        return androidx.concurrent.futures.OooO00o.OooO0OO(C20485OooOoO.OooO0OO(size, "<ByteString@", hexString, " size=", " contents=\""), strOooO0O0, "\">");
    }
}
