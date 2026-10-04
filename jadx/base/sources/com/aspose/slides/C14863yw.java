package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.yw */
/* JADX INFO: loaded from: classes3.dex */
final class C14863yw extends C0833bw {

    /* JADX INFO: renamed from: k4 */
    private boolean f50413k4;

    public C14863yw(AutoShape autoShape) {
        super(autoShape);
        this.f50413k4 = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final AutoShape m74116k4() {
        return (AutoShape) m5629du();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // com.aspose.slides.er8
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo5640kk() {
        float f;
        TextFrame textFrameM288x1 = m74116k4().m288x1();
        if (textFrameM288x1 == null) {
            return;
        }
        w0l w0lVarM2937b3 = ((TextFrameFormat) textFrameM288x1.getTextFrameFormat()).m2937b3();
        if (textFrameM288x1.getParagraphs().getCount() == 0 || w0lVarM2937b3.getAutofitType() != 2 || this.f50413k4 || m5629du().f3301ck == m5629du().mo275c5() || Connector.f2031k4.containsKey(Integer.valueOf(m74116k4().getShapeType())) || m5632h4().m2348ck() || m5629du().m2543ak()) {
            return;
        }
        this.f50413k4 = true;
        int alignment = textFrameM288x1.getParagraphs().get_Item(0).getParagraphFormat().getEffective().getAlignment();
        float f2 = 0.5f;
        float f3 = 1.0f;
        if (alignment == 1) {
            f = 0.5f;
        } else if (alignment == 2) {
            f = 1.0f;
        } else if (alignment != 3 && alignment != 4) {
            f = 0.0f;
        }
        byte anchoringType = w0lVarM2937b3.getAnchoringType();
        if (anchoringType != 1) {
            if (anchoringType == 2) {
                f2 = 1.0f;
            } else if (anchoringType != 4) {
                f2 = 0.0f;
            }
        }
        nuk nukVarClone = m5644up().Clone();
        oju ojuVarClone = oju.m68619k4(nukVarClone.f47615k4, oju.m68618k4(nukVarClone.f47617x1, 2)).Clone();
        if (C14064he.m66715kk(ojuVarClone.f47836k4 + ojuVarClone.f47837x1)) {
            this.f50413k4 = false;
            return;
        }
        boolean wrapText = w0lVarM2937b3.getWrapText();
        boolean zM72610ck = w0lVarM2937b3.m72610ck();
        pj5 pj5VarClone = textFrameM288x1.m2909k4(m74116k4()).Clone();
        C12007ix c12007ixClone = m74116k4().m1590x6().m3313k4(nukVarClone.f47615k4.Clone(), nukVarClone.f47617x1.Clone()).Clone();
        C4317dy c4317dyM63484k4 = jq6.m63484k4(nukVarClone.m68213k4().Clone(), c12007ixClone.Clone(), pj5VarClone.Clone(), (byte) 0, 0.0f, wrapText ? (byte) 1 : (byte) 0, zM72610ck ? (byte) 1 : (byte) 0);
        C12025x6[] c12025x6Arr = {new C12025x6(c12007ixClone.m56550c5() * f, c12007ixClone.m56575x1() * f2)};
        c4317dyM63484k4.m17342k4(c12025x6Arr);
        C12025x6 c12025x6Clone = c12025x6Arr[0].Clone();
        if (!wrapText && !zM72610ck) {
            f3 = 1.01f;
        }
        jq6.m63487k4(textFrameM288x1.f3523to, (c12007ixClone.m56550c5() - pj5VarClone.f48081x1) - pj5VarClone.f48080to, (c12007ixClone.m56575x1() - pj5VarClone.f48079kk) - pj5VarClone.f48078du, (kg7) null);
        oju ojuVarClone2 = textFrameM288x1.f3523to.mo64287dy().Clone();
        m74114k4((ojuVarClone2.f47836k4 + pj5VarClone.f48081x1 + pj5VarClone.f48080to) * f3, (ojuVarClone2.f47837x1 + pj5VarClone.f48079kk + pj5VarClone.f48078du) * f3);
        m5644up().CloneTo(nukVarClone);
        C4317dy c4317dyM63484k42 = jq6.m63484k4(nukVarClone.m68213k4().Clone(), c12007ixClone.Clone(), pj5VarClone.Clone(), (byte) 0, 0.0f, wrapText ? (byte) 1 : (byte) 0, zM72610ck ? (byte) 1 : (byte) 0);
        m74116k4().m1590x6().m3313k4(nukVarClone.f47615k4.Clone(), nukVarClone.f47617x1.Clone()).CloneTo(c12007ixClone);
        c12025x6Arr[0].m56891k4(c12007ixClone.m56550c5() * f);
        c12025x6Arr[0].m56898x1(c12007ixClone.m56575x1() * f2);
        c4317dyM63484k42.m17342k4(c12025x6Arr);
        oju ojuVar = nukVarClone.f47615k4;
        ojuVar.f47836k4 = (c12025x6Clone.m56897x1() - c12025x6Arr[0].m56897x1()) + ojuVar.f47836k4;
        oju ojuVar2 = nukVarClone.f47615k4;
        ojuVar2.f47837x1 = (c12025x6Clone.m56895kk() - c12025x6Arr[0].m56895kk()) + ojuVar2.f47837x1;
        m5629du().m2590x1(nukVarClone.Clone());
        textFrameM288x1.f3523to.mo64286du();
        this.f50413k4 = false;
        m5629du().mo277dy();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74117x1() {
        TextFrame textFrameM288x1 = m74116k4().m288x1();
        pj5 pj5VarClone = textFrameM288x1.m2909k4(m74116k4()).Clone();
        C0735a7 c0735a7M1590x6 = m74116k4().m1590x6();
        nuk nukVarClone = m5644up().Clone();
        C12007ix c12007ixClone = c0735a7M1590x6.m3313k4(nukVarClone.f47615k4.Clone(), nukVarClone.f47617x1.Clone()).Clone();
        jq6.m63487k4(textFrameM288x1.f3523to, (c12007ixClone.m56550c5() - pj5VarClone.f48081x1) - pj5VarClone.f48080to, (c12007ixClone.m56575x1() - pj5VarClone.f48079kk) - pj5VarClone.f48078du, (kg7) null);
    }

    /* JADX INFO: renamed from: x1 */
    private void m74115x1(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        FillFormat fillFormat;
        FillFormat fillFormatM1453du;
        boolean z;
        if (m74116k4().m288x1() != null && m74116k4().m288x1().m2905dy()) {
            ((Presentation) C7019kk.m27452k4((Object) m5629du().m2550f9().getPresentation(), Presentation.class)).m2349du().m1921k4("Rasterization of the current OMML content (mathematical data) is not supported", 1);
            fillFormat = (FillFormat) m5629du().getFillFormat();
            fillFormatM1453du = fillFormat.m1453du();
            try {
                m5629du().getFillFormat().setFillType((byte) 4);
                m5629du().getFillFormat().getPictureFillFormat().getPicture().setImage(((ImageCollection) m5632h4().getImages()).m1717k4());
                m5629du().getFillFormat().getPictureFillFormat().setPictureFillMode(1);
                super.mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
                return;
            } finally {
                fillFormat.m1456k4((IFillFormat) fillFormatM1453du);
            }
        }
        if (m74116k4().m279h4() == null) {
            super.mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
            return;
        }
        fillFormat = (FillFormat) m5629du().getFillFormat();
        fillFormatM1453du = fillFormat.m1453du();
        if (m5629du().m2548dq().m67989to() == 1) {
            m5629du().m2548dq().m67983k4((byte) -1);
            z = true;
        } else {
            z = false;
        }
        try {
            fillFormat.m1456k4(m74116k4().m279h4());
            super.mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
        } finally {
            if (z) {
                m5629du().m2548dq().m67983k4((byte) 1);
            }
        }
    }

    @Override // com.aspose.slides.C0833bw
    /* JADX INFO: renamed from: k4 */
    public C0962es mo4333k4(AbstractC14897zn abstractC14897zn, ShapeFrame shapeFrame, C11896dy c11896dy, C0962es[] c0962esArr, byte b, IFillParamSource iFillParamSource, kg7 kg7Var) {
        return (m74116k4().getUseBackgroundFill() && m74116k4().getFillFormat().getFillType() == -1) ? super.mo4333k4(abstractC14897zn, m5642m9().m405up(), c11896dy, c0962esArr, b, m5642m9().getBackground(), kg7Var) : super.mo4333k4(abstractC14897zn, shapeFrame, c11896dy, c0962esArr, b, iFillParamSource, kg7Var);
    }

    /* JADX INFO: renamed from: k4 */
    private void m74114k4(float f, float f2) {
        if (m74116k4().m288x1() == null) {
            return;
        }
        C12015qq c12015qqClone = m74116k4().m1591yj().m3314k4().m64261k4(new C12015qq(f, f2)).Clone();
        ShapeFrame shapeFrame = (ShapeFrame) m5629du().getFrame();
        m5629du().setFrame(new ShapeFrame(shapeFrame.getX(), shapeFrame.getY(), c12015qqClone.m56699x1(), c12015qqClone.m56697kk(), shapeFrame.getFlipH(), shapeFrame.getFlipV(), shapeFrame.getRotation()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:50:0x0147, B:52:0x0151, B:54:0x015b, B:56:0x0161, B:58:0x016e, B:63:0x017b, B:64:0x017e, B:65:0x017f, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:73:0x019b, B:78:0x01c6, B:79:0x01e4, B:57:0x0167), top: B:149:0x0147, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e4 A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #0 {all -> 0x0175, blocks: (B:50:0x0147, B:52:0x0151, B:54:0x015b, B:56:0x0161, B:58:0x016e, B:63:0x017b, B:64:0x017e, B:65:0x017f, B:67:0x0185, B:69:0x018b, B:71:0x0191, B:73:0x019b, B:78:0x01c6, B:79:0x01e4, B:57:0x0167), top: B:149:0x0147, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fe A[Catch: all -> 0x020c, TRY_ENTER, TryCatch #6 {all -> 0x020c, blocks: (B:87:0x01fe, B:89:0x0204, B:93:0x0212, B:96:0x0220, B:98:0x0226, B:100:0x022f), top: B:160:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0212 A[Catch: all -> 0x020c, TryCatch #6 {all -> 0x020c, blocks: (B:87:0x01fe, B:89:0x0204, B:93:0x0212, B:96:0x0220, B:98:0x0226, B:100:0x022f), top: B:160:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021c  */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.aspose.slides.er8] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.aspose.slides.yw] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.aspose.slides.er8, com.aspose.slides.yw] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.aspose.slides.C0833bw, com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) throws Throwable {
        ?? r4;
        char c;
        ?? r42;
        ?? r43;
        AbstractC14897zn abstractC14897zn2;
        C14851yl c14851yl;
        ?? r44;
        ?? Mo63844k4;
        IFillFormat iFillFormatM279h4;
        String str;
        AbstractC14897zn abstractC14897zn3 = abstractC14897zn;
        try {
            if (m5629du().getPlaceholder() != null) {
                if (m5629du().getPlaceholder().getType() != 6) {
                    str = m5629du().getPlaceholder().getType() == 7 ? "Header" : "Footer";
                }
                abstractC14897zn3.mo68796k4(str);
            }
            if (kg7Var != null) {
                kg7Var.m63840k4(m5629du().getHyperlinkClick());
            }
            TextFrame textFrameM288x1 = m74116k4().m288x1();
            ShapeFrame[] shapeFrameArr = {null};
            boolean z = true;
            boolean z2 = (textFrameM288x1 == null || textFrameM288x1.getText() == null || "".equals(C14113y2.m67440x1(textFrameM288x1.getText())) || m5629du().m2576t6().getPresentation().getFontsManager().getFontSubstRuleList().size() == 0 || jq6.m63489k4(textFrameM288x1.f3523to, shapeFrameArr, kg7Var)) ? false : true;
            ShapeFrame shapeFrame = shapeFrameArr[0];
            if (z2) {
                mo5640kk();
                nuk nukVarClone = m5641ks().Clone();
                C1258im c1258im = new C1258im();
                c1258im.f5734x1 = shapeFrame.getRotation();
                c1258im.f5733to = shapeFrame.getFlipH() == 1;
                if (shapeFrame.getFlipV() != 1) {
                    z = false;
                }
                c1258im.f5732kk = z;
                c = 0;
                m5629du().mo2564k4(new tbp(shapeFrame.getX(), shapeFrame.getY()), new tbp(shapeFrame.getWidth(), shapeFrame.getHeight()), c1258im);
                super.mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
                m5629du().m2563k4(nukVarClone.Clone());
                r42 = nukVarClone;
            } else {
                c = 0;
                super.mo4131k4(abstractC14897zn, kg7Var, interruptionToken);
                r42 = z2;
            }
            if (m5629du().getHidden() || textFrameM288x1 == null) {
                r43 = this;
                abstractC14897zn2 = abstractC14897zn3;
            } else {
                if (((TextFrameFormat) C7019kk.m27452k4((Object) textFrameM288x1.getTextFrameFormat(), TextFrameFormat.class)).m2975yj() == 2) {
                    C14851yl c14851yl2 = new C14851yl();
                    AbstractC14897zn[] abstractC14897znArr = {abstractC14897zn3};
                    C12007ix c12007ixClone = ((ShapeFrame) m5629du().getFrame()).m2660k4().Clone();
                    c14851yl2.m73926k4(abstractC14897znArr, c12007ixClone);
                    abstractC14897zn3 = abstractC14897znArr[c];
                    c14851yl = c14851yl2;
                    r4 = c12007ixClone;
                } else {
                    c14851yl = null;
                    r4 = r42;
                }
                AbstractC14897zn abstractC14897zn4 = abstractC14897zn3;
                try {
                    try {
                        C4317dy c4317dyM63485k4 = jq6.m63485k4(textFrameM288x1.f3523to, kg7Var);
                        try {
                            if (C0964eu.m5721k4(abstractC14897zn4, kg7Var, m74116k4(), textFrameM288x1) || C14360qu.m69754k4(abstractC14897zn4, kg7Var, m74116k4(), textFrameM288x1)) {
                                r44 = this;
                                if (kg7Var != null && kg7Var.m63835fa() != null) {
                                    kg7Var.m63840k4((IHyperlink) null);
                                    abstractC14897zn4.mo68800x1();
                                }
                                if (c14851yl != null) {
                                    AbstractC14897zn[] abstractC14897znArr2 = {abstractC14897zn4};
                                    c14851yl.m73925k4(abstractC14897znArr2);
                                    abstractC14897zn2 = abstractC14897znArr2[c];
                                    r43 = r44;
                                } else {
                                    abstractC14897zn2 = abstractC14897zn4;
                                    r43 = r44;
                                }
                            } else {
                                if (textFrameM288x1.m2926m9()) {
                                    C1099fg c1099fg = new C1099fg(null);
                                    try {
                                        c1099fg.m6175k4(abstractC14897zn4, kg7Var, m74116k4(), textFrameM288x1, c4317dyM63485k4);
                                    } finally {
                                        c1099fg.dispose();
                                    }
                                } else if (!textFrameM288x1.m2906fa() || jq6.m63488k4(textFrameM288x1) || textFrameM288x1.m2905dy() || (iFillFormatM279h4 = m74116k4().m279h4()) == null) {
                                    if (kg7Var == null) {
                                        kg7Var.m63842k4(new C12007ix(0.0f, 0.0f, textFrameM288x1.f3523to.mo64296kk().f47836k4, m5629du().getHeight()));
                                        Mo63844k4 = kg7Var.mo63844k4(abstractC14897zn4, textFrameM288x1, c4317dyM63485k4);
                                    } else {
                                        abstractC14897zn4.m74622kk(c4317dyM63485k4);
                                        boolean zMo64295k4 = textFrameM288x1.f3523to.mo64295k4(abstractC14897zn4, kg7Var);
                                        abstractC14897zn4.m74626rv();
                                        Mo63844k4 = zMo64295k4;
                                    }
                                    if (Mo63844k4 == 0) {
                                        r4 = this;
                                        try {
                                            r4.m74115x1(abstractC14897zn4, kg7Var, interruptionToken);
                                            r44 = r4;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (kg7Var != null && kg7Var.m63835fa() != null) {
                                                kg7Var.m63840k4((IHyperlink) null);
                                                abstractC14897zn4.mo68800x1();
                                            }
                                            if (c14851yl != null) {
                                                AbstractC14897zn[] abstractC14897znArr3 = {abstractC14897zn4};
                                                c14851yl.m73925k4(abstractC14897znArr3);
                                                abstractC14897zn3 = abstractC14897znArr3[c];
                                            } else {
                                                abstractC14897zn3 = abstractC14897zn4;
                                            }
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (kg7Var != null) {
                                                    kg7Var.m63840k4((IHyperlink) null);
                                                }
                                                if (r4.m5629du().getPlaceholder() != null && (r4.m5629du().getPlaceholder().getType() == 6 || r4.m5629du().getPlaceholder().getType() == 7)) {
                                                    abstractC14897zn3.mo68797kk();
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    if (kg7Var != null) {
                                        kg7Var.m63840k4((IHyperlink) null);
                                        abstractC14897zn4.mo68800x1();
                                    }
                                    if (c14851yl != null) {
                                    }
                                } else if (iFillFormatM279h4.getPictureFillFormat().getPicture().getImage() == ((ImageCollection) ((Presentation) m74116k4().m2583vj().getPresentation()).getImages()).m1717k4()) {
                                    if (kg7Var == null) {
                                    }
                                    if (Mo63844k4 == 0) {
                                    }
                                    if (kg7Var != null) {
                                    }
                                    if (c14851yl != null) {
                                    }
                                } else {
                                    Mo63844k4 = c;
                                    if (Mo63844k4 == 0) {
                                    }
                                    if (kg7Var != null) {
                                    }
                                    if (c14851yl != null) {
                                    }
                                }
                                r44 = this;
                                if (kg7Var != null) {
                                }
                                if (c14851yl != null) {
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r4 = this;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        abstractC14897zn3 = abstractC14897zn4;
                        if (kg7Var != null) {
                        }
                        if (r4.m5629du().getPlaceholder() != null) {
                            abstractC14897zn3.mo68797kk();
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r4 = this;
                    abstractC14897zn3 = abstractC14897zn4;
                    if (kg7Var != null) {
                    }
                    if (r4.m5629du().getPlaceholder() != null) {
                    }
                    throw th;
                }
            }
            if (kg7Var != null) {
                kg7Var.m63840k4((IHyperlink) null);
            }
            if (r43.m5629du().getPlaceholder() != null && (r43.m5629du().getPlaceholder().getType() == 6 || r43.m5629du().getPlaceholder().getType() == 7)) {
                abstractC14897zn2.mo68797kk();
            }
            if (r43.m74116k4().m288x1() != null) {
                if (r43.m74116k4().m288x1().f3519k4 != null) {
                    r43.m74116k4().m288x1().f3519k4.m2968wy();
                }
                r43.m74116k4().m288x1().f3523to.mo64286du();
                IGenericEnumerator<IParagraph> it = r43.m74116k4().m288x1().getParagraphs().iterator();
                while (it.hasNext()) {
                    try {
                        ((Paragraph) it.next()).m2172yj();
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            th = th6;
            r4 = this;
        }
    }
}
