package o0Ooo0oo;

import kotlin.coroutines.Continuation;
import o0OOo0o.C27365OoooOoO;
import o0OOo0o.C27366OoooOoo;
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

/* JADX INFO: renamed from: o0Ooo0oo.o000Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$updateColorSetName$1", m80623f = "PenBarViewModel.kt", m80624l = {810}, m80625m = "invokeSuspend")
public final class C29549o000Oo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104821OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f104822OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f104823OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f104824OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29549o000Oo0(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, String str, String str2, Continuation<? super C29549o000Oo0> continuation) {
        super(2, continuation);
        this.f104821OooOo = oooO0O0;
        this.f104824OooOoO0 = str;
        this.f104823OooOoO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29549o000Oo0(this.f104821OooOo, this.f104824OooOoO0, this.f104823OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29549o000Oo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104822OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f104821OooOo;
            this.f104822OooOo0o = 1;
            C27366OoooOoo c27366OoooOoo = oooO0O0.f75140OooO;
            c27366OoooOoo.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27365OoooOoO(c27366OoooOoo, this.f104824OooOoO0, this.f104823OooOoO, null), this) == enumC32485OooO00o) {
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
