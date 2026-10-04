package com.aspose.slides.internal.p082dg;

import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p420th.C10959ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.dg.h4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3158h4 {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC3158h4 m13512k4(C10959ix c10959ix) {
        if (c10959ix.m52943to() == 0) {
            return !c10959ix.m52944x1() ? new C3161to(c10959ix.m52941kk()) : new C3160kk(c10959ix.m52941kk());
        }
        switch (c10959ix.m52937du()) {
            case 0:
                return new C3160kk(c10959ix.m52941kk());
            case 1:
                return C3157du.m13507k4();
            case 2:
                return C3157du.m13510x1();
            case 3:
                return C3157du.m13508kk();
            case 4:
            case 6:
                return C3157du.m13509to();
            case 5:
                return C3157du.m13506du();
            case 7:
                return new C3159k4(c10959ix.m52938h4() + 1);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo13511k4(C10921yd c10921yd);
}
