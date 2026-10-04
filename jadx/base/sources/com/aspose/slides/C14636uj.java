package com.aspose.slides;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.uj */
/* JADX INFO: loaded from: classes3.dex */
class C14636uj implements InterfaceC0782az {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC0782az f49336k4;

    /* JADX INFO: renamed from: kk */
    private final String f49337kk;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC0782az f49338x1;

    public C14636uj(InterfaceC0782az interfaceC0782az, InterfaceC0782az interfaceC0782az2, String str) {
        this.f49338x1 = interfaceC0782az2;
        this.f49336k4 = interfaceC0782az;
        this.f49337kk = str;
    }

    @Override // com.aspose.slides.InterfaceC0782az
    /* JADX INFO: renamed from: k4 */
    public final mtk mo3871k4(C1095fc c1095fc) {
        C6765kp c6765kp = new C6765kp();
        InterfaceC0782az interfaceC0782az = this.f49336k4;
        if (interfaceC0782az != null) {
            c6765kp.m26792k4(interfaceC0782az.mo3871k4(c1095fc).m67727to(c1095fc));
        }
        c6765kp.m26792k4(this.f49337kk);
        InterfaceC0782az interfaceC0782az2 = this.f49338x1;
        if (interfaceC0782az2 != null) {
            c6765kp.m26792k4(interfaceC0782az2.mo3871k4(c1095fc).m67727to(c1095fc));
        }
        return new mtk(c6765kp.toString());
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        InterfaceC0782az interfaceC0782az = this.f49336k4;
        if (interfaceC0782az != null) {
            c6765kp.m26791k4(interfaceC0782az);
        }
        c6765kp.m26792k4(C14113y2.m67408k4("&\"", this.f49337kk, "\"&"));
        InterfaceC0782az interfaceC0782az2 = this.f49338x1;
        if (interfaceC0782az2 != null) {
            c6765kp.m26791k4(interfaceC0782az2);
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.InterfaceC0782az
    /* JADX INFO: renamed from: k4 */
    public final String mo3872k4(C0909dp c0909dp) {
        return toString();
    }
}
