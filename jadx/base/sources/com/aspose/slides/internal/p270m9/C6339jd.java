package com.aspose.slides.internal.p270m9;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p231kk.InterfaceC5774ak;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5794ks;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C6339jd extends AbstractC6340k4 implements InterfaceC5794ks {

    /* JADX INFO: renamed from: k4 */
    private String f18026k4;

    /* JADX INFO: renamed from: kk */
    private C6350um f18027kk;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC5775ar f18028x1;

    public C6339jd(C6345ne c6345ne, InterfaceC5797ne interfaceC5797ne) {
        super(c6345ne, interfaceC5797ne, (short) 3);
        this.f18027kk = new C6350um();
    }

    /* JADX INFO: renamed from: dy */
    public final C6350um m25951dy() {
        return this.f18027kk;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5794ks
    /* JADX INFO: renamed from: h4 */
    public final InterfaceC5774ak mo23678h4() {
        return this.f18027kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25952k4(InterfaceC5775ar interfaceC5775ar) {
        this.f18028x1 = interfaceC5775ar;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5794ks
    /* JADX INFO: renamed from: kk */
    public final String mo23679kk() {
        return this.f18026k4;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5794ks
    /* JADX INFO: renamed from: m9 */
    public final InterfaceC5775ar mo23680m9() {
        return this.f18028x1;
    }

    @Override // com.aspose.slides.internal.p231kk.AbstractC5783du, com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public String mo23406x1() {
        return C14113y2.m67402k4("@import url({0});", mo23679kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25953k4(String str) {
        this.f18026k4 = str;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5797ne
    /* JADX INFO: renamed from: x1 */
    public void mo23684x1(String str) {
        throw new NotImplementedException();
    }
}
