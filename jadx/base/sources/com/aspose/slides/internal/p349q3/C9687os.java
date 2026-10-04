package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6279m9;
import com.aspose.slides.internal.p500xi.C12530dy;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.os */
/* JADX INFO: loaded from: classes4.dex */
public class C9687os extends C9724w6 {

    /* JADX INFO: renamed from: k4 */
    private C6279m9 f35050k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f35051x1;

    public C9687os(C9687os c9687os) {
        super((C9724w6) c9687os);
        this.f35050k4 = new C6279m9();
        m47555k4(c9687os.f35050k4);
        m47557kk(c9687os.m47558m9());
    }

    @Override // com.aspose.slides.internal.p349q3.C9724w6, com.aspose.slides.internal.p349q3.C9723vw
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
        return m47556k4((C9687os) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final C6279m9 m47554h4() {
        return this.f35050k4;
    }

    @Override // com.aspose.slides.internal.p349q3.C9724w6, com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C6279m9 c6279m9 = this.f35050k4;
        int iHashCode2 = (iHashCode ^ (c6279m9 != null ? c6279m9.hashCode() : 0)) * 397;
        byte[] bArr = this.f35051x1;
        return iHashCode2 ^ (bArr != null ? AbstractC14092to.m67208k4((Object) bArr).hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47555k4(C6279m9 c6279m9) {
        this.f35050k4 = c6279m9;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47557kk(byte[] bArr) {
        this.f35051x1 = bArr;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte[] m47558m9() {
        return this.f35051x1;
    }

    public C9687os(C9724w6 c9724w6) {
        super(c9724w6);
        this.f35050k4 = new C6279m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47556k4(C9687os c9687os) {
        return m47773k4((C9724w6) c9687os) && C14067j2.m66728k4(this.f35050k4, c9687os.f35050k4) && C12530dy.m58330k4(this.f35051x1, c9687os.f35051x1);
    }
}
