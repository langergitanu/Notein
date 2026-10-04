package o00oOoo0;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import o00o0o.AbstractC25434OooO00o;

/* JADX INFO: renamed from: o00oOoo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25629OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25628OooO0OO f87474OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f87475OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AbstractC25434OooO00o<Bitmap> f87476OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList f87477OooO0Oo;

    public C25629OooO0Oo(C25630OooO0o0 c25630OooO0o0) {
        ArrayList arrayList;
        InterfaceC25628OooO0OO interfaceC25628OooO0OO = c25630OooO0o0.f87478OooO00o;
        interfaceC25628OooO0OO.getClass();
        this.f87474OooO00o = interfaceC25628OooO0OO;
        this.f87476OooO0OO = AbstractC25434OooO00o.OooOOO0(c25630OooO0o0.f87479OooO0O0);
        ArrayList arrayList2 = c25630OooO0o0.f87480OooO0OO;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(AbstractC25434OooO00o.OooOOO0((AbstractC25434OooO00o) it.next()));
            }
            arrayList = arrayList3;
        }
        this.f87477OooO0Oo = arrayList;
        this.f87475OooO0O0 = c25630OooO0o0.f87481OooO0Oo;
    }
}
