package oO000Oo;

import java.util.ArrayList;
import o00OO0o.C24991OooO00o;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32622Oooo0O0;
import oO0OoO0.C33238OooO0oo;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;

/* JADX INFO: renamed from: oO000Oo.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31998OoooOoO implements oO0OoO0.OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f114250OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f114251OooO0O0;

    public C31998OoooOoO(InterfaceC32622Oooo0O0 interfaceC32622Oooo0O0) {
        this.f114250OooO00o = 1;
        this.f114251OooO0O0 = interfaceC32622Oooo0O0;
    }

    @Override // oO0OoO0.OooO
    public C33238OooO0oo OooO00o(C33476OooO0O0 classId) {
        C33238OooO0oo c33238OooO0ooOooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
        C33477OooO0OO c33477OooO0OOOooO0oO = classId.OooO0oO();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO, "classId.packageFqName");
        for (InterfaceC32620Oooo00O interfaceC32620Oooo00O : C24991OooO00o.OooO0o0((InterfaceC32622Oooo0O0) this.f114251OooO0O0, c33477OooO0OOOooO0oO)) {
            if ((interfaceC32620Oooo00O instanceof oO0OoO0.OooOOOO) && (c33238OooO0ooOooO00o = ((oO0OoO0.OooOOOO) interfaceC32620Oooo00O).o000000O().OooO00o(classId)) != null) {
                return c33238OooO0ooOooO00o;
            }
        }
        return null;
    }

    public void OooO0O0(Object obj, String str) {
        ((ArrayList) this.f114251OooO0O0).add(str + "=" + obj);
    }

    public String toString() {
        switch (this.f114250OooO00o) {
            case 0:
                return ((ArrayList) this.f114251OooO0O0).toString();
            default:
                return super.toString();
        }
    }

    public C31998OoooOoO() {
        this.f114250OooO00o = 0;
        this.f114251OooO0O0 = new ArrayList();
    }
}
