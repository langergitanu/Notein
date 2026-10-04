package o0Ooooo0;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.Outline;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineVO;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOoo0o.C27865OooO0oo;
import o0OOoo0o.C27869OooOOO;
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
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0Ooooo0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.outline.EditorOutlineViewModel$moveOutline$2", m80623f = "EditorOutlineViewModel.kt", m80624l = {382, 387, 392, 397, 404, 410, 420, 428, 431, 439, 446, 454, 455, 457, 471, 480}, m80625m = "invokeSuspend")
public final class C29708OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Outline f105330OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f105331OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f105332OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f105333OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C29705OooOO0 f105334OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ int f105335OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ OutlineVO f105336OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ OutlineVO f105337OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ int f105338OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29708OooOO0O(C29705OooOO0 c29705OooOO0, OutlineVO outlineVO, int i, OutlineVO outlineVO2, int i2, Continuation<? super C29708OooOO0O> continuation) {
        super(2, continuation);
        this.f105334OooOoOO = c29705OooOO0;
        this.f105336OooOoo0 = outlineVO;
        this.f105335OooOoo = i;
        this.f105337OooOooO = outlineVO2;
        this.f105338OooOooo = i2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C29708OooOO0O c29708OooOO0O = new C29708OooOO0O(this.f105334OooOoOO, this.f105336OooOoo0, this.f105335OooOoo, this.f105337OooOooO, this.f105338OooOooo, continuation);
        c29708OooOO0O.f105332OooOoO = obj;
        return c29708OooOO0O;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29708OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x04df, code lost:
    
