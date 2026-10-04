package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.s7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2594s7 extends AbstractC2598to {
    public C2594s7() {
        super("last-of-type");
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (interfaceC12769ix.mo22646kp() == null || interfaceC12769ix.mo22646kp().mo22608fa() != 1) {
            return false;
        }
        for (InterfaceC12777qq interfaceC12777qqMo22631g8 = interfaceC12769ix.mo22631g8(); interfaceC12777qqMo22631g8 != null; interfaceC12777qqMo22631g8 = interfaceC12777qqMo22631g8.mo22631g8()) {
            if (interfaceC12777qqMo22631g8.mo22608fa() == 1 && C14113y2.m67363du(((InterfaceC12769ix) interfaceC12777qqMo22631g8).mo22700du(), interfaceC12769ix.mo22700du())) {
                return false;
            }
        }
        return true;
    }
}
