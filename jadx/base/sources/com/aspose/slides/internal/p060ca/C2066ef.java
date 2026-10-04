package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p060ca.AbstractC2320ug;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ef */
/* JADX INFO: loaded from: classes3.dex */
public class C2066ef<LookupPart extends AbstractC2320ug> extends AbstractC2282s0 {

    /* JADX INFO: renamed from: kk */
    private List<LookupPart> f7145kk;

    /* JADX INFO: renamed from: x1 */
    private Class<LookupPart> f7146x1;

    public C2066ef(Class<LookupPart> cls, long j) {
        super(j);
        this.f7146x1 = cls;
        this.f7145kk = new List<>();
    }

    /* JADX INFO: renamed from: x1 */
    private LookupPart m10460x1() {
        try {
            return this.f7146x1.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final LookupPart m10461k4(int i) {
        return this.f7145kk.get_Item(i);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        List<Integer> listM11354x1 = AbstractC2282s0.m11354x1(c2212n9);
        for (int i = 0; i < listM11354x1.size(); i++) {
            AbstractC2320ug abstractC2320ugM10460x1 = m10460x1();
            abstractC2320ugM10460x1.m11483k4(((this.f7845k4 & 4294967295L) + ((long) (listM11354x1.get_Item(i).intValue() & 65535))) & 4294967295L, c2212n9);
            this.f7145kk.addItem((LookupPart) abstractC2320ugM10460x1);
        }
    }
}
