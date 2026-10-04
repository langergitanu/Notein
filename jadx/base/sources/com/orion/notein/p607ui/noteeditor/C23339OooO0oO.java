package com.orion.notein.p607ui.noteeditor;

import android.graphics.Point;
import com.aspose.words.StyleIdentifier;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.penkit.models.ImageInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$dropData$5", m80623f = "NoteEditorFragment.kt", m80624l = {2953}, m80625m = "invokeSuspend")
public final class C23339OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f73498OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Point f73499OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public NoteEditorFragment f73500OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f73501OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Collection f73502OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ImageInfo f73503OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Iterator f73504OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Collection f73505OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f73506OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final /* synthetic */ C23344OooOOo.OooO0OO f73507Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f73508Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ boolean f73509Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23339OooO0oO(C23344OooOOo.OooO0OO oooO0OO, NoteEditorFragment noteEditorFragment, boolean z, Continuation<? super C23339OooO0oO> continuation) {
        super(2, continuation);
        this.f73507Oooo000 = oooO0OO;
        this.f73508Oooo00O = noteEditorFragment;
        this.f73509Oooo00o = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C23339OooO0oO(this.f73507Oooo000, this.f73508Oooo00O, this.f73509Oooo00o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C23339OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e3 -> B:6:0x002c). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        Point point;
        List list;
        String str;
        Iterator it;
        NoteEditorFragment noteEditorFragment;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f73506OooOooo;
        NoteEditorFragment noteEditorFragment2 = this.f73508Oooo00O;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C23344OooOOo.OooO0OO oooO0OO = this.f73507Oooo000;
            Point point2 = oooO0OO.f73624OooO00o;
            Object obj2 = oooO0OO.f73626OooO0OO;
            OooOOO0.OooO0o0(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.orion.penkit.intf.IDisplayItem>");
            List list2 = (List) obj2;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (!(((InterfaceC31284OooO0O0) obj3) instanceof ImageInfo)) {
                    arrayList2.add(obj3);
                }
            }
            String str2 = (String) noteEditorFragment2.OoooOO0().f73589OoooOOo.getValue();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list2) {
                if (obj4 instanceof ImageInfo) {
                    arrayList3.add(obj4);
                }
            }
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
            point = point2;
            list = arrayList2;
            str = str2;
            it = arrayList3.iterator();
            noteEditorFragment = noteEditorFragment2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.f73505OooOooO;
            ImageInfo imageInfo = this.f73503OooOoo;
            it = this.f73504OooOoo0;
            Collection collection = this.f73502OooOoOO;
            NoteEditorFragment noteEditorFragment3 = this.f73500OooOoO;
            str = this.f73501OooOoO0;
            list = this.f73498OooOo;
            point = this.f73499OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            NoteEditorFragment noteEditorFragment4 = noteEditorFragment3;
            ImageInfo imageInfo2 = imageInfo;
            Collection collection2 = collection;
            Object objOooOO0O = obj;
            String str3 = str;
            List list3 = list;
            Point point3 = point;
            arrayList.add(ImageInfo.copy$default(imageInfo2, null, (String) objOooOO0O, null, 0.0f, null, 0L, null, false, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, null));
            arrayList = collection2;
            noteEditorFragment = noteEditorFragment4;
            str = str3;
            list = list3;
            point = point3;
            if (it.hasNext()) {
                ImageInfo imageInfo3 = (ImageInfo) it.next();
                C23344OooOOo c23344OooOOoOoooOO0 = noteEditorFragment.OoooOO0();
                File file = new File(imageInfo3.getUri());
                String id = imageInfo3.getId();
                this.f73499OooOo0o = point;
                this.f73498OooOo = list;
                this.f73501OooOoO0 = str;
                this.f73500OooOoO = noteEditorFragment;
                Collection collection3 = arrayList;
                this.f73502OooOoOO = collection3;
                this.f73504OooOoo0 = it;
                this.f73503OooOoo = imageInfo3;
                this.f73505OooOooO = collection3;
                this.f73506OooOooo = 1;
                objOooOO0O = c23344OooOOoOoooOO0.OooOO0O(file, str, id, this);
                if (objOooOO0O == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                noteEditorFragment4 = noteEditorFragment;
                imageInfo2 = imageInfo3;
                collection2 = arrayList;
                String str32 = str;
                List list32 = list;
                Point point32 = point;
                arrayList.add(ImageInfo.copy$default(imageInfo2, null, (String) objOooOO0O, null, 0.0f, null, 0L, null, false, StyleIdentifier.MEDIUM_GRID_1_ACCENT_6, null));
                arrayList = collection2;
                noteEditorFragment = noteEditorFragment4;
                str = str32;
                list = list32;
                point = point32;
                if (it.hasNext()) {
                    List list4 = (List) arrayList;
                    PDFView pDFView = noteEditorFragment2.f73015OoooO0;
                    if (pDFView != null) {
                        pDFView.Oooo00o(point, OooOo.OooooOO(list4, list), Boolean.valueOf(this.f73509Oooo00o));
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
            }
        }
    }
}
