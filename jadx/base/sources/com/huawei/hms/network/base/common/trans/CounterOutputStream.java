package com.huawei.hms.network.base.common.trans;

import com.huawei.hms.framework.common.StringUtils;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public class CounterOutputStream extends OutputStream {

    /* JADX INFO: renamed from: a */
    private final AtomicLong f54065a = new AtomicLong(0);

    public long getLenth() {
        return this.f54065a.get();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f54065a.addAndGet(StringUtils.getBytes(String.valueOf(i)).length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f54065a.addAndGet(bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f54065a.addAndGet(i2);
    }
}
