package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p289n2.C6695m9;
import com.aspose.slides.internal.p289n2.C6696ne;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.x6 */
/* JADX INFO: loaded from: classes5.dex */
public class C11988x6 {
    static {
        C6695m9.m26448h4();
    }

    /* JADX INFO: renamed from: du */
    private static void m56271du(String str) {
        if ("0.0.0.0".equals(str) || "::0".equals(str)) {
            throw new ArgumentException(C14113y2.m67408k4("Addresses 0.0.0.0 (IPv4) ", "and ::0 (IPv6) are unspecified addresses. You ", "cannot use them as target address."), "hostNameOrAddress");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C11924bz m56272k4(C11972ts c11972ts) {
        if (c11972ts != null) {
            return m56274k4(c11972ts.toString(), false);
        }
        throw new ArgumentNullException("address");
    }

    /* JADX INFO: renamed from: kk */
    public static C11972ts[] m56276kk(String str) {
        if (str == null) {
            throw new ArgumentNullException("hostNameOrAddress");
        }
        m56271du(str);
        C11972ts[] c11972tsArr = {null};
        return str.length() > 0 && C11972ts.m56134k4(str, c11972tsArr) ? new C11972ts[]{c11972tsArr[0]} : m56278x1(str).m55881k4();
    }

    @Deprecated
    /* JADX INFO: renamed from: to */
    public static C11924bz m56277to(String str) {
        if (str == null) {
            throw new ArgumentNullException("hostName");
        }
        if (str.length() > 255 || (str.length() == 255 && str.charAt(StyleIdentifier.MEDIUM_GRID_2_ACCENT_6) != '.')) {
            throw new ArgumentOutOfRangeException("hostName", String.format("The size of hostName is too long. It cannot be longer than %d characters.", 255));
        }
        if (str.length() == 0) {
            str = "localhost";
        }
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            C11924bz c11924bz = new C11924bz();
            if (allByName != null && allByName.length > 0) {
                c11924bz.m55878k4(allByName[0].getHostName());
                C11972ts[] c11972tsArr = new C11972ts[allByName.length];
                for (int i = 0; i < allByName.length; i++) {
                    c11972tsArr[i] = C11972ts.m56130k4(allByName[i].getHostAddress());
                }
                c11924bz.m55879k4(c11972tsArr);
            }
            return c11924bz;
        } catch (UnknownHostException e) {
            throw new C6696ne(11001, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static C11924bz m56278x1(String str) {
        if (str == null) {
            throw new ArgumentNullException("hostNameOrAddress");
        }
        m56271du(str);
        C11972ts[] c11972tsArr = {null};
        return str.length() > 0 && C11972ts.m56134k4(str, c11972tsArr) ? m56272k4(c11972tsArr[0]) : m56277to(str);
    }

    /* JADX INFO: renamed from: k4 */
    private static C11924bz m56273k4(String str, String str2, String[] strArr, String[] strArr2) {
        C11924bz c11924bz = new C11924bz();
        ArrayList arrayList = new ArrayList();
        c11924bz.m55878k4(str2);
        c11924bz.m55880k4(strArr);
        for (int i = 0; i < AbstractC14092to.m67208k4((Object) strArr2).m67265du(); i++) {
            try {
                C11972ts c11972tsM56130k4 = C11972ts.m56130k4(strArr2[i]);
                if ((C6695m9.m26447du() && c11972tsM56130k4.m56141du() == 23) || (C6695m9.m26468to() && c11972tsM56130k4.m56141du() == 2)) {
                    arrayList.addItem(c11972tsM56130k4);
                }
            } catch (ArgumentNullException unused) {
            }
        }
        if (arrayList.size() == 0) {
            m56275k4(str);
        }
        c11924bz.m55879k4((C11972ts[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(arrayList.toArray(C7019kk.m27443k4((Class<?>) C11972ts.class))), C11972ts[].class));
        return c11924bz;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11924bz m56274k4(String str, boolean z) {
        String[] strArr;
        if (C14113y2.m67363du(str, "0.0.0.0")) {
            str = "127.0.0.1";
            z = false;
        }
        if (z) {
            C11972ts.m56130k4(str);
        }
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            String hostName = (allByName == null || allByName.length <= 0) ? null : allByName[0].getHostName();
            if (allByName == null || allByName.length <= 0) {
                strArr = null;
            } else {
                strArr = new String[allByName.length];
                for (int i = 0; i < AbstractC14092to.m67208k4((Object) strArr).m67265du(); i++) {
                    strArr[i] = allByName[i].getHostAddress();
                }
            }
            return m56273k4(str, hostName, null, strArr);
        } catch (UnknownHostException e) {
            throw new C6696ne(11001, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m56275k4(String str) {
        throw new C6696ne(11001, C14113y2.m67402k4("Could not resolve host '{0}'", str));
    }
}
