package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p270m9.AbstractC6340k4;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.u4 */
/* JADX INFO: loaded from: classes3.dex */
public class C2601u4 extends AbstractC2598to {

    /* JADX INFO: renamed from: k4 */
    private AbstractC2566ca f8424k4;

    public C2601u4(AbstractC2566ca abstractC2566ca) {
        super("not(");
        this.f8424k4 = abstractC2566ca;
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2598to, com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: du */
    public String mo11890du() {
        return C14113y2.m67402k4(":{0}{1})", "not(", this.f8424k4.mo11884h4());
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2562bv
    /* JADX INFO: renamed from: k4 */
    public void mo11889k4(AbstractC6340k4 abstractC6340k4) {
        this.f8424k4.mo11892k4(abstractC6340k4);
        super.mo11889k4(abstractC6340k4);
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        return !this.f8424k4.mo11885k4(interfaceC12769ix, str);
    }
}
