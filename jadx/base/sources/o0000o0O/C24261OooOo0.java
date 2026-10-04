package o0000o0O;

import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33621OooOo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0000o0O.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", m80623f = "DataStoreImpl.kt", m80624l = {134, 135}, m80625m = "invokeSuspend")
public final class C24261OooOo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81615OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f81616OooOo0o;

    /* JADX INFO: renamed from: o0000o0O.OooOo0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooOOO<T> f81617OooOo0o;

        public OooO00o(OooOOO<T> oooOOO) {
            this.f81617OooOo0o = oooOOO;
        }

        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        public final Object emit(Object obj, Continuation continuation) {
            Object objOooO0o0;
            OooOOO<T> oooOOO = this.f81617OooOo0o;
            return ((oooOOO.f81558OooO0oo.OooO00o() instanceof C24280OoooO) || (objOooO0o0 = OooOOO.OooO0o0(oooOOO, true, continuation)) != EnumC32485OooO00o.f116726OooOo0o) ? C32460OooOooO.f116667OooO00o : objOooO0o0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24261OooOo0(OooOOO<Object> oooOOO, Continuation<? super C24261OooOo0> continuation) {
        super(2, continuation);
        this.f81615OooOo = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C24261OooOo0(this.f81615OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C24261OooOo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r6.collect(r1, r5) == r0) goto L18;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81616OooOo0o;
        OooOOO<Object> oooOOO = this.f81615OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f81616OooOo0o = 1;
            Object objOooOo00 = ((C33621OooOo0) oooOOO.f81550OooO.f81815OooO0OO).OooOo00(this);
            if (objOooOo00 != enumC32485OooO00o) {
                objOooOo00 = C32460OooOooO.f116667OooO00o;
            }
            if (objOooOo00 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC33721OooO0o interfaceC33721OooO0oOooO0Oo = C25252OooO0Oo.OooO0Oo(oooOOO.OooO0oO().OooO0O0(), -1);
        OooO00o oooO00o = new OooO00o(oooOOO);
        this.f81616OooOo0o = 2;
    }
}
