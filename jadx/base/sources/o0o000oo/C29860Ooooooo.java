package o0o000oo;

import com.orion.notein.domain.models.note.NoteMeta;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0o00Oo0.C29908OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0o000oo.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.toolbar.ToolbarViewModel$secondaryToolbarItems$1", m80623f = "ToolbarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29860Ooooooo extends AbstractC32476OooO implements InterfaceC32510OooOOo0<NoteMeta, Set<? extends Integer>, Continuation<? super List<? extends C29908OooO00o>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Set f105906OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ NoteMeta f105907OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f105908OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29860Ooooooo(o00Ooo o00ooo2, Continuation<? super C29860Ooooooo> continuation) {
        super(3, continuation);
        this.f105908OooOoO0 = o00ooo2;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(NoteMeta noteMeta, Set<? extends Integer> set, Continuation<? super List<? extends C29908OooO00o>> continuation) {
        C29860Ooooooo c29860Ooooooo = new C29860Ooooooo(this.f105908OooOoO0, continuation);
        c29860Ooooooo.f105907OooOo0o = noteMeta;
        c29860Ooooooo.f105906OooOo = set;
        return c29860Ooooooo.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteMeta noteMeta = this.f105907OooOo0o;
        Set set = this.f105906OooOo;
        if (noteMeta == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        List<C29908OooO00o> list = this.f105908OooOoO0.f105923OooO;
        ArrayList arrayList = new ArrayList();
        for (C29908OooO00o c29908OooO00o : list) {
            int i = c29908OooO00o.f106114OooO00o;
            arrayList.add(new C29908OooO00o(i, c29908OooO00o.f106115OooO0O0, c29908OooO00o.f106116OooO0OO, set.contains(new Integer(i))));
        }
        return arrayList;
    }
}
