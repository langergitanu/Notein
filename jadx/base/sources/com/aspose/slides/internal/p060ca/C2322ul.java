package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ul */
/* JADX INFO: loaded from: classes3.dex */
public class C2322ul {

    /* JADX INFO: renamed from: ks */
    private C2224o2 f8030ks;

    /* JADX INFO: renamed from: rv */
    private char f8034rv;

    /* JADX INFO: renamed from: x6 */
    private char f8042x6;

    /* JADX INFO: renamed from: x1 */
    private final C6765kp f8041x1 = new C6765kp();

    /* JADX INFO: renamed from: ar */
    private final List<Long> f8019ar = new List<>();

    /* JADX INFO: renamed from: um */
    private final List<Integer> f8037um = new List<>();

    /* JADX INFO: renamed from: k4 */
    private int f8028k4 = 0;

    /* JADX INFO: renamed from: kk */
    private char f8029kk = 0;

    /* JADX INFO: renamed from: to */
    private int f8035to = 0;

    /* JADX INFO: renamed from: du */
    private char f8022du = 0;

    /* JADX INFO: renamed from: h4 */
    private int f8025h4 = 0;

    /* JADX INFO: renamed from: m9 */
    private char f8031m9 = 0;

    /* JADX INFO: renamed from: dy */
    private int f8023dy = 0;

    /* JADX INFO: renamed from: c5 */
    private char f8020c5 = 0;

    /* JADX INFO: renamed from: jd */
    private int f8027jd = 0;

    /* JADX INFO: renamed from: ck */
    private char f8021ck = 0;

    /* JADX INFO: renamed from: fa */
    private int f8024fa = 0;

    /* JADX INFO: renamed from: up */
    private long f8038up = 0;

    /* JADX INFO: renamed from: yj */
    private int f8043yj = -1;

    /* JADX INFO: renamed from: ne */
    private int f8032ne = 0;

    /* JADX INFO: renamed from: ix */
    private long f8026ix = 0;

    /* JADX INFO: renamed from: u4 */
    private char f8036u4 = 0;

    /* JADX INFO: renamed from: uz */
    private char f8039uz = 0;

    /* JADX INFO: renamed from: wl */
    private int f8040wl = 0;

    /* JADX INFO: renamed from: qq */
    private long f8033qq = 0;

