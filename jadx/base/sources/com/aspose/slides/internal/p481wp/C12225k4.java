package com.aspose.slides.internal.p481wp;

import com.aspose.slides.internal.p150gi.C4265c5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wp.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12225k4 {

    /* JADX INFO: renamed from: k4 */
    private static C12225k4 f40661k4;

    /* JADX INFO: renamed from: kk */
    private int f40662kk;

    /* JADX INFO: renamed from: x1 */
    private C4265c5.k4 f40663x1;

    public C12225k4(C4265c5.k4 k4Var, int i) {
        this.f40663x1 = k4Var;
        this.f40662kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12225k4 m57054k4() {
        if (f40661k4 == null) {
            f40661k4 = new C12225k4(C4265c5.m17146kk(), 75);
        }
        return f40661k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m57055kk() {
        return this.f40662kk;
    }

    public String toString() {
        String str = C14113y2.f47374k4;
        switch (this.f40662kk) {
            case 71:
                str = "table";
                break;
            case 73:
                str = "table-body";
                break;
            case 75:
                str = "table-cell";
                break;
            case 76:
                str = "table-column";
                break;
            case 77:
                str = "table-footer";
                break;
            case 78:
                str = "table-header";
                break;
            case 79:
                str = "table-row";
                break;
        }
        return C14113y2.m67407k4("{", this.f40663x1, ", ", str, "}");
    }

    /* JADX INFO: renamed from: x1 */
    public final C4265c5.k4 m57056x1() {
        return this.f40663x1;
    }
}
