package o0OoO0oo;

import android.content.Context;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import com.orion.notein.domain.models.page.Image;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.DualLinkSourceInfo;
import com.orion.penkit.models.HyperLinkInfo;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TextBoxInfo;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0O0oooo.C26395Oooo0o0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0OoO0oo.o00Oo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$insertDualLinkRef$1", m80623f = "NoteEditorFragment.kt", m80624l = {2507, 2546}, m80625m = "invokeSuspend")
public final class C28874o00Oo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f102309OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Image f102310OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102311OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ DualLinkRef f102312OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28874o00Oo00o(DualLinkRef dualLinkRef, NoteEditorFragment noteEditorFragment, Continuation<? super C28874o00Oo00o> continuation) {
        super(2, continuation);
        this.f102312OooOoO0 = dualLinkRef;
        this.f102311OooOoO = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28874o00Oo00o(this.f102312OooOoO0, this.f102311OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28874o00Oo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0358, code lost:
    
        if (oO00ooO.C32460OooOooO.f116667OooO00o == r0) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c0  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Image item;
        Object objOooOO0O;
        Object obj2;
        C26395Oooo0o0 c26395Oooo0o0;
        List<HyperLinkInfo> list;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        Object next9;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102309OooOo;
        NoteEditorFragment noteEditorFragment = this.f102311OooOoO;
        DualLinkRef dualLinkRef = this.f102312OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            item = dualLinkRef.getItem();
            if (item == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteEditorFragment");
                c20358OooO00o.OooO0OO("insertDualLinkRef failed, ref.image is null", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            File file = new File(item.getUri());
            if (!file.exists()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NoteEditorFragment");
                c20358OooO00o2.OooO0OO("insertDualLinkRef failed, ref.image file is not existed.", new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
            String noteId = dualLinkRef.getNoteId();
            String str = item.id;
            this.f102310OooOo0o = item;
            this.f102309OooOo = 1;
            objOooOO0O = c23344OooOOoOoooOO0.OooOO0O(file, noteId, str, this);
            if (objOooOO0O != enumC32485OooO00o) {
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
        item = this.f102310OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0O = obj;
        dualLinkRef.setItem(Image.copy$default(item, null, null, (String) objOooOO0O, null, null, 0.0f, 0L, 0L, false, 507, null));
        Context contextRequireContext = noteEditorFragment.requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        InterfaceC31284OooO0O0 displayItem = dualLinkRef.toDisplayItem(contextRequireContext);
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        pDFView.OooOO0O(C34434OooOoO.f123453OooOo0o, com.facebook.soloader.OooOo.OooO0oO(displayItem), noteEditorFragment.f73063oo000o);
        PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
        if (pDFView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        Integer num = pDFView2.f69170OooOooO.OooOOOo(dualLinkRef.getBounds()).second;
        PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
        if (pDFView3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        kotlin.jvm.internal.OooOOO0.OooO0Oo(num);
        String itemId = dualLinkRef.getId();
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView3.f69170OooOooO;
        if (abstractC22830OooO0Oo == null || (c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0) == null) {
            obj2 = null;
        } else {
            kotlin.jvm.internal.OooOOO0.OooO0oO(itemId, "itemId");
            synchronized (c26395Oooo0o0.f90559OooO0oo) {
                try {
                    if (DualLinkRefInfo.class.equals(DrawRecord.class)) {
                        List<DrawRecord> list2 = c26395Oooo0o0.f90564OooOOO0.get(num);
                        if (list2 != null) {
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next9 = null;
                                    break;
                                }
                                next9 = it.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DrawRecord) next9).getId(), itemId)) {
                                    break;
                                }
                            }
                            obj2 = (DrawRecord) next9;
                        } else {
                            obj2 = null;
                        }
                    } else if (DualLinkRefInfo.class.equals(InkStrokeInfo.class)) {
                        List<InkStrokeInfo> list3 = c26395Oooo0o0.f90563OooOOO.get(num);
                        if (list3 != null) {
                            Iterator<T> it2 = list3.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    next8 = null;
                                    break;
                                }
                                next8 = it2.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InkStrokeInfo) next8).getId(), itemId)) {
                                    break;
                                }
                            }
                            obj2 = (InkStrokeInfo) next8;
                        }
                    } else if (DualLinkRefInfo.class.equals(TextBoxInfo.class)) {
                        List<TextBoxInfo> list4 = c26395Oooo0o0.f90567OooOOo.get(num);
                        if (list4 != null) {
                            Iterator<T> it3 = list4.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next7 = null;
                                    break;
                                }
                                next7 = it3.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((TextBoxInfo) next7).getId(), itemId)) {
                                    break;
                                }
                            }
                            obj2 = (TextBoxInfo) next7;
                        }
                    } else if (DualLinkRefInfo.class.equals(ImageInfo.class)) {
                        List<ImageInfo> list5 = c26395Oooo0o0.f90566OooOOOo.get(num);
                        if (list5 != null) {
                            Iterator<T> it4 = list5.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next6 = null;
                                    break;
                                }
                                next6 = it4.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ImageInfo) next6).getId(), itemId)) {
                                    break;
                                }
                            }
                            obj2 = (ImageInfo) next6;
                        }
                    } else if (DualLinkRefInfo.class.equals(QuoteInfo.class)) {
                        List<QuoteInfo> list6 = c26395Oooo0o0.f90568OooOOo0.get(num);
                        if (list6 != null) {
                            Iterator<T> it5 = list6.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    next5 = null;
                                    break;
                                }
                                next5 = it5.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((QuoteInfo) next5).getId(), itemId)) {
                                    break;
                                }
                            }
                            obj2 = (QuoteInfo) next5;
                        }
                    } else if (DualLinkRefInfo.class.equals(ShapeInfo.class)) {
                        List<ShapeInfo> list7 = c26395Oooo0o0.f90565OooOOOO.get(num);
                        if (list7 != null) {
                            Iterator<T> it6 = list7.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    next4 = null;
                                    break;
                                }
                                next4 = it6.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((ShapeInfo) next4).getId(), itemId)) {
                                    break;
                                }
                            }
                            obj2 = (ShapeInfo) next4;
                        }
                    } else if (DualLinkRefInfo.class.equals(DualLinkRefInfo.class)) {
                        List<DualLinkRefInfo> list8 = c26395Oooo0o0.f90572OooOo00.get(num);
                        if (list8 != null) {
                            Iterator<T> it7 = list8.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it7.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkRefInfo) next3).getId(), itemId)) {
                                    break;
                                }
                            }
                            obj2 = (DualLinkRefInfo) next3;
                        }
                    } else if (DualLinkRefInfo.class.equals(DualLinkSourceInfo.class)) {
                        List<DualLinkSourceInfo> list9 = c26395Oooo0o0.f90569OooOOoo.get(num);
                        if (list9 != null) {
                            Iterator<T> it8 = list9.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it8.next();
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((DualLinkSourceInfo) next2).getId(), itemId)) {
                                    break;
                                }
                            }
                            obj2 = (DualLinkSourceInfo) next2;
                        }
                    } else if (DualLinkRefInfo.class.equals(HyperLinkInfo.class) && (list = c26395Oooo0o0.f90571OooOo0.get(num)) != null) {
                        Iterator<T> it9 = list.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it9.next();
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((HyperLinkInfo) next).getId(), itemId)) {
                                break;
                            }
                        }
                        obj2 = (HyperLinkInfo) next;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        DualLinkRefInfo dualLinkRefInfo = obj2 instanceof DualLinkRefInfo ? (DualLinkRefInfo) obj2 : null;
        if (dualLinkRefInfo == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("NoteEditorFragment");
            c20358OooO00o3.OooO0OO("insertDualLinkRef failed, cannot find the inserted ref in pdfView.", new Object[0]);
            return C32460OooOooO.f116667OooO00o;
        }
        dualLinkRef.getBounds().set(dualLinkRefInfo.getItem().getBoundingBox(1.0f));
        Image item2 = dualLinkRef.getItem();
        InterfaceC31284OooO0O0 item3 = dualLinkRefInfo.getItem();
        ImageInfo imageInfo = item3 instanceof ImageInfo ? (ImageInfo) item3 : null;
        if (item2 != null && imageInfo != null) {
            dualLinkRef.setItem(Image.copy$default(item2, null, null, null, null, imageInfo.getBounds(), imageInfo.getRotation(), 0L, 0L, false, 463, null));
        }
        C23344OooOOo c23344OooOOoOoooOO02 = noteEditorFragment.OoooOO0();
        DualLinkSource source = dualLinkRef.getSource();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(source);
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c23344OooOOoOoooOO02);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C28916o00o00oO(c23344OooOOoOoooOO02, source, dualLinkRef, null), 2);
        C33781o00o0O c33781o00o0O = noteEditorFragment.f73061o0ooOOo;
        C32443OooOOO c32443OooOOO = new C32443OooOOO(dualLinkRef.getPageId(), new Long(System.currentTimeMillis()));
        this.f102310OooOo0o = null;
        this.f102309OooOo = 2;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, c32443OooOOO);
    }
}
