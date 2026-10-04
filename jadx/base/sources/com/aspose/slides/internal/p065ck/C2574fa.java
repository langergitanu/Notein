package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.fa */
/* JADX INFO: loaded from: classes3.dex */
public class C2574fa extends AbstractC2609wl {
    public C2574fa(InterfaceC2563bz interfaceC2563bz, InterfaceC2563bz interfaceC2563bz2) {
        super(interfaceC2563bz, interfaceC2563bz2);
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: h4 */
    public String mo11884h4() {
        return C14113y2.m67408k4(m11950k4().mo11884h4(), " + ", m11951x1().mo11884h4());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.aspose.slides.internal.y2.ix] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.aspose.slides.internal.y2.qq] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.aspose.slides.internal.y2.qq] */
    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca, com.aspose.slides.internal.p065ck.InterfaceC2563bz
    /* JADX INFO: renamed from: k4 */
    public boolean mo11885k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (!m11951x1().mo11885k4(interfaceC12769ix, str)) {
            return false;
        }
        do {
            interfaceC12769ix = interfaceC12769ix.mo22654sv();
            if (interfaceC12769ix == 0) {
                return false;
            }
        } while (interfaceC12769ix.mo22608fa() != 1);
        return m11950k4().mo11885k4((InterfaceC12769ix) interfaceC12769ix, null);
    }

    @Override // com.aspose.slides.internal.p065ck.AbstractC2566ca
    /* JADX INFO: renamed from: kk */
    public int mo11886kk() {
        return 12;
    }
}
