package o0o0OoOo;

import Oooo0.C20855OooooOO;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.page.Page;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o000OoO.C24536OooO0Oo;
import o0OOo0Oo.InterfaceC27323Oooo0oO;
import o0OOo0o.C27449o00O0OoO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.Oooo0;

/* JADX INFO: renamed from: o0o0OoOo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.viewmodel.DebugViewModel$recoverPage$2", m80623f = "DebugViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, StyleIdentifier.MENTION, 377, 388, 412}, m80625m = "invokeSuspend")
public final class C30744OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Map f109949OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteContent f109950OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C30722OooO00o f109951OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List f109952OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f109953OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object f109954OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Iterator f109955OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f109956OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final /* synthetic */ C30722OooO00o f109957OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ String f109958Oooo000;

    /* JADX INFO: renamed from: o0o0OoOo.OooOo0o$OooO00o */
    public static final class OooO00o<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C24536OooO0Oo.OooO0O0(Long.valueOf(((Page) t).getCreationTime()), Long.valueOf(((Page) t2).getCreationTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30744OooOo0o(C30722OooO00o c30722OooO00o, String str, Continuation<? super C30744OooOo0o> continuation) {
        super(2, continuation);
        this.f109957OooOooo = c30722OooO00o;
        this.f109958Oooo000 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30744OooOo0o(this.f109957OooOooo, this.f109958Oooo000, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30744OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if (r5 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02df, code lost:
    
        if (r12.OoooOOo(r2, r42) != r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0238 A[LOOP:1: B:74:0x0232->B:76:0x0238, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0190 -> B:54:0x0197). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOooOoOO;
        Object objOooOoO0;
        NoteContent noteContent;
        Object objOooOooO;
        boolean z;
        Map linkedHashMap;
        NoteContent noteContent2;
        List listOoooo00;
        NoteContent noteContent3;
        String str;
        Iterator it;
        Map map;
        List list;
        Iterator it2;
        Iterator it3;
        String str2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109956OooOooO;
        String str3 = this.f109958Oooo000;
        C30722OooO00o c30722OooO00o = this.f109957OooOooo;
        C27449o00O0OoO c27449o00O0OoO = c30722OooO00o.f109866OooOO0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f109956OooOooO = 1;
            objOooOoOO = c27449o00O0OoO.OooOoOO(str3, this);
            if (objOooOoOO != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            objOooOoOO = obj;
        } else if (i == 2) {
            C32446OooOOOo.OooO0O0(obj);
            objOooOoO0 = obj;
            noteContent = (NoteContent) objOooOoO0;
            if (noteContent != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("DebugViewModel");
                c20358OooO00o.OooO0OO("recoverPage failed, noteContent is null.", new Object[0]);
                z = false;
                return Boolean.valueOf(z);
            }
            this.f109950OooOo0o = noteContent;
            this.f109956OooOooO = 3;
            objOooOooO = c27449o00O0OoO.OooOooO(str3, this);
        } else if (i == 3) {
            noteContent = this.f109950OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOooO = obj;
            List list2 = (List) objOooOooO;
            int iOooO0Oo = Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list2, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (Object obj2 : list2) {
                linkedHashMap.put(((Page) obj2).getId(), obj2);
            }
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                arrayList.add(((Page) it4.next()).getId());
            }
            List<Page> pages = noteContent.getPages();
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(pages, 10));
            Iterator<T> it5 = pages.iterator();
            while (it5.hasNext()) {
                arrayList2.add(((Page) it5.next()).getId());
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DebugViewModel");
            c20358OooO00o2.OooO0o0(C20855OooooOO.OooO0OO(arrayList.size(), arrayList2.size(), "recoverPage, pageIds size: ", ", pageIdsFromNoteContent size: "), new Object[0]);
            if (!noteContent.getUnboundedNote()) {
                noteContent2 = noteContent;
                listOoooo00 = oOo000Oo.OooOo.Ooooo00(arrayList, oOo000Oo.OooOo.o0OO00O(arrayList2));
                ArrayList arrayList3 = new ArrayList();
                it2 = listOoooo00.iterator();
                while (it2.hasNext()) {
                }
                List listO00O0O = oOo000Oo.OooOo.o00O0O(arrayList3, new OooO00o());
                ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O, 10));
                it3 = listO00O0O.iterator();
                while (it3.hasNext()) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("DebugViewModel");
                c20358OooO00o3.OooO0o0(androidx.core.app.OooO.OooO00o(arrayList4.size(), "recoverPage, sortedAppendPages ", ", ", oOo000Oo.OooOo.o000oOoO(arrayList4, null, null, null, new C30743OooOo0O(0), 31)), new Object[0]);
                NoteContent noteContentCopy = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : oOo000Oo.OooOo.OooooOO(noteContent2.getPages(), arrayList4), (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : null, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent2.extras : null);
                this.f109950OooOo0o = null;
                this.f109949OooOo = null;
                this.f109952OooOoO0 = null;
                this.f109951OooOoO = null;
                this.f109953OooOoOO = null;
                this.f109955OooOoo0 = null;
                this.f109954OooOoo = null;
                this.f109956OooOooO = 5;
            } else {
                if (!arrayList2.isEmpty()) {
                    return Boolean.TRUE;
                }
                noteContent3 = noteContent;
                str = str3;
                it = oOo000Oo.OooOo.Ooooo00(arrayList, oOo000Oo.OooOo.o0OO00O(arrayList2)).iterator();
                map = linkedHashMap;
                list = arrayList2;
                if (!it.hasNext()) {
                }
            }
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                z = true;
                return Boolean.valueOf(z);
            }
            Object obj3 = this.f109954OooOoo;
            it = this.f109955OooOoo0;
            String str4 = this.f109953OooOoOO;
            C30722OooO00o c30722OooO00o2 = this.f109951OooOoO;
            list = this.f109952OooOoO0;
            map = this.f109949OooOo;
            NoteContent noteContent4 = this.f109950OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            NoteContent noteContent5 = noteContent4;
            C30722OooO00o c30722OooO00o3 = c30722OooO00o2;
            Object objOooO = obj;
            if (((Number) objOooO).longValue() <= 0) {
                noteContent3 = noteContent5;
                str2 = (String) obj3;
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("DebugViewModel");
                c20358OooO00o4.OooO0o0("recoverPage, validPage: " + str2 + ". pageIdsFromNoteContent: " + list + ", noteContent: " + noteContent3.getPages(), new Object[0]);
                if (str2 != null) {
                    return Boolean.FALSE;
                }
                listOoooo00 = com.facebook.soloader.OooOo.OooO0oO(str2);
                noteContent2 = noteContent3;
                linkedHashMap = map;
                ArrayList arrayList32 = new ArrayList();
                it2 = listOoooo00.iterator();
                while (it2.hasNext()) {
                    Page page = (Page) linkedHashMap.get((String) it2.next());
                    if (page != null) {
                        arrayList32.add(page);
                    }
                }
                List listO00O0O2 = oOo000Oo.OooOo.o00O0O(arrayList32, new OooO00o());
                ArrayList arrayList42 = new ArrayList(C34428OooOOo.OooOOoo(listO00O0O2, 10));
                it3 = listO00O0O2.iterator();
                while (it3.hasNext()) {
                    arrayList42.add(new Page(((Page) it3.next()).getId(), null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 524286, null));
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("DebugViewModel");
                c20358OooO00o32.OooO0o0(androidx.core.app.OooO.OooO00o(arrayList42.size(), "recoverPage, sortedAppendPages ", ", ", oOo000Oo.OooOo.o000oOoO(arrayList42, null, null, null, new C30743OooOo0O(0), 31)), new Object[0]);
                NoteContent noteContentCopy2 = noteContent2.copy((24571 & 1) != 0 ? noteContent2.id : null, (24571 & 2) != 0 ? noteContent2.defaultPage : null, (24571 & 4) != 0 ? noteContent2.pages : oOo000Oo.OooOo.OooooOO(noteContent2.getPages(), arrayList42), (24571 & 8) != 0 ? noteContent2.pageLayerIds : null, (24571 & 16) != 0 ? noteContent2.outlines : null, (24571 & 32) != 0 ? noteContent2.pdfInfo : null, (24571 & 64) != 0 ? noteContent2.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent2.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent2.zoom : 0.0f, (24571 & 512) != 0 ? noteContent2.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent2.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent2.unboundedNote : false, (24571 & 4096) != 0 ? noteContent2.creationTime : 0L, (24571 & 8192) != 0 ? noteContent2.lastModificationTime : 0L, (24571 & 16384) != 0 ? noteContent2.extras : null);
                this.f109950OooOo0o = null;
                this.f109949OooOo = null;
                this.f109952OooOoO0 = null;
                this.f109951OooOoO = null;
                this.f109953OooOoOO = null;
                this.f109955OooOoo0 = null;
                this.f109954OooOoo = null;
                this.f109956OooOooO = 5;
            } else {
                str = str4;
                c30722OooO00o = c30722OooO00o3;
                noteContent3 = noteContent5;
                if (!it.hasNext()) {
                    Object next = it.next();
                    InterfaceC27323Oooo0oO interfaceC27323Oooo0oO = c30722OooO00o.f109860OooO0o;
                    this.f109950OooOo0o = noteContent3;
                    this.f109949OooOo = map;
                    this.f109952OooOoO0 = list;
                    this.f109951OooOoO = c30722OooO00o;
                    this.f109953OooOoOO = str;
                    this.f109955OooOoo0 = it;
                    this.f109954OooOoo = next;
                    this.f109956OooOooO = 4;
                    objOooO = interfaceC27323Oooo0oO.OooO((String) next, str, this);
                    if (objOooO != enumC32485OooO00o) {
                        C30722OooO00o c30722OooO00o4 = c30722OooO00o;
                        str4 = str;
                        obj3 = next;
                        noteContent5 = noteContent3;
                        c30722OooO00o3 = c30722OooO00o4;
                        if (((Number) objOooO).longValue() <= 0) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                obj3 = null;
                str2 = (String) obj3;
                C34406OooO00o.C20358OooO00o c20358OooO00o42 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o42.OooOOO0("DebugViewModel");
                c20358OooO00o42.OooO0o0("recoverPage, validPage: " + str2 + ". pageIdsFromNoteContent: " + list + ", noteContent: " + noteContent3.getPages(), new Object[0]);
                if (str2 != null) {
                }
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o5.OooOOO0("DebugViewModel");
        c20358OooO00o5.OooO0o0("recoverPage, noteMeta: " + ((NoteMeta) objOooOoOO), new Object[0]);
        this.f109956OooOooO = 2;
        objOooOoO0 = c27449o00O0OoO.OooOoO0(str3, this);
        if (objOooOoO0 != enumC32485OooO00o) {
            noteContent = (NoteContent) objOooOoO0;
            if (noteContent != null) {
            }
        }
        return enumC32485OooO00o;
    }
}
