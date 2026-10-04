package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.h2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18196h2 {

    /* JADX INFO: renamed from: a */
    public static final String f55019a = "DnsUtil";

    /* JADX INFO: renamed from: b */
    public static final int f55020b = 10000;

    /* JADX INFO: renamed from: c */
    public static final int f55021c = 15000;

    /* JADX INFO: renamed from: d */
    public static int f55022d = 10000;

    /* JADX INFO: renamed from: a */
    public static int m78666a() {
        return f55022d;
    }

    /* JADX INFO: renamed from: b */
    public static List<InetAddress> m78673b(String str) throws UnknownHostException {
        C18126c2.m78048j().m78071d(0);
        return C18099a3.m77842a().m77843a(str);
    }

    /* JADX INFO: renamed from: a */
    public static C18385v2 m78667a(InetAddress[] inetAddressArr) {
        C18385v2 c18385v2 = new C18385v2();
        if (inetAddressArr != null && inetAddressArr.length > 0) {
            for (InetAddress inetAddress : inetAddressArr) {
                c18385v2.m79676a(inetAddress.getHostAddress());
            }
        }
        return c18385v2;
    }

    /* JADX INFO: renamed from: b */
    public static <T> void m78674b(List<T> list) {
        if (list == null) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size());
        linkedHashSet.addAll(list);
        list.clear();
        list.addAll(linkedHashSet);
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m78668a(C18385v2 c18385v2) {
        List<String> listM79686d = c18385v2.m79686d();
        m78674b(listM79686d);
        return listM79686d;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m78675b(C18385v2 c18385v2) {
        return c18385v2 == null || c18385v2.m79691i();
    }

    /* JADX INFO: renamed from: a */
    public static List<InetAddress> m78669a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(InetAddress.getByName(str));
            } catch (UnknownHostException unused) {
                Logger.m76967w(f55019a, "convertAddress failed, ip:" + str);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m78670a(int i) {
        if (i <= 0 || i > 15000) {
            return;
        }
        f55022d = i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78671a(String str) {
        try {
            return InetAddress.getByName(str) instanceof Inet4Address;
        } catch (SecurityException | UnknownHostException unused) {
            Logger.m76967w(f55019a, "Get Address from literal IP failed, Address:" + str);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78672a(InetAddress inetAddress) {
        return inetAddress instanceof Inet4Address;
    }
}
