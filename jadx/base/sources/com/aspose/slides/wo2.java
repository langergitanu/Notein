package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.InterfaceC14089ss;

/* JADX INFO: loaded from: classes3.dex */
class wo2 implements InterfaceC14089ss<wo2>, InterfaceC14779xa {

    /* JADX INFO: renamed from: du */
    private long f49828du;

    /* JADX INFO: renamed from: h4 */
    private final p8h f49829h4;

    /* JADX INFO: renamed from: k4 */
    private int f49830k4;

    /* JADX INFO: renamed from: kk */
    private boolean f49831kk;

    /* JADX INFO: renamed from: to */
    private int f49832to;

    /* JADX INFO: renamed from: x1 */
    private boolean f49833x1;

    public wo2() {
        this.f49829h4 = new p8h();
    }

    @Override // com.aspose.slides.InterfaceC14779xa
    /* JADX INFO: renamed from: du */
    public final long mo72843du() {
        return this.f49828du;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14089ss
    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wo2 wo2Var = (wo2) obj;
        return mo72845k4() == wo2Var.mo72845k4() && mo72854x1() == wo2Var.mo72854x1() && mo72849kk() == wo2Var.mo72849kk() && mo72851to() == wo2Var.mo72851to() && mo72843du() == wo2Var.mo72843du() && m72844h4().m68976k4(wo2Var.m72844h4());
    }

    /* JADX INFO: renamed from: h4 */
    public final p8h m72844h4() {
        return this.f49829h4;
    }

    public int hashCode() {
        return C12569rv.m58664k4(Integer.valueOf(this.f49830k4), Boolean.valueOf(this.f49833x1), Boolean.valueOf(this.f49831kk), Integer.valueOf(this.f49832to), Long.valueOf(this.f49828du), this.f49829h4);
    }

    @Override // com.aspose.slides.InterfaceC14779xa
    /* JADX INFO: renamed from: k4 */
    public final int mo72845k4() {
        return this.f49830k4;
    }

    @Override // com.aspose.slides.InterfaceC14779xa
    /* JADX INFO: renamed from: kk */
    public final boolean mo72849kk() {
        return this.f49831kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m72850m9() {
        return C0883d5.m4950k4(new wo2(), this);
    }

    @Override // com.aspose.slides.InterfaceC14779xa
    /* JADX INFO: renamed from: to */
    public final int mo72851to() {
        return this.f49832to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72852x1(int i) {
        this.f49832to = i;
    }

    public wo2(InterfaceC14779xa interfaceC14779xa) {
        if (interfaceC14779xa == null) {
            throw new ArgumentNullException("properties");
        }
        m72846k4(interfaceC14779xa.mo72845k4());
        m72848k4(interfaceC14779xa.mo72854x1());
        m72853x1(interfaceC14779xa.mo72849kk());
        m72852x1(interfaceC14779xa.mo72851to());
        m72847k4(interfaceC14779xa.mo72843du());
        this.f49829h4 = ((wo2) interfaceC14779xa).m72844h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72846k4(int i) {
        this.f49830k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72853x1(boolean z) {
        this.f49831kk = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72847k4(long j) {
        this.f49828du = j;
    }

    @Override // com.aspose.slides.InterfaceC14779xa
    /* JADX INFO: renamed from: x1 */
    public final boolean mo72854x1() {
        return this.f49833x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72848k4(boolean z) {
        this.f49833x1 = z;
    }
}
