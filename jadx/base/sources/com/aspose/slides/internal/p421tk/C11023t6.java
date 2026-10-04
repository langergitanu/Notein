package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p026an.C1497to;
import com.aspose.slides.internal.p539z4.C13366ca;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.t6 */
/* JADX INFO: loaded from: classes4.dex */
public class C11023t6 extends AbstractC11024to {

    /* JADX INFO: renamed from: k4 */
    private C13366ca f38354k4;

    public C11023t6() {
        m53208x1((short) 16434);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
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
        return m53379k4((C11023t6) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C13366ca c13366ca = this.f38354k4;
        return iHashCode ^ (c13366ca != null ? c13366ca.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53378k4(C13366ca c13366ca) {
        this.f38354k4 = c13366ca;
    }

    /* JADX INFO: renamed from: kk */
    public final byte m53380kk() {
        return m53382k4();
    }

    /* JADX INFO: renamed from: to */
    public final C13366ca m53381to() {
        return this.f38354k4;
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        return C14113y2.m67402k4("{0}, ClipRect: {1}, Cm: {2}", super.toString(), this.f38354k4, C14042ak.m66410k4(C1497to.class, m53380kk()));
    }

    public C11023t6(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53379k4(C11023t6 c11023t6) {
        return m53202k4((C10988bz) c11023t6) && C14067j2.m66728k4(this.f38354k4, c11023t6.f38354k4);
    }
}
