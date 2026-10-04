package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.xh */
/* JADX INFO: loaded from: classes3.dex */
public class C2368xh implements InterfaceC2269qx {

    /* JADX INFO: renamed from: k4 */
    private final C2161kh f8212k4;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC2320ug f8213x1;

    public C2368xh(C2161kh c2161kh, AbstractC2320ug abstractC2320ug) {
        this.f8212k4 = c2161kh;
        this.f8213x1 = abstractC2320ug;
    }

    @Override // com.aspose.slides.internal.p060ca.InterfaceC2269qx
    /* JADX INFO: renamed from: k4 */
    public final boolean mo10531k4(C2379xz c2379xz, int[] iArr) {
        C2226o4 c2226o4M10928k4;
        int iM11550kk = this.f8212k4.m10929x1().m11550kk(c2379xz.m11712k4(iArr[0]).m10719k4());
        if (iM11550kk == -1 || (c2226o4M10928k4 = this.f8212k4.m10928k4(iM11550kk)) == null || c2226o4M10928k4.m11185x1().size() != 1) {
            return false;
        }
        c2379xz.m11711k4().get_Item(iArr[0]).m10721k4(new C2334v6(c2226o4M10928k4.m11185x1().get_Item(0).intValue() & 65535));
        c2379xz.m11715k4(iArr);
        return true;
    }
}
