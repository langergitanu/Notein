package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.dc */
/* JADX INFO: loaded from: classes5.dex */
public class C13879dc extends C13866bx {

    /* JADX INFO: renamed from: c5 */
    private int f46396c5;

    /* JADX INFO: renamed from: ck */
    private C13892em f46397ck;

    /* JADX INFO: renamed from: du */
    private boolean f46398du;

    /* JADX INFO: renamed from: dy */
    private int f46399dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f46400h4;

    /* JADX INFO: renamed from: jd */
    private C14022y4 f46401jd;

    /* JADX INFO: renamed from: k4 */
    private int f46402k4;

    /* JADX INFO: renamed from: m9 */
    private boolean f46403m9;

    /* JADX INFO: renamed from: to */
    private boolean f46404to;

    public C13879dc(AbstractC13912i5 abstractC13912i5, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        super(abstractC13912i5);
        this.f46401jd = new C14022y4();
        this.f46402k4 = 0;
        this.f46404to = z;
        this.f46398du = z2;
        this.f46400h4 = z3;
        this.f46403m9 = z4;
        this.f46399dy = i;
        this.f46396c5 = 0;
        if (z) {
            C14022y4.m66318k4().CloneTo(this.f46401jd);
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m65235c5() {
        this.f46402k4 = 3;
        C13892em c13892em = this.f46397ck;
        if (c13892em != null) {
            c13892em.m65321k4();
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m65236dy(String str) {
        C13850af.m65114k4(str, 0, 1);
    }

    /* JADX INFO: renamed from: kk */
    private void m65238kk(String str, String str2) {
        try {
            if (str.length() > 0) {
                C13988u1.m66229kk(str);
            }
            C13988u1.m66229kk(str2);
        } catch (RuntimeException e) {
            this.f46402k4 = 2;
            throw e;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13866bx, com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: du */
    public boolean mo65020du() {
        if (this.f46402k4 == 1) {
            m65235c5();
        }
        return this.f46371x1.mo65020du();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
    @Override // com.aspose.slides.p559ms.System.Xml.C13866bx, com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: h4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo65026h4() {
        int iM66338to;
        int i = this.f46402k4;
        if (i == 0) {
            this.f46402k4 = 3;
            if (this.f46371x1.mo65039m9() == 0 && !this.f46371x1.mo65026h4()) {
                return false;
            }
        } else if (i == 1) {
            m65235c5();
            this.f46402k4 = 3;
            if (!this.f46371x1.mo65026h4()) {
                return false;
            }
        } else if (i != 3 || !this.f46371x1.mo65026h4()) {
            return false;
        }
        int iMo65028jd = this.f46371x1.mo65028jd();
        boolean z = this.f46404to;
        if (!z) {
            if (iMo65028jd != 7) {
                if (iMo65028jd != 8) {
                    if (iMo65028jd == 10) {
                        int i2 = this.f46399dy;
                        if (i2 == 0) {
                            m65241x1("For security reasons DTD is prohibited in this XML document. To enable DTD processing set the DtdProcessing property on XmlReaderSettings to Parse and pass the settings into XmlReader.Create method.", C14113y2.f47374k4);
                        } else if (i2 == 1) {
                            return mo65026h4();
                        }
                    } else if (iMo65028jd == 13 && this.f46398du) {
                        return mo65026h4();
                    }
                } else if (this.f46400h4) {
                    return mo65026h4();
                }
            } else if (this.f46403m9) {
                return mo65026h4();
            }
            return true;
        }
        switch (iMo65028jd) {
            case 1:
                if (z) {
                    m65238kk(this.f46371x1.mo65060yj(), this.f46371x1.mo65023fa());
                    if (this.f46371x1.mo65035kk()) {
                        do {
                            m65238kk(this.f46371x1.mo65060yj(), this.f46371x1.mo65023fa());
                            m65236dy(this.f46371x1.mo65042rv());
                        } while (this.f46371x1.mo65047to());
                        this.f46371x1.mo65020du();
                    }
                }
                this.f46396c5 = iMo65028jd;
                break;
            case 2:
            case 6:
            case 9:
            case 11:
            case 12:
            default:
                this.f46396c5 = iMo65028jd;
                break;
            case 3:
            case 4:
                if (z) {
                    m65236dy(this.f46371x1.mo65042rv());
                }
                this.f46396c5 = iMo65028jd;
                break;
            case 5:
                if (z) {
                    m65239m9(this.f46371x1.mo65019ck());
                }
                this.f46396c5 = iMo65028jd;
                break;
            case 7:
                if (!this.f46403m9) {
                    if (z) {
                        m65239m9(this.f46371x1.mo65019ck());
                        m65236dy(this.f46371x1.mo65042rv());
                    }
                    this.f46396c5 = iMo65028jd;
                }
                break;
            case 8:
                if (!this.f46400h4) {
                    if (z) {
                    }
                    this.f46396c5 = iMo65028jd;
                }
                break;
            case 10:
                int i3 = this.f46399dy;
                if (i3 == 0) {
                    m65241x1("For security reasons DTD is prohibited in this XML document. To enable DTD processing set the DtdProcessing property on XmlReaderSettings to Parse and pass the settings into XmlReader.Create method.", C14113y2.f47374k4);
                } else if (i3 == 1) {
                }
                if (this.f46404to) {
                    m65239m9(this.f46371x1.mo65019ck());
                    m65236dy(this.f46371x1.mo65042rv());
                    String strMo65046to = this.f46371x1.mo65046to("SYSTEM");
                    if (strMo65046to != null) {
                        m65236dy(strMo65046to);
                    }
                    String strMo65046to2 = this.f46371x1.mo65046to("PUBLIC");
                    if (strMo65046to2 != null && (iM66338to = this.f46401jd.m66338to(strMo65046to2)) >= 0) {
                        m65237k4("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(strMo65046to2, iM66338to));
                    }
                }
                this.f46396c5 = iMo65028jd;
                break;
            case 13:
                if (!this.f46398du) {
                    if (z) {
                        m65240x1(this.f46371x1.mo65042rv());
                    }
                    this.f46396c5 = iMo65028jd;
                }
                break;
            case 14:
                if (z) {
                }
                this.f46396c5 = iMo65028jd;
                break;
            case 15:
                if (z) {
                    m65238kk(this.f46371x1.mo65060yj(), this.f46371x1.mo65023fa());
                }
                this.f46396c5 = iMo65028jd;
                break;
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13866bx, com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: k4 */
    public C13906gx mo65029k4() {
        C13906gx c13906gxMo65029k4 = this.f46371x1.mo65029k4();
        C13906gx c13906gx = c13906gxMo65029k4 == null ? new C13906gx() : c13906gxMo65029k4.m65378ix();
        if (this.f46404to) {
            c13906gx.m65409x1(true);
        }
        if (this.f46398du) {
            c13906gx.m65394kk(true);
        }
        if (this.f46400h4) {
            c13906gx.m65372du(true);
        }
        if (this.f46403m9) {
            c13906gx.m65402to(true);
        }
        int i = this.f46399dy;
        if (i != -1) {
            c13906gx.m65401to(i);
        }
        c13906gx.m65397m9(true);
        return c13906gx;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13866bx, com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: m9 */
    public int mo65039m9() {
        int i = this.f46402k4;
        if (i == 0) {
            return this.f46371x1.mo65039m9() == 4 ? 4 : 0;
        }
        if (i != 2) {
            return this.f46371x1.mo65039m9();
        }
        return 2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13866bx, com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: to */
    public boolean mo65047to() {
        if (this.f46402k4 == 1) {
            m65235c5();
        }
        return this.f46371x1.mo65047to();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13866bx, com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: x1 */
    public void mo65055x1(int i) {
        if (this.f46402k4 == 1) {
            m65235c5();
        }
        this.f46371x1.mo65055x1(i);
    }

    /* JADX INFO: renamed from: k4 */
    private void m65237k4(String str, String[] strArr) {
        this.f46402k4 = 2;
        throw new XmlException(str, strArr, (InterfaceC13896f9) null);
    }

    /* JADX INFO: renamed from: m9 */
    private void m65239m9(String str) {
        C13988u1.m66225k4(str, new String[]{null}, new String[]{null});
    }

    /* JADX INFO: renamed from: x1 */
    private void m65240x1(String str) {
        int iM66340x1 = this.f46401jd.m66340x1(str);
        if (iM66340x1 != -1) {
            m65237k4("The Whitespace or SignificantWhitespace node can contain only XML white space characters. '{0}' is not an XML white space character.", XmlException.buildCharExceptionArgs(str, iM66340x1));
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13866bx, com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: dy */
    public boolean mo65021dy() {
        if (this.f46402k4 == 1) {
            m65235c5();
        }
        return this.f46371x1.mo65021dy();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13866bx, com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public boolean mo65035kk() {
        if (this.f46402k4 == 1) {
            m65235c5();
        }
        return this.f46371x1.mo65035kk();
    }

    /* JADX INFO: renamed from: x1 */
    private void m65241x1(String str, String str2) {
        this.f46402k4 = 2;
        throw new XmlException(str, str2, (InterfaceC13896f9) null);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13866bx, com.aspose.slides.p559ms.System.Xml.AbstractC13912i5
    /* JADX INFO: renamed from: kk */
    public boolean mo65036kk(String str) {
        if (this.f46402k4 == 1) {
            m65235c5();
        }
        return this.f46371x1.mo65036kk(str);
    }
}
