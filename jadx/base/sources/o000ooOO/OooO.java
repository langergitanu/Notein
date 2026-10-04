package o000ooOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements Comparable<OooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f83866OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f83867OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final String f83868OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final String f83869OooOoO0;

    public OooO(int i, int i2, String from, String to) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(from, "from");
        kotlin.jvm.internal.OooOOO0.OooO0oO(to, "to");
        this.f83867OooOo0o = i;
        this.f83866OooOo = i2;
        this.f83869OooOoO0 = from;
        this.f83868OooOoO = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(OooO oooO) {
        OooO other = oooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        int i = this.f83867OooOo0o - other.f83867OooOo0o;
        return i == 0 ? this.f83866OooOo - other.f83866OooOo : i;
    }
}
