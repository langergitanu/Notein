package o00oO00o;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: renamed from: o00oO00o.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C25481OooO0o<INFO> implements InterfaceC25482OooO0o0<INFO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f86854OooO00o = new ArrayList(2);

    @Override // o00oO00o.InterfaceC25482OooO0o0
    public final void OooO00o(Object obj, String str) {
        ArrayList arrayList = this.f86854OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC25482OooO0o0 interfaceC25482OooO0o0 = (InterfaceC25482OooO0o0) arrayList.get(i);
                if (interfaceC25482OooO0o0 != null) {
                    interfaceC25482OooO0o0.OooO00o(obj, str);
                }
            } catch (Exception e) {
                OooO0oo("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    @Override // o00oO00o.InterfaceC25482OooO0o0
    public final synchronized void OooO0O0(String str) {
        int size = this.f86854OooO00o.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC25482OooO0o0 interfaceC25482OooO0o0 = (InterfaceC25482OooO0o0) this.f86854OooO00o.get(i);
                if (interfaceC25482OooO0o0 != null) {
                    interfaceC25482OooO0o0.OooO0O0(str);
                }
            } catch (Exception e) {
                OooO0oo("InternalListener exception in onRelease", e);
            }
        }
    }

    @Override // o00oO00o.InterfaceC25482OooO0o0
    public final synchronized void OooO0OO(String str, Throwable th) {
        int size = this.f86854OooO00o.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC25482OooO0o0 interfaceC25482OooO0o0 = (InterfaceC25482OooO0o0) this.f86854OooO00o.get(i);
                if (interfaceC25482OooO0o0 != null) {
                    interfaceC25482OooO0o0.OooO0OO(str, th);
                }
            } catch (Exception e) {
                OooO0oo("InternalListener exception in onFailure", e);
            }
        }
    }

    @Override // o00oO00o.InterfaceC25482OooO0o0
    public final synchronized void OooO0Oo(String str) {
        int size = this.f86854OooO00o.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC25482OooO0o0 interfaceC25482OooO0o0 = (InterfaceC25482OooO0o0) this.f86854OooO00o.get(i);
                if (interfaceC25482OooO0o0 != null) {
                    interfaceC25482OooO0o0.OooO0Oo(str);
                }
            } catch (Exception e) {
                OooO0oo("InternalListener exception in onSubmit", e);
            }
        }
    }

    @Override // o00oO00o.InterfaceC25482OooO0o0
    public final void OooO0o(String str, Throwable th) {
        ArrayList arrayList = this.f86854OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC25482OooO0o0 interfaceC25482OooO0o0 = (InterfaceC25482OooO0o0) arrayList.get(i);
                if (interfaceC25482OooO0o0 != null) {
                    interfaceC25482OooO0o0.OooO0o(str, th);
                }
            } catch (Exception e) {
                OooO0oo("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    @Override // o00oO00o.InterfaceC25482OooO0o0
    public final synchronized void OooO0o0(String str, INFO info, Animatable animatable) {
        int size = this.f86854OooO00o.size();
        for (int i = 0; i < size; i++) {
            try {
                InterfaceC25482OooO0o0 interfaceC25482OooO0o0 = (InterfaceC25482OooO0o0) this.f86854OooO00o.get(i);
                if (interfaceC25482OooO0o0 != null) {
                    interfaceC25482OooO0o0.OooO0o0(str, info, animatable);
                }
            } catch (Exception e) {
                OooO0oo("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    public final synchronized void OooO0oO(InterfaceC25482OooO0o0<? super INFO> interfaceC25482OooO0o0) {
        this.f86854OooO00o.add(interfaceC25482OooO0o0);
    }

    public final synchronized void OooO0oo(String str, Exception exc) {
        Log.e("FdingControllerListener", str, exc);
    }
}
