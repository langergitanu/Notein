package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.p559ms.System.Xml.C13850af;

/* JADX INFO: renamed from: com.aspose.slides.dq */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0910dq {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f4638kk = new C7017h4("l", "ctr", "r", "none", "b", "mid", "t", "fromB", "fromL", "fromR", "fromT");

    /* JADX INFO: renamed from: k4 */
    private int f4639k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private int f4640x1 = 0;

    /* JADX INFO: renamed from: k4 */
    public static double m5205k4(String str, double d) {
        try {
            return C13850af.m65132uz(str);
        } catch (FormatException e) {
            C3085sv.m13082k4(e);
            return d;
        }
    }

    /* JADX INFO: renamed from: kk */
    public static int m5208kk(String str) {
        switch (f4638kk.m27428k4(str)) {
            case 7:
                return 1;
            case 8:
                return 2;
            case 9:
                return 3;
            case 10:
                return 4;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final int m5212x1() {
        return this.f4640x1;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m5209x1(String str) {
        int iM27428k4 = f4638kk.m27428k4(str);
        if (iM27428k4 == 3) {
            return 0;
        }
        if (iM27428k4 != 4) {
            return iM27428k4 != 5 ? 1 : 2;
        }
        return 3;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m5210k4() {
        return this.f4639k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m5206k4(String str) {
        int iM27428k4 = f4638kk.m27428k4(str);
        if (iM27428k4 == 1) {
            return 2;
        }
        if (iM27428k4 != 2) {
            return iM27428k4 != 3 ? 1 : 0;
        }
        return 3;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5213x1(int i) {
        this.f4640x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC0910dq m5207k4(C7254aj c7254aj) {
        switch (c7254aj.m28285k4()) {
            case 0:
                return new C0741ac(c7254aj);
            case 1:
                return new C13659it(c7254aj);
            case 2:
                return new C0824bn(c7254aj);
            case 3:
                return new C14630ue(c7254aj);
            case 4:
                return new C1193hb(c7254aj);
            case 5:
                return new xld(c7254aj);
            case 6:
                return new xji(c7254aj);
            case 7:
                return new qu9(c7254aj);
            case 8:
                return new tsw(c7254aj);
            case 9:
                return new h4g(c7254aj);
            default:
                throw new ArgumentException("Unknown algorithm parameter", "element");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5211k4(int i) {
        this.f4639k4 = i;
    }
}
