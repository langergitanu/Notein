package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14087rv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.fl */
/* JADX INFO: loaded from: classes3.dex */
class C1104fl {

    /* JADX INFO: renamed from: k4 */
    int f5055k4 = 0;

    /* JADX INFO: renamed from: x1 */
    AbstractC3124b3 f5057x1 = C14087rv.m67159k4();

    /* JADX INFO: renamed from: kk */
    String f5056kk = "-- line {0} col {1}: {2}";

    /* JADX INFO: renamed from: k4 */
    public void m6191k4(int i, int i2, int i3) {
        String strM67408k4;
        switch (i3) {
            case 0:
                strM67408k4 = "EOF expected";
                break;
            case 1:
                strM67408k4 = "value expected";
                break;
            case 2:
                strM67408k4 = "\"rotate\" expected";
                break;
            case 3:
                strM67408k4 = "\"scale\" expected";
                break;
            case 4:
                strM67408k4 = "\"skewX\" expected";
                break;
            case 5:
                strM67408k4 = "\"skewY\" expected";
                break;
            case 6:
                strM67408k4 = "\"translate\" expected";
                break;
            case 7:
                strM67408k4 = "\"(\" expected";
                break;
            case 8:
                strM67408k4 = "\")\" expected";
                break;
            case 9:
                strM67408k4 = "\",\" expected";
                break;
            case 10:
                strM67408k4 = "??? expected";
                break;
            case 11:
                strM67408k4 = "invalid Transform";
                break;
            default:
                strM67408k4 = C14113y2.m67408k4("error ", C14057f9.m66591x1(i3));
                break;
        }
        this.f5057x1.mo13329x1(this.f5056kk, C7019kk.m27466x1(i), C7019kk.m27466x1(i2), strM67408k4);
        this.f5055k4++;
    }
}
