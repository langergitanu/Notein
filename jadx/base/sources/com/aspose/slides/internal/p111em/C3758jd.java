package com.aspose.slides.internal.p111em;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.em.jd */
/* JADX INFO: loaded from: classes.dex */
public class C3758jd extends AbstractC7020m9<C3758jd> {

    /* JADX INFO: renamed from: du */
    public String f10274du;

    /* JADX INFO: renamed from: k4 */
    public String f10275k4;

    /* JADX INFO: renamed from: kk */
    public String f10276kk;

    /* JADX INFO: renamed from: to */
    public String f10277to;

    /* JADX INFO: renamed from: x1 */
    public String f10278x1;

    /* JADX INFO: renamed from: x1 */
    private boolean m15073x1(C3758jd c3758jd) {
        return C14067j2.m66728k4(c3758jd.f10275k4, this.f10275k4) && C14067j2.m66728k4(c3758jd.f10278x1, this.f10278x1) && C14067j2.m66728k4(c3758jd.f10276kk, this.f10276kk) && C14067j2.m66728k4(c3758jd.f10277to, this.f10277to) && C14067j2.m66728k4(c3758jd.f10274du, this.f10274du);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C3758jd) {
            return m15073x1((C3758jd) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3758jd Clone() {
        C3758jd c3758jd = new C3758jd();
        CloneTo(c3758jd);
        return c3758jd;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C3758jd c3758jd) {
        c3758jd.f10275k4 = this.f10275k4;
        c3758jd.f10278x1 = this.f10278x1;
        c3758jd.f10276kk = this.f10276kk;
        c3758jd.f10277to = this.f10277to;
        c3758jd.f10274du = this.f10274du;
    }
}
