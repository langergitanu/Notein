package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.b1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5679b1 extends AbstractC5768yn {

    /* JADX INFO: renamed from: du */
    protected List<AbstractC10925du> f15687du;

    public AbstractC5679b1(AbstractC5679b1 abstractC5679b1) {
        super((AbstractC5768yn) abstractC5679b1);
        this.f15687du = new List<>(abstractC5679b1.f15687du);
        this.f38011kk = abstractC5679b1.f38011kk;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f38011kk = 0;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: du */
    public int mo23139du() {
        return this.f15687du.size();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: dy */
    public int mo23151dy() {
        return 23;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        super.mo23148k4(abstractC10929m9);
        this.f15687du.clear();
        return this;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        int i = this.f38011kk;
        if (i == 0) {
            return null;
        }
        return this.f15687du.get_Item(i - 1);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        if (this.f38011kk >= this.f15687du.size()) {
            return null;
        }
        List<AbstractC10925du> list = this.f15687du;
        int i = this.f38011kk;
        this.f38011kk = i + 1;
        return list.get_Item(i);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f38011kk;
    }

    public AbstractC5679b1(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
        this.f15687du = new List<>();
        this.f38011kk = 0;
    }
}
