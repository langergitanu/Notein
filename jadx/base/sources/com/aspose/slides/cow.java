package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class cow {

    /* JADX INFO: renamed from: k4 */
    private String f4398k4;

    /* JADX INFO: renamed from: x1 */
    private List<qi5> f4400x1 = new List<>();

    /* JADX INFO: renamed from: kk */
    private List<qi5> f4399kk = new List<>();

    /* JADX INFO: renamed from: k4 */
    public final String m4704k4() {
        return this.f4398k4;
    }

    /* JADX INFO: renamed from: kk */
    public final List<qi5> m4706kk() {
        return this.f4399kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<qi5> m4707x1() {
        return this.f4400x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m4705k4(String str) {
        this.f4398k4 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final qi5 m4708x1(String str) {
        if (str == null) {
            return null;
        }
        List.Enumerator<qi5> it = m4707x1().iterator();
        while (it.hasNext()) {
            try {
                qi5 next = it.next();
                if (C14113y2.m67363du(str, next.m69657x1())) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }
}
