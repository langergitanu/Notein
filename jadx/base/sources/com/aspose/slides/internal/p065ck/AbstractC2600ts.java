package com.aspose.slides.internal.p065ck;

import com.aspose.slides.internal.p517y2.InterfaceC12769ix;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.ck.ts */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2600ts extends AbstractC2598to {

    /* JADX INFO: renamed from: com.aspose.slides.internal.ck.ts$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: com.aspose.slides.internal.ck.ts$k4$k4, reason: collision with other inner class name */
        public static class C19056k4 {
            /* JADX INFO: renamed from: k4 */
            public static boolean m11912k4(String str) {
                String strM67361du = C14113y2.m67361du(str);
                return "form".equals(strM67361du) || "input".equals(strM67361du) || "textarea".equals(strM67361du) || Constants.ScionAnalytics.PARAM_LABEL.equals(strM67361du) || "fieldset".equals(strM67361du) || "legend".equals(strM67361du) || "select".equals(strM67361du) || "optgroup".equals(strM67361du) || "option".equals(strM67361du) || "button".equals(strM67361du);
            }
        }
    }

    public AbstractC2600ts(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m11910k4(InterfaceC12769ix interfaceC12769ix) {
        return k4.C19056k4.m11912k4(interfaceC12769ix.mo22700du());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m11911k4(InterfaceC12769ix interfaceC12769ix, String str, String str2) {
        if (!interfaceC12769ix.mo22698c5(str)) {
            return false;
        }
        String strMo22721to = interfaceC12769ix.mo22721to(str);
        return C14113y2.m67411k4(str2) ? C14113y2.m67411k4(strMo22721to) : C14113y2.m67432to(str2, strMo22721to, (short) 5);
    }
}
