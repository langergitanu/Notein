package o0OoOO00;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oooo.C24761OooO;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$insertPage$2", m80623f = "AddPageViewModel.kt", m80624l = {419, 441}, m80625m = "invokeSuspend")
public final class Oooo000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102807OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f102808OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO, Continuation<? super Oooo000> continuation) {
        super(2, continuation);
        this.f102807OooOo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new Oooo000(this.f102807OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((Oooo000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0113, code lost:
    
        if (r5.f73852OooO0Oo.OooO0OO(r2, r8, r6, r32) != r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2 A[LOOP:0: B:28:0x00ec->B:30:0x00f2, LOOP_END] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOoO0;
        Iterator<T> it;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102808OooOo0o;
        com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO = this.f102807OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = oooO0OO.f73852OooO0Oo;
            String str = (String) oooO0OO.f73859OooOO0o.getValue();
            this.f102808OooOo0o = 1;
            objOooOoO0 = c27449o00O0OoO.OooOoO0(str, this);
            if (objOooOoO0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOooOoO0 = obj;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooOoO0);
        NoteContent noteContent = (NoteContent) objOooOoO0;
        Page page = (Page) ((List) oooO0OO.f73867OooOo0.f121747OooOo0o.getValue()).get(((Number) oooO0OO.f73865OooOOo0.getValue()).intValue());
        PaperTheme paperTheme = page.getPaperTheme();
        LambdaPaperTheme lambdaPaperTheme = paperTheme instanceof LambdaPaperTheme ? (LambdaPaperTheme) paperTheme : null;
        if (lambdaPaperTheme != null) {
            LambdaPaperTheme lambdaPaperTheme2 = lambdaPaperTheme.getBaseTheme() instanceof ColorPaperTheme ? lambdaPaperTheme : null;
            if (lambdaPaperTheme2 == null || (paperTheme = LambdaPaperTheme.copy$default(lambdaPaperTheme2, new ColorPaperTheme(null, ((Number) oooO0OO.f73863OooOOOo.f121747OooOo0o.getValue()).intValue(), 1, null), null, null, null, null, null, 62, null)) == null) {
            }
            Page page2 = new Page(C24761OooO.OooO00o("toString(...)"), noteContent.getId(), page.getPaperSpec(), page.getPaperOrientation(), paperTheme, null, null, "", false, 1, 0L, 0L, null, null, 0, false, null, null, null, 523616, null);
            List<Page> pages = noteContent.getPages();
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
            it = pages.iterator();
            while (it.hasNext()) {
                arrayList.add(((Page) it.next()).getId());
            }
            int iIndexOf = arrayList.indexOf(oooO0OO.f73861OooOOO0.getValue()) + 1;
            this.f102808OooOo0o = 2;
        }
        PaperTheme paperTheme2 = page.getPaperTheme();
        Page page22 = new Page(C24761OooO.OooO00o("toString(...)"), noteContent.getId(), page.getPaperSpec(), page.getPaperOrientation(), paperTheme2, null, null, "", false, 1, 0L, 0L, null, null, 0, false, null, null, null, 523616, null);
        List<Page> pages2 = noteContent.getPages();
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(pages2, 10));
        it = pages2.iterator();
        while (it.hasNext()) {
        }
        int iIndexOf2 = arrayList2.indexOf(oooO0OO.f73861OooOOO0.getValue()) + 1;
        this.f102808OooOo0o = 2;
    }
}
