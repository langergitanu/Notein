package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.na */
/* JADX INFO: loaded from: classes.dex */
public class C5720na extends AbstractC5706j2 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC10925du f15762k4;

    /* JADX INFO: renamed from: x1 */
    private int f15763x1;

    public C5720na(C5720na c5720na) {
        this.f15762k4 = c5720na.f15762k4.deepClone();
        this.f15763x1 = c5720na.f15763x1;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15763x1 = 0;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: du */
    public int mo23139du() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5720na(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        return this.f15762k4;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f15763x1;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        if (this.f15763x1 != 0) {
            return false;
        }
        this.f15763x1 = 1;
        return true;
    }

    public C5720na(AbstractC10925du abstractC10925du) {
        this.f15762k4 = abstractC10925du;
    }

    public C5720na(AbstractC10925du abstractC10925du, boolean z) {
        this(abstractC10925du);
        if (z) {
            this.f15763x1 = 1;
        }
    }
}
