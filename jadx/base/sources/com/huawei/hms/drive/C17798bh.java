package com.huawei.hms.drive;

import OooOoo.C20593OooO0Oo;
import androidx.concurrent.futures.OooO0O0;
import com.huawei.hms.drive.C17788ay;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.drive.bh */
/* JADX INFO: loaded from: classes6.dex */
public final class C17798bh {

    /* JADX INFO: renamed from: a */
    final C17792bb f52891a;

    /* JADX INFO: renamed from: b */
    final String f52892b;

    /* JADX INFO: renamed from: c */
    final C17788ay f52893c;

    /* JADX INFO: renamed from: d */
    final AbstractC17799bi f52894d;

    /* JADX INFO: renamed from: e */
    final Map<Class<?>, Object> f52895e;

    /* JADX INFO: renamed from: f */
    final boolean f52896f;

    /* JADX INFO: renamed from: g */
    final ArrayList<InetAddress> f52897g;

    /* JADX INFO: renamed from: h */
    private volatile C17774ak f52898h;

    /* JADX INFO: renamed from: com.huawei.hms.drive.bh$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        C17792bb f52899a;

        /* JADX INFO: renamed from: b */
        String f52900b;

        /* JADX INFO: renamed from: c */
        C17788ay.a f52901c;

        /* JADX INFO: renamed from: d */
        AbstractC17799bi f52902d;

        /* JADX INFO: renamed from: e */
        Map<Class<?>, Object> f52903e;

        /* JADX INFO: renamed from: f */
        boolean f52904f;

        /* JADX INFO: renamed from: g */
        ArrayList<InetAddress> f52905g;

        public a() {
            this.f52903e = Collections.EMPTY_MAP;
            this.f52904f = false;
            this.f52905g = new ArrayList<>();
            this.f52900b = "GET";
            this.f52901c = new C17788ay.a();
        }

        /* JADX INFO: renamed from: a */
        public a m76273a(C17792bb c17792bb) {
            if (c17792bb == null) {
                throw new NullPointerException("url == null");
            }
            this.f52899a = c17792bb;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m76279b(String str, String str2) {
            this.f52901c.m76080a(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m76278b(String str) {
            this.f52901c.m76082b(str);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76274a(String str) {
            String strOooO00o;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    strOooO00o = OooO0O0.OooO00o(str, 3, new StringBuilder("http:"));
                } else {
                    strOooO00o = str.regionMatches(true, 0, "wss:", 0, 4) ? OooO0O0.OooO00o(str, 4, new StringBuilder("https:")) : str;
                }
                return m76273a(C17792bb.m76143e(strOooO00o));
            }
            throw new NullPointerException("url == null");
        }

        public a(C17798bh c17798bh) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f52903e = map;
            this.f52904f = false;
            this.f52905g = new ArrayList<>();
            this.f52899a = c17798bh.f52891a;
            this.f52900b = c17798bh.f52892b;
            this.f52902d = c17798bh.f52894d;
            this.f52903e = c17798bh.f52895e.isEmpty() ? map : new LinkedHashMap<>(c17798bh.f52895e);
            this.f52901c = c17798bh.f52893c.m76075b();
            this.f52904f = c17798bh.f52896f;
            this.f52905g = c17798bh.f52897g;
        }

        /* JADX INFO: renamed from: a */
        public a m76276a(String str, String str2) {
            this.f52901c.m76084c(str, str2);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76272a(C17788ay c17788ay) {
            this.f52901c = c17788ay.m76075b();
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m76275a(String str, AbstractC17799bi abstractC17799bi) {
            if (str != null) {
                if (str.length() == 0) {
                    throw new IllegalArgumentException("method.length() == 0");
                }
                if (abstractC17799bi != null && !C17828ck.m76492c(str)) {
                    throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("method ", str, " must not have a request body."));
                }
                if (abstractC17799bi == null && C17828ck.m76491b(str)) {
                    throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("method ", str, " must have a request body."));
                }
                this.f52900b = str;
                this.f52902d = abstractC17799bi;
                return this;
            }
            throw new NullPointerException("method == null");
        }

        /* JADX INFO: renamed from: a */
        public C17798bh m76277a() {
            if (this.f52899a != null) {
                return new C17798bh(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    public C17798bh(a aVar) {
        this.f52891a = aVar.f52899a;
        this.f52892b = aVar.f52900b;
        this.f52893c = aVar.f52901c.m76081a();
        this.f52894d = aVar.f52902d;
        this.f52895e = C17806bp.m76334a(aVar.f52903e);
        this.f52896f = aVar.f52904f;
        this.f52897g = aVar.f52905g;
    }

    /* JADX INFO: renamed from: a */
    public C17792bb m76261a() {
        return this.f52891a;
    }

    /* JADX INFO: renamed from: b */
    public String m76263b() {
        return this.f52892b;
    }

    /* JADX INFO: renamed from: c */
    public C17788ay m76264c() {
        return this.f52893c;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC17799bi m76265d() {
        return this.f52894d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m76266e() {
        return this.f52896f;
    }

    /* JADX INFO: renamed from: f */
    public ArrayList<InetAddress> m76267f() {
        return this.f52897g;
    }

    /* JADX INFO: renamed from: g */
    public a m76268g() {
        return new a(this);
    }

    /* JADX INFO: renamed from: h */
    public C17774ak m76269h() {
        C17774ak c17774ak = this.f52898h;
        if (c17774ak != null) {
            return c17774ak;
        }
        C17774ak c17774akM75964a = C17774ak.m75964a(this.f52893c);
        this.f52898h = c17774akM75964a;
        return c17774akM75964a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m76270i() {
        return this.f52891a.m76147c();
    }

    /* JADX INFO: renamed from: j */
    public boolean m76271j() {
        return m76262a("Http2ConnectionIndex") != null;
    }

    public String toString() {
        return "Request{method=" + this.f52892b + ", url=" + this.f52891a + ", tags=" + this.f52895e + '}';
    }

    /* JADX INFO: renamed from: a */
    public String m76262a(String str) {
        return this.f52893c.m76074a(str);
    }
}
