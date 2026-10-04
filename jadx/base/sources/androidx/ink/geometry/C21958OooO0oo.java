package androidx.ink.geometry;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.WeakHashMap;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: androidx.ink.geometry.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21958OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final WeakHashMap<ByteBuffer, OooOO0O> f65406OooO00o = new WeakHashMap<>();

    public static final ShortBuffer OooO00o(OooOO0O oooOO0O) {
        ByteBuffer byteBufferCreateUnsafelyMutableMeshOwnedRawTriangleIndexBuffer = JvmMeshNative.f65386OooO00o.createUnsafelyMutableMeshOwnedRawTriangleIndexBuffer(oooOO0O.OooO00o());
        if (byteBufferCreateUnsafelyMutableMeshOwnedRawTriangleIndexBuffer == null) {
            byteBufferCreateUnsafelyMutableMeshOwnedRawTriangleIndexBuffer = ByteBuffer.allocateDirect(0);
        }
        if (!byteBufferCreateUnsafelyMutableMeshOwnedRawTriangleIndexBuffer.isDirect()) {
            throw new IllegalStateException("createUnsafelyMutableMeshOwnedRawTriangleIndexBuffer returned a non-direct buffer.");
        }
        WeakHashMap<ByteBuffer, OooOO0O> weakHashMap = f65406OooO00o;
        synchronized (weakHashMap) {
            weakHashMap.put(byteBufferCreateUnsafelyMutableMeshOwnedRawTriangleIndexBuffer, oooOO0O);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        ShortBuffer shortBufferAsReadOnlyBuffer = byteBufferCreateUnsafelyMutableMeshOwnedRawTriangleIndexBuffer.order(ByteOrder.nativeOrder()).asShortBuffer().asReadOnlyBuffer();
        kotlin.jvm.internal.OooOOO0.OooO0o(shortBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return shortBufferAsReadOnlyBuffer;
    }

    public static final ByteBuffer OooO0O0(OooOO0O oooOO0O) {
        ByteBuffer byteBufferCreateUnsafelyMutableMeshOwnedRawVertexBuffer = JvmMeshNative.f65386OooO00o.createUnsafelyMutableMeshOwnedRawVertexBuffer(oooOO0O.OooO00o());
        if (byteBufferCreateUnsafelyMutableMeshOwnedRawVertexBuffer == null) {
            byteBufferCreateUnsafelyMutableMeshOwnedRawVertexBuffer = ByteBuffer.allocateDirect(0);
        }
        if (!byteBufferCreateUnsafelyMutableMeshOwnedRawVertexBuffer.isDirect()) {
            throw new IllegalStateException("createUnsafelyMutableMeshOwnedRawVertexBuffer returned a non-direct buffer.");
        }
        WeakHashMap<ByteBuffer, OooOO0O> weakHashMap = f65406OooO00o;
        synchronized (weakHashMap) {
            weakHashMap.put(byteBufferCreateUnsafelyMutableMeshOwnedRawVertexBuffer, oooOO0O);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferCreateUnsafelyMutableMeshOwnedRawVertexBuffer.asReadOnlyBuffer();
        kotlin.jvm.internal.OooOOO0.OooO0o(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }
}
