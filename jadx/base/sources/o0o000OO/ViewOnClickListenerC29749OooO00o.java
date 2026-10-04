package o0o000OO;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.backup.BackupFragment;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoTextEditor;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment;
import com.orion.notein.p607ui.stickers.creation.StickerCollectionCreationFragment;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C29993OooOOOo;
import o0oOOooo.C30906OooO0oo;
import o0oOoOo.C31078OoooOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0o000OO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29749OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f105508OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105509OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29749OooO00o(Object obj, int i) {
        this.f105509OooOo0o = i;
        this.f105508OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PenBox.OooO00o oooO00o;
        Object obj = this.f105508OooOo;
        switch (this.f105509OooOo0o) {
            case 0:
                int i = TextAnnoTextEditor.f76394OoooO0O;
                OooOO0O oooOO0O = (OooOO0O) obj;
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooOO0O), null, null, new C29756OooOOOo(null, oooOO0O), 3);
                break;
            case 1:
                C29993OooOOOo c29993OooOOOo = (C29993OooOOOo) obj;
                c29993OooOOOo.OooO0OO(DrawToolFactory.ERASER_TYPE_PIXEL);
                C29936OooO0oO c29936OooO0oO = c29993OooOOOo.f106559Oooo0;
                if (c29936OooO0oO != null && (oooO00o = c29936OooO0oO.f106287OooO0o0) != null) {
                    oooO00o.OooO0O0(DrawToolFactory.ERASER_TYPE_PIXEL);
                    break;
                }
                break;
            case 2:
                FavoriteListFragment favoriteListFragment = (FavoriteListFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner = favoriteListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new FavoriteListFragment.OooO0OO(view, favoriteListFragment, null), 3);
                break;
            case 3:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.StickerPreviewVO");
                C30906OooO0oo c30906OooO0ooOooOoo0 = ((StickerCollectionCreationFragment) obj).OooOoo0();
                Uri uri = ((C31078OoooOo0) tag).f110914OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
                C33781o00o0O c33781o00o0O = c30906OooO0ooOooOoo0.f110473OooO0oO;
                c33781o00o0O.OooOO0(null, oOo000Oo.OooOo.OoooOoo((List) c33781o00o0O.getValue(), uri));
                break;
            default:
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("application/zip");
                intent.putExtra("android.intent.extra.TITLE", "backup.zip");
                intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
                ((BackupFragment) obj).f70478Oooo0.OooO00o(intent);
                break;
        }
    }
}
