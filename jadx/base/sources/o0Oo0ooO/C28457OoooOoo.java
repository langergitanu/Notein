package o0Oo0ooO;

import com.orion.notein.p607ui.label.C23139OooOO0o;
import kotlin.coroutines.Continuation;
import o0OOoOo0.C27798OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0Oo0ooO.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.label.LabelViewModel$createLabel$1", m80623f = "LabelViewModel.kt", m80624l = {162}, m80625m = "invokeSuspend")
public final class C28457OoooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23139OooOO0o f100840OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100841OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f100842OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f100843OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28457OoooOoo(C23139OooOO0o c23139OooOO0o, String str, int i, Continuation<? super C28457OoooOoo> continuation) {
        super(2, continuation);
        this.f100840OooOo = c23139OooOO0o;
        this.f100843OooOoO0 = str;
        this.f100842OooOoO = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28457OoooOoo(this.f100840OooOo, this.f100843OooOoO0, this.f100842OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28457OoooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100841OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27798OooO0o0 c27798OooO0o0 = this.f100840OooOo.f72072OooO0o0;
            this.f100841OooOo0o = 1;
            if (c27798OooO0o0.OooO0OO(this.f100842OooOoO, this.f100843OooOoO0, this) == enumC32485OooO00o) {
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
