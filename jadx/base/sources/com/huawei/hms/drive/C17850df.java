package com.huawei.hms.drive;

import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.drive.df */
/* JADX INFO: loaded from: classes6.dex */
public final class C17850df extends IOException {

    /* JADX INFO: renamed from: a */
    public final EnumC17837ct f53357a;

    public C17850df(EnumC17837ct enumC17837ct) {
        super("stream was reset: " + enumC17837ct);
        this.f53357a = enumC17837ct;
    }
}
