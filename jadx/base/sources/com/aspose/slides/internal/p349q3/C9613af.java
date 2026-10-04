package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12348um;
import com.aspose.slides.internal.p488x0.C12350uz;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.af */
/* JADX INFO: loaded from: classes4.dex */
public class C9613af extends AbstractC9615ak {

    /* JADX INFO: renamed from: k4 */
    private C12350uz f34770k4;

    /* JADX INFO: renamed from: x1 */
    private C12348um f34771x1;

    public C9613af(C9723vw c9723vw) {
        super(c9723vw);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m46945k4((C9613af) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12350uz c12350uz = this.f34770k4;
        int iHashCode2 = (iHashCode ^ (c12350uz != null ? c12350uz.hashCode() : 0)) * 397;
        C12348um c12348um = this.f34771x1;
        return iHashCode2 ^ (c12348um != null ? c12348um.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12350uz m46942k4() {
        return this.f34770k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C12348um m46946x1() {
        return this.f34771x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46943k4(C12348um c12348um) {
        this.f34771x1 = c12348um;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46944k4(C12350uz c12350uz) {
        this.f34770k4 = c12350uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m46945k4(C9613af c9613af) {
        return m47765k4((C9723vw) c9613af) && C14067j2.m66728k4(this.f34770k4, c9613af.f34770k4) && C14067j2.m66728k4(this.f34771x1, c9613af.f34771x1);
    }
}
