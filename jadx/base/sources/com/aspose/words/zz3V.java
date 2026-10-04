package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
class zz3V extends zz2J {
    private HashMap<Integer, Boolean> zzZ0b = new HashMap<>();
    private zzH0 zzZ0c;

    private boolean zzZwz() throws Exception {
        if (this.zzZ0c.getImageBytes() == null) {
            return false;
        }
        int iHashCode = com.aspose.words.internal.zzIL.zz3(this.zzZ0c.getImageBytes()).hashCode();
        if (!this.zzZ0b.containsKey(Integer.valueOf(iHashCode))) {
            try {
                this.zzZ0b.put(Integer.valueOf(iHashCode), Boolean.valueOf(com.aspose.words.internal.zzEF.zzZt(this.zzZ0c.getImageBytes())));
            } catch (Exception unused) {
                this.zzZ0b.put(Integer.valueOf(iHashCode), Boolean.FALSE);
            }
        }
        return this.zzZ0b.get(Integer.valueOf(iHashCode)).booleanValue();
    }

    @Override // com.aspose.words.zzZLD
    public final void setHRef(String str) {
        super.setHRef(str);
        if (com.aspose.words.internal.zzZYD.zzXk(str) || !(zzZyc() == null || zzZyc().zzZxV() == null || zzZyc().zzZxV().zzZxZ() == null)) {
            zzZ(zzZyc() == null ? new zz4N() : zzZyc());
            zz4T zz4tZzZxV = zzZyc().zzZxV();
            if (zz4tZzZxV == null) {
                zz4tZzZxV = new zz4T(this.zzZBi.getId(), "");
            }
            zz4tZzZxV.zzZ(zz4tZzZxV.zzZxZ() == null ? new zz6P() : zz4tZzZxV.zzZxZ());
            zz4tZzZxV.zzZxZ().setId(str);
            zzZyc().zzY(zz4tZzZxV);
        }
    }

    @Override // com.aspose.words.zz2J, com.aspose.words.zz7S, com.aspose.words.zz53
    public final zz53 zzY(boolean z, zzZA5 zzza5) {
        zz3V zz3v = (zz3V) super.zzY(z, zzza5);
        zzH0 zzh0 = this.zzZ0c;
        if (zzh0 != null) {
            zz3v.zzZ0c = (zzH0) zzh0.zzZQ6();
        }
        return zz3v;
    }

    public final void zzZ(zzH0 zzh0) {
        this.zzZ0c = zzh0;
    }

    @Override // com.aspose.words.zz7S
    public final boolean zzZFk() throws Exception {
        return super.zzZFk() || zzZwz();
    }

    @Override // com.aspose.words.zz53
    public final int zzZHY() {
        return 2;
    }

    public final zzH0 zzZwy() {
        return this.zzZ0c;
    }
}
