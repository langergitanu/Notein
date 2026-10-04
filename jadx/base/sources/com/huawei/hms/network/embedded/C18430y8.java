package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.y8 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18430y8 {

    /* JADX INFO: renamed from: a */
    public final FileChannel f56720a;

    public C18430y8(FileChannel fileChannel) {
        this.f56720a = fileChannel;
    }

    /* JADX INFO: renamed from: a */
    public void m79993a(long j, C18261lb c18261lb, long j2) throws IOException {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long jTransferTo = this.f56720a.transferTo(j3, j4, c18261lb);
            j3 += jTransferTo;
            j4 -= jTransferTo;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m79994b(long j, C18261lb c18261lb, long j2) throws IOException {
        if (j2 < 0 || j2 > c18261lb.m79076B()) {
            throw new IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long jTransferFrom = this.f56720a.transferFrom(c18261lb, j3, j4);
            j3 += jTransferFrom;
            j4 -= jTransferFrom;
        }
    }
}
