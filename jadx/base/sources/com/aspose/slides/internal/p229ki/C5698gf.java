package com.aspose.slides.internal.p229ki;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.huawei.hms.network.embedded.C18293o1;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.gf */
/* JADX INFO: loaded from: classes.dex */
public class C5698gf {

    /* JADX INFO: renamed from: k4 */
    private C5700gk f15722k4;

    /* JADX INFO: renamed from: x1 */
    private int f15723x1 = 0;

    /* JADX INFO: renamed from: kk */
    private static final int[] f15718kk = new int[0];

    /* JADX INFO: renamed from: to */
    private static final int[] f15720to = {3};

    /* JADX INFO: renamed from: du */
    private static final int[] f15713du = {5};

    /* JADX INFO: renamed from: h4 */
    private static final int[] f15716h4 = {1};

    /* JADX INFO: renamed from: m9 */
    private static final int[] f15719m9 = {1, 1};

    /* JADX INFO: renamed from: dy */
    private static final int[] f15714dy = {1, 0, 0};

    /* JADX INFO: renamed from: c5 */
    private static final int[] f15711c5 = {1, 1, 1};

    /* JADX INFO: renamed from: jd */
    private static final int[] f15717jd = {2};

    /* JADX INFO: renamed from: ck */
    private static final int[] f15712ck = {0};

    /* JADX INFO: renamed from: fa */
    private static Hashtable f15715fa = m23267x1();

    /* JADX INFO: renamed from: up */
    private static Hashtable f15721up = m23253kk();

    /* JADX INFO: renamed from: com.aspose.slides.internal.ki.gf$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private int f15724k4;

        /* JADX INFO: renamed from: kk */
        private int f15725kk;

        /* JADX INFO: renamed from: to */
        private int[] f15726to;

        /* JADX INFO: renamed from: x1 */
        private int f15727x1;

        public k4(int i, int i2, int i3, int[] iArr) {
            this.f15724k4 = i;
            this.f15727x1 = i2;
            this.f15725kk = i3;
            this.f15726to = iArr;
        }

        /* JADX INFO: renamed from: k4 */
        public final int m23274k4() {
            return this.f15724k4;
        }

        /* JADX INFO: renamed from: kk */
        public final int m23275kk() {
            return this.f15725kk;
        }

        /* JADX INFO: renamed from: to */
        public final int[] m23276to() {
            return this.f15726to;
        }

