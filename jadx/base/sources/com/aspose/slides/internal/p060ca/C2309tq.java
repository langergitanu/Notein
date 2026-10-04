package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.tq */
/* JADX INFO: loaded from: classes3.dex */
public class C2309tq extends AbstractC2406ze {
    @Override // com.aspose.slides.internal.p060ca.AbstractC2406ze
    /* JADX INFO: renamed from: k4 */
    public void mo10714k4() {
        C2138j2 c2138j2 = (C2138j2) C7019kk.m27452k4((Object) this.f8349k4, C2138j2.class);
        if (c2138j2 != null) {
            C2098gi c2098gi = new C2098gi(this.f8350x1, false);
            try {
                C2138j2 c2138j22 = (C2138j2) this.f8349k4;
                C2286s7 c2286s7 = (C2286s7) c2138j2.mo10804yj();
                C2398z1 c2398z1Mo10802up = c2138j22.mo10802up();
                C2319ub c2319ub = C2319ub.f8011k4;
                if (!c2398z1Mo10802up.m11785x1(c2319ub)) {
                    c2138j22.mo10802up().m11782k4(c2319ub);
                }
                C3152yj c3152yj = new C3152yj();
                try {
                    C2165kp c2165kp = new C2165kp(this.f8349k4.mo10259ck().m10333kk()[0].m11428kk(), 0L);
                    try {
                        C2274ri c2274ri = new C2274ri();
                        byte[] bArrM10965x1 = c2165kp.m10965x1(c2286s7.m11382k4().m11738k4().m10514x1());
                        c3152yj.write(bArrM10965x1, 0, bArrM10965x1.length);
                        byte[] bArrM10965x12 = c2165kp.m10965x1((int) ((c2286s7.m11382k4().m11739kk().m11212x1() - c2286s7.m11382k4().m11739kk().m11203k4()) + 1));
                        c3152yj.write(bArrM10965x12, 0, bArrM10965x12.length);
                        C2410zj c2410zj = new C2410zj(c2165kp);
                        C2234os c2234os = new C2234os();
                        c2410zj.m11826k4(c2234os);
                        new C2363x5().m11666k4(c2274ri, c2234os);
                        c3152yj.dispose();
                        C3134k4 c3134k4 = new C3134k4(this.f8349k4.mo10259ck().m10333kk()[0].m11428kk().mo10245x1());
                        try {
                            byte[] bArrM13372dy = c3134k4.m13372dy((int) this.f8349k4.mo10259ck().m10333kk()[0].m11428kk().mo10245x1().getLength());
                            c3134k4.dispose();
                            c2098gi.m10592k4(bArrM13372dy);
                            c2098gi.dispose();
                        } catch (Throwable th) {
                            c3134k4.dispose();
                            throw th;
                        }
                    } finally {
                        c2165kp.dispose();
                    }
                } catch (Throwable th2) {
                    c3152yj.dispose();
                    throw th2;
                }
            } catch (Throwable th3) {
                c2098gi.dispose();
                throw th3;
            }
        }
    }
}
