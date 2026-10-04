package com.huawei.hms.network.embedded;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.i8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18216i8 {

    /* JADX INFO: renamed from: a */
    public final C18103a7 f55231a;

    /* JADX INFO: renamed from: b */
    public final Proxy f55232b;

    /* JADX INFO: renamed from: c */
    public final InetSocketAddress f55233c;

    public C18216i8(C18103a7 c18103a7, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c18103a7 == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f55231a = c18103a7;
        this.f55232b = proxy;
        this.f55233c = inetSocketAddress;
    }

    /* JADX INFO: renamed from: a */
    public C18103a7 m78766a() {
        return this.f55231a;
    }

    /* JADX INFO: renamed from: b */
    public Proxy m78767b() {
        return this.f55232b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m78768c() {
        return this.f55231a.f54177i != null && this.f55232b.type() == Proxy.Type.HTTP;
    }

    /* JADX INFO: renamed from: d */
    public InetSocketAddress m78769d() {
        return this.f55233c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18216i8)) {
            return false;
        }
        C18216i8 c18216i8 = (C18216i8) obj;
        return c18216i8.f55231a.equals(this.f55231a) && c18216i8.f55232b.equals(this.f55232b) && c18216i8.f55233c.equals(this.f55233c);
    }

    public int hashCode() {
        return this.f55233c.hashCode() + ((this.f55232b.hashCode() + ((this.f55231a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        return "Route{" + this.f55233c + "}";
    }
}
