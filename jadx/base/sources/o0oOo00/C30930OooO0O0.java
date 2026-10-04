package o0oOo00;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27519o00o00Oo;
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
import oO0o0OO.o00000OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOo00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.edit.ExportStickerCollectionViewModel$cancelExport$1", m80623f = "ExportStickerCollectionViewModel.kt", m80624l = {41}, m80625m = "invokeSuspend")
public final class C30930OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30933OooO0o0 f110503OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110504OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30930OooO0O0(C30933OooO0o0 c30933OooO0o0, Continuation<? super C30930OooO0O0> continuation) {
        super(2, continuation);
        this.f110503OooOo = c30933OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30930OooO0O0(this.f110503OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30930OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110504OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C30933OooO0o0 c30933OooO0o0 = this.f110503OooOo;
            String str = (String) c30933OooO0o0.f110521OooO0o0.getValue();
            o00000OO o00000oo2 = c30933OooO0o0.f110527OooOOO0;
            if (o00000oo2 != null) {
                o00000oo2.cancel((CancellationException) null);
            }
            if (str.length() > 0) {
                this.f110504OooOo0o = 1;
                C27538o00o0o0O c27538o00o0o0O = c30933OooO0o0.f110519OooO0Oo;
                c27538o00o0o0O.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27519o00o00Oo(c27538o00o0o0O, str, null), this);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
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
