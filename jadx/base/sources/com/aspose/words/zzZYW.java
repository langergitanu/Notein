package com.aspose.words;

import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.words.ref.RefBoolean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYW extends zzZ6T {
    private zzZC3 zzYRA;
    private zzZYV zzYRB;
    private int zzYRC;
    private zzZOR zzYRD;
    private boolean zzYRF;
    private boolean zzYRk;
    private boolean zzYRl;
    private boolean zzYRm;
    private boolean zzYRn;
    private HashMap<Footnote, zzYAD> zzYRo;
    private zzYVK zzYRq;
    private HashMap<FieldChar, zzYAU> zzYRu;
    private com.aspose.words.internal.zzZYG<zzYAU> zzYRv;
    private zzUH zzYRw;
    private zzZUB zzYRx;
    private zzZMQ zzYRy;
    private zzZ2C zzYRz;
    private zzX6 zzZEX;
    private Document zzZEY;
    private com.aspose.words.internal.zzIM<String> zzYRE = new com.aspose.words.internal.zzIM<>();
    private Map<FieldChar, zzZQI> zzYRt = new HashMap();
    private HashMap<zzYMD, ArrayList<zzUN>> zzYRs = new HashMap<>();
    private HashMap<zzYMD, ArrayList<zzUN>> zzYRr = new HashMap<>();
    private HashMap<Paragraph, ArrayList<String>> zzYRp = new HashMap<>();
    private com.aspose.words.internal.zzIM<zzZ6T> zzYRj = new com.aspose.words.internal.zzIM<>();

    public zzZYW(Document document) {
        this.zzZEY = document;
    }

    private void zzW(Collection<zzZ8Z> collection) throws Exception {
        if (collection.size() == 0) {
            return;
        }
        zzZ4N zzz4nZzYPe = zzZp0().zzY4s().zzYPe();
        zzz4nZzYPe.reset();
        for (zzZ8Z zzz8z : collection) {
            Paragraph paragraph = zzz8z.getParagraph();
            boolean z = false;
            zzYAU zzyau = null;
            while (true) {
                if (!zzz4nZzYPe.moveNext()) {
                    break;
                }
                zzYAU zzyau2 = (zzYAU) zzz4nZzYPe.zzYPi();
                if (zzY9R.zzmW(zzyau2.zzZo6()) && !zzY9R.zzmV(zzyau2.zzZo6())) {
                    zzYAS zzyas = (zzYAS) zzyau2;
                    if (zzyas.zzY67() == paragraph) {
                        z = true;
                        zzyau = zzyau2;
                    }
                    if (z && !zzyas.zzY6Z()) {
                        zzyas.zzY6S();
                        zzyas.zzY6S().zzYop().add((Integer) paragraph.fetchParaAttr(1280));
                        zzY(zzyas.zzY67(), zzz8z.getDocumentOutlineTitle());
                        break;
                    }
                }
            }
            if (zzyau != null) {
                zzz4nZzYPe.zzW(zzyau);
            }
        }
    }

    private void zzZV(ArrayList<zzZ6T> arrayList) {
        for (zzZ6T zzz6t : arrayList) {
            zzz6t.zzYTi();
            this.zzYRj.remove(zzz6t);
            zzz6t.zzZ(zzY0B.zzWTS);
        }
    }

    private void zzZoH() {
        zzY9C zzy9cZz4;
        if (this.zzYRl || (zzy9cZz4 = zz4(4, false)) == null || zzy9cZz4.zzY4s().isEmpty()) {
            return;
        }
        for (zzZ6T zzz6t = (zzUI) zzZoX().zzZXZ(); zzz6t != null; zzz6t = (zzYCT) zzz6t.zzYTp()) {
            zzUN zzun = (zzUN) zzz6t.zz6x();
            zzYN8 zzyn8 = (zzYN8) zzun.zzZZJ();
            zzYAQ zzyaqZzZZC = ((zzUI) zzz6t).zzZZC();
            zzYAQ zzyaqZzY65 = zzyaqZzZZC.zzY65();
            if (zzyn8 != null || !zzyaqZzZZC.zzY60() || (!zzyaqZzZZC.zza9().zzaa().zzZ4E() && zzyaqZzZZC.zza9().zzaa().getStoryType() != 5)) {
                zzYN8 zzyn8ZzZ8m = zzyaqZzY65 != null ? zzyaqZzY65.zzZ8m() : zzyn8;
                while (zzyn8ZzZ8m != null) {
                    HashMap<zzYMD, ArrayList<zzUN>> map = zzyn8ZzZ8m == zzyn8 ? this.zzYRs : this.zzYRr;
                    ArrayList arrayList = (ArrayList) com.aspose.words.internal.zzQW.zzZ(map, zzyn8ZzZ8m);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        com.aspose.words.internal.zzZQF.zzY(map, zzyn8ZzZ8m, arrayList);
                    }
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzUN>) arrayList, zzun);
                    if (zzyn8ZzZ8m == zzyn8) {
                        break;
                    } else {
                        zzyn8ZzZ8m = (zzYN8) zzyn8ZzZ8m.zzYo1();
                    }
                }
                if (!this.zzYRn && zzyaqZzZZC.zzY60()) {
                    this.zzYRn = true;
                }
                if (!this.zzYRm && !zzyaqZzZZC.zzY60()) {
                    this.zzYRm = true;
                }
            }
        }
        this.zzYRl = true;
    }

    private zzZC5 zzZoJ() {
        this.zzZEY.zzZqg();
        zz4I zz4i = new zz4I();
        zz4i.setDmlEffectsRenderingMode(this.zzZEY.zzZqg().zzYSP());
        zz4i.zzZ(new zzY21(this.zzZEY.getWarningCallback()));
        return zz4i;
    }

    private zzZC3 zzZoK() {
        return new zz34(this.zzZEY, zzZoJ());
    }

    private void zzZoT() {
        this.zzYRs = new HashMap<>();
        this.zzYRr = new HashMap<>();
        this.zzYRl = false;
    }

    public final IWarningCallback getWarningCallback() {
        Document document = this.zzZEY;
        if (document == null) {
            return null;
        }
        return document.getWarningCallback();
    }

    public final zzY9C zz4(int i, boolean z) {
        if (i == 1) {
            if (this.zzYRz == null && z) {
                this.zzYRz = new zzZ2C(this);
            }
            return this.zzYRz;
        }
        if (i == 2) {
            if (this.zzYRy == null && z) {
                this.zzYRy = new zzZMQ(this);
            }
            return this.zzYRy;
        }
        if (i == 3) {
            if (this.zzYRx == null && z) {
                this.zzYRx = new zzZUB(this);
            }
            return this.zzYRx;
        }
        if (i != 4) {
            return null;
        }
        if (this.zzYRw == null && z) {
            this.zzYRw = new zzUH(this);
        }
        return this.zzYRw;
    }

    @Override // com.aspose.words.zzZ6T
    public final int zz6y() {
        return 64;
    }

    public final boolean zzO3(String str) {
        if (this.zzYRE.contains(str)) {
            return true;
        }
        this.zzYRE.add(str);
        return false;
    }

    public final ArrayList<String> zzU(zzYMM zzymm) throws Exception {
        zzZoE();
        Paragraph paragraphZzY67 = ((zzYAS) zzymm.zzZ9r()).zzY67();
        paragraphZzY67.getDocument();
        ArrayList<String> arrayList = (ArrayList) com.aspose.words.internal.zzQW.zzZ(this.zzYRp, paragraphZzY67);
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public final void zzWx(boolean z) {
        this.zzYRF = z;
    }

    public final zzZQI zzX(Field field) {
        return (zzZQI) com.aspose.words.internal.zzQW.zzZ((Map<FieldStart, TValue>) this.zzYRt, field.getStart());
    }

    public final zzYAD zzY(Footnote footnote) {
        if (this.zzYRo == null) {
            this.zzYRo = new HashMap<>();
            if (zzZoZ() != null && !zzZoZ().zzY4s().isEmpty()) {
                zzZ((zzYCT) zzZoZ().zzZXZ());
            }
            if (zzZoY() != null && !zzZoY().zzY4s().isEmpty()) {
                zzZ((zzYCT) zzZoY().zzZXZ());
            }
        }
        return (zzYAD) com.aspose.words.internal.zzQW.zzZ(this.zzYRo, footnote);
    }

    @Override // com.aspose.words.zzYS
    public final void zzZ(Object obj, zzYZC zzyzc) {
        throw new IllegalStateException("DocumentLayout.SendAsync");
    }

    public final zzZC3 zzZCQ() {
        if (this.zzYRA == null) {
            this.zzYRA = zzZoK();
        }
        return this.zzYRA;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYAU zzZXV() {
        return zzZp0().zzZXV();
    }

    public final void zzZoE() throws Exception {
        if (this.zzYRk) {
            return;
        }
        this.zzYRk = true;
        Document document = this.zzZEY;
        ArrayList<zzZ8Z> arrayListZzV = zzY57.zzV(document, document.zzZqg().zzYTe().getCreateOutlinesForHeadingsInTables());
        ArrayList arrayList = new ArrayList();
        for (zzZ8Z zzz8z : arrayListZzV) {
            String documentOutlineTitle = zzz8z.getDocumentOutlineTitle();
            Paragraph paragraph = zzz8z.getParagraph();
            if (documentOutlineTitle != null && paragraph != null) {
                boolean zZzW = zzZ7R.zzW(paragraph.zzYp5(), 130);
                if (zzz8z.isInFieldCode() || zZzW) {
                    arrayList.add(zzz8z);
                } else {
                    zzY(paragraph, documentOutlineTitle);
                }
            }
        }
        zzW(arrayList);
    }

    public final boolean zzZoF() {
        zzZoH();
        return this.zzYRm;
    }

    public final boolean zzZoG() {
        zzZoH();
        return this.zzYRn;
    }

    public final int zzZoI() {
        return this.zzYRC;
    }

    public final zzYVK zzZoL() {
        if (this.zzYRq == null) {
            this.zzYRq = new zzYVK();
        }
        return this.zzYRq;
    }

    public final zzZOR zzZoM() {
        return this.zzYRD;
    }

    public final void zzZoN() throws Exception {
        zzYS.zzZ(this, 6);
        zzZoS().zzZoz().zzZp0().zzY4t();
        this.zzYRD = new zzZOR(this.zzZEY);
        zzZoS().zzY((zzYN8) null);
        zzZ(zzZoS());
        this.zzYRt.clear();
        zzYS.zzZ(this, 7);
        this.zzYRD = null;
    }

    public final com.aspose.words.internal.zzZYG<zzYAU> zzZoO() {
        if (this.zzYRv == null) {
            this.zzYRv = new com.aspose.words.internal.zzZYG<>(false);
        }
        return this.zzYRv;
    }

    public final zzX6 zzZoP() {
        if (this.zzZEX == null) {
            this.zzZEX = new zzX6();
        }
        return this.zzZEX;
    }

    public final boolean zzZoQ() {
        return this.zzYRF;
    }

    public final zzYN6 zzZoR() {
        return (zzYN6) zzZp0().zzZ4B();
    }

    public final zzZYV zzZoS() {
        if (this.zzYRB == null) {
            this.zzYRB = new zzZYV(this);
        }
        return this.zzYRB;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZoU() {
        zzZoT();
        super.zzZoU();
    }

    public final Map<zzYMD, ArrayList<zzUN>> zzZoV() {
        zzZoH();
        return this.zzYRr;
    }

    public final Map<zzYMD, ArrayList<zzUN>> zzZoW() {
        zzZoH();
        return this.zzYRs;
    }

    public final zzUH zzZoX() {
        return (zzUH) zz4(4, true);
    }

    public final zzZUB zzZoY() {
        return (zzZUB) zz4(3, true);
    }

    public final zzZMQ zzZoZ() {
        return (zzZMQ) zz4(2, true);
    }

    public final zzZ2C zzZp0() {
        return (zzZ2C) zz4(1, true);
    }

    public final Map<FieldChar, zzYAU> zzZqO() {
        if (this.zzYRu == null) {
            this.zzYRu = new HashMap<>();
        }
        return this.zzYRu;
    }

    public final zzZYZ zzZqy() {
        return this.zzZEY.zzZqy();
    }

    @Override // com.aspose.words.zzYS
    public final zzZ6R zza8() {
        return this.zzZEY.zzZqg();
    }

    @Override // com.aspose.words.zzZ6T, com.aspose.words.zzYS
    public final zzY9C zzaa() {
        return null;
    }

    @Override // com.aspose.words.zzYS
    public final zzZYW zzab() {
        return this;
    }

    @Override // com.aspose.words.zzYS
    public final void zzZ(zzZ6R zzz6r) {
        this.zzZEY.zzY(zzz6r);
    }

    public final void zzZ(Field field, zzZQI zzzqi) {
        this.zzYRt.put(field.getStart(), zzzqi);
    }

    public final void zzZ(Document document, zzZYV zzzyv) throws Exception {
        zzZYW zzzyw;
        Document document2;
        zzZYV zzzyv2;
        if (this.zzYRy != null) {
            zzZ(document, zzzyv, 0, 12, (char) 3);
            document2 = document;
            zzzyv2 = zzzyv;
            zzzyw = this;
            zzzyw.zzZ(document2, zzzyv2, 1, 13, (char) 4);
            zzzyw.zzZ(document2, zzzyv2, 2, 14, (char) 0);
        } else {
            zzzyw = this;
            document2 = document;
            zzzyv2 = zzzyv;
        }
        if (zzzyw.zzYRx != null) {
            zzzyw.zzZ(document2, zzzyv2, 3, 15, (char) 3);
            zzZ(document2, zzzyv2, 4, 16, (char) 4);
            zzZ(document2, zzzyv2, 5, 17, (char) 0);
        }
    }

    public static ArrayList<ArrayList<zzYAH>> zzY(zzY9C zzy9c) {
        ArrayList<ArrayList<zzYAH>> arrayList = new ArrayList<>();
        zzZ(arrayList, zzy9c);
        return arrayList;
    }

    public final void zzY(zzTC zztc) {
        zzYBL zzybl = (zzYBL) zzYJP.zzn(zztc).zzZZJ();
        if (zzybl.zz60() != 2) {
            return;
        }
        ArrayList<zzZ6T> arrayList = new ArrayList<>();
        zzY0B zzy0b = new zzY0B(zzybl);
        for (zzZ6T zzz6t : this.zzYRj) {
            if (zzz6t.zza9().zz6y() == 2 && (zzz6t == zztc.zza9() || !zzy0b.zzY(zzz6t.zzYTi()))) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzz6t);
            }
        }
        zzZV(arrayList);
    }

    private void zzZ(zzYCT zzyct) {
        while (zzyct != null) {
            zzYAD zzyad = (zzYAD) ((zzYVN) zzyct).zzYzk();
            this.zzYRo.put(zzyad.zzY5v(), zzyad);
            zzyct = (zzYCT) zzyct.zzYTp();
        }
    }

    private static void zzZ(zzZYV zzzyv) throws Exception {
        HashMap map = new HashMap();
        zzZYW zzzywZzZoz = zzzyv.zzZoz();
        zzZ2C zzz2cZzZp0 = zzzywZzZoz.zzZp0();
        int iZzv5 = zzz2cZzZp0.zzv5(1);
        zzZ(zzzyv, map);
        if (zzz2cZzZp0.zzv5(1) != iZzv5) {
            zzzywZzZoz.zzYRC = 1;
            zzZ(zzzyv, map);
        }
        zzz2cZzZp0.zzv5(2);
        zzzywZzZoz.zzYRC = 0;
    }

    private void zzY(Paragraph paragraph, String str) {
        ArrayList arrayList = (ArrayList) com.aspose.words.internal.zzQW.zzZ(this.zzYRp, paragraph);
        if (arrayList == null) {
            arrayList = new ArrayList();
            com.aspose.words.internal.zzZQF.zzY(this.zzYRp, paragraph, arrayList);
        }
        arrayList.add(str);
    }

    private static void zzZ(zzZYV zzzyv, Map<zzY9C, Boolean> map) throws Exception {
        zzZOR zzzor = zzzyv.zzZoz().zzYRD;
        zzYN8 zzyn8 = (zzYN8) zzzyv.zzZoz().zzZp0().zz6x();
        while (zzyn8 != null) {
            if (zzYN6.zzN(zzyn8)) {
                if (zzyn8.isEmpty()) {
                    zzYN8 zzyn82 = (zzYN8) zzyn8.zzYo1();
                    zzyn8.remove();
                    if (zzyn82 == null) {
                        return;
                    } else {
                        zzyn8 = zzyn82;
                    }
                }
                zzZKV.zzX(zzyn8, true);
                zzZKV.zzX(zzyn8, false);
                zzZ(zzyn8.zzYqq(), map, zzzor);
                zzZ(zzyn8.zzYqp(), map, zzzor);
                zzzyv.zzY(zzyn8);
            }
            zzyn8 = (zzYN8) zzyn8.zzYo1();
        }
    }

    public final void zzY(zzYS zzys, int i) throws Exception {
        if (this.zzZEY.zzZqg() == null || this.zzZEY.zzZqg().getCallback() == null) {
            return;
        }
        PageLayoutCallbackArgs pageLayoutCallbackArgs = new PageLayoutCallbackArgs(this.zzZEY, this, (zzYMD) com.aspose.words.internal.zzZKW.zzZ(zzys, zzYMD.class), i);
        if (!(zzys instanceof zzYN8)) {
            switch (pageLayoutCallbackArgs.getEvent()) {
            }
        }
        this.zzZEY.zzZqg().getCallback().notify(pageLayoutCallbackArgs);
    }

    private static void zzZ(zzYMD zzymd, Map<zzY9C, Boolean> map, zzZOR zzzor) throws Exception {
        if (zzymd == null) {
            return;
        }
        zzZKV zzzkvZzZ = zzZKW.zzZ((zzZ2D) zzymd.zzZ8m().zza9(), zzymd.zzaa().getStoryType(), false);
        RefBoolean refBoolean = new RefBoolean(false);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ((Map<zzZKV, Boolean>) map, zzzkvZzZ, refBoolean);
        boolean z = refBoolean.get();
        if (!zZzZ) {
            map.put(zzzkvZzZ, Boolean.valueOf(!zzZ(zzymd.zzaa(), zzzor)));
        } else {
            if (z) {
                return;
            }
            zzZ(zzymd.zzaa(), zzzor);
        }
    }

    private static boolean zzZ(zzY9C zzy9c, zzZOR zzzor) throws Exception {
        if (zzy9c != null && !zzy9c.zzZXX() && !zzy9c.zzY4s().isEmpty()) {
            ArrayList<ArrayList<zzYAH>> arrayListZzY = zzY(zzy9c);
            for (int i = 0; i < arrayListZzY.size(); i++) {
                ((zzYAH) C21505OooO0Oo.OooO00o(1, arrayListZzY.get(i))).zzY(zzzor);
            }
            if (arrayListZzY.size() > 0) {
                return true;
            }
        }
        return false;
    }

    private static void zzZ(ArrayList<ArrayList<zzYAH>> arrayList, zzY9C zzy9c) {
        zzZ4N zzz4nZzYPe = zzy9c.zzY4s().zzYPe();
        zzz4nZzYPe.reset();
        zzZQL zzzql = new zzZQL();
        ArrayList arrayList2 = null;
        int i = 0;
        while (zzz4nZzYPe.moveNext()) {
            zzYAU zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
            zzzql.zzB(zzyau);
            if ((zzyau instanceof zzY9X) && zzyau.isActive() && !zzzql.zzZew()) {
                zzYBY zzybyZzQJ = zzyau.zzQJ(false);
                if (zzybyZzQJ != null) {
                    zzZ(arrayList, zzybyZzQJ);
                }
            } else if (zzyau instanceof zzYAH) {
                zzYAH zzyah = (zzYAH) zzyau;
                int iZzZ1s = zzyah.zzZ1s();
                if (iZzZ1s != 2) {
                    if (iZzZ1s == 3 && i - 1 == 0 && !zzyah.zzY7w()) {
                        if (arrayList2.size() <= 0 || C21505OooO0Oo.OooO00o(1, arrayList2) != zzyah.zzY5C()) {
                            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYAH>) arrayList2, zzyah.zzY5C());
                        }
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<ArrayList>) arrayList, arrayList2);
                    }
                } else {
                    if (i == 0) {
                        arrayList2 = new ArrayList();
                    }
                    i++;
                    if (zzZOO.zzCN(zzyah.getFieldType())) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYAH>) arrayList2, zzyah);
                    }
                }
            }
        }
    }

    private void zzZ(Document document, zzZYV zzzyv, int i, int i2, char c) throws Exception {
        zzZMS zzzmsZzB1 = document.zzZpU().zzB1(i);
        if (zzzmsZzB1 == null) {
            if (i == 2 || i == 5) {
                return;
            } else {
                zzzmsZzB1 = zzZ(document, i, c);
            }
        }
        zzZMS zzzms = zzzmsZzB1;
        if (!zzzms.hasChildNodes()) {
            zzZ(document, zzzms);
        }
        zzzms.hasChildNodes();
        zzZoL().zzZ(this, i2);
        zzZYO zzzyo = new zzZYO(zzzms, this.zzZEY.zzZqg(), zzZoP(), zzZoO(), i2);
        while (zzzyo.moveNext()) {
            zzzyv.zzZ(zzzyo.zzZnU(), zzzyo.zz14());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzZ(zzYBL zzybl) {
        ArrayList<zzZ6T> arrayList = new ArrayList<>();
        zzY0B zzy0b = new zzY0B(zzybl);
        for (zzZ6T zzz6t : this.zzYRj) {
            int iZz6y = zzz6t.zz6y();
            if (iZz6y != 8) {
                if (iZz6y == 32 && zzybl.zza9() == zzz6t.zza9()) {
                    if (zzy0b.zzY(zzz6t.zzYTi())) {
                        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzz6t);
                    }
                }
            } else if (zzybl.zza9() == zzz6t.zza9().zza9()) {
                if (zzy0b.zzY(zzz6t.zzYTi())) {
                }
            }
        }
        if (arrayList.size() > 0) {
            zzZV(arrayList);
        }
    }

    public final void zzZ(zzZ6T zzz6t, zzY0B zzy0b, zzTF zztf) {
        zzz6t.zzZ(zzy0b);
        this.zzYRj.add(zzz6t);
    }

    private static zzZMS zzZ(Document document, int i, char c) {
        zzZMS zzzms = new zzZMS(document, i);
        zzZ(document, zzzms);
        ((Paragraph) zzzms.zzZYr()).appendChild(new SpecialChar(document, c, new zzYEF()));
        return zzzms;
    }

    private static void zzZ(Document document, zzZMS zzzms) {
        zzzms.hasChildNodes();
        Paragraph paragraph = new Paragraph(document, new zzYMX(), new zzYEF());
        paragraph.zzZYj().zzQ(1220, 0);
        zzzms.appendChild(paragraph);
    }
}
