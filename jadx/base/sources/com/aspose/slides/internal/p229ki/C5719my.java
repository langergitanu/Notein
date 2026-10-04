package com.aspose.slides.internal.p229ki;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.my */
/* JADX INFO: loaded from: classes.dex */
public final class C5719my extends AbstractC5729ri {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5728qw f15760k4;

    /* JADX INFO: renamed from: x1 */
    private int f15761x1;

    public C5719my(int i, AbstractC5728qw abstractC5728qw) {
        this.f15760k4 = abstractC5728qw;
        this.f15761x1 = i;
    }

    /* JADX INFO: renamed from: du */
    private boolean m23307du(AbstractC10929m9 abstractC10929m9) {
        String string = this.f15760k4.mo23148k4(abstractC10929m9).toString();
        String strMo52687ck = abstractC10929m9.mo21834kk().mo52687ck();
        if (C14113y2.m67412k4(strMo52687ck, string, (short) 5)) {
            return strMo52687ck.length() == string.length() || strMo52687ck.charAt(string.length()) == '-';
        }
        return false;
    }

    /* JADX INFO: renamed from: to */
    private boolean m23310to(AbstractC10929m9 abstractC10929m9) {
        return !((Boolean) C7019kk.m27464to(this.f15760k4.mo23148k4(abstractC10929m9), Boolean.TYPE)).booleanValue();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5719my(this);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m23311kk(AbstractC10929m9 abstractC10929m9) {
        Object objMo23148k4 = this.f15760k4.mo23148k4(abstractC10929m9);
        if (C7019kk.m27469x1(objMo23148k4, AbstractC10929m9.class)) {
            return this.f15760k4.mo23142m9() != null;
        }
        if (C7019kk.m27469x1(objMo23148k4, String.class)) {
            return m23309k4((String) objMo23148k4);
        }
        if (C7019kk.m27469x1(objMo23148k4, Double.class)) {
            return m23308k4(((Double) C7019kk.m27464to(objMo23148k4, Double.TYPE)).doubleValue());
        }
        if (C7019kk.m27469x1(objMo23148k4, Boolean.class)) {
            return ((Boolean) C7019kk.m27464to(objMo23148k4, Boolean.TYPE)).booleanValue();
        }
        return true;
    }

    private C5719my(C5719my c5719my) {
        super(c5719my);
        this.f15760k4 = AbstractC5728qw.m23314k4(c5719my.f15760k4);
        this.f15761x1 = c5719my.f15761x1;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        boolean zM23311kk;
        int i = this.f15761x1;
        if (i == 8) {
            zM23311kk = m23311kk(abstractC10929m9);
        } else if (i != 22) {
            switch (i) {
                case 10:
                    return Boolean.TRUE;
                case 11:
                    return Boolean.FALSE;
                case 12:
                    zM23311kk = m23310to(abstractC10929m9);
                    break;
                default:
                    return Boolean.FALSE;
            }
        } else {
            zM23311kk = m23307du(abstractC10929m9);
        }
        return Boolean.valueOf(zM23311kk);
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        AbstractC5728qw abstractC5728qw = this.f15760k4;
        if (abstractC5728qw != null) {
            abstractC5728qw.mo23149k4(abstractC7201m9);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m23308k4(double d) {
        return (d == 0.0d || C14044b3.m66437kk(d)) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m23309k4(String str) {
        return str.length() > 0;
    }
}
