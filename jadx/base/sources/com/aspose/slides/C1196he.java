package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.he */
/* JADX INFO: loaded from: classes3.dex */
class C1196he implements InterfaceC0782az {

    /* JADX INFO: renamed from: k4 */
    private static final IGenericDictionary<Integer, String> f5480k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC0782az f5481kk;

    /* JADX INFO: renamed from: to */
    private final InterfaceC0782az f5482to;

    /* JADX INFO: renamed from: x1 */
    private final int f5483x1;

    static {
        Dictionary dictionary = new Dictionary();
        f5480k4 = dictionary;
        dictionary.addItem(0, "+");
        dictionary.addItem(1, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
        dictionary.addItem(2, C18358t1.g.f56183c);
        dictionary.addItem(3, "/");
        dictionary.addItem(4, "^");
    }

    public C1196he(int i, InterfaceC0782az interfaceC0782az, InterfaceC0782az interfaceC0782az2) {
        this.f5483x1 = i;
        this.f5481kk = interfaceC0782az;
        this.f5482to = interfaceC0782az2;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m7103k4() {
        return this.f5483x1;
    }

    /* JADX INFO: renamed from: kk */
    public final InterfaceC0782az m7104kk() {
        return this.f5482to;
    }

    public String toString() {
        return C14113y2.m67402k4("{0} {1} {2}", m7105x1(), f5480k4.get_Item(Integer.valueOf(m7103k4())), m7104kk());
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC0782az m7105x1() {
        return this.f5481kk;
    }

    @Override // com.aspose.slides.InterfaceC0782az
    /* JADX INFO: renamed from: k4 */
    public final mtk mo3871k4(C1095fc c1095fc) {
        double dM67725kk = m7105x1().mo3871k4(c1095fc).Clone().m67725kk(c1095fc);
        double dM67725kk2 = m7104kk().mo3871k4(c1095fc).Clone().m67725kk(c1095fc);
        int iM7103k4 = m7103k4();
        if (iM7103k4 == 0) {
            return new mtk(dM67725kk + dM67725kk2);
        }
        if (iM7103k4 == 1) {
            return new mtk(dM67725kk - dM67725kk2);
        }
        if (iM7103k4 == 2) {
            return new mtk(dM67725kk * dM67725kk2);
        }
        if (iM7103k4 == 3) {
            if (dM67725kk2 != 0.0d) {
                return new mtk(dM67725kk / dM67725kk2);
            }
            throw new mdp("#DIV/0!");
        }
        if (iM7103k4 != 4) {
            throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown binary operator '{0}' is encountered.", C14042ak.m66410k4(C13704jw.class, m7103k4())));
        }
        if (dM67725kk == 0.0d && dM67725kk2 == 0.0d) {
            throw new mdp("#NUM!");
        }
        return new mtk(C14116yg.m67469du(dM67725kk, dM67725kk2));
    }

    @Override // com.aspose.slides.InterfaceC0782az
    /* JADX INFO: renamed from: k4 */
    public final String mo3872k4(C0909dp c0909dp) {
        return C14113y2.m67402k4("{0} {1} {2}", m7105x1().mo3872k4(c0909dp), f5480k4.get_Item(Integer.valueOf(m7103k4())), m7104kk().mo3872k4(c0909dp));
    }
}
