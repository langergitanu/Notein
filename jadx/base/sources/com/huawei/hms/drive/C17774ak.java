package com.huawei.hms.drive;

import androidx.appcompat.widget.C21532OooOOo;
import com.google.common.net.HttpHeaders;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.huawei.hms.drive.ak */
/* JADX INFO: loaded from: classes6.dex */
public final class C17774ak {

    /* JADX INFO: renamed from: a */
    public static final C17774ak f52563a = new a().m75975a().m75978c();

    /* JADX INFO: renamed from: b */
    public static final C17774ak f52564b = new a().m75977b().m75976a(Integer.MAX_VALUE, TimeUnit.SECONDS).m75978c();

    /* JADX INFO: renamed from: c */
    String f52565c;

    /* JADX INFO: renamed from: d */
    private final boolean f52566d;

    /* JADX INFO: renamed from: e */
    private final boolean f52567e;

    /* JADX INFO: renamed from: f */
    private final int f52568f;

    /* JADX INFO: renamed from: g */
    private final int f52569g;

    /* JADX INFO: renamed from: h */
    private final boolean f52570h;

    /* JADX INFO: renamed from: i */
    private final boolean f52571i;

    /* JADX INFO: renamed from: j */
    private final boolean f52572j;

    /* JADX INFO: renamed from: k */
    private final int f52573k;

    /* JADX INFO: renamed from: l */
    private final int f52574l;

    /* JADX INFO: renamed from: m */
    private final boolean f52575m;

    /* JADX INFO: renamed from: n */
    private final boolean f52576n;

    /* JADX INFO: renamed from: o */
    private final boolean f52577o;

    /* JADX INFO: renamed from: com.huawei.hms.drive.ak$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        boolean f52578a;

        /* JADX INFO: renamed from: b */
        boolean f52579b;

        /* JADX INFO: renamed from: c */
        int f52580c = -1;

        /* JADX INFO: renamed from: d */
        int f52581d = -1;

        /* JADX INFO: renamed from: e */
        int f52582e = -1;

        /* JADX INFO: renamed from: f */
        boolean f52583f;

        /* JADX INFO: renamed from: g */
        boolean f52584g;

        /* JADX INFO: renamed from: h */
        boolean f52585h;

