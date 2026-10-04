package o0o0OO;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.o00O00o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.viewmodel.TiledPageViewModel$duplicatePages$1", m80623f = "TiledPageViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_6}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f108383OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108384OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30367OooO0o0 f108385OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(ArrayList arrayList, C30367OooO0o0 c30367OooO0o0, Continuation continuation) {
        super(2, continuation);
        this.f108383OooOo = arrayList;
        this.f108385OooOoO0 = c30367OooO0o0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOO(this.f108383OooOo, this.f108385OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iNextIndex;
        C30367OooO0o0 c30367OooO0o0 = this.f108385OooOoO0;
        ArrayList arrayList = this.f108383OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108384OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                String str = (String) oOo000Oo.OooOo.OoooOOo(arrayList);
                List<Page> pages = ((NoteContent) c30367OooO0o0.f108339OooOOOo.f121747OooOo0o.getValue()).getPages();
                ListIterator<Page> listIterator = pages.listIterator(pages.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(listIterator.previous().getId(), str)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                C27449o00O0OoO c27449o00O0OoO = c30367OooO0o0.f108328OooO0Oo;
                String str2 = (String) c30367OooO0o0.f108338OooOOOO.getValue();
                int i2 = iNextIndex + 1;
                this.f108384OooOo0o = 1;
                c27449o00O0OoO.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new o00O00o0(c27449o00O0OoO, str2, arrayList, i2, null), this);
                if (objOooO0o != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TiledPageViewModel");
            c20358OooO00o.OooO0Oo(e, "duplicated pages failed.", new Object[0]);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
