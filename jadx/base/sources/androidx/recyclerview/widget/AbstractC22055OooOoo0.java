package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22055OooOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RecyclerView.OooOOOO f66027OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f66028OooO0O0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f66029OooO0OO = new Rect();

    public AbstractC22055OooOoo0(RecyclerView.OooOOOO oooOOOO) {
        this.f66027OooO00o = oooOOOO;
    }

    public static AbstractC22055OooOoo0 OooO00o(RecyclerView.OooOOOO oooOOOO, int i) {
        if (i == 0) {
            return new C22051OooOoO(oooOOOO);
        }
        if (i == 1) {
            return new C22053OooOoOO(oooOOOO);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int OooO();

    public abstract int OooO0O0(View view);

    public abstract int OooO0OO(View view);

    public abstract int OooO0Oo(View view);

    public abstract int OooO0o();

    public abstract int OooO0o0(View view);

    public abstract int OooO0oO();

    public abstract int OooO0oo();

    public abstract int OooOO0();

    public abstract int OooOO0O();

    public abstract int OooOO0o();

    public abstract int OooOOO(View view);

    public final int OooOOO0() {
        if (Integer.MIN_VALUE == this.f66028OooO0O0) {
            return 0;
        }
        return OooOO0o() - this.f66028OooO0O0;
    }

    public abstract int OooOOOO(View view);

    public abstract void OooOOOo(int i);
}
