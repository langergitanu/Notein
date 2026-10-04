package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: com.huawei.hms.base.log.e */
/* JADX INFO: loaded from: classes6.dex */
public class C17738e implements InterfaceC17735b {

    /* JADX INFO: renamed from: a */
    public InterfaceC17735b f52501a;

    @Override // com.huawei.hms.base.log.InterfaceC17735b
    /* JADX INFO: renamed from: a */
    public void mo75829a(Context context, String str) {
        InterfaceC17735b interfaceC17735b = this.f52501a;
        if (interfaceC17735b != null) {
            interfaceC17735b.mo75829a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.InterfaceC17735b
    /* JADX INFO: renamed from: a */
    public void mo75830a(InterfaceC17735b interfaceC17735b) {
        this.f52501a = interfaceC17735b;
    }

    @Override // com.huawei.hms.base.log.InterfaceC17735b
    /* JADX INFO: renamed from: a */
    public void mo75831a(String str, int i, String str2, String str3) {
        Log.println(i, "HMSSDK_" + str2, str3);
        InterfaceC17735b interfaceC17735b = this.f52501a;
        if (interfaceC17735b != null) {
            interfaceC17735b.mo75831a(str, i, str2, str3);
        }
    }
}
