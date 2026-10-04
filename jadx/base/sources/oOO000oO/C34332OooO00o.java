package oOO000oO;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: oOO000oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34332OooO00o {

    /* JADX INFO: renamed from: oOO000oO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C20351OooO00o<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f123259OooOo = 0;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final T[] f123260OooOo0o;

        public C20351OooO00o(T[] tArr) {
            this.f123260OooOo0o = tArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f123259OooOo < this.f123260OooOo0o.length;
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = this.f123259OooOo;
            T[] tArr = this.f123260OooOo0o;
            if (i != tArr.length) {
                this.f123259OooOo = i + 1;
                return tArr[i];
            }
            throw new NoSuchElementException("Out of elements: " + this.f123259OooOo);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static byte[] OooO00o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static short[] OooO0O0(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    public static byte[] OooO0OO(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return OooO00o(bArr2);
        }
        if (bArr2 == null) {
            return OooO00o(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] OooO0Oo(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
            return bArr2;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int OooO0o(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    public static int OooO0o0(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static int OooO0oO(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    public static int OooO0oo(short[][] sArr) {
        int iOooO0oO = 0;
        for (int i = 0; i != sArr.length; i++) {
            iOooO0oO = (iOooO0oO * 257) + OooO0oO(sArr[i]);
        }
        return iOooO0oO;
    }
}
