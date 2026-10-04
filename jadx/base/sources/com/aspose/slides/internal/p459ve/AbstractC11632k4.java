package com.aspose.slides.internal.p459ve;

import com.aspose.slides.internal.p093dv.InterfaceC3375k4;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p315od.C7026h4;
import com.aspose.slides.internal.p340pm.C9466kk;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ve.k4 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC11632k4 implements InterfaceC3375k4 {
    /* JADX INFO: renamed from: k4 */
    private void m54718k4(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C7026h4 c7026h42) {
        C7024du c7024du = c7026h4.f19096kk;
        float f = c7024du.f19089kk;
        float f2 = c7024du.f19090to;
        float fM56897x1 = c7026h42.f19098x1.m56897x1();
        float fM56895kk = c7026h42.f19098x1.m56895kk();
        C7024du c7024du2 = c7026h42.f19096kk;
        mo54712k4(interfaceC4809to, f, f2, fM56897x1, fM56895kk, c7024du2.f19089kk, c7024du2.f19090to, c7024du2.f19088k4, c7024du2.f19091x1);
    }

    /* JADX INFO: renamed from: x1 */
    private void m54719x1(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C7026h4 c7026h42) {
        C7024du c7024du = c7026h4.f19096kk;
        float f = c7024du.f19088k4;
        float f2 = c7024du.f19091x1;
        float fM56897x1 = c7026h42.f19098x1.m56897x1();
        float fM56895kk = c7026h42.f19098x1.m56895kk();
        C7024du c7024du2 = c7026h42.f19096kk;
        mo54712k4(interfaceC4809to, f, f2, fM56897x1, fM56895kk, c7024du2.f19088k4, c7024du2.f19091x1, c7024du2.f19089kk, c7024du2.f19090to);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo54712k4(InterfaceC4809to interfaceC4809to, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8);

    @Override // com.aspose.slides.internal.p093dv.InterfaceC3375k4
    /* JADX INFO: renamed from: k4 */
    public void mo13932k4(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C9466kk.k4 k4Var) {
        if (!c7026h4.mo27479k4()) {
            m54718k4(interfaceC4809to, c7026h4, c7026h4);
            return;
        }
        Iterator<C7026h4> it = c7026h4.mo27480x1().iterator();
        while (it.hasNext()) {
            m54718k4(interfaceC4809to, c7026h4, it.next());
        }
    }

    @Override // com.aspose.slides.internal.p093dv.InterfaceC3375k4
    /* JADX INFO: renamed from: x1 */
    public void mo13933x1(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C9466kk.k4 k4Var) {
        if (!c7026h4.mo27479k4()) {
            m54719x1(interfaceC4809to, c7026h4, c7026h4);
            return;
        }
        Iterator<C7026h4> it = c7026h4.mo27480x1().iterator();
        while (it.hasNext()) {
            m54719x1(interfaceC4809to, c7026h4, it.next());
        }
    }
}
