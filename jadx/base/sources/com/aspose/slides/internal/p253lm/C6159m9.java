package com.aspose.slides.internal.p253lm;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;
import com.microsoft.identity.common.java.providers.oauth2.TokenRequest;
import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C6159m9 extends C6198wp {

    /* JADX INFO: renamed from: to */
    private InterfaceC6173qw f17396to;

    public C6159m9(InterfaceC6173qw interfaceC6173qw, String str, C6116bs c6116bs) {
        super(c6116bs);
        ((C6198wp) this).f17519k4 = str;
        this.f17396to = interfaceC6173qw;
    }

    /* JADX INFO: renamed from: ck */
    private AbstractC6123ca m24922ck(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        c6116bs.mo24947k4(C7019kk.m27462to(Double.valueOf(abstractC6123caArr[0].mo24775x1()), 14));
        return abstractC6123caArr[0];
    }

    /* JADX INFO: renamed from: kk */
    private AbstractC6123ca m24923kk(C6116bs c6116bs) {
        return this.f17396to.mo24977um().m25186k4(c6116bs.mo24948kk());
    }

    /* JADX INFO: renamed from: to */
    public static AbstractC6123ca m24925to(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        int iMo24948kk = c6116bs.mo24948kk() / 2;
        for (int i = 0; i != iMo24948kk; i++) {
            String strM66591x1 = C14057f9.m66591x1((r10 - i) - 1);
            String strM66591x12 = C14057f9.m66591x1(i);
            AbstractC6123ca[] abstractC6123caArr2 = {null};
            boolean zMo25038k4 = c6116bs.mo25038k4(strM66591x12, abstractC6123caArr2);
            AbstractC6123ca abstractC6123ca = abstractC6123caArr2[0];
            AbstractC6123ca[] abstractC6123caArr3 = {null};
            boolean zMo25038k42 = c6116bs.mo25038k4(strM66591x1, abstractC6123caArr3);
            AbstractC6123ca abstractC6123ca2 = abstractC6123caArr3[0];
            if (zMo25038k4) {
                c6116bs.mo25037k4(strM66591x1, abstractC6123ca);
            } else {
                c6116bs.mo25041x1(strM66591x1);
            }
            if (zMo25038k42) {
                c6116bs.mo25037k4(strM66591x12, abstractC6123ca2);
            } else {
                c6116bs.mo25041x1(strM66591x12);
            }
        }
        return c6116bs;
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC6123ca m24927c5(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        int iM27462to;
        if (abstractC6123caArr.length != 0 && (iM27462to = C7019kk.m27462to(Double.valueOf(c6116bs.mo25032k4("length").mo24775x1()), 14)) != 0) {
            int iM66994m9 = abstractC6123caArr.length > 1 ? C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[1].mo24775x1())) : 0;
            if (iM66994m9 >= iM27462to) {
                return this.f17396to.mo24977um().m25186k4(-1.0d);
            }
            AbstractC6123ca abstractC6123ca = abstractC6123caArr[0];
            if (iM66994m9 < 0) {
                iM66994m9 = iM27462to - C14116yg.m67482k4(iM66994m9);
            }
            while (iM66994m9 < iM27462to) {
                AbstractC6123ca[] abstractC6123caArr2 = {null};
                boolean zMo25038k4 = c6116bs.mo25038k4(C14057f9.m66591x1(iM66994m9), abstractC6123caArr2);
                AbstractC6123ca abstractC6123ca2 = abstractC6123caArr2[0];
                if (zMo25038k4 && abstractC6123ca2.equals(abstractC6123ca)) {
                    return this.f17396to.mo24977um().m25186k4(iM66994m9);
                }
                iM66994m9++;
            }
            return this.f17396to.mo24977um().m25186k4(-1.0d);
        }
        return this.f17396to.mo24977um().m25186k4(-1.0d);
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC6123ca m24928du(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        int iM27462to = C7019kk.m27462to(Double.valueOf(abstractC6123caArr[0].mo24775x1()), 14);
        int iMo24948kk = c6116bs.mo24948kk();
        if (abstractC6123caArr.length > 1) {
            iMo24948kk = C7019kk.m27462to(Double.valueOf(abstractC6123caArr[1].mo24775x1()), 14);
        }
        if (iM27462to < 0) {
            iM27462to += c6116bs.mo24948kk();
        }
        if (iMo24948kk < 0) {
            iMo24948kk += c6116bs.mo24948kk();
        }
        if (iM27462to > c6116bs.mo24948kk()) {
            iM27462to = c6116bs.mo24948kk();
        }
        if (iMo24948kk > c6116bs.mo24948kk()) {
            iMo24948kk = c6116bs.mo24948kk();
        }
        C6182to c6182toM24811m9 = this.f17396to.mo24983yj().m24811m9();
        while (iM27462to < iMo24948kk) {
            m24934k4((AbstractC6211yd) c6182toM24811m9, new AbstractC6123ca[]{c6116bs.mo25031k4((AbstractC6123ca) this.f17396to.mo24977um().m25186k4(iM27462to))});
            iM27462to++;
        }
        return c6182toM24811m9;
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC6123ca m24929dy(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        for (int iMo24948kk = c6116bs.mo24948kk(); iMo24948kk > 0; iMo24948kk--) {
            String strM66591x1 = C14057f9.m66591x1(iMo24948kk - 1);
            String strM66591x12 = C14057f9.m66591x1((abstractC6123caArr.length + iMo24948kk) - 1);
            AbstractC6123ca[] abstractC6123caArr2 = {null};
            boolean zMo25038k4 = c6116bs.mo25038k4(strM66591x1, abstractC6123caArr2);
            AbstractC6123ca abstractC6123ca = abstractC6123caArr2[0];
            if (zMo25038k4) {
                c6116bs.mo25037k4(strM66591x12, abstractC6123ca);
            } else {
                c6116bs.mo25041x1(strM66591x12);
            }
        }
        List list = new List(AbstractC14092to.m67204k4((Object[]) abstractC6123caArr));
        int i = 0;
        while (list.size() > 0) {
            AbstractC6123ca abstractC6123ca2 = (AbstractC6123ca) list.get_Item(0);
            list.removeAt(0);
            c6116bs.mo25037k4(C14057f9.m66591x1(i), abstractC6123ca2);
            i++;
        }
        return this.f17396to.mo24977um().m25186k4(c6116bs.mo24948kk());
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC6123ca m24930h4(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        if (c6116bs.mo24948kk() > 1) {
            C6198wp c6197wl = abstractC6123caArr.length > 0 ? (C6198wp) C7019kk.m27452k4((Object) abstractC6123caArr[0], C6198wp.class) : null;
            List list = new List();
            int iM27462to = C7019kk.m27462to(Double.valueOf(c6116bs.mo25032k4("length").mo24775x1()), 14);
            for (int i = 0; i < iM27462to; i++) {
                list.addItem(c6116bs.mo25032k4(C14057f9.m66591x1(i)));
            }
            if (c6197wl == null) {
                c6197wl = new C6197wl(this.f17396to);
            }
            try {
                list.sort(new C6190uz(this.f17396to.mo24969jd(), c6197wl));
                for (int i2 = 0; i2 < iM27462to; i2++) {
                    c6116bs.mo25037k4(C14057f9.m66591x1(i2), (AbstractC6123ca) list.get_Item(i2));
                }
            } catch (Exception e) {
                if (C7019kk.m27469x1(e.getInnerException(), C6158m4.class)) {
                    throw ((Exception) e.getInnerException());
                }
                throw e;
            }
        }
        return c6116bs;
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC6123ca m24931jd(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        int iMo24948kk;
        if (abstractC6123caArr.length != 0 && (iMo24948kk = c6116bs.mo24948kk()) != 0) {
            int iM66994m9 = abstractC6123caArr.length > 1 ? C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[1].mo24775x1())) : iMo24948kk;
            AbstractC6123ca abstractC6123ca = abstractC6123caArr[0];
            for (int iM67507x1 = iM66994m9 >= 0 ? C14116yg.m67507x1(iM66994m9, iMo24948kk - 1) : iMo24948kk - C14116yg.m67482k4(iM66994m9 - 1); iM67507x1 >= 0; iM67507x1--) {
                AbstractC6123ca[] abstractC6123caArr2 = {null};
                boolean zMo25038k4 = c6116bs.mo25038k4(C14057f9.m66591x1(iM67507x1), abstractC6123caArr2);
                AbstractC6123ca abstractC6123ca2 = abstractC6123caArr2[0];
                if (zMo25038k4 && abstractC6123ca2.equals(abstractC6123ca)) {
                    return this.f17396to.mo24977um().m25186k4(iM67507x1);
                }
            }
            return this.f17396to.mo24977um().m25186k4(-1.0d);
        }
        return this.f17396to.mo24977um().m25186k4(-1.0d);
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m24932k4(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        return ((C6182to) c6116bs).m25034k4(this.f17396to, abstractC6123caArr);
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC6123ca m24935m9(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        int i;
        C6182to c6182toM24811m9 = this.f17396to.mo24983yj().m24811m9();
        int iM66994m9 = C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[0].mo24775x1()));
        int iMo24948kk = c6116bs.mo24948kk();
        int iM67483k4 = iM66994m9 < 0 ? C14116yg.m67483k4(iMo24948kk + iM66994m9, 0) : C14116yg.m67507x1(iM66994m9, iMo24948kk);
        int iM67507x1 = C14116yg.m67507x1(C14116yg.m67483k4(C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[1].mo24775x1())), 0), c6116bs.mo24948kk() - iM67483k4);
        int iMo24948kk2 = c6116bs.mo24948kk();
        for (int i2 = 0; i2 < iM67507x1; i2++) {
            AbstractC6123ca[] abstractC6123caArr2 = {null};
            boolean zMo25038k4 = c6116bs.mo25038k4(C14057f9.m66591x1(iM66994m9 + i2), abstractC6123caArr2);
            AbstractC6123ca abstractC6123ca = abstractC6123caArr2[0];
            if (zMo25038k4) {
                c6182toM24811m9.m25030k4(i2, abstractC6123ca);
            }
        }
        List list = new List();
        for (AbstractC6123ca abstractC6123ca2 : abstractC6123caArr) {
            list.addItem(abstractC6123ca2);
        }
        list.removeAt(0);
        list.removeAt(0);
        if (list.size() < iM67507x1) {
            while (true) {
                i = iMo24948kk2 - iM67507x1;
                if (iM67483k4 >= i) {
                    break;
                }
                String strM66591x1 = C14057f9.m66591x1(iM67483k4 + iM67507x1);
                String strM66591x12 = C14057f9.m66591x1(list.size() + iM67483k4);
                AbstractC6123ca[] abstractC6123caArr3 = {null};
                boolean zMo25038k42 = c6116bs.mo25038k4(strM66591x1, abstractC6123caArr3);
                AbstractC6123ca abstractC6123ca3 = abstractC6123caArr3[0];
                if (zMo25038k42) {
                    c6116bs.mo25037k4(strM66591x12, abstractC6123ca3);
                } else {
                    c6116bs.mo25041x1(strM66591x12);
                }
                iM67483k4++;
            }
            for (int iMo24948kk3 = c6116bs.mo24948kk(); iMo24948kk3 > list.size() + i; iMo24948kk3--) {
                c6116bs.mo25041x1(C14057f9.m66591x1(iMo24948kk3 - 1));
            }
            c6116bs.mo24947k4(list.size() + i);
        } else {
            for (int i3 = iMo24948kk2 - iM67507x1; i3 > iM67483k4; i3--) {
                String strM66591x13 = C14057f9.m66591x1((i3 + iM67507x1) - 1);
                String strM66591x14 = C14057f9.m66591x1((list.size() + i3) - 1);
                AbstractC6123ca[] abstractC6123caArr4 = {null};
                boolean zMo25038k43 = c6116bs.mo25038k4(strM66591x13, abstractC6123caArr4);
                AbstractC6123ca abstractC6123ca4 = abstractC6123caArr4[0];
                if (zMo25038k43) {
                    c6116bs.mo25037k4(strM66591x14, abstractC6123ca4);
                } else {
                    c6116bs.mo25041x1(strM66591x14);
                }
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            c6116bs.mo25037k4(C14057f9.m66591x1(i4), (AbstractC6123ca) list.get_Item(i4));
        }
        return c6182toM24811m9;
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67402k4("function {0}", m25131fa());
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m24936x1(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        return ((C6182to) c6116bs).m25033k4(this.f17396to, abstractC6123caArr.length > 0 ? abstractC6123caArr[0] : C6163nh.f17403k4);
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC6123ca m24924kk(C6116bs c6116bs, AbstractC6123ca[] abstractC6123caArr) {
        long jM66887dy = C14080ne.m66887dy(Integer.valueOf(c6116bs.mo24948kk())) & 4294967295L;
        if (jM66887dy == 0) {
            return C6163nh.f17403k4;
        }
        String strM67465x1 = C14114y9.m67465x1((jM66887dy - 1) & 4294967295L);
        AbstractC6123ca abstractC6123caMo25032k4 = c6116bs.mo25032k4(strM67465x1);
        c6116bs.mo25041x1(strM67465x1);
        c6116bs.mo24947k4(c6116bs.mo24948kk() - 1);
        return abstractC6123caMo25032k4;
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123caM24931jd;
        if ("get_length".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24923kk((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class));
        } else if ("set_length".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24922ck((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        } else if ("toString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24933k4((C6182to) C7019kk.m27452k4((Object) abstractC6211yd, C6182to.class), abstractC6123caArr);
        } else if ("toLocaleString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24937x1((C6182to) C7019kk.m27452k4((Object) abstractC6211yd, C6182to.class), abstractC6123caArr);
        } else if ("concat".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24932k4((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        } else if ("join".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24936x1((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        } else if (TokenRequest.TokenType.POP.equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24924kk((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        } else if ("push".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24934k4(abstractC6211yd, abstractC6123caArr);
        } else if ("reverse".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24925to((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        } else if ("shift".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24926x1(abstractC6211yd, abstractC6123caArr);
        } else if (AzureActiveDirectorySlice.SLICE_PARAMETER.equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24928du((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        } else if (NoteMeta.PROPERTY_SORT_KEY.equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24930h4((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        } else if ("splice".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24935m9((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        } else if ("unshift".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24929dy((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        } else if ("indexOf".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24931jd = m24927c5((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        } else {
            if (!"lastIndexOf".equals(((C6198wp) this).f17519k4)) {
                throw new C6208y2("unknown array function");
            }
            abstractC6123caM24931jd = m24931jd((C6116bs) C7019kk.m27452k4((Object) abstractC6211yd, C6116bs.class), abstractC6123caArr);
        }
        interfaceC6132em.mo10079x1(abstractC6123caM24931jd);
        return abstractC6123caM24931jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m24937x1(C6182to c6182to, AbstractC6123ca[] abstractC6123caArr) {
        C6182to c6182toM24811m9 = this.f17396to.mo24983yj().m24811m9();
        for (int i = 0; i < c6182to.mo24948kk(); i++) {
            AbstractC6211yd abstractC6211yd = (AbstractC6211yd) c6182to.mo25032k4(C14057f9.m66591x1(i));
            this.f17396to.mo24969jd().mo10069k4((C6198wp) abstractC6211yd.mo25032k4("toLocaleString"), abstractC6211yd, abstractC6123caArr);
            c6182toM24811m9.mo25037k4(C14057f9.m66591x1(i), this.f17396to.mo24969jd().mo10077m9());
        }
        return this.f17396to.mo24980v4().m25068h4(c6182toM24811m9.toString());
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC6123ca m24926x1(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6211yd.mo24948kk() == 0) {
            return C6163nh.f17403k4;
        }
        AbstractC6123ca abstractC6123caMo25032k4 = abstractC6211yd.mo25032k4(C14057f9.m66591x1(0));
        for (int i = 1; i < abstractC6211yd.mo24948kk(); i++) {
            String strM66591x1 = C14057f9.m66591x1(i);
            String strM66591x12 = C14057f9.m66591x1(i - 1);
            AbstractC6123ca[] abstractC6123caArr2 = {null};
            boolean zMo25038k4 = abstractC6211yd.mo25038k4(strM66591x1, abstractC6123caArr2);
            AbstractC6123ca abstractC6123ca = abstractC6123caArr2[0];
            if (zMo25038k4) {
                abstractC6211yd.mo25037k4(strM66591x12, abstractC6123ca);
            } else {
                abstractC6211yd.mo25041x1(strM66591x12);
            }
        }
        abstractC6211yd.mo25041x1(C14057f9.m66591x1(abstractC6211yd.mo24948kk() - 1));
        abstractC6211yd.mo24947k4(abstractC6211yd.mo24948kk() - 1);
        return abstractC6123caMo25032k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m24933k4(C6182to c6182to, AbstractC6123ca[] abstractC6123caArr) {
        C6198wp c6198wp;
        String strM66591x1;
        AbstractC6123ca abstractC6123caMo10077m9;
        C6182to c6182toM24811m9 = this.f17396to.mo24983yj().m24811m9();
        for (int i = 0; i < c6182to.mo24948kk(); i++) {
            AbstractC6211yd abstractC6211yd = (AbstractC6211yd) c6182to.mo25032k4(C14057f9.m66591x1(i));
            if (C6184ts.m25048kk(abstractC6211yd) || (c6198wp = (C6198wp) C7019kk.m27452k4((Object) abstractC6211yd.mo25032k4("toString"), C6198wp.class)) == null) {
                strM66591x1 = C14057f9.m66591x1(i);
                abstractC6123caMo10077m9 = this.f17396to.mo24980v4().m25069jd();
            } else {
                this.f17396to.mo24969jd().mo10069k4(c6198wp, abstractC6211yd, abstractC6123caArr);
                strM66591x1 = C14057f9.m66591x1(i);
                abstractC6123caMo10077m9 = this.f17396to.mo24969jd().mo10077m9();
            }
            c6182toM24811m9.mo25037k4(strM66591x1, abstractC6123caMo10077m9);
        }
        return this.f17396to.mo24980v4().m25068h4(c6182toM24811m9.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m24934k4(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        int iM27462to = C7019kk.m27462to(Double.valueOf(abstractC6211yd.mo25032k4("length").mo24775x1()), 14);
        for (AbstractC6123ca abstractC6123ca : abstractC6123caArr) {
            abstractC6211yd.mo25035k4(this.f17396to.mo24977um().m25186k4(iM27462to), abstractC6123ca);
            iM27462to++;
        }
        return this.f17396to.mo24977um().m25186k4(iM27462to);
    }
}
