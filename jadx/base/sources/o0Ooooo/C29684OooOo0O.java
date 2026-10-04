package o0Ooooo;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00O0O0o.C24841OooOOo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0Ooooo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$showCacheUpdatingTips$1", m80623f = "EditorPreviewViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29684OooOo0O extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<C24841OooOOo0>, Integer, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ int f105234OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f105235OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<C24841OooOOo0> list, Integer num, Continuation<? super Boolean> continuation) {
        int iIntValue = num.intValue();
        C29684OooOo0O c29684OooOo0O = new C29684OooOo0O(3, continuation);
        c29684OooOo0O.f105235OooOo0o = list;
        c29684OooOo0O.f105234OooOo = iIntValue;
        return c29684OooOo0O.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list = this.f105235OooOo0o;
        int i = this.f105234OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            C24841OooOOo0.OooO00o oooO00o = ((C24841OooOOo0) obj2).f84277OooO0O0;
            if (oooO00o == C24841OooOOo0.OooO00o.f84282OooOo || oooO00o == C24841OooOOo0.OooO00o.f84283OooOo0o) {
                arrayList.add(obj2);
            }
        }
        return Boolean.valueOf((arrayList.isEmpty() || i == 0) ? false : true);
    }
}
