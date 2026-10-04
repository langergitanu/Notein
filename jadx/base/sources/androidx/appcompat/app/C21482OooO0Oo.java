package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: androidx.appcompat.app.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21482OooO0Oo extends CursorAdapter {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f62427OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f62428OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AlertController f62429OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f62430OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AlertController.OooO0O0 f62431OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21482OooO0Oo(AlertController.OooO0O0 oooO0O0, ContextThemeWrapper contextThemeWrapper, Cursor cursor, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super((Context) contextThemeWrapper, cursor, false);
        this.f62431OooOoOO = oooO0O0;
        this.f62430OooOoO0 = recycleListView;
        this.f62429OooOoO = alertController;
        Cursor cursor2 = getCursor();
        this.f62428OooOo0o = cursor2.getColumnIndexOrThrow(oooO0O0.f62325Oooo0OO);
        this.f62427OooOo = cursor2.getColumnIndexOrThrow(oooO0O0.f62327Oooo0o0);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f62428OooOo0o));
        this.f62430OooOoO0.setItemChecked(cursor.getPosition(), cursor.getInt(this.f62427OooOo) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f62431OooOoOO.f62291OooO0O0.inflate(this.f62429OooOoO.f62284Oooo0o0, viewGroup, false);
    }
}
