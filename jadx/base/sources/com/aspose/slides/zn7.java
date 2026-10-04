package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class zn7 extends AbstractC14463so {

    /* JADX INFO: renamed from: kk */
    private static final ohe f50625kk = new ohe(oju.f47834kk.Clone(), oju.f47835to.Clone());

    /* JADX INFO: renamed from: ck */
    private final IPictureFillFormat f50627ck;

    /* JADX INFO: renamed from: jd */
    private long f50631jd;

    /* JADX INFO: renamed from: x1 */
    private gb2 f50635x1;

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<gb2> f50632k4 = new AbstractC7018k4<gb2>() { // from class: com.aspose.slides.zn7.1
        {
            zn7.this.f50635x1 = new gb2() { // from class: com.aspose.slides.zn7.1.1
                @Override // com.aspose.slides.gb2
                /* JADX INFO: renamed from: k4 */
                public void mo1463k4() {
                    for (gb2 gb2Var : ((AbstractC7018k4) C148981.this).f19081x1) {
                        if (gb2Var != null) {
                            gb2Var.mo1463k4();
                        }
                    }
                }
            };
        }
    };

    /* JADX INFO: renamed from: to */
    private final bia f50634to = new bia();

    /* JADX INFO: renamed from: du */
    private ohe f50628du = f50625kk.Clone();

    /* JADX INFO: renamed from: h4 */
    private tbp f50630h4 = new tbp();

    /* JADX INFO: renamed from: m9 */
    private oju f50633m9 = oju.f47835to.Clone();

    /* JADX INFO: renamed from: dy */
    private int f50629dy = 0;

    /* JADX INFO: renamed from: c5 */
    private byte f50626c5 = 0;

    public zn7(IPictureFillFormat iPictureFillFormat) {
        this.f50627ck = iPictureFillFormat;
    }

    /* JADX INFO: renamed from: c5 */
    private void m74637c5() {
        this.f50631jd++;
        if (C7019kk.m27469x1(this.f50627ck, PVIObject.class)) {
            ((PVIObject) this.f50627ck).m2145uz();
        }
        gb2 gb2Var = this.f50635x1;
        if (gb2Var == null || this.f50632k4.m27430k4()) {
            return;
        }
        gb2Var.mo1463k4();
    }

    /* JADX INFO: renamed from: du */
    public final int m74639du() {
        return this.f50629dy;
    }

    /* JADX INFO: renamed from: dy */
    public final long m74640dy() {
        return ((this.f50631jd & 4294967295L) + (this.f50634to.m4221kk() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m74641h4() {
        return this.f50626c5;
    }

    /* JADX INFO: renamed from: kk */
    public final tbp m74649kk() {
        return this.f50630h4;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m74650m9() {
        ohe oheVar = this.f50628du;
        ohe oheVar2 = f50625kk;
        if (!ohe.m68566x1(oheVar, oheVar2) && C3085sv.m13090k4(this.f50634to.m4218k4().Clone(), bia.f4205k4.Clone()) && C3085sv.m13088k4(this.f50630h4.f49090k4, 0.0d) && C3085sv.m13088k4(this.f50630h4.f49091x1, 0.0d) && C3085sv.m13089k4(this.f50633m9.f47836k4, 1.0f) && C3085sv.m13089k4(this.f50633m9.f47837x1, 1.0f) && C3085sv.m13089k4(this.f50629dy, 0.0f) && C3085sv.m13089k4(this.f50626c5, 0.0f)) {
            return;
        }
        oheVar2.CloneTo(this.f50628du);
        this.f50634to.m4222x1();
        this.f50630h4 = new tbp();
        oju.f47835to.CloneTo(this.f50633m9);
        this.f50629dy = 0;
        this.f50626c5 = (byte) 0;
        m74637c5();
    }

    /* JADX INFO: renamed from: to */
    public final oju m74651to() {
        return this.f50633m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final bia m74652x1() {
        return this.f50634to;
    }

    /* JADX INFO: renamed from: k4 */
    public final ohe m74642k4() {
        return this.f50628du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74643k4(byte b) {
        if (C3085sv.m13089k4(this.f50626c5, b)) {
            return;
        }
        this.f50626c5 = b;
        m74637c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74644k4(int i) {
        if (C3085sv.m13089k4(this.f50629dy, i)) {
            return;
        }
        this.f50629dy = i;
        m74637c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74645k4(ohe oheVar) {
        oheVar.CloneTo(this.f50628du);
        m74637c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74646k4(oju ojuVar) {
        if (oju.m68621to(this.f50633m9, ojuVar)) {
            ojuVar.CloneTo(this.f50633m9);
            m74637c5();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74647k4(tbp tbpVar) {
        if (tbp.m71057to(this.f50630h4, tbpVar)) {
            tbpVar.CloneTo(this.f50630h4);
            m74637c5();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74648k4(zn7 zn7Var) {
        if (!ohe.m68566x1(this.f50628du, zn7Var.f50628du) && C3085sv.m13090k4(this.f50634to, zn7Var.f50634to) && C3085sv.m13088k4(this.f50630h4.f49090k4, zn7Var.f50630h4.f49090k4) && C3085sv.m13088k4(this.f50630h4.f49091x1, zn7Var.f50630h4.f49091x1) && C3085sv.m13089k4(this.f50633m9.f47836k4, zn7Var.f50633m9.f47836k4) && C3085sv.m13089k4(this.f50633m9.f47837x1, zn7Var.f50633m9.f47837x1) && C3085sv.m13089k4(this.f50629dy, zn7Var.f50629dy) && C3085sv.m13089k4(this.f50626c5, zn7Var.f50626c5)) {
            return;
        }
        zn7Var.f50628du.CloneTo(this.f50628du);
        this.f50634to.m4220k4(zn7Var.f50634to.m4218k4().Clone());
        zn7Var.f50630h4.CloneTo(this.f50630h4);
        zn7Var.f50633m9.CloneTo(this.f50633m9);
        this.f50629dy = zn7Var.f50629dy;
        this.f50626c5 = zn7Var.f50626c5;
        m74637c5();
    }
}
