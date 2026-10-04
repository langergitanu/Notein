package com.google.firebase.firestore;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.addimage.ImageEditorPanel;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditorPanel;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesAnchorEditor;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesEditorPanel;
import com.orion.notein.p607ui.noteeditor.strokeeditor.StrokesEditorPanel;
import o0O0o0oO.C26029OooOoO;
import o0Oo00oO.C28035OooO00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.google.firebase.firestore.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22609OoooO implements Continuation {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68107OooOo0o;

    public /* synthetic */ C22609OoooO(Object obj) {
        this.f68107OooOo0o = obj;
    }

    public void OooO00o(RectF rectF, PointF pointF) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("NoteEditorFragment");
        c20358OooO00o.OooO00o("NoteEditor,PDFView.OnSelectionDuplicateListener.onDuplicate.", new Object[0]);
        NoteEditorFragment noteEditorFragment = (NoteEditorFragment) this.f68107OooOo0o;
        ShapesEditorPanel shapesEditorPanel = noteEditorFragment.f73025Ooooo0o;
        if (shapesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
            throw null;
        }
        boolean zIsShown = shapesEditorPanel.isShown();
        float f = noteEditorFragment.f73040o00000OO;
        if (zIsShown) {
            ShapesEditorPanel shapesEditorPanel2 = noteEditorFragment.f73025Ooooo0o;
            if (shapesEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("shapesEditorPanel");
                throw null;
            }
            float f2 = pointF.x;
            float f3 = pointF.y;
            ShapesAnchorEditor shapesAnchorEditor = shapesEditorPanel2.f76308OooOoo0;
            if (shapesAnchorEditor == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("anchorEditor");
                throw null;
            }
            C28035OooO00o.OooO0OO(shapesAnchorEditor, f2, f3, f, f);
            PDFView pDFView = noteEditorFragment.f73015OoooO0;
            if (pDFView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            o0O0o0oO.o000oOoO pasteContextMenu = pDFView.getPasteContextMenu();
            if (pasteContextMenu != null) {
                pasteContextMenu.OooO00o((int) rectF.left, (int) rectF.top);
            }
        }
        StrokesEditorPanel strokesEditorPanel = noteEditorFragment.f73024Ooooo00;
        if (strokesEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
            throw null;
        }
        if (strokesEditorPanel.isShown()) {
            StrokesEditorPanel strokesEditorPanel2 = noteEditorFragment.f73024Ooooo00;
            if (strokesEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("strokesEditorPanel");
                throw null;
            }
            int i = (int) f;
            strokesEditorPanel2.onMove(i, i);
            PDFView pDFView2 = noteEditorFragment.f73015OoooO0;
            if (pDFView2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            o0O0o0oO.o000oOoO pasteContextMenu2 = pDFView2.getPasteContextMenu();
            if (pasteContextMenu2 != null) {
                pasteContextMenu2.OooO00o((int) rectF.left, (int) rectF.top);
            }
        }
        ItemsEditorPanel itemsEditorPanel = noteEditorFragment.f73026OooooO0;
        if (itemsEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
            throw null;
        }
        if (itemsEditorPanel.isShown()) {
            ItemsEditorPanel itemsEditorPanel2 = noteEditorFragment.f73026OooooO0;
            if (itemsEditorPanel2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("itemsEditorPanel");
                throw null;
            }
            int i2 = (int) f;
            itemsEditorPanel2.onMove(i2, i2);
            PDFView pDFView3 = noteEditorFragment.f73015OoooO0;
            if (pDFView3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                throw null;
            }
            o0O0o0oO.o000oOoO pasteContextMenu3 = pDFView3.getPasteContextMenu();
            if (pasteContextMenu3 != null) {
                pasteContextMenu3.OooO00o((int) rectF.left, (int) rectF.top);
            }
        }
        PDFView pDFView4 = noteEditorFragment.f73015OoooO0;
        if (pDFView4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        C26029OooOoO imageContextMenu = pDFView4.getImageContextMenu();
        if (imageContextMenu == null || !imageContextMenu.f88886OooO0O0.OooO0o()) {
            return;
        }
        ImageEditorPanel imageEditorPanel = noteEditorFragment.f73023OoooOoo;
        if (imageEditorPanel == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("imageEditorPanel");
            throw null;
        }
        C28035OooO00o.OooO0OO(imageEditorPanel, pointF.x, pointF.y, f, f);
        PDFView pDFView5 = noteEditorFragment.f73015OoooO0;
        if (pDFView5 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
            throw null;
        }
        o0O0o0oO.o000oOoO pasteContextMenu4 = pDFView5.getPasteContextMenu();
        if (pasteContextMenu4 != null) {
            pasteContextMenu4.OooO00o((int) rectF.left, (int) rectF.top);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Query) this.f68107OooOo0o).lambda$get$1(task);
    }
}
