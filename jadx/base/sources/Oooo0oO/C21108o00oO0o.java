package Oooo0oO;

/* JADX INFO: renamed from: Oooo0oO.o00oO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21108o00oO0o<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo.OooOo<K, Object> f61256OooO00o;

    public final boolean equals(Object obj) {
        if (obj instanceof C21108o00oO0o) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61256OooO00o, ((C21108o00oO0o) obj).f61256OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61256OooO00o.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f61256OooO00o + ')';
    }
}
