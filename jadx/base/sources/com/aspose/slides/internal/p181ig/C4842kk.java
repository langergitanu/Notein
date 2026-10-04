package com.aspose.slides.internal.p181ig;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ig.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4842kk extends AbstractC7020m9<C4842kk> {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12777qq f13468k4;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC12777qq f13469x1;

    public C4842kk() {
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C4842kk) {
            return m20112x1((C4842kk) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12777qq m20113k4() {
        return this.f13468k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C4842kk Clone() {
        C4842kk c4842kk = new C4842kk();
        CloneTo(c4842kk);
        return c4842kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC12777qq m20116x1() {
        return this.f13469x1;
    }

    public C4842kk(InterfaceC12777qq interfaceC12777qq) {
        this.f13468k4 = interfaceC12777qq;
        this.f13469x1 = null;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m20112x1(C4842kk c4842kk) {
        return C14067j2.m66728k4(c4842kk.f13468k4, this.f13468k4) && C14067j2.m66728k4(c4842kk.f13469x1, this.f13469x1);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C4842kk c4842kk) {
        c4842kk.f13468k4 = this.f13468k4;
        c4842kk.f13469x1 = this.f13469x1;
    }

    public C4842kk(InterfaceC12777qq interfaceC12777qq, InterfaceC12777qq interfaceC12777qq2) {
        this.f13468k4 = interfaceC12777qq;
        this.f13469x1 = interfaceC12777qq2;
    }
}
