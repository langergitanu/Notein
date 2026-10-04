package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AlertController f62432OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f62433OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AlertController.OooO0O0 f62434OooOoO0;

    public OooO0o(AlertController.OooO0O0 oooO0O0, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f62434OooOoO0 = oooO0O0;
        this.f62433OooOo0o = recycleListView;
        this.f62432OooOo = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.OooO0O0 oooO0O0 = this.f62434OooOoO0;
        boolean[] zArr = oooO0O0.f62319OooOooo;
        AlertController.RecycleListView recycleListView = this.f62433OooOo0o;
        if (zArr != null) {
            zArr[i] = recycleListView.isItemChecked(i);
        }
        oooO0O0.f62320Oooo0.onClick(this.f62432OooOo.f62247OooO0O0, i, recycleListView.isItemChecked(i));
    }
}
