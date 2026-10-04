package com.aspose.slides.internal.p229ki;

import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.internal.p418tf.InterfaceC10927k4;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.af */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5675af extends AbstractC5728qw {

    /* JADX INFO: renamed from: du */
    private AbstractC5706j2 f15677du;

    /* JADX INFO: renamed from: k4 */
    protected String f15678k4;

    /* JADX INFO: renamed from: to */
    protected AbstractC7201m9 f15679to;

    /* JADX INFO: renamed from: x1 */
    protected String f15680x1;

    public AbstractC5675af(AbstractC5675af abstractC5675af) {
        super(abstractC5675af);
        this.f15678k4 = abstractC5675af.f15678k4;
        this.f15680x1 = abstractC5675af.f15680x1;
        this.f15679to = abstractC5675af.f15679to;
        this.f15677du = (AbstractC5706j2) AbstractC5728qw.m23316x1(abstractC5675af.f15677du);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2
    /* JADX INFO: renamed from: c5 */
    public void mo23138c5() {
        AbstractC5706j2 abstractC5706j2 = this.f15677du;
        if (abstractC5706j2 != null) {
            abstractC5706j2.mo23138c5();
        }
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: du */
    public int mo23139du() {
        AbstractC5706j2 abstractC5706j2 = this.f15677du;
        if (abstractC5706j2 == null) {
            return 1;
        }
        return abstractC5706j2.mo23139du();
    }

    /* JADX INFO: renamed from: fa */
    public final String m23140fa() {
        return this.f15678k4.length() != 0 ? C14113y2.m67408k4(this.f15678k4, C18241k5.f55433h, this.f15680x1) : this.f15680x1;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        return 5;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: kk */
    public AbstractC10925du mo21834kk() {
        AbstractC5706j2 abstractC5706j2 = this.f15677du;
        if (abstractC5706j2 == null) {
            throw XPathException.create("Expression must evaluate to a node-set.");
        }
        if (abstractC5706j2.mo21835to() == 0) {
            mo23142m9();
        }
        return this.f15677du.mo21834kk();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: m9 */
    public AbstractC10925du mo23142m9() {
        AbstractC5706j2 abstractC5706j2 = this.f15677du;
        if (abstractC5706j2 == null) {
            throw XPathException.create("Expression must evaluate to a node-set.");
        }
        if (abstractC5706j2.mo21770x1()) {
            return this.f15677du.mo21834kk();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5706j2, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: to */
    public int mo21835to() {
        AbstractC5706j2 abstractC5706j2 = this.f15677du;
        if (abstractC5706j2 != null) {
            return abstractC5706j2.mo21835to();
        }
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final Object m23143x1(Object obj) {
        Object obj2;
        int i;
        double dFloatValue;
        int iIntValue;
        long jLongValue;
        AbstractC5706j2 c5709jw;
        if (C7019kk.m27469x1(obj, String.class) || C7019kk.m27469x1(obj, Double.class) || C7019kk.m27469x1(obj, Boolean.class) || C7019kk.m27469x1(obj, AbstractC10925du.class)) {
            return obj;
        }
        if (!C7019kk.m27469x1(obj, Integer.class)) {
            if (obj == null) {
                c5709jw = C5722nv.f15764k4;
            } else {
                AbstractC5706j2 abstractC5706j2 = (AbstractC5706j2) C7019kk.m27452k4(obj, AbstractC5706j2.class);
                if (abstractC5706j2 != null) {
                    c5709jw = (AbstractC5706j2) abstractC5706j2.deepClone();
                } else {
                    AbstractC10929m9 abstractC10929m9 = (AbstractC10929m9) C7019kk.m27452k4(obj, AbstractC10929m9.class);
                    if (abstractC10929m9 != null) {
                        c5709jw = new C5709jw(abstractC10929m9);
                    } else {
                        InterfaceC10927k4 interfaceC10927k4 = (InterfaceC10927k4) C7019kk.m27452k4(obj, InterfaceC10927k4.class);
                        if (interfaceC10927k4 != null) {
                            return interfaceC10927k4.createNavigator();
                        }
                        if (!C7019kk.m27469x1(obj, Short.class)) {
                            if (C7019kk.m27469x1(obj, Long.class)) {
                                jLongValue = ((Long) obj).longValue();
                            } else if (C7019kk.m27469x1(obj, Long.class)) {
                                jLongValue = ((Long) obj).longValue() & 4294967295L;
                            } else {
                                if (!C7019kk.m27469x1(obj, Integer.class)) {
                                    if (C7019kk.m27469x1(obj, Long.class)) {
                                        obj2 = (Long) obj;
                                        i = 12;
                                    } else {
                                        if (C7019kk.m27469x1(obj, Float.class)) {
                                            dFloatValue = ((Float) obj).floatValue();
                                            return Double.valueOf(dFloatValue);
                                        }
                                        if (!C7019kk.m27469x1(obj, C14046bv.class)) {
                                            return obj.toString();
                                        }
                                        obj2 = (C14046bv) obj;
                                        i = 15;
                                    }
                                    dFloatValue = C7019kk.m27433c5(obj2, i);
                                    return Double.valueOf(dFloatValue);
                                }
                                iIntValue = ((Integer) obj).intValue() & 65535;
                            }
                            dFloatValue = jLongValue;
                            return Double.valueOf(dFloatValue);
                        }
                        iIntValue = ((Short) obj).shortValue();
                    }
                }
            }
            this.f15677du = c5709jw;
            return this;
        }
        iIntValue = ((Integer) obj).intValue();
        dFloatValue = iIntValue;
        return Double.valueOf(dFloatValue);
    }

    public AbstractC5675af(String str, String str2) {
        this.f15678k4 = str;
        this.f15680x1 = str2;
    }
}
