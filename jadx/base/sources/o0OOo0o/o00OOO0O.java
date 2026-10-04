package o0OOo0o;

import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageClipDataV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOO0OO.C27020OooOoO0;
import o0OOo0Oo.InterfaceC27309OooOoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$pastePagesFromPageClipData$2", m80623f = "NoteUseCase.kt", m80624l = {798, 799, 801, 805, 813, 818, 822, 823, 824, 826}, m80625m = "invokeSuspend")
public final class o00OOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f96200OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PageClipDataV2 f96201OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96202OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ArrayList f96203OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96204OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ int f96205OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ String f96206OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(C27449o00O0OoO c27449o00O0OoO, String str, int i, Continuation<? super o00OOO0O> continuation) {
        super(2, continuation);
        this.f96204OooOoOO = c27449o00O0OoO;
        this.f96206OooOoo0 = str;
        this.f96205OooOoo = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00OOO0O(this.f96204OooOoOO, this.f96206OooOoo0, this.f96205OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00OOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bc, code lost:
    
        if (r8.OooOOOO(r0, r1, r31) != r6) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7 A[PHI: r0
      0x00f7: PHI (r0v22 com.orion.notein.domain.models.page.PageClipDataV2) = (r0v20 com.orion.notein.domain.models.page.PageClipDataV2), (r0v24 com.orion.notein.domain.models.page.PageClipDataV2) binds: [B:46:0x00f3, B:11:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a9  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        PageClipDataV2 pageClipDataV2;
        Object objOooOO0o;
        NoteContent noteContent;
        Object objOooO0oo;
        PageClipDataV2 pageClipDataV22;
        NoteContent noteContent2;
        NoteMeta noteMeta;
        PageClipDataV2 pageClipDataV23;
        Object objOooO0O0;
        Object objOooOO0o2;
        PageClipDataV2 pageClipDataV24;
        String str;
        NoteContent noteContent3;
        ArrayList arrayList;
        PageClipDataV2 pageClipDataV25;
        int size;
        PageClipDataV2 pageClipDataV26;
        PageClipDataV2 pageClipDataV27;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96202OooOoO;
        C27449o00O0OoO c27449o00O0OoO = this.f96204OooOoOO;
        String str2 = this.f96206OooOoo0;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                C27020OooOoO0 c27020OooOoO0 = c27449o00O0OoO.f96039OooO0o;
                this.f96202OooOoO = 1;
                objOooO00o = c27020OooOoO0.f94066OooO0OO.OooO00o(this);
                if (objOooO00o != enumC32485OooO00o) {
                    pageClipDataV2 = (PageClipDataV2) objOooO00o;
                    if (pageClipDataV2 != null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    InterfaceC27309OooOoO interfaceC27309OooOoO = c27449o00O0OoO.f96035OooO00o;
                    this.f96201OooOo0o = pageClipDataV2;
                    this.f96202OooOoO = 2;
                    objOooOO0o = interfaceC27309OooOoO.OooOO0o(str2, this);
                    if (objOooOO0o != enumC32485OooO00o) {
                        noteContent = (NoteContent) objOooOO0o;
                        if (noteContent != null) {
                            return C32460OooOooO.f116667OooO00o;
                        }
                        String strOooO0Oo = c27449o00O0OoO.f96037OooO0OO.OooO0Oo();
                        this.f96201OooOo0o = pageClipDataV2;
                        this.f96200OooOo = noteContent;
                        this.f96202OooOoO = 3;
                        objOooO0oo = c27449o00O0OoO.f96036OooO0O0.OooO0oo(str2, strOooO0Oo, this);
                        if (objOooO0oo != enumC32485OooO00o) {
                            pageClipDataV22 = pageClipDataV2;
                            noteContent2 = noteContent;
                            noteMeta = (NoteMeta) objOooO0oo;
                            if (noteMeta != null) {
                                return C32460OooOooO.f116667OooO00o;
                            }
                            Note noteOooO0O0 = o0oOO.OooO0O0(noteMeta, noteContent2);
                            List<String> pageIds = pageClipDataV22.getPageIds();
                            String noteId = pageClipDataV22.getNoteId();
                            this.f96201OooOo0o = pageClipDataV22;
                            this.f96200OooOo = null;
                            this.f96202OooOoO = 4;
                            if (this.f96204OooOoOO.OooO0oO(pageIds, noteId, noteOooO0O0, this.f96205OooOoo, this) != enumC32485OooO00o) {
                                pageClipDataV23 = pageClipDataV22;
                                C27020OooOoO0 c27020OooOoO02 = c27449o00O0OoO.f96039OooO0o;
                                this.f96201OooOo0o = pageClipDataV23;
                                this.f96202OooOoO = 5;
                                objOooO0O0 = c27020OooOoO02.f94066OooO0OO.OooO0O0(null, this);
                                if (objOooO0O0 != enumC32485OooO00o) {
                                    objOooO0O0 = C32460OooOooO.f116667OooO00o;
                                }
                                if (objOooO0O0 != enumC32485OooO00o) {
                                    if (pageClipDataV23.isCut()) {
                                        String noteId2 = pageClipDataV23.getNoteId();
                                        InterfaceC27309OooOoO interfaceC27309OooOoO2 = c27449o00O0OoO.f96035OooO00o;
                                        this.f96201OooOo0o = pageClipDataV23;
                                        this.f96200OooOo = noteId2;
                                        this.f96202OooOoO = 6;
                                        objOooOO0o2 = interfaceC27309OooOoO2.OooOO0o(noteId2, this);
                                        if (objOooOO0o2 != enumC32485OooO00o) {
                                            pageClipDataV24 = pageClipDataV23;
                                            str = noteId2;
                                            noteContent3 = (NoteContent) objOooOO0o2;
                                            if (noteContent3 != null) {
                                                return C32460OooOooO.f116667OooO00o;
                                            }
                                            Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(pageClipDataV24.getPageIds());
                                            List<Page> pages = noteContent3.getPages();
                                            arrayList = new ArrayList();
                                            for (Object obj2 : pages) {
                                                if (!setO0OO00O.contains(((Page) obj2).getId())) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                            NoteContent noteContentCopy = noteContent3.copy((24571 & 1) != 0 ? noteContent3.id : null, (24571 & 2) != 0 ? noteContent3.defaultPage : null, (24571 & 4) != 0 ? noteContent3.pages : arrayList, (24571 & 8) != 0 ? noteContent3.pageLayerIds : null, (24571 & 16) != 0 ? noteContent3.outlines : null, (24571 & 32) != 0 ? noteContent3.pdfInfo : null, (24571 & 64) != 0 ? noteContent3.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent3.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent3.zoom : 0.0f, (24571 & 512) != 0 ? noteContent3.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent3.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent3.unboundedNote : false, (24571 & 4096) != 0 ? noteContent3.creationTime : 0L, (24571 & 8192) != 0 ? noteContent3.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent3.extras : null);
                                            this.f96201OooOo0o = pageClipDataV24;
                                            this.f96200OooOo = str;
                                            this.f96203OooOoO0 = arrayList;
                                            this.f96202OooOoO = 7;
                                            if (c27449o00O0OoO.OoooOOo(noteContentCopy, this) != enumC32485OooO00o) {
                                                pageClipDataV25 = pageClipDataV24;
                                                size = arrayList.size();
                                                this.f96201OooOo0o = pageClipDataV25;
                                                this.f96200OooOo = str;
                                                this.f96203OooOoO0 = null;
                                                this.f96202OooOoO = 8;
                                                if (c27449o00O0OoO.Ooooo00(size, str, this) != enumC32485OooO00o) {
                                                    pageClipDataV26 = pageClipDataV25;
                                                    this.f96201OooOo0o = pageClipDataV26;
                                                    this.f96200OooOo = null;
                                                    this.f96202OooOoO = 9;
                                                    if (c27449o00O0OoO.OoooOoO(str, true, this) != enumC32485OooO00o) {
                                                        pageClipDataV27 = pageClipDataV26;
                                                        List<String> pageIds2 = pageClipDataV27.getPageIds();
                                                        String noteId3 = pageClipDataV27.getNoteId();
                                                        this.f96201OooOo0o = null;
                                                        this.f96202OooOoO = 10;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    return C32460OooOooO.f116667OooO00o;
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                objOooO00o = obj;
                pageClipDataV2 = (PageClipDataV2) objOooO00o;
                if (pageClipDataV2 != null) {
                }
                break;
            case 2:
                pageClipDataV2 = this.f96201OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0o = obj;
                noteContent = (NoteContent) objOooOO0o;
                if (noteContent != null) {
                }
                break;
            case 3:
                noteContent2 = (NoteContent) this.f96200OooOo;
                PageClipDataV2 pageClipDataV28 = this.f96201OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                pageClipDataV22 = pageClipDataV28;
                objOooO0oo = obj;
                noteMeta = (NoteMeta) objOooO0oo;
                if (noteMeta != null) {
                }
                break;
            case 4:
                pageClipDataV23 = this.f96201OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C27020OooOoO0 c27020OooOoO022 = c27449o00O0OoO.f96039OooO0o;
                this.f96201OooOo0o = pageClipDataV23;
                this.f96202OooOoO = 5;
                objOooO0O0 = c27020OooOoO022.f94066OooO0OO.OooO0O0(null, this);
                if (objOooO0O0 != enumC32485OooO00o) {
                }
                if (objOooO0O0 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                pageClipDataV23 = this.f96201OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (pageClipDataV23.isCut()) {
                }
                return C32460OooOooO.f116667OooO00o;
            case 6:
                str = (String) this.f96200OooOo;
                pageClipDataV24 = this.f96201OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooOO0o2 = obj;
                noteContent3 = (NoteContent) objOooOO0o2;
                if (noteContent3 != null) {
                }
                break;
            case 7:
                ArrayList arrayList2 = this.f96203OooOoO0;
                String str3 = (String) this.f96200OooOo;
                pageClipDataV25 = this.f96201OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                arrayList = arrayList2;
                str = str3;
                size = arrayList.size();
                this.f96201OooOo0o = pageClipDataV25;
                this.f96200OooOo = str;
                this.f96203OooOoO0 = null;
                this.f96202OooOoO = 8;
                if (c27449o00O0OoO.Ooooo00(size, str, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                str = (String) this.f96200OooOo;
                pageClipDataV26 = this.f96201OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f96201OooOo0o = pageClipDataV26;
                this.f96200OooOo = null;
                this.f96202OooOoO = 9;
                if (c27449o00O0OoO.OoooOoO(str, true, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 9:
                pageClipDataV27 = this.f96201OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List<String> pageIds22 = pageClipDataV27.getPageIds();
                String noteId32 = pageClipDataV27.getNoteId();
                this.f96201OooOo0o = null;
                this.f96202OooOoO = 10;
                break;
            case 10:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
