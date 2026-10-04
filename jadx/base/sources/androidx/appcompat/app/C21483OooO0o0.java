package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: androidx.appcompat.app.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21483OooO0o0 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AlertController.OooO0O0 f62435OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AlertController f62436OooOo0o;

    public C21483OooO0o0(AlertController.OooO0O0 oooO0O0, AlertController alertController) {
        this.f62435OooOo = oooO0O0;
        this.f62436OooOo0o = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.OooO0O0 oooO0O0 = this.f62435OooOo;
        DialogInterface.OnClickListener onClickListener = oooO0O0.f62312OooOo0o;
        AlertController alertController = this.f62436OooOo0o;
        onClickListener.onClick(alertController.f62247OooO0O0, i);
        if (oooO0O0.f62322Oooo00O) {
            return;
        }
        alertController.f62247OooO0O0.dismiss();
    }
}
