package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzB2 implements zzZC7 {
    private zzB4 zzZ7G;

    public zzB2(zzB4 zzb4) {
        this.zzZ7G = zzb4;
    }

    private com.aspose.words.internal.zzZL zzX(zz50 zz50Var) throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzR1 = this.zzZ7G.zzZF0().zzR1();
        zzzopZzR1.zzU(0L, 0);
        com.aspose.words.internal.zzDW zzdwZz9 = com.aspose.words.internal.zzDV.zz9(zzzopZzR1);
        com.aspose.words.internal.zzP9 zzp9ZzZ = zzZ(zzdwZz9, this.zzZ7G.zzZTh());
        zz05 zz05VarZzZy8 = zz50Var.zzZy8();
        zz05VarZzZy8.zzO(this.zzZ7G.zzZTh());
        try {
            zzp9ZzZ.zzZ(zz05VarZzZy8.zzY(1.0f, 1.0f, true).zzZwd(), 1);
            return com.aspose.words.internal.zzDM.zzZ(zzdwZz9, new com.aspose.words.internal.zz6L(1.0f), zzp9ZzZ);
        } finally {
            zz05VarZzZy8.zzZsa();
        }
    }

    @Override // com.aspose.words.zzZC7
    public final com.aspose.words.internal.zzZL zzZ(zz50 zz50Var) throws Exception {
        if ("application/inkml+xml".equals(this.zzZ7G.zzZF0().getContentType())) {
            return zzX(zz50Var);
        }
        zz50Var.zzZIB().zzI().zzZ(0, 2, "Rendering of '{0}' content part is not supported", this.zzZ7G.zzZF0().getContentType());
        return new com.aspose.words.internal.zzG();
    }

    private com.aspose.words.internal.zzP9 zzZ(com.aspose.words.internal.zzDW zzdw, zz07 zz07Var) {
        double dZzp = com.aspose.words.internal.zzSA.zzp(this.zzZ7G.zzZyb().getWidth());
        double dZzp2 = com.aspose.words.internal.zzSA.zzp(this.zzZ7G.zzZyb().getHeight());
        if (dZzp < 635.0d || dZzp2 < 635.0d) {
            dZzp = zz07Var.getWidth();
            dZzp2 = zz07Var.getHeight();
            if (dZzp < 1.0d || dZzp2 < 1.0d) {
                return new com.aspose.words.internal.zzP9();
            }
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ = com.aspose.words.internal.zzEE.zzZ(zzdw);
        float f = -zzzq4ZzZ.getX();
        float f2 = -zzzq4ZzZ.getY();
        float width = zzzq4ZzZ.getWidth() > 0.0f ? (float) (dZzp / ((double) zzzq4ZzZ.getWidth())) : 1.0f;
        float height = zzzq4ZzZ.getHeight() > 0.0f ? (float) (dZzp2 / ((double) zzzq4ZzZ.getHeight())) : 1.0f;
        com.aspose.words.internal.zzP9 zzp9 = new com.aspose.words.internal.zzP9();
        zzp9.zzZ(width, height, 0);
        zzp9.zzY(f, f2, 0);
        return zzp9;
    }
}
