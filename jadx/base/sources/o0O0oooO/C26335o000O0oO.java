package o0O0oooO;

import kotlin.coroutines.Continuation;
import oO00ooO.C32444OooOOO0;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0O0oooO.o000O0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26335o000O0oO implements InterfaceC33721OooO0o<Void> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33769Ooooo0o f90350OooOo0o;

    /* JADX INFO: renamed from: o0O0oooO.o000O0oO$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f90351OooOo0o;

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
            this.f90351OooOo0o = interfaceC33723OooO0oO;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            throw new C32444OooOOO0("An operation is not implemented: Not yet implemented");
        }
    }

    public C26335o000O0oO(C33769Ooooo0o c33769Ooooo0o) {
        this.f90350OooOo0o = c33769Ooooo0o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super Void> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f90350OooOo0o.f121747OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
