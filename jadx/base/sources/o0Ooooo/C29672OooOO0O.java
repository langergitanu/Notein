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
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0Ooooo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.preview.EditorPreviewViewModel$_searchResult$1$1", m80623f = "EditorPreviewViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29672OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super List<? extends TextSearchResult>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO f105199OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ String f105200OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29672OooOO0O(com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0OO oooO0OO, String str, Continuation continuation) {
        super(2, continuation);
        this.f105200OooOo0o = str;
        this.f105199OooOo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29672OooOO0O(this.f105199OooOo, this.f105200OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends TextSearchResult>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C29672OooOO0O) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        int i = this.f105200OooOo0o.length() == 0 ? 1 : 0;
        C33781o00o0O c33781o00o0O = this.f105199OooOo.f76084OooOo0O;
        Integer num = new Integer(i ^ 1);
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, num);
        return C32460OooOooO.f116667OooO00o;
    }
}
