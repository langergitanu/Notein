package com.aspose.slides.internal.p097e0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p097e0.AbstractC3515du;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p364qm.C9891kk;
import com.aspose.slides.internal.p523yd.C12809h4;
import com.aspose.slides.internal.p523yd.C12815x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.h4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3519h4 {

    /* JADX INFO: renamed from: k4 */
    protected Dictionary<String, Dictionary<String, AbstractC3515du.k4>> f9823k4 = new Dictionary<>();

    /* JADX INFO: renamed from: x1 */
    protected Dictionary<String, AbstractC3515du> f9824x1 = new Dictionary<>();

    public C3519h4(C12809h4 c12809h4) {
        m14251k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3515du.k4 m14252k4(String str, String str2, InterfaceC3757h4 interfaceC3757h4) {
        AbstractC3515du.k4 k4Var = null;
        Dictionary[] dictionaryArr = {null};
        boolean zTryGetValue = this.f9823k4.tryGetValue(str, dictionaryArr);
        Dictionary dictionary = dictionaryArr[0];
        if (zTryGetValue) {
            k4Var = (AbstractC3515du.k4) (dictionary.containsKey(str2) ? dictionary.get_Item(str2) : dictionary.get_Item("<default>"));
        }
        if (k4Var != null) {
            return k4Var;
        }
        if (this.f9824x1.containsKey(str)) {
            throw new C12815x1(C14113y2.m67408k4(AbstractC3511c5.m14078x1(interfaceC3757h4), "No element mapping definition found for ", AbstractC3511c5.m14072k4(str, str2)), interfaceC3757h4);
        }
        return new C9891kk.k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC3515du m14253k4(String str) {
        return this.f9824x1.get_Item(str);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m14251k4() {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14254k4(AbstractC3515du abstractC3515du) {
        this.f9823k4.addItem(abstractC3515du.m14165x1(), abstractC3515du.m14161k4());
        this.f9824x1.addItem(abstractC3515du.m14165x1(), abstractC3515du);
    }
}
