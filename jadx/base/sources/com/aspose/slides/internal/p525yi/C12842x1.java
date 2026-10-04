package com.aspose.slides.internal.p525yi;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14098up;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12842x1 {

    /* JADX INFO: renamed from: k4 */
    private byte f42732k4;

    /* JADX INFO: renamed from: kk */
    private ArrayList f42733kk;

    /* JADX INFO: renamed from: x1 */
    private byte[] f42734x1;

    public C12842x1() {
        this((byte) 0, null);
    }

    /* JADX INFO: renamed from: du */
    public byte[] m59708du() {
        byte[] bArr;
        byte[] bArr2;
        int length;
        if (m59709k4() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = this.f42733kk.iterator();
            int length2 = 0;
            while (it.hasNext()) {
                byte[] bArrM59708du = ((C12842x1) it.next()).m59708du();
                arrayList.addItem(bArrM59708du);
                length2 += bArrM59708du.length;
            }
            bArr = new byte[length2];
            int length3 = 0;
            for (int i = 0; i < this.f42733kk.size(); i++) {
                byte[] bArr3 = (byte[]) arrayList.get_Item(i);
                C14058fa.m66596k4(bArr3, 0, bArr, length3, bArr3.length);
                length3 += bArr3.length;
            }
        } else {
            bArr = this.f42734x1;
            if (bArr == null) {
                bArr = null;
            }
        }
        if (bArr != null) {
            length = bArr.length;
            if (length <= 127) {
                bArr2 = new byte[length + 2];
                C14058fa.m66596k4(bArr, 0, bArr2, 2, length);
            } else if (length <= 255) {
                bArr2 = new byte[length + 3];
                C14058fa.m66596k4(bArr, 0, bArr2, 3, length);
                bArr2[2] = (byte) length;
                length = 129;
            } else if (length <= 65535) {
                bArr2 = new byte[length + 4];
                C14058fa.m66596k4(bArr, 0, bArr2, 4, length);
                bArr2[2] = (byte) (length >> 8);
                bArr2[3] = (byte) length;
                length = 130;
            } else if (length <= 16777215) {
                bArr2 = new byte[length + 5];
                C14058fa.m66596k4(bArr, 0, bArr2, 5, length);
                bArr2[2] = (byte) (length >> 16);
                bArr2[3] = (byte) (length >> 8);
                bArr2[4] = (byte) length;
                length = 131;
            } else {
                bArr2 = new byte[length + 6];
                C14058fa.m66596k4(bArr, 0, bArr2, 6, length);
                bArr2[2] = (byte) (length >> 24);
                bArr2[3] = (byte) (length >> 16);
                bArr2[4] = (byte) (length >> 8);
                bArr2[5] = (byte) length;
                length = 132;
            }
            if (this.f42734x1 == null) {
                this.f42734x1 = bArr;
            }
        } else {
            bArr2 = new byte[2];
            length = 0;
        }
        bArr2[0] = this.f42732k4;
        bArr2[1] = (byte) length;
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public int m59709k4() {
        ArrayList arrayList = this.f42733kk;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: kk */
    public int m59716kk() {
        byte[] bArr = this.f42734x1;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    /* JADX INFO: renamed from: to */
    public byte[] m59717to() {
        if (this.f42734x1 == null) {
            m59708du();
        }
        return (byte[]) this.f42734x1.clone();
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        C6765kp.m26772k4(c6765kp, "Tag: {0} {1}", C14098up.m67320k4(this.f42732k4, "X2"), C14052dq.f47188k4);
        C6765kp.m26772k4(c6765kp, "Length: {0} {1}", Integer.valueOf(m59717to().length), C14052dq.f47188k4);
        c6765kp.m26792k4("Value: ");
        c6765kp.m26792k4(C14052dq.f47188k4);
        int i = 0;
        while (i < m59717to().length) {
            C6765kp.m26772k4(c6765kp, "{0} ", C14098up.m67320k4(m59717to()[i], "X2"));
            i++;
            if (i % 16 == 0) {
                C6765kp.m26772k4(c6765kp, C14052dq.f47188k4, new Object[0]);
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public byte m59718x1() {
        return this.f42732k4;
    }

    public C12842x1(byte b) {
        this(b, null);
    }

    /* JADX INFO: renamed from: k4 */
    public C12842x1 m59710k4(int i) {
        try {
            ArrayList arrayList = this.f42733kk;
            if (arrayList != null && i < arrayList.size()) {
                return (C12842x1) this.f42733kk.get_Item(i);
            }
        } catch (ArgumentException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m59719x1(byte[] bArr) {
        return m59707k4(this.f42734x1, bArr);
    }

    public C12842x1(byte b, byte[] bArr) {
        this.f42732k4 = b;
        this.f42734x1 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public C12842x1 m59711k4(int i, byte b) {
        try {
            ArrayList arrayList = this.f42733kk;
            if (arrayList != null && i < arrayList.size()) {
                C12842x1 c12842x1 = (C12842x1) this.f42733kk.get_Item(i);
                if (c12842x1.m59718x1() == b) {
                    return c12842x1;
                }
            }
        } catch (ArgumentException unused) {
        }
        return null;
    }

    public C12842x1(byte[] bArr) {
        int i;
        this.f42732k4 = bArr[0];
        int i2 = bArr[1] & 255;
        if (i2 > 128) {
            int i3 = i2 - 128;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                i4 = (i4 * 256) + (bArr[i5 + 2] & 255);
            }
            int i6 = i4;
            i = i3;
            i2 = i6;
        } else {
            if (i2 == 128) {
                throw new NotSupportedException("Undefined length encoding.");
            }
            i = 0;
        }
        byte[] bArr2 = new byte[i2];
        this.f42734x1 = bArr2;
        int i7 = i + 2;
        C14058fa.m66596k4(bArr, i7, bArr2, 0, i2);
        if ((this.f42732k4 & 32) == 32) {
            m59714k4(bArr, new int[]{i7}, bArr.length);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C12842x1 m59712k4(C12842x1 c12842x1) {
        if (c12842x1 != null) {
            if (this.f42733kk == null) {
                this.f42733kk = new ArrayList();
            }
            this.f42733kk.addItem(c12842x1);
        }
        return c12842x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m59713k4(byte[] bArr) {
        if (bArr != null) {
            this.f42734x1 = (byte[]) bArr.clone();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m59714k4(byte[] bArr, int[] iArr, int i) {
        byte[] bArr2 = null;
        byte b = 0;
        int i2 = 0;
        while (iArr[0] < i - 1) {
            byte[] bArr3 = {b};
            int[] iArr2 = {i2};
            byte[][] bArr4 = {bArr2};
            m59715k4(bArr, iArr, bArr3, iArr2, bArr4);
            b = bArr3[0];
            i2 = iArr2[0];
            bArr2 = bArr4[0];
            if (b != 0) {
                C12842x1 c12842x1M59712k4 = m59712k4(new C12842x1(b, bArr2));
                if ((b & 32) == 32) {
                    int i3 = iArr[0];
                    c12842x1M59712k4.m59714k4(bArr, new int[]{i3}, i3 + i2);
                }
                iArr[0] = iArr[0] + i2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m59715k4(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2, byte[][] bArr3) {
        int i = iArr[0];
        int i2 = i + 1;
        iArr[0] = i2;
        bArr2[0] = bArr[i];
        iArr[0] = i + 2;
        int i3 = bArr[i2];
        iArr2[0] = i3 & 255;
        if ((i3 & 128) == 128) {
            int i4 = i3 & 127;
            iArr2[0] = 0;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = iArr2[0] * 256;
                int i7 = iArr[0];
                iArr[0] = i7 + 1;
                iArr2[0] = i6 + (bArr[i7] & 255);
            }
        }
        int i8 = iArr2[0];
        byte[] bArr4 = new byte[i8];
        bArr3[0] = bArr4;
        C14058fa.m66596k4(bArr, iArr[0], bArr4, 0, i8);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m59707k4(byte[] bArr, byte[] bArr2) {
        boolean z = bArr.length == bArr2.length;
        if (z) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
        }
        return z;
    }
}
