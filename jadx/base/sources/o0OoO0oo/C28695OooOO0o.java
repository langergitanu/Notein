package o0OoO0oo;

import android.net.Uri;
import java.util.Map;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: o0OoO0oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.ImageViewModel$_latestImages$1$1", m80623f = "ImageViewModel.kt", m80624l = {62}, m80625m = "invokeSuspend")
public final class C28695OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super Map<String, ? extends Uri>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f101680OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101681OooOo0o;

    public C28695OooOO0o() {
        throw null;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28695OooOO0o c28695OooOO0o = new C28695OooOO0o(2, continuation);
        c28695OooOO0o.f101680OooOo = obj;
        return c28695OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super Map<String, ? extends Uri>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C28695OooOO0o) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101681OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f101680OooOo;
            C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
            this.f101681OooOo0o = 1;
            if (interfaceC33723OooO0oO.emit(c34436OooOoOO, this) == enumC32485OooO00o) {
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
