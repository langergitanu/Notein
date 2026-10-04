package o0000oO0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0000oO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC32482OooO0o0(m80622c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", m80623f = "SharedPreferencesMigration.android.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C24331OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC24338OooO0o0, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Set<String> f81909OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f81910OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24331OooO0oo(Set<String> set, Continuation<? super C24331OooO0oo> continuation) {
        super(2, continuation);
        this.f81909OooOo = set;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C24331OooO0oo c24331OooO0oo = new C24331OooO0oo(this.f81909OooOo, continuation);
        c24331OooO0oo.f81910OooOo0o = obj;
        return c24331OooO0oo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC24338OooO0o0 abstractC24338OooO0o0, Continuation<? super Boolean> continuation) {
        return ((C24331OooO0oo) create(abstractC24338OooO0o0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        Set<AbstractC24338OooO0o0.OooO00o<?>> setKeySet = ((AbstractC24338OooO0o0) this.f81910OooOo0o).OooO00o().keySet();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC24338OooO0o0.OooO00o) it.next()).f81922OooO00o);
        }
        LinkedHashSet linkedHashSet = C24323OooO.f81887OooO00o;
        Set<String> set = this.f81909OooOo;
        boolean z = true;
        if (set != linkedHashSet) {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                        break;
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
