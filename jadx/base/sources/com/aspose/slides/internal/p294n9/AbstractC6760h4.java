package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.h4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6760h4 {

    /* JADX INFO: renamed from: x1 */
    public AbstractC6751c5 f18667x1 = null;

    /* JADX INFO: renamed from: kk */
    public AbstractC6762jd f18666kk = null;

    /* JADX INFO: renamed from: du */
    public final boolean m26751du() {
        return this.f18666kk != null;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo26685k4(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: k4 */
    public int mo26686k4(byte[] bArr, int i, int i2, boolean z) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes", "Array cannot be null.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i3 + i];
        }
        return mo26685k4(bArr2, 0, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo26687k4(byte[] bArr, int i, int i2, char[] cArr, int i3);

    /* JADX INFO: renamed from: kk */
    public final AbstractC6751c5 m26752kk() {
        return this.f18667x1;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC6762jd m26753to() {
        if (this.f18666kk == null) {
            AbstractC6751c5 abstractC6751c5M26732kk = this.f18667x1;
            if (abstractC6751c5M26732kk == null) {
                abstractC6751c5M26732kk = AbstractC6751c5.m26732kk();
            }
            this.f18666kk = abstractC6751c5M26732kk.mo26734k4();
        }
        return this.f18666kk;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo26688k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, boolean z) {
        if (cArr == null || bArr == null) {
            throw new ArgumentNullException(cArr == null ? "chars" : "bytes", "Array cannot be null.");
        }
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "byteCount" : "charCount", "Non-negative number required.");
        }
        byte[] bArr2 = new byte[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            bArr2[i5] = bArr[i5 + i];
        }
        char[] cArr2 = new char[i4];
        int iMo26689k4 = mo26689k4(bArr2, 0, i2, cArr2, 0, z);
        if (iMo26689k4 < i4) {
            i4 = iMo26689k4;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            cArr[i6 + i3] = cArr2[i6];
        }
        return i4;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo26689k4(byte[] bArr, int i, int i2, char[] cArr, int i3, boolean z) {
        return mo26687k4(bArr, i, i2, cArr, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo26629k4() {
        byte[] bArr = new byte[0];
        mo26689k4(bArr, 0, 0, new char[mo26686k4(bArr, 0, 0, true)], 0, true);
        AbstractC6762jd abstractC6762jd = this.f18666kk;
        if (abstractC6762jd != null) {
            abstractC6762jd.mo26768kk();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo26739k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, boolean z, int[] iArr, int[] iArr2, boolean[] zArr) {
        AbstractC6762jd abstractC6762jd;
        if (cArr == null || bArr == null) {
            throw new ArgumentNullException(cArr != null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 >= 0 ? "charCount" : "byteCount", "Non-negative number required.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
        }
        if (i3 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i3 < 0 ? "charIndex" : "charCount", "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
        }
        if (cArr.length - i3 < i4) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
        }
        iArr[0] = i2;
        boolean z2 = z;
        while (true) {
            int i5 = iArr[0];
            if (i5 <= 0) {
                throw new ArgumentException("Conversion buffer overflow.");
            }
            if (mo26686k4(bArr, i, i5, z2) <= i4) {
                iArr2[0] = mo26689k4(bArr, i, iArr[0], cArr, i3, z2);
                zArr[0] = iArr[0] == i2 && ((abstractC6762jd = this.f18666kk) == null || abstractC6762jd.mo26746x1() == 0);
                return;
            } else {
                iArr[0] = iArr[0] / 2;
                z2 = false;
            }
        }
    }
}
