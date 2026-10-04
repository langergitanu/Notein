package com.huawei.hms.framework.network.grs.p582h;

import com.huawei.hms.framework.common.Logger;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.h.e */
/* JADX INFO: loaded from: classes7.dex */
public class C17959e {

    /* JADX INFO: renamed from: a */
    private static final String f53754a = "e";

    /* JADX INFO: renamed from: a */
    public static boolean m77159a(Long l) {
        if (l == null) {
            Logger.m76965v(f53754a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
        } catch (NumberFormatException unused) {
            Logger.m76965v(f53754a, "isSpExpire spValue NumberFormatException.");
        }
        if (l.longValue() - System.currentTimeMillis() >= 0) {
            Logger.m76963i(f53754a, "isSpExpire false.");
            return false;
        }
        Logger.m76963i(f53754a, "isSpExpire true.");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m77160a(Long l, long j) {
        if (l == null) {
            Logger.m76965v(f53754a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l.longValue() - (System.currentTimeMillis() + j) >= 0) {
                Logger.m76965v(f53754a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.m76965v(f53754a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
