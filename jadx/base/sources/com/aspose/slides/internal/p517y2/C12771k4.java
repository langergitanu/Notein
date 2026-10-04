package com.aspose.slides.internal.p517y2;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.y2.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12771k4 implements IGenericEnumerable<KeyValuePair<String, Object>>, InterfaceC12766dy {

    /* JADX INFO: renamed from: k4 */
    private k4 f42542k4 = new k4();

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, Object> f42543x1 = new Dictionary<>();

    /* JADX INFO: renamed from: com.aspose.slides.internal.y2.k4$k4 */
    public static class k4 implements InterfaceC12773ks {

        /* JADX INFO: renamed from: k4 */
        private List<String> f42544k4;

        private k4() {
        }

        /* JADX INFO: renamed from: k4 */
        private List<String> m59456k4() {
            if (this.f42544k4 == null) {
                this.f42544k4 = new List<>();
            }
            return this.f42544k4;
        }

        @Override // java.lang.Iterable
        public final IGenericEnumerator<String> iterator() {
            return m59456k4().iterator();
        }

        /* JADX INFO: renamed from: x1 */
        public final void m59457x1(String str) {
            m59456k4().addItem(str);
        }

        @Override // com.aspose.slides.internal.p517y2.InterfaceC12773ks
        /* JADX INFO: renamed from: k4 */
        public final boolean mo22761k4(String str) {
            return m59456k4().containsItem(str);
        }
    }

    public C12771k4() {
        this.f42542k4.m59457x1("error-handler");
        this.f42542k4.m59457x1("format-pretty-print");
        m59454k4("format-pretty-print", Boolean.FALSE);
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<String, Object>> iterator() {
        return this.f42543x1.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC12773ks m59453k4() {
        return this.f42542k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m59455x1(String str, Object obj) {
        return m59453k4().mo22761k4(str);
    }

    @Override // com.aspose.slides.internal.p517y2.InterfaceC12766dy
    /* JADX INFO: renamed from: k4 */
    public final Object mo59451k4(String str) {
        if (!m59453k4().mo22761k4(str)) {
            throw new C12786x1((byte) 8);
        }
        if (this.f42543x1.containsKey(str)) {
            return this.f42543x1.get_Item(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59454k4(String str, Object obj) {
        if (!m59455x1(str, obj)) {
            throw new C12786x1((byte) 9);
        }
        if (this.f42543x1.containsKey(str)) {
            this.f42543x1.set_Item(str, obj);
        } else {
            this.f42543x1.addItem(str, obj);
        }
    }
}
