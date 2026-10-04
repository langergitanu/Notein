package o00o0o0o;

import androidx.core.util.Pools;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o00o0o0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25444OooO0O0 implements Pools.Pool<ByteBuffer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f86726OooO00o = new OooO00o();

    /* JADX INFO: renamed from: o00o0o0o.OooO0O0$OooO00o */
    public class OooO00o extends ThreadLocal<ByteBuffer> {
        @Override // java.lang.ThreadLocal
        public final ByteBuffer initialValue() {
            OooO00o oooO00o = C25444OooO0O0.f86726OooO00o;
            return ByteBuffer.allocate(16384);
        }
    }

    @Override // androidx.core.util.Pools.Pool
    public final ByteBuffer acquire() {
        return f86726OooO00o.get();
    }

    @Override // androidx.core.util.Pools.Pool
    public final /* bridge */ /* synthetic */ boolean release(ByteBuffer byteBuffer) {
        return true;
    }
}
