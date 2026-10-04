package kotlin.jvm.internal;

/* JADX INFO: renamed from: kotlin.jvm.internal.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C24024OooOo0 implements InterfaceC24016OooO0o0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Class<?> f80937OooOo0o;

    public C24024OooOo0(Class<?> jClass, String str) {
        OooOOO0.OooO0oO(jClass, "jClass");
        this.f80937OooOo0o = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC24016OooO0o0
    public final Class<?> OooO() {
        return this.f80937OooOo0o;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24024OooOo0) {
            return OooOOO0.OooO0O0(this.f80937OooOo0o, ((C24024OooOo0) obj).f80937OooOo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f80937OooOo0o.hashCode();
    }

    public final String toString() {
        return this.f80937OooOo0o + " (Kotlin reflection is not available)";
    }
}
