package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Fonts;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: loaded from: classes3.dex */
class sd3 {

    /* JADX INFO: renamed from: ar */
    private boolean f48800ar;

    /* JADX INFO: renamed from: bv */
    private float f48801bv;

    /* JADX INFO: renamed from: c5 */
    private C14293pl f48802c5;

    /* JADX INFO: renamed from: ck */
    private C14293pl f48803ck;

    /* JADX INFO: renamed from: du */
    private final InterfaceC14631uf f48804du;

    /* JADX INFO: renamed from: fa */
    private InterfaceC14631uf f48806fa;

    /* JADX INFO: renamed from: ix */
    private int f48808ix;

    /* JADX INFO: renamed from: jd */
    private float f48809jd;

    /* JADX INFO: renamed from: k4 */
    private final ay6 f48810k4;

    /* JADX INFO: renamed from: kk */
    private final nrw f48811kk;

    /* JADX INFO: renamed from: ks */
    private float f48812ks;

    /* JADX INFO: renamed from: lr */
    private final List<vyd> f48813lr;

    /* JADX INFO: renamed from: ne */
    private float f48815ne;

    /* JADX INFO: renamed from: qq */
    private boolean f48816qq;

    /* JADX INFO: renamed from: rv */
    private float f48817rv;

    /* JADX INFO: renamed from: to */
    private final InterfaceC14631uf f48818to;

    /* JADX INFO: renamed from: u4 */
    private InterfaceC14631uf f48819u4;

    /* JADX INFO: renamed from: um */
    private boolean f48820um;

    /* JADX INFO: renamed from: up */
    private InterfaceC14631uf f48821up;

    /* JADX INFO: renamed from: uz */
    private InterfaceC14631uf f48822uz;

    /* JADX INFO: renamed from: v4 */
    private final List<fko> f48823v4;

    /* JADX INFO: renamed from: wl */
    private float f48824wl;

    /* JADX INFO: renamed from: x1 */
    private final ghm f48825x1;

    /* JADX INFO: renamed from: x6 */
    private float f48826x6;

    /* JADX INFO: renamed from: yj */
    private InterfaceC14631uf f48827yj;

    /* JADX INFO: renamed from: h4 */
    private boolean f48807h4 = false;

    /* JADX INFO: renamed from: m9 */
    private boolean f48814m9 = false;

    /* JADX INFO: renamed from: dy */
    private boolean f48805dy = true;

