package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jq6 {
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r6.f5137kk == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00de, code lost:
    
        if (r6.f5137kk == false) goto L62;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4317dy m63484k4(C1122fv c1122fv, C12007ix c12007ix, pj5 pj5Var, byte b, float f, byte b2, byte b3) {
        float fM56557jd;
        float fM56551ck;
        float fM56556h4;
        float fM56551ck2;
        float f2;
        float fM56557jd2;
        float f3 = c1122fv.f5139x1;
        if (C14064he.m66715kk(f3)) {
            f3 = 0.0f;
        }
        if (!C14064he.m66715kk(f)) {
            f3 += f;
        }
        oju ojuVarClone = c1122fv.f5136k4.Clone();
        float f4 = f % 360.0f;
        if (f4 < 0.0f) {
            f4 += 360.0f;
        }
        if (f4 >= 135.0f && f4 < 225.0f) {
            c12007ix.m56567kk(((ojuVarClone.f47836k4 - c12007ix.m56557jd()) * 2.0f) - c12007ix.m56550c5(), ((ojuVarClone.f47837x1 - c12007ix.m56551ck()) * 2.0f) - c12007ix.m56575x1());
        }
        if (b == 1 || b == 4 || b == 5 || b == 3 || b == 6) {
            if (b2 != 0 || b3 != 1) {
                f3 += 90.0f;
            }
            if (!c1122fv.f5138to) {
                if (!c1122fv.f5137kk) {
                    fM56557jd = 0.0f;
                }
                c12007ix.m56567kk(fM56557jd, 0.0f);
                fM56551ck = (c12007ix.m56551ck() - ojuVarClone.f47837x1) + pj5Var.f48079kk;
                fM56556h4 = pj5Var.f48080to + (ojuVarClone.f47836k4 - c12007ix.m56556h4());
            }
            fM56557jd = ((ojuVarClone.f47836k4 - c12007ix.m56557jd()) * 2.0f) - c12007ix.m56550c5();
            c12007ix.m56567kk(fM56557jd, 0.0f);
            fM56551ck = (c12007ix.m56551ck() - ojuVarClone.f47837x1) + pj5Var.f48079kk;
            fM56556h4 = pj5Var.f48080to + (ojuVarClone.f47836k4 - c12007ix.m56556h4());
        } else {
            if (b == 2) {
                f3 -= 90.0f;
                if (!c1122fv.f5138to) {
                    if (!c1122fv.f5137kk) {
                        fM56557jd2 = 0.0f;
                    }
                    c12007ix.m56567kk(fM56557jd2, 0.0f);
                    fM56551ck = (ojuVarClone.f47837x1 - c12007ix.m56558k4()) + pj5Var.f48078du;
                    fM56551ck2 = c12007ix.m56557jd() - ojuVarClone.f47836k4;
                    f2 = pj5Var.f48081x1;
                }
                fM56557jd2 = ((ojuVarClone.f47836k4 - c12007ix.m56557jd()) * 2.0f) - c12007ix.m56550c5();
                c12007ix.m56567kk(fM56557jd2, 0.0f);
                fM56551ck = (ojuVarClone.f47837x1 - c12007ix.m56558k4()) + pj5Var.f48078du;
                fM56551ck2 = c12007ix.m56557jd() - ojuVarClone.f47836k4;
                f2 = pj5Var.f48081x1;
            } else {
                boolean z = c1122fv.f5137kk;
                if ((!z && c1122fv.f5138to) || (z && !c1122fv.f5138to)) {
                    c12007ix.m56567kk(((ojuVarClone.f47836k4 - c12007ix.m56557jd()) * 2.0f) - c12007ix.m56550c5(), 0.0f);
                }
                fM56551ck = (c12007ix.m56557jd() - ojuVarClone.f47836k4) + pj5Var.f48081x1;
                fM56551ck2 = c12007ix.m56551ck() - ojuVarClone.f47837x1;
                f2 = pj5Var.f48079kk;
            }
            fM56556h4 = fM56551ck2 + f2;
        }
        C4317dy c4317dy = new C4317dy();
        if (c1122fv.f5137kk) {
            f3 += 180.0f;
        }
        c4317dy.m17339k4(f3, new C12025x6(ojuVarClone.f47836k4, ojuVarClone.f47837x1), 0);
        c4317dy.m17349x1(ojuVarClone.f47836k4 + fM56551ck, ojuVarClone.f47837x1 + fM56556h4, 0);
        return c4317dy;
    }

    /* JADX INFO: renamed from: kk */
    public static float m63493kk(InterfaceC13762l4 interfaceC13762l4) {
        in8[] in8VarArrMo64288h4 = interfaceC13762l4.mo64288h4();
        int length = in8VarArrMo64288h4.length;
        while (length > 0 && in8VarArrMo64288h4[length - 1].Clone().f5736du) {
            length--;
        }
        ypz[] ypzVarArrMo64297m9 = interfaceC13762l4.mo64297m9();
        float fM67481k4 = 0.0f;
        int i = 0;
        while (i < ypzVarArrMo64297m9.length) {
            int i2 = ypzVarArrMo64297m9[i].f50390k4;
            i++;
            int length2 = i < ypzVarArrMo64297m9.length ? ypzVarArrMo64297m9[i].f50390k4 : in8VarArrMo64288h4.length;
            if (length < length2) {
                length2 = length;
            }
            if (i2 < length2) {
                in8 in8VarClone = in8VarArrMo64288h4[i2].Clone();
                in8 in8VarClone2 = in8VarArrMo64288h4[length2 - 1].Clone();
                fM67481k4 = C14116yg.m67481k4(fM67481k4, (in8VarClone2.f5737k4.f47837x1 + in8VarClone2.f5739to) - (in8VarClone.f5737k4.f47837x1 - in8VarClone.f5738kk));
            }
        }
        return fM67481k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m63494x1(InterfaceC13762l4 interfaceC13762l4) {
        C12007ix c12007ix = new C12007ix();
        C12007ix[] c12007ixArr = {c12007ix};
        m63490k4(interfaceC13762l4, new ShapeFrame[]{null}, c12007ixArr, (kg7) null);
        c12007ixArr[0].CloneTo(c12007ix);
    }

    /* JADX INFO: renamed from: k4 */
    public static C4317dy m63485k4(InterfaceC13762l4 interfaceC13762l4, kg7 kg7Var) {
        nuk nukVar = new nuk();
        C12007ix c12007ix = new C12007ix();
        nuk[] nukVarArr = {nukVar};
        C12007ix[] c12007ixArr = {c12007ix};
        m63491k4(interfaceC13762l4, nukVarArr, c12007ixArr, kg7Var);
        nukVarArr[0].CloneTo(nukVar);
        c12007ixArr[0].CloneTo(c12007ix);
        TextFrame textFrameMo64289k4 = interfaceC13762l4.mo64289k4();
        TextFrameFormat textFrameFormat = textFrameMo64289k4.f3519k4;
        C1122fv c1122fv = new C1122fv();
        oju.m68619k4(nukVar.f47615k4, oju.m68618k4(nukVar.f47617x1, 2)).CloneTo(c1122fv.f5136k4);
        C1258im c1258im = nukVar.f47616kk;
        c1122fv.f5138to = c1258im.f5733to;
        c1122fv.f5137kk = c1258im.f5732kk;
        if (kg7Var != null && kg7Var.m63834dy()) {
            c1122fv.f5139x1 = nukVar.f47616kk.f5734x1;
        }
        return m63484k4(c1122fv.Clone(), c12007ix.Clone(), textFrameMo64289k4.m2903du().Clone().Clone(), textFrameFormat.m2958lr(), textFrameFormat.getRotationAngle(), textFrameFormat.getWrapText(), textFrameFormat.m2957ks());
    }

    /* JADX INFO: renamed from: k4 */
    private static C12007ix m63486k4(GeometryShape geometryShape, nuk nukVar) {
        float f = nukVar.f47616kk.f5734x1;
        if (C14064he.m66715kk(f)) {
            f = 0.0f;
        }
        float f2 = f % 360.0f;
        C12007ix c12007ixClone = geometryShape.m1591yj().m3313k4(oju.f47834kk.Clone(), nukVar.f47617x1.Clone()).Clone();
        oju ojuVarClone = oju.m68619k4(nukVar.f47615k4, oju.m68618k4(nukVar.f47617x1, 2)).Clone();
        C4317dy c4317dy = new C4317dy();
        c4317dy.m17338k4(f2, new C12025x6(ojuVarClone.f47836k4, ojuVarClone.f47837x1));
        C12025x6 c12025x6Clone = c4317dy.m17333k4(new C12025x6(C22205OooOOo.OooO00o(c12007ixClone, 2.0f, c12007ixClone.m56557jd() + nukVar.f47615k4.f47836k4), (c12007ixClone.m56575x1() / 2.0f) + c12007ixClone.m56551ck() + nukVar.f47615k4.f47837x1 + (nukVar.f47616kk.f5732kk ? nukVar.f47617x1.f47837x1 - c12007ixClone.m56575x1() : 0.0f))).Clone();
        float fM56575x1 = c12007ixClone.m56575x1() / 2.0f;
        float fM56550c5 = c12007ixClone.m56550c5() / 2.0f;
        if ((f2 > 45.0f && f2 < 135.0f) || (f2 > 225.0f && f2 < 315.0f)) {
            fM56575x1 = fM56550c5;
            fM56550c5 = c12007ixClone.m56575x1() / 2.0f;
        }
        return new C12007ix(c12025x6Clone.m56897x1() - fM56550c5, c12025x6Clone.m56895kk() - fM56575x1, fM56550c5 * 2.0f, fM56575x1 * 2.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63487k4(InterfaceC13762l4 interfaceC13762l4, float f, float f2, kg7 kg7Var) {
        TextFrame textFrameMo64289k4 = interfaceC13762l4.mo64289k4();
        oju ojuVar = new oju(f, f2);
        byte bM2958lr = textFrameMo64289k4.f3519k4.m2958lr();
        if (bM2958lr == 1 || bM2958lr == 2 || bM2958lr == 4 || bM2958lr == 5 || bM2958lr == 3 || bM2958lr == 6) {
            ojuVar.m68625k4();
        }
        interfaceC13762l4.mo64294k4(ojuVar.Clone(), kg7Var);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63488k4(TextFrame textFrame) {
        IGenericEnumerator<IParagraph> it = textFrame.getParagraphs().iterator();
        while (it.hasNext()) {
            try {
                IGenericEnumerator<IPortion> it2 = it.next().getPortions().iterator();
                while (it2.hasNext()) {
                    try {
                        MathPortion mathPortion = (MathPortion) C7019kk.m27452k4((Object) it2.next(), MathPortion.class);
                        if (mathPortion != null && !q1h.m69381k4(mathPortion.getMathParagraph())) {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                            return false;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return true;
        }
        it.dispose();
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63489k4(InterfaceC13762l4 interfaceC13762l4, ShapeFrame[] shapeFrameArr, kg7 kg7Var) {
        C12007ix c12007ix = new C12007ix();
        C12007ix[] c12007ixArr = {c12007ix};
        boolean zM63490k4 = m63490k4(interfaceC13762l4, shapeFrameArr, c12007ixArr, kg7Var);
        c12007ixArr[0].CloneTo(c12007ix);
        return zM63490k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63490k4(InterfaceC13762l4 interfaceC13762l4, ShapeFrame[] shapeFrameArr, C12007ix[] c12007ixArr, kg7 kg7Var) {
        nuk nukVar = new nuk();
        nuk[] nukVarArr = {nukVar};
        boolean zM63491k4 = m63491k4(interfaceC13762l4, nukVarArr, c12007ixArr, kg7Var);
        nukVarArr[0].CloneTo(nukVar);
        oju ojuVar = nukVar.f47615k4;
        float f = ojuVar.f47836k4;
        float f2 = ojuVar.f47837x1;
        oju ojuVar2 = nukVar.f47617x1;
        float f3 = ojuVar2.f47836k4;
        float f4 = ojuVar2.f47837x1;
        C1258im c1258im = nukVar.f47616kk;
        boolean z = c1258im.f5733to;
        boolean z2 = c1258im.f5732kk;
        shapeFrameArr[0] = new ShapeFrame(f, f2, f3, f4, z ? (byte) 1 : (byte) 0, z2 ? (byte) 1 : (byte) 0, c1258im.f5734x1);
        return zM63491k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63491k4(InterfaceC13762l4 interfaceC13762l4, nuk[] nukVarArr, C12007ix[] c12007ixArr, kg7 kg7Var) {
        TextFrame textFrameMo64289k4 = interfaceC13762l4.mo64289k4();
        GeometryShape geometryShape = (GeometryShape) textFrameMo64289k4.getParent_Immediate();
        geometryShape.m2546bz().m5644up().CloneTo(nukVarArr[0]);
        geometryShape.m1590x6().m3313k4(nukVarArr[0].f47615k4.Clone(), nukVarArr[0].f47617x1.Clone()).CloneTo(c12007ixArr[0]);
        C0880d4 c0880d4 = (C0880d4) C7019kk.m27452k4((Object) geometryShape.mo272to(), C0880d4.class);
        if (c0880d4 != null && c0880d4.m4914m9() != null) {
            tbp tbpVar = tbp.f49088kk;
            tbp tbpVarClone = tbpVar.Clone();
            tbp tbpVarClone2 = tbpVar.Clone();
            C1258im c1258imClone = C1258im.f5731k4.Clone();
            if (c0880d4.m4914m9() != null) {
                tbp[] tbpVarArr = {tbpVarClone};
                tbp[] tbpVarArr2 = {tbpVarClone2};
                C1258im[] c1258imArr = {c1258imClone};
                ai9.m3628k4(c0880d4.m4914m9(), tbpVarArr, tbpVarArr2, c1258imArr);
                tbpVarArr[0].CloneTo(tbpVarClone);
                tbpVarArr2[0].CloneTo(tbpVarClone2);
                c1258imArr[0].CloneTo(c1258imClone);
            }
            if (!C14044b3.m66437kk(geometryShape.mo1214P_().m67988kk())) {
                c1258imClone.f5734x1 = (C14064he.m66715kk(c1258imClone.f5734x1) ? 0.0f : c1258imClone.f5734x1) + geometryShape.mo1214P_().m67988kk();
            }
            nuk nukVar = new nuk();
            tbpVarClone.m71061du().CloneTo(nukVar.f47615k4);
            tbpVarClone2.m71061du().CloneTo(nukVar.f47617x1);
            c1258imClone.CloneTo(nukVar.f47616kk);
            geometryShape.m2546bz().m5637k4(nukVar).CloneTo(nukVarArr[0]);
            nuk nukVar2 = nukVarArr[0];
            oju ojuVar = nukVar2.f47615k4;
            float f = ojuVar.f47836k4;
            float f2 = ojuVar.f47837x1;
            oju ojuVar2 = nukVar2.f47617x1;
            c12007ixArr[0] = new C12007ix(f, f2, ojuVar2.f47836k4, ojuVar2.f47837x1);
        }
        if (textFrameMo64289k4.f3519k4.m2973x6()) {
            m63486k4(geometryShape, nukVarArr[0].Clone()).CloneTo(c12007ixArr[0]);
            C1258im c1258im = nukVarArr[0].f47616kk;
            c1258im.f5734x1 = 0.0f;
            c1258im.f5732kk = false;
        }
        pj5 pj5VarClone = textFrameMo64289k4.m2909k4(geometryShape).Clone();
        m63487k4(interfaceC13762l4, (c12007ixArr[0].m56550c5() - pj5VarClone.f48081x1) - pj5VarClone.f48080to, (c12007ixArr[0].m56575x1() - pj5VarClone.f48079kk) - pj5VarClone.f48078du, kg7Var);
        float f3 = interfaceC13762l4.mo64296kk().f47837x1;
        float fM56575x1 = f3 / ((c12007ixArr[0].m56575x1() - pj5VarClone.f48079kk) - pj5VarClone.f48078du);
        if (fM56575x1 <= 1.25f && fM56575x1 >= 0.8f) {
            return true;
        }
        w0l w0lVarM2937b3 = textFrameMo64289k4.f3519k4.m2937b3();
        if (w0lVarM2937b3.getAutofitType() != 2 || w0lVarM2937b3.getTextVerticalType() != 0 || w0lVarM2937b3.m72613h4().m5815k4() != 0) {
            return true;
        }
        if (C7019kk.m27469x1(geometryShape.m2573s7().m2576t6(), IChartComponent.class)) {
            tbp.m71060x1(nukVarArr[0].f47615k4.m68629x1(), geometryShape.m2573s7().m2548dq().m67982k4()).m71061du().CloneTo(nukVarArr[0].f47615k4);
        }
        nukVarArr[0].f47617x1.f47837x1 = f3 + pj5VarClone.f48079kk + pj5VarClone.f48078du;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12007ix[] m63492k4(InterfaceC13762l4 interfaceC13762l4) {
        in8[] in8VarArrMo64288h4 = interfaceC13762l4.mo64288h4();
        if (in8VarArrMo64288h4 == null) {
            return (C12007ix[]) C22200OooO0o0.OooO00o(C12007ix.class, 0);
        }
        C12007ix[] c12007ixArr = (C12007ix[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12007ix.class), in8VarArrMo64288h4.length));
        for (int i = 0; i < c12007ixArr.length; i++) {
            in8 in8VarClone = in8VarArrMo64288h4[i].Clone();
            oju ojuVar = in8VarClone.f5737k4;
            float f = ojuVar.f47836k4;
            float f2 = ojuVar.f47837x1;
            oju ojuVar2 = in8VarClone.f5740x1;
            float f3 = ojuVar2.f47837x1;
            c12007ixArr[i] = new C12007ix(f, f2 - f3, ojuVar2.f47836k4, f3);
        }
        return c12007ixArr;
    }
}
