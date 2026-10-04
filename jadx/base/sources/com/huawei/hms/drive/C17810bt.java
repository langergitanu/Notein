package com.huawei.hms.drive;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.drive.C17788ay;
import com.huawei.hms.drive.C17800bj;
import com.huawei.hms.network.embedded.C18385v2;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.drive.bt */
/* JADX INFO: loaded from: classes6.dex */
public final class C17810bt {

    /* JADX INFO: renamed from: a */
    public final C17798bh f52984a;

    /* JADX INFO: renamed from: b */
    public final C17800bj f52985b;

    public C17810bt(C17798bh c17798bh, C17800bj c17800bj) {
        this.f52984a = c17798bh;
        this.f52985b = c17800bj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.m76290i().m75969d() == false) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m76365a(C17800bj c17800bj, C17798bh c17798bh) {
        int iM76283b = c17800bj.m76283b();
        if (iM76283b != 200 && iM76283b != 410 && iM76283b != 414 && iM76283b != 501 && iM76283b != 203 && iM76283b != 204) {
            if (iM76283b != 307) {
                if (iM76283b != 308 && iM76283b != 404 && iM76283b != 405) {
                    switch (iM76283b) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (c17800bj.m76281a("Expires") == null) {
                if (c17800bj.m76290i().m75968c() == -1) {
                    if (!c17800bj.m76290i().m75970e()) {
                    }
                }
            }
        }
        return (c17800bj.m76290i().m75967b() || c17798bh.m76269h().m75967b()) ? false : true;
    }

    /* JADX INFO: renamed from: com.huawei.hms.drive.bt$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        final long f52986a;

        /* JADX INFO: renamed from: b */
        final C17798bh f52987b;

        /* JADX INFO: renamed from: c */
        final C17800bj f52988c;

        /* JADX INFO: renamed from: d */
        private Date f52989d;

        /* JADX INFO: renamed from: e */
        private String f52990e;

        /* JADX INFO: renamed from: f */
        private Date f52991f;

        /* JADX INFO: renamed from: g */
        private String f52992g;

        /* JADX INFO: renamed from: h */
        private Date f52993h;

        /* JADX INFO: renamed from: i */
        private long f52994i;

        /* JADX INFO: renamed from: j */
        private long f52995j;

        /* JADX INFO: renamed from: k */
        private String f52996k;

        /* JADX INFO: renamed from: l */
        private int f52997l;

        public a(long j, C17798bh c17798bh, C17800bj c17800bj) {
            this.f52997l = -1;
            this.f52986a = j;
            this.f52987b = c17798bh;
            this.f52988c = c17800bj;
            if (c17800bj != null) {
                this.f52994i = c17800bj.m76291j();
                this.f52995j = c17800bj.m76292k();
                C17788ay c17788ayM76286e = c17800bj.m76286e();
                int iM76072a = c17788ayM76286e.m76072a();
                for (int i = 0; i < iM76072a; i++) {
                    String strM76073a = c17788ayM76286e.m76073a(i);
                    String strM76076b = c17788ayM76286e.m76076b(i);
                    if ("Date".equalsIgnoreCase(strM76073a)) {
                        this.f52989d = C17826ci.m76480a(strM76076b);
                        this.f52990e = strM76076b;
                    } else if ("Expires".equalsIgnoreCase(strM76073a)) {
                        this.f52993h = C17826ci.m76480a(strM76076b);
                    } else if ("Last-Modified".equalsIgnoreCase(strM76073a)) {
                        this.f52991f = C17826ci.m76480a(strM76076b);
                        this.f52992g = strM76076b;
                    } else if ("ETag".equalsIgnoreCase(strM76073a)) {
                        this.f52996k = strM76076b;
                    } else if (HttpHeaders.AGE.equalsIgnoreCase(strM76073a)) {
                        this.f52997l = C17827cj.m76488b(strM76076b, -1);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private C17810bt m76367b() {
            String str;
            if (this.f52988c == null) {
                return new C17810bt(this.f52987b, null);
            }
            if ((!this.f52987b.m76270i() || this.f52988c.m76285d() != null) && C17810bt.m76365a(this.f52988c, this.f52987b)) {
                C17774ak c17774akM76269h = this.f52987b.m76269h();
                if (c17774akM76269h.m75966a() || m76366a(this.f52987b)) {
                    return new C17810bt(this.f52987b, null);
                }
                C17774ak c17774akM76290i = this.f52988c.m76290i();
                long jM76369d = m76369d();
                long jM76368c = m76368c();
                if (c17774akM76269h.m75968c() != -1) {
                    jM76368c = Math.min(jM76368c, TimeUnit.SECONDS.toMillis(c17774akM76269h.m75968c()));
                }
                long millis = 0;
                long millis2 = c17774akM76269h.m75973h() != -1 ? TimeUnit.SECONDS.toMillis(c17774akM76269h.m75973h()) : 0L;
                if (!c17774akM76290i.m75971f() && c17774akM76269h.m75972g() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(c17774akM76269h.m75972g());
                }
                if (!c17774akM76290i.m75966a()) {
                    long j = millis2 + jM76369d;
                    if (j < millis + jM76368c) {
                        C17800bj.a aVarM76288g = this.f52988c.m76288g();
                        if (j >= jM76368c) {
                            aVarM76288g.m76308b(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jM76369d > C18385v2.f56338j && m76370e()) {
                            aVarM76288g.m76308b(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C17810bt(null, aVarM76288g.m76305a());
                    }
                }
                String str2 = this.f52996k;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f52991f != null) {
                        str2 = this.f52992g;
                    } else {
                        if (this.f52989d == null) {
                            return new C17810bt(this.f52987b, null);
                        }
                        str2 = this.f52990e;
                    }
                    str = "If-Modified-Since";
                }
                C17788ay.a aVarM76075b = this.f52987b.m76264c().m76075b();
                AbstractC17804bn.f52952a.mo76228a(aVarM76075b, str, str2);
                return new C17810bt(this.f52987b.m76268g().m76272a(aVarM76075b.m76081a()).m76277a(), this.f52988c);
            }
            return new C17810bt(this.f52987b, null);
        }

        /* JADX INFO: renamed from: c */
        private long m76368c() {
            if (this.f52988c.m76290i().m75968c() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m75968c());
            }
            if (this.f52993h != null) {
                Date date = this.f52989d;
                long time = this.f52993h.getTime() - (date != null ? date.getTime() : this.f52995j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f52991f != null && this.f52988c.m76280a().m76261a().m76156k() == null) {
                Date date2 = this.f52989d;
                long time2 = (date2 != null ? date2.getTime() : this.f52994i) - this.f52991f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        /* JADX INFO: renamed from: d */
        private long m76369d() {
            Date date = this.f52989d;
            long jMax = date != null ? Math.max(0L, this.f52995j - date.getTime()) : 0L;
            int i = this.f52997l;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f52995j;
            return jMax + (j - this.f52994i) + (this.f52986a - j);
        }

        /* JADX INFO: renamed from: e */
        private boolean m76370e() {
            return this.f52988c.m76290i().m75968c() == -1 && this.f52993h == null;
        }

        /* JADX INFO: renamed from: a */
        public C17810bt m76371a() {
            C17810bt c17810btM76367b = m76367b();
            return (c17810btM76367b.f52984a == null || !this.f52987b.m76269h().m75974i()) ? c17810btM76367b : new C17810bt(null, null);
        }

        /* JADX INFO: renamed from: a */
        private static boolean m76366a(C17798bh c17798bh) {
            return (c17798bh.m76262a("If-Modified-Since") == null && c17798bh.m76262a("If-None-Match") == null) ? false : true;
        }
    }
}
