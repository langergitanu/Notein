package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzSL extends zzZQH<String, Object> {
    private zzZOZ zzOF;

    public zzSL() {
        this(zzZOZ.zzZXP);
    }

    public final void zzZ(String str, zzSK zzsk) {
        zzB(str, zzsk);
    }

    public final zzSK zzr(String str) throws Exception {
        zzSK zzskZzs = zzs(str);
        if (zzskZzs != null) {
            return zzskZzs;
        }
        throw new IllegalStateException(zzZKN.format("Cannot find stream '{0}' in the storage.", str));
    }

    public final zzSK zzs(String str) throws Exception {
        zzSK zzsk = (zzSK) zzZKW.zzZ(zzQW.zzZ(this, str), zzSK.class);
        if (zzsk != null) {
            zzsk.zzH(0L);
        }
        return zzsk;
    }

    public zzSL(zzZOZ zzzoz) {
        super(new zzA9());
        zzZOZ zzzoz2 = zzZOZ.zzZXP;
        this.zzOF = zzzoz;
    }

    public final void zzZ(String str, zzSL zzsl) {
        zzB(str, zzsl);
    }
}
