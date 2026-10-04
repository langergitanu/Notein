package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8965um;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
class mtk extends AbstractC7020m9<mtk> {

    /* JADX INFO: renamed from: k4 */
    private Object f47439k4;

    /* JADX INFO: renamed from: x1 */
    private int f47440x1;

    public mtk() {
        this.f47439k4 = null;
        this.f47440x1 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67716k4(byte b) {
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            throw new mdp("#VALUE!");
        }
        if (b == 3 || b == 4 || b == 5) {
            return 2;
        }
        throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown cell type '{0}' is encountered in calculation.", C14042ak.m66410k4(C8965um.class, b)));
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public final InterfaceC13755l1 m67721du(C1095fc c1095fc) {
        if (m67728x1() != 3) {
            return new n6c(Clone(), c1095fc);
        }
        return new vqo(((InterfaceC0761as) m67722k4()).mo3719k4(new rft(c1095fc.m6116k4().mo3436k4())), c1095fc);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof mtk) {
            return m67720x1((mtk) obj);
        }
        return false;
    }

    public int hashCode() {
        return C12569rv.m58664k4(this.f47439k4, Integer.valueOf(this.f47440x1));
    }

    /* JADX INFO: renamed from: kk */
    public final double m67725kk(C1095fc c1095fc) {
        Double dMo3433h4;
        if (m67722k4() == null) {
            return 0.0d;
        }
        int iM67728x1 = m67728x1();
        if (iM67728x1 == 0) {
            return ((Boolean) C7019kk.m27464to(m67722k4(), Boolean.TYPE)).booleanValue() ? 1.0d : 0.0d;
        }
        if (iM67728x1 == 1) {
            dMo3433h4 = (Double) C7019kk.m27464to(m67722k4(), Double.TYPE);
        } else {
            if (iM67728x1 == 2) {
                Double dM70655k4 = sk2.m70655k4((String) m67722k4(), c1095fc.m6116k4().mo3436k4().mo5425k4());
                if (dM70655k4 != null) {
                    return dM70655k4.doubleValue();
                }
                throw new mdp("#VALUE!");
            }
            if (iM67728x1 != 3) {
                throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown result type '{0}' is encountered in calculation.", C14042ak.m66410k4(eej.class, m67728x1())));
            }
            InterfaceC1124fx interfaceC1124fxM67717k4 = m67717k4(c1095fc.m6116k4(), (InterfaceC0761as) m67722k4());
            if (interfaceC1124fxM67717k4 == null) {
                throw new mdp("#VALUE!");
            }
            if (interfaceC1124fxM67717k4.mo3431dy() == 2) {
                throw new mdp(interfaceC1124fxM67717k4.mo3449to().toString());
            }
            if (interfaceC1124fxM67717k4.mo3433h4() == null) {
                throw new mdp("#VALUE!");
            }
            dMo3433h4 = interfaceC1124fxM67717k4.mo3433h4();
        }
        return dMo3433h4.doubleValue();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public mtk Clone() {
        mtk mtkVar = new mtk();
        CloneTo(mtkVar);
        return mtkVar;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m67728x1() {
        return this.f47440x1;
    }

    public mtk(double d) {
        this.f47439k4 = Double.valueOf(d);
        this.f47440x1 = 1;
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC1124fx m67717k4(InterfaceC1124fx interfaceC1124fx, InterfaceC0761as interfaceC0761as) {
        C0909dp c0909dpMo3723x1 = interfaceC0761as.mo3723x1(interfaceC1124fx.mo3428c5());
        if (c0909dpMo3723x1 == null) {
            return null;
        }
        return interfaceC1124fx.mo3436k4().mo5425k4().mo5384k4(c0909dpMo3723x1.mo3720k4()).mo5426k4(c0909dpMo3723x1.m5204x1().m4031x1(), c0909dpMo3723x1.m5202kk().m5607x1());
    }

    /* JADX INFO: renamed from: kk */
    public static mtk m67719kk() {
        return new mtk(null, 1);
    }

    /* JADX INFO: renamed from: to */
    public final String m67727to(C1095fc c1095fc) {
        if (m67722k4() == null) {
            return C14113y2.f47374k4;
        }
        int iM67728x1 = m67728x1();
        if (iM67728x1 == 0) {
            return C14113y2.m67358c5(m67722k4().toString());
        }
        if (iM67728x1 == 1) {
            return C14044b3.m66432k4(((Double) C7019kk.m27464to(m67722k4(), Double.TYPE)).doubleValue(), (InterfaceC14073kp) C11697x1.m55250kk());
        }
        if (iM67728x1 == 2) {
            return (String) m67722k4();
        }
        if (iM67728x1 != 3) {
            throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown result type '{0}' is encountered in calculation.", C14042ak.m66410k4(eej.class, m67728x1())));
        }
        InterfaceC1124fx interfaceC1124fxM67717k4 = m67717k4(c1095fc.m6116k4(), (InterfaceC0761as) m67722k4());
        if (interfaceC1124fxM67717k4 == null) {
            throw new mdp("#VALUE!");
        }
        if (interfaceC1124fxM67717k4.mo3431dy() != 2) {
            return interfaceC1124fxM67717k4.mo3446m9();
        }
        throw new mdp(interfaceC1124fxM67717k4.mo3449to().toString());
    }

    /* JADX INFO: renamed from: x1 */
    public final int m67729x1(C1095fc c1095fc) {
        if (m67722k4() == null) {
            return 0;
        }
        return C7019kk.m27462to(Double.valueOf(m67725kk(c1095fc)), 14);
    }

    public mtk(InterfaceC0761as interfaceC0761as) {
        this.f47439k4 = interfaceC0761as;
        this.f47440x1 = 3;
    }

    /* JADX INFO: renamed from: k4 */
    public static mtk m67718k4(InterfaceC1124fx interfaceC1124fx) {
        return new mtk(interfaceC1124fx.mo3449to(), m67716k4(interfaceC1124fx.mo3431dy()));
    }

    /* JADX INFO: renamed from: x1 */
    public final mtk m67730x1(InterfaceC1124fx interfaceC1124fx) {
        if (m67728x1() != 3) {
            return this;
        }
        InterfaceC1124fx interfaceC1124fxM67717k4 = m67717k4(interfaceC1124fx, (InterfaceC0761as) m67722k4());
        if (interfaceC1124fxM67717k4 != null) {
            return new mtk((interfaceC1124fxM67717k4.mo3449to() == null && interfaceC1124fxM67717k4.mo3431dy() == 1) ? Double.valueOf(0.0d) : interfaceC1124fxM67717k4.mo3449to(), m67716k4(interfaceC1124fxM67717k4.mo3431dy()));
        }
        throw new mdp("#VALUE!");
    }

    private mtk(Object obj, int i) {
        this.f47439k4 = obj;
        this.f47440x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m67720x1(mtk mtkVar) {
        return C14067j2.m66728k4(mtkVar.f47439k4, this.f47439k4) && mtkVar.f47440x1 == this.f47440x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final Object m67722k4() {
        return this.f47439k4;
    }

    public mtk(String str) {
        this.f47439k4 = str;
        this.f47440x1 = 2;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(mtk mtkVar) {
        mtkVar.f47439k4 = this.f47439k4;
        mtkVar.f47440x1 = this.f47440x1;
    }

    public mtk(boolean z) {
        this.f47439k4 = Boolean.valueOf(z);
        this.f47440x1 = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m67724k4(C1095fc c1095fc) {
        Boolean boolMo3430du;
        if (m67722k4() == null) {
            return false;
        }
        int iM67728x1 = m67728x1();
        if (iM67728x1 == 0) {
            boolMo3430du = (Boolean) C7019kk.m27464to(m67722k4(), Boolean.TYPE);
        } else {
            if (iM67728x1 == 1) {
                return ((Double) C7019kk.m27464to(m67722k4(), Double.TYPE)).doubleValue() != 0.0d;
            }
            if (iM67728x1 == 2) {
                String strM67358c5 = C14113y2.m67358c5((String) m67722k4());
                if ("FALSE".equals(strM67358c5)) {
                    return false;
                }
                if ("TRUE".equals(strM67358c5)) {
                    return true;
                }
                throw new mdp("#VALUE!");
            }
            if (iM67728x1 != 3) {
                throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown result type '{0}' is encountered in calculation.", C14042ak.m66410k4(eej.class, m67728x1())));
            }
            InterfaceC1124fx interfaceC1124fxM67717k4 = m67717k4(c1095fc.m6116k4(), (InterfaceC0761as) m67722k4());
            if (interfaceC1124fxM67717k4 == null) {
                throw new mdp("#VALUE!");
            }
            if (interfaceC1124fxM67717k4.mo3431dy() == 2) {
                throw new mdp(interfaceC1124fxM67717k4.mo3449to().toString());
            }
            if (interfaceC1124fxM67717k4.mo3430du() == null) {
                throw new mdp("#VALUE!");
            }
            boolMo3430du = interfaceC1124fxM67717k4.mo3430du();
        }
        return boolMo3430du.booleanValue();
    }
}
