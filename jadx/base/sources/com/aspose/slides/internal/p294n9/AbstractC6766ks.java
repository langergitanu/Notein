package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.ks */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6766ks {

    /* JADX INFO: renamed from: k4 */
    public AbstractC6769ne f18689k4 = null;

    /* JADX INFO: renamed from: x1 */
    public AbstractC6761ix f18690x1 = null;

    /* JADX INFO: renamed from: k4 */
    public abstract int mo26716k4(char[] cArr, int i, int i2, boolean z);

    /* JADX INFO: renamed from: k4 */
    public int mo26717k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, boolean z) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr == null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
        }
        char[] cArr2 = new char[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            cArr2[i5] = cArr[i5 + i];
        }
        byte[] bArr2 = new byte[i4];
        int iMo26718k4 = mo26718k4(cArr2, 0, i2, bArr2, 0, z);
        if (iMo26718k4 < i4) {
            i4 = iMo26718k4;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            bArr[i6] = bArr2[i6 + i3];
        }
        return i4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo26718k4(char[] cArr, int i, int i2, byte[] bArr, int i3, boolean z);

    /* JADX INFO: renamed from: kk */
    public final boolean m26813kk() {
        return this.f18690x1 != null;
    }

    /* JADX INFO: renamed from: to */
    public void mo26632to() {
        char[] cArr = new char[0];
        mo26718k4(cArr, 0, 0, new byte[mo26716k4(cArr, 0, 0, true)], 0, true);
        AbstractC6761ix abstractC6761ix = this.f18690x1;
        if (abstractC6761ix != null) {
            abstractC6761ix.mo26763to();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6761ix m26814x1() {
        if (this.f18690x1 == null) {
            AbstractC6769ne abstractC6769neM26820kk = this.f18689k4;
            if (abstractC6769neM26820kk == null) {
                abstractC6769neM26820kk = AbstractC6769ne.m26820kk();
            }
            this.f18690x1 = abstractC6769neM26820kk.mo26736k4();
        }
        return this.f18690x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6769ne m26811k4() {
        return this.f18689k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo26812k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, boolean z, int[] iArr, int[] iArr2, boolean[] zArr) {
        AbstractC6761ix abstractC6761ix;
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr != null ? "chars" : "bytes", "Array cannot be null.");
        }
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 >= 0 ? "byteCount" : "charCount", "Non-negative number required.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "charIndex" : "charCount", "Non-negative number required.");
        }
        if (i3 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i3 < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
        }
        if (bArr.length - i3 < i4) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
        }
        iArr[0] = i2;
        boolean z2 = z;
        while (true) {
            int i5 = iArr[0];
            if (i5 <= 0) {
                throw new ArgumentException("Conversion buffer overflow.");
            }
            if (mo26716k4(cArr, i, i5, z2) <= i4) {
                iArr2[0] = mo26718k4(cArr, i, iArr[0], bArr, i3, z2);
                zArr[0] = iArr[0] == i2 && ((abstractC6761ix = this.f18690x1) == null || abstractC6761ix.mo26762kk() == 0);
                return;
            } else {
                iArr[0] = iArr[0] / 2;
                z2 = false;
            }
        }
    }
}
