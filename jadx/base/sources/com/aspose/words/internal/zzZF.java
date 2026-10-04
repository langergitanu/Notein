package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZF extends zz6 {
    private zzZL zzYp;
    private ArrayList<zz7> zzYq = new ArrayList<>();

    private zzZF(zzZL zzzl) {
        this.zzYp = zzzl;
    }

    public static void zzR(zzZL zzzl) throws Exception {
        zzZF zzzf = new zzZF(zzzl);
        zzzf.zzYY();
        zzzf.zzYX();
    }

    private void zzS(zz7 zz7Var) {
        if (zz7Var.getCount() == 0) {
            return;
        }
        zz7 zz7Var2 = zz7Var;
        zzZL zzzl = zz7Var2;
        while (zz7Var2.zzZ5() != null) {
            zz7 zz7VarZzZ5 = zz7Var2.zzZ5();
            boolean zContains = this.zzYq.contains(zz7VarZzZ5);
            zzzl = zz7Var2;
            zz7Var2 = zz7VarZzZ5;
            if (!zContains) {
                break;
            }
        }
        int iZzW = zz7Var2.zzW(zzzl);
        int i = 0;
        while (i < zz7Var.getCount()) {
            zz7Var2.zzZ(iZzW, zz7Var.zzN(i));
            i++;
            iZzW++;
        }
    }

    private void zzT(zz7 zz7Var) {
        if (zz7Var.zzZ5() == null) {
            return;
        }
        if (zz7Var.getCount() > 0) {
            zzS(zz7Var);
        }
        zz7Var.zzZ6();
    }

    private void zzYX() {
        Iterator<zz7> it = this.zzYq.iterator();
        while (it.hasNext()) {
            zzT(it.next());
        }
    }

    private void zzYY() throws Exception {
        this.zzYp.zzZ(this);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) {
        if (zzS(zzg)) {
            zzZQG.zzZ((ArrayList<zzG>) this.zzYq, zzg);
        }
    }

    private static boolean zzS(zzG zzg) {
        if (zzg.getCount() == 0) {
            return true;
        }
        if (zzg.zzZK()) {
            return false;
        }
        return zzg.zzZN() == null && zzg.zzZM() == null && !(zzg.zzZO() != null && !zzg.zzZO().isIdentity()) && !zzg.zzZL();
    }
}
