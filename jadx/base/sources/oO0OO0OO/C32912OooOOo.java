package oO0OO0OO;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;
import java.io.IOException;
import oOo00OoO.C34524OooO0Oo;

/* JADX INFO: renamed from: oO0OO0OO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32912OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f118740OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO000OoO.OooO0OO f118741OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f118742OooO0OO = 65535;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f118743OooO0Oo = new OooO0O0(0, 65535, null);

    /* JADX INFO: renamed from: oO0OO0OO.OooOOo$OooO00o */
    public interface OooO00o {
        void OooO0Oo(int i);
    }

    /* JADX INFO: renamed from: oO0OO0OO.OooOOo$OooO0O0 */
    public final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f118745OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f118746OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f118747OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO00o f118749OooO0o0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C34524OooO0Oo f118744OooO00o = new C34524OooO0Oo();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f118748OooO0o = false;

        public OooO0O0(int i, int i2, OooO00o oooO00o) {
            this.f118745OooO0O0 = i;
            this.f118746OooO0OO = i2;
            this.f118749OooO0o0 = oooO00o;
        }

        public final int OooO00o(int i) {
            if (i <= 0 || Integer.MAX_VALUE - i >= this.f118746OooO0OO) {
                int i2 = this.f118746OooO0OO + i;
                this.f118746OooO0OO = i2;
                return i2;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f118745OooO0O0);
        }

        public final void OooO0O0(int i, boolean z, C34524OooO0Oo c34524OooO0Oo) {
            do {
                C32912OooOOo c32912OooOOo = C32912OooOOo.this;
                int iMin = Math.min(i, c32912OooOOo.f118741OooO0O0.o0000OO0());
                int i2 = -iMin;
                c32912OooOOo.f118743OooO0Oo.OooO00o(i2);
                OooO00o(i2);
                try {
                    c32912OooOOo.f118741OooO0O0.o000O0O0(c34524OooO0Oo.f123723OooOo == ((long) iMin) && z, this.f118745OooO0O0, c34524OooO0Oo, iMin);
                    this.f118749OooO0o0.OooO0Oo(iMin);
                    i -= iMin;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } while (i > 0);
        }

        public final void OooO0OO(int i, C32913OooO0Oo c32913OooO0Oo) {
            int i2 = this.f118746OooO0OO;
            C32912OooOOo c32912OooOOo = C32912OooOOo.this;
            int iMin = Math.min(i, Math.min(i2, c32912OooOOo.f118743OooO0Oo.f118746OooO0OO));
            int i3 = 0;
            while (true) {
                C34524OooO0Oo c34524OooO0Oo = this.f118744OooO00o;
                long j = c34524OooO0Oo.f123723OooOo;
                if (j <= 0 || iMin <= 0) {
                    return;
                }
                if (iMin >= j) {
                    int i4 = (int) j;
                    i3 += i4;
                    OooO0O0(i4, this.f118748OooO0o, c34524OooO0Oo);
                } else {
                    i3 += iMin;
                    OooO0O0(iMin, false, c34524OooO0Oo);
                }
                c32913OooO0Oo.f118751OooO00o++;
                iMin = Math.min(i - i3, Math.min(this.f118746OooO0OO, c32912OooOOo.f118743OooO0Oo.f118746OooO0OO));
            }
        }
    }

    /* JADX INFO: renamed from: oO0OO0OO.OooOOo$OooO0OO */
    public interface OooO0OO {
        OooO0O0[] OooO00o();
    }

    /* JADX INFO: renamed from: oO0OO0OO.OooOOo$OooO0Oo, reason: case insensitive filesystem */
    public static final class C32913OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f118751OooO00o;
    }

    public C32912OooOOo(OooO oooO, oO0OO0OO.OooO0O0 oooO0O0) {
        this.f118740OooO00o = (OooO0OO) Preconditions.checkNotNull(oooO, NotificationCompat.CATEGORY_TRANSPORT);
        this.f118741OooO0O0 = (oO000OoO.OooO0OO) Preconditions.checkNotNull(oooO0O0, "frameWriter");
    }

    public final void OooO00o(boolean z, OooO0O0 oooO0O0, C34524OooO0Oo c34524OooO0Oo, boolean z2) {
        Preconditions.checkNotNull(c34524OooO0Oo, "source");
        int iMin = Math.min(oooO0O0.f118746OooO0OO, C32912OooOOo.this.f118743OooO0Oo.f118746OooO0OO);
        C34524OooO0Oo c34524OooO0Oo2 = oooO0O0.f118744OooO00o;
        boolean z3 = c34524OooO0Oo2.f123723OooOo > 0;
        int i = (int) c34524OooO0Oo.f123723OooOo;
        if (z3 || iMin < i) {
            if (!z3 && iMin > 0) {
                oooO0O0.OooO0O0(iMin, false, c34524OooO0Oo);
            }
            c34524OooO0Oo2.write(c34524OooO0Oo, (int) c34524OooO0Oo.f123723OooOo);
            oooO0O0.f118748OooO0o = z | oooO0O0.f118748OooO0o;
        } else {
            oooO0O0.OooO0O0(i, z, c34524OooO0Oo);
        }
        if (z2) {
            try {
                this.f118741OooO0O0.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void OooO0O0(OooO0O0 oooO0O0, int i) {
        if (oooO0O0 == null) {
            this.f118743OooO0Oo.OooO00o(i);
            OooO0OO();
            return;
        }
        oooO0O0.OooO00o(i);
        C32913OooO0Oo c32913OooO0Oo = new C32913OooO0Oo();
        oooO0O0.OooO0OO(Math.min(oooO0O0.f118746OooO0OO, C32912OooOOo.this.f118743OooO0Oo.f118746OooO0OO), c32913OooO0Oo);
        if (c32913OooO0Oo.f118751OooO00o > 0) {
            try {
                this.f118741OooO0O0.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void OooO0OO() {
        /*
            r13 = this;
            oO0OO0OO.OooOOo$OooO0OO r0 = r13.f118740OooO00o
            oO0OO0OO.OooOOo$OooO0O0[] r1 = r0.OooO00o()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            oO0OO0OO.OooOOo$OooO0O0 r2 = r13.f118743OooO0Oo
            int r2 = r2.f118746OooO0OO
            int r3 = r1.length
        L12:
            r4 = 0
            if (r3 <= 0) goto L66
            if (r2 <= 0) goto L66
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L22:
            if (r7 >= r3) goto L64
            if (r2 <= 0) goto L64
            r8 = r1[r7]
            int r9 = r8.f118746OooO0OO
            oOo00OoO.OooO0Oo r10 = r8.f118744OooO00o
            long r11 = r10.f123723OooOo
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f118747OooO0Oo
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4a
            int r11 = r8.f118747OooO0Oo
            int r11 = r11 + r9
            r8.f118747OooO0Oo = r11
            int r2 = r2 - r9
        L4a:
            int r9 = r8.f118746OooO0OO
            long r10 = r10.f123723OooOo
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f118747OooO0Oo
            int r9 = r9 - r10
            if (r9 <= 0) goto L61
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L61:
            int r7 = r7 + 1
            goto L22
        L64:
            r3 = r6
            goto L12
        L66:
            oO0OO0OO.OooOOo$OooO0Oo r1 = new oO0OO0OO.OooOOo$OooO0Oo
            r1.<init>()
            oO0OO0OO.OooOOo$OooO0O0[] r0 = r0.OooO00o()
            int r2 = r0.length
            r3 = r4
        L71:
            if (r3 >= r2) goto L7f
            r5 = r0[r3]
            int r6 = r5.f118747OooO0Oo
            r5.OooO0OO(r6, r1)
            r5.f118747OooO0Oo = r4
            int r3 = r3 + 1
            goto L71
        L7f:
            int r0 = r1.f118751OooO00o
            if (r0 <= 0) goto L90
            oO000OoO.OooO0OO r0 = r13.f118741OooO0O0     // Catch: java.io.IOException -> L89
            r0.flush()     // Catch: java.io.IOException -> L89
            return
        L89:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oO0OO0OO.C32912OooOOo.OooO0OO():void");
    }
}
