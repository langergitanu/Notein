package oO0O00oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO extends C32519OooO0oO implements OooO0o<Integer> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO f116803OooOoO = new OooO(1, 0, 1);

    @Override // oO0O00oo.C32519OooO0oO
    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO)) {
            return false;
        }
        if (isEmpty() && ((OooO) obj).isEmpty()) {
            return true;
        }
        OooO oooO = (OooO) obj;
        if (this.f116812OooOo0o == oooO.f116812OooOo0o) {
            return this.f116811OooOo == oooO.f116811OooOo;
        }
        return false;
    }

    @Override // oO0O00oo.OooO0o
    public final Comparable getEndInclusive() {
        return Integer.valueOf(this.f116811OooOo);
    }

    @Override // oO0O00oo.OooO0o
    public final Comparable getStart() {
        return Integer.valueOf(this.f116812OooOo0o);
    }

    @Override // oO0O00oo.C32519OooO0oO
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f116812OooOo0o * 31) + this.f116811OooOo;
    }

    @Override // oO0O00oo.C32519OooO0oO, oO0O00oo.OooO0o
    public final boolean isEmpty() {
        return this.f116812OooOo0o > this.f116811OooOo;
    }

    @Override // oO0O00oo.C32519OooO0oO
    public final String toString() {
        return this.f116812OooOo0o + ".." + this.f116811OooOo;
    }
}
