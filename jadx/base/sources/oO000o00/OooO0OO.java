package oO000o00;

import com.google.common.base.MoreObjects;
import java.util.concurrent.ScheduledExecutorService;
import oO0OOo0o.AbstractC33061OooO0o0;
import oO0OOo0o.AbstractC33087Oooo0o0;
import oO0OOo0o.ExecutorC33121o00ooo;
import oO0OOo0o.OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO0OO extends AbstractC33087Oooo0o0.AbstractC33089OooO0o0 {
    @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
    public AbstractC33087Oooo0o0.OooO OooO00o(AbstractC33087Oooo0o0.OooO0O0 oooO0O0) {
        return OooO0oO().OooO00o(oooO0O0);
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
    public final AbstractC33061OooO0o0 OooO0O0() {
        return OooO0oO().OooO0O0();
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
    public final ScheduledExecutorService OooO0OO() {
        return OooO0oO().OooO0OO();
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
    public final ExecutorC33121o00ooo OooO0Oo() {
        return OooO0oO().OooO0Oo();
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
    public void OooO0o(OooOOO oooOOO, AbstractC33087Oooo0o0.OooOO0 oooOO02) {
        OooO0oO().OooO0o(oooOOO, oooOO02);
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0.AbstractC33089OooO0o0
    public final void OooO0o0() {
        OooO0oO().OooO0o0();
    }

    public abstract AbstractC33087Oooo0o0.AbstractC33089OooO0o0 OooO0oO();

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", OooO0oO()).toString();
    }
}
