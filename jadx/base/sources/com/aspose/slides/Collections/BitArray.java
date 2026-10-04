package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes3.dex */
public final class BitArray implements ICollection, InterfaceC14059g8 {

    /* JADX INFO: renamed from: k4 */
    private int[] f1570k4;

    /* JADX INFO: renamed from: kk */
    private int f1571kk;

    /* JADX INFO: renamed from: x1 */
    private int f1572x1;

    public static class BitArrayEnumerator implements IEnumerator, InterfaceC14059g8, Cloneable {

        /* JADX INFO: renamed from: k4 */
        private BitArray f1573k4;

        /* JADX INFO: renamed from: kk */
        private int f1574kk;

        /* JADX INFO: renamed from: to */
        private int f1575to;

        /* JADX INFO: renamed from: x1 */
        private boolean f1576x1;

        private BitArrayEnumerator() {
        }

        /* JADX INFO: renamed from: x1 */
        private void m790x1() {
            if (this.f1575to != this.f1573k4.f1571kk) {
                throw new InvalidOperationException();
            }
        }

        public Object clone() throws CloneNotSupportedException {
            BitArrayEnumerator bitArrayEnumerator = new BitArrayEnumerator();
            bitArrayEnumerator.f1573k4 = this.f1573k4;
            bitArrayEnumerator.f1576x1 = this.f1576x1;
            bitArrayEnumerator.f1574kk = this.f1574kk;
            bitArrayEnumerator.f1575to = this.f1575to;
            return bitArrayEnumerator;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            return m791k4();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            m790x1();
            if (this.f1574kk >= this.f1573k4.size() - 1) {
                this.f1574kk = this.f1573k4.size();
                return false;
            }
            BitArray bitArray = this.f1573k4;
            int i = this.f1574kk + 1;
            this.f1574kk = i;
            this.f1576x1 = bitArray.get_Item(i);
            return true;
        }

        /* JADX INFO: renamed from: k4 */
        public Object m791k4() {
            try {
                return clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            int i = this.f1574kk;
            if (i == -1) {
                throw new InvalidOperationException("Enum not started");
            }
            if (i < this.f1573k4.size()) {
                return Boolean.valueOf(this.f1576x1);
            }
            throw new InvalidOperationException("Enum Ended");
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            m790x1();
            this.f1574kk = -1;
        }

        public BitArrayEnumerator(BitArray bitArray) {
            this.f1574kk = -1;
            this.f1573k4 = bitArray;
            this.f1575to = bitArray.f1571kk;
        }
    }

    public BitArray(int i) {
        this.f1571kk = 0;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("length");
        }
        this.f1572x1 = i;
        this.f1570k4 = new int[(i + 31) / 32];
    }

    /* JADX INFO: renamed from: k4 */
    private byte m785k4(int i) {
        int i2 = i / 4;
        int i3 = (i % 4) * 8;
        return (byte) (((this.f1570k4[i2] & (255 << i3)) >> i3) & 255);
    }

    /* JADX INFO: renamed from: x1 */
    private void m788x1(BitArray bitArray) {
        if (bitArray == null) {
            throw new ArgumentNullException();
        }
        if (bitArray.f1572x1 != this.f1572x1) {
            throw new ArgumentException();
        }
    }

    public BitArray and(BitArray bitArray) {
        m788x1(bitArray);
        int i = (this.f1572x1 + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = this.f1570k4;
            iArr[i2] = iArr[i2] & bitArray.f1570k4[i2];
        }
        this.f1571kk++;
        return this;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (abstractC14092to.m67277to() != 1) {
            throw new ArgumentException("array", "Array rank must be 1");
        }
        if (i >= abstractC14092to.m67265du() && this.f1572x1 > 0) {
            throw new ArgumentException(FirebaseAnalytics.Param.INDEX, "index is greater than array.Length");
        }
        Object objM67212k4 = AbstractC14092to.m67212k4(abstractC14092to);
        int i2 = 0;
        if (objM67212k4 instanceof Boolean[]) {
            if (abstractC14092to.m67265du() - i < this.f1572x1) {
                throw new ArgumentException();
            }
            Boolean[] boolArr = (Boolean[]) objM67212k4;
            while (i2 < this.f1572x1) {
                boolArr[i + i2] = Boolean.valueOf(get_Item(i2));
                i2++;
            }
            return;
        }
        if (objM67212k4 instanceof boolean[]) {
            if (abstractC14092to.m67265du() - i < this.f1572x1) {
                throw new ArgumentException();
            }
            boolean[] zArr = (boolean[]) objM67212k4;
            while (i2 < this.f1572x1) {
                zArr[i + i2] = get_Item(i2);
                i2++;
            }
            return;
        }
        if (objM67212k4 instanceof Byte[]) {
            int i3 = (this.f1572x1 + 7) / 8;
            if (abstractC14092to.m67265du() - i < i3) {
                throw new ArgumentException();
            }
            Byte[] bArr = (Byte[]) objM67212k4;
            while (i2 < i3) {
                bArr[i + i2] = Byte.valueOf(m785k4(i2));
                i2++;
            }
            return;
        }
        if (!(objM67212k4 instanceof byte[])) {
            if (!(objM67212k4 instanceof Integer[]) && !(objM67212k4 instanceof int[])) {
                throw new ArgumentException("array", "Unsupported type");
            }
            AbstractC14092to abstractC14092toM67208k4 = AbstractC14092to.m67208k4((Object) this.f1570k4);
            AbstractC14092to.m67216k4(abstractC14092toM67208k4, 0, abstractC14092to, i, (this.f1572x1 + 31) / 32);
            return;
        }
        int i4 = (this.f1572x1 + 7) / 8;
        if (abstractC14092to.m67265du() - i < i4) {
            throw new ArgumentException();
        }
        byte[] bArr2 = (byte[]) objM67212k4;
        while (i2 < i4) {
            bArr2[i + i2] = m785k4(i2);
            i2++;
        }
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        return new BitArray(this);
    }

