package com.aspose.slides.internal.p371qw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p022ai.C1375h4;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p150gi.C4264bz;
import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.internal.p380ri.C10014k4;
import com.aspose.slides.internal.p481wp.C12219du;
import com.aspose.slides.internal.p481wp.C12220dy;
import com.aspose.slides.internal.p481wp.C12236up;
import com.aspose.slides.internal.p481wp.C12239wl;
import com.aspose.slides.internal.p481wp.C12243yd;
import com.aspose.slides.internal.p513xw.C12724ss;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.qw.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9953h4 {

    /* JADX INFO: renamed from: k4 */
    private static final C1375h4 f35886k4 = C1375h4.m8146k4(0, 0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: kk */
    private final C9959up f35887kk;

    /* JADX INFO: renamed from: to */
    private final C9961yj f35888to;

    /* JADX INFO: renamed from: x1 */
    private final C12219du[] f35889x1;

    public C9953h4(C9959up c9959up, C12219du[] c12219duArr, C9961yj c9961yj) {
        this.f35887kk = c9959up;
        this.f35889x1 = c12219duArr;
        this.f35888to = c9961yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<InterfaceC1861h4> m48966k4(C12724ss c12724ss, int i, int i2) {
        List<InterfaceC1861h4> list = new List<>();
        m48965k4(c12724ss, i, i2, list);
        c12724ss.m59188x1(this.f35889x1[0].m57023m9());
        c12724ss.m59162k4(this.f35889x1[r5.length - 1].m57016dy());
        C12243yd c12243ydM57022kk = this.f35889x1[0].m57022kk();
        c12724ss.m59141c5(C10014k4.m49148k4(c12243ydM57022kk != null ? c12243ydM57022kk.mo17279ss() : 9, this.f35889x1[0].m57018jd()));
        C12243yd c12243ydM57022kk2 = this.f35889x1[r5.length - 1].m57022kk();
        int iMo17280wp = c12243ydM57022kk2 != null ? c12243ydM57022kk2.mo17280wp() : 9;
        c12724ss.m59154jd(C10014k4.m49148k4(iMo17280wp, this.f35889x1[r5.length - 1].m57014ck()));
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m48964k4() {
        C1375h4 c1375h4M17128k4;
        C1375h4[] c1375h4Arr = new C1375h4[this.f35889x1.length];
        int i = 0;
        while (true) {
            C12219du[] c12219duArr = this.f35889x1;
            if (i >= c12219duArr.length) {
                return;
            }
            C12219du c12219du = c12219duArr[i];
            C12243yd c12243ydM57022kk = c12219du.m57022kk();
            if (c12243ydM57022kk == null) {
                c1375h4M17128k4 = f35886k4;
                c1375h4Arr[i] = c1375h4M17128k4;
            } else {
                C4264bz c4264bzM57189kp = c12243ydM57022kk.m57189kp();
                c1375h4Arr[i] = c4264bzM57189kp.m17128k4(this.f35887kk);
                c1375h4M17128k4 = c4264bzM57189kp.m17128k4(this.f35887kk);
            }
            C1869to c1869to = new C1869to(c12219du.m57017h4());
            while (c1869to.mo9764x1()) {
                C12220dy c12220dy = (C12220dy) c1869to.mo9760kk();
                if (!c12220dy.m57032dy() && c12220dy.m57035jd() == 0 && c12220dy.mo57031du()) {
                    C12236up c12236upMo57051x1 = c12220dy.mo57051x1();
                    C4264bz c4264bzM57118wp = c12236upMo57051x1.m57034h4().m57118wp();
                    int iMo9886x1 = !c4264bzM57118wp.m17134x1(this.f35887kk).m17256x6() ? c4264bzM57118wp.m17134x1(this.f35887kk).mo9877dy().mo9886x1(this.f35887kk) : 0;
                    if (!c4264bzM57118wp.m17133to(this.f35887kk).m17256x6()) {
                        iMo9886x1 = c4264bzM57118wp.m17133to(this.f35887kk).mo9877dy().mo9886x1(this.f35887kk);
                    }
                    if (c12220dy.m57029c5() == 0) {
                        iMo9886x1 = C14116yg.m67483k4(iMo9886x1, c1375h4M17128k4.m8163x1());
                    }
                    int iM67483k4 = C14116yg.m67483k4(iMo9886x1, c12236upMo57051x1.m57144x6());
                    int iM57135rv = c12236upMo57051x1.m57135rv();
                    C4265c5 c4265c5Mo57067vj = c12236upMo57051x1.m57034h4().mo57067vj();
                    int iM17162to = c4265c5Mo57067vj.m17162to(false, c12236upMo57051x1.m57145yj()) + c4265c5Mo57067vj.m17160kk(false, c12236upMo57051x1.m57145yj()) + iM67483k4 + iM57135rv;
                    for (int i2 = i - 1; i2 >= i - c12220dy.m57029c5(); i2--) {
                        iM17162to -= c1375h4Arr[i2].m8163x1();
                    }
                    if (iM17162to > c1375h4Arr[i].m8155k4()) {
                        c1375h4Arr[i] = c1375h4Arr[i].m8153h4(iM17162to);
                    }
                }
            }
            c12219du.m57021k4(c1375h4Arr[i]);
            c12219du.m57026x1(c1375h4M17128k4);
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m48965k4(C12724ss c12724ss, int i, int i2, List<InterfaceC1861h4> list) {
        int i3 = 0;
        while (true) {
            C12219du[] c12219duArr = this.f35889x1;
            if (i3 >= c12219duArr.length) {
                m48964k4();
                list.addRange(this.f35888to.m49059k4(c12724ss, this.f35889x1, i2));
                return;
            }
            C1869to c1869to = new C1869to(c12219duArr[i3].m57017h4());
            while (c1869to.mo9764x1()) {
                C12220dy c12220dy = (C12220dy) c1869to.mo9760kk();
                if (c12220dy.mo57045kk()) {
                    C12236up c12236upMo57051x1 = c12220dy.mo57051x1();
                    c12236upMo57051x1.m57134qq();
                    c12236upMo57051x1.m57145yj().mo54974k4(this.f35887kk);
                    C1869to c1869to2 = new C1869to(this.f35887kk.m49033yd().m57089g8(), c12236upMo57051x1.m57136u4());
                    int iM57111g8 = c12236upMo57051x1.m57034h4().m57111g8();
                    int iMo9886x1 = 0;
                    for (int i4 = 0; i4 < iM57111g8; i4++) {
                        iMo9886x1 += ((C12239wl) c1869to2.mo9760kk()).m57159ts().mo9886x1(this.f35887kk);
                    }
                    C12724ss c12724ss2 = new C12724ss(0);
                    c12724ss2.m59160k4(c12724ss.m59173ne());
                    c12724ss2.m59186x1(iMo9886x1);
                    c12236upMo57051x1.m57128k4(c12236upMo57051x1.m57145yj().mo48950k4(c12724ss2, i));
                }
            }
            i3++;
        }
    }
}
