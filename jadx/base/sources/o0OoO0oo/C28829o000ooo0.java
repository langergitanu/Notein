package o0OoO0oo;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoO0oo.o000ooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorContainerViewModel$removePageIdsInNoteContentWhileNotInPages$1", m80623f = "NoteEditorContainerViewModel.kt", m80624l = {778, 780, 786, 787}, m80625m = "invokeSuspend")
public final class C28829o000ooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f102065OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.OooO0OO f102066OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ArrayList f102067OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f102068OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f102069OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f102070OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.OooO0OO f102071OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28829o000ooo0(com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO, String str, Continuation<? super C28829o000ooo0> continuation) {
        super(2, continuation);
        this.f102071OooOoo0 = oooO0OO;
        this.f102070OooOoo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28829o000ooo0(this.f102071OooOoo0, this.f102070OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28829o000ooo0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x014a, code lost:
    
        if (r4.Ooooo00(r2, r3, r32) != r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[LOOP:0: B:28:0x00b2->B:30:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOoO0;
        Object objOooO0oO;
        NoteContent noteContent;
        ArrayList arrayList;
        Iterator it;
        List listOoooo00;
        List list;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102069OooOoOO;
        String str = this.f102070OooOoo;
        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO = this.f102071OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f102069OooOoOO = 1;
            objOooOoO0 = oooO0OO.f73350OooO0Oo.OooOoO0(str, this);
            if (objOooOoO0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooOoO0 = obj;
        } else {
            if (i == 2) {
                arrayList = this.f102067OooOoO;
                NoteContent noteContent2 = (NoteContent) this.f102068OooOoO0;
                String str2 = this.f102065OooOo;
                com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OO2 = this.f102066OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteContent = noteContent2;
                str = str2;
                oooO0OO = oooO0OO2;
                objOooO0oO = obj;
                List list2 = (List) objOooO0oO;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Page) it.next()).getId());
                }
                listOoooo00 = oOo000Oo.OooOo.Ooooo00(arrayList, oOo000Oo.OooOo.o0OO00O(arrayList2));
                if (!listOoooo00.isEmpty()) {
                    List<Page> pages = noteContent.getPages();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : pages) {
                        if (!listOoooo00.contains(((Page) obj2).getId())) {
                            arrayList3.add(obj2);
                        }
                    }
                    NoteContent noteContentCopy = noteContent.copy((24571 & 1) != 0 ? noteContent.id : null, (24571 & 2) != 0 ? noteContent.defaultPage : null, (24571 & 4) != 0 ? noteContent.pages : arrayList3, (24571 & 8) != 0 ? noteContent.pageLayerIds : null, (24571 & 16) != 0 ? noteContent.outlines : null, (24571 & 32) != 0 ? noteContent.pdfInfo : null, (24571 & 64) != 0 ? noteContent.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent.zoom : 0.0f, (24571 & 512) != 0 ? noteContent.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent.unboundedNote : false, (24571 & 4096) != 0 ? noteContent.creationTime : 0L, (24571 & 8192) != 0 ? noteContent.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent.extras : null);
                    C27449o00O0OoO c27449o00O0OoO = oooO0OO.f73350OooO0Oo;
                    this.f102066OooOo0o = oooO0OO;
                    this.f102065OooOo = str;
                    this.f102068OooOoO0 = arrayList3;
                    this.f102067OooOoO = null;
                    this.f102069OooOoOO = 3;
                    if (c27449o00O0OoO.OoooOOo(noteContentCopy, this) != enumC32485OooO00o) {
                        list = arrayList3;
                        C27449o00O0OoO c27449o00O0OoO2 = oooO0OO.f73350OooO0Oo;
                        int size = list.size();
                        this.f102066OooOo0o = null;
                        this.f102065OooOo = null;
                        this.f102068OooOoO0 = null;
                        this.f102069OooOoOO = 4;
                    }
                    return enumC32485OooO00o;
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            list = (List) this.f102068OooOoO0;
            str = this.f102065OooOo;
            oooO0OO = this.f102066OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO22 = oooO0OO.f73350OooO0Oo;
            int size2 = list.size();
            this.f102066OooOo0o = null;
            this.f102065OooOo = null;
            this.f102068OooOoO0 = null;
            this.f102069OooOoOO = 4;
        }
        NoteContent noteContent3 = (NoteContent) objOooOoO0;
        if (noteContent3 != null) {
            List<Page> pages2 = noteContent3.getPages();
            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(pages2, 10));
            Iterator<T> it2 = pages2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((Page) it2.next()).getId());
            }
            this.f102066OooOo0o = oooO0OO;
            this.f102065OooOo = str;
            this.f102068OooOoO0 = noteContent3;
            this.f102067OooOoO = arrayList4;
            this.f102069OooOoOO = 2;
            objOooO0oO = oooO0OO.f73351OooO0o.OooO0oO(str, this);
            if (objOooO0oO != enumC32485OooO00o) {
                noteContent = noteContent3;
                arrayList = arrayList4;
                List list22 = (List) objOooO0oO;
                ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(list22, 10));
                it = list22.iterator();
                while (it.hasNext()) {
                }
                listOoooo00 = oOo000Oo.OooOo.Ooooo00(arrayList, oOo000Oo.OooOo.o0OO00O(arrayList22));
                if (!listOoooo00.isEmpty()) {
                }
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