    public boolean get(int i) {
        if (i < 0 || i >= this.f1572x1) {
            throw new ArgumentOutOfRangeException();
        }
        return ((1 << (i & 31)) & this.f1570k4[i >> 5]) != 0;
    }

    public int getLength() {
        return this.f1572x1;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    public boolean get_Item(int i) {
        return get(i);
    }

    public boolean isReadOnly() {
        return false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return new BitArrayEnumerator(this);
    }

    public BitArray not() {
        int i = (this.f1572x1 + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = this.f1570k4;
            iArr[i2] = ~iArr[i2];
        }
        this.f1571kk++;
        return this;
    }

    /* JADX INFO: renamed from: or */
    public BitArray m789or(BitArray bitArray) {
        m788x1(bitArray);
        int i = (this.f1572x1 + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = this.f1570k4;
            iArr[i2] = iArr[i2] | bitArray.f1570k4[i2];
        }
        this.f1571kk++;
        return this;
    }

    public void set(int i, boolean z) {
        if (i < 0 || i >= this.f1572x1) {
            throw new ArgumentOutOfRangeException();
        }
        if (z) {
            int[] iArr = this.f1570k4;
            int i2 = i >> 5;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        } else {
            int[] iArr2 = this.f1570k4;
            int i3 = i >> 5;
            iArr2[i3] = (~(1 << (i & 31))) & iArr2[i3];
        }
        this.f1571kk++;
    }

    public void setAll(boolean z) {
        int i = 0;
        if (z) {
            while (true) {
                int[] iArr = this.f1570k4;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = -1;
                i++;
            }
        } else {
            AbstractC14092to.m67215k4(AbstractC14092to.m67208k4((Object) this.f1570k4), 0, this.f1570k4.length);
        }
        this.f1571kk++;
    }

    public void setLength(int i) {
        int i2 = this.f1572x1;
        if (i2 == i) {
            return;
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException();
        }
        if (i > i2) {
            int i3 = (i + 31) / 32;
            int i4 = (i2 + 31) / 32;
            int[] iArr = this.f1570k4;
            if (i3 > iArr.length) {
                int[] iArr2 = new int[i3];
                AbstractC14092to.m67230k4(iArr, 0, iArr2, 0, iArr.length);
                this.f1570k4 = iArr2;
            } else {
                AbstractC14092to.m67215k4(AbstractC14092to.m67208k4((Object) iArr), i4, i3 - i4);
            }
            int i5 = this.f1572x1 % 32;
            if (i5 > 0) {
                int[] iArr3 = this.f1570k4;
                int i6 = i4 - 1;
                iArr3[i6] = ((1 << i5) - 1) & iArr3[i6];
            }
        }
        this.f1572x1 = i;
        this.f1571kk++;
    }

    public void set_Item(int i, boolean z) {
        set(i, z);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1572x1;
    }

    public BitArray xor(BitArray bitArray) {
        m788x1(bitArray);
        int i = (this.f1572x1 + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = this.f1570k4;
            iArr[i2] = iArr[i2] ^ bitArray.f1570k4[i2];
        }
        this.f1571kk++;
        return this;
    }

    public BitArray(int i, boolean z) {
        this(i);
        if (!z) {
            return;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f1570k4;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = -1;
            i2++;
        }
    }

    public BitArray(BitArray bitArray) {
        this.f1571kk = 0;
        if (bitArray == null) {
            throw new ArgumentNullException("bits");
        }
        int i = bitArray.f1572x1;
        this.f1572x1 = i;
        int[] iArr = new int[(i + 31) / 32];
        this.f1570k4 = iArr;
        int length = iArr.length;
        int[] iArr2 = bitArray.f1570k4;
        if (length == 1) {
            iArr[0] = iArr2[0];
        } else {
            AbstractC14092to.m67230k4(iArr2, 0, iArr, 0, iArr.length);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m787k4(int i, byte b) {
        int i2 = i / 4;
        int i3 = (i % 4) * 8;
        int[] iArr = this.f1570k4;
        int i4 = iArr[i2] & (~(255 << i3));
        iArr[i2] = i4;
        iArr[i2] = ((b & 255) << i3) | i4;
        this.f1571kk++;
    }

    public BitArray(byte[] bArr) {
        this.f1571kk = 0;
        if (bArr == null) {
            throw new ArgumentNullException("bytes");
        }
        int length = bArr.length * 8;
        this.f1572x1 = length;
        this.f1570k4 = new int[(length + 31) / 32];
        for (int i = 0; i < bArr.length; i++) {
            m787k4(i, bArr[i]);
        }
    }

    public BitArray(int[] iArr) {
        this.f1571kk = 0;
        if (iArr == null) {
            throw new ArgumentNullException(C18437z2.f56756j);
        }
        int length = iArr.length;
        this.f1572x1 = length * 32;
        int[] iArr2 = new int[length];
        this.f1570k4 = iArr2;
        AbstractC14092to.m67230k4(iArr, 0, iArr2, 0, length);
    }

    public BitArray(boolean[] zArr) {
        this.f1571kk = 0;
        if (zArr == null) {
            throw new ArgumentNullException(C18437z2.f56756j);
        }
        int length = zArr.length;
        this.f1572x1 = length;
        this.f1570k4 = new int[(length + 31) / 32];
        for (int i = 0; i < zArr.length; i++) {
            set_Item(i, zArr[i]);
        }
    }
}
