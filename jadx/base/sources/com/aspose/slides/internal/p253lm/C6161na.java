package com.aspose.slides.internal.p253lm;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.na */
/* JADX INFO: loaded from: classes4.dex */
public class C6161na implements InterfaceC6196w6 {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC6196w6 f17399k4 = new C6115b3();

    /* JADX INFO: renamed from: x1 */
    private AbstractC6155lr f17400x1;

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<String, AbstractC6155lr>> iterator() {
        return this.f17399k4.iterator();
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6196w6
    /* JADX INFO: renamed from: k4 */
    public final IGenericEnumerable<AbstractC6155lr> mo24763k4() {
        return this.f17399k4.mo24763k4();
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6196w6
    /* JADX INFO: renamed from: x1 */
    public final AbstractC6155lr mo24767x1(String str) {
        AbstractC6155lr abstractC6155lr = this.f17400x1;
        if (abstractC6155lr != null && C14113y2.m67363du(abstractC6155lr.m24910k4(), str)) {
            return this.f17400x1;
        }
        AbstractC6155lr abstractC6155lrMo24767x1 = this.f17399k4.mo24767x1(str);
        if (abstractC6155lrMo24767x1 != null) {
            this.f17400x1 = abstractC6155lrMo24767x1;
        }
        return abstractC6155lrMo24767x1;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6196w6
    /* JADX INFO: renamed from: k4 */
    public final AbstractC6155lr mo24764k4(String str, AbstractC6155lr abstractC6155lr) {
        this.f17399k4.mo24764k4(str, abstractC6155lr);
        this.f17400x1 = abstractC6155lr;
        return abstractC6155lr;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6196w6
    /* JADX INFO: renamed from: k4 */
    public final void mo24765k4(String str) {
        this.f17399k4.mo24765k4(str);
        AbstractC6155lr abstractC6155lr = this.f17400x1;
        if (abstractC6155lr == null || !C14113y2.m67363du(abstractC6155lr.m24910k4(), str)) {
            return;
        }
        this.f17400x1 = null;
    }

    @Override // com.aspose.slides.internal.p253lm.InterfaceC6196w6
    /* JADX INFO: renamed from: k4 */
    public final boolean mo24766k4(String str, AbstractC6155lr[] abstractC6155lrArr) {
        AbstractC6155lr abstractC6155lr = this.f17400x1;
        if (abstractC6155lr != null && C14113y2.m67363du(abstractC6155lr.m24910k4(), str)) {
            abstractC6155lrArr[0] = this.f17400x1;
            return true;
        }
        boolean zMo24766k4 = this.f17399k4.mo24766k4(str, abstractC6155lrArr);
        if (zMo24766k4) {
            this.f17400x1 = abstractC6155lrArr[0];
        }
        return zMo24766k4;
    }
}
