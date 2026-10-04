package com.aspose.slides.internal.p092du;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.du.y2 */
/* JADX INFO: loaded from: classes3.dex */
public class C3362y2 extends AbstractC3345vh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f9725k4 = new C7017h4("@top-left-corner", "@top-left", "@top-center", "@top-right", "@top-right-corner", "@bottom-left-corner", "@bottom-left", "@bottom-center", "@bottom-right", "@bottom-right-corner", "@left-top", "@left-middle", "@left-bottom", "@right-top", "@right-middle", "@right-bottom");

    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public String mo13929k4(int i) {
        switch (i) {
            case 0:
                return "@top-left-corner";
            case 1:
                return "@top-left";
            case 2:
                return "@top-center";
            case 3:
                return "@top-right";
            case 4:
                return "@top-right-corner";
            case 5:
                return "@bottom-left-corner";
            case 6:
                return "@bottom-left";
            case 7:
                return "@bottom-center";
            case 8:
                return "@bottom-right";
            case 9:
                return "@bottom-right-corner";
            case 10:
                return "@left-top";
            case 11:
                return "@left-middle";
            case 12:
                return "@left-bottom";
            case 13:
                return "@right-top";
            case 14:
                return "@right-middle";
            case 15:
                return "@right-bottom";
            default:
                throw new ArgumentException("value");
        }
    }

    @Override // com.aspose.slides.internal.p092du.AbstractC3345vh, com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public boolean mo13930k4(String str, int[] iArr) {
        switch (f9725k4.m27428k4(C14113y2.m67368h4(str))) {
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
            default:
                throw new ArgumentException("value");
        }
    }
}
