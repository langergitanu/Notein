package com.aspose.slides.internal.p290n3;

import com.aspose.slides.internal.p040bg.AbstractC1692du;
import com.aspose.slides.internal.p040bg.AbstractC1701up;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p349q3.C9674m2;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.n3.ks */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6719ks extends AbstractC1692du {
    public AbstractC6719ks(AbstractC1701up abstractC1701up) {
        super(abstractC1701up);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m26517k4(float f, float f2) {
        return (float) (C14116yg.m67498to(f, f2) * 57.29577951308232d);
    }

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: h4 */
    public void mo7733h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C9674m2 c9674m2 = (C9674m2) c9723vw;
        C12025x6 c12025x6Clone = c9674m2.m47441x1().m57782to().Clone();
        C12025x6 c12025x6Clone2 = c9674m2.m47440kk().m57782to().Clone();
        C12014ne c12014neClone = c9674m2.m47436k4().m57842dy().Clone();
        C12025x6 c12025x6 = new C12025x6((c12014neClone.m56663c5() / 2.0f) + c12014neClone.m56669jd(), (c12014neClone.m56683x1() / 2.0f) + c12014neClone.m56664ck());
        float fM26517k4 = m26517k4(c12025x6Clone.m56895kk() - c12025x6.m56895kk(), c12025x6Clone.m56897x1() - c12025x6.m56897x1());
        float fM26517k42 = m26517k4(c12025x6Clone2.m56895kk() - c12025x6.m56895kk(), c12025x6Clone2.m56897x1() - c12025x6.m56897x1());
        if (fM26517k4 < 0.0f) {
            fM26517k4 += 360.0f;
        }
        if (fM26517k42 < 0.0f) {
            fM26517k42 += 360.0f;
        }
        float f = fM26517k4 > fM26517k42 ? fM26517k4 - fM26517k42 : 360.0f - (fM26517k42 - fM26517k4);
        if (c3585h4.m14582yj()) {
            c3585h4.m14556up().m55580x1(c12014neClone.Clone(), fM26517k42, f);
        } else {
            mo7779k4(c12014neClone.Clone(), fM26517k42, f, c3585h4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo7779k4(C12014ne c12014ne, float f, float f2, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p040bg.AbstractC1692du
    /* JADX INFO: renamed from: m9 */
    public boolean mo9136m9(C9723vw c9723vw, C3585h4 c3585h4) {
        return !c3585h4.m14582yj();
    }
}
