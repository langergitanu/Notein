package androidx.fragment.app;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

/* JADX INFO: renamed from: androidx.fragment.app.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21900OooOoO<H> extends AbstractC21899OooOo0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ActivityC21897OooOo0 f64990OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ActivityC21897OooOo0 f64991OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C21910Oooo0O0 f64992OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Handler f64993OooOoO0;

    public AbstractC21900OooOoO(ActivityC21897OooOo0 activityC21897OooOo0) {
        Handler handler = new Handler();
        this.f64991OooOo0o = activityC21897OooOo0;
        this.f64990OooOo = activityC21897OooOo0;
        this.f64993OooOoO0 = handler;
        this.f64992OooOoO = new C21910Oooo0O0();
    }

    @Override // androidx.fragment.app.AbstractC21899OooOo0o
    public View OooO0O0(int i) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC21899OooOo0o
    public boolean OooO0OO() {
        return true;
    }

    public void OooO0Oo(PrintWriter printWriter, String[] strArr) {
    }

    public LayoutInflater OooO0o() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f64990OooOo);
        kotlin.jvm.internal.OooOOO0.OooO0o(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    public abstract ActivityC21897OooOo0 OooO0o0();

    public boolean OooO0oO(String permission) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(permission, "permission");
        return false;
    }

    public void OooO0oo() {
    }
}
