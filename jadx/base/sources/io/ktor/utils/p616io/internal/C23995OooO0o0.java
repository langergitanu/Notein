package io.ktor.utils.p616io.internal;

import io.ktor.utils.p616io.internal.AbstractC23996OooO0oO;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;
import oO00Oo0o.AbstractC32276OooO0OO;
import oO00Oo0o.AbstractC32278OooO0o0;
import oO00Oo0o.C32277OooO0Oo;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23995OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int f80807OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C32277OooO0Oo f80808OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f80809OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f80810OooO0Oo;

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0o0$OooO00o */
    public static final class OooO00o extends AbstractC32278OooO0o0<AbstractC23996OooO0oO.OooO0OO> {
        @Override // oO00Oo0o.OooO0o
        public final Object o0000OoO() {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(C23995OooO0o0.f80807OooO00o);
            OooOOO0.OooO0o(byteBufferAllocateDirect, "allocateDirect(BUFFER_SIZE)");
            return new AbstractC23996OooO0oO.OooO0OO(byteBufferAllocateDirect, 8);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.OooO0o0$OooO0O0 */
    public static final class OooO0O0 extends AbstractC32276OooO0OO<AbstractC23996OooO0oO.OooO0OO> {
        @Override // oO00Oo0o.AbstractC32276OooO0OO
        public final void OooOOO0(AbstractC23996OooO0oO.OooO0OO oooO0OO) {
            AbstractC23996OooO0oO.OooO0OO instance = oooO0OO;
            OooOOO0.OooO0oO(instance, "instance");
            C23995OooO0o0.f80808OooO0O0.o00o0O(instance.f80811OooO00o);
        }

        @Override // oO00Oo0o.AbstractC32276OooO0OO
        public final AbstractC23996OooO0oO.OooO0OO OooOOo0() {
            return new AbstractC23996OooO0oO.OooO0OO(C23995OooO0o0.f80808OooO0O0.o0000OoO(), 8);
        }
    }

    static {
        int iOooO00o = OooOOO0.OooO00o(4096, "BufferSize");
        f80807OooO00o = iOooO00o;
        int iOooO00o2 = OooOOO0.OooO00o(2048, "BufferPoolSize");
        int iOooO00o3 = OooOOO0.OooO00o(1024, "BufferObjectPoolSize");
        f80808OooO0O0 = new C32277OooO0Oo(iOooO00o2, iOooO00o);
        f80809OooO0OO = new OooO0O0(iOooO00o3);
        f80810OooO0Oo = new OooO00o();
    }
}
