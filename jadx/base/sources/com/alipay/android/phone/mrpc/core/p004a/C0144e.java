package com.alipay.android.phone.mrpc.core.p004a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.network.embedded.C18416x7;
import java.util.ArrayList;
import java.util.Objects;
import oo0O.C34668OooO0o;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0144e extends AbstractC0141b {

    /* JADX INFO: renamed from: c */
    public int f42c;

    /* JADX INFO: renamed from: d */
    public Object f43d;

    public C0144e(int i, String str, Object obj) {
        super(str, obj);
        this.f42c = i;
    }

    @Override // com.alipay.android.phone.mrpc.core.p004a.InterfaceC0145f
    /* JADX INFO: renamed from: a */
    public final void mo44a(Object obj) {
        this.f43d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.p004a.InterfaceC0145f
    /* JADX INFO: renamed from: a */
    public final byte[] mo45a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.f43d != null) {
                arrayList.add(new BasicNameValuePair("extParam", C34668OooO0o.OooO00o(this.f43d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f40a));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f42c);
            arrayList.add(new BasicNameValuePair("id", sb.toString()));
            Objects.toString(this.f41b);
            Object obj = this.f41b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? C18416x7.f56644n : C34668OooO0o.OooO00o(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("request  =");
            sb2.append(this.f41b);
            sb2.append(C18241k5.f55433h);
            sb2.append(e);
            throw new RpcException(9, sb2.toString() == null ? "" : e.getMessage(), e);
        }
    }
}
