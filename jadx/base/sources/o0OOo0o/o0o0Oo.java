package o0OOo0o;

import com.aspose.slides.C22227OoooO;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.LocalResPaperTheme;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27020OooOoO0;
import o0OOo0Oo.InterfaceC27309OooOoO;
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

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$recoverPageFromTrashBin$2", m80623f = "NoteUseCase.kt", m80624l = {683, 684, 686, 711, 712, 715, 718, 723, 724}, m80625m = "invokeSuspend")
public final class o0o0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f96963OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Page f96964OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96965OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public NoteContent f96966OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96967OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f96968OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f96969OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96970OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(String str, String str2, Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
        super(2, continuation);
        this.f96969OooOoo0 = str;
        this.f96968OooOoo = str2;
        this.f96970OooOooO = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0o0Oo(this.f96969OooOoo0, this.f96968OooOoo, continuation, this.f96970OooOooO);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0o0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ca, code lost:
    
        if (r2.OooOO0(r4, r3, r39) == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0229, code lost:
    
        if (r9.OooOOOO(r6, r2, r39) != r1) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b5 A[PHI: r5
      0x01b5: PHI (r5v14 com.orion.notein.domain.models.page.Page) = (r5v12 com.orion.notein.domain.models.page.Page), (r5v16 com.orion.notein.domain.models.page.Page) binds: [B:50:0x019e, B:55:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO0Oo;
        Page page;
        Object objOooOO0o;
        Object objOooO0oo;
        Page page2;
        NoteContent noteContent;
        NoteMeta noteMeta;
        PaperTheme paperTheme;
        String str;
        Page page3;
        int i;
        NoteContent noteContent2;
        List list;
        int size;
        Page page4;
        Page page5;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f96967OooOoOO;
        C27449o00O0OoO c27449o00O0OoO = this.f96970OooOooO;
        String str2 = this.f96969OooOoo0;
        String str3 = this.f96968OooOoo;
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "NoteUseCase", "recoverPageFromTrashBin, pageId is ", str2, ", noteId is ");
                sbOooO00o.append(str3);
                c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                C27020OooOoO0 c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
                this.f96967OooOoOO = 1;
                objOooO0Oo = c27020OooOoO0.OooO0Oo(str2, str3, this);
                if (objOooO0Oo != enumC32485OooO00o) {
                    page = (Page) objOooO0Oo;
                    if (page != null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO.f96035OooO00o;
                    String recoverNoteId = page.getRecoverNoteId();
                    this.f96964OooOo0o = page;
                    this.f96967OooOoOO = 2;
                    objOooOO0o = interfaceC27309OooOoO.OooOO0o(recoverNoteId, this);
                    if (objOooOO0o != enumC32485OooO00o) {
                        NoteContent noteContent3 = (NoteContent) objOooOO0o;
                        String strOooO0Oo = c27449o00O0OoO.f96037OooO0OO.OooO0Oo();
                        String recoverNoteId2 = page.getRecoverNoteId();
                        this.f96964OooOo0o = page;
                        this.f96963OooOo = noteContent3;
                        this.f96967OooOoOO = 3;
                        objOooO0oo = c27449o00O0OoO.f96036OooO0O0.OooO0oo(recoverNoteId2, strOooO0Oo, this);
                        if (objOooO0oo != enumC32485OooO00o) {
                            page2 = page;
                            noteContent = noteContent3;
                            noteMeta = (NoteMeta) objOooO0oo;
                            paperTheme = page2.getPaperTheme();
                            if (!(paperTheme instanceof LocalResPaperTheme) && noteContent != null && ((LocalResPaperTheme) paperTheme).isInvalid()) {
                                return C32460OooOooO.f116667OooO00o;
                            }
                            if (noteContent != null || noteMeta == null || noteMeta.getInTrashBin()) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("NoteUseCase");
                                c20358OooO00o2.OooO0o0("recoverPageFromTrashBin, no recover to origin note, content: " + noteContent + ", meta: " + noteMeta, new Object[0]);
                                if (noteContent != null || noteMeta == null || !noteMeta.getInTrashBin()) {
                                    c20358OooO00o2.OooOOO0("NoteUseCase");
                                    c20358OooO00o2.OooOO0O("recoverPageFromTrashBin failed, content: " + noteContent + ", meta: " + noteMeta, new Object[0]);
                                    return C32460OooOooO.f116667OooO00o;
                                }
                                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(str2);
                                String title = noteMeta.getTitle();
                                this.f96964OooOo0o = null;
                                this.f96963OooOo = null;
                                this.f96967OooOoOO = 8;
                                c27449o00O0OoO.getClass();
                                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                str = str3;
                                if (C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27441o000oooo(title, str, listOooO0oO, null, c27449o00O0OoO), this) != enumC32485OooO00o) {
                                    List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(str2);
                                    this.f96967OooOoOO = 9;
                                }
                            } else {
                                Page pageCopy$default = Page.copy$default(page2, null, null, null, null, null, null, null, null, false, 0, 0L, 0L, "", null, -1, false, null, null, null, 471039, null);
                                ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(noteContent.getPages());
                                if (page2.getRecoverIndex() < 0) {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                    StringBuilder sbOooO00o2 = C22227OoooO.OooO00o(c20358OooO00o3, "NoteUseCase", "recoverPageFromTrashBin, page.recoverIndex is invalid, pageId is ", str2, ", noteId is ");
                                    sbOooO00o2.append(str3);
                                    c20358OooO00o3.OooO0OO(sbOooO00o2.toString(), new Object[0]);
                                }
                                int iOooO0o = oO0O00oo.OooOO0.OooO0o(page2.getRecoverIndex(), 0, arrayListO0ooOoO.size());
                                arrayListO0ooOoO.add(iOooO0o, pageCopy$default);
                                NoteContent noteContentCopy = noteContent.copy((24571 & 1) != 0 ? noteContent.id : null, (24571 & 2) != 0 ? noteContent.defaultPage : null, (24571 & 4) != 0 ? noteContent.pages : arrayListO0ooOoO, (24571 & 8) != 0 ? noteContent.pageLayerIds : null, (24571 & 16) != 0 ? noteContent.outlines : null, (24571 & 32) != 0 ? noteContent.pdfInfo : null, (24571 & 64) != 0 ? noteContent.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent.zoom : 0.0f, (24571 & 512) != 0 ? noteContent.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent.unboundedNote : false, (24571 & 4096) != 0 ? noteContent.creationTime : 0L, (24571 & 8192) != 0 ? noteContent.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent.extras : null);
                                this.f96964OooOo0o = pageCopy$default;
                                this.f96963OooOo = arrayListO0ooOoO;
                                this.f96966OooOoO0 = noteContentCopy;
                                this.f96965OooOoO = iOooO0o;
                                this.f96967OooOoOO = 4;
                                if (c27449o00O0OoO.OoooOOo(noteContentCopy, this) != enumC32485OooO00o) {
                                    page3 = pageCopy$default;
                                    i = iOooO0o;
                                    noteContent2 = noteContentCopy;
                                    list = arrayListO0ooOoO;
                                    size = list.size();
                                    this.f96964OooOo0o = page3;
                                    this.f96963OooOo = noteContent2;
                                    this.f96966OooOoO0 = null;
                                    this.f96965OooOoO = i;
                                    this.f96967OooOoOO = 5;
                                    if (c27449o00O0OoO.Ooooo00(size, str3, this) != enumC32485OooO00o) {
                                        page4 = page3;
                                        if (i == 0) {
                                            C27020OooOoO0 c27020OooOoO02 = c27449o00O0OoO.f96039OooO0o;
                                            List listOooO0oO3 = com.facebook.soloader.OooOo.OooO0oO(page4);
                                            String noteId = page4.getNoteId();
                                            this.f96964OooOo0o = null;
                                            this.f96963OooOo = null;
                                            this.f96967OooOoOO = 7;
                                        } else {
                                            String id = noteContent2.getId();
                                            this.f96964OooOo0o = page4;
                                            this.f96963OooOo = null;
                                            this.f96967OooOoOO = 6;
                                            if (c27449o00O0OoO.OoooOoO(id, true, this) != enumC32485OooO00o) {
                                                page5 = page4;
                                                page4 = page5;
                                                C27020OooOoO0 c27020OooOoO022 = c27449o00O0OoO.f96039OooO0o;
                                                List listOooO0oO32 = com.facebook.soloader.OooOo.OooO0oO(page4);
                                                String noteId2 = page4.getNoteId();
                                                this.f96964OooOo0o = null;
                                                this.f96963OooOo = null;
                                                this.f96967OooOoOO = 7;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo = obj;
                page = (Page) objOooO0Oo;
                if (page != null) {
                }
                break;
            case 2:
                page = this.f96964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0o = obj;
                NoteContent noteContent32 = (NoteContent) objOooOO0o;
                String strOooO0Oo2 = c27449o00O0OoO.f96037OooO0OO.OooO0Oo();
                String recoverNoteId22 = page.getRecoverNoteId();
                this.f96964OooOo0o = page;
                this.f96963OooOo = noteContent32;
                this.f96967OooOoOO = 3;
                objOooO0oo = c27449o00O0OoO.f96036OooO0O0.OooO0oo(recoverNoteId22, strOooO0Oo2, this);
                if (objOooO0oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                NoteContent noteContent4 = (NoteContent) this.f96963OooOo;
                Page page6 = this.f96964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0oo = obj;
                noteContent = noteContent4;
                page2 = page6;
                noteMeta = (NoteMeta) objOooO0oo;
                paperTheme = page2.getPaperTheme();
                if (!(paperTheme instanceof LocalResPaperTheme)) {
                }
                if (noteContent != null) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("NoteUseCase");
                c20358OooO00o22.OooO0o0("recoverPageFromTrashBin, no recover to origin note, content: " + noteContent + ", meta: " + noteMeta, new Object[0]);
                if (noteContent != null) {
                }
                c20358OooO00o22.OooOOO0("NoteUseCase");
                c20358OooO00o22.OooOO0O("recoverPageFromTrashBin failed, content: " + noteContent + ", meta: " + noteMeta, new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            case 4:
                i = this.f96965OooOoO;
                noteContent2 = this.f96966OooOoO0;
                list = (List) this.f96963OooOo;
                page3 = this.f96964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                size = list.size();
                this.f96964OooOo0o = page3;
                this.f96963OooOo = noteContent2;
                this.f96966OooOoO0 = null;
                this.f96965OooOoO = i;
                this.f96967OooOoOO = 5;
                if (c27449o00O0OoO.Ooooo00(size, str3, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                i = this.f96965OooOoO;
                noteContent2 = (NoteContent) this.f96963OooOo;
                page4 = this.f96964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (i == 0) {
                }
                return enumC32485OooO00o;
            case 6:
                page5 = this.f96964OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                page4 = page5;
                C27020OooOoO0 c27020OooOoO0222 = c27449o00O0OoO.f96039OooO0o;
                List listOooO0oO322 = com.facebook.soloader.OooOo.OooO0oO(page4);
                String noteId22 = page4.getNoteId();
                this.f96964OooOo0o = null;
                this.f96963OooOo = null;
                this.f96967OooOoOO = 7;
                break;
            case 7:
            case 9:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 8:
                C32446OooOOOo.OooO0O0(obj);
                str = str3;
                List listOooO0oO22 = com.facebook.soloader.OooOo.OooO0oO(str2);
                this.f96967OooOoOO = 9;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
