package o0OoOOO0;

import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31089Ooooooo;
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
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0OoOOO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addtext.TextBoxViewModel$clearInvalidTextStyle$1", m80623f = "TextBoxViewModel.kt", m80624l = {664, 539}, m80625m = "invokeSuspend")
public final class C29040OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C29051OooOO0o f102872OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f102873OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C29051OooOO0o f102874OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f102875OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29040OooO(C29051OooOO0o c29051OooOO0o, Continuation<? super C29040OooO> continuation) {
        super(2, continuation);
        this.f102874OooOoO = c29051OooOO0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29040OooO(this.f102874OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29040OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        C29051OooOO0o c29051OooOO0o;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102875OooOoO0;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                c29051OooOO0o = this.f102874OooOoO;
                interfaceC33895OooO00o = c29051OooOO0o.f102899OooO0oo;
                this.f102873OooOo0o = interfaceC33895OooO00o;
                this.f102872OooOo = c29051OooOO0o;
                this.f102875OooOoO0 = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != obj2) {
                }
                return obj2;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = this.f102873OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            c29051OooOO0o = this.f102872OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f102873OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            this.f102873OooOo0o = interfaceC33895OooO00o;
            this.f102872OooOo = null;
            this.f102875OooOoO0 = 2;
            List<C31089Ooooooo> list = C29051OooOO0o.f102893OoooO0O;
            c29051OooOO0o.getClass();
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C29049OooOO0(c29051OooOO0o, null), this);
            if (objOooO0o != obj2) {
                objOooO0o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO0o != obj2) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return obj2;
        } catch (Throwable th3) {
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            th = th3;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
