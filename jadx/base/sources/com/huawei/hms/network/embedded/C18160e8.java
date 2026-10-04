package com.huawei.hms.network.embedded;

import OooOoo.C20593OooO0Oo;
import androidx.concurrent.futures.OooO0O0;
import com.huawei.hms.network.embedded.C18377u7;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.e8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18160e8 {

    /* JADX INFO: renamed from: a */
    public final C18416x7 f54618a;

    /* JADX INFO: renamed from: b */
    public final String f54619b;

    /* JADX INFO: renamed from: c */
    public final C18377u7 f54620c;

    /* JADX INFO: renamed from: d */
    public final AbstractC18174f8 f54621d;

    /* JADX INFO: renamed from: e */
    public final Map<Class<?>, Object> f54622e;

    /* JADX INFO: renamed from: f */
    public volatile C18145d7 f54623f;

    /* JADX INFO: renamed from: g */
    public final boolean f54624g;

    /* JADX INFO: renamed from: h */
    public final ArrayList<InetAddress> f54625h;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.e8$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public C18416x7 f54626a;

        /* JADX INFO: renamed from: b */
        public String f54627b;

        /* JADX INFO: renamed from: c */
        public C18377u7.a f54628c;

        /* JADX INFO: renamed from: d */
        public AbstractC18174f8 f54629d;

        /* JADX INFO: renamed from: e */
        public Map<Class<?>, Object> f54630e;

        /* JADX INFO: renamed from: f */
        public boolean f54631f;

        /* JADX INFO: renamed from: g */
        public ArrayList<InetAddress> f54632g;

        public a() {
            this.f54630e = Collections.EMPTY_MAP;
            this.f54631f = false;
            this.f54632g = new ArrayList<>();
            this.f54627b = "GET";
            this.f54628c = new C18377u7.a();
        }

        /* JADX INFO: renamed from: a */
        public a m78311a(C18145d7 c18145d7) {
            String string = c18145d7.toString();
            return string.isEmpty() ? m78326b("Cache-Control") : m78327b("Cache-Control", string);
        }

        /* JADX INFO: renamed from: b */
        public a m78324b() {
            return m78312a(C18313p8.f55896e);
        }

        /* JADX INFO: renamed from: c */
        public a m78328c() {
            return m78318a("GET", (AbstractC18174f8) null);
        }

        /* JADX INFO: renamed from: d */
        public a m78331d() {
            return m78318a("HEAD", (AbstractC18174f8) null);
        }

        public a(C18160e8 c18160e8) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f54630e = map;
            this.f54631f = false;
            this.f54632g = new ArrayList<>();
            this.f54626a = c18160e8.f54618a;
            this.f54627b = c18160e8.f54619b;
            this.f54629d = c18160e8.f54621d;
            this.f54630e = c18160e8.f54622e.isEmpty() ? map : new LinkedHashMap<>(c18160e8.f54622e);
            this.f54628c = c18160e8.f54620c.m79617c();
            this.f54631f = c18160e8.f54624g;
            this.f54632g = c18160e8.f54625h;
        }

        /* JADX INFO: renamed from: a */
        public a m78312a(AbstractC18174f8 abstractC18174f8) {
            return m78318a("DELETE", abstractC18174f8);
        }

        /* JADX INFO: renamed from: b */
        public a m78325b(AbstractC18174f8 abstractC18174f8) {
            return m78318a("PATCH", abstractC18174f8);
        }

        /* JADX INFO: renamed from: c */
        public a m78329c(AbstractC18174f8 abstractC18174f8) {
            return m78318a("POST", abstractC18174f8);
        }

        /* JADX INFO: renamed from: d */
        public a m78332d(AbstractC18174f8 abstractC18174f8) {
            return m78318a("PUT", abstractC18174f8);
        }

        /* JADX INFO: renamed from: a */
        public a m78313a(C18377u7 c18377u7) {
            this.f54628c = c18377u7.m79617c();
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m78326b(String str) {
            this.f54628c.m79634d(str);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m78330c(String str) {
            String strOooO00o;
            StringBuilder sb;
            int i;
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                sb = new StringBuilder("http:");
                i = 3;
            } else {
                if (!str.regionMatches(true, 0, "wss:", 0, 4)) {
                    strOooO00o = str;
                    return m78314a(C18416x7.m79913f(strOooO00o));
                }
                sb = new StringBuilder("https:");
                i = 4;
            }
            strOooO00o = OooO0O0.OooO00o(str, i, sb);
            return m78314a(C18416x7.m79913f(strOooO00o));
        }

        /* JADX INFO: renamed from: a */
        public a m78314a(C18416x7 c18416x7) {
            if (c18416x7 == null) {
                throw new NullPointerException("url == null");
            }
            this.f54626a = c18416x7;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m78327b(String str, String str2) {
            this.f54628c.m79635d(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public <T> a m78315a(Class<? super T> cls, T t) {
            if (cls == null) {
                throw new NullPointerException("type == null");
            }
            if (t == null) {
                this.f54630e.remove(cls);
                return this;
            }
            if (this.f54630e.isEmpty()) {
                this.f54630e = new LinkedHashMap();
            }
            this.f54630e.put(cls, cls.cast(t));
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78316a(Object obj) {
            return m78315a((Class<? super Object>) Object.class, obj);
        }

        /* JADX INFO: renamed from: a */
        public a m78317a(String str) throws UnknownHostException {
            if (str == null) {
                throw new IllegalArgumentException("IP address is null");
            }
            try {
                for (InetAddress inetAddress : InetAddress.getAllByName(str)) {
                    this.f54632g.add(inetAddress);
                }
                return this;
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }

        /* JADX INFO: renamed from: a */
        public a m78318a(String str, AbstractC18174f8 abstractC18174f8) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (abstractC18174f8 != null && !C18366t9.m79567b(str)) {
                throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("method ", str, " must not have a request body."));
            }
            if (abstractC18174f8 == null && C18366t9.m79570e(str)) {
                throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("method ", str, " must have a request body."));
            }
            this.f54627b = str;
            this.f54629d = abstractC18174f8;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78319a(String str, String str2) {
            this.f54628c.m79624a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78320a(URL url) {
            if (url != null) {
                return m78314a(C18416x7.m79913f(url.toString()));
            }
            throw new NullPointerException("url == null");
        }

        /* JADX INFO: renamed from: a */
        public a m78321a(ArrayList<String> arrayList) throws UnknownHostException {
            if (arrayList == null) {
                throw new IllegalArgumentException("additionalIpAddresses is null");
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                m78317a(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m78322a(boolean z) {
            this.f54631f = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C18160e8 m78323a() {
            if (this.f54626a != null) {
                return new C18160e8(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    public C18160e8(a aVar) {
        this.f54618a = aVar.f54626a;
        this.f54619b = aVar.f54627b;
        this.f54620c = aVar.f54628c.m79627a();
        this.f54621d = aVar.f54629d;
        this.f54622e = C18313p8.m79374a(aVar.f54630e);
        this.f54624g = aVar.f54631f;
        this.f54625h = aVar.f54632g;
    }

    /* JADX INFO: renamed from: a */
    public <T> T m78297a(Class<? extends T> cls) {
        return cls.cast(this.f54622e.get(cls));
    }

    /* JADX INFO: renamed from: b */
    public AbstractC18174f8 m78300b() {
        return this.f54621d;
    }

    /* JADX INFO: renamed from: c */
    public C18145d7 m78302c() {
        C18145d7 c18145d7 = this.f54623f;
        if (c18145d7 != null) {
            return c18145d7;
        }
        C18145d7 c18145d7M78189a = C18145d7.m78189a(this.f54620c);
        this.f54623f = c18145d7M78189a;
        return c18145d7M78189a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m78303d() {
        return this.f54624g;
    }

    /* JADX INFO: renamed from: e */
    public C18377u7 m78304e() {
        return this.f54620c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m78305f() {
        return m78298a("Http2ConnectionIndex") != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m78306g() {
        return this.f54618a.m79930i();
    }

    /* JADX INFO: renamed from: h */
    public String m78307h() {
        return this.f54619b;
    }

    /* JADX INFO: renamed from: i */
    public a m78308i() {
        return new a(this);
    }

    /* JADX INFO: renamed from: j */
    public Object m78309j() {
        return m78297a(Object.class);
    }

    /* JADX INFO: renamed from: k */
    public C18416x7 m78310k() {
        return this.f54618a;
    }

    public String toString() {
        return "Request{method=" + this.f54619b + ", url=" + this.f54618a + ", tags=" + this.f54622e + '}';
    }

    /* JADX INFO: renamed from: a */
    public String m78298a(String str) {
        return this.f54620c.m79613a(str);
    }

    /* JADX INFO: renamed from: b */
    public List<String> m78301b(String str) {
        return this.f54620c.m79620d(str);
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<InetAddress> m78299a() {
        return this.f54625h;
    }
}
