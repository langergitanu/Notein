package o00o0oOo;

import java.io.IOException;
import o00o0o0o.C25447OooO0o;

/* JADX INFO: renamed from: o00o0oOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25459OooO0O0 {
    public static void OooO00o(C25447OooO0o c25447OooO0o, long j) throws IOException {
        if (!(j >= 0)) {
            throw new IllegalArgumentException();
        }
        while (j > 0) {
            long jSkip = c25447OooO0o.skip(j);
            if (jSkip <= 0) {
                if (c25447OooO0o.read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j -= jSkip;
        }
    }
}
