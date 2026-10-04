package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6271dy;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.em */
/* JADX INFO: loaded from: classes4.dex */
public class C9643em extends C9687os {

    /* JADX INFO: renamed from: k4 */
    private C6271dy f34877k4;

    public C9643em(C9687os c9687os) {
        super(c9687os);
        this.f34877k4 = new C6271dy();
        m47555k4(c9687os.m47554h4());
    }

    /* JADX INFO: renamed from: dy */
    public final C6271dy m47175dy() {
        return this.f34877k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9687os, com.aspose.slides.internal.p349q3.C9724w6, com.aspose.slides.internal.p349q3.C9723vw
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
        return m47176k4((C9643em) obj);
    }

    @Override // com.aspose.slides.internal.p349q3.C9687os, com.aspose.slides.internal.p349q3.C9724w6, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C6271dy c6271dy = this.f34877k4;
        return iHashCode ^ (c6271dy != null ? c6271dy.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47176k4(C9643em c9643em) {
        return m47556k4((C9687os) c9643em) && C14067j2.m66728k4(this.f34877k4, c9643em.f34877k4);
    }
}
