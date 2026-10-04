package com.huawei.hms.network.embedded;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.common.net.HttpHeaders;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.d7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18145d7 {

    /* JADX INFO: renamed from: n */
    public static final C18145d7 f54531n = new a().m78207c().m78204a();

    /* JADX INFO: renamed from: o */
    public static final C18145d7 f54532o = new a().m78211f().m78206b(Integer.MAX_VALUE, TimeUnit.SECONDS).m78204a();

    /* JADX INFO: renamed from: a */
    public final boolean f54533a;

    /* JADX INFO: renamed from: b */
    public final boolean f54534b;

    /* JADX INFO: renamed from: c */
    public final int f54535c;

    /* JADX INFO: renamed from: d */
    public final int f54536d;

    /* JADX INFO: renamed from: e */
    public final boolean f54537e;

    /* JADX INFO: renamed from: f */
    public final boolean f54538f;

    /* JADX INFO: renamed from: g */
    public final boolean f54539g;

    /* JADX INFO: renamed from: h */
    public final int f54540h;

    /* JADX INFO: renamed from: i */
    public final int f54541i;

    /* JADX INFO: renamed from: j */
    public final boolean f54542j;

    /* JADX INFO: renamed from: k */
    public final boolean f54543k;

    /* JADX INFO: renamed from: l */
    public final boolean f54544l;

    /* JADX INFO: renamed from: m */
    public String f54545m;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.d7$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public boolean f54546a;

        /* JADX INFO: renamed from: b */
        public boolean f54547b;

        /* JADX INFO: renamed from: c */
        public int f54548c = -1;

        /* JADX INFO: renamed from: d */
        public int f54549d = -1;

        /* JADX INFO: renamed from: e */
        public int f54550e = -1;

        /* JADX INFO: renamed from: f */
        public boolean f54551f;

        /* JADX INFO: renamed from: g */
        public boolean f54552g;

        /* JADX INFO: renamed from: h */
        public boolean f54553h;

        /* JADX INFO: renamed from: a */
        public a m78203a(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "maxAge < 0: "));
            }
            long seconds = timeUnit.toSeconds(i);
            this.f54548c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m78205b() {
            this.f54553h = true;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m78207c() {
            this.f54546a = true;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m78209d() {
            this.f54547b = true;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m78210e() {
            this.f54552g = true;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m78211f() {
            this.f54551f = true;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m78206b(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "maxStale < 0: "));
            }
            long seconds = timeUnit.toSeconds(i);
            this.f54549d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m78208c(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "minFresh < 0: "));
            }
            long seconds = timeUnit.toSeconds(i);
            this.f54550e = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C18145d7 m78204a() {
            return new C18145d7(this);
        }
    }

    public C18145d7(a aVar) {
        this.f54533a = aVar.f54546a;
        this.f54534b = aVar.f54547b;
        this.f54535c = aVar.f54548c;
        this.f54536d = -1;
        this.f54537e = false;
        this.f54538f = false;
        this.f54539g = false;
        this.f54540h = aVar.f54549d;
        this.f54541i = aVar.f54550e;
        this.f54542j = aVar.f54551f;
        this.f54543k = aVar.f54552g;
        this.f54544l = aVar.f54553h;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C18145d7 m78189a(C18377u7 c18377u7) {
        int i;
        int iM79515a;
        String strTrim;
        C18377u7 c18377u72 = c18377u7;
        int iM79619d = c18377u72.m79619d();
        int i2 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iM79514a = -1;
        int iM79514a2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iM79514a3 = -1;
        int iM79514a4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i2 < iM79619d) {
            String strM79612a = c18377u72.m79612a(i2);
            String strM79614b = c18377u72.m79614b(i2);
            if (strM79612a.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strM79614b;
                }
                for (i = 0; i < strM79614b.length(); i = iM79515a) {
                    int iM79515a2 = C18353s9.m79515a(strM79614b, i, "=,;");
                    String strTrim2 = strM79614b.substring(i, iM79515a2).trim();
                    if (iM79515a2 == strM79614b.length() || strM79614b.charAt(iM79515a2) == ',' || strM79614b.charAt(iM79515a2) == ';') {
                        iM79515a = iM79515a2 + 1;
                        strTrim = null;
                    } else {
                        int iM79526b = C18353s9.m79526b(strM79614b, iM79515a2 + 1);
                        if (iM79526b >= strM79614b.length() || strM79614b.charAt(iM79526b) != '\"') {
                            iM79515a = C18353s9.m79515a(strM79614b, iM79526b, ",;");
                            strTrim = strM79614b.substring(iM79526b, iM79515a).trim();
                        } else {
                            int i3 = iM79526b + 1;
                            int iM79515a3 = C18353s9.m79515a(strM79614b, i3, "\"");
                            strTrim = strM79614b.substring(i3, iM79515a3);
                            iM79515a = iM79515a3 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(strTrim2)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim2)) {
                        z3 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(strTrim2)) {
                            iM79514a = C18353s9.m79514a(strTrim, -1);
                        } else if ("s-maxage".equalsIgnoreCase(strTrim2)) {
                            iM79514a2 = C18353s9.m79514a(strTrim, -1);
                        } else if ("private".equalsIgnoreCase(strTrim2)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(strTrim2)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim2)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(strTrim2)) {
                            iM79514a3 = C18353s9.m79514a(strTrim, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim2)) {
                            iM79514a4 = C18353s9.m79514a(strTrim, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(strTrim2)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(strTrim2)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(strTrim2)) {
                            z9 = true;
                        }
                    }
                }
                i2++;
                c18377u72 = c18377u7;
            } else if (!strM79612a.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                i2++;
                c18377u72 = c18377u7;
            }
            z = false;
            while (i < strM79614b.length()) {
            }
            i2++;
            c18377u72 = c18377u7;
        }
        return new C18145d7(z2, z3, iM79514a, iM79514a2, z4, z5, z6, iM79514a3, iM79514a4, z7, z8, z9, !z ? null : str);
    }

    /* JADX INFO: renamed from: m */
    private String m78190m() {
        StringBuilder sb = new StringBuilder();
        if (this.f54533a) {
            sb.append("no-cache, ");
        }
        if (this.f54534b) {
            sb.append("no-store, ");
        }
        if (this.f54535c != -1) {
            sb.append("max-age=");
            sb.append(this.f54535c);
            sb.append(", ");
        }
        if (this.f54536d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f54536d);
            sb.append(", ");
        }
        if (this.f54537e) {
            sb.append("private, ");
        }
        if (this.f54538f) {
            sb.append("public, ");
        }
        if (this.f54539g) {
            sb.append("must-revalidate, ");
        }
        if (this.f54540h != -1) {
            sb.append("max-stale=");
            sb.append(this.f54540h);
            sb.append(", ");
        }
        if (this.f54541i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f54541i);
            sb.append(", ");
        }
        if (this.f54542j) {
            sb.append("only-if-cached, ");
        }
        if (this.f54543k) {
            sb.append("no-transform, ");
        }
        if (this.f54544l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m78192b() {
        return this.f54537e;
    }

    /* JADX INFO: renamed from: c */
    public boolean m78193c() {
        return this.f54538f;
    }

    /* JADX INFO: renamed from: d */
    public int m78194d() {
        return this.f54535c;
    }

    /* JADX INFO: renamed from: e */
    public int m78195e() {
        return this.f54540h;
    }

    /* JADX INFO: renamed from: f */
    public int m78196f() {
        return this.f54541i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m78197g() {
        return this.f54539g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m78198h() {
        return this.f54533a;
    }

    /* JADX INFO: renamed from: i */
    public boolean m78199i() {
        return this.f54534b;
    }

    /* JADX INFO: renamed from: j */
    public boolean m78200j() {
        return this.f54543k;
    }

    /* JADX INFO: renamed from: k */
    public boolean m78201k() {
        return this.f54542j;
    }

    /* JADX INFO: renamed from: l */
    public int m78202l() {
        return this.f54536d;
    }

    public String toString() {
        String str = this.f54545m;
        if (str != null) {
            return str;
        }
        String strM78190m = m78190m();
        this.f54545m = strM78190m;
        return strM78190m;
    }

    public C18145d7(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f54533a = z;
        this.f54534b = z2;
        this.f54535c = i;
        this.f54536d = i2;
        this.f54537e = z3;
        this.f54538f = z4;
        this.f54539g = z5;
        this.f54540h = i3;
        this.f54541i = i4;
        this.f54542j = z6;
        this.f54543k = z7;
        this.f54544l = z8;
        this.f54545m = str;
    }

    /* JADX INFO: renamed from: a */
    public boolean m78191a() {
        return this.f54544l;
    }
}
