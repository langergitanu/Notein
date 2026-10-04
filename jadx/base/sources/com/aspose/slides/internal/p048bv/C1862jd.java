package com.aspose.slides.internal.p048bv;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p523yd.InterfaceC12806c5;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.bv.jd */
/* JADX INFO: loaded from: classes3.dex */
public class C1862jd implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, C1856c5> f6720k4 = new Dictionary<>();

    public C1862jd(InterfaceC12806c5 interfaceC12806c5) {
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        Dictionary<String, C1856c5> dictionary = this.f6720k4;
        if (dictionary != null) {
            Dictionary.Enumerator<String, C1856c5> it = dictionary.iterator();
            while (it.hasNext()) {
                try {
                    C1856c5 c1856c5 = (C1856c5) C7019kk.m27452k4(it.next().getValue(), C1856c5.class);
                    if (c1856c5 != null) {
                        c1856c5.m9711to().dispose();
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            this.f6720k4.clear();
            this.f6720k4 = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C1856c5 m9731k4(String str, InterfaceC1857ck interfaceC1857ck) {
        C12009k4 c12009k4;
        C1856c5 c1856c5;
        String strM67371jd = C14113y2.m67371jd(str);
        if (this.f6720k4.containsKey(strM67371jd)) {
            return (C1856c5) C7019kk.m27452k4((Object) this.f6720k4.get_Item(strM67371jd), C1856c5.class);
        }
        AbstractC3150x6 abstractC3150x6Mo9714k4 = interfaceC1857ck.mo9714k4(str);
        try {
            if (abstractC3150x6Mo9714k4 == null) {
                String strM67408k4 = C14113y2.m67408k4("data:image/png;base64,", "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNgYAAAAAMAASsJTYQAAAAASUVORK5CYII=");
                C3152yj c3152yj = new C3152yj(C14080ne.m66934jd("iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNgYAAAAAMAASsJTYQAAAAASUVORK5CYII="));
                try {
                    c12009k4 = new C12009k4(c3152yj);
                    c3152yj.dispose();
                    c1856c5 = new C1856c5(strM67408k4, "image/png");
                } catch (Throwable th) {
                    c3152yj.dispose();
                    throw th;
                }
            } else {
                c12009k4 = new C12009k4(abstractC3150x6Mo9714k4);
                c1856c5 = new C1856c5(str, "image/png");
            }
            c1856c5.m9708k4(new C1860fa(c12009k4.mo15760yj(), c12009k4.mo15757m9(), c12009k4.mo15752dy(), c12009k4.mo15758up(), interfaceC1857ck.mo9713k4()));
            c1856c5.m9709k4(c12009k4);
            this.f6720k4.addItem(strM67371jd, c1856c5);
            return c1856c5;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12002ck m9732k4(C1856c5 c1856c5, InterfaceC1857ck interfaceC1857ck) {
        return c1856c5.m9711to();
    }
}
