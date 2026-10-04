package com.aspose.slides.internal.p118ex;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.up */
/* JADX INFO: loaded from: classes.dex */
public final class C3830up implements ICollection, IEnumerable {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f10442k4 = new ArrayList();

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f10442k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this.f10442k4.getSyncRoot();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return this.f10442k4.isSynchronized();
    }

    /* JADX INFO: renamed from: k4 */
    public C3816fa m15351k4(int i) {
        return (C3816fa) this.f10442k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f10442k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public void m15354x1() {
        this.f10442k4.clear();
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3835yj iterator() {
        return new C3835yj(this.f10442k4);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m15355x1(C3823m9 c3823m9) {
        for (int i = 0; i < this.f10442k4.size(); i++) {
            if (c3823m9.m15288k4(((C3816fa) C7019kk.m27452k4(this.f10442k4.get_Item(i), C3816fa.class)).m15270k4())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public void m15353k4(C3823m9 c3823m9) {
        this.f10442k4.addItem(new C3816fa(c3823m9));
    }
}
