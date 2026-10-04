package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p150gi.AbstractC4282kp;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.b3 */
/* JADX INFO: loaded from: classes3.dex */
public class C3509b3 extends AbstractC3533um {

    /* JADX INFO: renamed from: kk */
    private AbstractC4282kp[] f9746kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC4282kp[] f9747x1;

    public C3509b3(AbstractC3524ks abstractC3524ks, AbstractC3533um abstractC3533um) {
        super(abstractC3524ks, abstractC3533um);
        this.f9747x1 = new AbstractC4282kp[302];
        this.f9746kk = new AbstractC4282kp[302];
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3533um
    /* JADX INFO: renamed from: k4 */
    public AbstractC4282kp mo14063k4(int i, boolean z, boolean z2) {
        AbstractC4282kp abstractC4282kp = this.f9746kk[i];
        if (abstractC4282kp != null) {
            return abstractC4282kp;
        }
        AbstractC4282kp abstractC4282kpMo14063k4 = super.mo14063k4(i, z, z2);
        this.f9746kk[i] = abstractC4282kpMo14063k4;
        return abstractC4282kpMo14063k4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3533um
    /* JADX INFO: renamed from: x1 */
    public AbstractC4282kp mo14065x1(int i) {
        return this.f9747x1[i];
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3533um
    /* JADX INFO: renamed from: k4 */
    public void mo14064k4(int i, AbstractC4282kp abstractC4282kp) {
        this.f9747x1[i] = abstractC4282kp;
        AbstractC4282kp[] abstractC4282kpArr = this.f9746kk;
        if (abstractC4282kpArr[i] != null) {
            abstractC4282kpArr[i] = abstractC4282kp;
        }
    }
}
