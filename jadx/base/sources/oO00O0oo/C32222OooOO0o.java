package oO00O0oo;

import java.net.InetSocketAddress;

/* JADX INFO: renamed from: oO00O0oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32222OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InetSocketAddress f115663OooO00o;

    public C32222OooOO0o(String hostname, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(hostname, "hostname");
        this.f115663OooO00o = new InetSocketAddress(hostname, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C32222OooOO0o.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type io.ktor.network.sockets.InetSocketAddress");
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115663OooO00o, ((C32222OooOO0o) obj).f115663OooO00o);
    }

    public final int hashCode() {
        return this.f115663OooO00o.hashCode();
    }

    public final String toString() {
        String string = this.f115663OooO00o.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "address.toString()");
        return string;
    }
}
