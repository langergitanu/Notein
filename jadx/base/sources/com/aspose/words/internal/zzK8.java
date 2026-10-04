package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzK8 extends zzJP {
    private boolean zzBH;
    private String zzBI;

    public static Iterable<zzGR> zzZ(String str, boolean z, zzF4 zzf4) {
        try {
            if (!zzZYD.zzXk(str)) {
                return new ArrayList();
            }
            ArrayList<String> arrayListZzU = zzJ9.zzU(str, z);
            Collections.sort(arrayListZzU, zzZYN.zzc9);
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = arrayListZzU.iterator();
            while (it.hasNext()) {
                zzZQG.zzZ((ArrayList<zzKG>) arrayList, new zzKG(it.next()));
            }
            return arrayList;
        } catch (Exception e) {
            zzJP.zzZ(zzf4, zzZKN.format("Error loading font from the folder \"{0}\": {1}", str, e.getMessage()));
            return new ArrayList();
        }
    }

    @Override // com.aspose.words.internal.zzGP
    public final Iterable<zzGR> getFontDataInternal() {
        return zzZ(this.zzBI, this.zzBH, zzHq());
    }
}
