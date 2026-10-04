package o0oOOooO;

import android.net.Uri;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27513o00o00;
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
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOOooO.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.stickers.StickerViewModel$addStickersToStickerCollection$2", m80623f = "StickerViewModel.kt", m80624l = {234}, m80625m = "invokeSuspend")
public final class C30888OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30898OooOo00 f110386OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110387OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<Uri> f110388OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30888OooOO0(C30898OooOo00 c30898OooOo00, List<? extends Uri> list, Continuation<? super C30888OooOO0> continuation) {
        super(2, continuation);
        this.f110386OooOo = c30898OooOo00;
        this.f110388OooOoO0 = list;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30888OooOO0(this.f110386OooOo, this.f110388OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30888OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110387OooOo0o;
        C30898OooOo00 c30898OooOo00 = this.f110386OooOo;
        C33781o00o0O c33781o00o0O = c30898OooOo00.f110432OooO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Boolean bool = Boolean.TRUE;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            String str = (String) c30898OooOo00.f110436OooO0oO.getValue();
            this.f110387OooOo0o = 1;
            C27538o00o0o0O c27538o00o0o0O = c30898OooOo00.f110434OooO0o;
            c27538o00o0o0O.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27513o00o00(c27538o00o0o0O, str, this.f110388OooOoO0, null), this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        ((Boolean) obj).getClass();
        Boolean bool2 = Boolean.FALSE;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, bool2);
        return obj;
    }
}
