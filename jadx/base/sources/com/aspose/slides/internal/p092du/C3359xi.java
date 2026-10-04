package com.aspose.slides.internal.p092du;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.du.xi */
/* JADX INFO: loaded from: classes3.dex */
public class C3359xi extends AbstractC3345vh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f9722k4 = new C7017h4("auto", "center", "end", "justify", "left", "right", "Start");

    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public String mo13929k4(int i) {
        switch (i) {
            case 0:
                return "auto";
            case 1:
                return "start";
            case 2:
                return "end";
            case 3:
                return "left";
            case 4:
                return "right";
            case 5:
                return "center";
            case 6:
                return "justify";
            default:
                throw new ArgumentException("value");
        }
    }

    @Override // com.aspose.slides.internal.p092du.AbstractC3345vh, com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public boolean mo13930k4(String str, int[] iArr) {
        switch (f9722k4.m27428k4(C14113y2.m67368h4(str))) {
            case 0:
                iArr[0] = 0;
                return true;
            case 1:
                iArr[0] = 5;
                return true;
            case 2:
                iArr[0] = 2;
                return true;
            case 3:
                iArr[0] = 6;
                return true;
            case 4:
                iArr[0] = 3;
                return true;
            case 5:
                iArr[0] = 4;
                return true;
            case 6:
                iArr[0] = 1;
                return true;
            default:
                throw new ArgumentException("value");
        }
    }
}
