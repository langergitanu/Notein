package o0oOo0o0;

import Oooo0.o000000O;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: o0oOo0o0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class DialogC30986OooO0oo extends BottomSheetDialog {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final View f110684OooOo0o;

    public DialogC30986OooO0oo(Context context, int i) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        this.f110684OooOo0o = viewInflate;
        setContentView(viewInflate);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.DialogC21495OooOoO, OooO0Oo.OooOo00, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: o0oOo0o0.OooO0oO
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View viewFindViewById = this.f110683OooO00o.findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundColor(0);
                }
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, OooO0Oo.OooOo00, android.app.Dialog
    public void onStart() {
        super.onStart();
        getBehavior().setState(3);
        Resources resources = getContext().getResources();
        if (resources.getConfiguration().orientation == 2) {
            getBehavior().setMaxWidth(o000000O.OooO0o(StyleIdentifier.LIST_TABLE_4_ACCENT_5));
        } else {
            getBehavior().setMaxWidth(-1);
        }
        getBehavior().setMaxHeight(o000000O.OooO0o(resources.getConfiguration().screenHeightDp) - resources.getDimensionPixelSize(R.dimen.immersive_toolbar_height));
    }
}
