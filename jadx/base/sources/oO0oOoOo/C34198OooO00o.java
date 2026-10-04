package oO0oOoOo;

import java.security.Permission;
import java.util.HashSet;

/* JADX INFO: renamed from: oO0oOoOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34198OooO00o extends Permission {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final HashSet f122851OooOo0o;

    public C34198OooO00o(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.f122851OooOo0o = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C34198OooO00o) && this.f122851OooOo0o.equals(((C34198OooO00o) obj).f122851OooOo0o);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.f122851OooOo0o.toString();
    }

    public final int hashCode() {
        return this.f122851OooOo0o.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof C34198OooO00o)) {
            return false;
        }
        C34198OooO00o c34198OooO00o = (C34198OooO00o) permission;
        return getName().equals(c34198OooO00o.getName()) || this.f122851OooOo0o.containsAll(c34198OooO00o.f122851OooOo0o);
    }
}
