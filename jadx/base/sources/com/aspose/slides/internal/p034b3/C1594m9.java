package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p364qm.C9892x1;
import com.aspose.slides.internal.p364qm.InterfaceC9890k4;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.m9 */
/* JADX INFO: loaded from: classes3.dex */
public class C1594m9 {

    /* JADX INFO: renamed from: h4 */
    protected Dictionary<C9892x1, String> f6175h4 = null;

    /* JADX INFO: renamed from: m9 */
    protected List<InterfaceC9890k4> f6176m9 = null;

    /* JADX INFO: renamed from: ix */
    public final Dictionary<C9892x1, String> m8600ix() {
        Dictionary<C9892x1, String> dictionary = this.f6175h4;
        return dictionary != null ? dictionary : new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    public Object mo8601k4(C1594m9 c1594m9) {
        if (this.f6175h4 != null) {
            c1594m9.f6175h4 = new Dictionary<>(this.f6175h4);
        }
        List<InterfaceC9890k4> list = this.f6176m9;
        if (list != null) {
            c1594m9.f6176m9 = new List<>(list);
        }
        return c1594m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8605x1(Dictionary<C9892x1, String> dictionary) {
        if (dictionary == null || dictionary.size() == 0) {
            return;
        }
        Dictionary.Enumerator<C9892x1, String> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                m8604k4((C9892x1) next.getKey(), (String) next.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m8602k4(C9892x1 c9892x1) {
        Dictionary<C9892x1, String> dictionary = this.f6175h4;
        if (dictionary != null) {
            return dictionary.get_Item(c9892x1);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private void m8599k4() {
        if (this.f6176m9 == null) {
            this.f6176m9 = new List<>();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8603k4(List<InterfaceC9890k4> list) {
        m8599k4();
        List.Enumerator<InterfaceC9890k4> it = list.iterator();
        while (it.hasNext()) {
            try {
                this.f6176m9.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8604k4(C9892x1 c9892x1, String str) {
        if (this.f6175h4 == null) {
            this.f6175h4 = new Dictionary<>();
        }
        this.f6175h4.addItem(c9892x1, str);
    }
}