    public C2322ul(C2224o2 c2224o2, int i) {
        this.f8030ks = c2224o2;
        for (int i2 = 0; i2 < i; i2++) {
            this.f8037um.addItem(-1);
            this.f8019ar.addItem(Long.valueOf(C7019kk.m27461m9(0, 9)));
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m11490c5() {
        char c = this.f8042x6;
        if (c != 0) {
            m11498k4(c, this.f8032ne, this.f8026ix);
        }
    }

    /* JADX INFO: renamed from: ck */
    public final void m11491ck() {
        char c = this.f8039uz;
        if (c != 0) {
            m11498k4(c, this.f8040wl, this.f8033qq);
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m11492du() {
        char c = this.f8031m9;
        if (c != 0) {
            m11498k4(c, this.f8023dy, this.f8038up);
        }
    }

    /* JADX INFO: renamed from: dy */
    public final void m11493dy() {
        char c = this.f8034rv;
        if (c != 0) {
            m11498k4(c, this.f8032ne, this.f8026ix);
        }
    }

    /* JADX INFO: renamed from: fa */
    public final List<Long> m11494fa() {
        return this.f8019ar;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m11495h4() {
        char c = this.f8020c5;
        if (c != 0) {
            m11498k4(c, this.f8027jd, this.f8038up);
        }
    }

    /* JADX INFO: renamed from: jd */
    public final void m11496jd() {
        char c = this.f8036u4;
        if (c != 0) {
            m11498k4(c, this.f8040wl, this.f8033qq);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11497k4() {
        this.f8021ck = (char) 0;
        this.f8020c5 = (char) 0;
        this.f8031m9 = (char) 0;
        this.f8022du = (char) 0;
        this.f8029kk = (char) 0;
        this.f8043yj = -1;
        this.f8042x6 = (char) 0;
        this.f8034rv = (char) 0;
        this.f8039uz = (char) 0;
        this.f8036u4 = (char) 0;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11500kk() {
        char c = this.f8029kk;
        if (c != 0) {
            this.f8043yj = this.f8028k4;
            m11498k4(c, this.f8035to, this.f8038up);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final void m11502m9() {
        char c = this.f8021ck;
        if (c != 0) {
            m11498k4(c, this.f8024fa, this.f8038up);
        }
    }

    /* JADX INFO: renamed from: to */
    public final void m11503to() {
        char c = this.f8022du;
        if (c != 0) {
            m11498k4(c, this.f8025h4, this.f8038up);
        }
    }

    /* JADX INFO: renamed from: up */
    public final List<Integer> m11504up() {
        return this.f8037um;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11505x1() {
        int i;
        C2224o2 c2224o2 = this.f8030ks;
        if (c2224o2 == null || (i = this.f8043yj) < 0) {
            return;
        }
        c2224o2.m11184k4(this.f8028k4, i);
    }

    /* JADX INFO: renamed from: yj */
    public final String m11507yj() {
        return this.f8041x1.toString();
    }

    /* JADX INFO: renamed from: x1 */
    private void m11489x1(char c, int i, long j) {
        if (C2163kn.m10935ck(j)) {
            this.f8021ck = c;
            this.f8024fa = i;
            return;
        }
        int i2 = (int) (j & 3145728);
        if (i2 == 0) {
            this.f8020c5 = c;
            this.f8027jd = i;
            return;
        }
        if (i2 == 1048576) {
            this.f8031m9 = c;
            this.f8023dy = i;
        } else if (i2 == 2097152) {
            this.f8022du = c;
            this.f8025h4 = i;
        } else {
            if (i2 != 3145728) {
                return;
            }
            this.f8029kk = c;
            this.f8035to = i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11498k4(char c, int i, long j) {
        this.f8041x1.m26780k4(c);
        m11487k4(this.f8028k4, i);
        m11488k4(this.f8028k4, j & 4294967295L);
        this.f8028k4++;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11501kk(C2163kn c2163kn, char c, int i, long j) {
        long jM10949k4 = c2163kn.m10949k4(c);
        this.f8040wl = i;
        this.f8033qq = j;
        if (C2163kn.m10941kk(jM10949k4)) {
            int i2 = (int) (3145728 & jM10949k4);
            if (i2 == 1048576) {
                this.f8036u4 = c;
            } else {
                if (i2 != 2097152) {
                    return;
                }
                this.f8039uz = c;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m11487k4(int i, int i2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException(C14113y2.m67402k4("parameter outIndexParam = {0} must be greater than 0", Integer.valueOf(i)));
        }
        if (i > this.f8037um.size() - 1) {
            int size = (i + 1) - this.f8037um.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.f8037um.addItem(-1);
            }
        }
        this.f8037um.set_Item(i, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11506x1(C2163kn c2163kn, char c, int i, long j) {
        long jM10949k4 = c2163kn.m10949k4(c);
        this.f8032ne = i;
        this.f8026ix = j;
        if (C2163kn.m10945x1(jM10949k4)) {
            int i2 = (int) (3145728 & jM10949k4);
            if (i2 == 0) {
                this.f8042x6 = c;
            } else {
                if (i2 != 1048576) {
                    return;
                }
                this.f8034rv = c;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m11488k4(int i, long j) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException(C14113y2.m67402k4("parameter outIndexParam = {0} must be greater than 0", Integer.valueOf(i)));
        }
        if (i > this.f8019ar.size() - 1) {
            int size = (i + 1) - this.f8019ar.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f8019ar.addItem(Long.valueOf(C7019kk.m27461m9(0, 9)));
            }
        }
        this.f8019ar.set_Item(i, Long.valueOf(C7019kk.m27461m9(Long.valueOf(j), 10)));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m11499k4(C2163kn c2163kn, char c, int i, long j) {
        long jM10949k4 = c2163kn.m10949k4(c);
        this.f8038up = j;
        if (!C2163kn.m10934c5(jM10949k4)) {
            return false;
        }
        if (!C2163kn.m10940jd(jM10949k4)) {
            m11489x1(c, i, jM10949k4);
            return true;
        }
        long[] jArrM10950k4 = c2163kn.m10950k4(jM10949k4);
        for (int i2 = 0; i2 < 3; i2++) {
            long j2 = jArrM10950k4[i2];
            if ((4294967295L & j2) == 0) {
                return true;
            }
            char c2 = (char) j2;
            m11489x1(c2, i, c2163kn.m10949k4(c2));
        }
        return true;
    }
}
