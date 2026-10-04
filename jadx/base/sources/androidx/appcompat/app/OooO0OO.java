package androidx.appcompat.app;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends ArrayAdapter<CharSequence> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AlertController.OooO0O0 f62425OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f62426OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(AlertController.OooO0O0 oooO0O0, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(contextThemeWrapper, i, R.id.text1, charSequenceArr);
        this.f62425OooOo = oooO0O0;
        this.f62426OooOo0o = recycleListView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f62425OooOo.f62319OooOooo;
        if (zArr != null && zArr[i]) {
            this.f62426OooOo0o.setItemChecked(i, true);
        }
        return view2;
    }
}
