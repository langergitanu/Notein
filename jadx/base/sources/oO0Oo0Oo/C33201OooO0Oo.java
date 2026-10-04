package oO0Oo0Oo;

/* JADX INFO: renamed from: oO0Oo0Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33201OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oOOoOoOO.OooO00o f120151OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f120152OooO0O0;

    public C33201OooO0Oo(oOOoOoOO.OooO00o expectedType, Object response) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(expectedType, "expectedType");
        kotlin.jvm.internal.OooOOO0.OooO0oO(response, "response");
        this.f120151OooO00o = expectedType;
        this.f120152OooO0O0 = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33201OooO0Oo)) {
            return false;
        }
        C33201OooO0Oo c33201OooO0Oo = (C33201OooO0Oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120151OooO00o, c33201OooO0Oo.f120151OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120152OooO0O0, c33201OooO0Oo.f120152OooO0O0);
    }

    public final int hashCode() {
        return this.f120152OooO0O0.hashCode() + (this.f120151OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.f120151OooO00o + ", response=" + this.f120152OooO0O0 + ')';
    }
}
