package o0OoO0oo;

import com.orion.penkit.models.DrawResult;
import com.orion.penkit.models.HyperLinkInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32449OooOOoo;
import oO0O000o.InterfaceC32507OooOO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28686OooO0O0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101642OooOo0o;

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.f101642OooOo0o) {
            case 0:
                DrawResult result = (DrawResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                List<InterfaceC31284OooO0O0> newItemList = result.getNewItemList();
                if (newItemList.isEmpty()) {
                    z = true;
                } else {
                    List<InterfaceC31284OooO0O0> list = newItemList;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (!(((InterfaceC31284OooO0O0) it.next()) instanceof HyperLinkInfo)) {
                                z = true;
                            }
                        }
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("AutoAddPageStrategies");
                    z = false;
                    c20358OooO00o.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(newItemList.size(), "Only hyperlinks added (", " items), skipping auto add page"), new Object[0]);
                }
                return Boolean.valueOf(z);
            default:
                C32449OooOOoo it2 = (C32449OooOOoo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it2, "it");
                return it2.f116648OooOo0o + "/" + it2.f116647OooOo + "/" + it2.f116649OooOoO0;
        }
    }
}
