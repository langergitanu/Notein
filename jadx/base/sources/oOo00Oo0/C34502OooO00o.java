package oOo00Oo0;

/* JADX INFO: renamed from: oOo00Oo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34502OooO00o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f123651OooO00o;

    public C34502OooO00o(String str) {
        this.f123651OooO00o = str;
        if (str.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C34502OooO00o.class == obj.getClass() && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f123651OooO00o, ((C34502OooO00o) obj).f123651OooO00o);
    }

    public final int hashCode() {
        return this.f123651OooO00o.hashCode();
    }

    public final String toString() {
        return "AttributeKey: " + this.f123651OooO00o;
    }
}
