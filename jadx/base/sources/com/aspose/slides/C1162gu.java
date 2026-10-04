package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.gu */
/* JADX INFO: loaded from: classes3.dex */
final class C1162gu extends DomObject<Chart> {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<Integer, C14197nq> f5345k4;

    public C1162gu(Chart chart) {
        super(chart);
    }

    /* JADX INFO: renamed from: k4 */
    public final com.aspose.slides.Collections.Generic.IGenericCollection<C14197nq> m6905k4() {
        Dictionary<Integer, C14197nq> dictionary = this.f5345k4;
        if (dictionary == null) {
            return null;
        }
        return dictionary.getValues();
    }

    /* JADX INFO: renamed from: k4 */
    public final Format m6906k4(int i) {
        Dictionary<Integer, C14197nq> dictionary = this.f5345k4;
        if (dictionary == null) {
            return null;
        }
        C14197nq[] c14197nqArr = {null};
        if (dictionary.tryGetValue(Integer.valueOf(i), c14197nqArr)) {
            return c14197nqArr[0].m68175kk();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6907k4(C14197nq c14197nq) {
        if (c14197nq == null) {
            throw new ArgumentNullException("format");
        }
        if (this.f5345k4 == null) {
            this.f5345k4 = new Dictionary<>();
        }
        this.f5345k4.set_Item(Integer.valueOf(c14197nq.m68171k4()), c14197nq);
    }
}
