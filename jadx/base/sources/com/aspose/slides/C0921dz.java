package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.dz */
/* JADX INFO: loaded from: classes3.dex */
final class C0921dz extends AbstractC0868cs {

    /* JADX INFO: renamed from: fa */
    private InterfaceC1182h2<oss> f4696fa;

    /* JADX INFO: renamed from: k4 */
    private final C14327q4 f4697k4;

    /* JADX INFO: renamed from: up */
    private oju f4698up;

    public C0921dz(MathFraction mathFraction, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathFraction, interfaceC0851ce, c14327q4.Clone());
        C14327q4 c14327q42 = new C14327q4();
        this.f4697k4 = c14327q42;
        this.f4698up = new oju();
        if (mathFraction.getFractionType() != 3) {
            throw new ArgumentException();
        }
        c14327q4.CloneTo(c14327q42);
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        h2y h2yVarClone = ((AbstractC0868cs) this).f4432to.m5578h4().Clone();
        h2y h2yVarClone2 = this.f4429du.m5578h4().Clone();
        wsf wsfVarClone = h2yVarClone.f5390x1.Clone();
        wsf wsfVarClone2 = h2yVarClone2.f5390x1.Clone();
        InterfaceC1182h2<oss> interfaceC1182h2Mo64920k4 = mo4555du().m69386k4().mo64920k4(IOUtils.DIR_SEPARATOR_UNIX, this.f4697k4.f48231du, (wsfVarClone.f49849k4 + wsfVarClone2.f49849k4) / 2.0f);
        this.f4696fa = interfaceC1182h2Mo64920k4;
        float fM68101c5 = (interfaceC1182h2Mo64920k4.mo6969k4().f47913kk / 2.0f) + this.f4430h4.m68101c5();
        wsf wsfVar = new wsf(fM68101c5, this.f4696fa.mo6969k4().f47913kk - fM68101c5);
        wsf wsfVarClone3 = wsf.m72910k4(wsfVarClone.Clone(), wsfVarClone2.Clone()).Clone();
        wsf.m72910k4(wsfVarClone3.Clone(), wsfVar.Clone()).CloneTo(wsfVarClone3);
        oju ojuVar2 = new oju(h2yVarClone.f5389k4 + this.f4696fa.mo6969k4().f47912k4, wsfVarClone3.f49849k4 - wsfVarClone2.f49849k4);
        float f = wsfVarClone3.f49849k4 - wsfVarClone.f49849k4;
        this.f4698up = new oju(h2yVarClone.f5389k4, wsfVarClone3.f49849k4 - wsfVar.f49849k4);
        ((AbstractC0868cs) this).f4432to.m5584x1(0.0f, f);
        this.f4429du.m5585x1(ojuVar2.Clone());
        h2y h2yVar = new h2y();
        h2yVar.f5389k4 = ojuVar2.f47836k4 + h2yVarClone2.f5389k4;
        wsfVarClone3.CloneTo(h2yVar.f5390x1);
        return h2yVar;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public void mo3976k4(yvz yvzVar) {
        pzd pzdVar = new pzd(yvzVar.f50411k4);
        try {
            AbstractC14897zn abstractC14897zn = yvzVar.f50411k4;
            oju ojuVar = this.f4698up;
            abstractC14897zn.m74612k4(ojuVar.f47836k4, ojuVar.f47837x1);
            this.f4696fa.mo7635k4(yvzVar.f50411k4, m5580k4(yvzVar.f50412x1));
            pzdVar.dispose();
            super.mo3976k4(yvzVar.Clone());
        } catch (Throwable th) {
            pzdVar.dispose();
            throw th;
        }
    }
}
