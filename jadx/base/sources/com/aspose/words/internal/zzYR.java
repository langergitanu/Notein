package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYR {
    private boolean zzXE;
    private zzZG zzXF;
    private boolean zzXG;
    private zz6I zzXH;

    public zzYR(zzZG zzzg, zz6I zz6i) {
        this.zzXF = zzzg;
        this.zzXH = zz6i;
        zzOI zzoi = (zzzg.zzZ2() == null || this.zzXF.zzZ2().zzZ1() == null) ? null : (zzOI) zzZKW.zzZ(this.zzXF.zzZ2().zzZ1(), zzOI.class);
        this.zzXE = zzoi != null && zzoi.zzZy().zzPD() < 255 && zzoi.zzZy().zzPD() > 0;
    }

    private ArrayList<zzZG> zzW(zzZG zzzg) throws Exception {
        if (zzzg.zzZ2() == null && zzzg.zzZ1() == null) {
            return null;
        }
        boolean z = this.zzXH.zzwN() && zzBW.zzZ(this.zzXH.zzNO());
        boolean z2 = this.zzXH.zzwQ() || this.zzXH.zzwP();
        ArrayList<zzZG> arrayList = new ArrayList<>();
        if (z || z2) {
            zzzg = zzX(zzzg);
        }
        zzBW.zzZ(arrayList, zzzg, this.zzXH.zzNO());
        int size = arrayList.size();
        if (this.zzXH.zzwQ() || (size != 0 && (this.zzXH.zzwP() || this.zzXE))) {
            this.zzXG = zzV(zzzg);
        }
        zzZ(arrayList, zzzg);
        if (size != 0) {
            if (this.zzXG) {
                zzZG zzzgZzZ = zzZ(arrayList, size);
                ArrayList<zzZG> arrayList2 = new ArrayList<>(1);
                zzZQG.zzZ(arrayList2, zzzgZzZ);
                return arrayList2;
            }
            int size2 = arrayList.size() - size;
            Collections.reverse(arrayList);
            zzZQG.zzU(arrayList, 0, size2);
            zzZQG.zzU(arrayList, size2, size);
        }
        return arrayList;
    }

    private static zzOS zzX(ArrayList<zzZG> arrayList, int i) {
        return (zzOS) arrayList.get(i).zzZ0().zzO7().get(0).zzNY().get(0);
    }

    private void zzY(ArrayList<zzOS> arrayList, ArrayList<zzOS> arrayList2) {
        zzZ(arrayList, arrayList2);
        ArrayList<zzOS> arrayListZzM = zzZZ3.zzM(arrayList);
        if (arrayListZzM != null) {
            zzZQG.zzZ((ArrayList) arrayList2, (Iterable) arrayListZzM);
        }
    }

    private zzZG zzZ(ArrayList<zzZG> arrayList, int i) throws Exception {
        Iterator<zzZG> it = arrayList.iterator();
        while (it.hasNext()) {
            zzOR.zzP(it.next().zzZ0());
        }
        zzZG zzzgZzZ = zzZ(zzY(arrayList, i));
        zzzgZzZ.zzY(this.zzXF.zzZ2().zzZ1());
        return zzzgZzZ;
    }

    public boolean zzV(zzZG zzzg) {
        if (zzzg.zzZ2() == null || zzzg.zzZ2().getWidth() == 0.0f || zzzg.zzZ1() != null) {
            return false;
        }
        Iterator<zzP5> it = zzzg.zzZ0().zzO7().iterator();
        while (it.hasNext()) {
            if (it.next().isClosed() && (!this.zzXH.zzwQ() || this.zzXF.zzZ1() != null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzYt() {
        return this.zzXG;
    }

    public final zz6I zzYu() {
        return this.zzXH;
    }

    public final ArrayList<zzZG> zzYv() throws Exception {
        boolean z = !this.zzXH.zzwQ() && (!this.zzXH.zzwP() || (this.zzXF.zzZ2() != null && zzJ6.zzT(this.zzXF.zzZ2().zzNG())));
        if (this.zzXF.zzZ2() == null && this.zzXF.zzZ1() == null) {
            ArrayList<zzZG> arrayList = new ArrayList<>(1);
            zzZQG.zzZ(arrayList, this.zzXF);
            return arrayList;
        }
        zzZG zzzg = (zzZG) this.zzXF.zz1();
        zzZG zzzg2 = null;
        if (z) {
            zzzg.zzY((zzPY) null);
        }
        if (z && this.zzXF.zzZ1() != null && (!(this.zzXF.zzZ1() instanceof zzOI) || !zzPV.zzZ(((zzOI) this.zzXF.zzZ1()).zzZy(), zzPV.zzHZ))) {
            zzZG zzzg3 = (zzZG) this.zzXF.zz1();
            zzzg3.zzX(null);
            zzzg3.zzY(this.zzXF.zzZ1());
            zzzg2 = zzzg3;
        }
        ArrayList<zzZG> arrayListZzW = zzW(zzzg);
        if (zzzg2 != null) {
            if (arrayListZzW == null) {
                arrayListZzW = new ArrayList<>(1);
            }
            arrayListZzW.add(0, zzzg2);
        }
        return arrayListZzW;
    }

    public abstract void zzZ(ArrayList<zzZG> arrayList, zzZG zzzg) throws Exception;

    public zzZG zzX(zzZG zzzg) throws Exception {
        return zz6G.zzZ(zzzg, this.zzXH.zzwO());
    }

    private static boolean zzY(zzOS zzos, zzOS zzos2) {
        if (zzos.zzNu().getCount() == 0 || zzos2.zzNu().getCount() == 0) {
            return false;
        }
        return zzos2.zzk(zzos.zzNu().get(0));
    }

    private static boolean zzZ(zzOS zzos, zzOS zzos2) {
        if (zzos.zzNu().getCount() >= 2 && zzos2.zzNu().getCount() >= 2) {
            zzPB[] zzpbArr = new zzPB[zzos.zzNu().getCount()];
            int i = 0;
            while (i < zzos.zzNu().getCount()) {
                zzpbArr[i] = new zzPB(zzos.zzNu().get(i), i == zzos.zzNu().getCount() - 1 ? zzos.zzNu().get(0) : zzos.zzNu().get(i + 1));
                i++;
            }
            int i2 = 0;
            while (i2 < zzos2.zzNu().getCount()) {
                zzPB zzpb = new zzPB(zzos2.zzNu().get(i2), i2 == zzos2.zzNu().getCount() - 1 ? zzos2.zzNu().get(0) : zzos2.zzNu().get(i2 + 1));
                for (int i3 = 0; i3 < zzos.zzNu().getCount(); i3++) {
                    if (zzPB.zzZ(zzpbArr[i3], zzpb, new long[1], true)) {
                        return true;
                    }
                }
                i2++;
            }
        }
        return false;
    }

    private ArrayList<zzOS> zzY(ArrayList<zzZG> arrayList, int i) {
        int i2;
        ArrayList<zzOS> arrayList2 = new ArrayList<>();
        zzDB zzdb = new zzDB();
        int i3 = i;
        while (true) {
            if (i3 >= arrayList.size()) {
                break;
            }
            zzOS zzosZzX = zzX(arrayList, i3);
            ArrayList<zzOS> arrayList3 = new ArrayList<>();
            boolean zZzZ = zzZ(arrayList, i, zzosZzX);
            int i4 = 0;
            while (true) {
                if (i4 < i) {
                    zzOS zzosZzX2 = zzX(arrayList, i4);
                    if ((zzZ(zzosZzX, zzosZzX2) || zzY(zzosZzX, zzosZzX2)) && !zzdb.contains(i4)) {
                        zzZQG.zzZ(arrayList3, zzosZzX2);
                        zzdb.add(i4);
                    }
                    if (!zZzZ) {
                        arrayList3.add(0, zzosZzX);
                        break;
                    }
                    i4++;
                }
            }
            zzY(arrayList3, arrayList2);
            i3++;
        }
        for (i2 = 0; i2 < i; i2++) {
            if (!zzdb.contains(i2)) {
                zzZQG.zzZ(arrayList2, zzX(arrayList, i2));
            }
        }
        return arrayList2;
    }

    private static zzZG zzZ(ArrayList<zzOS> arrayList) {
        zzOS zzos;
        ArrayList<zzOS> arrayList2;
        zzP8 zzp8 = new zzP8();
        while (arrayList.size() > 0) {
            zzOS zzos2 = arrayList.get(0);
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    zzos = null;
                    break;
                }
                if (zzZ(zzos2, arrayList.get(i))) {
                    zzos = arrayList.get(i);
                    break;
                }
                i++;
            }
            if (zzos != null) {
                ArrayList arrayList3 = new ArrayList(2);
                zzZQG.zzZ((ArrayList<zzOS>) arrayList3, zzos2);
                zzZQG.zzZ((ArrayList<zzOS>) arrayList3, zzos);
                arrayList2 = zzZZ3.zzM(arrayList3);
                arrayList.remove(zzos);
            } else {
                arrayList2 = new ArrayList<>(1);
                arrayList2.add(zzos2);
            }
            arrayList.remove(zzos2);
            if (arrayList2 != null) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    zzP5 zzp5 = new zzP5();
                    zzp5.zze(true);
                    zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), arrayList2.get(i2));
                    zzZQG.zzZ(zzp8.zzO7(), zzp5);
                }
            }
        }
        return new zzZG(zzp8);
    }

    private static boolean zzZ(ArrayList<zzZG> arrayList, int i, zzOS zzos) {
        for (int i2 = 0; i2 < i; i2++) {
            zzOS zzosZzX = zzX(arrayList, i2);
            if (!zzZ(zzos, zzosZzX) && zzY(zzos, zzosZzX)) {
                return true;
            }
        }
        return false;
    }

    public void zzZ(ArrayList<zzOS> arrayList, ArrayList<zzOS> arrayList2) {
        zzZQG.zzZ((ArrayList) arrayList, (Iterable) arrayList2);
        arrayList2.clear();
    }
}
