package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p159h0.C4443em;
import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4473um;
import com.aspose.slides.internal.p159h0.C4479w6;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.wg */
/* JADX INFO: loaded from: classes3.dex */
class C14736wg extends C14748wr {
    public C14736wg(C14693vm c14693vm) {
        super(c14693vm);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72696k4(C12007ix c12007ix, C0962es c0962es, azo azoVar, C11896dy c11896dy, float f, float f2, ilw ilwVar) {
        if (c0962es != null && c0962es.m5681to() != 0) {
            m72695k4(m72891x1().m72361x1(), c12007ix.Clone(), c0962es, (azo) null, c11896dy, f, f2, ilwVar);
        }
        if (azoVar == null || !azoVar.m3903h4()) {
            return;
        }
        m72695k4(m72891x1().m72361x1(), c12007ix.Clone(), (C0962es) null, azoVar, c11896dy, f, f2, ilwVar);
    }

    /* JADX INFO: renamed from: k4 */
    private void m72695k4(C14365qy c14365qy, C12007ix c12007ix, C0962es c0962es, azo azoVar, C11896dy c11896dy, float f, float f2, ilw ilwVar) throws PackageManager.NameNotFoundException {
        C11896dy c11896dy2;
        boolean z;
        boolean z2;
        float f3;
        C12009k4 c12009k4M73281k4;
        boolean z3 = false;
        if (c11896dy.m55525du() == 0) {
            return;
        }
        IRotation3D rotation3D = c14365qy.m69834fa().getRotation3D();
        float[] fArrM72889k4 = m72889k4(m72885k4(rotation3D));
        if (fArrM72889k4 == null) {
            return;
        }
        C4473um c4473umClone = m72890x1(rotation3D).Clone();
        C4473um c4473umClone2 = m72882k4(fArrM72889k4).Clone();
        tfm tfmVar = new tfm();
        if (c0962es == null || c0962es.m5681to() == 0 || c0962es.m5681to() == -1) {
            c11896dy2 = c11896dy;
            z = false;
        } else {
            if (c0962es.m5681to() != 1) {
                c11896dy2 = c11896dy;
                c12009k4M73281k4 = AbstractC14780xb.m73282k4(c14365qy.m69870wy(), c11896dy2, c0962es);
            } else {
                c11896dy2 = c11896dy;
                c12009k4M73281k4 = AbstractC14780xb.m73281k4(c0962es.m5676k4().Clone());
            }
            tfmVar.m71139k4(c12009k4M73281k4);
            z = true;
        }
        C14093tq<C12003du> c14093tqClone = m72884k4(c0962es, azoVar).Clone();
        tfmVar.m71147x1(C14093tq.m67296x1(c14093tqClone, null) ? AbstractC14780xb.m73281k4(c14093tqClone.m67297k4().Clone()) : tfmVar.m71132du());
        if (azoVar == null || !azoVar.m3903h4() || azoVar.m3901dy() == null || azoVar.m3901dy().m5681to() == 0 || azoVar.m3901dy().m5681to() == -1) {
            z2 = false;
        } else {
            if (C12003du.m56476x1(azoVar.m3916m9(), C12003du.f40505to)) {
                tfmVar.m71147x1(AbstractC14780xb.m73281k4(azoVar.m3916m9().Clone()));
            }
            if (tfmVar.m71132du() == null) {
                tfmVar.m71139k4(tfmVar.m71134h4());
            }
            z2 = true;
        }
        if (tfmVar.m71132du() == null && tfmVar.m71134h4() == null) {
            return;
        }
        C11896dy c11896dy3 = (C11896dy) c11896dy2.deepClone();
        tfmVar.m71137k4(new List<>());
        tfmVar.m71144to().addItem(c11896dy3);
        tfmVar.m71136k4((z ? 2 : 0) | 4);
        tfmVar.m71146x1(0);
        C4459os c4459os = new C4459os(0.0f, 0.0f);
        if (!z && azoVar != null) {
            C12026yj c12026yjM3930x6 = azoVar.m3930x6();
            if (f != 0.0f) {
                c12026yjM3930x6.m56927kk(0);
            }
            C12556ck.m58562k4(c11896dy3, c12026yjM3930x6);
            tfmVar.m71140k4(true);
            tfmVar.m71136k4(tfmVar.m71135k4() | 2);
            tfmVar.m71146x1(1);
        }
        C4489zj c4489zj = new C4489zj(c12007ix.m56550c5() / 2.0f, c12007ix.m56575x1() / 2.0f, f);
        C4459os c4459os2 = new C4459os(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
        C4459os.m18279k4(c4459os2, c4459os).CloneTo(c4459os2);
        tfmVar.m71138k4(C14171n7.m67877k4(tfmVar.m71144to().get_Item(0), f2, f, new C14093tq(c4459os2.Clone()), c14365qy.m69834fa().getType(), ilwVar).mo6948k4());
        int i = 1;
        while (i < tfmVar.m71144to().size()) {
            tfmVar.m71143m9().m18397k4(tfmVar.m71144to().get_Item(i), f2, f, tfmVar.m71135k4(), tfmVar.m71145x1(), null, false, tfmVar.m71142kk(), new C14093tq<>(c4459os2.Clone()));
            i++;
            tfmVar = tfmVar;
            z3 = z3;
            z = z;
            z2 = z2;
            c4459os2 = c4459os2;
        }
        C4459os c4459os3 = c4459os2;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        tfm tfmVar2 = tfmVar;
        if (tfmVar2.m71144to().size() > 1) {
            f3 = 0.0f;
            tfmVar2.m71143m9().m18395k4(new C4459os(0.0f, 0.0f), new C4459os(1.0f, 1.0f));
        } else {
            f3 = 0.0f;
        }
        C4489zj c4489zj2 = new C4489zj();
        C4489zj c4489zj3 = new C4489zj();
        C4489zj[] c4489zjArr = {c4489zj2};
        C4489zj[] c4489zjArr2 = {c4489zj3};
        tfmVar2.m71143m9().m18396k4(c4473umClone2.Clone(), c4489zjArr, c4489zjArr2);
        c4489zjArr[z6 ? 1 : 0].CloneTo(c4489zj2);
        c4489zjArr2[z6 ? 1 : 0].CloneTo(c4489zj3);
        float fM18506k4 = c4489zj.m18506k4();
        float fM67480k4 = C14116yg.m67480k4(c4489zj2.m18506k4());
        float fM67480k42 = C14116yg.m67480k4(c4489zj3.m18506k4());
        float[] fArr = new float[2];
        fArr[z6 ? 1 : 0] = fM67480k4;
        fArr[1] = fM67480k42;
        c4489zj.m18507k4(C4479w6.m18405k4(fM18506k4, fArr));
        float fM18511x1 = c4489zj.m18511x1();
        float fM67480k43 = C14116yg.m67480k4(c4489zj2.m18511x1());
        float fM67480k44 = C14116yg.m67480k4(c4489zj3.m18511x1());
        float[] fArr2 = new float[2];
        fArr2[z6 ? 1 : 0] = fM67480k43;
        fArr2[1] = fM67480k44;
        c4489zj.m18512x1(C4479w6.m18405k4(fM18511x1, fArr2));
        float fM18508kk = c4489zj.m18508kk();
        float fM67480k45 = C14116yg.m67480k4(c4489zj2.m18508kk());
        float fM67480k46 = C14116yg.m67480k4(c4489zj3.m18508kk());
        float[] fArr3 = new float[2];
        fArr3[z6 ? 1 : 0] = fM67480k45;
        fArr3[1] = fM67480k46;
        c4489zj.m18509kk(C4479w6.m18405k4(fM18508kk, fArr3));
        C4443em c4443em = new C4443em(c14365qy.m69870wy().mo67711m9(), c14365qy.m69870wy().mo67708dy());
        C4443em c4443em2 = new C4443em();
        float[] fArr4 = new float[1];
        fArr4[z6 ? 1 : 0] = f3;
        C4443em[] c4443emArr = {c4443em2};
        C4473um c4473umClone3 = ck8.m4610k4(fArrM72889k4, c4473umClone.Clone(), c4489zj.Clone(), c4443em.Clone(), fArr4, c4443emArr).Clone();
        float f4 = fArr4[z6 ? 1 : 0];
        c4443emArr[z6 ? 1 : 0].CloneTo(c4443em2);
        m72886k4(tfmVar2, c4473umClone2.Clone(), c4473umClone.Clone(), C4473um.m18362k4(new C4489zj(f3, f3, f4).Clone(), new C4489zj(f3, f3, f3).Clone(), new C4489zj(f3, 1.0f, f3).Clone()).Clone().Clone(), c4473umClone3.Clone(), m72883k4(rotation3D, z4, z5, f).Clone().Clone(), c4459os3.Clone(), c4443em2.Clone());
    }
}
