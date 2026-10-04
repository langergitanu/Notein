package com.aspose.slides.internal.p539z4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p026an.C1480fa;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ts */
/* JADX INFO: loaded from: classes5.dex */
public final class C13409ts extends AbstractC13376gf {

    /* JADX INFO: renamed from: k4 */
    private int f44859k4;

    /* JADX INFO: renamed from: x1 */
    private int f44860x1;

    public C13409ts() {
        m62347k4(900097);
        this.f44859k4 = 2;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13409ts.class) && m62348k4((C13409ts) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 4;
    }

    public int hashCode() {
        return (this.f44859k4 * 397) ^ this.f44860x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m62350k4() {
        return this.f44860x1;
    }

    public String toString() {
        return C14113y2.m67402k4("GraphicsVersion: {0}, MetafileSignature: {1:X5}", C14042ak.m66410k4(C1480fa.class, this.f44859k4), Integer.valueOf(this.f44860x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m62351x1() {
        return this.f44859k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m62347k4(int i) {
        if (i != 900097) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f44860x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m62349x1(int i) {
        this.f44859k4 = i;
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13376gf
    /* JADX INFO: renamed from: k4 */
    public void mo62106k4(Object obj) {
        int iIntValue = ((Integer) C7019kk.m27464to(obj, Integer.TYPE)).intValue();
        m62347k4((int) ((((long) iIntValue) & 4294963200L) >> 12));
        m62349x1(iIntValue & 4095);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62348k4(C13409ts c13409ts) {
        return this.f44859k4 == c13409ts.f44859k4 && this.f44860x1 == c13409ts.f44860x1;
    }
}
