package com.huawei.agconnect.credential.obs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.AAID;
import com.huawei.agconnect.common.api.AgcCrypto;
import com.huawei.agconnect.datastore.annotation.SharedPreference;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.a */
/* JADX INFO: loaded from: classes8.dex */
public class C17598a implements AAID {

    @SharedPreference(crypto = AgcCrypto.class, fileName = "com.huawei.agconnect", key = C17625c.f52154a)
    String aaidString;

    @Override // com.huawei.agconnect.common.api.AAID
    public String getId() {
        if (!TextUtils.isEmpty(this.aaidString)) {
            return this.aaidString;
        }
        C17624b.m75515a().m75521d(this);
        if (!TextUtils.isEmpty(this.aaidString)) {
            return this.aaidString;
        }
        Context context = AGConnectInstance.getInstance().getContext();
        this.aaidString = C17625c.m75525a(context.getPackageName() + C17625c.m75523a(context));
        C17624b.m75515a().m75516a(this);
        return this.aaidString;
    }
}
