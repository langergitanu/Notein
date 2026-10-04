package o0OOooO;

import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.penkit.models.LayerInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.OooOOO0;
import o0OOOO0o.C27129OoooOOO;
import o0OOo0Oo.InterfaceC27309OooOoO;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOo0Oo.InterfaceC27318Oooo00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: o0OOooO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27881OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27318Oooo00o f98543OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC27313OooOoo0 f98544OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC27309OooOoO f98545OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27129OoooOOO f98546OooO0Oo;

    public C27881OooOO0O(InterfaceC27318Oooo00o pageLayerRepo, InterfaceC27313OooOoo0 noteMetaRepo, InterfaceC27309OooOoO noteContentRepo, C27129OoooOOO c27129OoooOOO) {
        OooOOO0.OooO0oO(pageLayerRepo, "pageLayerRepo");
        OooOOO0.OooO0oO(noteMetaRepo, "noteMetaRepo");
        OooOOO0.OooO0oO(noteContentRepo, "noteContentRepo");
        this.f98543OooO00o = pageLayerRepo;
        this.f98544OooO0O0 = noteMetaRepo;
        this.f98545OooO0OO = noteContentRepo;
        this.f98546OooO0Oo = c27129OoooOOO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r4.OooO0oO(r1, r2) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27872OooO00o c27872OooO00o;
        String str3;
        C27881OooOO0O c27881OooOO0O;
        if (abstractC32479OooO0OO instanceof C27872OooO00o) {
            c27872OooO00o = (C27872OooO00o) abstractC32479OooO0OO;
            int i = c27872OooO00o.f98502OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27872OooO00o.f98502OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27872OooO00o = new C27872OooO00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27872OooO00o.f98501OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27872OooO00o.f98502OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27872OooO00o.f98499OooOo0o = this;
            c27872OooO00o.f98498OooOo = str;
            c27872OooO00o.f98502OooOoOO = 1;
            Object objOooOO0o = this.f98545OooO0OO.OooOO0o(str2, c27872OooO00o);
            if (objOooOO0o != enumC32485OooO00o) {
                str3 = str;
                obj = objOooOO0o;
                c27881OooOO0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        String str4 = c27872OooO00o.f98498OooOo;
        C27881OooOO0O c27881OooOO0O2 = c27872OooO00o.f98499OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        str3 = str4;
        c27881OooOO0O = c27881OooOO0O2;
        NoteContent noteContent = (NoteContent) obj;
        if (noteContent == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        NoteContent noteContentCopy = noteContent.copy((24571 & 1) != 0 ? noteContent.id : null, (24571 & 2) != 0 ? noteContent.defaultPage : null, (24571 & 4) != 0 ? noteContent.pages : null, (24571 & 8) != 0 ? noteContent.pageLayerIds : null, (24571 & 16) != 0 ? noteContent.outlines : null, (24571 & 32) != 0 ? noteContent.pdfInfo : null, (24571 & 64) != 0 ? noteContent.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent.activatedPageLayerId : str3, (24571 & 256) != 0 ? noteContent.zoom : 0.0f, (24571 & 512) != 0 ? noteContent.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent.unboundedNote : false, (24571 & 4096) != 0 ? noteContent.creationTime : 0L, (24571 & 8192) != 0 ? noteContent.lastModificationTime : System.currentTimeMillis(), (24571 & 16384) != 0 ? noteContent.extras : null);
        InterfaceC27309OooOoO interfaceC27309OooOoO = c27881OooOO0O.f98545OooO0OO;
        c27872OooO00o.f98499OooOo0o = null;
        c27872OooO00o.f98498OooOo = null;
        c27872OooO00o.f98502OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0134, code lost:
    
        if (r6.OooO0oO(r1, r4) == r5) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(int i, String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27873OooO0O0 c27873OooO0O0;
        C27881OooOO0O c27881OooOO0O;
        List list2;
        String str2;
        int i2;
        List list3;
        C27881OooOO0O c27881OooOO0O2;
        NoteContent noteContent;
        String activatedPageLayerId;
        if (abstractC32479OooO0OO instanceof C27873OooO0O0) {
            c27873OooO0O0 = (C27873OooO0O0) abstractC32479OooO0OO;
            int i3 = c27873OooO0O0.f98508OooOoo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c27873OooO0O0.f98508OooOoo = i3 - Integer.MIN_VALUE;
            } else {
                c27873OooO0O0 = new C27873OooO0O0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0o = c27873OooO0O0.f98507OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c27873OooO0O0.f98508OooOoo;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(objOooOO0o);
            if (list.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PageLayerUseCase");
                c20358OooO00o.OooO0o0("addLayers is empty", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            c27873OooO0O0.f98504OooOo0o = this;
            c27873OooO0O0.f98503OooOo = list;
            c27873OooO0O0.f98506OooOoO0 = str;
            c27873OooO0O0.f98505OooOoO = i;
            c27873OooO0O0.f98508OooOoo = 1;
            if (this.f98543OooO00o.OooO0o0(str, list, c27873OooO0O0) != enumC32485OooO00o) {
                c27881OooOO0O = this;
                list2 = list;
                str2 = str;
                i2 = i;
            }
            return enumC32485OooO00o;
        }
        if (i4 == 1) {
            i2 = c27873OooO0O0.f98505OooOoO;
            str2 = c27873OooO0O0.f98506OooOoO0;
            list2 = c27873OooO0O0.f98503OooOo;
            c27881OooOO0O = c27873OooO0O0.f98504OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0o);
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOO0o);
                return C32460OooOooO.f116667OooO00o;
            }
            i2 = c27873OooO0O0.f98505OooOoO;
            list3 = c27873OooO0O0.f98503OooOo;
            c27881OooOO0O2 = c27873OooO0O0.f98504OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOO0o);
            noteContent = (NoteContent) objOooOO0o;
            if (noteContent != null) {
                return C32460OooOooO.f116667OooO00o;
            }
            ArrayList arrayListO0ooOoO = OooOo.o0ooOoO(noteContent.getPageLayerIds());
            int i5 = i2 >= 0 ? i2 : 0;
            int size = arrayListO0ooOoO.size();
            if (i5 > size) {
                i5 = size;
            }
            List list4 = list3;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(((PageLayer) it.next()).getId());
            }
            arrayListO0ooOoO.addAll(i5, arrayList);
            PageLayer pageLayer = (PageLayer) OooOo.Oooo(list3);
            if (pageLayer == null || (activatedPageLayerId = pageLayer.getId()) == null) {
                activatedPageLayerId = noteContent.getActivatedPageLayerId();
            }
            NoteContent noteContentCopy = noteContent.copy((24571 & 1) != 0 ? noteContent.id : null, (24571 & 2) != 0 ? noteContent.defaultPage : null, (24571 & 4) != 0 ? noteContent.pages : null, (24571 & 8) != 0 ? noteContent.pageLayerIds : arrayListO0ooOoO, (24571 & 16) != 0 ? noteContent.outlines : null, (24571 & 32) != 0 ? noteContent.pdfInfo : null, (24571 & 64) != 0 ? noteContent.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent.activatedPageLayerId : activatedPageLayerId, (24571 & 256) != 0 ? noteContent.zoom : 0.0f, (24571 & 512) != 0 ? noteContent.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent.unboundedNote : false, (24571 & 4096) != 0 ? noteContent.creationTime : 0L, (24571 & 8192) != 0 ? noteContent.lastModificationTime : System.currentTimeMillis(), (24571 & 16384) != 0 ? noteContent.extras : null);
            c27873OooO0O0.f98504OooOo0o = null;
            c27873OooO0O0.f98503OooOo = null;
            c27873OooO0O0.f98508OooOoo = 3;
        }
        InterfaceC27309OooOoO interfaceC27309OooOoO = c27881OooOO0O.f98545OooO0OO;
        c27873OooO0O0.f98504OooOo0o = c27881OooOO0O;
        c27873OooO0O0.f98503OooOo = list2;
        c27873OooO0O0.f98506OooOoO0 = null;
        c27873OooO0O0.f98505OooOoO = i2;
        c27873OooO0O0.f98508OooOoo = 2;
        objOooOO0o = interfaceC27309OooOoO.OooOO0o(str2, c27873OooO0O0);
        if (objOooOO0o != enumC32485OooO00o) {
            list3 = list2;
            c27881OooOO0O2 = c27881OooOO0O;
            noteContent = (NoteContent) objOooOO0o;
            if (noteContent != null) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r4.OooO0oO(r1, r2) == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0OO(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27874OooO0OO c27874OooO0OO;
        List list;
        C27881OooOO0O c27881OooOO0O;
        if (abstractC32479OooO0OO instanceof C27874OooO0OO) {
            c27874OooO0OO = (C27874OooO0OO) abstractC32479OooO0OO;
            int i = c27874OooO0OO.f98514OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27874OooO0OO.f98514OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27874OooO0OO = new C27874OooO0OO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27874OooO0OO.f98513OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27874OooO0OO.f98514OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27874OooO0OO.f98511OooOo0o = this;
            c27874OooO0OO.f98510OooOo = arrayList;
            c27874OooO0OO.f98514OooOoOO = 1;
            Object objOooOO0o = this.f98545OooO0OO.OooOO0o(str, c27874OooO0OO);
            if (objOooOO0o != enumC32485OooO00o) {
                list = arrayList;
                obj = objOooOO0o;
                c27881OooOO0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        List list2 = c27874OooO0OO.f98510OooOo;
        C27881OooOO0O c27881OooOO0O2 = c27874OooO0OO.f98511OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        list = list2;
        c27881OooOO0O = c27881OooOO0O2;
        NoteContent noteContent = (NoteContent) obj;
        if (noteContent == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        NoteContent noteContentCopy = noteContent.copy((24571 & 1) != 0 ? noteContent.id : null, (24571 & 2) != 0 ? noteContent.defaultPage : null, (24571 & 4) != 0 ? noteContent.pages : null, (24571 & 8) != 0 ? noteContent.pageLayerIds : list, (24571 & 16) != 0 ? noteContent.outlines : null, (24571 & 32) != 0 ? noteContent.pdfInfo : null, (24571 & 64) != 0 ? noteContent.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent.zoom : 0.0f, (24571 & 512) != 0 ? noteContent.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent.unboundedNote : false, (24571 & 4096) != 0 ? noteContent.creationTime : 0L, (24571 & 8192) != 0 ? noteContent.lastModificationTime : System.currentTimeMillis(), (24571 & 16384) != 0 ? noteContent.extras : null);
        InterfaceC27309OooOoO interfaceC27309OooOoO = c27881OooOO0O.f98545OooO0OO;
        c27874OooO0OO.f98511OooOo0o = null;
        c27874OooO0OO.f98510OooOo = null;
        c27874OooO0OO.f98514OooOoOO = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x017b, code lost:
    
        if (r2.OooO0OO(r5, r1, r3) != r4) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0Oo(PageLayer pageLayer, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27875OooO0Oo c27875OooO0Oo;
        PageLayer pageLayer2;
        Object objOooOO0o;
        C27881OooOO0O c27881OooOO0O;
        NoteContent noteContentCopy;
        PageLayer pageLayer3;
        C27881OooOO0O c27881OooOO0O2;
        boolean z;
        String str2 = str;
        if (abstractC32479OooO0OO instanceof C27875OooO0Oo) {
            c27875OooO0Oo = (C27875OooO0Oo) abstractC32479OooO0OO;
            int i = c27875OooO0Oo.f98520OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27875OooO0Oo.f98520OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27875OooO0Oo = new C27875OooO0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27875OooO0Oo.f98517OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27875OooO0Oo.f98520OooOoo0;
        boolean z2 = true;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27875OooO0Oo.f98516OooOo0o = this;
            pageLayer2 = pageLayer;
            c27875OooO0Oo.f98515OooOo = pageLayer2;
            c27875OooO0Oo.f98518OooOoO0 = str2;
            c27875OooO0Oo.f98520OooOoo0 = 1;
            objOooOO0o = this.f98545OooO0OO.OooOO0o(str2, c27875OooO0Oo);
            if (objOooOO0o != enumC32485OooO00o) {
                c27881OooOO0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str2 = c27875OooO0Oo.f98518OooOoO0;
            PageLayer pageLayer4 = c27875OooO0Oo.f98515OooOo;
            c27881OooOO0O = c27875OooO0Oo.f98516OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOO0o = obj;
            pageLayer2 = pageLayer4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            str2 = c27875OooO0Oo.f98518OooOoO0;
            pageLayer3 = c27875OooO0Oo.f98515OooOo;
            c27881OooOO0O2 = c27875OooO0Oo.f98516OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27318Oooo00o interfaceC27318Oooo00o = c27881OooOO0O2.f98543OooO00o;
            List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(pageLayer3);
            c27875OooO0Oo.f98516OooOo0o = null;
            c27875OooO0Oo.f98515OooOo = null;
            c27875OooO0Oo.f98518OooOoO0 = null;
            c27875OooO0Oo.f98520OooOoo0 = 3;
        }
        NoteContent noteContent = (NoteContent) objOooOO0o;
        if (noteContent == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        List<String> pageLayerIds = noteContent.getPageLayerIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : pageLayerIds) {
            if (!OooOOO0.OooO0O0((String) obj2, pageLayer2.getId())) {
                arrayList.add(obj2);
            }
        }
        if (OooOOO0.OooO0O0(noteContent.getActivatedPageLayerId(), pageLayer2.getId())) {
            Iterator<String> it = pageLayerIds.iterator();
            int i3 = 0;
            while (true) {
                z = z2;
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (OooOOO0.OooO0O0(it.next(), pageLayer2.getId())) {
                    break;
                }
                i3++;
                z2 = z;
            }
            if (i3 == -1) {
                return C32460OooOooO.f116667OooO00o;
            }
            String str3 = (String) OooOo.OoooO00(i3 == pageLayerIds.size() + (-1) ? i3 - 1 : i3 + 1, pageLayerIds);
            boolean z3 = (OooOOO0.OooO0O0(str3, "none") || OooOOO0.OooO0O0(str3, LayerInfo.PAPER_THEME_LAYER_ID) || OooOOO0.OooO0O0(str3, LayerInfo.UNSPECIFIED_LAYER_ID)) ? z : false;
            if (str3 == null || z3) {
                return C32460OooOooO.f116667OooO00o;
            }
            noteContentCopy = noteContent.copy((24571 & 1) != 0 ? noteContent.id : null, (24571 & 2) != 0 ? noteContent.defaultPage : null, (24571 & 4) != 0 ? noteContent.pages : null, (24571 & 8) != 0 ? noteContent.pageLayerIds : arrayList, (24571 & 16) != 0 ? noteContent.outlines : null, (24571 & 32) != 0 ? noteContent.pdfInfo : null, (24571 & 64) != 0 ? noteContent.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent.activatedPageLayerId : str3, (24571 & 256) != 0 ? noteContent.zoom : 0.0f, (24571 & 512) != 0 ? noteContent.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent.unboundedNote : false, (24571 & 4096) != 0 ? noteContent.creationTime : 0L, (24571 & 8192) != 0 ? noteContent.lastModificationTime : System.currentTimeMillis(), (24571 & 16384) != 0 ? noteContent.extras : null);
        } else {
            noteContentCopy = noteContent.copy((24571 & 1) != 0 ? noteContent.id : null, (24571 & 2) != 0 ? noteContent.defaultPage : null, (24571 & 4) != 0 ? noteContent.pages : null, (24571 & 8) != 0 ? noteContent.pageLayerIds : arrayList, (24571 & 16) != 0 ? noteContent.outlines : null, (24571 & 32) != 0 ? noteContent.pdfInfo : null, (24571 & 64) != 0 ? noteContent.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent.activatedPageLayerId : null, (24571 & 256) != 0 ? noteContent.zoom : 0.0f, (24571 & 512) != 0 ? noteContent.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent.unboundedNote : false, (24571 & 4096) != 0 ? noteContent.creationTime : 0L, (24571 & 8192) != 0 ? noteContent.lastModificationTime : System.currentTimeMillis(), (24571 & 16384) != 0 ? noteContent.extras : null);
        }
        c27875OooO0Oo.f98516OooOo0o = c27881OooOO0O;
        c27875OooO0Oo.f98515OooOo = pageLayer2;
        c27875OooO0Oo.f98518OooOoO0 = str2;
        c27875OooO0Oo.f98520OooOoo0 = 2;
        if (c27881OooOO0O.OooO0oO(noteContentCopy, c27875OooO0Oo) != enumC32485OooO00o) {
            pageLayer3 = pageLayer2;
            c27881OooOO0O2 = c27881OooOO0O;
            InterfaceC27318Oooo00o interfaceC27318Oooo00o2 = c27881OooOO0O2.f98543OooO00o;
            List listOooO0oO2 = com.facebook.soloader.OooOo.OooO0oO(pageLayer3);
            c27875OooO0Oo.f98516OooOo0o = null;
            c27875OooO0Oo.f98515OooOo = null;
            c27875OooO0Oo.f98518OooOoO0 = null;
            c27875OooO0Oo.f98520OooOoo0 = 3;
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0268, code lost:
    
        if (r8.OooO0oO(r1, r3) != r4) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137 A[EDGE_INSN: B:111:0x0137->B:49:0x0137 BREAK  A[LOOP:4: B:41:0x010c->B:48:0x0135], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228 A[LOOP:0: B:86:0x0222->B:88:0x0228, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o(PageLayer pageLayer, List list, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27879OooO0oo c27879OooO0oo;
        PageLayer pageLayer2;
        List list2;
        Object objOooOO0o;
        C27881OooOO0O c27881OooOO0O;
        String str2;
        NoteContent noteContent;
        PageLayer pageLayer3;
        List list3;
        C27881OooOO0O c27881OooOO0O2;
        List list4;
        Iterator it;
        String id;
        InterfaceC27318Oooo00o interfaceC27318Oooo00o;
        String id2;
        NoteContent noteContent2;
        List list5;
        C27881OooOO0O c27881OooOO0O3;
        String str3;
        Set set;
        List<PageLayer> list6;
        Iterator it2;
        C32465OooO0O0 c32465OooO0O0OooO0O0;
        InterfaceC27318Oooo00o interfaceC27318Oooo00o2;
        String str4;
        List list7;
        C27881OooOO0O c27881OooOO0O4;
        Iterator it3;
        String str5 = str;
        if (abstractC32479OooO0OO instanceof C27879OooO0oo) {
            c27879OooO0oo = (C27879OooO0oo) abstractC32479OooO0OO;
            int i = c27879OooO0oo.f98539Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27879OooO0oo.f98539Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c27879OooO0oo = new C27879OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27879OooO0oo.f98537OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27879OooO0oo.f98539Oooo000;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27879OooO0oo.f98531OooOo0o = this;
            pageLayer2 = pageLayer;
            c27879OooO0oo.f98530OooOo = pageLayer2;
            list2 = list;
            c27879OooO0oo.f98533OooOoO0 = list2;
            c27879OooO0oo.f98532OooOoO = str5;
            c27879OooO0oo.f98539Oooo000 = 1;
            objOooOO0o = this.f98545OooO0OO.OooOO0o(str5, c27879OooO0oo);
            if (objOooOO0o != enumC32485OooO00o) {
                c27881OooOO0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str5 = (String) c27879OooO0oo.f98532OooOoO;
            list2 = (List) c27879OooO0oo.f98533OooOoO0;
            PageLayer pageLayer4 = (PageLayer) c27879OooO0oo.f98530OooOo;
            c27881OooOO0O = c27879OooO0oo.f98531OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOO0o = obj;
            pageLayer2 = pageLayer4;
        } else {
            if (i2 == 2) {
                noteContent = (NoteContent) c27879OooO0oo.f98534OooOoOO;
                String str6 = (String) c27879OooO0oo.f98532OooOoO;
                list3 = (List) c27879OooO0oo.f98533OooOoO0;
                PageLayer pageLayer5 = (PageLayer) c27879OooO0oo.f98530OooOo;
                C27881OooOO0O c27881OooOO0O5 = c27879OooO0oo.f98531OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str2 = str6;
                c27881OooOO0O2 = c27881OooOO0O5;
                pageLayer3 = pageLayer5;
                List list8 = (List) obj;
                list4 = list3;
                Set setO0OO00O = OooOo.o0OO00O(list4);
                if ((list4 instanceof Collection) || !list4.isEmpty()) {
                    it = list4.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (OooOOO0.OooO0O0((String) it.next(), noteContent.getActivatedPageLayerId())) {
                            if (!OooOOO0.OooO0O0(noteContent.getActivatedPageLayerId(), pageLayer3.getId())) {
                                id = pageLayer3.getId();
                            }
                        }
                    }
                    interfaceC27318Oooo00o = c27881OooOO0O2.f98543OooO00o;
                    id2 = pageLayer3.getId();
                    c27879OooO0oo.f98531OooOo0o = c27881OooOO0O2;
                    c27879OooO0oo.f98530OooOo = pageLayer3;
                    c27879OooO0oo.f98533OooOoO0 = str2;
                    c27879OooO0oo.f98532OooOoO = noteContent;
                    c27879OooO0oo.f98534OooOoOO = list8;
                    c27879OooO0oo.f98536OooOoo0 = setO0OO00O;
                    c27879OooO0oo.f98535OooOoo = id;
                    c27879OooO0oo.f98539Oooo000 = 3;
                    if (interfaceC27318Oooo00o.OooO0oo(list3, id2, str2, c27879OooO0oo) != enumC32485OooO00o) {
                        noteContent2 = noteContent;
                        list5 = list8;
                        c27881OooOO0O3 = c27881OooOO0O2;
                        str3 = id;
                        set = setO0OO00O;
                        list6 = list5;
                        if (list6 instanceof Collection) {
                        }
                        it2 = list6.iterator();
                        while (it2.hasNext()) {
                        }
                        C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                        while (r6.hasNext()) {
                        }
                        c32465OooO0O0OooO0Oo.add(pageLayer3);
                        c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                        interfaceC27318Oooo00o2 = c27881OooOO0O3.f98543OooO00o;
                        c27879OooO0oo.f98531OooOo0o = c27881OooOO0O3;
                        c27879OooO0oo.f98530OooOo = noteContent2;
                        c27879OooO0oo.f98533OooOoO0 = str3;
                        c27879OooO0oo.f98532OooOoO = c32465OooO0O0OooO0O0;
                        c27879OooO0oo.f98534OooOoOO = null;
                        c27879OooO0oo.f98536OooOoo0 = null;
                        c27879OooO0oo.f98535OooOoo = null;
                        c27879OooO0oo.f98539Oooo000 = 4;
                        if (interfaceC27318Oooo00o2.OooOO0o(c32465OooO0O0OooO0O0, str2, c27879OooO0oo) != enumC32485OooO00o) {
                        }
                    }
                    return enumC32485OooO00o;
                }
                id = noteContent.getActivatedPageLayerId();
                interfaceC27318Oooo00o = c27881OooOO0O2.f98543OooO00o;
                id2 = pageLayer3.getId();
                c27879OooO0oo.f98531OooOo0o = c27881OooOO0O2;
                c27879OooO0oo.f98530OooOo = pageLayer3;
                c27879OooO0oo.f98533OooOoO0 = str2;
                c27879OooO0oo.f98532OooOoO = noteContent;
                c27879OooO0oo.f98534OooOoOO = list8;
                c27879OooO0oo.f98536OooOoo0 = setO0OO00O;
                c27879OooO0oo.f98535OooOoo = id;
                c27879OooO0oo.f98539Oooo000 = 3;
                if (interfaceC27318Oooo00o.OooO0oo(list3, id2, str2, c27879OooO0oo) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 == 3) {
                str3 = c27879OooO0oo.f98535OooOoo;
                set = c27879OooO0oo.f98536OooOoo0;
                list5 = (List) c27879OooO0oo.f98534OooOoOO;
                NoteContent noteContent3 = (NoteContent) c27879OooO0oo.f98532OooOoO;
                str2 = (String) c27879OooO0oo.f98533OooOoO0;
                pageLayer3 = (PageLayer) c27879OooO0oo.f98530OooOo;
                c27881OooOO0O3 = c27879OooO0oo.f98531OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteContent2 = noteContent3;
                list6 = list5;
                if ((list6 instanceof Collection) || !list6.isEmpty()) {
                    it2 = list6.iterator();
                    while (it2.hasNext()) {
                        if (OooOOO0.OooO0O0(((PageLayer) it2.next()).getId(), pageLayer3.getId())) {
                            C32465OooO0O0 c32465OooO0O0OooO0Oo2 = com.facebook.soloader.OooOo.OooO0Oo();
                            for (PageLayer pageLayer6 : list6) {
                                if (OooOOO0.OooO0O0(pageLayer6.getId(), pageLayer3.getId())) {
                                    c32465OooO0O0OooO0Oo2.add(pageLayer3);
                                } else if (!set.contains(pageLayer6.getId())) {
                                    c32465OooO0O0OooO0Oo2.add(pageLayer6);
                                }
                            }
                            c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo2);
                            interfaceC27318Oooo00o2 = c27881OooOO0O3.f98543OooO00o;
                            c27879OooO0oo.f98531OooOo0o = c27881OooOO0O3;
                            c27879OooO0oo.f98530OooOo = noteContent2;
                            c27879OooO0oo.f98533OooOoO0 = str3;
                            c27879OooO0oo.f98532OooOoO = c32465OooO0O0OooO0O0;
                            c27879OooO0oo.f98534OooOoOO = null;
                            c27879OooO0oo.f98536OooOoo0 = null;
                            c27879OooO0oo.f98535OooOoo = null;
                            c27879OooO0oo.f98539Oooo000 = 4;
                            if (interfaceC27318Oooo00o2.OooOO0o(c32465OooO0O0OooO0O0, str2, c27879OooO0oo) != enumC32485OooO00o) {
                                str4 = str3;
                                list7 = c32465OooO0O0OooO0O0;
                                c27881OooOO0O4 = c27881OooOO0O3;
                                NoteContent noteContent4 = noteContent2;
                                List list9 = list7;
                                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list9, 10));
                                it3 = list9.iterator();
                                while (it3.hasNext()) {
                                }
                                NoteContent noteContentCopy = noteContent4.copy((24571 & 1) != 0 ? noteContent4.id : null, (24571 & 2) != 0 ? noteContent4.defaultPage : null, (24571 & 4) != 0 ? noteContent4.pages : null, (24571 & 8) != 0 ? noteContent4.pageLayerIds : arrayList, (24571 & 16) != 0 ? noteContent4.outlines : null, (24571 & 32) != 0 ? noteContent4.pdfInfo : null, (24571 & 64) != 0 ? noteContent4.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent4.activatedPageLayerId : str4, (24571 & 256) != 0 ? noteContent4.zoom : 0.0f, (24571 & 512) != 0 ? noteContent4.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent4.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent4.unboundedNote : false, (24571 & 4096) != 0 ? noteContent4.creationTime : 0L, (24571 & 8192) != 0 ? noteContent4.lastModificationTime : System.currentTimeMillis(), (24571 & 16384) != 0 ? noteContent4.extras : null);
                                c27879OooO0oo.f98531OooOo0o = null;
                                c27879OooO0oo.f98530OooOo = null;
                                c27879OooO0oo.f98533OooOoO0 = null;
                                c27879OooO0oo.f98532OooOoO = null;
                                c27879OooO0oo.f98539Oooo000 = 5;
                            }
                            return enumC32485OooO00o;
                        }
                    }
                }
                C32465OooO0O0 c32465OooO0O0OooO0Oo3 = com.facebook.soloader.OooOo.OooO0Oo();
                for (PageLayer pageLayer7 : list6) {
                    if (!set.contains(pageLayer7.getId())) {
                        c32465OooO0O0OooO0Oo3.add(pageLayer7);
                    }
                }
                c32465OooO0O0OooO0Oo3.add(pageLayer3);
                c32465OooO0O0OooO0O0 = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo3);
                interfaceC27318Oooo00o2 = c27881OooOO0O3.f98543OooO00o;
                c27879OooO0oo.f98531OooOo0o = c27881OooOO0O3;
                c27879OooO0oo.f98530OooOo = noteContent2;
                c27879OooO0oo.f98533OooOoO0 = str3;
                c27879OooO0oo.f98532OooOoO = c32465OooO0O0OooO0O0;
                c27879OooO0oo.f98534OooOoOO = null;
                c27879OooO0oo.f98536OooOoo0 = null;
                c27879OooO0oo.f98535OooOoo = null;
                c27879OooO0oo.f98539Oooo000 = 4;
                if (interfaceC27318Oooo00o2.OooOO0o(c32465OooO0O0OooO0O0, str2, c27879OooO0oo) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            list7 = (List) c27879OooO0oo.f98532OooOoO;
            String str7 = (String) c27879OooO0oo.f98533OooOoO0;
            noteContent2 = (NoteContent) c27879OooO0oo.f98530OooOo;
            c27881OooOO0O4 = c27879OooO0oo.f98531OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str4 = str7;
            NoteContent noteContent42 = noteContent2;
            List list92 = list7;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list92, 10));
            it3 = list92.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((PageLayer) it3.next()).getId());
            }
            NoteContent noteContentCopy2 = noteContent42.copy((24571 & 1) != 0 ? noteContent42.id : null, (24571 & 2) != 0 ? noteContent42.defaultPage : null, (24571 & 4) != 0 ? noteContent42.pages : null, (24571 & 8) != 0 ? noteContent42.pageLayerIds : arrayList2, (24571 & 16) != 0 ? noteContent42.outlines : null, (24571 & 32) != 0 ? noteContent42.pdfInfo : null, (24571 & 64) != 0 ? noteContent42.savedPageIndex : 0, (24571 & 128) != 0 ? noteContent42.activatedPageLayerId : str4, (24571 & 256) != 0 ? noteContent42.zoom : 0.0f, (24571 & 512) != 0 ? noteContent42.unboundedPageOffsetX : 0.0f, (24571 & 1024) != 0 ? noteContent42.unboundedPageOffsetY : 0.0f, (24571 & 2048) != 0 ? noteContent42.unboundedNote : false, (24571 & 4096) != 0 ? noteContent42.creationTime : 0L, (24571 & 8192) != 0 ? noteContent42.lastModificationTime : System.currentTimeMillis(), (24571 & 16384) != 0 ? noteContent42.extras : null);
            c27879OooO0oo.f98531OooOo0o = null;
            c27879OooO0oo.f98530OooOo = null;
            c27879OooO0oo.f98533OooOoO0 = null;
            c27879OooO0oo.f98532OooOoO = null;
            c27879OooO0oo.f98539Oooo000 = 5;
        }
        NoteContent noteContent5 = (NoteContent) objOooOO0o;
        if (noteContent5 == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        List<String> pageLayerIds = noteContent5.getPageLayerIds();
        c27879OooO0oo.f98531OooOo0o = c27881OooOO0O;
        c27879OooO0oo.f98530OooOo = pageLayer2;
        c27879OooO0oo.f98533OooOoO0 = list2;
        c27879OooO0oo.f98532OooOoO = str5;
        c27879OooO0oo.f98534OooOoOO = noteContent5;
        c27879OooO0oo.f98539Oooo000 = 2;
        Object objOooO0o0 = c27881OooOO0O.OooO0o0(str5, pageLayerIds, c27879OooO0oo);
        if (objOooO0o0 != enumC32485OooO00o) {
            str2 = str5;
            noteContent = noteContent5;
            C27881OooOO0O c27881OooOO0O6 = c27881OooOO0O;
            pageLayer3 = pageLayer2;
            obj = objOooO0o0;
            list3 = list2;
            c27881OooOO0O2 = c27881OooOO0O6;
            List list82 = (List) obj;
            list4 = list3;
            Set setO0OO00O2 = OooOo.o0OO00O(list4);
            if (list4 instanceof Collection) {
            }
            it = list4.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            interfaceC27318Oooo00o = c27881OooOO0O2.f98543OooO00o;
            id2 = pageLayer3.getId();
            c27879OooO0oo.f98531OooOo0o = c27881OooOO0O2;
            c27879OooO0oo.f98530OooOo = pageLayer3;
            c27879OooO0oo.f98533OooOoO0 = str2;
            c27879OooO0oo.f98532OooOoO = noteContent;
            c27879OooO0oo.f98534OooOoOO = list82;
            c27879OooO0oo.f98536OooOoo0 = setO0OO00O2;
            c27879OooO0oo.f98535OooOoo = id;
            c27879OooO0oo.f98539Oooo000 = 3;
            if (interfaceC27318Oooo00o.OooO0oo(list3, id2, str2, c27879OooO0oo) != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0o0(String str, List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27878OooO0oO c27878OooO0oO;
        if (abstractC32479OooO0OO instanceof C27878OooO0oO) {
            c27878OooO0oO = (C27878OooO0oO) abstractC32479OooO0OO;
            int i = c27878OooO0oO.f98528OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27878OooO0oO.f98528OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27878OooO0oO = new C27878OooO0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO0 = c27878OooO0oO.f98526OooOo;
        Object obj = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27878OooO0oO.f98528OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO0);
            c27878OooO0oO.f98527OooOo0o = list;
            c27878OooO0oO.f98528OooOoO = 1;
            objOooOOO0 = this.f98543OooO00o.OooOOO0(str, list, c27878OooO0oO);
            if (objOooOOO0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = c27878OooO0oO.f98527OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO0);
        }
        return OooOo.o00O0O((Iterable) objOooOOO0, new C27876OooO0o(list));
    }

    public final Object OooO0oO(NoteContent noteContent, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27871OooO(this, noteContent, null), abstractC32479OooO0OO);
        return objOooO0o == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }
}