        if (r15.OooO0o0(r3, r2, r37) != r1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e0, code lost:
    
        if (r15.OooO0o0(r2, r3, r37) == r1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0304, code lost:
    
        if (r15.OooO0o0(r2, r3, r37) != r1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x03f9, code lost:
    
        if (r15.OooO0o0(r3, r2, r37) == r1) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029d A[PHI: r2 r3
      0x029d: PHI (r2v52 java.lang.Object) = (r2v49 java.lang.Object), (r2v58 java.lang.Object) binds: [B:60:0x0299, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r3v41 com.orion.notein.domain.models.note.NoteContent) = (r3v40 com.orion.notein.domain.models.note.NoteContent), (r3v48 com.orion.notein.domain.models.note.NoteContent) binds: [B:60:0x0299, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x043a  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33636Oooo00o interfaceC33636Oooo00o;
        int i;
        Object objOooO0O0;
        Object objOooO0O02;
        Object objOooO0O03;
        Outline outline;
        Object objOooO0O04;
        Outline outline2;
        Outline outline3;
        Object objOooO0o;
        Outline outline4;
        Outline outlineCopy$default;
        Object objOooO0O05;
        Outline outline5;
        Outline outline6;
        Object objOooO0O06;
        InterfaceC33636Oooo00o interfaceC33636Oooo00o2;
        Outline outline7;
        Object objOooOoO0;
        NoteContent noteContentCopy;
        Object objOooO0O07;
        Outline outline8;
        Outline outlineCopy$default2;
        Object obj2;
        Outline outline9;
        Outline outlineCopy$default3;
        Object objOooO0O08;
        Outline outline10;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f105333OooOoO0;
        OutlineVO outlineVO = this.f105337OooOooO;
        C29705OooOO0 c29705OooOO0 = this.f105334OooOoOO;
        OutlineVO outlineVO2 = this.f105336OooOoo0;
        int i3 = this.f105338OooOooo;
        C27449o00O0OoO c27449o00O0OoO = c29705OooOO0.f105290OooO0o;
        C27869OooOOO c27869OooOOO = c29705OooOO0.f105289OooO0Oo;
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f105332OooOoO;
                String id = outlineVO2.getId();
                String noteId = outlineVO2.getNoteId();
                this.f105332OooOoO = interfaceC33636Oooo00o;
                this.f105333OooOoO0 = 1;
                if (C29705OooOO0.OooO0o0(c29705OooOO0, id, noteId, this) != enumC32485OooO00o) {
                    i = this.f105335OooOoo;
                    if (i == 0) {
                        if (i == 1) {
                            if (i3 == 1 && outlineVO.getExpand()) {
                                String id2 = outlineVO.getId();
                                String noteId2 = outlineVO.getNoteId();
                                this.f105332OooOoO = interfaceC33636Oooo00o;
                                this.f105333OooOoO0 = 6;
                                objOooO0O03 = c27869OooOOO.OooO0O0(id2, noteId2, this);
                                if (objOooO0O03 != enumC32485OooO00o) {
                                    outline4 = (Outline) objOooO0O03;
                                    if (outline4 != null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o.OooOOO0("EditorOutlineViewModel");
                                        c20358OooO00o.OooO00o("moveOutline failed: dst " + outline4 + " not found in " + outlineVO.getNoteId(), new Object[0]);
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                    ArrayList arrayListO0ooOoO = OooOo.o0ooOoO(outline4.getChildren());
                                    arrayListO0ooOoO.add(0, outlineVO2.getId());
                                    outlineCopy$default = Outline.copy$default(outline4, null, null, null, null, null, null, arrayListO0ooOoO, 0L, 0L, 447, null);
                                    String id3 = outlineVO2.getId();
                                    String noteId3 = outlineVO2.getNoteId();
                                    this.f105332OooOoO = interfaceC33636Oooo00o;
                                    this.f105331OooOo0o = outline4;
                                    this.f105330OooOo = outlineCopy$default;
                                    this.f105333OooOoO0 = 7;
                                    objOooO0O05 = c27869OooOOO.OooO0O0(id3, noteId3, this);
                                    if (objOooO0O05 != enumC32485OooO00o) {
                                        outline5 = (Outline) objOooO0O05;
                                        if (outline5 != null) {
                                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o2.OooOOO0("EditorOutlineViewModel");
                                            c20358OooO00o2.OooO00o("moveOutline failed: src " + outline5 + " not found in " + outlineVO2.getNoteId(), new Object[0]);
                                            return C32460OooOooO.f116667OooO00o;
                                        }
                                        Outline outlineCopy$default4 = Outline.copy$default(outline5, null, null, outline4.getId(), null, null, null, null, 0L, 0L, 507, null);
                                        List listOooOO0o = C34429OooOOo0.OooOO0o(outlineCopy$default4, outlineCopy$default);
                                        String noteId4 = outlineCopy$default4.getNoteId();
                                        this.f105332OooOoO = null;
                                        this.f105331OooOo0o = null;
                                        this.f105330OooOo = null;
                                        this.f105333OooOoO0 = 8;
                                    }
                                }
                            } else {
                                String id4 = outlineVO.getId();
                                String noteId5 = outlineVO.getNoteId();
                                this.f105332OooOoO = interfaceC33636Oooo00o;
                                this.f105333OooOoO0 = 9;
                                objOooO0O02 = c27869OooOOO.OooO0O0(id4, noteId5, this);
                                if (objOooO0O02 != enumC32485OooO00o) {
                                    outline6 = (Outline) objOooO0O02;
                                    if (outline6 != null) {
                                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o3.OooOOO0("EditorOutlineViewModel");
                                        c20358OooO00o3.OooO00o("moveOutline failed: dst " + outline6 + " not found in " + outlineVO.getNoteId(), new Object[0]);
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                    String parentId = outline6.getParentId();
                                    if (parentId != null) {
                                        String noteId6 = outline6.getNoteId();
                                        this.f105332OooOoO = interfaceC33636Oooo00o;
                                        this.f105331OooOo0o = outline6;
                                        this.f105333OooOoO0 = 14;
                                        objOooO0O06 = c27869OooOOO.OooO0O0(parentId, noteId6, this);
                                        if (objOooO0O06 != enumC32485OooO00o) {
                                            interfaceC33636Oooo00o2 = interfaceC33636Oooo00o;
                                            outline7 = outline6;
                                            outline9 = (Outline) objOooO0O06;
                                            if (outline9 != null) {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                                c20358OooO00o4.OooOOO0("EditorOutlineViewModel");
                                                c20358OooO00o4.OooO00o("moveOutline failed: dstParent " + outline9 + " not found in " + outline7.getNoteId(), new Object[0]);
                                                return C32460OooOooO.f116667OooO00o;
                                            }
                                            ArrayList arrayListO0ooOoO2 = OooOo.o0ooOoO(outline9.getChildren());
                                            arrayListO0ooOoO2.add(arrayListO0ooOoO2.indexOf(outline7.getId()) + i3, outlineVO2.getId());
                                            outlineCopy$default3 = Outline.copy$default(outline9, null, null, null, null, null, null, arrayListO0ooOoO2, 0L, 0L, 447, null);
                                            String id5 = outlineVO2.getId();
                                            String noteId7 = outlineVO2.getNoteId();
                                            this.f105332OooOoO = interfaceC33636Oooo00o2;
                                            this.f105331OooOo0o = outline9;
                                            this.f105330OooOo = outlineCopy$default3;
                                            this.f105333OooOoO0 = 15;
                                            objOooO0O08 = c27869OooOOO.OooO0O0(id5, noteId7, this);
                                            if (objOooO0O08 != enumC32485OooO00o) {
                                                outline10 = (Outline) objOooO0O08;
                                                if (outline10 != null) {
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o5.OooOOO0("EditorOutlineViewModel");
                                                    c20358OooO00o5.OooO00o("moveOutline failed: src " + outline10 + " not found in " + outlineVO2.getNoteId(), new Object[0]);
                                                    return C32460OooOooO.f116667OooO00o;
                                                }
                                                Outline outlineCopy$default5 = Outline.copy$default(outline10, null, null, outline9.getId(), null, null, null, null, 0L, 0L, 507, null);
                                                List listOooOO0o2 = C34429OooOOo0.OooOO0o(outlineCopy$default5, outlineCopy$default3);
                                                String noteId8 = outlineCopy$default5.getNoteId();
                                                this.f105332OooOoO = null;
                                                this.f105331OooOo0o = null;
                                                this.f105330OooOo = null;
                                                this.f105333OooOoO0 = 16;
                                            }
                                        }
                                    } else {
                                        String str = (String) c29705OooOO0.f105292OooO0oO.getValue();
                                        this.f105332OooOoO = interfaceC33636Oooo00o;
                                        this.f105333OooOoO0 = 10;
                                        objOooOoO0 = c27449o00O0OoO.OooOoO0(str, this);
                                        if (objOooOoO0 != enumC32485OooO00o) {
                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooOoO0);
                                            NoteContent noteContent = (NoteContent) objOooOoO0;
                                            ArrayList arrayListO0ooOoO3 = OooOo.o0ooOoO(noteContent.getOutlines());
                                            arrayListO0ooOoO3.add(arrayListO0ooOoO3.indexOf(outlineVO.getId()) + i3, outlineVO2.getId());
                                            noteContentCopy = noteContent.copy((24571 & 1) != 0 ? noteContent.id : null, (24571 & 2) != 0 ? noteContent.defaultPage : null, (24571 & 4) != 0 ? noteContent.pages : null, (24571 & 8) != 0 ? noteContent.pageLayerIds : null, (24571 & 16) != 0 ? noteContent.outlines : arrayListO0ooOoO3, (24571 & 32) != 0 ? noteContent.pdfInfo : null, (24571 & 64) != 0 ? noteContent.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent.zoom : 0.0f, (24571 & 512) != 0 ? noteContent.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent.unboundedNote : false, (24571 & 4096) != 0 ? noteContent.creationTime : 0L, (24571 & 8192) != 0 ? noteContent.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent.extras : null);
                                            String id6 = outlineVO2.getId();
                                            String noteId9 = outlineVO2.getNoteId();
                                            this.f105332OooOoO = interfaceC33636Oooo00o;
                                            this.f105331OooOo0o = noteContentCopy;
                                            this.f105333OooOoO0 = 11;
                                            objOooO0O07 = c27869OooOOO.OooO0O0(id6, noteId9, this);
                                            if (objOooO0O07 != enumC32485OooO00o) {
                                                outline8 = (Outline) objOooO0O07;
                                                if (outline8 != null) {
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o6.OooOOO0("EditorOutlineViewModel");
                                                    c20358OooO00o6.OooO00o("moveOutline failed: src " + outline8 + " not found in " + outlineVO2.getNoteId(), new Object[0]);
                                                    return C32460OooOooO.f116667OooO00o;
                                                }
                                                outlineCopy$default2 = Outline.copy$default(outline8, null, null, null, null, null, null, null, 0L, 0L, 507, null);
                                                this.f105332OooOoO = outlineCopy$default2;
                                                obj2 = null;
                                                this.f105331OooOo0o = null;
                                                this.f105333OooOoO0 = 12;
                                                if (c27449o00O0OoO.OoooOOo(noteContentCopy, this) != enumC32485OooO00o) {
                                                    List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(outlineCopy$default2);
                                                    String noteId10 = outlineCopy$default2.getNoteId();
                                                    this.f105332OooOoO = obj2;
                                                    this.f105333OooOoO0 = 13;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    String id7 = outlineVO.getId();
                    String noteId11 = outlineVO.getNoteId();
                    this.f105332OooOoO = interfaceC33636Oooo00o;
                    this.f105333OooOoO0 = 2;
                    objOooO0O0 = c27869OooOOO.OooO0O0(id7, noteId11, this);
                    if (objOooO0O0 != enumC32485OooO00o) {
                        outline = (Outline) objOooO0O0;
                        if (outline != null) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o7.OooOOO0("EditorOutlineViewModel");
                            c20358OooO00o7.OooO00o("moveOutline failed: dst " + outline + " not found in " + outlineVO.getNoteId(), new Object[0]);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        String id8 = outlineVO2.getId();
                        String noteId12 = outlineVO2.getNoteId();
                        this.f105332OooOoO = interfaceC33636Oooo00o;
                        this.f105331OooOo0o = outline;
                        this.f105333OooOoO0 = 3;
                        objOooO0O04 = c27869OooOOO.OooO0O0(id8, noteId12, this);
                        if (objOooO0O04 != enumC32485OooO00o) {
                            outline2 = outline;
                            outline3 = (Outline) objOooO0O04;
                            if (outline3 != null) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o8.OooOOO0("EditorOutlineViewModel");
                                c20358OooO00o8.OooO00o("moveOutline failed: src " + outline3 + " not found in " + outlineVO2.getNoteId(), new Object[0]);
                                return C32460OooOooO.f116667OooO00o;
                            }
                            List<String> children = outline2.getChildren();
                            this.f105332OooOoO = outline2;
                            this.f105331OooOo0o = outline3;
                            this.f105333OooOoO0 = 4;
                            c27869OooOOO.getClass();
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27865OooO0oo(c27869OooOOO, outline3, children, null), this);
                            if (objOooO0o != enumC32485OooO00o) {
                                Outline outline11 = outline3;
                                Outline outline12 = outline2;
                                Outline outlineCopy$default6 = Outline.copy$default(outline12, null, null, null, null, null, null, (List) objOooO0o, 0L, 0L, 447, null);
                                Outline outlineCopy$default7 = Outline.copy$default(outline11, null, null, outline12.getId(), null, null, null, null, 0L, 0L, 507, null);
                                List listOooOO0o3 = C34429OooOOo0.OooOO0o(outlineCopy$default7, outlineCopy$default6);
                                String noteId13 = outlineCopy$default7.getNoteId();
                                this.f105332OooOoO = null;
                                this.f105331OooOo0o = null;
                                this.f105333OooOoO0 = 5;
                            }
                        }
                    }
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f105332OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                i = this.f105335OooOoo;
                if (i == 0) {
                }
                return enumC32485OooO00o;
            case 2:
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f105332OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O0 = obj;
                outline = (Outline) objOooO0O0;
                if (outline != null) {
                }
                break;
            case 3:
                Outline outline13 = (Outline) this.f105331OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                outline2 = outline13;
                objOooO0O04 = obj;
                outline3 = (Outline) objOooO0O04;
                if (outline3 != null) {
                }
                break;
            case 4:
                outline3 = (Outline) this.f105331OooOo0o;
                outline2 = (Outline) this.f105332OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                Outline outline112 = outline3;
                Outline outline122 = outline2;
                Outline outlineCopy$default62 = Outline.copy$default(outline122, null, null, null, null, null, null, (List) objOooO0o, 0L, 0L, 447, null);
                Outline outlineCopy$default72 = Outline.copy$default(outline112, null, null, outline122.getId(), null, null, null, null, 0L, 0L, 507, null);
                List listOooOO0o32 = C34429OooOOo0.OooOO0o(outlineCopy$default72, outlineCopy$default62);
                String noteId132 = outlineCopy$default72.getNoteId();
                this.f105332OooOoO = null;
                this.f105331OooOo0o = null;
                this.f105333OooOoO0 = 5;
                break;
            case 5:
            case 8:
            case 13:
            case 16:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 6:
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f105332OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O03 = obj;
                outline4 = (Outline) objOooO0O03;
                if (outline4 != null) {
                }
                break;
            case 7:
                Outline outline14 = this.f105330OooOo;
                Outline outline15 = (Outline) this.f105331OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                outline4 = outline15;
                outlineCopy$default = outline14;
                objOooO0O05 = obj;
                outline5 = (Outline) objOooO0O05;
                if (outline5 != null) {
                }
                break;
            case 9:
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f105332OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O02 = obj;
                outline6 = (Outline) objOooO0O02;
                if (outline6 != null) {
                }
                break;
            case 10:
                interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f105332OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                objOooOoO0 = obj;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(objOooOoO0);
                NoteContent noteContent2 = (NoteContent) objOooOoO0;
                ArrayList arrayListO0ooOoO32 = OooOo.o0ooOoO(noteContent2.getOutlines());
                arrayListO0ooOoO32.add(arrayListO0ooOoO32.indexOf(outlineVO.getId()) + i3, outlineVO2.getId());
                noteContentCopy = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : null, (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : arrayListO0ooOoO32, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent2.extras : null);
                String id62 = outlineVO2.getId();
                String noteId92 = outlineVO2.getNoteId();
                this.f105332OooOoO = interfaceC33636Oooo00o;
                this.f105331OooOo0o = noteContentCopy;
                this.f105333OooOoO0 = 11;
                objOooO0O07 = c27869OooOOO.OooO0O0(id62, noteId92, this);
                if (objOooO0O07 != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 11:
                NoteContent noteContent3 = (NoteContent) this.f105331OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteContentCopy = noteContent3;
                objOooO0O07 = obj;
                outline8 = (Outline) objOooO0O07;
                if (outline8 != null) {
                }
                break;
            case 12:
                outlineCopy$default2 = (Outline) this.f105332OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                obj2 = null;
                List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(outlineCopy$default2);
                String noteId102 = outlineCopy$default2.getNoteId();
                this.f105332OooOoO = obj2;
                this.f105333OooOoO0 = 13;
                break;
            case 14:
                outline7 = (Outline) this.f105331OooOo0o;
                InterfaceC33636Oooo00o interfaceC33636Oooo00o3 = (InterfaceC33636Oooo00o) this.f105332OooOoO;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33636Oooo00o2 = interfaceC33636Oooo00o3;
                objOooO0O06 = obj;
                outline9 = (Outline) objOooO0O06;
                if (outline9 != null) {
                }
                break;
            case 15:
                outlineCopy$default3 = this.f105330OooOo;
                outline9 = (Outline) this.f105331OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0O08 = obj;
                outline10 = (Outline) objOooO0O08;
                if (outline10 != null) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
