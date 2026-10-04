package o0Oo0oOo;

import Oooo0oO.C21022OooO0OO;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C21904OooOoo0;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.ArrayList;
import java.util.List;
import o0OoOOoO.C29192OooO0o0;
import o0o0O00.C30214OooOoOO;

/* JADX INFO: renamed from: o0Oo0oOo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28318OooOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100437OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100438OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28318OooOOO0(Object obj, int i) {
        this.f100438OooOo0o = i;
        this.f100437OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100438OooOo0o) {
            case 0:
                ((C28315OooOO0O) this.f100437OooOo).invoke();
                return;
            case 1:
                Bundle bundle = new Bundle();
                FirebaseUserAuthFragment firebaseUserAuthFragment = (FirebaseUserAuthFragment) this.f100437OooOo;
                C21904OooOoo0.OooO0o(bundle, firebaseUserAuthFragment, "key_firebase_login");
                firebaseUserAuthFragment.dismiss();
                return;
            case 2:
                NoteEditorFragment noteEditorFragment = (NoteEditorFragment) this.f100437OooOo;
                noteEditorFragment.OoooOO0().f73594Ooooo0o = false;
                View view2 = noteEditorFragment.f73018OoooOO0;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("limitedUnboundedNoteTipsView");
                    throw null;
                }
            case 3:
                ((C29192OooO0o0) this.f100437OooOo).f103527OooO0O0.OooO00o();
                return;
            case 4:
                View view3 = (View) this.f100437OooOo;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view3);
                C21022OooO0OO.OooO0O0(view3).OooOOo0();
                return;
            default:
                TrashBinContainerFragment trashBinContainerFragment = (TrashBinContainerFragment) this.f100437OooOo;
                if (((List) trashBinContainerFragment.OooOoOO().f108252OooOooo.f121747OooOo0o.getValue()).size() != 0) {
                    trashBinContainerFragment.OooOoOO().OooOOo();
                    return;
                }
                C30214OooOoOO c30214OooOoOO = trashBinContainerFragment.f78084OoooO00;
                if (c30214OooOoOO == null) {
                    trashBinContainerFragment.OooOoOO().OooOOO((List) trashBinContainerFragment.OooOoOO().f108251OooOooO.f121747OooOo0o.getValue());
                    return;
                }
                Iterable iterable = (Iterable) trashBinContainerFragment.OooOoOO().f108251OooOooO.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (c30214OooOoOO.OooO00o().getFilterFunction().invoke((NoteVO) obj).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                trashBinContainerFragment.OooOoOO().OooOOO(arrayList);
                return;
        }
    }
}
