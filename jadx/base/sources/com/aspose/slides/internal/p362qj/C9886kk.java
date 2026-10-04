package com.aspose.slides.internal.p362qj;

import com.aspose.slides.internal.p180ib.InterfaceC4809to;
import com.aspose.slides.internal.p315od.C7024du;
import com.aspose.slides.internal.p315od.C7026h4;
import com.aspose.slides.internal.p340pm.C9466kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.qj.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9886kk implements InterfaceC9885k4 {
    /* JADX INFO: renamed from: k4 */
    private void m48709k4(InterfaceC4809to interfaceC4809to, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f + f3;
        float f8 = f2 + f4;
        interfaceC4809to.mo9585k4(f7, f8);
        float f9 = f4 * 0.5522848f;
        float f10 = f3 * 0.5522848f;
        float f11 = f - f4;
        float f12 = f2 + f3;
        interfaceC4809to.mo9587k4(f7 - f9, f8 + f10, f11 + f10, f12 + f9, f11, f12);
        float f13 = f5 * 0.5522848f;
        float f14 = 0.5522848f * f6;
        float f15 = f + f5;
        float f16 = f2 + f6;
        interfaceC4809to.mo9587k4(f + f6 + f13, (f2 - f5) + f14, f15 + f14, f16 - f13, f15, f16);
        interfaceC4809to.mo9584k4();
    }

    @Override // com.aspose.slides.internal.p362qj.InterfaceC9885k4
    /* JADX INFO: renamed from: x1 */
    public void mo48707x1(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C9466kk.k4 k4Var) {
        float fM56897x1 = c7026h4.f19098x1.m56897x1();
        float fM56895kk = c7026h4.f19098x1.m56895kk();
        C7024du c7024du = c7026h4.f19096kk;
        m48709k4(interfaceC4809to, fM56897x1, fM56895kk, c7024du.f19088k4, c7024du.f19091x1, c7024du.f19089kk, c7024du.f19090to);
    }

    @Override // com.aspose.slides.internal.p362qj.InterfaceC9885k4
    /* JADX INFO: renamed from: k4 */
    public void mo48706k4(InterfaceC4809to interfaceC4809to, C7026h4 c7026h4, C9466kk.k4 k4Var) {
        float fM56897x1 = c7026h4.f19098x1.m56897x1();
        float fM56895kk = c7026h4.f19098x1.m56895kk();
        C7024du c7024du = c7026h4.f19096kk;
        m48709k4(interfaceC4809to, fM56897x1, fM56895kk, -c7024du.f19088k4, -c7024du.f19091x1, -c7024du.f19089kk, -c7024du.f19090to);
    }
}
