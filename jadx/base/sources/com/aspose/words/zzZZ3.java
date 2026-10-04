package com.aspose.words;

import com.orion.notein.domain.models.backup.BackupEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZ3 extends DocumentVisitor implements zzZBR {
    private zzYEF zzYTA;
    private zzZZH zzYTB;
    private zzZZH zzYTC;
    private zzY8D zzYTD;
    private zzYEA zzYTE;
    private zzY6E zzYTF;
    private zzYMU zzYTG;
    private zzYCX zzYTH;
    private zzYJD zzYTI;
    private com.aspose.words.internal.zzZOW zzYTJ;
    private com.aspose.words.internal.zzZOP zzYTK;
    private com.aspose.words.internal.zzZOW zzYTL;
    private com.aspose.words.internal.zzZOP zzYTM;
    private com.aspose.words.internal.zzZOW zzYTN;
    private com.aspose.words.internal.zzZOP zzYTO;
    private com.aspose.words.internal.zzZQC<zzZZ6> zzYTP = new com.aspose.words.internal.zzZQC<>();
    private Document zzYTQ;
    private zzYDW zzYTo;
    private int zzYTp;
    private zzZQC zzYTq;
    private boolean zzYTr;
    private zzYK7 zzYTs;
    private zzZZ2 zzYTt;
    private int zzYTy;
    private zzYBU zzYTz;
    private zzZOH zzYU6;
    private zzZO8 zzYU7;
    private zzZO8 zzYU8;
    private zzZO4 zzYUb;
    private zzZO4 zzYUc;
    private zzZOB zzYUd;
    private zzZO5 zzYUh;
    private zzZRA zzYUj;
    private zzYDZ zzZFZ;
    private com.aspose.words.internal.zzZWT zzmY;
    private static com.aspose.words.internal.zzZOZ zzYTx = new com.aspose.words.internal.zzZOZ("00020906-0000-0000-C000-000000000046");
    private static zzYE5 zzYTw = new zzYE5();
    static zzYE5 zzYTv = zzYE5.zzYdn();
    private static zzYMT zzYTu = new zzYMT();
    private static byte[] zzYTn = {-1, -1, 1, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, 1, 0, 0, 0, 0, 0, -1, -1, 0, 0, 2, 0, -1, -1, 0, 0, 0, 0, -1, -1, 0, 0, 2, 0, -1, -1, 0, 0, 0, 0};

    private IWarningCallback getWarningCallback() {
        return this.zzZFZ.zzYfy.getWarningCallback();
    }

    private boolean isEncrypted() {
        return com.aspose.words.internal.zzZYD.zzXk(zzZqQ().getPassword());
    }

    private void run() throws Exception {
        this.zzYTo = new zzYDW(this.zzZFZ.zzYfy, zzZqQ(), 262144);
        zzW(this.zzYTQ.zzZpU().zzB1(0));
        zzW(this.zzYTQ.zzZpU().zzB1(1));
        zzW(this.zzYTQ.zzZpU().zzB1(2));
        zzW(this.zzYTQ.zzZpU().zzB1(3));
        zzW(this.zzYTQ.zzZpU().zzB1(4));
        zzW(this.zzYTQ.zzZpU().zzB1(5));
        this.zzYTD.zzG4(0);
        for (Node firstChild = this.zzYTQ.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            zzY((Section) firstChild);
        }
        this.zzYTD.zzZqV();
        if (zzG5(0) | zzZqX() | zzZqW() | zzG5(1) | zzG6(5) | zzG6(6)) {
            zzZr8();
        }
        this.zzYTD.zzY1X();
        int iZzY1Q = this.zzYTD.zzY1Q();
        this.zzYUh.add(iZzY1Q);
        this.zzYU8.zzZ9Q().add(iZzY1Q);
        this.zzYU6.zzZaj().add(iZzY1Q);
        int length = this.zzYTD.zzkw(0).getLength() + 2;
        this.zzYU6.zzZah().add(length);
        this.zzYU6.zzZag().add(length);
        this.zzYU7.zzZ9Q().add(iZzY1Q);
        this.zzYUc.zzZ9N().add(iZzY1Q);
        this.zzYUc.zzZ9M().add(iZzY1Q);
        this.zzYUb.zzZ9N().add(this.zzYUd.zzsm());
        this.zzYUb.zzZ9M().add(iZzY1Q);
        zzYDW zzydw = this.zzYTo;
        if (zzydw != null) {
            zzydw.complete();
        }
    }

    private zzZO8 zzG3(int i) {
        if (i == 0) {
            return this.zzYU8;
        }
        if (i == 1) {
            return this.zzYU7;
        }
        throw new IllegalStateException("Unknown footnote type.");
    }

    private boolean zzG5(int i) throws Exception {
        return zzZ(i == 0 ? 1 : 4, zzG3(i).zzZ9P(), (zzZ8R) null);
    }

    private boolean zzG6(int i) throws Exception {
        if (this.zzYTD.zzkw(i).getLength() <= 0) {
            return false;
        }
        zzZO4 zzzo4ZzGf = zzGf(i);
        zzY4U zzy4u = new zzY4U();
        zzy4u.zzYuX = -1;
        zzzo4ZzGf.zzZ9M().zzX(this.zzYTD.zzkw(i).getLength(), zzy4u);
        zzYK zzyk = new zzYK();
        zzyk.zzZD7 = 65535;
        zzZ(i, zzzo4ZzGf.zzZ9L(), zzyk);
        return true;
    }

    private zzZO4 zzGf(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 6) {
                        throw new IllegalStateException("Unexpected subdocument type.");
                    }
                }
            }
            return this.zzYUb;
        }
        return this.zzYUc;
    }

    private String zzM(Paragraph paragraph) {
        if (paragraph.isEndOfCell()) {
            return this.zzYTD.zzY1Y() > 1 ? ControlChar.PARAGRAPH_BREAK : ControlChar.CELL;
        }
        if (paragraph.isEndOfSection() && !paragraph.getParentSection().zzYB3()) {
            return ControlChar.SECTION_BREAK;
        }
        return ControlChar.PARAGRAPH_BREAK;
    }

    private static String zzOc(String str) {
        return str.length() > 255 ? "" : str;
    }

    private void zzT(int i, String str) {
        if (getWarningCallback() != null) {
            OooO00o.OooO0O0(getWarningCallback(), i, 10, str);
        }
    }

    private void zzW(CompositeNode compositeNode) throws Exception {
        this.zzYTD.zzG4(2);
        this.zzYUd.zzX(this.zzYTD.zzY1R(), null);
        if (compositeNode != null) {
            for (Node firstChild = compositeNode.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                firstChild.accept(this);
            }
            if (compositeNode.hasChildNodes()) {
                new Paragraph(this.zzYTQ).accept(this);
            }
        }
        this.zzYTD.zzZqV();
    }

    private void zzX(BookmarkEnd bookmarkEnd) {
        if (this.zzYTp <= 16380) {
            this.zzYTD.zzAC(bookmarkEnd.getName());
        }
    }

    private void zzY(Section section) throws Exception {
        zzYCQ zzycq = new zzYCQ();
        zzycq.zzXnH = this.zzYTH.zzS(section.zzYvR());
        this.zzYUh.zzX(this.zzYTD.zzY1R(), zzycq);
        section.getBody().accept(this);
        zzW(section.getHeadersFooters().getByHeaderFooterType(0));
        zzW(section.getHeadersFooters().getByHeaderFooterType(1));
        zzW(section.getHeadersFooters().getByHeaderFooterType(2));
        zzW(section.getHeadersFooters().getByHeaderFooterType(3));
        zzW(section.getHeadersFooters().getByHeaderFooterType(4));
        zzW(section.getHeadersFooters().getByHeaderFooterType(5));
    }

    private Map<Node, Field> zzZqO() {
        if (this.zzYTq == null) {
            zzZQC zzzqc = new zzZQC(23);
            this.zzYTq = zzzqc;
            zzzqc.zzZQ(this.zzYTQ);
        }
        return this.zzYTq.zzZqO();
    }

    private DocSaveOptions zzZqQ() {
        return (DocSaveOptions) this.zzZFZ.zzXpa;
    }

    private zzZZ6 zzZqR() {
        if (this.zzYTP.size() > 0) {
            return this.zzYTP.peek();
        }
        return null;
    }

    private boolean zzZqW() throws Exception {
        return zzZ(3, this.zzYU6.zzZai(), (zzZ8R) null);
    }

    private boolean zzZqX() throws Exception {
        return zzZ(2, this.zzYUd, (zzZ8R) null);
    }

    private void zzZqY() throws Exception {
        zzXD zzxd = new zzXD();
        Iterator<zzY8E> it = this.zzYTD.iterator();
        zzXF zzxf = null;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzZO6 zzzo6ZzZrl = it.next().zzZrl();
            int i3 = 0;
            while (i3 < zzzo6ZzZrl.getItemCount()) {
                int iZzTe = zzzo6ZzZrl.zzTe(i3);
                int i4 = i3 + 1;
                int iZzTe2 = zzzo6ZzZrl.zzTe(i4);
                zzXF zzxf2 = zzzo6ZzZrl.get(i3);
                if (zzxf == null) {
                    zzxf = zzxf2;
                    i = iZzTe;
                } else if (!zzxf.zzZ(zzxf2)) {
                    zzxd.zzY(i, i2, zzxf);
                    zzxf = zzxf2;
                    i = iZzTe;
                } else if (i2 != iZzTe) {
                    throw new IllegalStateException("Found a gap between file runs.");
                }
                i3 = i4;
                i2 = iZzTe2;
            }
        }
        if (zzxf != null) {
            zzxd.zzY(i, i2, zzxf);
        }
        this.zzYTC = zzxd.zzZo(this.zzYTO);
    }

    private void zzZqZ() throws Exception {
        zzYNH zzynh = new zzYNH();
        Iterator<zzY8E> it = this.zzYTD.iterator();
        while (it.hasNext()) {
            zzZO7 zzzo7ZzZrm = it.next().zzZrm();
            int i = 0;
            while (i < zzzo7ZzZrm.getItemCount()) {
                zzYNJ zzynjZzZ = zzzo7ZzZrm.get(i);
                if (zzYNJ.zzY(zzynjZzZ)) {
                    zzynjZzZ = zzYNJ.zzZ(this.zzYTK, zzynjZzZ);
                }
                int iZzTe = zzzo7ZzZrm.zzTe(i);
                i++;
                zzynh.zzY(iZzTe, zzzo7ZzZrm.zzTe(i), zzynjZzZ);
            }
        }
        this.zzYTB = zzynh.zzZo(this.zzYTO);
    }

    private int zzZr0() throws Exception {
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(""));
        zzZZF zzzzfZzZpV = this.zzYTQ.zzZpV();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(zzzzfZzZpV.zzYWn));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(this.zzYTQ.getBuiltInDocumentProperties().getTitle()));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(this.zzYTQ.getBuiltInDocumentProperties().getSubject()));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(this.zzYTQ.getBuiltInDocumentProperties().getKeywords()));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(""));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(this.zzYTQ.getBuiltInDocumentProperties().getAuthor()));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(this.zzYTQ.getBuiltInDocumentProperties().getLastSavedBy()));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(zzzzfZzZpV.zzYWd.getDataSource()));
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(zzzzfZzZpV.zzYWd.getHeaderSource()));
        for (int i = 0; i < 7; i++) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(""));
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzOc(zzzzfZzZpV.zzYW5.getPassword()));
        arrayList.size();
        return zzY91.zzZ(this.zzYTL, (ArrayList<String>) arrayList);
    }

    private int zzZr1() throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzYTQ.zzZpV().zzYVo)) {
            return 0;
        }
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhU().getBytes(this.zzYTQ.zzZpV().zzYVo);
        this.zzYTL.writeBytes(bytes);
        return bytes.length;
    }

    private void zzZr2() throws Exception {
        if (this.zzYTQ.zzZpV().zzYVj.getCount() == 0) {
            return;
        }
        this.zzYUj.zzYGC.zzXyP.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGC.zzXyP.zzYHJ = (this.zzYTQ.zzZpV().zzYVj.getCount() * 4) + 24;
        this.zzYTL.zzl(this.zzYTQ.zzZpV().zzYVj.getCount());
        this.zzYTL.zzl(4);
        this.zzYTL.zzl(8);
        this.zzYTL.zzl(229);
        this.zzYTL.zzl(0);
        this.zzYTL.zzl(0);
        for (int i = 0; i < this.zzYTQ.zzZpV().zzYVj.getCount(); i++) {
            this.zzYTL.zzl(this.zzYTQ.zzZpV().zzYVj.get(i));
        }
    }

    private void zzZr3() throws Exception {
        if (isEncrypted()) {
            zzYK7 zzyk7 = new zzYK7();
            this.zzYTs = zzyk7;
            zzyk7.zzT(this.zzYTL, zzZqQ().getPassword());
        }
        this.zzYUj.zzYGE.zzXAE.zzYHK = (int) this.zzYTM.getPosition();
        zzYJ2 zzyj2 = this.zzYUj.zzYGE;
        zzyj2.zzXAF.zzYHK = zzyj2.zzXAE.zzYHK;
        this.zzYUj.zzYGE.zzXAE.zzYHJ = new zzY8G(this.zzYTt, this.zzYTQ.getStyles()).zzV(this.zzYTL);
        zzYJ2 zzyj22 = this.zzYUj.zzYGE;
        zzyj22.zzXAF.zzYHJ = zzyj22.zzXAE.zzYHJ;
        zzyj22.zzXAz.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXAz.zzYHJ = this.zzYUh.zzV(this.zzYTL);
        this.zzYUj.zzYGE.zzpo((int) this.zzYTM.getPosition());
        this.zzYUj.zzYGE.zzXAu.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXAu.zzYHJ = this.zzYUd.zzV(this.zzYTL);
        this.zzYUj.zzYGE.zzXAt.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXAt.zzYHJ = this.zzYTC.zzV(this.zzYTL);
        this.zzYUj.zzYGE.zzXAs.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXAs.zzYHJ = this.zzYTB.zzV(this.zzYTL);
        this.zzYU8.zzZ(this.zzYUj, this.zzYTL);
        this.zzYU7.zzZ(this.zzYUj, this.zzYTL);
        this.zzYU6.zzZ(this.zzYUj, this.zzYTL);
        this.zzYUj.zzYGE.zzXAp.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXAp.zzYHJ = this.zzYTD.zzkw(0).zzY24().zzV(this.zzYTL);
        this.zzYUj.zzYGE.zzXAo.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXAo.zzYHJ = this.zzYTD.zzkw(2).zzY24().zzV(this.zzYTL);
        this.zzYUj.zzYGE.zzXAn.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXAn.zzYHJ = this.zzYTD.zzkw(1).zzY24().zzV(this.zzYTL);
        this.zzYUj.zzYGE.zzXAm.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXAm.zzYHJ = this.zzYTD.zzkw(3).zzY24().zzV(this.zzYTL);
        this.zzYUj.zzYGE.zzXzT.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXzT.zzYHJ = this.zzYTD.zzkw(4).zzY24().zzV(this.zzYTL);
        this.zzYUj.zzYGE.zzXzK.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXzK.zzYHJ = this.zzYTD.zzkw(5).zzY24().zzV(this.zzYTL);
        this.zzYUj.zzYGE.zzXzI.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXzI.zzYHJ = this.zzYTD.zzkw(6).zzY24().zzV(this.zzYTL);
        this.zzYUj.zzYGE.zzXzR.zzYHK = (int) this.zzYTM.getPosition();
        zzZRA zzzra = this.zzYUj;
        zzzra.zzYGE.zzXzR.zzYHJ = this.zzYTz.zzY8t().zzZ(this.zzYTL, this.zzYTN, zzzra.zzYGW > 0, zzZqQ());
        this.zzYUc.zzZ(this.zzYUj, this.zzYTL);
        this.zzYUb.zzZ(this.zzYUj, this.zzYTL);
        this.zzYTD.zzY23().zzZ(this.zzYUj, this.zzYTL, this.zzYTD.zzY1Q());
        this.zzYTD.zzY21().zzZ(this.zzYUj, this.zzYTL);
        this.zzYTD.zzY22().zzZ(this.zzYUj, this.zzYTL, this.zzYTD.zzY1Q());
        if (this.zzYTQ.zzZqH() != null) {
            this.zzYUj.zzYGE.zzXzW.zzYHK = (int) this.zzYTM.getPosition();
            this.zzYTL.writeBytes(this.zzYTQ.zzZqH());
            this.zzYUj.zzYGE.zzXzW.zzYHJ = this.zzYTQ.zzZqH().length;
        }
        if (this.zzYTQ.zzZqF() != null) {
            this.zzYUj.zzYGD.zzXz5.zzYHK = (int) this.zzYTM.getPosition();
            this.zzYTL.writeBytes(this.zzYTQ.zzZqF());
            this.zzYUj.zzYGD.zzXz5.zzYHJ = this.zzYTQ.zzZqF().length;
        }
        new zzZ42(this.zzYTt, this.zzYTQ.getLists()).zzZ(this.zzYUj, this.zzYTL);
        zzZW0.zzZ(this.zzYUj, this.zzYTL, this.zzYTQ.getLists(), this.zzYTQ.getFrameset());
        zzZZI.zzZ(this.zzYUj, this.zzYTL, this.zzYTQ.zzZq2());
        if (this.zzYTQ.zzZqw() != null && zzZqQ().getSaveRoutingSlip()) {
            this.zzYUj.zzYGE.zzXzx.zzYHK = (int) this.zzYTM.getPosition();
            this.zzYUj.zzYGE.zzXzx.zzYHJ = this.zzYTQ.zzZqw().zzV(this.zzYTL, this.zzYTQ.zzZpV().zzYVi);
        }
        zzY66 zzy66 = new zzY66();
        this.zzYUj.zzYGE.zzXAh.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXAh.zzYHJ = zzy66.zzZ(this.zzYTQ, this.zzYTL);
        this.zzYUj.zzYGE.zzXzH.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXzH.zzYHJ = zzY3O.zzZ(this.zzYTQ, this.zzYTL);
        this.zzYUj.zzYGD.zzpo((int) this.zzYTM.getPosition());
        zzU0 zzu0 = new zzU0();
        zzu0.zzZ(new zzTZ(0, this.zzYTD.zzY1Q(), 2048, true));
        this.zzYUj.zzYGE.zzXA8.zzYHK = (int) this.zzYTM.getPosition();
        zzu0.zzZ(this.zzYTL);
        zzZRG zzzrg = this.zzYUj.zzYGE.zzXA8;
        int position = (int) this.zzYTM.getPosition();
        zzZRA zzzra2 = this.zzYUj;
        zzzrg.zzYHJ = position - zzzra2.zzYGE.zzXA8.zzYHK;
        zzzra2.zzYHv = false;
        zzzra2.zzYHt = 15;
        zzZN4.zzZ(this.zzYTt.zzYUq, zzzra2, this.zzYTL, this.zzYTN);
        this.zzYUj.zzYGE.zzXAa.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXAa.zzYHJ = zzZZE.zzZ(this.zzYTQ, this.zzYTL, getWarningCallback());
        this.zzYUj.zzYGB.zzXyo.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGB.zzXyo.zzYHJ = zzZr1();
        this.zzYUj.zzYGE.zzXA9.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXA9.zzYHJ = zzZr0();
        this.zzYUj.zzYGE.zzXzQ.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXzQ.zzYHJ = this.zzYTI.zzV(this.zzYTL);
        zzY92 zzy92 = new zzY92();
        new zzZ2I().zzZ(this.zzYTQ.zzZpV().zzYWd, this.zzYUj, zzy92, this.zzYTL);
        this.zzYTD.zzY20().zzZ(this.zzYUj, zzy92, this.zzYTL);
        this.zzYUj.zzYGE.zzXzv.zzYHK = (int) this.zzYTM.getPosition();
        this.zzYUj.zzYGE.zzXzv.zzYHJ = zzy92.zzX(this.zzYTL, false);
        this.zzYUj.zzYGD.zzXz8.zzYHK = (int) this.zzYTM.getPosition();
        zzZRG zzzrg2 = this.zzYUj.zzYGD.zzXz8;
        byte[] bArr = zzYTn;
        zzzrg2.zzYHJ = bArr.length;
        this.zzYTL.writeBytes(bArr);
        zzZr2();
    }

    private void zzZr4() throws Exception {
        this.zzYUj.zzYHa = 2048;
        this.zzYTO.zzU(2048L, 0);
        this.zzYUj.zzYGY = this.zzYTD.zzkw(0).zzV(this.zzYTN);
        this.zzYUj.zzYGX = this.zzYTD.zzkw(1).zzV(this.zzYTN);
        this.zzYUj.zzYGW = this.zzYTD.zzkw(2).zzV(this.zzYTN);
        this.zzYUj.zzYGU = this.zzYTD.zzkw(3).zzV(this.zzYTN);
        this.zzYUj.zzYGT = this.zzYTD.zzkw(4).zzV(this.zzYTN);
        this.zzYUj.zzYGS = this.zzYTD.zzkw(5).zzV(this.zzYTN);
        this.zzYUj.zzYGR = this.zzYTD.zzkw(6).zzV(this.zzYTN);
        zzZRA zzzra = this.zzYUj;
        if (zzzra.zzYGX > 0 || zzzra.zzYGW > 0 || zzzra.zzYGU > 0 || zzzra.zzYGT > 0 || zzzra.zzYGS > 0 || zzzra.zzYGR > 0) {
            zzzra.zzYGR--;
        }
        zzzra.zzYH9 = (int) this.zzYTO.getPosition();
    }

    private boolean zzZr5() {
        return this.zzYTD.zzZqT() == 2 && this.zzZFZ.zzXp5;
    }

    private zzYNJ zzZr6() throws Exception {
        zzYMT zzymt = new zzYMT();
        zzymt.zzXGL = this.zzYTD.zzY1Y();
        if (this.zzYTD.zzY1Y() > 1) {
            zzymt.zzXGM = true;
            zzymt.zzXGN = true;
        } else {
            zzymt.zzXGO = true;
        }
        return this.zzYTG.zzZ(new zzYMX(), zzymt, false);
    }

    private void zzZr7() throws Exception {
        zzY(new BookmarkStart(this.zzYTQ, "_PictureBullets"));
        for (int i = 0; i < this.zzYTQ.getLists().zzYP0(); i++) {
            Shape shapeZzxn = this.zzYTQ.getLists().zzxn(i);
            shapeZzxn.getFont().setHidden(true);
            shapeZzxn.accept(this);
        }
        zzX(new BookmarkEnd(this.zzYTQ, "_PictureBullets"));
    }

    private void zzZr8() throws Exception {
        this.zzYTD.zzG4(6);
        Paragraph lastParagraph = this.zzYTQ.getLastSection().getBody().getLastParagraph();
        new Paragraph(this.zzYTQ, lastParagraph.zzZYj(), lastParagraph.zzYp5()).accept(this);
        this.zzYTD.zzZqV();
    }

    private com.aspose.words.internal.zzKD zzZr9() throws Exception {
        zzZZF zzzzfZzZpV = this.zzYTQ.zzZpV();
        int saveFormat = this.zzZFZ.zzXpa.getSaveFormat();
        if (saveFormat == 10) {
            this.zzYUj.zzYHx = false;
        } else {
            if (saveFormat != 11) {
                throw new IllegalStateException("Unexpected save format.");
            }
            this.zzYUj.zzYHx = true;
        }
        this.zzYUj.zzYHq = zzzzfZzZpV.zzYW5.getReadOnlyRecommended();
        this.zzYUj.zzYHp = com.aspose.words.internal.zzZYD.zzXk(zzzzfZzZpV.zzYW5.getPassword());
        zzZRA zzzra = this.zzYUj;
        zzzra.zzYHu = true;
        zzzra.zz0(this.zzYTO);
        zzZr4();
        com.aspose.words.internal.zzZYQ.zzV(this.zzYTO, 512);
        zzZqY();
        zzZqZ();
        this.zzYUh.zzR(this.zzYTN);
        zzZr3();
        this.zzYUj.zzYH1 = (int) this.zzYTO.getLength();
        this.zzYTO.zzU(0L, 0);
        if (isEncrypted()) {
            zzZRA zzzra2 = this.zzYUj;
            zzzra2.zzYHs = true;
            zzzra2.zzYHl = false;
            zzzra2.zzYHj = 52;
        }
        this.zzYUj.zz0(this.zzYTO);
        com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(zzYTx);
        zzkd.zzIf().zzB("WordDocument", this.zzYTO);
        zzkd.zzIf().zzB(this.zzYUj.zzZgZ(), this.zzYTM);
        if (this.zzYTK.getLength() > 0) {
            zzkd.zzIf().zzB("Data", this.zzYTK);
        }
        if (isEncrypted()) {
            this.zzYTs.zzY(zzkd, this.zzYUj.zzZgZ());
        }
        if (this.zzYTQ.zzZqG() != null) {
            zzkd.zzIf().zzZ("\u0001CompObj", this.zzYTQ.zzZqG());
        }
        if (this.zzYTQ.hasMacros()) {
            zzkd.zzIf().zzZ("Macros", this.zzYTQ.getVbaProject().zzXU3());
        }
        if (this.zzZFZ.zzXp9.getCount() > 0) {
            zzkd.zzIf().zzZ("ObjectPool", this.zzZFZ.zzXp9);
        }
        com.aspose.words.internal.zzAA zzaaZzZ = zzKN.zzZ(this.zzYTQ.getCustomXmlParts());
        if (zzaaZzZ != null) {
            zzkd.zzIf().zzZ("MsoDataStore", zzaaZzZ);
        }
        new zzZZD(getWarningCallback()).zzZ(this.zzYTQ.getBuiltInDocumentProperties(), this.zzYTQ.getCustomDocumentProperties(), zzkd.zzIf());
        return zzkd;
    }

    private int zzZra() {
        return (this.zzYTQ.getStyles().zzYi5().zzYU9() || this.zzYTQ.getStyles().zzYi5().getCount() > 156) ? StyleIdentifier.GRID_TABLE_2 : !this.zzYTQ.getCompatibilityOptions().getDoNotUseIndentAsNumberingTabStop() ? 274 : StyleIdentifier.PLAIN_TABLE_2;
    }

    private void zzra() throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzor = this.zzmY.zzor();
        this.zzYTO = zzzopZzor;
        this.zzYTN = new com.aspose.words.internal.zzZOW(zzzopZzor, com.aspose.words.internal.zzZO0.zzhU());
        com.aspose.words.internal.zzZOP zzzopZzor2 = this.zzmY.zzor();
        this.zzYTM = zzzopZzor2;
        this.zzYTL = new com.aspose.words.internal.zzZOW(zzzopZzor2, com.aspose.words.internal.zzZO0.zzhU());
        com.aspose.words.internal.zzZOP zzzopZzor3 = this.zzmY.zzor();
        this.zzYTK = zzzopZzor3;
        this.zzYTJ = new com.aspose.words.internal.zzZOW(zzzopZzor3, com.aspose.words.internal.zzZO0.zzhU());
        this.zzYTI = new zzYJD();
        this.zzYTQ.getFontInfos().zzLn(this.zzYTQ.zzZpV().zzYVd.zzYEt());
        zzZZ2 zzzz2ZzZ = zzZZ2.zzZ(zzZUU.zzX(this.zzYTQ, zzZqQ().getAllowEmbeddingPostScriptFonts()), this.zzYTI, this.zzYTQ.zzZqI(), getWarningCallback());
        this.zzYTt = zzzz2ZzZ;
        this.zzYTH = new zzYCX(zzzz2ZzZ);
        this.zzYTG = new zzYMU(this.zzYTt);
        this.zzYTF = new zzY6E(this.zzYTt);
        this.zzYTE = new zzYEA(this.zzYTt);
        this.zzYTD = new zzY8D();
        this.zzYUh = new zzZO5();
        this.zzYUd = new zzZOB();
        this.zzYU8 = new zzZO8(0);
        this.zzYU7 = new zzZO8(1);
        this.zzYU6 = new zzZOH(this.zzZFZ);
        this.zzYUc = new zzZO4(0);
        this.zzYUb = new zzZO4(2);
        zzYBU zzybu = new zzYBU(this);
        this.zzYTz = zzybu;
        zzybu.zzY8t().setBackgroundShape(this.zzYTQ.getBackgroundShape());
        zzZRA zzzra = new zzZRA(zzZra());
        this.zzYUj = zzzra;
        zzzra.zzYHr = true;
    }

    public final Document getDocument() {
        return this.zzYTQ;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitAbsolutePositionTab(AbsolutePositionTab absolutePositionTab) throws Exception {
        zzT(65536, "Absolute position tabs are not supported in DOC, using regular tab character.");
        zzZ(com.aspose.words.internal.zzZKN.zzS('\t', 1), absolutePositionTab.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkEnd(BookmarkEnd bookmarkEnd) {
        if ("_PictureBullets".equals(bookmarkEnd.getName())) {
            return 0;
        }
        zzX(bookmarkEnd);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitBookmarkStart(BookmarkStart bookmarkStart) {
        if ("_PictureBullets".equals(bookmarkStart.getName())) {
            zzT(1, "Bookmark name _PictureBullets is reserved in DOC format, bookmark removed.");
            return 0;
        }
        zzY(bookmarkStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentEnd(Comment comment) {
        this.zzYTD.zzZqV();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeEnd(CommentRangeEnd commentRangeEnd) {
        this.zzYU6.zzXB(this.zzYTD.zzY1R(), commentRangeEnd.getId());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentRangeStart(CommentRangeStart commentRangeStart) {
        this.zzYU6.zzXC(this.zzYTD.zzY1R(), commentRangeStart.getId());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCommentStart(Comment comment) throws Exception {
        this.zzYU6.zzZ(this.zzYTD.zzY1R(), comment);
        zzZ(ControlChar.zzZsb, comment.zzZYh(), zzYTv);
        this.zzYTD.zzG4(3);
        this.zzYU6.zzCi(this.zzYTD.zzY1R());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitEditableRangeEnd(EditableRangeEnd editableRangeEnd) {
        this.zzYTD.zzY(editableRangeEnd);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitEditableRangeStart(EditableRangeStart editableRangeStart) {
        this.zzYTD.zzY(editableRangeStart);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) throws Exception {
        if (fieldEnd.getFieldType() == 67) {
            this.zzYTr = false;
        }
        zzZ(fieldEnd);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) throws Exception {
        int fieldType = fieldSeparator.getFieldType();
        if (fieldType == 67) {
            this.zzYTr = true;
        }
        Field field = (Field) com.aspose.words.internal.zzQW.zzZ((Map<FieldSeparator, TValue>) zzZqO(), fieldSeparator);
        if (zzZKO.zzAd(fieldType) && zzZKO.zzc(field)) {
            zzZ(fieldSeparator);
            return 0;
        }
        if (field != null && field.getStart().getFieldData() != null && zzZOO.zzCs(fieldType)) {
            zzY(fieldSeparator);
            return 0;
        }
        if (fieldSeparator.getOleObject() != null) {
            zzZ(fieldSeparator.zzZYh(), fieldSeparator.getOleObject().getId());
            return 0;
        }
        zzW(fieldSeparator.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) throws Exception {
        zzZ(fieldStart.getFieldType(), fieldStart.zzZYh());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteEnd(Footnote footnote) {
        this.zzYTD.zzZqV();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFootnoteStart(Footnote footnote) throws Exception {
        zzZO8 zzzo8ZzG3 = zzG3(footnote.getFootnoteType());
        zzzo8ZzG3.zzZX(this.zzYTD.zzY1R(), footnote.isAuto());
        if (footnote.isAuto()) {
            zzZ(ControlChar.zzZsc, footnote.zzZYh(), zzYTv);
        } else {
            zzZ(footnote.getReferenceMark(), footnote.zzZYh(), zzYTw);
        }
        this.zzYTD.zzG4(footnote.getFootnoteType() == 0 ? 1 : 4);
        zzzo8ZzG3.zzBY(this.zzYTD.zzY1R());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFormField(FormField formField) throws Exception {
        if (!zzZOO.zzCJ(formField.getType())) {
            return 1;
        }
        zzYE5 zzye5 = new zzYE5();
        zzye5.zzXpL = true;
        zzye5.zzXpK = true;
        zzye5.zzdZ = (int) this.zzYTK.getPosition();
        this.zzYTy++;
        zzZ(formField.getText(), formField.zzZYh(), zzye5);
        this.zzYTy--;
        zzZRB.zzZ(formField, this.zzYTJ);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGlossaryDocumentStart(GlossaryDocument glossaryDocument) {
        zzT(1, "Glossary Document feature is not supported in DOC.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeEnd(GroupShape groupShape) {
        return zzYBU.zzY8u();
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitGroupShapeStart(GroupShape groupShape) throws Exception {
        return this.zzYTz.visitGroupShapeStart(groupShape);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphEnd(Paragraph paragraph) throws Exception {
        if (paragraph.isEndOfDocument() && this.zzYTQ.getLists().zzYP0() > 0 && zzZqQ().getSavePictureBullet()) {
            zzZr7();
        }
        zzZ(zzM(paragraph), (zzYEF) zzZ(paragraph.zzYp5()), zzYTw);
        zzYDW zzydw = this.zzYTo;
        if (zzydw == null) {
            return 0;
        }
        zzydw.zzYd0();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        zzYMT zzymt = zzYTu;
        if (this.zzYTD.zzY1Y() > 0) {
            zzymt = new zzYMT();
            zzymt.zzXGL = this.zzYTD.zzY1Y();
            if (paragraph.isEndOfCell() && this.zzYTD.zzY1Y() > 1) {
                zzymt.zzXGM = true;
            }
        }
        this.zzYTD.zzX(this.zzYTG.zzZ((zzYMX) zzZ(paragraph.zzZYj()), zzymt, ((Boolean) paragraph.fetchParaAttr(1560)).booleanValue()));
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowEnd(Row row) throws Exception {
        zzZ(this.zzYTF.zzZ(row, zzZr6(), this.zzYTJ, zzZqR()), row.zzZYf());
        this.zzYTD.zzYNh();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) {
        this.zzYTD.zzY25();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        if (run.zzYUT()) {
            for (int i = 0; i < run.getText().length(); i++) {
                zzZ(zzZZP.SYMBOL, (zzYEF) zzZ(run.zzZYh()).zzbn(), zzYE5.zzY(run.getText().charAt(i), zzU1.zzZ(run.zzZYh().zzYdS(), this.zzYTQ.zzZqI())));
            }
        } else {
            zzYE5 zzye5 = zzYTw;
            if (com.aspose.words.internal.zzZKN.equals(run.getText(), FormField.zzYwj)) {
                zzye5 = zzYTv;
            }
            zzZ(run.getText(), (zzYEF) zzZ(run.zzZYh()), zzye5);
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeEnd(Shape shape) throws Exception {
        return this.zzYTz.visitShapeEnd(shape);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) throws Exception {
        return this.zzYTz.visitShapeStart(shape);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSmartTagEnd(SmartTag smartTag) {
        if (zzZr5()) {
            return 0;
        }
        this.zzYTD.zzV(smartTag);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSmartTagStart(SmartTag smartTag) {
        if (zzZr5()) {
            return 0;
        }
        this.zzYTD.zzW(smartTag);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSpecialChar(SpecialChar specialChar) throws Exception {
        zzZ(specialChar.getText(), specialChar.zzZYh(), zzYTv);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitStructuredDocumentTagStart(StructuredDocumentTag structuredDocumentTag) {
        zzT(1, "Structured Document Tags feature is not supported in DOC.");
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitSubDocument(SubDocument subDocument) {
        this.zzYTD.zzY(subDocument);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableEnd(Table table) {
        this.zzYTP.pop();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitTableStart(Table table) {
        this.zzYTP.push(new zzZZ6(this.zzYTQ, table));
        if (!zzZqR().zzZrb() || table.getFirstRow().zzZYf().zzZ7j() == 11) {
            return 0;
        }
        zzT(65536, com.aspose.words.internal.zzZKN.format("Table style 0x{0:x2} can not be preserved and will be converted to direct formatting.", Integer.valueOf(table.getFirstRow().zzZYf().zzZ7j())));
        return 0;
    }

    public final void zzG4(int i) {
        this.zzYTD.zzG4(i);
    }

    public final void zzTG(String str) {
        zzT(16777216, str);
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        try {
            this.zzmY = new com.aspose.words.internal.zzZWT(zzydz.zzXpa.getTempFolder());
            this.zzZFZ = zzydz;
            this.zzYTQ = zzydz.zzYfy;
            zzra();
            run();
            zzZr9().zzL(zzydz.zzXpb);
            this.zzmY.cleanup();
            return new SaveOutputParameters("application/msword");
        } catch (Throwable th) {
            this.zzmY.cleanup();
            throw th;
        }
    }

    public final boolean zzZqP() {
        return this.zzYTr;
    }

    public final zzYDZ zzZqS() {
        return this.zzZFZ;
    }

    public final int zzZqT() {
        return this.zzYTD.zzZqT();
    }

    public final com.aspose.words.internal.zzZOW zzZqU() {
        return this.zzYTJ;
    }

    public final void zzZqV() {
        this.zzYTD.zzZqV();
    }

    public final void zzW(zzYEF zzyef) throws Exception {
        zzZ(zzyef, zzYTv);
    }

    private void zzY(FieldSeparator fieldSeparator) throws Exception {
        Field field = (Field) com.aspose.words.internal.zzQW.zzZ((Map<FieldSeparator, TValue>) zzZqO(), fieldSeparator);
        if (field != null) {
            zzY(field, fieldSeparator.zzZYh());
        }
        zzW(fieldSeparator.zzZYh());
    }

    private void zzZ(zzYNJ zzynj, zzY6G zzy6g) throws Exception {
        this.zzYTD.zzX(zzynj);
        String str = this.zzYTD.zzY1Y() == 1 ? ControlChar.CELL : ControlChar.PARAGRAPH_BREAK;
        zzYEF zzyef = new zzYEF();
        if (zzy6g.getHidden()) {
            zzyef.zzZ(zzZU.zzZF4);
        }
        zzy6g.zzY(zzyef, 14);
        zzy6g.zzY(zzyef, 12);
        zzZ(str, zzyef, zzYTw);
    }

    private void zzY(Field field, zzYEF zzyef) throws Exception {
        zzYE5 zzye5 = new zzYE5();
        zzye5.zzXpL = true;
        zzye5.zzXpK = true;
        zzye5.zzdZ = (int) this.zzYTK.getPosition();
        this.zzYTy++;
        zzZ(Character.toString((char) 1), zzyef, zzye5);
        this.zzYTy--;
        this.zzYTJ.zzl(field.getStart().getFieldData().length + 68);
        this.zzYTJ.zzK((short) 68);
        this.zzYTJ.writeBytes(new byte[62]);
        this.zzYTJ.writeBytes(field.getStart().getFieldData());
    }

    private boolean zzZ(int i, com.aspose.words.internal.zz0S zz0s, zzZ8R zzz8r) throws Exception {
        if (this.zzYTD.zzkw(i).getLength() > 0) {
            this.zzYTD.zzG4(i);
            zz0s.zzX(this.zzYTD.zzY1R(), zzz8r);
            new Paragraph(this.zzYTQ).accept(this);
            zz0s.add(this.zzYTD.zzY1R() + 2);
            this.zzYTD.zzZqV();
            return true;
        }
        zz0s.clear();
        return false;
    }

    public final void zzY(int i, zzYEF zzyef) throws Exception {
        zzZ(new FieldEnd(this.zzYTQ, zzyef, i, true));
    }

    private void zzY(BookmarkStart bookmarkStart) {
        int i = this.zzYTp;
        if (i < 16380) {
            this.zzYTD.zzYY(bookmarkStart.getName(), bookmarkStart.getFlags());
        } else if (i == 16380) {
            zzT(1, "Maximum bookmarks count supported by binary DOC file format is reached.");
        }
        this.zzYTp++;
    }

    public final void zzZ(String str, zzYEF zzyef) throws Exception {
        zzZ(str, zzyef, zzYTw);
    }

    public final void zzZ(String str, zzYEF zzyef, zzYE5 zzye5) throws Exception {
        if (com.aspose.words.internal.zzZKN.equals(str, "")) {
            return;
        }
        int iZzY1R = this.zzYTD.zzY1R();
        this.zzYTD.append(str);
        int iZzY1R2 = this.zzYTD.zzY1R();
        if (zzyef == null) {
            zzyef = this.zzYTA;
        }
        this.zzYTD.zzZ(iZzY1R, iZzY1R2, this.zzYTE.zzZ(zzyef, zzye5, this.zzYTy > 0));
        this.zzYTA = zzyef;
    }

    public final void zzZ(int i, zzYEF zzyef) throws Exception {
        if (zzZOO.zzCK(i)) {
            this.zzYTy++;
        } else {
            this.zzYTD.zzZ(new zzZNP((i == 95 ? BackupEvent.ERROR_GUID_NOT_EXIST : 19) & 255, ((byte) i) & 255));
        }
        zzZ(ControlChar.zzZsa, zzyef, zzYTv);
    }

    public final void zzZ(zzYEF zzyef, int i) throws Exception {
        zzYE5 zzye5ZzYdn = zzYE5.zzYdn();
        zzye5ZzYdn.zzXpI = true;
        zzye5ZzYdn.zzXpJ = true;
        zzye5ZzYdn.zzdZ = i;
        zzZ(zzyef, zzye5ZzYdn);
    }

    private void zzZ(FieldSeparator fieldSeparator) throws Exception {
        Field field = (Field) com.aspose.words.internal.zzQW.zzZ((Map<FieldSeparator, TValue>) zzZqO(), fieldSeparator);
        if (field != null) {
            zzZ(field, fieldSeparator.zzZYh());
        }
        zzW(fieldSeparator.zzZYh());
    }

    private void zzZ(Field field, zzYEF zzyef) throws Exception {
        zzYE5 zzye5 = new zzYE5();
        zzye5.zzXpL = true;
        zzye5.zzXpK = true;
        zzye5.zzdZ = (int) this.zzYTK.getPosition();
        this.zzYTy++;
        zzZ(Character.toString((char) 1), zzyef, zzye5);
        this.zzYTy--;
        long position = this.zzYTK.getPosition();
        this.zzYTJ.zzl(0);
        this.zzYTJ.zzK((short) 68);
        this.zzYTJ.writeBytes(new byte[62]);
        zzZKO.zzZ(this.zzYTJ, field);
        long position2 = this.zzYTK.getPosition();
        this.zzYTK.zzH(position);
        this.zzYTJ.zzl((int) (position2 - position));
        this.zzYTK.zzH(position2);
    }

    private void zzZ(zzYEF zzyef, zzYE5 zzye5) throws Exception {
        this.zzYTD.zzZ(new zzZNP(20, 255));
        zzZ(ControlChar.zzZs9, zzyef, zzye5);
    }

    private void zzZ(FieldEnd fieldEnd) throws Exception {
        if (!zzZOO.zzCK(fieldEnd.getFieldType())) {
            zzZNP zzznp = new zzZNP(21, 0);
            zzznp.zzVK(fieldEnd.hasSeparator());
            if (fieldEnd.getFieldType() == 95) {
                zzznp.isLocked(true);
                zzznp.isDirty(true);
                zzznp.zzZ9b();
            } else {
                zzznp.isLocked(fieldEnd.isLocked());
                zzznp.isDirty(fieldEnd.isDirty());
            }
            this.zzYTD.zzZ(zzznp);
        }
        zzZ(ControlChar.zzZs8, fieldEnd.zzZYh(), zzYTv);
        if (zzZOO.zzCK(fieldEnd.getFieldType())) {
            this.zzYTy--;
        }
    }

    public final void zzZ(zzZLQ zzzlq) {
        zzGf(this.zzYTD.zzZqT()).zzZ9N().zzX(this.zzYTD.zzY1R(), zzzlq);
    }

    public final int zzZ(zzY4U zzy4u) {
        return zzGf(this.zzYTD.zzZqT()).zzZ9M().zzX(this.zzYTD.zzY1R(), zzy4u);
    }

    public final void zzZ(zzYK zzyk) {
        zzGf(this.zzYTD.zzZqT()).zzZ9L().zzX(this.zzYTD.zzY1R(), zzyk);
    }

    private WordAttrCollection zzZ(WordAttrCollection wordAttrCollection) {
        return (zzZqR() == null || zzZqR().zzZrb()) ? wordAttrCollection : wordAttrCollection.zzXS2();
    }
}
