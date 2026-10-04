package oo0o0Oo;

/* JADX INFO: renamed from: oo0o0Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34689OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34688OooOO0O f124940OooO00o;

    public C34689OooOO0o(C34688OooOO0O c34688OooOO0O) {
        this.f124940OooO00o = c34688OooOO0O;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34689OooOO0o)) {
            return false;
        }
        C34689OooOO0o c34689OooOO0o = (C34689OooOO0o) obj;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(this.f124940OooO00o, c34689OooOO0o.f124940OooO00o)) {
            return false;
        }
        c34689OooOO0o.getClass();
        return true;
    }

    public final int hashCode() {
        C34688OooOO0O c34688OooOO0O = this.f124940OooO00o;
        if (c34688OooOO0O != null) {
            return c34688OooOO0O.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.f124940OooO00o + ')';
    }
}
