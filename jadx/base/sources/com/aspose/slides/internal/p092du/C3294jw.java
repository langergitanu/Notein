package com.aspose.slides.internal.p092du;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.internal.providers.oauth2.ResponseType;

/* JADX INFO: renamed from: com.aspose.slides.internal.du.jw */
/* JADX INFO: loaded from: classes3.dex */
public class C3294jw extends AbstractC3345vh {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f9658k4 = new C7017h4("disc", "circle", "square", "decimal", "decimal-leading-zero", "lower-roman", "upper-roman", "lower-greek", "lower-latin", "upper-latin", "armenian", "georgian", "lower-alpha", "upper-alpha", "none");

    @Override // com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public String mo13929k4(int i) {
        switch (i) {
            case 0:
                return "disc";
            case 1:
                return "circle";
            case 2:
                return "square";
            case 3:
                return "decimal";
            case 4:
                return "decimal-leading-zero";
            case 5:
                return "lower-roman";
            case 6:
                return "upper-roman";
            case 7:
                return "lower-greek";
            case 8:
                return "lower-latin";
            case 9:
                return "upper-latin";
            case 10:
                return "armenian";
            case 11:
                return "georgian";
            case 12:
                return "lower-alpha";
            case 13:
                return "upper-alpha";
            case 14:
                return "none";
            default:
                throw new ArgumentException("value");
        }
    }

    @Override // com.aspose.slides.internal.p092du.AbstractC3345vh, com.aspose.slides.internal.p423to.InterfaceC11073to
    /* JADX INFO: renamed from: k4 */
    public boolean mo13930k4(String str, int[] iArr) {
        switch (f9658k4.m27428k4(C14113y2.m67368h4(str))) {
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
            default:
                throw new ArgumentException(ResponseType.TOKEN);
        }
    }
}
