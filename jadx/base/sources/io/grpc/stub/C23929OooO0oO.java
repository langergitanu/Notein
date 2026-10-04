package io.grpc.stub;

import com.google.common.base.Preconditions;
import oO0OOo0o.AbstractC33060OooO0Oo;
import oO0OOo0o.AbstractC33075OooOoO0;
import oO0OOo0o.C33094OoooO;
import oO0OOo0o.C33101OoooOO0;
import oO0OOo0o.InterfaceC33062OooO0oO;
import oO0OOo0o.OooO0o;

/* JADX INFO: renamed from: io.grpc.stub.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23929OooO0oO implements InterfaceC33062OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33094OoooO f80338OooO00o;

    /* JADX INFO: renamed from: io.grpc.stub.OooO0oO$OooO00o */
    public final class OooO00o<ReqT, RespT> extends AbstractC33075OooOoO0.OooO00o<ReqT, RespT> {
        public OooO00o(oO0OOo0o.OooO0o<ReqT, RespT> oooO0o) {
            super(oooO0o);
        }

        @Override // oO0OOo0o.AbstractC33075OooOoO0, oO0OOo0o.OooO0o
        public final void start(OooO0o.OooO00o<RespT> oooO00o, C33094OoooO c33094OoooO) {
            c33094OoooO.OooO0Oo(C23929OooO0oO.this.f80338OooO00o);
            super.start(oooO00o, c33094OoooO);
        }
    }

    public C23929OooO0oO(C33094OoooO c33094OoooO) {
        this.f80338OooO00o = (C33094OoooO) Preconditions.checkNotNull(c33094OoooO, "extraHeaders");
    }

    @Override // oO0OOo0o.InterfaceC33062OooO0oO
    public final OooO00o OooO00o(C33101OoooOO0 c33101OoooOO0, oO0OOo0o.OooO0OO oooO0OO, AbstractC33060OooO0Oo abstractC33060OooO0Oo) {
        return new OooO00o(abstractC33060OooO0Oo.OooO0oO(c33101OoooOO0, oooO0OO));
    }
}
