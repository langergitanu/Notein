package com.aspose.words.internal;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: loaded from: classes5.dex */
final class zz5L extends zz5M {
    public zz5L(String str) {
        zzXZ(zzS(str, true));
    }

    private static String zzS(String str, boolean z) {
        return zzZKN.format("app.launchURL(\"{0}\", {1});", zzZVR.zzWj(str), TelemetryEventStrings.Value.TRUE);
    }
}
