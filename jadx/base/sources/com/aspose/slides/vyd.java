package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
final class vyd {

    /* JADX INFO: renamed from: c5 */
    private final float f49714c5;

    /* JADX INFO: renamed from: ck */
    private final fko[] f49715ck;

    /* JADX INFO: renamed from: du */
    public final oju f49716du;

    /* JADX INFO: renamed from: dy */
    public final ReadOnlyCollection<r7c> f49717dy;

    /* JADX INFO: renamed from: fa */
    private final boolean f49718fa;

    /* JADX INFO: renamed from: h4 */
    public final float f49719h4;

    /* JADX INFO: renamed from: jd */
    private final float f49720jd;

    /* JADX INFO: renamed from: kk */
    public final InterfaceC14631uf f49722kk;

    /* JADX INFO: renamed from: ks */
    private float f49723ks;

    /* JADX INFO: renamed from: m9 */
    public C14293pl f49724m9;

    /* JADX INFO: renamed from: to */
    public final InterfaceC14631uf f49725to;

    /* JADX INFO: renamed from: x1 */
    public final nrw f49727x1;

    /* JADX INFO: renamed from: yj */
    private float f49728yj;

    /* JADX INFO: renamed from: k4 */
    C12007ix f49721k4 = new C12007ix();

    /* JADX INFO: renamed from: up */
    private oju f49726up = new oju();

    public vyd(nrw nrwVar, InterfaceC14631uf interfaceC14631uf, InterfaceC14631uf interfaceC14631uf2, float f, float f2, C14293pl c14293pl, fko[] fkoVarArr, boolean z) {
        this.f49728yj = 0.0f;
        this.f49723ks = 0.0f;
        oju ojuVar = new oju();
        this.f49716du = ojuVar;
        this.f49724m9 = new C14293pl();
        this.f49727x1 = nrwVar;
        this.f49722kk = interfaceC14631uf;
        this.f49725to = interfaceC14631uf2;
        oju.f47834kk.CloneTo(this.f49726up);
        new oju(f, c14293pl.f48091k4).CloneTo(ojuVar);
        this.f49714c5 = f2;
        float f3 = c14293pl.f48091k4;
        float f4 = c14293pl.f48093x1;
        float f5 = f3 - f4;
        this.f49728yj = f5;
        this.f49720jd = f3 != 0.0f ? f5 / f3 : 0.0f;
        this.f49723ks = f4;
        this.f49715ck = fkoVarArr;
        this.f49718fa = z;
        this.f49719h4 = f5;
        c14293pl.CloneTo(this.f49724m9);
        if (interfaceC14631uf == interfaceC14631uf2) {
            this.f49717dy = new ReadOnlyCollection<>(AbstractC14092to.m67204k4((Object[]) new r7c[]{interfaceC14631uf.mo6446k4()}));
            return;
        }
        List list = new List();
        while (interfaceC14631uf.mo6447k4(interfaceC14631uf2)) {
            if (!list.containsItem(interfaceC14631uf.mo6446k4())) {
                list.addItem(interfaceC14631uf.mo6446k4());
            }
            interfaceC14631uf = interfaceC14631uf.mo6449m9();
        }
        if ("\u000b".equals(interfaceC14631uf2.mo6446k4().f48544x1)) {
            list.addItem(interfaceC14631uf.mo6446k4());
        }
        this.f49717dy = new ReadOnlyCollection<>(list);
    }

    /* JADX INFO: renamed from: c5 */
    public final oju m72586c5() {
        return this.f49726up;
    }

    /* JADX INFO: renamed from: ck */
    public final float m72587ck() {
        return this.f49726up.f47836k4;
    }

    /* JADX INFO: renamed from: du */
    public final float m72588du() {
        return this.f49716du.f47837x1;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m72589dy() {
        return this.f49718fa;
    }

    /* JADX INFO: renamed from: fa */
    public final float m72590fa() {
        return this.f49728yj;
    }

    /* JADX INFO: renamed from: h4 */
    public final float m72591h4() {
        return this.f49720jd;
    }

    /* JADX INFO: renamed from: jd */
    public final float m72592jd() {
        return this.f49726up.f47837x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m72593k4() {
        return this.f49726up.f47837x1 - this.f49728yj;
    }

    /* JADX INFO: renamed from: kk */
    public final float m72595kk() {
        return this.f49716du.f47836k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final fko[] m72597m9() {
        return this.f49715ck;
    }

    /* JADX INFO: renamed from: to */
    public final float m72598to() {
        return this.f49714c5;
    }

    /* JADX INFO: renamed from: up */
    public final float m72600up() {
        return this.f49723ks;
    }

    /* JADX INFO: renamed from: x1 */
    public final float m72601x1() {
        return this.f49726up.f47837x1 + this.f49723ks;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72594k4(float f) {
        this.f49726up.f47837x1 = f;
    }

    /* JADX INFO: renamed from: kk */
    public final void m72596kk(float f) {
        this.f49728yj = f;
    }

    /* JADX INFO: renamed from: to */
    public final void m72599to(float f) {
        this.f49723ks = f;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72602x1(float f) {
        this.f49726up.f47836k4 = f;
    }
}
