package o0OoO0oo;

import android.net.Uri;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import o0OO00o0.C26592o00O0Oo0;
import o0OO00o0.C26596o00O0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33718OooO0O0;
import oO0o0Oo.C33770OooooO0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO0oo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.ImageViewModel$special$$inlined$flatMapLatest$1", m80623f = "ImageViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C28696OooOOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super Map<String, ? extends Uri>>, Boolean, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f101682OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101683OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C28698OooOOOO f101684OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f101685OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28696OooOOO(Continuation continuation, C28698OooOOOO c28698OooOOOO) {
        super(3, continuation);
        this.f101684OooOoO = c28698OooOOOO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super Map<String, ? extends Uri>> interfaceC33723OooO0oO, Boolean bool, Continuation<? super C32460OooOooO> continuation) {
        C28696OooOOO c28696OooOOO = new C28696OooOOO(continuation, this.f101684OooOoO);
        c28696OooOOO.f101682OooOo = interfaceC33723OooO0oO;
        c28696OooOOO.f101685OooOoO0 = bool;
        return c28696OooOOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        InterfaceC33721OooO0o c33770OooooO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101683OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f101682OooOo;
            if (((Boolean) this.f101685OooOoO0).booleanValue()) {
                C26596o00O0o0 c26596o00O0o0 = this.f101684OooOoO.f101691OooO0Oo;
                c26596o00O0o0.getClass();
                C33718OooO0O0 c33718OooO0O0OooO0o0 = C25252OooO0Oo.OooO0o0(new C26592o00O0Oo0(c26596o00O0o0, null));
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                c33770OooooO0 = C25252OooO0Oo.OooOo0O(c33718OooO0O0OooO0o0, ExecutorC33873OooO0O0.f122045OooOoO0);
            } else {
                c33770OooooO0 = new C33770OooooO0(new C28695OooOO0o(2, null));
            }
            this.f101683OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, c33770OooooO0, this) == enumC32485OooO00o) {
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
