package o00oO0o;

import Oooo0oo.AbstractC21138OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00oO0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25571OooO00o extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public InterfaceC25577OooO0oO<?> f87247OooO00o;

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final boolean Oooo0oO(AbstractC25573OooO0OO<?> key) {
        OooOOO0.OooO0oO(key, "key");
        return key == this.f87247OooO00o.getKey();
    }

    @Override // Oooo0oo.AbstractC21138OooO0oo
    public final Object OoooO0O(C25570OooO key) {
        OooOOO0.OooO0oO(key, "key");
        if (key == this.f87247OooO00o.getKey()) {
            return this.f87247OooO00o.getValue();
        }
        throw new IllegalStateException("Check failed.");
    }
}
