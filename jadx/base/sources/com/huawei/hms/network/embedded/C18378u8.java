package com.huawei.hms.network.embedded;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18188g8;
import com.huawei.hms.network.embedded.C18377u7;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.u8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18378u8 {

    /* JADX INFO: renamed from: a */
    public final C18160e8 f56292a;

    /* JADX INFO: renamed from: b */
    public final C18188g8 f56293b;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.u8$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final long f56294a;

        /* JADX INFO: renamed from: b */
        public final C18160e8 f56295b;

        /* JADX INFO: renamed from: c */
        public final C18188g8 f56296c;

        /* JADX INFO: renamed from: d */
        public Date f56297d;

        /* JADX INFO: renamed from: e */
        public String f56298e;

        /* JADX INFO: renamed from: f */
        public Date f56299f;

        /* JADX INFO: renamed from: g */
        public String f56300g;

        /* JADX INFO: renamed from: h */
        public Date f56301h;

        /* JADX INFO: renamed from: i */
        public long f56302i;

        /* JADX INFO: renamed from: j */
        public long f56303j;

        /* JADX INFO: renamed from: k */
        public String f56304k;

        /* JADX INFO: renamed from: l */
        public int f56305l;

        public a(long j, C18160e8 c18160e8, C18188g8 c18188g8) {
            this.f56305l = -1;
            this.f56294a = j;
            this.f56295b = c18160e8;
            this.f56296c = c18188g8;
            if (c18188g8 != null) {
                this.f56302i = c18188g8.m78579I();
                this.f56303j = c18188g8.m78577G();
                C18377u7 c18377u7M78591y = c18188g8.m78591y();
                int iM79619d = c18377u7M78591y.m79619d();
                for (int i = 0; i < iM79619d; i++) {
                    String strM79612a = c18377u7M78591y.m79612a(i);
                    String strM79614b = c18377u7M78591y.m79614b(i);
                    if ("Date".equalsIgnoreCase(strM79612a)) {
                        this.f56297d = C18340r9.m79459a(strM79614b);
                        this.f56298e = strM79614b;
                    } else if ("Expires".equalsIgnoreCase(strM79612a)) {
                        this.f56301h = C18340r9.m79459a(strM79614b);
                    } else if ("Last-Modified".equalsIgnoreCase(strM79612a)) {
                        this.f56299f = C18340r9.m79459a(strM79614b);
                        this.f56300g = strM79614b;
                    } else if ("ETag".equalsIgnoreCase(strM79612a)) {
                        this.f56304k = strM79614b;
                    } else if (HttpHeaders.AGE.equalsIgnoreCase(strM79612a)) {
                        this.f56305l = C18353s9.m79514a(strM79614b, -1);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        private long m79638b() {
            Date date = this.f56297d;
            long jMax = date != null ? Math.max(0L, this.f56303j - date.getTime()) : 0L;
            int i = this.f56305l;
            if (i != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f56303j;
            return jMax + (j - this.f56302i) + (this.f56294a - j);
        }

        /* JADX INFO: renamed from: c */
        private long m79639c() {
            if (this.f56296c.m78586t().m78194d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m78194d());
            }
            if (this.f56301h != null) {
                Date date = this.f56297d;
                long time = this.f56301h.getTime() - (date != null ? date.getTime() : this.f56303j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f56299f != null && this.f56296c.m78578H().m78310k().m79936o() == null) {
                Date date2 = this.f56297d;
                long time2 = (date2 != null ? date2.getTime() : this.f56302i) - this.f56299f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        /* JADX INFO: renamed from: d */
        private C18378u8 m79640d() {
            String str;
            if (this.f56296c == null) {
                return new C18378u8(this.f56295b, null);
            }
            if ((!this.f56295b.m78306g() || this.f56296c.m78590x() != null) && C18378u8.m79636a(this.f56296c, this.f56295b)) {
                C18145d7 c18145d7M78302c = this.f56295b.m78302c();
                if (c18145d7M78302c.m78198h() || m79637a(this.f56295b)) {
                    return new C18378u8(this.f56295b, null);
                }
                C18145d7 c18145d7M78586t = this.f56296c.m78586t();
                long jM79638b = m79638b();
                long jM79639c = m79639c();
                if (c18145d7M78302c.m78194d() != -1) {
                    jM79639c = Math.min(jM79639c, TimeUnit.SECONDS.toMillis(c18145d7M78302c.m78194d()));
                }
                long millis = 0;
                long millis2 = c18145d7M78302c.m78196f() != -1 ? TimeUnit.SECONDS.toMillis(c18145d7M78302c.m78196f()) : 0L;
                if (!c18145d7M78586t.m78197g() && c18145d7M78302c.m78195e() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(c18145d7M78302c.m78195e());
                }
                if (!c18145d7M78586t.m78198h()) {
                    long j = millis2 + jM79638b;
                    if (j < millis + jM79639c) {
                        C18188g8.a aVarM78574D = this.f56296c.m78574D();
                        if (j >= jM79639c) {
                            aVarM78574D.m78604a(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jM79638b > C18385v2.f56338j && m79641e()) {
                            aVarM78574D.m78604a(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C18378u8(null, aVarM78574D.m78605a());
                    }
                }
                String str2 = this.f56304k;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f56299f != null) {
                        str2 = this.f56300g;
                    } else {
                        if (this.f56297d == null) {
                            return new C18378u8(this.f56295b, null);
                        }
                        str2 = this.f56298e;
                    }
                    str = "If-Modified-Since";
                }
                C18377u7.a aVarM79617c = this.f56295b.m78304e().m79617c();
                AbstractC18286n8.f55777a.mo77973a(aVarM79617c, str, str2);
                return new C18378u8(this.f56295b.m78308i().m78313a(aVarM79617c.m79627a()).m78323a(), this.f56296c);
            }
            return new C18378u8(this.f56295b, null);
        }

        /* JADX INFO: renamed from: e */
        private boolean m79641e() {
            return this.f56296c.m78586t().m78194d() == -1 && this.f56301h == null;
        }

        /* JADX INFO: renamed from: a */
        public C18378u8 m79642a() {
            C18378u8 c18378u8M79640d = m79640d();
            return (c18378u8M79640d.f56292a == null || !this.f56295b.m78302c().m78201k()) ? c18378u8M79640d : new C18378u8(null, null);
        }

        /* JADX INFO: renamed from: a */
        public static boolean m79637a(C18160e8 c18160e8) {
            return (c18160e8.m78298a("If-Modified-Since") == null && c18160e8.m78298a("If-None-Match") == null) ? false : true;
        }
    }

    public C18378u8(C18160e8 c18160e8, C18188g8 c18188g8) {
        this.f56292a = c18160e8;
        this.f56293b = c18188g8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.m78586t().m78192b() == false) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m79636a(C18188g8 c18188g8, C18160e8 c18160e8) {
        int iM78589w = c18188g8.m78589w();
        if (iM78589w != 200 && iM78589w != 410 && iM78589w != 414 && iM78589w != 501 && iM78589w != 203 && iM78589w != 204) {
            if (iM78589w != 307) {
                if (iM78589w != 308 && iM78589w != 404 && iM78589w != 405) {
                    switch (iM78589w) {
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
            if (c18188g8.m78582b("Expires") == null) {
                if (c18188g8.m78586t().m78194d() == -1) {
                    if (!c18188g8.m78586t().m78193c()) {
                    }
                }
            }
        }
        return (c18188g8.m78586t().m78199i() || c18160e8.m78302c().m78199i()) ? false : true;
    }
}
