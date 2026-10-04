package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOQ extends zzZOX {
    private boolean zzYAl;
    private boolean zzYAm;
    private zzZOR zzYAn;
    private ArrayList<Field> zzYAo;
    private boolean zzYAp;
    private zzY58 zzYAq;
    private boolean zzYAr;
    private zzZBC zzYAs;
    private zzZOW zzYAt;
    private zzZOU zzYAu;
    private boolean zzYAv;
    private int zzYAw;
    private zzZQJ zzYAx;
    private boolean zzYAy;
    private zzYD zzZCJ;
    private Document zzZEY;

    public static class zzX extends zzZQF {
        private ArrayList<FieldStart> zzYAj = new ArrayList<>();

        public final ArrayList<FieldStart> zzZat() {
            return this.zzYAj;
        }

        @Override // com.aspose.words.zzZQF
        public final void zzZe8() {
            if (zzZfT()) {
                return;
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzYAj, zzZe7().getStart());
        }
    }

    public static class zzY extends zzZQF {
        private zzZOY zzYAk;

        public zzY(zzZOY zzzoy) {
            this.zzYAk = zzzoy;
        }

        @Override // com.aspose.words.zzZQF
        public final void zzZe8() throws Exception {
            zzZOY zzzoyZzZ;
            if (zzZfT() || (zzzoyZzZ = this.zzYAk.zzZgo().zzZ(this.zzYAk, zzZe7())) == null) {
                return;
            }
            this.zzYAk = zzzoyZzZ;
        }
    }

    public static class zzZ extends zzZQF {
        private zzZOQ zzYAR;
        private byte zzYB0;

        public zzZ(zzZOQ zzzoq, byte b) {
            this.zzYAR = zzzoq;
            this.zzYB0 = b;
        }

        @Override // com.aspose.words.zzZQF
        public final void zzZe8() throws Exception {
            if (zzZfT()) {
                return;
            }
            this.zzYAR.zzZ(zzZe7(), this.zzYB0);
        }
    }

    private zzZOQ(Document document) {
        this(document, (zzZQJ) null, (zzZBC) null);
    }

    private static void zzC(zzZOY zzzoy) throws Exception {
        if (zzzoy.hasChildren()) {
            Iterator<zzZOY> it = zzzoy.iterator();
            while (it.hasNext()) {
                zzC(it.next());
            }
        }
        if (zzzoy.zzZbl()) {
            return;
        }
        zzzoy.getField().zzZgO();
    }

    private boolean zzCP(int i) {
        if (i != 1) {
            return false;
        }
        return this.zzYAu.isEmpty();
    }

    public static boolean zzD(zzZOY zzzoy) throws Exception {
        if (!zzZOO.zzCv(zzzoy.getField().getType())) {
            return false;
        }
        new zzY(zzzoy).zzV(zzzoy.getField().zzZgF());
        return true;
    }

    private boolean zzE(zzZOY zzzoy) {
        return this.zzYAp && !zzZOL.zzB(zzzoy);
    }

    private static boolean zzF(zzZOY zzzoy) {
        if (zzZOO.zzCM(zzzoy.getField().getType())) {
            return true;
        }
        if (!zzzoy.hasChildren()) {
            return false;
        }
        Iterator<zzZOY> it = zzzoy.iterator();
        while (it.hasNext()) {
            if (zzF(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean zzG(zzZOY zzzoy) {
        if (!zzzoy.getField().zzZgt() || this.zzYAy || zzZOO.zzCL(zzzoy.getField().getType())) {
            return this.zzYAy && !zzF(zzzoy);
        }
        return true;
    }

    private boolean zzH(zzZOY zzzoy) {
        return zzG(zzzoy) || zzE(zzzoy);
    }

    private static int zzI(zzZOY zzzoy) throws Exception {
        if (zzzoy.zzZgo().zzZEY.zzZqa() != null) {
            zzzoy.zzZgo().zzZEY.zzZqa().zzZaT();
        }
        if (zzzoy.getField().isRemoved()) {
            zzzoy.zzZb3();
            return 0;
        }
        zzZOQ zzzoqZzZgo = zzzoy.zzZgo();
        if (!zzzoqZzZgo.zzH(zzzoy)) {
            zzzoy.getField().zzZgz();
            zzZ(zzzoy.getField(), zzzoqZzZgo);
            if (zzs(zzzoy.getField())) {
                zzzoqZzZgo.zzZ(zzzoy, true);
            }
            zzY(zzzoy.getField(), zzzoqZzZgo);
            zzzoy.getField().zzZgy();
        }
        zzzoy.zzZb3();
        if (zzD(zzzoy)) {
            zzzoqZzZgo.zzZ(zzzoy, zzzoy.getField().zzZgt());
        }
        zzZ(zzzoy, zzzoqZzZgo);
        return zzzoy.zzZbb();
    }

    private boolean zzJ(zzZOY zzzoy) {
        if (this.zzYAx == null) {
            return false;
        }
        return !this.zzYAy || zzzoy.zzZbi() || zzzoy.zzZfU() || zzZOO.zzCv(zzzoy.getField().getType());
    }

    private boolean zzK(zzZOY zzzoy) {
        if (this.zzYAy || this.zzYAx != null || zzzoy.getField().zzZgt()) {
            return false;
        }
        return this.zzZEY.zzZqj() || zzZOO.zzCO(zzzoy.getField().getType());
    }

    private void zzL(zzZOY zzzoy) throws Exception {
        if (zzK(zzzoy)) {
            this.zzYAx = this.zzZEY.zzZqh().zzZ(this.zzYAn);
        }
        if (zzJ(zzzoy) && this.zzYAx.zzZ(zzzoy.getField(), zzzoy.zzZgl())) {
            zzZaE();
        } else {
            zzY(zzzoy, zzI(zzzoy));
        }
    }

    private static boolean zzM(zzZOY zzzoy) {
        if (zzzoy.zzZb6()) {
            return false;
        }
        for (zzZOY zzzoy2 : zzzoy) {
            if (zzzoy2.zzZb8() == 2 || zzM(zzzoy2)) {
                return true;
            }
        }
        return false;
    }

    private int zzN(zzZOY zzzoy) throws Exception {
        if (zzZOO.zzj(zzzoy.getField())) {
            return 1;
        }
        if (this.zzYAl && !zzzoy.getField().isDirty()) {
            return 1;
        }
        int iZzP = zzP(zzzoy);
        if (!zzzoy.zzZbk() && (iZzP == 3 || iZzP == 2)) {
            return iZzP;
        }
        if (zzzoy.zzZbj() > this.zzYAw) {
            return 2;
        }
        if (zzzoy.zzZbk()) {
            return 0;
        }
        if (zzzoy.zzZbd() || zzM(zzzoy)) {
            return 2;
        }
        if (iZzP == 1) {
            return 1;
        }
        return !zzzoy.zzZb6() ? 2 : 0;
    }

    private boolean zzO(zzZOY zzzoy) throws Exception {
        zzZOQ zzzoqZzZgo = zzzoy.zzZgo();
        int iZzN = zzN(zzzoy);
        zzzoy.zzCS(iZzN);
        try {
            if (iZzN != 0) {
                if (iZzN != 1) {
                    if (iZzN == 2) {
                        zzzoqZzZgo.zzYAu.zzZ(zzzoy, iZzN);
                        return false;
                    }
                    if (iZzN != 3) {
                        throw new IllegalArgumentException();
                    }
                }
                zzzoy.zzZb3();
            } else {
                zzL(zzzoy);
            }
            return true;
        } finally {
            zzzoqZzZgo.zzYAu.zzZ(zzzoy, iZzN);
        }
    }

    private static int zzP(zzZOY zzzoy) throws Exception {
        zzZOY zzzoyZzZbh = zzzoy.zzZbh();
        while (true) {
            zzZOY zzzoy2 = zzzoyZzZbh;
            zzZOY zzzoy3 = zzzoy;
            zzzoy = zzzoy2;
            if (zzzoy == null) {
                return 0;
            }
            if (zzzoy.getField().zzZgu()) {
                zzzoy.getField().zzZgT();
                int iZzY = zzzoy.getField().zzY(zzzoy3.zzZbc());
                if (iZzY != 0) {
                    return iZzY;
                }
            }
            zzzoyZzZbh = zzzoy.zzZbh();
        }
    }

    private void zzQ(zzZOY zzzoy) throws Exception {
        if (zzzoy.zzZb6()) {
            return;
        }
        boolean z = zzP(zzzoy) != 0;
        if (!z && zzzoy.getField().zzZgu()) {
            zzzoy.zzCT(0);
            zzX(zzzoy);
            zzzoy.zzCT(1);
        }
        if (zzX(zzzoy) && !z) {
            zzzoy.zzZbt();
        }
    }

    private void zzR(zzZOY zzzoy) throws Exception {
        this.zzYAv = false;
        if (zzzoy != null && zzzoy.zzZbd()) {
            zzZ(new zzZSD(this.zzZEY, !this.zzYAp), 3);
        }
    }

    private static boolean zzV(zzZOY zzzoy, zzZOQ zzzoq) throws Exception {
        if ((zzzoy.zzZba() & 1) != 0) {
            return zzzoq.zzYAs.zzZ(zzzoy);
        }
        return false;
    }

    private boolean zzW(zzZOX zzzox) {
        if (zzzox == this) {
            return true;
        }
        zzZOY zzzoy = (zzZOY) zzzox;
        if (zzzoy.getField().zzZgp()) {
            return true;
        }
        zzzoy.getField().zzZgV();
        return false;
    }

    private boolean zzX(zzZOX zzzox) throws Exception {
        boolean z;
        if (!zzzox.hasChildren()) {
            return true;
        }
        do {
            z = true;
            for (zzZOY zzzoy : zzzox) {
                if (!zzzoy.zzZbl() && !zzzoy.zzZb5()) {
                    zzQ(zzzoy);
                    if (!zzO(zzzoy)) {
                        z = false;
                    }
                }
            }
        } while (!zzW(zzzox));
        return z;
    }

    private void zzXE(int i, int i2) throws Exception {
        while (i <= i2) {
            if (!zzCP(i)) {
                this.zzYAw = i;
                this.zzYAu.zzCR(i);
                this.zzYAn.zzZaP().zzDV(this.zzYAw);
                zzX(this);
            }
            i++;
        }
    }

    private static void zzY(zzZOQ zzzoq) throws Exception {
        zzzoq.zzXE(0, 3);
        zzzoq.zzZaD();
    }

    private void zzZC(ArrayList<Node> arrayList) {
        new zzZ(this, (byte) -1).zzZH(arrayList);
    }

    public static void zzZF(ArrayList<Field> arrayList) throws Exception {
        if (arrayList.size() == 0) {
            return;
        }
        zzZOQ zzzoq = new zzZOQ(arrayList.get(0).getStart().zzYBb());
        zzzoq.zzZaH();
        Iterator<Field> it = arrayList.iterator();
        while (it.hasNext()) {
            zzzoq.zzZ(it.next(), (byte) -1);
        }
        zzY(zzzoq);
    }

    private void zzZaA() throws Exception {
        if (this.zzYAm && this.zzZEY.zzZqj()) {
            this.zzZEY.zzZqh().zzZoN();
        }
    }

    private void zzZaB() {
        if (this.zzYAr) {
            this.zzZCJ.clear();
        }
    }

    private void zzZaC() throws Exception {
        ArrayList<Field> arrayList = this.zzYAo;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<Field> it = this.zzYAo.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        this.zzYAo.clear();
    }

    private void zzZaD() throws Exception {
        this.zzYAq.zzXV2();
        this.zzYAs.zzZTn();
        zzZaC();
        zzZaB();
        zzZaA();
        zzZb2();
        zzZaG();
    }

    private void zzZaE() {
        if (this.zzYAy) {
            return;
        }
        this.zzYAm = true;
    }

    private void zzZaG() {
        if (this.zzZEY.zzZqa().zzZaU() != this) {
            return;
        }
        this.zzZEY.zzZqa().zzZaQ();
        this.zzZEY.zzZ((zzZOS) null);
    }

    private void zzZp(Node node) {
        new zzZ(this, node instanceof DocumentBase ? (byte) 1 : (byte) -1).zzZQ(node);
    }

    public static void zzZq(Node node) throws Exception {
        zzZOQ zzzoq = new zzZOQ(node.zzYBb(), false, true);
        zzzoq.zzZaH();
        zzZ(node, zzzoq);
    }

    public static void zzZr(Node node) throws Exception {
        zzZOQ zzzoq = new zzZOQ(node.zzYBb(), true, false);
        zzzoq.zzZaH();
        zzZ(node, zzzoq);
    }

    public static void zzZs(Node node) throws Exception {
        zzZOQ zzzoq = new zzZOQ(node.zzYBb());
        zzzoq.zzZaH();
        zzZ(node, zzzoq);
    }

    private static boolean zzq(Field field) throws Exception {
        zzZPG zzzpg = new zzZPG(field);
        zzY58 zzy58 = field.zzZgo().zzYAq;
        zzy58.zzZS(field);
        zzZP6 zzzp2 = field.zzZgq().zzZfw() ? new zzZP2(field, field.zzZgq().zzZfx()) : field.zzZgM();
        if ((field.zzZgn().zzZba() & 2) != 0) {
            if (!field.hasSeparator() || field.getSeparator().getNextSibling() == field.getEnd()) {
                return false;
            }
            field.zzZgP();
            return true;
        }
        if (zzzp2 == null) {
            return false;
        }
        zzzp2.zzZhW();
        zzzpg.restore();
        zzy58.zzZR(field);
        field.isDirty(false);
        return true;
    }

    private static boolean zzr(Field field) {
        int iZzZ5i;
        return (field.zzZgq().zzMj("\\@") || zzZOO.zzCB(field.getType()) || (iZzZ5i = field.getFormat().getGeneralFormats().zzZ5i()) == 9 || iZzZ5i == 20 || iZzZ5i == 37 || iZzZ5i == 38) ? false : true;
    }

    private static boolean zzs(Field field) throws Exception {
        FieldOptions fieldOptions = field.getStart().zzYBb().getFieldOptions();
        String strZzZ = zzZ(fieldOptions, field);
        if (strZzZ == null) {
            return zzq(field);
        }
        com.aspose.words.internal.zzZP1 zzzp1ZzZ = fieldOptions.getFieldUpdateCultureProvider() != null ? com.aspose.words.internal.zzZP1.zzZ(fieldOptions.getFieldUpdateCultureProvider().getCulture(strZzZ, field)) : null;
        if (zzzp1ZzZ == null) {
            zzzp1ZzZ = com.aspose.words.internal.zzZXR.zzWZ(strZzZ);
        }
        com.aspose.words.internal.zzZP1 zzzp1ZzpZ = com.aspose.words.internal.zzZXR.zzpZ();
        try {
            com.aspose.words.internal.zzZXR.zzU(zzzp1ZzZ);
            return zzq(field);
        } finally {
            com.aspose.words.internal.zzZXR.zzU(zzzp1ZzpZ);
        }
    }

    public static void zzt(Field field) throws Exception {
        zzZ(field, (zzZQJ) null, (byte) -1);
    }

    public final Document getDocument() {
        return this.zzZEY;
    }

    public final void zzLF(String str) {
        this.zzYAq.zzAc(str);
    }

    public final Bookmark zzLG(String str) throws Exception {
        return this.zzZCJ.get(str);
    }

    public final void zzU(Field field, boolean z) throws Exception {
        zzZOY zzzoyZzZgn = field.zzZgn();
        zzzoyZzZgn.zzCW(0);
        if (z) {
            zzZ(zzzoyZzZgn, true);
        }
        if (!zzzoyZzZgn.zzZbi() || zzzoyZzZgn.zzZb7()) {
            return;
        }
        zzzoyZzZgn.zzZbh().getField().zzZgU();
    }

    public final void zzZD(ArrayList<Node> arrayList) {
        zzX zzx = new zzX();
        zzx.zzZH(arrayList);
        Iterator<zzZOY> it = iterator();
        while (zzx.zzZat().size() != 0 && it.hasNext()) {
            zzZOY next = it.next();
            int iIndexOf = zzx.zzZat().indexOf(next.getField().getStart());
            if (iIndexOf != -1) {
                zzZOX.zzS(next);
                zzx.zzZat().remove(iIndexOf);
            }
        }
    }

    public final void zzZE(ArrayList<Node> arrayList) throws Exception {
        zzZC(arrayList);
        zzXE(0, 1);
        zzZaC();
    }

    public final void zzZaF() throws Exception {
        zzXE(2, 3);
        zzZaD();
    }

    public final void zzZaH() {
        if (this.zzZEY.zzZqa() == null) {
            Document document = this.zzZEY;
            document.zzZ(new zzZOS(document.getFieldOptions().getFieldUpdatingProgressCallback(), this));
        }
    }

    public final zzZI zzZaL() {
        return this.zzYAn.zzZaL();
    }

    public final zzZ83 zzZaM() {
        return this.zzYAn.zzZaM();
    }

    public final zzZKN zzZaN() {
        return this.zzYAn.zzZaN();
    }

    public final zzYD zzZau() {
        return this.zzZCJ;
    }

    public final zzZOW zzZav() {
        return this.zzYAt;
    }

    public final zzZOU zzZaw() {
        return this.zzYAu;
    }

    public final boolean zzZax() {
        return this.zzYAv;
    }

    public final zzZQJ zzZay() {
        return this.zzYAx;
    }

    public final boolean zzZaz() {
        return this.zzYAy;
    }

    public final void zzp(Field field) {
        zzZOO.zzi(field);
        if (this.zzYAo == null) {
            this.zzYAo = new ArrayList<>();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYAo, field);
    }

    private zzZOQ(Document document, zzZQJ zzzqj) {
        this(document, zzzqj, (zzZBC) null);
    }

    public zzZOQ(Document document, zzYD zzyd, zzZBC zzzbc) {
        this(document, (zzZQJ) null, zzzbc);
        this.zzZCJ = zzyd;
        this.zzYAr = false;
    }

    private static void zzY(zzZOY zzzoy, zzZOQ zzzoq) throws Exception {
        Paragraph parentParagraph = zzzoy.getField().getStart().getParentParagraph() == zzzoy.getField().getEnd().getParentParagraph() ? zzzoy.getField().getStart().getParentParagraph() : null;
        boolean zZzX = zzX(zzzoy, zzzoq);
        if (zzZ(parentParagraph, zzzoy) && zzzoq.zzYAs.zzP(parentParagraph)) {
            zzzoy.zzZbq();
        }
        if (zZzX) {
            zzzoy.zzZbo();
        }
    }

    private static int zzZ(Field field, zzZQJ zzzqj, byte b) throws Exception {
        zzZOQ zzzoq = new zzZOQ(field.getStart().zzYBb(), zzzqj);
        zzzoq.zzZaH();
        zzZOY zzzoyZzZ = zzzoq.zzZ(field, b);
        try {
            if (zzzoyZzZ == null) {
                zzzoq.zzZaG();
                return 0;
            }
            zzzoq.zzXE(0, 3);
            zzzoq.zzZaD();
            int iZzZbb = zzzoyZzZ.zzZbb();
            zzzoyZzZ.dispose();
            return iZzZbb;
        } finally {
            if (zzzoyZzZ != null) {
                zzzoyZzZ.dispose();
            }
        }
    }

    private static boolean zzW(zzZOY zzzoy, zzZOQ zzzoq) throws Exception {
        if (zzV(zzzoy, zzzoq)) {
            return true;
        }
        if (!zzzoy.hasChildren()) {
            return false;
        }
        Iterator<zzZOY> it = zzzoy.iterator();
        while (it.hasNext()) {
            zzW(it.next(), zzzoq);
        }
        return false;
    }

    private zzZOQ(Document document, boolean z, boolean z2) {
        this(document);
        this.zzYAp = z;
        this.zzYAl = z2;
    }

    private static boolean zzX(zzZOY zzzoy, zzZOQ zzzoq) throws Exception {
        if (zzzoy.zzZbf()) {
            return zzW(zzzoy, zzzoq);
        }
        return com.aspose.words.internal.zzZKN.equals(zzzoy.getField().getResult(), "") && zzV(zzzoy, zzzoq);
    }

    private zzZOQ(Document document, zzZQJ zzzqj, zzZBC zzzbc) {
        zzZOR zzzor;
        this.zzYAq = new zzY58();
        this.zzYAw = 0;
        this.zzZEY = document;
        this.zzZCJ = new zzYD(document);
        this.zzYAs = zzzbc == null ? new zzK4() : zzzbc;
        this.zzYAr = true;
        this.zzYAx = zzzqj;
        this.zzYAy = zzzqj != null;
        this.zzYAu = new zzZOU();
        if (zzzqj != null && zzzqj.zzZeh() != null) {
            zzzor = zzzqj.zzZeh();
        } else {
            zzzor = new zzZOR(document);
        }
        this.zzYAn = zzzor;
        this.zzYAt = new zzZOW(this, zzzor.zzZaO());
    }

    private static zzZQI zzX(Field field, int i) throws Exception {
        zzYWB zzywbZzZgI = field.zzZgI();
        if (zzywbZzZgI != null) {
            return new zzZQI(zzywbZzZgI, 2);
        }
        if (!field.hasSeparator() || i == 0 || zzZOO.zzi(field)) {
            return null;
        }
        if (!field.isRemoved() && (i & 2) == 0) {
            return new zzZQI(field.zzZgF(), 0);
        }
        return new zzZQI(field.zzZgH(), 1);
    }

    private static boolean zzY(Paragraph paragraph, zzZOY zzzoy) {
        boolean z = (zzzoy.zzZba() & 16) != 0;
        for (Node firstChild = paragraph.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            if (!zzYVU.zzXU(firstChild)) {
                if (!z || firstChild.getNodeType() != 21) {
                    return false;
                }
                String text = firstChild.getText();
                for (int i = 0; i < text.length(); i++) {
                    char cCharAt = text.charAt(i);
                    if (!com.aspose.words.internal.zzZKU.zzG(cCharAt) && !com.aspose.words.internal.zzZYD.zzj(cCharAt)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void zzZ(Node node, zzZOQ zzzoq) throws Exception {
        zzzoq.zzZp(node);
        zzY(zzzoq);
    }

    private static String zzZ(FieldOptions fieldOptions, Field field) {
        int localeId;
        if (fieldOptions.getFieldUpdateCultureSource() == 0 || zzr(field) || (localeId = field.getLocaleId()) == 1024) {
            return null;
        }
        return com.aspose.words.internal.zzBM.zzVn(localeId);
    }

    private static int zzX(Field field, zzZQJ zzzqj, byte b) throws Exception {
        if (!field.zzZgm()) {
            field.zzZgt();
        }
        if (!field.zzZgm()) {
            return zzZ(field, zzzqj, b);
        }
        return zzI(field.zzZgn());
    }

    private static zzZQI zzY(Field field, zzZQJ zzzqj, byte b) throws Exception {
        return zzX(field, zzX(field, zzzqj, b));
    }

    private void zzZ(zzZOY zzzoy, boolean z) throws Exception {
        zzZaE();
        if (z) {
            zzzoy.zzCW(1);
        }
        if (zzzoy.zzZbi()) {
            if (!zzZOO.zzi(zzzoy.getField())) {
                zzzoy.zzZbc().zzZgg();
            }
            zzzoy.zzZbh().zzT(zzzoy);
        }
    }

    private void zzY(zzZOY zzzoy, int i) throws Exception {
        zzZQI zzzqiZzX;
        if (i == 0 || this.zzYAy || !this.zzZEY.zzZqj() || (zzzqiZzX = zzX(zzzoy.getField(), i)) == null) {
            return;
        }
        this.zzZEY.zzZqh().zzY(zzzoy.getField(), zzzqiZzX);
    }

    private static void zzZ(zzZOY zzzoy, zzZOQ zzzoq) throws Exception {
        zzzoy.zzZbs();
        zzY(zzzoy, zzzoq);
        if (zzzoy.zzZbi()) {
            return;
        }
        zzC(zzzoy);
        zzZOX.zzS(zzzoy);
    }

    private static void zzY(Field field, zzZOQ zzzoq) {
        IFieldUpdatingCallback fieldUpdatingCallback = zzzoq.zzZEY.getFieldOptions().getFieldUpdatingCallback();
        if (fieldUpdatingCallback == null) {
            return;
        }
        fieldUpdatingCallback.fieldUpdated(field);
    }

    private static boolean zzZ(Paragraph paragraph, zzZOY zzzoy) {
        return paragraph != null && (zzzoy.zzZba() & 8) != 0 && zzY(paragraph, zzzoy) && zzY0C.zzXS(paragraph);
    }

    public static zzZQI zzZ(zzZYW zzzyw, Field field, zzZQJ zzzqj, byte b) throws Exception {
        zzZQI zzzqiZzY = zzY(field, zzzqj, b);
        if (field.zzZgm()) {
            zzZ(field.zzZgn(), field.zzZgo());
        }
        return zzzqiZzY != null ? zzzqiZzY : zzzyw.zzX(field);
    }

    public static void zzZ(Node node, int... iArr) throws Exception {
        zzZOQ zzzoq = new zzZOQ(node.zzYBb());
        zzzoq.zzZp(node);
        zzZ(zzzoq, iArr);
    }

    private static void zzZ(zzZOX zzzox, int[] iArr) throws Exception {
        for (zzZOY zzzoy : zzzox) {
            if (com.aspose.words.internal.zzZKV.zzZ(iArr, zzzoy.getField().getType(), 0, iArr.length) != -1) {
                zzzoy.getField().remove();
            } else {
                zzZ(zzzoy, iArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzZOY zzZ(Field field, byte b) throws Exception {
        this.zzYAv = true;
        zzZOY zzzoyZzZ = zzZOY.zzZ(field, this, b);
        zzR(zzzoyZzZ);
        return zzzoyZzZ;
    }

    private static void zzZ(Field field, zzZOQ zzzoq) {
        IFieldUpdatingCallback fieldUpdatingCallback = zzzoq.zzZEY.getFieldOptions().getFieldUpdatingCallback();
        if (fieldUpdatingCallback == null) {
            return;
        }
        fieldUpdatingCallback.fieldUpdating(field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzZOY zzZ(zzZOY zzzoy, Field field) throws Exception {
        this.zzYAv = true;
        zzZOY zzzoyZzu = zzzoy.zzu(field);
        zzR(zzzoyZzu);
        return zzzoyZzu;
    }

    public final void zzZ(zzZBG zzzbg) throws Exception {
        zzZ(zzzbg, this.zzYAw);
    }

    public final void zzZ(zzZBG zzzbg, int i) throws Exception {
        if (this.zzYAn.zzZaP().zzZ(i, zzzbg) && i == this.zzYAw) {
            zzzbg.zzZhW();
        }
    }
}
