package com.aspose.slides.internal.p092du;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;

/* JADX INFO: renamed from: com.aspose.slides.internal.du.ck */
/* JADX INFO: loaded from: classes3.dex */
public class C3264ck extends AbstractC3345vh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f9628k4 = new C7017h4("left-side", "far-left", "left", "center-left", "center", "center-right", "right", "far-right", "right-side", "leftwards", "rightwards");

    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public String mo13929k4(int i) {
        switch (i) {
            case 0:
                return "left-side";
            case 1:
                return "far-left";
            case 2:
                return "left";
            case 3:
                return "center-left";
            case 4:
                return "center";
            case 5:
                return "center-right";
            case 6:
                return "right";
            case 7:
                return "far-right";
            case 8:
                return "right-side";
            case 9:
                return "leftwards";
            case 10:
                return "rightwards";
            default:
                throw new ArgumentException("value");
        }
    }

    @Override // com.aspose.slides.internal.p092du.AbstractC3345vh, com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public boolean mo13930k4(String str, int[] iArr) {
        switch (f9628k4.m27428k4(C14113y2.m67368h4(str))) {
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
            default:
                throw new ArgumentException(ResponseType.TOKEN);
        }
    }
}
