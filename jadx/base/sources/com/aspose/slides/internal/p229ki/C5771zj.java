package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p331p6.AbstractC7201m9;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11690k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C14022y4;
import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.zj */
/* JADX INFO: loaded from: classes.dex */
public final class C5771zj extends AbstractC5729ri {

    /* JADX INFO: renamed from: to */
    private static final C11690k4 f15837to = C11697x1.m55250kk().m55271up();

    /* JADX INFO: renamed from: k4 */
    private int f15838k4;

    /* JADX INFO: renamed from: x1 */
    private IGenericList<AbstractC5728qw> f15839x1;

    public C5771zj(int i, IGenericList<AbstractC5728qw> iGenericList) {
        this.f15838k4 = i;
        this.f15839x1 = iGenericList;
    }

    /* JADX INFO: renamed from: c5 */
    private String m23371c5(AbstractC10929m9 abstractC10929m9) {
        String string = this.f15839x1.get_Item(0).mo23148k4(abstractC10929m9).toString();
        double dM65135x1 = C13850af.m65135x1(C13850af.m65076k4(this.f15839x1.get_Item(1).mo23148k4(abstractC10929m9))) - 1.0d;
        if (C14044b3.m66437kk(dM65135x1) || string.length() <= dM65135x1) {
            return C14113y2.f47374k4;
        }
        if (this.f15839x1.size() != 3) {
            if (dM65135x1 < 0.0d) {
                dM65135x1 = 0.0d;
            }
            return C14113y2.m67422kk(string, C7019kk.m27462to(Double.valueOf(dM65135x1), 14));
        }
        double dM65135x12 = C13850af.m65135x1(C13850af.m65076k4(this.f15839x1.get_Item(2).mo23148k4(abstractC10929m9)));
        if (C14044b3.m66437kk(dM65135x12)) {
            return C14113y2.f47374k4;
        }
        if (dM65135x1 < 0.0d || dM65135x12 < 0.0d) {
            dM65135x12 += dM65135x1;
            if (dM65135x12 <= 0.0d) {
                return C14113y2.f47374k4;
            }
            dM65135x1 = 0.0d;
        }
        double length = ((double) string.length()) - dM65135x1;
        if (dM65135x12 > length) {
            dM65135x12 = length;
        }
        return C14113y2.m67443x1(string, C7019kk.m27462to(Double.valueOf(dM65135x1), 14), C7019kk.m27462to(Double.valueOf(dM65135x12), 14));
    }

