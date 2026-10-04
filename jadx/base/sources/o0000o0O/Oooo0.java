package o0000o0O;

import oO00ooO.C32442OooOO0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33781o00o0O f81676OooO00o = C33784o00ooo.OooO00o(o0OOO0o.f81796OooO0O0);

    public final AbstractC24302o0ooOO0<T> OooO00o() {
        return (AbstractC24302o0ooOO0) this.f81676OooO00o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(AbstractC24302o0ooOO0 newState) {
        C33781o00o0O c33781o00o0O;
        Object value;
        AbstractC24302o0ooOO0 abstractC24302o0ooOO0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(newState, "newState");
        do {
            c33781o00o0O = this.f81676OooO00o;
            value = c33781o00o0O.getValue();
            abstractC24302o0ooOO0 = (AbstractC24302o0ooOO0) value;
            if (!(abstractC24302o0ooOO0 instanceof C24297OoooooO ? true : kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC24302o0ooOO0, o0OOO0o.f81796OooO0O0))) {
                if (abstractC24302o0ooOO0 instanceof C24251OooO0o0) {
                    if (newState.f81803OooO00o > abstractC24302o0ooOO0.f81803OooO00o) {
                        abstractC24302o0ooOO0 = newState;
                    }
                } else if (!(abstractC24302o0ooOO0 instanceof C24280OoooO)) {
                    throw new C32442OooOO0o();
                }
            }
        } while (!c33781o00o0O.OooO(value, abstractC24302o0ooOO0));
    }
}
