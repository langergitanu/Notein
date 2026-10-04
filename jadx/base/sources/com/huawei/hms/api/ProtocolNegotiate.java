package com.huawei.hms.api;

import OooO0O0.OooO00o;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ProtocolNegotiate {

    /* JADX INFO: renamed from: b */
    private static ProtocolNegotiate f52468b = new ProtocolNegotiate();

    /* JADX INFO: renamed from: a */
    private int f52469a = 1;

    public static ProtocolNegotiate getInstance() {
        return f52468b;
    }

    public int getVersion() {
        return this.f52469a;
    }

    public int negotiate(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            this.f52469a = 1;
            return 1;
        }
        if (list.contains(2)) {
            this.f52469a = 2;
        } else {
            this.f52469a = ((Integer) OooO00o.OooO00o(1, list)).intValue();
        }
        return this.f52469a;
    }
}
