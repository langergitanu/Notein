package o000O0o;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import o000O000.C24382OooO0oo;

/* JADX INFO: renamed from: o000O0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24405OooO0o0 implements KeyListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final KeyListener f82399OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f82400OooO0O0;

    /* JADX INFO: renamed from: o000O0o.OooO0o0$OooO00o */
    public static class OooO00o {
    }

    public C24405OooO0o0(KeyListener keyListener) {
        OooO00o oooO00o = new OooO00o();
        this.f82399OooO00o = keyListener;
        this.f82400OooO0O0 = oooO00o;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f82399OooO00o.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f82399OooO00o.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.f82400OooO0O0.getClass();
        if (i != 67 ? i != 112 ? false : C24382OooO0oo.OooO00o(editable, keyEvent, true) : C24382OooO0oo.OooO00o(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.f82399OooO00o.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f82399OooO00o.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f82399OooO00o.onKeyUp(view, editable, i, keyEvent);
    }
}
