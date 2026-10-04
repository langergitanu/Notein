package com.aspose.slides.internal.p115eq;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.eq.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C3792m9 {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, String> f10332k4 = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    public final Dictionary<String, String> m15151k4() {
        return this.f10332k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m15153x1(String str) {
        Dictionary.Enumerator<String, String> it = this.f10332k4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                String string = ((String) next.getKey()).toString();
                if (C14113y2.m67448x1(string, ".") && C14113y2.m67363du(str, C14113y2.m67396k4(string, 0, 1))) {
                    return ((String) next.getValue()).toString();
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
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m15152k4(String str) {
        for (String str2 : C14113y2.m67369h4(str, '}')) {
            String[] strArrM67369h4 = C14113y2.m67369h4(str2, '{');
            if (strArrM67369h4.length > 1 && !this.f10332k4.containsKey(C14113y2.m67440x1(strArrM67369h4[0]))) {
                this.f10332k4.addItem(C14113y2.m67440x1(strArrM67369h4[0]), C14113y2.m67440x1(strArrM67369h4[1]));
            }
        }
    }
}
