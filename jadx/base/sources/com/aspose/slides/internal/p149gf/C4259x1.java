package com.aspose.slides.internal.p149gf;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.AbstractC3151yd;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p213jw.C5540dy;
import com.aspose.slides.internal.p263m2.InterfaceC6311x1;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.gf.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4259x1 implements InterfaceC6311x1 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f11592k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC3151yd f11593kk;

    /* JADX INFO: renamed from: to */
    private String f11594to;

    /* JADX INFO: renamed from: x1 */
    private String f11595x1;

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f11592k4 = null;
        AbstractC3151yd abstractC3151yd = this.f11593kk;
        if (abstractC3151yd != null) {
            abstractC3151yd.dispose();
            this.f11593kk = null;
        }
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6311x1
    /* JADX INFO: renamed from: k4 */
    public final AbstractC3151yd mo17112k4() {
        return this.f11593kk;
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6311x1
    /* JADX INFO: renamed from: kk */
    public final String mo17114kk() {
        return this.f11595x1;
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6311x1
    /* JADX INFO: renamed from: x1 */
    public final AbstractC3150x6 mo17115x1() {
        return this.f11592k4;
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6311x1
    /* JADX INFO: renamed from: k4 */
    public final void mo17113k4(String str) {
        this.f11595x1 = str;
        this.f11593kk = new C3144um(str);
    }

    @Override // com.aspose.slides.internal.p263m2.InterfaceC6311x1
    /* JADX INFO: renamed from: x1 */
    public final void mo17116x1(String str) {
        this.f11594to = str;
        if (this.f11592k4 != null) {
            this.f11593kk = new C3148wl(this.f11592k4, C14113y2.m67411k4(str) ? C5540dy.f15211k4 : C12555c5.m58553k4(this.f11594to));
        } else if (this.f11595x1 != null) {
            this.f11593kk = new C3144um(this.f11595x1);
        }
    }
}
