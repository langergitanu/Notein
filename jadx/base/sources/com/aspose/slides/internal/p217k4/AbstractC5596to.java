package com.aspose.slides.internal.p217k4;

import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.k4.to */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5596to {

    /* JADX INFO: renamed from: k4 */
    protected C5579bv f15418k4;

    public AbstractC5596to() {
        this.f15418k4 = new C5579bv();
    }

    /* JADX INFO: renamed from: du */
    public C5582du m22976du() {
        return m22977k4(true);
    }

    /* JADX INFO: renamed from: h4 */
    public String[] mo22453h4() {
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public C5582du m22977k4(boolean z) {
        C5582du c5582du = new C5582du();
        for (int i = this.f15418k4.f15364x1; i >= 0; i--) {
            C5582du c5582du2 = this.f15418k4.f15358k4[i];
            c5582du.m22944x1(c5582du2);
            if (z) {
                if (!c5582du2.m22942to(1)) {
                    break;
                }
                if (i > 0) {
                    c5582du.m22938du(1);
                }
            }
        }
        return c5582du;
    }

    /* JADX INFO: renamed from: kk */
    public void m22984kk() {
    }

    /* JADX INFO: renamed from: to */
    public C5582du m22985to() {
        return m22977k4(false);
    }

    /* JADX INFO: renamed from: x1 */
    public Object m22986x1(InterfaceC5607yj interfaceC5607yj, int i, C5582du c5582du) throws C5598um {
        if (!m22982k4(interfaceC5607yj, i)) {
            if (!m22983k4(interfaceC5607yj, c5582du)) {
                throw new C5586ix(i, interfaceC5607yj);
            }
            Object objMo22974k4 = mo22974k4(interfaceC5607yj, null, i, c5582du);
            mo22968k4(new C5600uz(i, interfaceC5607yj, objMo22974k4));
            return objMo22974k4;
        }
        C5603wy c5603wy = new C5603wy(i, interfaceC5607yj);
        m22988x1();
        interfaceC5607yj.mo22952k4();
        m22984kk();
        mo22968k4(c5603wy);
        Object objMo22973k4 = mo22973k4(interfaceC5607yj);
        interfaceC5607yj.mo22952k4();
        return objMo22973k4;
    }

    public AbstractC5596to(C5579bv c5579bv) {
        this.f15418k4 = c5579bv == null ? new C5579bv() : c5579bv;
    }

    /* JADX INFO: renamed from: k4 */
    public Object mo22973k4(InterfaceC5607yj interfaceC5607yj) {
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public String m22987x1(C5598um c5598um) {
        StringBuffer stringBuffer = new StringBuffer("line ");
        stringBuffer.append(c5598um.f15420c5);
        stringBuffer.append(C18241k5.f55433h);
        stringBuffer.append(c5598um.f15425jd);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public Object mo22978k4(InterfaceC5607yj interfaceC5607yj, int i, C5582du c5582du) throws C5598um {
        Object objMo22973k4 = mo22973k4(interfaceC5607yj);
        if (interfaceC5607yj.mo22951k4(1) == i) {
            interfaceC5607yj.mo22952k4();
            C5579bv c5579bv = this.f15418k4;
            c5579bv.f15359kk = false;
            c5579bv.f15353du = false;
            return objMo22973k4;
        }
        C5579bv c5579bv2 = this.f15418k4;
        if (c5579bv2.f15361m9 <= 0) {
            return m22986x1(interfaceC5607yj, i, c5582du);
        }
        c5579bv2.f15353du = true;
        return objMo22973k4;
    }

    /* JADX INFO: renamed from: x1 */
    public void m22988x1() {
    }

    /* JADX INFO: renamed from: k4 */
    public Object mo22974k4(InterfaceC5607yj interfaceC5607yj, C5598um c5598um, int i, C5582du c5582du) {
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m22989x1(InterfaceC5607yj interfaceC5607yj, C5582du c5582du) {
        while (true) {
            int iMo22951k4 = interfaceC5607yj.mo22951k4(1);
            if (iMo22951k4 == -1 || c5582du.m22942to(iMo22951k4)) {
                return;
            } else {
                interfaceC5607yj.mo22952k4();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public String m22979k4(InterfaceC5591lr interfaceC5591lr) {
        String strMo22924x1 = interfaceC5591lr.mo22924x1();
        if (strMo22924x1 == null) {
            if (interfaceC5591lr.mo22915k4() == -1) {
                strMo22924x1 = "<EOF>";
            } else {
                StringBuffer stringBuffer = new StringBuffer("<");
                stringBuffer.append(interfaceC5591lr.mo22915k4());
                stringBuffer.append(">");
                strMo22924x1 = stringBuffer.toString();
            }
        }
        String strReplaceAll = strMo22924x1.replaceAll(IOUtils.LINE_SEPARATOR_UNIX, "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t");
        StringBuffer stringBuffer2 = new StringBuffer("'");
        stringBuffer2.append(strReplaceAll);
        stringBuffer2.append("'");
        return stringBuffer2.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public String mo22964k4(C5598um c5598um, String[] strArr) {
        String str;
        String message = c5598um.getMessage();
        if (c5598um instanceof C5603wy) {
            C5603wy c5603wy = (C5603wy) c5598um;
            int i = c5603wy.f15392k4;
            str = i != -1 ? strArr[i] : "EOF";
            StringBuffer stringBuffer = new StringBuffer("extraneous input ");
            stringBuffer.append(m22979k4(c5603wy.m22993k4()));
            stringBuffer.append(" expecting ");
            stringBuffer.append(str);
            return stringBuffer.toString();
        }
        if (c5598um instanceof C5600uz) {
            int i2 = ((C5600uz) c5598um).f15392k4;
            str = i2 != -1 ? strArr[i2] : "EOF";
            StringBuffer stringBuffer2 = new StringBuffer("missing ");
            stringBuffer2.append(str);
            stringBuffer2.append(" at ");
            stringBuffer2.append(m22979k4(c5598um.f15424h4));
            return stringBuffer2.toString();
        }
        if (c5598um instanceof C5586ix) {
            int i3 = ((C5586ix) c5598um).f15392k4;
            str = i3 != -1 ? strArr[i3] : "EOF";
            StringBuffer stringBuffer3 = new StringBuffer("mismatched input ");
            stringBuffer3.append(m22979k4(c5598um.f15424h4));
            stringBuffer3.append(" expecting ");
            stringBuffer3.append(str);
            return stringBuffer3.toString();
        }
        if (c5598um instanceof C5597u4) {
            C5597u4 c5597u4 = (C5597u4) c5598um;
            int i4 = c5597u4.f15419k4;
            str = i4 != -1 ? strArr[i4] : "EOF";
            StringBuffer stringBuffer4 = new StringBuffer("mismatched tree node: ");
            stringBuffer4.append(c5597u4.f15426m9);
            stringBuffer4.append(" expecting ");
            stringBuffer4.append(str);
            return stringBuffer4.toString();
        }
        if (c5598um instanceof C5602wl) {
            StringBuffer stringBuffer5 = new StringBuffer("no viable alternative at input ");
            stringBuffer5.append(m22979k4(c5598um.f15424h4));
            return stringBuffer5.toString();
        }
        if (c5598um instanceof C5584fa) {
            StringBuffer stringBuffer6 = new StringBuffer("required (...)+ loop did not match anything at input ");
            stringBuffer6.append(m22979k4(c5598um.f15424h4));
            return stringBuffer6.toString();
        }
        if (c5598um instanceof C5593ne) {
            StringBuffer stringBuffer7 = new StringBuffer("mismatched input ");
            stringBuffer7.append(m22979k4(c5598um.f15424h4));
            stringBuffer7.append(" expecting set ");
            stringBuffer7.append(((C5593ne) c5598um).f15416k4);
            return stringBuffer7.toString();
        }
        if (c5598um instanceof C5595rv) {
            StringBuffer stringBuffer8 = new StringBuffer("mismatched input ");
            stringBuffer8.append(m22979k4(c5598um.f15424h4));
            stringBuffer8.append(" expecting set ");
            stringBuffer8.append(((C5595rv) c5598um).f15416k4);
            return stringBuffer8.toString();
        }
        if (!(c5598um instanceof C5599up)) {
            return message;
        }
        C5599up c5599up = (C5599up) c5598um;
        StringBuffer stringBuffer9 = new StringBuffer("rule ");
        stringBuffer9.append(c5599up.f15428k4);
        stringBuffer9.append(" failed predicate: {");
        stringBuffer9.append(c5599up.f15429x1);
        stringBuffer9.append("}?");
        return stringBuffer9.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22965k4() {
        C5579bv c5579bv = this.f15418k4;
        if (c5579bv == null) {
            return;
        }
        c5579bv.f15364x1 = -1;
        int i = 0;
        c5579bv.f15359kk = false;
        c5579bv.f15362to = -1;
        c5579bv.f15353du = false;
        c5579bv.f15356h4 = 0;
        c5579bv.f15361m9 = 0;
        while (true) {
            Map[] mapArr = this.f15418k4.f15354dy;
            if (mapArr == null || i >= mapArr.length) {
                return;
            }
            mapArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m22980k4(C5582du c5582du) {
        C5579bv c5579bv = this.f15418k4;
        int i = c5579bv.f15364x1 + 1;
        C5582du[] c5582duArr = c5579bv.f15358k4;
        if (i >= c5582duArr.length) {
            C5582du[] c5582duArr2 = new C5582du[c5582duArr.length * 2];
            System.arraycopy(c5582duArr, 0, c5582duArr2, 0, c5582duArr.length);
            this.f15418k4.f15358k4 = c5582duArr2;
        }
        C5579bv c5579bv2 = this.f15418k4;
        C5582du[] c5582duArr3 = c5579bv2.f15358k4;
        int i2 = c5579bv2.f15364x1 + 1;
        c5579bv2.f15364x1 = i2;
        c5582duArr3[i2] = c5582du;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22968k4(C5598um c5598um) {
        C5579bv c5579bv = this.f15418k4;
        if (c5579bv.f15359kk) {
            return;
        }
        c5579bv.f15356h4++;
        c5579bv.f15359kk = true;
        mo22464k4(mo22453h4(), c5598um);
    }

    /* JADX INFO: renamed from: k4 */
    public void m22981k4(InterfaceC5607yj interfaceC5607yj, C5598um c5598um) {
        if (this.f15418k4.f15362to == interfaceC5607yj.mo22958x1()) {
            interfaceC5607yj.mo22952k4();
        }
        this.f15418k4.f15362to = interfaceC5607yj.mo22958x1();
        C5582du c5582duM22985to = m22985to();
        m22988x1();
        m22989x1(interfaceC5607yj, c5582duM22985to);
        m22984kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22463k4(String str) {
        System.err.println(str);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo22464k4(String[] strArr, C5598um c5598um) {
        String strM22987x1 = m22987x1(c5598um);
        String strMo22964k4 = mo22964k4(c5598um, strArr);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strM22987x1);
        stringBuffer.append(" ");
        stringBuffer.append(strMo22964k4);
        mo22463k4(stringBuffer.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m22982k4(InterfaceC5607yj interfaceC5607yj, int i) {
        return interfaceC5607yj.mo22951k4(2) == i;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m22983k4(InterfaceC5607yj interfaceC5607yj, C5582du c5582du) {
        if (c5582du == null) {
            return false;
        }
        if (c5582du.m22942to(1)) {
            c5582du = c5582du.m22939k4(m22976du());
            if (this.f15418k4.f15364x1 >= 0) {
                c5582du.m22938du(1);
            }
        }
        return c5582du.m22942to(interfaceC5607yj.mo22951k4(1)) || c5582du.m22942to(1);
    }
}
