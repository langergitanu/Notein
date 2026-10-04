package com.huawei.hms.network.embedded;

import Oooo0oO.C21023OooO0Oo;
import com.huawei.hms.network.embedded.AbstractC18338r7;
import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.C18243k7;
import com.huawei.hms.network.embedded.C18377u7;
import com.huawei.hms.network.embedded.InterfaceC18159e7;
import com.huawei.hms.network.embedded.InterfaceC18244k8;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAuthorizationResponse;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.b8 */
/* JADX INFO: loaded from: classes9.dex */
public class C18118b8 implements Cloneable, InterfaceC18159e7.a, InterfaceC18244k8.a {

    /* JADX INFO: renamed from: E */
    public static final List<EnumC18132c8> f54251E = C18313p8.m79373a(EnumC18132c8.HTTP_2, EnumC18132c8.HTTP_1_1);

    /* JADX INFO: renamed from: F */
    public static final List<C18257l7> f54252F = C18313p8.m79373a(C18257l7.f55614h, C18257l7.f55616j);

    /* JADX INFO: renamed from: G */
    public static final int f54253G = 100;

    /* JADX INFO: renamed from: H */
    public static final int f54254H = 2000;

    /* JADX INFO: renamed from: I */
    public static final int f54255I = 200;

    /* JADX INFO: renamed from: A */
    public final int f54256A;

    /* JADX INFO: renamed from: B */
    public final int f54257B;

    /* JADX INFO: renamed from: C */
    public final int f54258C;

    /* JADX INFO: renamed from: D */
    public final d f54259D;

    /* JADX INFO: renamed from: a */
    public final C18312p7 f54260a;

    /* JADX INFO: renamed from: b */
    public final Proxy f54261b;

    /* JADX INFO: renamed from: c */
    public final List<EnumC18132c8> f54262c;

    /* JADX INFO: renamed from: d */
    public final List<C18257l7> f54263d;

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC18429y7> f54264e;

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC18429y7> f54265f;

    /* JADX INFO: renamed from: g */
    public final AbstractC18338r7.b f54266g;

    /* JADX INFO: renamed from: h */
    public final ProxySelector f54267h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC18285n7 f54268i;

    /* JADX INFO: renamed from: j */
    public final C18131c7 f54269j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC18417x8 f54270k;

    /* JADX INFO: renamed from: l */
    public final SocketFactory f54271l;

    /* JADX INFO: renamed from: m */
    public final SSLSocketFactory f54272m;

    /* JADX INFO: renamed from: n */
    public final AbstractC18107ab f54273n;

    /* JADX INFO: renamed from: o */
    public final HostnameVerifier f54274o;

    /* JADX INFO: renamed from: p */
    public final C18187g7 f54275p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC18117b7 f54276q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC18117b7 f54277r;

    /* JADX INFO: renamed from: s */
    public final C18243k7 f54278s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC18325q7 f54279t;

    /* JADX INFO: renamed from: u */
    public final boolean f54280u;

    /* JADX INFO: renamed from: v */
    public final boolean f54281v;

    /* JADX INFO: renamed from: w */
    public final boolean f54282w;

    /* JADX INFO: renamed from: x */
    public final int f54283x;

    /* JADX INFO: renamed from: y */
    public final int f54284y;

