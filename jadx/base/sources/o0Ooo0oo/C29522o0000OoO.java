package o0Ooo0oo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Ooo0oo.o0000OoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$setTapeTransparent$1", m80623f = "PenBarViewModel.kt", m80624l = {1422}, m80625m = "invokeSuspend")
public final class C29522o0000OoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104711OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104712OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f104713OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29522o0000OoO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, boolean z, Continuation<? super C29522o0000OoO> continuation) {
        super(2, continuation);
        this.f104711OooOo = oooO0O0;
        this.f104713OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29522o0000OoO(this.f104711OooOo, this.f104713OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29522o0000OoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104712OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33781o00o0O c33781o00o0O = this.f104711OooOo.f75170Oooo000;
            Boolean boolValueOf = Boolean.valueOf(this.f104713OooOoO0);
            this.f104712OooOo0o = 1;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, boolValueOf);
            if (C32460OooOooO.f116667OooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
