package com.aspose.slides.internal.p447up;

import com.aspose.slides.internal.p231kk.AbstractC5803to;
import com.aspose.slides.internal.p231kk.C5784dy;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p517y2.C12786x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.up.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11536kk extends AbstractC11535k4 {

    /* JADX INFO: renamed from: k4 */
    public AbstractC5803to f39026k4;

    /* JADX INFO: renamed from: x1 */
    public AbstractC5803to f39027x1;

    public C11536kk(AbstractC5803to abstractC5803to, AbstractC5803to abstractC5803to2) {
        super((short) 29);
        this.f39026k4 = abstractC5803to;
        this.f39027x1 = abstractC5803to2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11536kk m54522k4(AbstractC5803to abstractC5803to, AbstractC5803to abstractC5803to2) {
        return new C11536kk(abstractC5803to, abstractC5803to2);
    }

    @Override // com.aspose.slides.internal.p447up.AbstractC11535k4
    /* JADX INFO: renamed from: dy */
    public C5784dy mo54521dy() {
        return new C5784dy(this.f39026k4, this.f39027x1);
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: h4 */
    public String mo23414h4() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(this.f39026k4.mo23414h4());
        AbstractC5803to abstractC5803to = this.f39027x1;
        if (abstractC5803to != null) {
            c6765kp.m26792k4(C14113y2.m67408k4(" ", abstractC5803to.mo23414h4()));
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5788h4
    /* JADX INFO: renamed from: k4 */
    public void mo23415k4(String str) {
        throw new C12786x1((byte) 15);
    }
}
