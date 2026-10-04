package o0oOOooO;

import kotlin.coroutines.Continuation;
import o0OOo0o.C27520o00o00o;
import o0OOo0o.C27538o00o0o0O;
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

/* JADX INFO: renamed from: o0oOOooO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$createBuiltInStickerCollection$1", m80623f = "StickerViewModel.kt", m80624l = {32}, m80625m = "invokeSuspend")
public final class C30889OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30898OooOo00 f110389OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110390OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30889OooOO0O(Continuation continuation, C30898OooOo00 c30898OooOo00) {
        super(2, continuation);
        this.f110389OooOo = c30898OooOo00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30889OooOO0O(continuation, this.f110389OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30889OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110390OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30898OooOo00 c30898OooOo00 = this.f110389OooOo;
            this.f110390OooOo0o = 1;
            C27538o00o0o0O c27538o00o0o0O = c30898OooOo00.f110434OooO0o;
            c27538o00o0o0O.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27520o00o00o(c27538o00o0o0O, null), this) == enumC32485OooO00o) {
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
