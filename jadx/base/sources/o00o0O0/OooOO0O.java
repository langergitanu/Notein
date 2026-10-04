package o00o0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Class<?> f86156OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Class<?> f86157OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Class<?> f86158OooO0OO;

    public OooOO0O() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooOO0O.class != obj.getClass()) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return this.f86156OooO00o.equals(oooOO0O.f86156OooO00o) && this.f86157OooO0O0.equals(oooOO0O.f86157OooO0O0) && C25316OooOO0o.OooO0O0(this.f86158OooO0OO, oooOO0O.f86158OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = (this.f86157OooO0O0.hashCode() + (this.f86156OooO00o.hashCode() * 31)) * 31;
        Class<?> cls = this.f86158OooO0OO;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f86156OooO00o + ", second=" + this.f86157OooO0O0 + '}';
    }

    public OooOO0O(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f86156OooO00o = cls;
        this.f86157OooO0O0 = cls2;
        this.f86158OooO0OO = cls3;
    }
}
