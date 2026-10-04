package okhttp3.internal.connection;

import com.facebook.soloader.OooOo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oOo000Oo.C34431OooOo0;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class ExchangeFinder {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f124364OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RealConnectionPool f124365OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Address f124366OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RealCall f124367OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final EventListener f124368OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public RouteSelector f124369OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public RouteSelector.Selection f124370OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f124371OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f124372OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Route f124373OooOO0;

    public ExchangeFinder(RealConnectionPool connectionPool, Address address, RealCall call, EventListener eventListener) {
        OooOOO0.OooO0oO(connectionPool, "connectionPool");
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(eventListener, "eventListener");
        this.f124365OooO00o = connectionPool;
        this.f124366OooO0O0 = address;
        this.f124367OooO0OO = call;
        this.f124368OooO0Oo = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x02c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RealConnection OooO00o(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
        ArrayList arrayList;
        String hostName;
        int port;
        List<InetAddress> listOooO0oO;
        boolean zContains;
        RouteDatabase routeDatabase;
        boolean z3;
        Socket socketOooO0oo;
        while (!this.f124367OooO0OO.f124390Oooo0o0) {
            RealConnection realConnection = this.f124367OooO0OO.f124384Oooo000;
            if (realConnection != null) {
                synchronized (realConnection) {
                    try {
                        socketOooO0oo = (realConnection.f124405OooOO0 || !OooO0O0(realConnection.f124398OooO0O0.f124290OooO00o.f124018OooO)) ? this.f124367OooO0OO.OooO0oo() : null;
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f124367OooO0OO.f124384Oooo000 != null) {
                    if (socketOooO0oo != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z3 = z2;
                } else {
                    if (socketOooO0oo != null) {
                        Util.OooO0Oo(socketOooO0oo);
                    }
                    this.f124368OooO0Oo.OooO0oo(this.f124367OooO0OO, realConnection);
                    this.f124371OooO0oO = 0;
                    this.f124372OooO0oo = 0;
                    this.f124364OooO = 0;
                    if (this.f124365OooO00o.OooO00o(this.f124366OooO0O0, this.f124367OooO0OO, null, false)) {
                        Route route = this.f124373OooOO0;
                        try {
                            if (route != null) {
                                this.f124373OooOO0 = null;
                            } else {
                                RouteSelector.Selection selection = this.f124370OooO0o0;
                                if (selection == null || !selection.OooO00o()) {
                                    RouteSelector routeSelector = this.f124369OooO0o;
                                    if (routeSelector == null) {
                                        Address address = this.f124366OooO0O0;
                                        RealCall realCall = this.f124367OooO0OO;
                                        routeSelector = new RouteSelector(address, realCall.f124375OooOo0o.f124199OoooOOo, realCall, this.f124368OooO0Oo);
                                        this.f124369OooO0o = routeSelector;
                                    }
                                    if (!routeSelector.OooO00o()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (routeSelector.f124428OooO0o < routeSelector.f124429OooO0o0.size()) {
                                        boolean z4 = routeSelector.f124428OooO0o < routeSelector.f124429OooO0o0.size();
                                        Address address2 = routeSelector.f124424OooO00o;
                                        if (!z4) {
                                            throw new SocketException("No route to " + address2.f124018OooO.f124132OooO0Oo + "; exhausted proxy configurations: " + routeSelector.f124429OooO0o0);
                                        }
                                        List<? extends Proxy> list = routeSelector.f124429OooO0o0;
                                        int i4 = routeSelector.f124428OooO0o;
                                        routeSelector.f124428OooO0o = i4 + 1;
                                        Proxy proxy = list.get(i4);
                                        ArrayList arrayList2 = new ArrayList();
                                        routeSelector.f124430OooO0oO = arrayList2;
                                        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            HttpUrl httpUrl = address2.f124018OooO;
                                            hostName = httpUrl.f124132OooO0Oo;
                                            port = httpUrl.f124134OooO0o0;
                                        } else {
                                            SocketAddress proxyAddress = proxy.address();
                                            if (!(proxyAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(OooOOO0.OooOOO0(proxyAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                                            }
                                            OooOOO0.OooO0o(proxyAddress, "proxyAddress");
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                                            RouteSelector.f124423OooO.getClass();
                                            OooOOO0.OooO0oO(inetSocketAddress, "<this>");
                                            InetAddress address3 = inetSocketAddress.getAddress();
                                            if (address3 == null) {
                                                hostName = inetSocketAddress.getHostName();
                                                OooOOO0.OooO0o(hostName, "hostName");
                                            } else {
                                                hostName = address3.getHostAddress();
                                                OooOOO0.OooO0o(hostName, "address.hostAddress");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 > port || port >= 65536) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            byte[] bArr = Util.f124301OooO00o;
                                            OooOOO0.OooO0oO(hostName, "<this>");
                                            if (Util.f124307OooO0oO.OooO0O0(hostName)) {
                                                listOooO0oO = OooOo.OooO0oO(InetAddress.getByName(hostName));
                                            } else {
                                                EventListener eventListener = routeSelector.f124427OooO0Oo;
                                                Call call = routeSelector.f124426OooO0OO;
                                                eventListener.OooOO0(call, hostName);
                                                List<InetAddress> listLookup = address2.f124019OooO00o.lookup(hostName);
                                                if (listLookup.isEmpty()) {
                                                    throw new UnknownHostException(address2.f124019OooO00o + " returned no addresses for " + hostName);
                                                }
                                                eventListener.OooO(call, hostName, listLookup);
                                                listOooO0oO = listLookup;
                                            }
                                            Iterator<InetAddress> it = listOooO0oO.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InetSocketAddress(it.next(), port));
                                            }
                                        }
                                        Iterator it2 = routeSelector.f124430OooO0oO.iterator();
                                        while (it2.hasNext()) {
                                            Route route2 = new Route(routeSelector.f124424OooO00o, proxy, (InetSocketAddress) it2.next());
                                            RouteDatabase routeDatabase2 = routeSelector.f124425OooO0O0;
                                            synchronized (routeDatabase2) {
                                                zContains = routeDatabase2.f124420OooO00o.contains(route2);
                                            }
                                            if (zContains) {
                                                routeSelector.f124431OooO0oo.add(route2);
                                            } else {
                                                arrayList.add(route2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        C34431OooOo0.OooOo0o(arrayList, routeSelector.f124431OooO0oo);
                                        routeSelector.f124431OooO0oo.clear();
                                    }
                                    RouteSelector.Selection selection2 = new RouteSelector.Selection(arrayList);
                                    this.f124370OooO0o0 = selection2;
                                    if (this.f124367OooO0OO.f124390Oooo0o0) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f124365OooO00o.OooO00o(this.f124366OooO0O0, this.f124367OooO0OO, arrayList, false)) {
                                        realConnection = this.f124367OooO0OO.f124384Oooo000;
                                        OooOOO0.OooO0Oo(realConnection);
                                        this.f124368OooO0Oo.OooO0oO(this.f124367OooO0OO, realConnection);
                                    } else {
                                        if (!selection2.OooO00o()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i5 = selection2.f124433OooO0O0;
                                        selection2.f124433OooO0O0 = i5 + 1;
                                        route = (Route) arrayList.get(i5);
                                        RealConnection realConnection2 = new RealConnection(this.f124365OooO00o, route);
                                        this.f124367OooO0OO.f124391Oooo0oO = realConnection2;
                                        realConnection2.OooO0OO(i, i2, i3, z, this.f124367OooO0OO, this.f124368OooO0Oo);
                                        this.f124367OooO0OO.f124391Oooo0oO = null;
                                        routeDatabase = this.f124367OooO0OO.f124375OooOo0o.f124199OoooOOo;
                                        Route route3 = realConnection2.f124398OooO0O0;
                                        synchronized (routeDatabase) {
                                            OooOOO0.OooO0oO(route3, "route");
                                            routeDatabase.f124420OooO00o.remove(route3);
                                        }
                                        if (this.f124365OooO00o.OooO00o(this.f124366OooO0O0, this.f124367OooO0OO, arrayList, true)) {
                                            realConnection = this.f124367OooO0OO.f124384Oooo000;
                                            OooOOO0.OooO0Oo(realConnection);
                                            this.f124373OooOO0 = route;
                                            Socket socket = realConnection2.f124400OooO0Oo;
                                            OooOOO0.OooO0Oo(socket);
                                            Util.OooO0Oo(socket);
                                            this.f124368OooO0Oo.OooO0oO(this.f124367OooO0OO, realConnection);
                                        } else {
                                            synchronized (realConnection2) {
                                                this.f124365OooO00o.OooO0o(realConnection2);
                                                this.f124367OooO0OO.OooO0O0(realConnection2);
                                                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                            }
                                            this.f124368OooO0Oo.OooO0oO(this.f124367OooO0OO, realConnection2);
                                            z3 = z2;
                                            realConnection = realConnection2;
                                        }
                                    }
                                } else {
                                    RouteSelector.Selection selection3 = this.f124370OooO0o0;
                                    OooOOO0.OooO0Oo(selection3);
                                    if (!selection3.OooO00o()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i6 = selection3.f124433OooO0O0;
                                    selection3.f124433OooO0O0 = i6 + 1;
                                    route = (Route) selection3.f124432OooO00o.get(i6);
                                }
                            }
                            realConnection2.OooO0OO(i, i2, i3, z, this.f124367OooO0OO, this.f124368OooO0Oo);
                            this.f124367OooO0OO.f124391Oooo0oO = null;
                            routeDatabase = this.f124367OooO0OO.f124375OooOo0o.f124199OoooOOo;
                            Route route32 = realConnection2.f124398OooO0O0;
                            synchronized (routeDatabase) {
                            }
                        } catch (Throwable th2) {
                            this.f124367OooO0OO.f124391Oooo0oO = null;
                            throw th2;
                        }
                        arrayList = null;
                        RealConnection realConnection22 = new RealConnection(this.f124365OooO00o, route);
                        this.f124367OooO0OO.f124391Oooo0oO = realConnection22;
                    } else {
                        realConnection = this.f124367OooO0OO.f124384Oooo000;
                        OooOOO0.OooO0Oo(realConnection);
                        this.f124368OooO0Oo.OooO0oO(this.f124367OooO0OO, realConnection);
                    }
                    z3 = z2;
                }
            } else {
                this.f124371OooO0oO = 0;
                this.f124372OooO0oo = 0;
                this.f124364OooO = 0;
                if (this.f124365OooO00o.OooO00o(this.f124366OooO0O0, this.f124367OooO0OO, null, false)) {
                }
                z3 = z2;
            }
            if (realConnection.OooO(z3)) {
                return realConnection;
            }
            realConnection.OooOO0O();
            if (this.f124373OooOO0 == null) {
                RouteSelector.Selection selection4 = this.f124370OooO0o0;
                if (selection4 == null ? true : selection4.OooO00o()) {
                    continue;
                } else {
                    RouteSelector routeSelector2 = this.f124369OooO0o;
                    if (!(routeSelector2 == null ? true : routeSelector2.OooO00o())) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean OooO0O0(HttpUrl url) {
        OooOOO0.OooO0oO(url, "url");
        HttpUrl httpUrl = this.f124366OooO0O0.f124018OooO;
        return url.f124134OooO0o0 == httpUrl.f124134OooO0o0 && OooOOO0.OooO0O0(url.f124132OooO0Oo, httpUrl.f124132OooO0Oo);
    }

    public final void OooO0OO(IOException e) {
        OooOOO0.OooO0oO(e, "e");
        this.f124373OooOO0 = null;
        if (e instanceof StreamResetException) {
            if (((StreamResetException) e).f124652OooOo0o == ErrorCode.REFUSED_STREAM) {
                this.f124371OooO0oO++;
                return;
            }
        }
        if (e instanceof ConnectionShutdownException) {
            this.f124372OooO0oo++;
        } else {
            this.f124364OooO++;
        }
    }
}
