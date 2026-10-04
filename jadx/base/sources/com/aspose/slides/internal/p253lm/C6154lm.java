package com.aspose.slides.internal.p253lm;

import androidx.datastore.preferences.protobuf.o000oOoO;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p492x4.AbstractC12384m9;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12383kk;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.AzureActiveDirectorySlice;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.lm */
/* JADX INFO: loaded from: classes4.dex */
public class C6154lm extends C6198wp {

    /* JADX INFO: renamed from: c5 */
    private static C12383kk f17372c5;

    /* JADX INFO: renamed from: ck */
    private static InterfaceC6173qw f17373ck;

    /* JADX INFO: renamed from: du */
    private static String f17374du;

    /* JADX INFO: renamed from: dy */
    private static String f17375dy;

    /* JADX INFO: renamed from: fa */
    private static String f17376fa;

    /* JADX INFO: renamed from: h4 */
    private static String f17377h4;

    /* JADX INFO: renamed from: jd */
    private static C6195vw f17378jd;

    /* JADX INFO: renamed from: ks */
    private static final C7017h4 f17379ks = new C7017h4("$$", "$&", "$`", "$'");

    /* JADX INFO: renamed from: m9 */
    private static String f17380m9;

    /* JADX INFO: renamed from: up */
    private static C6198wp f17381up;

    /* JADX INFO: renamed from: yj */
    private static String f17382yj;

    /* JADX INFO: renamed from: to */
    private InterfaceC6173qw f17383to;

