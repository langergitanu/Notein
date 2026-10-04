package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz4K {
    private static String[] zziQ = {"Arial", "Times New Roman"};
    private zz5D zziN;
    private zz4W zzkV;
    private zzZWJ zzxD;
    private HashMap<zzY, zz3Q> zziT = new HashMap<>();
    private zzZYT<zz2F> zzjL = new zzZYT<>();
    private ArrayList<zz4B> zziS = new ArrayList<>();
    private zzZYT<zz34> zzjJ = new zzZYT<>();
    private zzER<zz34> zzli = new zzER<>();
    private HashMap<zzZ, zz3O> zziR = new HashMap<>();
    private ArrayList<zz27> zziP = new ArrayList<>();
    private zz1K zziO = new zz1K();

    public static class zzY implements Comparable<zzY> {
        private int zziJ;
        private boolean zziK;
        private boolean zziL;
        private zzZ zziM;

        public zzY(zzPM zzpm, zz3I zz3i) {
            this.zziM = new zzZ(zzpm.zzPl());
            this.zziL = zzpm.zzPj();
            this.zziK = zzpm.zzPi();
            this.zziJ = zz3i.zzui();
        }

        private boolean zzY(zzY zzy) {
            return zzZKO.equals(this.zziM, zzy.zziM) && this.zziL == zzy.zziL && this.zziK == zzy.zziK && this.zziJ == zzy.zziJ;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public int compareTo(zzY zzy) {
            return zzZKN.zzU(zzuF(), zzy.zzuF(), zzZOF.ORDINAL$4894b8c8);
        }

        private String zzuF() {
            return zzZXH.zzT(new String[]{this.zziM.zzuF(), zzJB.zz5(this.zziL), zzJB.zz5(this.zziK), zzJB.zzWD(this.zziJ)});
        }

        public final boolean equals(Object obj) {
            if (zzZKO.zzA(null, obj)) {
                return false;
            }
            if (zzZKO.zzA(this, obj)) {
                return true;
            }
            if (obj.getClass() != zzY.class) {
                return false;
            }
            return zzY((zzY) obj);
        }

        public final int hashCode() {
            zzZ zzz = this.zziM;
            return ((((((zzz != null ? zzz.hashCode() : 0) * 397) ^ zzZKP.zzYY(this.zziL)) * 397) ^ zzZKP.zzYY(this.zziK)) * 397) ^ this.zziJ;
        }
    }

    public static class zzZ implements Comparable<zzZ> {
        private zzZXH zzA4;

        public zzZ(zzZXH zzzxh) {
            this.zzA4 = zzzxh;
        }

        private boolean zzY(zzZ zzz) {
            return zzZKO.equals(this.zzA4, zzz.zzA4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public int compareTo(zzZ zzz) {
            return zzZKN.zzU(this.zzA4.zzpw(), zzz.zzA4.zzpw(), zzZOF.ORDINAL$4894b8c8);
        }

        public final boolean equals(Object obj) {
            if (zzZKO.zzA(null, obj)) {
                return false;
            }
            if (zzZKO.zzA(this, obj)) {
                return true;
            }
            if (obj.getClass() != zzZ.class) {
                return false;
            }
            return zzY((zzZ) obj);
        }

        public final int hashCode() {
            zzZXH zzzxh = this.zzA4;
            if (zzzxh != null) {
                return zzzxh.hashCode();
            }
            return 0;
        }

        public final String zzuF() {
            return this.zzA4.zzpw();
        }
    }

    public zz4K(zz4W zz4w) {
        this.zzkV = zz4w;
        this.zziN = new zz5D("/XC", zz4w);
    }

    private zzZWJ zzG9() {
        if (this.zzxD == null) {
            this.zzxD = new zzZWJ();
        }
        return this.zzxD;
    }

    private static String zzI(String str, int i) {
        return zzZKN.format("{0}{1}", str, Integer.valueOf(i));
    }

    private zz3P zzS(zzZXH zzzxh) throws Exception {
        zzZ zzz = new zzZ(zzzxh);
        zz3O zz3o = (zz3O) zzQW.zzZ(this.zziR, zzz);
        if (zz3o != null) {
            return zz3o;
        }
        zz3O zz3o2 = new zz3O(zzzxh, this.zzkV);
        zzZQF.zzY(this.zziR, zzz, zz3o2);
        return zz3o2;
    }

    private static boolean zzT(zzZXH zzzxh) {
        for (String str : zziQ) {
            if (zzZKN.equals(zzzxh.zzPh(), str)) {
                return true;
            }
        }
        return false;
    }

    private zz3I zzY(zzZXH zzzxh, String str) {
        if (zzzxh.zzHG()) {
            return new zz3I(0, true);
        }
        if (zzzxh.zzpA()) {
            return (this.zzkV.zzvc().getUseCoreFonts() && zz4V.zzV(zzzxh)) ? new zz3I(2, false) : new zz3I(0, true);
        }
        if (!zzZYD.zzXk(str) || !zz1E.zzXJ(str)) {
            return new zz3I(0, true);
        }
        if (this.zzkV.zzvc().getUseCoreFonts() && zz4V.zzV(zzzxh)) {
            return new zz3I(2, false);
        }
        int fontEmbeddingMode = this.zzkV.zzvc().getFontEmbeddingMode();
        return fontEmbeddingMode != 0 ? fontEmbeddingMode != 1 ? fontEmbeddingMode != 2 ? new zz3I(1, true) : new zz3I(1, false) : new zz3I(1, !zzT(zzzxh)) : new zz3I(1, true);
    }

    private Iterable<zz3O> zzuG() {
        ArrayList arrayListZzY = zzZQG.zzY(this.zziR.keySet());
        Collections.sort(arrayListZzY);
        ArrayList arrayList = new ArrayList(this.zziR.size());
        Iterator it = arrayListZzY.iterator();
        while (it.hasNext()) {
            zzZQG.zzZ((ArrayList<zz3O>) arrayList, this.zziR.get((zzZ) it.next()));
        }
        return arrayList;
    }

    private Iterable<zz3Q> zzuH() {
        ArrayList arrayListZzY = zzZQG.zzY(this.zziT.keySet());
        Collections.sort(arrayListZzY);
        ArrayList arrayList = new ArrayList(this.zziT.size());
        Iterator it = arrayListZzY.iterator();
        while (it.hasNext()) {
            zzZQG.zzZ((ArrayList<zz3Q>) arrayList, this.zziT.get((zzY) it.next()));
        }
        return arrayList;
    }

    public final zz4A zzN(float f, float f2) {
        Iterator<zz4B> it = this.zziS.iterator();
        while (it.hasNext()) {
            zz4A zz4a = (zz4A) zzZKW.zzZ(it.next(), zz4A.class);
            if (zz4a != null && zz4a.equals(f, f2)) {
                return zz4a;
            }
        }
        zz4A zz4a2 = new zz4A(this.zzkV, zzI("/GS", this.zziS.size() + 1), f, f2);
        zzZQG.zzZ((ArrayList<zz4A>) this.zziS, zz4a2);
        return zz4a2;
    }

    public final zz34 zzU(byte[] bArr, zzEP zzep) throws Exception {
        zz34 zz34VarZzY = this.zzli.zzY(bArr, zzep);
        if (zz34VarZzY != null) {
            return zz34VarZzY;
        }
        zz34 zz34Var = new zz34(this.zzkV, zzI("/X", this.zzjJ.getCount() + 1), bArr, zzep);
        this.zzli.zzZ(bArr, zzep, zz34Var);
        this.zzjJ.set(zz34Var.zzF1(), zz34Var);
        return zz34Var;
    }

    public final void zzW(zzFX zzfx) throws Exception {
        Iterator<zz3Q> it = zzuH().iterator();
        while (it.hasNext()) {
            it.next().zzY(zzfx);
        }
        Iterator<zz2F> it2 = this.zzjL.zzl9().iterator();
        while (it2.hasNext()) {
            it2.next().zzY(zzfx);
        }
        Iterator<zz4B> it3 = this.zziS.iterator();
        while (it3.hasNext()) {
            it3.next().zzY(zzfx);
        }
        Iterator<zz34> it4 = this.zzjJ.zzl9().iterator();
        while (it4.hasNext()) {
            it4.next().zzY(zzfx);
        }
        this.zziN.zzY(zzfx);
        Iterator<zz3O> it5 = zzuG().iterator();
        while (it5.hasNext()) {
            it5.next().zzul().zzY(zzfx);
        }
        Iterator<zz27> it6 = this.zziP.iterator();
        while (it6.hasNext()) {
            it6.next().zzY(zzfx);
        }
    }

    public final zz5E zzX(String str, zzP9 zzp9) {
        return this.zziN.zzY(str, zzp9);
    }

    public final zz3Q zzZ(zzPM zzpm, String str) throws Exception {
        zz3I zz3iZzY = zzY(zzpm.zzPl(), str);
        zzY zzy = new zzY(zzpm, zz3iZzY);
        zz3Q zz3q = (zz3Q) zzQW.zzZ(this.zziT, zzy);
        if (zz3q != null) {
            return zz3q;
        }
        zz3Q zz3qZzZ = zzZ(zzpm, zz3iZzY);
        this.zziT.put(zzy, zz3qZzZ);
        return zz3qZzZ;
    }

    public final zz27 zzX(zzZ8 zzz8) throws Exception {
        zz27 zz27Var = new zz27(this.zzkV, zzI("/S", this.zziP.size() + 1), zzz8);
        zzZQG.zzZ(this.zziP, zz27Var);
        return zz27Var;
    }

    private zz3Q zzZ(zzPM zzpm, zz3I zz3i) throws Exception {
        zz3P zz3n;
        if (zz3i.zzuh()) {
            zz3n = zzS(zzpm.zzPl());
        } else {
            zz3n = new zz3N(zzpm.zzPl());
        }
        zz3P zz3p = zz3n;
        int iZzui = zz3i.zzui();
        if (iZzui == 0) {
            return new zz1G(this.zzkV, zzpm.zzPj(), zzpm.zzPi(), (zz3O) zz3p);
        }
        if (iZzui == 1) {
            return new zz1H(this.zzkV, zzpm.zzPj(), zzpm.zzPi(), zz3p);
        }
        if (iZzui == 2) {
            return new zz4V(this.zzkV, zzpm.zzPj(), zzpm.zzPi(), zz3p, zz4V.zzU(zzpm.zzPl()));
        }
        throw new IllegalStateException("Unexpected font type.");
    }

    public final zz2F zzZ(zzPY zzpy, zzZQ4 zzzq4, zz3A zz3a) throws Exception {
        for (zz2F zz2f : this.zzjL.zzl9()) {
            if (zz2f.zzZ(zzpy, zz3a)) {
                return zz2f;
            }
        }
        zz2F zz2fZzZ = zzZ(zzpy, this.zzkV, zzzq4, zz3a);
        if (zz2fZzZ != null) {
            this.zzjL.set(zz2fZzZ.zzF1(), zz2fZzZ);
        }
        return zz2fZzZ;
    }

    public final zz5E zzY(String str, zzZQ4 zzzq4, zz3A zz3a) throws Exception {
        return this.zziN.zzZ(str, zzzq4, zz3a);
    }

    private zz2F zzZ(zzPY zzpy, zz4W zz4w, zzZQ4 zzzq4, zz3A zz3a) throws Exception {
        if (zzzq4.isEmpty()) {
            return null;
        }
        String strZzI = zzI("/P", this.zzjL.getCount() + 1);
        int iZzPH = zzpy.zzPH();
        if (iZzPH == 1) {
            return new zz2D(zz4w, strZzI, (zzPK) zzpy, zz3a);
        }
        if (iZzPH == 2) {
            return new zz2C(zz4w, strZzI, this.zziO.zzW((zzOH) zzpy), zzzq4, zz3a);
        }
        if (iZzPH == 3) {
            return new zz2E(zz4w, strZzI, (zzPA) zzpy, zzzq4, zz3a);
        }
        if (iZzPH == 4) {
            zzOP zzop = (zzOP) zzpy;
            zzG9();
            return new zz2C(zz4w, strZzI, this.zziO.zzW(zzXH.zzY(zzop, zzzq4)), zzzq4, zzop, zz3a);
        }
        if (iZzPH != 5) {
            return null;
        }
        zzP0 zzp0 = (zzP0) zzpy;
        zzZQ4 zzzq4ZzO = zz3a.zzua().zzO(zzzq4);
        zzG9();
        return new zz2C(zz4w, strZzI, this.zziO.zzW(zzXH.zzZ(zzp0, zzzq4ZzO)), zzzq4, zzp0, zz3a);
    }

    public final zz49 zzZ(zz3D zz3d) {
        zz49 zz49Var = new zz49(this.zzkV, zzI("/GS", this.zziS.size() + 1), zz3d);
        zzZQG.zzZ((ArrayList<zz49>) this.zziS, zz49Var);
        return zz49Var;
    }
}
