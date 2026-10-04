package com.aspose.words;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes6.dex */
final class zzYG4 extends zzYI2 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\pard", "\\intbl", "\\itap", "\\hyphpar", "\\noline", "\\nowidctlpar", "\\nocwrap", "\\widctlpar", "\\pagebb", "\\sbys", "\\s", "\\fi", "\\sb", "\\sa", "\\lisb", "\\lisa", "\\culi", "\\curi", "\\cufi", "\\adjustright", "\\sbauto", "\\saauto", "\\nosnaplinegrid", "\\nooverflow", "\\nowwrap", "\\aspalpha", "\\aspnum", "\\toplinepunct", "\\pararsid", "\\keep", "\\keepn", "\\brdrl", "\\brdrr", "\\brdrt", "\\brdrb", "\\brdrbtw", "\\brdrbar", "\\ls", "\\ilvl", "\\dropcapt", "\\dropcapli", "\\contextualspace", "\\ltrpar", "\\rtlpar", "\\li", "\\ri", "\\lin", "\\rin", "\\sl", "\\slmult", "\\level", "\\outlinelevel", "\\tqr", "\\tqc", "\\tqdec", "\\tb", "\\jclisttab", "\\tx", "\\absw", "\\absh", "\\posnegx", "\\posx", "\\posnegy", "\\posy", "\\nowrap", "\\overlay", "\\wrapdefault", "\\wraparound", "\\wraptight", "\\wrapthrough", "\\abslock", "\\dfrmtxtx", "\\dfrmtxty", "\\shading", "\\cbpat", "\\cfpat", "\\prauth", "\\prdate", "\\absnoovrlp", "\\indmirror", "\\ipgp", "\\txbxtwno", "\\txbxtwalways", "\\txbxtwfirstlast", "\\txbxtwfirst", "\\txbxtwlast", "\\spv", "\\fafixed", "\\tleq", "\\brdrdashdot", "\\brdrdashdotdot", "\\qk", "\\qt", "\\pnrauth", "\\pnrdate", "\\pnrnot", "\\pnrstart", "\\pnrstop", "\\pnrxst", "\\pnrrgb", "\\pnrnfc", "\\pnrpnbr");
    private int zzXtR;
    private int zzXtS;
    private int zzXtT;
    private int zzXtU;
    private com.aspose.words.internal.zzXE zzXtV;
    private int zzXtW;
    private zzYTV zzXtX;
    private zzZ9H zzXtY;
    private TabStop zzXtZ;

    public zzYG4(zzYFT zzyft) {
        super(zzyft);
        this.zzXtZ = new TabStop();
    }

    private Shading getShading() throws Exception {
        return zzYFI.zzQ(zzZYj(), 1460);
    }

    private void zzWo(int i, int i2) throws Exception {
        if (zzYMX.zzWp(i2, 30)) {
            zzZYj().set(i, Integer.valueOf(i2));
        } else {
            zzYja().zzY("Invalid indent value {0} read, ignore.", Integer.valueOf(i2));
        }
    }

    private zzZ9H zzYgV() {
        zzZ9H zzz9h = this.zzXtY;
        return zzz9h != null ? zzz9h : zzYja().zzYgo().zzYiL();
    }

    private void zzYgW() throws Exception {
        if (this.zzXtX == null) {
            this.zzXtX = new zzYTV();
        }
        this.zzXtX.zzSt(true);
        zzZYj().zzY(this.zzXtX);
    }

    private void zzYgX() {
        int count = this.zzXtV.getCount() - 2;
        if (count <= 0) {
            return;
        }
        byte[] bArr = new byte[count];
        this.zzXtV.zzV(bArr, count);
        this.zzXtX.setNumberFormat(com.aspose.words.internal.zzZO0.zzhU().zzZn(bArr));
    }

    private void zzYgY() {
        if (this.zzXtW != 0) {
            return;
        }
        zzYgX();
    }

    private zzYMX zzZYj() throws Exception {
        return zzYgV().zzZYj();
    }

    private void zza(zzYET zzyet) throws Exception {
        if (zzZYj().getTabStops() == null) {
            zzZYj().zzY(new TabStopCollection());
        }
        this.zzXtZ.zzkt(zzyet.zzYeT());
        zzZYj().getTabStops().add(this.zzXtZ);
        this.zzXtZ = new TabStop();
    }

    private void zzb(zzYET zzyet) throws Exception {
        int iZzYeT = zzyet.zzYeT();
        this.zzXtW = iZzYeT;
        if (iZzYeT == 0) {
            this.zzXtV = new com.aspose.words.internal.zzXE();
            return;
        }
        if (iZzYeT == 1) {
            this.zzXtU = 0;
            return;
        }
        if (iZzYeT == 2) {
            this.zzXtS = 0;
            this.zzXtT = 0;
        } else {
            if (iZzYeT != 3) {
                return;
            }
            this.zzXtR = 0;
        }
    }

    private boolean zzc(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 93:
                zzYgW();
                this.zzXtX.setAuthor(zzYja().zzYgv().get(zzyet.zzYeT()));
                return true;
            case 94:
                zzYgW();
                this.zzXtX.zz4(zzYEO.zzM4(zzyet.zzYeT()));
                return true;
            case 95:
                zzYgW();
                this.zzXtX.zzSt(false);
                this.zzXtX.zzSu(true);
                return true;
            case 96:
                zzb(zzyet);
                return true;
            case 97:
                zzYgY();
                return true;
            case 98:
                this.zzXtV.zzX((byte) zzyet.zzYeT());
                return true;
            case 99:
                if (this.zzXtU < 9) {
                    byte[] bArrZzYyp = this.zzXtX.zzYyp();
                    int i = this.zzXtU;
                    this.zzXtU = i + 1;
                    bArrZzYyp[i] = (byte) zzyet.zzYeT();
                }
                return true;
            case 100:
                int i2 = this.zzXtT;
                if (i2 < 18) {
                    this.zzXtS = ((((byte) zzyet.zzYeT()) & 255) << ((i2 & 1) * 8)) | this.zzXtS;
                    if (com.aspose.words.internal.zzAN.zzZP(this.zzXtT)) {
                        this.zzXtX.zzYyo()[this.zzXtT / 2] = this.zzXtS;
                        this.zzXtS = 0;
                    }
                    this.zzXtT++;
                }
                return true;
            case 101:
                int i3 = this.zzXtR;
                if (i3 < 36) {
                    int i4 = i3 / 4;
                    int[] iArrZzYyn = this.zzXtX.zzYyn();
                    iArrZzYyn[i4] = ((((byte) zzyet.zzYeT()) & 255) << ((i3 & 3) * 8)) | iArrZzYyn[i4];
                    this.zzXtR++;
                }
                return true;
            default:
                return false;
        }
    }

    private void zzos(int i) {
        if (i <= 31681) {
            zzYja().zzYhj().zznM(i);
        }
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzV(zzYET zzyet) throws Exception {
        int iZzCa = zzYG5.zzCa(zzyet.getName());
        if (iZzCa != Integer.MIN_VALUE) {
            zzZYj().zzQ(1610, Integer.valueOf(iZzCa));
            return true;
        }
        int iZzC8 = zzYG5.zzC8(zzyet.getName());
        if (iZzC8 != Integer.MIN_VALUE) {
            zzZYj().zzQ(1510, Integer.valueOf(iZzC8));
            return true;
        }
        int iZzC9 = zzYG5.zzC9(zzyet.getName());
        if (iZzC9 != Integer.MIN_VALUE) {
            this.zzXtZ.setLeader(iZzC9);
            return true;
        }
        int iZzC5 = zzYG5.zzC5(zzyet.getName());
        if (iZzC5 != Integer.MIN_VALUE) {
            zzZYj().zzQ(1290, Integer.valueOf(iZzC5));
            return true;
        }
        int iZzC4 = zzYG5.zzC4(zzyet.getName());
        if (iZzC4 != Integer.MIN_VALUE) {
            zzZYj().zzQ(1300, Integer.valueOf(iZzC4));
            return true;
        }
        int iZzC7 = zzYG5.zzC7(zzyet.getName());
        if (iZzC7 != Integer.MIN_VALUE) {
            zzZYj().zzQ(1320, Integer.valueOf(iZzC7));
            return true;
        }
        int iZzC6 = zzYG5.zzC6(zzyet.getName());
        if (iZzC6 != Integer.MIN_VALUE) {
            zzZYj().zzQ(1330, Integer.valueOf(iZzC6));
            return true;
        }
        int iZzCb = zzYG5.zzCb(zzyet.getName());
        if (iZzCb != Integer.MIN_VALUE) {
            getShading().setTexture(iZzCb);
            return true;
        }
        int iZzC3 = zzYG5.zzC3(zzyet.getName());
        if (iZzC3 == Integer.MIN_VALUE) {
            return false;
        }
        zzZYj().zzQ(1480, Integer.valueOf(iZzC3));
        return true;
    }

    @Override // com.aspose.words.zzYI2
    public final boolean zzW(zzYET zzyet) throws Exception {
        if (zzZrB()) {
            return false;
        }
        int iZzTP = zzUR.zzTP(zzyet.getName());
        int i = EditingLanguage.BRETON;
        switch (iZzTP) {
            case 0:
                zzYiZ();
                return true;
            case 1:
                if (zzyet.zzYf2() <= 0 || zzyet.zzYeT() != 0) {
                    zzYja().zzYhj().zznO(zzYja().zzYgo().getCount());
                } else {
                    zzYja().zzYhj().zzYfg();
                }
                if (zzYja().zzYiM().getContainer().getNodeType() == 8 && !((Paragraph) zzYja().zzYiM().getContainer()).isInCell()) {
                    zzYja().zzYiM().zzYhx();
                }
                zzYja().zzYhj().zzRh(true);
                return true;
            case 2:
                int iZzYeT = zzyet.zzYeT();
                zzos(iZzYeT);
                if (zzYja().zzYiM().getContainer().getNodeType() == 8 && iZzYeT > 1) {
                    zzYja().zzYiM().zzYhw();
                }
                return true;
            case 3:
                zzZYj().zzQ(1410, Boolean.valueOf(!zzyet.zzYeY()));
                return true;
            case 4:
                zzZYj().zzQ(EditingLanguage.YORUBA, Boolean.TRUE);
                return true;
            case 5:
                zzZYj().zzQ(1470, Boolean.FALSE);
                return true;
            case 6:
                zzZYj().zzQ(EditingLanguage.SORBIAN, Boolean.FALSE);
                return true;
            case 7:
                zzZYj().zzQ(1470, Boolean.TRUE);
                return true;
            case 8:
                zzZYj().zzQ(EditingLanguage.SLOVENIAN, Boolean.TRUE);
                return true;
            case 9:
                zzZYj().zzQ(EditingLanguage.DANISH, Boolean.TRUE);
                return true;
            case 10:
                zzZYj().zzQ(1000, Integer.valueOf(zzYja().zzJ(Integer.valueOf(zzyet.zzYeT()), 0)));
                return true;
            case 11:
                zzWo(EditingLanguage.CENTRAL_KURDISH_IRAQ, zzyet.zzYeT());
                return true;
            case 12:
                zzZYj().zzQ(1200, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 13:
                zzZYj().zzQ(1220, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 14:
                zzZYj().zzQ(1205, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 15:
                zzZYj().zzQ(1225, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 16:
                zzZYj().zzQ(1165, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 17:
                zzZYj().zzQ(EditingLanguage.CORSICAN, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 18:
                zzZYj().zzQ(1175, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 19:
                zzZYj().zzQ(1270, Boolean.TRUE);
                return true;
            case 20:
                zzZYj().zzQ(1210, Boolean.valueOf(zzyet.zzYeY()));
                return true;
            case 21:
                zzZYj().zzQ(1230, Boolean.valueOf(zzyet.zzYeY()));
                return true;
            case 22:
                zzZYj().zzQ(1260, Boolean.FALSE);
                return true;
            case 23:
                zzZYj().zzQ(EditingLanguage.TURKMEN, Boolean.FALSE);
                return true;
            case 24:
                zzZYj().zzQ(EditingLanguage.FAEROESE, Boolean.FALSE);
                return true;
            case 25:
                zzZYj().zzQ(1240, Boolean.TRUE);
                return true;
            case 26:
                zzZYj().zzQ(1250, Boolean.TRUE);
                return true;
            case 27:
                zzZYj().zzQ(EditingLanguage.MALAYALAM, Boolean.TRUE);
                return true;
            case 28:
                zzZYj().zzQ(1580, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 29:
                zzZYj().zzQ(EditingLanguage.ITALIAN_ITALY, Boolean.valueOf(zzyet.zzYeY()));
                return true;
            case 30:
                zzZYj().zzQ(1050, Boolean.valueOf(zzyet.zzYeY()));
                return true;
            case 31:
                zzYja().zzR(zzZYj(), 1360);
                return true;
            case 32:
                zzYja().zzR(zzZYj(), 1380);
                return true;
            case 33:
                zzYja().zzR(zzZYj(), 1350);
                return true;
            case 34:
                zzYja().zzR(zzZYj(), 1370);
                return true;
            case 35:
                zzYja().zzR(zzZYj(), 1390);
                return true;
            case 36:
                zzYja().zzR(zzZYj(), 1400);
                return true;
            case 37:
                zzZYj().zzQ(EditingLanguage.KASHMIRI_ARABIC, Integer.valueOf(zzYja().getDocument().getLists().zzxl(zzyet.zzYeT())));
                return true;
            case 38:
                int iZzYeT2 = zzyet.zzYeT();
                if (iZzYeT2 < 0) {
                    iZzYeT2 += 256;
                }
                zzZYj().zzQ(EditingLanguage.GALICIAN, Integer.valueOf(iZzYeT2));
                return true;
            case 39:
                zzZYj().zzQ(1440, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 40:
                zzZYj().zzQ(1450, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 41:
                zzZYj().zzQ(1022, Boolean.TRUE);
                return true;
            case 42:
                zzZYj().zzQ(1560, Boolean.FALSE);
                return true;
            case 43:
                zzZYj().zzQ(1560, Boolean.TRUE);
                return true;
            case 44:
                zzWo(zzYja().zzYgj() ? 1160 : 1620, zzyet.zzYeT());
                return true;
            case 45:
                if (!zzYja().zzYgj()) {
                    i = 1630;
                }
                zzWo(i, zzyet.zzYeT());
                return true;
            case 46:
                zzWo(1160, zzyet.zzYeT());
                return true;
            case 47:
                zzWo(EditingLanguage.BRETON, zzyet.zzYeT());
                return true;
            case 48:
                int iZzYeT3 = zzyet.zzYeT();
                zzZYj().zzw6(iZzYeT3 != 0 ? Math.abs(iZzYeT3) : 240);
                zzZYj().setLineSpacingRule(iZzYeT3 < 0 ? 1 : 0);
                return true;
            case 49:
                if (zzyet.zzYeY()) {
                    zzZYj().setLineSpacingRule(2);
                }
                return true;
            case 50:
            case 51:
                zzZYj().zzQ(1280, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 52:
                this.zzXtZ.setAlignment(2);
                return true;
            case 53:
                this.zzXtZ.setAlignment(1);
                return true;
            case 54:
                this.zzXtZ.setAlignment(3);
                return true;
            case 55:
                this.zzXtZ.setAlignment(4);
                zza(zzyet);
                return true;
            case 56:
                this.zzXtZ.setAlignment(6);
                return true;
            case 57:
                zza(zzyet);
                return true;
            case 58:
                zzZYj().zzQ(1310, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 59:
                zzZYj().zzQ(1430, zzYEO.zznn(zzyet.zzYeT()));
                return true;
            case 60:
            case 61:
                zzZYj().zzQ(1292, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 62:
            case 63:
                zzZYj().zzQ(1302, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                zzZYj().zzQ(1340, Integer.valueOf(zzYEO.zzBC(zzyet.getName())));
                return true;
            case 70:
                zzZYj().zzQ(1520, Boolean.valueOf(zzyet.zzYeY()));
                return true;
            case 71:
                zzZYj().zzQ(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 72:
                zzZYj().zzQ(1490, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 73:
                zzYFI.zzZ(getShading(), zzyet);
                return true;
            case 74:
                zzYFI.zzZ(zzYja(), getShading(), zzyet);
                return true;
            case 75:
                zzYFI.zzY(zzYja(), getShading(), zzyet);
                return true;
            case 76:
                zzYja().zzBZ(zzYja().zzYgv().get(zzyet.zzYeT()));
                return true;
            case 77:
                zzYja().zz3(zzYEO.zzM4(zzyet.zzYeT()));
                return true;
            case 78:
                zzZYj().zzQ(1660, Boolean.valueOf(zzyet.zzYeY()));
                return true;
            case 79:
                zzZYj().zzQ(EditingLanguage.PAPIAMENTU, Boolean.TRUE);
                return true;
            case 80:
                zzZYj().zzQ(1585, Integer.valueOf(zzyet.zzYeT()));
                return true;
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                zzZYj().zzQ(1590, Integer.valueOf(zzYEO.zzBv(zzyet.getName())));
                return true;
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                zzYja().zzC0(zzyet.getName());
                return true;
            case 91:
                int iZzYeT4 = zzyet.zzYeT();
                if (iZzYeT4 == 10) {
                    zzZYj().zzQ(1610, 5);
                } else if (iZzYeT4 == 20) {
                    zzZYj().zzQ(1610, 7);
                } else {
                    zzZYj().zzQ(1610, 8);
                }
                return true;
            case 92:
                zzZYj().zzQ(1610, 9);
                return true;
            default:
                return zzc(zzyet);
        }
    }

    public final void zzYiZ() throws Exception {
        zzZYj().clear();
        zzYEO.zzG(zzZYj());
        this.zzXtZ = new TabStop();
        zzYja().zzYhj().zzYfg();
        this.zzXtX = null;
    }

    public zzYG4(zzYFT zzyft, zzZ9H zzz9h) {
        super(zzyft);
        this.zzXtZ = new TabStop();
        this.zzXtY = zzz9h;
    }
}
