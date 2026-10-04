package com.aspose.slides.internal.p421tk;

import com.aspose.slides.internal.p075d5.C3022m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p539z4.AbstractC13369du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tk.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C11013ne extends AbstractC11027u4 {

    /* JADX INFO: renamed from: k4 */
    private long f38345k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC13369du[] f38346x1;

    public C11013ne() {
        m53208x1((short) 16395);
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC13369du[] m53344dy() {
        return this.f38346x1;
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
        return m53347k4((C11013ne) obj);
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public int hashCode() {
        int i = ((int) this.f38345k4) * 397;
        AbstractC13369du[] abstractC13369duArr = this.f38346x1;
        return i ^ (abstractC13369duArr != null ? AbstractC14092to.m67208k4((Object) abstractC13369duArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53345k4(long j) {
        this.f38345k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m53348kk() {
        return m53198h4(14);
    }

    /* JADX INFO: renamed from: m9 */
    public final long m53349m9() {
        return this.f38345k4;
    }

    /* JADX INFO: renamed from: to */
    public final byte m53350to() {
        return m53199ix();
    }

    @Override // com.aspose.slides.internal.p421tk.C10988bz
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        for (AbstractC13369du abstractC13369du : m53344dy()) {
            c6765kp.m26792k4(C14113y2.m67408k4(abstractC13369du.toString(), ", "));
        }
        return C14113y2.m67402k4("{0}, Count: {1}, RectData: {2}", super.toString(), Long.valueOf(this.f38345k4), c6765kp.toString());
    }

    public C11013ne(C10988bz c10988bz) {
        super(c10988bz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53346k4(AbstractC13369du[] abstractC13369duArr) {
        this.f38346x1 = abstractC13369duArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m53347k4(C11013ne c11013ne) {
        return this.f38345k4 == c11013ne.f38345k4 && C3022m9.m12723k4(this.f38346x1, c11013ne.f38346x1);
    }
}
