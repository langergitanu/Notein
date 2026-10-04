package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFN extends zzYI2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\animtext", "\\caps", "\\charscalex", "\\embo", "\\impr", "\\noproof", "\\outl", "\\scaps", "\\shad", "\\v", "\\webhidden", "\\cs", "\\cf", "\\insrsid", "\\charrsid", "\\highlight", "\\ulc", "\\strike", "\\striked", "\\kerning", "\\lbr", "\\chbrdr", "\\sub", "\\super", "\\nosupersub", "\\ltrch", "\\rtlch", "\\fcs", "\\loch", "\\hich", "\\dbch", "\\alang", "\\lang", "\\langfe", "\\langnp", "\\langfenp", "\\fs", "\\afs", "\\b", "\\ab", "\\i", "\\ai", "\\up", "\\dn", "\\expnd", "\\expndtw", "\\chshdng", "\\chcbpat", "\\chcfpat", "\\revised", "\\mvauth", "\\revauth", "\\mvdate", "\\revdttm", "\\mvf", "\\mvt", "\\deleted", "\\revauthdel", "\\revdttmdel", "\\accnone", "\\accdot", "\\acccircle", "\\acccomma", "\\accunderdot", "\\horzvert", "\\twoinone", "\\ptabldot", "\\ptablminus", "\\ptabluscore", "\\ptablmdot", "\\ptablnone", "\\pmartabql", "\\pmartabqc", "\\pmartabqr", "\\pindtabql", "\\pindtabqc", "\\pindtabqr", "\\mnor", "\\mscr", "\\msty", "\\crauth", "\\crdate", "\\spv", "\\fittext", "\\fbias", "\\cgrid", "\\plain", "\\f", "\\af");
    private int zzXsD;
    private zzZV8 zzXsE;
    private zzZV8 zzXsF;
    private zzZ9H zzXtY;

    public zzYFN(zzYFT zzyft) {
        super(zzyft);
    }

    private Shading getShading() throws Exception {
        return zzYFI.zzQ(zzZYh(), StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6);
    }

    private boolean zz4(zzYET zzyet) {
        int type = zzYja().zzYgo().zzYiL().zzYiN().getType();
        if (type != 204) {
            return type == 205;
        }
        zzZ0V zzz0v = new zzZ0V();
        zzz0v.setAlignment(com.aspose.words.internal.zzJB.zzZo(com.aspose.words.internal.zzZKN.zzTX(zzyet.zzYR())));
        zzYja().zzYgo().zzYih().zzZYh().zzY(zzz0v);
        return true;
    }

    private boolean zz5(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 86:
                zzYiZ();
                break;
            case 87:
            case 88:
                boolean zEquals = "\\af".equals(zzyet.getName());
                int iZzYeT = zzyet.zzYeT();
                if (!zzYja().zzYgj()) {
                    if (zEquals) {
                        zzYiL().zzoR(iZzYeT);
                    } else {
                        zzYiL().zzoS(iZzYeT);
                    }
                }
                zzZl(iZzYeT, zEquals);
                break;
        }
        return true;
    }

    private void zzBT(String str) throws Exception {
        AbsolutePositionTab absolutePositionTab = new AbsolutePositionTab(zzYja().getDocument(), zzZYh());
        absolutePositionTab.setAlignment(zzYEO.zzBE(str));
        absolutePositionTab.zzPq(zzYEO.zzBD(str));
        absolutePositionTab.zzPp(this.zzXsD);
        zzYja().zzYiM().zzWI(absolutePositionTab);
        this.zzXsD = 3;
    }

    private zzZRH zzV(zzZRH zzzrh) throws Exception {
        if (zzZYh().zzYdC() != null) {
            return zzZYh().zzYdC();
        }
        zzZRH zzzrh2 = new zzZRH();
        zzZYh().zzU(zzzrh2);
        if (zzzrh != null) {
            zzzrh2.zzDN(zzzrh.zzZh1());
            return zzzrh2;
        }
        zzYja().zzog(zzYja().zzYgf() + 1);
        zzzrh2.zzDN(zzYja().zzYgf());
        return zzzrh2;
    }

    private void zzX(zzU1 zzu1) throws Exception {
        if (zzZ(zzu1, 0) || zzZYh().zzVE(StyleIdentifier.BIBLIOGRAPHY) || zzZYh().zzVE(StyleIdentifier.PLAIN_TABLE_2) || zzYja().zzYgo().zzYiL().zzYiN().getType() == 65) {
            return;
        }
        zzZYh().zzQ(270, zzu1);
    }

    private zzZ9H zzYgV() {
        zzZ9H zzz9h = this.zzXtY;
        return zzz9h != null ? zzz9h : zzYja().zzYgo().zzYiL();
    }

    private zzYH3 zzYiL() {
        return zzYja().zzYgo().zzYiL();
    }

    private boolean zzZ(zzU1 zzu1, int i) throws Exception {
        if (zzYja().zzYgi().getMswVersion() != 0 || zzYja().zzYgo().zzYiL().zzYiN().getType() == 70 || zzYja().zzYgo().zzYiL().zzYiN().getType() == 65 || zzYja().zzYgj() || zzu1.zzZYI()) {
            return false;
        }
        int i2 = i == 0 ? 270 : 230;
        zzZYh().zzQ(i2, zzU1.zzSP(zzu1.getName()));
        if (i2 != 230) {
            return true;
        }
        zzZYh().zzQ(240, zzU1.zzSP(zzu1.getName()));
        return true;
    }

    private void zzZV(int i, Object obj) throws Exception {
        int type;
        int iZzoa = zzoa(i);
        int i2 = zzYiL().zzYik().zzYgF() ? iZzoa : i;
        zzZYh().zzQ(i2, obj);
        if (zzYiL().zzYim().zzYiK() || (type = zzYiL().zzYiN().getType()) == 65 || type == 70) {
            return;
        }
        zzYEF zzyefZzZYh = zzZYh();
        if (i2 == i) {
            i = iZzoa;
        }
        zzyefZzZYh.zzQ(i, obj);
    }

    private zzYEF zzZYh() throws Exception {
        return zzYgV().zzZYh();
    }

    private void zzZl(int i, boolean z) throws Exception {
        zzYiL().zzYik().zzYgL();
        String strZzom = zzYja().zzom(i);
        zzU1 zzu1Zzol = zzYja().zzol(i);
        if (!zzZYh().contains(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2)) {
            zzo9(i);
        }
        int mode = zzYiL().zzYik().getMode();
        if (mode == 1) {
            zzZYh().zzQ(230, zzu1Zzol);
            return;
        }
        if (mode == 2) {
            zzZYh().zzQ(240, zzu1Zzol);
            if (z) {
                return;
            }
            zzZYh().zzQ(400, 0);
            return;
        }
        if (mode == 3) {
            zzZYh().zzQ(235, zzu1Zzol);
            if (z || !zzW(zzu1Zzol)) {
                return;
            }
            zzZYh().zzQ(400, 1);
            return;
        }
        if (mode == 4) {
            zzZYh().zzQ(270, zzu1Zzol);
            if (!z) {
                zzZYh().zzQ(400, 2);
            }
            zzZ(zzu1Zzol, 4);
            return;
        }
        zzZYh().zzQ(230, zzu1Zzol);
        if (com.aspose.words.internal.zzJF.zzZ(zzYja().getDocument().zzZqy(), strZzom)) {
            zzZYh().zzQ(235, zzu1Zzol);
        } else {
            zzZYh().zzQ(240, zzu1Zzol);
        }
        zzX(zzu1Zzol);
    }

    private void zzo9(int i) throws Exception {
        int iZzoV = zzYja().zzYgt().zzoV(i);
        if (com.aspose.words.internal.zzT8.zzYT(iZzoV)) {
            int iZzYid = iZzoV == 177 ? EditingLanguage.HEBREW : 1025;
            if (zzYja().zzYgm().zzYid() != -1 && com.aspose.words.internal.zzBZ.zzZY(zzYja().zzYgm().zzYid(), iZzYid)) {
                iZzYid = zzYja().zzYgm().zzYid();
            }
            zzZYh().setLocaleIdBi(iZzYid);
        }
    }

    private static int zzoa(int i) {
        if (i == 60) {
            return 250;
        }
        if (i == 70) {
            return StyleIdentifier.SUBTLE_EMPHASIS;
        }
        if (i == 190) {
            return StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4;
        }
        com.aspose.words.internal.zzZKN.format("Unexpected key {0}", Integer.valueOf(i));
        return i;
    }

    private int zzob(int i) throws Exception {
        int i2 = (zzYEO.zznx(i) || zzYiL().zzYik().zzYgF()) ? StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 : 380;
        zzZYh().zzQ(i2, Integer.valueOf(i));
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.words.zzYI2
    public final boolean zzW(zzYET zzyet) throws Exception {
        if (zz5(zzyet)) {
            return true;
        }
        boolean zZzZh2 = false;
        if (zzZrB()) {
            return false;
        }
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                zzZYh().zzQ(StyleIdentifier.GRID_TABLE_3_ACCENT_5, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 1:
                zzZYh().zzQ(120, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 2:
                zzZYh().zzQ(StyleIdentifier.GRID_TABLE_4_ACCENT_2, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 3:
                zzZYh().zzQ(170, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 4:
                zzZYh().zzQ(180, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 5:
                zzZYh().zzQ(440, zzZU.zzZF6);
                return true;
            case 6:
                zzZYh().zzQ(90, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 7:
                zzZYh().zzQ(110, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 8:
                zzZYh().zzQ(100, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 9:
                zzZYh().zzQ(130, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 10:
                zzZYh().zzQ(132, zzZU.zzZF6);
                return true;
            case 11:
                zzZYh().zzQ(50, Integer.valueOf(zzYja().zzJ(Integer.valueOf(zzyet.zzYeT()), 10)));
                return true;
            case 12:
                int iZzYeT = zzyet.zzYeT();
                zzZYh().zzQ(160, zzYja().zzYgw().zzp0(iZzYeT));
                zzZ(zzYja().zzYgw().zzoZ(iZzYeT));
                return true;
            case 13:
                zzZYh().zzQ(40, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 14:
                zzZYh().zzQ(30, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 15:
                zzZYh().zzQ(20, zzYja().zzYgw().zzp0(zzyet.zzYeT()));
                return true;
            case 16:
                zzZYh().zzQ(450, zzYja().zzYgw().zzp0(zzyet.zzYeT()));
                return true;
            case 17:
                zzZYh().zzQ(80, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 18:
                zzZYh().zzQ(300, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 19:
                zzZYh().zzQ(220, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 20:
                zzZYh().zzQ(45, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 21:
                zzYja().zzR(zzZYh(), StyleIdentifier.LIST_TABLE_4_ACCENT_5);
                return true;
            case 22:
                zzZYh().zzQ(210, 2);
                return true;
            case 23:
                zzZYh().zzQ(210, 1);
                return true;
            case 24:
                zzZYh().zzQ(210, 0);
                return true;
            case 25:
                zzYiL().zzYik().zzYgK();
                zzZYh().zzQ(StyleIdentifier.BIBLIOGRAPHY, zzZU.zzZF7);
                zzYiL().zzYim().zzYiJ();
                return true;
            case 26:
                zzYiL().zzYik().zzYgJ();
                zzZYh().zzQ(StyleIdentifier.BIBLIOGRAPHY, zzZU.zzZF6);
                zzYiL().zzYim().zzYiJ();
                return true;
            case 27:
                boolean zZzYeY = zzyet.zzYeY();
                zzYiL().zzYik().zzRl(zZzYeY);
                zzZYh().zzQ(StyleIdentifier.PLAIN_TABLE_2, zzZU.zzYW(zZzYeY));
                return true;
            case 28:
                zzYiL().zzYik().zzYgI();
                return true;
            case 29:
                zzYiL().zzYik().zzYgH();
                return true;
            case 30:
                zzYiL().zzYik().zzYgG();
                return true;
            case 31:
            case 32:
                int iZzYeT2 = zzyet.zzYeT();
                if (iZzYeT2 == 1024) {
                    zzZYh().zzQ(440, zzZU.zzZF6);
                } else if (zzob(iZzYeT2) == 340) {
                    zzYiL().zzoQ(iZzYeT2);
                }
                return true;
            case 33:
                int iZzYeT3 = zzyet.zzYeT();
                if (iZzYeT3 == 1024) {
                    zzZYh().zzQ(440, zzZU.zzZF6);
                } else {
                    if (zzYEO.zznw(iZzYeT3)) {
                        zzZYh().zzQ(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, Integer.valueOf(iZzYeT3));
                    }
                    zzZYh().zzQ(390, Integer.valueOf(iZzYeT3));
                }
                return true;
            case 34:
                zzob(zzyet.zzYeT());
                return true;
            case 35:
                zzZYh().zzQ(390, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 36:
            case 37:
                int iZzYeT4 = zzyet.zzYf2() > 0 ? zzyet.zzYeT() : 24;
                if (com.aspose.words.internal.zzJF.zzWJ(iZzYeT4)) {
                    iZzYeT4 = com.aspose.words.internal.zzJF.zzWI(iZzYeT4);
                }
                zzZV(190, Integer.valueOf(iZzYeT4));
                return true;
            case 38:
            case 39:
                zzZV(60, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 40:
            case 41:
                zzZV(70, zzZU.zzYW(zzyet.zzYeY()));
                return true;
            case 42:
                zzZYh().zzQ(200, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 43:
                zzZYh().zzQ(200, Integer.valueOf(-zzyet.zzYeT()));
                return true;
            case 44:
                zzZYh().zzQ(150, Integer.valueOf(zzYEO.zzWh(zzyet.zzYeT())));
                return true;
            case 45:
                zzZYh().zzQ(150, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 46:
                zzYFI.zzZ(getShading(), zzyet);
                return true;
            case 47:
                zzYFI.zzZ(zzYja(), getShading(), zzyet);
                return true;
            case 48:
                zzYFI.zzY(zzYja(), getShading(), zzyet);
                return true;
            case 49:
                this.zzXsE = new zzZV8(0);
                zzZYh().zzQ(14, this.zzXsE);
                return true;
            case 50:
            case 51:
                zzZV8 zzzv8 = this.zzXsE;
                if (zzzv8 != null) {
                    zzzv8.setAuthor(zzYja().zzYgv().get(zzyet.zzYeT()));
                }
                return true;
            case 52:
            case 53:
                zzZV8 zzzv82 = this.zzXsE;
                if (zzzv82 != null) {
                    zzzv82.zz4(zzYEO.zzM4(zzyet.zzYeT()));
                }
                return true;
            case 54:
                if (this.zzXsE != null) {
                    zzZYh().remove(12);
                    zzZYh().zzQ(13, new zzYX5(0, this.zzXsE.getAuthor(), this.zzXsE.zzZx()));
                }
                return true;
            case 55:
                if (this.zzXsE != null) {
                    zzZYh().remove(14);
                    zzZYh().zzQ(15, new zzYX5(1, this.zzXsE.getAuthor(), this.zzXsE.zzZx()));
                }
                return true;
            case 56:
                zzZV8 zzzv83 = new zzZV8(1);
                this.zzXsF = zzzv83;
                this.zzXsE = zzzv83;
                zzZYh().zzQ(12, this.zzXsF);
                return true;
            case 57:
                zzZV8 zzzv84 = this.zzXsF;
                if (zzzv84 != null) {
                    zzzv84.setAuthor(zzYja().zzYgv().get(zzyet.zzYeT()));
                }
                return true;
            case 58:
                zzZV8 zzzv85 = this.zzXsF;
                if (zzzv85 != null) {
                    zzzv85.zz4(zzYEO.zzM4(zzyet.zzYeT()));
                }
                return true;
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                zzZYh().zzQ(770, Integer.valueOf(zzYFO.zzBU(zzyet.getName())));
                return true;
            case 64:
                int iZzYeT5 = zzyet.zzYeT();
                Object[] objArr = iZzYeT5 == -1;
                zzZRH zzzrhZzYge = zzYja().zzYge();
                if (objArr == false || zzzrhZzYge != null) {
                    zzZRH zzzrhZzV = zzV(objArr != false ? zzzrhZzYge : null);
                    zzzrhZzV.zzW7(true);
                    if (objArr == true) {
                        zZzZh2 = zzzrhZzYge.zzZh2();
                    } else if (iZzYeT5 != 0) {
                        zZzZh2 = true;
                    }
                    zzzrhZzV.zzW5(zZzZh2);
                    zzYja().zzY(zzzrhZzV);
                }
                return true;
            case 65:
                int iZzYeT6 = zzyet.zzYeT();
                Object[] objArr2 = iZzYeT6 == -1 ? 1 : 0;
                zzZRH zzzrhZzYgd = zzYja().zzYgd();
                if (objArr2 == 0 || zzzrhZzYgd != null) {
                    zzZRH zzzrhZzV2 = zzV(objArr2 != 0 ? zzzrhZzYgd : null);
                    zzzrhZzV2.zzW6(true);
                    if (objArr2 != 0) {
                        iZzYeT6 = zzzrhZzYgd.zzZh3();
                    }
                    zzzrhZzV2.zzDO(iZzYeT6);
                    zzYja().zzX(zzzrhZzV2);
                }
                return true;
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
                this.zzXsD = zzYEO.zzBF(zzyet.getName());
                return true;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                zzBT(zzyet.getName());
                return true;
            case 77:
                zzZYh().zzRa(true);
                return true;
            case 78:
                zzZYh().zznb(zzyet.zzYeT());
                return true;
            case 79:
                zzZYh().zzna(zzyet.zzYeT());
                return true;
            case 80:
                zzYja().zzBZ(zzYja().zzYgv().get(zzyet.zzYeT()));
                return true;
            case 81:
                zzYja().zz3(zzYEO.zzM4(zzyet.zzYeT()));
                return true;
            case 82:
                zzZYh().zzQ(10, zzZU.zzZF6);
                return true;
            case 83:
                int iZzYeT7 = zzyet.zzYeT();
                int i = iZzYeT7 == -1 ? 1 : 0;
                if ((i == 0 && iZzYeT7 != 0) || zzYja().zzYgg() >= 0) {
                    zzZYh().zzQ(880, new zzZNW(i != 0 ? zzYja().zzYgg() : iZzYeT7, zzYja().zzYgh() + (i ^ 1)));
                    if (i == 0) {
                        zzYja().zzoi(zzYja().zzYgh() + 1);
                        zzYja().zzoh(iZzYeT7);
                    }
                }
                return true;
            case 84:
                zzZYh().zzQ(400, Integer.valueOf(zzYEO.zznm(zzyet.zzYeT())));
                return true;
            case 85:
                zzZYh().zzT(zzZU.zzYW(zzyet.zzYeY()));
                return true;
            default:
                return zz4(zzyet);
        }
    }

    public final void zzYiZ() throws Exception {
        zzZYh().clear();
        zzYiL().zzoS(zzYja().zzYgm().zzYie());
        zzYiL().zzoR(-1);
        zzYja().zzXt7.zzZ(zzYiL().zzZYh());
        zzZYh().zzQ(190, 24);
        zzZYh().zzQ(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, 24);
        zzYiL().zzYik().reset();
        this.zzXsD = 3;
    }

    public zzYFN(zzYFT zzyft, zzZ9H zzz9h) {
        super(zzyft);
        this.zzXtY = zzz9h;
    }

    private void zzZ(zzY5M zzy5m) throws Exception {
        if (zzy5m != null) {
            zzZYh().zzQ(500, zzY5L.zzjD(zzy5m.zzX39));
            if (zzy5m.zzX38 != 255) {
                zzZYh().zzQ(520, com.aspose.words.internal.zzZKN.format("{0:X2}", Integer.valueOf(zzy5m.zzX38)));
            }
            if (zzy5m.zzX37 != 0) {
                zzZYh().zzQ(510, com.aspose.words.internal.zzZKN.format("{0:X2}", Integer.valueOf(zzy5m.zzX37)));
                return;
            }
            return;
        }
        zzZYh().remove(500);
        zzZYh().remove(520);
        zzZYh().remove(510);
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzV(zzYET zzyet) throws Exception {
        int iZzY = zzYFO.zzY(zzyet.getName(), zzZYh().get(140), zzyet.zzYeY());
        if (iZzY != Integer.MIN_VALUE) {
            zzZYh().zzQ(140, Integer.valueOf(iZzY));
            return true;
        }
        int iZzCb = zzYFO.zzCb(zzyet.getName());
        if (iZzCb == Integer.MIN_VALUE) {
            return false;
        }
        getShading().setTexture(iZzCb);
        return true;
    }

    private boolean zzW(zzU1 zzu1) throws Exception {
        FontInfo fontInfo;
        if (zzu1.zzZYI() || (fontInfo = zzYja().getDocument().getFontInfos().get(zzu1.getName())) == null || fontInfo.getCharset() != 80) {
            return zzU1.zzZ(zzYja().getDocument().zzZqy(), zzu1);
        }
        return true;
    }
}
