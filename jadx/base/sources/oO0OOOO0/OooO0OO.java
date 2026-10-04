package oO0OOOO0;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import oO0OOOO0.C32961OooOOoo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0OO implements Iterable<Byte> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOOOO f119053OooOo0o = new OooOOOO(new byte[0]);

    public interface OooO00o extends Iterator<Byte> {
    }

    public static OooO0OO OooO0O0(Iterator<OooO0OO> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return OooO0O0(it, i2).OooO0OO(OooO0O0(it, i - i2));
    }

    public static OooO0O0 OooOO0() {
        return new OooO0O0();
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public abstract OooO00o iterator();

    public final OooO0OO OooO0OO(OooO0OO oooO0OO) {
        int size = size();
        int size2 = oooO0OO.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = C32961OooOOoo.f119106OooOooO;
        C32961OooOOoo c32961OooOOoo = this instanceof C32961OooOOoo ? (C32961OooOOoo) this : null;
        if (oooO0OO.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return oooO0OO;
        }
        int size3 = oooO0OO.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = oooO0OO.size();
            byte[] bArr = new byte[size4 + size5];
            OooO0Oo(bArr, 0, 0, size4);
            oooO0OO.OooO0Oo(bArr, 0, size4, size5);
            return new OooOOOO(bArr);
        }
        if (c32961OooOOoo != null) {
            OooO0OO oooO0OO2 = c32961OooOOoo.f119108OooOoO;
            if (oooO0OO.size() + oooO0OO2.size() < 128) {
                int size6 = oooO0OO2.size();
                int size7 = oooO0OO.size();
                byte[] bArr2 = new byte[size6 + size7];
                oooO0OO2.OooO0Oo(bArr2, 0, 0, size6);
                oooO0OO.OooO0Oo(bArr2, 0, size6, size7);
                return new C32961OooOOoo(c32961OooOOoo.f119109OooOoO0, new OooOOOO(bArr2));
            }
        }
        if (c32961OooOOoo != null) {
            OooO0OO oooO0OO3 = c32961OooOOoo.f119109OooOoO0;
            int iOooO0o = oooO0OO3.OooO0o();
            OooO0OO oooO0OO4 = c32961OooOOoo.f119108OooOoO;
            if (iOooO0o > oooO0OO4.OooO0o()) {
                if (c32961OooOOoo.f119112OooOoo0 > oooO0OO.OooO0o()) {
                    return new C32961OooOOoo(oooO0OO3, new C32961OooOOoo(oooO0OO4, oooO0OO));
                }
            }
        }
        if (size3 >= C32961OooOOoo.f119106OooOooO[Math.max(OooO0o(), oooO0OO.OooO0o()) + 1]) {
            return new C32961OooOOoo(this, oooO0OO);
        }
        C32961OooOOoo.OooO00o oooO00o = new C32961OooOOoo.OooO00o();
        oooO00o.OooO00o(this);
        oooO00o.OooO00o(oooO0OO);
        Stack<OooO0OO> stack = oooO00o.f119113OooO00o;
        OooO0OO oooO0OOPop = stack.pop();
        while (!stack.isEmpty()) {
            oooO0OOPop = new C32961OooOOoo(stack.pop(), oooO0OOPop);
        }
        return oooO0OOPop;
    }

    public final void OooO0Oo(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                OooO0o0(bArr, i, i2, i3);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract int OooO0o();

    public abstract void OooO0o0(byte[] bArr, int i, int i2, int i3);

    public abstract boolean OooO0oO();

    public abstract boolean OooO0oo();

    public abstract int OooOO0O(int i, int i2, int i3);

    public abstract int OooOO0o(int i, int i2, int i3);

    public abstract int OooOOO();

    public abstract String OooOOOO() throws UnsupportedEncodingException;

    public final String OooOOOo() {
        try {
            return OooOOOO();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract void OooOOo0(OutputStream outputStream, int i, int i2) throws IOException;

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public static final class OooO0O0 extends OutputStream {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final byte[] f119054OooOoo0 = new byte[0];

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f119058OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f119059OooOoOO;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f119056OooOo0o = 128;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final ArrayList<OooO0OO> f119055OooOo = new ArrayList<>();

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public byte[] f119057OooOoO = new byte[128];

        public final void OooO00o(int i) {
            this.f119055OooOo.add(new OooOOOO(this.f119057OooOoO));
            int length = this.f119058OooOoO0 + this.f119057OooOoO.length;
            this.f119058OooOoO0 = length;
            this.f119057OooOoO = new byte[Math.max(this.f119056OooOo0o, Math.max(i, length >>> 1))];
            this.f119059OooOoOO = 0;
        }

        public final void OooO0OO() {
            int i = this.f119059OooOoOO;
            byte[] bArr = this.f119057OooOoO;
            int length = bArr.length;
            ArrayList<OooO0OO> arrayList = this.f119055OooOo;
            if (i >= length) {
                arrayList.add(new OooOOOO(this.f119057OooOoO));
                this.f119057OooOoO = f119054OooOoo0;
            } else if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                arrayList.add(new OooOOOO(bArr2));
            }
            this.f119058OooOoO0 += this.f119059OooOoOO;
            this.f119059OooOoOO = 0;
        }

        public final synchronized OooO0OO OooOOO0() {
            ArrayList<OooO0OO> arrayList;
            OooO0OO();
            arrayList = this.f119055OooOo;
            if (arrayList == null) {
                ArrayList<OooO0OO> arrayList2 = new ArrayList<>();
                Iterator<OooO0OO> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? OooO0OO.f119053OooOo0o : OooO0OO.OooO0O0(arrayList.iterator(), arrayList.size());
        }

        public final String toString() {
            int i;
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i = this.f119058OooOoO0 + this.f119059OooOoOO;
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i) {
            try {
                if (this.f119059OooOoOO == this.f119057OooOoO.length) {
                    OooO00o(1);
                }
                byte[] bArr = this.f119057OooOoO;
                int i2 = this.f119059OooOoOO;
                this.f119059OooOoOO = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.f119057OooOoO;
                int length = bArr2.length;
                int i3 = this.f119059OooOoOO;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.f119059OooOoOO += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    OooO00o(i4);
                    System.arraycopy(bArr, i + length2, this.f119057OooOoO, 0, i4);
                    this.f119059OooOoOO = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
