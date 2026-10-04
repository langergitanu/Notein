package com.aspose.slides.internal.p229ki;

import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p331p6.InterfaceC7199k4;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.to */
/* JADX INFO: loaded from: classes.dex */
public final class C5737to extends AbstractC5675af {

    /* JADX INFO: renamed from: du */
    private AbstractC5728qw[] f15778du;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC7199k4 f15779h4;

    private C5737to(C5737to c5737to) {
        super(c5737to);
        this.f15779h4 = c5737to.f15779h4;
        this.f15778du = new AbstractC5728qw[c5737to.f15778du.length];
        int i = 0;
        while (true) {
            AbstractC5728qw[] abstractC5728qwArr = c5737to.f15778du;
            if (i >= abstractC5728qwArr.length) {
                return;
            }
            this.f15778du[i] = AbstractC5728qw.m23314k4(abstractC5728qwArr[i]);
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5675af, com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        InterfaceC7199k4 interfaceC7199k4 = this.f15779h4;
        int iMo27859kk = interfaceC7199k4 != null ? interfaceC7199k4.mo27859kk() : 5;
        if (iMo27859kk == 6) {
            return 5;
        }
        return iMo27859kk;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        AbstractC10925du abstractC10925duMo23142m9;
        if (!"key".equals(this.f15680x1) && this.f15678k4.length() != 0) {
            throw XPathException.create("'{0}' is an invalid XSLT pattern.");
        }
        mo23148k4((AbstractC10929m9) new C5720na(abstractC10925du, true));
        do {
            abstractC10925duMo23142m9 = mo23142m9();
            if (abstractC10925duMo23142m9 == null) {
                break;
            }
        } while (!abstractC10925duMo23142m9.mo21876x1(abstractC10925du));
        return abstractC10925duMo23142m9;
    }

    public C5737to(String str, String str2, AbstractC5728qw[] abstractC5728qwArr) {
        super(str, str2);
        this.f15778du = abstractC5728qwArr;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5737to(this);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        if (this.f15679to == null) {
            throw XPathException.create("Namespace Manager or XsltContext needed. This query has a prefix, variable, or user-defined function.");
        }
        Object[] objArr = new Object[this.f15778du.length];
        int i = 0;
        while (true) {
            AbstractC5728qw[] abstractC5728qwArr = this.f15778du;
            if (i >= abstractC5728qwArr.length) {
                try {
                    return m23143x1(this.f15779h4.mo27858k4(this.f15679to, objArr, abstractC10929m9.mo21834kk()));
                } catch (RuntimeException e) {
                    throw XPathException.create("Function '{0}()' has failed.", m23140fa(), e);
                }
            }
            Object objMo23148k4 = abstractC5728qwArr[i].mo23148k4(abstractC10929m9);
            objArr[i] = objMo23148k4;
            if (C7019kk.m27469x1(objMo23148k4, AbstractC10929m9.class)) {
                objArr[i] = new C5758x5(abstractC10929m9.mo21834kk(), this.f15778du[i]);
            }
            i++;
        }
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        AbstractC5728qw[] abstractC5728qwArr;
        if (abstractC7201m9 == null) {
            throw XPathException.create("Namespace Manager or XsltContext needed. This query has a prefix, variable, or user-defined function.");
        }
        if (this.f15679to != abstractC7201m9) {
            this.f15679to = abstractC7201m9;
            int i = 0;
            int i2 = 0;
            while (true) {
                abstractC5728qwArr = this.f15778du;
                if (i2 >= abstractC5728qwArr.length) {
                    break;
                }
                abstractC5728qwArr[i2].mo23149k4(abstractC7201m9);
                i2++;
            }
            int[] iArr = new int[abstractC5728qwArr.length];
            while (true) {
                AbstractC5728qw[] abstractC5728qwArr2 = this.f15778du;
                if (i >= abstractC5728qwArr2.length) {
                    break;
                }
                iArr[i] = abstractC5728qwArr2[i].mo23141h4();
                i++;
            }
            InterfaceC7199k4 interfaceC7199k4Mo23224k4 = this.f15679to.mo23224k4(this.f15678k4, this.f15680x1, iArr);
            this.f15779h4 = interfaceC7199k4Mo23224k4;
            if (interfaceC7199k4Mo23224k4 == null) {
                throw XPathException.create("The function '{0}()' is undefined.", m23140fa());
            }
        }
    }
}
