package oO00Oo0o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO00Oo0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32275OooO0O0 extends AbstractC32276OooO0OO<ByteBuffer> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f115993OooOoo0;

    public C32275OooO0O0(int i, int i2) {
        super(i);
        this.f115993OooOoo0 = i2;
    }

    @Override // oO00Oo0o.AbstractC32276OooO0OO
    public final ByteBuffer OooO0OO(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        byteBuffer2.clear();
        byteBuffer2.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer2;
    }

    @Override // oO00Oo0o.AbstractC32276OooO0OO
    public final ByteBuffer OooOOo0() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f115993OooOoo0);
        OooOOO0.OooO0Oo(byteBufferAllocate);
        return byteBufferAllocate;
    }

    @Override // oO00Oo0o.AbstractC32276OooO0OO
    public final void OooOooo(ByteBuffer byteBuffer) {
        ByteBuffer instance = byteBuffer;
        OooOOO0.OooO0oO(instance, "instance");
        if (instance.capacity() != this.f115993OooOoo0) {
            throw new IllegalStateException("Check failed.");
        }
        if (instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
