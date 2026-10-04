package com.aspose.slides.internal.p184ik;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ik.up */
/* JADX INFO: loaded from: classes.dex */
public class C5100up extends AbstractC7020m9<C5100up> {

    /* JADX INFO: renamed from: k4 */
    private C5092dy[] f14035k4;

    /* JADX INFO: renamed from: x1 */
    private int f14036x1;

    public C5100up() {
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
        if (obj instanceof C5100up) {
            return m21880x1((C5100up) obj);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC5089c5.m21750k4(this.f14035k4, this.f14036x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C5100up c5100up) {
        if (c5100up == null) {
            c5100up = new C5100up();
        }
        c5100up.f14035k4 = this.f14035k4;
        c5100up.f14036x1 = this.f14036x1;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C5100up Clone() {
        C5100up c5100up = new C5100up();
        CloneTo(c5100up);
        return c5100up;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m21884x1() {
        return this.f14036x1;
    }

    public C5100up(C5092dy[] c5092dyArr, int i) {
        this.f14035k4 = c5092dyArr;
        this.f14036x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m21880x1(C5100up c5100up) {
        return C14067j2.m66728k4(c5100up.f14035k4, this.f14035k4) && c5100up.f14036x1 == this.f14036x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final C5092dy[] m21882k4() {
        return this.f14035k4;
    }
}
