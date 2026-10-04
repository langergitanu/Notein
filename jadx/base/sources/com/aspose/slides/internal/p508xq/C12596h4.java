package com.aspose.slides.internal.p508xq;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.xq.h4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12596h4 {

    /* JADX INFO: renamed from: k4 */
    private final String f42141k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC3150x6 f42142kk;

    /* JADX INFO: renamed from: to */
    private final C12593c5 f42143to;

    /* JADX INFO: renamed from: x1 */
    private String f42144x1;

    public C12596h4(String str, String str2) {
        C12565ks.m58616k4(str, "partName");
        this.f42141k4 = str;
        this.f42144x1 = str2;
        this.f42142kk = new C3152yj();
        this.f42143to = new C12593c5(str);
    }

    /* JADX INFO: renamed from: du */
    public final C3152yj m58798du() {
        return C12565ks.m58610k4(this.f42142kk);
    }

    /* JADX INFO: renamed from: h4 */
    public final C12593c5 m58799h4() {
        return this.f42143to;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m58800k4() {
        return this.f42141k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m58802kk() {
        return this.f42144x1;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC3150x6 m58803to() {
        return this.f42142kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m58804x1() {
        return C14113y2.m67431to(C3141rv.m13397du(this.f42141k4), FilenameUtils.EXTENSION_SEPARATOR);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58801k4(AbstractC3150x6 abstractC3150x6) {
        this.f42142kk = abstractC3150x6;
    }
}
