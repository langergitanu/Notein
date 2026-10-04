package o0OoO0oo;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.aspose.slides.C22212OooOoO0;
import com.aspose.words.StyleIdentifier;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.LassoParams;
import com.orion.penkit.models.TextBoxInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import kotlin.coroutines.Continuation;
import o0O0o0oO.C26017OooO0o;
import o0O0o0oO.C26018OooO0o0;
import o0O0oO0.InterfaceC26092OooO00o;
import o0O0oOO.C26106OooO0O0;
import o0O0oooo.C26395Oooo0o0;
import o0OoOOO0.C29051OooOO0o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoO0oo.o00OOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28869o00OOooO implements InterfaceC26092OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102280OooO00o;

    /* JADX INFO: renamed from: o0OoO0oo.o00OOooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$itemPaster$1$pasteItems$1", m80623f = "NoteEditorFragment.kt", m80624l = {3815}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public String f102281OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Context f102282OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Collection f102283OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public NoteEditorFragment f102284OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public Iterator f102285OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public Collection f102286OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public ImageInfo f102287OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f102288OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public final /* synthetic */ NoteEditorFragment f102289OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public final /* synthetic */ List<InterfaceC31284OooO0O0> f102290Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public final /* synthetic */ C26018OooO0o0 f102291Oooo00O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(NoteEditorFragment noteEditorFragment, List<InterfaceC31284OooO0O0> list, C26018OooO0o0 c26018OooO0o0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f102289OooOooo = noteEditorFragment;
            this.f102290Oooo000 = list;
            this.f102291Oooo00O = c26018OooO0o0;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f102289OooOooo, this.f102290Oooo000, this.f102291Oooo00O, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b9 -> B:6:0x002c). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Context context;
            NoteEditorFragment noteEditorFragment;
            String str;
            Collection arrayList;
            Iterator it;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f102288OooOooO;
            NoteEditorFragment noteEditorFragment2 = this.f102289OooOooo;
            List<InterfaceC31284OooO0O0> list = this.f102290Oooo000;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                Context context2 = noteEditorFragment2.getContext();
                if (context2 == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                String str2 = (String) noteEditorFragment2.OoooOO0().f73589OoooOOo.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof ImageInfo) {
                        arrayList2.add(obj2);
                    }
                }
                context = context2;
                noteEditorFragment = noteEditorFragment2;
                str = str2;
                arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                it = arrayList2.iterator();
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = this.f102286OooOoo;
                ImageInfo imageInfo = this.f102287OooOoo0;
                it = this.f102285OooOoOO;
                Collection collection = this.f102283OooOoO;
                NoteEditorFragment noteEditorFragment3 = this.f102284OooOoO0;
                str = this.f102281OooOo;
                context = this.f102282OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                NoteEditorFragment noteEditorFragment4 = noteEditorFragment3;
                ImageInfo imageInfo2 = imageInfo;
                Collection collection2 = collection;
                Object objOooOO0O = obj;
                String str3 = str;
                Context context3 = context;
                arrayList.add(ImageInfo.copy$default(imageInfo2, null, (String) objOooOO0O, null, 0.0f, null, 0L, null, false, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, null));
                arrayList = collection2;
                noteEditorFragment = noteEditorFragment4;
                str = str3;
                context = context3;
                if (it.hasNext()) {
                    ImageInfo imageInfo3 = (ImageInfo) it.next();
                    File file = new File(imageInfo3.getUri());
                    C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                    String id = imageInfo3.getId();
                    this.f102282OooOo0o = context;
                    this.f102281OooOo = str;
                    this.f102284OooOoO0 = noteEditorFragment;
                    Collection collection3 = arrayList;
                    this.f102283OooOoO = collection3;
                    this.f102285OooOoOO = it;
                    this.f102287OooOoo0 = imageInfo3;
                    this.f102286OooOoo = collection3;
                    this.f102288OooOooO = 1;
                    objOooOO0O = c23344OooOOoOoooOO0.OooOO0O(file, str, id, this);
                    if (objOooOO0O == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    noteEditorFragment4 = noteEditorFragment;
                    imageInfo2 = imageInfo3;
                    collection2 = arrayList;
                    String str32 = str;
                    Context context32 = context;
                    arrayList.add(ImageInfo.copy$default(imageInfo2, null, (String) objOooOO0O, null, 0.0f, null, 0L, null, false, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, null));
                    arrayList = collection2;
                    noteEditorFragment = noteEditorFragment4;
                    str = str32;
                    context = context32;
                    if (it.hasNext()) {
                        List list2 = (List) arrayList;
                        List<InterfaceC31284OooO0O0> list3 = list;
                        ArrayList<TextBoxInfo> arrayList3 = new ArrayList();
                        for (Object obj3 : list3) {
                            if (obj3 instanceof TextBoxInfo) {
                                arrayList3.add(obj3);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                        for (TextBoxInfo textBoxInfoOooO0o : arrayList3) {
                            if (textBoxInfoOooO0o.isPlainText(context)) {
                                C29051OooOO0o c29051OooOO0oOoooOo0 = noteEditorFragment2.OoooOo0();
                                Context contextRequireContext = noteEditorFragment2.requireContext();
                                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                                textBoxInfoOooO0o = c29051OooOO0oOoooOo0.OooO0o(contextRequireContext, textBoxInfoOooO0o.getText());
                            }
                            arrayList4.add(textBoxInfoOooO0o);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : list3) {
                            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj4;
                            if (!(interfaceC31284OooO0O0 instanceof ImageInfo) && !(interfaceC31284OooO0O0 instanceof TextBoxInfo)) {
                                arrayList5.add(obj4);
                            }
                        }
                        C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
                        c32465OooO0O0OooO0Oo.addAll(list2);
                        c32465OooO0O0OooO0Oo.addAll(arrayList4);
                        c32465OooO0O0OooO0Oo.addAll(arrayList5);
                        ArrayList arrayListO0ooOoO = oOo000Oo.OooOo.o0ooOoO(com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo));
                        C26018OooO0o0 c26018OooO0o0 = this.f102291Oooo00O;
                        C26017OooO0o c26017OooO0o = c26018OooO0o0.f88847OooO00o;
                        c26017OooO0o.getClass();
                        List list4 = (List) arrayListO0ooOoO.stream().map(new com.google.android.material.color.utilities.Oooo0(1)).collect(Collectors.toList());
                        final PDFView pDFView = c26017OooO0o.f88845OooO00o;
                        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                        final Point point = c26018OooO0o0.f88848OooO0O0;
                        int iOooOO0o = abstractC22830OooO0Oo.OooOO0o(pDFView.f69176Oooo00o, new PointF(point.x, point.y));
                        C26395Oooo0o0 c26395Oooo0o0 = pDFView.f69170OooOooO.f69109OooO0O0;
                        final Rect rect = c26395Oooo0o0 == null ? new Rect() : c26395Oooo0o0.OooOo00(iOooOO0o);
                        final float f = pDFView.f69170OooOooO.OooOo0o(iOooOO0o, pDFView.getZoom()).f89149OooO00o / pDFView.f69170OooOooO.OooOO0O(iOooOO0o).f89149OooO00o;
                        List list5 = (List) list4.stream().map(new Function() { // from class: o0O0o00.Oooo000
                            @Override // java.util.function.Function
                            public final Object apply(Object obj5) {
                                InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) obj5;
                                int i2 = PDFView.f69162o000o00O;
                                PDFView pDFView2 = pDFView;
                                pDFView2.getClass();
                                InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O02.deepCopy(interfaceC31284OooO0O02.getId());
                                Rect rect2 = rect;
                                interfaceC31284OooO0O0DeepCopy.offset(rect2.left, rect2.top);
                                interfaceC31284OooO0O0DeepCopy.scale(f, pDFView2.getPenWidthScale());
                                return interfaceC31284OooO0O0DeepCopy;
                            }
                        }).collect(Collectors.toList());
                        InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
                        final RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(1.0f, list5);
                        List list6 = rectFOooO00o == null ? Collections.EMPTY_LIST : (List) list5.stream().peek(new Consumer() { // from class: o0O0o00.Oooo00O
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj5) {
                                int i2 = PDFView.f69162o000o00O;
                                float f2 = point.x;
                                RectF rectF = rectFOooO00o;
                                ((InterfaceC31284OooO0O0) obj5).offset(f2 - rectF.left, r0.y - rectF.top);
                            }
                        }).collect(Collectors.toList());
                        RectF rectFOooO00o2 = InterfaceC31284OooO0O0.OooO00o.OooO00o(1.0f, list6);
                        if (pDFView.getClipboardData().f69323OooO0OO) {
                            C26395Oooo0o0 c26395Oooo0o02 = pDFView.f69170OooOooO.f69109OooO0O0;
                            if (c26395Oooo0o02 != null) {
                                c26395Oooo0o02.f90558OooO0oO.OooOo00(null);
                            }
                            C26106OooO0O0.OooO00o(pDFView.getContext());
                        }
                        if (rectFOooO00o2 == null || !c26018OooO0o0.f88849OooO0OO) {
                            pDFView.Oooo00o(point, arrayListO0ooOoO, Boolean.FALSE);
                            pDFView.invalidate();
                            if (pDFView.f69214o00000oo.f88979OooO00o.OooO0o()) {
                                pDFView.f69214o00000oo.f88979OooO00o.setVisibility(8);
                            }
                        } else {
                            pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOoOO(new LassoParams(list6, rectFOooO00o2, null));
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
            }
        }
    }

    public C28869o00OOooO(NoteEditorFragment noteEditorFragment) {
        this.f102280OooO00o = noteEditorFragment;
    }

    @Override // o0O0oO0.InterfaceC26092OooO00o
    public final void OooO00o(Uri uri, Point point) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteEditorFragment");
        c20358OooO00o.OooO00o("imagePaster.onPaste for sys image paste, insertPoint: " + point + ", uri: " + uri + ".", new Object[0]);
        List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(uri);
        float f = (float) point.x;
        float f2 = (float) point.y;
        NoteEditorFragment noteEditorFragment = this.f102280OooO00o;
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new C28879o00Oo0o0(noteEditorFragment, listOooO0oO, f, f2, null), 3);
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView != null) {
            pDFView.OooOo0o();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    @Override // o0O0oO0.InterfaceC26092OooO00o
    public final void OooO0O0(List<InterfaceC31284OooO0O0> items, C26018OooO0o0 c26018OooO0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(items, "items");
        NoteEditorFragment noteEditorFragment = this.f102280OooO00o;
        C33609OooO0oo.OooO0OO(C22212OooOoO0.OooO0O0(noteEditorFragment, "getViewLifecycleOwner(...)"), null, null, new OooO00o(noteEditorFragment, items, c26018OooO0o0, null), 3);
    }
}
