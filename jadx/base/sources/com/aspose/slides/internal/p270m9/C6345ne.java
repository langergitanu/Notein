package com.aspose.slides.internal.p270m9;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p231kk.InterfaceC5774ak;
import com.aspose.slides.internal.p231kk.InterfaceC5775ar;
import com.aspose.slides.internal.p231kk.InterfaceC5789ix;
import com.aspose.slides.internal.p231kk.InterfaceC5797ne;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.Xml.C13950o3;
import com.aspose.slides.p559ms.System.Xml.C13963qw;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.ne */
/* JADX INFO: loaded from: classes4.dex */
public class C6345ne implements InterfaceC5775ar {

    /* JADX INFO: renamed from: c5 */
    private C13950o3 f18060c5;

    /* JADX INFO: renamed from: ck */
    private int f18061ck;

    /* JADX INFO: renamed from: du */
    private String f18062du;

    /* JADX INFO: renamed from: dy */
    private InterfaceC5774ak f18063dy;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC5797ne f18064h4;

    /* JADX INFO: renamed from: jd */
    private C13963qw f18065jd;

    /* JADX INFO: renamed from: k4 */
    private C6358yj f18066k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC12777qq f18067kk;

    /* JADX INFO: renamed from: m9 */
    private String f18068m9;

    /* JADX INFO: renamed from: to */
    private InterfaceC5775ar f18069to;

    /* JADX INFO: renamed from: x1 */
    private C6344m9 f18070x1;

    public C6345ne() {
        this(0);
    }

    /* JADX INFO: renamed from: du */
    public final C13950o3 m26017du() {
        return this.f18060c5;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5775ar
    /* JADX INFO: renamed from: k4 */
    public final long mo23387k4(String str, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5780c6
    /* JADX INFO: renamed from: kk */
    public final String mo23395kk() {
        return this.f18062du;
    }

    /* JADX INFO: renamed from: to */
    public final C6344m9 m26022to() {
        return this.f18070x1;
    }

    public String toString() {
        return this.f18066k4.toString();
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5775ar
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC5789ix mo23390x1() {
        return this.f18066k4;
    }

    public C6345ne(int i) {
        this.f18066k4 = new C6358yj(this);
        this.f18063dy = new C6350um();
        this.f18065jd = new C13963qw();
        this.f18060c5 = new C13950o3(this.f18065jd);
        this.f18061ck = i;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5775ar
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC5797ne mo23388k4() {
        return this.f18064h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m26023x1(String str) {
        this.f18068m9 = str;
    }

    @Override // com.aspose.slides.internal.p231kk.InterfaceC5775ar
    /* JADX INFO: renamed from: k4 */
    public final void mo23389k4(int i) {
        this.f18066k4.m26050x1(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26018k4(InterfaceC5775ar interfaceC5775ar) {
        this.f18069to = interfaceC5775ar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26019k4(InterfaceC5797ne interfaceC5797ne) {
        this.f18064h4 = interfaceC5797ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26020k4(C6344m9 c6344m9, InterfaceC12777qq interfaceC12777qq) {
        this.f18070x1 = c6344m9;
        this.f18067kk = interfaceC12777qq;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26021k4(String str) {
        this.f18062du = str;
    }
}
