package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzZR8 implements zzZB2, zzZBF {
    private zzYIU zzYGo;
    private zzYWB zzYGp;
    private boolean zzYGq;
    private String zzZi;
    private zzYWB zzZtB;
    private Field zzZz7;

    public zzZR8(Field field, String str, zzYIU zzyiu, zzYWB zzywb, zzYWB zzywb2, boolean z) {
        this.zzZz7 = field;
        this.zzZi = str;
        this.zzYGo = zzyiu;
        this.zzZtB = zzywb;
        this.zzYGp = zzywb2;
        this.zzYGq = z;
    }

    private zzYIU zzZgd() {
        if (this.zzYGo == null) {
            this.zzYGo = zzZQT.zzT(this);
        }
        return this.zzYGo;
    }

    private void zzZgf() {
        if (this.zzZtB.zzYA5() && this.zzZtB.zzYA1().getNode().getNodeType() == 24) {
            FieldEnd fieldEnd = (FieldEnd) this.zzZtB.zzYA1().getNode();
            if (fieldEnd.hasSeparator()) {
                this.zzZtB = fieldEnd.getField().zzZgF();
            }
        }
    }

    public final Field getField() {
        return this.zzZz7;
    }

    public final String getText() {
        zzZge();
        return this.zzZi;
    }

    public final String zzW2(boolean z) {
        return zzZPA.zzZ(getText(), this.zzZtB, z && this.zzYGq);
    }

    public final zzZR8 zzX(zzYWB zzywb) {
        return new zzZR8(this.zzZz7, this.zzZi, this.zzYGo, zzywb, this.zzYGp, this.zzYGq);
    }

    public final zzYWB zzZg9() {
        return this.zzYGp;
    }

    @Override // com.aspose.words.zzZB2
    public final zzYWB zzZgF() {
        return this.zzZtB;
    }

    public final zzYWB zzZga() {
        return this.zzZtB;
    }

    public final boolean zzZgb() {
        return zzZOO.zzM(this.zzZtB);
    }

    public final boolean zzZgc() {
        return this.zzYGq;
    }

    public final void zzZge() {
        if (this.zzZi == null) {
            this.zzZi = zzZQT.zzU(this);
        }
    }

    @Override // com.aspose.words.zzZBF
    public final void zzZgg() {
        this.zzZi = null;
        this.zzYGo = null;
        zzZgf();
    }

    @Override // com.aspose.words.zzZB2
    public final zzTL zzZgh() {
        return new zzY94(zzW2(true));
    }

    public final boolean zzZgi() {
        Iterator<Node> it = this.zzZtB.iterator();
        while (it.hasNext()) {
            if (it.next().getNodeType() == 22) {
                return true;
            }
        }
        return false;
    }

    public final zzYIU zzZgj() {
        return zzZPA.zzZ(zzZgd(), this.zzZtB, this.zzYGq);
    }
}
