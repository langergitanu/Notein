package o0Ooooo;

import com.orion.notein.domain.models.search.TextSearchResult;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Ooooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$_searchResult$1$2", m80623f = "EditorPreviewViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29673OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends TextSearchResult>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f105201OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f105202OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO f105203OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29673OooOO0o(com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO, String str, Continuation continuation) {
        super(2, continuation);
        this.f105201OooOo = str;
        this.f105203OooOoO0 = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29673OooOO0o c29673OooOO0o = new C29673OooOO0o(this.f105203OooOoO0, this.f105201OooOo, continuation);
        c29673OooOO0o.f105202OooOo0o = obj;
        return c29673OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(List<? extends TextSearchResult> list, Continuation<? super C32460OooOooO> continuation) {
        return ((C29673OooOO0o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        int i = this.f105201OooOo.length() == 0 ? 0 : ((List) this.f105202OooOo0o).isEmpty() ? 2 : 3;
        C33781o00o0O c33781o00o0O = this.f105203OooOoO0.f76084OooOo0O;
        Integer num = new Integer(i);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, num);
        return C32460OooOooO.f116667OooO00o;
    }
}
