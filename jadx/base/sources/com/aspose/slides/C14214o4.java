package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.o4 */
/* JADX INFO: loaded from: classes3.dex */
class C14214o4 {

    /* JADX INFO: renamed from: du */
    private final boolean f47667du;

    /* JADX INFO: renamed from: h4 */
    private final byte f47668h4;

    /* JADX INFO: renamed from: k4 */
    private C14251ot f47669k4;

    /* JADX INFO: renamed from: kk */
    private final boolean f47670kk;

    /* JADX INFO: renamed from: to */
    private final boolean f47671to;

    /* JADX INFO: renamed from: x1 */
    private final boolean f47672x1;

    public C14214o4(nrw nrwVar, InterfaceC14631uf interfaceC14631uf, C14251ot c14251ot, boolean z) {
        if (c14251ot == null) {
            throw new ArgumentNullException("fontWrapper");
        }
        this.f47669k4 = c14251ot;
        this.f47672x1 = z;
        this.f47667du = C14425s0.m70406x1(interfaceC14631uf, nrwVar);
        this.f47668h4 = C3047dy.m12850du(interfaceC14631uf.mo6442du());
        this.f47670kk = interfaceC14631uf.mo6446k4().f48541k4.getTextCapType() == 1;
        this.f47671to = C14117yj.m67550yj(interfaceC14631uf.mo6448kk());
    }

    /* JADX INFO: renamed from: du */
    public final boolean m68326du() {
        return this.f47669k4.m68809dy() == -78;
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m68327h4() {
        return this.f47668h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m68328k4() {
        return this.f47672x1;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m68329kk() {
        return this.f47671to;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m68330m9() {
        return this.f47667du;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m68331to() {
        return this.f47669k4.m68819x1().m23120k4().m48174bv();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m68332x1() {
        return this.f47670kk;
    }

    public C14214o4(nrw nrwVar, InterfaceC14631uf interfaceC14631uf, boolean z) {
        this.f47672x1 = z;
        this.f47667du = C14425s0.m70406x1(interfaceC14631uf, nrwVar);
        this.f47668h4 = C3047dy.m12850du(interfaceC14631uf.mo6442du());
        this.f47670kk = interfaceC14631uf.mo6446k4().f48541k4.getTextCapType() == 1;
        this.f47671to = C14117yj.m67550yj(interfaceC14631uf.mo6448kk());
    }
}
