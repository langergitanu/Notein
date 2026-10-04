package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.jj */
/* JADX INFO: loaded from: classes3.dex */
class C13688jj {

    /* JADX INFO: renamed from: k4 */
    private C14317pv f45494k4;

    /* JADX INFO: renamed from: x1 */
    private Dictionary<String, C0757ao> f45495x1;

    public C13688jj(C14317pv c14317pv) {
        this.f45495x1 = null;
        this.f45494k4 = c14317pv;
        this.f45495x1 = new Dictionary<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C0757ao m63338k4(C14744wn c14744wn) {
        if (c14744wn == null) {
            return null;
        }
        String strM67440x1 = C14113y2.m67440x1(c14744wn.m72835k4());
        if (this.f45495x1.containsKey(strM67440x1)) {
            return this.f45495x1.get_Item(strM67440x1);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C0757ao m63339k4(String str) {
        return m63338k4(this.f45494k4.m69260k4(str));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63340k4(C0757ao c0757ao) {
        if (c0757ao == null) {
            throw new ArgumentNullException("sourceFontConformityRule", "The source rule for adding doesn't specified!");
        }
        this.f45494k4.m69262k4(c0757ao);
        String strM67440x1 = C14113y2.m67440x1(c0757ao.m3681k4());
        if (this.f45495x1.containsKey(strM67440x1)) {
            this.f45495x1.get_Item(strM67440x1).m3682k4(c0757ao, true);
        } else {
            this.f45495x1.addItem(strM67440x1, c0757ao);
        }
    }
}
