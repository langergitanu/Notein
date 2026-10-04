package oO00ooO;

/* JADX INFO: renamed from: oO00ooO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32452OooOo00 implements Comparable<C32452OooOo00> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte f116654OooOo0o;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C32452OooOo00 c32452OooOo00) {
        return kotlin.jvm.internal.OooOOO0.OooO(this.f116654OooOo0o & 255, c32452OooOo00.f116654OooOo0o & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32452OooOo00) {
            return this.f116654OooOo0o == ((C32452OooOo00) obj).f116654OooOo0o;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f116654OooOo0o);
    }

    public final String toString() {
        return String.valueOf(this.f116654OooOo0o & 255);
    }
}
