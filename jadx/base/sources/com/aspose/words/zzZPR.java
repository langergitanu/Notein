package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPR {
    private HashMap<FieldStart, zzZ75> zzZDo = new HashMap<>();

    public final zzZ75 zzQ(FieldStart fieldStart) {
        zzZ75 zzz75 = (zzZ75) com.aspose.words.internal.zzQW.zzZ(this.zzZDo, fieldStart);
        if (zzz75 != null) {
            return zzz75;
        }
        zzZ75 zzz752 = new zzZ75();
        this.zzZDo.put(fieldStart, zzz752);
        return zzz752;
    }
}
