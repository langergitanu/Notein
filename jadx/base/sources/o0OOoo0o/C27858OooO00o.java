package o0OOoo0o;

import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.Outline;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.C26620o00Oo00o;
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
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OOoo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.outline.OutlineUseCase$addOutline$2", m80623f = "OutlineUseCase.kt", m80624l = {41, 56, 61, 62, 63}, m80625m = "invokeSuspend")
public final class C27858OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f98439OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f98440OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Outline f98441OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public NoteContent f98442OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f98443OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f98444OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27869OooOOO f98445OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ String f98446OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ String f98447OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f98448Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ String f98449Oooo00O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27858OooO00o(C27869OooOOO c27869OooOOO, String str, String str2, String str3, String str4, String str5, Continuation<? super C27858OooO00o> continuation) {
        super(2, continuation);
        this.f98445OooOoo0 = c27869OooOOO;
        this.f98444OooOoo = str;
        this.f98446OooOooO = str2;
        this.f98447OooOooo = str3;
        this.f98448Oooo000 = str4;
        this.f98449Oooo00O = str5;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27858OooO00o(this.f98445OooOoo0, this.f98444OooOoo, this.f98446OooOooO, this.f98447OooOooo, this.f98448Oooo000, this.f98449Oooo00O, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27858OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010b, code lost:
    
        if (r4.OooO0OO(r2, r30) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd A[PHI: r2 r4
      0x00fd: PHI (r2v11 com.orion.notein.domain.models.note.NoteContent) = (r2v10 com.orion.notein.domain.models.note.NoteContent), (r2v19 com.orion.notein.domain.models.note.NoteContent) binds: [B:30:0x00fa, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r4v3 o0OOoo0o.OooOOO) = (r4v2 o0OOoo0o.OooOOO), (r4v9 o0OOoo0o.OooOOO) binds: [B:30:0x00fa, B:12:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooOO0o;
        Object objOooO0o;
        NoteContent noteContent;
        Outline outline;
        NoteContent noteContent2;
        C26620o00Oo00o c26620o00Oo00o;
        List listOooO0oO;
        String id;
        NoteContent noteContent3;
        InterfaceC27309OooOoO interfaceC27309OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f98443OooOoOO;
        C27869OooOOO c27869OooOOO = this.f98445OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27309OooOoO interfaceC27309OooOoO2 = c27869OooOOO.f98489OooO0OO;
            this.f98443OooOoOO = 1;
            objOooOO0o = interfaceC27309OooOoO2.OooOO0o(this.f98444OooOoo, this);
            if (objOooOO0o != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooOO0o = obj;
        } else {
            if (i == 2) {
                outline = this.f98441OooOoO;
                NoteContent noteContent4 = this.f98442OooOoO0;
                C27869OooOOO c27869OooOOO2 = (C27869OooOOO) this.f98439OooOo;
                NoteContent noteContent5 = (NoteContent) this.f98440OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteContent = noteContent5;
                noteContent2 = noteContent4;
                c27869OooOOO = c27869OooOOO2;
                objOooO0o = obj;
                NoteContent noteContentCopy = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : null, (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : (List) objOooO0o, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent2.extras : null);
                c26620o00Oo00o = c27869OooOOO.f98487OooO00o;
                listOooO0oO = OooOo.OooO0oO(outline);
                id = noteContent.getId();
                this.f98440OooOo0o = c27869OooOOO;
                this.f98439OooOo = noteContentCopy;
                this.f98442OooOoO0 = null;
                this.f98441OooOoO = null;
                this.f98443OooOoOO = 3;
                if (c26620o00Oo00o.OooO00o(id, listOooO0oO, this) != enumC32485OooO00o) {
                    noteContent3 = noteContentCopy;
                    interfaceC27309OooOoO = c27869OooOOO.f98489OooO0OO;
                    this.f98440OooOo0o = c27869OooOOO;
                    this.f98439OooOo = noteContent3;
                    this.f98443OooOoOO = 4;
                    if (interfaceC27309OooOoO.OooO0oO(noteContent3, this) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i == 3) {
                noteContent3 = (NoteContent) this.f98439OooOo;
                c27869OooOOO = (C27869OooOOO) this.f98440OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC27309OooOoO = c27869OooOOO.f98489OooO0OO;
                this.f98440OooOo0o = c27869OooOOO;
                this.f98439OooOo = noteContent3;
                this.f98443OooOoOO = 4;
                if (interfaceC27309OooOoO.OooO0oO(noteContent3, this) != enumC32485OooO00o) {
                    String id2 = noteContent3.getId();
                    this.f98440OooOo0o = null;
                    this.f98439OooOo = null;
                    this.f98443OooOoOO = 5;
                }
                return enumC32485OooO00o;
            }
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            noteContent3 = (NoteContent) this.f98439OooOo;
            c27869OooOOO = (C27869OooOOO) this.f98440OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            String id22 = noteContent3.getId();
            this.f98440OooOo0o = null;
            this.f98439OooOo = null;
            this.f98443OooOoOO = 5;
        }
        NoteContent noteContent6 = (NoteContent) objOooOO0o;
        if (noteContent6 == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        Outline outline2 = new Outline(this.f98446OooOooO, this.f98447OooOooo, null, this.f98448Oooo000, this.f98444OooOoo, this.f98449Oooo00O, c34434OooOoO, jCurrentTimeMillis, jCurrentTimeMillis);
        List<String> outlines = noteContent6.getOutlines();
        this.f98440OooOo0o = noteContent6;
        this.f98439OooOo = c27869OooOOO;
        this.f98442OooOoO0 = noteContent6;
        this.f98441OooOoO = outline2;
        this.f98443OooOoOO = 2;
        c27869OooOOO.getClass();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27865OooO0oo(c27869OooOOO, outline2, outlines, null), this);
        if (objOooO0o != enumC32485OooO00o) {
            noteContent = noteContent6;
            outline = outline2;
            noteContent2 = noteContent;
            NoteContent noteContentCopy2 = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : null, (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : (List) objOooO0o, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent2.extras : null);
            c26620o00Oo00o = c27869OooOOO.f98487OooO00o;
            listOooO0oO = OooOo.OooO0oO(outline);
            id = noteContent.getId();
            this.f98440OooOo0o = c27869OooOOO;
            this.f98439OooOo = noteContentCopy2;
            this.f98442OooOoO0 = null;
            this.f98441OooOoO = null;
            this.f98443OooOoOO = 3;
            if (c26620o00Oo00o.OooO00o(id, listOooO0oO, this) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }
}