        /* JADX INFO: renamed from: x1 */
        public final int m23277x1() {
            return this.f15727x1;
        }
    }

    private C5698gf(C5700gk c5700gk) {
        this.f15722k4 = c5700gk;
    }

    /* JADX INFO: renamed from: c5 */
    private AbstractC5746v4 m23238c5(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 abstractC5746v4M23245jd = m23245jd(abstractC5746v4);
        while (this.f15722k4.m23293x1() == 124) {
            m23249k4();
            AbstractC5746v4 abstractC5746v4M23245jd2 = m23245jd(abstractC5746v4);
            m23262to(abstractC5746v4M23245jd.mo23217x1());
            m23262to(abstractC5746v4M23245jd2.mo23217x1());
            abstractC5746v4M23245jd = new C5736t6(14, abstractC5746v4M23245jd, abstractC5746v4M23245jd2);
        }
        return abstractC5746v4M23245jd;
    }

    /* JADX INFO: renamed from: ck */
    private AbstractC5746v4 m23239ck(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 abstractC5746v4M23260rv = m23260rv(abstractC5746v4);
        while (this.f15722k4.m23293x1() == 91) {
            abstractC5746v4M23260rv = new C5757x3(abstractC5746v4M23260rv, m23242fa(abstractC5746v4M23260rv));
        }
        return abstractC5746v4M23260rv;
    }

    /* JADX INFO: renamed from: du */
    private AbstractC5746v4 m23240du(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 abstractC5746v4M23243h4 = m23243h4(abstractC5746v4);
        while (true) {
            int i = this.f15722k4.m23293x1() == 60 ? 5 : this.f15722k4.m23293x1() == 76 ? 6 : this.f15722k4.m23293x1() == 62 ? 7 : this.f15722k4.m23293x1() == 71 ? 8 : 0;
            if (i == 0) {
                return abstractC5746v4M23243h4;
            }
            m23249k4();
            abstractC5746v4M23243h4 = new C5736t6(i, abstractC5746v4M23243h4, m23243h4(abstractC5746v4));
        }
    }

    /* JADX INFO: renamed from: dy */
    private AbstractC5746v4 m23241dy(AbstractC5746v4 abstractC5746v4) {
        boolean z = false;
        while (this.f15722k4.m23293x1() == 45) {
            m23249k4();
            z = !z;
        }
        return z ? new C5736t6(11, m23238c5(abstractC5746v4), new C5732s7(-1.0d)) : m23238c5(abstractC5746v4);
    }

    /* JADX INFO: renamed from: fa */
    private AbstractC5746v4 m23242fa(AbstractC5746v4 abstractC5746v4) {
        m23262to(abstractC5746v4.mo23217x1());
        m23255kk(91);
        AbstractC5746v4 abstractC5746v4M23246k4 = m23246k4(abstractC5746v4);
        m23255kk(93);
        return abstractC5746v4M23246k4;
    }

    /* JADX INFO: renamed from: h4 */
    private AbstractC5746v4 m23243h4(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 abstractC5746v4M23258m9 = m23258m9(abstractC5746v4);
        while (true) {
            int i = this.f15722k4.m23293x1() == 43 ? 9 : this.f15722k4.m23293x1() == 45 ? 10 : 0;
            if (i == 0) {
                return abstractC5746v4M23258m9;
            }
            m23249k4();
            abstractC5746v4M23258m9 = new C5736t6(i, abstractC5746v4M23258m9, m23258m9(abstractC5746v4));
        }
    }

    /* JADX INFO: renamed from: ix */
    private AbstractC5746v4 m23244ix(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 c5723os;
        int iM23293x1 = this.f15722k4.m23293x1();
        if (iM23293x1 == 47) {
            m23249k4();
            c5723os = new C5723os();
            if (this.f15722k4.m23293x1() == 69 || this.f15722k4.m23293x1() == 124) {
                return c5723os;
            }
        } else if (iM23293x1 == 83) {
            m23249k4();
            c5723os = new C5740u1(5, new C5723os());
        } else if (iM23293x1 == 110 && this.f15722k4.m23291m9()) {
            c5723os = m23263u4(abstractC5746v4);
            if (c5723os != null) {
                int iM23293x12 = this.f15722k4.m23293x1();
                if (iM23293x12 == 47) {
                    m23249k4();
                } else {
                    if (iM23293x12 != 83) {
                        return c5723os;
                    }
                    m23249k4();
                    c5723os = new C5740u1(5, c5723os);
                }
            }
        } else {
            c5723os = null;
        }
        return m23265uz(c5723os);
    }

    /* JADX INFO: renamed from: jd */
    private AbstractC5746v4 m23245jd(AbstractC5746v4 abstractC5746v4) {
        if (!m23271x1(this.f15722k4)) {
            return m23264up(null);
        }
        AbstractC5746v4 abstractC5746v4M23239ck = m23239ck(abstractC5746v4);
        if (this.f15722k4.m23293x1() == 47) {
            m23249k4();
            return m23273yj(abstractC5746v4M23239ck);
        }
        if (this.f15722k4.m23293x1() != 83) {
            return abstractC5746v4M23239ck;
        }
        m23249k4();
        return m23273yj(new C5740u1(5, abstractC5746v4M23239ck));
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC5746v4 m23246k4(AbstractC5746v4 abstractC5746v4) {
        int i = this.f15723x1 + 1;
        this.f15723x1 = i;
        if (i > 200) {
            throw XPathException.create("The XPath query is too complex.");
        }
        this.f15723x1--;
        return m23268x1(abstractC5746v4);
    }

    /* JADX INFO: renamed from: kk */
    private int m23252kk(C5700gk c5700gk) {
        Object obj = f15721up.get_Item(c5700gk.m23290kk());
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        throw XPathException.create("'{0}' has an invalid token.", this.f15722k4.m23289k4());
    }

    /* JADX INFO: renamed from: ks */
    private AbstractC5746v4 m23257ks(AbstractC5746v4 abstractC5746v4) {
        int iM23252kk;
        if (46 == this.f15722k4.m23293x1()) {
            m23249k4();
            return new C5740u1(12, abstractC5746v4);
        }
        if (68 == this.f15722k4.m23293x1()) {
            m23249k4();
            return new C5740u1(9, abstractC5746v4);
        }
        int iM23293x1 = this.f15722k4.m23293x1();
        if (iM23293x1 == 64) {
            m23249k4();
            iM23252kk = 2;
        } else if (iM23293x1 != 97) {
            iM23252kk = 3;
        } else {
            iM23252kk = m23252kk(this.f15722k4);
            m23249k4();
        }
        AbstractC5746v4 abstractC5746v4M23247k4 = m23247k4(abstractC5746v4, iM23252kk, iM23252kk != 2 ? 1 : 2);
        while (91 == this.f15722k4.m23293x1()) {
            abstractC5746v4M23247k4 = new C5757x3(abstractC5746v4M23247k4, m23242fa(abstractC5746v4M23247k4));
        }
        return abstractC5746v4M23247k4;
    }

    /* JADX INFO: renamed from: m9 */
    private AbstractC5746v4 m23258m9(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 abstractC5746v4M23241dy = m23241dy(abstractC5746v4);
        while (true) {
            int i = this.f15722k4.m23293x1() == 42 ? 11 : m23256kk("div") ? 12 : m23256kk("mod") ? 13 : 0;
            if (i == 0) {
                return abstractC5746v4M23241dy;
            }
            m23249k4();
            abstractC5746v4M23241dy = new C5736t6(i, abstractC5746v4M23241dy, m23241dy(abstractC5746v4));
        }
    }

    /* JADX INFO: renamed from: ne */
    private AbstractC5746v4 m23259ne(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 abstractC5746v4M23244ix = m23244ix(abstractC5746v4);
        while (this.f15722k4.m23293x1() == 124) {
            m23249k4();
            abstractC5746v4M23244ix = new C5736t6(14, abstractC5746v4M23244ix, m23244ix(abstractC5746v4));
        }
        return abstractC5746v4M23244ix;
    }

    /* JADX INFO: renamed from: rv */
    private AbstractC5746v4 m23260rv(AbstractC5746v4 abstractC5746v4) {
        int iM23293x1 = this.f15722k4.m23293x1();
        if (iM23293x1 == 36) {
            m23249k4();
            m23270x1(110);
            C5686ca c5686ca = new C5686ca(this.f15722k4.m23290kk(), this.f15722k4.m23292to());
            m23249k4();
            return c5686ca;
        }
        if (iM23293x1 == 40) {
            m23249k4();
            AbstractC5746v4 abstractC5746v4M23246k4 = m23246k4(abstractC5746v4);
            if (abstractC5746v4M23246k4.ad_() != 3) {
                abstractC5746v4M23246k4 = new C5691du(abstractC5746v4M23246k4);
            }
            m23255kk(41);
            return abstractC5746v4M23246k4;
        }
        if (iM23293x1 == 100) {
            C5732s7 c5732s7 = new C5732s7(this.f15722k4.m23288h4());
            m23249k4();
            return c5732s7;
        }
        if (iM23293x1 == 110) {
            if (!this.f15722k4.m23291m9() || m23251k4(this.f15722k4)) {
                return null;
            }
            return m23272x6(null);
        }
        if (iM23293x1 != 115) {
            return null;
        }
        C5732s7 c5732s72 = new C5732s7(this.f15722k4.m23286du());
        m23249k4();
        return c5732s72;
    }

    /* JADX INFO: renamed from: to */
    private AbstractC5746v4 m23261to(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 abstractC5746v4M23240du = m23240du(abstractC5746v4);
        while (true) {
            int i = this.f15722k4.m23293x1() == 61 ? 3 : this.f15722k4.m23293x1() == 78 ? 4 : 0;
            if (i == 0) {
                return abstractC5746v4M23240du;
            }
            m23249k4();
            abstractC5746v4M23240du = new C5736t6(i, abstractC5746v4M23240du, m23240du(abstractC5746v4));
        }
    }

    /* JADX INFO: renamed from: u4 */
    private AbstractC5746v4 m23263u4(AbstractC5746v4 abstractC5746v4) {
        ArrayList arrayList = new ArrayList();
        if (this.f15722k4.m23292to().length() != 0) {
            return null;
        }
        if ("id".equals(this.f15722k4.m23290kk())) {
            k4 k4Var = (k4) f15715fa.get_Item("id");
            m23249k4();
            m23255kk(40);
            m23270x1(115);
            arrayList.addItem(new C5732s7(this.f15722k4.m23286du()));
            m23249k4();
            m23255kk(41);
            return new C5711kk(k4Var.m23274k4(), arrayList);
        }
        if (!"key".equals(this.f15722k4.m23290kk())) {
            return null;
        }
        m23249k4();
        m23255kk(40);
        m23270x1(115);
        arrayList.addItem(new C5732s7(this.f15722k4.m23286du()));
        m23249k4();
        m23255kk(44);
        m23270x1(115);
        arrayList.addItem(new C5732s7(this.f15722k4.m23286du()));
        m23249k4();
        m23255kk(41);
        return new C5711kk("", "key", arrayList);
    }

    /* JADX INFO: renamed from: up */
    private AbstractC5746v4 m23264up(AbstractC5746v4 abstractC5746v4) {
        if (this.f15722k4.m23293x1() == 47) {
            m23249k4();
            C5723os c5723os = new C5723os();
            return m23250k4(this.f15722k4.m23293x1()) ? m23273yj(c5723os) : c5723os;
        }
        if (this.f15722k4.m23293x1() != 83) {
            return m23273yj(abstractC5746v4);
        }
        m23249k4();
        return m23273yj(new C5740u1(5, new C5723os()));
    }

    /* JADX INFO: renamed from: uz */
    private AbstractC5746v4 m23265uz(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 abstractC5746v4M23266wl = m23266wl(abstractC5746v4);
        if (83 == this.f15722k4.m23293x1()) {
            m23249k4();
            return m23265uz(new C5740u1(5, abstractC5746v4M23266wl));
        }
        if (47 != this.f15722k4.m23293x1()) {
            return abstractC5746v4M23266wl;
        }
        m23249k4();
        return m23265uz(abstractC5746v4M23266wl);
    }

    /* JADX INFO: renamed from: wl */
    private AbstractC5746v4 m23266wl(AbstractC5746v4 abstractC5746v4) {
        int i;
        int iM23293x1 = this.f15722k4.m23293x1();
        if (iM23293x1 != 64) {
            i = 3;
            if (iM23293x1 == 97) {
                int iM23252kk = m23252kk(this.f15722k4);
                if (iM23252kk != 3 && iM23252kk != 2) {
                    throw XPathException.create("'{0}' has an invalid token.", this.f15722k4.m23289k4());
                }
                m23249k4();
                i = iM23252kk;
            }
        } else {
            m23249k4();
            i = 2;
        }
        AbstractC5746v4 abstractC5746v4M23247k4 = m23247k4(abstractC5746v4, i, i != 2 ? 1 : 2);
        while (91 == this.f15722k4.m23293x1()) {
            abstractC5746v4M23247k4 = new C5757x3(abstractC5746v4M23247k4, m23242fa(abstractC5746v4M23247k4));
        }
        return abstractC5746v4M23247k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static Hashtable m23267x1() {
        Hashtable hashtable = new Hashtable(36);
        int[] iArr = f15718kk;
        hashtable.addItem("last", new k4(0, 0, 0, iArr));
        hashtable.addItem(RequestParameters.POSITION, new k4(1, 0, 0, iArr));
        int[] iArr2 = f15720to;
        hashtable.addItem("name", new k4(6, 0, 1, iArr2));
        hashtable.addItem("namespace-uri", new k4(5, 0, 1, iArr2));
        hashtable.addItem("local-name", new k4(4, 0, 1, iArr2));
        hashtable.addItem(C18293o1.f55803f, new k4(2, 1, 1, iArr2));
        int[] iArr3 = f15713du;
        hashtable.addItem("id", new k4(3, 1, 1, iArr3));
        hashtable.addItem("string", new k4(7, 0, 1, iArr3));
        int[] iArr4 = f15716h4;
        hashtable.addItem("concat", new k4(13, 2, 100, iArr4));
        int[] iArr5 = f15719m9;
        hashtable.addItem("starts-with", new k4(14, 2, 2, iArr5));
        hashtable.addItem("contains", new k4(15, 2, 2, iArr5));
        hashtable.addItem("substring-before", new k4(16, 2, 2, iArr5));
        hashtable.addItem("substring-after", new k4(17, 2, 2, iArr5));
        hashtable.addItem("substring", new k4(18, 2, 3, f15714dy));
        hashtable.addItem("string-length", new k4(19, 0, 1, iArr4));
        hashtable.addItem("normalize-space", new k4(20, 0, 1, iArr4));
        hashtable.addItem("translate", new k4(21, 3, 3, f15711c5));
        hashtable.addItem("boolean", new k4(8, 1, 1, iArr3));
        int[] iArr6 = f15717jd;
        hashtable.addItem("not", new k4(12, 1, 1, iArr6));
        hashtable.addItem(TelemetryEventStrings.Value.TRUE, new k4(10, 0, 0, iArr6));
        hashtable.addItem(TelemetryEventStrings.Value.FALSE, new k4(11, 0, 0, iArr6));
        hashtable.addItem(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, new k4(22, 1, 1, iArr4));
        hashtable.addItem("number", new k4(9, 0, 1, iArr3));
        hashtable.addItem("sum", new k4(23, 1, 1, iArr2));
        int[] iArr7 = f15712ck;
        hashtable.addItem("floor", new k4(24, 1, 1, iArr7));
        hashtable.addItem("ceiling", new k4(25, 1, 1, iArr7));
        hashtable.addItem("round", new k4(26, 1, 1, iArr7));
        return hashtable;
    }

    /* JADX INFO: renamed from: x6 */
    private AbstractC5746v4 m23272x6(AbstractC5746v4 abstractC5746v4) {
        k4 k4Var;
        C5711kk c5711kk;
        ArrayList arrayList = new ArrayList();
        String strM23290kk = this.f15722k4.m23290kk();
        String strM23292to = this.f15722k4.m23292to();
        m23255kk(110);
        m23255kk(40);
        if (this.f15722k4.m23293x1() != 41) {
            while (true) {
                arrayList.addItem(m23246k4(abstractC5746v4));
                if (this.f15722k4.m23293x1() == 41) {
                    break;
                }
                m23255kk(44);
            }
        }
        m23255kk(41);
        if (strM23292to.length() != 0 || (k4Var = (k4) f15715fa.get_Item(strM23290kk)) == null) {
            return new C5711kk(strM23292to, strM23290kk, arrayList);
        }
        int size = arrayList.size();
        if (size < k4Var.m23277x1()) {
            throw XPathException.create("Function '{0}' in '{1}' has an invalid number of arguments.", strM23290kk, this.f15722k4.m23289k4());
        }
        int i = 0;
        if (k4Var.m23274k4() == 13) {
            while (i < size) {
                AbstractC5746v4 c5711kk2 = (AbstractC5746v4) arrayList.get_Item(i);
                if (c5711kk2.mo23217x1() != 1) {
                    c5711kk2 = new C5711kk(7, c5711kk2);
                }
                arrayList.set_Item(i, c5711kk2);
                i++;
            }
        } else {
            if (k4Var.m23275kk() < size) {
                throw XPathException.create("Function '{0}' in '{1}' has an invalid number of arguments.", strM23290kk, this.f15722k4.m23289k4());
            }
            if (k4Var.m23276to().length < size) {
                size = k4Var.m23276to().length;
            }
            while (i < size) {
                AbstractC5746v4 abstractC5746v42 = (AbstractC5746v4) arrayList.get_Item(i);
                if (k4Var.m23276to()[i] != 5 && k4Var.m23276to()[i] != abstractC5746v42.mo23217x1()) {
                    int i2 = k4Var.m23276to()[i];
                    if (i2 == 0) {
                        c5711kk = new C5711kk(9, abstractC5746v42);
                    } else if (i2 == 1) {
                        c5711kk = new C5711kk(7, abstractC5746v42);
                    } else if (i2 != 2) {
                        if (i2 == 3 && !C7019kk.m27469x1(abstractC5746v42, C5686ca.class) && (!C7019kk.m27469x1(abstractC5746v42, C5711kk.class) || abstractC5746v42.mo23217x1() != 5)) {
                            throw XPathException.create("The argument to function '{0}' in '{1}' cannot be converted to a node-set.", strM23290kk, this.f15722k4.m23289k4());
                        }
                        arrayList.set_Item(i, abstractC5746v42);
                    } else {
                        c5711kk = new C5711kk(8, abstractC5746v42);
                    }
                    abstractC5746v42 = c5711kk;
                    arrayList.set_Item(i, abstractC5746v42);
                }
                i++;
            }
        }
        return new C5711kk(k4Var.m23274k4(), arrayList);
    }

    /* JADX INFO: renamed from: yj */
    private AbstractC5746v4 m23273yj(AbstractC5746v4 abstractC5746v4) {
        while (true) {
            abstractC5746v4 = m23257ks(abstractC5746v4);
            if (83 == this.f15722k4.m23293x1()) {
                m23249k4();
                abstractC5746v4 = new C5740u1(5, abstractC5746v4);
            } else {
                if (47 != this.f15722k4.m23293x1()) {
                    return abstractC5746v4;
                }
                m23249k4();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC5746v4 m23247k4(AbstractC5746v4 abstractC5746v4, int i, int i2) {
        int i3;
        String str;
        String str2;
        String strM23290kk;
        int iM23293x1 = this.f15722k4.m23293x1();
        if (iM23293x1 == 42) {
            String str3 = C14113y2.f47374k4;
            m23249k4();
            i3 = i2;
            str = str3;
            str2 = str;
        } else {
            if (iM23293x1 != 110) {
                throw XPathException.create("Expression must evaluate to a node-set.", this.f15722k4.m23289k4());
            }
            if (this.f15722k4.m23291m9() && m23251k4(this.f15722k4)) {
                String str4 = C14113y2.f47374k4;
                int i4 = "comment".equals(this.f15722k4.m23290kk()) ? 8 : "text".equals(this.f15722k4.m23290kk()) ? 4 : "node".equals(this.f15722k4.m23290kk()) ? 9 : "processing-instruction".equals(this.f15722k4.m23290kk()) ? 7 : 0;
                m23249k4();
                m23255kk(40);
                if (i4 != 7 || this.f15722k4.m23293x1() == 41) {
                    strM23290kk = str4;
                } else {
                    m23270x1(115);
                    strM23290kk = this.f15722k4.m23286du();
                    m23249k4();
                }
                m23255kk(41);
                str = str4;
                i3 = i4;
            } else {
                String strM23292to = this.f15722k4.m23292to();
                strM23290kk = this.f15722k4.m23290kk();
                m23249k4();
                if (C18358t1.g.f56183c.equals(strM23290kk)) {
                    strM23290kk = C14113y2.f47374k4;
                }
                i3 = i2;
                str = strM23292to;
            }
            str2 = strM23290kk;
        }
        return new C5740u1(i, abstractC5746v4, str, str2, i3);
    }

    /* JADX INFO: renamed from: kk */
    private static Hashtable m23253kk() {
        Hashtable hashtable = new Hashtable(13);
        hashtable.addItem("ancestor", 0);
        hashtable.addItem("ancestor-or-self", 1);
        hashtable.addItem("attribute", 2);
        hashtable.addItem("child", 3);
        hashtable.addItem("descendant", 4);
        hashtable.addItem("descendant-or-self", 5);
        hashtable.addItem("following", 6);
        hashtable.addItem("following-sibling", 7);
        hashtable.addItem("namespace", 8);
        hashtable.addItem("parent", 9);
        hashtable.addItem("preceding", 10);
        hashtable.addItem("preceding-sibling", 11);
        hashtable.addItem("self", 12);
        return hashtable;
    }

    /* JADX INFO: renamed from: to */
    private void m23262to(int i) {
        if (i != 3 && i != 5) {
            throw XPathException.create("Expression must evaluate to a node-set.", this.f15722k4.m23289k4());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC5746v4 m23268x1(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 abstractC5746v4M23254kk = m23254kk(abstractC5746v4);
        while (m23256kk("or")) {
            m23249k4();
            abstractC5746v4M23254kk = new C5736t6(1, abstractC5746v4M23254kk, m23254kk(abstractC5746v4));
        }
        return abstractC5746v4M23254kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC5746v4 m23248k4(String str) {
        C5700gk c5700gk = new C5700gk(str);
        AbstractC5746v4 abstractC5746v4M23246k4 = new C5698gf(c5700gk).m23246k4((AbstractC5746v4) null);
        if (c5700gk.m23293x1() == 69) {
            return abstractC5746v4M23246k4;
        }
        throw XPathException.create("'{0}' has an invalid token.", c5700gk.m23289k4());
    }

    /* JADX INFO: renamed from: kk */
    private AbstractC5746v4 m23254kk(AbstractC5746v4 abstractC5746v4) {
        AbstractC5746v4 abstractC5746v4M23261to = m23261to(abstractC5746v4);
        while (m23256kk("and")) {
            m23249k4();
            abstractC5746v4M23261to = new C5736t6(2, abstractC5746v4M23261to, m23261to(abstractC5746v4));
        }
        return abstractC5746v4M23261to;
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC5746v4 m23269x1(String str) {
        C5700gk c5700gk = new C5700gk(str);
        AbstractC5746v4 abstractC5746v4M23259ne = new C5698gf(c5700gk).m23259ne(null);
        if (c5700gk.m23293x1() == 69) {
            return abstractC5746v4M23259ne;
        }
        throw XPathException.create("'{0}' has an invalid token.", c5700gk.m23289k4());
    }

    /* JADX INFO: renamed from: k4 */
    private void m23249k4() {
        this.f15722k4.m23287dy();
    }

    /* JADX INFO: renamed from: kk */
    private void m23255kk(int i) {
        m23270x1(i);
        m23249k4();
    }

    /* JADX INFO: renamed from: x1 */
    private void m23270x1(int i) {
        if (this.f15722k4.m23293x1() != i) {
            throw XPathException.create("'{0}' has an invalid token.", this.f15722k4.m23289k4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m23250k4(int i) {
        return i == 46 || i == 68 || i == 64 || i == 97 || i == 42 || i == 110;
    }

    /* JADX INFO: renamed from: kk */
    private boolean m23256kk(String str) {
        return this.f15722k4.m23293x1() == 110 && this.f15722k4.m23292to().length() == 0 && C14113y2.m67363du(this.f15722k4.m23290kk(), str);
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m23271x1(C5700gk c5700gk) {
        if (c5700gk.m23293x1() == 115 || c5700gk.m23293x1() == 100 || c5700gk.m23293x1() == 36 || c5700gk.m23293x1() == 40) {
            return true;
        }
        return c5700gk.m23293x1() == 110 && c5700gk.m23291m9() && !m23251k4(c5700gk);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m23251k4(C5700gk c5700gk) {
        if (c5700gk.m23292to().length() == 0) {
            return "node".equals(c5700gk.m23290kk()) || "text".equals(c5700gk.m23290kk()) || "processing-instruction".equals(c5700gk.m23290kk()) || "comment".equals(c5700gk.m23290kk());
        }
        return false;
    }
}
