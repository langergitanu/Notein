package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYU {
    private com.aspose.words.internal.zzZQC<zzZUZ> zzZDL = new com.aspose.words.internal.zzZQC<>();

    private static boolean zzY(zzZIH zzzih) {
        int i;
        return "body".equals(zzzih.zzYra.zzZTQ()) || (i = zzzih.zzYr4) == 5 || i == 13;
    }

    public final void zzZ(zzZIH zzzih) {
        zzQ4 zzq4;
        zzQ4 zzq42;
        if (zzzih == null) {
            return;
        }
        zzQ4 zzq43 = (zzQ4) com.aspose.words.internal.zzZKW.zzZ(zzzih.zzMj(0).zzSx("background-color"), zzQ4.class);
        if (zzq43 != null && zzq43.zzZWj().zzP(zzL4.zzZnp)) {
            zzq43 = null;
        }
        boolean z = "html".equals(zzzih.zzYra.zzZTQ()) || "body".equals(zzzih.zzYra.zzZTQ());
        zzQ4 zzq4ZzZjE = zzad().zzZjE();
        zzQ4 zzq4ZzZjD = zzad().zzZjD();
        if (z || zzq43 == null) {
            zzq4 = zzq4ZzZjE;
            zzq42 = zzq4ZzZjD;
        } else if (zzzih.zzYr8) {
            zzq4 = zzq43;
            zzq42 = null;
        } else {
            zzq4 = zzq4ZzZjE;
            zzq42 = zzq43;
        }
        this.zzZDL.push(new zzZUZ(zzq4, zzq42, z, zzad(), zzY(zzzih)));
    }

    public final zzZUZ zzad() {
        return (this.zzZDL.size() == 0 || this.zzZDL.peek().zzZjC()) ? zzZUZ.zzZjB() : this.zzZDL.peek();
    }

    public final void zzae() {
        if (this.zzZDL.size() == 0) {
            return;
        }
        this.zzZDL.pop();
    }
}
