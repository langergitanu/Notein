package ooo0o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import oO0O0o0O.C32718OooO0O0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33479OooO0o;
import ooo0o.InterfaceC35196OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ooo0o.OooO00o<Object, Object> f126322OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ HashMap<C35197OooOOoo, List<Object>> f126323OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC35196OooOOo0 f126324OooO0OO;

    public final class OooO00o extends C20385OooO0O0 {
        public OooO00o(C35197OooOOoo c35197OooOOoo) {
            super(c35197OooOOoo);
        }

        public final C35192OooO0oo OooO0OO(int i, C33476OooO0O0 c33476OooO0O0, C32718OooO0O0 c32718OooO0O0) {
            C35197OooOOoo c35197OooOOoo = new C35197OooOOoo(this.f126326OooO00o.f126383OooO00o + '@' + i);
            OooO0O0 oooO0O0 = OooO0O0.this;
            List<Object> arrayList = oooO0O0.f126323OooO0O0.get(c35197OooOOoo);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                oooO0O0.f126323OooO0O0.put(c35197OooOOoo, arrayList);
            }
            return oooO0O0.f126322OooO00o.OooOOo(c33476OooO0O0, c32718OooO0O0, arrayList);
        }
    }

    /* JADX INFO: renamed from: ooo0o.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class C20385OooO0O0 implements InterfaceC35196OooOOo0.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C35197OooOOoo f126326OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<Object> f126327OooO0O0 = new ArrayList<>();

        public C20385OooO0O0(C35197OooOOoo c35197OooOOoo) {
            this.f126326OooO00o = c35197OooOOoo;
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO0OO
        public final void OooO00o() {
            ArrayList<Object> arrayList = this.f126327OooO0O0;
            if (arrayList.isEmpty()) {
                return;
            }
            OooO0O0.this.f126323OooO0O0.put(this.f126326OooO00o, arrayList);
        }

        @Override // ooo0o.InterfaceC35196OooOOo0.OooO0OO
        public final InterfaceC35196OooOOo0.OooO00o OooO0O0(C33476OooO0O0 c33476OooO0O0, C32718OooO0O0 c32718OooO0O0) {
            return OooO0O0.this.f126322OooO00o.OooOOo(c33476OooO0O0, c32718OooO0O0, this.f126327OooO0O0);
        }
    }

    public OooO0O0(ooo0o.OooO00o oooO00o, HashMap map, InterfaceC35196OooOOo0 interfaceC35196OooOOo0, HashMap map2) {
        this.f126322OooO00o = oooO00o;
        this.f126323OooO0O0 = map;
        this.f126324OooO0OO = interfaceC35196OooOOo0;
    }

    public final OooO00o OooO00o(C33479OooO0o name, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        String strOooO0O0 = name.OooO0O0();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0O0, "name.asString()");
        return new OooO00o(new C35197OooOOoo(strOooO0O0.concat(str)));
    }
}
