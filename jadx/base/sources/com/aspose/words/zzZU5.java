package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZU5 implements zzZBR {
    private static com.aspose.words.internal.zzZNR zzYKH = new com.aspose.words.internal.zzZNR("[^-_a-zA-Z0-9 ]*", 0);
    private String zzYKG;
    private ArrayList<zzYWR> zzYKI;
    private boolean zzYKJ;
    private String zzYKN;
    private zzYQP zzYKO;
    private HtmlSaveOptions zzZE9;
    private zzYDZ zzZFZ;
    private ArrayList<zzY87> zzYKM = new ArrayList<>();
    private ArrayList<zzY87> zzYKL = new ArrayList<>();
    private com.aspose.words.internal.zzZYT<zzY87> zzYKK = new com.aspose.words.internal.zzZYT<>();

    private static void zzEp(int i) {
        if (i == 0) {
            throw new IllegalStateException("Thumbnail data is in unknown format.");
        }
        if (i != 9 && i != 5 && i != 6) {
            throw new UnsupportedOperationException("Only Gif, Jpeg and Png thumbnails are supported for ePub.");
        }
    }

    private void zzMz(String str) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            zzZI0 zzzi0 = new zzZI0(zzzor, this.zzZE9);
            zzzi0.zzZ("html");
            zzzi0.zzZN("head", 0);
            zzzi0.zzZ(NoteMeta.PROPERTY_TITLE, "Cover");
            zzzi0.zzZN("style", 0);
            zzzi0.zzX(C18437z2.f56754h, "text/css");
            zzzi0.writeString("body { text-align: center; padding:0pt; margin: 0pt; }");
            zzzi0.endElement("style");
            zzzi0.endElement("head");
            zzzi0.zzZN("body", 0);
            zzzi0.zzZN("img", 1);
            zzzi0.zzX("src", str);
            zzzi0.zzX("alt", "Cover Image");
            zzzi0.zzX("style", "height: 100%");
            zzzi0.endElement("img");
            zzzi0.endElement("body");
            zzzi0.endDocument();
            zzYM zzym = new zzYM(this.zzZE9.zzZ9Y(), this.zzZE9.zzYZ5(), "cover/cover-page.html", zzzor);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYM>) this.zzYKM, zzym);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYM>) this.zzYKL, zzym);
        } finally {
            zzzor.close();
        }
    }

    private void zzQ(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        if (zzzor != null) {
            zzYM zzym = new zzYM(this.zzZE9.zzZ9Y(), this.zzZE9.zzYZ5(), zzYQ.zzTp(this.zzYKN), zzzor);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYM>) this.zzYKM, zzym);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYM>) this.zzYKL, zzym);
        }
    }

    private void zzZN(ArrayList<zzY87> arrayList) {
        for (zzY87 zzy87 : arrayList) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYKM, zzy87);
            if ("application/xhtml+xml".equals(zzy87.getContentType())) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzYKL, zzy87);
            } else {
                this.zzYKK.zzB(zzy87.getUri(), zzy87);
            }
        }
    }

    private void zzZiW() throws Exception {
        for (zzY87 zzy87 : this.zzYKM) {
            this.zzYKO.zzYvp().zzZ(new zzYQO("OEBPS/" + zzy87.getUri(), zzy87.zz9P()));
        }
    }

    private void zzZiX() throws Exception {
        byte[] thumbnail = this.zzZFZ.zzYfy.getBuiltInDocumentProperties().getThumbnail();
        boolean zZzX = com.aspose.words.internal.zzZ1.zzX(thumbnail);
        this.zzYKJ = zZzX;
        if (zZzX) {
            int iZzZU = com.aspose.words.internal.zzEF.zzZU(thumbnail);
            zzEp(iZzZU);
            String strZzWX = com.aspose.words.internal.zzKE.zzWX(iZzZU);
            String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("cover-image.", strZzWX);
            zzZ(strOooO00o, strZzWX, thumbnail);
            zzMz(strOooO00o);
        }
    }

    private void zzZiY() throws Exception {
        HtmlSaveOptions htmlSaveOptionsZzYZe = ((HtmlSaveOptions) this.zzZFZ.zzXpa).zzYZe();
        this.zzZE9 = htmlSaveOptionsZzYZe;
        htmlSaveOptionsZzYZe.setExportXhtmlTransitional(true);
        this.zzZE9.setExportTextInputFormFieldAsText(true);
        this.zzZE9.zzKd("application/xhtml+xml");
        this.zzZE9.zzYZ8();
        this.zzZE9.zzYZb();
        this.zzZE9.setExportFontsAsBase64(false);
        int codePage = this.zzZE9.zzZ9Y().getCodePage();
        if (codePage != com.aspose.words.internal.zzZO0.zzhV().getCodePage() && codePage != com.aspose.words.internal.zzZO0.zzhU().getCodePage() && codePage != com.aspose.words.internal.zzZO0.zzhS().getCodePage()) {
            this.zzZE9.zzR(new com.aspose.words.internal.zzZNI(false));
        }
        com.aspose.words.internal.zzZOR zzzor = this.zzZE9.getDocumentSplitCriteria() == 0 ? new com.aspose.words.internal.zzZOR() : null;
        zzYWQ zzywq = new zzYWQ(this.zzZE9.getNavigationMapLevel());
        zzY86 zzy86 = new zzY86();
        zzYDZ zzydz = this.zzZFZ;
        zzZJ2 zzzj2 = new zzZJ2(zzydz.zzYfy, zzzor, null, this.zzZE9, zzydz, zzy86, zzywq);
        zzywq.zzZ(zzzj2);
        zzzj2.zzZ3I();
        zzZiX();
        zzZN(zzy86.zzyD());
        zzQ(zzzor);
        this.zzYKI = zzywq.zzYBq();
        zzZiW();
    }

    private void zzZiZ() throws Exception {
        zzYWP zzywp = new zzYWP(this.zzYKN, this.zzZFZ, this.zzYKI, this.zzYKG);
        zzywp.zzZY1();
        this.zzYKO.zzYvp().zzZ(zzywp.zza2());
    }

    private void zzZj0() throws Exception {
        zzYNO zzyno = new zzYNO(this.zzYKN, this.zzZFZ, this.zzYKL, this.zzYKK.zzl9(), this.zzYKJ, this.zzYKG);
        zzyno.zzZY1();
        this.zzYKO.zzYvp().zzZ(zzyno.zza2());
    }

    private void zzZj1() throws Exception {
        zzTH zzth = new zzTH(this.zzYKN, this.zzZFZ);
        zzth.zzZY1();
        this.zzYKO.zzYvp().zzZ(zzth.zza2());
    }

    private void zzZj2() throws Exception {
        String strZzZS = zzYKH.zzZS(com.aspose.words.internal.zzZKN.zzTX(this.zzZFZ.zzYfy.getBuiltInDocumentProperties().getTitle()), "");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZS)) {
            this.zzYKN = strZzZS;
        } else if (com.aspose.words.internal.zzZYD.zzXk(this.zzZFZ.getFileName())) {
            this.zzYKN = com.aspose.words.internal.zzZOQ.zzVg(this.zzZFZ.getFileName());
        } else {
            this.zzYKN = "document";
        }
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        this.zzZFZ = zzydz;
        zzydz.zzYdd();
        this.zzYKO = new zzYQP();
        this.zzYKG = "urn:uuid:" + com.aspose.words.internal.zzZZS.zzY(new Object[0]);
        zzZj2();
        zzZiY();
        zzZj1();
        zzZj0();
        zzZiZ();
        this.zzYKO.zzZ(this.zzZFZ.zzXpb, "application/epub+zip", null);
        return new SaveOutputParameters("application/epub+zip");
    }

    private void zzZ(String str, String str2, byte[] bArr) {
        String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("cover/", str);
        zzYM zzym = new zzYM(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("image/", str2), strOooO00o, bArr);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYM>) this.zzYKM, zzym);
        this.zzYKK.zzB(strOooO00o, zzym);
    }
}
