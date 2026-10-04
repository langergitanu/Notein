package o0ooOO0;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: o0ooOO0.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31548Ooooo0o implements o000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ViewConfiguration f112764OooO00o;

    public C31548Ooooo0o(ViewConfiguration viewConfiguration) {
        this.f112764OooO00o = viewConfiguration;
    }

    @Override // o0ooOO0.o000O0O
    public final float OooO00o() {
        return this.f112764OooO00o.getScaledTouchSlop();
    }

    @Override // o0ooOO0.o000O0O
    public final long OooO0O0() {
        return ViewConfiguration.getLongPressTimeout();
    }
}
