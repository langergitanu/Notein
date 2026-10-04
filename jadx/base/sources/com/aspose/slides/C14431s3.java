package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.s3 */
/* JADX INFO: loaded from: classes3.dex */
final class C14431s3 extends AbstractC0868cs {

    /* JADX INFO: renamed from: fa */
    private oju f48752fa;

    /* JADX INFO: renamed from: k4 */
    public C14347qi f48753k4;

    /* JADX INFO: renamed from: up */
    private float f48754up;

    /* JADX INFO: renamed from: yj */
    private float f48755yj;

    public C14431s3(MathFraction mathFraction, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathFraction, interfaceC0851ce, c14327q4.Clone());
        this.f48753k4 = new C14347qi();
        this.f48752fa = new oju();
        if (mathFraction.getFractionType() != 1 && mathFraction.getFractionType() != 4) {
            throw new ArgumentException();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final el1 m70433k4() {
        return ((AbstractC0868cs) this).f4432to;
    }

    /* JADX INFO: renamed from: kk */
    public final float m70434kk() {
        return this.f48754up;
    }

    /* JADX INFO: renamed from: x1 */
    public final el1 m70435x1() {
        return this.f4429du;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        h2y h2yVarClone = ((AbstractC0868cs) this).f4432to.m5578h4().Clone();
        h2y h2yVarClone2 = this.f4429du.m5578h4().Clone();
        C1119fs c1119fs = new C1119fs();
        c1119fs.f5120k4 = this.f4430h4.m68101c5();
        c1119fs.f5123x1 = this.f4430h4.m68110m9();
        c1119fs.f5121kk = this.f4430h4.m68104dy();
        c1119fs.f5122to = this.f4430h4.m68103du();
        c1119fs.f5119du = this.f4430h4.m68106h4();
        float f = ((AbstractC0868cs) this).f4431kk / 96.0f;
        if (((AbstractC0868cs) this).f4433x1.f48241x1 == 0 && !C7019kk.m27469x1(this.f4821ck, C14431s3.class)) {
            float f2 = 14.0f * f;
            c1119fs.f5123x1 += f2;
            c1119fs.f5119du += f2;
            c1119fs.f5122to = 73.0f * f;
            if (h2yVarClone2.f5390x1.f49849k4 > ((AbstractC0868cs) this).f4431kk) {
                c1119fs.f5121kk *= 2.0f;
            }
            if (((AbstractC0868cs) this).f4433x1.f48238m9) {
                c1119fs.f5119du = (17.0f * f) + this.f4430h4.m68106h4();
            }
        }
        if (C7019kk.m27469x1(((AbstractC0868cs) this).f4432to, C14431s3.class)) {
            c1119fs.f5123x1 = 12.0f * f;
        }
        if (((AbstractC0868cs) this).f4433x1.f48241x1 > 0 && !C7019kk.m27469x1(this.f4821ck, C14431s3.class)) {
            c1119fs.f5123x1 *= 0.5f;
            c1119fs.f5121kk *= 0.8f;
            c1119fs.f5119du = (5.0f * f) + c1119fs.f5119du;
            c1119fs.f5122to = (f * 2.0f) + c1119fs.f5122to;
        }
        float fM68108jd = this.f4430h4.m68108jd();
        float f3 = fM68108jd / 2.0f;
        C0856ci.m4591k4(h2yVarClone.f5390x1.Clone(), h2yVarClone2.f5390x1.Clone(), f3, c1119fs.Clone()).CloneTo(this.f48753k4);
        this.f48755yj = c1119fs.f5120k4;
        h2y h2yVar = new h2y();
        h2yVar.f5389k4 = C14116yg.m67481k4(h2yVarClone.f5389k4, h2yVarClone2.f5389k4);
        C0856ci.m4592k4(h2yVarClone.f5390x1.Clone(), h2yVarClone2.f5390x1.Clone(), f3, c1119fs.Clone(), this.f48753k4.Clone()).CloneTo(h2yVar.f5390x1);
        oju ojuVar2 = this.f48752fa;
        ojuVar2.f47837x1 = fM68108jd;
        ojuVar2.f47836k4 = h2yVar.f5389k4;
        this.f48754up = h2yVar.f5390x1.f49849k4 - c1119fs.f5120k4;
        if (!mo4555du().f48222h4.m1999k4()) {
            this.f48754up -= fM68108jd;
        }
        oju ojuVar3 = new oju();
        ojuVar3.f47836k4 = (h2yVar.f5389k4 - h2yVarClone.f5389k4) / 2.0f;
        ojuVar3.f47837x1 = (h2yVar.f5390x1.f49849k4 - h2yVarClone.f5390x1.f49849k4) - this.f48753k4.f48325k4;
        oju ojuVar4 = new oju();
        ojuVar4.f47836k4 = (h2yVar.f5389k4 - h2yVarClone2.f5389k4) / 2.0f;
        ojuVar4.f47837x1 = (h2yVar.f5390x1.f49849k4 - h2yVarClone2.f5390x1.f49849k4) + this.f48753k4.f48326x1;
        if (!mo4555du().f48222h4.m1999k4()) {
            ojuVar4 = new oju();
            ojuVar4.f47836k4 = (h2yVar.f5389k4 - h2yVarClone2.f5389k4) / 2.0f;
            ojuVar4.f47837x1 = ((h2yVar.f5390x1.f49849k4 - h2yVarClone2.f5390x1.f49849k4) + this.f48753k4.f48326x1) - (f3 * 2.0f);
        }
        this.f4429du.m5585x1(ojuVar4.Clone());
        ((AbstractC0868cs) this).f4432to.m5585x1(ojuVar3.Clone());
        return h2yVar;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public void mo3976k4(yvz yvzVar) {
        if (m4801to().getFractionType() == 1) {
            float f = this.f48754up;
            float fM68108jd = this.f4430h4.m68108jd();
            yvzVar.f50411k4.mo68794k4(new C12007ix(0.0f, f - (fM68108jd / 2.0f), this.f48752fa.f47836k4, fM68108jd), (azo) null, new C0962es(((C11999ar) m5580k4(yvzVar.f50412x1)).m56305h4().Clone()));
        }
        super.mo3976k4(yvzVar.Clone());
    }
}
