package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGI extends zzYHS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\mmodsocoldelim", "\\mmjdsotype", "\\mmodsofhdr", "\\mmodsocolumn", "\\mmodsoactive", "\\mmodsohash", "\\mmfttypenull", "\\mmfttypedbcolumn", "\\mmfttypeaddress", "\\mmfttypesalutation", "\\mmfttypemapped", "\\mmfttypebarcode", "\\mmodsofmcolumn", "\\mmodsodynaddr", "\\mmodsolid");
    private OdsoRecipientData zzXuD;
    private OdsoFieldMapData zzXuE;

    public zzYGI(zzYFT zzyft) {
        super(zzyft);
        this.zzXw4.getDocument().zzZpV().zzYWd.setOdso(new Odso());
    }

    private Odso getOdso() {
        return this.zzXw4.getDocument().zzZpV().zzYWd.getOdso();
    }

    private void zzA(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                this.zzXuE.setType(zzYEO.zzBy(zzyet.getName()));
                break;
            case 12:
                this.zzXuE.zzsR(zzyet.zzYeT());
                break;
            case 13:
                this.zzXuE.zzSs(zzyet.zzYeY());
                break;
            case 14:
                this.zzXuE.zzRe(zzyet.zzYeT());
                break;
        }
    }

    private void zzB(zzYET zzyet) {
        int iZzYhQ = zzYhQ();
        if (iZzYhQ == 252) {
            this.zzXuE.setName(zzyet.zzYR());
        } else {
            if (iZzYhQ != 253) {
                return;
            }
            this.zzXuE.setMappedName(zzyet.zzYR());
        }
    }

    private void zzC(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 3) {
            this.zzXuD.setColumn(zzyet.zzYeT());
        } else if (iZzTP == 4) {
            this.zzXuD.setActive(zzyet.zzYeY());
        } else {
            if (iZzTP != 5) {
                return;
            }
            this.zzXuD.setHash(zzyet.zzYeT());
        }
    }

    private void zzD(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            getOdso().setColumnDelimiter((char) zzyet.zzYeT());
        } else if (iZzTP == 1) {
            getOdso().setDataSourceType(zzyet.zzYeT());
        } else {
            if (iZzTP != 2) {
                return;
            }
            getOdso().setFirstRowContainsColumnNames(zzyet.zzYeY());
        }
    }

    private int zzYhQ() {
        return this.zzXw4.zzYgo().zzYiL().zzYiN().getType();
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int iZzYhQ = zzYhQ();
        if (iZzYhQ == 244) {
            zzD(zzyet);
            return;
        }
        if (iZzYhQ == 251) {
            zzA(zzyet);
        } else if (iZzYhQ != 254) {
            super.zzT(zzyet);
        } else {
            zzC(zzyet);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) throws Exception {
        switch (zzYhQ()) {
            case 245:
                if (com.aspose.words.internal.zzZKN.equals(getOdso().getUdlConnectString(), "")) {
                    getOdso().setUdlConnectString(zzyet.zzYR());
                }
                break;
            case 246:
                getOdso().setUdlConnectString(com.aspose.words.internal.zzZO0.zzhU().zzZn(zzyet.zzYeZ()));
                break;
            case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
                getOdso().setTableName(zzyet.zzYR());
                break;
            case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
                getOdso().setDataSource(zzyet.zzYR());
                break;
            case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
            case 250:
                break;
            case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
            case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
            case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
                zzB(zzyet);
                break;
            case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
            default:
                super.zzY(zzyet);
                break;
            case 255:
                this.zzXuD.setUniqueTag(com.aspose.words.internal.zzZO0.zzhU().getBytes(zzyet.zzYR()));
                break;
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        int iZzYhQ = zzYhQ();
        if (iZzYhQ == 251) {
            getOdso().getFieldMapDatas().add(this.zzXuE);
        } else if (iZzYhQ != 254) {
            super.zzYjb();
        } else {
            getOdso().getRecipientDatas().add(this.zzXuD);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        int iZzYhQ = zzYhQ();
        if (iZzYhQ == 251) {
            this.zzXuE = new OdsoFieldMapData();
        } else if (iZzYhQ != 254) {
            super.zzZ(zzyet);
        } else {
            this.zzXuD = new OdsoRecipientData();
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        switch (zzyhp.getType()) {
            case 245:
            case 246:
            case StyleIdentifier.LIGHT_LIST_ACCENT_6 /* 247 */:
            case StyleIdentifier.LIGHT_GRID_ACCENT_6 /* 248 */:
            case StyleIdentifier.MEDIUM_SHADING_1_ACCENT_6 /* 249 */:
            case 250:
            case StyleIdentifier.MEDIUM_LIST_1_ACCENT_6 /* 251 */:
            case StyleIdentifier.MEDIUM_LIST_2_ACCENT_6 /* 252 */:
            case StyleIdentifier.MEDIUM_GRID_1_ACCENT_6 /* 253 */:
            case StyleIdentifier.MEDIUM_GRID_2_ACCENT_6 /* 254 */:
            case 255:
                return this;
            default:
                return super.zzZ(zzyhp);
        }
    }
}
