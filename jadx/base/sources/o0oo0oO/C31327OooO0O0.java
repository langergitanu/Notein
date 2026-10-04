package o0oo0oO;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: o0oo0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31327OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f111866OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f111861OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f111862OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f111863OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f111864OooO0Oo = 4;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f111865OooO0o = new ArrayList();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f111867OooO0oO = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap f111868OooO0oo = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final HashMap f111860OooO = new HashMap();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f111869OooOO0 = new ArrayList();

    public static int OooO0OO(int i, byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 << 8) | (bArr[i3] & 255);
        }
        return i2;
    }

    public final void OooO00o(String str, byte[] bArr) {
        this.f111868OooO0oo.put(str, bArr.clone());
        int i = 0;
        for (byte b : bArr) {
            i = (i << 8) | ((b + 256) % 256);
        }
        this.f111867OooO0oO.put(Integer.valueOf(i), str);
        " ".equals(str);
    }

    public final int OooO0O0(int i) {
        Integer num = (Integer) this.f111860OooO.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        for (C31326OooO00o c31326OooO00o : this.f111869OooOO0) {
            char c = (char) i;
            char c2 = c31326OooO00o.f111857OooO00o;
            int i2 = (c2 > c || c > c31326OooO00o.f111858OooO0O0) ? -1 : (c - c2) + c31326OooO00o.f111859OooO0OO;
            if (i2 != -1) {
                return i2;
            }
        }
        return 0;
    }

    public final String toString() {
        return this.f111861OooO00o;
    }
}
