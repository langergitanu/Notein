package com.aspose.slides.internal.p034b3;

import com.aspose.slides.internal.p057c6.InterfaceC1984kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.c5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1581c5 extends C1589jd {

    /* JADX INFO: renamed from: rv */
    private InterfaceC1984kk f6113rv;

    /* JADX INFO: renamed from: fa */
    private int f6111fa = 0;

    /* JADX INFO: renamed from: dy */
    protected boolean f6110dy = true;

    /* JADX INFO: renamed from: up */
    private boolean f6114up = false;

    /* JADX INFO: renamed from: yj */
    private int f6116yj = 0;

    /* JADX INFO: renamed from: ks */
    private int f6112ks = 0;

    /* JADX INFO: renamed from: x6 */
    private int f6115x6 = 0;

    /* JADX INFO: renamed from: ar */
    public final int m8500ar() {
        return this.f6116yj;
    }

    /* JADX INFO: renamed from: bv */
    public final int m8501bv() {
        return this.f6115x6;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m8502c5(int i) {
        this.f6111fa = i;
    }

    /* JADX INFO: renamed from: ck */
    public final void m8503ck(int i) {
        this.f6115x6 = i;
    }

    /* JADX INFO: renamed from: jd */
    public final void m8504jd(int i) {
        this.f6116yj = i;
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public C12023wl mo8505k4(boolean z) {
        return m8665k4(this.f6160ck, z);
    }

    /* JADX INFO: renamed from: qq */
    public final boolean m8509qq() {
        return this.f6114up;
    }

    /* JADX INFO: renamed from: u4 */
    public final int m8510u4() {
        return this.f6111fa;
    }

    /* JADX INFO: renamed from: um */
    public final InterfaceC1984kk m8511um() {
        return this.f6113rv;
    }

    /* JADX INFO: renamed from: uz */
    public final boolean m8512uz() {
        return m8510u4() == 0 || m8510u4() == 1;
    }

    /* JADX INFO: renamed from: wl */
    public final int m8513wl() {
        Object objM8655du = m8655du(27);
        if (objM8655du != null) {
            return ((Integer) C7019kk.m27464to(objM8655du, Integer.TYPE)).intValue();
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p034b3.C1589jd
    /* JADX INFO: renamed from: x1 */
    public void mo8483x1(C1581c5 c1581c5) {
        m8506k4(c1581c5, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8506k4(C1581c5 c1581c5, boolean z) {
        if ((z && this.f6110dy && c1581c5.m8512uz()) || (this.f6110dy && c1581c5.m8510u4() == 4)) {
            this.f6217x1 = c1581c5.m8654du() + this.f6217x1;
        }
        mo8582k4((C1606x1) c1581c5);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8514x1(boolean z) {
        this.f6114up = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8507k4(C1602uz c1602uz) {
        this.f6217x1 = c1602uz.m8654du() + this.f6217x1;
        mo8582k4((C1606x1) c1602uz);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8508k4(InterfaceC1984kk interfaceC1984kk) {
        this.f6113rv = interfaceC1984kk;
    }
}
