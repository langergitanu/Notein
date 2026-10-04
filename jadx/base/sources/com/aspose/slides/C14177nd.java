package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.nd */
/* JADX INFO: loaded from: classes3.dex */
class C14177nd extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private float f47514du;

    /* JADX INFO: renamed from: k4 */
    private final C0886d8 f47515k4;

    /* JADX INFO: renamed from: kk */
    private final AbstractC13836mg f47516kk;

    /* JADX INFO: renamed from: to */
    private float f47517to;

    /* JADX INFO: renamed from: x1 */
    private otz f47518x1;

    public C14177nd(C0886d8 c0886d8, AbstractC13836mg abstractC13836mg) {
        this.f47515k4 = c0886d8;
        this.f47516kk = abstractC13836mg;
        if (m67961u4()) {
            this.f47518x1 = c0886d8.m5012up().m64945h4().getParentSeriesGroup().getSeries().size() == 1 ? new C14469st(c0886d8) : new gnp(c0886d8.m5012up());
            m73215k4(this.f47518x1);
        }
        m73215k4(abstractC13836mg);
        m67970k4(mo3221T_());
    }

    /* JADX INFO: renamed from: to */
    private DataLabel m67960to() {
        return this.f47515k4.m5003ks().m4570x1();
    }

    /* JADX INFO: renamed from: u4 */
    private boolean m67961u4() {
        return this.f47515k4.m5003ks().m4570x1().getDataLabelFormat().getShowLegendKey();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: T_ */
    public boolean mo3221T_() {
        return this.f47515k4.m5003ks().m4569up();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: V_ */
    public void mo3030V_() {
        if (mo3221T_()) {
            DataLabel dataLabelM4570x1 = m67963ck().m5003ks().m4570x1();
            dataLabelM4570x1.m1297k4(m73227xk() - m67963ck().m5012up().m64941c5().m69834fa().getX());
            dataLabelM4570x1.m1306x1(m73206c6() - m67963ck().m5012up().m64941c5().m69834fa().getY());
            dataLabelM4570x1.m1301kk(m73225wy());
            dataLabelM4570x1.m1304to(m73203ak());
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final float m67962c5() {
        return this.f47517to;
    }

    /* JADX INFO: renamed from: ck */
    public final C0886d8 m67963ck() {
        return this.f47515k4;
    }

    /* JADX INFO: renamed from: dy */
    public int mo4194dy() {
        return m67963ck().m5003ks().m4559dy();
    }

    /* JADX INFO: renamed from: fa */
    public final AbstractC13836mg m67964fa() {
        return this.f47516kk;
    }

    /* JADX INFO: renamed from: ix */
    public final C12025x6[] m67965ix() {
        return new C12025x6[]{new C12025x6((m73225wy() / 2.0f) + m73227xk(), m73206c6()), new C12025x6((m73225wy() / 2.0f) + m73227xk(), m73206c6() + m73203ak())};
    }

    /* JADX INFO: renamed from: jd */
    public float m67966jd() {
        return this.f47514du;
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m67967k4(C12025x6 c12025x6, C12007ix c12007ix) {
        return m67976x1(C14873z5.m74322k4(c12025x6.Clone(), (-m73225wy()) / 2.0f, (-m73203ak()) / 2.0f).Clone().Clone(), c12007ix.Clone());
    }

    /* JADX INFO: renamed from: ks */
    public final jjy m67971ks() {
        if (!m67972m9()) {
            return m67974rv();
        }
        jjy jjyVar = new jjy(this.f47516kk.m73368yj());
        jjyVar.m63354k4(m73223ts().Clone());
        return jjyVar;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m67972m9() {
        if (m67961u4()) {
            return false;
        }
        byte fillType = this.f47515k4.m5003ks().m4565ks().getFillFormat().getFillType();
        byte fillType2 = this.f47515k4.m5003ks().m4572yj().getFillType();
        return (fillType == -1 || fillType == 0) && (fillType2 == -1 || fillType2 == 0);
    }

    /* JADX INFO: renamed from: ne */
    public final C12025x6[] m67973ne() {
        return new C12025x6[]{new C12025x6(m73227xk(), m73223ts().m56895kk()), new C12025x6(m73227xk() + m73225wy(), m73223ts().m56895kk())};
    }

    /* JADX INFO: renamed from: rv */
    public final jjy m67974rv() {
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 12);
        c12025x6Arr[0] = new C12025x6(0.0f, 0.0f);
        c12025x6Arr[1] = new C12025x6(m73225wy() * 0.25f, 0.0f);
        c12025x6Arr[2] = new C12025x6(m73225wy() * 0.5f, 0.0f);
        c12025x6Arr[3] = new C12025x6(m73225wy() * 0.75f, 0.0f);
        c12025x6Arr[4] = new C12025x6(m73225wy(), 0.0f);
        c12025x6Arr[5] = new C12025x6(m73225wy(), m73203ak() / 2.0f);
        c12025x6Arr[6] = new C12025x6(m73225wy(), m73203ak());
        c12025x6Arr[7] = new C12025x6(m73225wy() * 0.25f, m73203ak());
        c12025x6Arr[8] = new C12025x6(m73225wy() * 0.5f, m73203ak());
        c12025x6Arr[9] = new C12025x6(m73225wy() * 0.75f, m73203ak());
        c12025x6Arr[10] = new C12025x6(0.0f, m73203ak());
        c12025x6Arr[11] = new C12025x6(0.0f, m73203ak() / 2.0f);
        jjy jjyVar = new jjy(c12025x6Arr);
        jjyVar.m63354k4(m73223ts().Clone());
        return jjyVar;
    }

    /* JADX INFO: renamed from: up */
    public final C12007ix[] m67975up() {
        return this.f47516kk.m73368yj();
    }

    /* JADX INFO: renamed from: x1 */
    public final C12025x6 m67976x1(C12025x6 c12025x6, C12007ix c12007ix) {
        C12025x6 c12025x6Clone = C14873z5.m74323k4(c12025x6.Clone(), m73225wy(), m73203ak(), c12007ix.Clone(), true).Clone();
        if (this.f47517to == 0.0f && this.f47514du == 0.0f) {
            return c12025x6Clone;
        }
        c12025x6Clone.m56891k4(c12025x6Clone.m56897x1() + this.f47517to);
        c12025x6Clone.m56898x1(c12025x6Clone.m56895kk() + this.f47514du);
        return C14873z5.m74323k4(c12025x6Clone.Clone(), m73225wy(), m73203ak(), c12007ix.Clone(), false);
    }

    /* JADX INFO: renamed from: x6 */
    public final C12025x6[] m67978x6() {
        return new C12025x6[]{new C12025x6(m73227xk(), m73223ts().m56895kk()), new C12025x6(m73227xk() + m73225wy(), m73223ts().m56895kk())};
    }

    /* JADX INFO: renamed from: yj */
    public final C14713vw m67979yj() {
        float fM73225wy = m73218lr().m73225wy();
        float fM73203ak = m73218lr().m73203ak();
        float width = m67960to().getWidth();
        float height = m67960to().getHeight();
        if (!C14064he.m66715kk(width) && !C14064he.m66715kk(height)) {
            return new C14713vw(width * fM73225wy, height * fM73203ak);
        }
        if (this.f47515k4.m5003ks().m4571x6()) {
            fM73225wy *= 0.199f;
        }
        return new C14713vw(fM73225wy, fM73203ak);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67968k4(float f) {
        this.f47517to = f;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    /* JADX INFO: renamed from: x1 */
    public void m67977x1(float f) {
        this.f47514du = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67969k4(C12025x6 c12025x6) {
        int shapeType;
        GeometryShape geometryShapeM1310to;
        if (m67964fa().m73367ks() == null) {
            return;
        }
        DataLabel dataLabelM4570x1 = m67963ck().m5003ks().m4570x1();
        if (!dataLabelM4570x1.getDataLabelFormat().getShowLabelAsDataCallout() || dataLabelM4570x1.m1292c5() == null || dataLabelM4570x1.m1292c5().getShapeType() == -1) {
            DataLabelCollection dataLabelCollection = (DataLabelCollection) dataLabelM4570x1.m1294dy().getLabels();
            if (!dataLabelCollection.getDefaultDataLabelFormat().getShowLabelAsDataCallout() || dataLabelCollection.m1310to() == null || dataLabelCollection.m1310to().getShapeType() == -1) {
                shapeType = -1;
                if (shapeType == -1 && shapeType == 117) {
                    m67964fa().m73367ks().setGeometryPath(C13676j8.m63253k4(m67964fa().m73367ks().getWidth(), m67964fa().m73367ks().getHeight(), c12025x6.Clone()));
                }
                return;
            }
            geometryShapeM1310to = ((DataLabelCollection) dataLabelM4570x1.m1294dy().getLabels()).m1310to();
        } else {
            geometryShapeM1310to = dataLabelM4570x1.m1292c5();
        }
        shapeType = geometryShapeM1310to.getShapeType();
        if (shapeType == -1) {
            return;
        }
        m67964fa().m73367ks().setGeometryPath(C13676j8.m63253k4(m67964fa().m73367ks().getWidth(), m67964fa().m73367ks().getHeight(), c12025x6.Clone()));
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        if (m67961u4()) {
            fM73225wy = (this.f47518x1.mo6844to() == 0 ? 8.0f : 0.0f) + this.f47518x1.m73225wy() + 2.0f;
        }
        float fM73225wy = fM73225wy + this.f47516kk.m73225wy();
        this.f47516kk.m73212h4((m73203ak() / 2.0f) - (this.f47516kk.m73203ak() / 2.0f));
        float fM73225wy2 = (m73225wy() / 2.0f) - (fM73225wy / 2.0f);
        if (m67961u4()) {
            if (this.f47518x1.mo6844to() == 0) {
                fM73225wy2 += 8.0f;
            }
            this.f47518x1.m73212h4((float) ((((double) this.f47516kk.m64878jd().m56638du()) / 2.0d) - (((double) this.f47518x1.m73203ak()) / 2.0d)));
            this.f47518x1.m73208du(6.0f + fM73225wy2);
            this.f47518x1.m73220ss();
            fM73225wy2 += this.f47518x1.m73225wy() + a4w.m3220k4(this.f47518x1.mo6844to(), this.f47516kk.m64878jd().m56638du());
        }
        this.f47516kk.m73208du(fM73225wy2);
        this.f47516kk.m73220ss();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        this.f47516kk.m73210fa(c14713vw);
        if (m67961u4()) {
            int iMo6844to = this.f47518x1.mo6844to();
            float fM67477k4 = (float) C14116yg.m67477k4(m67964fa().m64878jd().m56638du() / 3.0f, 0);
            if (iMo6844to == 0) {
                this.f47518x1.m73210fa(new C14713vw(fM67477k4, fM67477k4));
            } else {
                this.f47518x1.m73210fa(new C14713vw(a4w.m3219k4(iMo6844to), fM67477k4));
            }
        }
        float fM73225wy = this.f47516kk.m73225wy();
        if (m67961u4()) {
            fM73225wy += this.f47518x1.m73225wy();
            if (this.f47518x1.mo6844to() == 0) {
                fM73225wy += 8.0f;
            }
        }
        m73217kk(fM73225wy);
        m73222to(this.f47516kk.m73203ak());
        if (this.f47515k4.m5003ks().m4560fa()) {
            return;
        }
        this.f47517to = m67960to().getX() * m73218lr().m73225wy();
        this.f47514du = m67960to().getY() * m73218lr().m73203ak();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m67970k4(boolean z) {
        this.f47516kk.m73366kk(z);
    }
}
