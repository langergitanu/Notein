package o0o0O0;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.facebook.soloader.OooOo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.ocr.view.AiOcrEditorListContainer;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.pageeditor.TiledPageListContainerFragment;
import kotlin.jvm.internal.OooOOO0;
import o0o0O00.C30201OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0Oo.C33180OooOo0o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0o0O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC30181OooO0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f107455OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107456OooOo0o;

    public /* synthetic */ ViewOnClickListenerC30181OooO0o0(Object obj, int i) {
        this.f107456OooOo0o = i;
        this.f107455OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final C30201OooOOO0 c30201OooOOO0;
        Object obj = this.f107455OooOo;
        switch (this.f107456OooOo0o) {
            case 0:
                C30183OooO0oo c30183OooO0oo = (C30183OooO0oo) obj;
                final NoteVO noteVO = c30183OooO0oo.f107461OooO0O0;
                if (noteVO != null && (c30201OooOOO0 = c30183OooO0oo.f107462OooO0OO) != null) {
                    OooO oooO = c30201OooOOO0.f107552OooO0o0;
                    if (oooO != null) {
                        oooO.OooO00o();
                    }
                    LockNoteFragment lockNoteFragmentInvoke = c30201OooOOO0.f107548OooO0O0.invoke();
                    InterfaceC21987OooOoo viewLifecycleOwner = c30201OooOOO0.f107547OooO00o.getViewLifecycleOwner();
                    OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    LockNoteFragment.OooOoo(lockNoteFragmentInvoke, C21989OooOooO.OooO00o(viewLifecycleOwner), OooOo.OooO0oO(noteVO.getId()), new oO0O000o.OooO00o() { // from class: o0o0O00.OooOO0O
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            C30201OooOOO0 c30201OooOOO02 = c30201OooOOO0;
                            Context context = c30201OooOOO02.f107547OooO00o.getContext();
                            if (context == null) {
                                return C32460OooOooO.f116667OooO00o;
                            }
                            InterfaceC21987OooOoo viewLifecycleOwner2 = c30201OooOOO02.f107547OooO00o.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30206OooOOoo(c30201OooOOO02, context, noteVO, null), 3);
                            return C32460OooOooO.f116667OooO00o;
                        }
                    });
                    break;
                }
                break;
            case 1:
                TiledPageListContainerFragment tiledPageListContainerFragment = (TiledPageListContainerFragment) obj;
                if (((Number) tiledPageListContainerFragment.Oooo000().f108345OooOo00.getValue()).intValue() != 0) {
                    tiledPageListContainerFragment.Oooo000().OooO(0);
                } else {
                    tiledPageListContainerFragment.Oooo000().OooO(1);
                }
                break;
            case 2:
                int i = AiOcrEditorListContainer.f78420OoooOOO;
                int id = view.getId();
                int i2 = id != R.id.item_align_center ? id != R.id.item_align_right ? 7 : 9 : 8;
                AiOcrEditorListContainer aiOcrEditorListContainer = (AiOcrEditorListContainer) obj;
                if (!view.isActivated()) {
                    aiOcrEditorListContainer.OooO0O0(i2, Boolean.TRUE);
                } else {
                    aiOcrEditorListContainer.OooO0O0(7, Boolean.FALSE);
                }
                break;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner2 = textRecognizeFragment.getViewLifecycleOwner();
                OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C33180OooOo0o(textRecognizeFragment, view, null), 3);
                break;
        }
    }
}
