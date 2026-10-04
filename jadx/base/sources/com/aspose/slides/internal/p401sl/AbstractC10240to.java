package com.aspose.slides.internal.p401sl;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p200j6.AbstractC5200du;
import com.aspose.slides.internal.p200j6.C5204jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p333p8.C9427jd;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.sl.to */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10240to extends AbstractC10239m9 {

    /* JADX INFO: renamed from: k4 */
    private String f36696k4;

    /* JADX INFO: renamed from: x1 */
    private C9421c5 f36697x1;

    public AbstractC10240to(C9427jd c9427jd, C9421c5 c9421c5) {
        super(c9427jd);
        m50136k4(c9421c5);
    }

    /* JADX INFO: renamed from: k4 */
    private float m50134k4(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 255.0f) {
            return 255.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: ck */
    public final C7185jd m50138ck() {
        C7185jd c7185jdMo27768h4 = m50133yj().mo27768h4(C7182dy.f19504kw);
        if (c7185jdMo27768h4 != null) {
            return c7185jdMo27768h4;
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public final int m50139du() {
        return m50133yj().m27796k4(C7182dy.f19424fj, -1);
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m50140dy() {
        return m50133yj().m27807k4(C7182dy.f19376cz, false);
    }

    /* JADX INFO: renamed from: fa */
    public final C7186k4 m50141fa() {
        C7185jd c7185jdMo27768h4 = m50133yj().mo27768h4(C7182dy.f19381dc);
        if (c7185jdMo27768h4 == null || !C7019kk.m27469x1(c7185jdMo27768h4, C7186k4.class)) {
            return null;
        }
        return (C7186k4) c7185jdMo27768h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m50142h4() {
        return m50133yj().m27796k4(C7182dy.f19359by, -1);
    }

    /* JADX INFO: renamed from: jd */
    public final int m50143jd() {
        return m50133yj().m27797k4(C7182dy.f19366c6, C7182dy.f19431g8, -1);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C12009k4 mo50124k4();

    /* JADX INFO: renamed from: k4 */
    public abstract void mo50125k4(AbstractC3150x6 abstractC3150x6);

    /* JADX INFO: renamed from: kk */
    public final C9421c5 m50147kk() {
        return this.f36697x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC5200du m50148m9() {
        C7180ck c7180ckM50133yj = m50133yj();
        C7185jd c7185jdM27799k4 = c7180ckM50133yj.m27799k4(C7182dy.f19487jw, C7182dy.f19546na);
        if (c7185jdM27799k4 != null) {
            return AbstractC5200du.m22203k4(c7185jdM27799k4, m50147kk());
        }
        C7185jd c7185jdMo27768h4 = c7180ckM50133yj.mo27768h4(C7182dy.f19737ze);
        if (C7182dy.f19669vh.equals(c7185jdMo27768h4) || C7182dy.f19601qw.equals(c7185jdMo27768h4)) {
            return new C5204jd();
        }
        if (C7182dy.f19602qx.equals(c7185jdMo27768h4) || m50140dy()) {
            return new C5204jd();
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC10240to m50149to() {
        C7185jd c7185jdMo27768h4 = m50132ks().m46156x1().mo27768h4(C7182dy.f19372cl);
        if (c7185jdMo27768h4 != null) {
            return (AbstractC10240to) AbstractC10239m9.m50130k4(c7185jdMo27768h4, m50147kk());
        }
        return null;
    }

    /* JADX INFO: renamed from: up */
    public final AbstractC10240to m50150up() {
        C7185jd c7185jdMo27768h4 = m50132ks().m46156x1().mo27768h4(C7182dy.f19372cl);
        if (c7185jdMo27768h4 == null) {
            return null;
        }
        return (AbstractC10240to) AbstractC10239m9.m50130k4(c7185jdMo27768h4, m50147kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final C12009k4 m50151x1(C12009k4 c12009k4) {
        C12009k4 c12009k4Mo50124k4;
        C7185jd c7185jdM50138ck = m50138ck();
        if (!C7019kk.m27469x1(c7185jdM50138ck, C7180ck.class) || (c12009k4Mo50124k4 = ((AbstractC10240to) AbstractC10239m9.m50130k4((C7180ck) c7185jdM50138ck, m50147kk())).mo50124k4()) == null) {
            return c12009k4;
        }
        C12009k4 c12009k42 = new C12009k4(c12009k4Mo50124k4.mo15760yj(), c12009k4Mo50124k4.mo15757m9(), 2498570);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
        try {
            abstractC12008jdM56582k4.mo17507k4(c12009k4, new C12007ix(0.0f, 0.0f, c12009k4Mo50124k4.mo15760yj(), c12009k4Mo50124k4.mo15757m9()).Clone(), new C12007ix(0.0f, 0.0f, c12009k4.mo15760yj(), c12009k4.mo15757m9()).Clone(), 2);
            abstractC12008jdM56582k4.mo17495k4(1);
            abstractC12008jdM56582k4.mo17503k4((AbstractC12002ck) c12009k4Mo50124k4, 0, 0);
            abstractC12008jdM56582k4.dispose();
            return c12009k42;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    public AbstractC10240to(C9427jd c9427jd, String str) {
        super(c9427jd);
        this.f36696k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m50137x1() {
        return "Image";
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m50144k4(C12009k4 c12009k4) {
        C12009k4 c12009k42 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9(), 2498570);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
        try {
            C12003du c12003duClone = C12003du.f40505to.Clone();
            C12003du.m56460uz().CloneTo(c12003duClone);
            abstractC12008jdM56582k4.mo17526k4((AbstractC12024x1) new C11999ar(c12003duClone.Clone()), 0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9());
            C7186k4 c7186k4M50141fa = m50141fa();
            if (c7186k4M50141fa == null || c7186k4M50141fa.m27786to(0) != 1) {
                abstractC12008jdM56582k4.mo17495k4(1);
            } else {
                abstractC12008jdM56582k4.mo17495k4(0);
            }
            abstractC12008jdM56582k4.mo17503k4((AbstractC12002ck) c12009k4, 0, 0);
            abstractC12008jdM56582k4.dispose();
            return c12009k42;
        } finally {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private C12009k4 m50135k4(C12009k4 c12009k4, int i, int i2) {
        C12009k4 c12009k42 = new C12009k4(i, i2, 139273);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k42);
        try {
            abstractC12008jdM56582k4.mo17560kk(7);
            abstractC12008jdM56582k4.mo17586x1(2);
            abstractC12008jdM56582k4.mo17481h4(2);
            abstractC12008jdM56582k4.mo17512k4(c12009k4, new C12014ne(0, 0, i, i2), new C12014ne(0, 0, c12009k4.mo15760yj() > 1 ? c12009k4.mo15760yj() - 1 : c12009k4.mo15760yj(), c12009k4.mo15757m9() > 1 ? c12009k4.mo15757m9() - 1 : c12009k4.mo15757m9()), 2);
            abstractC12008jdM56582k4.dispose();
            return c12009k42;
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m50145k4(C12009k4 c12009k4, boolean z, float[] fArr) {
        C12009k4 c12009k4Mo50124k4;
        int i;
        int i2;
        C12009k4 c12009k4M50135k4 = c12009k4;
        int i3 = 0;
        int i4 = 1;
        if (m50140dy()) {
            return m50144k4(c12009k4);
        }
        if (m50138ck() != null) {
            return m50151x1(c12009k4);
        }
        AbstractC10240to abstractC10240toM50150up = m50150up();
        if (abstractC10240toM50150up == null || (c12009k4Mo50124k4 = abstractC10240toM50150up.mo50124k4()) == null) {
            return c12009k4M50135k4;
        }
        int iMo15760yj = c12009k4M50135k4.mo15760yj();
        int iMo15757m9 = c12009k4M50135k4.mo15757m9();
        if (c12009k4Mo50124k4.mo15760yj() < iMo15760yj || c12009k4Mo50124k4.mo15757m9() < iMo15757m9) {
            c12009k4Mo50124k4 = m50135k4(c12009k4Mo50124k4, iMo15760yj, iMo15757m9);
        } else {
            iMo15760yj = c12009k4Mo50124k4.mo15760yj();
            iMo15757m9 = c12009k4Mo50124k4.mo15757m9();
            c12009k4M50135k4 = m50135k4(c12009k4M50135k4, iMo15760yj, iMo15757m9);
        }
        C12009k4 c12009k42 = new C12009k4(iMo15760yj, iMo15757m9, 2498570);
        float[] fArr2 = new float[4];
        float[] fArr3 = new float[4];
        for (int i5 = 0; i5 < iMo15757m9; i5++) {
            int i6 = i3;
            while (i6 < iMo15760yj) {
                C12003du c12003duClone = c12009k4M50135k4.m56609x1(i6, i5).Clone();
                fArr2[i3] = c12003duClone.m56507jd() & 255;
                fArr2[i4] = c12003duClone.m56502ck() & 255;
                float fM56505fa = c12003duClone.m56505fa() & 255;
                fArr2[2] = fM56505fa;
                fArr3[i3] = fArr2[i3];
                fArr3[i4] = fArr2[i4];
                fArr3[2] = fM56505fa;
                float[] fArr4 = new float[i4];
                fArr4[i3] = c12009k4Mo50124k4.m56609x1(i6, i5).Clone().m56507jd() & 255;
                if (z) {
                    float f = fArr4[i3];
                    fArr3[3] = f;
                    i = i3;
                    if (fArr != null) {
                        i2 = i4;
                        if (!C14067j2.m66728k4(Float.valueOf(f), Float.valueOf(0.0f))) {
                            float f2 = fArr3[i] / 255.0f;
                            float f3 = fArr[i];
                            fArr3[i] = m50134k4((((f2 - f3) / (fArr4[i] / 255.0f)) + f3) * 255.0f);
                            float f4 = fArr3[i2] / 255.0f;
                            float f5 = fArr[i2];
                            fArr3[i2] = m50134k4((((f4 - f5) / (fArr4[i] / 255.0f)) + f5) * 255.0f);
                            float f6 = fArr3[2] / 255.0f;
                            float f7 = fArr[2];
                            fArr3[2] = m50134k4((((f6 - f7) / (fArr4[i] / 255.0f)) + f7) * 255.0f);
                        }
                    } else {
                        i2 = i4;
                    }
                } else {
                    i = i3;
                    i2 = i4;
                    fArr3[3] = 255.0f - fArr4[i];
                }
                c12009k42.m56604k4(i6, i5, C12003du.m56398k4(C7019kk.m27462to(Float.valueOf(fArr3[3]), 13), C7019kk.m27462to(Float.valueOf(fArr3[i]), 13), C7019kk.m27462to(Float.valueOf(fArr3[i2]), 13), C7019kk.m27462to(Float.valueOf(fArr3[2]), 13)).Clone().Clone());
                i6++;
                i3 = i;
                i4 = i2;
            }
        }
        return c12009k42;
    }

    /* JADX INFO: renamed from: k4 */
    private void m50136k4(C9421c5 c9421c5) {
        this.f36697x1 = c9421c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final float[] m50146k4(AbstractC10240to abstractC10240to) {
        C7187kk c7187kk = (C7187kk) C7019kk.m27452k4((Object) abstractC10240to.mo8461c5(), C7187kk.class);
        if (c7187kk == null) {
            return null;
        }
        C7185jd c7185jdMo27767fa = c7187kk.mo27767fa(C7182dy.f19476j6);
        if (!C7019kk.m27469x1(c7185jdMo27767fa, C7186k4.class)) {
            return null;
        }
        float[] fArrM27788x1 = ((C7186k4) c7185jdMo27767fa).m27788x1();
        if (fArrM27788x1.length < m50148m9().mo8467du()) {
            return null;
        }
        return m50148m9().mo8468k4(fArrM27788x1);
    }
}
