package com.aspose.slides.internal.p046bs;

import com.aspose.slides.internal.p423to.C11074x1;
import com.aspose.slides.internal.p505xn.C12558dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bs.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1848k4 implements InterfaceC1851x1 {

    /* JADX INFO: renamed from: k4 */
    private String f6693k4;

    /* JADX INFO: renamed from: kk */
    private String f6694kk;

    /* JADX INFO: renamed from: to */
    private C11074x1 f6695to;

    /* JADX INFO: renamed from: x1 */
    private String f6696x1;

    public C1848k4() {
        String str = C14113y2.f47374k4;
        this.f6693k4 = str;
        this.f6696x1 = str;
        this.f6695to = m9638du();
    }

    /* JADX INFO: renamed from: du */
    private static C11074x1 m9638du() {
        C11074x1 c11074x1 = new C11074x1();
        c11074x1.m53515k4(7);
        c11074x1.m53517k4(C12558dy.m58577k4().Clone());
        c11074x1.m53524x1(c11074x1.m53518kk().Clone());
        c11074x1.m53523x1(c11074x1.m53518kk().m56865x1() >= c11074x1.m53518kk().m56862kk() ? 1 : 0);
        return c11074x1;
    }

    @Override // com.aspose.slides.internal.p046bs.InterfaceC1851x1
    /* JADX INFO: renamed from: k4 */
    public final String mo9639k4() {
        return this.f6693k4;
    }

    @Override // com.aspose.slides.internal.p046bs.InterfaceC1851x1
    /* JADX INFO: renamed from: kk */
    public final String mo9642kk() {
        return this.f6694kk;
    }

    @Override // com.aspose.slides.internal.p046bs.InterfaceC1851x1
    /* JADX INFO: renamed from: to */
    public final C11074x1 mo9643to() {
        return this.f6695to;
    }

    @Override // com.aspose.slides.internal.p046bs.InterfaceC1851x1
    /* JADX INFO: renamed from: x1 */
    public final String mo9644x1() {
        return this.f6696x1;
    }

    @Override // com.aspose.slides.internal.p046bs.InterfaceC1851x1
    /* JADX INFO: renamed from: k4 */
    public final void mo9640k4(C11074x1 c11074x1) {
        this.f6695to = c11074x1;
    }

    @Override // com.aspose.slides.internal.p046bs.InterfaceC1851x1
    /* JADX INFO: renamed from: x1 */
    public final void mo9645x1(String str) {
        this.f6694kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9641k4(String str) {
        this.f6693k4 = str;
    }
}
