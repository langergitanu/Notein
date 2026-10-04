package com.aspose.words;

import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.ref.Ref;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18115b5;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGH extends zzZ1G {
    private static int[] zzYoi = {30, 40, 50};
    private zzYE2 zzYQL;
    private zzYLW zzYok;
    private int zzYol;
    private zzZH4 zzYon;
    private boolean zzYoo;
    private zzZI8 zzYqN;
    private zzZFE zzYrU;
    private zzZFR zzYrX;
    private zzYWQ zzYs1;
    private zzZET zzYsc;
    private HtmlSaveOptions zzYt2;
    private zzZAO zzYt4;
    private com.aspose.words.internal.zzZQC<zzZ> zzYom = new com.aspose.words.internal.zzZQC<>();
    private HashMap<zzZFK, String> zzYoj = new HashMap<>();

    public static class zzZ {
        private int zzYoQ;
        private int zzYog;
        private ListFormat zzYoh;
        private String zzZrW = "";

        public zzZ(ListFormat listFormat, int i) {
            this.zzYoh = listFormat;
            this.zzYog = i;
        }

        public final ListFormat getListFormat() {
            return this.zzYoh;
        }

        public final void zzKv(String str) {
            this.zzZrW = str;
        }

        public final int zzZ0C() {
            return this.zzYog;
        }

        public final boolean zzZ0D() {
            return com.aspose.words.internal.zzZKN.equals(this.zzZrW, "");
        }

        public final int zzZ1c() {
            return this.zzYoQ;
        }

        public final String zzZXw() {
            return this.zzZrW;
        }

        public final void zzzk(int i) {
            this.zzYoQ = i;
        }
    }

    public zzZGH(Document document, HtmlSaveOptions htmlSaveOptions, zzZH4 zzzh4, zzZAO zzzao, zzZFR zzzfr, zzYE2 zzye2, zzZFE zzzfe, zzZET zzzet, zzYWQ zzywq, zzYLW zzylw) throws Exception {
        this.zzYt2 = htmlSaveOptions;
        this.zzYon = zzzh4;
        this.zzYt4 = zzzao;
        this.zzYrX = zzzfr;
        this.zzYQL = zzye2;
        this.zzYrU = zzzfe;
        this.zzYsc = zzzet;
        this.zzYs1 = zzywq;
        this.zzYok = zzylw;
        this.zzYqN = zzo(document);
    }

    private void zzQ(double d, boolean z) {
        if (d <= 0.0d) {
            return;
        }
        double dZzR = com.aspose.words.internal.zzAN.zzR(d, 0.0d, 1584.0d);
        int i = (int) ((0.6857142857142857d * dZzR) + 0.5d);
        zzZE7 zzze7ZzZ3E = this.zzYt4.zzZ3E();
        zzze7ZzZ3E.zzZN("span", 0);
        zzLU zzlu = new zzLU();
        zzlu.zzW(new zzOI(7.0d, 4), new zzM2("Times New Roman"));
        zzlu.zzV(new zzM3("display", zzL4.zzZmu, (byte) 0));
        zzlu.zzV(new zzM3("width", new zzOI(dZzR, 4), (byte) 0));
        if (this.zzYt2.getExportRoundtripInformation() && (z || i > 1)) {
            zzlu.zzV(new zzM3("-aw-import", z ? zzL4.zzZkM : zzL4.zzZkL, (byte) 0));
        }
        zzze7ZzZ3E.zzH(zzlu.zzZWe());
        while (true) {
            i--;
            if (i <= 0) {
                zzze7ZzZ3E.writeString(" ");
                zzze7ZzZ3E.endElement("span");
                return;
            }
            zzze7ZzZ3E.zzY("&#xa0;", false);
        }
    }

    private void zzT(Paragraph paragraph, boolean z) throws Exception {
        zzZGI zzzgiZzU = zzZGI.zzU(paragraph, 1);
        Font fontZzZ0S = zzzgiZzU.zzZ0S();
        if (paragraph.zzYp5().zzYrV()) {
            this.zzYrU.zzZ(true, this.zzYt2.getExportRoundtripInformation(), paragraph.zzYp5().getInsertRevision().getAuthor(), paragraph.zzYp5().getInsertRevision().zzZx(), false);
            this.zzYrU.zzZ(fontZzZ0S, paragraph.zzYp5().getInsertRevision().getAuthor(), false);
        } else if (paragraph.zzZYj().zzYpg()) {
            this.zzYrU.zzZ(true, this.zzYt2.getExportRoundtripInformation(), paragraph.zzZYj().zzYsN().getAuthor(), paragraph.zzZYj().zzYsN().zzZx(), false);
            this.zzYrU.zzZ(fontZzZ0S, paragraph.zzZYj().zzYsN().getAuthor(), false);
        } else if (z) {
            this.zzYrU.zzZ(true, this.zzYt2.getExportRoundtripInformation(), "", com.aspose.words.internal.zzZQ9.zz35, true);
            this.zzYrU.zzZ(fontZzZ0S, "", true);
        }
        zzZ(paragraph, fontZzZ0S, zzzgiZzU.getLabelString());
        this.zzYrU.zzYZp();
    }

    private void zzU(Paragraph paragraph, boolean z) throws Exception {
        zzZGI zzzgiZzU = zzZGI.zzU(paragraph, 0);
        Font fontZzZ0S = zzzgiZzU.zzZ0S();
        if (paragraph.zzYp5().zzYrW()) {
            this.zzYrU.zzY(true, this.zzYt2.getExportRoundtripInformation(), paragraph.zzYp5().getDeleteRevision().getAuthor(), paragraph.zzYp5().getDeleteRevision().zzZx(), false);
            this.zzYrU.zzY(fontZzZ0S, paragraph.zzYp5().getDeleteRevision().getAuthor(), z);
        } else if (paragraph.zzZYj().zzYpg()) {
            this.zzYrU.zzY(true, this.zzYt2.getExportRoundtripInformation(), paragraph.zzZYj().zzYsN().getAuthor(), paragraph.zzZYj().zzYsN().zzZx(), false);
            this.zzYrU.zzY(fontZzZ0S, paragraph.zzZYj().zzYsN().getAuthor(), false);
        } else if (z) {
            this.zzYrU.zzY(true, this.zzYt2.getExportRoundtripInformation(), "", com.aspose.words.internal.zzZQ9.zz35, true);
            this.zzYrU.zzY(fontZzZ0S, "", true);
        }
        zzZ(paragraph, fontZzZ0S, zzzgiZzU.getLabelString());
        this.zzYrU.zzYZp();
    }

    private void zzV(Paragraph paragraph, zzYMX zzymx) throws Exception {
        zzZGI zzzgiZzZW = zzZGI.zzZW(paragraph);
        List list = zzzgiZzZW.getList();
        ListLevel listLevel = zzzgiZzZW.getListLevel();
        boolean z = false;
        if (zzO7.zzZ(listLevel)) {
            this.zzYt4.zzZ3E().zzZN("ul", 0);
        } else {
            this.zzYt4.zzZ3E().zzZN("ol", 0);
            int labelValue = zzzgiZzZW.getLabelValue();
            if (labelValue != 1 && !this.zzYt2.zzYZc()) {
                this.zzYt4.zzZ3E().zzX("start", Integer.toString(labelValue));
            }
        }
        if (!this.zzYt2.zzYZc() && !listLevel.zzYOb() && !this.zzYt2.zzYZ4()) {
            this.zzYt4.zzZ3E().zzX(C18437z2.f56754h, zzZGP.zzY(listLevel).zzZ1k());
        }
        zzZ zzz = new zzZ(paragraph.getListFormat(), zzymx.zzZ0C());
        this.zzYom.push(zzz);
        if (this.zzYqN.get(zzzgiZzZW.getList().getListId()) == 1) {
            zzLU zzlu = new zzLU();
            String strOooO00o = C22237OooO0o0.OooO00o("awlistcounter", com.aspose.words.internal.zzJB.zzWD(list.getListId()), C18115b5.CONNECTOR, com.aspose.words.internal.zzJB.zzWD(listLevel.zzYOa()));
            zzz.zzKv(strOooO00o);
            zzZFK zzzfk = new zzZFK();
            zzzfk.zzW(zzZI(strOooO00o, zzzgiZzZW.getLabelValue()));
            zzzfk.zzV(zzZ(zzzgiZzZW));
            Ref ref = new Ref(null);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(this.zzYoj, zzzfk, ref);
            String strZzKb = (String) ref.get();
            zzlu.zzY("counter-reset", zzzfk.zzYZO());
            zzlu.zzZs("list-style", "none");
            if (!zZzZ) {
                this.zzYol++;
                strZzKb = this.zzYsc.zzKb("awlist" + com.aspose.words.internal.zzJB.zzWD(this.zzYol));
                this.zzYoj.put(zzzfk, strZzKb);
                zzQG zzqgZzSh = zzMD.zzSh(strZzKb);
                this.zzYsc.zzY(new zzLT(zzqgZzSh, zzlu));
                zzLU zzlu2 = new zzLU();
                zzlu2.zzZs("counter-increment", strOooO00o);
                zzlu2.zzY(FirebaseAnalytics.Param.CONTENT, zzZ(zzzgiZzZW));
                this.zzYt4.zzZ3C().zzY(paragraph, zzlu2);
                this.zzYsc.zzY(new zzLT(zzMD.zzSg("li").zzZ(zzqgZzSh), zzlu2));
            }
            this.zzYt4.zzZ3E().zzX("class", strZzKb);
            z = true;
        }
        this.zzYt4.zzZ3C().zzQ(paragraph, !z);
    }

    private zzZ zzWW(int i, int i2) {
        for (zzZ zzz : this.zzYom) {
            if (i == zzz.getListFormat().getListId() && i2 == zzz.zzZ0C()) {
                return zzz;
            }
        }
        return null;
    }

    private int zzZ0E() {
        if (zzZ0G() != null) {
            return zzZ0G().getListFormat().getListId();
        }
        return -1;
    }

    private int zzZ0F() {
        if (zzZ0G() != null) {
            return zzZ0G().zzZ0C();
        }
        return -1;
    }

    private zzZ zzZ0G() {
        if (this.zzYom.size() > 0) {
            return this.zzYom.peek();
        }
        return null;
    }

    private void zzZ0H() {
        if (zzZ0G() == null || zzZ0G().zzZ1c() <= 0) {
            return;
        }
        this.zzYt4.zzZ3E().endElement("li");
        this.zzYt4.zzZ3C().zzYYP();
    }

    private void zzZ0I() {
        zzZ0F();
        zzZ0H();
        this.zzYt4.zzZ3E().zzp();
        this.zzYom.pop();
    }

    private static zzL2 zzZI(String str, int i) {
        zzL2 zzl2 = new zzL2();
        zzl2.zzI(new zzOT(str));
        if (i > 1) {
            zzl2.zzI(new zzNH(i - 1));
        }
        return zzl2;
    }

    private void zzZU(Paragraph paragraph) {
        zzQ(zzZGL.zzX(paragraph, zzZ0G().zzZ0D(), this.zzYt2.getPrettyFormat()).zzZ1a(), true);
    }

    private zzZI8 zzo(Document document) throws Exception {
        int exportListLabels = this.zzYt2.getExportListLabels();
        if (exportListLabels == 0) {
            return zzZIA.zzZ(document, this.zzYt2);
        }
        if (exportListLabels != 2) {
            return null;
        }
        return zzZI9.zzZ(document, this.zzYt2);
    }

    @Override // com.aspose.words.zzZ1G
    public final void zzZ(Paragraph paragraph, zzYMX zzymx, int i) throws Exception {
        if (zzymx.zzZ0C() - zzZ0F() <= 0) {
            while (zzZ0F() > zzymx.zzZ0C()) {
                zzZ0I();
            }
            if (zzymx.getListId() != zzZ0E()) {
                if (zzZ0E() != -1) {
                    zzZ0I();
                }
                zzV(paragraph, zzymx);
            }
        }
        if (zzymx.zzZ0C() - zzZ0F() > 0) {
            zzV(paragraph, zzymx);
        }
        zzZ0G();
        zzZ0H();
        this.zzYt4.zzZ3E().zzZN("li", 2);
        zzZ0G().zzzk(zzZ0G().zzZ1c() + 1);
        zzYWQ zzywq = this.zzYs1;
        if (zzywq != null) {
            zzywq.zzT(paragraph, zzymx);
        }
        this.zzYon.zzW(paragraph, zzymx);
        this.zzYt4.zzZ3C().zzZ(paragraph, zzymx, zzZ0G().zzZ0D(), this.zzYqN.get(zzZGI.zzZW(paragraph).getList().getListId()) == 1, i, this.zzYt2.getExportRoundtripInformation());
        zzZU(paragraph);
        this.zzYoo = false;
    }

    public final boolean zzZ0J() {
        return this.zzYoo;
    }

    @Override // com.aspose.words.zzZ1G
    public final void zzZ0K() {
        while (this.zzYom.size() > 0) {
            zzZ0I();
        }
    }

    @Override // com.aspose.words.zzZ1G
    public final void zzZ0L() {
    }

    @Override // com.aspose.words.zzZ1G
    public final boolean zzZV(Paragraph paragraph) {
        int exportListLabels = this.zzYt2.getExportListLabels();
        if (exportListLabels != 0) {
            return exportListLabels == 2;
        }
        return this.zzYqN.get(zzZGI.zzZW(paragraph).getList().getListId()) != 2;
    }

    @Override // com.aspose.words.zzZ1G
    public final void zzZ(Paragraph paragraph, zzYMX zzymx, int i, boolean z) throws Exception {
        double dZzZ19;
        boolean z2;
        this.zzYrX.zzY(paragraph, zzymx, i, z);
        this.zzYok.zzYye();
        boolean zZzZ0R = zzZGI.zzZW(paragraph).zzZ0R();
        if (this.zzYt2.getExportRoundtripInformation() && zZzZ0R) {
            this.zzYt4.zzZ3E().zzZN("span", 0);
            zzLU zzlu = new zzLU();
            zzlu.zzV(new zzM3("-aw-import", zzL4.zzZkM, (byte) 0));
            this.zzYt4.zzZ3E().zzH(zzlu.zzZWe());
        }
        boolean z3 = paragraph.zzYoX() && paragraph.zzZ0R() && !com.aspose.words.internal.zzZKN.equals(paragraph.getListLabel().zzYOt(), paragraph.getListLabel().zzYOu());
        if (z3 || (paragraph.zzZ0R() && !paragraph.zzYoX())) {
            zzU(paragraph, z3);
            zzZGL zzzglZzV = zzZGL.zzV(paragraph, 0);
            dZzZ1a = zzzglZzV.zzZ1a() > 0.0d ? zzzglZzV.zzZ1a() : 0.0d;
            dZzZ19 = zzzglZzV.zzZ19();
            z2 = true;
        } else {
            z2 = false;
            dZzZ19 = 0.0d;
        }
        if (z3 || (!paragraph.zzZ0R() && paragraph.zzYoX())) {
            zzT(paragraph, z3);
            dZzZ1a = Math.max(dZzZ1a, zzZGL.zzV(paragraph, 1).zzZ1a());
            z2 = true;
        }
        if (!z2) {
            if (paragraph.zzYoX()) {
                zzZGI zzzgiZzZW = zzZGI.zzZW(paragraph);
                zzZ(paragraph, zzzgiZzZW.zzZ0S(), zzzgiZzZW.getLabelString());
            }
            dZzZ1a = Math.max(dZzZ1a, zzZGL.zzV(paragraph, 1).zzZ1a());
        }
        if (z3) {
            dZzZ1a -= dZzZ19;
        }
        if (z) {
            zzQ(dZzZ1a, false);
        }
        if (this.zzYt2.getExportRoundtripInformation() && zZzZ0R) {
            this.zzYt4.zzZ3E().endElement("span");
        }
        this.zzYoo = true;
    }

    private zzL2 zzZ(zzZGI zzzgi) {
        String strZzZ1l;
        zzL2 zzl2 = new zzL2();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < zzzgi.getListLevel().getNumberFormat().length(); i2++) {
            char cCharAt = zzzgi.getListLevel().getNumberFormat().charAt(i2);
            if (ListLevel.zzYF(cCharAt)) {
                ListLevel listLevel = zzzgi.getList().getListLevels().get(cCharAt);
                boolean z = listLevel.getNumberStyle() == 255;
                zzZ zzzZzWW = zzWW(zzzgi.getList().getListId(), cCharAt);
                if (zzzZzWW != null) {
                    if (sb.length() > 0) {
                        zzl2.zzI(new zzM2(sb.toString()));
                        sb = new StringBuilder();
                    }
                    zzL2 zzl22 = new zzL2();
                    zzl22.zzI(new zzOT(zzzZzWW.zzZXw()));
                    if (!z) {
                        strZzZ1l = zzZGP.zzY(listLevel).zzZ1l();
                    } else {
                        strZzZ1l = "none";
                    }
                    if (!"decimal".equals(strZzZ1l)) {
                        zzl22.zzI(new zzQ8());
                        zzl22.zzI(new zzOT(strZzZ1l));
                    }
                    zzl2.zzI(new zzP1("counter", zzl22));
                } else if (!z) {
                    com.aspose.words.internal.zzZNH.zzU(sb, zzYTW.zzM(com.aspose.words.internal.zzZQB.zz2(zzzgi.zzZ0Q()[i]), listLevel.getNumberStyle(), true));
                }
                i++;
            } else {
                sb.append(cCharAt);
            }
        }
        if (sb.length() > 0) {
            zzl2.zzI(new zzM2(sb.toString()));
        }
        if (zzl2.getCount() == 0) {
            zzl2.zzI(new zzM2(""));
        }
        return zzl2;
    }

    private void zzZ(Paragraph paragraph, Font font, String str) throws Exception {
        font.setBidi(paragraph.getParagraphFormat().getBidi());
        zzZE7 zzze7ZzZ3E = this.zzYt4.zzZ3E();
        if (paragraph.zzZYj().getBidi()) {
            zzze7ZzZ3E.zzZN("span", 0);
            zzze7ZzZ3E.zzX("dir", "rtl");
        }
        if (this.zzYt2.getCssStyleSheetType() == 0) {
            this.zzYQL.zzZ(str, font);
        } else {
            zzYEF zzyefZzYp5 = paragraph.zzYp5();
            boolean z = zzyefZzYp5.zzZ7j() != 10 || zzyefZzYp5.zzD(zzYoi);
            if (z) {
                zzze7ZzZ3E.zzZN("span", 0);
                this.zzYt4.zzZ3C().zzZ(paragraph.getParagraphBreakFont(), 3, 4, (zzLU) null, this.zzYt4.zzZ3b());
            }
            this.zzYQL.zzZ(str, font);
            if (z) {
                zzze7ZzZ3E.endElement("span");
            }
        }
        if (paragraph.zzZYj().getBidi()) {
            zzze7ZzZ3E.endElement("span");
        }
    }
}
