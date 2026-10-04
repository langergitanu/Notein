package com.huawei.hms.framework.network.grs.p579g;

import android.content.Context;
import android.net.Uri;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.p577e.C17935c;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.a */
/* JADX INFO: loaded from: classes7.dex */
public class C17941a {

    /* JADX INFO: renamed from: a */
    protected C17944d f53671a;

    /* JADX INFO: renamed from: b */
    private final String f53672b;

    /* JADX INFO: renamed from: c */
    private final C17943c f53673c;

    /* JADX INFO: renamed from: d */
    private final int f53674d;

    /* JADX INFO: renamed from: e */
    private final Context f53675e;

    /* JADX INFO: renamed from: f */
    private final String f53676f;

    /* JADX INFO: renamed from: g */
    private final GrsBaseInfo f53677g;

    /* JADX INFO: renamed from: h */
    private final C17935c f53678h;

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.a$a */
    public enum a {
        GRSPOST,
        GRSGET,
        GRSDEFAULT
    }

    public C17941a(String str, int i, C17943c c17943c, Context context, String str2, GrsBaseInfo grsBaseInfo, C17935c c17935c) {
        this.f53672b = str;
        this.f53673c = c17943c;
        this.f53674d = i;
        this.f53675e = context;
        this.f53676f = str2;
        this.f53677g = grsBaseInfo;
        this.f53678h = c17935c;
    }

    /* JADX INFO: renamed from: h */
    private a m77059h() {
        if (this.f53672b.isEmpty()) {
            return a.GRSDEFAULT;
        }
        String strM77058a = m77058a(this.f53672b);
        return strM77058a.contains("1.0") ? a.GRSGET : strM77058a.contains("2.0") ? a.GRSPOST : a.GRSDEFAULT;
    }

    /* JADX INFO: renamed from: a */
    public Context m77060a() {
        return this.f53675e;
    }

    /* JADX INFO: renamed from: b */
    public C17943c m77061b() {
        return this.f53673c;
    }

    /* JADX INFO: renamed from: c */
    public String m77062c() {
        return this.f53672b;
    }

    /* JADX INFO: renamed from: d */
    public int m77063d() {
        return this.f53674d;
    }

    /* JADX INFO: renamed from: e */
    public String m77064e() {
        return this.f53676f;
    }

    /* JADX INFO: renamed from: f */
    public C17935c m77065f() {
        return this.f53678h;
    }

    /* JADX INFO: renamed from: g */
    public Callable<C17944d> m77066g() {
        if (a.GRSDEFAULT.equals(m77059h())) {
            return null;
        }
        return a.GRSGET.equals(m77059h()) ? new CallableC17946f(this.f53672b, this.f53674d, this.f53673c, this.f53675e, this.f53676f, this.f53677g) : new CallableC17947g(this.f53672b, this.f53674d, this.f53673c, this.f53675e, this.f53676f, this.f53677g, this.f53678h);
    }

    /* JADX INFO: renamed from: a */
    private String m77058a(String str) {
        return Uri.parse(str).getPath();
    }
}
