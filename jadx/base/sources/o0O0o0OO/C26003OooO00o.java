package o0O0o0OO;

import android.view.ViewConfiguration;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o0OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.editor.palmdetection.AxisRatioPalmDetector$startResetRatioJob$1", m80623f = "AxisRatioPalmDetector.kt", m80624l = {75}, m80625m = "invokeSuspend")
public final class C26003OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26004OooO0O0 f88814OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f88815OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26003OooO00o(C26004OooO0O0 c26004OooO0O0, Continuation<? super C26003OooO00o> continuation) {
        super(2, continuation);
        this.f88814OooOo = c26004OooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26003OooO00o(this.f88814OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26003OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f88815OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) + 100;
            this.f88815OooOo0o = 1;
            if (C33644OoooO0.OooO00o(doubleTapTimeout, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C34406OooO00o.f123390OooO00o.OooO00o("startResetRatioJob reset ration in job", new Object[0]);
        this.f88814OooOo.f88817OooO0O0 = 0.0f;
        return C32460OooOooO.f116667OooO00o;
    }
}
