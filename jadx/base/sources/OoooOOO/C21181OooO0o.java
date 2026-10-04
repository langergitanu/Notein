package OoooOOO;

import OoooOOO.C21180OooO0Oo;
import OoooOOO.InterfaceC21182OooO0o0;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: OoooOOO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21181OooO0o implements InterfaceC21182OooO0o0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C21183OooO0oO f61437OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f61438OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C21180OooO0Oo.OooO00o f61439OooO0OO;

    public C21181OooO0o(C21183OooO0oO c21183OooO0oO, String str, C21180OooO0Oo.OooO00o oooO00o) {
        this.f61437OooO00o = c21183OooO0oO;
        this.f61438OooO0O0 = str;
        this.f61439OooO0OO = oooO00o;
    }

    @Override // OoooOOO.InterfaceC21182OooO0o0.OooO00o
    public final void unregister() {
        C21183OooO0oO c21183OooO0oO = this.f61437OooO00o;
        LinkedHashMap linkedHashMap = c21183OooO0oO.f61442OooO0OO;
        String str = this.f61438OooO0O0;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove(this.f61439OooO0OO);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c21183OooO0oO.f61442OooO0OO.put(str, list);
    }
}
