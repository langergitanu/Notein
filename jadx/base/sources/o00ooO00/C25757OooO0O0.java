package o00ooO00;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import o00o0o00.C25438OooO00o;
import o00ooO0o.C25763OooO00o;

/* JADX INFO: renamed from: o00ooO00.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25757OooO0O0 implements InterfaceC25759OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f87904OooO00o;

    public C25757OooO0O0(Set<InterfaceC25759OooO0Oo> set) {
        this.f87904OooO00o = new ArrayList(set.size());
        for (InterfaceC25759OooO0Oo interfaceC25759OooO0Oo : set) {
            if (interfaceC25759OooO0Oo != null) {
                this.f87904OooO00o.add(interfaceC25759OooO0Oo);
            }
        }
    }

    public static void OooOO0o(String str, Exception exc) {
        C25438OooO00o.OooO0OO("ForwardingRequestListener", str, exc);
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final void OooO(String str, String str2, boolean z) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC25759OooO0Oo) arrayList.get(i)).OooO(str, str2, z);
            } catch (Exception e) {
                OooOO0o("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final void OooO00o(C25763OooO00o c25763OooO00o, Object obj, String str, boolean z) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC25759OooO0Oo) arrayList.get(i)).OooO00o(c25763OooO00o, obj, str, z);
            } catch (Exception e) {
                OooOO0o("InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final void OooO0O0(String str, String str2) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC25759OooO0Oo) arrayList.get(i)).OooO0O0(str, str2);
            } catch (Exception e) {
                OooOO0o("InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final void OooO0OO(String str, String str2, Throwable th, Map<String, String> map) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC25759OooO0Oo) arrayList.get(i)).OooO0OO(str, str2, th, map);
            } catch (Exception e) {
                OooOO0o("InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final void OooO0Oo(String str, String str2) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC25759OooO0Oo) arrayList.get(i)).OooO0Oo(str, str2);
            } catch (Exception e) {
                OooOO0o("InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final boolean OooO0o(String str) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((InterfaceC25759OooO0Oo) arrayList.get(i)).OooO0o(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final void OooO0o0(String str) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC25759OooO0Oo) arrayList.get(i)).OooO0o0(str);
            } catch (Exception e) {
                OooOO0o("InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final void OooO0oO(String str, String str2, Map<String, String> map) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC25759OooO0Oo) arrayList.get(i)).OooO0oO(str, str2, map);
            } catch (Exception e) {
                OooOO0o("InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final void OooO0oo(C25763OooO00o c25763OooO00o, String str, Throwable th, boolean z) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC25759OooO0Oo) arrayList.get(i)).OooO0oo(c25763OooO00o, str, th, z);
            } catch (Exception e) {
                OooOO0o("InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final void OooOO0(C25763OooO00o c25763OooO00o, String str, boolean z) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC25759OooO0Oo) arrayList.get(i)).OooOO0(c25763OooO00o, str, z);
            } catch (Exception e) {
                OooOO0o("InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // o00ooO00.InterfaceC25759OooO0Oo
    public final void OooOO0O(String str) {
        ArrayList arrayList = this.f87904OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((InterfaceC25759OooO0Oo) arrayList.get(i)).OooOO0O(str);
            } catch (Exception e) {
                OooOO0o("InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    public C25757OooO0O0(InterfaceC25759OooO0Oo... interfaceC25759OooO0OoArr) {
        this.f87904OooO00o = new ArrayList(interfaceC25759OooO0OoArr.length);
        for (InterfaceC25759OooO0Oo interfaceC25759OooO0Oo : interfaceC25759OooO0OoArr) {
            if (interfaceC25759OooO0Oo != null) {
                this.f87904OooO00o.add(interfaceC25759OooO0Oo);
            }
        }
    }
}
