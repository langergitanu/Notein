package com.aspose.slides.internal.p371qw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p380ri.C10014k4;
import com.aspose.slides.internal.p481wp.C12219du;
import com.aspose.slides.internal.p481wp.C12220dy;
import com.aspose.slides.internal.p481wp.C12236up;
import com.aspose.slides.internal.p513xw.C12682ar;
import com.aspose.slides.internal.p513xw.C12688c6;
import com.aspose.slides.internal.p513xw.C12691dq;
import com.aspose.slides.internal.p513xw.C12694e0;
import com.aspose.slides.internal.p513xw.C12702ix;
import com.aspose.slides.internal.p513xw.C12717os;
import com.aspose.slides.internal.p513xw.C12722rv;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.internal.p513xw.C12743xk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.qw.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C9961yj {

    /* JADX INFO: renamed from: ck */
    private int f35975ck;

    /* JADX INFO: renamed from: du */
    private int f35976du;

    /* JADX INFO: renamed from: dy */
    private boolean f35977dy;

    /* JADX INFO: renamed from: fa */
    private boolean f35978fa;

    /* JADX INFO: renamed from: h4 */
    private int f35979h4;

    /* JADX INFO: renamed from: jd */
    private boolean f35980jd;

    /* JADX INFO: renamed from: kk */
    private C12219du[] f35982kk;

    /* JADX INFO: renamed from: m9 */
    private int f35983m9;

    /* JADX INFO: renamed from: to */
    private int f35984to;

    /* JADX INFO: renamed from: up */
    private int f35985up;

    /* JADX INFO: renamed from: x1 */
    private C9948c5 f35986x1;

    /* JADX INFO: renamed from: k4 */
    public List<C9955k4> f35981k4 = new List<>();

    /* JADX INFO: renamed from: c5 */
    private List<C9955k4> f35974c5 = new List<>();

    public C9961yj(C9948c5 c9948c5) {
        this.f35986x1 = c9948c5;
        this.f35984to = c9948c5.m48907k4().m49033yd().m57097sv();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c5 */
    private void m49044c5() {
        this.f35983m9++;
        C1869to c1869to = new C1869to(this.f35981k4);
        while (c1869to.mo9764x1()) {
            ((C9955k4) c1869to.mo9760kk()).m48982h4();
        }
        this.f35981k4.addRange(this.f35974c5);
        this.f35974c5.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: du */
    private int m49045du() {
        C1869to c1869to = new C1869to(this.f35981k4);
        int iM67507x1 = Integer.MAX_VALUE;
        boolean z = false;
        while (c1869to.mo9764x1()) {
            int iM48979du = ((C9955k4) c1869to.mo9760kk()).m48979du();
            if (iM48979du >= 0) {
                iM67507x1 = C14116yg.m67507x1(iM67507x1, iM48979du);
                z = true;
            }
        }
        if (z) {
            return iM67507x1;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: dy */
    private void m49046dy() {
        C1869to c1869to = new C1869to(this.f35981k4);
        while (c1869to.mo9764x1()) {
            if (((C9955k4) c1869to.mo9760kk()).m48986k4(this.f35983m9)) {
                c1869to.mo9758k4();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    private void m49047h4() {
        C1869to c1869to = new C1869to(this.f35981k4);
        while (c1869to.mo9764x1()) {
            ((C9955k4) c1869to.mo9760kk()).m48993x1(this.f35975ck);
        }
    }

    /* JADX INFO: renamed from: jd */
    private C9959up m49048jd() {
        return this.f35986x1.m48907k4();
    }

    /* JADX INFO: renamed from: kk */
    private int m49054kk() {
        m49051k4(this.f35981k4);
        m49047h4();
        int iM49058x1 = m49058x1(this.f35975ck);
        m49050k4(iM49058x1);
        return iM49058x1;
    }

    /* JADX INFO: renamed from: m9 */
    private void m49055m9() {
        int i = this.f35983m9;
        C12219du[] c12219duArr = this.f35982kk;
        if (i < c12219duArr.length - 1) {
            this.f35979h4 = c12219duArr[i].m57024to().m8163x1() + this.f35979h4;
            m49052k4(this.f35974c5, this.f35983m9 + 1);
            m49051k4(this.f35974c5);
        }
    }

    /* JADX INFO: renamed from: to */
    private int m49056to() {
        if (this.f35977dy) {
            if (this.f35983m9 == this.f35982kk.length - 1) {
                return -1;
            }
            this.f35977dy = false;
            m49046dy();
            this.f35980jd = true;
        }
        if (!this.f35980jd) {
            int iM49058x1 = m49058x1(m49045du());
            m49050k4(iM49058x1);
            return iM49058x1;
        }
        int iM49045du = m49045du();
        if (iM49045du < 0 || iM49045du >= this.f35975ck || iM49045du > this.f35982kk[this.f35983m9].m57015du().m8157kk()) {
            this.f35980jd = false;
            int i = this.f35975ck;
            m49044c5();
            m49047h4();
            iM49045du = m49058x1(i);
        }
        m49050k4(iM49045du);
        return iM49045du;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private int m49057x1() {
        C1869to c1869to = new C1869to(this.f35981k4);
        int iM8163x1 = 0;
        while (c1869to.mo9764x1()) {
            C9955k4 c9955k4 = (C9955k4) c1869to.mo9760kk();
            int iM48992x1 = c9955k4.m48992x1();
            C12236up c12236upM48984k4 = c9955k4.m48984k4();
            int i = this.f35983m9;
            while (true) {
                i++;
                if (i < c12236upM48984k4.m57034h4().m57117sv() + (c12236upM48984k4.m57126ix() - this.f35982kk[0].m57019k4())) {
                    iM48992x1 -= this.f35982kk[i].m57024to().m8163x1();
                }
            }
            iM8163x1 = C14116yg.m67483k4(iM8163x1, iM48992x1);
        }
        int i2 = this.f35983m9;
        while (true) {
            i2++;
            C12219du[] c12219duArr = this.f35982kk;
            if (i2 >= c12219duArr.length) {
                return iM8163x1;
            }
            iM8163x1 += c12219duArr[i2].m57024to().m8163x1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final List<InterfaceC1861h4> m49059k4(C12724ss c12724ss, C12219du[] c12219duArr, int i) {
        C9954jd c9954jd;
        int i2;
        m49053k4(c12219duArr);
        m49052k4(this.f35981k4, 0);
        m49049k4();
        List<InterfaceC1861h4> list = new List<>();
        int iM49054kk = m49054kk();
        int iM67483k4 = 0;
        do {
            int iM49057x1 = (m49057x1() + iM49054kk) - this.f35976du;
            int iM67483k42 = (iM49054kk - iM67483k4) - C14116yg.m67483k4(0, iM49057x1);
            int i3 = -iM49057x1;
            iM67483k4 += C14116yg.m67483k4(0, i3) + iM67483k42;
            List<C12682ar> list2 = new List<>();
            List list3 = new List(this.f35981k4.size());
            C1869to c1869to = new C1869to(this.f35981k4);
            while (c1869to.mo9764x1()) {
                C9955k4 c9955k4 = (C9955k4) c1869to.mo9760kk();
                list3.addItem(c9955k4.m48989m9());
                c9955k4.m48985k4(list2);
            }
            C9954jd c9954jd2 = new C9954jd(m49048jd(), list3, this.f35982kk[this.f35983m9]);
            if (this.f35980jd) {
                c9954jd2.m48970k4(this.f35982kk[this.f35983m9 + 1]);
            }
            if (list.size() == 0) {
                c9954jd2.m48969k4(1, true);
            }
            if (list2.size() == 0) {
                list.addItem(new C12688c6(iM67483k42, c9954jd2, false));
                c9954jd = c9954jd2;
            } else {
                c9954jd = c9954jd2;
                list.addItem(new C12743xk(iM67483k42, list2, (List<C12702ix>) new List(), (C12717os) c9954jd2, false));
            }
            int iM67483k43 = C14116yg.m67483k4(0, iM49057x1);
            C9949ck c9949ck = new C9949ck(m49048jd());
            if (i == 0) {
                if (!m49048jd().m49033yd().m57096s7()) {
                    iM67483k43 += this.f35986x1.m48912to();
                    c9949ck.f35868k4 = this.f35986x1.m48903h4();
                }
                if (!m49048jd().m49033yd().m57088f9()) {
                    iM67483k43 += this.f35986x1.m48901du();
                    c9949ck.f35869x1 = this.f35986x1.m48911m9();
                }
            }
            int i4 = iM67483k43;
            C12691dq c12691dqMo48954kp = m49048jd().mo48954kp();
            C1869to c1869to2 = new C1869to(this.f35981k4);
            int iM67483k44 = 0;
            while (c1869to2.mo9764x1()) {
                C9955k4 c9955k42 = (C9955k4) c1869to2.mo9760kk();
                c12691dqMo48954kp = c12691dqMo48954kp.m58909k4(c9955k42.m48981dy());
                iM67483k44 = C14116yg.m67483k4(iM67483k44, c9955k42.m48978c5());
            }
            if (this.f35977dy) {
                int i5 = this.f35983m9;
                C12219du[] c12219duArr2 = this.f35982kk;
                if (i5 < c12219duArr2.length - 1) {
                    c12691dqMo48954kp = c12691dqMo48954kp.m58909k4(c12219duArr2[i5].m57016dy()).m58909k4(this.f35982kk[this.f35983m9 + 1].m57023m9());
                    int iM49148k4 = C10014k4.m49148k4(this.f35985up, this.f35982kk[this.f35983m9].m57014ck());
                    this.f35985up = iM49148k4;
                    this.f35985up = C10014k4.m49148k4(iM49148k4, this.f35982kk[this.f35983m9 + 1].m57018jd());
                }
            } else {
                c12691dqMo48954kp = c12691dqMo48954kp.m58909k4(this.f35982kk[this.f35983m9].m57013c5());
            }
            int iM58911kk = c12691dqMo48954kp.m58911kk();
            if (this.f35978fa) {
                this.f35978fa = false;
                iM58911kk = 1000;
            }
            int iM67483k45 = C14116yg.m67483k4(iM58911kk, iM67483k44);
            int iM58912x1 = c12691dqMo48954kp.m58912x1();
            int i6 = this.f35985up;
            if (i6 != 9) {
                iM67483k45 = -1000;
                i2 = i6;
            } else {
                i2 = iM58912x1;
            }
            list.addItem(new C12722rv(c9949ck, i4, iM67483k45, i2, c12724ss));
            if (iM49057x1 < 0) {
                list.addItem(new C12694e0(i3, 0, 0, new C12717os(null), true));
            }
            iM49054kk = m49056to();
        } while (iM49054kk >= 0);
        c9954jd.m48969k4(2, true);
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    private void m49049k4() {
        int i = 0;
        this.f35976du = 0;
        while (true) {
            C12219du[] c12219duArr = this.f35982kk;
            if (i >= c12219duArr.length) {
                return;
            }
            this.f35976du = c12219duArr[i].m57024to().m8163x1() + this.f35976du;
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    private int m49058x1(int i) {
        this.f35977dy = true;
        C1869to c1869to = new C1869to(this.f35981k4);
        while (c1869to.mo9764x1()) {
            C9955k4 c9955k4 = (C9955k4) c1869to.mo9760kk();
            if (c9955k4.m48986k4(this.f35983m9)) {
                this.f35977dy = c9955k4.m48983h4(i) & this.f35977dy;
            }
        }
        if (!this.f35977dy) {
            return i;
        }
        C1869to c1869to2 = new C1869to(this.f35981k4);
        int iM67483k4 = 0;
        while (c1869to2.mo9764x1()) {
            C9955k4 c9955k42 = (C9955k4) c1869to2.mo9760kk();
            if (c9955k42.m48986k4(this.f35983m9)) {
                iM67483k4 = C14116yg.m67483k4(iM67483k4, c9955k42.m48990to());
            }
        }
        C1869to c1869to3 = new C1869to(this.f35981k4);
        while (c1869to3.mo9764x1()) {
            C9955k4 c9955k43 = (C9955k4) c1869to3.mo9760kk();
            c9955k43.m48980du(this.f35983m9);
            if (!c9955k43.m48986k4(this.f35983m9)) {
                c9955k43.m48988kk(iM67483k4);
            }
        }
        if (iM67483k4 < i) {
            this.f35978fa = true;
        }
        m49055m9();
        return iM67483k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m49050k4(int i) {
        this.f35985up = 9;
        C1869to c1869to = new C1869to(this.f35981k4);
        while (c1869to.mo9764x1()) {
            this.f35985up = C10014k4.m49148k4(this.f35985up, ((C9955k4) c1869to.mo9760kk()).m48991to(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m49051k4(List<C9955k4> list) {
        C1869to c1869to = new C1869to(list);
        while (c1869to.mo9764x1()) {
            this.f35975ck = C14116yg.m67483k4(this.f35975ck, ((C9955k4) c1869to.mo9760kk()).m48987kk());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m49052k4(List<C9955k4> list, int i) {
        int i2;
        C12219du c12219du = this.f35982kk[i];
        int i3 = 0;
        while (i3 < this.f35984to) {
            C12220dy c12220dyM57020k4 = c12219du.m57020k4(i3);
            if (c12220dyM57020k4.m57032dy() || !c12220dyM57020k4.mo57045kk()) {
                i2 = i;
            } else {
                i2 = i;
                list.addItem(new C9955k4((C12236up) c12220dyM57020k4, c12219du, i2, this.f35979h4, m49048jd()));
            }
            i3++;
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m49053k4(C12219du[] c12219duArr) {
        this.f35982kk = c12219duArr;
        this.f35979h4 = 0;
        this.f35983m9 = 0;
        this.f35981k4.clear();
        this.f35974c5.clear();
        this.f35980jd = false;
        this.f35975ck = 0;
        this.f35978fa = false;
    }
}
