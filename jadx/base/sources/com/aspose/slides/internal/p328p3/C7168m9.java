package com.aspose.slides.internal.p328p3;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p109ei.AbstractC3729dy;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p110ek.C3749k4;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p251li.C6049ck;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p372qx.C9962k4;
import com.aspose.slides.internal.p372qx.C9963x1;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.p3.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C7168m9 extends AbstractC3729dy {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3734k4 f19313k4 = new C7165k4(this);

    /* JADX INFO: renamed from: x1 */
    private boolean f19314x1;

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC3734k4 mo15042k4() {
        return this.f19313k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m27749k4(C5659x1 c5659x1, C4328x1 c4328x1, C12025x6 c12025x6, String str, long j, C2638du c2638du) {
        C11913yj c11913yjM55760h4 = c2638du.m12070rv().m55760h4();
        C12015qq c12015qq = new C12015qq();
        C10963ks c10963ks = new C10963ks(c5659x1, c4328x1, (C4320jd) null, c12025x6.Clone(), str, c12015qq.Clone(), 0.0f);
        c10963ks.m52985k4(new C4320jd(C5656k4.f15629ze));
        c10963ks.m53006x1(4);
        c11913yjM55760h4.m55787x1(C9962k4.m49066k4(C9963x1.m49074k4(C12016rv.m56703k4(new C12016rv(C7019kk.m27462to(Float.valueOf(c12025x6.m56897x1()), 13), C7019kk.m27462to(Float.valueOf(c12025x6.m56895kk()), 13))).Clone(), new C4317dy(), c12015qq.Clone(), c5659x1, 6, 0.0f)));
        c10963ks.m52984k4(C9962k4.m49061k4(c11913yjM55760h4));
        C10951c5 c10951c5 = new C10951c5();
        c10951c5.m52930k4(c10963ks);
        ((AbstractC10957fa) c2638du.m12052k4()).m52930k4(c10951c5);
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3729dy
    /* JADX INFO: renamed from: k4 */
    public void mo15017k4(C6049ck c6049ck, C2638du c2638du) {
        String strM67405k4;
        short[] sArrM24462ck = c6049ck.m24462ck();
        if ((c6049ck.m24463dy() & 1) == 1) {
            strM67405k4 = C3749k4.m15046k4(sArrM24462ck);
        } else {
            C9790ts c9790tsMo48032k4 = C9763ck.m48030to().mo48032k4(c2638du.m12041c5().m56651x1().m56527du(), c2638du.m12041c5().m56642jd(), (String) null);
            char[] cArr = new char[sArrM24462ck.length];
            for (int i = 0; i < sArrM24462ck.length; i++) {
                cArr[i] = (char) c9790tsMo48032k4.m48221m9().m48104kk(sArrM24462ck[i]).m48284k4();
            }
            strM67405k4 = C14113y2.m67405k4(cArr);
        }
        String str = strM67405k4;
        C12013m9 c12013m9M12041c5 = c2638du.m12041c5();
        C5659x1 c5659x1M48331k4 = C9763ck.m48030to().m48331k4(c12013m9M12041c5.m56648m9(), c12013m9M12041c5.m56639dy(), c12013m9M12041c5.m56642jd());
        C4328x1 c4328x1M49063k4 = C9962k4.m49063k4(c2638du.m12066ks());
        float fM15016k4 = m15016k4(c2638du.m12041c5());
        if (this.f19314x1) {
            C12025x6 c12025x6Clone = c6049ck.m24465jd()[0].mo19089k4().Clone();
            c12025x6Clone.m56898x1(c12025x6Clone.m56895kk() - fM15016k4);
            m27749k4(c5659x1M48331k4, c4328x1M49063k4, c12025x6Clone.Clone(), str, c6049ck.m24463dy(), c2638du);
        } else {
            for (int i2 = 0; i2 < c6049ck.m24461c5(); i2++) {
                C12025x6 c12025x6Clone2 = c6049ck.m24465jd()[i2].mo19089k4().Clone();
                c12025x6Clone2.m56898x1(c12025x6Clone2.m56895kk() - fM15016k4);
                m27749k4(c5659x1M48331k4, c4328x1M49063k4, c12025x6Clone2.Clone(), C14117yj.m67537ne(str.charAt(i2)), c6049ck.m24463dy(), c2638du);
            }
        }
    }
}
