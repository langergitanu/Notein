package o0o000oo;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0o000oo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarViewModel$enableSecondaryTools$1", m80623f = "ToolbarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29854OooooO0 extends AbstractC32476OooO implements InterfaceC32510OooOOo0<NoteMeta, Set<? extends Integer>, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Set f105887OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ NoteMeta f105888OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(NoteMeta noteMeta, Set<? extends Integer> set, Continuation<? super Boolean> continuation) {
        C29854OooooO0 c29854OooooO0 = new C29854OooooO0(3, continuation);
        c29854OooooO0.f105888OooOo0o = noteMeta;
        c29854OooooO0.f105887OooOo = set;
        return c29854OooooO0.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return this.f105888OooOo0o == null ? Boolean.FALSE : Boolean.valueOf(this.f105887OooOo.contains(new Integer(4)));
    }
}
