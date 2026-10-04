package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ic */
/* JADX INFO: loaded from: classes3.dex */
class C1247ic extends AbstractC14463so {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<String, String> f5703k4 = new Dictionary<>(AbstractC14070jw.m66790x1());

    /* JADX INFO: renamed from: x1 */
    private AbstractC7414ck f5704x1;

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, String> m7615k4() {
        return this.f5703k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC7414ck m7619x1() {
        return this.f5704x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7616k4(C1247ic c1247ic) {
        AbstractC7414ck abstractC7414ck = c1247ic.f5704x1;
        this.f5704x1 = abstractC7414ck != null ? abstractC7414ck.m29645to() : null;
        this.f5703k4.clear();
        Dictionary.KeyCollection.Enumerator<String, String> it = c1247ic.m7615k4().getKeys().iterator();
        while (it.hasNext()) {
            try {
                String next = it.next();
                this.f5703k4.addItem(next, c1247ic.m7615k4().get_Item(next));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7617k4(AbstractC7414ck abstractC7414ck) {
        this.f5704x1 = abstractC7414ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7618k4(String str, String str2) {
        if (this.f5703k4.containsKey(str)) {
            this.f5703k4.set_Item(str, str2);
        } else {
            this.f5703k4.addItem(str, str2);
        }
    }
}
