package o00o00Oo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import o00o00oO.InterfaceC25288OooO0Oo;

/* JADX INFO: renamed from: o00o00Oo.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25270OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set<InterfaceC25288OooO0Oo> f86005OooO00o = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet f86006OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f86007OooO0OO;

    public final boolean OooO00o(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        boolean z = true;
        if (interfaceC25288OooO0Oo == null) {
            return true;
        }
        boolean zRemove = this.f86005OooO00o.remove(interfaceC25288OooO0Oo);
        if (!this.f86006OooO0O0.remove(interfaceC25288OooO0Oo) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC25288OooO0Oo.clear();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.f86005OooO00o.size());
        sb.append(", isPaused=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, "}", this.f86007OooO0OO);
    }
}
