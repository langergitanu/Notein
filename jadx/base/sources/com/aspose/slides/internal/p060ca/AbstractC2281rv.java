package com.aspose.slides.internal.p060ca;

import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.rv */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2281rv extends AbstractC2167ks {

    /* JADX INFO: renamed from: du */
    private C2120hx f7844du;

    public AbstractC2281rv(C2120hx c2120hx, AbstractC2281rv abstractC2281rv) {
        super(abstractC2281rv, c2120hx.m10701k4());
        this.f7844du = c2120hx;
        if (c2120hx.m10701k4() == null) {
            throw new C2149jo(C14113y2.m67402k4("The parser {0} could not start because parsing content is empty", C14067j2.m66727k4(this).mo48540du()));
        }
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks, com.aspose.slides.internal.p060ca.InterfaceC2191m8
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ void mo10226k4(Object obj) {
        super.mo10226k4(obj);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: kk */
    public /* bridge */ /* synthetic */ void mo10227kk() {
        super.mo10227kk();
    }

    /* JADX INFO: renamed from: rv */
    public final C2120hx m11351rv() {
        return this.f7844du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2167ks
    /* JADX INFO: renamed from: x1 */
    public void mo10280x1(int i, int[] iArr) {
        try {
            super.mo10280x1(i, iArr);
        } catch (RuntimeException e) {
            throw new C2149jo(C14113y2.m67402k4("Error happened during parsing {0}", C14113y2.m67408k4(C14067j2.m66727k4(this).mo48540du(), new C2361x3().m11644k4(this))), e);
        }
    }
}