    public C6154lm(InterfaceC6173qw interfaceC6173qw, String str, C6116bs c6116bs) {
        super(c6116bs);
        ((C6198wp) this).f17519k4 = str;
        this.f17383to = interfaceC6173qw;
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC6123ca m24885c5(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26792k4(abstractC6211yd.toString());
        for (AbstractC6123ca abstractC6123ca : abstractC6123caArr) {
            c6765kp.m26792k4(abstractC6123ca.toString());
        }
        return this.f17383to.mo24980v4().m25068h4(c6765kp.toString());
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC6123ca m24886ck(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        String string = abstractC6211yd.toString();
        return (C14113y2.m67411k4(string) || C7019kk.m27462to(Double.valueOf(abstractC6123caArr[0].mo24775x1()), 14) > string.length() + (-1)) ? this.f17383to.mo24973lr() : this.f17383to.mo24977um().m25186k4(C14080ne.m66993m9(Character.valueOf(string.charAt(r4))));
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC6123ca m24887du(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17383to.mo24977um().m25186k4(C14113y2.m67366h4(abstractC6211yd.toString(), abstractC6123caArr[0].toString()));
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC6123ca m24888dy(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if ("String".equals(abstractC6123caArr[0].mo24774to())) {
            abstractC6123caArr[0] = this.f17383to.mo24966bv().m25124k4(abstractC6123caArr[0].toString(), false, false, false);
        }
        C12385to c12385toM57989x1 = ((C6195vw) abstractC6123caArr[0]).m25130yj().m57989x1(abstractC6211yd.toString());
        return (c12385toM57989x1 == null || !c12385toM57989x1.mo58006to()) ? this.f17383to.mo24977um().m25186k4(-1.0d) : this.f17383to.mo24977um().m25186k4(c12385toM57989x1.mo57994k4());
    }

    /* JADX INFO: renamed from: fa */
    public final AbstractC6123ca m24889fa(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        String string = abstractC6211yd.toString();
        return this.f17383to.mo24977um().m25186k4(C14113y2.m67430to(C14113y2.m67443x1(string, 0, abstractC6123caArr.length > 1 ? C7019kk.m27462to(Double.valueOf(abstractC6123caArr[1].mo24775x1()), 14) : string.length()), abstractC6123caArr[0].toString()));
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC6123ca m24890h4(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123ca;
        String string = abstractC6211yd.toString();
        int length = string.length();
        int iM66994m9 = (abstractC6123caArr.length <= 0 || C14044b3.m66437kk(abstractC6123caArr[0].mo24775x1())) ? 0 : C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[0].mo24775x1()));
        if (abstractC6123caArr.length > 1 && (abstractC6123ca = abstractC6123caArr[1]) != C6163nh.f17403k4 && !C14044b3.m66437kk(abstractC6123ca.mo24775x1())) {
            length = C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[1].mo24775x1()));
        }
        int iM67507x1 = C14116yg.m67507x1(C14116yg.m67483k4(iM66994m9, 0), C14116yg.m67483k4(0, string.length() - 1));
        return this.f17383to.mo24980v4().m25068h4(C14113y2.m67443x1(string, iM67507x1, C14116yg.m67507x1(C14116yg.m67483k4(length, 0), string.length()) - iM67507x1));
    }

    /* JADX INFO: renamed from: ix */
    public final AbstractC6123ca m24891ix(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        String strM67441x1 = C14113y2.f47374k4;
        for (AbstractC6123ca abstractC6123ca : abstractC6123caArr) {
            strM67441x1 = C14113y2.m67441x1(strM67441x1, C14080ne.m67038x1(Long.valueOf(C14080ne.m66885dy(Double.valueOf(abstractC6123ca.mo24775x1())))));
        }
        return this.f17383to.mo24980v4().m25068h4(strM67441x1);
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC6123ca m24892jd(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return m24890h4(abstractC6211yd, new AbstractC6123ca[]{abstractC6123caArr[0], this.f17383to.mo24977um().m25186k4(abstractC6123caArr[0].mo24775x1() + 1.0d)});
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123caM24891ix;
        if ("get_length".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24895kk(abstractC6211yd);
        } else if ("split".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24894k4(abstractC6211yd, abstractC6123caArr);
        } else if ("replace".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24903x1(abstractC6211yd, abstractC6123caArr);
        } else if ("toString".equals(((C6198wp) this).f17519k4) || "toLocaleString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24896kk(abstractC6211yd, abstractC6123caArr);
        } else if ("match".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24901to(abstractC6211yd, abstractC6123caArr);
        } else if ("localeCompare".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24887du(abstractC6211yd, abstractC6123caArr);
        } else if ("substring".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24890h4(abstractC6211yd, abstractC6123caArr);
        } else if ("substr".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24898m9(abstractC6211yd, abstractC6123caArr);
        } else if (FirebaseAnalytics.Event.SEARCH.equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24888dy(abstractC6211yd, abstractC6123caArr);
        } else if ("valueOf".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24893k4((C6141he) C7019kk.m27452k4((Object) abstractC6211yd, C6141he.class), abstractC6123caArr);
        } else if ("concat".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24885c5(abstractC6211yd, abstractC6123caArr);
        } else if ("charAt".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24892jd(abstractC6211yd, abstractC6123caArr);
        } else if ("charCodeAt".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24886ck(abstractC6211yd, abstractC6123caArr);
        } else if ("lastIndexOf".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24889fa(abstractC6211yd, abstractC6123caArr);
        } else if ("indexOf".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24902up(abstractC6211yd, abstractC6123caArr);
        } else if ("toLowerCase".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24905yj(abstractC6211yd, abstractC6123caArr);
        } else if ("toLocaleLowerCase".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24897ks(abstractC6211yd, abstractC6123caArr);
        } else if ("toUpperCase".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24900rv(abstractC6211yd, abstractC6123caArr);
        } else if ("toLocaleUpperCase".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24904x6(abstractC6211yd, abstractC6123caArr);
        } else if (AzureActiveDirectorySlice.SLICE_PARAMETER.equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24891ix = m24899ne(abstractC6211yd, abstractC6123caArr);
        } else {
            if (!"fromCharCode".equals(((C6198wp) this).f17519k4)) {
                throw new C6208y2("unknown error function");
            }
            abstractC6123caM24891ix = m24891ix(abstractC6211yd, abstractC6123caArr);
        }
        interfaceC6132em.mo10079x1(abstractC6123caM24891ix);
        return abstractC6123caM24891ix;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC6123ca m24895kk(AbstractC6211yd abstractC6211yd) {
        return this.f17383to.mo24977um().m25186k4(abstractC6211yd.toString().length());
    }

    /* JADX INFO: renamed from: ks */
    public final AbstractC6123ca m24897ks(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17383to.mo24980v4().m25068h4(C14113y2.m67368h4(abstractC6211yd.toString()));
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC6123ca m24898m9(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123ca;
        String string = abstractC6211yd.toString();
        int length = string.length();
        int iM66994m9 = (abstractC6123caArr.length <= 0 || C14044b3.m66437kk(abstractC6123caArr[0].mo24775x1())) ? 0 : C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[0].mo24775x1()));
        if (abstractC6123caArr.length > 1 && (abstractC6123ca = abstractC6123caArr[1]) != C6163nh.f17403k4 && !C14044b3.m66437kk(abstractC6123ca.mo24775x1())) {
            length = C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[1].mo24775x1()));
        }
        int iM67507x1 = C14116yg.m67507x1(C14116yg.m67483k4(iM66994m9, 0), C14116yg.m67483k4(0, string.length() - 1));
        return this.f17383to.mo24980v4().m25068h4(C14113y2.m67443x1(string, iM67507x1, C14116yg.m67507x1(C14116yg.m67483k4(length, 0), string.length()) - iM67507x1));
    }

