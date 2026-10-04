package com.aspose.words;

import androidx.appcompat.widget.C21532OooOOo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class Field {
    private zzZPT zzYGs;
    private zzZOY zzYGt;
    private FieldFormat zzYGu;
    private zzZR1 zzYGv;
    private zzZR4 zzYGw;
    private Paragraph zzYGx;
    private Paragraph zzYGy;

    public Field() {
    }

    private static Inline zzJ(Iterable<Node> iterable) {
        if (iterable == null) {
            return null;
        }
        Iterator<Node> it = iterable.iterator();
        while (it.hasNext()) {
            Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
            if (inline != null) {
                return inline;
            }
        }
        return null;
    }

    private boolean zzZgC() {
        zzZgt();
        if (getType() != 33) {
            getType();
        }
        if (getStart().getFont().getBidi()) {
            return true;
        }
        if (!getFormat().getGeneralFormats().zzAs(54)) {
            return false;
        }
        Inline inlineZzJ = zzJ(this.zzYGs.zzZga());
        return inlineZzJ != null ? inlineZzJ.getFont().getBidi() : getStart().getParentParagraph().getParagraphFormat().getBidi();
    }

    private boolean zzZgD() {
        int type = getType();
        return (type == 26 || type == 33) ? zzZgt() ? zzZgC() : getStart().getParentParagraph().getParagraphFormat().getBidi() : type != 37 ? ((Boolean) getStart().zzZYh().zzYdM().zzY(getStart(), StyleIdentifier.BIBLIOGRAPHY)).booleanValue() : getStart().getParentParagraph().getParagraphFormat().getBidi();
    }

    private boolean zzZgK() {
        switch (getType()) {
            default:
                if (!isRemoved()) {
                    return true;
                }
            case 4:
            case 9:
            case 11:
            case 49:
            case 57:
            case 63:
            case 71:
            case 74:
            case 77:
            case 84:
            case 92:
                return false;
        }
    }

    private void zzZgQ() throws Exception {
        zzYW0.zzZ(getStart(), false, this.zzYGw.zzZgr(), false);
    }

    public String getDisplayResult() throws Exception {
        zzYWB zzywbZzZgI = zzZgI();
        return zzywbZzZgI != null ? zzYVY.zzJ(zzywbZzZgI) : zzW3(true);
    }

    public FieldEnd getEnd() {
        return this.zzYGw.getEnd();
    }

    public String getFieldCode() {
        return getFieldCode(true);
    }

    public FieldFormat getFormat() {
        FieldFormat fieldFormat = this.zzYGu;
        if (fieldFormat != null) {
            return fieldFormat;
        }
        FieldFormat fieldFormat2 = new FieldFormat(this);
        this.zzYGu = fieldFormat2;
        return fieldFormat2;
    }

    public int getLocaleId() {
        return zzZgq().getBidi() ? zzZgq().zzZfz() : zzZgq().zzp6();
    }

    public String getResult() {
        return zzW3(false);
    }

    public FieldSeparator getSeparator() {
        if (this.zzYGw.hasSeparator() == getEnd().hasSeparator()) {
            return this.zzYGw.getSeparator();
        }
        this.zzYGw.zzX(getEnd().hasSeparator() ? zzZR4.zzV(getStart()).getSeparator() : null);
        return this.zzYGw.getSeparator();
    }

    public FieldStart getStart() {
        return this.zzYGw.getStart();
    }

    public int getType() {
        return getStart().getFieldType();
    }

    public final boolean hasSeparator() {
        return getSeparator() != null;
    }

    public boolean isDirty() {
        return this.zzYGw.getStart().isDirty();
    }

    public boolean isLocked() {
        return this.zzYGw.getStart().isLocked();
    }

    public final boolean isRemoved() {
        return getStart().getParentNode() == null || getEnd().getParentNode() == null || getStart().zzYAW() != getEnd().zzYAW();
    }

    public boolean needStoreOldResultNodes() {
        if (zzZOO.zzCF(getType()) == 0 || zzZgq().zzZfw()) {
            return false;
        }
        return getFormat().getGeneralFormats().zzAs(54);
    }

    public final void normalizeFieldTypes() {
        this.zzYGw.normalizeFieldTypes();
    }

    public Node remove() throws Exception {
        return zzZPJ.zzC(this);
    }

    public void setLocaleId(int i) {
        if (i == 0 || !zzZ3X.isDefined(i)) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Not a valid LCID: "));
        }
        if (zzZ3X.zzwJ(i) || zzZ3X.zzwI(i)) {
            zzZgq().zzDE(i);
            zzZgq().setBidi(true);
        } else {
            zzZgq().zzDF(i);
            zzZgq().setBidi(false);
        }
    }

    public void setResult(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzW4(false);
        zzZgz();
        new zzY5R(this, str).zzZcx();
        this.zzYGs = null;
    }

    public boolean unlink() throws Exception {
        if (!zzZgK()) {
            return false;
        }
        zzZP7.zzx(this);
        return true;
    }

    public void update() throws Exception {
        update(false);
    }

    public final void zzMn(String str) throws Exception {
        zzZgQ();
        DocumentBuilder documentBuilder = new DocumentBuilder(getStart().zzYBb());
        documentBuilder.moveTo(this.zzYGw.zzZgr());
        documentBuilder.write(str);
    }

    public final void zzW(zzZOY zzzoy) {
        this.zzYGt = zzzoy;
        zzZgV();
    }

    public final String zzW3(boolean z) {
        return hasSeparator() ? zzYVY.zzZ((Node) getSeparator(), false, (Node) getEnd(), false, z) : "";
    }

    public final void zzW4(boolean z) {
        if (hasSeparator()) {
            return;
        }
        if (!z && zzZOO.zzCF(getType()) == 0) {
            throw new IllegalStateException("Cannot set result of a field that does not have a separator.");
        }
        FieldSeparator fieldSeparator = new FieldSeparator(getEnd().getDocument(), new zzYEF(), getStart().getFieldType());
        getEnd().zzYC(fieldSeparator);
        this.zzYGw.zzX(fieldSeparator);
        getEnd().zzVU(true);
        if (zzZgm()) {
            this.zzYGt.zzCW(0);
        }
    }

    public int zzY(zzZBF zzzbf) throws Exception {
        throw new UnsupportedOperationException();
    }

    public void zzZ(zzZBF zzzbf) throws Exception {
    }

    public String zzZgA() {
        return null;
    }

    public Section zzZgB() throws Exception {
        return null;
    }

    public com.aspose.words.internal.zzHH zzZgE() {
        return com.aspose.words.internal.zzSG.zzk(zzZgD());
    }

    public final zzYWB zzZgF() {
        return (isRemoved() || !hasSeparator()) ? zzYWB.zzXV4 : new zzYWB(getSeparator(), false, getEnd(), false);
    }

    public final zzYWB zzZgG() {
        return isRemoved() ? zzYWB.zzXV4 : new zzYWB(getStart(), false, this.zzYGw.zzZgr(), false);
    }

    public final zzYWB zzZgH() {
        return isRemoved() ? zzYWB.zzXV4 : new zzYWB(getStart(), getEnd());
    }

    public zzYWB zzZgI() throws Exception {
        return null;
    }

    public void zzZgJ() throws Exception {
    }

    public final void zzZgL() throws Exception {
        if (zzZgK()) {
            zzZPJ.zzZ(this, new zzY3Y(this), 2);
        }
    }

    public zzZP6 zzZgM() throws Exception {
        zzTL zztlZzz = this.zzYGt.zzZgo().zzZav().zzz(this);
        if (zztlZzz != null) {
            return new zzZP5(this, zztlZzz);
        }
        return null;
    }

    public int zzZgN() throws Exception {
        return zzZOO.zzCO(getType()) ? 3 : 0;
    }

    public void zzZgO() throws Exception {
        this.zzYGt = null;
    }

    public final void zzZgP() throws Exception {
        if (hasSeparator()) {
            zzYW0.zzZ((Node) getSeparator(), false, (Node) getEnd(), false, zzZOO.zzg(this));
        }
    }

    public final void zzZgR() {
        this.zzYGw.zzDJ(FieldType.FIELD_DISPLAY_BARCODE);
    }

    public final int zzZgS() {
        return zzZOO.zzLE(zzZgq().zzZfB());
    }

    public final void zzZgT() {
        if (zzZgp()) {
            return;
        }
        zzZgV();
    }

    public final void zzZgU() {
        this.zzYGv = null;
    }

    public void zzZgV() {
        if (zzZgm()) {
            this.zzYGt.zzZbx();
        }
        this.zzYGv = new zzZR1(this);
        if (zzZgm()) {
            this.zzYGt.zzZbv();
        }
    }

    public zzZA2 zzZgk() {
        return null;
    }

    public final boolean zzZgl() {
        return zzY(getEnd());
    }

    public final boolean zzZgm() {
        return this.zzYGt != null;
    }

    public final zzZOY zzZgn() {
        return this.zzYGt;
    }

    public final zzZOQ zzZgo() {
        return this.zzYGt.zzZgo();
    }

    public final boolean zzZgp() {
        return this.zzYGv != null;
    }

    public final zzZR1 zzZgq() {
        zzZgT();
        return this.zzYGv;
    }

    public final FieldChar zzZgr() {
        return this.zzYGw.zzZgr();
    }

    public final boolean zzZgs() {
        zzYWB zzywbZzZgF = zzZgF();
        if (zzywbZzZgF.zz13()) {
            return false;
        }
        for (Node node : zzywbZzZgF) {
            if (zzywbZzZgF.zzYA2().getNode() != node && zzywbZzZgF.zzYA1().getNode() != node && zzYVU.zzXY(node) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzZgt() {
        return getStart().getAncestor(4) != null;
    }

    public boolean zzZgu() {
        return false;
    }

    public final Paragraph zzZgv() {
        return this.zzYGx;
    }

    public final Paragraph zzZgw() {
        return this.zzYGy;
    }

    public final Iterable<Node> zzZgx() {
        return this.zzYGs.zzZga();
    }

    public final void zzZgy() {
        this.zzYGs = null;
    }

    public final void zzZgz() {
        zzZPT zzzptZzH = needStoreOldResultNodes() ? zzZPT.zzH(this) : null;
        this.zzYGs = zzzptZzH;
        if (zzzptZzH != null) {
            if (getSeparator() != null && getSeparator().getParentParagraph() != null) {
                this.zzYGy = (Paragraph) getSeparator().getParentParagraph().deepClone(false);
            }
            if (getEnd() == null || getEnd().getParentParagraph() == null) {
                return;
            }
            this.zzYGx = (Paragraph) getEnd().getParentParagraph().deepClone(false);
        }
    }

    public Field(zzZR4 zzzr4) {
        this.zzYGw = zzzr4;
    }

    private static boolean zzY(FieldEnd fieldEnd) {
        zzZYT zzzytZzp = zzZYT.zzp(fieldEnd);
        zzZR2 zzzr2 = new zzZR2();
        while (true) {
            Node node = zzzytZzp.getNode();
            while (zzzytZzp.zzZ(null, true, true, true, false, false)) {
                if (zzzytZzp.getNode() != node) {
                    Node node2 = zzzytZzp.getNode();
                    if (zzZR2.zzZV(node2)) {
                        int nodeType = node2.getNodeType();
                        if (nodeType != 23) {
                            if (nodeType == 24 && !zzzr2.zzZfT()) {
                                FieldEnd fieldEnd2 = (FieldEnd) node2;
                                return fieldEnd2.hasSeparator() && zzY(fieldEnd2);
                            }
                        } else if (!zzzr2.isInFieldCode()) {
                            return false;
                        }
                    }
                    zzzr2.zzZW(node2);
                }
            }
            return true;
        }
    }

    public String getFieldCode(boolean z) {
        return this.zzYGw.getFieldCode(z);
    }

    public void update(boolean z) throws Exception {
        if (zzZgm()) {
            throw new IllegalStateException("The field is being updated already.");
        }
        boolean z2 = false;
        if (z) {
            boolean zZzAs = getFormat().getGeneralFormats().zzAs(54);
            getFormat().getGeneralFormats().zzVw(false);
            z2 = zZzAs;
        }
        zzZOQ.zzt(this);
        if (z) {
            getFormat().getGeneralFormats().zzVw(z2);
        }
    }

    public void zzZ(FieldStart fieldStart, FieldSeparator fieldSeparator, FieldEnd fieldEnd) {
        this.zzYGw = new zzZR4(fieldStart, fieldSeparator, fieldEnd);
    }

    public void isDirty(boolean z) {
        this.zzYGw.zzVZ(z);
    }

    public void isLocked(boolean z) {
        this.zzYGw.zzW0(z);
    }
}
