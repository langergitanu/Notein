package com.aspose.slides;

import OooOoO.C20503OooO00o;
import com.aspose.slides.p559ms.System.C14116yg;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.gh */
/* JADX INFO: loaded from: classes3.dex */
final class C1144gh extends AbstractC0868cs {

    /* JADX INFO: renamed from: fa */
    private InterfaceC1182h2<oss> f5247fa;

    /* JADX INFO: renamed from: k4 */
    private final C14327q4 f5248k4;

    /* JADX INFO: renamed from: up */
    private oju f5249up;

    public C1144gh(MathFraction mathFraction, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathFraction, interfaceC0851ce, c14327q4.Clone());
        C14327q4 c14327q42 = new C14327q4();
        this.f5248k4 = c14327q42;
        this.f5249up = new oju();
        c14327q4.CloneTo(c14327q42);
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        h2y h2yVarClone = ((AbstractC0868cs) this).f4432to.m5578h4().Clone();
        h2y h2yVarClone2 = this.f4429du.m5578h4().Clone();
        wsf wsfVarClone = h2yVarClone.f5390x1.Clone();
        wsf wsfVarClone2 = h2yVarClone2.f5390x1.Clone();
        C1119fs c1119fs = new C1119fs();
        c1119fs.f5120k4 = this.f4430h4.m68101c5();
        c1119fs.f5123x1 = 0.0f;
        c1119fs.f5121kk = this.f4430h4.m68104dy();
        c1119fs.f5122to = 0.0f;
        c1119fs.f5119du = 0.0f;
        C14347qi c14347qiClone = C0856ci.m4591k4(wsfVarClone.Clone(), wsfVarClone2.Clone(), 0.0f, c1119fs.Clone()).Clone();
        wsf wsfVarClone3 = C0856ci.m4592k4(wsfVarClone.Clone(), wsfVarClone2.Clone(), 0.0f, c1119fs.Clone(), c14347qiClone.Clone()).Clone();
        float f = wsfVarClone3.f49849k4;
        float f2 = wsfVarClone.f49849k4;
        float f3 = (f - f2) - c14347qiClone.f48325k4;
        this.f5247fa = mo4555du().m69386k4().mo64920k4(IOUtils.DIR_SEPARATOR_UNIX, this.f5248k4.f48231du, (f2 + wsfVarClone2.f49849k4) * 0.7f);
        float fM68102ck = this.f4430h4.m68102ck();
        this.f5249up = new oju(C20503OooO00o.OooO0O0(fM68102ck, this.f5247fa.mo6969k4().f47912k4, 2.0f, h2yVarClone.f5389k4), wsfVarClone.m72912k4() - (this.f4430h4.m63562kk() / 2.0f));
        float f4 = h2yVarClone.f5389k4 + fM68102ck;
        float f5 = (wsfVarClone3.f49849k4 - wsfVarClone2.f49849k4) + c14347qiClone.f48326x1;
        ((AbstractC0868cs) this).f4432to.m5584x1(0.0f, f3);
        this.f4429du.m5584x1(f4, f5);
        h2y h2yVar = new h2y();
        h2yVar.f5389k4 = C14116yg.m67481k4(h2yVarClone.f5389k4, f4 + h2yVarClone2.f5389k4);
        wsfVarClone3.CloneTo(h2yVar.f5390x1);
        return h2yVar;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public void mo3976k4(yvz yvzVar) {
        pzd pzdVar = new pzd(yvzVar.f50411k4);
        try {
            AbstractC14897zn abstractC14897zn = yvzVar.f50411k4;
            oju ojuVar = this.f5249up;
            abstractC14897zn.m74612k4(ojuVar.f47836k4, ojuVar.f47837x1);
            this.f5247fa.mo7635k4(yvzVar.f50411k4, m5580k4(yvzVar.f50412x1));
            pzdVar.dispose();
            super.mo3976k4(yvzVar.Clone());
        } catch (Throwable th) {
            pzdVar.dispose();
            throw th;
        }
    }
}
