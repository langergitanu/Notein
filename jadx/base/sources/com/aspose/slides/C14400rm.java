package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.rm */
/* JADX INFO: loaded from: classes3.dex */
class C14400rm extends C13743kq {
    public C14400rm(C14365qy c14365qy, IChartWall iChartWall) {
        super(c14365qy, iChartWall);
    }

    @Override // com.aspose.slides.C13743kq
    /* JADX INFO: renamed from: k4 */
    public void mo5519k4() {
        float f;
        IChartWall iChartWall = this.f45839x1;
        if (iChartWall == null) {
            return;
        }
        azo azoVarM7718x1 = im9.m7718x1((iChartWall == this.f45834k4.m69834fa().getFloor() ? this.f45834k4.m69834fa().m506k4((byte) 0) : C12003du.f40505to).Clone().Clone(), (LineFormat) this.f45839x1.getFormat().getLine(), this.f45834k4, 1.0f);
        if (azoVarM7718x1.m3903h4()) {
            m64117m9();
            C12007ix c12007ixClone = m64119ne().Clone();
            if (this.f45834k4.m69834fa().getRotation3D().getRightAngleAxes()) {
                f = 0.0f;
            } else {
                float depthPercents = ((this.f45834k4.m69834fa().getRotation3D().getDepthPercents() & 65535) / 100.0f) * this.f45834k4.m69833e0().m64102dy();
                f = -OooOOOO.OooO00o(OooOO0O.OooO0O0(this.f45834k4.m69834fa(), 0) & 65535, 100.0f, depthPercents, depthPercents);
                this.f45834k4.m69855qm().CloneTo(c12007ixClone);
            }
            float f2 = f;
            C1236i2 c1236i2M69832dy = this.f45834k4.m69832dy();
            C11896dy c11896dy = new C11896dy();
            c11896dy.m55574x1(m64123up(), m64127yj(), m64116ks(), m64127yj());
            c11896dy.m55567m9();
            c11896dy.m55574x1(m64123up(), m64120rv(), m64116ks(), m64120rv());
            c11896dy.m55567m9();
            c11896dy.m55574x1(m64123up(), m64127yj(), m64123up(), m64120rv());
            c11896dy.m55567m9();
            c11896dy.m55574x1(m64116ks(), m64127yj(), m64116ks(), m64120rv());
            c1236i2M69832dy.m7391k4(c12007ixClone.Clone(), (C0962es) null, azoVarM7718x1, c11896dy, 0.0f, f2);
        }
    }
}
