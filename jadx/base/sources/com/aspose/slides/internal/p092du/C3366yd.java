package com.aspose.slides.internal.p092du;

import androidx.core.app.NotificationCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;

/* JADX INFO: renamed from: com.aspose.slides.internal.du.yd */
/* JADX INFO: loaded from: classes3.dex */
public class C3366yd extends AbstractC3345vh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f9729k4 = new C7017h4("auto", "crosshair", "default", "pointer", "move", "e-resize", "ne-resize", "nw-resize", "n-resize", "se-resize", "sw-resize", "s-resize", "w-resize", "text", "wait", NotificationCompat.CATEGORY_PROGRESS, "help", "url");

    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public String mo13929k4(int i) {
        switch (i) {
            case 0:
                return "auto";
            case 1:
                return "crosshair";
            case 2:
                return "default";
            case 3:
                return "pointer";
            case 4:
                return "move";
            case 5:
                return "e-resize";
            case 6:
                return "ne-resize";
            case 7:
                return "nw-resize";
            case 8:
                return "n-resize";
            case 9:
                return "se-resize";
            case 10:
                return "sw-resize";
            case 11:
                return "s-resize";
            case 12:
                return "w-resize";
            case 13:
                return "text";
            case 14:
                return "wait";
            case 15:
                return NotificationCompat.CATEGORY_PROGRESS;
            case 16:
                return "help";
            case 17:
                return "url";
            default:
                throw new ArgumentException("value");
        }
    }

    @Override // com.aspose.slides.internal.p092du.AbstractC3345vh, com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public boolean mo13930k4(String str, int[] iArr) {
        switch (f9729k4.m27428k4(C14113y2.m67368h4(str))) {
            case 0:
                iArr[0] = 0;
                return true;
            case 1:
                iArr[0] = 1;
                return true;
            case 2:
                iArr[0] = 2;
                return true;
            case 3:
                iArr[0] = 3;
                return true;
            case 4:
                iArr[0] = 4;
                return true;
            case 5:
                iArr[0] = 5;
                return true;
            case 6:
                iArr[0] = 6;
                return true;
            case 7:
                iArr[0] = 7;
                return true;
            case 8:
                iArr[0] = 8;
                return true;
            case 9:
                iArr[0] = 9;
                return true;
            case 10:
                iArr[0] = 10;
                return true;
            case 11:
                iArr[0] = 11;
                return true;
            case 12:
                iArr[0] = 12;
                return true;
            case 13:
                iArr[0] = 13;
                return true;
            case 14:
                iArr[0] = 14;
                return true;
            case 15:
                iArr[0] = 15;
                return true;
            case 16:
                iArr[0] = 16;
                return true;
            case 17:
                iArr[0] = 17;
                return true;
            default:
                throw new ArgumentException(ResponseType.TOKEN);
        }
    }
}
