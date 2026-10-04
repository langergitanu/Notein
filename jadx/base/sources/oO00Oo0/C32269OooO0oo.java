package oO00Oo0;

import OooOo.C20485OooOoO;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO00Oo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32269OooO0oo extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public C32269OooO0oo(String str, int i, int i2) {
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "Not enough free space to write ", str, " of ", " bytes, available ");
        sbOooO0OO.append(i2);
        sbOooO0OO.append(" bytes.");
        String message = sbOooO0OO.toString();
        OooOOO0.OooO0oO(message, "message");
        super(message);
    }
}
