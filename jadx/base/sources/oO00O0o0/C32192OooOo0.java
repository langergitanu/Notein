package oO00O0o0;

import Oooo0oO.C21111o0ooOoO;
import java.util.List;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: oO00O0o0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32192OooOo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C32192OooOo0 f115538OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C32192OooOo0 f115539OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final C32192OooOo0 f115540OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final List<C32192OooOo0> f115541OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f115542OooO00o;

    static {
        C32192OooOo0 c32192OooOo0 = new C32192OooOo0("GET");
        f115538OooO0O0 = c32192OooOo0;
        C32192OooOo0 c32192OooOo02 = new C32192OooOo0("POST");
        f115539OooO0OO = c32192OooOo02;
        C32192OooOo0 c32192OooOo03 = new C32192OooOo0("PUT");
        C32192OooOo0 c32192OooOo04 = new C32192OooOo0("PATCH");
        C32192OooOo0 c32192OooOo05 = new C32192OooOo0("DELETE");
        C32192OooOo0 c32192OooOo06 = new C32192OooOo0("HEAD");
        f115540OooO0Oo = c32192OooOo06;
        f115541OooO0o0 = C34429OooOOo0.OooOO0o(c32192OooOo0, c32192OooOo02, c32192OooOo03, c32192OooOo04, c32192OooOo05, c32192OooOo06, new C32192OooOo0("OPTIONS"));
    }

    public C32192OooOo0(String str) {
        this.f115542OooO00o = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32192OooOo0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115542OooO00o, ((C32192OooOo0) obj).f115542OooO00o);
    }

    public final int hashCode() {
        return this.f115542OooO00o.hashCode();
    }

    public final String toString() {
        return C21111o0ooOoO.OooO0OO(this.f115542OooO00o, ')', new StringBuilder("HttpMethod(value="));
    }
}
