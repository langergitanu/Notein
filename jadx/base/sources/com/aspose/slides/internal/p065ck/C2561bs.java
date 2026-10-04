package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.bs */
/* JADX INFO: loaded from: classes3.dex */
public class C2561bs extends AbstractC2600ts {
    public C2561bs() {
        super("valid");
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (!C14113y2.m67432to("input", interfaceC12769ix.mo22700du(), (short) 5) || !interfaceC12769ix.mo22698c5("pattern")) {
            return false;
        }
        String strMo22721to = interfaceC12769ix.mo22721to("pattern");
        if (C14113y2.m67411k4(strMo22721to)) {
            return false;
        }
        if (!interfaceC12769ix.mo22698c5("value")) {
            return true;
        }
        String strMo22721to2 = interfaceC12769ix.mo22721to("value");
        if (C14113y2.m67411k4(strMo22721to2)) {
            return true;
        }
        try {
            return new C12380dy(strMo22721to).m57989x1(strMo22721to2).mo58006to();
        } catch (RuntimeException unused) {
            return false;
        }
    }
}
