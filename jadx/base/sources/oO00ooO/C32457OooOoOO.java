package oO00ooO;

/* JADX INFO: renamed from: oO00ooO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32457OooOoOO implements Comparable<C32457OooOoOO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final short f116663OooOo0o;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C32457OooOoOO c32457OooOoOO) {
        return kotlin.jvm.internal.OooOOO0.OooO(this.f116663OooOo0o & 65535, c32457OooOoOO.f116663OooOo0o & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32457OooOoOO) {
            return this.f116663OooOo0o == ((C32457OooOoOO) obj).f116663OooOo0o;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f116663OooOo0o);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f116663OooOo0o);
    }
}
