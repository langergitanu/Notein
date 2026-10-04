package o0000o0O;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0000o0O.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$readState$2", m80623f = "DataStoreImpl.kt", m80624l = {218, 226}, m80625m = "invokeSuspend")
public final class C24267OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC24302o0ooOO0<Object>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81653OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f81654OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24267OooOoo(OooOOO oooOOO, Continuation continuation) {
        super(2, continuation);
        this.f81653OooOo = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C24267OooOoo(this.f81653OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC24302o0ooOO0<Object>> continuation) {
        return ((C24267OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6 == r0) goto L22;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81654OooOo0o;
        OooOOO<Object> oooOOO = this.f81653OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (oooOOO.f81558OooO0oo.OooO00o() instanceof C24280OoooO) {
                    return oooOOO.f81558OooO0oo.OooO00o();
                }
                this.f81654OooOo0o = 1;
                if (oooOOO.OooO0oo(this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return (AbstractC24302o0ooOO0) obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            this.f81654OooOo0o = 2;
            obj = OooOOO.OooO0o0(oooOOO, false, this);
        } catch (Throwable th) {
            return new C24297OoooooO(th, -1);
        }
    }
}
