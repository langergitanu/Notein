package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.x5 */
/* JADX INFO: loaded from: classes.dex */
public class C5758x5 extends AbstractC5706j2 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC10925du f15808k4;

    /* JADX INFO: renamed from: to */
    private int f15809to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5728qw f15810x1;

    public C5758x5(C5758x5 c5758x5) {
        this.f15808k4 = c5758x5.f15808k4.deepClone();
        this.f15810x1 = (AbstractC5728qw) c5758x5.f15810x1.deepClone();
        this.f15809to = c5758x5.f15809to;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        this.f15810x1.mo23138c5();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: du */
    public int mo23139du() {
        return this.f15810x1.mo23139du();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5758x5(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        return this.f15808k4;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f15809to;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        AbstractC10925du abstractC10925duMo23142m9 = this.f15810x1.mo23142m9();
        if (abstractC10925duMo23142m9 == null) {
            return false;
        }
        this.f15809to++;
        if (!this.f15808k4.mo21855k4(abstractC10925duMo23142m9)) {
            this.f15808k4 = abstractC10925duMo23142m9.deepClone();
        }
        return true;
    }

    public C5758x5(AbstractC10925du abstractC10925du, AbstractC5728qw abstractC5728qw) {
        this.f15808k4 = abstractC10925du.deepClone();
        this.f15810x1 = abstractC5728qw;
    }
}
