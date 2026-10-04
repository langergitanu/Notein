package com.orion.notein.p607ui.noteeditor.pagelayereditor;

import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO;
import com.orion.penkit.models.LayerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOooO.C27881OooOO0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.pagelayereditor.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerViewModel$resetNoteActivatedPageLayer$1", m80623f = "PageLayerViewModel.kt", m80624l = {721, 725, 730, 744, 746, 758, 759, 761, 765}, m80625m = "invokeSuspend")
public final class C23444OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f74857OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f74858OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f74859OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f74860OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f74861OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23444OooO0o0(OooO0OO oooO0OO, String str, Continuation<? super C23444OooO0o0> continuation) {
        super(2, continuation);
        this.f74859OooOoO = oooO0OO;
        this.f74861OooOoOO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23444OooO0o0(this.f74859OooOoO, this.f74861OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23444OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        if (com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO.OooO0o0(r2, r1, r8, r14) == r0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0166, code lost:
    
        if (r15 == r0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016a, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0190, code lost:
    
        if (r15 == r0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0220, code lost:
    
        if (r1.emit(r2, r14) == r0) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[LOOP:1: B:25:0x009b->B:27:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fc A[PHI: r15
      0x01fc: PHI (r15v42 java.lang.Object) = (r15v41 java.lang.Object), (r15v0 java.lang.Object) binds: [B:91:0x01f9, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020f  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NoteContent noteContent;
        ArrayList arrayList;
        Iterator it;
        String activatedPageLayerId;
        Object next;
        Object next2;
        PageLayer pageLayer;
        Object next3;
        List list;
        ListIterator listIterator;
        C32465OooO0O0.C20232OooO0O0 c20232OooO0O0;
        PageLayer pageLayer2;
        List list2;
        List list3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f74860OooOoO0;
        OooO0OO oooO0OO = this.f74859OooOoO;
        String str = this.f74861OooOoOO;
        C27881OooOO0O c27881OooOO0O = oooO0OO.f74774OooO0o0;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                this.f74860OooOoO0 = 1;
                obj = oooO0OO.f74772OooO0Oo.OooOoO0(str, this);
                if (obj != enumC32485OooO00o) {
                    noteContent = (NoteContent) obj;
                    if (noteContent != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("PageLayerViewModel");
                        c20358OooO00o.OooO0OO("resetNoteActivatedPageLayer. note is null", new Object[0]);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    this.f74858OooOo0o = noteContent;
                    this.f74860OooOoO0 = 2;
                    obj = c27881OooOO0O.f98543OooO00o.OooOO0(str, this);
                    if (obj != enumC32485OooO00o) {
                        List list4 = (List) obj;
                        arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                        it = list4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PageLayer) it.next()).getId());
                        }
                        activatedPageLayerId = noteContent.getActivatedPageLayerId();
                        if (!arrayList.contains(activatedPageLayerId)) {
                            this.f74858OooOo0o = null;
                            this.f74860OooOoO0 = 3;
                        } else {
                            if (arrayList.contains("default")) {
                                Iterator it2 = list4.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next3 = it2.next();
                                        if (OooOOO0.OooO0O0(((PageLayer) next3).getId(), "default")) {
                                        }
                                    } else {
                                        next3 = null;
                                    }
                                }
                                OooOOO0.OooO0Oo(next3);
                                pageLayer = (PageLayer) next3;
                                list = arrayList;
                            } else {
                                List<PageLayer> defaultPageLayers = PageLayer.INSTANCE.getDefaultPageLayers(str);
                                Iterator<T> it3 = defaultPageLayers.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        if (OooOOO0.OooO0O0(((PageLayer) next).getId(), LayerInfo.PAPER_THEME_LAYER_ID)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                OooOOO0.OooO0Oo(next);
                                PageLayer pageLayer3 = (PageLayer) next;
                                Iterator<T> it4 = defaultPageLayers.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next2 = it4.next();
                                        if (OooOOO0.OooO0O0(((PageLayer) next2).getId(), "default")) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                OooOOO0.OooO0Oo(next2);
                                pageLayer = (PageLayer) next2;
                                if (!arrayList.contains(pageLayer3.getId())) {
                                    this.f74858OooOo0o = arrayList;
                                    this.f74857OooOo = pageLayer;
                                    this.f74860OooOoO0 = 4;
                                    c27881OooOO0O.getClass();
                                    Object objOooO0O0 = c27881OooOO0O.OooO0O0(0, str, OooOo.OooO0oO(pageLayer3), this);
                                    if (objOooO0O0 != EnumC32485OooO00o.f116726OooOo0o) {
                                        objOooO0O0 = C32460OooOooO.f116667OooO00o;
                                    }
                                } else {
                                    boolean zContains = arrayList.contains(pageLayer.getId());
                                    list = arrayList;
                                    if (!zContains) {
                                        this.f74858OooOo0o = arrayList;
                                        this.f74857OooOo = pageLayer;
                                        this.f74860OooOoO0 = 5;
                                        c27881OooOO0O.getClass();
                                        Object objOooO0O02 = c27881OooOO0O.OooO0O0(1, str, OooOo.OooO0oO(pageLayer), this);
                                        if (objOooO0O02 != EnumC32485OooO00o.f116726OooOo0o) {
                                            objOooO0O02 = C32460OooOooO.f116667OooO00o;
                                        }
                                    }
                                }
                                list = list;
                            }
                            C32465OooO0O0 c32465OooO0O0OooO0Oo = OooOo.OooO0Oo();
                            c32465OooO0O0OooO0Oo.addAll(list);
                            c32465OooO0O0OooO0Oo.add(pageLayer.getId());
                            C32465OooO0O0 c32465OooO0O0OooO0O0 = OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
                            ArrayList arrayList2 = new ArrayList();
                            listIterator = c32465OooO0O0OooO0O0.listIterator(0);
                            while (true) {
                                c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                                if (c20232OooO0O0.hasNext()) {
                                    List listOooo0 = oOo000Oo.OooOo.Oooo0(arrayList2);
                                    String id = pageLayer.getId();
                                    this.f74858OooOo0o = pageLayer;
                                    this.f74857OooOo = listOooo0;
                                    this.f74860OooOoO0 = 6;
                                    if (c27881OooOO0O.OooO00o(id, str, this) != enumC32485OooO00o) {
                                        pageLayer2 = pageLayer;
                                        list2 = listOooo0;
                                        this.f74858OooOo0o = null;
                                        this.f74857OooOo = null;
                                        this.f74860OooOoO0 = 7;
                                        if (c27881OooOO0O.OooO0o(pageLayer2, list2, str, this) != enumC32485OooO00o) {
                                            this.f74860OooOoO0 = 8;
                                            obj = oooO0OO.OooOO0O(str, this);
                                            if (obj != enumC32485OooO00o) {
                                                list3 = (List) obj;
                                                if (list3 != null) {
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o2.OooOOO0("PageLayerViewModel");
                                                    c20358OooO00o2.OooO0OO("resetNoteActivatedPageLayer. layerInfos is null", new Object[0]);
                                                    return C32460OooOooO.f116667OooO00o;
                                                }
                                                C33772OooooOo c33772OooooOo = oooO0OO.f74776OooO0oo;
                                                OooO0OO.C19307OooO0OO c19307OooO0OO = new OooO0OO.C19307OooO0OO(list3, OooO0OO.OooO00o.f74799OooOoO0);
                                                this.f74860OooOoO0 = 9;
                                            }
                                        }
                                    }
                                    break;
                                } else {
                                    Object next4 = c20232OooO0O0.next();
                                    if (!OooOOO0.OooO0O0((String) next4, LayerInfo.PAPER_THEME_LAYER_ID)) {
                                        arrayList2.add(next4);
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
                noteContent = (NoteContent) obj;
                if (noteContent != null) {
                }
                break;
            case 2:
                noteContent = (NoteContent) this.f74858OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List list42 = (List) obj;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(list42, 10));
                it = list42.iterator();
                while (it.hasNext()) {
                }
                activatedPageLayerId = noteContent.getActivatedPageLayerId();
                if (!arrayList.contains(activatedPageLayerId)) {
                }
                return enumC32485OooO00o;
            case 3:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 4:
            case 5:
                pageLayer = (PageLayer) this.f74857OooOo;
                List list5 = (List) this.f74858OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                List list6 = list5;
                list = list6;
                C32465OooO0O0 c32465OooO0O0OooO0Oo2 = OooOo.OooO0Oo();
                c32465OooO0O0OooO0Oo2.addAll(list);
                c32465OooO0O0OooO0Oo2.add(pageLayer.getId());
                C32465OooO0O0 c32465OooO0O0OooO0O02 = OooOo.OooO0O0(c32465OooO0O0OooO0Oo2);
                ArrayList arrayList22 = new ArrayList();
                listIterator = c32465OooO0O0OooO0O02.listIterator(0);
                while (true) {
                    c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                    if (c20232OooO0O0.hasNext()) {
                    }
                }
                break;
            case 6:
                list2 = (List) this.f74857OooOo;
                pageLayer2 = (PageLayer) this.f74858OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                this.f74858OooOo0o = null;
                this.f74857OooOo = null;
                this.f74860OooOoO0 = 7;
                if (c27881OooOO0O.OooO0o(pageLayer2, list2, str, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                this.f74860OooOoO0 = 8;
                obj = oooO0OO.OooOO0O(str, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                C32446OooOOOo.OooO0O0(obj);
                list3 = (List) obj;
                if (list3 != null) {
                }
                break;
            case 9:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
