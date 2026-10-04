package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: loaded from: classes3.dex */
class kke {
    /* JADX INFO: renamed from: k4 */
    public static void m63957k4(InterfaceC14397rj interfaceC14397rj, IPresentationComponent[] iPresentationComponentArr, ISlideComponent[] iSlideComponentArr) {
        iPresentationComponentArr[0] = null;
        while (interfaceC14397rj != null && iPresentationComponentArr[0] == null) {
            iPresentationComponentArr[0] = (IPresentationComponent) C7019kk.m27452k4((Object) interfaceC14397rj, IPresentationComponent.class);
            interfaceC14397rj = interfaceC14397rj.getParent_Immediate();
        }
        IPresentationComponent iPresentationComponent = iPresentationComponentArr[0];
        if (iPresentationComponent != null) {
            interfaceC14397rj = (InterfaceC14397rj) iPresentationComponent;
        }
        iSlideComponentArr[0] = null;
        while (interfaceC14397rj != null && iSlideComponentArr[0] == null) {
            iSlideComponentArr[0] = (ISlideComponent) C7019kk.m27452k4((Object) interfaceC14397rj, ISlideComponent.class);
            interfaceC14397rj = interfaceC14397rj.getParent_Immediate();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63958k4(InterfaceC14397rj interfaceC14397rj, ISlideComponent[] iSlideComponentArr, InterfaceC0973f1[] interfaceC0973f1Arr) {
        iSlideComponentArr[0] = null;
        interfaceC0973f1Arr[0] = null;
        while (interfaceC14397rj != null) {
            ISlideComponent iSlideComponent = iSlideComponentArr[0];
            if (iSlideComponent != null && interfaceC0973f1Arr[0] != null) {
                return;
            }
            if (iSlideComponent == null) {
                iSlideComponentArr[0] = (ISlideComponent) C7019kk.m27452k4((Object) interfaceC14397rj, ISlideComponent.class);
            }
            if (interfaceC0973f1Arr[0] == null) {
                interfaceC0973f1Arr[0] = (InterfaceC0973f1) C7019kk.m27452k4((Object) interfaceC14397rj, InterfaceC0973f1.class);
            }
            interfaceC14397rj = interfaceC14397rj.getParent_Immediate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static <T> boolean m63959k4(Class<T> cls, InterfaceC14397rj interfaceC14397rj, T[] tArr) {
        tArr[0] = 0;
        while (interfaceC14397rj != null && tArr[0] == 0) {
            tArr[0] = C7019kk.m27452k4((Object) interfaceC14397rj, (Class) cls);
            interfaceC14397rj = interfaceC14397rj.getParent_Immediate();
        }
        return tArr[0] != 0;
    }
}
