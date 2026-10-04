package com.aspose.slides.internal.p325os;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.os.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C7143x1 {

    /* JADX INFO: renamed from: k4 */
    private int f19266k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, AbstractC7140k4> f19267x1 = new Dictionary<>();

    /* JADX INFO: renamed from: kk */
    private AbstractC7140k4 m27698kk(AbstractC7140k4 abstractC7140k4) {
        Dictionary.ValueCollection.Enumerator<String, AbstractC7140k4> it = this.f19267x1.getValues().iterator();
        while (it.hasNext()) {
            try {
                AbstractC7140k4 next = it.next();
                if (next.mo27689k4(abstractC7140k4)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return abstractC7140k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m27699k4(AbstractC7140k4 abstractC7140k4) {
        this.f19266k4++;
        String strMo27690kk = abstractC7140k4.mo27690kk();
        if (strMo27690kk != null) {
            return C14113y2.m67408k4(strMo27690kk, C14057f9.m66591x1(this.f19266k4));
        }
        throw new Exception("Action class is not compatible");
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC7140k4 m27700x1(AbstractC7140k4 abstractC7140k4) {
        if (!abstractC7140k4.m27695x1()) {
            abstractC7140k4.m27694k4(m27699k4(abstractC7140k4));
        }
        AbstractC7140k4 abstractC7140k4M27698kk = m27698kk(abstractC7140k4);
        if (abstractC7140k4M27698kk == abstractC7140k4) {
            this.f19267x1.set_Item(abstractC7140k4.m27692k4(), abstractC7140k4);
        }
        return abstractC7140k4M27698kk;
    }
}
