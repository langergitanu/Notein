package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.c6 */
/* JADX INFO: loaded from: classes3.dex */
public class C2565c6 extends AbstractC2598to {
    public C2565c6() {
        super("first-of-type");
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (interfaceC12769ix.mo22646kp() == null || interfaceC12769ix.mo22646kp().mo22608fa() != 1) {
            return false;
        }
        for (InterfaceC12777qq interfaceC12777qqMo22654sv = interfaceC12769ix.mo22654sv(); interfaceC12777qqMo22654sv != null; interfaceC12777qqMo22654sv = interfaceC12777qqMo22654sv.mo22654sv()) {
            if (interfaceC12777qqMo22654sv.mo22608fa() == 1 && C14113y2.m67363du(((InterfaceC12769ix) interfaceC12777qqMo22654sv).mo22700du(), interfaceC12769ix.mo22700du())) {
                return false;
            }
        }
        return true;
    }
}
