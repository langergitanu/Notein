package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.C3125bv;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: loaded from: classes3.dex */
class zk0 implements ITemplateEngine {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<String, jfy> f50586k4 = new Dictionary<>();

    @Override // com.aspose.slides.ITemplateEngine
    public final void addTemplate(String str, String str2, AbstractC14068j5 abstractC14068j5) {
    }

    @Override // com.aspose.slides.ITemplateEngine
    public final String compile(String str, Object obj) {
        jfy jfyVar;
        if (!this.f50586k4.containsKey(str) || (jfyVar = this.f50586k4.get_Item(str)) == null) {
            return "";
        }
        C3125bv c3125bv = new C3125bv();
        jfyVar.m63300k4().m73803k4((AbstractC3124b3) c3125bv);
        jfyVar.m63300k4().m73804k4(obj);
        jfyVar.m63300k4().mo6644k4();
        return c3125bv.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final <TContextObject> void m74552k4(String str, C14367qz<TContextObject> c14367qz) {
        this.f50586k4.addItem(str, new oa7(str, c14367qz));
    }
}
