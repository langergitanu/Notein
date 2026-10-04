package oO0OOo0o;

import com.google.common.base.Preconditions;
import oO0OOo0o.OooO0o;

/* JADX INFO: renamed from: oO0OOo0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33063OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f119548OooO00o = 0;

    /* JADX INFO: renamed from: oO0OOo0o.OooO0oo$OooO00o */
    public class OooO00o extends OooO0o<Object, Object> {
        @Override // oO0OOo0o.OooO0o
        public final void cancel(String str, Throwable th) {
        }

        @Override // oO0OOo0o.OooO0o
        public final void halfClose() {
        }

        @Override // oO0OOo0o.OooO0o
        public final boolean isReady() {
            return false;
        }

        @Override // oO0OOo0o.OooO0o
        public final void request(int i) {
        }

        @Override // oO0OOo0o.OooO0o
        public final void sendMessage(Object obj) {
        }

        @Override // oO0OOo0o.OooO0o
        public final void start(OooO0o.OooO00o<Object> oooO00o, C33094OoooO c33094OoooO) {
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OooO0oo$OooO0O0 */
    public static class OooO0O0 extends AbstractC33060OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AbstractC33060OooO0Oo f119549OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC33062OooO0oO f119550OooO0O0;

        public OooO0O0(AbstractC33060OooO0Oo abstractC33060OooO0Oo, InterfaceC33062OooO0oO interfaceC33062OooO0oO) {
            this.f119549OooO00o = abstractC33060OooO0Oo;
            this.f119550OooO0O0 = (InterfaceC33062OooO0oO) Preconditions.checkNotNull(interfaceC33062OooO0oO, "interceptor");
        }

        @Override // oO0OOo0o.AbstractC33060OooO0Oo
        public final String OooO00o() {
            return this.f119549OooO00o.OooO00o();
        }

        @Override // oO0OOo0o.AbstractC33060OooO0Oo
        public final <ReqT, RespT> OooO0o<ReqT, RespT> OooO0oO(C33101OoooOO0<ReqT, RespT> c33101OoooOO0, OooO0OO oooO0OO) {
            return this.f119550OooO0O0.OooO00o(c33101OoooOO0, oooO0OO, this.f119549OooO00o);
        }
    }

    static {
        new OooO00o();
    }
}