    /* JADX INFO: renamed from: z */
    public final int f54285z;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.b8$a */
    public class a extends AbstractC18286n8 {
        @Override // com.huawei.hms.network.embedded.AbstractC18286n8
        /* JADX INFO: renamed from: a */
        public int mo77966a(C18188g8.a aVar) {
            return aVar.f54940c;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18286n8
        /* JADX INFO: renamed from: a */
        public InterfaceC18159e7 mo77967a(C18118b8 c18118b8, C18160e8 c18160e8) {
            return C18146d8.m78212a(c18118b8, c18160e8, true);
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18286n8
        /* JADX INFO: renamed from: a */
        public C18175f9 mo77968a(C18188g8 c18188g8) {
            return c18188g8.f54936m;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18286n8
        /* JADX INFO: renamed from: a */
        public C18231j9 mo77969a(C18243k7 c18243k7) {
            return c18243k7.delegate;
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18286n8
        /* JADX INFO: renamed from: a */
        public void mo77970a(C18188g8.a aVar, C18175f9 c18175f9) {
            aVar.m78606a(c18175f9);
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18286n8
        /* JADX INFO: renamed from: a */
        public void mo77971a(C18257l7 c18257l7, SSLSocket sSLSocket, boolean z) {
            c18257l7.m79051a(sSLSocket, z);
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18286n8
        /* JADX INFO: renamed from: a */
        public void mo77972a(C18377u7.a aVar, String str) {
            aVar.m79628b(str);
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18286n8
        /* JADX INFO: renamed from: a */
        public void mo77973a(C18377u7.a aVar, String str, String str2) {
            aVar.m79629b(str, str2);
        }

        @Override // com.huawei.hms.network.embedded.AbstractC18286n8
        /* JADX INFO: renamed from: a */
        public boolean mo77974a(C18103a7 c18103a7, C18103a7 c18103a72) {
            return c18103a7.m77851a(c18103a72);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.b8$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54286a;

        static {
            int[] iArr = new int[EnumC18132c8.values().length];
            f54286a = iArr;
            try {
                iArr[EnumC18132c8.HTTP_2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54286a[EnumC18132c8.HTTP_1_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54286a[EnumC18132c8.HTTP_1_1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54286a[EnumC18132c8.SPDY_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.b8$c */
    public static final class c {

        /* JADX INFO: renamed from: A */
        public int f54287A;

        /* JADX INFO: renamed from: B */
        public int f54288B;

        /* JADX INFO: renamed from: C */
        public int f54289C;

        /* JADX INFO: renamed from: a */
        public C18312p7 f54290a;

        /* JADX INFO: renamed from: b */
        public Proxy f54291b;

        /* JADX INFO: renamed from: c */
        public List<EnumC18132c8> f54292c;

        /* JADX INFO: renamed from: d */
        public List<C18257l7> f54293d;

        /* JADX INFO: renamed from: e */
        public final List<InterfaceC18429y7> f54294e;

        /* JADX INFO: renamed from: f */
        public final List<InterfaceC18429y7> f54295f;

        /* JADX INFO: renamed from: g */
        public AbstractC18338r7.b f54296g;

        /* JADX INFO: renamed from: h */
        public ProxySelector f54297h;

        /* JADX INFO: renamed from: i */
        public InterfaceC18285n7 f54298i;

        /* JADX INFO: renamed from: j */
        public C18131c7 f54299j;

        /* JADX INFO: renamed from: k */
        public InterfaceC18417x8 f54300k;

        /* JADX INFO: renamed from: l */
        public SocketFactory f54301l;

        /* JADX INFO: renamed from: m */
        public SSLSocketFactory f54302m;

        /* JADX INFO: renamed from: n */
        public AbstractC18107ab f54303n;

        /* JADX INFO: renamed from: o */
        public HostnameVerifier f54304o;

        /* JADX INFO: renamed from: p */
        public C18187g7 f54305p;

        /* JADX INFO: renamed from: q */
        public InterfaceC18117b7 f54306q;

        /* JADX INFO: renamed from: r */
        public InterfaceC18117b7 f54307r;

        /* JADX INFO: renamed from: s */
        public C18243k7 f54308s;

        /* JADX INFO: renamed from: t */
        public InterfaceC18325q7 f54309t;

        /* JADX INFO: renamed from: u */
        public boolean f54310u;

        /* JADX INFO: renamed from: v */
        public boolean f54311v;

        /* JADX INFO: renamed from: w */
        public boolean f54312w;

        /* JADX INFO: renamed from: x */
        public int f54313x;

        /* JADX INFO: renamed from: y */
        public int f54314y;

        /* JADX INFO: renamed from: z */
        public int f54315z;

        public c() {
            this.f54294e = new ArrayList();
            this.f54295f = new ArrayList();
            this.f54290a = new C18312p7();
            this.f54292c = C18118b8.f54251E;
            this.f54293d = C18118b8.f54252F;
            this.f54296g = AbstractC18338r7.m79456a(AbstractC18338r7.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f54297h = proxySelector;
            if (proxySelector == null) {
                this.f54297h = new C18419xa();
            }
            this.f54298i = InterfaceC18285n7.f55776a;
            this.f54301l = SocketFactory.getDefault();
            this.f54304o = C18135cb.f54499a;
            this.f54305p = C18187g7.f54915c;
            InterfaceC18117b7 interfaceC18117b7 = InterfaceC18117b7.f54250a;
            this.f54306q = interfaceC18117b7;
            this.f54307r = interfaceC18117b7;
            this.f54308s = new C18243k7();
            this.f54309t = InterfaceC18325q7.f55967a;
            this.f54310u = true;
            this.f54311v = true;
            this.f54312w = true;
            this.f54313x = 0;
            this.f54314y = 10000;
            this.f54315z = 10000;
            this.f54287A = 10000;
            this.f54288B = 0;
            this.f54289C = 200;
        }

        /* JADX INFO: renamed from: a */
        public c m77975a(long j, TimeUnit timeUnit) {
            this.f54313x = C18313p8.m79361a("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m77997b(long j, TimeUnit timeUnit) {
            this.f54314y = C18313p8.m79361a("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m78004c(long j, TimeUnit timeUnit) {
            int iM79361a = C18313p8.m79361a("connectionAttemptDelay", j, timeUnit);
            this.f54289C = iM79361a;
            if (iM79361a < 100 || iM79361a > 2000) {
                String strOooO0OO = C21023OooO0Oo.OooO0OO(" ms is out of range (100ms ~ 2000ms).", this.f54289C, new StringBuilder("Connection Attempt Delay "));
                this.f54289C = 200;
                throw new IllegalArgumentException(strOooO0OO);
            }
            if (iM79361a < this.f54314y) {
                return this;
            }
            String strOooO0OO2 = C21023OooO0Oo.OooO0OO(" ms is out of range (100ms ~ 2000ms).", this.f54289C, new StringBuilder("Connection Attempt Delay "));
            this.f54289C = 200;
            throw new IllegalArgumentException(strOooO0OO2);
        }

        /* JADX INFO: renamed from: d */
        public c m78008d(long j, TimeUnit timeUnit) {
            this.f54288B = C18313p8.m79361a(MicrosoftAuthorizationResponse.INTERVAL, j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public c m78010e(long j, TimeUnit timeUnit) {
            this.f54315z = C18313p8.m79361a("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public c m78012f(long j, TimeUnit timeUnit) {
            this.f54287A = C18313p8.m79361a("timeout", j, timeUnit);
            return this;
        }

        public c(C18118b8 c18118b8) {
            ArrayList arrayList = new ArrayList();
            this.f54294e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f54295f = arrayList2;
            this.f54290a = c18118b8.f54260a;
            this.f54291b = c18118b8.f54261b;
            this.f54292c = c18118b8.f54262c;
            this.f54293d = c18118b8.f54263d;
            arrayList.addAll(c18118b8.f54264e);
            arrayList2.addAll(c18118b8.f54265f);
            this.f54296g = c18118b8.f54266g;
            this.f54297h = c18118b8.f54267h;
            this.f54298i = c18118b8.f54268i;
            this.f54300k = c18118b8.f54270k;
            this.f54299j = c18118b8.f54269j;
            this.f54301l = c18118b8.f54271l;
            this.f54302m = c18118b8.f54272m;
            this.f54303n = c18118b8.f54273n;
            this.f54304o = c18118b8.f54274o;
            this.f54305p = c18118b8.f54275p;
            this.f54306q = c18118b8.f54276q;
            this.f54307r = c18118b8.f54277r;
            this.f54308s = c18118b8.f54278s;
            this.f54309t = c18118b8.f54279t;
            this.f54310u = c18118b8.f54280u;
            this.f54311v = c18118b8.f54281v;
            this.f54312w = c18118b8.f54282w;
            this.f54313x = c18118b8.f54283x;
            this.f54314y = c18118b8.f54284y;
            this.f54315z = c18118b8.f54285z;
            this.f54287A = c18118b8.f54256A;
            this.f54288B = c18118b8.f54257B;
            this.f54289C = c18118b8.f54258C;
        }

        /* JADX INFO: renamed from: a */
        public c m77976a(InterfaceC18117b7 interfaceC18117b7) {
            if (interfaceC18117b7 == null) {
                throw new NullPointerException("authenticator == null");
            }
            this.f54307r = interfaceC18117b7;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m77998b(InterfaceC18117b7 interfaceC18117b7) {
            if (interfaceC18117b7 == null) {
                throw new NullPointerException("proxyAuthenticator == null");
            }
            this.f54306q = interfaceC18117b7;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public c m78009d(Duration duration) {
            this.f54315z = C18313p8.m79361a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public c m78011e(Duration duration) {
            this.f54287A = C18313p8.m79361a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77977a(C18131c7 c18131c7) {
            this.f54299j = c18131c7;
            this.f54300k = null;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m77999b(InterfaceC18429y7 interfaceC18429y7) {
            if (interfaceC18429y7 == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f54295f.add(interfaceC18429y7);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77978a(C18187g7 c18187g7) {
            if (c18187g7 == null) {
                throw new NullPointerException("certificatePinner == null");
            }
            this.f54305p = c18187g7;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m78000b(Duration duration) {
            int i = this.f54314y;
            int iM79361a = C18313p8.m79361a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            this.f54314y = iM79361a;
            if (this.f54289C < iM79361a) {
                return this;
            }
            StringBuilder sb = new StringBuilder("Connection Attempt Delay (");
            sb.append(this.f54289C);
            sb.append(" ms) is greater than or equal to Connect Timeout (");
            String strOooO0OO = C21023OooO0Oo.OooO0OO(" ms)", this.f54314y, sb);
            this.f54314y = i;
            throw new IllegalArgumentException(strOooO0OO);
        }

        /* JADX INFO: renamed from: a */
        public c m77979a(C18243k7 c18243k7) {
            if (c18243k7 == null) {
                throw new NullPointerException("connectionPool == null");
            }
            this.f54308s = c18243k7;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77980a(InterfaceC18285n7 interfaceC18285n7) {
            if (interfaceC18285n7 == null) {
                throw new NullPointerException("cookieJar == null");
            }
            this.f54298i = interfaceC18285n7;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77981a(C18312p7 c18312p7) {
            if (c18312p7 == null) {
                throw new IllegalArgumentException("dispatcher == null");
            }
            this.f54290a = c18312p7;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77982a(InterfaceC18325q7 interfaceC18325q7) {
            if (interfaceC18325q7 == null) {
                throw new NullPointerException("dns == null");
            }
            this.f54309t = interfaceC18325q7;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m78005c(Duration duration) {
            this.f54288B = C18313p8.m79361a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77983a(AbstractC18338r7.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("eventListenerFactory == null");
            }
            this.f54296g = bVar;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m78001b(List<EnumC18132c8> list) {
            ArrayList arrayList = new ArrayList(list);
            EnumC18132c8 enumC18132c8 = EnumC18132c8.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(enumC18132c8) && !arrayList.contains(EnumC18132c8.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(enumC18132c8) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (arrayList.contains(EnumC18132c8.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            }
            if (arrayList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayList.remove(EnumC18132c8.SPDY_3);
            this.f54292c = Collections.unmodifiableList(arrayList);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m78006c(boolean z) {
            this.f54312w = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77984a(AbstractC18338r7 abstractC18338r7) {
            if (abstractC18338r7 == null) {
                throw new NullPointerException("eventListener == null");
            }
            this.f54296g = AbstractC18338r7.m79456a(abstractC18338r7);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public c m78002b(boolean z) {
            this.f54310u = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public List<InterfaceC18429y7> m78007c() {
            return this.f54295f;
        }

        /* JADX INFO: renamed from: a */
        public c m77985a(InterfaceC18429y7 interfaceC18429y7) {
            if (interfaceC18429y7 == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            this.f54294e.add(interfaceC18429y7);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public List<InterfaceC18429y7> m78003b() {
            return this.f54294e;
        }

        /* JADX INFO: renamed from: a */
        public c m77986a(Proxy proxy) {
            this.f54291b = proxy;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77987a(ProxySelector proxySelector) {
            if (proxySelector == null) {
                throw new NullPointerException("proxySelector == null");
            }
            this.f54297h = proxySelector;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77988a(Duration duration) {
            this.f54313x = C18313p8.m79361a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77989a(List<C18257l7> list) {
            this.f54293d = C18313p8.m79372a(list);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77990a(SocketFactory socketFactory) {
            if (socketFactory == null) {
                throw new NullPointerException("socketFactory == null");
            }
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            this.f54301l = socketFactory;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77991a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier == null) {
                throw new NullPointerException("hostnameVerifier == null");
            }
            this.f54304o = hostnameVerifier;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77992a(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            this.f54302m = sSLSocketFactory;
            this.f54303n = C18406wa.m79845f().m79848a(sSLSocketFactory);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77993a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            if (x509TrustManager == null) {
                throw new NullPointerException("trustManager == null");
            }
            this.f54302m = sSLSocketFactory;
            this.f54303n = AbstractC18107ab.m77911a(x509TrustManager);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public c m77994a(boolean z) {
            this.f54311v = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C18118b8 m77995a() {
            return new C18118b8(this);
        }

        /* JADX INFO: renamed from: a */
        public C18312p7 m77996a(EnumC18132c8 enumC18132c8) {
            int i = b.f54286a[enumC18132c8.ordinal()];
            if (i == 1) {
                return new C18390v7();
            }
            if (i == 2 || i == 3 || i == 4) {
                return new C18312p7();
            }
            throw new IllegalArgumentException("there is no dispatcher fit for the protocol " + enumC18132c8.toString());
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.b8$d */
    public class d implements C18243k7.a {
        public d() {
        }

        @Override // com.huawei.hms.network.embedded.C18243k7.a
        /* JADX INFO: renamed from: a */
        public void mo78013a(String str, int i, String str2) {
            C18118b8.this.f54260a.mo79355b(str, i, str2);
        }

        public /* synthetic */ d(C18118b8 c18118b8, a aVar) {
            this();
        }
    }

    static {
        AbstractC18286n8.f55777a = new a();
    }

    public C18118b8() {
        this(new c());
    }

    /* JADX INFO: renamed from: D */
    public static String m77930D() {
        return C18326q8.m79417a();
    }

    /* JADX INFO: renamed from: A */
    public SocketFactory m77932A() {
        return this.f54271l;
    }

    /* JADX INFO: renamed from: B */
    public SSLSocketFactory m77933B() {
        return this.f54272m;
    }

    /* JADX INFO: renamed from: C */
    public int m77934C() {
        return this.f54256A;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC18117b7 m77935a() {
        return this.f54277r;
    }

    /* JADX INFO: renamed from: b */
    public int m77939b(String str, int i, String str2) {
        return this.f54278s.m78974a(str, i, str2);
    }

    /* JADX INFO: renamed from: c */
    public int m77941c() {
        return this.f54283x;
    }

    /* JADX INFO: renamed from: d */
    public C18187g7 m77943d() {
        return this.f54275p;
    }

    /* JADX INFO: renamed from: e */
    public int m77944e() {
        return this.f54284y;
    }

    /* JADX INFO: renamed from: f */
    public int m77945f() {
        return this.f54258C;
    }

    /* JADX INFO: renamed from: g */
    public C18243k7 m77946g() {
        return this.f54278s;
    }

    /* JADX INFO: renamed from: h */
    public List<C18257l7> m77947h() {
        return this.f54263d;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC18285n7 m77948i() {
        return this.f54268i;
    }

    /* JADX INFO: renamed from: j */
    public C18312p7 m77949j() {
        return this.f54260a;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC18325q7 m77950k() {
        return this.f54279t;
    }

    /* JADX INFO: renamed from: l */
    public AbstractC18338r7.b m77951l() {
        return this.f54266g;
    }

    /* JADX INFO: renamed from: m */
    public boolean m77952m() {
        return this.f54281v;
    }

    /* JADX INFO: renamed from: n */
    public boolean m77953n() {
        return this.f54280u;
    }

    /* JADX INFO: renamed from: o */
    public HostnameVerifier m77954o() {
        return this.f54274o;
    }

    /* JADX INFO: renamed from: p */
    public List<InterfaceC18429y7> m77955p() {
        return this.f54264e;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC18417x8 m77956q() {
        C18131c7 c18131c7 = this.f54269j;
        return c18131c7 != null ? c18131c7.f54426a : this.f54270k;
    }

    /* JADX INFO: renamed from: r */
    public List<InterfaceC18429y7> m77957r() {
        return this.f54265f;
    }

    /* JADX INFO: renamed from: s */
    public c m77958s() {
        return new c(this);
    }

    /* JADX INFO: renamed from: t */
    public int m77959t() {
        return this.f54257B;
    }

    /* JADX INFO: renamed from: u */
    public List<EnumC18132c8> m77960u() {
        return this.f54262c;
    }

    /* JADX INFO: renamed from: v */
    public Proxy m77961v() {
        return this.f54261b;
    }

    /* JADX INFO: renamed from: w */
    public InterfaceC18117b7 m77962w() {
        return this.f54276q;
    }

    /* JADX INFO: renamed from: x */
    public ProxySelector m77963x() {
        return this.f54267h;
    }

    /* JADX INFO: renamed from: y */
    public int m77964y() {
        return this.f54285z;
    }

    /* JADX INFO: renamed from: z */
    public boolean m77965z() {
        return this.f54282w;
    }

    public C18118b8(c cVar) {
        boolean z;
        AbstractC18107ab abstractC18107abM77911a;
        this.f54259D = new d(this, null);
        this.f54260a = cVar.f54290a;
        this.f54261b = cVar.f54291b;
        this.f54262c = cVar.f54292c;
        List<C18257l7> list = cVar.f54293d;
        this.f54263d = list;
        this.f54264e = C18313p8.m79372a(cVar.f54294e);
        this.f54265f = C18313p8.m79372a(cVar.f54295f);
        this.f54266g = cVar.f54296g;
        this.f54267h = cVar.f54297h;
        this.f54268i = cVar.f54298i;
        this.f54269j = cVar.f54299j;
        this.f54270k = cVar.f54300k;
        this.f54271l = cVar.f54301l;
        Iterator<C18257l7> it = list.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                z = (z || it.next().m79053b()) ? true : z;
            }
        }
        SSLSocketFactory sSLSocketFactory = cVar.f54302m;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerM79376a = C18313p8.m79376a();
            this.f54272m = m77931a(x509TrustManagerM79376a);
            abstractC18107abM77911a = AbstractC18107ab.m77911a(x509TrustManagerM79376a);
        } else {
            this.f54272m = sSLSocketFactory;
            abstractC18107abM77911a = cVar.f54303n;
        }
        this.f54273n = abstractC18107abM77911a;
        if (this.f54272m != null) {
            C18406wa.m79845f().mo79537b(this.f54272m);
        }
        this.f54274o = cVar.f54304o;
        this.f54275p = cVar.f54305p.m78564a(this.f54273n);
        this.f54276q = cVar.f54306q;
        this.f54277r = cVar.f54307r;
        C18243k7 c18243k7 = cVar.f54308s;
        this.f54278s = c18243k7;
        this.f54279t = cVar.f54309t;
        this.f54280u = cVar.f54310u;
        this.f54281v = cVar.f54311v;
        this.f54282w = cVar.f54312w;
        this.f54283x = cVar.f54313x;
        this.f54284y = cVar.f54314y;
        this.f54285z = cVar.f54315z;
        this.f54256A = cVar.f54287A;
        this.f54257B = cVar.f54288B;
        if (this.f54264e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f54264e);
        }
        if (this.f54265f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f54265f);
        }
        this.f54258C = cVar.f54289C;
        c18243k7.m78975a(this.f54259D);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18159e7.a
    /* JADX INFO: renamed from: a */
    public InterfaceC18159e7 mo77936a(C18160e8 c18160e8) {
        return C18146d8.m78212a(this, c18160e8, false);
    }

    /* JADX INFO: renamed from: b */
    public C18131c7 m77940b() {
        return this.f54269j;
    }

    /* JADX INFO: renamed from: c */
    public boolean m77942c(String str, int i, String str2) {
        return this.f54278s.m78978b(str, i, str2);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18244k8.a
    /* JADX INFO: renamed from: a */
    public InterfaceC18244k8 mo77937a(C18160e8 c18160e8, AbstractC18258l8 abstractC18258l8) {
        C18163eb c18163eb = new C18163eb(c18160e8, abstractC18258l8, new Random(), this.f54257B);
        c18163eb.m78345a(this);
        return c18163eb;
    }

    /* JADX INFO: renamed from: a */
    public static SSLSocketFactory m77931a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextMo79429b = C18406wa.m79845f().mo79429b();
            sSLContextMo79429b.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextMo79429b.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77938a(String str, int i, String str2) {
        this.f54260a.mo79352a(str, i, str2);
    }
}
