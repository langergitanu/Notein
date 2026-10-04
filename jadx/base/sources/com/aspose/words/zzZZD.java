package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZD {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private boolean zzYUF;
    private int zzYUG;
    private com.aspose.words.internal.zz0B zzYUH;
    private com.aspose.words.internal.zz0B zzYUI;
    private com.aspose.words.internal.zz0B zzYUJ;
    private CustomDocumentProperties zzYUK;
    private BuiltInDocumentProperties zzYUL;
    private IWarningCallback zzZG0;
    private static com.aspose.words.internal.zzZQ9 zzYUE = new com.aspose.words.internal.zzZQ9(1601, 1, 1);
    private static com.aspose.words.internal.zzZYJ zzYUD = new com.aspose.words.internal.zzZYJ();
    private static com.aspose.words.internal.zzZYJ zzYUC = new com.aspose.words.internal.zzZYJ();

    static {
        zzYUD.zzP(23, "Version");
        zzYUD.zzP(17, "CharactersWithSpaces");
        zzYUD.zzP(2, "Category");
        zzYUD.zzP(4, "Bytes");
        zzYUD.zzP(5, "Lines");
        zzYUD.zzP(6, "Paragraphs");
        zzYUD.zzP(12, "HeadingPairs");
        zzYUD.zzP(13, "TitlesOfParts");
        zzYUD.zzP(14, "Manager");
        zzYUD.zzP(15, "Company");
        zzYUD.zzP(16, "LinksUpToDate");
        zzYUD.zzP(27, "ContentStatus");
        zzYUD.zzP(26, "ContentType");
        zzYUD.zzP(28, "Language");
        zzYUD.zzP(29, "DocumentVersion");
        zzYUC.zzP(2, "Title");
        zzYUC.zzP(3, "Subject");
        zzYUC.zzP(4, "Author");
        zzYUC.zzP(5, "Keywords");
        zzYUC.zzP(6, "Comments");
        zzYUC.zzP(7, "Template");
        zzYUC.zzP(8, "LastSavedBy");
        zzYUC.zzP(11, "LastPrinted");
        zzYUC.zzP(12, "CreateTime");
        zzYUC.zzP(13, "LastSavedTime");
        zzYUC.zzP(14, "Pages");
        zzYUC.zzP(15, "Words");
        zzYUC.zzP(16, "Characters");
        zzYUC.zzP(19, "Security");
        zzYUC.zzP(18, "NameOfApplication");
        zzUR = new com.aspose.words.internal.zzZHW("Title", "Subject", "Author", "Keywords", "Comments", "Template", "LastSavedBy", "LastPrinted", "CreateTime", "LastSavedTime", "Pages", "Words", "Characters", "Security", "NameOfApplication", "RevisionNumber", "TotalEditingTime", "Category", "Bytes", "Lines", "Paragraphs", "HeadingPairs", "TitlesOfParts", "Manager", "Company", "LinksUpToDate", "CharactersWithSpaces", "Version", "ContentStatus", "ContentType", "Language", "DocumentVersion", "HyperlinkBase", "Thumbnail");
    }

    public zzZZD() {
    }

    private void zzF(int i, Object obj) {
        this.zzYUI.zzs6().zzZ(new com.aspose.words.internal.zz0E(i, null, obj));
    }

    private void zzG(int i, Object obj) {
        this.zzYUJ.zzs6().zzZ(new com.aspose.words.internal.zz0E(i, null, obj));
    }

    private static com.aspose.words.internal.zzZQ9 zzGk(int i) {
        if (i == 0) {
            return com.aspose.words.internal.zzZQ9.zz35;
        }
        return com.aspose.words.internal.zzZQ9.zzZ(zzYUE, com.aspose.words.internal.zzZNF.zzZc(i));
    }

    private int zzU(String str, Object obj) {
        int i = this.zzYUG;
        this.zzYUG = i + 1;
        this.zzYUH.zzs6().zzZ(new com.aspose.words.internal.zz0E(i, str, obj));
        return i;
    }

    private void zzY(com.aspose.words.internal.zz0D zz0d) throws Exception {
        com.aspose.words.internal.zzD3 zzd3 = new com.aspose.words.internal.zzD3();
        HashMap map = new HashMap();
        for (int i = 0; i < zz0d.getCount(); i++) {
            com.aspose.words.internal.zz0E zz0eZzTd = zz0d.zzTd(i);
            if ("_PID_LINKBASE".equals(zz0eZzTd.getName())) {
                if (zz0eZzTd.getValue() instanceof byte[]) {
                    this.zzYUL.setHyperlinkBase(com.aspose.words.internal.zzZO0.zzhU().zzR((byte[]) zz0eZzTd.getValue(), 0, r4.length - 2));
                } else if (zz0eZzTd.getValue() instanceof String) {
                    this.zzYUL.setHyperlinkBase((String) zz0eZzTd.getValue());
                }
            } else if ((zz0eZzTd.getId() & 16777216) != 0) {
                int id = zz0eZzTd.getId() & (-16777217);
                if (zz0eZzTd.getValue() instanceof String) {
                    map.put(Integer.valueOf(id), (String) zz0eZzTd.getValue());
                }
            } else if (!com.aspose.words.internal.zzZYD.zzXk(zz0eZzTd.getName())) {
                zzY("Document property without name found, ignored.", new Object[0]);
            } else if ("_PID_HLINKS".equals(zz0eZzTd.getName())) {
                byte[] bArr = (byte[]) com.aspose.words.internal.zzZKW.zzZ(zz0eZzTd.getValue(), byte[].class);
                if (bArr != null) {
                    this.zzYUL.zzZAZ = new zzZKK(bArr);
                } else {
                    zzY("Invalid _PID_HLINKS property, ignored.", new Object[0]);
                }
            } else {
                zzd3.set(zz0eZzTd.getId(), this.zzYUK.zzT(zz0eZzTd.getName(), zz0eZzTd.getValue()));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            DocumentProperty documentProperty = (DocumentProperty) zzd3.get(((Integer) entry.getKey()).intValue());
            if (documentProperty != null) {
                documentProperty.zzO2((String) entry.getValue());
            }
        }
    }

    private void zzZrL() {
        for (DocumentProperty documentProperty : this.zzYUK) {
            int iZzU = zzU(documentProperty.getName(), documentProperty.zzZol());
            if (com.aspose.words.internal.zzZYD.zzXk(documentProperty.zzZok())) {
                this.zzYUH.zzs6().zzZ(new com.aspose.words.internal.zz0E(iZzU | 16777216, null, documentProperty.zzZok()));
            }
        }
    }

    private void zzZrM() {
        zzF(11, Boolean.FALSE);
        for (DocumentProperty documentProperty : this.zzYUL) {
            switch (zzUR.zzTP(documentProperty.getName())) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    zzG(zzYUC.zzXp(documentProperty.getName()), documentProperty.zzZol());
                    break;
                case 15:
                    zzG(9, documentProperty.zzZol().toString());
                    break;
                case 16:
                    zzG(10, zzGk(((Integer) documentProperty.zzZol()).intValue()));
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    zzF(zzYUD.zzXp(documentProperty.getName()), documentProperty.zzZom() == null ? documentProperty.zzZol() : DocumentProperty.zzFI(documentProperty.getType()));
                    break;
                case 32:
                    String string = documentProperty.zzZol().toString();
                    if (com.aspose.words.internal.zzZYD.zzXk(string)) {
                        byte[] bArr = new byte[(string.length() * 2) + 2];
                        com.aspose.words.internal.zzZO0.zzhU().zzZ(string, string.length(), bArr, 0);
                        zzU("_PID_LINKBASE", bArr);
                    }
                    break;
                case 33:
                    zzY1Z.zzY(this.zzZG0, 10, "Thumbnail property is not supported in DOC format by Aspose.Words.", new Object[0]);
                    break;
                default:
                    throw new IllegalStateException("Unknown built-in property encountered.");
            }
        }
    }

    private void zzZv(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop == null || zzzop.getLength() == 0) {
            return;
        }
        for (com.aspose.words.internal.zz0B zz0b : new com.aspose.words.internal.zz0C(zzzop, 2).zzs7()) {
            if (zz0b.zzs5().equals(com.aspose.words.internal.zz0B.zzdT)) {
                zzZ(zz0b.zzs6());
            } else {
                zzY(zz0b.zzs6());
            }
        }
        if (this.zzYUL.contains("Title") && com.aspose.words.internal.zzZKN.equals(this.zzYUL.getTitle(), com.aspose.words.internal.zz0B.zzdR) && this.zzYUL.getTitlesOfParts().length > 0) {
            BuiltInDocumentProperties builtInDocumentProperties = this.zzYUL;
            builtInDocumentProperties.setTitle(builtInDocumentProperties.getTitlesOfParts()[0]);
        }
        if (this.zzYUF) {
            return;
        }
        this.zzYUL.zzZAZ = null;
    }

    private void zzZw(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop == null || zzzop.getLength() == 0) {
            return;
        }
        com.aspose.words.internal.zz0C zz0c = new com.aspose.words.internal.zz0C(zzzop, 1);
        if (zz0c.zzs7().size() == 0) {
            return;
        }
        com.aspose.words.internal.zz0D zz0dZzs6 = zz0c.zzs7().get(0).zzs6();
        for (int i = 0; i < zz0dZzs6.getCount(); i++) {
            com.aspose.words.internal.zz0E zz0eZzTd = zz0dZzs6.zzTd(i);
            switch (zz0eZzTd.getId()) {
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 18:
                    zzZ(zzYUC.getValue(zz0eZzTd.getId()), zz0eZzTd.getValue(), 4);
                    break;
                case 9:
                    if (zz0eZzTd.getValue() instanceof String) {
                        int iZzZo = com.aspose.words.internal.zzJB.zzZo((String) zz0eZzTd.getValue());
                        if (iZzZo != Integer.MIN_VALUE) {
                            zzZ("RevisionNumber", Integer.valueOf(iZzZo), 3);
                        } else {
                            zzY("Invalid revision number.", new Object[0]);
                        }
                    }
                    break;
                case 10:
                    if (zz0eZzTd.getValue() instanceof com.aspose.words.internal.zzZQ9) {
                        zzZ("TotalEditingTime", Integer.valueOf(zzo((com.aspose.words.internal.zzZQ9) zz0eZzTd.getValue())), 3);
                    } else {
                        zzY("Invalid DateTime property, ignored.", new Object[0]);
                    }
                    break;
                case 11:
                case 12:
                case 13:
                    zzZ(zzYUC.getValue(zz0eZzTd.getId()), zz0eZzTd.getValue(), 1);
                    break;
                case 14:
                case 15:
                case 16:
                case 19:
                    zzZ(zzYUC.getValue(zz0eZzTd.getId()), zz0eZzTd.getValue(), 3);
                    break;
                case 17:
                    zzY("Unsupported document property 0x{0:x4}, ignored.", Integer.valueOf(zz0eZzTd.getId()));
                    break;
                default:
                    zzY("Unsupported document property 0x{0:x4}, ignored.", Integer.valueOf(zz0eZzTd.getId()));
                    break;
            }
        }
    }

    private static int zzo(com.aspose.words.internal.zzZQ9 zzzq9) {
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9, com.aspose.words.internal.zzZQ9.zz35)) {
            return 0;
        }
        double dZzhz = com.aspose.words.internal.zzZQ9.zzU(zzzq9, zzYUE).zzhz();
        if (dZzhz <= 0.0d || dZzhz >= 2.147483647E9d) {
            return 0;
        }
        return (int) dZzhz;
    }

    public final void zzZ(com.aspose.words.internal.zzAA zzaa, BuiltInDocumentProperties builtInDocumentProperties, CustomDocumentProperties customDocumentProperties) throws Exception {
        zzZ(zzaa.zzYu("\u0005SummaryInformation"), zzaa.zzYu("\u0005DocumentSummaryInformation"), builtInDocumentProperties, customDocumentProperties);
    }

    public zzZZD(IWarningCallback iWarningCallback) {
        this.zzZG0 = iWarningCallback;
    }

    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZOP zzzop2, BuiltInDocumentProperties builtInDocumentProperties, CustomDocumentProperties customDocumentProperties) throws Exception {
        this.zzYUL = builtInDocumentProperties;
        this.zzYUK = customDocumentProperties;
        zzZw(zzzop);
        zzZv(zzzop2);
    }

    private void zzZ(com.aspose.words.internal.zz0D zz0d) {
        for (int i = 0; i < zz0d.getCount(); i++) {
            com.aspose.words.internal.zz0E zz0eZzTd = zz0d.zzTd(i);
            switch (zz0eZzTd.getId()) {
                case 1:
                case 20:
                    break;
                case 2:
                case 14:
                case 15:
                case 26:
                case 27:
                case 28:
                case 29:
                    zzZ(zzYUD.getValue(zz0eZzTd.getId()), zz0eZzTd.getValue(), 4);
                    break;
                case 3:
                case 7:
                case 8:
                case 9:
                case 11:
                    zzY("Unsupported PowerPoint property 0x{0:x4}, ignored.", Integer.valueOf(zz0eZzTd.getId()));
                    break;
                case 4:
                case 5:
                case 6:
                case 17:
                case 23:
                    zzZ(zzYUD.getValue(zz0eZzTd.getId()), zz0eZzTd.getValue(), 3);
                    break;
                case 10:
                case 18:
                case 24:
                case 25:
                default:
                    zzY("Unsupported document property 0x{0:x4}, ignored.", Integer.valueOf(zz0eZzTd.getId()));
                    break;
                case 12:
                    zzZ("HeadingPairs", zz0eZzTd.getValue(), 6);
                    break;
                case 13:
                    zzZ("TitlesOfParts", zz0eZzTd.getValue(), 5);
                    break;
                case 16:
                    zzZ("LinksUpToDate", zz0eZzTd.getValue(), 0);
                    break;
                case 19:
                    zzY("Unsupported document property 0x{0:x4}, ignored.", Integer.valueOf(zz0eZzTd.getId()));
                    break;
                case 21:
                    zzY("Unsupported document property 0x{0:x4}, ignored.", Integer.valueOf(zz0eZzTd.getId()));
                    break;
                case 22:
                    this.zzYUF = ((Boolean) zz0eZzTd.getValue()).booleanValue();
                    break;
            }
        }
    }

    private void zzZ(String str, Object obj, int i) {
        if (DocumentProperty.zzZz(obj) == i) {
            this.zzYUL.zzT(str, obj);
        }
    }

    public final void zzZ(BuiltInDocumentProperties builtInDocumentProperties, CustomDocumentProperties customDocumentProperties, com.aspose.words.internal.zzAA zzaa) throws Exception {
        this.zzYUL = builtInDocumentProperties;
        this.zzYUK = customDocumentProperties;
        com.aspose.words.internal.zz0C zz0c = new com.aspose.words.internal.zz0C();
        this.zzYUJ = new com.aspose.words.internal.zz0B(com.aspose.words.internal.zz0B.zzdU, (byte) 0);
        zz0c.zzs7().add(this.zzYUJ);
        com.aspose.words.internal.zz0C zz0c2 = new com.aspose.words.internal.zz0C();
        this.zzYUI = new com.aspose.words.internal.zz0B(com.aspose.words.internal.zz0B.zzdT, (byte) 0);
        zz0c2.zzs7().add(this.zzYUI);
        this.zzYUH = new com.aspose.words.internal.zz0B(com.aspose.words.internal.zz0B.zzdS, (byte) 0);
        zz0c2.zzs7().add(this.zzYUH);
        this.zzYUG = 2;
        zzZrM();
        zzZrL();
        if (this.zzYUH.zzs6().getCount() == 0) {
            zz0c2.zzs7().remove(this.zzYUH);
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zz0c.zzL(zzzor);
        zzaa.set("\u0005SummaryInformation", zzzor);
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR();
        zz0c2.zzL(zzzor2);
        zzaa.set("\u0005DocumentSummaryInformation", zzzor2);
    }

    private void zzY(String str, Object... objArr) {
        zzY1Z.zzZ(this.zzZG0, 10, str, objArr);
    }
}
