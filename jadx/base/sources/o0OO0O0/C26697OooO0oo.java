package o0OO0O0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34431OooOo0;

/* JADX INFO: renamed from: o0OO0O0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.audio.AudioLocalDataSource$filterExistedDisplayItemIds$2", m80623f = "AudioLocalDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26697OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<oo0oO0.OooOo00, Continuation<? super List<? extends String>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Set<String> f92216OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f92217OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26697OooO0oo(Set<String> set, Continuation<? super C26697OooO0oo> continuation) {
        super(2, continuation);
        this.f92216OooOo = set;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26697OooO0oo c26697OooO0oo = new C26697OooO0oo(this.f92216OooOo, continuation);
        c26697OooO0oo.f92217OooOo0o = obj;
        return c26697OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(oo0oO0.OooOo00 oooOo00, Continuation<? super List<? extends String>> continuation) {
        return ((C26697OooO0oo) create(oooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        oo0oO0.OooOo00 oooOo00 = (oo0oO0.OooOo00) this.f92217OooOo0o;
        ArrayList arrayListOo0o0Oo = oOo000Oo.OooOo.oo0o0Oo(100, 100, this.f92216OooOo);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListOo0o0Oo.iterator();
        while (it.hasNext()) {
            C34431OooOo0.OooOo0o(arrayList, oooOo00.OooO0oO((List) it.next()));
        }
        return arrayList;
    }
}
