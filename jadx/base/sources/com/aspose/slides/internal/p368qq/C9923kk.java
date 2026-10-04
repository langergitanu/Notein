package com.aspose.slides.internal.p368qq;

import com.aspose.slides.internal.p126fa.AbstractC3909u4;
import com.aspose.slides.internal.p126fa.AbstractC3913yj;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p270m9.AbstractC6355x1;
import com.aspose.slides.internal.p270m9.C6329ar;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p270m9.C6349u4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.qq.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9923kk implements InterfaceC9938x6 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC6355x1 f35811k4;

    /* JADX INFO: renamed from: x1 */
    private C6344m9 f35812x1;

    public C9923kk(C6344m9 c6344m9, InterfaceC12777qq interfaceC12777qq) {
        this.f35812x1 = c6344m9;
        if (interfaceC12777qq != null) {
            this.f35811k4 = new C6329ar(new C11539rv(c6344m9), interfaceC12777qq, c6344m9);
        } else {
            this.f35811k4 = new C6349u4(c6344m9);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6355x1 m48854k4() {
        return this.f35811k4;
    }

    @Override // com.aspose.slides.internal.p368qq.InterfaceC9938x6
    /* JADX INFO: renamed from: k4 */
    public final void mo48819k4(String str, InterfaceC9933up interfaceC9933up, boolean z) {
        int iM26006x1 = this.f35812x1.m26006x1(C14113y2.m67361du(str));
        if (iM26006x1 == -1) {
            this.f35812x1.m26004to().mo48786k4(new C9930to(C14113y2.m67402k4("Invalid property name '{0}'.", str)));
            return;
        }
        AbstractC3909u4 abstractC3909u4M25986h4 = this.f35812x1.m25986h4(iM26006x1);
        if (this.f35812x1.m25984dy(iM26006x1)) {
            ((AbstractC3913yj) C7019kk.m27452k4((Object) abstractC3909u4M25986h4, AbstractC3913yj.class)).mo15609k4(this.f35812x1, this, interfaceC9933up, z);
            return;
        }
        AbstractC5788h4 abstractC5788h4Mo15578k4 = abstractC3909u4M25986h4.mo15578k4(interfaceC9933up, this.f35812x1);
        if (abstractC5788h4Mo15578k4.m23417m9() != 2 && interfaceC9933up.mo48851kk() != null) {
            throw C9919h4.m48830to(str);
        }
        this.f35811k4.mo25908k4(iM26006x1, abstractC5788h4Mo15578k4, z);
    }
}
