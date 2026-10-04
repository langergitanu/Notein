package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzUO {
    private int zzZv4;
    private zzZ55 zzZv5;
    private zzZ55 zzZv6;

    public zzUO(zzUN zzun) throws Exception {
        zzTC zztc = (zzTC) zzun.zz6x();
        if (zztc.zz60() != 8) {
            this.zzZv6 = (zzZ55) zztc;
            return;
        }
        zzYMM zzymmZzQ = zzYJP.zzQ(((zzYIA) zztc).zza5().zza6());
        if (zzymmZzQ == null || zzY9R.zzmW(((zzYAU) zzymmZzQ.zzYos().zz6x()).zzZo6())) {
            return;
        }
        this.zzZv6 = zzymmZzQ.zzYos();
    }

    public final boolean moveNext() throws Exception {
        zzZ55 zzz55 = this.zzZv6;
        if (zzz55 == null) {
            return false;
        }
        zzZ55 zzz552 = this.zzZv5;
        if (zzz552 == null) {
            this.zzZv5 = zzz55;
            this.zzZv4 = zzz55.getY();
            return true;
        }
        zzYMD zzymdZz5Z = zzz552.zz5Z();
        int height = this.zzZv5.getHeight();
        if (zzymdZz5Z == null) {
            return false;
        }
        if (zzymdZz5Z.zz60() == 8) {
            zzYMM zzymmZzQ = zzYJP.zzQ((zzY6N) ((zzYIC) ((zzYIA) zzymdZz5Z).zza9()).zza9());
            if (zzymmZzQ == null || zzY9R.zzmW(((zzYAU) zzymmZzQ.zzYos().zz6x()).zzZo6())) {
                return false;
            }
            this.zzZv5 = zzymmZzQ.zzYos();
        } else {
            this.zzZv5 = (zzZ55) zzymdZz5Z;
        }
        this.zzZv4 += height;
        return true;
    }

    public final int zzZZL() throws Exception {
        return this.zzZv4 + this.zzZv5.getHeight();
    }

    public final int zzZZM() {
        return this.zzZv4;
    }

    public final zzZ55 zzZZN() {
        return this.zzZv5;
    }

    public final void zzZZO() throws Exception {
        while (moveNext()) {
        }
    }
}
