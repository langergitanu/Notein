package o0Oo0oOo;

import android.view.View;
import androidx.core.os.BundleKt;
import com.orion.notein.p607ui.creative_library.DeleteMaterialConfirmDialogFragment;
import com.orion.notein.p607ui.noteeditor.textannoeditor.TextAnnoTextEditor;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0Oo0oOo.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28372o00o0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100592OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100593OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f100594OooOoO0;

    public /* synthetic */ ViewOnClickListenerC28372o00o0O(int i, Object obj, Object obj2) {
        this.f100593OooOo0o = i;
        this.f100592OooOo = obj;
        this.f100594OooOoO0 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100593OooOo0o) {
            case 0:
                String str = (String) this.f100592OooOo;
                DeleteMaterialConfirmDialogFragment deleteMaterialConfirmDialogFragment = (DeleteMaterialConfirmDialogFragment) this.f100594OooOoO0;
                if (str != null) {
                    deleteMaterialConfirmDialogFragment.getParentFragmentManager().OooooOo(BundleKt.bundleOf(new C32443OooOOO("material_id", str)), "delete_material");
                }
                deleteMaterialConfirmDialogFragment.dismissAllowingStateLoss();
                break;
            default:
                ((TextAnnoTextEditor) this.f100592OooOo).f76404Oooo = true;
                ((o0o000OO.OooOO0O) this.f100594OooOoO0).OooOO0O();
                break;
        }
    }
}
