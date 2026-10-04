package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzTR extends zz0V {
    private boolean zzRA;
    private zzY[] zzRB;
    private zzZ[] zzRC;
    private String zzRD;
    private zzH0[] zzRy;
    private int[] zzRz;
    private zzJD zzXS;

    public static class zzY {
        private zzH0 zzXQ;
        private boolean zzZs;

        public zzY(zzH0 zzh0) {
            this.zzXQ = zzh0;
        }

        public final void zzO(boolean z) {
            this.zzZs = z;
        }

        public final zzH0 zzTV() {
            return this.zzXQ;
        }

        public final boolean zzZF() {
            return this.zzZs;
        }
    }

    public zzTR(zzZZR zzzzr, zzJC zzjc, String str, int i, boolean z) {
        super(zzzzr);
        this.zzRy = new zzH0[3];
        this.zzXS = new zzJD(zzjc);
        this.zzRD = str;
        this.zzRC = new zzZ[i];
        this.zzRB = new zzY[i];
        this.zzRA = z;
    }

    private zzCW zzE(String str) {
        return new zzCW(zzZKN.format("A template for chart '{0}' is not well-formed. {1}", this.zzRD, str));
    }

    private int[] zzU5() {
        zzH0 zzh0;
        if (this.zzRz == null) {
            int i = zzY(this.zzRy) ? 8 : 0;
            boolean zZzX = zzX(this.zzRy);
            if (zZzX) {
                i |= 4;
            }
            int iZzZ = (zZzX || (zzh0 = this.zzRy[0]) == null) ? 0 : zzZ(zzh0);
            this.zzRz = new int[this.zzRC.length];
            for (int i2 = 0; i2 < this.zzRz.length; i2++) {
                zzZ zzz = this.zzRC[i2];
                if (zzz != null) {
                    this.zzRz[i2] = zZzX ? i : (zzX(zzz.zzU3()) ? 4 : this.zzRy[0] == null ? zzZ(zzz.zzU3()[0]) : iZzZ) | i;
                }
            }
        }
        return this.zzRz;
    }

    private boolean zzU6() {
        for (zzZ zzz : this.zzRC) {
            if (zzz != null && zzY(zzz.zzU3())) {
                return true;
            }
        }
        return false;
    }

    private boolean zzU7() {
        for (zzY zzy : this.zzRB) {
            if (zzy == null || !zzy.zzZF()) {
                return true;
            }
        }
        return false;
    }

    private void zzU8() throws Exception {
        for (zzY zzy : this.zzRB) {
            if (zzy != null) {
                Object objZzx = zzy.zzTV().zzx();
                zzy.zzO(objZzx != null && ((Boolean) objZzx).booleanValue());
            }
        }
    }

    private static boolean zzX(zzH0[] zzh0Arr) {
        for (int i = 1; i < 3; i++) {
            if (zzh0Arr[i] != null) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzY(zzH0[] zzh0Arr) {
        for (int i = 0; i < 3; i++) {
            if (zzh0Arr[i] != null) {
                return true;
            }
        }
        return false;
    }

    private zzZ zzYZ(int i) {
        zzZ zzz = this.zzRC[i];
        if (zzz != null) {
            return zzz;
        }
        zzZ zzz2 = new zzZ((byte) 0);
        this.zzRC[i] = zzz2;
        return zzz2;
    }

    public final void zzS(int i, boolean z) {
        zzYZ(i).zzr(z);
    }

    public final void zzT(int i, boolean z) {
        zzYZ(i).zzs(z);
    }

    public final void zzU(int i, boolean z) {
        zzYZ(i).zzt(z);
    }

    public final void zzU4() {
        boolean z = false;
        for (zzZ zzz : this.zzRC) {
            if (zzz != null) {
                boolean z2 = false;
                for (int i = 2; i >= 0; i--) {
                    boolean z3 = this.zzRy[i] != null;
                    boolean z4 = zzz.zzU3()[i] != null;
                    zzH0 zzh0 = z3 ? this.zzRy[i] : zzz.zzU3()[i];
                    if ((z3 || z4) && i > 0) {
                        z2 = true;
                    }
                    if (z3 && z4) {
                        throw zzE(zzZKN.format("An x-value expression{0} defined for the whole chart can not be redefined for an individual series.", zzZ(z2, i)));
                    }
                    if ((z2 || i == 0) && !z3 && !z4) {
                        throw zzE(zzZKN.format("An x-value expression{0} is not defined for a series.", zzZ(z2, i)));
                    }
                    if (z2 && !zzX(zzh0)) {
                        throw zzE("A multilevel x-value expression must return a string value.");
                    }
                }
                if (zzz.zzTX() != null) {
                    if (this.zzRA) {
                        throw zzE("A point color expression cannot be defined for a series in a histogram chart.");
                    }
                    if (zzz.zzTY()) {
                        throw zzE("A point color expression cannot be defined for a box & whisker series.");
                    }
                }
                if (!this.zzRA && zzz.zzU2() == null) {
                    throw zzE("An y-value expression is not defined for a series.");
                }
                if (this.zzRA && zzz.zzU2() != null) {
                    throw zzE("An y-value expression can not be defined for a series in a histogram chart.");
                }
                if (zzz.zzU0() && zzz.zzU1() == null) {
                    throw zzE("A bubble-size expression is not defined for a bubble series.");
                }
                if (!zzz.zzU0() && zzz.zzU1() != null) {
                    throw zzE("A bubble-size expression can not be defined for a non-bubble series.");
                }
                if (zzz.zzTZ() || this.zzRA) {
                    String str = this.zzRA ? "histogram" : "scatter";
                    if (z2) {
                        throw zzE(zzZKN.format("A multilevel x-value expression cannot be defined for a {0} series.", str));
                    }
                    zzH0 zzh02 = this.zzRy[0];
                    if (zzh02 == null) {
                        zzh02 = zzz.zzU3()[0];
                    }
                    if (!zzY(zzh02)) {
                        throw zzE(zzZKN.format("An x-value expression for a {0} series must return a numeric value.", str));
                    }
                }
                z = true;
            }
        }
        if (!z) {
            throw zzE("Found no series with values calculated from expressions.");
        }
    }

    public final void zzV(int i, zzH0 zzh0) {
        if (this.zzRB[i] != null) {
            throw zzE("A removal flag expression cannot be defined multiple times for a single series.");
        }
        if (!zzh0.zzs() && zzh0.zzw() != Boolean.TYPE) {
            throw zzE("A removal flag expression must return a Boolean value.");
        }
        this.zzRB[i] = new zzY(zzh0);
    }

    public final void zzW(int i, zzH0 zzh0) {
        zzZ zzzZzYZ = zzYZ(i);
        if (zzzZzYZ.zzTX() != null) {
            throw zzE("The point color expression cannot be defined multiple times for a single series.");
        }
        zzzZzYZ.zzZ(new zzT5(zzh0));
    }

    public final zzGW zzYB() {
        return this.zzXS;
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        boolean z;
        zzfs.zzZ(zzzzr.zzEW(), zzU5());
        zzU8();
        if (zzU7()) {
            Iterator it = this.zzXS.iterator();
            z = false;
            while (it.hasNext()) {
                it.next();
                zzZ(zzfs);
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            zzY(zzfs);
            zzfs.zzET();
            zzX(zzfs);
        } else {
            zzfs.zzES();
        }
        zzfs.zzER();
        return 0;
    }

    public static class zzZ {
        private boolean zzRq;
        private boolean zzRr;
        private boolean zzRs;
        private zzT5 zzRt;
        private zzT5 zzRu;
        private zzH0 zzRv;
        private zzH0 zzRw;
        private zzH0[] zzRx;

        private zzZ() {
            this.zzRx = new zzH0[3];
        }

        public final zzT5 zzTW() {
            return this.zzRt;
        }

        public final zzT5 zzTX() {
            return this.zzRu;
        }

        public final boolean zzTY() {
            return this.zzRq;
        }

        public final boolean zzTZ() {
            return this.zzRr;
        }

        public final boolean zzU0() {
            return this.zzRs;
        }

        public final zzH0 zzU1() {
            return this.zzRv;
        }

        public final zzH0 zzU2() {
            return this.zzRw;
        }

        public final zzH0[] zzU3() {
            return this.zzRx;
        }

        public final void zzV(zzH0 zzh0) {
            this.zzRv = zzh0;
        }

        public final void zzW(zzH0 zzh0) {
            this.zzRw = zzh0;
        }

        public final void zzY(zzT5 zzt5) {
            this.zzRt = zzt5;
        }

        public final void zzZ(zzT5 zzt5) {
            this.zzRu = zzt5;
        }

        public final void zzr(boolean z) {
            this.zzRq = z;
        }

        public final void zzs(boolean z) {
            this.zzRr = z;
        }

        public final void zzt(boolean z) {
            this.zzRs = z;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private void zzX(zzFS zzfs) {
        for (int length = this.zzRB.length - 1; length >= 0; length--) {
            zzY zzy = this.zzRB[length];
            if (zzy != null && zzy.zzZF()) {
                zzfs.zzWa(length);
            }
        }
    }

    private void zzY(zzFS zzfs) throws Exception {
        int i = 0;
        while (true) {
            zzZ[] zzzArr = this.zzRC;
            if (i >= zzzArr.length) {
                return;
            }
            zzZ zzz = zzzArr[i];
            if (zzz != null && zzz.zzTW() != null) {
                zzfs.zza(i, zzz.zzTW().zzTq());
            }
            i++;
        }
    }

    private static boolean zzX(zzH0 zzh0) {
        return zzh0.zzs() || zzh0.getType() == String.class;
    }

    private static boolean zzY(zzH0 zzh0) {
        return zzh0.zzs() || zzh0.zzw() == Double.TYPE;
    }

    public final void zzX(int i, zzH0 zzh0) {
        zzZ zzzZzYZ = zzYZ(i);
        if (zzzZzYZ.zzTW() == null) {
            zzzZzYZ.zzY(new zzT5(zzh0));
            return;
        }
        throw zzE("The series color expression cannot be defined multiple times for a single series.");
    }

    public final void zzY(int i, zzH0 zzh0) {
        zzZ zzzZzYZ = zzYZ(i);
        if (zzzZzYZ.zzU1() == null) {
            if (zzY(zzh0)) {
                zzzZzYZ.zzV(zzh0);
                return;
            }
            throw zzE("A bubble-size expression must return a numeric value.");
        }
        throw zzE("A bubble-size expression cannot be defined multiple times for a single series.");
    }

    private void zzZ(zzFS zzfs) throws Exception {
        zzFS zzfs2;
        zzY zzy;
        int iZzTq;
        boolean zZzU6 = zzU6();
        Object objZzZ = !zZzU6 ? zzZ(this.zzRy, (Object[]) null) : null;
        Object[] objArrZzZ = !zZzU6 ? null : zzZ(this.zzRy);
        int i = 0;
        while (true) {
            zzZ[] zzzArr = this.zzRC;
            if (i >= zzzArr.length) {
                return;
            }
            zzZ zzz = zzzArr[i];
            if (zzz == null || ((zzy = this.zzRB[i]) != null && zzy.zzZF())) {
                zzfs2 = zzfs;
            } else {
                Object objZzZ2 = zZzU6 ? zzZ(zzz.zzU3(), objArrZzZ) : objZzZ;
                Object objZzx = !this.zzRA ? zzz.zzU2().zzx() : null;
                Object objZzx2 = zzz.zzU0() ? zzz.zzU1().zzx() : null;
                if (zzz.zzTX() != null) {
                    iZzTq = zzz.zzTX().zzTq();
                } else {
                    iZzTq = zzZQ1.zz2p;
                }
                zzfs2 = zzfs;
                zzfs2.zzZ(i, objZzZ2, objZzx, objZzx2, iZzTq);
            }
            i++;
            zzfs = zzfs2;
        }
    }

    private static Object[] zzZ(zzH0[] zzh0Arr) throws Exception {
        Object[] objArr = new Object[zzh0Arr.length];
        for (int i = 0; i < zzh0Arr.length; i++) {
            zzH0 zzh0 = zzh0Arr[i];
            if (zzh0 != null) {
                objArr[i] = zzh0.zzx();
            }
        }
        return objArr;
    }

    private Object zzZ(zzH0[] zzh0Arr, Object[] objArr) throws Exception {
        Object objZzx;
        ArrayList arrayList = null;
        for (int i = 2; i >= 0; i--) {
            zzH0 zzh0 = zzh0Arr[i];
            if (zzh0 != null) {
                objZzx = zzh0.zzx();
            } else if (this.zzRy[i] != null) {
                objZzx = objArr[i];
            } else {
                continue;
            }
            if (i == 0 && arrayList == null) {
                return objZzx;
            }
            if (arrayList == null) {
                arrayList = new ArrayList(i + 1);
            }
            arrayList.add(0, objZzx != null ? objZzx.toString() : null);
        }
        return arrayList.toArray(new String[0]);
    }

    private static int zzZ(zzH0 zzh0) {
        return zzY(zzh0) ? 2 : 1;
    }

    public final void zzZ(int i, zzH0 zzh0, int i2) {
        zzZ zzzZzYZ = zzYZ(i);
        if (zzzZzYZ.zzU3()[i2] != null) {
            throw zzE(zzZKN.format("An x-value expression{0} cannot be defined multiple times for a single series.", zzZ(i2 > 0, i2)));
        }
        zzzZzYZ.zzU3()[i2] = zzh0;
    }

    public final void zzZ(int i, zzH0 zzh0) {
        zzZ zzzZzYZ = zzYZ(i);
        if (zzzZzYZ.zzU2() == null) {
            if (zzY(zzh0)) {
                zzzZzYZ.zzW(zzh0);
                return;
            }
            throw zzE("An y-value expression must return a numeric value.");
        }
        throw zzE("An y-value expression cannot be defined multiple times for a single series.");
    }

    public final void zzZ(zzH0 zzh0, int i) {
        zzH0[] zzh0Arr = this.zzRy;
        if (zzh0Arr[i] != null) {
            throw zzE(zzZKN.format("A shared x-value expression{0} cannot be defined multiple times for a single chart.", zzZ(i > 0, i)));
        }
        zzh0Arr[i] = zzh0;
    }

    private static String zzZ(boolean z, int i) {
        if (z) {
            return zzZKN.format(" of the level {0}", Integer.valueOf(i + 1));
        }
        return "";
    }
}
