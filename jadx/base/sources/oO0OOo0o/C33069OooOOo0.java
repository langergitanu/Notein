package oO0OOo0o;

import com.google.common.base.Preconditions;
import java.util.concurrent.TimeoutException;
import oO0OOo0o.o00Oo0;

/* JADX INFO: renamed from: oO0OOo0o.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33069OooOOo0 {
    public static o00Oo0 OooO00o(C33065OooOOOo c33065OooOOOo) {
        Preconditions.checkNotNull(c33065OooOOOo, "context must not be null");
        if (!c33065OooOOOo.Oooo00o()) {
            return null;
        }
        Throwable thOooOOO0 = c33065OooOOOo.OooOOO0();
        if (thOooOOO0 == null) {
            return o00Oo0.f119716OooO0o.OooO0oo("io.grpc.Context was cancelled without error");
        }
        if (thOooOOO0 instanceof TimeoutException) {
            return o00Oo0.f119719OooO0oo.OooO0oo(thOooOOO0.getMessage()).OooO0oO(thOooOOO0);
        }
        o00Oo0 o00oo0OooO0o0 = o00Oo0.OooO0o0(thOooOOO0);
        return (o00Oo0.OooO00o.UNKNOWN.equals(o00oo0OooO0o0.f119728OooO00o) && o00oo0OooO0o0.f119730OooO0OO == thOooOOO0) ? o00Oo0.f119716OooO0o.OooO0oo("Context cancelled").OooO0oO(thOooOOO0) : o00oo0OooO0o0.OooO0oO(thOooOOO0);
    }
}
