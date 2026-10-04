package oOO00O0o;

import android.util.Log;
import com.orion.notein.MainActivity;

/* JADX INFO: renamed from: oOO00O0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34346OooO00o implements InterfaceC34349OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC34350OooO0o0 f123284OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ MainActivity f123285OooO0O0;

    public C34346OooO00o(MainActivity mainActivity, InterfaceC34350OooO0o0 interfaceC34350OooO0o0) {
        this.f123285OooO0O0 = mainActivity;
        this.f123284OooO00o = interfaceC34350OooO0o0;
    }

    @Override // oOO00O0o.InterfaceC34349OooO0Oo
    public final void OooO00o() {
        OooO0O0.OooO0OO(this.f123285OooO0O0);
    }

    @Override // oOO00O0o.InterfaceC34349OooO0Oo
    public final void OooO0O0() {
        Log.e("OpenCVManager/Helper", "Nothing to install we just wait current installation");
    }

    @Override // oOO00O0o.InterfaceC34349OooO0Oo
    public final void cancel() {
        Log.d("OpenCVManager/Helper", "Waiting for OpenCV canceled by user");
        OooO0O0.f123286OooO0o = false;
        Log.d("OpenCVManager/Helper", "Init finished with status 3");
        Log.d("OpenCVManager/Helper", "Calling using callback");
        this.f123284OooO00o.OooO0O0(3);
    }

    @Override // oOO00O0o.InterfaceC34349OooO0Oo
    public final String getPackageName() {
        return "OpenCV Manager";
    }
}
