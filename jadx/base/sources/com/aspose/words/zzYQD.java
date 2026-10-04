package com.aspose.words;

import com.aspose.words.ref.Ref;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQD {
    private zzYQF zzXNo;
    private boolean zzXNp = false;
    private boolean zzXNq = false;
    private boolean zzXOC;
    private zzYOR zzXRT;

    public zzYQD(zzYOR zzyor) {
        this.zzXRT = zzyor;
    }

    private boolean zzC(boolean z, boolean z2) {
        zzYQF zzyqf = this.zzXNo;
        return zzyqf.zzZfa > 0 || this.zzXNp || this.zzXNq || zzyqf.zzYUT || z2 || z;
    }

    private void zzEe(String str) {
        this.zzXRT.zzYsG().zz0(com.aspose.words.internal.zzZKN.format("fo:margin-{0}", str), zzEx(str));
    }

    private String zzEx(String str) {
        return this.zzXRT.zzr2(this.zzXNo.zzDj(str));
    }

    private void zzEz(String str) {
        zzGx(str);
        zzGy(str);
        zzEe(str);
        this.zzXRT.zzY(this.zzXNo.zzYsO(), str);
    }

    private void zzGx(String str) {
        Border borderZzGC;
        if (this.zzXNo.zzYsO().zzYya() || (borderZzGC = this.zzXNo.zzYsO().zzGC(str)) == null) {
            return;
        }
        this.zzXRT.zzYsG().zz0(com.aspose.words.internal.zzZKN.format("fo:padding-{0}", str), this.zzXRT.zzr2(com.aspose.words.internal.zzSA.zzr(borderZzGC.zz8K())));
    }

    private void zzGy(String str) {
        Border borderZzGC = this.zzXNo.zzYsO().zzGC(str);
        if (borderZzGC != null) {
            this.zzXRT.zzYsG().zz0(com.aspose.words.internal.zzZKN.format("fo:border-{0}", str), zzYTI.zzB(borderZzGC) ? this.zzXRT.zzz(borderZzGC) : "none");
        }
    }

    private void zzN(zzZ9Q zzz9q) {
        Node child;
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXNo.zzXNI) || paragraph == null || (child = paragraph.getChild(35, 0, false)) == null) {
            return;
        }
        this.zzXNo.zzXNI = "center";
        Object objZzPk = ((OfficeMath) child).zzZsL().zzPk(15010);
        if (objZzPk != null) {
            int iIntValue = ((Integer) objZzPk).intValue();
            if (iIntValue == 3) {
                this.zzXNo.zzXNI = "left";
            }
            if (iIntValue == 4) {
                this.zzXNo.zzXNI = "right";
            }
        }
        this.zzXNo.zzZfa++;
    }

    private static boolean zzO(Paragraph paragraph, int i) {
        return paragraph == null || !paragraph.isListItem() || paragraph.zzRB(false).zzZYj().zzPk(i) == null || (paragraph != null && paragraph.zzZYj().zzPk(i) != null && !paragraph.getParagraphFormat().isHeading());
    }

    private void zzP(zzZ9Q zzz9q) {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (paragraph != null && paragraph.isInCell()) {
            this.zzXRT.zzYs6();
        }
    }

    private static int zzQ(zzZ9Q zzz9q) {
        Document document;
        Object directParaAttr = zzz9q.getDirectParaAttr(1160);
        if (directParaAttr != null) {
            return ((Integer) directParaAttr).intValue();
        }
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (paragraph == null || (document = (Document) com.aspose.words.internal.zzZKW.zzZ(paragraph.getDocument(), Document.class)) == null || document.getOriginalLoadFormat() != 60) {
            Object objFetchInheritedParaAttr = zzz9q.fetchInheritedParaAttr(1160);
            if (objFetchInheritedParaAttr != null) {
                return ((Integer) objFetchInheritedParaAttr).intValue();
            }
            return 0;
        }
        Object objZzVv = paragraph.zzqy(0).zzVv(1160, 0);
        if (objZzVv != null) {
            return ((Integer) objZzVv).intValue();
        }
        return 0;
    }

    private static ParagraphFormat zzR(zzZ9Q zzz9q) {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (paragraph != null) {
            return paragraph.getParagraphFormat();
        }
        Style style = (Style) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Style.class);
        if (style != null) {
            return style.getParagraphFormat();
        }
        return null;
    }

    private void zzS(zzZ9Q zzz9q) {
        zzYQF zzyqf = this.zzXNo;
        if (!zzyqf.zzXNL || zzyqf.zzYsP() == Integer.MIN_VALUE) {
            return;
        }
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (paragraph == null || paragraph.zzYB4() != null) {
            this.zzXNo.zzri(StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1);
            return;
        }
        this.zzXNo.zzri(Integer.MIN_VALUE);
        zzYQF zzyqf2 = this.zzXNo;
        zzyqf2.zzZfa--;
    }

    private void zzT(zzZ9Q zzz9q) {
        zzYQF zzyqf = this.zzXNo;
        if (!zzyqf.zzXNM || zzyqf.zzYsQ() == Integer.MIN_VALUE) {
            return;
        }
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (paragraph == null || paragraph.zzYB9() != null) {
            this.zzXNo.zzrj(StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1);
            return;
        }
        this.zzXNo.zzrj(Integer.MIN_VALUE);
        zzYQF zzyqf2 = this.zzXNo;
        zzyqf2.zzZfa--;
    }

    private boolean zzU(zzZ9Q zzz9q) {
        Style style;
        if (this.zzXRT.getDocument().zzZpV().zzYUT && (style = (Style) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Style.class)) != null) {
            return style.getStyleIdentifier() == 0 || "Standard".equals(style.getName());
        }
        return false;
    }

    private zzZS zzW(zzZ9Q zzz9q, zzZS zzzs, boolean z) {
        if (!zzYOR.zzX(zzz9q, z)) {
            return zzzs;
        }
        zzZS zzzsZzbn = this.zzXRT.getDocument().getStyles().zzY36().zzbn();
        zzzs.zzY(zzzsZzbn);
        return zzzsZzbn;
    }

    private void zzWx(int i, int i2) {
        if (i == 1150) {
            this.zzXNo.zzrk(i2);
        } else {
            if (i != 1160) {
                throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Invalid indent key '{0}'.", Integer.valueOf(i)));
            }
            this.zzXNo.zzrl(i2);
        }
    }

    private boolean zzX(zzZ9Q zzz9q, boolean z) {
        TabStopCollection tabStopCollection;
        TabStopCollection tabStopCollection2 = new TabStopCollection();
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (paragraph != null) {
            TabStopCollection tabStops = paragraph.zzqy(0).zzZYj().getTabStops();
            tabStopCollection2 = zzZ9(paragraph);
            tabStopCollection = tabStops;
        } else {
            tabStopCollection = null;
        }
        if (tabStopCollection2.getCount() == 0) {
            tabStopCollection2 = this.zzXNo.zzXNG;
        }
        if (tabStopCollection2 == null || tabStopCollection2.getCount() == 0) {
            return false;
        }
        int i = 0;
        boolean zZzZ = true;
        for (int i2 = 0; i2 < tabStopCollection2.getCount(); i2++) {
            TabStop tabStop = tabStopCollection2.get(i2);
            int iZzY0E = tabStop.zzY0E();
            if (tabStopCollection != null) {
                while (i < tabStopCollection.getCount() && tabStopCollection.get(i).zzY0E() <= iZzY0E) {
                    TabStop tabStop2 = tabStopCollection.get(i);
                    if (tabStop2.zzY0E() < iZzY0E) {
                        zZzZ = zzZ(tabStop2, zZzZ, z);
                    }
                    i++;
                }
            }
            zZzZ = zzZ(tabStop, zZzZ, z);
        }
        while (tabStopCollection != null && i < tabStopCollection.getCount()) {
            zZzZ = zzZ(tabStopCollection.get(i), zZzZ, z);
            i++;
        }
        if (zZzZ) {
            return false;
        }
        this.zzXRT.zzYsG().zzo();
        return true;
    }

    private boolean zzY(zzZ9Q zzz9q, boolean z) {
        String string;
        zzYQF zzyqf = this.zzXNo;
        String str = zzyqf.zzXNF;
        if (str == null && zzyqf.zzXNE == null) {
            return z;
        }
        if (!z) {
            this.zzXRT.zzYsG().zzY("style:paragraph-properties");
        }
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (paragraph != null) {
            Iterator<T> it = paragraph.getRuns().iterator();
            int length = 0;
            while (it.hasNext()) {
                length += ((Run) it.next()).getText().length();
            }
            if (length <= 0) {
                length = 1;
            }
            string = Integer.toString(length);
        } else {
            string = null;
        }
        String str2 = string;
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if (str == null) {
            str = "1";
        }
        zzytgZzYsG.zzX("style:drop-cap", "style:lines", str, "style:distance", this.zzXNo.zzXNE, "style:length", str2);
        return true;
    }

    private void zzYw4() {
        Border borderZzYy9;
        zzYTI zzytiZzYsO = this.zzXNo.zzYsO();
        if (zzytiZzYsO.zzYya() && (borderZzYy9 = zzytiZzYsO.zzYy9()) != null) {
            this.zzXRT.zzYsG().zz0("fo:padding", this.zzXRT.zzr2(com.aspose.words.internal.zzSA.zzr(borderZzYy9.zz8K())));
        }
        zzEz("top");
        zzEz("bottom");
        zzEz("left");
        zzEz("right");
        this.zzXRT.zzZ(zzytiZzYsO);
    }

    private static boolean zzZ8(Paragraph paragraph) {
        if (paragraph != null) {
            return ((paragraph.zzYBd() instanceof Shape) || zzYOR.zzYB(paragraph)) && paragraph.getParagraphFormat() != null && paragraph.getParagraphFormat().zzYpA() == 2;
        }
        return false;
    }

    private static TabStopCollection zzZ9(Paragraph paragraph) {
        TabStopCollection tabStopCollection = new TabStopCollection();
        Iterator<T> it = paragraph.getChildNodes(26, false).iterator();
        while (it.hasNext()) {
            AbsolutePositionTab absolutePositionTab = (AbsolutePositionTab) com.aspose.words.internal.zzZKW.zzZ((SpecialChar) it.next(), AbsolutePositionTab.class);
            if (absolutePositionTab != null && absolutePositionTab.getAlignment() != 0) {
                tabStopCollection.add(new TabStop(zzYOU.zzZ(paragraph, absolutePositionTab), zzYOU.zzrt(absolutePositionTab.getAlignment()), zzYOU.zzru(absolutePositionTab.zzc0())));
            }
        }
        return tabStopCollection;
    }

    private void zzZc(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            this.zzXNo.zzXNy = TelemetryEventStrings.Value.TRUE;
            return;
        }
        Object objZzPk = this.zzXRT.getDocument().getFirstSection().zzYvR().zzPk(2120);
        if (objZzPk != null && ((Integer) objZzPk).intValue() != 0) {
            this.zzXNo.zzXNy = TelemetryEventStrings.Value.FALSE;
        } else {
            zzYQF zzyqf = this.zzXNo;
            zzyqf.zzZfa--;
        }
    }

    private void zzZd(Object obj) {
        if (obj != null) {
            TabStopCollection tabStopCollection = (TabStopCollection) obj;
            if (tabStopCollection.getCount() != 0) {
                this.zzXNo.zzXNG = tabStopCollection;
            }
        }
        zzYQF zzyqf = this.zzXNo;
        zzyqf.zzZfa--;
    }

    private boolean zzd(int i, Object obj) {
        return this.zzXNo.zzd(i, obj);
    }

    public final void zzSk(boolean z) {
        this.zzXNp = z;
    }

    public final void zzSl(boolean z) {
        this.zzXNq = z;
    }

    public final void zzZ(zzZ9Q zzz9q, zzZS zzzs, boolean z) {
        boolean z2 = true;
        this.zzXOC = true;
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        this.zzXNo = new zzYQF();
        zzZ(zzz9q, z);
        zzY(zzz9q, zzzs, z);
        if (this.zzXNo.zzYsN() != null) {
            zzY(zzz9q, this.zzXNo.zzYsN().zzZ6C(), z);
        }
        boolean zZzU = zzU(zzz9q);
        boolean zZzC = zzC(z, zZzU);
        if (zZzC) {
            zzZ(zzz9q, z, zzytgZzYsG, zZzU);
        }
        if (!zzX(zzz9q, zZzC) && !zZzC) {
            z2 = false;
        }
        if (zzY(zzz9q, z2)) {
            zzytgZzYsG.zzo();
        }
        this.zzXOC = false;
    }

    private String zzW(zzZ52 zzz52) {
        if (zzz52.zzZ4A() == 2) {
            return com.aspose.words.internal.zzZKN.format("{0}%", com.aspose.words.internal.zzJB.zzZZ(com.aspose.words.internal.zzZKQ.zzZa((((double) zzz52.getValue()) / 240.0d) * 100.0d)));
        }
        return this.zzXRT.zzr2(zzz52.getValue());
    }

    private void zzO(zzZ9Q zzz9q) {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (paragraph == null) {
            return;
        }
        Section parentSection = paragraph.getParentSection();
        zzYCZ zzyczZzYvR = parentSection.zzYvR();
        if (paragraph == parentSection.getBody().getFirstParagraph()) {
            Object objZzPk = zzyczZzYvR.zzPk(2180);
            Object objZzPk2 = zzyczZzYvR.zzPk(EditingLanguage.MALAY_BRUNEI_DARUSSALAM);
            if (objZzPk != null || objZzPk2 != null) {
                this.zzXNo.zzXNy = TelemetryEventStrings.Value.TRUE;
            }
            if (zzyczZzYvR.getRestartPageNumbering() && !this.zzXNp && !this.zzXNq) {
                this.zzXNo.zzXNs = com.aspose.words.internal.zzJB.zzWF(zzyczZzYvR.getPageStartingNumber());
                this.zzXNo.zzZfa++;
            }
        }
        if (!TelemetryEventStrings.Value.TRUE.equals(this.zzXNo.zzXNy) || com.aspose.words.internal.zzZYD.zzXk(this.zzXNo.zzXNx)) {
            return;
        }
        Object objZzPk3 = zzyczZzYvR.zzPk(2180);
        this.zzXNo.zzXNx = objZzPk3 != null ? com.aspose.words.internal.zzJB.zzWF(((Integer) objZzPk3).intValue()) : "1";
        this.zzXNo.zzZfa++;
    }

    private void zzY(zzZ9Q zzz9q, zzZS zzzs, boolean z) {
        this.zzXNo.zzXNK = zzQ(zzz9q);
        zzZS zzzsZzW = zzW(zzz9q, zzzs, z);
        ParagraphFormat paragraphFormatZzR = zzR(zzz9q);
        zzX(zzz9q, zzzsZzW, z);
        zzO(zzz9q);
        zzZ(zzz9q, paragraphFormatZzR);
        zzT(zzz9q);
        zzS(zzz9q);
        if (zzZ8((Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class))) {
            this.zzXNo.zzrj(0);
            this.zzXNo.zzri(0);
        }
    }

    private void zzZ(zzZ9Q zzz9q, boolean z) {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (paragraph == null || paragraph.zzZYj().zzVE(EditingLanguage.KASHMIRI_ARABIC) || !paragraph.zzqy(0).getParagraphFormat().isListItem()) {
            return;
        }
        zzYMX zzymxZzZYj = paragraph.zzqy(0).zzZYj();
        if (zzymxZzZYj.zzS(1160, EditingLanguage.CENTRAL_KURDISH_IRAQ)) {
            zzYMX zzymxZzZYj2 = paragraph.zzRB(false).zzZYj();
            zzYMX zzymx = new zzYMX();
            zzymxZzZYj2.zzY(zzymx, 1160, EditingLanguage.CENTRAL_KURDISH_IRAQ);
            zzymxZzZYj.zzY(zzymx, 1160, EditingLanguage.CENTRAL_KURDISH_IRAQ);
            zzX(null, zzymx, z);
        }
    }

    private void zzX(zzZ9Q zzz9q, zzZS zzzs, boolean z) {
        zzZ9Q zzz9q2;
        zzZS zzzs2;
        boolean z2;
        int i = 0;
        while (i < zzzs.getCount()) {
            Object objZzVY = zzzs.zzVY(i);
            if (objZzVY != null) {
                zzz9q2 = zzz9q;
                zzzs2 = zzzs;
                z2 = z;
                if (zzZ(zzz9q2, zzzs2, z2, zzzs.zzT3(i), objZzVY)) {
                    this.zzXNo.zzZfa++;
                }
            } else {
                zzz9q2 = zzz9q;
                zzzs2 = zzzs;
                z2 = z;
            }
            i++;
            zzz9q = zzz9q2;
            zzzs = zzzs2;
            z = z2;
        }
    }

    private boolean zzY(zzZS zzzs, int i, Object obj) {
        if (i == 1450) {
            this.zzXNo.zzXNF = Integer.toString(((Integer) obj).intValue());
            return false;
        }
        if (i != 1460) {
            if (i == 1500 && zzzs.contains(1450)) {
                this.zzXNo.zzXNE = this.zzXRT.zzr2(((Integer) obj).intValue());
            }
            return false;
        }
        this.zzXNo.setBackgroundColor(zzYOU.zzP((Shading) obj));
        return this.zzXNo.getBackgroundColor() != null;
    }

    private void zzX(zzZ9Q zzz9q, Object obj) {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        if (paragraph != null) {
            Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB4(), Paragraph.class);
            if (paragraph2 == null) {
                this.zzXNo.zzri(((Integer) obj).intValue());
                zzP(paragraph);
                return;
            }
            Object objValueOf = paragraph2.zzZYj().get(1200);
            if (objValueOf != null && paragraph2.zzZYj().getSpaceBeforeAuto()) {
                objValueOf = Integer.valueOf(StyleIdentifier.GRID_TABLE_1_LIGHT_ACCENT_1);
            }
            if (objValueOf != null && ((Integer) objValueOf).intValue() >= ((Integer) obj).intValue()) {
                zzYQF zzyqf = this.zzXNo;
                zzyqf.zzZfa--;
                return;
            } else {
                this.zzXNo.zzri(((Integer) obj).intValue());
                zzP(paragraph);
                return;
            }
        }
        this.zzXNo.zzri(((Integer) obj).intValue());
    }

    private void zzY(zzZ9Q zzz9q, Object obj) {
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        boolean z = (paragraph == null || paragraph.zzZYj().zzPk(EditingLanguage.CENTRAL_KURDISH_IRAQ) == null || paragraph.getParagraphFormat().isHeading()) ? false : true;
        if (paragraph != null && ((Integer) obj).intValue() < 0 && paragraph.isListItem() && !z) {
            this.zzXNo.zzZfa--;
        } else {
            this.zzXNo.zzXND = this.zzXRT.zzr2(((Integer) obj).intValue());
        }
    }

    private void zzZ(zzZ9Q zzz9q, boolean z, zzYTG zzytg, boolean z2) {
        zzytg.zzY("style:paragraph-properties");
        zzytg.zz0("style:text-autospace", this.zzXNo.zzXNv);
        zzytg.zz0("fo:text-align", this.zzXNo.zzXNI);
        zzytg.zz0("fo:text-align-last", this.zzXNo.zzXNH);
        zzZ(zzz9q, zzytg);
        zzytg.zz0("fo:background-color", this.zzXNo.getBackgroundColor());
        zzytg.zz0("fo:text-indent", this.zzXNo.zzXND);
        zzZ(zzytg);
        zzYw4();
        zzytg.zz0("fo:keep-with-next", this.zzXNo.zzXNA);
        zzytg.zz0("fo:keep-together", this.zzXNo.zzXNz);
        if (this.zzXNo.zzYUT || z2) {
            zzytg.zz0("fo:orphans", "2");
            zzytg.zz0("fo:widows", "2");
        }
        zzytg.zz0("style:writing-mode", this.zzXNo.zzYtp());
        zzytg.zz0("text:number-lines", this.zzXNo.zzXNy);
        zzytg.zz0("text:line-number", this.zzXNo.zzXNx);
        zzytg.zz0("style:snap-to-layout-grid", this.zzXNo.zzXNw);
        zzytg.zz0("style:punctuation-wrap", this.zzXNo.zzXNu);
        zzytg.zz0("fo:hyphenation-ladder-count", this.zzXNo.zzXNt);
        zzytg.zz0("style:vertical-align", this.zzXNo.zzYHK());
        int i = this.zzXRT.getDocument().zzZpV().zzYW4;
        if (z && i != 0 && i != 1134) {
            zzytg.zz0("style:tab-stop-distance", this.zzXRT.zzr2(i));
        }
        zzytg.zz0("style:page-number", this.zzXNo.zzXNs);
    }

    private void zzZ(zzYTG zzytg) {
        String str;
        zzYQF zzyqf = this.zzXNo;
        if (zzyqf.zzXNB == 0) {
            str = "style:line-height-at-least";
        } else {
            str = "fo:line-height";
        }
        zzytg.zz0(str, zzyqf.zzXNC);
    }

    private void zzZ(zzZ9Q zzz9q, zzYTG zzytg) {
        boolean z;
        Object objZzPk = zzz9q instanceof Paragraph ? this.zzXRT.zzYBx().zzYvR().zzPk(2350) : null;
        boolean z2 = objZzPk != null && ((Integer) objZzPk).intValue() > 0;
        if (this.zzXNp || ((z = this.zzXNq) && !z2)) {
            this.zzXNo.zzXNJ = "page";
        } else if (z && z2) {
            zzYQF zzyqf = this.zzXNo;
            if (zzyqf.zzXNJ == null) {
                zzyqf.zzXNJ = "column";
            }
        }
        zzytg.zz0("fo:break-before", this.zzXNo.zzXNJ);
    }

    private boolean zzZ(TabStop tabStop, boolean z, boolean z2) {
        int alignment = tabStop.getAlignment();
        if (zzYS3.zzY(alignment, this.zzXRT.getWarningCallback()) == null) {
            return z;
        }
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if (z) {
            if (!z2) {
                zzytgZzYsG.zzY("style:paragraph-properties");
            }
            zzytgZzYsG.zzY("style:tab-stops");
        }
        zzytgZzYsG.zzX("style:tab-stop", "style:type", zzYS3.zzY(alignment, this.zzXRT.getWarningCallback()), "style:leader-style", zzYS3.zzsa(tabStop.getLeader()), "style:leader-text", zzYS3.zzsb(tabStop.getLeader()), "style:char", alignment == 3 ? "," : null, "style:position", this.zzXRT.zzr2(tabStop.zzY0E() - this.zzXNo.zzXNK));
        return false;
    }

    private boolean zzZ(zzZ9Q zzz9q, zzZS zzzs, boolean z, int i, Object obj) {
        if (zzZ(zzz9q, i, obj) || zzZ(zzz9q, z, i, obj) || zzd(i, obj) || zzY(zzzs, i, obj)) {
            return true;
        }
        switch (i) {
            case 1022:
            case EditingLanguage.DANISH /* 1030 */:
            case EditingLanguage.SORBIAN /* 1070 */:
            case EditingLanguage.FAEROESE /* 1080 */:
            case EditingLanguage.MALAYALAM /* 1100 */:
            case EditingLanguage.DIVEHI /* 1125 */:
            case EditingLanguage.PAPIAMENTU /* 1145 */:
            case EditingLanguage.CORSICAN /* 1155 */:
            case 1165:
            case 1175:
            case 1205:
            case 1225:
            case 1250:
            case 1270:
            case 1390:
            case 1400:
            case 1440:
            case 1585:
            case 1590:
            case 1592:
            case 1593:
            case 1594:
            case 1595:
            case 1610:
            case 1620:
            case 1630:
            case 1640:
                this.zzXRT.zzZ(i, "paragraph", true, false);
                break;
            case EditingLanguage.SLOVENIAN /* 1060 */:
                this.zzXNo.zzXNJ = ((Boolean) obj).booleanValue() ? "page" : "auto";
                break;
            case EditingLanguage.YORUBA /* 1130 */:
                zzZc(obj);
                break;
            case 1260:
                if (((Boolean) obj).booleanValue()) {
                    this.zzXNo.zzXNw = TelemetryEventStrings.Value.TRUE;
                }
                break;
            case 1470:
                if (((Boolean) obj).booleanValue()) {
                    this.zzXNo.zzYUT = true;
                }
                break;
            case 1560:
                this.zzXNo.zzDP(((Boolean) obj).booleanValue() ? "rl-tb" : "lr-tb");
                break;
            case 1580:
                this.zzXRT.zzZ(i, "paragraph", false, true);
                break;
            case 10010:
                this.zzXNo.zzZ((zzZMK) obj);
                break;
        }
        return false;
    }

    private boolean zzZ(zzZ9Q zzz9q, int i, Object obj) {
        if (i == 1020) {
            zzYQF zzyqf = this.zzXNo;
            zzyqf.zzXNr = true;
            zzyqf.zzZGm = ((Integer) obj).intValue();
            return true;
        }
        if (i == 1150) {
            zzZ(zzz9q, obj, EditingLanguage.BRETON);
            return true;
        }
        if (i == 1160) {
            zzZ(zzz9q, obj, 1160);
            return true;
        }
        if (i == 1170) {
            zzY(zzz9q, obj);
            return true;
        }
        if (i != 1510) {
            return false;
        }
        this.zzXNo.zzDh(zzYS3.zzsh(((Integer) obj).intValue()));
        return true;
    }

    private boolean zzZ(zzZ9Q zzz9q, boolean z, int i, Object obj) {
        Style style = (Style) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Style.class);
        boolean z2 = style != null && "Normal".equals(style.getName());
        switch (i) {
            case EditingLanguage.ITALIAN_ITALY /* 1040 */:
                Ref<String> ref = new Ref<>(this.zzXNo.zzXNz);
                zzZ(obj, z2, ref);
                this.zzXNo.zzXNz = ref.get();
                return true;
            case 1050:
                Ref<String> ref2 = new Ref<>(this.zzXNo.zzXNA);
                zzZ(obj, z2, ref2);
                this.zzXNo.zzXNA = ref2.get();
                return true;
            case EditingLanguage.TURKMEN /* 1090 */:
                if (((Boolean) obj).booleanValue()) {
                    return false;
                }
                this.zzXNo.zzXNu = "simple";
                return true;
            case EditingLanguage.GUARANI /* 1140 */:
                zzZd(obj);
                return true;
            case 1200:
                this.zzXNo.zzrj(((Integer) obj).intValue());
                return true;
            case 1210:
                this.zzXNo.zzXNM = ((Boolean) obj).booleanValue();
                return false;
            case 1220:
                if (z) {
                    return false;
                }
                zzX(zzz9q, obj);
                return true;
            case 1230:
                this.zzXNo.zzXNL = ((Boolean) obj).booleanValue();
                return false;
            case 1240:
                this.zzXNo.zzXNv = ((Boolean) obj).booleanValue() ? "ideograph-alpha" : "none";
                return true;
            case 1410:
                if (!((Boolean) obj).booleanValue()) {
                    return false;
                }
                this.zzXNo.zzXNt = "no-limit";
                return true;
            case 1650:
                zzZ(zzz9q, obj);
                return true;
            default:
                return false;
        }
    }

    private void zzZ(Object obj, boolean z, Ref<String> ref) {
        if (((Boolean) obj).booleanValue() && !z) {
            ref.set("always");
        } else {
            zzYQF zzyqf = this.zzXNo;
            zzyqf.zzZfa--;
        }
    }

    private void zzZ(zzZ9Q zzz9q, Object obj) {
        zzZ52 zzz52 = (zzZ52) obj;
        this.zzXNo.zzXNB = zzz52.zzZ4A();
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        Style style = (Style) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Style.class);
        boolean z = paragraph != null && paragraph.zzZYj().zzVE(1330);
        boolean z2 = (paragraph == null && style == null) ? false : true;
        if (!z && z2) {
            this.zzXNo.zzXNC = zzW(zzz52);
        } else {
            this.zzXNo.zzZfa--;
        }
    }

    private void zzZ(zzZ9Q zzz9q, Object obj, int i) {
        if (zzO((Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class), i)) {
            zzWx(i, ((Integer) obj).intValue());
            zzP(zzz9q);
        } else {
            zzYQF zzyqf = this.zzXNo;
            zzyqf.zzZfa--;
        }
    }

    private void zzZ(zzZ9Q zzz9q, ParagraphFormat paragraphFormat) {
        int orientation;
        int verticalAlignment;
        Paragraph paragraph = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(zzz9q, Paragraph.class);
        zzYQF zzyqf = this.zzXNo;
        boolean z = zzyqf.zzXNr;
        int i = zzyqf.zzZGm;
        if (paragraph == null || !paragraph.isInCell()) {
            orientation = 0;
            verticalAlignment = 0;
        } else {
            orientation = paragraph.zzZex().zz6G().getOrientation();
            verticalAlignment = paragraph.zzZex().zz6G().getVerticalAlignment();
        }
        String strZzY = zzYS3.zzY(z, i, orientation, verticalAlignment);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzY)) {
            this.zzXNo.zzXNI = strZzY;
        }
        if (paragraphFormat != null && i == 4) {
            this.zzXNo.zzXNH = "justify";
        }
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzXNo.zzXNI) && z) {
            zzYQF zzyqf2 = this.zzXNo;
            zzyqf2.zzZfa--;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzXNo.zzXNI) && !z) {
            this.zzXNo.zzZfa++;
        }
        zzN(zzz9q);
    }
}
