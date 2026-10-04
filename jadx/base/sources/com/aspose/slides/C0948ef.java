package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.ef */
/* JADX INFO: loaded from: classes3.dex */
class C0948ef extends C13743kq {
    public C0948ef(C14365qy c14365qy, IChartWall iChartWall) {
        super(c14365qy, iChartWall);
    }

    @Override // com.aspose.slides.C13743kq
    /* JADX INFO: renamed from: k4 */
    public void mo5519k4() {
        float f;
        C11896dy c11896dy;
        C11896dy c11896dy2;
        C12007ix c12007ixClone;
        float f2;
        float fM64117m9;
        C0962es c0962es;
        C11896dy c11896dy3;
        if (this.f45839x1 == null) {
            return;
        }
        C12003du c12003duClone = C12003du.f40505to.Clone();
        if (this.f45839x1 == this.f45834k4.m69834fa().getFloor()) {
            this.f45834k4.m69834fa().m506k4((byte) 0).CloneTo(c12003duClone);
            im9.m7690k4(c12003duClone.Clone(), 0.75d).CloneTo(c12003duClone);
            C12003du.m56400k4(255, c12003duClone.Clone()).CloneTo(c12003duClone);
        }
        LineFormat lineFormat = (LineFormat) this.f45839x1.getFormat().getLine();
        new C11896dy().m55578x1(new C12007ix(m64123up(), m64127yj(), m64116ks() - m64123up(), m64120rv() - m64127yj()));
        azo azoVarM7718x1 = im9.m7718x1(c12003duClone.Clone(), lineFormat, this.f45834k4, 0.5f);
        if (azoVarM7718x1.m3903h4()) {
            float f3 = -m64117m9();
            C12007ix c12007ixClone2 = this.f45834k4.m69855qm().Clone();
            if (this.f45834k4.m69834fa().getRotation3D().getRightAngleAxes()) {
                f = 0.0f;
            } else {
                float depthPercents = ((this.f45834k4.m69834fa().getRotation3D().getDepthPercents() & 65535) / 100.0f) * this.f45834k4.m69833e0().m64102dy();
                f = -OooOOOO.OooO00o(OooOO0O.OooO0O0(this.f45834k4.m69834fa(), 0) & 65535, 100.0f, depthPercents, depthPercents);
                this.f45834k4.m69855qm().CloneTo(c12007ixClone2);
            }
            float f4 = f;
            C1236i2 c1236i2M69832dy = this.f45834k4.m69832dy();
            float fM67491kk = (float) C14116yg.m67491kk(0.5d, azoVarM7718x1.m3906k4());
            if (C14164n2.m67858x1(this.f45834k4.m69834fa().getType())) {
                C11896dy c11896dy4 = new C11896dy();
                c11896dy4.m55574x1(m64123up(), m64127yj(), m64123up(), m64127yj() + fM67491kk);
                c1236i2M69832dy.m7391k4(c12007ixClone2.Clone(), (C0962es) null, azoVarM7718x1, c11896dy4, f3, f4);
                C11896dy c11896dy5 = new C11896dy();
                c11896dy5.m55574x1(m64116ks(), m64120rv(), m64116ks(), m64120rv() + fM67491kk);
                c1236i2M69832dy.m7391k4(c12007ixClone2.Clone(), (C0962es) null, azoVarM7718x1, c11896dy5, f3, f4);
                if (this.f45834k4.m69834fa().getRotation3D().getRightAngleAxes()) {
                    c11896dy3 = new C11896dy();
                    c11896dy3.m55574x1(m64123up(), m64127yj(), m64123up(), m64120rv());
                    f2 = 0.0f;
                    c0962es = null;
                    c1236i2M69832dy.m7391k4(c12007ixClone2.Clone(), (C0962es) null, azoVarM7718x1, c11896dy3, 0.0f, m64117m9());
                    c11896dy2 = new C11896dy();
                } else {
                    c11896dy3 = new C11896dy();
                    c11896dy3.m55574x1(m64123up(), m64127yj(), m64123up(), m64120rv());
                    f2 = 0.0f;
                    c0962es = null;
                    c1236i2M69832dy.m7391k4(c12007ixClone2.Clone(), (C0962es) null, azoVarM7718x1, c11896dy3, 0.0f, 0.0f);
                    c11896dy2 = new C11896dy();
                }
                c11896dy2.m55574x1(m64116ks(), m64127yj(), m64116ks(), m64120rv());
                c12007ixClone = c12007ixClone2.Clone();
                fM64117m9 = f4;
            } else {
                float fM64127yj = m64127yj() + 0.1f;
                float fM64120rv = m64120rv();
                float fM64123up = m64123up();
                float fM64116ks = m64116ks();
                if (this.f45834k4.m69863u4() != null && this.f45834k4.m69863u4().m73384dy().isVisible()) {
                    c11896dy = new C11896dy();
                    try {
                        c11896dy.m55574x1(fM64123up, fM64127yj, fM64123up, fM64127yj + fM67491kk);
                        c1236i2M69832dy.m7391k4(c12007ixClone2.Clone(), (C0962es) null, azoVarM7718x1, c11896dy, f3, f4);
                    } finally {
                    }
                }
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55574x1(fM64116ks, fM67491kk + fM64120rv, fM64116ks, fM64120rv);
                    c1236i2M69832dy.m7391k4(c12007ixClone2.Clone(), (C0962es) null, azoVarM7718x1, c11896dy, f3, f4);
                    c11896dy.dispose();
                    if (this.f45834k4.m69834fa().getRotation3D().getRightAngleAxes()) {
                        c11896dy2 = new C11896dy();
                        c11896dy2.m55574x1(fM64123up, fM64127yj, fM64116ks, fM64127yj);
                        if (this.f45834k4.m69863u4() == null || !this.f45834k4.m69863u4().m73384dy().getShowMajorGridLines()) {
                            c1236i2M69832dy.m7391k4(c12007ixClone2.Clone(), (C0962es) null, azoVarM7718x1, c11896dy2, 0.0f, f4);
                        }
                        if (this.f45834k4.m69854ne() != null && this.f45834k4.m69854ne().m73384dy().isVisible()) {
                            return;
                        }
                        c12007ixClone = c12007ixClone2.Clone();
                        f2 = 0.0f;
                        fM64117m9 = m64117m9();
                    } else {
                        c11896dy2 = new C11896dy();
                        c11896dy2.m55574x1(fM64123up, fM64127yj, fM64116ks, fM64127yj);
                        if (this.f45834k4.m69863u4() == null || !this.f45834k4.m69863u4().m73384dy().getShowMajorGridLines()) {
                            c1236i2M69832dy.m7391k4(c12007ixClone2.Clone(), (C0962es) null, azoVarM7718x1, c11896dy2, 0.0f, f4);
                        }
                        if (this.f45834k4.m69854ne() != null && this.f45834k4.m69854ne().m73384dy().isVisible()) {
                            return;
                        }
                        c12007ixClone = c12007ixClone2.Clone();
                        f2 = 0.0f;
                        fM64117m9 = 0.0f;
                    }
                    c0962es = null;
                } finally {
                }
            }
            c1236i2M69832dy.m7391k4(c12007ixClone, c0962es, azoVarM7718x1, c11896dy2, f2, fM64117m9);
        }
    }
}
