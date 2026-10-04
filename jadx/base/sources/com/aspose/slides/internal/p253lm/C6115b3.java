package com.aspose.slides.internal.p253lm;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.b3 */
/* JADX INFO: loaded from: classes4.dex */
public class C6115b3 implements InterfaceC6196w6 {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, AbstractC6155lr> f17254k4 = new Dictionary<>(5);

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<String, AbstractC6155lr>> iterator() {
        return this.f17254k4.iterator();
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6196w6
    /* JADX INFO: renamed from: k4 */
    public final IGenericEnumerable<AbstractC6155lr> mo24763k4() {
        return this.f17254k4.getValues();
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6196w6
    /* JADX INFO: renamed from: x1 */
    public final AbstractC6155lr mo24767x1(String str) {
        AbstractC6155lr[] abstractC6155lrArr = {null};
        mo24766k4(str, abstractC6155lrArr);
        return abstractC6155lrArr[0];
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6196w6
    /* JADX INFO: renamed from: k4 */
    public final AbstractC6155lr mo24764k4(String str, AbstractC6155lr abstractC6155lr) {
        this.f17254k4.set_Item(str, abstractC6155lr);
        return abstractC6155lr;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6196w6
    /* JADX INFO: renamed from: k4 */
    public final void mo24765k4(String str) {
        this.f17254k4.removeItemByKey(str);
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6196w6
    /* JADX INFO: renamed from: k4 */
    public final boolean mo24766k4(String str, AbstractC6155lr[] abstractC6155lrArr) {
        abstractC6155lrArr[0] = null;
        boolean zContainsKey = this.f17254k4.containsKey(str);
        if (zContainsKey) {
            abstractC6155lrArr[0] = this.f17254k4.get_Item(str);
        }
        return zContainsKey;
    }
}
