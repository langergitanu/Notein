package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZS0 {
    private ArrayList<zzZOF> zzYI3 = new ArrayList<>();
    private boolean zzYI4 = true;
    private zzZS1 zzYI5;

    private void flush() throws Exception {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYI3, this.zzYI5.zzZhk());
        this.zzYI5 = null;
    }

    public abstract zzZS1 zz7a();

    public final void zzY(int i, int i2, zzZ8Q zzz8q) throws Exception {
        if (this.zzYI4) {
            this.zzYI5 = zz7a();
            this.zzYI4 = false;
        }
        if (this.zzYI5.zzZ(i, i2, zzz8q)) {
            return;
        }
        flush();
        zzZS1 zzzs1Zz7a = zz7a();
        this.zzYI5 = zzzs1Zz7a;
        if (!zzzs1Zz7a.zzZ(i, i2, zzz8q)) {
            throw new IllegalStateException("Cannot add PX to the FKP.");
        }
    }

    public final zzZZH zzZo(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        flush();
        zzZZH zzzzh = new zzZZH(4);
        for (int i = 0; i < this.zzYI3.size(); i++) {
            zzZOF zzzof = this.zzYI3.get(i);
            int position = ((int) zzzop.getPosition()) / 512;
            zzzop.write(zzzof.getData(), 0, zzzof.getData().length);
            zzzzh.zzZ(zzzof.zzZaf().getStart(), zzzof.zzZaf().getEnd(), new zzXM(position));
        }
        return zzzzh;
    }
}
