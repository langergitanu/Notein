package o00oO0O;

import OooOoOO.C20519OooO0Oo;
import android.util.Log;
import com.orion.notein.MainActivity;
import oO00ooO.EnumC32441OooOO0O;
import oOO00O0o.InterfaceC34349OooO0Oo;
import oOO00O0o.InterfaceC34350OooO0o0;

/* JADX INFO: renamed from: o00oO0O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25493OooOO0o implements InterfaceC34349OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f86894OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f86895OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f86896OooO0OO;

    public C25493OooOO0o() {
        this.f86894OooO00o = 0;
        this.f86895OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, OooOO0O.f86893OooOo0o);
        this.f86896OooO0OO = new oo0o0Oo(new OooOO0());
    }

    @Override // oOO00O0o.InterfaceC34349OooO0Oo
    public void OooO00o() {
        Log.e("OpenCVManager/Helper", "Installation was not started! Nothing to wait!");
    }

    @Override // oOO00O0o.InterfaceC34349OooO0Oo
    public void OooO0O0() {
        Log.d("OpenCVManager/Helper", "Trying to install OpenCV Manager via Google Play");
        if (oOO00O0o.OooO0O0.OooO0OO((MainActivity) this.f86896OooO0OO)) {
            oOO00O0o.OooO0O0.f123286OooO0o = true;
            Log.d("OpenCVManager/Helper", "Package installation started");
            return;
        }
        Log.d("OpenCVManager/Helper", "OpenCV package was not installed!");
        Log.d("OpenCVManager/Helper", "Init finished with status 2");
        Log.d("OpenCVManager/Helper", "Unbind from service");
        Log.d("OpenCVManager/Helper", "Calling using callback");
        ((InterfaceC34350OooO0o0) this.f86895OooO0O0).OooO0O0(2);
    }

    public void OooO0OO(C25503OooOoOO node) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(node, "node");
        if (!node.OooOoO()) {
            throw new IllegalStateException("Check failed.");
        }
        ((oo0o0Oo) this.f86896OooO0OO).add(node);
    }

    public boolean OooO0Oo(C25503OooOoOO node) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(node, "node");
        if (node.OooOoO()) {
            return ((oo0o0Oo) this.f86896OooO0OO).remove(node);
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // oOO00O0o.InterfaceC34349OooO0Oo
    public void cancel() {
        Log.d("OpenCVManager/Helper", "OpenCV library installation was canceled");
        Log.d("OpenCVManager/Helper", "Init finished with status 3");
        Log.d("OpenCVManager/Helper", "Calling using callback");
        ((InterfaceC34350OooO0o0) this.f86895OooO0O0).OooO0O0(3);
    }

    @Override // oOO00O0o.InterfaceC34349OooO0Oo
    public String getPackageName() {
        return "OpenCV Manager";
    }

    public String toString() {
        switch (this.f86894OooO00o) {
            case 0:
                String string = ((oo0o0Oo) this.f86896OooO0OO).toString();
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "set.toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public C25493OooOO0o(MainActivity mainActivity, InterfaceC34350OooO0o0 interfaceC34350OooO0o0) {
        this.f86894OooO00o = 1;
        this.f86896OooO0OO = mainActivity;
        this.f86895OooO0O0 = interfaceC34350OooO0o0;
    }
}
