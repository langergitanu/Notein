package com.alipay.android.phone.mrpc.core.p004a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.huawei.hms.network.embedded.C18241k5;
import java.lang.reflect.Type;
import oo0O.C34669OooO0o0;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0143d extends AbstractC0140a {
    public C0143d(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.android.phone.mrpc.core.p004a.InterfaceC0142c
    /* JADX INFO: renamed from: a */
    public final Object mo43a() {
        try {
            String str = new String(this.f39b);
            Thread.currentThread().getId();
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("resultStatus");
            if (i == 1000) {
                return this.f38a == String.class ? jSONObject.optString("result") : C34669OooO0o0.OooO0O0(jSONObject.optString("result"), this.f38a);
            }
            throw new RpcException(Integer.valueOf(i), jSONObject.optString("tips"));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("response  =");
            sb.append(new String(this.f39b));
            sb.append(C18241k5.f55433h);
            sb.append(e);
            throw new RpcException((Integer) 10, sb.toString() == null ? "" : e.getMessage());
        }
    }
}
