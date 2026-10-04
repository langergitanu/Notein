package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.dy */
/* JADX INFO: loaded from: classes.dex */
public class C5692dy extends AbstractC10929m9 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC10929m9 f15703k4;

    /* JADX INFO: renamed from: to */
    private int f15704to;

    /* JADX INFO: renamed from: x1 */
    private String f15705x1;

    private C5692dy(C5692dy c5692dy) {
        this.f15704to = 0;
        this.f15703k4 = c5692dy.f15703k4.deepClone();
        this.f15705x1 = c5692dy.f15705x1;
        this.f15704to = c5692dy.f15704to;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5692dy(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        return this.f15703k4.mo21834kk();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        return this.f15704to;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        while (this.f15703k4.mo21770x1()) {
            if (C14113y2.m67363du(this.f15703k4.mo21834kk().mo21867to(), this.f15705x1)) {
                this.f15704to++;
                return true;
            }
        }
        return false;
    }

    public C5692dy(AbstractC10929m9 abstractC10929m9, String str) {
        this.f15704to = 0;
        this.f15703k4 = abstractC10929m9;
        this.f15705x1 = str;
    }
}
