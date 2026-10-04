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

/* JADX INFO: renamed from: o0O0o0OO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.editor.palmdetection.ExclusionZonePalmDetector$startResetIsDownOnExcludeZoneJob$1", m80623f = "ExclusionZonePalmDetector.kt", m80624l = {90}, m80625m = "invokeSuspend")
public final class C26005OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26006OooO0Oo f88819OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f88820OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26005OooO0OO(C26006OooO0Oo c26006OooO0Oo, Continuation<? super C26005OooO0OO> continuation) {
        super(2, continuation);
        this.f88819OooOo = c26006OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26005OooO0OO(this.f88819OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C26005OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f88820OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            long doubleTapTimeout = ((long) ViewConfiguration.getDoubleTapTimeout()) + 100;
            this.f88820OooOo0o = 1;
            if (C33644OoooO0.OooO00o(doubleTapTimeout, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        this.f88819OooOo.f88822OooO0O0 = false;
        return C32460OooOooO.f116667OooO00o;
    }
}