    public sd3(ay6 ay6Var, ghm ghmVar, nrw nrwVar, InterfaceC14631uf interfaceC14631uf, InterfaceC14631uf interfaceC14631uf2, List<fko> list, List<vyd> list2, float f) {
        C14293pl c14293pl = C14293pl.f48090to;
        this.f48802c5 = c14293pl.Clone();
        this.f48809jd = 0.0f;
        this.f48803ck = c14293pl.Clone();
        this.f48810k4 = ay6Var;
        this.f48825x1 = ghmVar;
        this.f48811kk = nrwVar;
        this.f48818to = interfaceC14631uf2;
        this.f48804du = interfaceC14631uf;
        this.f48823v4 = list;
        this.f48813lr = list2;
        this.f48806fa = interfaceC14631uf;
        this.f48821up = interfaceC14631uf;
        this.f48827yj = interfaceC14631uf;
        this.f48812ks = f;
        this.f48817rv = f;
        this.f48826x6 = f;
        this.f48815ne = f;
        this.f48808ix = 0;
        this.f48819u4 = interfaceC14631uf;
        this.f48822uz = interfaceC14631uf2;
        this.f48824wl = 0.0f;
        this.f48816qq = false;
        float f2 = (!ay6Var.m3842c5() || ay6Var.m3848jd() <= 0.0f) ? 11520.0f : ay6Var.f4027x1;
        this.f48801bv = f2;
        fqc fqcVar = nrwVar.f47603k4;
        this.f48801bv = f2 - fqcVar.getMarginRight();
        this.f48800ar = fqcVar.getLatinLineBreak();
        this.f48820um = fqcVar.getHangingPunctuation() && ay6Var.f4010k4.getTextFrameFormat().getEffective().getMarginRight() > 0.0d && ay6Var.f4010k4.getTextFrameFormat().getAutofitType() == 2;
        Cell[] cellArr = {null};
        boolean zM63959k4 = kke.m63959k4(Cell.class, ay6Var.f4010k4, cellArr);
        Cell cell = cellArr[0];
        if (zM63959k4) {
            this.f48820um = false;
            this.f48801bv -= ((float) (cell.getMarginRight() + cell.getMarginLeft())) / 150.0f;
        }
        if (kke.m63959k4(Chart.class, ay6Var.f4010k4, new Chart[]{null})) {
            this.f48800ar = true;
            this.f48801bv += 0.6f;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private float m70563k4(InterfaceC14631uf interfaceC14631uf, InterfaceC14631uf interfaceC14631uf2, C14251ot c14251ot, qy7 qy7Var) {
        C14293pl c14293pl = new C14293pl();
        C14293pl[] c14293plArr = {c14293pl};
        float fM6667k4 = this.f48825x1.m6667k4(this.f48811kk, interfaceC14631uf, interfaceC14631uf2, c14251ot, qy7Var, Integer.MIN_VALUE, this.f48810k4.m3870yj(), new AbstractC4687to<InterfaceC14631uf, qy7>() { // from class: com.aspose.slides.sd3.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(sd3.this.f48810k4) + "Aspose.Slides.TextLayout.CreateTextParam(Aspose.Slides.TextLayoutParts.ICharIterator)";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public qy7 invoke(InterfaceC14631uf interfaceC14631uf3) {
                return sd3.this.f48810k4.m3855k4(interfaceC14631uf3);
            }
        }, c14293plArr);
        c14293plArr[0].CloneTo(c14293pl);
        return fM6667k4;
    }

    /* JADX INFO: renamed from: k4 */
    private float m70564k4(InterfaceC14631uf interfaceC14631uf, InterfaceC14631uf interfaceC14631uf2, C14251ot c14251ot, qy7 qy7Var, C14293pl[] c14293plArr) {
        return this.f48825x1.m6667k4(this.f48811kk, interfaceC14631uf, interfaceC14631uf2, c14251ot, qy7Var, Integer.MIN_VALUE, this.f48810k4.m3870yj(), new AbstractC4687to<InterfaceC14631uf, qy7>() { // from class: com.aspose.slides.sd3.5
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(sd3.this.f48810k4) + "Aspose.Slides.TextLayout.CreateTextParam(Aspose.Slides.TextLayoutParts.ICharIterator)";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public qy7 invoke(InterfaceC14631uf interfaceC14631uf3) {
                return sd3.this.f48810k4.m3855k4(interfaceC14631uf3);
            }
        }, c14293plArr);
    }

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14631uf m70566k4(InterfaceC14631uf interfaceC14631uf, InterfaceC14631uf interfaceC14631uf2, byte b, float f, float f2, float f3) {
        float f4;
        int i = 2;
        byte b2 = 1;
        if (f3 < 0.01f && f + 0.01f < f2) {
            return interfaceC14631uf;
        }
        r7c r7cVarMo6446k4 = interfaceC14631uf.mo6446k4();
        boolean hangingPunctuation = this.f48811kk.f47603k4.getHangingPunctuation();
        boolean eastAsianLineBreak = this.f48811kk.f47603k4.getEastAsianLineBreak();
        InterfaceC14631uf interfaceC14631ufMo6449m9 = (interfaceC14631uf.mo6447k4(interfaceC14631uf2) && interfaceC14631uf.mo6448kk() == '\t') ? interfaceC14631uf.mo6449m9() : interfaceC14631uf;
        qy7 qy7VarM3854k4 = this.f48810k4.m3854k4(interfaceC14631ufMo6449m9.mo6446k4(), interfaceC14631ufMo6449m9.mo6451x1(), interfaceC14631ufMo6449m9.mo6448kk());
        C14251ot c14251otM69882b3 = qy7VarM3854k4.m69882b3();
        InterfaceC14631uf interfaceC14631uf3 = interfaceC14631uf;
        boolean zM69890dy = qy7VarM3854k4.m69890dy();
        float f5 = 0.0f;
        float f6 = 0.0f;
        byte b3 = 0;
        float f7 = 0.0f;
        qy7 qy7VarM3854k42 = qy7VarM3854k4;
        InterfaceC14631uf interfaceC14631uf4 = interfaceC14631uf3;
        while (interfaceC14631ufMo6449m9.mo6447k4(interfaceC14631uf2)) {
            if (zM69890dy != interfaceC14631ufMo6449m9.mo6446k4().f48541k4.getFontBold()) {
                zM69890dy = interfaceC14631ufMo6449m9.mo6446k4().f48541k4.getFontBold();
                qy7VarM3854k42 = this.f48810k4.m3854k4(interfaceC14631ufMo6449m9.mo6446k4(), interfaceC14631ufMo6449m9.mo6451x1(), interfaceC14631ufMo6449m9.mo6448kk());
                c14251otM69882b3 = qy7VarM3854k42.m69882b3();
                interfaceC14631uf4 = interfaceC14631ufMo6449m9;
                f6 = f5;
            } else {
                String strM67389k4 = C14113y2.m67389k4(interfaceC14631ufMo6449m9.mo6448kk(), b2);
                if (C14117yj.m67514du(interfaceC14631ufMo6449m9.mo6448kk())) {
                    char cMo6448kk = interfaceC14631ufMo6449m9.mo6448kk();
                    char cMo6448kk2 = interfaceC14631ufMo6449m9.mo6449m9().mo6448kk();
                    f4 = 0.0f;
                    char[] cArr = new char[i];
                    cArr[0] = cMo6448kk;
                    cArr[b2] = cMo6448kk2;
                    strM67389k4 = C14113y2.m67405k4(cArr);
                    interfaceC14631ufMo6449m9 = interfaceC14631ufMo6449m9.mo6449m9().mo6449m9();
                } else {
                    f4 = 0.0f;
                }
                InterfaceC14631uf interfaceC14631uf5 = interfaceC14631ufMo6449m9;
                if (r7cVarMo6446k4.f48541k4.getTextCapType() == i) {
                    strM67389k4 = C14113y2.m67358c5(strM67389k4);
                }
                float fM56699x1 = this.f48825x1.m6672k4(strM67389k4, qy7VarM3854k42).m56699x1();
                C14293pl c14293pl = new C14293pl();
                InterfaceC14631uf interfaceC14631uf6 = interfaceC14631uf4;
                C14293pl[] c14293plArr = {c14293pl};
                float fM70564k4 = f6 + m70564k4(interfaceC14631uf6, interfaceC14631uf5.mo6449m9(), c14251otM69882b3, qy7VarM3854k42, c14293plArr);
                c14293plArr[0].CloneTo(c14293pl);
                byte b4 = (hangingPunctuation && C3047dy.m12873kk(interfaceC14631uf5.mo6448kk())) ? b2 : (byte) 0;
                if (f - fM70564k4 < f4) {
                    if (b4 == 0) {
                        return interfaceC14631uf5;
                    }
                    if (b3 != 0 || (b == b2 && f7 + fM56699x1 > f && fM56699x1 <= this.f48810k4.f4027x1 && !eastAsianLineBreak)) {
                        return interfaceC14631uf3;
                    }
                }
                b3 = b4;
                interfaceC14631uf3 = interfaceC14631uf5;
                f7 = fM56699x1;
                i = 2;
                f5 = fM70564k4;
                interfaceC14631uf4 = interfaceC14631uf6;
                interfaceC14631ufMo6449m9 = interfaceC14631uf5.mo6449m9();
                b2 = 1;
            }
        }
        return interfaceC14631ufMo6449m9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[PHI: r3
      0x0019: PHI (r3v2 float) = (r3v1 float), (r3v8 float) binds: [B:15:0x002f, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m70567k4(List<fko> list, int i, InterfaceC14631uf interfaceC14631uf, float f, float f2, float f3, float f4, float[] fArr) {
        float f5;
        float f6;
        if (i != 0) {
            if (i == 1) {
                f5 = fArr[0];
                f6 = f - ((f5 - f2) / 2.0f);
                if ((f5 - f2) + f6 > f4) {
                }
            } else if (i == 2) {
                f6 = f - (fArr[0] - f2);
            } else if (i != 3) {
                f6 = f2;
            } else {
                f6 = f - (f3 - f2);
                f5 = fArr[0];
                if ((f5 - f2) + f6 > f4) {
                    f6 = f4 - (f5 - f2);
                }
            }
            if (f6 < f2) {
                f6 = f2;
            }
            list.addItem(new fko(interfaceC14631uf, f6));
            fArr[0] = (f6 - f2) + fArr[0];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0605, code lost:
    
        r51[r16 ? 1 : 0] = r51[r16 ? 1 : 0].mo6449m9();
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x089d, code lost:
    
        if (com.aspose.slides.internal.p077d8.C3047dy.m12875ks(r21) != false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0adc, code lost:
    
        if (((r5 - r15) / r15) > 0.2f) goto L449;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0c6b  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0c74  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0db3  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0dbd A[LOOP:0: B:3:0x0060->B:540:0x0dbd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0dbc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0743 A[ADDED_TO_REGION, EDGE_INSN: B:558:0x0743->B:282:0x0743 BREAK  A[LOOP:3: B:277:0x0720->B:281:0x0738], REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70568k4(InterfaceC14631uf[] interfaceC14631ufArr, boolean[] zArr) {
        InterfaceC14631uf interfaceC14631uf;
        float f;
        float fM6667k4;
        boolean z;
        InterfaceC14631uf interfaceC14631uf2;
        C14251ot c14251ot;
        qy7 qy7Var;
        float f2;
        boolean z2;
        boolean z3;
        boolean z4;
        float f3;
        boolean z5;
        C14251ot c14251ot2;
        qy7 qy7Var2;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f4;
        byte b;
        boolean z14;
        float f5;
        float fM67504x1;
        InterfaceC14631uf interfaceC14631uf3;
        InterfaceC14631uf interfaceC14631uf4;
        byte b2;
        boolean z15;
        InterfaceC14631uf interfaceC14631ufMo6441c5;
        byte b3;
        boolean z16;
        boolean z17;
        char c;
        char c2;
        float marginLeft;
        boolean z18;
        char c3;
        boolean z19;
        char c4;
        float fM67491kk;
        int i = 1;
        char c5 = 0;
        InterfaceC14631uf interfaceC14631ufMo6441c52 = interfaceC14631ufArr[0].mo6441c5();
        boolean fontBold = interfaceC14631ufArr[0].mo6446k4().f48541k4.getFontBold();
        boolean zEquals = "Hang".equals(Fonts.m1521k4(interfaceC14631ufArr[0].mo6446k4().f48541k4.getLanguageId()));
        boolean zEquals2 = "Arab".equals(Fonts.m1521k4(interfaceC14631ufArr[0].mo6446k4().f48541k4.getLanguageId()));
        byte bMo6451x1 = interfaceC14631ufArr[0].mo6451x1();
        qy7 qy7VarM3854k4 = this.f48810k4.m3854k4(interfaceC14631ufArr[0].mo6446k4(), bMo6451x1, interfaceC14631ufArr[0].mo6448kk());
        C14251ot c14251otM69882b3 = qy7VarM3854k4.m69882b3();
        boolean z20 = false;
        boolean z21 = false;
        while (true) {
            C14293pl c14293pl = new C14293pl();
            if (this.f48814m9) {
                InterfaceC14631uf interfaceC14631ufMo6449m9 = interfaceC14631ufArr[c5].mo6449m9();
                interfaceC14631ufArr[c5] = interfaceC14631ufMo6449m9;
                this.f48827yj = interfaceC14631ufMo6449m9;
                this.f48821up = interfaceC14631ufMo6449m9;
                this.f48806fa = interfaceC14631ufMo6449m9;
            }
            if (bMo6451x1 != interfaceC14631ufArr[c5].mo6451x1() || this.f48814m9 || fontBold != interfaceC14631ufArr[c5].mo6446k4().f48541k4.getFontBold()) {
                bMo6451x1 = interfaceC14631ufArr[c5].mo6451x1();
                qy7VarM3854k4 = this.f48810k4.m3854k4(interfaceC14631ufArr[c5].mo6446k4(), bMo6451x1, interfaceC14631ufArr[c5].mo6448kk());
                c14251otM69882b3 = qy7VarM3854k4.m69882b3();
                fontBold = interfaceC14631ufArr[c5].mo6446k4().f48541k4.getFontBold();
            }
            InterfaceC14631uf interfaceC14631uf5 = interfaceC14631ufArr[c5];
            if (this.f48816qq && this.f48822uz.mo6447k4(interfaceC14631ufMo6441c52)) {
                interfaceC14631ufMo6441c52 = this.f48822uz;
            }
            boolean z22 = c5;
            fko[] array = null;
            if (!interfaceC14631ufArr[c5].mo6447k4(interfaceC14631ufMo6441c52) || interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk() != '\t') {
                interfaceC14631uf = interfaceC14631ufMo6441c52;
                f = 0.0f;
                if (z20 || !this.f48810k4.m3870yj() || !interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4().f48541k4.m4829dy() || interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4().f48544x1.length() <= 0) {
                    boolean zEquals3 = "th-TH".equals(interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4().f48541k4.getLanguageId());
                    char cMo6448kk = interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk();
                    if (interfaceC14631ufArr[z22 ? 1 : 0].mo6442du() == 57346) {
                        InterfaceC14631uf interfaceC14631uf6 = interfaceC14631ufArr[z22 ? 1 : 0];
                        InterfaceC14631uf interfaceC14631ufMo6449m92 = interfaceC14631uf6.mo6449m9();
                        interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufMo6449m92;
                        if (interfaceC14631ufMo6449m92.mo6442du() == 57346 || C3047dy.m12875ks(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk())) {
                            interfaceC14631uf2 = interfaceC14631uf6;
                            qy7Var = qy7VarM3854k4;
                            c14251ot = c14251otM69882b3;
                            z2 = z22 ? 1 : 0;
                            fM6667k4 = 0.0f;
                            z3 = true;
                            z = z2;
                        } else {
                            interfaceC14631uf2 = interfaceC14631uf6;
                            qy7Var = qy7VarM3854k4;
                            c14251ot = c14251otM69882b3;
                            boolean z23 = z22 ? 1 : 0;
                            z = z23 ? 1 : 0;
                            fM6667k4 = 0.0f;
                            z3 = z23;
                        }
                    } else if (!((C3047dy.m12854h4(cMo6448kk) && !zEquals) || C3047dy.m12877m9(cMo6448kk) || zEquals3 || this.f48810k4.m3870yj()) || C3047dy.m12879qq(cMo6448kk)) {
                        if (C3047dy.m12869k4(interfaceC14631ufArr[z22 ? 1 : 0].mo6442du())) {
                            while (true) {
                                if (C3047dy.m12855ix(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk())) {
                                    interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                                }
                                InterfaceC14631uf interfaceC14631ufMo6449m93 = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                                interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufMo6449m93;
                                if (!C3047dy.m12869k4(interfaceC14631ufMo6449m93.mo6442du()) && interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk() != 8205 && !C3047dy.m12874kk((int) interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk())) {
                                    break;
                                }
                            }
                        } else if (C3047dy.m12855ix(cMo6448kk)) {
                            InterfaceC14631uf interfaceC14631ufMo6449m94 = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                            interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufMo6449m94;
                            interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufMo6449m94.mo6449m9();
                        } else {
                            lrb lrbVar = interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4().f48541k4;
                            float fM4837m9 = lrbVar.m4837m9();
                            float escapement = lrbVar.getEscapement();
                            float spacing = lrbVar.getSpacing();
                            qy7 qy7Var3 = qy7VarM3854k4;
                            C14251ot c14251otM69882b32 = c14251otM69882b3;
                            InterfaceC14631uf interfaceC14631uf7 = interfaceC14631uf5;
                            fM6667k4 = 0.0f;
                            while (true) {
                                if ((cMo6448kk == 0 || C3047dy.m12875ks(cMo6448kk) || cMo6448kk == '\n' || cMo6448kk == 11 || cMo6448kk == '\t' || (C3047dy.m12854h4(cMo6448kk) && !this.f48800ar && !zEquals)) && !C3047dy.m12879qq(cMo6448kk) && !C3047dy.m12845ar(cMo6448kk)) {
                                    break;
                                }
                                if (C3047dy.m12877m9(cMo6448kk) || C3047dy.m12852dy(cMo6448kk)) {
                                    break;
                                }
                                InterfaceC14631uf interfaceC14631ufMo6449m95 = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                                interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufMo6449m95;
                                lrb lrbVar2 = interfaceC14631ufMo6449m95.mo6446k4().f48541k4;
                                if ((this.f48816qq && interfaceC14631ufArr[z22 ? 1 : 0].mo6452x1(this.f48822uz)) || interfaceC14631ufArr[z22 ? 1 : 0].mo6442du() == 57346 || fM4837m9 != lrbVar2.m4837m9() || escapement != lrbVar2.getEscapement() || spacing != lrbVar2.getSpacing() || (bMo6451x1 != interfaceC14631ufArr[z22 ? 1 : 0].mo6451x1() && interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9().mo6448kk() != 0)) {
                                    break;
                                }
                                if (fontBold == lrbVar2.getFontBold() || interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk() == 0) {
                                    f2 = spacing;
                                } else {
                                    C14293pl[] c14293plArr = {c14293pl};
                                    fM6667k4 += this.f48825x1.m6667k4(this.f48811kk, interfaceC14631uf7, interfaceC14631ufArr[z22 ? 1 : 0], c14251otM69882b32, qy7Var3, interfaceC14631uf7.mo6446k4().m70034x1() + interfaceC14631uf7.mo6444h4(), this.f48810k4.m3870yj(), new AbstractC4687to<InterfaceC14631uf, qy7>() { // from class: com.aspose.slides.sd3.1
                                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                        public String getDelegateId() {
                                            return System.identityHashCode(sd3.this.f48810k4) + "Aspose.Slides.TextLayout.CreateTextParam(Aspose.Slides.TextLayoutParts.ICharIterator)";
                                        }

                                        @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
                                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                                        public qy7 invoke(InterfaceC14631uf interfaceC14631uf8) {
                                            return sd3.this.f48810k4.m3855k4(interfaceC14631uf8);
                                        }
                                    }, c14293plArr);
                                    c14293plArr[z22 ? 1 : 0].CloneTo(c14293pl);
                                    InterfaceC14631uf interfaceC14631uf8 = interfaceC14631ufArr[z22 ? 1 : 0];
                                    boolean fontBold2 = lrbVar2.getFontBold();
                                    byte bMo6451x12 = interfaceC14631ufArr[z22 ? 1 : 0].mo6451x1();
                                    f2 = spacing;
                                    qy7 qy7VarM3854k42 = this.f48810k4.m3854k4(interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4(), bMo6451x12, interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk());
                                    qy7Var3 = qy7VarM3854k42;
                                    interfaceC14631uf7 = interfaceC14631uf8;
                                    fontBold = fontBold2;
                                    bMo6451x1 = bMo6451x12;
                                    c14251otM69882b32 = qy7VarM3854k42.m69882b3();
                                }
                                if (C3047dy.m12869k4(interfaceC14631ufArr[z22 ? 1 : 0].mo6442du())) {
                                    break;
                                }
                                cMo6448kk = interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk();
                                spacing = f2;
                            }
                            boolean z24 = z22 ? 1 : 0;
                            z = z24 ? 1 : 0;
                            interfaceC14631uf2 = interfaceC14631uf7;
                            c14251ot = c14251otM69882b32;
                            qy7Var = qy7Var3;
                            z3 = z24;
                        }
                        qy7Var = qy7VarM3854k4;
                        c14251ot = c14251otM69882b3;
                        interfaceC14631uf2 = interfaceC14631uf5;
                        z2 = z22 ? 1 : 0;
                        fM6667k4 = 0.0f;
                        z3 = true;
                        z = z2;
                    } else {
                        short sMo6448kk = (short) cMo6448kk;
                        InterfaceC14631uf interfaceC14631ufMo6449m96 = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                        interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufMo6449m96;
                        String languageId = interfaceC14631ufMo6449m96.mo6446k4().f48541k4.getLanguageId();
                        Fonts.C0421k4[] c0421k4Arr = {null};
                        boolean z25 = (C3047dy.m12881to((int) interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk()) == 1 || ((C14113y2.m67411k4(languageId) || !Fonts.f2330x1.tryGetValue(languageId, c0421k4Arr)) ? z22 ? 1 : 0 : true ? c0421k4Arr[z22 ? 1 : 0].f2342kk : z22 ? 1 : 0) == 1) ? true : z22 ? 1 : 0;
                        String languageId2 = interfaceC14631ufArr[z22 ? 1 : 0].mo6443dy().mo6446k4().f48541k4.getLanguageId();
                        Fonts.C0421k4[] c0421k4Arr2 = {null};
                        boolean z26 = ((C3047dy.m12881to((int) interfaceC14631ufArr[z22 ? 1 : 0].mo6443dy().mo6448kk()) == 1 || ((C14113y2.m67411k4(languageId2) || !Fonts.f2330x1.tryGetValue(languageId2, c0421k4Arr2)) ? z22 ? 1 : 0 : true ? c0421k4Arr2[z22 ? 1 : 0].f2342kk : z22 ? 1 : 0) == 1) && C14117yj.m67513ck(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk())) ? true : z22 ? 1 : 0;
                        if (z25 || z26) {
                            if (C3047dy.m12871k4(sMo6448kk, (short) interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk())) {
                                sMo6448kk = (short) interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk();
                                interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                            }
                            if (C3047dy.m12886uz(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk()) && C3047dy.m12883u4((char) sMo6448kk)) {
                                interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                            }
                            if (C14117yj.m67513ck(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk()) && !C3047dy.m12879qq(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk()) && this.f48811kk.f47603k4.getAlignment() != 1 && interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9().mo6448kk() != 0) {
                                interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                            }
                            while (true) {
                                if (!C14117yj.m67534ks(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk()) || interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4().f48541k4.getFontUnderline() == 0) {
                                    break;
                                }
                                InterfaceC14631uf interfaceC14631ufMo6449m97 = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                                interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufMo6449m97;
                                if (!C14117yj.m67534ks(interfaceC14631ufMo6449m97.mo6448kk())) {
                                    while (!C14117yj.m67534ks(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk()) && C3047dy.m12881to((int) interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk()) != 1 && interfaceC14631ufArr[z22 ? 1 : 0].mo6447k4(this.f48818to)) {
                                        interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                                    }
                                }
                            }
                        }
                        qy7Var = qy7VarM3854k4;
                        c14251ot = c14251otM69882b3;
                        interfaceC14631uf2 = interfaceC14631uf5;
                        z2 = z25;
                        fM6667k4 = 0.0f;
                        z3 = true;
                        z = z2;
                    }
                    C14293pl[] c14293plArr2 = {c14293pl};
                    float fM6667k42 = fM6667k4 + this.f48825x1.m6667k4(this.f48811kk, interfaceC14631uf2, interfaceC14631ufArr[z22 ? 1 : 0], c14251ot, qy7Var, this.f48806fa.mo6446k4().m70034x1() + this.f48806fa.mo6444h4(), this.f48810k4.m3870yj(), new AbstractC4687to<InterfaceC14631uf, qy7>() { // from class: com.aspose.slides.sd3.2
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(sd3.this.f48810k4) + "Aspose.Slides.TextLayout.CreateTextParam(Aspose.Slides.TextLayoutParts.ICharIterator)";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public qy7 invoke(InterfaceC14631uf interfaceC14631uf9) {
                            return sd3.this.f48810k4.m3855k4(interfaceC14631uf9);
                        }
                    }, c14293plArr2);
                    c14293plArr2[z22 ? 1 : 0].CloneTo(c14293pl);
                    if (this.f48810k4.m3870yj()) {
                        fM6667k42 = c14293pl.f48091k4;
                    }
                    if (z && this.f48810k4.m3863kk()) {
                        ay6 ay6Var = this.f48810k4;
                        if (ay6Var.f4014m9 != 270.0f) {
                            fM6667k42 = ay6Var.m3850k4(interfaceC14631uf5, interfaceC14631uf5.mo6446k4()).m56697kk() + c14293pl.f48093x1;
                        }
                    }
                    z4 = fontBold;
                    f3 = fM6667k42;
                    z5 = z21;
                    c14251ot2 = c14251ot;
                    qy7Var2 = qy7Var;
                    z7 = z3;
                    InterfaceC14631uf interfaceC14631uf9 = interfaceC14631ufArr[z22 ? 1 : 0];
                    C14293pl.m69131k4(this.f48803ck.Clone(), c14293pl.Clone()).CloneTo(this.f48803ck);
                    this.f48809jd += f3;
                    this.f48814m9 = (interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk() != '\n' || interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk() == 11) ? true : z22 ? 1 : 0;
                    boolean z27 = interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk() != '\n' ? true : z22 ? 1 : 0;
                    z8 = z7;
                    z9 = (!interfaceC14631ufArr[z22 ? 1 : 0].mo6452x1(this.f48818to) || this.f48814m9) ? true : z22 ? 1 : 0;
                    if (!z8 || z9 || C3047dy.m12875ks(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk())) {
                        z10 = z9;
                    } else {
                        boolean z28 = z9;
                        z10 = z28;
                        if (interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk() != '\t') {
                            z10 = z28;
                            if (!C3047dy.m12854h4(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk())) {
                                z10 = z28;
                                if (!C3047dy.m12877m9(interfaceC14631ufArr[z22 ? 1 : 0].mo6443dy().mo6448kk())) {
                                    z10 = z28;
                                    if (!C3047dy.m12852dy(interfaceC14631ufArr[z22 ? 1 : 0].mo6443dy().mo6448kk())) {
                                        z11 = z22 ? 1 : 0;
                                        z12 = z28;
                                    }
                                }
                            }
                        }
                        while (true) {
                            z13 = z11;
                            if (interfaceC14631ufArr[z22 ? 1 : 0].mo6447k4(this.f48818to) || !C3047dy.m12875ks(interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk())) {
                                break;
                            }
                            interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                            z11 = z13 ? 1 : 0;
                        }
                        boolean z29 = z12;
                        if (interfaceC14631ufArr[z22 ? 1 : 0].mo6452x1(this.f48818to)) {
                            z29 = true;
                        }
                        boolean zM4829dy = z20 & interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4().f48541k4.m4829dy();
                        if (this.f48816qq && interfaceC14631ufArr[z22 ? 1 : 0].mo6452x1(this.f48822uz)) {
                            this.f48824wl = this.f48817rv + this.f48809jd;
                            InterfaceC14631uf interfaceC14631ufMo6441c53 = interfaceC14631ufArr[z22 ? 1 : 0].mo6441c5();
                            this.f48816qq = z22;
                            interfaceC14631uf = interfaceC14631ufMo6441c53;
                        }
                        f4 = this.f48809jd;
                        if (f4 <= f || this.f48817rv + f4 <= this.f48801bv) {
                            b = bMo6451x1;
                            z14 = z27;
                            f5 = 2.0f;
                            fM67504x1 = f;
                        } else {
                            InterfaceC14631uf interfaceC14631ufMo6443dy = interfaceC14631uf9.mo6443dy();
                            char cMo6448kk2 = interfaceC14631ufMo6443dy.mo6448kk();
                            InterfaceC14631uf interfaceC14631ufMo6443dy2 = interfaceC14631ufMo6443dy.mo6443dy();
                            InterfaceC14631uf interfaceC14631ufMo6449m98 = interfaceC14631ufMo6443dy2.mo6449m9().mo6449m9();
                            f5 = 2.0f;
                            b = bMo6451x1;
                            float fM56699x1 = this.f48825x1.m6668k4(C14113y2.m67389k4(cMo6448kk2, 1), c14251ot2, qy7Var2).m56699x1();
                            if (fM56699x1 == f) {
                                fM56699x1 = this.f48825x1.m6668k4(C14113y2.m67389k4(interfaceC14631ufMo6443dy2.mo6448kk(), 1), c14251ot2, qy7Var2).m56699x1();
                            }
                            float f6 = (interfaceC14631ufMo6443dy2.mo6451x1() == 1 && C3047dy.m12845ar(cMo6448kk2) && C14117yj.m67519h4(interfaceC14631ufMo6443dy2.mo6448kk()) && !zEquals) ? 0.9f * fM56699x1 : f;
                            boolean z30 = C3047dy.m12881to((int) cMo6448kk2) == 1;
                            boolean z31 = C3047dy.m12881to((int) cMo6448kk2) == 2;
                            if (z30 || z31) {
                                c4 = cMo6448kk2;
                            } else {
                                c4 = cMo6448kk2;
                                if (qy7Var2.m69921up() != 2 || C14116yg.m67480k4(qy7Var2.m69930x6()) >= 0.005d) {
                                    z14 = z27;
                                }
                                interfaceC14631uf9 = interfaceC14631ufMo6449m98;
                                fM67504x1 = f6;
                            }
                            if (z31 && c14251ot2.m68809dy() != -78 && (!zEquals2 || this.f48811kk.f47603k4.getIndent() < f)) {
                                fM67504x1 = 0.3f * fM56699x1;
                                if (fM67504x1 > 4.5f) {
                                    fM67504x1 = C14116yg.m67504x1(((fM67504x1 - 3.0f) / 2.0f) + 1.5f, 4.5f);
                                }
                                if (C14117yj.m67545x1(c4) == 6) {
                                    z14 = z27;
                                    fM67504x1 = fM56699x1;
                                    interfaceC14631uf9 = interfaceC14631ufMo6449m98;
                                } else {
                                    z14 = z27;
                                    interfaceC14631uf9 = interfaceC14631ufMo6449m98;
                                }
                            } else if (z31 || z30) {
                                z14 = z27;
                                if (z30) {
                                }
                                interfaceC14631uf9 = interfaceC14631ufMo6449m98;
                                fM67504x1 = f6;
                            } else {
                                if (z29) {
                                    fM67491kk = 1.0f;
                                    z14 = z27;
                                } else {
                                    z14 = z27;
                                    fM67491kk = (float) C14116yg.m67491kk(((TextFrameFormat) this.f48810k4.f4010k4.getTextFrameFormat()).getEffective().getMarginRight(), 1.0d);
                                }
                                fM67504x1 = fM67491kk * C14116yg.m67504x1(this.f48803ck.f48091k4 * 0.098f, 3.0f);
                                interfaceC14631uf9 = interfaceC14631ufMo6449m98;
                            }
                        }
                        InterfaceC14631uf interfaceC14631uf10 = interfaceC14631uf9;
                        if (this.f48817rv + this.f48809jd > ((double) (this.f48801bv + fM67504x1)) + 1.0E-4d) {
                            this.f48814m9 = false;
                            if (this.f48806fa.mo6452x1(this.f48821up)) {
                                float f7 = this.f48809jd - f3;
                                float f8 = this.f48801bv;
                                float f9 = (f8 - this.f48817rv) - f7;
                                float f10 = (f8 - this.f48812ks) - this.f48815ne;
                                interfaceC14631uf3 = interfaceC14631uf5;
                                z15 = z14 ? 1 : 0;
                                interfaceC14631uf4 = interfaceC14631uf10;
                                b2 = b;
                                InterfaceC14631uf interfaceC14631ufM70566k4 = m70566k4(interfaceC14631uf3, interfaceC14631uf4, b2, f9, f10, f7);
                                if (interfaceC14631ufM70566k4 == this.f48818to && C3047dy.m12873kk(interfaceC14631ufM70566k4.mo6443dy().mo6448kk())) {
                                    z19 = true;
                                } else {
                                    if (this.f48806fa.mo6452x1(interfaceC14631ufM70566k4)) {
                                        interfaceC14631ufM70566k4 = interfaceC14631ufM70566k4.mo6449m9();
                                    }
                                    interfaceC14631ufArr[0] = interfaceC14631ufM70566k4;
                                    this.f48827yj = interfaceC14631ufM70566k4;
                                    this.f48821up = interfaceC14631ufM70566k4;
                                    this.f48812ks = (this.f48809jd - f3) + m70563k4(interfaceC14631uf3, interfaceC14631ufM70566k4, c14251ot2, qy7Var2) + this.f48812ks;
                                    C14293pl.m69131k4(this.f48802c5.Clone(), this.f48803ck.Clone()).CloneTo(this.f48802c5);
                                    C14293pl.f48090to.CloneTo(this.f48803ck);
                                    this.f48809jd = f;
                                    zArr[0] = true;
                                    z19 = false;
                                    z5 = true;
                                }
                                z13 = z19;
                            } else {
                                interfaceC14631uf3 = interfaceC14631uf5;
                                interfaceC14631uf4 = interfaceC14631uf10;
                                b2 = b;
                                z15 = z14;
                                String languageId3 = interfaceC14631ufArr[0].mo6443dy().mo6446k4().f48541k4.getLanguageId();
                                Fonts.C0421k4[] c0421k4Arr3 = {null};
                                boolean z32 = C3047dy.m12881to((int) interfaceC14631ufArr[0].mo6443dy().mo6448kk()) == 1 && (!C14113y2.m67411k4(languageId3) && Fonts.f2330x1.tryGetValue(languageId3, c0421k4Arr3) ? c0421k4Arr3[0].f2342kk : 0) == 1;
                                if ((!z32 || this.f48800ar) && (t5o.m70967k4(this.f48811kk) || !this.f48820um || qy7Var2.m69885c5() || C14116yg.m67480k4(qy7Var2.m69930x6()) >= 0.005d || this.f48811kk.f47603k4.getAlignment() == 1)) {
                                    z18 = false;
                                    if (!z18) {
                                        InterfaceC14631uf interfaceC14631ufMo6443dy3 = interfaceC14631ufArr[0].mo6443dy().mo6443dy();
                                        if (C3047dy.m12879qq(interfaceC14631ufMo6443dy3.mo6448kk())) {
                                            while (C3047dy.m12879qq(interfaceC14631ufMo6443dy3.mo6448kk())) {
                                                interfaceC14631ufMo6443dy3 = interfaceC14631ufMo6443dy3.mo6443dy();
                                            }
                                            InterfaceC14631uf interfaceC14631ufMo6449m99 = interfaceC14631ufMo6443dy3.mo6449m9();
                                            if (this.f48806fa.mo6447k4(interfaceC14631ufMo6449m99)) {
                                                this.f48827yj = interfaceC14631ufMo6449m99;
                                                this.f48812ks -= m70563k4(interfaceC14631ufMo6449m99, interfaceC14631ufMo6449m99.mo6449m9(), c14251ot2, qy7Var2);
                                            }
                                            c3 = 0;
                                        } else {
                                            c3 = 0;
                                            if (interfaceC14631ufArr[0].mo6448kk() == 11 && interfaceC14631ufArr[0].mo6452x1(this.f48827yj)) {
                                                this.f48814m9 = true;
                                            }
                                        }
                                        InterfaceC14631uf interfaceC14631uf11 = this.f48827yj;
                                        interfaceC14631ufArr[c3] = interfaceC14631uf11;
                                        interfaceC14631ufMo6441c5 = interfaceC14631uf11.mo6441c5();
                                        this.f48809jd = 0.0f;
                                        z5 = true;
                                        z13 = false;
                                    }
                                } else {
                                    InterfaceC14631uf interfaceC14631ufMo6443dy4 = interfaceC14631ufArr[0];
                                    do {
                                        interfaceC14631ufMo6443dy4 = interfaceC14631ufMo6443dy4.mo6443dy();
                                        if (!C3047dy.m12875ks(interfaceC14631ufMo6443dy4.mo6448kk())) {
                                            break;
                                        }
                                    } while (!interfaceC14631ufMo6443dy4.mo6452x1(this.f48804du));
                                    if (C3047dy.m12873kk(interfaceC14631ufMo6443dy4.mo6448kk()) && (!C14117yj.m67550yj(interfaceC14631ufMo6443dy4.mo6443dy().mo6448kk()) || b2 != interfaceC14631ufMo6443dy4.mo6443dy().mo6451x1())) {
                                        while (C3047dy.m12873kk(interfaceC14631ufMo6443dy4.mo6448kk()) && !interfaceC14631ufMo6443dy4.mo6452x1(this.f48804du)) {
                                            interfaceC14631ufMo6443dy4 = interfaceC14631ufMo6443dy4.mo6443dy();
                                        }
                                        char cMo6448kk3 = interfaceC14631ufMo6443dy4.mo6448kk();
                                        if (!C3047dy.m12873kk(cMo6448kk3)) {
                                            if (z32 || C3047dy.m12881to((int) interfaceC14631ufMo6443dy4.mo6443dy().mo6448kk()) == 1) {
                                                if (C14117yj.m67519h4(cMo6448kk3) || C14117yj.m67534ks(cMo6448kk3) || ((!C14117yj.m67513ck(cMo6448kk3) || C3047dy.m12889wy(cMo6448kk3)) && !C3047dy.m12882to(interfaceC14631ufMo6443dy4.mo6449m9().mo6448kk()))) {
                                                    InterfaceC14631uf interfaceC14631ufMo6449m910 = interfaceC14631ufMo6443dy4.mo6449m9();
                                                    float f11 = this.f48801bv;
                                                    float f12 = this.f48809jd;
                                                    if (f11 <= f12 * f5) {
                                                        float f13 = this.f48817rv;
                                                    }
                                                    z18 = (this.f48817rv + f12) - m70563k4(interfaceC14631ufMo6449m910, interfaceC14631ufMo6449m910.mo6449m9(), c14251ot2, qy7Var2) <= this.f48801bv && (this.f48806fa.mo6449m9().mo6447k4(interfaceC14631ufMo6449m910) || this.f48806fa.mo6449m9().mo6452x1(interfaceC14631ufMo6449m910));
                                                    z13 = true;
                                                    if (!z18) {
                                                    }
                                                } else if (interfaceC14631ufMo6443dy4.mo6446k4().f48541k4.getEscapement() == 0.0f) {
                                                    this.f48827yj = interfaceC14631ufMo6443dy4;
                                                }
                                                z18 = false;
                                                if (!z18) {
                                                }
                                            } else {
                                                InterfaceC14631uf interfaceC14631ufMo6449m911 = interfaceC14631ufMo6443dy4.mo6449m9();
                                                if (C3047dy.m12881to((int) interfaceC14631ufArr[0].mo6448kk()) != 1) {
                                                    if ((this.f48817rv + this.f48809jd) - m70563k4(interfaceC14631ufMo6449m911, interfaceC14631ufMo6449m911.mo6449m9(), c14251ot2, qy7Var2) > this.f48801bv || (!this.f48806fa.mo6449m9().mo6447k4(interfaceC14631ufMo6449m911) && !this.f48806fa.mo6449m9().mo6452x1(interfaceC14631ufMo6449m911))) {
                                                    }
                                                    z13 = true;
                                                    if (!z18) {
                                                    }
                                                }
                                                z18 = false;
                                                if (!z18) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z13) {
                                    b3 = b2;
                                    z16 = z4;
                                } else {
                                    C14293pl.m69131k4(this.f48802c5.Clone(), this.f48803ck.Clone()).CloneTo(this.f48802c5);
                                    C14293pl c14293pl2 = C14293pl.f48090to;
                                    c14293pl2.CloneTo(this.f48803ck);
                                    b3 = b2;
                                    z16 = z4;
                                    float fM70563k4 = this.f48809jd + m70563k4(interfaceC14631uf4, interfaceC14631ufArr[0], c14251ot2, this.f48810k4.m3854k4(interfaceC14631uf4.mo6446k4(), interfaceC14631uf4.mo6451x1(), interfaceC14631uf4.mo6448kk()));
                                    if (interfaceC14631ufArr[0].mo6442du() == 57346 && interfaceC14631ufArr[0].mo6450to() != null) {
                                        fM70563k4 = interfaceC14631ufArr[0].mo6450to().f45756kk + this.f48809jd;
                                    }
                                    if (!this.f48807h4 || !this.f48806fa.mo6452x1(this.f48821up) || !interfaceC14631uf3.mo6452x1(interfaceC14631uf4)) {
                                        if (interfaceC14631uf3.mo6447k4(interfaceC14631uf4)) {
                                            this.f48812ks = this.f48817rv + this.f48809jd;
                                        }
                                        String languageId4 = interfaceC14631ufArr[0].mo6446k4().f48541k4.getLanguageId();
                                        Fonts.C0421k4[] c0421k4Arr4 = {null};
                                        int i2 = !C14113y2.m67411k4(languageId4) && Fonts.f2330x1.tryGetValue(languageId4, c0421k4Arr4) ? c0421k4Arr4[0].f2342kk : 0;
                                        if (!this.f48810k4.m3870yj() || i2 == 1) {
                                            marginLeft = this.f48817rv + fM70563k4;
                                        } else {
                                            this.f48817rv = this.f48802c5.f48091k4 + c14293pl.f48093x1 + this.f48817rv;
                                            this.f48827yj = interfaceC14631ufArr[0];
                                            this.f48809jd = 0.0f;
                                            this.f48821up = interfaceC14631uf4;
                                            if (!z29) {
                                                z17 = true;
                                            }
                                            if (z17) {
                                                c = 0;
                                            } else {
                                                float[] fArr = {this.f48812ks};
                                                m70567k4(this.f48823v4, this.f48808ix, this.f48819u4, this.f48815ne, this.f48826x6, this.f48824wl, this.f48801bv, fArr);
                                                float fM67481k4 = fArr[0];
                                                this.f48812ks = fM67481k4;
                                                if (!this.f48810k4.m3842c5()) {
                                                    fM67481k4 = C14116yg.m67481k4(fM67481k4, this.f48817rv);
                                                }
                                                float f14 = fM67481k4;
                                                if (this.f48823v4.size() > 0) {
                                                    c2 = 0;
                                                    array = this.f48823v4.toArray(new fko[0]);
                                                    this.f48823v4.clear();
                                                } else {
                                                    c2 = 0;
                                                }
                                                fko[] fkoVarArr = array;
                                                InterfaceC14631uf interfaceC14631uf12 = interfaceC14631ufArr[c2];
                                                while (!interfaceC14631uf12.mo6452x1(this.f48806fa) && C3047dy.m12875ks(interfaceC14631uf12.mo6443dy().mo6448kk())) {
                                                    InterfaceC14631uf interfaceC14631ufMo6443dy5 = interfaceC14631uf12.mo6443dy();
                                                    qy7 qy7VarM3854k43 = this.f48810k4.m3854k4(interfaceC14631ufMo6443dy5.mo6446k4(), interfaceC14631ufMo6443dy5.mo6451x1(), interfaceC14631ufMo6443dy5.mo6448kk());
                                                    C14293pl[] c14293plArr3 = {c14293pl};
                                                    this.f48825x1.m6667k4(this.f48811kk, interfaceC14631ufMo6443dy5, interfaceC14631ufMo6443dy5.mo6449m9(), qy7VarM3854k43.m69882b3(), qy7VarM3854k43, this.f48806fa.mo6446k4().m70034x1() + this.f48806fa.mo6444h4(), this.f48810k4.m3870yj(), new AbstractC4687to<InterfaceC14631uf, qy7>() { // from class: com.aspose.slides.sd3.3
                                                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                                        public String getDelegateId() {
                                                            return System.identityHashCode(sd3.this.f48810k4) + "Aspose.Slides.TextLayout.CreateTextParam(Aspose.Slides.TextLayoutParts.ICharIterator)";
                                                        }

                                                        @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
                                                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                                                        public qy7 invoke(InterfaceC14631uf interfaceC14631uf13) {
                                                            return sd3.this.f48810k4.m3855k4(interfaceC14631uf13);
                                                        }
                                                    }, c14293plArr3);
                                                    c14293plArr3[0].CloneTo(c14293pl);
                                                    C14293pl.m69131k4(this.f48802c5.Clone(), c14293pl.Clone()).CloneTo(this.f48802c5);
                                                    interfaceC14631uf12 = interfaceC14631ufMo6443dy5;
                                                }
                                                vyd vydVar = new vyd(this.f48811kk, this.f48806fa, interfaceC14631ufArr[0], f14, f14, this.f48802c5.Clone(), fkoVarArr, this.f48805dy);
                                                this.f48805dy = z15;
                                                this.f48813lr.addItem(vydVar);
                                                C14293pl.f48090to.CloneTo(this.f48802c5);
                                                InterfaceC14631uf interfaceC14631uf13 = interfaceC14631ufArr[0];
                                                this.f48821up = interfaceC14631uf13;
                                                this.f48806fa = interfaceC14631uf13;
                                                this.f48809jd = 0.0f;
                                                float marginLeft2 = this.f48811kk.f47603k4.getMarginLeft();
                                                this.f48817rv = marginLeft2;
                                                this.f48812ks = marginLeft2;
                                                this.f48807h4 = this.f48810k4.m3842c5() && !this.f48814m9;
                                                c = 0;
                                                this.f48808ix = 0;
                                                this.f48819u4 = this.f48806fa;
                                                this.f48815ne = 0.0f;
                                                z17 = false;
                                            }
                                            if (interfaceC14631ufArr[c].mo6447k4(interfaceC14631ufMo6441c5)) {
                                                return;
                                            }
                                            interfaceC14631ufMo6441c52 = interfaceC14631ufMo6441c5;
                                            qy7VarM3854k4 = qy7Var2;
                                            fontBold = z16;
                                            z20 = zM4829dy;
                                            bMo6451x1 = b3;
                                            c5 = c;
                                            c14251otM69882b3 = c14251ot2;
                                            z21 = z17;
                                            i = 1;
                                        }
                                    } else {
                                        this.f48806fa = interfaceC14631ufArr[0];
                                        c14293pl2.CloneTo(this.f48802c5);
                                        marginLeft = this.f48811kk.f47603k4.getMarginLeft();
                                    }
                                    this.f48817rv = marginLeft;
                                    this.f48827yj = interfaceC14631ufArr[0];
                                    this.f48809jd = 0.0f;
                                    this.f48821up = interfaceC14631uf4;
                                    if (!z29) {
                                    }
                                    if (z17) {
                                    }
                                    if (interfaceC14631ufArr[c].mo6447k4(interfaceC14631ufMo6441c5)) {
                                    }
                                }
                                z17 = z5;
                                if (z17) {
                                }
                                if (interfaceC14631ufArr[c].mo6447k4(interfaceC14631ufMo6441c5)) {
                                }
                            }
                        } else {
                            interfaceC14631uf3 = interfaceC14631uf5;
                            interfaceC14631uf4 = interfaceC14631uf10;
                            b2 = b;
                            z15 = z14;
                        }
                        interfaceC14631ufMo6441c5 = interfaceC14631uf;
                        if (z13) {
                        }
                        z17 = z5;
                        if (z17) {
                        }
                        if (interfaceC14631ufArr[c].mo6447k4(interfaceC14631ufMo6441c5)) {
                        }
                    }
                    z11 = true;
                    z12 = z10;
                    while (true) {
                        z13 = z11;
                        if (interfaceC14631ufArr[z22 ? 1 : 0].mo6447k4(this.f48818to)) {
                            break;
                        }
                        break;
                        break;
                        interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                        z11 = z13 ? 1 : 0;
                    }
                    boolean z292 = z12;
                    if (interfaceC14631ufArr[z22 ? 1 : 0].mo6452x1(this.f48818to)) {
                    }
                    boolean zM4829dy2 = z20 & interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4().f48541k4.m4829dy();
                    if (this.f48816qq) {
                        this.f48824wl = this.f48817rv + this.f48809jd;
                        InterfaceC14631uf interfaceC14631ufMo6441c532 = interfaceC14631ufArr[z22 ? 1 : 0].mo6441c5();
                        this.f48816qq = z22;
                        interfaceC14631uf = interfaceC14631ufMo6441c532;
                    }
                    f4 = this.f48809jd;
                    if (f4 <= f) {
                        b = bMo6451x1;
                        z14 = z27;
                        f5 = 2.0f;
                        fM67504x1 = f;
                    }
                    InterfaceC14631uf interfaceC14631uf102 = interfaceC14631uf9;
                    if (this.f48817rv + this.f48809jd > ((double) (this.f48801bv + fM67504x1)) + 1.0E-4d) {
                    }
                    interfaceC14631ufMo6441c5 = interfaceC14631uf;
                    if (z13) {
                    }
                    z17 = z5;
                    if (z17) {
                    }
                    if (interfaceC14631ufArr[c].mo6447k4(interfaceC14631ufMo6441c5)) {
                    }
                } else {
                    float f15 = this.f48817rv;
                    float fM56697kk = 0.0f;
                    for (int i3 = z22 ? 1 : 0; i3 < interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4().f48544x1.length(); i3++) {
                        char cCharAt = interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4().f48544x1.charAt(i3);
                        float[] fArr2 = new float[1];
                        fArr2[z22 ? 1 : 0] = 0.0f;
                        fM56697kk = this.f48825x1.m6671k4(C14113y2.m67389k4(cCharAt, 1), c14251otM69882b3, qy7VarM3854k4, fArr2).m56697kk();
                        f15 += fArr2[z22 ? 1 : 0] + fM56697kk;
                    }
                    if (f15 > this.f48801bv + C14116yg.m67504x1(fM56697kk * 0.063f, 3.0f)) {
                        z21 = true;
                    }
                    C14293pl.f48090to.CloneTo(c14293pl);
                    z4 = fontBold;
                    qy7Var2 = qy7VarM3854k4;
                    z5 = z21;
                    z6 = z22 ? 1 : 0;
                    f3 = 0.0f;
                    z20 = true;
                }
            } else {
                f = 0.0f;
                float[] fArr3 = new float[i];
                fArr3[z22 ? 1 : 0] = this.f48817rv;
                interfaceC14631uf = interfaceC14631ufMo6441c52;
                m70567k4(this.f48823v4, this.f48808ix, this.f48819u4, this.f48815ne, this.f48826x6, this.f48824wl, this.f48801bv, fArr3);
                float f16 = fArr3[z22 ? 1 : 0];
                this.f48817rv = f16;
                this.f48826x6 = f16;
                int[] iArr = {this.f48808ix};
                float fM6663k4 = ghm.m6663k4(this.f48811kk, f16, iArr);
                this.f48808ix = iArr[z22 ? 1 : 0];
                this.f48810k4.m3852k4(interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4()).CloneTo(c14293pl);
                this.f48815ne = this.f48817rv + fM6663k4;
                if (this.f48808ix != 0) {
                    fM6663k4 = 0.0f;
                }
                InterfaceC14631uf interfaceC14631ufMo6449m912 = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufMo6449m912;
                this.f48819u4 = interfaceC14631ufMo6449m912;
                if (this.f48808ix == 3) {
                    while (true) {
                        this.f48822uz = interfaceC14631ufMo6449m912;
                        if (!this.f48822uz.mo6447k4(this.f48818to) || this.f48822uz.mo6448kk() == '\t' || (this.f48822uz.mo6448kk() >= '0' && this.f48822uz.mo6448kk() <= '9')) {
                            break;
                        } else {
                            interfaceC14631ufMo6449m912 = this.f48822uz.mo6449m9();
                        }
                    }
                    while (this.f48822uz.mo6447k4(this.f48818to) && ((this.f48822uz.mo6448kk() >= '0' && this.f48822uz.mo6448kk() <= '9') || C3047dy.m12875ks(this.f48822uz.mo6448kk()))) {
                        InterfaceC14631uf interfaceC14631ufMo6449m913 = this.f48822uz.mo6449m9();
                        this.f48822uz = interfaceC14631ufMo6449m913;
                        if (interfaceC14631ufMo6449m913.mo6448kk() == ',' && this.f48822uz.mo6447k4(this.f48818to) && C14117yj.m67539to(this.f48822uz.mo6449m9().mo6448kk())) {
                            this.f48822uz = this.f48822uz.mo6449m9();
                        }
                    }
                    if (this.f48822uz.mo6452x1(this.f48818to) || this.f48822uz.mo6448kk() == '\t') {
                        this.f48808ix = 2;
                    } else {
                        this.f48816qq = true;
                    }
                } else {
                    this.f48822uz = this.f48818to;
                }
                f3 = fM6663k4;
                z4 = fontBold;
                qy7Var2 = qy7VarM3854k4;
                z5 = z21;
                z6 = z22 ? 1 : 0;
            }
            c14251ot2 = c14251otM69882b3;
            z7 = z6;
            InterfaceC14631uf interfaceC14631uf92 = interfaceC14631ufArr[z22 ? 1 : 0];
            C14293pl.m69131k4(this.f48803ck.Clone(), c14293pl.Clone()).CloneTo(this.f48803ck);
            this.f48809jd += f3;
            this.f48814m9 = (interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk() != '\n' || interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk() == 11) ? true : z22 ? 1 : 0;
            if (interfaceC14631ufArr[z22 ? 1 : 0].mo6448kk() != '\n') {
            }
            z8 = z7;
            if (interfaceC14631ufArr[z22 ? 1 : 0].mo6452x1(this.f48818to)) {
            }
            if (z8) {
                z10 = z9;
                z11 = true;
                z12 = z10;
            }
            while (true) {
                z13 = z11;
                if (interfaceC14631ufArr[z22 ? 1 : 0].mo6447k4(this.f48818to)) {
                }
                interfaceC14631ufArr[z22 ? 1 : 0] = interfaceC14631ufArr[z22 ? 1 : 0].mo6449m9();
                z11 = z13 ? 1 : 0;
            }
            boolean z2922 = z12;
            if (interfaceC14631ufArr[z22 ? 1 : 0].mo6452x1(this.f48818to)) {
            }
            boolean zM4829dy22 = z20 & interfaceC14631ufArr[z22 ? 1 : 0].mo6446k4().f48541k4.m4829dy();
            if (this.f48816qq) {
            }
            f4 = this.f48809jd;
            if (f4 <= f) {
            }
            InterfaceC14631uf interfaceC14631uf1022 = interfaceC14631uf92;
            if (this.f48817rv + this.f48809jd > ((double) (this.f48801bv + fM67504x1)) + 1.0E-4d) {
            }
            interfaceC14631ufMo6441c5 = interfaceC14631uf;
            if (z13) {
            }
            z17 = z5;
            if (z17) {
            }
            if (interfaceC14631ufArr[c].mo6447k4(interfaceC14631ufMo6441c5)) {
            }
        }
    }
}
