package oOo00OOO;

import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.o00O0O;

/* JADX INFO: renamed from: oOo00OOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34484OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Set f123572OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O f123573OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final EnumC34485OooO0O0 f123574OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f123575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Set<InterfaceC32637OoooOoo> f123576OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f123577OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final AbstractC33328Oooo0O0 f123578OooO0oO;

    public /* synthetic */ C34484OooO00o(o00O0O o00o0o2, boolean z, boolean z2, Set set, int i) {
        this(o00o0o2, EnumC34485OooO0O0.f123580OooOo0o, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, null);
    }

    public static C34484OooO00o OooO00o(C34484OooO00o c34484OooO00o, EnumC34485OooO0O0 enumC34485OooO0O0, boolean z, Set set, AbstractC33328Oooo0O0 abstractC33328Oooo0O0, int i) {
        o00O0O howThisTypeIsUsed = c34484OooO00o.f123573OooO0O0;
        if ((i & 2) != 0) {
            enumC34485OooO0O0 = c34484OooO00o.f123574OooO0OO;
        }
        EnumC34485OooO0O0 flexibility = enumC34485OooO0O0;
        if ((i & 4) != 0) {
            z = c34484OooO00o.f123575OooO0Oo;
        }
        boolean z2 = z;
        boolean z3 = c34484OooO00o.f123577OooO0o0;
        if ((i & 16) != 0) {
            set = c34484OooO00o.f123576OooO0o;
        }
        Set set2 = set;
        if ((i & 32) != 0) {
            abstractC33328Oooo0O0 = c34484OooO00o.f123578OooO0oO;
        }
        c34484OooO00o.getClass();
        OooOOO0.OooO0oO(howThisTypeIsUsed, "howThisTypeIsUsed");
        OooOOO0.OooO0oO(flexibility, "flexibility");
        return new C34484OooO00o(howThisTypeIsUsed, flexibility, z2, z3, set2, abstractC33328Oooo0O0);
    }

    public final Set<InterfaceC32637OoooOoo> OooO0O0() {
        return this.f123576OooO0o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34484OooO00o)) {
            return false;
        }
        C34484OooO00o c34484OooO00o = (C34484OooO00o) obj;
        return OooOOO0.OooO0O0(c34484OooO00o.f123578OooO0oO, this.f123578OooO0oO) && c34484OooO00o.f123573OooO0O0 == this.f123573OooO0O0 && c34484OooO00o.f123574OooO0OO == this.f123574OooO0OO && c34484OooO00o.f123575OooO0Oo == this.f123575OooO0Oo && c34484OooO00o.f123577OooO0o0 == this.f123577OooO0o0;
    }

    public final int hashCode() {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = this.f123578OooO0oO;
        int iHashCode = abstractC33328Oooo0O0 != null ? abstractC33328Oooo0O0.hashCode() : 0;
        int iHashCode2 = this.f123573OooO0O0.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f123574OooO0OO.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.f123575OooO0Oo ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.f123577OooO0o0 ? 1 : 0) + i;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f123573OooO0O0 + ", flexibility=" + this.f123574OooO0OO + ", isRaw=" + this.f123575OooO0Oo + ", isForAnnotationParameter=" + this.f123577OooO0o0 + ", visitedTypeParameters=" + this.f123576OooO0o + ", defaultType=" + this.f123578OooO0oO + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34484OooO00o(o00O0O howThisTypeIsUsed, EnumC34485OooO0O0 enumC34485OooO0O0, boolean z, boolean z2, Set<? extends InterfaceC32637OoooOoo> set, AbstractC33328Oooo0O0 abstractC33328Oooo0O0) {
        OooOOO0.OooO0oO(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f123572OooO00o = set;
        this.f123573OooO0O0 = howThisTypeIsUsed;
        this.f123574OooO0OO = enumC34485OooO0O0;
        this.f123575OooO0Oo = z;
        this.f123577OooO0o0 = z2;
        this.f123576OooO0o = set;
        this.f123578OooO0oO = abstractC33328Oooo0O0;
    }
}
