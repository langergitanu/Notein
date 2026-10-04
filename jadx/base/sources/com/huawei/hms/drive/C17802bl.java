package com.huawei.hms.drive;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: com.huawei.hms.drive.bl */
/* JADX INFO: loaded from: classes6.dex */
public final class C17802bl {

    /* JADX INFO: renamed from: a */
    final C17771ah f52942a;

    /* JADX INFO: renamed from: b */
    final Proxy f52943b;

    /* JADX INFO: renamed from: c */
    final InetSocketAddress f52944c;

    public C17802bl(C17771ah c17771ah, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c17771ah == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f52942a = c17771ah;
        this.f52943b = proxy;
        this.f52944c = inetSocketAddress;
    }

    /* JADX INFO: renamed from: a */
    public C17771ah m76315a() {
        return this.f52942a;
    }

    /* JADX INFO: renamed from: b */
    public Proxy m76316b() {
        return this.f52943b;
    }

    /* JADX INFO: renamed from: c */
    public InetSocketAddress m76317c() {
        return this.f52944c;
    }

    /* JADX INFO: renamed from: d */
    public boolean m76318d() {
        return this.f52942a.f52556i != null && this.f52943b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17802bl)) {
            return false;
        }
        C17802bl c17802bl = (C17802bl) obj;
        return c17802bl.f52942a.equals(this.f52942a) && c17802bl.f52943b.equals(this.f52943b) && c17802bl.f52944c.equals(this.f52944c);
    }

    public int hashCode() {
        return this.f52944c.hashCode() + ((this.f52943b.hashCode() + ((this.f52942a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        return "Route{" + this.f52944c + "}";
    }
}
