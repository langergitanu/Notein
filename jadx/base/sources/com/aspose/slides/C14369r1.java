package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p353q7.C9786ss;
import com.aspose.slides.internal.p353q7.C9787sv;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: renamed from: com.aspose.slides.r1 */
/* JADX INFO: loaded from: classes3.dex */
class C14369r1 {

    /* JADX INFO: renamed from: k4 */
    Dictionary<Integer, C9786ss> f48508k4;

    /* JADX INFO: renamed from: kk */
    private C9790ts f48509kk;

    /* JADX INFO: renamed from: x1 */
    private C9787sv f48510x1;

    public C14369r1(C9790ts c9790ts) {
        this.f48509kk = c9790ts;
        this.f48510x1 = new C9787sv(c9790ts, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final C9786ss m69974k4(char c) {
        int iM48151k4 = this.f48510x1.m48151k4(c);
        Dictionary<Integer, C9786ss> dictionaryM48153k4 = this.f48510x1.m48153k4();
        this.f48508k4 = dictionaryM48153k4;
        C9786ss[] c9786ssArr = {null};
        return !dictionaryM48153k4.tryGetValue(Integer.valueOf(iM48151k4), c9786ssArr) ? this.f48508k4.get_Item(0) : c9786ssArr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final C12015qq m69975k4(char c, float f) {
        C9786ss c9786ssM69974k4 = m69974k4(c);
        return new C12015qq(((c9786ssM69974k4.m48140k4() + c9786ssM69974k4.m48143kk()) * f) / this.f48509kk.m48175c5(), (f / 10.0f) + (((c9786ssM69974k4.m48147x1() + c9786ssM69974k4.m48145to()) * f) / this.f48509kk.m48175c5()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69976k4(String str) {
        this.f48510x1.m48155k4(str);
    }
}
