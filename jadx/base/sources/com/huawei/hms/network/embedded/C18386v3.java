package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.base.common.Headers;
import java.util.Locale;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.v3 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18386v3 {

    /* JADX INFO: renamed from: a */
    public final boolean f56350a;

    /* JADX INFO: renamed from: b */
    public final boolean f56351b;

    /* JADX INFO: renamed from: c */
    public final int f56352c;

    /* JADX INFO: renamed from: d */
    public final int f56353d;

    /* JADX INFO: renamed from: e */
    public final boolean f56354e;

    /* JADX INFO: renamed from: f */
    public final boolean f56355f;

    /* JADX INFO: renamed from: g */
    public final boolean f56356g;

    /* JADX INFO: renamed from: h */
    public final int f56357h;

    /* JADX INFO: renamed from: i */
    public final int f56358i;

    /* JADX INFO: renamed from: j */
    public final boolean f56359j;

    /* JADX INFO: renamed from: k */
    public final boolean f56360k;

    /* JADX INFO: renamed from: l */
    public final boolean f56361l;

    public C18386v3(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8) {
        this.f56350a = z;
        this.f56351b = z2;
        this.f56352c = i;
        this.f56353d = i2;
        this.f56354e = z3;
        this.f56355f = z4;
        this.f56356g = z5;
        this.f56357h = i3;
        this.f56358i = i4;
        this.f56359j = z6;
        this.f56360k = z7;
        this.f56361l = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C18386v3 parse(Headers headers) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z9;
        int iSkipUntil;
        String strTrim;
        String str = headers.get(HttpHeaders.PRAGMA);
        boolean z10 = !TextUtils.isEmpty(str) && str.trim().toLowerCase(Locale.ROOT).equals("no-cache");
        String str2 = headers.get("Cache-Control");
        if (TextUtils.isEmpty(str2)) {
            z = z10;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = false;
            i = -1;
            i2 = -1;
            i3 = -1;
            i4 = -1;
        } else {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            int seconds = -1;
            int seconds2 = -1;
            int seconds3 = -1;
            int seconds4 = -1;
            for (int i5 = 0; i5 < lowerCase.length(); i5 = iSkipUntil) {
                int iSkipUntil2 = C18100a4.skipUntil(lowerCase, i5, "=,;");
                String strTrim2 = StringUtils.substring(lowerCase, i5, iSkipUntil2).trim();
                if (iSkipUntil2 != lowerCase.length()) {
                    z9 = z10;
                    if (lowerCase.charAt(iSkipUntil2) != ',' && lowerCase.charAt(iSkipUntil2) != ';') {
                        int iSkipWhitespace = C18100a4.skipWhitespace(lowerCase, iSkipUntil2 + 1);
                        if (iSkipWhitespace >= lowerCase.length() || lowerCase.charAt(iSkipWhitespace) != '\"') {
                            iSkipUntil = C18100a4.skipUntil(lowerCase, iSkipWhitespace, ",;");
                            strTrim = StringUtils.substring(lowerCase, iSkipWhitespace, iSkipUntil).trim();
                        } else {
                            int i6 = iSkipWhitespace + 1;
                            int iSkipUntil3 = C18100a4.skipUntil(lowerCase, i6, "\"");
                            strTrim = StringUtils.substring(lowerCase, i6, iSkipUntil3);
                            iSkipUntil = iSkipUntil3 + 1;
                        }
                    }
                    if ("no-cache".equals(strTrim2)) {
                        if ("no-store".equals(strTrim2)) {
                            z11 = true;
                        } else {
                            if ("max-age".equals(strTrim2)) {
                                seconds = C18100a4.parseSeconds(strTrim, -1);
                            } else if ("s-maxage".equals(strTrim2)) {
                                seconds2 = C18100a4.parseSeconds(strTrim, -1);
                            } else if ("private".equals(strTrim2)) {
                                z12 = true;
                            } else if ("public".equals(strTrim2)) {
                                z13 = true;
                            } else if ("must-revalidate".equals(strTrim2)) {
                                z14 = true;
                            } else if ("max-stale".equals(strTrim2)) {
                                seconds3 = C18100a4.parseSeconds(strTrim, Integer.MAX_VALUE);
                            } else if ("min-fresh".equals(strTrim2)) {
                                seconds4 = C18100a4.parseSeconds(strTrim, -1);
                            } else if ("only-if-cached".equals(strTrim2)) {
                                z15 = true;
                            } else if ("no-transform".equals(strTrim2)) {
                                z16 = true;
                            } else if ("immutable".equals(strTrim2)) {
                                z17 = true;
                            }
                            z10 = z9;
                        }
                        z10 = z9;
                    } else {
                        z10 = true;
                    }
                } else {
                    z9 = z10;
                }
                iSkipUntil = iSkipUntil2 + 1;
                strTrim = null;
                if ("no-cache".equals(strTrim2)) {
                }
            }
            z2 = z11;
            z3 = z12;
            z4 = z13;
            z5 = z14;
            z6 = z15;
            z7 = z16;
            z8 = z17;
            i = seconds;
            i2 = seconds2;
            i3 = seconds3;
            i4 = seconds4;
            z = z10;
        }
        return new C18386v3(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8);
    }

    public boolean immutable() {
        return this.f56361l;
    }

    public boolean isPrivate() {
        return this.f56354e;
    }

    public boolean isPublic() {
        return this.f56355f;
    }

    public int maxAgeSeconds() {
        return this.f56352c;
    }

    public int maxStaleSeconds() {
        return this.f56357h;
    }

    public int minFreshSeconds() {
        return this.f56358i;
    }

    public boolean mustRevalidate() {
        return this.f56356g;
    }

    public boolean noCache() {
        return this.f56350a;
    }

    public boolean noStore() {
        return this.f56351b;
    }

    public boolean noTransform() {
        return this.f56360k;
    }

    public boolean onlyIfCached() {
        return this.f56359j;
    }

    public int sMaxAgeSeconds() {
        return this.f56353d;
    }
}
