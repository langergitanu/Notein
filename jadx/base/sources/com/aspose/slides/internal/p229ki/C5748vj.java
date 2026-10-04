package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.vj */
/* JADX INFO: loaded from: classes.dex */
public class C5748vj extends AbstractC5679b1 {
    public C5748vj(AbstractC5728qw abstractC5728qw, String str, String str2, int i) {
        super(abstractC5728qw, str, str2, i);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5679b1, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: dy */
    public int mo23151dy() {
        return super.mo23151dy() | 8;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5748vj(this);
    }

    public C5748vj(C5748vj c5748vj) {
        super(c5748vj);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5679b1, com.aspose.slides.internal.p229ki.AbstractC5768yn, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        super.mo23148k4(abstractC10929m9);
        List<AbstractC10925du> list = new List<>();
        Stack stack = new Stack();
        while (true) {
            AbstractC10925du abstractC10925duMo23142m9 = this.f15829k4.mo23142m9();
            this.f15832x1 = abstractC10925duMo23142m9;
            if (abstractC10925duMo23142m9 == null) {
                break;
            }
            stack.push(abstractC10925duMo23142m9.deepClone());
        }
        while (stack.size() != 0) {
            AbstractC10925du abstractC10925du = (AbstractC10925du) stack.pop();
            if (abstractC10925du.mo21857kk() != 2 && abstractC10925du.mo21857kk() != 3 && m23352k4(abstractC10925du, list)) {
                AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
                if (abstractC10925duDeepClone.mo21864ne()) {
                    abstractC10925duDeepClone.mo21878x6();
                    while (true) {
                        if (abstractC10925duDeepClone.mo21876x1(abstractC10925du)) {
                            break;
                        }
                        if (mo23355x1(abstractC10925duDeepClone)) {
                            m23319k4(((AbstractC5679b1) this).f15687du, abstractC10925duDeepClone);
                        }
                        if (!abstractC10925duDeepClone.mo21865rv()) {
                            C6005k4.m24259k4("We managed to miss sentinel node (input)");
                            break;
                        }
                    }
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m23352k4(AbstractC10925du abstractC10925du, List<AbstractC10925du> list) {
        AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
        abstractC10925duDeepClone.mo21864ne();
        for (int i = 0; i < list.size(); i++) {
            if (abstractC10925duDeepClone.mo21876x1(list.get_Item(i))) {
                return false;
            }
        }
        list.addItem(abstractC10925duDeepClone);
        return true;
    }
}
