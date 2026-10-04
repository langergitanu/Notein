package com.aspose.slides.internal.p159h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.ca */
/* JADX INFO: loaded from: classes.dex */
public final class C4437ca {

    /* JADX INFO: renamed from: k4 */
    private List<C4463ri> f12191k4 = new List<>();

    /* JADX INFO: renamed from: k4 */
    public final int m18116k4() {
        return this.f12191k4.size();
    }

    /* JADX INFO: renamed from: kk */
    public final int m18122kk(C4463ri c4463ri) {
        return this.f12191k4.indexOf(c4463ri);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m18124x1() {
        return this.f12191k4.getCapacity();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18117k4(int i) {
        this.f12191k4.setCapacity(i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m18123kk() {
        this.f12191k4.clear();
    }

    /* JADX INFO: renamed from: x1 */
    public final C4463ri m18125x1(int i) {
        return this.f12191k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18118k4(int i, C4463ri c4463ri) {
        this.f12191k4.insertItem(i, c4463ri);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m18126x1(C4463ri c4463ri) {
        this.f12191k4.removeItem(c4463ri);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18119k4(IGenericEnumerable<C4463ri> iGenericEnumerable) {
        this.f12191k4.addRange(iGenericEnumerable);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18120k4(C4437ca c4437ca) {
        for (int i = 0; i < c4437ca.m18116k4(); i++) {
            this.f12191k4.addItem(c4437ca.m18125x1(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18121k4(C4463ri c4463ri) {
        this.f12191k4.addItem(c4463ri);
    }
}
