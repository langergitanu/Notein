package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C6753ck extends AbstractC6760h4 {

    /* JADX INFO: renamed from: du */
    public int f18640du;

    /* JADX INFO: renamed from: h4 */
    private boolean f18641h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC6747ar f18642k4;

    /* JADX INFO: renamed from: to */
    public boolean f18643to;

    public C6753ck() {
        this.f18642k4 = null;
        mo26629k4();
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m26738h4() {
        return this.f18641h4;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26685k4(byte[] bArr, int i, int i2) {
        return mo26686k4(bArr, i, i2, false);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m26740m9() {
        this.f18641h4 = false;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean mo26630x1() {
        return false;
    }

    public C6753ck(AbstractC6747ar abstractC6747ar) {
        this.f18642k4 = abstractC6747ar;
        this.f18667x1 = abstractC6747ar.m26656fa();
        mo26629k4();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26686k4(byte[] bArr, int i, int i2, boolean z) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes", "Array cannot be null.");
        }
        String str = C18293o1.f55803f;
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        if (i < 0 || i2 < 0) {
            if (i < 0) {
                str = FirebaseAnalytics.Param.INDEX;
            }
            throw new ArgumentOutOfRangeException(str, "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
        }
        this.f18641h4 = z;
        this.f18643to = true;
        return this.f18642k4.mo26621k4(bArr, i, i2, this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26687k4(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        return mo26689k4(bArr, i, i2, cArr, i3, false);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26688k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, boolean z) {
        if (cArr == null || bArr == null) {
            throw new ArgumentNullException(cArr == null ? "chars" : "bytes", "Array cannot be null.");
        }
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "byteCount" : "charCount", "Non-negative number required.");
        }
        this.f18641h4 = z;
        this.f18643to = true;
        return this.f18642k4.mo26622k4(bArr, i, i2, cArr, i3, i4, this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public int mo26689k4(byte[] bArr, int i, int i2, char[] cArr, int i3, boolean z) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr != null ? "chars" : "bytes", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
        }
        if (i3 < 0 || i3 > cArr.length) {
            throw new ArgumentOutOfRangeException("charIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        return mo26688k4(bArr, i, i2, cArr, i3, cArr.length - i3, z);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public void mo26629k4() {
        AbstractC6762jd abstractC6762jd = this.f18666kk;
        if (abstractC6762jd != null) {
            abstractC6762jd.mo26768kk();
        }
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
    /* JADX INFO: renamed from: k4 */
    public void mo26739k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, boolean z, int[] iArr, int[] iArr2, boolean[] zArr) {
        AbstractC6762jd abstractC6762jd;
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr == null ? "bytes" : "chars", "Array cannot be null.");
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
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 >= 0 ? "charCount" : "byteCount", "Non-negative number required.");
        }
        this.f18641h4 = z;
        this.f18643to = false;
        this.f18640du = 0;
        iArr2[0] = this.f18642k4.mo26622k4(bArr, i, i2, cArr, i3, i4, this);
        int i5 = this.f18640du;
        iArr[0] = i5;
        zArr[0] = i5 == i2 && !(z && mo26630x1()) && ((abstractC6762jd = this.f18666kk) == null || abstractC6762jd.mo26746x1() == 0);
    }
}
