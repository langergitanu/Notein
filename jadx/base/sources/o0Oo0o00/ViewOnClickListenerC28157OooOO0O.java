package o0Oo0o00;

import Oooo0oO.C21030OooOO0o;
import android.net.Uri;
import android.view.View;
import androidx.core.os.BundleKt;
import com.orion.notein.p607ui.noteeditor.addpage.PDFPageSelectorDialogFragment;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import java.util.ArrayList;
import java.util.List;
import o0OoOO00.C29028OoooO0;
import o0oOo00.C30938OooOOo;
import o0oOoOo.C31078OoooOo0;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo0o00.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28157OooOO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99782OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99783OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28157OooOO0O(Object obj, int i) {
        this.f99783OooOo0o = i;
        this.f99782OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f99783OooOo0o) {
            case 0:
                ((oO0O000o.OooO00o) this.f99782OooOo).invoke();
                break;
            case 1:
                PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = (PDFPageSelectorDialogFragment) this.f99782OooOo;
                String str = ((C29028OoooO0) pDFPageSelectorDialogFragment.f73917Oooo000.getValue()).f102837OooO00o;
                pDFPageSelectorDialogFragment.getParentFragmentManager().OooooOo(BundleKt.bundleOf(), str);
                C21030OooOO0o.OooO0OO(pDFPageSelectorDialogFragment).OooOOOo();
                break;
            case 2:
                NoteEditorContainer.OooO00o oooO00o = ((NoteEditorContainer) this.f99782OooOo).f76983Oooo0OO;
                if (oooO00o != null) {
                    oooO00o.OooO0oO();
                }
                break;
            default:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.StickerPreviewVO");
                C30938OooOOo c30938OooOOoOooOoo0 = ((StickerCollectionEditFragment) this.f99782OooOo).OooOoo0();
                List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(((C31078OoooOo0) tag).f110914OooO00o);
                C33781o00o0O c33781o00o0O = c30938OooOOoOooOoo0.f110578OooOO0;
                List list = (List) c33781o00o0O.getValue();
                List list2 = listOooO0oO;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (list.contains((Uri) obj)) {
                        arrayList.add(obj);
                    }
                }
                c33781o00o0O.OooOO0(null, oOo000Oo.OooOo.Ooooo00(list, oOo000Oo.OooOo.o0OO00O(arrayList)));
                C33781o00o0O c33781o00o0O2 = c30938OooOOoOooOoo0.f110579OooOO0O;
                c33781o00o0O2.OooOO0(null, oOo000Oo.OooOo.Ooooo00(oOo000Oo.OooOo.OooooOO((List) c33781o00o0O2.getValue(), list2), oOo000Oo.OooOo.o0OO00O(arrayList)));
                break;
        }
    }
}
