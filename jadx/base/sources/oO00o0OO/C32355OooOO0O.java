package oO00o0OO;

import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32355OooOO0O<T> extends AbstractC32346OooO00o<T, Boolean> {

    /* JADX INFO: renamed from: oO00o0OO.OooOO0O$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33495OooOO0O<T>, oO0OOO00.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public oO0OOO00.OooO0O0 f116318OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super Boolean> f116319OooOo0o;

        public OooO00o(InterfaceC33495OooOO0O<? super Boolean> interfaceC33495OooOO0O) {
            this.f116319OooOo0o = interfaceC33495OooOO0O;
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
            if (EnumC35109OooO0O0.OooO0o0(this.f116318OooOo, oooO0O0)) {
                this.f116318OooOo = oooO0O0;
                this.f116319OooOo0o.OooO00o(this);
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            this.f116318OooOo.dispose();
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onComplete() {
            this.f116319OooOo0o.onSuccess(Boolean.TRUE);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onError(Throwable th) {
            this.f116319OooOo0o.onError(th);
        }

        @Override // oO0OooOO.InterfaceC33495OooOO0O
        public final void onSuccess(T t) {
            this.f116319OooOo0o.onSuccess(Boolean.FALSE);
        }
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super Boolean> interfaceC33495OooOO0O) {
        this.f116290OooOo0o.OooO00o(new OooO00o(interfaceC33495OooOO0O));
    }
}
