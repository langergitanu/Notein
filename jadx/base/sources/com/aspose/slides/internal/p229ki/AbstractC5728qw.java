package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.qw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5728qw extends AbstractC5706j2 {
    public AbstractC5728qw() {
    }

    /* JADX INFO: renamed from: k4 */
    private static int m23312k4(int i, int i2) {
        return (int) ((((((long) i) & 4294967295L) + (((long) i2) & 4294967295L)) & 4294967295L) >> 1);
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC10925du m23315kk(AbstractC10925du abstractC10925du) {
        if (abstractC10925du != null) {
            return abstractC10925du.deepClone();
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC10929m9 m23316x1(AbstractC10929m9 abstractC10929m9) {
        if (abstractC10929m9 != null) {
            return abstractC10929m9.deepClone();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: du */
    public int mo23139du() {
        if (this.f38011kk == -1) {
            AbstractC5728qw abstractC5728qw = (AbstractC5728qw) deepClone();
            abstractC5728qw.mo23138c5();
            int i = 0;
            while (true) {
                this.f38011kk = i;
                if (!abstractC5728qw.mo21770x1()) {
                    break;
                }
                i = this.f38011kk + 1;
            }
        }
        return this.f38011kk;
    }

    /* JADX INFO: renamed from: dy */
    public int mo23151dy() {
        return 16;
    }

    /* JADX INFO: renamed from: h4 */
    public abstract int mo23141h4();

    /* JADX INFO: renamed from: jd */
    public double mo23317jd() {
        return 0.5d;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract Object mo23148k4(AbstractC10929m9 abstractC10929m9);

    /* JADX INFO: renamed from: m9 */
    public abstract AbstractC10925du mo23142m9();

    public AbstractC5728qw(AbstractC5728qw abstractC5728qw) {
        super(abstractC5728qw);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m23313k4(AbstractC10925du abstractC10925du, AbstractC10925du abstractC10925du2) {
        int iMo21866to = abstractC10925du.mo21866to(abstractC10925du2);
        if (iMo21866to != 3) {
            return iMo21866to;
        }
        AbstractC10925du abstractC10925duDeepClone = abstractC10925du.deepClone();
        abstractC10925duDeepClone.mo21848ix();
        String strMo21839c5 = abstractC10925duDeepClone.mo21839c5();
        if (!abstractC10925duDeepClone.mo21855k4(abstractC10925du2)) {
            abstractC10925duDeepClone = abstractC10925du2.deepClone();
        }
        abstractC10925duDeepClone.mo21848ix();
        int iM67426m9 = C14113y2.m67426m9(strMo21839c5, abstractC10925duDeepClone.mo21839c5());
        if (iM67426m9 < 0) {
            return 0;
        }
        return iM67426m9 > 0 ? 1 : 3;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        return mo23142m9() != null;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m23318k4(Object obj) {
        if (C7019kk.m27469x1(obj, AbstractC10929m9.class)) {
            return 3;
        }
        if (C7019kk.m27469x1(obj, String.class)) {
            return 1;
        }
        if (C7019kk.m27469x1(obj, Double.class)) {
            return 0;
        }
        return C7019kk.m27469x1(obj, Boolean.class) ? 2 : 4;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC5728qw m23314k4(AbstractC5728qw abstractC5728qw) {
        if (abstractC5728qw != null) {
            return (AbstractC5728qw) abstractC5728qw.deepClone();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du mo23147k4(AbstractC10925du abstractC10925du) {
        throw XPathException.create("'{0}' is an invalid XSLT pattern.");
    }

    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m23319k4(List<AbstractC10925du> list, AbstractC10925du abstractC10925du) {
        int size = list.size();
        if (size != 0) {
            int iM23313k4 = m23313k4(list.get_Item(size - 1), abstractC10925du);
            if (iM23313k4 == 0) {
                list.addItem(abstractC10925du.deepClone());
                return true;
            }
            if (iM23313k4 == 2) {
                return false;
            }
            size--;
        }
        int i = 0;
        while (i < size) {
            int iM23312k4 = m23312k4(i, size);
            int iM23313k42 = m23313k4(list.get_Item(iM23312k4), abstractC10925du);
            if (iM23313k42 == 0) {
                i = iM23312k4 + 1;
            } else {
                if (iM23313k42 == 2) {
                    return false;
                }
                size = iM23312k4;
            }
        }
        list.insertItem(i, abstractC10925du.deepClone());
        return true;
    }
}
