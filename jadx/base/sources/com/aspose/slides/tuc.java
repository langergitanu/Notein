package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C8445oi;
import com.aspose.slides.internal.p332p7.C8518pf;
import com.aspose.slides.internal.p332p7.C8527pj;
import com.aspose.slides.internal.p332p7.C9281yf;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
class tuc {
    /* JADX INFO: renamed from: k4 */
    public static MathLeftSubSuperscriptElement m71324k4(C9281yf c9281yf, gnb gnbVar) {
        C14093tq[] c14093tqArr = {new C14093tq()};
        C14093tq[] c14093tqArr2 = {new C14093tq()};
        MathLeftSubSuperscriptElement mathLeftSubSuperscriptElement = new MathLeftSubSuperscriptElement(jz7.m63584k4(c9281yf.m44986du(), gnbVar), jz7.m63585k4(c9281yf.m44988kk(), (C14093tq<Byte>[]) c14093tqArr, gnbVar), jz7.m63585k4(c9281yf.m44989to(), (C14093tq<Byte>[]) c14093tqArr2, gnbVar));
        C14093tq c14093tq = c14093tqArr[0];
        C14093tq c14093tq2 = c14093tqArr2[0];
        if (c14093tq.m67302x1()) {
            ((ue7) mathLeftSubSuperscriptElement.getSubscript()).m71679k4(((Byte) c14093tq.m67297k4()).byteValue());
        }
        if (c14093tq2.m67302x1()) {
            ((ue7) mathLeftSubSuperscriptElement.getSuperscript()).m71679k4(((Byte) c14093tq2.m67297k4()).byteValue());
        }
        if (c9281yf.m44990x1() != null) {
            C13727kg.m63827k4(((BaseScript) mathLeftSubSuperscriptElement).f1061k4, c9281yf.m44990x1().m28131x1(), gnbVar);
        }
        return mathLeftSubSuperscriptElement;
    }

    /* JADX INFO: renamed from: k4 */
    public static MathRightSubSuperscriptElement m71325k4(C8527pj c8527pj, gnb gnbVar) {
        C14093tq[] c14093tqArr = {new C14093tq()};
        C14093tq[] c14093tqArr2 = {new C14093tq()};
        MathRightSubSuperscriptElement mathRightSubSuperscriptElement = new MathRightSubSuperscriptElement(jz7.m63584k4(c8527pj.m38941x1(), gnbVar), jz7.m63585k4(c8527pj.m38939kk(), (C14093tq<Byte>[]) c14093tqArr, gnbVar), jz7.m63585k4(c8527pj.m38940to(), (C14093tq<Byte>[]) c14093tqArr2, gnbVar));
        boolean z = false;
        C14093tq c14093tq = c14093tqArr[0];
        C14093tq c14093tq2 = c14093tqArr2[0];
        if (c14093tq.m67302x1()) {
            ((ue7) mathRightSubSuperscriptElement.getSubscript()).m71679k4(((Byte) c14093tq.m67297k4()).byteValue());
        }
        if (c14093tq2.m67302x1()) {
            ((ue7) mathRightSubSuperscriptElement.getSuperscript()).m71679k4(((Byte) c14093tq2.m67297k4()).byteValue());
        }
        if (c8527pj.m38937k4() != null) {
            if (c8527pj.m38937k4().m33265x1() != null && (c8527pj.m38937k4().m33265x1().m45981k4() == 0 || c8527pj.m38937k4().m33265x1().m45981k4() == 1)) {
                z = true;
            }
            mathRightSubSuperscriptElement.setAlignScripts(z);
            C13727kg.m63827k4(((BaseScript) mathRightSubSuperscriptElement).f1061k4, c8527pj.m38937k4().m33264kk(), gnbVar);
        }
        return mathRightSubSuperscriptElement;
    }

    /* JADX INFO: renamed from: k4 */
    public static MathSubscriptElement m71326k4(C8445oi c8445oi, gnb gnbVar) {
        C14093tq[] c14093tqArr = {new C14093tq()};
        MathSubscriptElement mathSubscriptElement = new MathSubscriptElement(jz7.m63584k4(c8445oi.m38277kk(), gnbVar), jz7.m63585k4(c8445oi.m38278to(), (C14093tq<Byte>[]) c14093tqArr, gnbVar));
        C14093tq c14093tq = c14093tqArr[0];
        if (c14093tq.m67302x1()) {
            mathSubscriptElement.m2004x1().m71679k4(((Byte) c14093tq.m67297k4()).byteValue());
        }
        if (c8445oi.m38279x1() != null) {
            C13727kg.m63827k4(((BaseScript) mathSubscriptElement).f1061k4, c8445oi.m38279x1().m42342x1(), gnbVar);
        }
        return mathSubscriptElement;
    }

    /* JADX INFO: renamed from: k4 */
    public static MathSuperscriptElement m71327k4(C8518pf c8518pf, gnb gnbVar) {
        C14093tq[] c14093tqArr = {new C14093tq()};
        MathSuperscriptElement mathSuperscriptElement = new MathSuperscriptElement(jz7.m63584k4(c8518pf.m38891kk(), gnbVar), jz7.m63585k4(c8518pf.m38892to(), (C14093tq<Byte>[]) c14093tqArr, gnbVar));
        C14093tq c14093tq = c14093tqArr[0];
        if (c14093tq.m67302x1()) {
            ((ue7) mathSuperscriptElement.getSuperscript()).m71679k4(((Byte) c14093tq.m67297k4()).byteValue());
        }
        if (c8518pf.m38893x1() != null) {
            C13727kg.m63827k4(((BaseScript) mathSuperscriptElement).f1061k4, c8518pf.m38893x1().m31110x1(), gnbVar);
        }
        return mathSuperscriptElement;
    }
}
