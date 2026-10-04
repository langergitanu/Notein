package com.aspose.slides.internal.p513xw;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.f9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12696f9 extends C12717os {

    /* JADX INFO: renamed from: k4 */
    private C12717os f42235k4;

    public C12696f9(InterfaceC12711lr interfaceC12711lr, C12717os c12717os) {
        super(interfaceC12711lr);
        this.f42235k4 = c12717os;
    }

    @Override // com.aspose.slides.internal.p513xw.C12717os
    /* JADX INFO: renamed from: kk */
    public C12717os mo58860kk() {
        return this.f42235k4;
    }

    @Override // com.aspose.slides.internal.p513xw.C12717os
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4("NonLeafPos:").m26805kk(m59073du()).m26792k4("(");
        c6765kp.m26792k4(m59074h4());
        c6765kp.m26792k4(", ");
        c6765kp.m26792k4(mo58860kk() != null ? mo58860kk().toString() : CloudMetaExtra.DEFINE_NON_PARENT_ID);
        c6765kp.m26792k4(")");
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p513xw.C12717os
    /* JADX INFO: renamed from: w_ */
    public boolean mo48915w_() {
        C12717os c12717os = this.f42235k4;
        if (c12717os != null) {
            return c12717os.mo48915w_();
        }
        return false;
    }
}
