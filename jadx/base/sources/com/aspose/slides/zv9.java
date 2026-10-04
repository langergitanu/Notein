package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3104x5;
import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p148gb.C4251h4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p248lf.AbstractC6030h4;
import com.aspose.slides.internal.p248lf.AbstractC6032kk;
import com.aspose.slides.internal.p248lf.AbstractC6033m9;
import com.aspose.slides.internal.p248lf.C6029du;
import com.aspose.slides.internal.p248lf.C6035x1;
import com.aspose.slides.internal.p248lf.InterfaceC6031k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class zv9 extends AbstractC6030h4 {

    /* JADX INFO: renamed from: c5 */
    private C6029du f50750c5;

    /* JADX INFO: renamed from: ck */
    private float f50751ck;

    /* JADX INFO: renamed from: dy */
    private final no7 f50752dy;

    /* JADX INFO: renamed from: fa */
    private AutoShape f50753fa;

    /* JADX INFO: renamed from: jd */
    private float f50754jd;

    public zv9(no7 no7Var) {
        super(no7Var.m68141k4(), no7Var.m68147x1(), no7Var.m68145kk(), no7Var.m68146to());
        this.f50750c5 = null;
        this.f50752dy = no7Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m74844k4() {
        return this.f17107k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m74845x1() {
        return this.f17111x1;
    }

    @Override // com.aspose.slides.internal.p248lf.AbstractC6030h4
    /* JADX INFO: renamed from: k4 */
    public AbstractC6032kk mo24344k4(C6029du c6029du, C6035x1 c6035x1) {
        return new glt(c6035x1, c6029du);
    }

    @Override // com.aspose.slides.internal.p248lf.AbstractC6030h4
    /* JADX INFO: renamed from: k4 */
    public AbstractC6033m9 mo24345k4(C6029du c6029du, C5659x1 c5659x1) {
        if (c6029du.f17088jd) {
            c6029du.f17083du /= 1.3f;
            c6029du.f17084dy = C14113y2.m67358c5(c6029du.f17084dy);
            c5659x1 = new C5659x1(c6029du.f17083du, c5659x1.m23125x1(), c5659x1.m23120k4());
        }
        return new C3104x5(c5659x1, c6029du);
    }

    @Override // com.aspose.slides.internal.p248lf.AbstractC6030h4
    /* JADX INFO: renamed from: k4 */
    public void mo24349k4(C3181c5 c3181c5, String str, C12015qq c12015qq, C6029du c6029du, InterfaceC6031k4 interfaceC6031k4, boolean z) {
        zv9 zv9Var;
        C6029du c6029du2;
        if (z) {
            zv9Var = this;
            c6029du2 = c6029du;
        } else {
            m24348k4(c3181c5, interfaceC6031k4);
            if (this.f50753fa != null && this.f50751ck == this.f17111x1 && this.f50750c5.m24340k4(c6029du)) {
                zv9Var = this;
                this.f50752dy.m68142k4(this.f50753fa, zv9Var, c3181c5, C14113y2.m67408k4(" ", str), c6029du, interfaceC6031k4);
                c6029du2 = c6029du;
            } else {
                zv9Var = this;
                c6029du2 = c6029du;
                zv9Var.f50753fa = zv9Var.f50752dy.m68140k4(zv9Var, c3181c5, str, c6029du2, interfaceC6031k4);
            }
        }
        zv9Var.f50750c5 = c6029du2;
        zv9Var.f50754jd = zv9Var.f17107k4;
        zv9Var.f50751ck = zv9Var.f17111x1;
    }

    @Override // com.aspose.slides.internal.p248lf.AbstractC6030h4
    /* JADX INFO: renamed from: k4 */
    public void mo24350k4(C4251h4 c4251h4, C12015qq c12015qq) {
    }
}
