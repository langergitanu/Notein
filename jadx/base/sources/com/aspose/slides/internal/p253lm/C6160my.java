package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.my */
/* JADX INFO: loaded from: classes4.dex */
public class C6160my extends C6198wp {

    /* JADX INFO: renamed from: du */
    private static final char[] f17397du = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* JADX INFO: renamed from: to */
    private final InterfaceC6173qw f17398to;

    public C6160my(InterfaceC6173qw interfaceC6173qw, String str, C6116bs c6116bs) {
        super(c6116bs);
        ((C6198wp) this).f17519k4 = str;
        this.f17398to = interfaceC6173qw;
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC6123ca m24938du(AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        if (C14044b3.m66439x1(abstractC6123ca.mo24775x1()) || C14044b3.m66437kk(abstractC6123ca.mo24775x1())) {
            return m24939k4(abstractC6123ca, new AbstractC6123ca[0]);
        }
        if (abstractC6123caArr.length == 0) {
            throw new C6158m4(this.f17398to.mo24979uz().m25165h4("precision missing"));
        }
        AbstractC6123ca abstractC6123ca2 = abstractC6123caArr[0];
        if (abstractC6123ca2 == C6163nh.f17403k4) {
            return m24939k4(abstractC6123ca, new AbstractC6123ca[0]);
        }
        int iM66994m9 = abstractC6123caArr.length > 0 ? C14080ne.m66994m9(Double.valueOf(abstractC6123ca2.mo24775x1())) : 0;
        if (iM66994m9 < 1 || iM66994m9 > 21) {
            throw new C6158m4(this.f17398to.mo24968ix().m25165h4("precision must be between 1 and 21"));
        }
        String strM66434k4 = C14044b3.m66434k4(abstractC6123ca.mo24775x1(), "e23", C11697x1.m55250kk());
        int iM67384k4 = C14113y2.m67384k4(strM66434k4, new char[]{FilenameUtils.EXTENSION_SEPARATOR, 'e'});
        if (iM67384k4 == -1) {
            iM67384k4 = strM66434k4.length();
        }
        int i = iM66994m9 - iM67384k4;
        return this.f17398to.mo24980v4().m25068h4(C14044b3.m66434k4(abstractC6123ca.mo24775x1(), C14113y2.m67408k4("e", C14057f9.m66591x1(i >= 1 ? i : 1)), C11697x1.m55250kk()));
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC6123ca m24939k4(AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123ca2;
        if (abstractC6123ca == mo25032k4("NaN")) {
            return this.f17398to.mo24980v4().m25068h4("NaN");
        }
        if (abstractC6123ca == mo25032k4("NEGATIVE_INFINITY")) {
            return this.f17398to.mo24980v4().m25068h4("-Infinity");
        }
        if (abstractC6123ca == mo25032k4("POSITIVE_INFINITY")) {
            return this.f17398to.mo24980v4().m25068h4("Infinity");
        }
        int i = 0;
        int iM27462to = (abstractC6123caArr.length <= 0 || (abstractC6123ca2 = abstractC6123caArr[0]) == C6163nh.f17403k4) ? 10 : C7019kk.m27462to(Double.valueOf(abstractC6123ca2.mo24775x1()), 14);
        long jM27438h4 = C7019kk.m27438h4(Double.valueOf(abstractC6123ca.mo24775x1()), 14);
        if (iM27462to == 10) {
            return this.f17398to.mo24980v4().m25068h4(C14113y2.m67368h4(C14044b3.m66432k4(abstractC6123ca.mo24775x1(), (InterfaceC14073kp) C11697x1.m55250kk())));
        }
        long jM67485k4 = C14116yg.m67485k4(jM27438h4);
        char[] cArr = new char[63];
        while (i <= 64 && jM67485k4 != 0) {
            long j = iM27462to;
            cArr[62 - i] = f17397du[(int) (jM67485k4 % j)];
            jM67485k4 /= j;
            i++;
        }
        if (jM27438h4 < 0) {
            cArr[62 - i] = '-';
            i++;
        }
        return this.f17398to.mo24980v4().m25068h4(C14113y2.m67368h4(C14113y2.m67406k4(cArr, 63 - i, i)));
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC6123ca m24940kk(AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C6187u5 c6187u5Mo24980v4;
        String strM66434k4;
        int iM66994m9 = abstractC6123caArr.length > 0 ? C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[0].mo24775x1())) : 0;
        if (iM66994m9 > 20 || iM66994m9 < 0) {
            throw new C6158m4(this.f17398to.mo24979uz().m25165h4("Fraction Digits must be greater than 0 and lesser than 20"));
        }
        if (abstractC6123ca == this.f17398to.mo24973lr()) {
            c6187u5Mo24980v4 = this.f17398to.mo24980v4();
            strM66434k4 = abstractC6123ca.toString();
        } else {
            c6187u5Mo24980v4 = this.f17398to.mo24980v4();
            strM66434k4 = C14044b3.m66434k4(abstractC6123ca.mo24775x1(), C14113y2.m67408k4("f", C14057f9.m66591x1(iM66994m9)), C11697x1.m55250kk());
        }
        return c6187u5Mo24980v4.m25068h4(strM66434k4);
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC6123ca m24941to(AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        if (C14044b3.m66439x1(abstractC6123ca.mo24775x1()) || C14044b3.m66437kk(abstractC6123ca.mo24775x1())) {
            return m24939k4(abstractC6123ca, new AbstractC6123ca[0]);
        }
        int iM66994m9 = abstractC6123caArr.length > 0 ? C14080ne.m66994m9(Double.valueOf(abstractC6123caArr[0].mo24775x1())) : 16;
        if (iM66994m9 > 20 || iM66994m9 < 0) {
            throw new C6158m4(this.f17398to.mo24979uz().m25165h4("Fraction Digits must be greater than 0 and lesser than 20"));
        }
        return this.f17398to.mo24980v4().m25068h4(C14044b3.m66434k4(abstractC6123ca.mo24775x1(), C14113y2.m67408k4("#.", C14113y2.m67389k4('0', iM66994m9), "e+0"), C11697x1.m55250kk()));
    }

    @Override // com.aspose.slides.internal.p253lm.C6116bs, com.aspose.slides.internal.p253lm.AbstractC6123ca
    public String toString() {
        return C14113y2.m67402k4("function {0}", m25131fa());
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC6123ca m24942x1(AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        return m24939k4(abstractC6123ca, new AbstractC6123ca[0]);
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        AbstractC6123ca abstractC6123caM24938du;
        if ("toString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24938du = m24939k4(abstractC6211yd, abstractC6123caArr);
        } else if ("toLocaleString".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24938du = m24942x1(abstractC6211yd, abstractC6123caArr);
        } else if ("toFixed".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24938du = m24940kk(abstractC6211yd, abstractC6123caArr);
        } else if ("toExponential".equals(((C6198wp) this).f17519k4)) {
            abstractC6123caM24938du = m24941to(abstractC6211yd, abstractC6123caArr);
        } else {
            if (!"toPrecision".equals(((C6198wp) this).f17519k4)) {
                throw new C6208y2("unknown error function");
            }
            abstractC6123caM24938du = m24938du(abstractC6211yd, abstractC6123caArr);
        }
        interfaceC6132em.mo10079x1(abstractC6123caM24938du);
        return abstractC6123caM24938du;
    }
}
