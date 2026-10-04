package com.huawei.hms.network.embedded;

import java.util.List;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.u5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18375u5 {
    public static final int INTERVAL = 500;

    /* JADX INFO: renamed from: a */
    public static volatile C18375u5 f56274a;

    public static C18375u5 getInstance() {
        if (f56274a == null) {
            synchronized (C18375u5.class) {
                try {
                    if (f56274a == null) {
                        f56274a = new C18375u5();
                    }
                } finally {
                }
            }
        }
        return f56274a;
    }

    public int getChainInterval() {
        return 500;
    }

    public List<String> sortIP(List<String> list) {
        return list;
    }
}
