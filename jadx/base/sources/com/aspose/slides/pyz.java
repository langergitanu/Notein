package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C8275mn;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
class pyz {
    /* JADX INFO: renamed from: k4 */
    public static MathNaryOperator m69332k4(C8275mn c8275mn, gnb gnbVar) {
        wjx wjxVarM70904k4 = c8275mn.m37010k4() != null ? syu.m70904k4(c8275mn.m37010k4(), gnbVar) : null;
        C14093tq[] c14093tqArr = {new C14093tq()};
        C14093tq[] c14093tqArr2 = {new C14093tq()};
        MathNaryOperator mathNaryOperator = new MathNaryOperator(jz7.m63584k4(c8275mn.m37013to(), gnbVar), jz7.m63585k4(c8275mn.m37014x1(), (C14093tq<Byte>[]) c14093tqArr, gnbVar), jz7.m63585k4(c8275mn.m37012kk(), (C14093tq<Byte>[]) c14093tqArr2, gnbVar), wjxVarM70904k4);
        C14093tq c14093tq = c14093tqArr[0];
        C14093tq c14093tq2 = c14093tqArr2[0];
        if (c14093tq.m67302x1() && mathNaryOperator.getSubscript() != null) {
            ((ue7) mathNaryOperator.getSubscript()).m71679k4(((Byte) c14093tq.m67297k4()).byteValue());
        }
        if (c14093tq2.m67302x1() && mathNaryOperator.getSuperscript() != null) {
            ((ue7) mathNaryOperator.getSuperscript()).m71679k4(((Byte) c14093tq2.m67297k4()).byteValue());
        }
        return mathNaryOperator;
    }

    /* JADX INFO: renamed from: k4 */
    public static C8275mn m69333k4(MathNaryOperator mathNaryOperator, u8s u8sVar) {
        C8275mn c8275mn = new C8275mn();
        jz7.m63587k4(c8275mn.m37013to(), mathNaryOperator.getBase(), u8sVar);
        jz7.m63587k4(c8275mn.m37014x1(), mathNaryOperator.getSubscript(), u8sVar);
        jz7.m63587k4(c8275mn.m37012kk(), mathNaryOperator.getSuperscript(), u8sVar);
        if (!mathNaryOperator.m1995x1()) {
            c8275mn.m37011k4(syu.m70903k4(mathNaryOperator, u8sVar));
        }
        return c8275mn;
    }
}
