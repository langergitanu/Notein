package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.b2 */
/* JADX INFO: loaded from: classes3.dex */
class C2007b2 {

    /* JADX INFO: renamed from: k4 */
    public byte f6988k4;

    /* JADX INFO: renamed from: kk */
    public int f6989kk;

    /* JADX INFO: renamed from: to */
    public int f6990to;

    /* JADX INFO: renamed from: x1 */
    public int f6991x1;

    public C2007b2(byte[] bArr) {
        byte b = bArr[0];
        this.f6988k4 = b;
        if (C7019kk.m27462to(Byte.valueOf(b), 6) != C7019kk.m27462to((Object) (byte) 3, 6)) {
            throw new InvalidOperationException("Version number must be 3. Maybe data is corrupted");
        }
        this.f6991x1 = (C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) << 16) | (C7019kk.m27462to(Byte.valueOf(bArr[2]), 6) << 8) | C7019kk.m27462to(Byte.valueOf(bArr[3]), 6);
        this.f6989kk = (C7019kk.m27462to(Byte.valueOf(bArr[4]), 6) << 16) | (C7019kk.m27462to(Byte.valueOf(bArr[5]), 6) << 8) | C7019kk.m27462to(Byte.valueOf(bArr[6]), 6);
        int iM27462to = (C7019kk.m27462to(Byte.valueOf(bArr[7]), 6) << 16) | (C7019kk.m27462to(Byte.valueOf(bArr[8]), 6) << 8) | C7019kk.m27462to(Byte.valueOf(bArr[9]), 6);
        this.f6990to = iM27462to;
        if (this.f6989kk > iM27462to) {
            throw new InvalidOperationException("Offset of second block is more than offset of third block. Maybe data is corrupted");
        }
        if (iM27462to > bArr.length) {
            throw new InvalidOperationException("Offset of third block is more total file length. Maybe data is corrupted");
        }
    }
}
