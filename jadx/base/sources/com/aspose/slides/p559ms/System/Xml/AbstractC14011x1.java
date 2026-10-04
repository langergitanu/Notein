package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.C14080ne;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.x1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14011x1 {

    /* JADX INFO: renamed from: k4 */
    private byte[] f47067k4;

    /* JADX INFO: renamed from: kk */
    private char[] f47068kk = new char[76];

    /* JADX INFO: renamed from: x1 */
    private int f47069x1;

    /* JADX INFO: renamed from: k4 */
    public final void m66294k4() {
        int i = this.f47069x1;
        if (i > 0) {
            mo65704k4(this.f47068kk, 0, C14080ne.m66936k4(this.f47067k4, 0, i, this.f47068kk, 0));
            this.f47069x1 = 0;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo65704k4(char[] cArr, int i, int i2);

    /* JADX INFO: renamed from: k4 */
    public final void m66295k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        if (i2 > bArr.length - i) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        int i3 = this.f47069x1;
        if (i3 > 0) {
            while (i3 < 3 && i2 > 0) {
                this.f47067k4[i3] = bArr[i];
                i2--;
                i3++;
                i++;
            }
            if (i2 == 0 && i3 < 3) {
                this.f47069x1 = i3;
                return;
            }
            mo65704k4(this.f47068kk, 0, C14080ne.m66936k4(this.f47067k4, 0, 3, this.f47068kk, 0));
        }
        int i4 = i2 % 3;
        this.f47069x1 = i4;
        if (i4 > 0) {
            i2 -= i4;
            if (this.f47067k4 == null) {
                this.f47067k4 = new byte[3];
            }
            for (int i5 = 0; i5 < this.f47069x1; i5++) {
                this.f47067k4[i5] = bArr[i + i2 + i5];
            }
        }
        int i6 = i2 + i;
        int i7 = 57;
        while (i < i6) {
            if (i + i7 > i6) {
                i7 = i6 - i;
            }
            mo65704k4(this.f47068kk, 0, C14080ne.m66936k4(bArr, i, i7, this.f47068kk, 0));
            i += i7;
        }
    }
}
