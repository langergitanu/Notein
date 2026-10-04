package o00o0OOo;

import java.util.Comparator;
import o00o0OOo.InterfaceC25411OooO0o0;

/* JADX INFO: renamed from: o00o0OOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25407OooO0O0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long timestamp = ((InterfaceC25411OooO0o0.OooO00o) obj).getTimestamp();
        long timestamp2 = ((InterfaceC25411OooO0o0.OooO00o) obj2).getTimestamp();
        if (timestamp < timestamp2) {
            return -1;
        }
        return timestamp2 == timestamp ? 0 : 1;
    }
}
