package o0Ooo000;

import android.view.ViewConfiguration;
import pdfcpu_mobile.Pdfcpu_mobile;

/* JADX INFO: renamed from: o0Ooo000.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29362Oooo00o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104123OooOo0o;

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f104123OooOo0o) {
            case 0:
                return Long.valueOf(ViewConfiguration.getLongPressTimeout());
            default:
                System.loadLibrary("gojni");
                Pdfcpu_mobile.init();
                return Boolean.TRUE;
        }
    }
}