    /* JADX INFO: renamed from: ne */
    public final AbstractC6123ca m24899ne(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        String string = abstractC6211yd.toString();
        int iM27462to = C7019kk.m27462to(Double.valueOf(abstractC6123caArr[0].mo24775x1()), 14);
        int length = string.length();
        if (abstractC6123caArr.length > 1 && (length = C7019kk.m27462to(Double.valueOf(abstractC6123caArr[1].mo24775x1()), 14)) < 0) {
            length += string.length();
        }
        if (iM27462to < 0) {
            iM27462to += string.length();
        }
        return this.f17383to.mo24980v4().m25068h4(C14113y2.m67443x1(string, iM27462to, length - iM27462to));
    }

    /* JADX INFO: renamed from: rv */
    public final AbstractC6123ca m24900rv(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17383to.mo24980v4().m25068h4(C14113y2.m67371jd(abstractC6211yd.toString()));
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC6123ca m24901to(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        C6182to c6182to = (C6182to) this.f17383to.mo24966bv().m25123k4("String".equals(abstractC6123caArr[0].mo24774to()) ? this.f17383to.mo24966bv().m25124k4(abstractC6123caArr[0].toString(), false, false, false) : (C6195vw) abstractC6123caArr[0], new AbstractC6123ca[]{abstractC6211yd});
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[c6182to.mo24948kk()];
        for (int i = 0; i < c6182to.mo24948kk(); i++) {
            abstractC6123caArr2[i] = c6182to.mo25031k4((AbstractC6123ca) this.f17383to.mo24977um().m25186k4(i));
        }
        return this.f17383to.mo24983yj().m24810k4(abstractC6123caArr2);
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67402k4("function {0}", m25131fa());
    }

    /* JADX INFO: renamed from: up */
    public final AbstractC6123ca m24902up(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        String string = abstractC6211yd.toString();
        return C14113y2.m67411k4(abstractC6123caArr[0].toString()) ? abstractC6123caArr.length > 1 ? this.f17383to.mo24977um().m25186k4(C14116yg.m67507x1(string.length(), r0)) : this.f17383to.mo24977um().m25186k4(0.0d) : (abstractC6123caArr.length > 1 ? C7019kk.m27462to(Double.valueOf(abstractC6123caArr[1].mo24775x1()), 14) : 0) >= string.length() ? this.f17383to.mo24977um().m25186k4(-1.0d) : this.f17383to.mo24977um().m25186k4(C14113y2.m67378k4(string, r1, r0));
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m24903x1(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        if (abstractC6123caArr.length == 0) {
            return this.f17383to.mo24980v4().m25068h4(abstractC6211yd.toString());
        }
        AbstractC6123ca abstractC6123ca = abstractC6123caArr[0];
        AbstractC6123ca abstractC6123ca2 = C6163nh.f17403k4;
        if (abstractC6123caArr.length > 1) {
            abstractC6123ca2 = abstractC6123caArr[1];
        }
        String string = abstractC6211yd.toString();
        C6198wp c6198wp = (C6198wp) C7019kk.m27452k4((Object) abstractC6123ca2, C6198wp.class);
        if ("RegExp".equals(abstractC6123ca.mo24774to())) {
            int i = ((C6195vw) abstractC6123caArr[0]).m25127jd() ? Integer.MAX_VALUE : 1;
            C6195vw c6195vw = (C6195vw) abstractC6123caArr[0];
            int iM67483k4 = c6195vw.m25127jd() ? 0 : C14116yg.m67483k4(0, C7019kk.m27462to(Double.valueOf(c6195vw.mo25032k4("lastIndex").mo24775x1()), 14) - 1);
            if (c6195vw.m25127jd()) {
                c6195vw.mo25037k4("lastIndex", this.f17383to.mo24977um().m25186k4(0.0d));
            }
            if (c6198wp != null) {
                f17378jd = c6195vw;
                f17373ck = this.f17383to;
                f17376fa = string;
                f17381up = c6198wp;
                return this.f17383to.mo24980v4().m25068h4(((C6195vw) abstractC6123caArr[0]).m25130yj().m57983k4(string, new AbstractC12384m9() { // from class: com.aspose.slides.internal.lm.lm.2
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return "Aspose.JavaScript.StringFunction.matchEvaluator2(System.Text.RegularExpressions.Match)";
                    }

                    @Override // com.aspose.slides.internal.p492x4.AbstractC12384m9
                    /* JADX INFO: renamed from: k4 */
                    public String mo24906k4(C12385to c12385to) {
                        return C6154lm.m24878du(c12385to);
                    }
                }, i, iM67483k4));
            }
            f17382yj = abstractC6123caArr[1].toString();
            f17378jd = c6195vw;
            f17373ck = this.f17383to;
            f17376fa = string;
            return this.f17383to.mo24980v4().m25068h4(((C6195vw) abstractC6123caArr[0]).m25130yj().m57983k4(abstractC6211yd.toString(), new AbstractC12384m9() { // from class: com.aspose.slides.internal.lm.lm.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return "Aspose.JavaScript.StringFunction.matchEvaluator3(System.Text.RegularExpressions.Match)";
                }

                @Override // com.aspose.slides.internal.p492x4.AbstractC12384m9
                /* JADX INFO: renamed from: k4 */
                public String mo24906k4(C12385to c12385to) {
                    return C6154lm.m24879h4(c12385to);
                }
            }, i, iM67483k4));
        }
        String string2 = abstractC6123ca.toString();
        int iM67364dy = C14113y2.m67364dy(string, string2);
        if (iM67364dy == -1) {
            return this.f17383to.mo24980v4().m25068h4(string);
        }
        if (c6198wp == null) {
            String strM67443x1 = C14113y2.m67443x1(string, 0, iM67364dy);
            String strM67422kk = C14113y2.m67422kk(string, string2.length() + iM67364dy);
            return this.f17383to.mo24980v4().m25068h4(C14113y2.m67408k4(strM67443x1, m24881k4(string2, strM67443x1, strM67422kk, abstractC6123ca2.toString(), null), strM67422kk));
        }
        List list = new List();
        list.addItem(this.f17383to.mo24980v4().m25068h4(string2));
        list.addItem(this.f17383to.mo24977um().m25186k4(iM67364dy));
        list.addItem(this.f17383to.mo24980v4().m25068h4(string));
        AbstractC6123ca[] abstractC6123caArr2 = new AbstractC6123ca[list.size()];
        IGenericEnumerator<T> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            try {
                int i3 = i2 + 1;
                abstractC6123caArr2[i2] = (AbstractC6123ca) it.next();
                i2 = i3;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f17383to.mo24969jd().mo10069k4(c6198wp, null, abstractC6123caArr2);
        return this.f17383to.mo24980v4().m25068h4(C14113y2.m67408k4(C14113y2.m67443x1(string, 0, iM67364dy), this.f17383to.mo24969jd().mo10039c5().toString(), C14113y2.m67422kk(string, string2.length() + iM67364dy)));
    }

    /* JADX INFO: renamed from: x6 */
    public final AbstractC6123ca m24904x6(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17383to.mo24980v4().m25068h4(C14113y2.m67358c5(abstractC6211yd.toString()));
    }

    /* JADX INFO: renamed from: yj */
    public final AbstractC6123ca m24905yj(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17383to.mo24980v4().m25068h4(C14113y2.m67361du(abstractC6211yd.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: du */
    public static String m24878du(C12385to c12385to) {
        List list = new List();
        if (!f17378jd.m25127jd()) {
            f17378jd.mo25037k4("lastIndex", f17373ck.mo24977um().m25186k4(c12385to.mo57994k4() + 1));
        }
        list.addItem(f17373ck.mo24980v4().m25068h4(c12385to.mo57995kk()));
        for (int i = 1; i < c12385to.m58004du().m57999k4(); i++) {
            list.addItem(o000oOoO.OooO0OO(c12385to, i) ? f17373ck.mo24980v4().m25068h4(c12385to.m58004du().m58000k4(i).mo57995kk()) : C6163nh.f17403k4);
        }
        list.addItem(f17373ck.mo24977um().m25186k4(c12385to.mo57994k4()));
        list.addItem(f17373ck.mo24980v4().m25068h4(f17376fa));
        AbstractC6123ca[] abstractC6123caArr = new AbstractC6123ca[list.size()];
        IGenericEnumerator<T> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            try {
                int i3 = i2 + 1;
                abstractC6123caArr[i2] = (AbstractC6123ca) it.next();
                i2 = i3;
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        f17373ck.mo24969jd().mo10069k4(f17381up, null, abstractC6123caArr);
        return f17373ck.mo24969jd().mo10077m9().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public static String m24879h4(C12385to c12385to) {
        if (!f17378jd.m25127jd()) {
            f17378jd.mo25037k4("lastIndex", f17373ck.mo24977um().m25186k4(c12385to.mo57994k4() + 1));
        }
        return m24881k4(c12385to.mo57995kk(), C14113y2.m67443x1(f17376fa, 0, c12385to.mo57994k4()), C14113y2.m67422kk(f17376fa, C14116yg.m67507x1(r0.length() - 1, c12385to.mo57996x1() + c12385to.mo57994k4())), f17382yj, c12385to.m58004du());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public static String m24883to(C12385to c12385to) {
        int iM27428k4 = f17379ks.m27428k4(c12385to.mo57995kk());
        if (iM27428k4 == 0) {
            return "$";
        }
        if (iM27428k4 == 1) {
            return f17374du;
        }
        if (iM27428k4 == 2) {
            return f17377h4;
        }
        if (iM27428k4 == 3) {
            return f17380m9;
        }
        int iM66582k4 = C14057f9.m66582k4(C14113y2.m67422kk(c12385to.mo57995kk(), 1));
        return iM66582k4 == 0 ? c12385to.mo57995kk() : f17372c5.m58000k4(iM66582k4).mo57995kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m24893k4(C6141he c6141he, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17383to.mo24980v4().m25068h4(c6141he.toString());
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC6123ca m24896kk(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        return this.f17383to.mo24980v4().m25068h4(abstractC6211yd.toString());
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m24894k4(AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        C6182to c6182toM24811m9 = this.f17383to.mo24983yj().m24811m9();
        String string = abstractC6211yd.toString();
        if (abstractC6123caArr.length == 0 || abstractC6123caArr[0] == C6163nh.f17403k4) {
            c6182toM24811m9.mo25037k4("0", this.f17383to.mo24980v4().m25068h4(string));
        }
        AbstractC6123ca abstractC6123ca = abstractC6123caArr[0];
        int iM66994m9 = abstractC6123caArr.length > 1 ? C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[1].mo24775x1())) : Integer.MAX_VALUE;
        String[] strArrM57985k4 = "RegExp".equals(abstractC6123ca.mo24774to()) ? ((C6195vw) abstractC6123caArr[0]).m25130yj().m57985k4(string, iM66994m9) : C14113y2.m67451x1(string, new String[]{abstractC6123ca.toString()}, iM66994m9, 0);
        for (int i = 0; i < strArrM57985k4.length; i++) {
            c6182toM24811m9.mo25037k4(C14057f9.m66591x1(i), this.f17383to.mo24980v4().m25068h4(strArrM57985k4[i]));
        }
        return c6182toM24811m9;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m24881k4(String str, String str2, String str3, String str4, C12383kk c12383kk) {
        if (C14113y2.m67364dy(str4, "$") == -1) {
            return str4;
        }
        f17374du = str;
        f17377h4 = str2;
        f17380m9 = str3;
        f17375dy = str4;
        f17372c5 = c12383kk;
        return new C12380dy("\\$\\$|\\$&|\\$`|\\$'|\\$\\d{1,2}", 0).m57982k4(str4, new AbstractC12384m9() { // from class: com.aspose.slides.internal.lm.lm.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.JavaScript.StringFunction.matchEvaluator1(System.Text.RegularExpressions.Match)";
            }

            @Override // com.aspose.slides.internal.p492x4.AbstractC12384m9
            /* JADX INFO: renamed from: k4 */
            public String mo24906k4(C12385to c12385to) {
                return C6154lm.m24883to(c12385to);
            }
        });
    }
}
