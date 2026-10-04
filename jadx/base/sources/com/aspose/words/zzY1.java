package com.aspose.words;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1 extends zzTN {
    private boolean zzZs;

    public zzY1(boolean z) {
        this.zzZs = z;
    }

    public final String toString() {
        return this.zzZs ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE;
    }

    @Override // com.aspose.words.zzTN
    public final boolean zz8Z() {
        return false;
    }

    @Override // com.aspose.words.zzTN
    public final boolean zzZ(zzZRE zzzre) {
        return this.zzZs;
    }
}
