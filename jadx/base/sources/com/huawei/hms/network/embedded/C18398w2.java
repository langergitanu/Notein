package com.huawei.hms.network.embedded;

import OooO0O0.OooO00o;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18437z2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w2 */
/* JADX INFO: loaded from: classes9.dex */
public class C18398w2 {

    /* JADX INFO: renamed from: d */
    public static final String f56516d = "HttpDnsClient";

    /* JADX INFO: renamed from: e */
    public static final String f56517e = "?domains=";

    /* JADX INFO: renamed from: f */
    public static final String f56518f = "/v1/";

    /* JADX INFO: renamed from: g */
    public static final String f56519g = "/batch-resolve";

    /* JADX INFO: renamed from: a */
    public String f56520a;

    /* JADX INFO: renamed from: b */
    public final C18411x2 f56521b = new C18411x2();

    /* JADX INFO: renamed from: c */
    public final C18437z2 f56522c = new C18437z2(m79821a());

    /* JADX INFO: renamed from: b */
    private C18385v2 m79819b(String str) {
        C18385v2 c18385v2M78840a = C18224j2.m78840a(str);
        return C18196h2.m78675b(c18385v2M78840a) ? InterfaceC18320q2.f55926b.lookup(str) : c18385v2M78840a;
    }

    /* JADX INFO: renamed from: a */
    public C18385v2 m79820a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C18385v2();
        }
        C18437z2.b bVarM80025a = this.f56522c.m80025a();
        if (bVarM80025a != null && bVarM80025a.m80028a()) {
            Logger.m76967w("HttpDnsClient", "HttpDns server is retry-after");
            return new C18385v2();
        }
        if (str.equals(this.f56521b.m79857b())) {
            return m79819b(str);
        }
        C18385v2 c18385v2M80024a = this.f56522c.m80024a(str);
        c18385v2M80024a.m79680b(3);
        c18385v2M80024a.m79674a(0);
        return c18385v2M80024a;
    }

    /* JADX INFO: renamed from: a */
    public String m79821a() {
        if (!TextUtils.isEmpty(this.f56520a)) {
            return this.f56520a;
        }
        String strM79858c = this.f56521b.m79858c();
        String strM79856a = this.f56521b.m79856a();
        this.f56520a = (TextUtils.isEmpty(strM79858c) || TextUtils.isEmpty(strM79856a)) ? "" : OooO00o.OooO0O0(strM79858c, f56518f, strM79856a, "/batch-resolve?domains=");
        return this.f56520a;
    }

    /* JADX INFO: renamed from: b */
    public C18411x2 m79823b() {
        return this.f56521b;
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<C18385v2> m79822a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        }
        C18437z2.b bVarM80025a = this.f56522c.m80025a();
        return (bVarM80025a == null || !bVarM80025a.m80028a()) ? this.f56522c.m80026a(list) : new ArrayList<>();
    }
}
