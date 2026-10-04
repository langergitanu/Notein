package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZSC {
    private zz6T zz5H;
    private int zz5I;
    private zzZSL zz5M;
    private zzP zz5N;
    private zz79 zz60;
    private zzZSB zz6n;
    private int zz6p = 1;
    private ArrayList<String> zz5L = new ArrayList<>();
    private ArrayList<String> zz6l = new ArrayList<>();
    private HashMap<String, String> zz5K = new HashMap<>();
    private long zz5J = 0;

    public zzZSC(zz79 zz79Var, zzZS7 zzzs7) throws Exception {
        this.zz60 = zz79Var;
        this.zz5M = new zzZSL(zz79Var, zzzs7.getJpegQuality(), zzzs7.zzI(), zzzs7.zzm3());
        zzZ(zzzs7);
        this.zz5H = new zz6T(zzzs7.zztw());
        zzmz();
    }

    private String zzY(String str, long j) throws Exception {
        if (this.zz6l.contains(str)) {
            return "";
        }
        String strZzW7 = this.zz5M.zzW7(str);
        this.zz6n.zzX(strZzW7, j);
        zzZQG.zzZ(this.zz5L, strZzW7);
        zzZQG.zzZ(this.zz6l, str);
        return strZzW7;
    }

    private void zzZ(zzP zzp, zz6S zz6s) {
        zzZS6 zzzs6 = (zzZS6) zz6s.zzwX();
        String strZzm2 = zzzs6 != null ? zzzs6.zzm2() : zzW(zz6s);
        String title = zzzs6 != null ? zzzs6.getTitle() : "";
        zzp.zzY("OutlineEntry");
        zzp.zzX("OutlineLevel", Integer.toString(zz6s.zzx0()));
        zzp.zzX("Description", title);
        zzp.zzX("OutlineTarget", zzZKN.format("../FixedDocument.fdoc#{0}", strZzm2));
        zzp.zzp();
        Iterator<zz6S> it = zz6s.zzwZ().iterator();
        while (it.hasNext()) {
            zzZ(zzp, it.next());
        }
    }

    private void zzm6() throws Exception {
        if (this.zz5H.zzx3().zzwZ().size() == 0) {
            return;
        }
        zz77 zz77Var = new zz77("/Documents/1/Structure/DocStructure.struct", "application/vnd.ms-package.xps-documentstructure+xml");
        this.zz60.zzxo().zzY(zz77Var);
        zzP zzp = new zzP(zz77Var.zzR1(), false);
        zzp.zzZ("DocumentStructure");
        zzp.zzX("xmlns", this.zz5M.zzmm().zzmj());
        zzp.zzY("DocumentStructure.Outline");
        zzp.zzY("DocumentOutline");
        zzp.zzX("xml:lang", "en-US");
        Iterator<zz6S> it = this.zz5H.zzx3().zzwZ().iterator();
        while (it.hasNext()) {
            zzZ(zzp, it.next());
        }
        zzp.zzp();
        zzp.zzp();
        zzp.endDocument();
        this.zz60.zzxo().zzY8("/Documents/1/FixedDocument.fdoc").zzxn().zzZ(this.zz5M.zzml().zzmj(), "/Documents/1/Structure/DocStructure.struct", false);
    }

    private void zzm7() throws Exception {
        this.zz5M.zzT(0, "Only built-in document properties will be output to XPS. All custom document properties will be lost");
        zz77 zz77Var = new zz77("/docProps/core.xml", "application/vnd.openxmlformats-package.core-properties+xml");
        this.zz60.zzxo().zzY(zz77Var);
        zz7B.zzZ(new zzP(zz77Var.zzR1(), false), this.zz5M.zzv9().getTitle(), this.zz5M.zzv9().getSubject(), this.zz5M.zzv9().zzQF(), this.zz5M.zzv9().getKeywords(), this.zz5M.zzv9().getDescription(), this.zz5M.zzv9().zzQE(), this.zz5M.zzv9().zzQD(), this.zz5M.zzv9().zzQC(), this.zz5M.zzv9().zzQB(), this.zz5M.zzv9().zzQA(), this.zz5M.zzv9().getCategory(), "", "", "");
        this.zz60.zzxn().zzZ(this.zz5M.zzml().zzme(), "/docProps/core.xml", false);
    }

    private void zzm8() throws Exception {
        zz77 zz77Var = new zz77("/FixedDocumentSequence.fdseq", "application/vnd.ms-package.xps-fixeddocumentsequence+xml");
        this.zz60.zzxo().zzY(zz77Var);
        zzP zzp = new zzP(zz77Var.zzR1(), false);
        zzp.zzZ("FixedDocumentSequence");
        zzp.zzX("xmlns", this.zz5M.zzmm().zzmh());
        zzp.zzY("DocumentReference");
        zzp.zzX("Source", "Documents/1/FixedDocument.fdoc");
        zzp.zzp();
        zzp.endDocument();
        this.zz60.zzxn().zzZ(this.zz5M.zzml().zzm9(), "/FixedDocumentSequence.fdseq", false);
        zzW(zz77Var);
    }

    private void zzmz() throws Exception {
        zz77 zz77Var = new zz77("/Documents/1/FixedDocument.fdoc", "application/vnd.ms-package.xps-fixeddocument+xml");
        this.zz60.zzxo().zzY(zz77Var);
        zzP zzp = new zzP(zz77Var.zzR1(), false);
        this.zz5N = zzp;
        zzp.zzZ("FixedDocument");
        this.zz5N.zzX("xmlns", this.zz5M.zzmm().zzmi());
        zzX(zz77Var);
    }

    public final void zzG3() {
        ArrayList<String> arrayList = this.zz5L;
        if (arrayList != null && arrayList.size() > 0) {
            this.zz5N.zzY("PageContent.LinkTargets");
            for (String str : this.zz5L) {
                this.zz5N.zzY("LinkTarget");
                this.zz5N.zzX("Name", str);
                this.zz5N.zzp();
            }
            this.zz5L.clear();
            this.zz5N.zzp();
        }
        this.zz5N.zzp();
        this.zz6n.zzG3();
        this.zz6p++;
    }

    public final void zzM(float f, float f2) throws Exception {
        this.zz5N.zzY("PageContent");
        this.zz5N.zzX("Source", zzZKN.format("Pages/{0}.fpage", Integer.valueOf(this.zz6p)));
        this.zz5M.zzRL(this.zz6p);
        zzZSL zzzsl = this.zz5M;
        zzZSB zzzsb = new zzZSB(zzzsl, new zzZS1(zzzsl.zzmq().zzR1()));
        this.zz6n = zzzsb;
        zzzsb.zzY(this.zz6p, f, f2);
    }

    public final void zzW(zzI zzi) throws Exception {
        String strZzY = zzY(zzi.getName(), zzi.zzZT());
        zzZS6 zzzs6 = new zzZS6(zzi.getDisplayName());
        zzzs6.zzW4(strZzY);
        this.zz5H.zzZ(zzi, zzzs6);
    }

    public final void zzX(zzZI zzzi) throws Exception {
        zzZS6 zzzs6 = new zzZS6(zzzi.getTitle());
        if (this.zz5H.zzZ(zzzi, zzzs6)) {
            int i = this.zz5I;
            this.zz5I = i + 1;
            zzzs6.zzW4(zzY(zzZKN.format("outline_{0}", Integer.valueOf(i)), zzzi.zzZT()));
        }
    }

    public final void zzYS(long j) throws Exception {
        if (this.zz6p == 1) {
            this.zz5J = j;
        }
        String str = zzZKN.format("{0}{1}", Float.valueOf(Float.intBitsToFloat((int) j)), Float.valueOf(zzZPW.zzYz(j)));
        String str2 = (String) zzQW.zzZ(this.zz5K, str);
        if (str2 == null) {
            str2 = zzZKN.format("/Documents/1/Metadata/Page{0}_PT.xml", Integer.valueOf(this.zz6p));
            this.zz5K.put(str, str2);
            zz77 zz77Var = new zz77(str2, "application/vnd.ms-printing.printticket+xml");
            this.zz60.zzxo().zzY(zz77Var);
            zzZS3.zzZ(new zzP(zz77Var.zzR1(), true), j, true);
        }
        this.zz5M.zzmq().zzxn().zzZ(this.zz5M.zzml().zzmc(), str2, false);
    }

    public final void zzmA() throws Exception {
        zz77 zz77VarZzY8 = this.zz60.zzxo().zzY8("/Documents/1/FixedDocument.fdoc");
        Iterator<Map.Entry<K, V>> it = this.zz5M.zzmo().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((zzJO) entry.getValue()).zzPl().zzpE()) {
                zz77VarZzY8.zzxn().zzZ(this.zz5M.zzml().zzma(), (String) entry.getKey(), false);
            }
        }
        this.zz5N.endDocument();
        zzm8();
        zzm7();
        zzm6();
        this.zz5M.zzmD();
        zz73.zzZ(this.zz60, false);
        zz7C.zzZ(this.zz60, false);
    }

    public final zzZSB zzmy() {
        return this.zz6n;
    }

    private void zzW(zz77 zz77Var) throws Exception {
        zz77 zz77Var2 = new zz77("/Metadata/Job_PT.xml", "application/vnd.ms-printing.printticket+xml");
        this.zz60.zzxo().zzY(zz77Var2);
        zzZS3.zzZ(new zzP(zz77Var2.zzR1(), true), this.zz5J, false);
        zz77Var.zzxn().zzZ(this.zz5M.zzml().zzmc(), zz77Var2.getName(), false);
    }

    private void zzX(zz77 zz77Var) throws Exception {
        zz77 zz77Var2 = new zz77("/Metadata/MXDC_Empty_PT.xml", "application/vnd.ms-printing.printticket+xml");
        this.zz60.zzxo().zzY(zz77Var2);
        zzZS3.zzZ(new zzP(zz77Var2.zzR1(), true));
        zz77Var.zzxn().zzZ(this.zz5M.zzml().zzmc(), zz77Var2.getName(), false);
    }

    private static String zzW(zz6S zz6s) {
        while (zz6s.zzwZ().size() != 0) {
            zz6s = zz6s.zzwZ().get(0);
            if (zz6s.zzwX() != null) {
                return ((zzZS6) zz6s.zzwX()).zzm2();
            }
        }
        return "";
    }

    public final void zzZ(zzQR zzqr) {
        this.zz5M.zzZ(zzqr);
    }

    private void zzZ(zzZS7 zzzs7) {
        this.zz5M.zzZ(zzzs7);
    }
}
