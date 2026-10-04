package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYAG extends zzZQJ {
    private static Object zzXcd = new Object();
    private zzZOR zzXcc;

    public zzYAG(zzZOR zzzor) {
        this.zzXcc = zzzor;
    }

    private static Node zzS(zzYMD zzymd, boolean z) {
        while (zzymd != null) {
            if (zzymd.zz60() == 32) {
                zzYAS zzyas = (zzYAS) com.aspose.words.internal.zzZKW.zzZ(((zzYMM) zzymd.zza9()).zzZ9r(), zzYAS.class);
                if (zzyas != null && zzyas.zzY67() != null) {
                    return zzyas.zzY67();
                }
            } else {
                zzTF zztf = (zzTF) com.aspose.words.internal.zzZKW.zzZ(zzymd, zzTF.class);
                if (zztf != null) {
                    zzymd = z ? zztf.zz6x() : zztf.zz6w();
                }
            }
            return null;
        }
        return null;
    }

    private zzYN8 zzW(zzYAH zzyah) {
        zzYN8 zzyn8ZzZ8m = zzyah.zzZ8m();
        return zzyn8ZzZ8m == null ? zzZ8m() : zzyn8ZzZ8m;
    }

    private static int zzX(zzZ2D zzz2d) {
        int i = 0;
        for (zzZ2D zzz2d2 = (zzZ2D) zzz2d.zzYTo(); zzz2d2 != null; zzz2d2 = (zzZ2D) zzz2d2.zzYTo()) {
            i++;
        }
        return i;
    }

    public abstract zzYAH zzI(FieldStart fieldStart) throws Exception;

    @Override // com.aspose.words.zzZQJ
    public final int zzR(Field field) throws Exception {
        zzYAH zzyahZzI = zzI(field.getStart());
        if (zzyahZzI == null) {
            return -1;
        }
        zzyahZzI.zzZU(field);
        return zzyahZzI.zzX(this.zzXcc);
    }

    @Override // com.aspose.words.zzZQJ
    public final int zzV(FieldStart fieldStart) throws Exception {
        zzYN8 zzyn8ZzZ8m;
        zzYAH zzyahZzI = zzI(fieldStart);
        if (zzyahZzI == null || (zzyn8ZzZ8m = zzyahZzI.zzZ8m()) == null) {
            return -1;
        }
        return zzX((zzZ2D) zzyn8ZzZ8m.zza9());
    }

    public abstract boolean zzY5w();

    @Override // com.aspose.words.zzZQJ
    public final Paragraph zzZ(FieldStart fieldStart, zzZPS zzzps) throws Exception {
        zzYAH zzyahZzI = zzI(fieldStart);
        if (zzyahZzI == null) {
            return null;
        }
        zzZ75 zzz75ZzQ = this.zzXcc.zzZaK().zzQ(fieldStart);
        zzYN8 zzyn8ZzW = zzW(zzyahZzI);
        for (zzYN8 zzyn8 = zzyn8ZzW; zzyn8 != zzz75ZzQ.zzYUn() && zzyn8 != null; zzyn8 = (zzYN8) zzyn8.zzYo0()) {
            Object objZzZ = zzZ(zzyn8, zzyn8, zzzps);
            if (objZzZ != null && objZzZ != zzXcd) {
                Paragraph paragraph = (Paragraph) objZzZ;
                if (zzzps.zzp(paragraph)) {
                    zzz75ZzQ.zzS(zzyn8ZzW);
                    zzz75ZzQ.zzZF(paragraph);
                }
                return paragraph;
            }
            zzzps.zzZcF();
        }
        if (zzzps.zzp(null)) {
            zzz75ZzQ.zzS(zzyn8ZzW);
        }
        return zzzps.zzZH(zzz75ZzQ.zzYUo());
    }

    public abstract zzYN8 zzZ8m();

    @Override // com.aspose.words.zzZQJ
    public final zzZOR zzZeh() {
        return this.zzXcc;
    }

    public abstract void zzZp(zzYAU zzyau);

    @Override // com.aspose.words.zzZQJ
    public final void zzZ(FieldStart fieldStart, zzZ9R zzz9r) throws Exception {
        zzYAH zzyahZzI = zzI(fieldStart);
        if (zzyahZzI == null) {
            return;
        }
        for (zzYN8 zzyn8ZzW = zzW(zzyahZzI); zzyn8ZzW != null; zzyn8ZzW = (zzYN8) zzyn8ZzW.zzYo0()) {
            Node nodeZzS = zzS(zzyn8ZzW, true);
            Node nodeZzS2 = zzS(zzyn8ZzW, false);
            if (nodeZzS != null && nodeZzS2 != null && zzz9r.zzZ(new zzYWB(nodeZzS, nodeZzS2), zzyn8ZzW)) {
                return;
            }
        }
    }

    private static Object zzZ(zzYN8 zzyn8, zzTF zztf, zzZPS zzzps) throws Exception {
        zzYMD zzymdZz6w;
        Object objZzZ;
        Paragraph paragraphZzZH;
        if (zzzps.zz4r()) {
            zzymdZz6w = zztf.zz6x();
        } else {
            zzymdZz6w = zztf.zz6w();
        }
        while (zzymdZz6w != null) {
            if (zzymdZz6w.zz60() == 32) {
                zzYMM zzymm = (zzYMM) zzymdZz6w.zza9();
                zzYAS zzyas = (zzYAS) com.aspose.words.internal.zzZKW.zzZ(zzymm.zzZ9r(), zzYAS.class);
                if (zzyas != null && zzyas.zzY67() != null && (paragraphZzZH = zzzps.zzZH(zzyas.zzY67())) != null) {
                    return paragraphZzZH;
                }
                zzymdZz6w = zzzps.zz4r() ? zzymm.zzYSj() : zzymm.zzYos();
                if (zzymdZz6w.zzZ8m() != zzyn8) {
                    return zzXcd;
                }
            } else {
                zzTF zztf2 = (zzTF) com.aspose.words.internal.zzZKW.zzZ(zzymdZz6w, zzTF.class);
                if (zztf2 != null && (objZzZ = zzZ(zzyn8, zztf2, zzzps)) != null) {
                    return objZzZ;
                }
            }
            if (zzzps.zz4r()) {
                zzymdZz6w = zzymdZz6w.zz5Z();
            } else {
                zzymdZz6w = zzymdZz6w.zz5Y();
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZQJ
    public final boolean zzZ(Field field, boolean z) throws Exception {
        zzYAH zzyahZzI;
        if ((!z && !zzZOO.zzCv(field.getType())) || zzY5w() != field.zzZgt() || (zzyahZzI = zzI(field.getStart())) == null) {
            return false;
        }
        zzyahZzI.zzZ(field, this, z);
        return true;
    }
}
