package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZPS {
    public abstract boolean zz4r();

    public final Paragraph zzG(Field field) throws Exception {
        Paragraph paragraphZzZ = field.zzZgo().zzZay().zzZ(field.getStart(), this);
        if (paragraphZzZ != null) {
            return paragraphZzZ;
        }
        zzZcD();
        return zzZ(field.getStart().getAncestor(2), true, true);
    }

    public abstract Paragraph zzW(Paragraph paragraph) throws Exception;

    public final Paragraph zzZ(Node node, boolean z, boolean z2) throws Exception {
        boolean z3;
        zzZYT zzzytZzp = z ^ z2 ? zzZYT.zzp(node) : zzZYT.zzq(node);
        while (true) {
            if (z2) {
                z3 = z;
            } else {
                z3 = z;
                if (!zzzytZzp.zzZ(null, z3, true, true, false, true)) {
                    return null;
                }
            }
            Paragraph paragraphZzZH = zzZH(zzzytZzp.getNode());
            if (paragraphZzZH != null) {
                return paragraphZzZH;
            }
            z2 = false;
            z = z3;
        }
    }

    public final Paragraph zzZH(Node node) throws Exception {
        if (node == null || node.getNodeType() != 8) {
            return null;
        }
        return zzW((Paragraph) node);
    }

    public void zzZcD() {
    }

    public void zzZcE() {
    }

    public final void zzZcF() {
        zzZcE();
    }

    public boolean zzp(Paragraph paragraph) {
        return false;
    }
}
