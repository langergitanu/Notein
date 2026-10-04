package com.aspose.slides.internal.p550zi;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.aspose.slides.internal.p385rr.C10053x1;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.c5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13594c5 implements InterfaceC6901du {

    /* JADX INFO: renamed from: k4 */
    private int[] f45148k4;

    /* JADX INFO: renamed from: kk */
    private boolean f45149kk;

    /* JADX INFO: renamed from: x1 */
    private C13602jd f45150x1;

    public C13594c5(int[] iArr) {
        this(iArr, false);
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6901du
    /* JADX INFO: renamed from: k4 */
    public int mo27029k4() {
        return this.f45148k4.length;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6901du
    /* JADX INFO: renamed from: x1 */
    public int mo27031x1(int i) {
        int[] iArr = this.f45148k4;
        if (i >= iArr.length || i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "The specified index lies out of the entries length.");
        }
        return iArr[i];
    }

    public C13594c5(int[] iArr, boolean z) {
        m62709k4(iArr, z);
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6901du
    /* JADX INFO: renamed from: k4 */
    public int mo27030k4(int i) {
        return this.f45150x1.mo49686k4(i);
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6901du
    /* JADX INFO: renamed from: x1 */
    public int[] mo27032x1() {
        int[] iArrM49684k4 = C10052k4.m49684k4(this.f45148k4.length);
        int[] iArr = this.f45148k4;
        System.arraycopy(iArr, 0, iArrM49684k4, 0, iArr.length);
        return iArrM49684k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m62709k4(int[] iArr, boolean z) {
        C13602jd c13602jd;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                c13602jd = new C13602jd(iArr);
                break;
            } else {
                if (((iArr[i] >> 24) & 255) != 255) {
                    c13602jd = new C10053x1(iArr);
                    break;
                }
                i++;
            }
        }
        this.f45150x1 = c13602jd;
        this.f45148k4 = iArr;
        this.f45149kk = z;
    }
}
