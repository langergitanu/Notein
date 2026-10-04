package oO000Oo;

import com.google.common.base.MoreObjects;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import oO0OOo0o.AbstractC33093Oooo0oo;
import oO0OOo0o.C33082Oooo00O;
import oO0OOo0o.C33101OoooOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000OO extends AbstractC33093Oooo0oo implements oO0OOo0o.Oooo000<Object> {
    static {
        Logger.getLogger(o00000OO.class.getName());
    }

    @Override // oO0OOo0o.AbstractC33060OooO0Oo
    public final String OooO00o() {
        return null;
    }

    @Override // oO0OOo0o.Oooo000
    public final C33082Oooo00O OooO0OO() {
        return null;
    }

    @Override // oO0OOo0o.AbstractC33060OooO0Oo
    public final <RequestT, ResponseT> oO0OOo0o.OooO0o<RequestT, ResponseT> OooO0oO(C33101OoooOO0<RequestT, ResponseT> c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO) {
        Executor executor = oooO0OO.f119526OooO0O0;
        if (executor == null) {
            executor = null;
        }
        return new C31943OooOOOo(c33101OoooOO0, executor, oooO0OO, null, null, null);
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final boolean OooO0oo(long j) throws InterruptedException {
        throw null;
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final oO0OOo0o.OooOOO OooOO0() {
        return oO0OOo0o.OooOOO.f119554OooOoO;
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final AbstractC33093Oooo0oo OooOO0o() {
        oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("OobChannel.shutdown() called");
        throw null;
    }

    @Override // oO0OOo0o.AbstractC33093Oooo0oo
    public final AbstractC33093Oooo0oo OooOOO0() {
        oO0OOo0o.o00Oo0.f119725OooOOOO.OooO0oo("OobChannel.shutdownNow() called");
        throw null;
    }

    public final String toString() {
        MoreObjects.toStringHelper(this);
        throw null;
    }
}
