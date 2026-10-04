package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.wp */
/* JADX INFO: loaded from: classes3.dex */
public class C2610wp extends AbstractC2600ts {
    public C2610wp() {
        super("indeterminate");
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (!AbstractC2600ts.m11910k4(interfaceC12769ix) || !interfaceC12769ix.mo22698c5("indeterminate")) {
            return false;
        }
        String strM67361du = C14113y2.m67361du(interfaceC12769ix.mo22721to("indeterminate"));
        return C14113y2.m67363du(strM67361du, TelemetryEventStrings.Value.TRUE) || C14113y2.m67363du(strM67361du, "1");
    }
}
