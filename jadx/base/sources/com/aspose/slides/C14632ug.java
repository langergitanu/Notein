package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.ug */
/* JADX INFO: loaded from: classes3.dex */
class C14632ug extends C13743kq {
    public C14632ug(C14365qy c14365qy, IChartWall iChartWall) {
        super(c14365qy, iChartWall);
    }

    @Override // com.aspose.slides.C13743kq
    /* JADX INFO: renamed from: k4 */
    public void mo5519k4() {
        float f;
        C11896dy c11896dy;
        C11896dy c11896dy2;
        C0962es c0962es;
        float f2;
        C12007ix c12007ixClone;
        float fM64117m9;
        C12007ix c12007ixClone2;
        float fM64117m92;
        IChartWall iChartWall = this.f45839x1;
        if (iChartWall == null) {
            return;
        }
        azo azoVarM7718x1 = im9.m7718x1((iChartWall == this.f45834k4.m69834fa().getFloor() ? this.f45834k4.m69834fa().m506k4((byte) 0) : C12003du.f40505to).Clone().Clone(), (LineFormat) this.f45839x1.getFormat().getLine(), this.f45834k4, 1.0f);
        if (azoVarM7718x1.m3903h4()) {
            float f3 = -m64117m9();
            C12007ix c12007ixClone3 = m64119ne().Clone();
            if (this.f45834k4.m69834fa().getRotation3D().getRightAngleAxes()) {
                f = 0.0f;
            } else {
                float depthPercents = ((this.f45834k4.m69834fa().getRotation3D().getDepthPercents() & 65535) / 100.0f) * this.f45834k4.m69833e0().m64102dy();
                f = -OooOOOO.OooO00o(OooOO0O.OooO0O0(this.f45834k4.m69834fa(), 0) & 65535, 100.0f, depthPercents, depthPercents);
                this.f45834k4.m69855qm().CloneTo(c12007ixClone3);
            }
            float f4 = f;
            C1236i2 c1236i2M69832dy = this.f45834k4.m69832dy();
            float fM67491kk = (float) C14116yg.m67491kk(1.0d, azoVarM7718x1.m3906k4());
            if (C14164n2.m67858x1(this.f45834k4.m69834fa().getType())) {
                c11896dy = new C11896dy();
                c11896dy.m55574x1(m64123up(), m64127yj(), m64123up(), m64127yj() + fM67491kk);
                c1236i2M69832dy.m7391k4(c12007ixClone3.Clone(), (C0962es) null, azoVarM7718x1, c11896dy, f3, f4);
                C11896dy c11896dy3 = new C11896dy();
                c11896dy3.m55574x1(m64116ks(), m64120rv(), m64116ks(), m64120rv() + fM67491kk);
                c1236i2M69832dy.m7391k4(c12007ixClone3.Clone(), (C0962es) null, azoVarM7718x1, c11896dy3, f3, f4);
                if (this.f45834k4.m69834fa().getRotation3D().getRightAngleAxes()) {
                    c11896dy2 = new C11896dy();
                    c11896dy2.m55574x1(m64123up(), m64127yj(), m64116ks(), m64127yj());
                    c12007ixClone2 = c12007ixClone3.Clone();
                    f2 = 0.0f;
                    fM64117m92 = m64117m9();
                } else {
                    c11896dy2 = new C11896dy();
                    c11896dy2.m55574x1(m64123up(), m64127yj(), m64116ks(), m64127yj());
                    c12007ixClone2 = c12007ixClone3.Clone();
                    f2 = 0.0f;
                    fM64117m92 = 0.0f;
                }
                c0962es = null;
                c1236i2M69832dy.m7391k4(c12007ixClone2, (C0962es) null, azoVarM7718x1, c11896dy2, f2, fM64117m92);
                c12007ixClone = c12007ixClone3.Clone();
                fM64117m9 = f4;
            } else {
                c11896dy = new C11896dy();
                c11896dy.m55574x1(m64123up(), m64127yj(), m64123up(), m64127yj() + fM67491kk);
                c1236i2M69832dy.m7391k4(c12007ixClone3.Clone(), (C0962es) null, azoVarM7718x1, c11896dy, f3, f4);
                C11896dy c11896dy4 = new C11896dy();
                c11896dy4.m55574x1(m64123up(), m64120rv(), m64123up(), m64120rv() + fM67491kk);
                c1236i2M69832dy.m7391k4(c12007ixClone3.Clone(), (C0962es) null, azoVarM7718x1, c11896dy4, f3, f4);
                if (this.f45834k4.m69834fa().getRotation3D().getRightAngleAxes()) {
                    c11896dy2 = new C11896dy();
                    c11896dy2.m55574x1(m64123up(), m64127yj(), m64123up(), m64120rv());
                    c1236i2M69832dy.m7391k4(c12007ixClone3.Clone(), (C0962es) null, azoVarM7718x1, c11896dy2, 0.0f, f4);
                    if (this.f45834k4.m69854ne() != null && this.f45834k4.m69854ne().m73384dy().isVisible()) {
                        return;
                    }
                    c12007ixClone = c12007ixClone3.Clone();
                    f2 = 0.0f;
                    fM64117m9 = m64117m9();
                    c0962es = null;
                } else {
                    c11896dy2 = new C11896dy();
                    c11896dy2.m55574x1(m64123up(), m64127yj(), m64123up(), m64120rv());
                    c0962es = null;
                    f2 = 0.0f;
                    c1236i2M69832dy.m7391k4(c12007ixClone3.Clone(), (C0962es) null, azoVarM7718x1, c11896dy2, 0.0f, f4);
                    c12007ixClone = c12007ixClone3.Clone();
                    fM64117m9 = 0.0f;
                }
            }
            c1236i2M69832dy.m7391k4(c12007ixClone, c0962es, azoVarM7718x1, c11896dy2, f2, fM64117m9);
        }
    }
}
