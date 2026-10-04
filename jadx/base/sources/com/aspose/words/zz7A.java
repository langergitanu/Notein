package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz7A extends zzBI {
    public zz7A(ShapeBase shapeBase) {
        super(shapeBase);
    }

    @Override // com.aspose.words.zzBI, com.aspose.words.zzZC7
    public final com.aspose.words.internal.zzZL zzZ(zz50 zz50Var) throws Exception {
        zz50Var.zzZy8().zzO(zzZFf().zzZTh());
        try {
            zz50 zz50Var2 = new zz50(zz50Var.zzZIB());
            zz50Var2.zzXT(zzZFe().zzYzG().getSize());
            com.aspose.words.internal.zz7 zz7VarZzY = zzY(zz50Var2);
            zzZ((com.aspose.words.internal.zzG) zz7VarZzY, zz50Var.zzZy8());
            return zz7VarZzY;
        } finally {
            zz50Var.zzZy8().zzZsa();
        }
    }

    private void zzZ(com.aspose.words.internal.zzG zzg, zz05 zz05Var) {
        long jZzK = zz1O.zzK(zzZFf().zzZyb());
        com.aspose.words.internal.zzP9 zzp9ZzZwd = zz05Var.zzY(Float.intBitsToFloat((int) jZzK), com.aspose.words.internal.zzZPW.zzYz(jZzK), true).zzZwd();
        if (zzg.zzZO() == null) {
            zzg.zzW(zzp9ZzZwd);
        } else {
            zzg.zzZO().zzZ(zzp9ZzZwd, 0);
        }
    }
}
