package com.aspose.slides.internal.p486wy;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p023ak.C1383du;
import com.aspose.slides.internal.p034b3.InterfaceC1599u4;
import com.aspose.slides.internal.p393s7.C10161to;
import com.aspose.slides.internal.p513xw.C12737w6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.client.internal.MsalUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.wy.rv */
/* JADX INFO: loaded from: classes5.dex */
public class C12322rv extends C12320ks implements InterfaceC1599u4 {

    /* JADX INFO: renamed from: ks */
    private String f41193ks;

    /* JADX INFO: renamed from: ne */
    private C10161to f41194ne;

    /* JADX INFO: renamed from: rv */
    private String f41195rv;

    /* JADX INFO: renamed from: x6 */
    private boolean f41196x6;

    /* JADX INFO: renamed from: yj */
    private boolean f41197yj;

    public C12322rv(String str, C10161to c10161to) {
        this(str, c10161to, true);
    }

    @Override // com.aspose.slides.internal.p486wy.C12320ks
    /* JADX INFO: renamed from: b3 */
    public String mo57603b3() {
        return this.f41195rv;
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: k4 */
    public final void mo8590k4(String str, List<C12737w6> list) {
        if (this.f41197yj || !C14113y2.m67363du(this.f41193ks, str) || list == null) {
            return;
        }
        this.f41197yj = true;
        C12737w6 c12737w6 = list.get_Item(this.f41196x6 ? 0 : list.size() - 1);
        m57608yd();
        String strM59338h4 = c12737w6.m59338h4();
        this.f41195rv = strM59338h4;
        m57606k4(strM59338h4, 0, m8672m9());
        C10161to c10161to = this.f41194ne;
        if (c10161to != null) {
            m57576rv(c10161to.m49977k4(this.f41195rv) - m8678x1());
            this.f41194ne = null;
        }
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: kk */
    public final boolean mo8591kk() {
        return this.f41197yj;
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: to */
    public final String[] mo8592to() {
        return new String[]{this.f41193ks};
    }

    @Override // com.aspose.slides.internal.p486wy.C12317jd, com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: x1 */
    public List<C1383du> mo57580x1(List<C1383du> list) {
        list.addItem(new C1383du(this, new int[]{m8672m9()}));
        return list;
    }

    public C12322rv(String str, C10161to c10161to, boolean z) {
        this.f41197yj = false;
        this.f41193ks = str;
        this.f41194ne = c10161to;
        this.f41195rv = MsalUtils.QUERY_STRING_SYMBOL;
        this.f41196x6 = z;
    }

    @Override // com.aspose.slides.internal.p486wy.AbstractC12318k4, com.aspose.slides.internal.p486wy.C12317jd, com.aspose.slides.internal.p486wy.C12314dy
    /* JADX INFO: renamed from: k4 */
    public boolean mo57567k4(double d, int i, int i2) {
        return true;
    }
}
