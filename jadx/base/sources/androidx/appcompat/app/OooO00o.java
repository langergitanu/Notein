package androidx.appcompat.app;

import OooOO0o.AbstractC20443OooO00o;
import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o {

    public interface OooO0O0 {
        void OooO00o();
    }

    public abstract boolean OooO(int i, KeyEvent keyEvent);

    public boolean OooO00o() {
        return false;
    }

    public abstract boolean OooO0O0();

    public abstract void OooO0OO(boolean z);

    public abstract int OooO0Oo();

    public boolean OooO0o() {
        return false;
    }

    public abstract Context OooO0o0();

    public abstract void OooO0oO();

    public void OooO0oo() {
    }

    public boolean OooOO0(KeyEvent keyEvent) {
        return false;
    }

    public boolean OooOO0O() {
        return false;
    }

    public abstract void OooOO0o(boolean z);

    public abstract void OooOOO(CharSequence charSequence);

    public abstract void OooOOO0(boolean z);

    public AbstractC20443OooO00o OooOOOO(AppCompatDelegateImpl.C21477OooO0Oo c21477OooO0Oo) {
        return null;
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C18993OooO00o extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f62424OooO00o;

        public C18993OooO00o(C18993OooO00o c18993OooO00o) {
            super((ViewGroup.MarginLayoutParams) c18993OooO00o);
            this.f62424OooO00o = 0;
            this.f62424OooO00o = c18993OooO00o.f62424OooO00o;
        }

        public C18993OooO00o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f62424OooO00o = 0;
        }
    }
}
