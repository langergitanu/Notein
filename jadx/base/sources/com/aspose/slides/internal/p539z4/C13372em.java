package com.aspose.slides.internal.p539z4;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.em */
/* JADX INFO: loaded from: classes5.dex */
public final class C13372em extends C13407to {

    /* JADX INFO: renamed from: k4 */
    private short f44743k4;

    /* JADX INFO: renamed from: x1 */
    private short f44744x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        return C7019kk.m27469x1(obj, C13372em.class) && m62091k4((C13372em) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.C13407to, com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 4;
    }

    public int hashCode() {
        return (C14088s7.m67172k4(this.f44743k4) * 397) ^ C14088s7.m67172k4(this.f44744x1);
    }

    @Override // com.aspose.slides.internal.p539z4.C13407to
    /* JADX INFO: renamed from: k4 */
    public C12025x6 mo62092k4() {
        return new C12025x6(this.f44743k4, this.f44744x1);
    }

    /* JADX INFO: renamed from: kk */
    public final short m62094kk() {
        return this.f44744x1;
    }

    public String toString() {
        return C14113y2.m67402k4("X: {0}, Y: {1}", Short.valueOf(this.f44743k4), Short.valueOf(this.f44744x1));
    }

    /* JADX INFO: renamed from: x1 */
    public final short m62095x1() {
        return this.f44743k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62093k4(short s) {
        this.f44743k4 = s;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62096x1(short s) {
        this.f44744x1 = s;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m62091k4(C13372em c13372em) {
        return this.f44743k4 == c13372em.f44743k4 && this.f44744x1 == c13372em.f44744x1;
    }
}
