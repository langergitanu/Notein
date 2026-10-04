package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.wk */
/* JADX INFO: loaded from: classes3.dex */
public class C2349wk extends AbstractC2221ny {

    /* JADX INFO: renamed from: kk */
    private C2089fp f8156kk;

    /* JADX INFO: renamed from: to */
    private Dictionary<String, C2089fp> f8157to;

    public C2349wk(long j, String str) {
        super(j, str);
        this.f8156kk = null;
        this.f8157to = new Dictionary<>();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        long jM11151fa = c2212n9.m11151fa() & 65535;
        int iM11151fa = c2212n9.m11151fa();
        if (C14113y2.m67363du(m11181x1(), "DFLT") && (jM11151fa == 0 || (iM11151fa & 65535) != 0)) {
            throw new C2243pd("Incorrect format for default script table");
        }
        int i = iM11151fa & 65535;
        Dictionary<String, Long> dictionaryM11352k4 = AbstractC2282s0.m11352k4(i, c2212n9);
        if (jM11151fa != 0) {
            this.f8156kk = (C2089fp) AbstractC2282s0.m11353k4(new C2089fp((this.f7845k4 & 4294967295L) + jM11151fa, "Default"), c2212n9);
        }
        Dictionary.Enumerator<String, Long> it = dictionaryM11352k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                this.f8157to.addItem((String) next.getKey(), (C2089fp) AbstractC2282s0.m11353k4(new C2089fp((this.f7845k4 & 4294967295L) + ((Long) next.getValue()).longValue(), (String) next.getKey()), c2212n9));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (this.f8157to.size() != i) {
            throw new C2243pd("incorrect count of language system tables");
        }
    }

    /* JADX INFO: renamed from: kk */
    public final C2089fp m11603kk() {
        return this.f8156kk;
    }
}
