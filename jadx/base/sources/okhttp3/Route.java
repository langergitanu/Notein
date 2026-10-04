package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/Route;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Route {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Address f124290OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Proxy f124291OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InetSocketAddress f124292OooO0OO;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        OooOOO0.OooO0oO(socketAddress, "socketAddress");
        this.f124290OooO00o = address;
        this.f124291OooO0O0 = proxy;
        this.f124292OooO0OO = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return OooOOO0.OooO0O0(route.f124290OooO00o, this.f124290OooO00o) && OooOOO0.OooO0O0(route.f124291OooO0O0, this.f124291OooO0O0) && OooOOO0.OooO0O0(route.f124292OooO0OO, this.f124292OooO0OO);
    }

    public final int hashCode() {
        return this.f124292OooO0OO.hashCode() + ((this.f124291OooO0O0.hashCode() + ((this.f124290OooO00o.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f124292OooO0OO + '}';
    }
}
