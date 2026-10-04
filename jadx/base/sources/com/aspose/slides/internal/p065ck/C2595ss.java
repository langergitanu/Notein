package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.ss */
/* JADX INFO: loaded from: classes3.dex */
public class C2595ss extends AbstractC2600ts {
    public C2595ss() {
        super("invalid");
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (!C14113y2.m67432to("input", interfaceC12769ix.mo22700du(), (short) 5) || !interfaceC12769ix.mo22698c5("pattern")) {
            return false;
        }
        if (C14113y2.m67411k4(interfaceC12769ix.mo22721to("pattern")) || !interfaceC12769ix.mo22698c5("value")) {
            return false;
        }
        if (C14113y2.m67411k4(interfaceC12769ix.mo22721to("value"))) {
            return false;
        }
        try {
            return !new C12380dy(r5).m57989x1(r4).mo58006to();
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
