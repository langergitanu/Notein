package o0O0o0oO;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.orion.notein.domain.models.page.PaperOrientation;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment2;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.notelist.pdf.ImportBatchPdfDialogFragment;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import o00o00.C25206OooO0Oo;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29891OooO0o0;
import o0o00oOo.C30033OooO0o;
import o0o00oo.C30103OooOO0O;
import o0oOoOo.C31039OooOO0O;
import o0oo000O.C31183OooO00o;
import oO0o0O0o.C33595OooOOo;
import oO0o0Oo.C33781o00o0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0O0o0oO.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26059OooooOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88954OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88955OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26059OooooOo(Object obj, int i) {
        this.f88955OooOo0o = i;
        this.f88954OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        switch (this.f88955OooOo0o) {
            case 0:
                ((C26061Oooooo0) this.f88954OooOo).f88961OooO0OO.f88963OooO0O0.OooO00o();
                return;
            case 1:
                ExportDialogFragment exportDialogFragment = (ExportDialogFragment) this.f88954OooOo;
                Context context = exportDialogFragment.getContext();
                if (context == null || exportDialogFragment.Oooo0OO().f71767OooOo.isEmpty()) {
                    return;
                }
                String f71681OooOoO0 = exportDialogFragment.Oooo0O0().getF71681OooOoO0();
                if (C31183OooO00o.f111222OooO0O0.f121262OooOo0o.matcher(C33595OooOOo.OooOo0O(f71681OooOoO0, ".", "")).find()) {
                    String string = exportDialogFragment.getString(R.string.export_name_illegal_chars);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                    return;
                }
                CopyOnWriteArrayList<String> copyOnWriteArrayList = exportDialogFragment.Oooo0OO().f71767OooOo;
                Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.TITLE", f71681OooOoO0);
                intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
                int iOooO0O0 = com.android.billingclient.api.OooOO0.OooO0O0(exportDialogFragment.Oooo0O0());
                int iIntValue = ((Number) exportDialogFragment.Oooo0OO().f71766OooOOoo.getValue()).intValue();
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
                exportDialogFragment.f71605OoooOoo.OooO00o(intent);
                return;
            case 2:
                C29825OooOoO0 c29825OooOoO0 = ((C29891OooO0o0) this.f88954OooOo).f106037OooO0O0;
                if (c29825OooOoO0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29825OooOoO0.OooO00o(view);
                    return;
                }
                return;
            case 3:
                C30033OooO0o c30033OooO0o = ((NoteListContainerFragment) this.f88954OooOo).f77376o0OoOo0;
                if (c30033OooO0o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("labelFilterPopupWindow");
                    throw null;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                C30033OooO0o.OooO0OO(c30033OooO0o, view);
                return;
            case 4:
                ImportBatchPdfDialogFragment importBatchPdfDialogFragment = (ImportBatchPdfDialogFragment) this.f88954OooOo;
                int iIntValue2 = ((Number) importBatchPdfDialogFragment.OooOooo().f107905OooOO0o.f121747OooOo0o.getValue()).intValue();
                if (iIntValue2 == 0) {
                    importBatchPdfDialogFragment.dismiss();
                    return;
                }
                if (iIntValue2 != 1) {
                    if (iIntValue2 != 2) {
                        return;
                    }
                    o0o0O0O0.OooOOO0 oooOOO0OooOooo = importBatchPdfDialogFragment.OooOooo();
                    C34438OooOoo0 c34438OooOoo0 = C34438OooOoo0.f123458OooOo0o;
                    C33781o00o0O c33781o00o0O = oooOOO0OooOooo.f107897OooO;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, c34438OooOoo0);
                    return;
                }
                o0o0O0O0.OooOOO0 oooOOO0OooOooo2 = importBatchPdfDialogFragment.OooOooo();
                Iterable iterable = (Iterable) oooOOO0OooOooo2.f107904OooOO0O.f121747OooOo0o.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!((C31039OooOO0O) obj).f110818OooO0OO) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C31039OooOO0O) it.next()).f110816OooO00o);
                }
                Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList2);
                C33781o00o0O c33781o00o0O2 = oooOOO0OooOooo2.f107897OooO;
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, setO0OO00O);
                return;
            case 5:
                ((StandardTemplateFragment) this.f88954OooOo).OooOooo().OooOo0O(PaperOrientation.VERTICAL);
                return;
            default:
                TipsDialogFragment2 tipsDialogFragment2 = (TipsDialogFragment2) this.f88954OooOo;
                C30103OooOO0O.OooO00o.OooO0O0 oooO0O0 = tipsDialogFragment2.f70471OooOooO;
                if (oooO0O0 != null) {
                    oooO0O0.onClick(view);
                }
                Dialog dialog = tipsDialogFragment2.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }
}
