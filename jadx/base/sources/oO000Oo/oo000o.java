package oO000Oo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import oO0OOo0o.AbstractC33087Oooo0o0;

/* JADX INFO: loaded from: classes10.dex */
public final class oo000o extends AbstractC33087Oooo0o0.OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC33087Oooo0o0.OooO0o f114766OooO00o;

    public oo000o(Throwable th) {
        oO0OOo0o.o00Oo0 o00oo0OooO0oO = oO0OOo0o.o00Oo0.f119723OooOOO.OooO0oo("Panic! This is a bug!").OooO0oO(th);
        AbstractC33087Oooo0o0.OooO0o oooO0o = AbstractC33087Oooo0o0.OooO0o.f119638OooO0o0;
        Preconditions.checkArgument(!o00oo0OooO0oO.OooO0o(), "drop status shouldn't be OK");
        this.f114766OooO00o = new AbstractC33087Oooo0o0.OooO0o(null, null, o00oo0OooO0oO, true);
    }

    @Override // oO0OOo0o.AbstractC33087Oooo0o0.OooOO0
    public final AbstractC33087Oooo0o0.OooO0o OooO00o(o0000O00 o0000o00) {
        return this.f114766OooO00o;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Class<?>) oo000o.class).add("panicPickResult", this.f114766OooO00o).toString();
    }
}
