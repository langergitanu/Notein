package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.y2 */
/* JADX INFO: loaded from: classes3.dex */
class C14827y2 implements InterfaceC0782az {

    /* JADX INFO: renamed from: k4 */
    private static final IGenericDictionary<Integer, String> f50244k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC0782az f50245kk;

    /* JADX INFO: renamed from: x1 */
    private final int f50246x1;

    static {
        Dictionary dictionary = new Dictionary();
        f50244k4 = dictionary;
        dictionary.addItem(1, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        dictionary.addItem(5, "%");
    }

    public C14827y2(int i, InterfaceC0782az interfaceC0782az) {
        this.f50246x1 = i;
        this.f50245kk = interfaceC0782az;
    }

    /* JADX INFO: renamed from: kk */
    private String m73679kk() {
        int iM73680k4 = m73680k4();
        if (iM73680k4 == 1) {
            return "{0}{1}";
        }
        if (iM73680k4 == 5) {
            return "{1}{0}";
        }
        throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown unary operator '{0}' is encountered.", C14042ak.m66410k4(C13704jw.class, m73680k4())));
    }

    /* JADX INFO: renamed from: k4 */
    public final int m73680k4() {
        return this.f50246x1;
    }

    public String toString() {
        return C14113y2.m67402k4(m73679kk(), f50244k4.get_Item(Integer.valueOf(m73680k4())), m73681x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC0782az m73681x1() {
        return this.f50245kk;
    }

    @Override // com.aspose.slides.InterfaceC0782az
    /* JADX INFO: renamed from: k4 */
    public final mtk mo3871k4(C1095fc c1095fc) {
        double dM67725kk = m73681x1().mo3871k4(c1095fc).Clone().m67725kk(c1095fc);
        int iM73680k4 = m73680k4();
        if (iM73680k4 == 1) {
            return new mtk(-dM67725kk);
        }
        if (iM73680k4 == 5) {
            return new mtk(dM67725kk / 100.0d);
        }
        throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown unary operator '{0}' is encountered.", C14042ak.m66410k4(C13704jw.class, m73680k4())));
    }

    @Override // com.aspose.slides.InterfaceC0782az
    /* JADX INFO: renamed from: k4 */
    public final String mo3872k4(C0909dp c0909dp) {
        return C14113y2.m67402k4(m73679kk(), f50244k4.get_Item(Integer.valueOf(m73680k4())), m73681x1().mo3872k4(c0909dp));
    }
}
