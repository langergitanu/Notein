package o0OoOoo0;

import com.orion.notein.p607ui.p609vo.LatestOpenedNoteVO;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoOoo0.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.editortab.LatestOpenedNoteViewModel$special$$inlined$flatMapLatest$1", m80623f = "LatestOpenedNoteViewModel.kt", m80624l = {189}, m80625m = "invokeSuspend")
public final class C29245OooOo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<InterfaceC33723OooO0oO<? super List<? extends LatestOpenedNoteVO>>, InterfaceC33721OooO0o<? extends List<? extends LatestOpenedNoteVO>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ InterfaceC33723OooO0oO f103710OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f103711OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f103712OooOoO0;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends LatestOpenedNoteVO>> interfaceC33723OooO0oO, InterfaceC33721OooO0o<? extends List<? extends LatestOpenedNoteVO>> interfaceC33721OooO0o, Continuation<? super C32460OooOooO> continuation) {
        C29245OooOo c29245OooOo = new C29245OooOo(3, continuation);
        c29245OooOo.f103710OooOo = interfaceC33723OooO0oO;
        c29245OooOo.f103712OooOoO0 = interfaceC33721OooO0o;
        return c29245OooOo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f103711OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33723OooO0oO interfaceC33723OooO0oO = this.f103710OooOo;
            InterfaceC33721OooO0o interfaceC33721OooO0o = (InterfaceC33721OooO0o) this.f103712OooOoO0;
            this.f103711OooOo0o = 1;
            if (C25252OooO0Oo.OooOOO0(interfaceC33723OooO0oO, interfaceC33721OooO0o, this) == enumC32485OooO00o) {
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
