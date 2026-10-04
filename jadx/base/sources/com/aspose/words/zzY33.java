package com.aspose.words;

import OooOoo.C20593OooO0Oo;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY33 {
    private com.aspose.words.internal.zzZQH<String, String> zzWZy = new com.aspose.words.internal.zzZQH<>(new zzMQ());

    public final void add(String str, int i) {
        add(str, com.aspose.words.internal.zzJB.zzWD(i));
    }

    public final String zzZXu() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.zzWZy) {
            if (sb.length() > 0) {
                sb.append(';');
            }
            com.aspose.words.internal.zzZNH.zzU(sb, entry.getKey());
            sb.append(':');
            com.aspose.words.internal.zzZNH.zzU(sb, entry.getValue());
        }
        return sb.toString();
    }

    public final void zzzT(String str) {
        if (!com.aspose.words.internal.zzS0.zzk(str)) {
            str = C20593OooO0Oo.OooO0O0("'", str, "'");
        }
        add("font-family", str);
    }

    public final void add(String str, String str2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            this.zzWZy.zzB(str, str2);
        }
    }
}
