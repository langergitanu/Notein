package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class pkv extends c0x {

    /* JADX INFO: renamed from: k4 */
    private final com.aspose.slides.internal.p332p7.j4l f48086k4;

    /* JADX INFO: renamed from: kk */
    private final String f48087kk;

    /* JADX INFO: renamed from: to */
    private final Dictionary<IShape, String> f48088to = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private final OdpSerializationContext f48089x1;

    public pkv(com.aspose.slides.internal.p332p7.j4l j4lVar, OdpSerializationContext odpSerializationContext, String str) {
        this.f48086k4 = j4lVar;
        this.f48089x1 = odpSerializationContext;
        this.f48087kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final com.aspose.slides.internal.p332p7.j4l m69127k4() {
        return this.f48086k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final OdpSerializationContext m69130x1() {
        return this.f48089x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final com.aspose.slides.internal.p332p7.lzc m69128k4(String str, int i) {
        com.aspose.slides.internal.p332p7.lzc lzcVar = (com.aspose.slides.internal.p332p7.lzc) m69127k4().m34560k4("style").m29542x1();
        lzcVar.m36547k4(i);
        lzcVar.m36552x1(C14113y2.m67402k4("{0}{1}{2}", this.f48087kk, str, Integer.valueOf(m4421kk().size())));
        m4421kk().set_Item(lzcVar.m36546k4(), lzcVar);
        return lzcVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final com.aspose.slides.internal.p332p7.w7y m69129k4(String str) {
        com.aspose.slides.internal.p332p7.w7y w7yVar = (com.aspose.slides.internal.p332p7.w7y) m69127k4().m34560k4("list-style").m29542x1();
        w7yVar.m43547x1(C14113y2.m67402k4("{0}{1}{2}", this.f48087kk, str, Integer.valueOf(m4421kk().size())));
        m4422to().set_Item(w7yVar.m43545k4(), w7yVar);
        return w7yVar;
    }
}
