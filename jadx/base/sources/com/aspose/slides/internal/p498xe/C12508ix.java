package com.aspose.slides.internal.p498xe;

import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xe.ix */
/* JADX INFO: loaded from: classes5.dex */
public class C12508ix extends C3023to {

    /* JADX INFO: renamed from: k4 */
    private short f41866k4;

    /* JADX INFO: renamed from: x1 */
    private short f41867x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m58122k4((C12508ix) obj);
    }

    public int hashCode() {
        return (C14088s7.m67172k4(this.f41866k4) * 397) ^ C14088s7.m67172k4(this.f41867x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final short m58120k4() {
        return this.f41866k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12016rv m58123kk() {
        return new C12016rv(this.f41866k4, this.f41867x1);
    }

    public String toString() {
        return C14113y2.m67402k4("[X: {0}, Y: {1}]", Short.valueOf(this.f41866k4), Short.valueOf(this.f41867x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6 m58124x1() {
        return new C12025x6(this.f41866k4, this.f41867x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58121k4(short s) {
        this.f41866k4 = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m58125x1(short s) {
        this.f41867x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m58122k4(C12508ix c12508ix) {
        return this.f41866k4 == c12508ix.f41866k4 && this.f41867x1 == c12508ix.f41867x1;
    }
}
