package oO0OOo0o;

import oO0OOo0o.OooO0o;

/* JADX INFO: renamed from: oO0OOo0o.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33075OooOoO0<ReqT, RespT> extends AbstractC33104OoooOo0<ReqT, RespT> {

    /* JADX INFO: renamed from: oO0OOo0o.OooOoO0$OooO00o */
    public static abstract class OooO00o<ReqT, RespT> extends AbstractC33075OooOoO0<ReqT, RespT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o<ReqT, RespT> f119592OooO00o;

        public OooO00o(OooO0o<ReqT, RespT> oooO0o) {
            this.f119592OooO00o = oooO0o;
        }

        @Override // oO0OOo0o.AbstractC33075OooOoO0, oO0OOo0o.AbstractC33104OoooOo0
        public final OooO0o<ReqT, RespT> delegate() {
            return this.f119592OooO00o;
        }
    }

    @Override // oO0OOo0o.AbstractC33104OoooOo0, oO0OOo0o.OooO0o
    public /* bridge */ /* synthetic */ void cancel(String str, Throwable th) {
        super.cancel(str, th);
    }

    @Override // oO0OOo0o.AbstractC33104OoooOo0
    public abstract OooO0o<ReqT, RespT> delegate();

    @Override // oO0OOo0o.AbstractC33104OoooOo0, oO0OOo0o.OooO0o
    public /* bridge */ /* synthetic */ C33058OooO00o getAttributes() {
        return super.getAttributes();
    }

    @Override // oO0OOo0o.AbstractC33104OoooOo0, oO0OOo0o.OooO0o
    public /* bridge */ /* synthetic */ void halfClose() {
        super.halfClose();
    }

    @Override // oO0OOo0o.AbstractC33104OoooOo0, oO0OOo0o.OooO0o
    public /* bridge */ /* synthetic */ boolean isReady() {
        return super.isReady();
    }

    @Override // oO0OOo0o.AbstractC33104OoooOo0, oO0OOo0o.OooO0o
    public /* bridge */ /* synthetic */ void request(int i) {
        super.request(i);
    }

    @Override // oO0OOo0o.OooO0o
    public void sendMessage(ReqT reqt) {
        delegate().sendMessage(reqt);
    }

    @Override // oO0OOo0o.AbstractC33104OoooOo0, oO0OOo0o.OooO0o
    public /* bridge */ /* synthetic */ void setMessageCompression(boolean z) {
        super.setMessageCompression(z);
    }

    @Override // oO0OOo0o.OooO0o
    public void start(OooO0o.OooO00o<RespT> oooO00o, C33094OoooO c33094OoooO) {
        delegate().start(oooO00o, c33094OoooO);
    }

    @Override // oO0OOo0o.AbstractC33104OoooOo0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
