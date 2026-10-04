package com.aspose.slides.internal.p270m9;

import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p231kk.InterfaceC5799qq;
import com.aspose.slides.internal.p231kk.InterfaceC5810wl;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.x6 */
/* JADX INFO: loaded from: classes4.dex */
public class C6356x6 extends AbstractC6340k4 implements InterfaceC5799qq {

    /* JADX INFO: renamed from: k4 */
    private C6342ks f18083k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC6355x1 f18084x1;

    public C6356x6(C6345ne c6345ne, InterfaceC5797ne interfaceC5797ne) {
        super(c6345ne, interfaceC5797ne, (short) 1);
        this.f18083k4 = new C6342ks(this);
        this.f18084x1 = new C6353v4(this);
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5799qq
    /* JADX INFO: renamed from: h4 */
    public final InterfaceC5810wl mo23686h4() {
        return this.f18084x1;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5799qq
    /* JADX INFO: renamed from: kk */
    public final String mo23687kk() {
        return this.f18083k4.toString();
    }

    /* JADX INFO: renamed from: m9 */
    public final C6342ks m26048m9() {
        return this.f18083k4;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5783du, com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public String mo23406x1() {
        return C14113y2.m67402k4("{0} {{ {1} }}", mo23687kk(), mo23686h4());
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public void mo23684x1(String str) {
        this.f18084x1.mo23676zd(str);
    }
}
