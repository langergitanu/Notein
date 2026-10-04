package io.grpc.stub;

import com.google.common.base.Preconditions;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.C33119o00o0O;
import oO0OOo0o.InterfaceC33113Oooooo0;
import oO0OOo0o.o00Oo0;

/* JADX INFO: renamed from: io.grpc.stub.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23930OooO0oo {

    /* JADX INFO: renamed from: io.grpc.stub.OooO0oo$OooO00o */
    public static class OooO00o<V> implements OooO<V> {
        @Override // io.grpc.stub.OooO
        public final void OooOooO(C33119o00o0O c33119o00o0O) {
        }

        @Override // io.grpc.stub.OooO
        public final void Oooo00O() {
        }

        @Override // io.grpc.stub.OooO
        public final void onNext(V v) {
        }
    }

    /* JADX INFO: renamed from: io.grpc.stub.OooO0oo$OooO0O0 */
    public static final class OooO0O0<ReqT, RespT> implements InterfaceC33113Oooooo0<ReqT, RespT> {
    }

    /* JADX INFO: renamed from: io.grpc.stub.OooO0oo$OooO0OO */
    public static final class OooO0OO<ReqT, RespT> implements InterfaceC33113Oooooo0<ReqT, RespT> {
    }

    public static void OooO00o(C33101OoooOO0<?, ?> c33101OoooOO0, OooO<?> oooO) {
        Preconditions.checkNotNull(c33101OoooOO0, "methodDescriptor");
        Preconditions.checkNotNull(oooO, "responseObserver");
        oooO.OooOooO(o00Oo0.f119724OooOOO0.OooO0oo("Method " + c33101OoooOO0.f119667OooO0O0 + " is unimplemented").OooO00o());
    }
}
