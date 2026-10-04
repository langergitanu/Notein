package com.aspose.words.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public class zzZNG {
    private static volatile Map<Long, zzZP1> zzZVT = new HashMap();
    private static volatile Map<Long, TimeZone> zzZVS = new HashMap();

    public static TimeZone getTimeZone() {
        TimeZone timeZone;
        Long lValueOf = Long.valueOf(Thread.currentThread().getId());
        synchronized (zzZNG.class) {
            try {
                timeZone = zzZVS.get(lValueOf);
                if (timeZone == null) {
                    timeZone = TimeZone.getDefault();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return timeZone;
    }

    public static void setTimeZone(TimeZone timeZone) {
        Long lValueOf = Long.valueOf(Thread.currentThread().getId());
        synchronized (zzZNG.class) {
            if (timeZone == null) {
                try {
                    timeZone = TimeZone.getDefault();
                } catch (Throwable th) {
                    throw th;
                }
            }
            TimeZone timeZone2 = zzZVS.get(lValueOf);
            if (timeZone2 == null || !timeZone2.getID().equals(timeZone.getID())) {
                zzZVS.put(lValueOf, timeZone);
                zzhG();
            }
        }
    }

    public static zzZNF zzC(zzZQ9 zzzq9) {
        return zzzq9.zzkR() == 1 ? zzZNF.zzZVR : zzZNF.zzYv(getTimeZone().getOffset(zzzq9.zzkI()));
    }

    public static void zzS(zzZP1 zzzp1) {
        Long lValueOf = Long.valueOf(Thread.currentThread().getId());
        synchronized (zzZNG.class) {
            if (zzzp1 == null) {
                try {
                    zzzp1 = zzhE();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzZP1 zzzp12 = zzZVT.get(lValueOf);
            if (zzzp12 != null && zzzp12.zzj9().equals(zzzp1.zzj9()) && zzzp12.zzjc().equals(zzzp1.zzjc())) {
                return;
            }
            zzZVT.put(lValueOf, zzzp1);
            zzhG();
        }
    }

    public static void zzUP(String str) {
        zzS(new zzZP1(str));
    }

    private static void zzhD() {
        Set<Thread> setKeySet = Thread.getAllStackTraces().keySet();
        HashSet hashSet = new HashSet();
        for (Thread thread : setKeySet) {
            if (thread.isAlive()) {
                hashSet.add(Long.valueOf(thread.getId()));
            }
        }
        synchronized (zzZNG.class) {
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (Map.Entry<Long, zzZP1> entry : zzZVT.entrySet()) {
                    if (hashSet.contains(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry<Long, TimeZone> entry2 : zzZVS.entrySet()) {
                    if (hashSet.contains(entry2.getKey())) {
                        map2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                zzZVT = map;
                zzZVS = map2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzZP1 zzhE() {
        return new zzZP1(Locale.getDefault());
    }

    private static int zzhF() {
        int iMax;
        synchronized (zzZNG.class) {
            iMax = Math.max(zzZVT.size(), zzZVS.size());
        }
        return iMax;
    }

    private static void zzhG() {
        synchronized (zzZNG.class) {
            try {
                if (zzhF() >= Thread.activeCount() + 64) {
                    zzhD();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static zzZP1 zzpZ() {
        zzZP1 zzzp1;
        Long lValueOf = Long.valueOf(Thread.currentThread().getId());
        synchronized (zzZNG.class) {
            try {
                zzzp1 = zzZVT.get(lValueOf);
                if (zzzp1 == null) {
                    zzS(zzhE());
                    zzzp1 = zzZVT.get(lValueOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzzp1;
    }
}
