package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

/* JADX INFO: renamed from: com.aspose.slides.pt */
/* JADX INFO: loaded from: classes3.dex */
class C14301pt implements InterfaceC1130g3 {

    /* JADX INFO: renamed from: k4 */
    public final char f48127k4;

    /* JADX INFO: renamed from: kk */
    public final InterfaceC1130g3 f48128kk;

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC1130g3 f48129x1;

    public C14301pt(char c, InterfaceC1130g3 interfaceC1130g3, InterfaceC1130g3 interfaceC1130g32) {
        this.f48127k4 = c;
        this.f48129x1 = interfaceC1130g3;
        this.f48128kk = interfaceC1130g32;
    }

    @Override // com.aspose.slides.InterfaceC1130g3
    /* JADX INFO: renamed from: k4 */
    public final float mo6404k4(kdz kdzVar) {
        float fMo6404k4 = this.f48129x1.mo6404k4(kdzVar);
        float fMo6404k42 = this.f48128kk.mo6404k4(kdzVar);
        char c = this.f48127k4;
        if (c == '*') {
            return fMo6404k4 * fMo6404k42;
        }
        if (c == '+') {
            return fMo6404k4 + fMo6404k42;
        }
        if (c == '-') {
            return fMo6404k4 - fMo6404k42;
        }
        if (c == '/') {
            return fMo6404k4 / fMo6404k42;
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m69231k4(char c) {
        return c == '*' || c == '+' || c == '-' || c == '/';
    }
}
