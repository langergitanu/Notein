package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGZ {
    final zzZQY zzWOA;
    final zzZDZ zzWOF;
    final boolean zzWOV;
    zzZH1 zzWOr;
    zzZH1 zzWOs;
    int zzWOy;
    zzZG6 zzWOz;
    final boolean zzWQ6;
    HashMap<zzZDZ, zzZH1> zzWOx = null;
    ArrayList<zzZH1> zzWOw = null;
    boolean zzWOv = false;
    boolean zzWOu = false;
    boolean zzWOt = false;
    HashMap<String, zzZH1> zzWOq = null;

    private zzZGZ(zzZQY zzzqy, zzZDZ zzzdz, zzZG6 zzzg6, int i, boolean z, boolean z2) {
        this.zzWOF = zzzdz;
        this.zzWOA = zzzqy;
        this.zzWOz = zzzg6;
        this.zzWOy = i;
        this.zzWOV = z;
        this.zzWQ6 = z2;
    }

    private List<zzZH1> zzXOI() {
        ArrayList<zzZH1> arrayList = this.zzWOw;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList<zzZH1> arrayList2 = new ArrayList<>();
        this.zzWOw = arrayList2;
        return arrayList2;
    }

    private void zzXON() {
        if (this.zzWOy != 5) {
            zzZE1.zzx1("redefining defined element spec");
        }
    }

    public static zzZGZ zzZ(zzZHC zzzhc, zzZQY zzzqy, zzZDZ zzzdz, zzZG6 zzzg6, int i) {
        if (i == 5) {
            zzZE1.zzx1("trying to use XMLValidator.CONTENT_ALLOW_UNDEFINED via createDefined()");
        }
        return new zzZGZ(zzzqy, zzzdz, zzzg6, i, zzzhc.zzXPP(), zzzhc.zzXPo());
    }

    public final boolean isDefined() {
        return this.zzWOy != 5;
    }

    public final String toString() {
        return this.zzWOF.toString();
    }

    public final zzZG6 zzXOJ() {
        zzZG6 zzzg6 = this.zzWOz;
        if (zzzg6 == null) {
            return null;
        }
        return zzzg6.zzXP0();
    }

    public final boolean zzXOK() {
        return this.zzWOq != null;
    }

    public final int zzXOL() {
        ArrayList<zzZH1> arrayList = this.zzWOw;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int zzXOM() {
        return this.zzWOy <= 1 ? 2 : 4;
    }

    public final void zzY(zzZEV zzzev, zzZGZ zzzgz, boolean z) throws zzZQS {
        zzZEV zzzev2;
        boolean z2;
        List<zzZH1> listZzXOI;
        HashMap<zzZDZ, zzZH1> map = zzzgz.zzWOx;
        HashMap<zzZDZ, zzZH1> map2 = this.zzWOx;
        if (map2 == null) {
            map2 = new HashMap<>();
            this.zzWOx = map2;
        }
        HashMap<zzZDZ, zzZH1> map3 = map2;
        if (map != null && map.size() > 0) {
            for (Map.Entry<zzZDZ, zzZH1> entry : map.entrySet()) {
                if (map3.containsKey(entry.getKey())) {
                    zzzev2 = zzzev;
                    z2 = z;
                } else {
                    zzZH1 value = entry.getValue();
                    if (value.zzXOQ()) {
                        listZzXOI = zzXOI();
                        value = value.zzgY(listZzXOI.size());
                    } else {
                        listZzXOI = null;
                    }
                    zzzev2 = zzzev;
                    z2 = z;
                    zzZ(map3, zzzev2, value, listZzXOI, z2);
                }
                zzzev = zzzev2;
                z = z2;
            }
        }
        HashMap<String, zzZH1> map4 = zzzgz.zzWOq;
        if (map4 != null) {
            if (this.zzWOq == null) {
                this.zzWOq = new HashMap<>();
            }
            for (Map.Entry<String, zzZH1> entry2 : map4.entrySet()) {
                String key = entry2.getKey();
                if (!this.zzWOq.containsKey(key)) {
                    this.zzWOq.put(key, entry2.getValue());
                }
            }
        }
    }

    public static zzZGZ zzZ(zzZHC zzzhc, zzZQY zzzqy, zzZDZ zzzdz) {
        return new zzZGZ(zzzqy, zzzdz, null, 5, zzzhc.zzXPP(), zzzhc.zzXPo());
    }

    public final zzZGZ zzZ(zzZQY zzzqy, zzZG6 zzzg6, int i) {
        zzXON();
        if (i == 5) {
            zzZE1.zzx1("trying to use CONTENT_ALLOW_UNDEFINED via define()");
        }
        zzZGZ zzzgz = new zzZGZ(zzzqy, this.zzWOF, zzzg6, i, this.zzWOV, this.zzWQ6);
        zzzgz.zzWOx = this.zzWOx;
        zzzgz.zzWOw = this.zzWOw;
        zzzgz.zzWOv = this.zzWOv;
        zzzgz.zzWOt = this.zzWOt;
        zzzgz.zzWOu = this.zzWOu;
        zzzgz.zzWOs = this.zzWOs;
        zzzgz.zzWOr = this.zzWOr;
        zzzgz.zzWOq = this.zzWOq;
        return zzzgz;
    }

    public final void zzZ(zzZEV zzzev, zzZGZ zzzgz, boolean z) throws zzZQS {
        if (z) {
            zzXON();
        }
        this.zzWOz = zzzgz.zzWOz;
        this.zzWOy = zzzgz.zzWOy;
        zzY(zzzev, zzzgz, z);
    }

    public final zzZH1 zzZ(zzZEV zzzev, zzZDZ zzzdz, int i, zzZGH zzzgh, zzZDR zzzdr, boolean z) throws zzZQS {
        zzZH1 zzzh0;
        zzZGZ zzzgz;
        zzZEV zzzev2;
        boolean z2;
        zzZH1 zzzh1;
        HashMap<zzZDZ, zzZH1> map = this.zzWOx;
        if (map == null) {
            map = new HashMap<>();
            this.zzWOx = map;
        }
        List<zzZH1> listZzXOI = zzzgh.zzXOQ() ? zzXOI() : null;
        int size = listZzXOI == null ? -1 : listZzXOI.size();
        switch (i) {
            case 0:
                zzzh0 = new zzZH0(zzzdz, zzzgh, size, this.zzWOV, this.zzWQ6);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = zzzh0;
                break;
            case 1:
                zzzh0 = new zzZGW(zzzdz, zzzgh, size, this.zzWOV, this.zzWQ6, zzzdr);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = zzzh0;
                break;
            case 2:
                zzzh0 = new zzZGT(zzzdz, zzzgh, size, this.zzWOV, this.zzWQ6);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = zzzh0;
                break;
            case 3:
                zzzh0 = new zzZGS(zzzdz, zzzgh, size, this.zzWOV, this.zzWQ6);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = zzzh0;
                break;
            case 4:
                zzzh0 = new zzZGR(zzzdz, zzzgh, size, this.zzWOV, this.zzWQ6);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = zzzh0;
                break;
            case 5:
                zzzh0 = new zzZGX(zzzdz, zzzgh, size, this.zzWOV, this.zzWQ6);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = zzzh0;
                break;
            case 6:
                zzzh0 = new zzZGY(zzzdz, zzzgh, size, this.zzWOV, this.zzWQ6);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = zzzh0;
                break;
            case 7:
                zzzh0 = new zzZGO(zzzdz, zzzgh, size, this.zzWOV, this.zzWQ6, zzzdr);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = zzzh0;
                break;
            case 8:
                zzzh0 = new zzZGQ(zzzdz, zzzgh, size, this.zzWOV, this.zzWQ6);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = zzzh0;
                break;
            case 9:
                zzzh0 = new zzZGP(zzzdz, zzzgh, size, this.zzWOV, this.zzWQ6);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = zzzh0;
                break;
            default:
                zzZE1.zzx1(null);
                zzzgz = this;
                zzzev2 = zzzev;
                z2 = z;
                zzzh1 = null;
                break;
        }
        zzZH1 zzzh12 = zzzh1;
        if (zzzgz.zzZ(map, zzzev2, zzzh1, listZzXOI, z2) == null) {
            return zzzh12;
        }
        return null;
    }

    public final zzZH1 zzZ(zzZDZ zzzdz, int i, zzZGH zzzgh) throws zzZQS {
        zzZH1 zzzh0;
        String localName;
        if (i != 0) {
            zzzh0 = new zzZGQ(zzzdz, zzzgh, -1, this.zzWOV, this.zzWQ6);
        } else {
            zzzh0 = new zzZH0(zzzdz, zzzgh, -1, this.zzWOV, this.zzWQ6);
        }
        String prefix = zzzdz.getPrefix();
        if (prefix != null && prefix.length() != 0) {
            localName = zzzdz.getLocalName();
        } else {
            localName = "";
        }
        HashMap<String, zzZH1> map = this.zzWOq;
        if (map == null) {
            this.zzWOq = new HashMap<>();
        } else if (map.containsKey(localName)) {
            return null;
        }
        this.zzWOq.put(localName, zzzh0);
        return zzzh0;
    }

    private zzZH1 zzZ(Map<zzZDZ, zzZH1> map, zzZEV zzzev, zzZH1 zzzh1, List<zzZH1> list, boolean z) throws zzZQS {
        zzZDZ zzzdzZzXOU = zzzh1.zzXOU();
        zzZH1 zzzh12 = map.get(zzzdzZzXOU);
        if (zzzh12 != null) {
            zzzev.zzZ(null, zzZH9.zzWPU, zzZH9.zzWPM, zzzdzZzXOU, this.zzWOF);
            return zzzh12;
        }
        int valueType = zzzh1.getValueType();
        if (valueType == 2) {
            if (z && this.zzWOs != null) {
                zzzev.zzV("Invalid id attribute \"{0}\" for element <{1}>: already had id attribute \"" + this.zzWOs.zzXOU() + "\"", zzzdzZzXOU, this.zzWOF);
            }
            this.zzWOs = zzzh1;
        } else if (valueType == 7) {
            if (z && this.zzWOr != null) {
                zzzev.zzxJ("Invalid notation attribute '" + zzzdzZzXOU + "' for element <" + this.zzWOF + ">: already had notation attribute '" + this.zzWOr.zzXOU() + "'");
            }
            this.zzWOr = zzzh1;
        }
        map.put(zzzdzZzXOU, zzzh1);
        if (list != null) {
            list.add(zzzh1);
        }
        if (!this.zzWOv) {
            this.zzWOv = zzzh1.isFixed();
        }
        if (!this.zzWOt) {
            this.zzWOt = zzzh1.zzXOS();
        }
        if (this.zzWOu) {
            return null;
        }
        this.zzWOu = zzzh1.zzXOP();
        return null;
    }
}
