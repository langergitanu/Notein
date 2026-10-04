package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.microsoft.identity.common.internal.fido.FidoChallenge;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.tq */
/* JADX INFO: loaded from: classes3.dex */
public class C2599tq extends AbstractC2600ts {
    public C2599tq() {
        super("optional");
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (AbstractC2600ts.m11910k4(interfaceC12769ix)) {
            return !interfaceC12769ix.mo22698c5(FidoChallenge.DEFAULT_USER_VERIFICATION_POLICY);
        }
        return false;
    }
}
