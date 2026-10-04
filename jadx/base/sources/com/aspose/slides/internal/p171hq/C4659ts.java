package com.aspose.slides.internal.p171hq;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p396sc.C10182fa;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ts */
/* JADX INFO: loaded from: classes.dex */
public final class C4659ts extends AbstractC4626gf {

    /* JADX INFO: renamed from: k4 */
    private int f13006k4;

    /* JADX INFO: renamed from: x1 */
    private int f13007x1;

    public C4659ts() {
        m19360k4(900097);
        this.f13006k4 = 2;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C4659ts.class) && m19361k4((C4659ts) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 4;
    }

    public int hashCode() {
        return (this.f13006k4 * 397) ^ this.f13007x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19363k4() {
        return this.f13007x1;
    }

    public String toString() {
        return C14113y2.m67402k4("GraphicsVersion: {0}, MetafileSignature: {1:X5}", C14042ak.m66410k4(C10182fa.class, this.f13006k4), Integer.valueOf(this.f13007x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19364x1() {
        return this.f13006k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m19360k4(int i) {
        if (i != 900097) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f13007x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m19362x1(int i) {
        this.f13006k4 = i;
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4626gf
    /* JADX INFO: renamed from: k4 */
    public void mo19106k4(Object obj) {
        int iIntValue = ((Integer) C7019kk.m27464to(obj, Integer.TYPE)).intValue();
        m19360k4((int) ((((long) iIntValue) & 4294963200L) >> 12));
        m19362x1(iIntValue & 4095);
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m19361k4(C4659ts c4659ts) {
        return this.f13006k4 == c4659ts.f13006k4 && this.f13007x1 == c4659ts.f13007x1;
    }
}
