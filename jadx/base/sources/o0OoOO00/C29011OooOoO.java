package o0OoOO00;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: o0OoOO00.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.addpage.AddPageViewModel$_currentPageTemplate$1", m80623f = "AddPageViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C29011OooOoO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<NoteContent, Page, Continuation<? super Page>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Page f102769OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ NoteContent f102770OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.addpage.OooO0OO f102771OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29011OooOoO(com.orion.notein.p607ui.noteeditor.addpage.OooO0OO oooO0OO, Continuation<? super C29011OooOoO> continuation) {
        super(3, continuation);
        this.f102771OooOoO0 = oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(NoteContent noteContent, Page page, Continuation<? super Page> continuation) {
        C29011OooOoO c29011OooOoO = new C29011OooOoO(this.f102771OooOoO0, continuation);
        c29011OooOoO.f102770OooOo0o = noteContent;
        c29011OooOoO.f102769OooOo = page;
        return c29011OooOoO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        NoteContent noteContent = this.f102770OooOo0o;
        Page page = this.f102769OooOo;
        PaperTheme paperTheme = page.getPaperTheme();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(paperTheme);
        if (paperTheme instanceof PdfPaperTheme) {
            String pdfPath = ((PdfPaperTheme) paperTheme).getPdfInfo().getPdfPath();
            PdfInfo pdfInfo = noteContent.getPdfInfo();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(pdfPath, pdfInfo != null ? pdfInfo.getPdfPath() : null)) {
                return new Page("", noteContent.getId(), page.getPaperSpec(), page.getPaperOrientation(), this.f102771OooOoO0.f73851OooO.OooOO0(page.getPaperOrientation()), null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524256, null);
            }
        }
        return page;
    }
}
