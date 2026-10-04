package o0O0o00;

import java.util.Comparator;
import java.util.HashMap;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o00.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C25968o000000o implements Comparator<InterfaceC31284OooO0O0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ HashMap f88666OooOo0o;

    public C25968o000000o(HashMap map) {
        this.f88666OooOo0o = map;
    }

    @Override // java.util.Comparator
    public final int compare(InterfaceC31284OooO0O0 interfaceC31284OooO0O0, InterfaceC31284OooO0O0 interfaceC31284OooO0O02) {
        int iCompareTo;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O03 = interfaceC31284OooO0O0;
        InterfaceC31284OooO0O0 interfaceC31284OooO0O04 = interfaceC31284OooO0O02;
        String layerId = interfaceC31284OooO0O03.getLayerId();
        String layerId2 = interfaceC31284OooO0O04.getLayerId();
        HashMap map = this.f88666OooOo0o;
        Integer num = (Integer) map.get(layerId);
        Integer num2 = (Integer) map.get(layerId2);
        if (num != null && num2 != null && (iCompareTo = num.compareTo(num2)) != 0) {
            return iCompareTo;
        }
        if (layerId.equals("none") && !layerId2.equals("none")) {
            return 1;
        }
        if (!layerId.equals("none") && layerId2.equals("none")) {
            return -1;
        }
        int iCompare = Long.compare(interfaceC31284OooO0O03.getCreationTime(), interfaceC31284OooO0O04.getCreationTime());
        return iCompare != 0 ? iCompare : interfaceC31284OooO0O03.getId().compareTo(interfaceC31284OooO0O04.getId());
    }
}
