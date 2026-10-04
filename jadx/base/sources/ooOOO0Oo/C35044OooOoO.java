package ooOOO0Oo;

import OooOoOO.C20519OooO0Oo;
import java.util.Map;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: ooOOO0Oo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35044OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo000 f125826OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo000 f125827OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<C33477OooO0OO, Oooo000> f125828OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f125829OooO0Oo;

    public C35044OooOoO() {
        throw null;
    }

    public C35044OooOoO(Oooo000 oooo000, Oooo000 oooo0002) {
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        this.f125826OooO00o = oooo000;
        this.f125827OooO0O0 = oooo0002;
        this.f125828OooO0OO = c34436OooOoOO;
        C20519OooO0Oo.OooO0OO(new C35045OooOoO0(this));
        Oooo000 oooo0003 = Oooo000.IGNORE;
        this.f125829OooO0Oo = oooo000 == oooo0003 && oooo0002 == oooo0003;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35044OooOoO)) {
            return false;
        }
        C35044OooOoO c35044OooOoO = (C35044OooOoO) obj;
        return this.f125826OooO00o == c35044OooOoO.f125826OooO00o && this.f125827OooO0O0 == c35044OooOoO.f125827OooO0O0 && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125828OooO0OO, c35044OooOoO.f125828OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = this.f125826OooO00o.hashCode() * 31;
        Oooo000 oooo000 = this.f125827OooO0O0;
        return this.f125828OooO0OO.hashCode() + ((iHashCode + (oooo000 == null ? 0 : oooo000.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f125826OooO00o + ", migrationLevel=" + this.f125827OooO0O0 + ", userDefinedLevelForSpecificAnnotation=" + this.f125828OooO0OO + ')';
    }
}
