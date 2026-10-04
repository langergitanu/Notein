package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRT {
    private ArrayList<zzYRU> zzXPC = new ArrayList<>();

    public final zzYRU zzEI(String str) {
        for (zzYRU zzyru : this.zzXPC) {
            if (com.aspose.words.internal.zzZKN.equals(zzyru.getId(), str)) {
                return zzyru;
            }
        }
        return null;
    }

    public final void zzZ(zzYRU zzyru) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXPC, zzyru);
    }
}
