package o00oOoOO;

import android.util.Log;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOO0;
import o00oOoOO.InterfaceC25618OooO0O0;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o00oOoOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25619OooO0OO<I> extends C25617OooO00o<I> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f87420OooO00o = new ArrayList(2);

    @Override // o00oOoOO.InterfaceC25618OooO0O0
    public final void OooO00o(Object obj, String id) {
        OooOOO0.OooO0oO(id, "id");
        ArrayList arrayList = this.f87420OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((InterfaceC25618OooO0O0) arrayList.get(i)).OooO00o(obj, id);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // o00oOoOO.InterfaceC25618OooO0O0
    public final void OooO0O0(String id, InterfaceC25618OooO0O0.OooO00o oooO00o) {
        OooOOO0.OooO0oO(id, "id");
        ArrayList arrayList = this.f87420OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((InterfaceC25618OooO0O0) arrayList.get(i)).OooO0O0(id, oooO00o);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // o00oOoOO.InterfaceC25618OooO0O0
    public final void OooO0OO(String id) {
        OooOOO0.OooO0oO(id, "id");
        ArrayList arrayList = this.f87420OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((InterfaceC25618OooO0O0) arrayList.get(i)).OooO0OO(id);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // o00oOoOO.InterfaceC25618OooO0O0
    public final void OooO0Oo(String id, Throwable th, InterfaceC25618OooO0O0.OooO00o oooO00o) {
        OooOOO0.OooO0oO(id, "id");
        ArrayList arrayList = this.f87420OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((InterfaceC25618OooO0O0) arrayList.get(i)).OooO0Oo(id, th, oooO00o);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // o00oOoOO.InterfaceC25618OooO0O0
    public final void OooO0o(String id, InterfaceC25618OooO0O0.OooO00o oooO00o) {
        OooOOO0.OooO0oO(id, "id");
        ArrayList arrayList = this.f87420OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    ((InterfaceC25618OooO0O0) arrayList.get(i)).OooO0o(id, oooO00o);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // o00oOoOO.InterfaceC25618OooO0O0
    public final void OooO0o0(String id, I i, InterfaceC25618OooO0O0.OooO00o oooO00o) {
        OooOOO0.OooO0oO(id, "id");
        ArrayList arrayList = this.f87420OooO00o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                try {
                    ((InterfaceC25618OooO0O0) arrayList.get(i2)).OooO0o0(id, i, oooO00o);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }
}
