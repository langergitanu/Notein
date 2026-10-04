package oO0OOo0o;

import java.util.logging.Level;
import java.util.logging.Logger;
import oO0OOo0o.C33065OooOOOo;

/* JADX INFO: renamed from: oO0OOo0o.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33120o00oO0o extends C33065OooOOOo.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f119760OooO00o = Logger.getLogger(C33120o00oO0o.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadLocal<C33065OooOOOo> f119761OooO0O0 = new ThreadLocal<>();

    @Override // oO0OOo0o.C33065OooOOOo.OooO0o
    public final C33065OooOOOo OooO00o() {
        C33065OooOOOo c33065OooOOOo = f119761OooO0O0.get();
        return c33065OooOOOo == null ? C33065OooOOOo.f119563OooOoOO : c33065OooOOOo;
    }

    @Override // oO0OOo0o.C33065OooOOOo.OooO0o
    public final void OooO0O0(C33065OooOOOo c33065OooOOOo, C33065OooOOOo c33065OooOOOo2) {
        if (OooO00o() != c33065OooOOOo) {
            f119760OooO00o.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        C33065OooOOOo c33065OooOOOo3 = C33065OooOOOo.f119563OooOoOO;
        ThreadLocal<C33065OooOOOo> threadLocal = f119761OooO0O0;
        if (c33065OooOOOo2 != c33065OooOOOo3) {
            threadLocal.set(c33065OooOOOo2);
        } else {
            threadLocal.set(null);
        }
    }

    @Override // oO0OOo0o.C33065OooOOOo.OooO0o
    public final C33065OooOOOo OooO0OO(C33065OooOOOo c33065OooOOOo) {
        C33065OooOOOo c33065OooOOOoOooO00o = OooO00o();
        f119761OooO0O0.set(c33065OooOOOo);
        return c33065OooOOOoOooO00o;
    }
}
