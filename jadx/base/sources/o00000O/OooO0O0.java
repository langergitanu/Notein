package o00000O;

import OooOOO0.AbstractC20449OooO0Oo;
import OooooOO.AbstractC21341OoooOO0;
import OooooOO.C21362o00oO0o;
import OooooOO.InterfaceC21342OoooOOO;
import java.util.ArrayList;
import o00ooOo0.InterfaceC25788OooO0O0;
import oo0o0Oo.C34682OooO0Oo;
import oo0o0Oo.C34683OooO0o;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0 implements InterfaceC25788OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f81209OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f81210OooO0O0 = 0;

    public static final void OooO0O0(C34682OooO0Oo c34682OooO0Oo, InterfaceC21342OoooOOO interfaceC21342OoooOOO, AbstractC21341OoooOO0 abstractC21341OoooOO0, float f, C21362o00oO0o c21362o00oO0o, o00000o0.OooO oooO, AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        ArrayList arrayList = c34682OooO0Oo.f124910OooO0oo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C34683OooO0o c34683OooO0o = (C34683OooO0o) arrayList.get(i);
            c34683OooO0o.f124911OooO00o.OooO0oo(interfaceC21342OoooOOO, abstractC21341OoooOO0, f, c21362o00oO0o, oooO, abstractC20449OooO0Oo);
            interfaceC21342OoooOOO.OooO0OO(0.0f, c34683OooO0o.f124911OooO00o.OooO0OO());
        }
    }

    @Override // o00ooOo0.InterfaceC25788OooO0O0
    public boolean OooO00o(String str) {
        System.loadLibrary(str);
        return true;
    }
}
