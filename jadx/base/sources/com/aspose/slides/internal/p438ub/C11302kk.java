package com.aspose.slides.internal.p438ub;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p110ek.AbstractC3752x1;
import com.aspose.slides.internal.p110ek.C3750kk;
import com.aspose.slides.internal.p132fj.C4047sv;
import com.aspose.slides.internal.p132fj.C4051ts;
import com.aspose.slides.internal.p132fj.C4053um;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p280ms.C6491kk;
import com.aspose.slides.internal.p280ms.C6493x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p377r9.C9989qq;
import com.aspose.slides.internal.p446uo.C11457ar;
import com.aspose.slides.internal.p446uo.C11463c6;
import com.aspose.slides.internal.p454v0.C11600k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p543z9.C13464ck;
import com.aspose.slides.internal.p543z9.C13474jd;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ub.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11302kk extends AbstractC11303x1 {
    public C11302kk(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC12536x1 m54290k4() {
        C11600k4 c11600k4 = new C11600k4();
        C4051ts c4051ts = new C4051ts();
        C11463c6 c11463c6 = new C11463c6();
        long position = m54292kk().getPosition();
        C4051ts[] c4051tsArr = {c4051ts};
        boolean zM54516k4 = c11463c6.m54516k4(c4051tsArr, m54292kk());
        C4051ts c4051ts2 = c4051tsArr[0];
        if (zM54516k4) {
            C12014ne c12014neClone = c4051ts2.m16098x1().m57807h4().Clone();
            if (c12014neClone.m56663c5() != 0 && c12014neClone.m56683x1() != 0) {
                c11600k4.m54631k4(c4051ts2);
            }
        } else {
            m54292kk().seek(position, 0);
        }
        C4053um[] c4053umArr = {new C4053um()};
        boolean zM54515k4 = new C11457ar().m54515k4(c4053umArr, m54292kk());
        C4053um c4053um = c4053umArr[0];
        if (!zM54515k4) {
            throw new C6491kk();
        }
        c11600k4.m54632k4(c4053um);
        C13474jd c13474jd = new C13474jd();
        do {
            if (m54292kk().getPosition() >= (((((c11600k4.m54628ck().m16118to() & 4294967295L) * 2) & 4294967295L) + ((long) (c11600k4.m54629fa() != null ? c11600k4.m54629fa().m16090h4() : 0))) & 4294967295L)) {
                break;
            }
            C4047sv c4047sv = new C4047sv();
            long position2 = m54292kk().getPosition();
            try {
                C4047sv[] c4047svArr = {c4047sv};
                boolean zM15060k4 = AbstractC3752x1.m15060k4(c4047svArr, m54292kk());
                C4047sv c4047sv2 = c4047svArr[0];
                if (!zM15060k4) {
                    throw new C6493x1("Unable to read wmf records");
                }
                AbstractC3752x1 abstractC3752x1M15055k4 = C3750kk.m15055k4(c4047sv2.m16063ks());
                C4047sv[] c4047svArr2 = {c4047sv2};
                boolean zMo15061x1 = abstractC3752x1M15055k4.mo15061x1(c4047svArr2, m54292kk());
                C4047sv c4047sv3 = c4047svArr2[0];
                if (zMo15061x1) {
                    C13464ck c13464ck = (C13464ck) C7019kk.m27452k4((Object) c4047sv3, C13464ck.class);
                    if (c13464ck != null) {
                        c13474jd.m62657k4(c13464ck);
                        if (c13474jd.m62658k4()) {
                            c11600k4.m58364k4().addItem(c13474jd);
                            c13474jd = new C13474jd();
                        }
                    }
                    c11600k4.m58364k4().addItem(c4047sv3);
                } else {
                    C6005k4.m24263kk(C14113y2.m67408k4("***Error***: Failed to read wmf record. Type:", C14042ak.m66410k4(C9989qq.class, c4047sv3.m16063ks())));
                }
                if (c4047sv3.m16063ks() == 0) {
                    break;
                }
                long jM16068yj = (((c4047sv3.m16068yj() & 4294967295L) * 2) & 4294967295L) - ((long) ((int) (m54292kk().getPosition() - position2)));
                if (jM16068yj > 0) {
                    m54292kk().seek(jM16068yj, 1);
                } else if (jM16068yj < 0) {
                    throw new C6490k4("Readed more bytes than the record size.");
                }
            } catch (RuntimeException unused) {
            }
        } while (m54292kk().getPosition() + 6 <= (((((c11600k4.m54628ck().m16118to() & 4294967295L) * 2) & 4294967295L) + ((long) (c11600k4.m54629fa() != null ? c11600k4.m54629fa().m16090h4() : 0))) & 4294967295L));
        return c11600k4;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m54291x1() {
        long position = m54292kk().getPosition();
        try {
            if (!new C11463c6().m54516k4(new C4051ts[]{new C4051ts()}, m54292kk())) {
                m54292kk().seek(position, 0);
            }
            boolean z = !(!new C11457ar().m54515k4(new C4053um[]{new C4053um()}, m54292kk()));
            m54292kk().seek(position, 0);
            return z;
        } catch (Throwable th) {
            m54292kk().seek(position, 0);
            throw th;
        }
    }
}
