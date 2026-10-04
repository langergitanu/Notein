package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;

/* JADX INFO: loaded from: classes3.dex */
class lbk extends msn {

    /* JADX INFO: renamed from: ck */
    private List<C11896dy> f45957ck;

    /* JADX INFO: renamed from: fa */
    private List<C12007ix> f45958fa;

    /* JADX INFO: renamed from: jd */
    private List<C13770k4> f45959jd;

    /* JADX INFO: renamed from: up */
    private List<qy7> f45960up;

    /* JADX INFO: renamed from: com.aspose.slides.lbk$k4 */
    public static class C13770k4 {

        /* JADX INFO: renamed from: k4 */
        private C11896dy f45961k4;

        /* JADX INFO: renamed from: kk */
        private azo f45962kk;

        /* JADX INFO: renamed from: x1 */
        private C0962es f45963x1;

        public C13770k4(C11896dy c11896dy, C0962es c0962es, azo azoVar) {
            if (c11896dy == null) {
                throw new ArgumentNullException("path");
            }
            m64348k4(c11896dy);
            m64347k4(c0962es);
            m64346k4(azoVar);
        }

        /* JADX INFO: renamed from: k4 */
        public final C11896dy m64349k4() {
            return this.f45961k4;
        }

        /* JADX INFO: renamed from: kk */
        public final azo m64350kk() {
            return this.f45962kk;
        }

        /* JADX INFO: renamed from: x1 */
        public final C0962es m64351x1() {
            return this.f45963x1;
        }

        /* JADX INFO: renamed from: k4 */
        private void m64346k4(azo azoVar) {
            this.f45962kk = azoVar;
        }

        /* JADX INFO: renamed from: k4 */
        private void m64347k4(C0962es c0962es) {
            this.f45963x1 = c0962es;
        }

        /* JADX INFO: renamed from: k4 */
        private void m64348k4(C11896dy c11896dy) {
            this.f45961k4 = c11896dy;
        }
    }

    public lbk(int i, int i2, float f, float f2) {
        super(i, i2, f, f2);
        mo67710k4(new C4317dy());
        this.f45957ck = new List<>();
        this.f45958fa = new List<>();
        this.f45960up = new List<>();
        this.f45959jd = new List<>();
    }

    /* JADX INFO: renamed from: ck */
    public final List<C12007ix> m64334ck() {
        return this.f45958fa;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: fa */
    public C12007ix mo64335fa() {
        return new C12007ix();
    }

    /* JADX INFO: renamed from: jd */
    public final List<C11896dy> m64336jd() {
        return this.f45957ck;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64337k4(IPPImage iPPImage, C12007ix c12007ix, C12007ix c12007ix2, qta qtaVar) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: um */
    public final C13770k4[] m64344um() {
        return this.f45959jd.toArray(new C13770k4[0]);
    }

    /* JADX INFO: renamed from: up */
    public final List<qy7> m64345up() {
        return this.f45960up;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64338k4(C11896dy c11896dy, azo azoVar, C0962es c0962es) {
        C0962es c0962esCloneT = (c0962es == null || c0962es.m5681to() == 0) ? null : c0962es.cloneT();
        azo azoVarCloneT = (azoVar == null || !azoVar.m3903h4()) ? null : azoVar.cloneT();
        if (c11896dy == null || c11896dy.m55525du() <= 0) {
            return;
        }
        if (c0962esCloneT == null && azoVar == null) {
            return;
        }
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        C4317dy c4317dy = ((msn) this).f47435dy;
        if (c4317dy != null) {
            c11896dy2.m55577x1(C3108y2.m13229x1(c4317dy));
        }
        if (azoVar == null || ((azoVar.m3897c5() == 0 && azoVar.m3905jd() == 0) || m74619k4(c11896dy))) {
            this.f45959jd.addItem(new C13770k4(c11896dy2, c0962esCloneT, azoVarCloneT));
            return;
        }
        C11896dy[] c11896dyArr = {null};
        C11896dy[] c11896dyArr2 = {null};
        C11896dy c11896dyM74609k4 = m74609k4(c11896dy, azoVar, c11896dyArr, c11896dyArr2);
        C11896dy c11896dy3 = c11896dyArr[0];
        C11896dy c11896dy4 = c11896dyArr2[0];
        azoVarCloneT.m3921to((byte) 0);
        azoVarCloneT.m3900du((byte) 0);
        if (c11896dy3 != null) {
            this.f45959jd.addItem(new C13770k4(c11896dy3, azoVarCloneT.m3917ne(), null));
        }
        if (c11896dy4 != null) {
            this.f45959jd.addItem(new C13770k4(c11896dy4, azoVarCloneT.m3917ne(), null));
        }
        if (c11896dyM74609k4 != null) {
            this.f45959jd.addItem(new C13770k4(c11896dyM74609k4, null, azoVarCloneT));
        }
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64339k4(AbstractC12002ck abstractC12002ck, float f, float f2, float f3, float f4) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64340k4(AbstractC12002ck abstractC12002ck, int i, int i2) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64341k4(AbstractC12002ck abstractC12002ck, int i, int i2, int i3, int i4) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64342k4(C12007ix c12007ix) {
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64343k4(String str, C12007ix c12007ix, qy7 qy7Var) {
        C12013m9 c12013m9M68811k4 = qy7Var.m69882b3().m68811k4();
        int iM56642jd = c12013m9M68811k4.m56642jd();
        C12004dy c12004dyM56651x1 = c12013m9M68811k4.m56651x1();
        float fM69915rv = qy7Var.m69915rv();
        c12007ix.m56572to(c12007ix.m56551ck() - (((qy7Var.m69926x1() * fM69915rv) / 100.0f) + (c12013m9M68811k4.m56644k4(this.f50624x1) * (c12004dyM56651x1.m56536x1(iM56642jd) / c12004dyM56651x1.m56526du(iM56642jd)))));
        if (qy7Var.m69926x1() != 0) {
            fM69915rv *= 0.66f;
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55552k4(str, c12013m9M68811k4.m56651x1(), iM56642jd, fM69915rv, c12007ix.m56552du().Clone(), this.f50616du);
        C4317dy c4317dy = ((msn) this).f47435dy;
        if (c4317dy != null) {
            c11896dy.m55577x1(C3108y2.m13229x1(c4317dy));
            ((msn) this).f47435dy.m17332k4(c12007ix.Clone()).CloneTo(c12007ix);
        }
        this.f45957ck.addItem(c11896dy);
        this.f45958fa.addItem(c12007ix.Clone());
        this.f45960up.addItem(qy7Var);
        this.f45959jd.addItem(new C13770k4(c11896dy, qy7Var.m69907kk(), qy7Var.m69917to()));
    }
}
