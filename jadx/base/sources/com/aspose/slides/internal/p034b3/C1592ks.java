package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p145g8.C4226k4;
import com.aspose.slides.internal.p513xw.C12737w6;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.ks */
/* JADX INFO: loaded from: classes3.dex */
public class C1592ks extends AbstractC1590k4 implements InterfaceC1599u4 {

    /* JADX INFO: renamed from: kk */
    private String[] f6167kk;

    /* JADX INFO: renamed from: to */
    private C12737w6 f6168to;

    /* JADX INFO: renamed from: x1 */
    private String f6169x1;

    public C1592ks(C4226k4 c4226k4) {
        this(c4226k4.m17024m9());
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1588ix
    /* JADX INFO: renamed from: du */
    public String mo8576du() {
        return "Destination";
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: k4 */
    public final void mo8590k4(String str, List<C12737w6> list) {
        this.f6168to = list.get_Item(0);
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: kk */
    public final boolean mo8591kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: to */
    public final String[] mo8592to() {
        return this.f6167kk;
    }

    public C1592ks(String str) {
        this.f6168to = null;
        this.f6169x1 = str;
        this.f6167kk = new String[]{str};
    }
}
