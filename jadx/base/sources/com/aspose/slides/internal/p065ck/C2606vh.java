package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.vh */
/* JADX INFO: loaded from: classes3.dex */
public class C2606vh extends AbstractC2598to {
    public C2606vh() {
        super("only-child");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.aspose.slides.internal.y2.ix, com.aspose.slides.internal.y2.qq] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.aspose.slides.internal.y2.qq] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.aspose.slides.internal.y2.qq] */
    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (interfaceC12769ix.mo22646kp() == null || interfaceC12769ix.mo22646kp().mo22608fa() != 1) {
            return false;
        }
        for (InterfaceC12777qq interfaceC12777qqMo22654sv = interfaceC12769ix.mo22654sv(); interfaceC12777qqMo22654sv != null; interfaceC12777qqMo22654sv = interfaceC12777qqMo22654sv.mo22654sv()) {
            if (interfaceC12777qqMo22654sv.mo22608fa() == 1) {
                return false;
            }
        }
        do {
            interfaceC12769ix = interfaceC12769ix.mo22631g8();
            if (interfaceC12769ix == 0) {
                return true;
            }
        } while (interfaceC12769ix.mo22608fa() != 1);
        return false;
    }
}
