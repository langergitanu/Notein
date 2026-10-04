package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: loaded from: classes3.dex */
class jlf {

    /* JADX INFO: renamed from: k4 */
    private final com.aspose.slides.internal.p332p7.rsv f45533k4;

    /* JADX INFO: renamed from: x1 */
    private final com.aspose.slides.internal.p332p7.nk7 f45534x1;

    public jlf(com.aspose.slides.internal.p332p7.nk7 nk7Var) {
        if (nk7Var == null) {
            throw new ArgumentNullException("drawingPageProperties");
        }
        this.f45533k4 = null;
        this.f45534x1 = nk7Var;
    }

    /* JADX INFO: renamed from: k4 */
    private void m63417k4() {
        int i = this.f45533k4 != null ? 1 : 0;
        if (this.f45534x1 != null) {
            i++;
        }
        if (i != 1) {
            throw new InvalidOperationException("Only single owner of OdpPictureFillFormatSerializationContext allowed");
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m63418c5(String str) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40511v4(str);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37662x1(str);
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m63419du(String str) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40446ak(str);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37652m9(str);
        }
    }

    /* JADX INFO: renamed from: dy */
    public final void m63420dy(String str) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40523xk(str);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37630c5(str);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m63421h4(String str) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40452bv(str);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37645k4(str);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m63424kk(int i) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40472h4(i);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37644k4(i);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m63426m9(String str) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40460dq(str);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37636dy(str);
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m63427to(String str) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40516wy(str);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37640h4(str);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63428x1(int i) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40465dy(i);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37648kk(i);
        }
    }

    public jlf(com.aspose.slides.internal.p332p7.rsv rsvVar) {
        if (rsvVar == null) {
            throw new ArgumentNullException("graphicProperties");
        }
        this.f45533k4 = rsvVar;
        this.f45534x1 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63422k4(int i) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40490m9(i);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37661x1(i);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m63425kk(String str) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40450b3(str);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37634du(str);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m63429x1(String str) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40525yd(str);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37657to(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63423k4(String str) {
        m63417k4();
        com.aspose.slides.internal.p332p7.rsv rsvVar = this.f45533k4;
        if (rsvVar != null) {
            rsvVar.m40488lr(str);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = this.f45534x1;
        if (nk7Var != null) {
            nk7Var.m37649kk(str);
        }
    }
}
