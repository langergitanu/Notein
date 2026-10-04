package okhttp3.internal.connection;

import com.facebook.soloader.OooOo;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Companion", "Selection", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class RouteSelector {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Companion f124423OooO = new Companion(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Address f124424OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RouteDatabase f124425OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Call f124426OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final EventListener f124427OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f124428OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<? extends Proxy> f124429OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Object f124430OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList f124431OooO0oo;

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Selection {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f124432OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f124433OooO0O0;

        public Selection(ArrayList arrayList) {
            this.f124432OooO00o = arrayList;
        }

        public final boolean OooO00o() {
            return this.f124433OooO0O0 < this.f124432OooO00o.size();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        List<? extends Proxy> listOooOO0o;
        OooOOO0.OooO0oO(routeDatabase, "routeDatabase");
        OooOOO0.OooO0oO(call, "call");
        OooOOO0.OooO0oO(eventListener, "eventListener");
        this.f124424OooO00o = address;
        this.f124425OooO0O0 = routeDatabase;
        this.f124426OooO0OO = call;
        this.f124427OooO0Oo = eventListener;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this.f124429OooO0o0 = c34434OooOoO;
        this.f124430OooO0oO = c34434OooOoO;
        this.f124431OooO0oo = new ArrayList();
        HttpUrl url = address.f124018OooO;
        OooOOO0.OooO0oO(url, "url");
        Proxy proxy = address.f124025OooO0oO;
        if (proxy != null) {
            listOooOO0o = OooOo.OooO0oO(proxy);
        } else {
            URI uriOooO = url.OooO();
            if (uriOooO.getHost() == null) {
                listOooOO0o = Util.OooOO0o(Proxy.NO_PROXY);
            } else {
                List<Proxy> proxiesOrNull = address.f124026OooO0oo.select(uriOooO);
                List<Proxy> list = proxiesOrNull;
                if (list == null || list.isEmpty()) {
                    listOooOO0o = Util.OooOO0o(Proxy.NO_PROXY);
                } else {
                    OooOOO0.OooO0o(proxiesOrNull, "proxiesOrNull");
                    listOooOO0o = Util.OooOoO0(proxiesOrNull);
                }
            }
        }
        this.f124429OooO0o0 = listOooOO0o;
        this.f124428OooO0o = 0;
    }

    public final boolean OooO00o() {
        return this.f124428OooO0o < this.f124429OooO0o0.size() || !this.f124431OooO0oo.isEmpty();
    }
}
