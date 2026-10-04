package o0Ooo0oo;

import com.orion.notein.p607ui.p609vo.PenVO;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0Ooo0oo.oo0o0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$isPenWidthListVisible$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29569oo0o0Oo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<Boolean, C32443OooOOO<? extends Boolean, ? extends PenVO>, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ C32443OooOOO f104889OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ boolean f104890OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Boolean bool, C32443OooOOO<? extends Boolean, ? extends PenVO> c32443OooOOO, Continuation<? super Boolean> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        C29569oo0o0Oo c29569oo0o0Oo = new C29569oo0o0Oo(3, continuation);
        c29569oo0o0Oo.f104890OooOo0o = zBooleanValue;
        c29569oo0o0Oo.f104889OooOo = c32443OooOOO;
        return c29569oo0o0Oo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf((this.f104890OooOo0o || ((Boolean) this.f104889OooOo.f116638OooOo0o).booleanValue()) ? false : true);
    }
}
