package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYON extends DocumentVisitor {
    private zzZ13 zzXJA;
    private com.aspose.words.internal.zzZQC<zzZ13> zzXJB = new com.aspose.words.internal.zzZQC<>();
    private zzZ14 zzY21;

    private ArrayList<zzYZP> zzW(String str, zzYEF zzyef) {
        ArrayList<zzYZP> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '&') {
                sb = zzZ(zzyef, false, sb, arrayList);
                sb2 = zzZ(zzyef, true, sb2, arrayList);
                com.aspose.words.internal.zzZQG.zzZ(arrayList, new zzYZP(this.zzY21, "&", zzyef));
            } else if (zzZ15.zzYv(cCharAt) || cCharAt == '/') {
                sb = zzZ(zzyef, false, sb, arrayList);
                sb2.append(cCharAt);
            } else {
                sb2 = zzZ(zzyef, true, sb2, arrayList);
                sb.append(cCharAt);
            }
        }
        zzZ(zzyef, false, sb, arrayList);
        zzZ(zzyef, true, sb2, arrayList);
        return arrayList;
    }

    private static boolean zzXi(Node node) {
        return node != null && node.getNodeType() == 35 && ((OfficeMath) com.aspose.words.internal.zzZKW.zzZ(node, OfficeMath.class)).getMathObjectType() == 1;
    }

    private zzZ13 zzZ(OfficeMath officeMath, zzZ13 zzz13) throws Exception {
        zzZ13 zzz13ZzZ = zzZ12.zzZ(officeMath, null, this.zzY21);
        this.zzXJA = zzz13ZzZ;
        this.zzXJB.push(zzz13ZzZ);
        this.zzXJA.zzYn(zzm(officeMath));
        officeMath.accept(this);
        if (zzz13.zzQw().size() != 0) {
            zzZ13 zzz13Zzt = zzt(this.zzXJA);
            zzZ13 zzz13Zzt2 = zzt(zzz13);
            if (zzz13Zzt2 != null && zzz13Zzt != null) {
                Iterator<zzZ13> it = zzz13Zzt.zzQw().iterator();
                while (it.hasNext()) {
                    zzz13Zzt2.zzZ(it.next());
                }
            }
            return zzz13;
        }
        zzz13.zzZ(this.zzXJA.zzQw().get(0));
        if (zzXi(officeMath.zzYB1())) {
            zzZ((OfficeMath) com.aspose.words.internal.zzZKW.zzZ(officeMath.zzYB1(), OfficeMath.class), zzz13);
        }
        return zzz13;
    }

    private static float zzm(OfficeMath officeMath) {
        float fZzYRX;
        double width;
        Cell cell = (Cell) officeMath.getAncestor(7);
        Section section = (Section) officeMath.getAncestor(2);
        if (cell != null) {
            CellFormat cellFormat = cell.getCellFormat();
            if (cellFormat.getPreferredWidth().isFixed()) {
                fZzYRX = (float) ((cellFormat.getPreferredWidth().getValue() - cellFormat.getLeftPadding()) - cellFormat.getRightPadding());
            } else {
                width = cellFormat.getWidth();
                fZzYRX = (float) width;
            }
        } else if (section == null) {
            fZzYRX = Float.NaN;
        } else if (section.getPageSetup().getTextColumns().getCount() > 1) {
            width = section.getPageSetup().getTextColumns().getWidth();
            fZzYRX = (float) width;
        } else {
            fZzYRX = section.getPageSetup().zzYRX();
        }
        return (fZzYRX - ((float) (((double) (officeMath.getParentParagraph().zzZYj().zzYM7() + officeMath.getParentParagraph().zzZYj().zzYM4())) / 20.0d))) - 4.5f;
    }

    private void zzn(OfficeMath officeMath) throws Exception {
        OfficeMath officeMath2 = officeMath.isTopLevel() ? officeMath : new OfficeMath(officeMath.getDocument(), new zzZ03());
        if (zzXi(officeMath) && zzXi(officeMath.zzYB1())) {
            zzZ13 zzz13ZzZ = zzZ(officeMath, zzZ12.zzZ(officeMath2, null, this.zzY21));
            this.zzXJA = zzz13ZzZ;
            this.zzXJB.push(zzz13ZzZ);
        } else {
            zzZ13 zzz13ZzZ2 = zzZ12.zzZ(officeMath2, null, this.zzY21);
            this.zzXJA = zzz13ZzZ2;
            this.zzXJB.push(zzz13ZzZ2);
            this.zzXJA.zzYn(zzm(officeMath));
            officeMath.accept(this);
        }
    }

    private static zzZ13 zzt(zzZ13 zzz13) {
        while (zzz13.zzYG8().getMathObjectType() == 1 && zzz13.zzQw().size() == 1) {
            zzz13 = zzz13.zzQw().get(0);
            if (zzz13.zzYG6()) {
                return zzz13;
            }
        }
        return null;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldEnd(FieldEnd fieldEnd) {
        if (fieldEnd.hasSeparator()) {
            return 0;
        }
        unlock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldSeparator(FieldSeparator fieldSeparator) {
        unlock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitFieldStart(FieldStart fieldStart) throws Exception {
        Field field = fieldStart.getField();
        zzYWB zzywbZzZgI = field.zzZgI();
        if (!field.hasSeparator() && zzywbZzZgI != null && !zzywbZzZgI.zz13() && !zzywbZzZgI.isEmpty()) {
            zzywbZzZgI.zzZ(this, new zzZP9(zzywbZzZgI, false));
        }
        lock();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathEnd(OfficeMath officeMath) {
        this.zzXJB.pop();
        this.zzXJA = this.zzXJB.peek();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitOfficeMathStart(OfficeMath officeMath) throws Exception {
        zzZ13 zzz13ZzZ = zzZ12.zzZ(officeMath, this.zzXJA, this.zzY21);
        this.zzXJA = zzz13ZzZ;
        this.zzXJB.push(zzz13ZzZ);
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) {
        if (isLocked()) {
            return 0;
        }
        if (!com.aspose.words.internal.zzZKN.equals(run.getText(), ControlChar.LINE_BREAK)) {
            Iterator<zzYZP> it = zzW(run.getText(), zzZ7R.zzZ(run, 1)).iterator();
            while (it.hasNext()) {
                this.zzXJA.zzZ(it.next());
            }
            return 0;
        }
        if (!run.zzYB3() || this.zzXJA.zzYGr() == null) {
            this.zzXJA.zzZ(new zzZ0U(this.zzY21));
            return 0;
        }
        this.zzXJA.zzYGr().zzZ(new zzZ0U(this.zzY21));
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitShapeStart(Shape shape) {
        zzZ13 zzz13 = this.zzXJA;
        zzz13.zzZ(new zzYZR(this.zzY21, zzz13.zzYG8(), shape.zzZYh(), shape));
        return 0;
    }

    public final zzZ13 zzo(OfficeMath officeMath) throws Exception {
        this.zzY21 = new zzZ14(officeMath.getDocument());
        if (officeMath.isTopLevel() && zzXi(officeMath.zzYB0())) {
            return new zzZ13(this.zzY21, officeMath);
        }
        zzn(officeMath);
        this.zzXJA.zzZE4();
        if (this.zzXJA.zzYG9() && this.zzXJA.zzZj().isEmpty()) {
            float size = (float) (((double) officeMath.zzZYh().getSize()) / 2.0d);
            this.zzXJA.zzI(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, size, size));
        }
        if (this.zzXJA.zzZj().getHeight() < this.zzXJA.zzYGg()) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZj = this.zzXJA.zzZj();
            float fZzYGg = this.zzXJA.zzYGg() - zzzq4ZzZj.getHeight();
            zzZ13 zzz13 = this.zzXJA;
            zzz13.zzYp(zzz13.zzYGq() + fZzYGg);
            this.zzXJA.zzI(new com.aspose.words.internal.zzZQ4(zzzq4ZzZj.getX(), zzzq4ZzZj.getY() - fZzYGg, zzzq4ZzZj.getWidth(), this.zzXJA.zzYGg()));
            if (this.zzXJA.zzYGn().zzZO() == null) {
                com.aspose.words.internal.OooO0O0.OooO00o(this.zzXJA.zzYGn());
            }
            this.zzXJA.zzYGn().zzZO().zzY(0.0f, fZzYGg, 0);
        }
        this.zzXJA.zzYGA();
        return this.zzXJA;
    }

    private StringBuilder zzZ(zzYEF zzyef, boolean z, StringBuilder sb, ArrayList<zzYZP> arrayList) {
        if (sb.length() > 0) {
            zzYZP zzyzp = new zzYZP(this.zzY21, sb.toString(), zzyef);
            zzyzp.zzTi(z);
            arrayList.add(zzyzp);
        }
        return new StringBuilder();
    }
}
