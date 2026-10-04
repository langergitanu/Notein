package o0Oo0o0o;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.notelist.label.LabelListFragment;
import java.util.concurrent.CopyOnWriteArrayList;
import o00o00.C25206OooO0Oo;
import o0o00O0O.C29874OooO0o0;
import o0oo000O.C31183OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Oo0o0o.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28241OooOOoo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100084OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100085OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28241OooOOoo(Object obj, int i) {
        this.f100085OooOo0o = i;
        this.f100084OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        switch (this.f100085OooOo0o) {
            case 0:
                ExportBottomSheetFragment exportBottomSheetFragment = (ExportBottomSheetFragment) this.f100084OooOo;
                Context context = exportBottomSheetFragment.getContext();
                if (context == null || exportBottomSheetFragment.OooOooo().f71767OooOo.isEmpty()) {
                    return;
                }
                String f71681OooOoO0 = exportBottomSheetFragment.OooOooO().getF71681OooOoO0();
                if (C31183OooO00o.f111222OooO0O0.f121262OooOo0o.matcher(C33595OooOOo.OooOo0O(f71681OooOoO0, ".", "")).find()) {
                    String string = exportBottomSheetFragment.getString(R.string.export_name_illegal_chars);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                    return;
                }
                CopyOnWriteArrayList<String> copyOnWriteArrayList = exportBottomSheetFragment.OooOooo().f71767OooOo;
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.TITLE", f71681OooOoO0);
                intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
                int iOooO0O0 = com.android.billingclient.api.OooOO0.OooO0O0(exportBottomSheetFragment.OooOooO());
                int iIntValue = ((Number) exportBottomSheetFragment.OooOooo().f71766OooOOoo.getValue()).intValue();
                str = "application/zip";
                if (iIntValue == 0 || iIntValue == 1) {
                    intent.setType((iOooO0O0 != 0 || copyOnWriteArrayList.size() <= 1) ? "application/pdf" : "application/zip");
                } else if (iIntValue != 2) {
                    if (iIntValue != 3) {
                        throw new IllegalArgumentException("Unknown export type");
                    }
                    if (iOooO0O0 == 1 && copyOnWriteArrayList.size() == 1) {
                        str = "image/jpeg";
                    }
                    intent.setType(str);
                } else if (iOooO0O0 != 0 || copyOnWriteArrayList.size() <= 1) {
                    intent.setType("application/octet-stream");
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(intent.putExtra("android.intent.extra.TITLE", f71681OooOoO0.concat(".in")));
                } else {
                    intent.setType("application/zip");
                }
                exportBottomSheetFragment.f71530OoooOo0.OooO00o(intent);
                return;
            case 1:
                C29874OooO0o0.OooO00o oooO00o = ((C29874OooO0o0) this.f100084OooOo).f106007OooO0O0;
                if (oooO00o != null) {
                    oooO00o.OooO0OO();
                    return;
                }
                return;
            default:
                LabelListFragment labelListFragment = (LabelListFragment) this.f100084OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = labelListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new LabelListFragment.OooO0OO(view, labelListFragment, null), 3);
                return;
        }
    }
}
