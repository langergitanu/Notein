package com.aspose.slides.internal.p333p8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.C7189m9;
import com.aspose.slides.internal.p329p4.InterfaceC7193yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.p8.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C9430m9 implements InterfaceC7193yj {

    /* JADX INFO: renamed from: k4 */
    private final C7187kk f34311k4;

    /* JADX INFO: renamed from: kk */
    private C9430m9 f34312kk;

    /* JADX INFO: renamed from: x1 */
    private C9421c5 f34313x1;

    public C9430m9() {
        C7187kk c7187kk = new C7187kk();
        this.f34311k4 = c7187kk;
        c7187kk.m27815x1(C7182dy.f19711xz, C7182dy.f19683wm);
        c7187kk.m27815x1(C7182dy.f19530mi, new C7186k4());
        c7187kk.m27815x1(C7182dy.f19552nv, C7189m9.m27821k4());
    }

    @Override // com.aspose.slides.internal.p329p4.InterfaceC7193yj
    /* JADX INFO: renamed from: c5 */
    public final C7185jd mo8461c5() {
        return this.f34311k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9430m9 m46163k4() {
        C7187kk c7187kk;
        if (this.f34312kk == null && (c7187kk = (C7187kk) this.f34311k4.m27799k4(C7182dy.f19459i2, C7182dy.f19430g6)) != null) {
            this.f34312kk = new C9430m9(c7187kk);
        }
        return this.f34312kk;
    }

    /* JADX INFO: renamed from: kk */
    public final C7187kk m46165kk() {
        return this.f34311k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C9421c5 m46166x1() {
        if (this.f34313x1 == null) {
            C7187kk c7187kk = (C7187kk) this.f34311k4.mo27768h4(C7182dy.f19624sf);
            if (c7187kk != null) {
                this.f34313x1 = new C9421c5(c7187kk);
            }
            if (this.f34313x1 == null && m46163k4() != null) {
                this.f34313x1 = m46163k4().m46166x1();
            }
        }
        return this.f34313x1;
    }

    public C9430m9(C7187kk c7187kk) {
        this.f34311k4 = c7187kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46164k4(IGenericCollection<C9426h4> iGenericCollection) {
        C6005k4.m24261k4(iGenericCollection != null);
        m46162k4(iGenericCollection, this.f34311k4, new Dictionary<>());
    }

    /* JADX INFO: renamed from: k4 */
    private void m46162k4(IGenericCollection<C9426h4> iGenericCollection, C7187kk c7187kk, Dictionary<C7185jd, Boolean> dictionary) {
        if (c7187kk == null) {
            return;
        }
        C7186k4 c7186k4 = (C7186k4) c7187kk.mo27768h4(C7182dy.f19530mi);
        if (c7186k4 == null) {
            throw new InvalidDataException("Kids object is not found in a COS dictionary of a page. A PDF file structure is not correct.");
        }
        for (int i = 0; i < c7186k4.m27778k4(); i++) {
            if (!dictionary.containsKey(c7186k4.m27785kk(i))) {
                C7185jd c7185jdM27787x1 = c7186k4.m27787x1(i);
                if (C7019kk.m27469x1(c7185jdM27787x1, C7187kk.class)) {
                    C7187kk c7187kk2 = (C7187kk) c7185jdM27787x1;
                    if (C7182dy.f19615s0.equals(c7187kk2.mo27768h4(C7182dy.f19711xz))) {
                        iGenericCollection.addItem(new C9426h4(c7187kk2));
                    } else {
                        m46162k4(iGenericCollection, c7187kk2, dictionary);
                    }
                }
                dictionary.addItem(c7186k4.m27785kk(i), Boolean.FALSE);
            }
        }
    }
}
