package o0OOo0o;

import com.orion.notein.domain.models.search.TextSearchResult;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OOo0o.o0ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.TextRecognitionAndSearchUseCase$searchTextInPagesParallel$3$1", m80623f = "TextRecognitionAndSearchUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27599o0ooOO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<List<? extends TextSearchResult>, List<? extends TextSearchResult>, Continuation<? super List<? extends TextSearchResult>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ List f96980OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ List f96981OooOo0o;

    /* JADX INFO: renamed from: o0OOo0o.o0ooOO$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Integer.valueOf(((TextSearchResult) t).getPageIndex()), Integer.valueOf(((TextSearchResult) t2).getPageIndex()));
        }
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(List<? extends TextSearchResult> list, List<? extends TextSearchResult> list2, Continuation<? super List<? extends TextSearchResult>> continuation) {
        C27599o0ooOO c27599o0ooOO = new C27599o0ooOO(3, continuation);
        c27599o0ooOO.f96981OooOo0o = list;
        c27599o0ooOO.f96980OooOo = list2;
        return c27599o0ooOO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return oOo000Oo.OooOo.o00O0O(oOo000Oo.OooOo.OooooOO(this.f96981OooOo0o, this.f96980OooOo), new OooO00o());
    }
}
