package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzNO {
    private HashMap<String, zzNQ> zzZpx = new HashMap<>();

    public final zzNQ zzSr(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        return (zzNQ) com.aspose.words.internal.zzQW.zzZ(this.zzZpx, str);
    }

    public final void zzZ(String str, zzNQ zznq) {
        zznq.zzZVP();
        this.zzZpx.put(str, zznq);
    }

    public final zzNQ zzZVO() {
        Ref ref = new Ref(null);
        return com.aspose.words.internal.zzZQF.zzZ(this.zzZpx, "", ref) ? (zzNQ) ref.get() : zzNQ.zzZpB;
    }
}
