package oO00OOoo;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO00OOoo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32250OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ByteBuffer f115830OooO00o;

    static {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        OooOOO0.OooO0o(byteBufferOrder, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f115830OooO00o = byteBufferOrder;
    }

    public static final void OooO00o(ByteBuffer byteBuffer, ByteBuffer destination, int i, int i2, int i3) {
        OooOOO0.OooO0oO(destination, "destination");
        if (byteBuffer.hasArray() && destination.hasArray() && !byteBuffer.isReadOnly() && !destination.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i, destination.array(), destination.arrayOffset() + i3, i2);
            return;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i);
        byteBufferDuplicate.limit(i + i2);
        ByteBuffer byteBufferDuplicate2 = destination.duplicate();
        byteBufferDuplicate2.position(i3);
        byteBufferDuplicate2.put(byteBufferDuplicate);
    }
}