    /* JADX INFO: renamed from: ck */
    private String m23372ck(AbstractC10929m9 abstractC10929m9) {
        String strM65066ar = C13850af.m65066ar(this.f15839x1.size() > 0 ? this.f15839x1.get_Item(0).mo23148k4(abstractC10929m9).toString() : abstractC10929m9.mo21834kk().mo21843dy());
        C6765kp c6765kp = new C6765kp();
        C14022y4 c14022y4Clone = C14022y4.m66318k4().Clone();
        boolean z = true;
        for (int i = 0; i < strM65066ar.length(); i++) {
            if (!c14022y4Clone.m66333k4(strM65066ar.charAt(i))) {
                c6765kp.m26780k4(strM65066ar.charAt(i));
                z = true;
            } else if (z) {
                c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                z = false;
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: du */
    private boolean m23373du(AbstractC10929m9 abstractC10929m9) {
        String string = this.f15839x1.get_Item(0).mo23148k4(abstractC10929m9).toString();
        String string2 = this.f15839x1.get_Item(1).mo23148k4(abstractC10929m9).toString();
        return string.length() >= string2.length() && C14113y2.m67436x1(string, 0, string2, 0, string2.length()) == 0;
    }

    /* JADX INFO: renamed from: dy */
    private String m23374dy(AbstractC10929m9 abstractC10929m9) {
        String string = this.f15839x1.get_Item(0).mo23148k4(abstractC10929m9).toString();
        String string2 = this.f15839x1.get_Item(1).mo23148k4(abstractC10929m9).toString();
        if (string2.length() == 0) {
            return string;
        }
        int iM55135to = f15837to.m55135to(string, string2, 1073741824L);
        return iM55135to < 0 ? C14113y2.f47374k4 : C14113y2.m67422kk(string, string2.length() + iM55135to);
    }

    /* JADX INFO: renamed from: fa */
    private String m23375fa(AbstractC10929m9 abstractC10929m9) {
        char cCharAt;
        String string = this.f15839x1.get_Item(0).mo23148k4(abstractC10929m9).toString();
        String string2 = this.f15839x1.get_Item(1).mo23148k4(abstractC10929m9).toString();
        String string3 = this.f15839x1.get_Item(2).mo23148k4(abstractC10929m9).toString();
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < string.length(); i++) {
            int iM67429to = C14113y2.m67429to(string2, string.charAt(i));
            if (iM67429to == -1) {
                cCharAt = string.charAt(i);
            } else if (iM67429to < string3.length()) {
                cCharAt = string3.charAt(iM67429to);
            }
            c6765kp.m26780k4(cCharAt);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: jd */
    private double m23377jd(AbstractC10929m9 abstractC10929m9) {
        return (this.f15839x1.size() > 0 ? this.f15839x1.get_Item(0).mo23148k4(abstractC10929m9).toString() : abstractC10929m9.mo21834kk().mo21843dy()).length();
    }

    /* JADX INFO: renamed from: kk */
    private String m23380kk(AbstractC10929m9 abstractC10929m9) {
        if (this.f15839x1.size() <= 0) {
            return abstractC10929m9.mo21834kk().mo21843dy();
        }
        Object objMo23148k4 = this.f15839x1.get_Item(0).mo23148k4(abstractC10929m9);
        int iM23318k4 = m23318k4(objMo23148k4);
        if (iM23318k4 == 1) {
            return (String) objMo23148k4;
        }
        if (iM23318k4 == 2) {
            return ((Boolean) C7019kk.m27464to(objMo23148k4, Boolean.TYPE)).booleanValue() ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE;
        }
        if (iM23318k4 != 3) {
            return iM23318k4 != 4 ? m23378k4(((Double) C7019kk.m27464to(objMo23148k4, Double.TYPE)).doubleValue()) : ((AbstractC10925du) objMo23148k4).mo21843dy();
        }
        AbstractC10925du abstractC10925duMo23142m9 = this.f15839x1.get_Item(0).mo23142m9();
        return abstractC10925duMo23142m9 != null ? abstractC10925duMo23142m9.mo21843dy() : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: m9 */
    private String m23381m9(AbstractC10929m9 abstractC10929m9) {
        String string = this.f15839x1.get_Item(0).mo23148k4(abstractC10929m9).toString();
        String string2 = this.f15839x1.get_Item(1).mo23148k4(abstractC10929m9).toString();
        if (string2.length() == 0) {
            return string2;
        }
        int iM55135to = f15837to.m55135to(string, string2, 1073741824L);
        return iM55135to < 1 ? C14113y2.f47374k4 : C14113y2.m67443x1(string, 0, iM55135to);
    }

    /* JADX INFO: renamed from: to */
    private String m23382to(AbstractC10929m9 abstractC10929m9) {
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < this.f15839x1.size(); i++) {
            c6765kp.m26792k4(this.f15839x1.get_Item(i).mo23148k4(abstractC10929m9).toString());
        }
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: h4 */
    public int mo23141h4() {
        int i = this.f15838k4;
        if (i == 19) {
            return 0;
        }
        return (i == 14 || i == 15) ? 2 : 1;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C5771zj(this);
    }

    private C5771zj(C5771zj c5771zj) {
        super(c5771zj);
        this.f15838k4 = c5771zj.f15838k4;
        int size = c5771zj.f15839x1.size();
        AbstractC5728qw[] abstractC5728qwArr = new AbstractC5728qw[size];
        for (int i = 0; i < size; i++) {
            abstractC5728qwArr[i] = AbstractC5728qw.m23314k4(c5771zj.f15839x1.get_Item(i));
        }
        this.f15839x1 = AbstractC14092to.m67204k4((Object[]) abstractC5728qwArr);
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m23376h4(AbstractC10929m9 abstractC10929m9) {
        return f15837to.m55135to(this.f15839x1.get_Item(0).mo23148k4(abstractC10929m9).toString(), this.f15839x1.get_Item(1).mo23148k4(abstractC10929m9).toString(), 1073741824L) >= 0;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public Object mo23148k4(AbstractC10929m9 abstractC10929m9) {
        int i = this.f15838k4;
        if (i == 7) {
            return m23380kk(abstractC10929m9);
        }
        switch (i) {
            case 13:
                return m23382to(abstractC10929m9);
            case 14:
                return Boolean.valueOf(m23373du(abstractC10929m9));
            case 15:
                return Boolean.valueOf(m23376h4(abstractC10929m9));
            case 16:
                return m23381m9(abstractC10929m9);
            case 17:
                return m23374dy(abstractC10929m9);
            case 18:
                return m23371c5(abstractC10929m9);
            case 19:
                return Double.valueOf(m23377jd(abstractC10929m9));
            case 20:
                return m23372ck(abstractC10929m9);
            case 21:
                return m23375fa(abstractC10929m9);
            default:
                return C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m23378k4(double d) {
        return C14044b3.m66434k4(d, "R", C11683c5.m55033ck());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m23379k4(boolean z) {
        return z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE;
    }

    @Override // com.aspose.slides.internal.p229ki.AbstractC5728qw
    /* JADX INFO: renamed from: k4 */
    public void mo23149k4(AbstractC7201m9 abstractC7201m9) {
        for (int i = 0; i < this.f15839x1.size(); i++) {
            this.f15839x1.get_Item(i).mo23149k4(abstractC7201m9);
        }
    }
}
