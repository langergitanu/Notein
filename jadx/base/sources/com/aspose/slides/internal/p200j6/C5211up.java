package com.aspose.slides.internal.p200j6;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p333p8.C9427jd;
import com.aspose.slides.internal.p348q1.C9612x1;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.up */
/* JADX INFO: loaded from: classes.dex */
public class C5211up extends AbstractC5205k4 {

    /* JADX INFO: renamed from: du */
    private C5210to f14225du;

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f14226k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC5200du f14227kk;

    /* JADX INFO: renamed from: to */
    private boolean f14228to = false;

    /* JADX INFO: renamed from: x1 */
    private C9427jd f14229x1;

    public C5211up(C7186k4 c7186k4) {
        this.f14226k4 = c7186k4;
        this.f14229x1 = new C9427jd((C7180ck) c7186k4.m27787x1(1));
        m22229m9();
    }

    /* JADX INFO: renamed from: dy */
    private void m22226dy() {
        AbstractC5200du abstractC5200duM22231h4 = m22231h4();
        this.f14227kk = abstractC5200duM22231h4;
        if (abstractC5200duM22231h4.equals(C5202fa.f14208k4)) {
            this.f14228to = true;
        }
        this.f14225du = this.f14227kk.mo8469kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static C5211up m22227k4(C7186k4 c7186k4, C9421c5 c9421c5) {
        m22228k4(c7186k4);
        C7185jd c7185jdM27785kk = c7186k4.m27785kk(1);
        if (!C7019kk.m27469x1(c7185jdM27785kk, C7185jd.class)) {
            c7185jdM27785kk = null;
        }
        if (c7185jdM27785kk != null && c9421c5 != null && c9421c5.m46094du() != null) {
            AbstractC5200du abstractC5200duM46157k4 = c9421c5.m46094du().m46157k4(c7185jdM27785kk);
            if (C7019kk.m27469x1(abstractC5200duM46157k4, C5211up.class)) {
                return (C5211up) abstractC5200duM46157k4;
            }
        }
        C5211up c5211up = new C5211up(c7186k4);
        if (c7185jdM27785kk != null && c9421c5 != null && c9421c5.m46094du() != null) {
            c9421c5.m46094du().m46158k4(c7185jdM27785kk, c5211up);
        }
        return c5211up;
    }

    /* JADX INFO: renamed from: m9 */
    private void m22229m9() {
        try {
            m22226dy();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static String m22230x1() {
        return "ICCBased";
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        return this.f14229x1.m46156x1().m27790c5(C7182dy.f19456hu);
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC5200du m22231h4() {
        C7186k4 c7186k4;
        C7182dy c7182dy;
        C7185jd c7185jdMo27768h4 = ((C7187kk) this.f14229x1.mo8461c5()).mo27768h4(C7182dy.f19526m9);
        if (c7185jdMo27768h4 == null) {
            c7186k4 = new C7186k4();
            int iMo8467du = mo8467du();
            if (iMo8467du == 1) {
                c7182dy = C7182dy.f19693x3;
            } else if (iMo8467du == 3) {
                c7182dy = C7182dy.f19650u5;
            } else {
                if (iMo8467du != 4) {
                    throw new IOException(C14113y2.m67408k4("Unknown color space number of components:", C14057f9.m66591x1(iMo8467du)));
                }
                c7182dy = C7182dy.f19335af;
            }
            c7186k4.m27783k4(c7182dy);
        } else if (C7019kk.m27469x1(c7185jdMo27768h4, C7186k4.class)) {
            c7186k4 = (C7186k4) c7185jdMo27768h4;
        } else {
            if (!C7019kk.m27469x1(c7185jdMo27768h4, C7182dy.class)) {
                throw new IOException("Error: expected CosArray or CosName");
            }
            C7186k4 c7186k42 = new C7186k4();
            c7186k42.m27783k4(c7185jdMo27768h4);
            c7186k4 = c7186k42;
        }
        return AbstractC5200du.m22202k4(c7186k4);
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f14225du == null) {
            int iMo8467du = mo8467du();
            float[] fArr = new float[iMo8467du];
            for (int i = 0; i < iMo8467du; i++) {
                fArr[i] = C14116yg.m67481k4(0.0f, m22232k4(i).m46940k4());
            }
            this.f14225du = new C5210to(fArr, this);
        }
        return this.f14225du;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return m22230x1();
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5205k4
    /* JADX INFO: renamed from: k4 */
    public C7186k4 mo22215k4() {
        return this.f14226k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9612x1 m22232k4(int i) {
        C7186k4 c7186k4M27793dy = ((C7187kk) this.f14229x1.mo8461c5()).m27793dy(C7182dy.f19582pq);
        return (c7186k4M27793dy == null || c7186k4M27793dy.m27778k4() < mo8467du() * 2) ? new C9612x1() : new C9612x1(c7186k4M27793dy, i);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m22228k4(C7186k4 c7186k4) {
        if (c7186k4.m27778k4() < 2) {
            throw new IOException("ICCBased colorspace array must have two elements");
        }
        if (!C7019kk.m27469x1(c7186k4.m27787x1(1), C7180ck.class)) {
            throw new IOException("ICCBased colorspace array must have a stream as second element");
        }
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        return this.f14228to ? fArr : this.f14227kk.mo8468k4(fArr);
    }
}
