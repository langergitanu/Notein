package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRE {
    private com.aspose.words.internal.zzZYG<zzZRF> zzYHH = new com.aspose.words.internal.zzZYG<>();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (zzZRF zzzrf : this.zzYHH.zzCJ()) {
            if (sb.length() > 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, "; ");
            }
            com.aspose.words.internal.zzZNH.zzZ(sb, zzzrf);
        }
        return sb.toString();
    }

    public final zzZRF zzMo(String str) {
        return this.zzYHH.get(str);
    }

    public final void zzZ(zzZRF zzzrf) {
        this.zzYHH.set(zzzrf.getName(), zzzrf);
    }
}
