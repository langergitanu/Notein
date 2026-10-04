package com.aspose.slides.internal.p155gv;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p302nm.C6920du;
import com.aspose.slides.internal.p302nm.C6921dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10913um;
import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.gv.du */
/* JADX INFO: loaded from: classes.dex */
public class C4380du {

    /* JADX INFO: renamed from: k4 */
    private final C10898dy f11903k4;

    /* JADX INFO: renamed from: kk */
    private final C10913um f11904kk;

    /* JADX INFO: renamed from: x1 */
    private final C10894bv f11905x1;

    /* JADX INFO: renamed from: to */
    private static final float[] f11902to = new float[0];

    /* JADX INFO: renamed from: du */
    private static final float[] f11898du = {3.0f, 1.0f};

    /* JADX INFO: renamed from: h4 */
    private static final float[] f11900h4 = {1.0f, 1.0f};

    /* JADX INFO: renamed from: m9 */
    private static final float[] f11901m9 = {3.0f, 1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: dy */
    private static final float[] f11899dy = {3.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    public C4380du(C10898dy c10898dy, C10913um c10913um, C10894bv c10894bv) {
        this.f11903k4 = c10898dy;
        this.f11904kk = c10913um;
        this.f11905x1 = c10894bv;
    }

    /* JADX INFO: renamed from: k4 */
    private void m17692k4(C4318fa c4318fa, boolean z) {
        C5656k4 c5656k4M17352x1 = c4318fa.m17352x1();
        if (this.f11903k4.m52454fa() && c4318fa.m17352x1().m23105x1() < 255) {
            c5656k4M17352x1 = C5656k4.m23094k4(c5656k4M17352x1, new C5656k4(255, 255, 255, 255));
        }
        this.f11903k4.m52456jd().m17767k4(c5656k4M17352x1, z, this.f11905x1);
    }

    /* JADX INFO: renamed from: kk */
    private static int m17696kk(C4320jd c4320jd) {
        int iM17358du = c4320jd.m17358du();
        if (iM17358du != 1) {
            return iM17358du != 2 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: to */
    private static int m17697to(C4320jd c4320jd) {
        return c4320jd.m17356c5() != 2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m17698x1(C4320jd c4320jd) {
        int iM17369kk = c4320jd.m17369kk();
        if (iM17369kk == 1) {
            return 2;
        }
        if (iM17369kk == 2) {
            return 1;
        }
        int iM17373to = c4320jd.m17373to();
        if (iM17373to != 1) {
            return iM17373to != 2 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17699k4(C4320jd c4320jd) {
        int iM17697to;
        boolean z = true;
        m17700k4(c4320jd.m17362h4(), true);
        this.f11903k4.m52456jd().m17769kk(c4320jd.m17375x1(), this.f11905x1);
        int iM17698x1 = m17698x1(c4320jd);
        this.f11903k4.m52456jd().m17775x1(iM17698x1, this.f11905x1);
        this.f11903k4.m52456jd().m17770kk(m17696kk(c4320jd), this.f11905x1);
        if (c4320jd.m17358du() == 3) {
            this.f11903k4.m52456jd().m17772to(c4320jd.m17372m9(), this.f11905x1);
        }
        if (c4320jd.m17364jd() != 0) {
            if (iM17698x1 == 0) {
                iM17697to = m17697to(c4320jd);
                this.f11903k4.m52456jd().m17775x1(iM17697to, this.f11905x1);
            } else {
                iM17697to = 0;
            }
            if (iM17698x1 == 0 && iM17697to == 0) {
                z = false;
            }
            m17694k4(m17695k4(c4320jd, z), c4320jd.m17360dy(), this.f11905x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17693k4(C4320jd c4320jd, float[] fArr, boolean z) {
        float fM67481k4 = C14116yg.m67481k4(c4320jd.m17375x1(), 1.0f);
        for (int i = 0; i < fArr.length; i++) {
            if (C12565ks.m58618k4(i)) {
                float f = fArr[i];
                if (z) {
                    f += 1.0f;
                }
                fArr[i] = f * fM67481k4;
            } else {
                float f2 = fArr[i];
                if (z) {
                    f2 -= 1.0f;
                }
                fArr[i] = f2 * fM67481k4;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17700k4(C4328x1 c4328x1, boolean z) {
        if (c4328x1.m17417k4() == 0) {
            m17692k4((C4318fa) c4328x1, z);
            return;
        }
        AbstractC4385m9 abstractC4385m9M52560k4 = this.f11904kk.m52560k4(c4328x1, this.f11903k4.m52456jd().m17773x1().m17747x1().m17345kk());
        this.f11903k4.m52456jd().m17766k4(C4383k4.m17717to(), z, this.f11905x1);
        this.f11905x1.m52431kk("/{0} {1}", abstractC4385m9M52560k4.m52566ck(), z ? "SCN" : "scn");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17701k4(byte[] bArr, C6921dy c6921dy, C12007ix c12007ix, C6920du c6920du, boolean z) {
        C4317dy c4317dy;
        this.f11903k4.m52456jd().m17768k4(this.f11905x1);
        if (z) {
            c4317dy = new C4317dy(c12007ix.m56550c5(), 0.0f, 0.0f, -c12007ix.m56575x1(), c12007ix.m56557jd(), c12007ix.m56575x1() + c12007ix.m56551ck());
        } else {
            c4317dy = new C4317dy(c12007ix.m56550c5(), 0.0f, 0.0f, c12007ix.m56575x1(), c12007ix.m56557jd(), c12007ix.m56551ck());
        }
        this.f11903k4.m52456jd().m17765k4(c4317dy, this.f11905x1);
        this.f11905x1.m52430kk("/{0} Do", this.f11904kk.m52559k4(bArr, c6921dy, c6920du).m52566ck());
        this.f11903k4.m52456jd().m17776x1(this.f11905x1);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m17694k4(float[] fArr, float f, C10894bv c10894bv) {
        c10894bv.m52428k4(fArr);
        c10894bv.m52426k4(" ");
        c10894bv.m52426k4(C10921yd.m52639x1(f));
        c10894bv.m52426k4(" d ");
    }

    /* JADX INFO: renamed from: k4 */
    private static float[] m17695k4(C4320jd c4320jd, boolean z) {
        float[] fArrM17357ck;
        int iM17364jd = c4320jd.m17364jd();
        if (iM17364jd == 0) {
            fArrM17357ck = f11902to;
        } else if (iM17364jd == 1) {
            fArrM17357ck = f11898du;
        } else if (iM17364jd == 2) {
            fArrM17357ck = f11900h4;
        } else if (iM17364jd == 3) {
            fArrM17357ck = f11901m9;
        } else if (iM17364jd == 4) {
            fArrM17357ck = f11899dy;
        } else {
            if (iM17364jd != 5) {
                throw new InvalidOperationException("Unknown dash style.");
            }
            fArrM17357ck = c4320jd.m17357ck();
        }
        float[] fArr = (float[]) C7019kk.m27458kk(AbstractC14092to.m67208k4(fArrM17357ck).deepClone(), float[].class);
        m17693k4(c4320jd, fArr, z);
        return fArr;
    }
}
