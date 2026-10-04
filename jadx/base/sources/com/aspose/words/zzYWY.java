package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWY {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("html", "head", "body", NoteMeta.PROPERTY_TITLE, "style", "link", "br");
    private zzYX1 zzXWI;
    private zzYWZ zzXWJ;
    private zzZ zzXWK;
    private zzZHS zzYmS;
    private zzZYY zzYnb;
    private zzZJY zzYnt = new zzZJY(false, true);
    private zzZFF zzYpP;
    private zzZK3 zzYqv;
    private String zzZp0;
    private DocumentBuilder zzZwh;

    public final class zzZ {
        public ArrayList<zzN0> zzXWF;
        public ArrayList<zzLT> zzXWG;
        public zzZIR zzXWH;

        public zzZ() {
        }
    }

    public zzYWY(zzZFF zzzff) {
        this.zzYpP = zzzff;
    }

    private void zz7(zzZIG zzzig) throws Exception {
        zzZE5 zzze5 = new zzZE5(zzzig);
        while (zzze5.moveNext()) {
            if (zzze5.zzYXo() instanceof zzZIG) {
                zzZIG zzzig2 = (zzZIG) zzze5.zzYXo();
                boolean z = zzzig2 == zzzig;
                if (zzze5.zzZou()) {
                    if (!z) {
                        this.zzYnb.zzZ((zzZAS) zzzig2, true);
                    }
                    if (zzY(zzzig2, true) != 1) {
                        zzze5.zzYXp();
                        if (!z) {
                            this.zzYnb.zzZVt();
                        }
                    }
                } else {
                    zzY(zzzig2, false);
                    if (!z) {
                        this.zzYnb.zzZVt();
                    }
                }
            } else if (zzze5.zzYXo() instanceof zzZEC) {
                zzLa(((zzZEC) zzze5.zzYXo()).getText());
            }
        }
        this.zzYqv.zzZ4o();
    }

    private int zzI(zzZIG zzzig, boolean z) throws Exception {
        switch (zzUR.zzTP(zzzig.getName())) {
            case 6:
                if (z && this.zzYnb.zzZUy() == 0) {
                    zzYBt();
                }
                break;
        }
        return 1;
    }

    private void zzKn(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        zzYEF zzyefZzZpG = this.zzZwh.zzZpG();
        for (zzZHU zzzhu : this.zzYmS.zzX(str, this.zzZwh.getFont())) {
            this.zzYqv.zzZ(zzzhu.getText(), zzyefZzZpG, this.zzYnb.zzZUP(), false, null);
        }
    }

    private void zzLa(String str) throws Exception {
        String strZzo = zzZDY.zzo(str, zzYZE());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzo)) {
            this.zzXWJ.zzZ02();
            zzYBu();
            zzKn(strZzo);
        }
    }

    private int zzSJ(boolean z) throws Exception {
        if (z) {
            if (this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYnb.zzZUt()) && this.zzZwh.getCurrentParagraph().getCount() == 0) {
                this.zzYnt.zzVv(true);
            }
            this.zzYnb.zzZph();
            this.zzYqv.zzZ4o();
        } else {
            this.zzYnb.zzZpg();
            this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYqv);
        }
        return 1;
    }

    private int zzSK(boolean z) throws Exception {
        if (z) {
            if (this.zzXWI != null) {
                Section currentSection = this.zzZwh.getCurrentSection();
                this.zzYnb.zzX(currentSection);
                this.zzXWI.zzZ(this.zzYnb.zzZUh(), currentSection);
            }
            this.zzXWJ.zzZ01();
            this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYnb.zzZUt());
            zzYZz();
            this.zzYnt.zzVv(true);
        } else {
            this.zzXWJ.zzSL(this.zzYnb.zzZUv());
            this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYqv);
        }
        return 1;
    }

    private int zzV(zzZIG zzzig, boolean z) throws Exception {
        if (!zzYZL()) {
            return 0;
        }
        if ("div".equals(zzzig.getName())) {
            return zzSK(z);
        }
        zzVn(z);
        return 1;
    }

    private void zzVn(boolean z) throws Exception {
        if (!z) {
            this.zzXWJ.zzSL(this.zzYnb.zzZUv());
            this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYqv);
        } else {
            this.zzXWJ.zzZ01();
            boolean zZzZ = this.zzYnt.zzZ(this.zzYnb.zzZUw().zzZTQ(), this.zzYnb.zzZUC(), this.zzYnb.zzZUt());
            zzYZz();
            this.zzYnt.zzVv(zZzZ);
        }
    }

    private zzZ zzW(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        zzZIR zzzirZzZ = zzZIR.zzZ(zzzop, zzZIC.zzZ(zzzo0, zzzop), new zzZRE(), false, false);
        zzML zzmlZzZ = zztI(zzzirZzZ.getMode()).zzZ(this.zzZp0, this.zzYpP);
        zzmlZzZ.zzW(zzzirZzZ.zzZ31());
        zzZ zzz = new zzZ();
        zzz.zzXWH = zzzirZzZ;
        zzz.zzXWG = zzmlZzZ.zzZVv();
        zzz.zzXWF = zzmlZzZ.zzZVu();
        return zzz;
    }

    private void zzY(zzZ zzz) throws Exception {
        this.zzYnb = zzZ(zzz);
        zzZIG zzzigZzZ31 = zzz.zzXWH.zzZ31();
        this.zzYnb.zzZ((zzZAS) zzzigZzZ31, true);
        zz7(zzzigZzZ31);
        this.zzYnb.zzZVt();
    }

    private void zzYBt() throws Exception {
        this.zzYqv.isEmpty();
        this.zzXWJ.zzZ01();
        this.zzZwh.zz7(3, false);
        this.zzZwh.getCurrentSection().zzYvR().remove(2170);
        this.zzYnt.zzVv(false);
    }

    private void zzYBu() throws Exception {
        this.zzYnb.zzZ(this.zzZwh.getFont(), this.zzZwh.getCurrentParagraph().zzqy(0));
    }

    private boolean zzYZE() {
        if (!this.zzYqv.isEmpty()) {
            return this.zzYqv.zzZ4n();
        }
        if (this.zzYqv.isEmpty()) {
            return this.zzXWJ.zzYZR() || this.zzZwh.isAtStartOfParagraph();
        }
        return false;
    }

    private boolean zzYZL() {
        String strZzZTQ = this.zzYnb.zzZUw().zzZTQ();
        int iZzZUt = this.zzYnb.zzZUt();
        if (iZzZUt == 1 || iZzZUt == 3 || iZzZUt == 4 || iZzZUt == 7 || iZzZUt == 8 || iZzZUt == 11 || iZzZUt == 12 || iZzZUt == 14) {
            return true;
        }
        if (iZzZUt != 15) {
            return false;
        }
        return zzZIJ.zzKO(strZzZTQ);
    }

    private void zzYZz() throws Exception {
        this.zzYnb.zzL(this.zzZwh.getCurrentParagraph());
    }

    private static zzQH zztI(int i) {
        return new zzQH(zzL5.zzMd(i), 0, com.aspose.words.internal.zzPV.zzKa, true);
    }

    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, com.aspose.words.internal.zzZO0 zzzo0, Document document, com.aspose.words.internal.zzZO0 zzzo02) throws Exception {
        DocumentBuilder documentBuilder = new DocumentBuilder(document);
        this.zzZwh = documentBuilder;
        documentBuilder.getDocument().zzZqz().zzZ6Z();
        String baseUri = this.zzZwh.getDocument().getBaseUri();
        this.zzZp0 = baseUri;
        if (baseUri == null) {
            this.zzZp0 = "";
        }
        this.zzYqv = new zzZK3(this.zzZwh, false);
        this.zzYmS = new zzZHS(this.zzZwh.getDocument().zzZqy());
        zzZ zzzZzW = zzW(zzzop, zzzo0);
        this.zzXWK = zzzZzW;
        zzZYY zzzyyZzZ = zzZ(zzzZzW);
        this.zzYnb = zzzyyZzZ;
        zzzyyZzZ.zzZpi();
        zzZK3 zzzk3 = this.zzYqv;
        DocumentBuilder documentBuilder2 = this.zzZwh;
        this.zzXWJ = new zzYWZ(zzzk3, documentBuilder2, documentBuilder2.zzZpF(), this.zzYnt);
        this.zzYnt.zzT(this.zzZwh);
        zzYX1 zzyx1 = new zzYX1();
        this.zzXWI = zzyx1;
        zzY(this.zzXWK);
        this.zzXWI = null;
        zzZ(zzyx1, zzzo02);
    }

    private int zzY(zzZIG zzzig, boolean z) throws Exception {
        if (this.zzYnb.zzZUL()) {
            this.zzYqv.zzZ4o();
        }
        int iZzI = zzI(zzzig, z);
        if (iZzI != 0) {
            return iZzI;
        }
        int iZzV = zzV(zzzig, z);
        if (iZzV != 0) {
            return iZzV;
        }
        zzSJ(z);
        return 1;
    }

    private zzZYY zzZ(zzZ zzz) {
        zzQH zzqhZztI = zztI(zzz.zzXWH.getMode());
        return new zzZYY(this.zzZwh.getDocument(), zzqhZztI.zzZ(zzz.zzXWG, zzz.zzXWF, "", "", zzqhZztI.zzX(zzz.zzXWG), true, true), false);
    }

    private void zzZ(zzYX1 zzyx1, com.aspose.words.internal.zzZO0 zzzo0) throws Exception {
        zzyx1.zzh(this.zzZwh.getDocument());
        zzYX2[] zzyx2ArrZzYBw = zzyx1.zzYBw();
        if (zzyx2ArrZzYBw.length > 0) {
            zzZ(this.zzXWK, zzyx2ArrZzYBw);
        }
        for (String str : zzyx1.zzYBv()) {
            byte[] bArrZzZ3 = this.zzYpP.zzZ3(this.zzZp0, str);
            if (bArrZzZ3 != null) {
                com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArrZzZ3);
                try {
                    zzZ zzzZzW = zzW(zzzor, zzzo0);
                    zzzor.close();
                    zzZ(zzzZzW, zzyx1.zzHH(str));
                } catch (Throwable th) {
                    zzzor.close();
                    throw th;
                }
            }
        }
    }

    private void zzZ(zzZ zzz, zzYX2[] zzyx2Arr) throws Exception {
        for (zzYX2 zzyx2 : zzyx2Arr) {
            zzZ(zzz, zzyx2);
        }
    }

    private void zzZ(zzZ zzz, zzYX2 zzyx2) throws Exception {
        zzZIG zzzig;
        if (zzyx2.zzYBx().getHeadersFooters().getByHeaderFooterType(zzyx2.getType()) != null) {
            return;
        }
        if (zzyx2.isLinked()) {
            zzyx2.zzYBx().getHeadersFooters().add(new HeaderFooter(this.zzZwh.getDocument(), zzyx2.getType()));
            return;
        }
        this.zzYnb = zzZ(zzz);
        zzZE5 zzze5 = new zzZE5(zzz.zzXWH.zzZ31());
        while (true) {
            if (!zzze5.moveNext()) {
                zzzig = null;
                break;
            }
            zzzig = (zzZIG) com.aspose.words.internal.zzZKW.zzZ(zzze5.zzYXo(), zzZIG.class);
            if (zzzig != null) {
                if (zzze5.zzZou()) {
                    this.zzYnb.zzZ((zzZAS) zzzig, true);
                    if ("div".equals(zzzig.getName()) || "span".equals(zzzig.getName())) {
                        if (this.zzYnb.zzZUC().zzZy("mso-element", "header") || this.zzYnb.zzZUC().zzZy("mso-element", "footer")) {
                            if (com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZKN.zzU2(zzzig.zzZ2B().getAttributeValue("id", "")), zzyx2.zzYBy().getId())) {
                                break;
                            }
                        }
                    }
                } else {
                    this.zzYnb.zzZVt();
                }
            }
        }
        if (zzzig != null) {
            HeaderFooter headerFooter = new HeaderFooter(this.zzZwh.getDocument(), zzyx2.getType());
            headerFooter.appendChild(new Paragraph(this.zzZwh.getDocument()));
            zzyx2.zzYBx().getHeadersFooters().add(headerFooter);
            this.zzXWJ.zzZ5(headerFooter.getFirstParagraph());
            zz7(zzzig);
            this.zzYnb.zzZVt();
        }
    }
}
