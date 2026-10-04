package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.y4 */
/* JADX INFO: loaded from: classes.dex */
public class C5763y4 extends AbstractC5728qw {

    /* JADX INFO: renamed from: k4 */
    protected AbstractC10925du f15818k4;

    public C5763y4() {
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
        return 1;
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
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        return abstractC10925du;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        return this.f15818k4;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        if (this.f38011kk != 0) {
            return null;
        }
        this.f38011kk = 1;
        return this.f15818k4;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f38011kk;
    }

    public C5763y4(C5763y4 c5763y4) {
        super(c5763y4);
        this.f15818k4 = c5763y4.f15818k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5763y4(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        this.f15818k4 = abstractC10929m9.mo21834kk();
        this.f38011kk = 0;
        return this;
    }
}
