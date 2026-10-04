package com.aspose.words.net.System.Data;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
final class zzS {
    private final DataColumn zzWQI;
    private final boolean zzZy2;

    public zzS(DataColumn dataColumn) {
        if (dataColumn == null) {
            throw new IllegalArgumentException("Column cannot be null");
        }
        this.zzWQI = dataColumn;
        this.zzZy2 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzS.class == obj.getClass()) {
            zzS zzs = (zzS) obj;
            if (this.zzZy2 == zzs.zzZy2 && this.zzWQI.equals(zzs.zzWQI)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zzWQI, Boolean.valueOf(this.zzZy2));
    }

    public final DataColumn zzXQ1() {
        return this.zzWQI;
    }
}
