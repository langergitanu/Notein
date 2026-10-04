package Oooo0OO;

import OooOoOO.C20518OooO0OO;
import OooOoOO.C20529OooOOOO;
import OooOoOO.C20573OoooooO;
import com.aspose.words.StyleIdentifier;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: Oooo0OO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", m80623f = "Ripple.kt", m80624l = {StyleIdentifier.GRID_TABLE_4_ACCENT_2}, m80625m = "invokeSuspend")
public final class C20964OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C20965OooOo0 f60507OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f60508OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C20573OoooooO f60509OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ float f60510OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20964OooOOoo(C20965OooOo0 c20965OooOo0, float f, C20573OoooooO c20573OoooooO, Continuation continuation) {
        super(2, continuation);
        this.f60507OooOo = c20965OooOo0;
        this.f60510OooOoO0 = f;
        this.f60509OooOoO = c20573OoooooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C20964OooOOoo(this.f60507OooOo, this.f60510OooOoO0, this.f60509OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C20964OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f60508OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C20518OooO0OO<Float, C20529OooOOOO> c20518OooO0OO = this.f60507OooOo.f60513OooO0OO;
            Float f = new Float(this.f60510OooOoO0);
            this.f60508OooOo0o = 1;
            if (C20518OooO0OO.OooO0O0(c20518OooO0OO, f, this.f60509OooOoO, this) == enumC32485OooO00o) {
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