        /* JADX INFO: renamed from: a */
        public a m75975a() {
            this.f52578a = true;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m75977b() {
            this.f52583f = true;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C17774ak m75978c() {
            return new C17774ak(this);
        }

        /* JADX INFO: renamed from: a */
        public a m75976a(int i, TimeUnit timeUnit) {
            if (i < 0) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "maxStale < 0: "));
            }
            long seconds = timeUnit.toSeconds(i);
            this.f52581d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }
    }

    private C17774ak(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f52566d = z;
        this.f52567e = z2;
        this.f52568f = i;
        this.f52569g = i2;
        this.f52570h = z3;
        this.f52571i = z4;
        this.f52572j = z5;
        this.f52573k = i3;
        this.f52574l = i4;
        this.f52575m = z6;
        this.f52576n = z7;
        this.f52577o = z8;
        this.f52565c = str;
    }

    /* JADX INFO: renamed from: j */
    private String m75965j() {
        StringBuilder sb = new StringBuilder();
        if (this.f52566d) {
            sb.append("no-cache, ");
        }
        if (this.f52567e) {
            sb.append("no-store, ");
        }
        if (this.f52568f != -1) {
            sb.append("max-age=");
            sb.append(this.f52568f);
            sb.append(", ");
        }
        if (this.f52569g != -1) {
            sb.append("s-maxage=");
            sb.append(this.f52569g);
            sb.append(", ");
        }
        if (this.f52570h) {
            sb.append("private, ");
        }
        if (this.f52571i) {
            sb.append("public, ");
        }
        if (this.f52572j) {
            sb.append("must-revalidate, ");
        }
        if (this.f52573k != -1) {
            sb.append("max-stale=");
            sb.append(this.f52573k);
            sb.append(", ");
        }
        if (this.f52574l != -1) {
            sb.append("min-fresh=");
            sb.append(this.f52574l);
            sb.append(", ");
        }
        if (this.f52575m) {
            sb.append("only-if-cached, ");
        }
        if (this.f52576n) {
            sb.append("no-transform, ");
        }
        if (this.f52577o) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m75966a() {
        return this.f52566d;
    }

    /* JADX INFO: renamed from: b */
    public boolean m75967b() {
        return this.f52567e;
    }

    /* JADX INFO: renamed from: c */
    public int m75968c() {
        return this.f52568f;
    }

    /* JADX INFO: renamed from: d */
    public boolean m75969d() {
        return this.f52570h;
    }

    /* JADX INFO: renamed from: e */
    public boolean m75970e() {
        return this.f52571i;
    }

    /* JADX INFO: renamed from: f */
    public boolean m75971f() {
        return this.f52572j;
    }

    /* JADX INFO: renamed from: g */
    public int m75972g() {
        return this.f52573k;
    }

    /* JADX INFO: renamed from: h */
    public int m75973h() {
        return this.f52574l;
    }

    /* JADX INFO: renamed from: i */
    public boolean m75974i() {
        return this.f52575m;
    }

    public String toString() {
        String str = this.f52565c;
        if (str != null) {
            return str;
        }
        String strM75965j = m75965j();
        this.f52565c = strM75965j;
        return strM75965j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C17774ak m75964a(C17788ay c17788ay) {
        int i;
        int iM76483a;
        String strTrim;
        C17788ay c17788ay2 = c17788ay;
        int iM76072a = c17788ay2.m76072a();
        int i2 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iM76488b = -1;
        int iM76488b2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iM76488b3 = -1;
        int iM76488b4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i2 < iM76072a) {
            String strM76073a = c17788ay2.m76073a(i2);
            String strM76076b = c17788ay2.m76076b(i2);
            if (strM76073a.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strM76076b;
                }
                for (i = 0; i < strM76076b.length(); i = iM76483a) {
                    int iM76483a2 = C17827cj.m76483a(strM76076b, i, "=,;");
                    String strTrim2 = strM76076b.substring(i, iM76483a2).trim();
                    if (iM76483a2 == strM76076b.length() || strM76076b.charAt(iM76483a2) == ',' || strM76076b.charAt(iM76483a2) == ';') {
                        iM76483a = iM76483a2 + 1;
                        strTrim = null;
                    } else {
                        int iM76482a = C17827cj.m76482a(strM76076b, iM76483a2 + 1);
                        if (iM76482a >= strM76076b.length() || strM76076b.charAt(iM76482a) != '\"') {
                            iM76483a = C17827cj.m76483a(strM76076b, iM76482a, ",;");
                            strTrim = strM76076b.substring(iM76482a, iM76483a).trim();
                        } else {
                            int i3 = iM76482a + 1;
                            int iM76483a3 = C17827cj.m76483a(strM76076b, i3, "\"");
                            strTrim = strM76076b.substring(i3, iM76483a3);
                            iM76483a = iM76483a3 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(strTrim2)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim2)) {
                        z3 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(strTrim2)) {
                            iM76488b = C17827cj.m76488b(strTrim, -1);
                        } else if ("s-maxage".equalsIgnoreCase(strTrim2)) {
                            iM76488b2 = C17827cj.m76488b(strTrim, -1);
                        } else if ("private".equalsIgnoreCase(strTrim2)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(strTrim2)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim2)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(strTrim2)) {
                            iM76488b3 = C17827cj.m76488b(strTrim, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim2)) {
                            iM76488b4 = C17827cj.m76488b(strTrim, -1);
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
                c17788ay2 = c17788ay;
            } else if (!strM76073a.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                i2++;
                c17788ay2 = c17788ay;
            }
            z = false;
            while (i < strM76076b.length()) {
            }
            i2++;
            c17788ay2 = c17788ay;
        }
        return new C17774ak(z2, z3, iM76488b, iM76488b2, z4, z5, z6, iM76488b3, iM76488b4, z7, z8, z9, !z ? null : str);
    }

    public C17774ak(a aVar) {
        this.f52566d = aVar.f52578a;
        this.f52567e = aVar.f52579b;
        this.f52568f = aVar.f52580c;
        this.f52569g = -1;
        this.f52570h = false;
        this.f52571i = false;
        this.f52572j = false;
        this.f52573k = aVar.f52581d;
        this.f52574l = aVar.f52582e;
        this.f52575m = aVar.f52583f;
        this.f52576n = aVar.f52584g;
        this.f52577o = aVar.f52585h;
    }
}
