package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13968ri;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.jw */
/* JADX INFO: loaded from: classes.dex */
public class C5709jw extends AbstractC5706j2 {

    /* JADX INFO: renamed from: k4 */
    protected ArrayList f15745k4;

    /* JADX INFO: renamed from: x1 */
    protected int f15746x1;

    public C5709jw(ArrayList arrayList) {
        this.f15745k4 = arrayList;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15746x1 = 0;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: du */
    public int mo23139du() {
        return this.f15745k4.size();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, java.lang.Iterable
    public IEnumerator iterator() {
        return this.f15745k4.iterator();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5709jw(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        int i = this.f15746x1;
        if (i >= 1) {
            return (AbstractC10925du) this.f15745k4.get_Item(i - 1);
        }
        throw new InvalidOperationException(C13968ri.m65819k4("Enumeration has not started. Call MoveNext.", C14113y2.f47374k4));
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f15746x1;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        if (this.f15746x1 == this.f15745k4.size()) {
            return false;
        }
        this.f15746x1++;
        return true;
    }

    public C5709jw(C5709jw c5709jw) {
        this.f15745k4 = c5709jw.f15745k4;
        this.f15746x1 = c5709jw.f15746x1;
    }

    public C5709jw(AbstractC10929m9 abstractC10929m9) {
        this.f15745k4 = new ArrayList();
        while (abstractC10929m9.mo21770x1()) {
            this.f15745k4.addItem(abstractC10929m9.mo21834kk().deepClone());
        }
    }
}
