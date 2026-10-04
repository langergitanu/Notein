package o0Oo0o0o;

import android.os.Bundle;
import com.orion.notein.p607ui.RoundBottomSheetDialogFragment;
import com.orion.notein.p607ui.export.AddWaterMarkFragment;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Oo0o0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28225OooO0O0 implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ RoundBottomSheetDialogFragment f100057OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100058OooOo0o;

    public /* synthetic */ C28225OooO0O0(RoundBottomSheetDialogFragment roundBottomSheetDialogFragment, int i) {
        this.f100058OooOo0o = i;
        this.f100057OooOo = roundBottomSheetDialogFragment;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        RoundBottomSheetDialogFragment roundBottomSheetDialogFragment = this.f100057OooOo;
        String str = (String) obj;
        Bundle b = (Bundle) obj2;
        switch (this.f100058OooOo0o) {
            case 0:
                List<Integer> list = AddWaterMarkFragment.f71503Oooo000;
                kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(b, "b");
                String string = b.getString("key_bundle_for_text");
                if (string != null) {
                    C28230OooO0oO.OooO00o("Edited mark text: " + string + ".");
                    ((com.orion.notein.p607ui.export.OooO0O0) ((AddWaterMarkFragment) roundBottomSheetDialogFragment).f71504OooOooO.getValue()).OooO0o(string);
                }
                break;
            default:
                kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(b, "bundle");
                ((PaperConfigDialogFragment) roundBottomSheetDialogFragment).getChildFragmentManager().OooooOo(b, "pdf_page_selected");
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
