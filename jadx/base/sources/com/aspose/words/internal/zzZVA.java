package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZVA {
    private static zzZYV<int[]> zz7b;
    private zzJO zz7a;

    static {
        zzZYV<int[]> zzzyv = new zzZYV<>();
        zz7b = zzzyv;
        zzzyv.add(3656, new int[]{63242, 63237, 63251});
        zz7b.add(3657, new int[]{63243, 63238, 63252});
        zz7b.add(3658, new int[]{63244, 63239, 63253});
        zz7b.add(3659, new int[]{63245, 63240, 63254});
        zz7b.add(3660, new int[]{63246, 63241, 63255});
        zz7b.add(3633, new int[]{63248});
        zz7b.add(3636, new int[]{63233});
        zz7b.add(3637, new int[]{63234});
        zz7b.add(3638, new int[]{63235});
        zz7b.add(3639, new int[]{63236});
        zz7b.add(3655, new int[]{63250});
        zz7b.add(3661, new int[]{63249});
        zz7b.add(3640, new int[]{63256});
        zz7b.add(3641, new int[]{63257});
        zz7b.add(3642, new int[]{63258});
        zz7b.add(3597, new int[]{63247});
        zz7b.add(3600, new int[]{63232});
    }

    public zzZVA(zzZXH zzzxh) {
        this.zz7a = zzzxh.zzZ(false, false, true);
    }

    private void add(int i) {
        int iZzWP = this.zz7a.zzWP(i);
        int[] iArrZzRS = zzRS(i);
        if (iArrZzRS != null) {
            for (int i2 : iArrZzRS) {
                zzZq(i2, iZzWP);
            }
        }
    }

    private void zzB(int i, boolean z) {
        if (i == 3635) {
            zzB(3661, z);
            zzB(3634, z);
        } else if (i == 3763) {
            zzB(3789, z);
            zzB(3762, z);
        }
        if (z && i <= 65535) {
            i = zzY7.zzW((char) i);
        }
        add(i);
    }

    private static int[] zzRS(int i) {
        return zz7b.get(i);
    }

    private void zzZq(int i, int i2) {
        if (this.zz7a.zzPl().zzpP().zzSw(i)) {
            this.zz7a.zzWP(i);
        } else {
            this.zz7a.zzg(i, i2);
        }
    }

    public final void zzO(String str, boolean z) {
        zzZYE zzzye = new zzZYE(str);
        while (zzzye.hasNext()) {
            zzB(zzzye.next().intValue(), z);
        }
    }

    public final zzJO zzn8() {
        return this.zz7a;
    }
}
