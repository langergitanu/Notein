package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.huawei.hms.hatool.a1 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC17969a1 {
    /* JADX INFO: renamed from: a */
    public final C18029x0 m77204a(int i) {
        String strM77213f;
        if (i != 0) {
            strM77213f = m77213f();
            if (!TextUtils.isEmpty(strM77213f)) {
                return new C18029x0(EnumC18031y0.UDID, strM77213f);
            }
        } else {
            strM77213f = "";
        }
        return new C18029x0(EnumC18031y0.EMPTY, strM77213f);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo77206a();

    /* JADX INFO: renamed from: a */
    public abstract String mo77207a(String str);

    /* JADX INFO: renamed from: b */
    public final C18029x0 m77208b(int i) {
        String strM77213f;
        if ((i & 4) != 0) {
            strM77213f = m77213f();
            if (!TextUtils.isEmpty(strM77213f)) {
                return new C18029x0(EnumC18031y0.UDID, strM77213f);
            }
        } else {
            strM77213f = "";
        }
        return new C18029x0(EnumC18031y0.EMPTY, strM77213f);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo77209b();

    /* JADX INFO: renamed from: c */
    public abstract String mo77210c();

    /* JADX INFO: renamed from: d */
    public abstract int mo77211d();

    /* JADX INFO: renamed from: e */
    public final boolean m77212e() {
        C18000l c18000lM77358b = C17991i.m77353c().m77358b();
        if (TextUtils.isEmpty(c18000lM77358b.m77445l())) {
            c18000lM77358b.m77438h(AbstractC17982f.m77305a());
        }
        return !TextUtils.isEmpty(c18000lM77358b.m77445l());
    }

    /* JADX INFO: renamed from: f */
    public final String m77213f() {
        C18000l c18000lM77358b = C17991i.m77353c().m77358b();
        if (TextUtils.isEmpty(c18000lM77358b.m77439i())) {
            c18000lM77358b.m77432e(C17972b1.m77239c());
        }
        return c18000lM77358b.m77439i();
    }

    /* JADX INFO: renamed from: a */
    public C18029x0 m77205a(Context context) {
        String strMo77210c = mo77210c();
        if (!TextUtils.isEmpty(strMo77210c)) {
            return new C18029x0(EnumC18031y0.UDID, strMo77210c);
        }
        String strMo77206a = mo77206a();
        if (!TextUtils.isEmpty(strMo77206a)) {
            return new C18029x0(EnumC18031y0.IMEI, strMo77206a);
        }
        boolean zM77212e = m77212e();
        String strMo77209b = mo77209b();
        return !TextUtils.isEmpty(strMo77209b) ? zM77212e ? new C18029x0(EnumC18031y0.SN, strMo77209b) : new C18029x0(EnumC18031y0.UDID, mo77207a(strMo77209b)) : zM77212e ? m77204a(mo77211d()) : m77208b(mo77211d());
    }
}
