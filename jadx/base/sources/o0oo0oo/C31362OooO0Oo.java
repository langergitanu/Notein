package o0oo0oo;

import Oooo0oO.C21023OooO0Oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o0oo0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31362OooO0Oo implements InterfaceC31361OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f111974OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f111975OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f111976OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f111977OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f111979OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public HashMap f111978OooO0o = new HashMap();

    /* JADX INFO: renamed from: o0oo0oo.OooO0Oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f111980OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f111981OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final short f111982OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f111983OooO0Oo;

        public OooO00o(int i, int i2, short s, int i3) {
            this.f111980OooO00o = i;
            this.f111981OooO0O0 = i2;
            this.f111982OooO0OO = s;
            this.f111983OooO0Oo = i3;
        }
    }

    public static int[] OooO0Oo(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    @Override // o0oo0oo.InterfaceC31361OooO0OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList OooO00o(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f111977OooO0Oo;
            i2 = i >= iArr.length ? -1 : iArr[i];
        }
        if (i2 == -1) {
            return null;
        }
        if (i2 != Integer.MIN_VALUE) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(i2));
            return arrayList;
        }
        List list = (List) this.f111979OooO0o0.get(Integer.valueOf(i));
        if (list == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(list);
        Collections.sort(arrayList2);
        return arrayList2;
    }

    @Override // o0oo0oo.InterfaceC31361OooO0OO
    public final int OooO0O0(int i) {
        Integer num = (Integer) this.f111978OooO0o.get(Integer.valueOf(i));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void OooO0OO(int i) {
        this.f111977OooO0Oo = OooO0Oo(i + 1);
        for (Map.Entry entry : this.f111978OooO0o.entrySet()) {
            if (this.f111977OooO0Oo[((Integer) entry.getValue()).intValue()] == -1) {
                this.f111977OooO0Oo[((Integer) entry.getValue()).intValue()] = ((Integer) entry.getKey()).intValue();
            } else {
                HashMap map = this.f111979OooO0o0;
                List list = (List) map.get(entry.getValue());
                List list2 = list;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    map.put(entry.getValue(), arrayList);
                    arrayList.add(Integer.valueOf(this.f111977OooO0Oo[((Integer) entry.getValue()).intValue()]));
                    this.f111977OooO0Oo[((Integer) entry.getValue()).intValue()] = Integer.MIN_VALUE;
                    list2 = arrayList;
                }
                list2.add(entry.getKey());
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f111974OooO00o);
        sb.append(" ");
        return C21023OooO0Oo.OooO0OO("}", this.f111975OooO0O0, sb);
    }
}
