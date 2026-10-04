package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i, int i2) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:400:0x0948, code lost:
    
        r0 = r12.zzaV().zze();
        r2 = com.google.android.gms.measurement.internal.zzgu.zzl(r36.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x095a, code lost:
    
        if (r11.zza() == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x095c, code lost:
    
        r8 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0965, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0966, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r2, java.lang.String.valueOf(r8));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x067b A[PHI: r0 r7 r20 r22
      0x067b: PHI (r0v94 java.util.Map) = (r0v96 java.util.Map), (r0v102 java.util.Map) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
      0x067b: PHI (r7v22 android.database.Cursor) = (r7v23 android.database.Cursor), (r7v24 android.database.Cursor) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
      0x067b: PHI (r20v8 long) = (r20v9 long), (r20v12 long) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
      0x067b: PHI (r22v12 com.google.android.gms.measurement.internal.zzbc) = (r22v13 com.google.android.gms.measurement.internal.zzbc), (r22v15 com.google.android.gms.measurement.internal.zzbc) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0833 A[PHI: r0 r13 r18 r38
      0x0833: PHI (r0v154 java.util.Map) = (r0v156 java.util.Map), (r0v162 java.util.Map) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x0833: PHI (r13v11 android.database.Cursor) = (r13v12 android.database.Cursor), (r13v13 android.database.Cursor) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x0833: PHI (r18v7 java.lang.String) = (r18v8 java.lang.String), (r18v13 java.lang.String) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
      0x0833: PHI (r38v7 java.util.Iterator) = (r38v8 java.util.Iterator), (r38v11 java.util.Iterator) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #8 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:443:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #8 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:443:0x019c }] */
    /* JADX WARN: Type inference failed for: r0v205 */
    /* JADX WARN: Type inference failed for: r0v206 */
    /* JADX WARN: Type inference failed for: r0v49, types: [OooOo.OooO00o, OooOo.Oooo00o] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzb(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        int i;
        int i2;
        boolean z2;
        Map map;
        zzav zzavVarZzj;
        String str2;
        Cursor cursor;
        boolean z3;
        String str3;
        String str4;
        Cursor cursorQuery;
        Map map2;
        HashSet<Integer> hashSet;
        Map map3;
        List list3;
        boolean z4;
        ?? r5;
        Cursor cursorRawQuery;
        ?? r0;
        ?? r16;
        HashSet hashSet2;
        Iterator it;
        zzz zzzVar;
        Iterator it2;
        zzbc zzbcVar;
        long j;
        String str5;
        String str6;
        Map map4;
        Cursor cursor2;
        Cursor cursorQuery2;
        String str7;
        Iterator it3;
        Map map5;
        String str8;
        Cursor cursor3;
        Cursor cursorQuery3;
        List arrayList;
        Cursor cursorQuery4;
        List arrayList2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new OooOo.OooO00o();
        this.zzd = l;
        this.zze = l2;
        Iterator it4 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it4.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it4.next()).zzd())) {
                z2 = true;
                break;
            }
        }
        zzpu.zza();
        zzic zzicVar = this.zzu;
        boolean zZzp = zzicVar.zzc().zzp(this.zza, zzfy.zzaF);
        zzpu.zza();
        boolean zZzp2 = zzicVar.zzc().zzp(this.zza, zzfy.zzaE);
        if (z2) {
            zzav zzavVarZzj2 = this.zzg.zzj();
            String str9 = this.zza;
            zzavVarZzj2.zzaw();
            zzavVarZzj2.zzg();
            Preconditions.checkNotEmpty(str9);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzavVarZzj2.zze().update("events", contentValues, "app_id = ?", new String[]{str9});
            } catch (SQLiteException e) {
                zzavVarZzj2.zzu.zzaV().zzb().zzc("Error resetting session-scoped event counts. appId", zzgu.zzl(str9), e);
            }
        }
        Map map6 = Collections.EMPTY_MAP;
        String str10 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
        String str11 = "audience_id";
        if (zZzp2 && zZzp) {
            zzav zzavVarZzj3 = this.zzg.zzj();
            String str12 = this.zza;
            Preconditions.checkNotEmpty(str12);
            OooOo.OooO00o oooO00o = new OooOo.OooO00o();
            try {
                cursorQuery4 = zzavVarZzj3.zze().query("event_filters", new String[]{"audience_id", Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, "app_id=?", new String[]{str12}, null, null, null);
                try {
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery4.getBlob(i2))).zzbc();
                                    if (zzffVar.zzg()) {
                                        Integer numValueOf = Integer.valueOf(cursorQuery4.getInt(i));
                                        List list4 = (List) oooO00o.get(numValueOf);
                                        if (list4 == null) {
                                            arrayList2 = new ArrayList();
                                            oooO00o.put(numValueOf, arrayList2);
                                        } else {
                                            arrayList2 = list4;
                                        }
                                        arrayList2.add(zzffVar);
                                    }
                                } catch (IOException e2) {
                                    zzavVarZzj3.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str12), e2);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            cursorQuery4.close();
                            map = oooO00o;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzavVarZzj3.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str12), e);
                        map6 = Collections.EMPTY_MAP;
                        if (cursorQuery4 != null) {
                        }
                        map = map6;
                        zzavVarZzj = this.zzg.zzj();
                        str2 = this.zza;
                        zzavVarZzj.zzaw();
                        zzavVarZzj.zzg();
                        Preconditions.checkNotEmpty(str2);
                        cursorQuery = zzavVarZzj.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            z3 = z2;
                            str3 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                        }
                        if (!map2.isEmpty()) {
                        }
                        String str13 = str3;
                        String str14 = str4;
                        String str15 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                        }
                        String str16 = str13;
                        String str17 = str14;
                        if (z) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery4 != null) {
                        cursorQuery4.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e5) {
                e = e5;
                cursorQuery4 = null;
            } catch (Throwable th3) {
                th = th3;
                cursorQuery4 = null;
                if (cursorQuery4 != null) {
                }
                throw th;
            }
            cursorQuery4.close();
            map = map6;
        } else {
            map = map6;
        }
        zzavVarZzj = this.zzg.zzj();
        str2 = this.zza;
        zzavVarZzj.zzaw();
        zzavVarZzj.zzg();
        Preconditions.checkNotEmpty(str2);
        try {
            cursorQuery = zzavVarZzj.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str2}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map7 = Collections.EMPTY_MAP;
                cursorQuery.close();
                map2 = map7;
                z3 = z2;
                str3 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                str4 = "audience_id";
            } else {
                OooOo.OooO00o oooO00o2 = new OooOo.OooO00o();
                while (true) {
                    int i3 = cursorQuery.getInt(0);
                    try {
                        oooO00o2.put(Integer.valueOf(i3), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                        z3 = z2;
                        str3 = str10;
                        str4 = str11;
                    } catch (IOException e6) {
                        z3 = z2;
                        str3 = str10;
                        try {
                            str4 = str11;
                            try {
                                zzavVarZzj.zzu.zzaV().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgu.zzl(str2), Integer.valueOf(i3), e6);
                            } catch (SQLiteException e7) {
                                e = e7;
                                zzavVarZzj.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str2), e);
                                Map map8 = Collections.EMPTY_MAP;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                map2 = map8;
                            }
                        } catch (SQLiteException e8) {
                            e = e8;
                            str4 = str11;
                            zzavVarZzj.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str2), e);
                            Map map82 = Collections.EMPTY_MAP;
                            if (cursorQuery != null) {
                            }
                            map2 = map82;
                        }
                    }
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    z2 = z3;
                    str10 = str3;
                    str11 = str4;
                }
                cursorQuery.close();
                map2 = oooO00o2;
            }
        } catch (SQLiteException e9) {
            e = e9;
            z3 = z2;
            str3 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
            str4 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            HashSet hashSet3 = new HashSet(map2.keySet());
            if (z3) {
                String str18 = this.zza;
                zzav zzavVarZzj4 = this.zzg.zzj();
                String str19 = this.zza;
                zzavVarZzj4.zzaw();
                zzavVarZzj4.zzg();
                Preconditions.checkNotEmpty(str19);
                ?? oooO00o3 = new OooOo.OooO00o();
                SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj4.zze();
                try {
                    try {
                        cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str19, str19});
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                do {
                                    Integer numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                    List arrayList3 = (List) oooO00o3.get(numValueOf2);
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                        oooO00o3.put(numValueOf2, arrayList3);
                                    }
                                    arrayList3.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                } while (cursorRawQuery.moveToNext());
                            } else {
                                oooO00o3 = Collections.EMPTY_MAP;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            zzavVarZzj4.zzu.zzaV().zzb().zzc("Database error querying scoped filters. appId", zzgu.zzl(str19), e);
                            oooO00o3 = Collections.EMPTY_MAP;
                            r0 = oooO00o3;
                            if (cursorRawQuery != null) {
                            }
                            Preconditions.checkNotEmpty(str18);
                            Preconditions.checkNotNull(map2);
                            OooOo.OooO00o oooO00o4 = new OooOo.OooO00o();
                            if (!map2.isEmpty()) {
                            }
                            hashSet = hashSet3;
                            map3 = oooO00o4;
                            while (r16.hasNext()) {
                            }
                            String str132 = str3;
                            String str142 = str4;
                            String str152 = "Skipping failed audience ID";
                            if (!list.isEmpty()) {
                            }
                            String str162 = str132;
                            String str172 = str142;
                            if (z) {
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r5 = sQLiteDatabaseZze;
                        if (r5 != 0) {
                            r5.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    cursorRawQuery = null;
                } catch (Throwable th6) {
                    th = th6;
                    r5 = 0;
                    if (r5 != 0) {
                    }
                    throw th;
                }
                cursorRawQuery.close();
                r0 = oooO00o3;
                Preconditions.checkNotEmpty(str18);
                Preconditions.checkNotNull(map2);
                OooOo.OooO00o oooO00o42 = new OooOo.OooO00o();
                if (!map2.isEmpty()) {
                    Iterator it5 = map2.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer num = (Integer) it5.next();
                        num.intValue();
                        com.google.android.gms.internal.measurement.zzii zziiVar = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                        List list5 = (List) r0.get(num);
                        if (list5 == null || list5.isEmpty()) {
                            r16 = r0;
                            hashSet2 = hashSet3;
                            it = it5;
                            oooO00o42.put(num, zziiVar);
                            r0 = r16;
                            hashSet3 = hashSet2;
                            it5 = it;
                        } else {
                            zzpg zzpgVar = this.zzg;
                            ?? r162 = r0;
                            hashSet2 = hashSet3;
                            List listZzq = zzpgVar.zzp().zzq(zziiVar.zzc(), list5);
                            if (listZzq.isEmpty()) {
                                r0 = r162;
                                hashSet3 = hashSet2;
                            } else {
                                com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar.zzcl();
                                zzihVar.zzd();
                                zzihVar.zzc(listZzq);
                                List listZzq2 = zzpgVar.zzp().zzq(zziiVar.zza(), list5);
                                zzihVar.zzb();
                                zzihVar.zza(listZzq2);
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it6 = zziiVar.zze().iterator();
                                while (it6.hasNext()) {
                                    Iterator it7 = it5;
                                    com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) it6.next();
                                    Iterator it8 = it6;
                                    if (!list5.contains(Integer.valueOf(zzhqVar.zzb()))) {
                                        arrayList4.add(zzhqVar);
                                    }
                                    it5 = it7;
                                    it6 = it8;
                                }
                                it = it5;
                                zzihVar.zzf();
                                zzihVar.zze(arrayList4);
                                ArrayList arrayList5 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.zzg()) {
                                    if (!list5.contains(Integer.valueOf(zzikVar.zzb()))) {
                                        arrayList5.add(zzikVar);
                                    }
                                }
                                zzihVar.zzh();
                                zzihVar.zzg(arrayList5);
                                oooO00o42.put(num, (com.google.android.gms.internal.measurement.zzii) zzihVar.zzbc());
                                r16 = r162;
                                r0 = r16;
                                hashSet3 = hashSet2;
                                it5 = it;
                            }
                        }
                    }
                }
                hashSet = hashSet3;
                map3 = oooO00o42;
            } else {
                hashSet = hashSet3;
                map3 = map2;
            }
            for (Integer num2 : hashSet) {
                num2.intValue();
                com.google.android.gms.internal.measurement.zzii zziiVar2 = (com.google.android.gms.internal.measurement.zzii) map3.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                OooOo.OooO00o oooO00o5 = new OooOo.OooO00o();
                if (zziiVar2 != null && zziiVar2.zzf() != 0) {
                    for (com.google.android.gms.internal.measurement.zzhq zzhqVar2 : zziiVar2.zze()) {
                        if (zzhqVar2.zza()) {
                            Map map9 = map3;
                            oooO00o5.put(Integer.valueOf(zzhqVar2.zzb()), zzhqVar2.zzc() ? Long.valueOf(zzhqVar2.zzd()) : null);
                            map3 = map9;
                        }
                    }
                }
                Map map10 = map3;
                OooOo.OooO00o oooO00o6 = new OooOo.OooO00o();
                if (zziiVar2 != null && zziiVar2.zzh() != 0) {
                    Iterator it9 = zziiVar2.zzg().iterator();
                    while (it9.hasNext()) {
                        com.google.android.gms.internal.measurement.zzik zzikVar2 = (com.google.android.gms.internal.measurement.zzik) it9.next();
                        if (zzikVar2.zza() && zzikVar2.zzd() > 0) {
                            oooO00o6.put(Integer.valueOf(zzikVar2.zzb()), Long.valueOf(zzikVar2.zze(zzikVar2.zzd() - 1)));
                            it9 = it9;
                            zziiVar2 = zziiVar2;
                        }
                    }
                }
                com.google.android.gms.internal.measurement.zzii zziiVar3 = zziiVar2;
                if (zziiVar3 != null) {
                    int i4 = 0;
                    while (i4 < zziiVar3.zzb() * 64) {
                        if (zzpk.zzn(zziiVar3.zza(), i4)) {
                            z4 = zZzp;
                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i4));
                            bitSet2.set(i4);
                            if (zzpk.zzn(zziiVar3.zzc(), i4)) {
                                bitSet.set(i4);
                            }
                            i4++;
                            zZzp = z4;
                        } else {
                            z4 = zZzp;
                        }
                        oooO00o5.remove(Integer.valueOf(i4));
                        i4++;
                        zZzp = z4;
                    }
                }
                boolean z5 = zZzp;
                com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) map2.get(num2);
                if (zZzp2 && z5 && (list3 = (List) map.get(num2)) != null && this.zze != null && this.zzd != null) {
                    Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        com.google.android.gms.internal.measurement.zzff zzffVar2 = (com.google.android.gms.internal.measurement.zzff) it10.next();
                        int iZzb = zzffVar2.zzb();
                        Iterator it11 = it10;
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzffVar2.zzj()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf3 = Integer.valueOf(iZzb);
                        if (oooO00o5.containsKey(numValueOf3)) {
                            oooO00o5.put(numValueOf3, Long.valueOf(jLongValue));
                        }
                        if (oooO00o6.containsKey(numValueOf3)) {
                            oooO00o6.put(numValueOf3, Long.valueOf(jLongValue));
                        }
                        it10 = it11;
                    }
                }
                this.zzc.put(num2, new zzy(this, this.zza, zziiVar4, bitSet, bitSet2, oooO00o5, oooO00o6, null));
                zZzp = z5;
                map3 = map10;
            }
        }
        String str1322 = str3;
        String str1422 = str4;
        String str1522 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            zzz zzzVar2 = new zzz(this, null);
            OooOo.OooO00o oooO00o7 = new OooOo.OooO00o();
            Iterator it12 = list.iterator();
            while (it12.hasNext()) {
                com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it12.next();
                com.google.android.gms.internal.measurement.zzhs zzhsVarZza = zzzVar2.zza(this.zza, zzhsVar);
                if (zzhsVarZza != null) {
                    zzpg zzpgVar2 = this.zzg;
                    zzbc zzbcVarZzaf = zzpgVar2.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                    zzpgVar2.zzj().zzh(zzbcVarZzaf);
                    if (!z) {
                        long j2 = zzbcVarZzaf.zzc;
                        String strZzd = zzhsVarZza.zzd();
                        Map map11 = (Map) oooO00o7.get(strZzd);
                        if (map11 == null) {
                            zzav zzavVarZzj5 = zzpgVar2.zzj();
                            String str20 = this.zza;
                            zzavVarZzj5.zzaw();
                            zzavVarZzj5.zzg();
                            Preconditions.checkNotEmpty(str20);
                            Preconditions.checkNotEmpty(strZzd);
                            OooOo.OooO00o oooO00o8 = new OooOo.OooO00o();
                            zzzVar = zzzVar2;
                            it2 = it12;
                            str5 = str1322;
                            str6 = str1422;
                            try {
                                try {
                                    zzbcVar = zzbcVarZzaf;
                                } catch (Throwable th7) {
                                    th = th7;
                                    cursor2 = null;
                                }
                                try {
                                    cursorQuery2 = zzavVarZzj5.zze().query("event_filters", new String[]{str6, str5}, "app_id=? AND event_name=?", new String[]{str20, strZzd}, null, null, null);
                                    try {
                                        try {
                                        } catch (SQLiteException e12) {
                                            e = e12;
                                            j = j2;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        cursor2 = cursorQuery2;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    j = j2;
                                    cursorQuery2 = null;
                                    zzavVarZzj5.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str20), e);
                                    map11 = Collections.EMPTY_MAP;
                                    if (cursorQuery2 != null) {
                                    }
                                    oooO00o7.put(strZzd, map11);
                                    while (r6.hasNext()) {
                                    }
                                    str1322 = str5;
                                    str1422 = str6;
                                    zzzVar2 = zzzVar;
                                    it12 = it2;
                                }
                            } catch (SQLiteException e14) {
                                e = e14;
                                zzbcVar = zzbcVarZzaf;
                            }
                            if (cursorQuery2.moveToFirst()) {
                                j = j2;
                                do {
                                    try {
                                        try {
                                            com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                            Integer numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                            List arrayList6 = (List) oooO00o8.get(numValueOf4);
                                            if (arrayList6 == null) {
                                                arrayList6 = new ArrayList();
                                                oooO00o8.put(numValueOf4, arrayList6);
                                            }
                                            arrayList6.add(zzffVar3);
                                        } catch (IOException e15) {
                                            zzavVarZzj5.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str20), e15);
                                        }
                                    } catch (SQLiteException e16) {
                                        e = e16;
                                        zzavVarZzj5.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str20), e);
                                        map11 = Collections.EMPTY_MAP;
                                        if (cursorQuery2 != null) {
                                            cursorQuery2.close();
                                        }
                                    }
                                } while (cursorQuery2.moveToNext());
                                cursorQuery2.close();
                                map11 = oooO00o8;
                                oooO00o7.put(strZzd, map11);
                            } else {
                                j = j2;
                                map11 = Collections.EMPTY_MAP;
                                cursorQuery2.close();
                                oooO00o7.put(strZzd, map11);
                            }
                        } else {
                            zzzVar = zzzVar2;
                            it2 = it12;
                            zzbcVar = zzbcVarZzaf;
                            j = j2;
                            str5 = str1322;
                            str6 = str1422;
                        }
                        for (Integer num3 : map11.keySet()) {
                            int iIntValue = num3.intValue();
                            if (this.zzb.contains(num3)) {
                                this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                            } else {
                                Iterator it13 = ((List) map11.get(num3)).iterator();
                                boolean zZzd = true;
                                while (true) {
                                    if (!it13.hasNext()) {
                                        map4 = map11;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it13.next();
                                    zzaa zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar4);
                                    map4 = map11;
                                    zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j, zzbcVar, zzd(iIntValue, zzffVar4.zzb()));
                                    if (!zZzd) {
                                        this.zzb.add(num3);
                                        break;
                                    }
                                    zzc(num3).zza(zzaaVar);
                                    map11 = map4;
                                }
                                if (!zZzd) {
                                    this.zzb.add(num3);
                                }
                                map11 = map4;
                            }
                        }
                        str1322 = str5;
                        str1422 = str6;
                        zzzVar2 = zzzVar;
                        it12 = it2;
                    }
                }
            }
        }
        String str1622 = str1322;
        String str1722 = str1422;
        if (z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            OooOo.OooO00o oooO00o9 = new OooOo.OooO00o();
            Iterator it14 = list2.iterator();
            while (it14.hasNext()) {
                com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it14.next();
                String strZzc = zziuVar.zzc();
                Map map12 = (Map) oooO00o9.get(strZzc);
                if (map12 == null) {
                    zzav zzavVarZzj6 = this.zzg.zzj();
                    String str21 = this.zza;
                    zzavVarZzj6.zzaw();
                    zzavVarZzj6.zzg();
                    Preconditions.checkNotEmpty(str21);
                    Preconditions.checkNotEmpty(strZzc);
                    OooOo.OooO00o oooO00o10 = new OooOo.OooO00o();
                    try {
                        cursorQuery3 = zzavVarZzj6.zze().query("property_filters", new String[]{str1722, str1622}, "app_id=? AND property_name=?", new String[]{str21, strZzc}, null, null, null);
                        try {
                            try {
                            } catch (Throwable th9) {
                                th = th9;
                                cursor3 = cursorQuery3;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e17) {
                            e = e17;
                            str7 = str1622;
                        }
                    } catch (SQLiteException e18) {
                        e = e18;
                        str7 = str1622;
                        it3 = it14;
                        cursorQuery3 = null;
                    } catch (Throwable th10) {
                        th = th10;
                        cursor3 = null;
                    }
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            try {
                                com.google.android.gms.internal.measurement.zzfn zzfnVar = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                Integer numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                List list6 = (List) oooO00o10.get(numValueOf5);
                                if (list6 == null) {
                                    str7 = str1622;
                                    try {
                                        arrayList = new ArrayList();
                                        oooO00o10.put(numValueOf5, arrayList);
                                    } catch (SQLiteException e19) {
                                        e = e19;
                                        it3 = it14;
                                        zzavVarZzj6.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str21), e);
                                        map12 = Collections.EMPTY_MAP;
                                        if (cursorQuery3 != null) {
                                            cursorQuery3.close();
                                        }
                                    }
                                } else {
                                    str7 = str1622;
                                    arrayList = list6;
                                }
                                arrayList.add(zzfnVar);
                                it3 = it14;
                            } catch (IOException e20) {
                                str7 = str1622;
                                it3 = it14;
                                try {
                                    zzavVarZzj6.zzu.zzaV().zzb().zzc("Failed to merge filter", zzgu.zzl(str21), e20);
                                } catch (SQLiteException e21) {
                                    e = e21;
                                    zzavVarZzj6.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str21), e);
                                    map12 = Collections.EMPTY_MAP;
                                    if (cursorQuery3 != null) {
                                    }
                                }
                            }
                            if (!cursorQuery3.moveToNext()) {
                                break;
                            }
                            it14 = it3;
                            str1622 = str7;
                        }
                        cursorQuery3.close();
                        map12 = oooO00o10;
                        oooO00o9.put(strZzc, map12);
                    } else {
                        str7 = str1622;
                        it3 = it14;
                        map12 = Collections.EMPTY_MAP;
                        cursorQuery3.close();
                        oooO00o9.put(strZzc, map12);
                    }
                } else {
                    str7 = str1622;
                    it3 = it14;
                }
                Iterator it15 = map12.keySet().iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Integer num4 = (Integer) it15.next();
                        int iIntValue2 = num4.intValue();
                        if (this.zzb.contains(num4)) {
                            this.zzu.zzaV().zzk().zzb(str1522, num4);
                            break;
                        }
                        Iterator it16 = ((List) map12.get(num4)).iterator();
                        boolean zZzd2 = true;
                        while (true) {
                            if (!it16.hasNext()) {
                                map5 = map12;
                                str8 = str1522;
                                break;
                            }
                            com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) it16.next();
                            zzic zzicVar2 = this.zzu;
                            if (Log.isLoggable(zzicVar2.zzaV().zzn(), 2)) {
                                map5 = map12;
                                str8 = str1522;
                                zzicVar2.zzaV().zzk().zzd("Evaluating filter. audience, filter, property", num4, zzfnVar2.zza() ? Integer.valueOf(zzfnVar2.zzb()) : null, zzicVar2.zzl().zzc(zzfnVar2.zzc()));
                                zzicVar2.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar2));
                            } else {
                                map5 = map12;
                                str8 = str1522;
                            }
                            if (!zzfnVar2.zza() || zzfnVar2.zzb() > 256) {
                                break;
                            }
                            zzac zzacVar = new zzac(this, this.zza, iIntValue2, zzfnVar2);
                            zZzd2 = zzacVar.zzd(this.zzd, this.zze, zziuVar, zzd(iIntValue2, zzfnVar2.zzb()));
                            if (!zZzd2) {
                                this.zzb.add(num4);
                                break;
                            }
                            zzc(num4).zza(zzacVar);
                            map12 = map5;
                            str1522 = str8;
                        }
                        if (!zZzd2) {
                            this.zzb.add(num4);
                        }
                        map12 = map5;
                        str1522 = str8;
                    }
                }
                it14 = it3;
                str1622 = str7;
            }
        }
        ArrayList arrayList7 = new ArrayList();
        Set<Integer> setKeySet = this.zzc.keySet();
        setKeySet.removeAll(this.zzb);
        for (Integer num5 : setKeySet) {
            int iIntValue3 = num5.intValue();
            zzy zzyVar = (zzy) this.zzc.get(num5);
            Preconditions.checkNotNull(zzyVar);
            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb = zzyVar.zzb(iIntValue3);
            arrayList7.add(zzhgVarZzb);
            zzav zzavVarZzj7 = this.zzg.zzj();
            String str22 = this.zza;
            com.google.android.gms.internal.measurement.zzii zziiVarZzc = zzhgVarZzb.zzc();
            zzavVarZzj7.zzaw();
            zzavVarZzj7.zzg();
            Preconditions.checkNotEmpty(str22);
            Preconditions.checkNotNull(zziiVarZzc);
            byte[] bArrZzcc = zziiVarZzc.zzcc();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(HiAnalyticsConstant.BI_KEY_APP_ID, str22);
            contentValues2.put(str1722, num5);
            contentValues2.put("current_results", bArrZzcc);
            try {
                try {
                    if (zzavVarZzj7.zze().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                        zzavVarZzj7.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str22));
                    }
                } catch (SQLiteException e22) {
                    e = e22;
                    zzavVarZzj7.zzu.zzaV().zzb().zzc("Error storing filter results. appId", zzgu.zzl(str22), e);
                }
            } catch (SQLiteException e23) {
                e = e23;
            }
        }
        return arrayList7;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }
}
