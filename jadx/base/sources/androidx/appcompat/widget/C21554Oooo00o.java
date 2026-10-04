package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: androidx.appcompat.widget.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21554Oooo00o implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f63051OooOo0o;

    public C21554Oooo00o(Oooo0 oooo0) {
        this.f63051OooOo0o = oooo0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C21546OooOooo c21546OooOooo;
        if (i == -1 || (c21546OooOooo = this.f63051OooOo0o.f63012OooOoO0) == null) {
            return;
        }
        c21546OooOooo.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
