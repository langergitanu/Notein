package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Fonts;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class cpm extends AbstractC0753ak {

    /* JADX INFO: renamed from: com.aspose.slides.cpm$k4 */
    public static class C0864k4 extends AbstractC7020m9<C0864k4> {

        /* JADX INFO: renamed from: k4 */
        private double f4401k4;

        /* JADX INFO: renamed from: kk */
        private boolean f4402kk;

        /* JADX INFO: renamed from: x1 */
        private double f4403x1;

        public C0864k4() {
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof C0864k4) {
                return m4734x1((C0864k4) obj);
            }
            return false;
        }

        public int hashCode() {
            return C12569rv.m58664k4(Double.valueOf(this.f4401k4), Double.valueOf(this.f4403x1), Boolean.valueOf(this.f4402kk));
        }

        /* JADX INFO: renamed from: k4 */
        public final double m4735k4() {
            return this.f4403x1;
        }

        /* JADX INFO: renamed from: kk */
        public final boolean m4738kk() {
            return this.f4402kk;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
        public C0864k4 Clone() {
            C0864k4 c0864k4 = new C0864k4();
            CloneTo(c0864k4);
            return c0864k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final double m4740x1() {
            return this.f4401k4;
        }

        public C0864k4(double d, double d2) {
            this.f4403x1 = d;
            this.f4401k4 = d2;
            this.f4402kk = false;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m4734x1(C0864k4 c0864k4) {
            return c0864k4.f4401k4 == this.f4401k4 && c0864k4.f4403x1 == this.f4403x1 && c0864k4.f4402kk == this.f4402kk;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(C0864k4 c0864k4) {
            c0864k4.f4401k4 = this.f4401k4;
            c0864k4.f4403x1 = this.f4403x1;
            c0864k4.f4402kk = this.f4402kk;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m4737k4(boolean z) {
            this.f4402kk = z;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.cpm$x1 */
    public static class C0865x1 extends AbstractC7020m9<C0865x1> {

        /* JADX INFO: renamed from: k4 */
        boolean f4404k4;

        /* JADX INFO: renamed from: x1 */
        boolean f4405x1;

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof C0865x1) {
                return m4741x1((C0865x1) obj);
            }
            return false;
        }

        public int hashCode() {
            return C12569rv.m58664k4(Boolean.valueOf(this.f4404k4), Boolean.valueOf(this.f4405x1));
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(C0865x1 c0865x1) {
            c0865x1.f4404k4 = this.f4404k4;
            c0865x1.f4405x1 = this.f4405x1;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
        public C0865x1 Clone() {
            C0865x1 c0865x1 = new C0865x1();
            CloneTo(c0865x1);
            return c0865x1;
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m4741x1(C0865x1 c0865x1) {
            return c0865x1.f4404k4 == this.f4404k4 && c0865x1.f4405x1 == this.f4405x1;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m4743k4() {
            return this.f4404k4 || this.f4405x1;
        }
    }

    /* JADX INFO: renamed from: c5 */
    private static boolean m4713c5(bay bayVar) {
        if (bayVar.m4074dy().m74272u4() && bayVar.m4106uz() != null) {
            for (fwr fwrVar : bayVar.m4106uz().m70407kk()) {
                if (fwrVar.m6344du() == 61 && fwrVar.m6348kk() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ck */
    private static C0864k4 m4714ck(bay bayVar) {
        double dM4718k4 = m4718k4(22, bayVar);
        if (dM4718k4 == 0.0d && !bayVar.m4112x1(22)) {
            dM4718k4 = 38.0d;
            bayVar.m4095kk(22, yz6.m74154k4(38.0d));
        }
        return new C0864k4(dM4718k4, bayVar.m4112x1(27) ? m4718k4(27, bayVar) : C14116yg.m67497to(0.78d * dM4718k4));
    }

    /* JADX INFO: renamed from: dy */
    private double m4715dy(bay bayVar) {
        double d;
        double dM4098m9 = bayVar.m4098m9(22);
        double dM4098m92 = bayVar.m4098m9(27);
        double dM4098m93 = bayVar.m4098m9(15);
        if (!C14044b3.m66437kk(dM4098m93) && C14044b3.m66437kk(dM4098m9) && C14044b3.m66437kk(dM4098m92) && bayVar.m4074dy().m74272u4() && bayVar.m4074dy().m74233dy() != 0.0d && bayVar.m4074dy().m74236fa() != 0.0d) {
            m3652to(bayVar);
            SmartArtShape smartArtShapeM74280x1 = bayVar.m4074dy().m74280x1();
            C0864k4 c0864k4Clone = m4722k4(bayVar, false).Clone();
            ITextFrameFormat textFrameFormat = smartArtShapeM74280x1.m2820kk().getTextFrameFormat();
            tbp tbpVarClone = smartArtShapeM74280x1.m2820kk().f3523to.mo64287dy().m68629x1().Clone();
            double d2 = tbpVarClone.f49091x1;
            if (d2 != 0.0d && tbpVarClone.f49090k4 != 0.0d) {
                double marginBottom = textFrameFormat.getMarginBottom() + textFrameFormat.getMarginTop() + d2;
                double dM74266qq = bayVar.m4074dy().m74266qq();
                double dM74228ck = dM74266qq / bayVar.m4074dy().m74228ck();
                d = 0.0d;
                double dM4101to = bayVar.m4101to(15);
                if (!c0864k4Clone.m4738kk()) {
                    marginBottom = C14116yg.m67491kk(marginBottom, dM4101to);
                    if (bayVar.m4066ar().f49091x1 < 1.0d) {
                        if (C14044b3.m66437kk(bayVar.m4074dy().m74221ar())) {
                            bayVar.m4074dy().m74226c5(marginBottom);
                        } else {
                            marginBottom = C14116yg.m67491kk(bayVar.m4074dy().m74221ar(), dM4101to);
                        }
                    }
                } else if (marginBottom > dM4101to) {
                    bayVar.m4088k4(15, marginBottom, true);
                }
                bayVar.m4074dy().m74286x1(true);
                if (dM4098m93 >= dM74266qq) {
                    return marginBottom / dM74228ck;
                }
            }
            bayVar.m4074dy().m74286x1(false);
            return d;
        }
        d = 0.0d;
        bayVar.m4074dy().m74286x1(false);
        return d;
    }

    /* JADX INFO: renamed from: jd */
    private static void m4717jd(bay bayVar) {
        SmartArtShape smartArtShapeM74280x1 = bayVar.m4074dy().m74280x1();
        ITextFrameFormat textFrameFormat = smartArtShapeM74280x1.m2820kk().getTextFrameFormat();
        double dM67502x1 = C14116yg.m67502x1(bayVar.m4074dy().m74273um(), textFrameFormat.getMarginRight() + textFrameFormat.getMarginLeft() + (((double) smartArtShapeM74280x1.m2820kk().f3523to.mo64296kk().f47836k4) * 1.01d) + 15.0d);
        bayVar.m4095kk(61, dM67502x1);
        bayVar.m4074dy().m74259kk(dM67502x1);
    }

    /* JADX INFO: renamed from: k4 */
    private static double m4718k4(int i, bay bayVar) {
        return (i == 22 || i == 27) ? C14116yg.m67477k4(yz6.m74176x1(bayVar.m4072du(i)), 1) : C14116yg.m67497to(yz6.m74176x1(bayVar.m4072du(i)));
    }

    /* JADX INFO: renamed from: kk */
    private static byte m4727kk(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i != 2) {
            return i != 3 ? (byte) -1 : (byte) 2;
        }
        return (byte) 1;
    }

    /* JADX INFO: renamed from: to */
    private static double m4728to(int i) {
        int[] iArr = {11, 15, 19, 27};
        double d = 4.5d;
        for (int i2 = 0; i2 < 4 && i > iArr[i2]; i2++) {
            d += 4.5d;
        }
        return d;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m4729x1(int i) {
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? -1 : 2;
        }
        return 1;
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: L_ */
    public void mo4732L_() {
        List.Enumerator<bay> it = m3650m9().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                h4g h4gVarM4716dy = m4716dy();
                next.m4074dy().m74284x1(h4gVarM4716dy.m7005kk());
                SmartArtShape smartArtShapeM74280x1 = next.m4074dy().m74280x1();
                List<C14244on> listM4076h4 = next.m4076h4();
                if (smartArtShapeM74280x1 != null && listM4076h4.size() > 0) {
                    TextFrame textFrame = new TextFrame(smartArtShapeM74280x1);
                    m4724k4(textFrame, listM4076h4, h4gVarM4716dy);
                    smartArtShapeM74280x1.m2819k4(textFrame);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    private h4g m4716dy() {
        return (h4g) m3643k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static double m4719k4(bay bayVar, int i, double d, double d2) {
        if (C14044b3.m66437kk(d2)) {
            return bayVar.m4112x1(i) ? m4718k4(i, bayVar) : d * 0.56d;
        }
        return d2;
    }

    /* JADX INFO: renamed from: x1 */
    private C0865x1 m4730x1(bay bayVar, double d, double d2) {
        return m4723k4(bayVar, d, d2, new double[]{0.0d}, new double[]{0.0d}, new boolean[]{false}).Clone();
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: to */
    public boolean mo3651to() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m4720k4(List<C14244on> list) {
        if (list.size() == 0) {
            return 0;
        }
        List.Enumerator<C14244on> it = list.iterator();
        int iM5146rv = Integer.MAX_VALUE;
        while (it.hasNext()) {
            try {
                C14244on next = it.next();
                if (iM5146rv > next.m5146rv()) {
                    iM5146rv = next.m5146rv();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return iM5146rv;
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x01d6: INVOKE (r3 I:void) = (r16v1 ?? I:android.content.Context), (r17 I:java.lang.String), (r18 I:boolean) STATIC call: com.alipay.share.sdk.openapi.APApiImlV1.<init>(android.content.Context, java.lang.String, boolean):void A[Catch: all -> 0x01ed, MD:(android.content.Context, java.lang.String, boolean):void (s)], block:B:70:0x01be */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v25 ??, still in use, count: 1, list:
          (r3v25 ?? I:double) from 0x01e7: INVOKE (r0v17 ?? I:com.aspose.slides.z2c), (r11v2 ?? I:double), (r3v25 ?? I:double) VIRTUAL call: com.aspose.slides.z2c.k4(double, double):void A[Catch: all -> 0x01ed, MD:(double, double):void (m), TRY_LEAVE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1123)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: x1 */
    public void mo3653x1(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v25 ??, still in use, count: 1, list:
          (r3v25 ?? I:double) from 0x01e7: INVOKE (r0v17 ?? I:com.aspose.slides.z2c), (r11v2 ?? I:double), (r3v25 ?? I:double) VIRTUAL call: com.aspose.slides.z2c.k4(double, double):void A[Catch: all -> 0x01ed, MD:(double, double):void (m), TRY_LEAVE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1123)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    /* JADX INFO: renamed from: k4 */
    private int m4721k4(List<C14244on> list, int i) {
        List.Enumerator<C14244on> it = list.iterator();
        int iM5146rv = Integer.MAX_VALUE;
        while (it.hasNext()) {
            try {
                C14244on next = it.next();
                if (m4716dy().m7004jd() <= (next.m5146rv() - i) + 1 && iM5146rv > next.m5146rv()) {
                    iM5146rv = next.m5146rv();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (iM5146rv == Integer.MAX_VALUE) {
            return 0;
        }
        return iM5146rv;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m4731x1(bay bayVar, double d) {
        m4726k4(bayVar, yz6.m74176x1((d - yz6.m74154k4(1.0d)) - bayVar.m4072du(22)), true, true, true);
    }

    /* JADX INFO: renamed from: k4 */
    private C0864k4 m4722k4(bay bayVar, boolean z) throws Throwable {
        uus[] uusVarArr;
        int i;
        C14244on next;
        boolean z2;
        SmartArtShape smartArtShape;
        int i2;
        C0864k4 c0864k4;
        IParagraph iParagraph;
        C0864k4 c0864k4Clone = m4714ck(bayVar).Clone();
        int iM4720k4 = m4720k4(bayVar.m4076h4());
        SmartArtShape smartArtShapeM74280x1 = bayVar.m4074dy().m74280x1();
        if (smartArtShapeM74280x1 == null || bayVar.m4076h4().size() <= 0) {
            return c0864k4Clone;
        }
        long jM2935ak = smartArtShapeM74280x1.m2820kk().m2908jd().m2935ak();
        IParagraphCollection paragraphs = smartArtShapeM74280x1.m2820kk().getParagraphs();
        List.Enumerator<C14244on> it = bayVar.m4076h4().iterator();
        int i3 = 0;
        double dM4735k4 = Double.NaN;
        while (it.hasNext()) {
            try {
                next = it.next();
                z2 = m4716dy().m7004jd() <= (next.m5146rv() - iM4720k4) + 1;
            } catch (Throwable th) {
                th = th;
            }
            try {
                int iM4721k4 = m4721k4(bayVar.m4076h4(), iM4720k4);
                int i4 = iM4720k4;
                int i5 = 0;
                while (true) {
                    smartArtShape = smartArtShapeM74280x1;
                    if (i5 >= next.m5147up().m71867k4().getParagraphs().getCount() || i3 >= paragraphs.getCount()) {
                        break;
                    }
                    IParagraph iParagraph2 = next.m5147up().m71867k4().getParagraphs().get_Item(i5);
                    IParagraph iParagraph3 = paragraphs.get_Item(i3);
                    double dM4735k42 = c0864k4Clone.m4735k4();
                    int i6 = 0;
                    double d = Double.NaN;
                    while (true) {
                        i2 = i5;
                        if (i6 >= iParagraph3.getPortions().getCount()) {
                            break;
                        }
                        IPortion iPortion = iParagraph2.getPortions().get_Item(i6);
                        IPortion iPortion2 = iParagraph3.getPortions().get_Item(i6);
                        IParagraphCollection iParagraphCollection = paragraphs;
                        double fontHeight = iPortion.getPortionFormat().getFontHeight();
                        if (C14044b3.m66437kk(fontHeight)) {
                            fontHeight = z2 ? c0864k4Clone.m4740x1() : c0864k4Clone.m4735k4();
                            iParagraph = iParagraph2;
                        } else {
                            if (i6 == 0) {
                                d = fontHeight;
                            }
                            iParagraph = iParagraph2;
                            c0864k4Clone.m4737k4(true);
                        }
                        iPortion2.getPortionFormat().setFontHeight((float) fontHeight);
                        i6++;
                        dM4735k42 = fontHeight;
                        iParagraph2 = iParagraph;
                        paragraphs = iParagraphCollection;
                        i5 = i2;
                        i3 = i3;
                    }
                    IParagraphCollection iParagraphCollection2 = paragraphs;
                    int i7 = i3;
                    IParagraph iParagraph4 = iParagraph2;
                    if (((Paragraph) iParagraph3).getEndParagraphPortionFormat() != null) {
                        c0864k4 = c0864k4Clone;
                        ((Paragraph) iParagraph3).getEndParagraphPortionFormat().setFontHeight((float) (z2 ? c0864k4Clone.m4740x1() : c0864k4Clone.m4735k4()));
                    } else {
                        c0864k4 = c0864k4Clone;
                    }
                    IParagraphFormat paragraphFormat = iParagraph4.getParagraphFormat();
                    IParagraphFormat paragraphFormat2 = iParagraph3.getParagraphFormat();
                    if (C14044b3.m66437kk(paragraphFormat.getDefaultTabSize())) {
                        paragraphFormat2.setDefaultTabSize((float) (dM4735k42 / 0.286d));
                    } else {
                        paragraphFormat2.setDefaultTabSize(paragraphFormat.getDefaultTabSize());
                    }
                    if (!z2) {
                        paragraphFormat2.setDepth((short) 0);
                    } else if (C14064he.m66715kk(paragraphFormat.getIndent())) {
                        short sM67483k4 = (short) C14116yg.m67483k4(0, next.m5146rv() - iM4721k4);
                        double dM4728to = m4728to(C7019kk.m27462to(Double.valueOf(dM4735k42), 14));
                        paragraphFormat2.setDepth(sM67483k4);
                        paragraphFormat2.setMarginLeft((float) (((double) (sM67483k4 + 1)) * dM4728to));
                        paragraphFormat2.setIndent((float) (-dM4728to));
                    } else {
                        paragraphFormat2.setIndent(paragraphFormat.getIndent());
                    }
                    i3 = i7 + 1;
                    i5 = i2 + 1;
                    c0864k4Clone = c0864k4;
                    paragraphs = iParagraphCollection2;
                    smartArtShapeM74280x1 = smartArtShape;
                    dM4735k4 = d;
                }
                c0864k4Clone = c0864k4Clone;
                iM4720k4 = i4;
                paragraphs = paragraphs;
                smartArtShapeM74280x1 = smartArtShape;
                i3 = i3;
            } catch (Throwable th2) {
                th = th2;
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        SmartArtShape smartArtShape2 = smartArtShapeM74280x1;
        C0864k4 c0864k42 = c0864k4Clone;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        if (c0864k42.m4738kk() && bayVar.m4104u4() != null && !C14044b3.m66437kk(dM4735k4)) {
            uus[] uusVarArrM70183kk = bayVar.m4104u4().m70183kk();
            int length = uusVarArrM70183kk.length;
            int i8 = 0;
            while (i8 < length) {
                uus uusVar = uusVarArrM70183kk[i8];
                if (uusVar.m71918dy() == 22) {
                    double dM4079k4 = bayVar.m4079k4(uusVar);
                    uusVarArr = uusVarArrM70183kk;
                    i = length;
                    double dM74154k4 = yz6.m74154k4(dM4735k4) * dM4079k4;
                    if (AbstractC0753ak.m3634k4(dM74154k4, dM4079k4 * bayVar.m4078k4(uusVar.m71918dy()))) {
                        bayVar.m4095kk(uusVar.m71924kk(), dM74154k4);
                    }
                } else {
                    uusVarArr = uusVarArrM70183kk;
                    i = length;
                }
                i8++;
                uusVarArrM70183kk = uusVarArr;
                length = i;
            }
        }
        if (!c0864k42.m4738kk()) {
            dM4735k4 = c0864k42.m4735k4();
        }
        double d2 = dM4735k4;
        xmh xmhVarClone = TextFrameFormat.m2933k4(bayVar.m4076h4().get_Item(0).m5147up().m71867k4().getTextFrameFormat()).Clone();
        xmh xmhVar = new xmh();
        xmhVar.f50158kk = m4719k4(bayVar, 33, d2, xmhVarClone.f50158kk);
        xmhVar.f50157du = m4719k4(bayVar, 5, d2, xmhVarClone.f50157du);
        xmhVar.f50160x1 = m4719k4(bayVar, 19, d2, xmhVarClone.f50160x1);
        xmhVar.f50159to = m4719k4(bayVar, 25, d2, xmhVarClone.f50159to);
        TextFrameFormat textFrameFormat = (TextFrameFormat) smartArtShape2.m2820kk().getTextFrameFormat();
        boolean z3 = z || xmh.m73498x1(xmhVar, textFrameFormat.m2963to()) || (jM2935ak & 4294967295L) != (4294967295L & textFrameFormat.m2935ak());
        if (!z3) {
            oju ojuVarClone = smartArtShape2.m2820kk().f3523to.mo64300x1().Clone();
            z3 = C14064he.m66715kk(ojuVarClone.f47836k4) || C14064he.m66715kk(ojuVarClone.f47837x1);
        }
        if (!z3) {
            return c0864k42;
        }
        textFrameFormat.m2953k4(xmhVar.Clone());
        jq6.m63494x1(smartArtShape2.m2820kk().f3523to);
        return c0864k42;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: x1 */
    public boolean mo3654x1() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private C0865x1 m4723k4(bay bayVar, double d, double d2, double[] dArr, double[] dArr2, boolean[] zArr) {
        dArr2[0] = 0.0d;
        dArr[0] = 0.0d;
        zArr[0] = false;
        boolean zM3652to = m3652to(bayVar);
        C0865x1 c0865x1 = new C0865x1();
        SmartArtShape smartArtShapeM74280x1 = bayVar.m4074dy().m74280x1();
        if (smartArtShapeM74280x1 != null && bayVar.m4076h4().size() > 0 && bayVar.m4074dy().m74233dy() != 0.0d && bayVar.m4074dy().m74236fa() != 0.0d) {
            C0864k4 c0864k4Clone = m4722k4(bayVar, zM3652to).Clone();
            if (bayVar.m4074dy().m74272u4()) {
                ITextFrameFormat textFrameFormat = smartArtShapeM74280x1.m2820kk().getTextFrameFormat();
                tbp tbpVarClone = smartArtShapeM74280x1.m2820kk().f3523to.mo64287dy().m68629x1().Clone();
                if (tbpVarClone.f49091x1 != 0.0d && tbpVarClone.f49090k4 != 0.0d) {
                    zArr[0] = smartArtShapeM74280x1.m2820kk().f3523to.mo64298to();
                    tbp.m71054k4(tbpVarClone, new tbp(textFrameFormat.getMarginRight() + textFrameFormat.getMarginLeft(), textFrameFormat.getMarginBottom() + textFrameFormat.getMarginTop())).CloneTo(tbpVarClone);
                    double dM74277wl = bayVar.m4074dy().m74277wl() / tbpVarClone.f49090k4;
                    dArr[0] = dM74277wl;
                    boolean zM3633k4 = AbstractC0753ak.m3633k4(dM74277wl);
                    double dM74266qq = bayVar.m4074dy().m74266qq() / tbpVarClone.f49091x1;
                    dArr2[0] = dM74266qq;
                    boolean zM3633k42 = AbstractC0753ak.m3633k4(dM74266qq);
                    if (!c0864k4Clone.m4738kk() && (zM3633k42 || zM3633k4 || zArr[0])) {
                        if (!C14044b3.m66437kk(d) && yz6.m74176x1(d) < c0864k4Clone.m4735k4()) {
                            c0865x1.f4404k4 = true;
                        }
                        if (!C14044b3.m66437kk(d2) && yz6.m74176x1(d2) < c0864k4Clone.m4740x1()) {
                            c0865x1.f4405x1 = true;
                            return c0865x1;
                        }
                    }
                }
            }
        }
        return c0865x1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k4 */
    private static void m4724k4(TextFrame textFrame, List<C14244on> list, h4g h4gVar) {
        byte bM7010yj;
        int iM4720k4 = m4720k4(list);
        TextFrameFormat textFrameFormat = textFrame.f3519k4;
        List.Enumerator<C14244on> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                C14244on next = it.next();
                boolean z2 = h4gVar.m7004jd() <= (next.m5146rv() - iM4720k4) + 1;
                if (z2) {
                    z = true;
                }
                IGenericEnumerator<IParagraph> it2 = next.m5147up().m71867k4().getParagraphs().iterator();
                while (it2.hasNext()) {
                    try {
                        Paragraph paragraph = new Paragraph((Paragraph) it2.next());
                        textFrame.getParagraphs().add(paragraph);
                        IParagraphFormat paragraphFormat = paragraph.getParagraphFormat();
                        if (C14064he.m66715kk(paragraphFormat.getSpaceAfter())) {
                            paragraphFormat.setSpaceAfter((float) (!z2 ? h4gVar.m7000du() : h4gVar.m7008to()));
                        }
                        if (C14064he.m66715kk(paragraphFormat.getSpaceBefore())) {
                            paragraphFormat.setSpaceBefore(0.0f);
                        }
                        if (C14064he.m66715kk(paragraphFormat.getSpaceWithin())) {
                            paragraphFormat.setSpaceWithin((float) (!z2 ? h4gVar.m7007m9() : h4gVar.m7003h4()));
                        } else if (paragraphFormat.getSpaceWithin() > 0.0f && z2) {
                            String languageId = paragraph.getPortions().get_Item(0).getPortionFormat().getLanguageId();
                            Fonts.C0421k4[] c0421k4Arr = {null};
                            int i = !C14113y2.m67411k4(languageId) && Fonts.f2330x1.tryGetValue(languageId, c0421k4Arr) ? c0421k4Arr[0].f2342kk : 0;
                            if (paragraph.getPortions().getCount() > 0 && i == 1) {
                                paragraphFormat.setSpaceWithin(paragraphFormat.getSpaceWithin() * 1.3333334f);
                            }
                        }
                        if (z2) {
                            paragraphFormat.getBullet().setType((byte) 1);
                            paragraphFormat.getBullet().setChar((char) 8226);
                        }
                        if (paragraphFormat.getAlignment() == -1) {
                            paragraphFormat.setAlignment(m4729x1((list.size() != 1 || z2) ? h4gVar.m6998c5() : h4gVar.m7001dy()));
                        }
                    } finally {
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
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        textFrameFormat.m2964to((byte) 0);
        if (z) {
            textFrameFormat.setAnchoringType(m4727kk(h4gVar.m7002fa()));
            bM7010yj = h4gVar.m7006ks();
        } else {
            textFrameFormat.setAnchoringType(m4727kk(h4gVar.m6999ck()));
            bM7010yj = h4gVar.m7010yj();
        }
        textFrameFormat.setCenterText(bM7010yj);
        ITextFrameFormat textFrameFormat2 = list.get_Item(0).m5147up().m71867k4().getTextFrameFormat();
        if (textFrameFormat2.getAnchoringType() != -1) {
            textFrameFormat.setAnchoringType(textFrameFormat2.getAnchoringType());
        }
        if (textFrameFormat2.getCenterText() != -1) {
            textFrameFormat.setCenterText(textFrameFormat2.getCenterText());
        }
        textFrameFormat.setColumnSpacing(0.10000000149011612d);
        textFrameFormat.setWrapText((byte) 1);
        textFrameFormat.setAutofitType((byte) 0);
        if (textFrameFormat2.getTextVerticalType() != -1) {
            textFrameFormat.setTextVerticalType(textFrameFormat2.getTextVerticalType());
        } else {
            textFrameFormat.setTextVerticalType(h4gVar.m7009up() ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3645k4(int i) {
        return i == 22 || i == 27 || i == 33 || i == 5 || i == 19 || i == 25;
    }

    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    public boolean mo3646k4(bay bayVar) throws Throwable {
        cpm cpmVar;
        xyf xyfVar;
        bayVar.m4074dy().m74259kk(bayVar.m4072du(61));
        if (bayVar.m4112x1(61)) {
            bayVar.m4074dy().m74259kk(bayVar.m4074dy().m74233dy() + bayVar.m4072du(63));
        }
        bayVar.m4074dy().m74239h4(bayVar.m4072du(15));
        if (bayVar.m4112x1(15)) {
            bayVar.m4074dy().m74239h4(bayVar.m4074dy().m74236fa() + bayVar.m4072du(17));
        }
        if (bayVar.m4082k4() != null && bayVar.m4082k4().m4082k4() != null && (xyfVar = (xyf) C7019kk.m27452k4((Object) bayVar.m4082k4().m4082k4().m4077jd(), xyf.class)) != null && !xyfVar.m73655dy()) {
            return true;
        }
        if (m4713c5(bayVar)) {
            bayVar.m4074dy().m74253k4(true);
            if (C14044b3.m66437kk(bayVar.m4074dy().m74273um())) {
                bayVar.m4074dy().m74242jd(bayVar.m4074dy().m74233dy());
            }
            boolean zM4096kk = bayVar.m4096kk(61);
            if (zM4096kk) {
                cpmVar = this;
            } else {
                bayVar.m4074dy().m74259kk(Double.MAX_VALUE);
                cpmVar = this;
                cpmVar.m4722k4(bayVar, false);
                m4717jd(bayVar);
            }
            double dM4098m9 = bayVar.m4098m9(22);
            double dM4098m92 = bayVar.m4098m9(27);
            double d = dM4098m9;
            C0865x1 c0865x1Clone = cpmVar.m4730x1(bayVar, dM4098m9, dM4098m92).Clone();
            while (c0865x1Clone.m4743k4() && m4726k4(bayVar, -1.0d, c0865x1Clone.f4404k4, c0865x1Clone.f4405x1, false)) {
                double d2 = d;
                m4730x1(bayVar, d2, dM4098m92).CloneTo(c0865x1Clone);
                d = d2;
            }
            if (!zM4096kk) {
                m4717jd(bayVar);
            }
        } else {
            double dM4715dy = m4715dy(bayVar);
            if (!bayVar.m4074dy().m74289yd()) {
                double dM4098m93 = bayVar.m4098m9(22);
                double dM4098m94 = bayVar.m4098m9(27);
                double d3 = dM4098m93;
                double d4 = dM4098m94;
                C0865x1 c0865x1Clone2 = m4730x1(bayVar, dM4098m93, dM4098m94).Clone();
                boolean z = c0865x1Clone2.f4404k4;
                C0864k4 c0864k4M4714ck = m4714ck(bayVar);
                double dM4735k4 = z ? c0864k4M4714ck.m4735k4() : c0864k4M4714ck.m4740x1();
                double dM67497to = z ? C14116yg.m67497to(d3 / 2.0d) : C14116yg.m67497to(d4 / 2.0d);
                while (c0865x1Clone2.m4743k4()) {
                    double d5 = dM4735k4 - dM67497to;
                    double d6 = d5 < 1.0d ? dM67497to : (d5 / 2.0d) + dM67497to;
                    m4725k4(bayVar, d6, d6, c0865x1Clone2.f4404k4, c0865x1Clone2.f4405x1, true);
                    double[] dArr = {0.0d};
                    double[] dArr2 = {0.0d};
                    boolean z2 = z;
                    boolean[] zArr = {false};
                    double d7 = d3;
                    double d8 = d4;
                    m4723k4(bayVar, d7, d8, dArr, dArr2, zArr).CloneTo(c0865x1Clone2);
                    double d9 = dArr[0];
                    double d10 = dArr2[0];
                    boolean z3 = zArr[0];
                    if (d9 < 0.9999d || d10 < 0.9999d || z3) {
                        C0864k4 c0864k4M4714ck2 = m4714ck(bayVar);
                        dM4735k4 = z2 ? c0864k4M4714ck2.m4735k4() : c0864k4M4714ck2.m4740x1();
                    } else if (d9 > 1.001d || d10 > 1.001d) {
                        C0864k4 c0864k4M4714ck3 = m4714ck(bayVar);
                        double dM4735k42 = z2 ? c0864k4M4714ck3.m4735k4() : c0864k4M4714ck3.m4740x1();
                        c0865x1Clone2.f4404k4 = z2;
                        c0865x1Clone2.f4405x1 = !z2;
                        dM67497to = dM4735k42;
                    }
                    if (dM4735k4 - dM67497to <= 1.0d) {
                        break;
                    }
                    d4 = d8;
                    z = z2;
                    d3 = d7;
                }
            } else if (dM4715dy > bayVar.m4074dy().m74236fa()) {
                bayVar.m4095kk(15, dM4715dy);
                bayVar.m4074dy().m74239h4(bayVar.m4072du(15));
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m4733k4(bay bayVar, double d, double d2) {
        return !m4730x1(bayVar, d, d2).m4743k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m4725k4(bay bayVar, double d, double d2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C0864k4 c0864k4Clone = m4714ck(bayVar).Clone();
        if (!z || c0864k4Clone.m4735k4() <= 1.0d || c0864k4Clone.m4735k4() >= 1000.0d) {
            z4 = false;
        } else {
            double dM74154k4 = yz6.m74154k4(d);
            bayVar.m4088k4(22, dM74154k4, z3);
            bayVar.m4105um();
            z4 = !AbstractC0753ak.m3634k4(bayVar.m4072du(22), dM74154k4);
        }
        if (!z2 || c0864k4Clone.m4740x1() <= 1.0d || c0864k4Clone.m4740x1() >= 1000.0d) {
            return z4;
        }
        bayVar.m4088k4(27, yz6.m74154k4(d2), z3);
        bayVar.m4105um();
        return (!AbstractC0753ak.m3634k4(bayVar.m4072du(27), r9)) | z4;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m4726k4(bay bayVar, double d, boolean z, boolean z2, boolean z3) {
        boolean z4;
        double dM67491kk;
        C0864k4 c0864k4Clone = m4714ck(bayVar).Clone();
        if (!z || c0864k4Clone.m4735k4() <= 1.0d || c0864k4Clone.m4735k4() >= 1000.0d) {
            z4 = false;
            dM67491kk = 1.0d;
        } else {
            double dM67497to = C14116yg.m67497to(d) + c0864k4Clone.m4735k4();
            dM67491kk = C14116yg.m67491kk(1.0d, dM67497to / c0864k4Clone.m4735k4());
            double dM74154k4 = yz6.m74154k4(dM67497to);
            bayVar.m4088k4(22, dM74154k4, z3);
            bayVar.m4105um();
            z4 = !AbstractC0753ak.m3634k4(bayVar.m4072du(22), dM74154k4);
        }
        if (!z2 || c0864k4Clone.m4740x1() <= 1.0d || c0864k4Clone.m4740x1() >= 1000.0d) {
            return z4;
        }
        double dM67497to2 = C14116yg.m67497to(d) + c0864k4Clone.m4740x1();
        C14116yg.m67491kk(dM67491kk, dM67497to2 / c0864k4Clone.m4740x1());
        bayVar.m4088k4(27, yz6.m74154k4(dM67497to2), z3);
        bayVar.m4105um();
        return (!AbstractC0753ak.m3634k4(bayVar.m4072du(27), r13)) | z4;
    }
}
