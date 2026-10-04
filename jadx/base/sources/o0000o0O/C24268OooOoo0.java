package o0000o0O;

import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24033OooOooo;
import kotlin.jvm.internal.C24034Oooo00O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0000o0O.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", m80623f = "DataStoreImpl.kt", m80624l = {387, 388, 390}, m80625m = "invokeSuspend")
public final class C24268OooOoo0 extends AbstractC32476OooO implements InterfaceC32507OooOO0o<Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81655OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Serializable f81656OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOOO<Object> f81657OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24034Oooo00O<Object> f81658OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C24033OooOooo f81659OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24268OooOoo0(C24034Oooo00O<Object> c24034Oooo00O, OooOOO<Object> oooOOO, C24033OooOooo c24033OooOooo, Continuation<? super C24268OooOoo0> continuation) {
        super(1, continuation);
        this.f81658OooOoO0 = c24034Oooo00O;
        this.f81657OooOoO = oooOOO;
        this.f81659OooOoOO = c24033OooOooo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Continuation<?> continuation) {
        return new C24268OooOoo0(this.f81658OooOoO0, this.f81657OooOoO, this.f81659OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Continuation<? super C32460OooOooO> continuation) {
        return ((C24268OooOoo0) create(continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r9 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C24034Oooo00O<Object> c24034Oooo00O;
        T t;
        C24033OooOooo c24033OooOooo;
        Object obj3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f81655OooOo;
        C24033OooOooo c24033OooOooo2 = this.f81659OooOoOO;
        C24034Oooo00O<Object> c24034Oooo00O2 = this.f81658OooOoO0;
        OooOOO<Object> oooOOO = this.f81657OooOoO;
        try {
        } catch (C24249OooO0OO unused) {
            Object obj4 = c24034Oooo00O2.f80942OooOo0o;
            this.f81656OooOo0o = c24033OooOooo2;
            this.f81655OooOo = 3;
            Object objOooOO0 = oooOOO.OooOO0(obj4, true, this);
            obj2 = objOooOO0;
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f81656OooOo0o = c24034Oooo00O2;
            this.f81655OooOo = 1;
            Object objOooO = oooOOO.OooO(this);
            if (objOooO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            c24034Oooo00O = c24034Oooo00O2;
            t = objOooO;
        } else {
            if (i != 1) {
                if (i == 2) {
                    c24033OooOooo = (C24033OooOooo) this.f81656OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    obj3 = obj;
                    c24033OooOooo.f80940OooOo0o = ((Number) obj3).intValue();
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c24033OooOooo2 = (C24033OooOooo) this.f81656OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                obj2 = obj;
                c24033OooOooo2.f80940OooOo0o = ((Number) obj2).intValue();
                return C32460OooOooO.f116667OooO00o;
            }
            c24034Oooo00O = (C24034Oooo00O) this.f81656OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            t = obj;
        }
        c24034Oooo00O.f80942OooOo0o = t;
        o000oOoO o000ooooOooO0oO = oooOOO.OooO0oO();
        this.f81656OooOo0o = c24033OooOooo2;
        this.f81655OooOo = 2;
        Object objOooO0OO = o000ooooOooO0oO.OooO0OO(this);
        if (objOooO0OO == enumC32485OooO00o) {
            return enumC32485OooO00o;
        }
        c24033OooOooo = c24033OooOooo2;
        obj3 = objOooO0OO;
        c24033OooOooo.f80940OooOo0o = ((Number) obj3).intValue();
        return C32460OooOooO.f116667OooO00o;
    }
}
