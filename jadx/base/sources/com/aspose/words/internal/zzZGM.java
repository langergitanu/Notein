package com.aspose.words.internal;

import Oooo0oO.C21023OooO0Oo;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGM extends zzZGN {
    final HashMap<zzZDZ, zzZGZ> zzWOd;
    final HashMap<String, zzZQO> zzWOf;
    final Set<String> zzWOg;
    final HashMap<String, zzZG3> zzWOh;
    final Set<String> zzWOi;
    final HashMap<String, zzZG3> zzWOk;
    final boolean zzWOl;
    final boolean zzWOm;
    final boolean zzWOn;
    volatile transient List<zzZG3> zzWOj = null;
    transient List<zzZQO> zzWOe = null;

    private zzZGM(boolean z, HashMap<String, zzZG3> map, Set<String> set, HashMap<String, zzZG3> map2, Set<String> set2, HashMap<String, zzZQO> map3, HashMap<zzZDZ, zzZGZ> map4, boolean z2) {
        boolean z3;
        this.zzWOn = z;
        this.zzWOk = map;
        this.zzWOi = set;
        this.zzWOh = map2;
        this.zzWOg = set2;
        this.zzWOf = map3;
        this.zzWOd = map4;
        this.zzWOm = z2;
        if (map4 != null) {
            Iterator<zzZGZ> it = map4.values().iterator();
            while (it.hasNext()) {
                if (it.next().zzXOK()) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        } else {
            z3 = false;
        }
        this.zzWOl = z3;
    }

    private int getEntityCount() {
        HashMap<String, zzZG3> map = this.zzWOk;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static zzZGM zzZ(boolean z, HashMap<String, zzZG3> map, Set<String> set, HashMap<String, zzZG3> map2, Set<String> set2, HashMap<String, zzZQO> map3, HashMap<zzZDZ, zzZGZ> map4, boolean z2) {
        return new zzZGM(z, map, set, map2, set2, map3, map4, z2);
    }

    public final String toString() {
        return C21023OooO0Oo.OooO0OO(" general entities]", getEntityCount(), new StringBuilder("[DTDSubset: "));
    }

    @Override // com.aspose.words.internal.zzZGN
    public final HashMap<zzZDZ, zzZGZ> zzXOA() {
        return this.zzWOd;
    }

    @Override // com.aspose.words.internal.zzZGN
    public final synchronized List<zzZQO> zzXOB() {
        List<zzZQO> listUnmodifiableList;
        try {
            listUnmodifiableList = this.zzWOe;
            if (listUnmodifiableList == null) {
                HashMap<String, zzZQO> map = this.zzWOf;
                listUnmodifiableList = (map == null || map.size() == 0) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(this.zzWOf.values()));
                this.zzWOe = listUnmodifiableList;
            }
        } catch (Throwable th) {
            throw th;
        }
        return listUnmodifiableList;
    }

    @Override // com.aspose.words.internal.zzZGN
    public final HashMap<String, zzZQO> zzXOC() {
        return this.zzWOf;
    }

    @Override // com.aspose.words.internal.zzZGN
    public final HashMap<String, zzZG3> zzXOD() {
        return this.zzWOh;
    }

    @Override // com.aspose.words.internal.zzZGN
    public final List<zzZG3> zzXOE() {
        List<zzZG3> listUnmodifiableList = this.zzWOj;
        if (listUnmodifiableList == null) {
            HashMap<String, zzZG3> map = this.zzWOk;
            listUnmodifiableList = (map == null || map.size() == 0) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(this.zzWOk.values()));
            this.zzWOj = listUnmodifiableList;
        }
        return listUnmodifiableList;
    }

    @Override // com.aspose.words.internal.zzZGN
    public final HashMap<String, zzZG3> zzXOF() {
        return this.zzWOk;
    }

    @Override // com.aspose.words.internal.zzZGN
    public final boolean zzXOG() {
        return this.zzWOn;
    }

    @Override // com.aspose.words.internal.zzYF7
    public final zzYF6 zzZ(zzYFC zzyfc) throws zzZQS {
        return this.zzWOm ? new zzZGK(this, zzyfc, this.zzWOl, this.zzWOd, this.zzWOk) : new zzZGL(this, zzyfc, this.zzWOl, this.zzWOd, this.zzWOk);
    }

    @Override // com.aspose.words.internal.zzZGN
    public final boolean zzZ(zzZGN zzzgn) {
        HashMap<String, zzZG3> mapZzXOF;
        HashMap<String, zzZG3> mapZzXOD;
        Set<String> set = this.zzWOg;
        if (set != null && set.size() > 0 && (mapZzXOD = zzzgn.zzXOD()) != null && mapZzXOD.size() > 0 && zzZE5.zzZ(set, mapZzXOD.keySet())) {
            return false;
        }
        Set<String> set2 = this.zzWOi;
        return set2 == null || set2.size() <= 0 || (mapZzXOF = zzzgn.zzXOF()) == null || mapZzXOF.size() <= 0 || !zzZE5.zzZ(set2, mapZzXOF.keySet());
    }

    public static void zzZ(zzZQO zzzqo, zzZQO zzzqo2) throws zzZQS {
        throw new zzZFS(MessageFormat.format(zzZH9.zzWPf, zzzqo2.getName(), zzzqo.zzlj().toString()), zzzqo2.zzlj());
    }

    public static void zzZ(zzZGZ zzzgz, zzZQY zzzqy) throws zzZQS {
        throw new zzZFS(MessageFormat.format(zzZH9.zzWPg, zzzgz.zzWOF.toString(), zzzgz.zzWOA.toString()), zzzqy);
    }

    private static <K, V> void zzZ(Map<K, V> map, Map<K, V> map2) {
        for (Map.Entry<K, V> entry : map2.entrySet()) {
            K key = entry.getKey();
            V vPut = map.put(key, entry.getValue());
            if (vPut != null) {
                map.put(key, vPut);
            }
        }
    }

    private void zzZ(zzZEV zzzev, HashMap<zzZDZ, zzZGZ> map, HashMap<zzZDZ, zzZGZ> map2) throws zzZQS {
        for (Map.Entry<zzZDZ, zzZGZ> entry : map2.entrySet()) {
            zzZDZ key = entry.getKey();
            zzZGZ value = entry.getValue();
            zzZGZ zzzgz = map.get(key);
            if (zzzgz == null) {
                map.put(key, value);
            } else if (value.isDefined()) {
                if (zzzgz.isDefined()) {
                    zzZ(zzzgz, value.zzWOA);
                } else {
                    zzzgz.zzZ(zzzev, value, this.zzWOm);
                }
            } else if (!zzzgz.isDefined()) {
                zzzev.zzZ(zzzgz.zzWOA, zzZH9.zzWPW, zzZH9.zzWPP, value.zzWOF.toString(), null);
            } else {
                zzZEV zzzev2 = zzzev;
                zzzgz.zzY(zzzev2, value, this.zzWOm);
                zzzev = zzzev2;
            }
        }
    }

    private static void zzZ(HashMap<String, zzZQO> map, HashMap<String, zzZQO> map2) throws zzZQS {
        for (Map.Entry<String, zzZQO> entry : map2.entrySet()) {
            if (map.containsKey(entry.getKey())) {
                zzZ(map.get(entry.getKey()), entry.getValue());
            }
        }
    }

    @Override // com.aspose.words.internal.zzZGN
    public final zzZGN zzZ(zzZEV zzzev, zzZGN zzzgn) throws zzZQS {
        HashMap<String, zzZG3> map;
        HashMap<String, zzZQO> map2;
        HashMap<zzZDZ, zzZGZ> map3;
        HashMap<String, zzZG3> map4 = this.zzWOk;
        HashMap<String, zzZG3> mapZzXOF = zzzgn.zzXOF();
        if (map4 == null || map4.isEmpty()) {
            map = mapZzXOF;
        } else {
            if (mapZzXOF != null && !mapZzXOF.isEmpty()) {
                zzZ(map4, mapZzXOF);
            }
            map = map4;
        }
        HashMap<String, zzZQO> map5 = this.zzWOf;
        HashMap<String, zzZQO> mapZzXOC = zzzgn.zzXOC();
        if (map5 == null || map5.isEmpty()) {
            map2 = mapZzXOC;
        } else {
            if (mapZzXOC != null && !mapZzXOC.isEmpty()) {
                zzZ(map5, mapZzXOC);
                zzZ((Map) map5, (Map) mapZzXOC);
            }
            map2 = map5;
        }
        HashMap<zzZDZ, zzZGZ> map6 = this.zzWOd;
        HashMap<zzZDZ, zzZGZ> mapZzXOA = zzzgn.zzXOA();
        if (map6 == null || map6.isEmpty()) {
            map3 = mapZzXOA;
        } else {
            if (mapZzXOA != null && !mapZzXOA.isEmpty()) {
                zzZ(zzzev, map6, mapZzXOA);
            }
            map3 = map6;
        }
        return zzZ(false, map, null, null, null, map2, map3, this.zzWOm);
    }
}
