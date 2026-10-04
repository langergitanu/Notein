package o0OoO0oo;

import com.orion.notein.domain.models.foundation.RatioPointF;
import kotlin.coroutines.Continuation;
import o0000oOO.C24332OooO;
import o0OO00o0.C26563o000o00o;
import o0OO00o0.C26577o000oo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO0oo.o00oOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.ZoomHandleViewModel$putBias$1", m80623f = "ZoomHandleViewModel.kt", m80624l = {28}, m80625m = "invokeSuspend")
public final class C28966o00oOooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C28968o00oo00O f102626OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102627OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ float f102628OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f102629OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28966o00oOooo(C28968o00oo00O c28968o00oo00O, float f, float f2, Continuation<? super C28966o00oOooo> continuation) {
        super(2, continuation);
        this.f102626OooOo = c28968o00oo00O;
        this.f102629OooOoO0 = f;
        this.f102628OooOoO = f2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28966o00oOooo(this.f102626OooOo, this.f102629OooOoO0, this.f102628OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28966o00oOooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102627OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28968o00oo00O c28968o00oo00O = this.f102626OooOo;
            RatioPointF ratioPointF = new RatioPointF(this.f102629OooOoO0, this.f102628OooOoO);
            this.f102627OooOo0o = 1;
            C26577o000oo0O c26577o000oo0O = c28968o00oo00O.f102633OooO0Oo;
            c26577o000oo0O.getClass();
            Object objOooO00o = C24332OooO.OooO00o(c26577o000oo0O.f91598OooO00o, new C26563o000o00o(c28968o00oo00O.f102635OooO0o0, c26577o000oo0O, ratioPointF, null), this);
            if (objOooO00o != obj2) {
                objOooO00o = C32460OooOooO.f116667OooO00o;
            }
            if (objOooO00o == obj2) {
                return obj2;
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
