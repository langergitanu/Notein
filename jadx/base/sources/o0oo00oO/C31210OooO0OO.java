package o0oo00oO;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o0oo00oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31210OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public InterfaceC31211OooO0Oo f111297OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f111298OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedHashMap f111299OooO0OO = new LinkedHashMap();

    public final void OooO00o() {
        String str;
        InterfaceC31211OooO0Oo interfaceC31211OooO0Oo;
        if (this.f111297OooO00o == null && (str = this.f111298OooO0O0) != null && (interfaceC31211OooO0Oo = (InterfaceC31211OooO0Oo) this.f111299OooO0OO.get(str)) != null && interfaceC31211OooO0Oo.initialize()) {
            this.f111297OooO00o = interfaceC31211OooO0Oo;
        }
    }

    public final void OooO0O0(String str) {
        InterfaceC31211OooO0Oo interfaceC31211OooO0Oo = (InterfaceC31211OooO0Oo) this.f111299OooO0OO.get(str);
        if (interfaceC31211OooO0Oo == null || !interfaceC31211OooO0Oo.initialize()) {
            return;
        }
        InterfaceC31211OooO0Oo interfaceC31211OooO0Oo2 = this.f111297OooO00o;
        if (interfaceC31211OooO0Oo2 != null) {
            interfaceC31211OooO0Oo2.release();
        }
        this.f111297OooO00o = interfaceC31211OooO0Oo;
        this.f111298OooO0O0 = str;
    }
}
