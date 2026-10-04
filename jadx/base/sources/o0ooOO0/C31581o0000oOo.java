package o0ooOO0;

/* JADX INFO: renamed from: o0ooOO0.o0000oOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31581o0000oOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f112840OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f112841OooO0O0;

    public C31581o0000oOo(String str, Object obj) {
        this.f112840OooO00o = str;
        this.f112841OooO0O0 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31581o0000oOo)) {
            return false;
        }
        C31581o0000oOo c31581o0000oOo = (C31581o0000oOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f112840OooO00o, c31581o0000oOo.f112840OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f112841OooO0O0, c31581o0000oOo.f112841OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f112840OooO00o.hashCode() * 31;
        Object obj = this.f112841OooO0O0;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.f112840OooO00o + ", value=" + this.f112841OooO0O0 + ')';
    }
}
