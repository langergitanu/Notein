package o0OoO0oo;

import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOooo0.C27987OooO0oO;
import o0OOooo0.C27994OooOOOO;
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

/* JADX INFO: renamed from: o0OoO0oo.o00o00o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorViewModel$getQuotesByIds$2", m80623f = "NoteEditorViewModel.kt", m80624l = {1448}, m80625m = "invokeSuspend")
public final class C28915o00o00o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Quote>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo f102445OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102446OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f102447OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28915o00o00o0(C23344OooOOo c23344OooOOo, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f102445OooOo = c23344OooOOo;
        this.f102447OooOoO0 = arrayList;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28915o00o00o0(this.f102445OooOo, this.f102447OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Quote>> continuation) {
        return ((C28915o00o00o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102446OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        C23344OooOOo c23344OooOOo = this.f102445OooOo;
        String str = (String) c23344OooOOo.f73589OoooOOo.getValue();
        this.f102446OooOo0o = 1;
        C27994OooOOOO c27994OooOOOO = c23344OooOOo.f73558OooOOo0;
        c27994OooOOOO.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27987OooO0oO(c27994OooOOOO, this.f102447OooOoO0, str, null), this);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }
}
