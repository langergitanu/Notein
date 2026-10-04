package com.orion.notein.p607ui.noteeditor;

import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.p607ui.noteeditor.C23344OooOOo;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO;
import com.orion.penkit.models.DrawResult;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o00OO0O0.OooO0O0;
import o0O0oooo.C26395Oooo0o0;
import o0Ooo00o.AbstractC29372OooO00o;
import o0Ooo00o.C29373OooO0O0;
import o0Ooo00o.C29374OooO0OO;
import o0oo000O.OooOO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO implements C23344OooOOo.InterfaceC23345OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f73540OooO00o;

    public OooOOOO(NoteEditorFragment noteEditorFragment) {
        this.f73540OooO00o = noteEditorFragment;
    }

    @Override // com.orion.notein.p607ui.noteeditor.C23344OooOOo.InterfaceC23345OooO0Oo
    public final void OooO00o(AbstractC29372OooO00o op) {
        OooOOO0.OooO0oO(op, "op");
    }

    @Override // com.orion.notein.p607ui.noteeditor.C23344OooOOo.InterfaceC23345OooO0Oo
    public final void OooO0O0(AbstractC29372OooO00o abstractC29372OooO00o) {
        RectF bounds;
        boolean z = abstractC29372OooO00o instanceof C29373OooO0O0;
        NoteEditorFragment noteEditorFragment = this.f73540OooO00o;
        if (!z) {
            if (abstractC29372OooO00o instanceof C29374OooO0OO) {
                OooO0OO oooO0OOO000oOoO = noteEditorFragment.o000oOoO();
                C29374OooO0OO c29374OooO0OO = (C29374OooO0OO) abstractC29372OooO00o;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("PageLayerViewModel");
                c20358OooO00o.OooO0o0("undo. op=" + c29374OooO0OO, new Object[0]);
                int iOrdinal = c29374OooO0OO.f104155OooO0Oo.ordinal();
                PageLayer pageLayer = c29374OooO0OO.f104153OooO0O0;
                if (iOrdinal == 0) {
                    oooO0OOO000oOoO.OooO(pageLayer.getId(), pageLayer.getNoteId(), false);
                    return;
                } else {
                    if (iOrdinal != 1) {
                        return;
                    }
                    oooO0OOO000oOoO.OooO0oo(c29374OooO0OO.f104154OooO0OO, pageLayer, false);
                    return;
                }
            }
            return;
        }
        C29373OooO0O0 c29373OooO0O0 = (C29373OooO0O0) abstractC29372OooO00o;
        DrawResult drawResult = c29373OooO0O0.f104152OooO0Oo;
        List<InterfaceC31284OooO0O0> removeItemList = drawResult.getRemoveItemList();
        List<InterfaceC31284OooO0O0> newItemList = drawResult.getNewItemList();
        String str = (String) noteEditorFragment.OoooOO0().f73589OoooOOo.getValue();
        Fragment fragmentRequireParentFragment = noteEditorFragment.requireParentFragment();
        DrawResult drawResultOooO0oo = null;
        NoteEditorContainerFragment noteEditorContainerFragment = fragmentRequireParentFragment instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) fragmentRequireParentFragment : null;
        if (noteEditorContainerFragment != null) {
            noteEditorContainerFragment.Oooo0O0(str, removeItemList, newItemList);
        }
        PDFView pDFView = noteEditorFragment.f73015OoooO0;
        if (pDFView == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        C26395Oooo0o0 c26395Oooo0o0 = pDFView.f69170OooOooO.f69109OooO0O0;
        int i = c29373OooO0O0.f104150OooO0O0;
        if (c26395Oooo0o0 != null) {
            synchronized (c26395Oooo0o0.f90559OooO0oo) {
                c26395Oooo0o0.OoooOOO(i, drawResult.getRemoveItemList(), drawResult.getNewItemList());
                Page page = c26395Oooo0o0.f90560OooOO0.get(i);
                OooOO0.f111232OooO00o.getClass();
                drawResultOooO0oo = OooOO0.OooO0oo(page, drawResult);
            }
        }
        if (drawResultOooO0oo == null || (bounds = drawResultOooO0oo.getBounds(pDFView.getZoomLevel())) == null) {
            return;
        }
        RectF rectFOooO0Oo = OooO0O0.OooO0Oo(bounds, 0.0f, 0.0f, pDFView.OooOo0O(1, i));
        pDFView.Ooooo00(rectFOooO0Oo, pDFView.f69170OooOooO, i);
        pDFView.OoooOoO(rectFOooO0Oo, pDFView.f69170OooOooO, i);
        pDFView.invalidate();
    }
}
