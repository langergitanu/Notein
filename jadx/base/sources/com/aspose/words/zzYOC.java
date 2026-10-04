package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYOC implements zzZBL {
    private static com.aspose.words.internal.zzZNR zzXJc = new com.aspose.words.internal.zzZNR("^M  END$", 74);
    private com.aspose.words.internal.zzAA zzXJd;
    private int zzYG;

    public zzYOC(com.aspose.words.internal.zzAA zzaa) {
        this(zzY41.zzXUb(), zzaa);
    }

    private static boolean zzDa(String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return com.aspose.words.internal.zzZKN.zzS(str, "Excel.Sheet.12", i) || com.aspose.words.internal.zzZKN.zzS(str, "Excel.SheetBinaryMacroEnabled.12", i) || com.aspose.words.internal.zzZKN.zzS(str, "Excel.SheetMacroEnabled.12", i) || com.aspose.words.internal.zzZKN.zzS(str, "Excel.Template", i) || com.aspose.words.internal.zzZKN.zzS(str, "Excel.Template.MacroEnabled", i);
    }

    private String zzDb(String str) throws Exception {
        zzZW zzzwZzZ;
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return (com.aspose.words.internal.zzZKN.zzS(str, "MailMsgAtt", i) || com.aspose.words.internal.zzZKN.zzS(str, "Outlook.MsgAttach", i)) ? ".msg" : (com.aspose.words.internal.zzZKN.zzS(str, "Outlook.FileAttach", i) && (zzzwZzZ = zzZW.zzZ(this.zzXJd)) != null && com.aspose.words.internal.zzZYD.zzXk(zzzwZzZ.zzxl())) ? zzzwZzZ.zzxl() : "";
    }

    private static boolean zzDc(String str) {
        return ".xlsx".equals(str) || ".docx".equals(str) || ".pptx".equals(str) || ".vsdx".equals(str);
    }

    private String zzDd(String str) {
        com.aspose.words.internal.zzAA zzaa;
        return (!zzDc(str) || (zzaa = this.zzXJd) == null) ? str : zzaa.containsKey("Workbook") ? ".xls" : this.zzXJd.containsKey("WordDocument") ? ".doc" : this.zzXJd.containsKey("PowerPoint Document") ? ".ppt" : this.zzXJd.containsKey("VisioDocument") ? ".vsd" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzN(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        com.aspose.words.internal.zzZOR zzzorZzYt;
        com.aspose.words.internal.zzAA zzaaZzYr;
        zzYrs();
        if (this.zzXJd == null) {
            return;
        }
        zzYOA zzyoaZzD9 = zzYOA.zzD9(str);
        if (com.aspose.words.internal.zzZYD.zzh(zzyoaZzD9.zzXJ8, "0003000c-0000-0000-c000-000000000046")) {
            zzyoaZzD9 = zzYOA.zzM(this.zzXJd.zzAC());
        }
        String str2 = zzyoaZzD9.zzXJ9;
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        com.aspose.words.internal.zzZOR zzzor = null;
        if (!com.aspose.words.internal.zzZKN.zzS(str2, "Excel.Sheet.8", i)) {
            if (!zzDa(zzyoaZzD9.zzXJ9)) {
                int i2 = zzyoaZzD9.zzXJ4;
                if (i2 == 4) {
                    zzzorZzYt = this.zzXJd.zzYt("Package");
                } else if (i2 == 5) {
                    zzzorZzYt = this.zzXJd.zzYt("EmbeddedOdf");
                } else if (com.aspose.words.internal.zzZKN.zzS(str, "Outlook.FileAttach", i)) {
                    zzzorZzYt = this.zzXJd.zzYt("AttachContents");
                } else if (com.aspose.words.internal.zzZKN.zzS(zzyoaZzD9.zzXJ9, "AcroExch.Document", i) || com.aspose.words.internal.zzZKN.zzS(zzyoaZzD9.zzXJ9, "Acrobat.Document", i)) {
                    zzzorZzYt = this.zzXJd.zzYt("CONTENTS");
                } else if (com.aspose.words.internal.zzZKN.zzS(str, "MailMsgAtt", i) || com.aspose.words.internal.zzZKN.zzS(str, "Outlook.MsgAttach", i)) {
                    zzaaZzYr = this.zzXJd.zzYr("MAPIMessage");
                } else if (com.aspose.words.internal.zzZKN.zzS(str, "ISISServer", i) && zzYR(zzzop)) {
                    return;
                }
                zzzor = zzzorZzYt;
                zzaaZzYr = null;
            } else if (this.zzXJd.containsKey("Package")) {
                if ("Excel.SheetBinaryMacroEnabled.12".equals(zzyoaZzD9.zzXJ9)) {
                    zzzorZzYt = this.zzXJd.zzYt("Package");
                    zzzor = zzzorZzYt;
                    zzaaZzYr = null;
                } else {
                    com.aspose.words.internal.zzZOR zzzorZzYt2 = this.zzXJd.zzYt("Package");
                    zzzorZzYt2.zzH(0L);
                    if (com.aspose.words.internal.zzKD.zzM(zzzorZzYt2)) {
                        zzzorZzYt2 = new com.aspose.words.internal.zzKD(zzzorZzYt2).zzIf().zzYt("package");
                    }
                    com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
                    zzYO6.zzT(zzzorZzYt2, zzzor2);
                    zzaaZzYr = null;
                    zzzor = zzzor2;
                }
            } else if (this.zzXJd.containsKey("Workbook")) {
                zzYO6.zzYQ(this.zzXJd.zzYt("Workbook"));
            }
            if (zzzor == null) {
                zzzor.zzH(0L);
                com.aspose.words.internal.zzZYQ.zzX(zzzor, zzzop);
                return;
            } else {
                if (zzaaZzYr == null) {
                    zzaaZzYr = this.zzXJd;
                }
                zzZ(zzzop, zzaaZzYr);
                return;
            }
        }
        zzYO6.zzYQ(this.zzXJd.zzYt("Workbook"));
        zzaaZzYr = null;
        if (zzzor == null) {
        }
    }

    private void zzO(com.aspose.words.internal.zzZOP zzzop, String str) throws Exception {
        com.aspose.words.internal.zzZOX zzzoxZzYrv;
        if ((com.aspose.words.internal.zzZYD.zzg(str, "ISISServer") && zzYR(zzzop)) || (zzzoxZzYrv = zzYrv()) == null) {
            return;
        }
        zzYOJ zzyoj = new zzYOJ(zzzoxZzYrv);
        if (zzyoj.zzXJt != 2) {
            zzYrq().zzH(4L);
            com.aspose.words.internal.zzZYQ.zzX(zzYrq(), zzzop);
        } else {
            if (zzyoj.zzXJq != 3) {
                return;
            }
            int i = zzyoj.zzXJo;
            byte[] bArr = new byte[i];
            zzzoxZzYrv.read(bArr, 0, i);
            zzzop.write(bArr, 0, i);
        }
    }

    private boolean zzYR(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzZOR zzzorZzYt = this.zzXJd.zzYt("CONTENTS");
        if (zzzorZzYt == null) {
            return false;
        }
        byte[] bArrZziA = zzzorZzYt.zziA();
        com.aspose.words.internal.zzZO0 zzzo0ZzhV = com.aspose.words.internal.zzZO0.zzhV();
        String strZzR = zzzo0ZzhV.zzR(bArrZziA, 4, ((int) zzzorZzYt.getLength()) - 4);
        com.aspose.words.internal.zzZNT zzzntZzUX = zzXJc.zzUX(strZzR);
        if (!zzzntZzUX.zzhL()) {
            return false;
        }
        int length = zzzntZzUX.getLength() + zzzntZzUX.getIndex();
        if (length < strZzR.length()) {
            length++;
        }
        if (strZzR.charAt(length - 1) == '\r' && length < strZzR.length() && strZzR.charAt(length) == '\n') {
            length++;
        }
        byte[] bytes = zzzo0ZzhV.getBytes(strZzR.substring(0, length));
        zzzop.write(bytes, 0, bytes.length);
        return true;
    }

    private com.aspose.words.internal.zzZOR zzYrq() {
        return this.zzXJd.zzYt("\u0001Ole10Native");
    }

    private com.aspose.words.internal.zzZOX zzYrv() throws Exception {
        zzYrs();
        if (zzYrq().getLength() == 0) {
            return null;
        }
        zzYrq().zzH(0L);
        return new com.aspose.words.internal.zzZOX(zzYrq(), com.aspose.words.internal.zzZO0.zzQz(1251));
    }

    private static void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzAA zzaa) throws Exception {
        new com.aspose.words.internal.zzKD(zzaa).zzL(zzzop);
    }

    @Override // com.aspose.words.zzZBL
    public String getClsidInternal() {
        return this.zzXJd.zzAC().toString();
    }

    @Override // com.aspose.words.zzZBL
    public String getExtensionForUser(String str) throws Exception {
        if (!com.aspose.words.internal.zzZKN.zzU3(str)) {
            String strZzDd = zzDd(zzYOA.zzD9(str).zzXJ6);
            if (com.aspose.words.internal.zzZYD.zzXk(strZzDd)) {
                return strZzDd;
            }
            String strZzDb = zzDb(str);
            if (!com.aspose.words.internal.zzZKN.zzU3(strZzDb)) {
                return strZzDb;
            }
        }
        String strZzYrw = zzYrw();
        return !com.aspose.words.internal.zzZKN.zzU3(strZzYrw) ? com.aspose.words.internal.zzZOQ.zzVe(strZzYrw).toLowerCase() : zzYOA.zzL(this.zzXJd.zzAC());
    }

    @Override // com.aspose.words.zzZBL
    public String getFileNameForUser() throws Exception {
        zzZW zzzwZzZ = zzZW.zzZ(this.zzXJd);
        return zzzwZzZ != null ? zzzwZzZ.getFileName() : com.aspose.words.internal.zzZOQ.zzVg(zzYrw());
    }

    @Override // com.aspose.words.zzZBL
    public int getId() {
        return this.zzYG;
    }

    @Override // com.aspose.words.zzZBL
    public String getName() throws Exception {
        zzYTO zzytoZzP = zzYTO.zzP(this.zzXJd);
        if (zzytoZzP == null) {
            return null;
        }
        return zzytoZzP.getValue();
    }

    @Override // com.aspose.words.zzZBL
    public zzYOC getOleObject() {
        return this;
    }

    @Override // com.aspose.words.zzZBL
    public boolean isForms2OleControlInternal() {
        return OleControl.zzDf(getClsidInternal());
    }

    @Override // com.aspose.words.zzZBL
    public void saveForUser(com.aspose.words.internal.zzZOP zzzop, zzZ9A zzz9a) throws Exception {
        String str = (String) zzz9a.fetchShapeAttr(4113);
        if (zzYrs()) {
            zzO(zzzop, str);
        } else {
            zzN(zzzop, str);
        }
    }

    @Override // com.aspose.words.zzZBL
    public void setId(int i) {
        this.zzYG = i;
    }

    public final com.aspose.words.internal.zzAA zzYrr() {
        return this.zzXJd;
    }

    public final boolean zzYrs() {
        return zzYrq() != null;
    }

    public final com.aspose.words.internal.zzZOR zzYrt() {
        return this.zzXJd.zzYt("\u0003PIC");
    }

    public final com.aspose.words.internal.zzZOR zzYru() {
        return this.zzXJd.zzYt("\u0003META");
    }

    public final String zzYrw() throws Exception {
        return !zzYrs() ? "" : zzYO6.zze(zzYrv());
    }

    public zzYOC(int i, com.aspose.words.internal.zzAA zzaa) {
        this.zzXJd = zzaa;
        this.zzYG = i;
    }
}
