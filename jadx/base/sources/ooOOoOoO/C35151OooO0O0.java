package ooOOoOoO;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: ooOOoOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35151OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ByteBuffer f126216OooO00o;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        OooOOO0.OooO0o(byteBufferAllocate, "allocate(0)");
        f126216OooO00o = byteBufferAllocate;
    }

    public static final void OooO00o(long j, byte[] bArr, int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i2 + i] = (byte) (j >>> ((7 - i2) * 8));
        }
    }

    public static final void OooO0O0(byte[] bArr, short s) {
        for (int i = 0; i < 2; i++) {
            bArr[i + 11] = (byte) (s >>> ((1 - i) * 8));
        }
    }
}
