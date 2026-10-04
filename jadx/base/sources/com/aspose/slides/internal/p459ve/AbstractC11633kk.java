package com.aspose.slides.internal.p459ve;

import com.aspose.slides.internal.p093dv.InterfaceC3375k4;
import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p315od.C7026h4;
import com.aspose.slides.internal.p340pm.C9464du;
import com.aspose.slides.internal.p340pm.C9466kk;
import com.aspose.slides.internal.p340pm.C9467to;
import com.aspose.slides.internal.p340pm.C9468x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ve.kk */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11633kk implements InterfaceC3375k4 {

    /* JADX INFO: renamed from: k4 */
    private final C9464du f39215k4;

    public AbstractC11633kk(float f, C11913yj c11913yj) {
        this.f39215k4 = C9464du.m46500k4(f, c11913yj);
    }

    /* JADX INFO: renamed from: x1 */
    private void m54721x1(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4) {
        float fM56897x1 = c7026h4.f19098x1.m56897x1();
        float fM56895kk = c7026h4.f19098x1.m56895kk();
        C7024du c7024du = c7026h4.f19096kk;
        mo54713k4(interfaceC4809to, fM56897x1, fM56895kk, c7024du.f19088k4, c7024du.f19091x1, c7024du.f19089kk, c7024du.f19090to, c7026h4.f19097to.m56897x1(), c7026h4.f19097to.m56895kk(), true);
    }

    /* JADX INFO: renamed from: k4 */
    public C12025x6 m54722k4(float f, float f2, boolean z) {
        C12025x6[] c12025x6ArrM46504k4 = this.f39215k4.m46504k4(new C9468x1(new C12025x6(0.0f, 0.0f), new C12025x6(f, f2)));
        C12025x6 c12025x6 = c12025x6ArrM46504k4[0];
        float degrees = (float) Math.toDegrees(C9467to.m46533x1(c12025x6.m56897x1(), c12025x6.m56895kk(), f, f2));
        return ((!z || (-90.0f < degrees && degrees < 90.0f)) && (z || -90.0f >= degrees || degrees >= 90.0f)) ? c12025x6 : c12025x6ArrM46504k4[1];
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo54713k4(InterfaceC4809to interfaceC4809to, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z);

    /* JADX INFO: renamed from: k4 */
    private void m54720k4(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4) {
        float fM56897x1 = c7026h4.f19098x1.m56897x1();
        float fM56895kk = c7026h4.f19098x1.m56895kk();
        C7024du c7024du = c7026h4.f19096kk;
        mo54713k4(interfaceC4809to, fM56897x1, fM56895kk, c7024du.f19088k4, c7024du.f19091x1, c7024du.f19089kk, c7024du.f19090to, c7026h4.f19097to.m56897x1(), c7026h4.f19097to.m56895kk(), false);
    }

    @Override // com.aspose.slides.internal.p093dv.InterfaceC3375k4
    /* JADX INFO: renamed from: x1 */
    public void mo13933x1(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C9466kk.k4 k4Var) {
        if (!mo54714k4() || !c7026h4.mo27479k4()) {
            m54721x1(interfaceC4809to, c7026h4);
            return;
        }
        Iterator<C7026h4> it = c7026h4.mo27480x1().iterator();
        while (it.hasNext()) {
            m54721x1(interfaceC4809to, it.next());
        }
    }

    @Override // com.aspose.slides.internal.p093dv.InterfaceC3375k4
    /* JADX INFO: renamed from: k4 */
    public void mo13932k4(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C9466kk.k4 k4Var) {
        if (!mo54714k4() || !c7026h4.mo27479k4()) {
            m54720k4(interfaceC4809to, c7026h4);
            return;
        }
        Iterator<C7026h4> it = c7026h4.mo27480x1().iterator();
        while (it.hasNext()) {
            m54720k4(interfaceC4809to, it.next());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo54714k4() {
        return false;
    }
}
