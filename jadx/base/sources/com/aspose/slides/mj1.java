package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8965um;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class mj1 {

    /* JADX INFO: renamed from: k4 */
    private C1095fc f46244k4;

    public mj1(C1095fc c1095fc) {
        this.f46244k4 = c1095fc;
    }

    /* JADX INFO: renamed from: k4 */
    private int m64897k4(InterfaceC0761as interfaceC0761as, InterfaceC0761as interfaceC0761as2, String[] strArr) {
        C0909dp c0909dpMo3723x1 = interfaceC0761as.mo3723x1(this.f46244k4.m6116k4().mo3428c5());
        if (c0909dpMo3723x1 == null) {
            strArr[0] = "#VALUE!";
            return Integer.MIN_VALUE;
        }
        C0909dp c0909dpMo3723x12 = interfaceC0761as2.mo3723x1(this.f46244k4.m6116k4().mo3428c5());
        if (c0909dpMo3723x12 != null) {
            return m64898k4(this.f46244k4.m6116k4().mo3436k4().mo5426k4(c0909dpMo3723x1.m5204x1().m4031x1(), c0909dpMo3723x1.m5202kk().m5607x1()), this.f46244k4.m6116k4().mo3436k4().mo5426k4(c0909dpMo3723x12.m5204x1().m4031x1(), c0909dpMo3723x12.m5202kk().m5607x1()), strArr);
        }
        strArr[0] = "#VALUE!";
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: k4 */
    private int m64898k4(InterfaceC1124fx interfaceC1124fx, InterfaceC1124fx interfaceC1124fx2, String[] strArr) {
        strArr[0] = null;
        byte bMo3431dy = interfaceC1124fx.mo3431dy();
        if (bMo3431dy == 0) {
            return m64908k4(((Boolean) C7019kk.m27464to(interfaceC1124fx.mo3449to(), Boolean.TYPE)).booleanValue(), interfaceC1124fx2, strArr);
        }
        if (bMo3431dy == 1) {
            return m64900k4(m64912k4(interfaceC1124fx.mo3449to()).Clone(), interfaceC1124fx2, strArr);
        }
        if (bMo3431dy == 2) {
            strArr[0] = (String) interfaceC1124fx.mo3449to();
            return Integer.MIN_VALUE;
        }
        if (bMo3431dy == 3 || bMo3431dy == 4 || bMo3431dy == 5) {
            return m64905k4((String) interfaceC1124fx.mo3449to(), interfaceC1124fx2, strArr);
        }
        throw new ArgumentException(C14113y2.m67408k4("Unexpected cell type ", C14042ak.m66410k4(C8965um.class, interfaceC1124fx.mo3431dy()), " is encountered."));
    }

    /* JADX INFO: renamed from: k4 */
    private int m64899k4(C14093tq<Double> c14093tq, InterfaceC0761as interfaceC0761as, String[] strArr) {
        C0909dp c0909dpMo3723x1 = interfaceC0761as.mo3723x1(this.f46244k4.m6116k4().mo3428c5());
        if (c0909dpMo3723x1 == null) {
            strArr[0] = "#VALUE!";
            return Integer.MIN_VALUE;
        }
        return m64900k4(c14093tq.Clone(), this.f46244k4.m6116k4().mo3436k4().mo5425k4().mo5384k4(c0909dpMo3723x1.mo3720k4()).mo5426k4(c0909dpMo3723x1.m5204x1().m4031x1(), c0909dpMo3723x1.m5202kk().m5607x1()), strArr);
    }

    /* JADX INFO: renamed from: k4 */
    private int m64900k4(C14093tq<Double> c14093tq, InterfaceC1124fx interfaceC1124fx, String[] strArr) {
        strArr[0] = null;
        byte bMo3431dy = interfaceC1124fx.mo3431dy();
        if (bMo3431dy == 0) {
            return -m64909k4(((Boolean) C7019kk.m27464to(interfaceC1124fx.mo3449to(), Boolean.TYPE)).booleanValue(), c14093tq.Clone());
        }
        if (bMo3431dy == 1) {
            return m64901k4(c14093tq.Clone(), m64912k4(interfaceC1124fx.mo3449to()).Clone());
        }
        if (bMo3431dy == 2) {
            strArr[0] = (String) interfaceC1124fx.mo3449to();
            return Integer.MIN_VALUE;
        }
        if (bMo3431dy == 3 || bMo3431dy == 4 || bMo3431dy == 5) {
            return m64902k4(c14093tq.Clone(), (String) interfaceC1124fx.mo3449to());
        }
        throw new ArgumentException(C14113y2.m67408k4("Unexpected cell type ", C14042ak.m66410k4(C8965um.class, interfaceC1124fx.mo3431dy()), " is encountered."));
    }

    /* JADX INFO: renamed from: k4 */
    private int m64901k4(C14093tq<Double> c14093tq, C14093tq<Double> c14093tq2) {
        double dDoubleValue = c14093tq.m67302x1() ? c14093tq.m67297k4().doubleValue() : 0.0d;
        double dDoubleValue2 = c14093tq2.m67302x1() ? c14093tq2.m67297k4().doubleValue() : 0.0d;
        if (C14116yg.m67475k4(dDoubleValue - dDoubleValue2) < 1.0E-15d) {
            return 0;
        }
        return dDoubleValue < dDoubleValue2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: k4 */
    private int m64902k4(C14093tq<Double> c14093tq, String str) {
        return (!c14093tq.m67302x1() && "".equals(str)) ? 0 : -1;
    }

    /* JADX INFO: renamed from: k4 */
    private int m64903k4(mtk mtkVar, mtk mtkVar2, String[] strArr) {
        strArr[0] = null;
        int iM67728x1 = mtkVar.m67728x1();
        Class cls = Boolean.TYPE;
        if (iM67728x1 == 0) {
            if (mtkVar2.m67728x1() == 0) {
                return m64911k4(((Boolean) C7019kk.m27464to(mtkVar.m67722k4(), cls)).booleanValue(), ((Boolean) C7019kk.m27464to(mtkVar2.m67722k4(), cls)).booleanValue());
            }
            if (mtkVar2.m67728x1() == 1) {
                return m64909k4(((Boolean) C7019kk.m27464to(mtkVar.m67722k4(), cls)).booleanValue(), m64912k4(mtkVar2.m67722k4()).Clone());
            }
            if (mtkVar2.m67728x1() == 2) {
                return m64910k4(((Boolean) C7019kk.m27464to(mtkVar.m67722k4(), cls)).booleanValue(), (String) mtkVar2.m67722k4());
            }
            if (mtkVar2.m67728x1() == 3) {
                return m64907k4(((Boolean) C7019kk.m27464to(mtkVar.m67722k4(), cls)).booleanValue(), (InterfaceC0761as) mtkVar2.m67722k4(), strArr);
            }
            throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown node result type '{0}' is encountered.", C14042ak.m66410k4(eej.class, mtkVar2.m67728x1())));
        }
        if (mtkVar.m67728x1() == 1) {
            if (mtkVar2.m67728x1() == 0) {
                return -m64909k4(((Boolean) C7019kk.m27464to(mtkVar2.m67722k4(), cls)).booleanValue(), m64912k4(mtkVar.m67722k4()).Clone());
            }
            if (mtkVar2.m67728x1() == 1) {
                return m64901k4(m64912k4(mtkVar.m67722k4()).Clone(), m64912k4(mtkVar2.m67722k4()).Clone());
            }
            if (mtkVar2.m67728x1() == 2) {
                return m64902k4(m64912k4(mtkVar.m67722k4()).Clone(), (String) mtkVar2.m67722k4());
            }
            if (mtkVar2.m67728x1() == 3) {
                return m64899k4(m64912k4(mtkVar.m67722k4()).Clone(), (InterfaceC0761as) mtkVar2.m67722k4(), strArr);
            }
            throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown node result type '{0}' is encountered.", C14042ak.m66410k4(eej.class, mtkVar2.m67728x1())));
        }
        if (mtkVar.m67728x1() == 2) {
            if (mtkVar2.m67728x1() == 0) {
                return -m64910k4(((Boolean) C7019kk.m27464to(mtkVar2.m67722k4(), cls)).booleanValue(), (String) mtkVar.m67722k4());
            }
            if (mtkVar2.m67728x1() == 1) {
                return -m64902k4(m64912k4(mtkVar2.m67722k4()).Clone(), (String) mtkVar.m67722k4());
            }
            if (mtkVar2.m67728x1() == 2) {
                return m64906k4((String) mtkVar.m67722k4(), (String) mtkVar2.m67722k4());
            }
            if (mtkVar2.m67728x1() == 3) {
                return m64904k4((String) mtkVar.m67722k4(), (InterfaceC0761as) mtkVar2.m67722k4(), strArr);
            }
            throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown node result type '{0}' is encountered.", C14042ak.m66410k4(eej.class, mtkVar2.m67728x1())));
        }
        if (mtkVar.m67728x1() != 3) {
            throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown node result type '{0}' is encountered.", C14042ak.m66410k4(eej.class, mtkVar.m67728x1())));
        }
        if (mtkVar2.m67728x1() == 0) {
            return -m64907k4(((Boolean) C7019kk.m27464to(mtkVar2.m67722k4(), cls)).booleanValue(), (InterfaceC0761as) mtkVar.m67722k4(), strArr);
        }
        if (mtkVar2.m67728x1() == 1) {
            return -m64899k4(m64912k4(mtkVar2.m67722k4()).Clone(), (InterfaceC0761as) mtkVar.m67722k4(), strArr);
        }
        if (mtkVar2.m67728x1() == 2) {
            return -m64904k4((String) mtkVar2.m67722k4(), (InterfaceC0761as) mtkVar.m67722k4(), strArr);
        }
        if (mtkVar2.m67728x1() == 3) {
            return m64897k4((InterfaceC0761as) mtkVar.m67722k4(), (InterfaceC0761as) mtkVar2.m67722k4(), strArr);
        }
        throw new CellUnsupportedDataException(C14113y2.m67402k4("Unknown node result type '{0}' is encountered.", C14042ak.m66410k4(eej.class, mtkVar2.m67728x1())));
    }

    /* JADX INFO: renamed from: k4 */
    private int m64904k4(String str, InterfaceC0761as interfaceC0761as, String[] strArr) {
        C0909dp c0909dpMo3723x1 = interfaceC0761as.mo3723x1(this.f46244k4.m6116k4().mo3428c5());
        if (c0909dpMo3723x1 != null) {
            return m64905k4(str, this.f46244k4.m6116k4().mo3436k4().mo5426k4(c0909dpMo3723x1.m5204x1().m4031x1(), c0909dpMo3723x1.m5202kk().m5607x1()), strArr);
        }
        strArr[0] = "#VALUE!";
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: k4 */
    private int m64905k4(String str, InterfaceC1124fx interfaceC1124fx, String[] strArr) {
        strArr[0] = null;
        if (C14113y2.m67411k4(str) && interfaceC1124fx.mo3449to() == null) {
            return 0;
        }
        byte bMo3431dy = interfaceC1124fx.mo3431dy();
        if (bMo3431dy == 0) {
            return -m64910k4(((Boolean) C7019kk.m27464to(interfaceC1124fx.mo3449to(), Boolean.TYPE)).booleanValue(), str);
        }
        if (bMo3431dy == 1) {
            return -m64902k4(m64912k4(interfaceC1124fx.mo3449to()).Clone(), str);
        }
        if (bMo3431dy == 2) {
            strArr[0] = (String) interfaceC1124fx.mo3449to();
            return Integer.MIN_VALUE;
        }
        if (bMo3431dy == 3 || bMo3431dy == 4 || bMo3431dy == 5) {
            return m64906k4(str, (String) interfaceC1124fx.mo3449to());
        }
        throw new ArgumentException(C14113y2.m67408k4("Unexpected cell type ", C14042ak.m66410k4(C8965um.class, interfaceC1124fx.mo3431dy()), " is encountered."));
    }

    /* JADX INFO: renamed from: k4 */
    private int m64906k4(String str, String str2) {
        return C14113y2.m67366h4(C14113y2.m67368h4(str), C14113y2.m67368h4(str2));
    }

    /* JADX INFO: renamed from: k4 */
    private int m64907k4(boolean z, InterfaceC0761as interfaceC0761as, String[] strArr) {
        C0909dp c0909dpMo3723x1 = interfaceC0761as.mo3723x1(this.f46244k4.m6116k4().mo3428c5());
        if (c0909dpMo3723x1 != null) {
            return m64908k4(z, this.f46244k4.m6116k4().mo3436k4().mo5426k4(c0909dpMo3723x1.m5204x1().m4031x1(), c0909dpMo3723x1.m5202kk().m5607x1()), strArr);
        }
        strArr[0] = "#VALUE!";
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: k4 */
    private int m64908k4(boolean z, InterfaceC1124fx interfaceC1124fx, String[] strArr) {
        strArr[0] = null;
        if (interfaceC1124fx.mo3449to() == null) {
            return z ? 1 : 0;
        }
        byte bMo3431dy = interfaceC1124fx.mo3431dy();
        if (bMo3431dy == 0) {
            return m64911k4(z, ((Boolean) C7019kk.m27464to(interfaceC1124fx.mo3449to(), Boolean.TYPE)).booleanValue());
        }
        if (bMo3431dy == 1) {
            return m64909k4(z, m64912k4(interfaceC1124fx.mo3449to()).Clone());
        }
        if (bMo3431dy == 2) {
            strArr[0] = (String) interfaceC1124fx.mo3449to();
            return Integer.MIN_VALUE;
        }
        if (bMo3431dy == 3 || bMo3431dy == 4 || bMo3431dy == 5) {
            return m64910k4(z, (String) interfaceC1124fx.mo3449to());
        }
        throw new ArgumentException(C14113y2.m67408k4("Unexpected cell type ", C14042ak.m66410k4(C8965um.class, interfaceC1124fx.mo3431dy()), " is encountered."));
    }

    /* JADX INFO: renamed from: k4 */
    private int m64909k4(boolean z, C14093tq<Double> c14093tq) {
        if (c14093tq.m67302x1()) {
            return 1;
        }
        return z ? 1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    private int m64910k4(boolean z, String str) {
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    private int m64911k4(boolean z, boolean z2) {
        return z ? !z2 ? 1 : 0 : z2 ? -1 : 0;
    }

    /* JADX INFO: renamed from: k4 */
    private C14093tq<Double> m64912k4(Object obj) {
        return C7019kk.m27469x1(obj, Double.class) ? new C14093tq<>((Double) obj) : C7019kk.m27469x1(obj, C14046bv.class) ? new C14093tq<>(Double.valueOf(C14046bv.m66492up(((C14046bv) C7019kk.m27464to(obj, C14046bv.class)).Clone()))) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final mtk m64913k4(mtk mtkVar, mtk mtkVar2) {
        String[] strArr = {null};
        int iM64903k4 = m64903k4(mtkVar.Clone(), mtkVar2.Clone(), strArr);
        String str = strArr[0];
        if (C14113y2.m67411k4(str)) {
            return new mtk(iM64903k4);
        }
        throw new mdp(str);
    }
}
