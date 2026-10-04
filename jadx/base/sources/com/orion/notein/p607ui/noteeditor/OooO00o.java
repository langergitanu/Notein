package com.orion.notein.p607ui.noteeditor;

import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.noteeditor.OooO0OO;
import com.orion.notein.p607ui.noteeditor.penbar.OooO0O0;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import java.util.ArrayList;
import o0Ooo0oo.C29505o00000O;
import o0Ooo0oo.C29510o00000oO;
import o0Ooo0oo.C29511o00000oo;
import o0Ooo0oo.C29525o0000o0;
import o0Ooo0oo.C29541o000O0Oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements FavoriteToolBox.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f73342OooO00o;

    public OooO00o(NoteEditorContainerFragment noteEditorContainerFragment) {
        this.f73342OooO00o = noteEditorContainerFragment;
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.favorite.FavoriteToolBox.OooO0O0
    public final void OooO00o(FavoritePenVO favoritePenVO) {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f73342OooO00o;
        if (noteEditorContainerFragment.Oooo00O().f73422o00Ooo.f121747OooOo0o.getValue() != OooO0OO.OooO00o.f73441OooOo0o) {
            NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
        }
        OooO0O0 oooO0O0Oooo000 = noteEditorContainerFragment.Oooo000();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0O0Oooo000), oooO0O0Oooo000.f75201o00Ooo, null, new C29541o000O0Oo(oooO0O0Oooo000, favoritePenVO, null), 2);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.favorite.FavoriteToolBox.OooO0O0
    public final void OooO0O0(FavoritePenVO favoritePenVO) {
        OooO0O0 oooO0O0Oooo000 = this.f73342OooO00o.Oooo000();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0O0Oooo000), oooO0O0Oooo000.f75201o00Ooo, null, new C29505o00000O(oooO0O0Oooo000, favoritePenVO, null), 2);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.favorite.FavoriteToolBox.OooO0O0
    public final void OooO0OO(int i) {
        OooO0O0 oooO0O0Oooo000 = this.f73342OooO00o.Oooo000();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0O0Oooo000), oooO0O0Oooo000.f75201o00Ooo, null, new C29511o00000oo(oooO0O0Oooo000, i, null), 2);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.favorite.FavoriteToolBox.OooO0O0
    public final void OooO0Oo(ArrayList arrayList) {
        OooO0O0 oooO0O0Oooo000 = this.f73342OooO00o.Oooo000();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0O0Oooo000);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29525o0000o0(oooO0O0Oooo000, arrayList, null), 2);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.favorite.FavoriteToolBox.OooO0O0
    public final void OooO0o() {
        this.f73342OooO00o.Oooo000().OooOO0o(false);
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.favorite.FavoriteToolBox.OooO0O0
    public final void OooO0o0(float f, float f2) {
        OooO0O0 oooO0O0Oooo000 = this.f73342OooO00o.Oooo000();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0O0Oooo000), oooO0O0Oooo000.f75201o00Ooo, null, new C29510o00000oO(oooO0O0Oooo000, f, f2, null), 2);
    }
}
