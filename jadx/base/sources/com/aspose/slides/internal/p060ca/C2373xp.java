package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.xp */
/* JADX INFO: loaded from: classes3.dex */
public class C2373xp extends AbstractC2282s0 {

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, C2349wk> f8217x1;

    public C2373xp(long j) {
        super(j);
        this.f8217x1 = new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C2349wk m11696k4(String str) {
        if (this.f8217x1.containsKey(str)) {
            return this.f8217x1.get_Item(str);
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        int iM11151fa = c2212n9.m11151fa() & 65535;
        Dictionary.Enumerator<String, Long> it = AbstractC2282s0.m11352k4(iM11151fa, c2212n9).iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                this.f8217x1.addItem((String) next.getKey(), (C2349wk) AbstractC2282s0.m11353k4(new C2349wk((this.f7845k4 & 4294967295L) + ((Long) next.getValue()).longValue(), (String) next.getKey()), c2212n9));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (this.f8217x1.size() != iM11151fa) {
            throw new C2243pd("incorrect count of script tables");
        }
    }
}
