package com.aspose.slides.internal.p082dg;

import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.dg.du */
/* JADX INFO: loaded from: classes3.dex */
public class C3157du extends AbstractC3158h4 {

    /* JADX INFO: renamed from: k4 */
    private final String f9388k4;

    public C3157du(String str) {
        this.f9388k4 = str;
    }

    /* JADX INFO: renamed from: du */
    public static C3157du m13506du() {
        return new C3157du("GoBack");
    }

    /* JADX INFO: renamed from: k4 */
    public static C3157du m13507k4() {
        return new C3157du("NextPage");
    }

    /* JADX INFO: renamed from: kk */
    public static C3157du m13508kk() {
        return new C3157du("FirstPage");
    }

    /* JADX INFO: renamed from: to */
    public static C3157du m13509to() {
        return new C3157du("LastPage");
    }

    /* JADX INFO: renamed from: x1 */
    public static C3157du m13510x1() {
        return new C3157du("PrevPage");
    }

    @Override // com.aspose.slides.internal.p082dg.AbstractC3158h4
    /* JADX INFO: renamed from: k4 */
    public void mo13511k4(C10921yd c10921yd) {
        c10921yd.m52650k4("/A");
        c10921yd.m52643dy();
        c10921yd.m52666kk("/Type", "/Action");
        c10921yd.m52666kk("/S", "/Named");
        c10921yd.m52666kk("/N", C14113y2.m67408k4("/", this.f9388k4));
        c10921yd.m52640c5();
    }
}
