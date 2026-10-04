package com.huawei.hms.network.embedded;

import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.na */
/* JADX INFO: loaded from: classes9.dex */
public final class C18288na extends IOException {

    /* JADX INFO: renamed from: a */
    public final EnumC18120ba f55797a;

    public C18288na(EnumC18120ba enumC18120ba) {
        super("stream was reset: " + enumC18120ba);
        this.f55797a = enumC18120ba;
    }
}
