package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C6780uz extends AbstractC6766ks {

    /* JADX INFO: renamed from: du */
    public int f18745du;

    /* JADX INFO: renamed from: h4 */
    private AbstractC6747ar f18746h4;

    /* JADX INFO: renamed from: kk */
    public char f18747kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f18748m9;

    /* JADX INFO: renamed from: to */
    public boolean f18749to;

    public C6780uz() {
        this.f18746h4 = null;
        mo26632to();
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC6747ar m26833du() {
        return this.f18746h4;
    }

    /* JADX INFO: renamed from: dy */
    public final void m26834dy() {
        this.f18748m9 = false;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m26835h4() {
        return this.f18748m9;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6766ks
    /* JADX INFO: renamed from: k4 */
    public int mo26716k4(char[] cArr, int i, int i2, boolean z) {
        if (cArr == null) {
            throw new ArgumentNullException("chars", "Array cannot be null.");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
        }
        String str = C18293o1.f55803f;
        if (i < 0 || i2 < 0) {
            if (i < 0) {
                str = FirebaseAnalytics.Param.INDEX;
            }
            throw new ArgumentOutOfRangeException(str, "Non-negative number required.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        this.f18748m9 = z;
        this.f18749to = true;
        return this.f18746h4.mo26623k4(cArr, i, i2, this);
    }

    /* JADX INFO: renamed from: m9 */
    public boolean mo26631m9() {
        return this.f18747kk != 0;
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6766ks
    /* JADX INFO: renamed from: to */
    public void mo26632to() {
        this.f18747kk = (char) 0;
        AbstractC6761ix abstractC6761ix = this.f18690x1;
        if (abstractC6761ix != null) {
            abstractC6761ix.mo26763to();
        }
    }

    public C6780uz(AbstractC6747ar abstractC6747ar) {
        this.f18746h4 = abstractC6747ar;
        this.f18689k4 = abstractC6747ar.m26654ck();
        mo26632to();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6766ks
    /* JADX INFO: renamed from: k4 */
    public int mo26717k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, boolean z) {
        if (cArr == null || bArr == null) {
            throw new ArgumentNullException(cArr == null ? "chars" : "bytes", "Array cannot be null.");
        }
        if (i4 < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i4 < 0 ? "byteCount" : "charCount", "Non-negative number required.");
        }
        this.f18748m9 = z;
        this.f18749to = true;
        return this.f18746h4.mo26624k4(cArr, i, i2, bArr, i3, i4, this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6766ks
    /* JADX INFO: renamed from: k4 */
    public int mo26718k4(char[] cArr, int i, int i2, byte[] bArr, int i3, boolean z) {
        if (cArr == null || bArr == null) {
            throw new ArgumentNullException(cArr != null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "charIndex" : "charCount", "Non-negative number required.");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
        }
        if (i3 < 0 || i3 > bArr.length) {
            throw new ArgumentOutOfRangeException("byteIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        return mo26717k4(cArr, i, i2, bArr, i3, bArr.length - i3, z);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6766ks
    /* JADX INFO: renamed from: k4 */
    public void mo26812k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, boolean z, int[] iArr, int[] iArr2, boolean[] zArr) {
        AbstractC6761ix abstractC6761ix;
        if (cArr == null || bArr == null) {
            throw new ArgumentNullException(cArr == null ? "chars" : "bytes", "Array cannot be null.");
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
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 >= 0 ? "byteCount" : "charCount", "Non-negative number required.");
        }
        this.f18748m9 = z;
        this.f18749to = false;
        this.f18745du = 0;
        iArr2[0] = this.f18746h4.mo26624k4(cArr, i, i2, bArr, i3, i4, this);
        int i5 = this.f18745du;
        iArr[0] = i5;
        zArr[0] = i5 == i2 && !(z && mo26631m9()) && ((abstractC6761ix = this.f18690x1) == null || abstractC6761ix.mo26762kk() == 0);
    }
}
