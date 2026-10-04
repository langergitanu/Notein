package com.huawei.hms.drive;

import android.content.Context;
import com.huawei.cloud.base.http.HttpTransport;
import com.huawei.cloud.base.util.Preconditions;
import com.huawei.cloud.client.okhttp.OkHttpRequest;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.hms.drive.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C17876k extends HttpTransport {

    /* JADX INFO: renamed from: a */
    private static final String[] f53410a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC17875j f53411b;

    /* JADX INFO: renamed from: c */
    private Context f53412c;

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "POST", "PUT", "PATCH"};
        f53410a = strArr;
        Arrays.sort(strArr);
    }

    public C17876k(Context context) {
        this.f53412c = context;
        this.f53411b = new C17873h(context);
    }

    @Override // com.huawei.cloud.base.http.HttpTransport
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public OkHttpRequest buildRequest(String str, String str2) throws IOException {
        Preconditions.checkArgument(supportsMethod(str), "HTTP method %s not supported", str);
        return new OkHttpRequest(this.f53412c, this.f53411b.mo76786a(30), str, str2);
    }

    @Override // com.huawei.cloud.base.http.HttpTransport
    public boolean supportsMethod(String str) {
        return Arrays.binarySearch(f53410a, str) >= 0;
    }
}
