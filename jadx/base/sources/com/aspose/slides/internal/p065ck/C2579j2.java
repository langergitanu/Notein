package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14057f9;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.j2 */
/* JADX INFO: loaded from: classes3.dex */
public class C2579j2 extends AbstractC2600ts {
    public C2579j2() {
        super("out-of-range");
    }

    @Override // com.aspose.slides.internal.p065ck.InterfaceC2589qm
    /* JADX INFO: renamed from: k4 */
    public boolean mo11883k4(InterfaceC12769ix interfaceC12769ix, String str) {
        if (!AbstractC2600ts.m11910k4(interfaceC12769ix) || !AbstractC2600ts.m11911k4(interfaceC12769ix, C18437z2.f56754h, "number") || !interfaceC12769ix.mo22698c5("value")) {
            return false;
        }
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(interfaceC12769ix.mo22721to("value"), iArr);
        int i = iArr[0];
        if (!zM66590k4) {
            return false;
        }
        int i2 = Integer.MIN_VALUE;
        if (interfaceC12769ix.mo22698c5("min")) {
            int[] iArr2 = {0};
            boolean zM66590k42 = C14057f9.m66590k4(interfaceC12769ix.mo22721to("min"), iArr2);
            int i3 = iArr2[0];
            if (zM66590k42) {
                i2 = i3;
            }
        }
        int i4 = Integer.MAX_VALUE;
        if (interfaceC12769ix.mo22698c5("max")) {
            int[] iArr3 = {0};
            boolean zM66590k43 = C14057f9.m66590k4(interfaceC12769ix.mo22721to("max"), iArr3);
            int i5 = iArr3[0];
            if (zM66590k43) {
                i4 = i5;
            }
        }
        return i < i2 || i4 < i;
    }
}
