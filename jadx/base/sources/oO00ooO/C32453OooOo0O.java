package oO00ooO;

/* JADX INFO: renamed from: oO00ooO.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32453OooOo0O implements Comparable<C32453OooOo0O> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f116655OooOo0o;

    public static String OooO00o(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C32453OooOo0O c32453OooOo0O) {
        return kotlin.jvm.internal.OooOOO0.OooO(this.f116655OooOo0o ^ Integer.MIN_VALUE, c32453OooOo0O.f116655OooOo0o ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32453OooOo0O) {
            return this.f116655OooOo0o == ((C32453OooOo0O) obj).f116655OooOo0o;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116655OooOo0o);
    }

    public final String toString() {
        return OooO00o(this.f116655OooOo0o);
    }
}
