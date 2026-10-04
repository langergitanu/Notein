package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.CollectionBase;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.be */
/* JADX INFO: loaded from: classes5.dex */
public class C12908be extends CollectionBase {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13018hl f43437k4;

    /* JADX INFO: renamed from: k4 */
    public final int m60092k4(AbstractC13018hl abstractC13018hl) {
        return getInnerList().addItem(abstractC13018hl);
    }

    @Override // com.aspose.slides.Collections.CollectionBase
    public void onClear() {
        AbstractC13018hl abstractC13018hl = this.f43437k4;
        if (abstractC13018hl != null) {
            abstractC13018hl.m60689to(this);
        }
    }

    @Override // com.aspose.slides.Collections.CollectionBase
    public void onInsert(int i, Object obj) {
        AbstractC13018hl abstractC13018hl = this.f43437k4;
        if (abstractC13018hl != null) {
            abstractC13018hl.m60683k4(this, obj);
        }
    }

    @Override // com.aspose.slides.Collections.CollectionBase
    public void onRemove(int i, Object obj) {
        AbstractC13018hl abstractC13018hl = this.f43437k4;
        if (abstractC13018hl != null) {
            abstractC13018hl.m60692x1(this, obj);
        }
    }

    @Override // com.aspose.slides.Collections.CollectionBase
    public void onSet(int i, Object obj, Object obj2) {
        AbstractC13018hl abstractC13018hl = this.f43437k4;
        if (abstractC13018hl != null) {
            abstractC13018hl.m60692x1(this, obj);
            this.f43437k4.m60683k4(this, obj2);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C12908be m60096x1() {
        C12908be c12908be = new C12908be();
        c12908be.m60091k4(this);
        return c12908be;
    }

    @Override // com.aspose.slides.Collections.CollectionBase, java.lang.Iterable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final C13017hj iterator() {
        return new C13017hj(getInnerList().iterator());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m60097x1(AbstractC13018hl abstractC13018hl) {
        getInnerList().removeItem(abstractC13018hl);
    }

    @Override // com.aspose.slides.Collections.CollectionBase, com.aspose.slides.Collections.IList
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public AbstractC13018hl get_Item(int i) {
        return (AbstractC13018hl) getInnerList().get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m60095k4(int i, AbstractC13018hl abstractC13018hl) {
        getInnerList().set_Item(i, abstractC13018hl);
    }

    /* JADX INFO: renamed from: k4 */
    private void m60091k4(C12908be c12908be) {
        getInnerList().insertRange(0, c12908be);
    }
}
