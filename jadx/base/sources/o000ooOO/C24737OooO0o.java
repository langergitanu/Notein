package o000ooOO;

import kotlin.coroutines.Continuation;
import o000oo0.AbstractC24673OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o000ooOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", m80623f = "DBUtil.android.kt", m80624l = {113}, m80625m = "invokeSuspend")
public final class C24737OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<Object>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24673OooOo0O f83895OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f83896OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f83897OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f83898OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o f83899OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24737OooO0o(Continuation continuation, AbstractC24673OooOo0O abstractC24673OooOo0O, InterfaceC32507OooOO0o interfaceC32507OooOO0o, boolean z, boolean z2) {
        super(2, continuation);
        this.f83895OooOo = abstractC24673OooOo0O;
        this.f83898OooOoO0 = z;
        this.f83897OooOoO = z2;
        this.f83899OooOoOO = interfaceC32507OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C24737OooO0o(continuation, this.f83895OooOo, this.f83899OooOoOO, this.f83898OooOoO0, this.f83897OooOoO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<Object> continuation) {
        return ((C24737OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f83896OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        boolean z = this.f83897OooOoO;
        boolean z2 = this.f83898OooOoO0;
        AbstractC24673OooOo0O abstractC24673OooOo0O = this.f83895OooOo;
        C24740OooO0oo c24740OooO0oo = new C24740OooO0oo(null, abstractC24673OooOo0O, this.f83899OooOoOO, z, z2);
        this.f83896OooOo0o = 1;
        Object objOooOo00 = abstractC24673OooOo0O.OooOo00(z2, c24740OooO0oo, this);
        return objOooOo00 == enumC32485OooO00o ? enumC32485OooO00o : objOooOo00;
    }
}
