package o0OO0o0O;

import com.orion.notein.domain.models.note.ColorSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OO0o0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.colorset.ColorSetRepoImpl$getColorSetsByCategory$1", m80623f = "ColorSetRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26924OooO0oO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends ColorSet>, List<? extends ColorSet>, Continuation<? super List<? extends ColorSet>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f93483OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f93484OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends ColorSet> list, List<? extends ColorSet> list2, Continuation<? super List<? extends ColorSet>> continuation) {
        C26924OooO0oO c26924OooO0oO = new C26924OooO0oO(3, continuation);
        c26924OooO0oO.f93484OooOo0o = list;
        c26924OooO0oO.f93483OooOo = list2;
        return c26924OooO0oO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return OooOo.OooooOO(this.f93484OooOo0o, this.f93483OooOo);
    }
}
