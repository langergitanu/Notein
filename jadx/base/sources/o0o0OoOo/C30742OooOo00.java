package o0o0OoOo;

import kotlin.coroutines.Continuation;
import o0OOoOOO.C27780OooO0o0;
import o0OOoOOO.C27782OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OoOo.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$recoverDetachedFolders$2", m80623f = "DebugViewModel.kt", m80624l = {502}, m80625m = "invokeSuspend")
public final class C30742OooOo00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109946OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109947OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30742OooOo00(C30722OooO00o c30722OooO00o, Continuation<? super C30742OooOo00> continuation) {
        super(2, continuation);
        this.f109946OooOo = c30722OooO00o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30742OooOo00(this.f109946OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((C30742OooOo00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109947OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30722OooO00o c30722OooO00o = this.f109946OooOo;
            this.f109947OooOo0o = 1;
            C27782OooO0oo c27782OooO0oo = c30722OooO00o.f109873OooOOoo;
            c27782OooO0oo.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27780OooO0o0(c27782OooO0oo, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("DebugViewModel");
        c20358OooO00o.OooO0o0("recoverDetachedFolders: recovered " + iIntValue + " folders", new Object[0]);
        return new Integer(iIntValue);
    }
}
