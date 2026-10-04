package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;
import o00oO0O.o0OoOo0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzen extends IOException {
    public zzen() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzen(long j, long j2, int i, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "Pos: ", ", limit: ");
        sbOooO00o.append(j2);
        sbOooO00o.append(", len: ");
        sbOooO00o.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbOooO00o.toString()), th);
    }

    public zzen(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
