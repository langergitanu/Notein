package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzBI implements zzZC7 {
    private ShapeBase zzZ7Z;
    private zzBK zzZ80;

    public zzBI(ShapeBase shapeBase) {
        this.zzZ7Z = shapeBase;
        this.zzZ80 = (zzBK) shapeBase.zzY9i();
    }

    private static com.aspose.words.internal.zz7 zzZFg() {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        com.aspose.words.internal.OooO0O0.OooO00o(zzg);
        return zzg;
    }

    public final com.aspose.words.internal.zz7 zzY(zz50 zz50Var) throws Exception {
        com.aspose.words.internal.zz7 zz7VarZzZFg = zzZFg();
        zzZ(zz50Var, zz7VarZzZFg);
        for (ShapeBase shapeBase : this.zzZ7Z.getChildNodes(0, false)) {
            if (shapeBase.zzY9h().getHidden()) {
                zz7VarZzZFg.zzX(new com.aspose.words.internal.zzG());
            } else {
                com.aspose.words.internal.zzZL zzzlZzZ = zz4Z.zzN(shapeBase).zzZ(zz50Var);
                zz7VarZzZFg.zzX(zzzlZzZ);
                zz50Var.zzZIB().zzZw8().zzZxM().put(shapeBase, zzzlZzZ);
            }
        }
        return zz2B.zzZ(this.zzZ80.zzZTe(), zz7VarZzZFg, zz50Var.zzZIB(), this.zzZ80.zzZFk());
    }

    @Override // com.aspose.words.zzZC7
    public com.aspose.words.internal.zzZL zzZ(zz50 zz50Var) throws Exception {
        zz50Var.zzZy8().zzO(this.zzZ80.zzZTh());
        try {
            return zzY(zz50Var);
        } finally {
            zz50Var.zzZy8().zzZsa();
        }
    }

    public final ShapeBase zzZFe() {
        return this.zzZ7Z;
    }

    public final zzBK zzZFf() {
        return this.zzZ80;
    }

    private void zzZ(zz50 zz50Var, com.aspose.words.internal.zz7 zz7Var) throws Exception {
        com.aspose.words.internal.zzZQ4 zzzq4ZzT;
        if (this.zzZ80.zzZHY() != 10) {
            return;
        }
        zz7X fill = this.zzZ80.getFill();
        zz4G outline = ((zz5H) this.zzZ80).getOutline();
        if (fill.zzZQ4() == 6 && outline == null) {
            return;
        }
        if (this.zzZ7Z.getParentNode().getNodeType() == 18) {
            zzzq4ZzT = this.zzZ80.zzZTh().zzZv();
        } else {
            zzzq4ZzT = com.aspose.words.internal.zzSA.zzT(this.zzZ7Z.zzY9N());
        }
        zzGR zzgr = new zzGR(this.zzZ80, zz50Var.zzZIB(), new zz1K());
        zzgr.zzZK(zzzq4ZzT);
        zzgr.zzYK(zz50Var.zzZy7());
        zzgr.zzYJ(zz50Var.zzZy6());
        zzgr.zzYI(zz50Var.zzZy5());
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4ZzT);
        zzzgZzW.zzY(fill.zzZQ4() != 6 ? fill.zzZ(zzgr) : null);
        zzzgZzW.zzX(outline != null ? outline.zzZ(zzgr, false) : null);
        zz7Var.zzX(zzzgZzW);
    }
}
