package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzAA extends zzZQH<String, Object> {
    private zzZOZ zzOF;

    public zzAA() {
        this(zzZOZ.zzZXP);
    }

    public final zzZOZ zzAC() {
        return this.zzOF;
    }

    @Override // com.aspose.words.internal.zzZQH
    /* JADX INFO: renamed from: zzV5, reason: merged with bridge method [inline-methods] */
    public final String zzV4(int i) {
        return getKeys().get(i);
    }

    @Override // com.aspose.words.internal.zzZQH
    public final Object zzVY(int i) {
        return zzl9().get(i);
    }

    public final void zzW(zzZOZ zzzoz) {
        this.zzOF = zzzoz;
    }

    public final zzAA zzYq(String str) {
        zzAA zzaaZzYr = zzYr(str);
        if (zzaaZzYr != null) {
            return zzaaZzYr;
        }
        throw new IllegalStateException(zzZKN.format("Cannot find storage '{0}'.", str));
    }

    public final zzAA zzYr(String str) {
        return (zzAA) zzZKW.zzZ(zzQW.zzZ(this, str), zzAA.class);
    }

    public final zzZOR zzYs(String str) throws Exception {
        zzZOR zzzorZzYu = zzYu(str);
        if (zzzorZzYu != null) {
            return zzzorZzYu;
        }
        throw new IllegalStateException(zzZKN.format("Cannot find stream '{0}' in the storage.", str));
    }

    public final zzZOR zzYt(String str) {
        return (zzZOR) zzZKW.zzZ(zzQW.zzZ(this, str), zzZOR.class);
    }

    public final zzZOR zzYu(String str) throws Exception {
        zzZOR zzzor = (zzZOR) zzZKW.zzZ(zzQW.zzZ(this, str), zzZOR.class);
        if (zzzor != null) {
            zzzor.zzH(0L);
        }
        return zzzor;
    }

    public final void zzZ(String str, zzZOR zzzor) {
        zzB(str, zzzor);
    }

    public zzAA(zzZOZ zzzoz) {
        super(new zzA9());
        zzZOZ zzzoz2 = zzZOZ.zzZXP;
        this.zzOF = zzzoz;
    }

    public final void zzZ(String str, zzAA zzaa) {
        zzB(str, zzaa);
    }
}
