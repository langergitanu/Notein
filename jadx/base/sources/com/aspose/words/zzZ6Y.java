package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ6Y extends zzZ6S {
    private int zzYgn;

    public zzZ6Y(zzYMD zzymd) {
        super(zzymd);
        this.zzYgn = Integer.MIN_VALUE;
    }

    private int zzYTE() throws Exception {
        if (this.zzYgn == Integer.MIN_VALUE) {
            this.zzYgn = zzUZ.zzS((zzUZ) this.zzYgm);
        }
        return this.zzYgn;
    }

    @Override // com.aspose.words.zzZ6S
    public final void zzZ(zzZ61 zzz61) throws Exception {
        zzUZ zzuz = (zzUZ) this.zzYgm;
        zzz61.zzZ(this);
        Iterator<zzUZ> it = zzuz.zz0c().iterator();
        while (it.hasNext()) {
            new zzZ6Z(it.next(), this.zzYgm.zzYK(), zzYTE()).zzZ(zzz61);
        }
        zzz61.zzYTY();
    }
}
