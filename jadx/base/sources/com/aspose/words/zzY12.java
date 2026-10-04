package com.aspose.words;

import android.os.Bundle;
import com.orion.notein.richeditor.fonts.FontManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY12 extends zzYVB implements zzZBS {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("SmartTagType", "DocumentProperties", "CustomDocumentProperties", FontManager.REMOTE_FONT_DIR, "frameset", "lists", "styles", "divs", "docOleData", "docSuppData", "shapeDefaults", "bgPict", "docPr", "body", "namespaceuri", "name", "binData", ".emz", ".wmz", ".pcz", "txbxContent");
    private zzY19 zzWUX;
    private zzY0S zzWUY;
    private boolean zzWUZ;
    private HashMap<String, String> zzWV0;
    private HashMap<ListLevel, String> zzWV1;
    private HashMap<zzZ4J, String> zzWV2;
    private HashMap<String, com.aspose.words.internal.zzAA> zzWV3;
    private HashMap<String, byte[]> zzWV4;
    private zzYU4 zzZ7n;

    public zzY12(com.aspose.words.internal.zzZOP zzzop, Document document, LoadOptions loadOptions, boolean z, zzY0S zzy0s, zzY19 zzy19, zzY0U zzy0u) throws Exception {
        super(document, loadOptions, 13, null, zzY11.zzXSx(), zzy0u);
        this.zzWV4 = new HashMap<>();
        this.zzWV3 = new HashMap<>();
        this.zzWV2 = new HashMap<>();
        this.zzWV1 = new HashMap<>();
        this.zzWV0 = new HashMap<>();
        this.zzWUZ = z;
        this.zzWUY = zzy0s;
        this.zzWUX = zzy19;
        this.zzZ7n = new zzY0O(zzzop, loadOptions.getWarningCallback());
    }

    private void zzXA(byte[] bArr) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr);
        zzzor.zzH(16L);
        zzY67 zzy67 = new zzY67();
        zzy67.zzZ(new com.aspose.words.internal.zzZOX(zzzor), (int) (zzzor.getLength() - zzzor.getPosition()), (Document) getDocument());
        if (zzy67.zzXWD().size() > 0) {
            ((Document) getDocument()).getVbaProject().zzYU(zzy67.zzXWD());
        }
    }

    private void zzXSB() throws Exception {
        this.zzZ7n.zzj();
        String localName = this.zzZ7n.getLocalName();
        while (this.zzZ7n.zzQ(localName)) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 16) {
                this.zzZ7n.zzk();
            } else {
                zzZml();
            }
        }
    }

    private void zzXSC() throws Exception {
        Document document = (Document) getDocument();
        zzXSB();
        byte[] bArrZzNO = zzNO("editdata.mso");
        if (bArrZzNO == null || bArrZzNO.length <= 10) {
            return;
        }
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(new com.aspose.words.internal.zzZOR(bArrZzNO));
        zzzox.zzn(10);
        while (com.aspose.words.internal.zzZYQ.zzT(zzzox, 4)) {
            int iZzXc = zzzox.zzXc();
            if (iZzXc == -268369920) {
                zzzox.zzXc();
                zzzox.zzXc();
            } else if (iZzXc == -267976704) {
                int iZzXc2 = zzzox.zzXc();
                zzzox.zzn(8);
                int iZzXc3 = zzzox.zzXc();
                document.zzG2(zzzox.zzXc());
                byte[] bArrZzn = iZzXc3 > 0 ? zzzox.zzn(iZzXc3) : null;
                int iZzXc4 = zzzox.zzXc();
                int i = (iZzXc2 - iZzXc3) - 20;
                if (i > 0) {
                    document.zzZ(new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZRV.zzT(zzzox.zzn(i), iZzXc4, 1))).zzIf(), bArrZzn);
                }
            } else if (iZzXc == -267714560) {
                zzzox.zzXc();
                zzzox.zzXc();
            } else if (iZzXc == -267583488) {
                zzXA(zzzox.zzn(zzzox.zzXc()));
            }
        }
    }

    private void zzXSD() throws Exception {
        zzXSB();
        byte[] bArrZzNO = zzNO("oledata.mso");
        if (bArrZzNO.length > 0) {
            for (Map.Entry entry : new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOR(bArrZzNO)).zzIf()) {
                this.zzWV3.put((String) entry.getKey(), zzYJ((com.aspose.words.internal.zzZOR) entry.getValue()));
            }
        }
    }

    private void zzXSE() {
        String value = "";
        while (this.zzZ7n.zzi()) {
            int iZzTP = zzUR.zzTP(this.zzZ7n.getLocalName());
            if (iZzTP == 14) {
                value = this.zzZ7n.getValue();
            } else if (iZzTP == 15) {
                this.zzZ7n.getValue();
            }
        }
        int i = Bundle.getInt(value);
        this.zzWV0.put(i, i);
    }

    private void zzXSF() {
        if (getDocument().getStyles().contains(0)) {
            return;
        }
        Style styleZzZ7 = getDocument().getStyles().zzZ7(0, true);
        styleZzZ7.zzZYh().remove(190);
        styleZzZ7.zzZYh().remove(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
    }

    private static com.aspose.words.internal.zzAA zzYJ(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzzop.zzH(4L);
        return new com.aspose.words.internal.zzKD(new com.aspose.words.internal.zzZOR(com.aspose.words.internal.zzZRV.zzZ(zzzop, 0, 1))).zzIf();
    }

    @Override // com.aspose.words.zzZBS
    public final boolean isEncrypted() {
        return false;
    }

    @Override // com.aspose.words.zzZBS
    public final com.aspose.words.internal.zzZOP zz1x() {
        return null;
    }

    @Override // com.aspose.words.zzYVB
    public final Comment zzFw(int i) {
        throw new IllegalStateException("Not supposed to call this.");
    }

    @Override // com.aspose.words.zzZBS
    public final void zzIh() throws Exception {
        zzSz("preserve".equals(this.zzZ7n.zzV("space", "")));
        zzXSF();
        while (this.zzZ7n.zzQ("wordDocument")) {
            switch (zzUR.zzTP(this.zzZ7n.getLocalName())) {
                case 0:
                    zzXSE();
                    break;
                case 1:
                    zzY1M.zzY(this);
                    break;
                case 2:
                    zzY1M.zzX(this);
                    break;
                case 3:
                    zzY1F.zzZ(this);
                    break;
                case 4:
                    Frameset frameset = new Frameset();
                    frameset.zzAu(2);
                    ((Document) getDocument()).zzZ(frameset);
                    zzYV4.zzZ(this, frameset, false);
                    break;
                case 5:
                    this.zzWUX.zzZ(this);
                    break;
                case 6:
                    this.zzWUY.zzZ(this);
                    zzY19.zzT(this);
                    break;
                case 7:
                    zzYUI.zzt(this);
                    break;
                case 8:
                    zzXSD();
                    break;
                case 9:
                    zzXSC();
                    break;
                case 10:
                    zzYUG.zzZ(this.zzZ7n, this.zzXUj);
                    break;
                case 11:
                    zzY2D.zzU(this);
                    break;
                case 12:
                    zzY1O.zzZ(this);
                    break;
                case 13:
                    zzY1T.zzY(this);
                    break;
                default:
                    this.zzZ7n.zzk();
                    break;
            }
        }
        zzYze();
        zzYzd();
        zzYzb();
        zzYza();
        zzYz2();
        getDocument().getLists().zzYOU();
        getDocument().getLists().zzYOV();
        zzYz1();
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzNM(String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        return (com.aspose.words.internal.zzZKN.zzS(str, "wordml://", i) || com.aspose.words.internal.zzZKN.zzS(str, "cms://", i)) ? false : true;
    }

    @Override // com.aspose.words.zzZ8W
    public final byte[] zzNO(String str) {
        return (byte[]) com.aspose.words.internal.zzQW.zzZ(this.zzWV4, str);
    }

    @Override // com.aspose.words.zzZ8W
    public final zzZBL zzNP(String str) {
        com.aspose.words.internal.zzAA zzaa = (com.aspose.words.internal.zzAA) com.aspose.words.internal.zzQW.zzZ(this.zzWV3, str);
        if (zzaa != null) {
            return new zzYOC(zzaa);
        }
        return null;
    }

    @Override // com.aspose.words.zzYVB
    public final void zzT(Comment comment) {
        throw new IllegalStateException("Not supposed to call this.");
    }

    @Override // com.aspose.words.zzYVB
    public final Footnote zzXR(int i, int i2) {
        throw new IllegalStateException("Not supposed to call this.");
    }

    public final Map<zzZ4J, String> zzXSA() {
        return this.zzWV2;
    }

    public final Map<ListLevel, String> zzXSz() {
        return this.zzWV1;
    }

    @Override // com.aspose.words.zzYVB, com.aspose.words.zzZ8W
    public final String zzY9(String str) {
        return str;
    }

    @Override // com.aspose.words.zzYVB
    public final boolean zzZmh() {
        return false;
    }

    @Override // com.aspose.words.zzYVB
    public final boolean zzZmj() {
        return (zzZmk() || this.zzZ7n.zzYyF()) ? false : true;
    }

    @Override // com.aspose.words.zzYVB
    public final boolean zzZmk() {
        return this.zzWV0.containsKey(this.zzZ7n.getNamespaceURI() + this.zzZ7n.getLocalName());
    }

    @Override // com.aspose.words.zzYVB, com.aspose.words.zzZ8W
    public final void zzZml() throws Exception {
        String strZzV = this.zzZ7n.zzV("name", "");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
            byte[] bArrZzX5 = com.aspose.words.internal.zzZYD.zzX5(this.zzZ7n.readString());
            switch (zzUR.zzTP(com.aspose.words.internal.zzZOQ.zzVe(strZzV).toLowerCase())) {
                case 17:
                case 18:
                    bArrZzX5 = zzY23.zzXC(bArrZzX5);
                    break;
                case 19:
                    bArrZzX5 = zzY23.zzXE(bArrZzX5);
                    break;
            }
            this.zzWV4.put(strZzV, zzY0(bArrZzX5));
        }
    }

    @Override // com.aspose.words.zzYVB
    public final boolean zzZmv() {
        return this.zzWUZ;
    }

    @Override // com.aspose.words.zzYVB, com.aspose.words.zzZ8W
    public final zzYU4 zzZsD() {
        return this.zzZ7n;
    }

    @Override // com.aspose.words.zzZ8W
    public final boolean zzs(ShapeBase shapeBase) throws Exception {
        while (this.zzZ7n.zzQ("textbox")) {
            if (zzUR.zzTP(this.zzZ7n.getLocalName()) != 20) {
                this.zzZ7n.zzk();
            } else {
                zzY11.zzXSx();
                zzQ(shapeBase);
            }
        }
        return false;
    }
}
