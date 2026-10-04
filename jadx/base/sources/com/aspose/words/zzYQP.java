package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQP {
    private zzYQN zzXO9;

    public zzYQP() {
        this.zzXO9 = new zzYQN();
    }

    private void zz8(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        com.aspose.words.internal.zzZRW zzzrw = new com.aspose.words.internal.zzZRW(zzzop);
        while (zzzrw.zzm0()) {
            try {
                zzYQO zzyqo = new zzYQO(zzYOU.zzYf(zzzrw.zzlZ()));
                this.zzXO9.zzZ(zzyqo);
                zzzrw.zzZQ(zzyqo.zzYvo());
                zzyqo.zzYvo().zzH(0L);
            } finally {
                zzzrw.dispose();
            }
        }
    }

    public final zzYQO zzEm(String str) throws Exception {
        zzYQO zzyqo = new zzYQO(str);
        this.zzXO9.zzZ(zzyqo);
        return zzyqo;
    }

    public final zzYQO zzEn(String str) {
        return this.zzXO9.zzEl(str);
    }

    public final zzYQN zzYvp() {
        return this.zzXO9;
    }

    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, String str, ArrayList<zzYR5> arrayList) throws Exception {
        com.aspose.words.internal.zzZRU zzzru = new com.aspose.words.internal.zzZRU(zzzop);
        if (zzEn("/mimetype") == null && zzEn("mimetype") == null) {
            zzzru.zzX("mimetype", com.aspose.words.internal.zzZO0.zzhX().getBytes(str));
        }
        for (zzYQO zzyqo : this.zzXO9) {
            zzyqo.zzYvo().zzH(0L);
            if (zzYOU.zzZ(zzyqo, arrayList)) {
                zzzru.zzX(zzYOU.zzDm(zzyqo.getName()), zzyqo.zzYvo().zzWy());
            } else {
                zzzru.zzW(zzYOU.zzDm(zzyqo.getName()), zzyqo.zzYvo());
            }
        }
        zzzru.finish();
    }

    public zzYQP(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        this();
        zz8(zzzop);
    }
}
