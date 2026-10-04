package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.wgi;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class wxb extends c0x {

    /* JADX INFO: renamed from: k4 */
    private final qye f49873k4;

    /* JADX INFO: renamed from: kk */
    private hom f49874kk;

    /* JADX INFO: renamed from: x1 */
    private final com.aspose.slides.internal.p332p7.j4l f49876x1;

    /* JADX INFO: renamed from: to */
    private final Dictionary<String, Shape> f49875to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private final Dictionary<String, Paragraph> f49872du = new Dictionary<>();

    public wxb(qye qyeVar, com.aspose.slides.internal.p332p7.j4l j4lVar) {
        this.f49873k4 = qyeVar;
        this.f49876x1 = j4lVar;
        m72954c5();
    }

    /* JADX INFO: renamed from: c5 */
    private void m72954c5() {
        List.Enumerator<C7394ca> it = this.f49876x1.m34559k4().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                wgi.m72723k4(com.aspose.slides.internal.p332p7.lzc.class, m4421kk(), "style", next, new wgi.AbstractC14737k4<com.aspose.slides.internal.p332p7.lzc>() { // from class: com.aspose.slides.wxb.1
                    @Override // com.aspose.slides.wgi.AbstractC14737k4
                    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public String mo69249k4(com.aspose.slides.internal.p332p7.lzc lzcVar) {
                        return lzcVar.m36546k4();
                    }
                });
                wgi.m72723k4(com.aspose.slides.internal.p332p7.w7y.class, m4422to(), "list-style", next, new wgi.AbstractC14737k4<com.aspose.slides.internal.p332p7.w7y>() { // from class: com.aspose.slides.wxb.2
                    @Override // com.aspose.slides.wgi.AbstractC14737k4
                    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
                    public String mo69249k4(com.aspose.slides.internal.p332p7.w7y w7yVar) {
                        return w7yVar.m43545k4();
                    }
                });
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    public final Dictionary<String, Paragraph> m72955dy() {
        return this.f49872du;
    }

    /* JADX INFO: renamed from: h4 */
    public final hom m72956h4() {
        return this.f49874kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final qye m72957k4() {
        return this.f49873k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final Dictionary<String, Shape> m72959m9() {
        return this.f49875to;
    }

    /* JADX INFO: renamed from: x1 */
    public final pt0 m72960x1() {
        return this.f49873k4.m69960x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72958k4(hom homVar) {
        this.f49874kk = homVar;
    }
}
