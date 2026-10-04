package com.aspose.slides.internal.p229ki;

import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p331p6.InterfaceC7203x1;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.bs */
/* JADX INFO: loaded from: classes.dex */
public final class C5681bs extends AbstractC5675af {

    /* JADX INFO: renamed from: du */
    private InterfaceC7203x1 f15688du;

    private C5681bs(C5681bs c5681bs) {
        super(c5681bs);
        this.f15688du = c5681bs.f15688du;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5675af, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        InterfaceC7203x1 interfaceC7203x1 = this.f15688du;
        if (interfaceC7203x1 != null) {
            return m23318k4(mo23148k4((AbstractC10929m9) null));
        }
        int iMo27872k4 = interfaceC7203x1 != null ? interfaceC7203x1.mo27872k4() : 5;
        if (iMo27872k4 == 6) {
            return 5;
        }
        return iMo27872k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5681bs(this);
    }

    public C5681bs(String str, String str2) {
        super(str2, str);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        AbstractC7201m9 abstractC7201m9 = this.f15679to;
        if (abstractC7201m9 != null) {
            return m23143x1(this.f15688du.mo27873k4(abstractC7201m9));
        }
        throw XPathException.create("Namespace Manager or XsltContext needed. This query has a prefix, variable, or user-defined function.");
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        if (abstractC7201m9 == null) {
            throw XPathException.create("Namespace Manager or XsltContext needed. This query has a prefix, variable, or user-defined function.");
        }
        if (this.f15679to != abstractC7201m9) {
            this.f15679to = abstractC7201m9;
            InterfaceC7203x1 interfaceC7203x1Mo23226x1 = abstractC7201m9.mo23226x1(this.f15678k4, this.f15680x1);
            this.f15688du = interfaceC7203x1Mo23226x1;
            if (interfaceC7203x1Mo23226x1 == null) {
                throw XPathException.create("The variable '{0}' is undefined.", m23140fa());
            }
        }
    }
}
