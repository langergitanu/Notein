package com.huawei.hms.base.log;

import android.content.Context;
import com.huawei.hms.support.log.HMSExtLogger;

/* JADX INFO: renamed from: com.huawei.hms.base.log.d */
/* JADX INFO: loaded from: classes6.dex */
public class C17737d implements InterfaceC17735b {

    /* JADX INFO: renamed from: a */
    public final HMSExtLogger f52499a;

    /* JADX INFO: renamed from: b */
    public InterfaceC17735b f52500b;

    public C17737d(HMSExtLogger hMSExtLogger) {
        this.f52499a = hMSExtLogger;
    }

    @Override // com.huawei.hms.base.log.InterfaceC17735b
    /* JADX INFO: renamed from: a */
    public void mo75829a(Context context, String str) {
        InterfaceC17735b interfaceC17735b = this.f52500b;
        if (interfaceC17735b != null) {
            interfaceC17735b.mo75829a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.InterfaceC17735b
    /* JADX INFO: renamed from: a */
    public void mo75830a(InterfaceC17735b interfaceC17735b) {
        this.f52500b = interfaceC17735b;
    }

    @Override // com.huawei.hms.base.log.InterfaceC17735b
    /* JADX INFO: renamed from: a */
    public void mo75831a(String str, int i, String str2, String str3) {
        HMSExtLogger hMSExtLogger = this.f52499a;
        if (hMSExtLogger != null) {
            if (i == 3) {
                hMSExtLogger.m80164d(str2, str3);
            } else if (i == 4) {
                hMSExtLogger.m80166i(str2, str3);
            } else if (i != 5) {
                hMSExtLogger.m80165e(str2, str3);
            } else {
                hMSExtLogger.m80167w(str2, str3);
            }
        }
        InterfaceC17735b interfaceC17735b = this.f52500b;
        if (interfaceC17735b != null) {
            interfaceC17735b.mo75831a(str, i, str2, str3);
        }
    }
}
