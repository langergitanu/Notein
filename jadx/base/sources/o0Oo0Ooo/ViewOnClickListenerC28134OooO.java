package o0Oo0Ooo;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorSummaryFragment;
import java.util.Iterator;
import java.util.List;
import o0OoO0.C28513OooO0oO;
import o0OoO0Oo.C28629OooO0O0;
import o0o0O00.C30185OooO00o;
import o0o0OOO.C30465OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0Ooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28134OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99743OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99744OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28134OooO(Object obj, int i) {
        this.f99744OooOo0o = i;
        this.f99743OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object next;
        switch (this.f99744OooOo0o) {
            case 0:
                ((com.orion.notein.p607ui.creative_library.purchase.OooO00o) this.f99743OooOo).OooO0O0(1);
                return;
            case 1:
                com.orion.notein.p607ui.membership.plan.OooO00o oooO00o = (com.orion.notein.p607ui.membership.plan.OooO00o) this.f99743OooOo;
                Context contextOooO00o = oooO00o.f72743OooO0O0.OooO00o();
                Iterator it = ((List) oooO00o.f72744OooO0OO.f101515OooO0oO.f121747OooOo0o.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((C28629OooO0O0) next).f101486OooO) {
                        }
                    } else {
                        next = null;
                    }
                }
                C28629OooO0O0 c28629OooO0O0 = (C28629OooO0O0) next;
                String str = c28629OooO0O0 != null ? c28629OooO0O0.f101487OooO00o : null;
                if (str != null) {
                    oooO00o.f72743OooO0O0.OooO0OO(str, oooO00o.f72753OooOOO0 ? oooO00o.f72752OooOO0o : null);
                    return;
                } else {
                    C28513OooO0oO.OooO00o(contextOooO00o, R.string.network_error, "getString(...)", contextOooO00o);
                    C34406OooO00o.f123390OooO00o.OooOO0O("network error: productCode is null", new Object[0]);
                    return;
                }
            case 2:
                EditorSummaryFragment editorSummaryFragment = (EditorSummaryFragment) this.f99743OooOo;
                Context context = editorSummaryFragment.getContext();
                if (context == null) {
                    return;
                }
                Object systemService = context.getSystemService("clipboard");
                kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                TextView textView = editorSummaryFragment.f75541OooOooo;
                if (textView != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("Summary", textView.getText()));
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("summaryText");
                    throw null;
                }
            case 3:
                ((C30185OooO00o) this.f99743OooOo).f107468OooO0O0.getClass();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FavoriteContainerFragment");
                c20358OooO00o.OooOO0O("onExportClick() not supported in FavoriteContainerFragment", new Object[0]);
                return;
            default:
                View.OnClickListener onClickListener = ((C30465OooO0oo) this.f99743OooOo).f108791OooO0Oo;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
