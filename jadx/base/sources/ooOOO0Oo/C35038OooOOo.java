package ooOOO0Oo;

import java.util.Collection;
import oO0O0ooo.C32850OooOO0o;
import oO0O0ooo.EnumC32849OooOO0O;

/* JADX INFO: renamed from: ooOOO0Oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35038OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32850OooOO0o f125804OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Collection<OooO0OO> f125805OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f125806OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C35038OooOOo(C32850OooOO0o c32850OooOO0o, Collection<? extends OooO0OO> qualifierApplicabilityTypes, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f125804OooO00o = c32850OooOO0o;
        this.f125805OooO0O0 = qualifierApplicabilityTypes;
        this.f125806OooO0OO = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35038OooOOo)) {
            return false;
        }
        C35038OooOOo c35038OooOOo = (C35038OooOOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125804OooO00o, c35038OooOOo.f125804OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f125805OooO0O0, c35038OooOOo.f125805OooO0O0) && this.f125806OooO0OO == c35038OooOOo.f125806OooO0OO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        int iHashCode = (this.f125805OooO0O0.hashCode() + (this.f125804OooO00o.hashCode() * 31)) * 31;
        boolean z = this.f125806OooO0OO;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f125804OooO00o + ", qualifierApplicabilityTypes=" + this.f125805OooO0O0 + ", definitelyNotNull=" + this.f125806OooO0OO + ')';
    }

    public C35038OooOOo(C32850OooOO0o c32850OooOO0o, Collection collection) {
        this(c32850OooOO0o, collection, c32850OooOO0o.f117914OooO00o == EnumC32849OooOO0O.f117913OooOoO0);
    }
}
