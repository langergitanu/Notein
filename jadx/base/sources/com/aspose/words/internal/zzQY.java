package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzQY implements zzG3 {
    private zzZWX zzLL;
    private zzSR zzLM;
    private zz0V zzLN;
    private zzTR zzLO;
    private zzZWS zzLP;
    private zzG1 zzLQ;
    private zzGN zzLR;
    private zzYW zzLS;
    private zzGX zzLT;
    private zzFS zzUa;
    private zzZQC<zzSR> zzYA = new zzZQC<>();
    private zzZQC<zzYZ> zzLU = new zzZQC<>();

    public zzQY(zzZWS zzzws, zzGX zzgx, zzFS zzfs, zzYW zzyw, zzGN zzgn, zzG1 zzg1) {
        this.zzLP = zzzws;
        this.zzLT = zzgx;
        this.zzUa = zzfs;
        this.zzLS = zzyw;
        this.zzLR = zzgn;
        this.zzLQ = zzg1;
        this.zzYA.push(zzzws);
    }

    private boolean zzI(Object obj) {
        zz0V zz0v = this.zzLN;
        if (zz0v == null) {
            return false;
        }
        Object objZzEW = zz0v.zzsB().zzEW();
        Object objZzEV = this.zzLN.zzsB().zzEV();
        zzFS zzfs = this.zzUa;
        if (objZzEV != null) {
            objZzEW = objZzEV;
        }
        Object objZzF = zzfs.zzF(objZzEW);
        if (objZzF == null) {
            return false;
        }
        return objZzF.equals(this.zzUa.zzF(obj));
    }

    private void zzJ(Object obj) {
        zz0V zz0v = this.zzLN;
        if (zz0v != null && zz0v.zzsB().zzEU() == 2 && this.zzLN.zzsB().zzEV() != null && zzI(obj)) {
            throw zz7W.zzX("Cannot place a placeholder in the same cell after the end of a {0} affecting table columns.", this.zzLN.getClass());
        }
    }

    private boolean zzQJ() {
        return this.zzLL != null;
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzQ(int i, zzH0 zzh0) {
        this.zzLO.zzV(i, zzh0);
    }

    public final boolean zzQK() {
        return this.zzYA.pop() == this.zzLP;
    }

    @Override // com.aspose.words.internal.zzG3
    public final boolean zzQL() {
        return this.zzLO != null;
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzQM() {
        this.zzLO.zzU4();
        zzX(this.zzLO);
        this.zzLT.zzIx().zzII().zzX(this.zzLO.zzYB());
        this.zzLO = null;
    }

    public final void zzQN() {
        this.zzLL = null;
        this.zzLM = null;
        zzSR zzsrPeek = this.zzYA.peek();
        if (zzsrPeek.zzsB().zzEU() == 2) {
            throw new zzCW(zzZKN.format("All {0} of the same table region must end on the same table row.", "data bands and conditional blocks affecting table columns"), null, zzsrPeek.getClass());
        }
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzR(int i, zzH0 zzh0) {
        this.zzLO.zzY(i, this.zzLT.zzS(zzh0));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzS(int i, zzH0 zzh0) {
        this.zzLO.zzW(i, zzh0);
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzT(int i, zzH0 zzh0) {
        this.zzLO.zzX(i, zzh0);
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzU(int i, zzH0 zzh0) {
        this.zzLO.zzZ(i, this.zzLT.zzS(zzh0));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzV(Object obj, String str) {
        zzXJ zzxj = (zzXJ) zzZKW.zzZ(this.zzYA.pop(), zzXJ.class);
        if (zzxj == null) {
            throw new zzCW("A bookmark end is not expected.");
        }
        zzZ((zzSR) zzxj, obj, false, str);
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzW(Object obj, String str) {
        zzZWR zzzwr = (zzZWR) zzZKW.zzZ(this.zzYA.pop(), zzZWR.class);
        if (zzzwr == null) {
            throw new zzCW("A text color setting end is not expected.");
        }
        zzZ((zzSR) zzzwr, obj, false, str);
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzX(Object obj, boolean z, String str) {
        zzSH zzsh = (zzSH) zzZKW.zzZ(this.zzYA.pop(), zzSH.class);
        if (zzsh == null) {
            throw new zzCW("A condition end is not expected.");
        }
        zzZ(zzsh, obj, z, str);
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzY(zzH0 zzh0, int i) {
        this.zzLO.zzZ(this.zzLT.zzS(zzh0), i);
    }

    public final void zzZ(zzZWX zzzwx) {
        this.zzLL = zzzwx;
        this.zzLM = this.zzYA.peek();
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr, zzH0 zzh0, String str, int i, int i2, boolean z) {
        zzX(new zzZWN(zzzzr, zzh0, str, i, i2, z));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzW(Object obj, zzH0 zzh0, String str) {
        zzZ(new zzXJ(new zzZZR(obj), zzh0, str));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzX(Object obj, String str) {
        zzZ0 zzz0 = (zzZ0) zzZKW.zzZ(this.zzYA.pop(), zzZ0.class);
        if (zzz0 != null) {
            zzZ((zzSR) zzz0, obj, false, str);
            return;
        }
        throw new zzCW("A background color setting end is not expected.");
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzY(int i, zzH0 zzh0, int i2) {
        this.zzLO.zzZ(i, this.zzLT.zzS(zzh0), i2);
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr, zzH0 zzh0, boolean z) {
        zzX(new zzZWN(zzzzr, zzh0, z));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr, zzH0 zzh0, int i) {
        zzX(new zzEJ(zzzzr, zzh0, i));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr, zzH0 zzh0, zzYY zzyy) {
        zzX(new zzYX(zzzzr, zzh0, zzyy, this.zzLS));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzX(Object obj, zzH0 zzh0, String str) {
        this.zzYA.push(new zzZWR(new zzZZR(obj), zzh0, str));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzY(zzZZR zzzzr) {
        zzX(new zzBQ(zzzzr));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr, zzH0 zzh0, boolean z, boolean z2, boolean z3) {
        zzX(new zzQQ(zzzzr, zzh0, this.zzUa.zzEP(), z2, z3, z ? this.zzLQ.zzIK() : null));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzY(zzZZR zzzzr, zzH0 zzh0, zzH0 zzh02) {
        zzX(new zzOF(zzzzr, zzh0, zzh02));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzY(Object obj, boolean z, String str) {
        if (z) {
            zzZ(obj, 1);
        }
        zzZ(new zzSH(new zzZZR(obj, z), str));
    }

    private void zzX(zz0V zz0v) {
        if (zzQJ() && zz0v.zzsB().zzEU() != 2) {
            zzJ(zz0v.zzsB().zzEW());
        }
        this.zzYA.peek().zzZ(zz0v, this.zzLU.size() != 0 ? this.zzLU.peek() : null);
        this.zzLN = zz0v;
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr, zzH0 zzh0, zzH0 zzh02) {
        zzX(new zzBT(zzzzr, zzh0, zzh02));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr, zzJC zzjc, String str, int i, boolean z) {
        this.zzLO = new zzTR(zzzzr, zzjc, str, i, z);
        this.zzLT.zzIx().zzII().zzZ(this.zzLO.zzYB());
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzY(Object obj, zzH0 zzh0, String str) {
        zzZ(new zzZ0(new zzZZR(obj), zzh0, str));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(int i, boolean z, boolean z2, boolean z3) {
        this.zzLO.zzU(i, z);
        this.zzLO.zzT(i, z2);
        this.zzLO.zzS(i, z3);
    }

    private void zzY(zzSR zzsr) {
        if (this.zzUa.zzB(this.zzUa.zzF(zzsr.zzsB().zzEW())) != this.zzUa.zzB(this.zzUa.zzF(zzsr.zzsB().zzEV()))) {
            throw new zzCW(zzZKN.format("A {0} cannot be multi-row when located in a {1}.", zz7W.zzK(zzsr.getClass()), "data band or conditional block affecting table columns"));
        }
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr) {
        zzX(new zz7P(zzzzr));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr, zzZVN zzzvn) {
        zzX(new zzZVM(zzzzr, zzzvn));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr, int i, zzH0 zzh0) {
        zzX(new zzX3(zzzzr, i, zzh0));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(zzZZR zzzzr, zzH0 zzh0) {
        zzX(new zzTO(zzzzr, zzh0));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(Object obj, zzJC zzjc, boolean z, String str) {
        if (z) {
            zzZ(obj, 0);
        }
        zzYZ zzyz = new zzYZ(new zzZZR(obj, z), zzjc, str);
        zzZ(zzyz);
        this.zzLU.push(zzyz);
        this.zzLT.zzIx().zzII().zzZ(zzyz.zzYB());
    }

    private void zzY(Object obj, int i) {
        zz0V zz0v = this.zzLN;
        if (zz0v != null && zz0v != this.zzLM && zz0v.zzsB().zzEU() != 2 && zzI(obj)) {
            throw new zzCW(zzZKN.format("A {0} affecting table columns must be the first placeholder in a cell, or the first child of another {1}, or the first child of the placeholder that includes the entire table region occupied by {2}.", zz7W.zzK(zz7W.zzUC(i)), "data band or conditional block affecting table columns", "data bands and conditional blocks affecting table columns"));
        }
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(Object obj, boolean z, String str) {
        zzYZ zzyz = (zzYZ) zzZKW.zzZ(this.zzYA.pop(), zzYZ.class);
        if (zzyz != null) {
            this.zzLU.pop();
            zzZ(zzyz, obj, z, str);
            this.zzLT.zzIx().zzII().zzX(zzyz.zzYB());
            return;
        }
        throw new zzCW("A band end is not expected.");
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(Object obj, zzH0 zzh0, String str) {
        boolean z = this.zzYA.peek().zzsB().zzEU() == 2;
        if (z) {
            zzZ(obj, 2);
        }
        zzZ((zzSH) zzZKW.zzZ(this.zzYA.peek(), zzSH.class), str);
        zzZ(new zz71(new zzZZR(obj, z), zzh0, str));
    }

    @Override // com.aspose.words.internal.zzG3
    public final void zzZ(Object obj, boolean z, boolean z2, String str) {
        zz71 zz71Var = (zz71) zzZKW.zzZ(this.zzYA.pop(), zz71.class);
        if (zz71Var != null) {
            if (zz71Var.zzsB().zzEU() == 2 && z2) {
                zzFS zzfs = this.zzUa;
                int iZzA = zzfs.zzA(zzfs.zzF(obj));
                zzZ(zz71Var, iZzA);
                zzY(obj, 2);
                obj = this.zzUa.zzZ(this.zzLL.zzVv(), this.zzLL.zzoF(), iZzA - 1);
            }
            zzZ(zz71Var, obj, z, str);
            return;
        }
        throw new zzCW("An option end is not expected.");
    }

    private void zzZ(zzSR zzsr) {
        if (zzQJ() && zzsr.zzsB().zzEU() != 2) {
            zzJ(zzsr.zzsB().zzEW());
        }
        this.zzYA.push(zzsr);
        this.zzLN = zzsr;
    }

    private void zzZ(zzSR zzsr, String str) {
        if (!zzZKN.equals(zzsr.zzSh(), str)) {
            throw new zzCW(this.zzLR.zzI(str, zzsr.zzSh()));
        }
    }

    private void zzZ(zzSR zzsr, Object obj, boolean z, String str) {
        zzSR zzsr2;
        zzZ(zzsr, str);
        zzZZR zzzzrZzsB = zzsr.zzsB();
        zzzzrZzsB.zzh(obj);
        if (z) {
            zzZ(zzsr, zzzzrZzsB);
            zzzzrZzsB.zzrQ();
        }
        if (zzQJ() && zzzzrZzsB.zzEU() != 2 && zzsr != (zzsr2 = this.zzLM) && !zzsr.zzZ(zzsr2)) {
            zzY(zzsr);
        }
        String strZzZ = this.zzUa.zzZ(zzzzrZzsB);
        if (strZzZ == null) {
            zzX(zzsr);
            return;
        }
        throw new zzCW(strZzZ);
    }

    private void zzZ(Object obj, int i) {
        zzY(obj, i);
        zzSR zzsrPeek = this.zzYA.peek();
        if (zzsrPeek != this.zzLM && zzsrPeek.zzsB().zzEU() != 2) {
            throw new zzCW(zzZKN.format("The {0} crosses the boundary of the region formed by the {1} affecting table columns.", zz7W.zzK(zzsrPeek.getClass()), zz7W.zzK(zz7W.zzUC(i))));
        }
    }

    private void zzZ(zz71 zz71Var, int i) {
        if (this.zzUa.zzA(this.zzUa.zzF(zz71Var.zzsB().zzEW())) >= i) {
            throw new zzCW(zzZKN.format("Two {0}s affecting table columns that are children of the same {1} cannot start in the same table cell.", zz7W.zzK(zz7W.zzUC(2)), zz7W.zzK(zz7W.zzUC(1))));
        }
    }

    private void zzZ(zzSR zzsr, zzZZR zzzzr) {
        if (zzzzr.zzEU() != 2) {
            if (zzQJ()) {
                throw new zzCW(zzZKN.format("Child placeholders of a {0} cannot capture a whole row.", "data band or conditional block affecting table columns"));
            }
            return;
        }
        throw zz7W.zzX("A {0} affecting table columns cannot capture a whole row.", zzsr.getClass());
    }
}
