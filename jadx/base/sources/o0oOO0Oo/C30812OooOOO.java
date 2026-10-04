package o0oOO0Oo;

import kotlin.coroutines.Continuation;
import o0OOo0o.o000OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOO0Oo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.noteswitch.NoteSwitchViewModel$createScratch$2", m80623f = "NoteSwitchViewModel.kt", m80624l = {161}, m80625m = "invokeSuspend")
public final class C30812OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30821OooOo0O f110129OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110130OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f110131OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f110132OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30812OooOOO(C30821OooOo0O c30821OooOo0O, String str, String str2, Continuation<? super C30812OooOOO> continuation) {
        super(2, continuation);
        this.f110129OooOo = c30821OooOo0O;
        this.f110132OooOoO0 = str;
        this.f110131OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30812OooOOO(this.f110129OooOo, this.f110132OooOoO0, this.f110131OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super String> continuation) {
        return ((C30812OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110130OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        o000OO o000oo2 = this.f110129OooOo.f110163OooO0oO;
        this.f110130OooOo0o = 1;
        Object objOooO0oo = o000oo2.OooO0oo(this.f110132OooOoO0, this.f110131OooOoO, this);
        return objOooO0oo == enumC32485OooO00o ? enumC32485OooO00o : objOooO0oo;
    }
}
