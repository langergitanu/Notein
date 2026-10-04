package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.zm */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5772zm extends AbstractC5728qw {

    /* JADX INFO: renamed from: k4 */
    public AbstractC5728qw f15840k4;

    /* JADX INFO: renamed from: x1 */
    protected List<AbstractC10925du> f15841x1;

    public AbstractC5772zm(AbstractC5728qw abstractC5728qw) {
        this.f15840k4 = abstractC5728qw;
        this.f15841x1 = new List<>();
        this.f38011kk = 0;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f38011kk = 0;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: du */
    public int mo23139du() {
        return this.f15841x1.size();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: dy */
    public int mo23151dy() {
        return 23;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        return 3;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        this.f15841x1.clear();
        this.f38011kk = 0;
        return this.f15840k4.mo23148k4(abstractC10929m9);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        int i = this.f38011kk;
        if (i == 0) {
            return null;
        }
        return this.f15841x1.get_Item(i - 1);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        if (this.f38011kk >= this.f15841x1.size()) {
            return null;
        }
        List<AbstractC10925du> list = this.f15841x1;
        int i = this.f38011kk;
        this.f38011kk = i + 1;
        return list.get_Item(i);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f38011kk;
    }

    public AbstractC5772zm(AbstractC5772zm abstractC5772zm) {
        super(abstractC5772zm);
        this.f15840k4 = AbstractC5728qw.m23314k4(abstractC5772zm.f15840k4);
        this.f15841x1 = new List<>(abstractC5772zm.f15841x1);
        this.f38011kk = abstractC5772zm.f38011kk;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        this.f15840k4.mo23149k4(abstractC7201m9);
    }
}
