package oO0OOOO0;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import oO0OOOO0.OooO0OO;
import oO0OOOO0.OooOOOO;

/* JADX INFO: renamed from: oO0OOOO0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32961OooOOoo extends oO0OOOO0.OooO0OO {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int[] f119106OooOooO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f119107OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f119108OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final oO0OOOO0.OooO0OO f119109OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f119110OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f119111OooOoo = 0;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f119112OooOoo0;

    /* JADX INFO: renamed from: oO0OOOO0.OooOOoo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Stack<oO0OOOO0.OooO0OO> f119113OooO00o = new Stack<>();

        public final void OooO00o(oO0OOOO0.OooO0OO oooO0OO) {
            if (!oooO0OO.OooO0oO()) {
                if (!(oooO0OO instanceof C32961OooOOoo)) {
                    String strValueOf = String.valueOf(oooO0OO.getClass());
                    throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                }
                C32961OooOOoo c32961OooOOoo = (C32961OooOOoo) oooO0OO;
                OooO00o(c32961OooOOoo.f119109OooOoO0);
                OooO00o(c32961OooOOoo.f119108OooOoO);
                return;
            }
            int size = oooO0OO.size();
            int[] iArr = C32961OooOOoo.f119106OooOooO;
            int iBinarySearch = Arrays.binarySearch(iArr, size);
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int i = iArr[iBinarySearch + 1];
            Stack<oO0OOOO0.OooO0OO> stack = this.f119113OooO00o;
            if (stack.isEmpty() || stack.peek().size() >= i) {
                stack.push(oooO0OO);
                return;
            }
            int i2 = iArr[iBinarySearch];
            oO0OOOO0.OooO0OO oooO0OOPop = stack.pop();
            while (!stack.isEmpty() && stack.peek().size() < i2) {
                oooO0OOPop = new C32961OooOOoo(stack.pop(), oooO0OOPop);
            }
            C32961OooOOoo c32961OooOOoo2 = new C32961OooOOoo(oooO0OOPop, oooO0OO);
            while (!stack.isEmpty()) {
                int[] iArr2 = C32961OooOOoo.f119106OooOooO;
                int iBinarySearch2 = Arrays.binarySearch(iArr2, c32961OooOOoo2.f119107OooOo);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (stack.peek().size() >= iArr2[iBinarySearch2 + 1]) {
                    break;
                } else {
                    c32961OooOOoo2 = new C32961OooOOoo(stack.pop(), c32961OooOOoo2);
                }
            }
            stack.push(c32961OooOOoo2);
        }
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooOOoo$OooO0O0 */
    public static class OooO0O0 implements Iterator<OooOOOO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public OooOOOO f119114OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Stack<C32961OooOOoo> f119115OooOo0o = new Stack<>();

        public OooO0O0(oO0OOOO0.OooO0OO oooO0OO) {
            while (oooO0OO instanceof C32961OooOOoo) {
                C32961OooOOoo c32961OooOOoo = (C32961OooOOoo) oooO0OO;
                this.f119115OooOo0o.push(c32961OooOOoo);
                oooO0OO = c32961OooOOoo.f119109OooOoO0;
            }
            this.f119114OooOo = (OooOOOO) oooO0OO;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final OooOOOO next() {
            OooOOOO oooOOOO;
            OooOOOO oooOOOO2 = this.f119114OooOo;
            if (oooOOOO2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                Stack<C32961OooOOoo> stack = this.f119115OooOo0o;
                if (!stack.isEmpty()) {
                    oO0OOOO0.OooO0OO oooO0OO = stack.pop().f119108OooOoO;
                    while (oooO0OO instanceof C32961OooOOoo) {
                        C32961OooOOoo c32961OooOOoo = (C32961OooOOoo) oooO0OO;
                        stack.push(c32961OooOOoo);
                        oooO0OO = c32961OooOOoo.f119109OooOoO0;
                    }
                    oooOOOO = (OooOOOO) oooO0OO;
                    if (oooOOOO.f119101OooOo.length != 0) {
                        break;
                    }
                } else {
                    oooOOOO = null;
                    break;
                }
            }
            this.f119114OooOo = oooOOOO;
            return oooOOOO2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f119114OooOo != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooOOoo$OooO0OO */
    public class OooO0OO implements OooO0OO.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public OooOOOO.OooO00o f119116OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO0O0 f119117OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f119118OooOoO0;

        public OooO0OO(C32961OooOOoo c32961OooOOoo) {
            OooO0O0 oooO0O0 = new OooO0O0(c32961OooOOoo);
            this.f119117OooOo0o = oooO0O0;
            this.f119116OooOo = new OooOOOO.OooO00o(oooO0O0.next());
            this.f119118OooOoO0 = c32961OooOOoo.f119107OooOo;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f119118OooOoO0 > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            if (!this.f119116OooOo.hasNext()) {
                this.f119116OooOo = new OooOOOO.OooO00o(this.f119117OooOo0o.next());
            }
            this.f119118OooOoO0--;
            return Byte.valueOf(this.f119116OooOo.nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f119106OooOooO = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f119106OooOooO;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public C32961OooOOoo(oO0OOOO0.OooO0OO oooO0OO, oO0OOOO0.OooO0OO oooO0OO2) {
        this.f119109OooOoO0 = oooO0OO;
        this.f119108OooOoO = oooO0OO2;
        int size = oooO0OO.size();
        this.f119110OooOoOO = size;
        this.f119107OooOo = oooO0OO2.size() + size;
        this.f119112OooOoo0 = Math.max(oooO0OO.OooO0o(), oooO0OO2.OooO0o()) + 1;
    }

    @Override // oO0OOOO0.OooO0OO
    /* JADX INFO: renamed from: OooO */
    public final OooO0OO.OooO00o iterator() {
        return new OooO0OO(this);
    }

    @Override // oO0OOOO0.OooO0OO
    public final int OooO0o() {
        return this.f119112OooOoo0;
    }

    @Override // oO0OOOO0.OooO0OO
    public final void OooO0o0(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        oO0OOOO0.OooO0OO oooO0OO = this.f119109OooOoO0;
        int i5 = this.f119110OooOoOO;
        if (i4 <= i5) {
            oooO0OO.OooO0o0(bArr, i, i2, i3);
            return;
        }
        oO0OOOO0.OooO0OO oooO0OO2 = this.f119108OooOoO;
        if (i >= i5) {
            oooO0OO2.OooO0o0(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        oooO0OO.OooO0o0(bArr, i, i2, i6);
        oooO0OO2.OooO0o0(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // oO0OOOO0.OooO0OO
    public final boolean OooO0oO() {
        return this.f119107OooOo >= f119106OooOooO[this.f119112OooOoo0];
    }

    @Override // oO0OOOO0.OooO0OO
    public final boolean OooO0oo() {
        int iOooOO0o = this.f119109OooOoO0.OooOO0o(0, 0, this.f119110OooOoOO);
        oO0OOOO0.OooO0OO oooO0OO = this.f119108OooOoO;
        return oooO0OO.OooOO0o(iOooOO0o, 0, oooO0OO.size()) == 0;
    }

    @Override // oO0OOOO0.OooO0OO
    public final int OooOO0O(int i, int i2, int i3) {
        int i4 = i2 + i3;
        oO0OOOO0.OooO0OO oooO0OO = this.f119109OooOoO0;
        int i5 = this.f119110OooOoOO;
        if (i4 <= i5) {
            return oooO0OO.OooOO0O(i, i2, i3);
        }
        oO0OOOO0.OooO0OO oooO0OO2 = this.f119108OooOoO;
        if (i2 >= i5) {
            return oooO0OO2.OooOO0O(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return oooO0OO2.OooOO0O(oooO0OO.OooOO0O(i, i2, i6), 0, i3 - i6);
    }

    @Override // oO0OOOO0.OooO0OO
    public final int OooOO0o(int i, int i2, int i3) {
        int i4 = i2 + i3;
        oO0OOOO0.OooO0OO oooO0OO = this.f119109OooOoO0;
        int i5 = this.f119110OooOoOO;
        if (i4 <= i5) {
            return oooO0OO.OooOO0o(i, i2, i3);
        }
        oO0OOOO0.OooO0OO oooO0OO2 = this.f119108OooOoO;
        if (i2 >= i5) {
            return oooO0OO2.OooOO0o(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return oooO0OO2.OooOO0o(oooO0OO.OooOO0o(i, i2, i6), 0, i3 - i6);
    }

    @Override // oO0OOOO0.OooO0OO
    public final int OooOOO() {
        return this.f119111OooOoo;
    }

    @Override // oO0OOOO0.OooO0OO
    public final String OooOOOO() throws UnsupportedEncodingException {
        byte[] bArr;
        int i = this.f119107OooOo;
        if (i == 0) {
            bArr = OooO.f119051OooO00o;
        } else {
            byte[] bArr2 = new byte[i];
            OooO0o0(bArr2, 0, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // oO0OOOO0.OooO0OO
    public final void OooOOo0(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        oO0OOOO0.OooO0OO oooO0OO = this.f119109OooOoO0;
        int i4 = this.f119110OooOoOO;
        if (i3 <= i4) {
            oooO0OO.OooOOo0(outputStream, i, i2);
            return;
        }
        oO0OOOO0.OooO0OO oooO0OO2 = this.f119108OooOoO;
        if (i >= i4) {
            oooO0OO2.OooOOo0(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        oooO0OO.OooOOo0(outputStream, i, i5);
        oooO0OO2.OooOOo0(outputStream, 0, i2 - i5);
    }

    public final boolean equals(Object obj) {
        int iOooOOO;
        if (obj == this) {
            return true;
        }
        if (obj instanceof oO0OOOO0.OooO0OO) {
            oO0OOOO0.OooO0OO oooO0OO = (oO0OOOO0.OooO0OO) obj;
            int size = oooO0OO.size();
            int i = this.f119107OooOo;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.f119111OooOoo == 0 || (iOooOOO = oooO0OO.OooOOO()) == 0 || this.f119111OooOoo == iOooOOO) {
                    OooO0O0 oooO0O0 = new OooO0O0(this);
                    OooOOOO next = oooO0O0.next();
                    OooO0O0 oooO0O02 = new OooO0O0(oooO0OO);
                    OooOOOO next2 = oooO0O02.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = next.f119101OooOo.length - i2;
                        int length2 = next2.f119101OooOo.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? next.OooOOo(next2, i3, iMin) : next2.OooOOo(next, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            next = oooO0O0.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            next2 = oooO0O02.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iOooOO0O = this.f119111OooOoo;
        if (iOooOO0O == 0) {
            int i = this.f119107OooOo;
            iOooOO0O = OooOO0O(i, 0, i);
            if (iOooOO0O == 0) {
                iOooOO0O = 1;
            }
            this.f119111OooOoo = iOooOO0O;
        }
        return iOooOO0O;
    }

    @Override // oO0OOOO0.OooO0OO, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new OooO0OO(this);
    }

    @Override // oO0OOOO0.OooO0OO
    public final int size() {
        return this.f119107OooOo;
    }
}
