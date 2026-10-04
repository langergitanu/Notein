package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFU implements zzZBS {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static zzYET zzXte;
    private boolean zzBK;
    private zzYET zzXtf;
    private boolean zzXtg;
    private boolean zzXth;
    private zzYES zzXti;
    private zzYFT zzXwE;

    static {
        try {
            zzYET zzyet = new zzYET(1);
            zzXte = zzyet;
            zzyet.writeByte(92);
            zzXte.writeByte(42);
            zzUR = new com.aspose.words.internal.zzZHW("\\pntext", "\\listtext", "\\nonshppict", "\\nonesttables", "\\shprslt", "\\comment", "\\mmathPict");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public zzYFU(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, Document document) {
        this(new zzYES(zzzop), document, loadOptions);
    }

    private static void zz2(Document document) {
        zzZZF zzzzfZzZpV = document.zzZpV();
        zzzzfZzZpV.zzYVN = true;
        zzzzfZzZpV.zzYWt = true;
        zzzzfZzZpV.zzYWs = true;
        zzzzfZzZpV.zzYVO = true;
        zzzzfZzZpV.zzYUT = false;
        zzzzfZzZpV.zzYVh.zzYck();
        zzzzfZzZpV.zzYVM = 1;
        CompatibilityOptions compatibilityOptions = zzzzfZzZpV.zzYVg;
        compatibilityOptions.setAlignTablesRowByRow(true);
        compatibilityOptions.setAllowSpaceOfSameStyleInTable(true);
        compatibilityOptions.setGrowAutofit(true);
        compatibilityOptions.setLayoutTableRowsApart(true);
        compatibilityOptions.setBalanceSingleByteDoubleByteWidth(true);
        compatibilityOptions.setDoNotWrapTextWithPunct(true);
        compatibilityOptions.setDoNotBreakWrappedTables(true);
        compatibilityOptions.setDoNotUseEastAsianBreakRules(true);
        compatibilityOptions.setDoNotUseHTMLParagraphAutoSpacing(true);
        compatibilityOptions.setForgetLastTabAlignment(true);
        compatibilityOptions.setShapeLayoutLikeWW8(true);
        compatibilityOptions.setFootnoteLayoutLikeWW8(true);
        compatibilityOptions.setLayoutRawTableWidth(true);
        compatibilityOptions.setSelectFldWithFirstOrLastChar(true);
        compatibilityOptions.setUseWord2002TableStyleRules(true);
        compatibilityOptions.setUseWord97LineBreakRules(true);
        compatibilityOptions.setDoNotLeaveBackslashAlone(true);
        compatibilityOptions.setDoNotExpandShiftReturn(true);
        compatibilityOptions.setDoNotSnapToGridInCell(true);
        compatibilityOptions.setSpaceForUL(true);
        compatibilityOptions.setAdjustLineHeightInTable(true);
        compatibilityOptions.setUlTrailSpace(true);
        compatibilityOptions.setUICompat97To2003(true);
        compatibilityOptions.setSplitPgBreakAndParaMark(true);
        compatibilityOptions.setDoNotUseIndentAsNumberingTabStop(true);
        compatibilityOptions.setUseAnsiKerningPairs(true);
        compatibilityOptions.setUseNormalStyleForList(true);
        compatibilityOptions.setUseAltKinsokuLineBreakRules(true);
        compatibilityOptions.setDoNotSuppressIndentation(true);
        compatibilityOptions.setDoNotAutofitConstrainedTables(true);
        compatibilityOptions.setAutofitToFirstFixedWidthCell(true);
        compatibilityOptions.setUnderlineTabInNumList(true);
        compatibilityOptions.setDisplayHangulFixedWidth(true);
        compatibilityOptions.setDoNotVertAlignCellWithSp(true);
        compatibilityOptions.setDoNotBreakConstrainedForcedTable(true);
        compatibilityOptions.setDoNotVertAlignInTxbx(true);
        compatibilityOptions.setCachedColBalance(true);
        compatibilityOptions.setUseFELayout(true);
    }

    private void zz6(zzYET zzyet) throws Exception {
        zzYgA();
        if (this.zzBK) {
            return;
        }
        this.zzXwE.zzYgo().zzYiL().zzYim().zzT(zzyet);
    }

    private void zz7(zzYET zzyet) throws Exception {
        zz6(zzyet);
        if (zzyet.zzYeS() && this.zzXtg) {
            zzon(1);
            zzYgC();
        }
    }

    private void zz8(zzYET zzyet) throws Exception {
        zzYHP zzyhpZzCw = zzYHO.zzCw(zzyet.getName());
        if (zzV(zzyhpZzCw)) {
            this.zzXwE.zzYgo().zzYiL().zzYim().zzYjb();
            this.zzXwE.zzYgo().zzZP();
            zzT(zzyet);
        }
        if (zzyhpZzCw != null) {
            zzYgy();
            if (zz9(zzyet)) {
                return;
            }
        }
        zz7(zzyet);
    }

    private boolean zz9(zzYET zzyet) throws Exception {
        zzYHP zzyhpZzCw = zzYHO.zzCw(zzyet.getName());
        if (zzW(zzyhpZzCw)) {
            return true;
        }
        if (zzyhpZzCw != null) {
            this.zzXwE.zzYgo().zzX(zzyhpZzCw);
            if (this.zzXwE.zzYgo().zzYiL().zzYim() != null) {
                if (!zzU(zzyhpZzCw) && !this.zzBK) {
                    this.zzXwE.zzYgo().zzYiL().zzYim().zzZ(zzyet);
                }
                this.zzXth = false;
                return true;
            }
            this.zzXwE.zzYgo().zzZP();
        }
        return false;
    }

    private static boolean zzC1(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    private static void zzL(CompositeNode compositeNode) {
        for (Table table : compositeNode.getChildNodes(5, true)) {
            if (table.getFirstRow() == null || table.getFirstRow().zzZYf() == null) {
                table.remove();
            }
        }
    }

    private void zzT(zzYET zzyet) throws Exception {
        if ("\\f".equals(zzyet.getName())) {
            zzYgy();
        }
        if (!this.zzXth) {
            if (this.zzBK) {
                return;
            }
            if (zz9(zzyet)) {
                this.zzXwE.zzYgo().zzYiL().zzYif();
                return;
            }
            this.zzXwE.zzYgo().zzYiL().zzYim().zzT(zzyet);
            if ("\\bin".equals(zzyet.getName())) {
                zzYgB();
                return;
            }
            return;
        }
        if ("\\stylesheet".equals(zzyet.getName()) && this.zzXwE.zzYgo().zzYiL().zzYiN().getType() != 0) {
            zzon(1);
            return;
        }
        if ("\\*".equals(zzyet.getName())) {
            if (this.zzXtg) {
                zz6(zzyet);
                return;
            } else {
                this.zzXtg = true;
                return;
            }
        }
        if (zzC1(zzyet.getName())) {
            zzon(1);
        } else {
            zz8(zzyet);
        }
    }

    private boolean zzU(zzYHP zzyhp) {
        int type = zzyhp.getType();
        if (type == 110) {
            this.zzBK = true;
            return true;
        }
        if (type != 111) {
            return false;
        }
        this.zzBK = false;
        return true;
    }

    private boolean zzV(zzYHP zzyhp) {
        zzYHI zzyhi;
        return (zzyhp == null || (zzyhi = (zzYHI) com.aspose.words.internal.zzZKW.zzZ(this.zzXwE.zzYgo().zzYiL().zzYim(), zzYHI.class)) == null || zzyhp.getType() == 40 || zzyhp.getType() == 41 || zzyhp.getType() == 42 || zzyhi.zzYiI()) ? false : true;
    }

    private boolean zzW(zzYHP zzyhp) throws Exception {
        if (this.zzXwE.zzYgi() == null || !this.zzXwE.zzYgi().zzZrB() || zzyhp == null) {
            return false;
        }
        int type = zzyhp.getType();
        if (type != 1 && type != 18 && type != 28 && type != 95 && type != 103 && type != 105 && type != 116 && type != 231) {
            switch (type) {
                case 52:
                case 53:
                case 54:
                    break;
                default:
                    switch (type) {
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                            break;
                        default:
                            switch (type) {
                                case 89:
                                case 90:
                                case 91:
                                case 92:
                                    break;
                                default:
                                    switch (type) {
                                        case 99:
                                        case 100:
                                        case 101:
                                            break;
                                        default:
                                            switch (type) {
                                                case 256:
                                                case 257:
                                                case StyleIdentifier.COLORFUL_LIST_ACCENT_6 /* 258 */:
                                                    break;
                                                default:
                                                    return false;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        zzon(1);
        return true;
    }

    private static void zzWE(Node node) {
        if (node.isComposite()) {
            if (node.getNodeType() == 5) {
                zzYGC.zza((Table) node);
            }
            Iterator<T> it = ((CompositeNode) node).getChildNodes(0, false).iterator();
            while (it.hasNext()) {
                zzWE((Node) it.next());
            }
        }
    }

    private void zzY(zzYET zzyet) throws Exception {
        if (this.zzXth) {
            zzYgA();
        }
        if (this.zzBK) {
            return;
        }
        if (zzYiX()) {
            this.zzXwE.zzYgo().zzYiL().zzYim().zzY(zzyet);
            return;
        }
        this.zzXtf.zzBG(zzyet.zzYR());
        if (zzyet.zzYeU()) {
            zzYgy();
        }
    }

    private void zzYgA() throws Exception {
        if (!this.zzBK) {
            this.zzXwE.zzYgo().zzYiL().zzYim().zzYiP();
        }
        this.zzXwE.zzYgo().zzX(null);
        if (this.zzXtg && !this.zzBK) {
            this.zzXwE.zzYgo().zzYiL().zzYim().zzT(zzXte);
        }
        this.zzXth = false;
    }

    private void zzYgB() throws Exception {
        if (this.zzXwE.zzYgo().zzYiL().zzYiN().getType() == 103 && ((zzYFW) this.zzXwE.zzYgo().zzYiL().zzYim()).zzYgM()) {
            boolean z = true;
            int i = 0;
            while (z) {
                int type = this.zzXwE.zzYgo().zzYiL().zzYiN().getType();
                if (type == 71 || type == 100 || type == 103) {
                    i++;
                    this.zzXwE.zzYgo().zzZP();
                } else {
                    z = false;
                }
            }
            zzon(i);
            this.zzXwE.zzT(16777216, "Unrecognized binary data.");
        }
    }

    private void zzYgC() throws Exception {
        if (this.zzXth) {
            zzYgA();
        }
        boolean zZzYil = this.zzXwE.zzYgo().zzYiL().zzYil();
        if (zZzYil && !this.zzBK) {
            if (!zzYiX()) {
                zzYgy();
            }
            this.zzXwE.zzYgo().zzYiL().zzYim().zzYjb();
        }
        if (this.zzXwE.zzYgo().getCount() == 1 && this.zzXwE.zzYhj().zzYfd() && !this.zzXwE.zzYhj().zzYfn()) {
            this.zzXwE.zzYiM().zzYhE();
        }
        this.zzXwE.zzYgo().zzZP();
        if (zZzYil || this.zzBK) {
            return;
        }
        this.zzXwE.zzYgo().zzYiL().zzYim().zzYiO();
    }

    private void zzYgD() throws Exception {
        while (this.zzXwE.zzYgo().zzYiL().zzYig()) {
            zzYgC();
        }
        zzYgC();
    }

    private void zzYgE() throws Exception {
        if (this.zzXth) {
            zzYgA();
        }
        this.zzXth = true;
        this.zzXtg = false;
    }

    private void zzYgy() throws Exception {
        if (this.zzXtf.zz0R() > 0) {
            this.zzXwE.zzYgo().zzYiL().zzYim().zzY(this.zzXtf);
            zzYgz();
        }
    }

    private void zzYgz() throws Exception {
        this.zzXtf.reset(4);
    }

    private boolean zzYiX() {
        return this.zzXwE.zzYgo().zzYiL().zzYim().zzYiX();
    }

    private void zzon(int i) throws Exception {
        if (this.zzXwE.zzYgi() == null || !this.zzXwE.zzYgi().zzZrB()) {
            while (i > 0) {
                this.zzXti.zzYeR();
                int iZzYb = this.zzXti.zzYeN().zzYb();
                if (iZzYb != 1) {
                    if (iZzYb == 2) {
                        i++;
                    } else if (iZzYb == 3) {
                        i--;
                    } else if (iZzYb != 4) {
                        throw new IllegalStateException("Unexpected RTF token type.");
                    }
                }
            }
        } else {
            this.zzXti.zzon(i);
        }
        this.zzXth = false;
    }

    @Override // com.aspose.words.zzZBS
    public final boolean isEncrypted() {
        return false;
    }

    @Override // com.aspose.words.zzZBS
    public final com.aspose.words.internal.zzZOP zz1x() {
        return null;
    }

    @Override // com.aspose.words.zzZBS
    public final void zzIh() throws Exception {
        zz2(this.zzXwE.getDocument());
        this.zzXti.zzYeR();
        if (this.zzXti.zzYeN().zzYb() != 2) {
            throw new IllegalStateException("The input is not a valid RTF document.");
        }
        this.zzXti.zzYeR();
        if (this.zzXti.zzYeN().zzYb() != 1 || !"\\rtf".equals(this.zzXti.zzYeN().getName())) {
            throw new IllegalStateException("The input is not a valid RTF document.");
        }
        zzYGC.zzYWR();
        zzZ3Z zzz3z = new zzZ3Z(this.zzXwE.getDocument(), this.zzXwE.zzYgi());
        boolean z = false;
        while (this.zzXwE.zzYgo().getCount() > 0 && !z) {
            this.zzXti.setCodePage(this.zzXwE.getCodePage());
            this.zzXti.zzYeR();
            zzz3z.zzYX(this.zzXti.zz5());
            int iZzYb = this.zzXti.zzYeN().zzYb();
            if (iZzYb == 1) {
                zzT(this.zzXti.zzYeN());
            } else if (iZzYb == 2) {
                zzYgE();
            } else if (iZzYb == 3) {
                zzYgD();
            } else if (iZzYb == 4) {
                zzY(this.zzXti.zzYeN());
            } else {
                if (iZzYb != 5) {
                    throw new IllegalStateException("Unknown token type.");
                }
                z = true;
            }
        }
        this.zzXwE.zzYiM().zzYhO();
        zzz3z.zzW(this.zzXti.zz5(), true);
        zzL(this.zzXwE.getDocument());
        zzWE(this.zzXwE.getDocument());
        StyleCollection styles = this.zzXwE.getDocument().getStyles();
        styles.zzY2V();
        new zzYF5(styles).zzYfr();
        zzZNS.zzW(this.zzXwE.getDocument().getStyles());
        if (this.zzXwE.getDocument().zzZqI() == null) {
            this.zzXwE.getDocument().zzY(Theme.zzXVL().zzXVK());
        }
        this.zzXwE.getDocument().getLists().zzYOW();
        this.zzXwE.getDocument().getLists().zzYOU();
        this.zzXwE.getDocument().getLists().zzYOV();
    }

    private zzYFU(zzYES zzyes, Document document, LoadOptions loadOptions) {
        this.zzXtf = new zzYET(4);
        this.zzXti = zzyes;
        this.zzXwE = new zzYFT(document, loadOptions);
    }
}
