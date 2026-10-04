package com.aspose.slides.internal.p459ve;

import com.aspose.slides.internal.p067cu.C2631kk;
import com.aspose.slides.internal.p067cu.C2633x1;
import com.aspose.slides.internal.p093dv.InterfaceC3375k4;
import com.aspose.slides.internal.p114ep.C3780k4;
import com.aspose.slides.internal.p114ep.C3781x1;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p315od.C7026h4;
import com.aspose.slides.internal.p340pm.C9466kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ve.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C11631jd implements InterfaceC3375k4 {

    /* JADX INFO: renamed from: k4 */
    private final C3781x1 f39210k4;

    public C11631jd(float f, C11913yj c11913yj) {
        this.f39210k4 = new C3781x1(f, c11913yj);
    }

    /* JADX INFO: renamed from: k4 */
    public void m54717k4(InterfaceC4809to interfaceC4809to, float f, float f2, float f3, float f4, float f5, float f6) {
        C3780k4 c3780k4 = new C3780k4(this.f39210k4, f3, f4, f5, f6, false);
        m54716k4(interfaceC4809to, f, f2, c3780k4.m15107x1(), c3780k4.m15105k4());
    }

    @Override // com.aspose.slides.internal.p093dv.InterfaceC3375k4
    /* JADX INFO: renamed from: x1 */
    public void mo13933x1(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C9466kk.k4 k4Var) {
        if (k4Var == C9466kk.k4.LEFT) {
            float fM56897x1 = c7026h4.f19098x1.m56897x1();
            float fM56895kk = c7026h4.f19098x1.m56895kk();
            C7024du c7024du = c7026h4.f19096kk;
            m54717k4(interfaceC4809to, fM56897x1, fM56895kk, -c7024du.f19088k4, -c7024du.f19091x1, -c7024du.f19089kk, -c7024du.f19090to);
            return;
        }
        float fM56897x12 = c7026h4.f19098x1.m56897x1();
        float fM56895kk2 = c7026h4.f19098x1.m56895kk();
        C7024du c7024du2 = c7026h4.f19096kk;
        m54717k4(interfaceC4809to, fM56897x12, fM56895kk2, c7024du2.f19088k4, c7024du2.f19091x1, c7024du2.f19089kk, c7024du2.f19090to);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54716k4(final InterfaceC4809to interfaceC4809to, final float f, final float f2, boolean z, C2631kk c2631kk) {
        InterfaceC4809to interfaceC4809to2 = new InterfaceC4809to() { // from class: com.aspose.slides.internal.ve.jd.1
            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9584k4() {
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: x1 */
            public void mo9602x1() {
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9585k4(float f3, float f4) {
                interfaceC4809to.mo9585k4(f + f3, f2 + f4);
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: x1 */
            public void mo9603x1(float f3, float f4) {
                interfaceC4809to.mo9603x1(f + f3, f2 + f4);
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9586k4(float f3, float f4, float f5, float f6) {
                InterfaceC4809to interfaceC4809to3 = interfaceC4809to;
                float f7 = f;
                float f8 = f2;
                interfaceC4809to3.mo9586k4(f3 + f7, f4 + f8, f7 + f5, f8 + f6);
            }

            @Override // com.aspose.slides.internal.p180ib.InterfaceC4809to
            /* JADX INFO: renamed from: k4 */
            public void mo9587k4(float f3, float f4, float f5, float f6, float f7, float f8) {
                InterfaceC4809to interfaceC4809to3 = interfaceC4809to;
                float f9 = f;
                float f10 = f2;
                interfaceC4809to3.mo9587k4(f3 + f9, f4 + f10, f9 + f5, f10 + f6, f9 + f7, f10 + f8);
            }
        };
        Iterator<C2633x1> itM12023to = z ? c2631kk.m12023to() : c2631kk.m12022kk();
        while (itM12023to.hasNext()) {
            itM12023to.next().m12033k4(interfaceC4809to2);
        }
    }

    @Override // com.aspose.slides.internal.p093dv.InterfaceC3375k4
    /* JADX INFO: renamed from: k4 */
    public void mo13932k4(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C9466kk.k4 k4Var) {
        if (k4Var == C9466kk.k4.LEFT) {
            float fM56897x1 = c7026h4.f19098x1.m56897x1();
            float fM56895kk = c7026h4.f19098x1.m56895kk();
            C7024du c7024du = c7026h4.f19096kk;
            m54717k4(interfaceC4809to, fM56897x1, fM56895kk, c7024du.f19088k4, c7024du.f19091x1, c7024du.f19089kk, c7024du.f19090to);
            return;
        }
        float fM56897x12 = c7026h4.f19098x1.m56897x1();
        float fM56895kk2 = c7026h4.f19098x1.m56895kk();
        C7024du c7024du2 = c7026h4.f19096kk;
        m54717k4(interfaceC4809to, fM56897x12, fM56895kk2, -c7024du2.f19088k4, -c7024du2.f19091x1, -c7024du2.f19089kk, -c7024du2.f19090to);
    }
}
