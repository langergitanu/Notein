package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p065ck.AbstractC2600ts;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.dq */
/* JADX INFO: loaded from: classes3.dex */
public class C2568dq extends AbstractC2600ts {
    public C2568dq() {
        super("enabled");
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (!AbstractC2600ts.k4.C19056k4.m11912k4(interfaceC12769ix.mo22700du())) {
            return false;
        }
        if (interfaceC12769ix.mo22698c5("disabled")) {
            return !C14113y2.m67432to("disabled", interfaceC12769ix.mo22721to("disabled"), (short) 5);
        }
        return true;
    }
}
