package o00Ooo;

import androidx.compose.p002ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o00Ooo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25085OooOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final LinkedHashMap f85139OooO00o = new LinkedHashMap();

    /* JADX INFO: renamed from: o00Ooo.OooOo0$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f85140OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f85141OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f85142OooO0OO;

        public OooO00o(long j, long j2, boolean z) {
            this.f85140OooO00o = j;
            this.f85141OooO0O0 = j2;
            this.f85142OooO0OO = z;
        }
    }

    public final C25078OooO0oO OooO00o(C25086OooOo0O c25086OooOo0O, AndroidComposeView androidComposeView) {
        boolean z;
        long j;
        long j2;
        ArrayList arrayList = (ArrayList) c25086OooOo0O.f85155OooO00o;
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C25087OooOo0o c25087OooOo0o = (C25087OooOo0o) arrayList.get(i);
            LinkedHashMap linkedHashMap2 = this.f85139OooO00o;
            OooO00o oooO00o = (OooO00o) linkedHashMap2.get(new C25084OooOOoo(c25087OooOo0o.f85158OooO00o));
            if (oooO00o == null) {
                j2 = c25087OooOo0o.f85159OooO0O0;
                j = c25087OooOo0o.f85161OooO0Oo;
                z = false;
            } else {
                long jOooOo0o = androidComposeView.OooOo0o(oooO00o.f85141OooO0O0);
                long j3 = oooO00o.f85140OooO00o;
                z = oooO00o.f85142OooO0OO;
                j = jOooOo0o;
                j2 = j3;
            }
            long j4 = c25087OooOo0o.f85158OooO00o;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            linkedHashMap.put(new C25084OooOOoo(j4), new OooOo00(j4, c25087OooOo0o.f85159OooO0O0, c25087OooOo0o.f85161OooO0Oo, c25087OooOo0o.f85163OooO0o0, c25087OooOo0o.f85162OooO0o, j2, j, z, c25087OooOo0o.f85164OooO0oO, c25087OooOo0o.f85157OooO, c25087OooOo0o.f85166OooOO0));
            long j5 = c25087OooOo0o.f85158OooO00o;
            boolean z2 = c25087OooOo0o.f85163OooO0o0;
            if (z2) {
                linkedHashMap2.put(new C25084OooOOoo(j5), new OooO00o(c25087OooOo0o.f85159OooO0O0, c25087OooOo0o.f85160OooO0OO, z2));
            } else {
                linkedHashMap2.remove(new C25084OooOOoo(j5));
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new C25078OooO0oO(linkedHashMap, c25086OooOo0O);
    }
}
