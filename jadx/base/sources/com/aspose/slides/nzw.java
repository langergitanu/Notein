package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class nzw extends AbstractC14265p3 {

    /* JADX INFO: renamed from: m9 */
    private C12015qq f47655m9;

    public nzw(C14787xi c14787xi) {
        super(c14787xi);
        this.f47655m9 = new C12015qq();
    }

    @Override // com.aspose.slides.AbstractC14265p3
    /* JADX INFO: renamed from: c5 */
    public C14713vw mo4960c5(C14713vw c14713vw) {
        throw new InvalidOperationException("Opeartion is not supported by radar axis");
    }

    /* JADX INFO: renamed from: ck */
    public final C12015qq m68293ck(C14713vw c14713vw) {
        mxy mxyVarM5806du = ((C0974f2) C7019kk.m27452k4((Object) m73228yd().m73228yd(), C0974f2.class)).m5806du(new C14713vw(m73026k4().m73423wy().m69867v4(), m73026k4().m73423wy().m69852lr()));
        return mo3034h4(new C14713vw(mxyVarM5806du.m72555k4() * 0.25f, mxyVarM5806du.m72556x1()));
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: du */
    public void mo4962du(C14713vw c14713vw) {
        throw new InvalidOperationException("Opeartion is not supported by radar axis");
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: dy */
    public void mo4963dy() {
        throw new InvalidOperationException("Opeartion is not supported by radar axis");
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: k4 */
    public float mo4964k4(double d) {
        throw new InvalidOperationException("Opeartion is not supported by radar axis");
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: ks */
    public C12015qq mo4966ks() {
        return !mo3221T_() ? new C12015qq(0.0f, 0.0f) : new C12015qq(((AbstractC14763x3) this).f49904k4.get_Item(0).m73225wy(), ((AbstractC14763x3) this).f49904k4.get_Item(0).m73203ak());
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        float f;
        double d;
        float fM73203ak;
        double size = 6.283185307179586d / ((double) ((AbstractC14763x3) this).f49904k4.size());
        double dM73225wy = ((double) m73225wy()) / 2.0d;
        double dM73203ak = ((double) m73203ak()) / 2.0d;
        double d2 = 1.5707963267948966d + size;
        float f2 = 2.0f;
        double dM73203ak2 = (m73203ak() / 35.0f) + (m73225wy() / 2.0f);
        int i = 0;
        while (i < ((AbstractC14763x3) this).f49904k4.size()) {
            d2 -= size;
            double dM67470dy = (C14116yg.m67470dy(d2) * dM73203ak2) + dM73225wy;
            double dM67495m9 = dM73203ak - (C14116yg.m67495m9(d2) * dM73203ak2);
            double dM67497to = C14116yg.m67497to((d2 / 3.141592653589793d) * 180.0d);
            if (dM67497to <= -270.0d || dM67497to >= -90.0d) {
                f = f2;
                d = dM73203ak2;
                if (dM67497to == -270.0d || dM67497to == 90.0d || dM67497to == -90.0d) {
                    dM67470dy -= (double) (((AbstractC14763x3) this).f49904k4.get_Item(i).m73225wy() / f);
                }
            } else {
                f = f2;
                d = dM73203ak2;
                dM67470dy -= (double) ((AbstractC14763x3) this).f49904k4.get_Item(i).m73225wy();
            }
            if (dM67497to == -270.0d || dM67497to == 90.0d) {
                fM73203ak = ((AbstractC14763x3) this).f49904k4.get_Item(i).m73203ak();
            } else {
                if (dM67497to != -90.0d) {
                    fM73203ak = ((AbstractC14763x3) this).f49904k4.get_Item(i).m73203ak() / f;
                }
                double d3 = dM67495m9;
                ((AbstractC14763x3) this).f49904k4.get_Item(i).m73208du((float) dM67470dy);
                ((AbstractC14763x3) this).f49904k4.get_Item(i).m73212h4((float) d3);
                i++;
                f2 = f;
                dM73203ak2 = d;
            }
            dM67495m9 -= (double) fM73203ak;
            double d32 = dM67495m9;
            ((AbstractC14763x3) this).f49904k4.get_Item(i).m73208du((float) dM67470dy);
            ((AbstractC14763x3) this).f49904k4.get_Item(i).m73212h4((float) d32);
            i++;
            f2 = f;
            dM73203ak2 = d;
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        float fM72556x1;
        m73224wp();
        mo68927jd(c14713vw);
        C12015qq c12015qqClone = mo3034h4(new C14713vw(1000.0f, 1000.0f)).Clone();
        m68293ck(c14713vw).CloneTo(this.f47655m9);
        if (((ChartPlotArea) C7019kk.m27452k4((Object) m73026k4().m73423wy().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
            fM72556x1 = (c14713vw.m72555k4() - (c12015qqClone.m56699x1() * 2.0f) > c14713vw.m72556x1() - (c12015qqClone.m56697kk() * 2.0f) ? c14713vw.m72556x1() : c14713vw.m72555k4()) - ((c14713vw.m72555k4() - (c12015qqClone.m56699x1() * 2.0f) > c14713vw.m72556x1() - (c12015qqClone.m56697kk() * 2.0f) ? this.f47655m9.m56697kk() : this.f47655m9.m56699x1()) * 2.0f);
            m73217kk(fM72556x1);
        } else {
            m73217kk(c14713vw.m72555k4());
            fM72556x1 = c14713vw.m72556x1();
        }
        m73222to(fM72556x1);
        m73027k4(this.f47655m9.Clone());
    }
}
