package com.aspose.slides.internal.p425tq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tq.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C11096uz {

    /* JADX INFO: renamed from: k4 */
    private String f38427k4;

    /* JADX INFO: renamed from: kk */
    private C12814to f38428kk;

    /* JADX INFO: renamed from: to */
    private Dictionary<String, Object> f38429to = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    private AbstractC11080du f38430x1;

    public C11096uz(AbstractC11080du abstractC11080du, String str) {
        this.f38430x1 = abstractC11080du;
        this.f38427k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53618k4(C12814to c12814to) {
        this.f38428kk = c12814to;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp("RendererContext{\n");
        Dictionary.KeyCollection.Enumerator<String, Object> it = this.f38429to.getKeys().iterator();
        while (it.hasNext()) {
            try {
                String next = it.next();
                c6765kp.m26792k4(C14113y2.m67407k4("\t", next, "=", this.f38429to.get_Item(next), IOUtils.LINE_SEPARATOR_UNIX));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c6765kp.m26792k4("}");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m53619k4(String str, Object obj) {
        this.f38429to.addItem(str, obj);
    }
}
