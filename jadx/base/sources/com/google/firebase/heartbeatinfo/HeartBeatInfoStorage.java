package com.google.firebase.heartbeatinfo;

import android.content.Context;
import androidx.datastore.preferences.protobuf.o000oOoO;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.datastorage.JavaDataStorageKt;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import o0000oOO.C24340OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
class HeartBeatInfoStorage {
    private static final String HEARTBEAT_PREFERENCES_NAME = "FirebaseHeartBeat";
    private static final int HEART_BEAT_COUNT_LIMIT = 30;
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static HeartBeatInfoStorage instance;
    private final JavaDataStorage firebaseDataStore;
    private static final AbstractC24338OooO0o0.OooO00o<Long> GLOBAL = C24340OooO0oo.OooO0Oo("fire-global");
    private static final AbstractC24338OooO0o0.OooO00o<Long> HEART_BEAT_COUNT_TAG = C24340OooO0oo.OooO0Oo("fire-count");
    private static final AbstractC24338OooO0o0.OooO00o<String> LAST_STORED_DATE = C24340OooO0oo.OooO0o0("last-used-date");

    public HeartBeatInfoStorage(Context context, String str) {
        this.firebaseDataStore = new JavaDataStorage(context, com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o(HEARTBEAT_PREFERENCES_NAME, str));
    }

    private synchronized long cleanUpStoredHeartBeats(C24334OooO0O0 c24334OooO0O0) {
        long j;
        try {
            long jLongValue = ((Long) JavaDataStorageKt.getOrDefault(c24334OooO0O0, HEART_BEAT_COUNT_TAG, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry<AbstractC24338OooO0o0.OooO00o<?>, Object> entry : c24334OooO0O0.OooO00o().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = entry.getKey().f81922OooO00o;
                            hashSet = set;
                            str2 = str3;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            c24334OooO0O0.OooO0oo(C24340OooO0oo.OooO0o(str), hashSet2);
            j = jLongValue - 1;
            c24334OooO0O0.OooO0oO(HEART_BEAT_COUNT_TAG, Long.valueOf(j));
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    private synchronized String getFormattedDate(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    private synchronized AbstractC24338OooO0o0.OooO00o<Set<String>> getStoredUserAgentString(C24334OooO0O0 c24334OooO0O0, String str) {
        for (Map.Entry<AbstractC24338OooO0o0.OooO00o<?>, Object> entry : c24334OooO0O0.OooO00o().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return C24340OooO0oo.OooO0o(entry.getKey().f81922OooO00o);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C32460OooOooO lambda$deleteAllHeartBeats$0(C24334OooO0O0 c24334OooO0O0) {
        long j = 0;
        for (Map.Entry<AbstractC24338OooO0o0.OooO00o<?>, Object> entry : c24334OooO0O0.OooO00o().entrySet()) {
            if (entry.getValue() instanceof Set) {
                AbstractC24338OooO0o0.OooO00o<?> key = entry.getKey();
                Set set = (Set) entry.getValue();
                String formattedDate = getFormattedDate(System.currentTimeMillis());
                if (set.contains(formattedDate)) {
                    Object[] objArr = {formattedDate};
                    HashSet hashSet = new HashSet(1);
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj);
                    if (!hashSet.add(obj)) {
                        throw new IllegalArgumentException(o000oOoO.OooO00o(obj, "duplicate element: "));
                    }
                    c24334OooO0O0.OooO0oO(key, Collections.unmodifiableSet(hashSet));
                    j++;
                } else {
                    c24334OooO0O0.OooO0o(key);
                }
            }
        }
        if (j == 0) {
            c24334OooO0O0.OooO0o(HEART_BEAT_COUNT_TAG);
            return null;
        }
        c24334OooO0O0.OooO0oO(HEART_BEAT_COUNT_TAG, Long.valueOf(j));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C32460OooOooO lambda$postHeartBeatCleanUp$1(String str, C24334OooO0O0 c24334OooO0O0) {
        c24334OooO0O0.OooO0oO(LAST_STORED_DATE, str);
        removeStoredDate(c24334OooO0O0, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C32460OooOooO lambda$storeHeartBeat$2(String str, String str2, AbstractC24338OooO0o0.OooO00o oooO00o, C24334OooO0O0 c24334OooO0O0) {
        AbstractC24338OooO0o0.OooO00o<String> oooO00o2 = LAST_STORED_DATE;
        if (((String) JavaDataStorageKt.getOrDefault(c24334OooO0O0, oooO00o2, "")).equals(str)) {
            AbstractC24338OooO0o0.OooO00o<Set<String>> storedUserAgentString = getStoredUserAgentString(c24334OooO0O0, str);
            if (storedUserAgentString == null || storedUserAgentString.f81922OooO00o.equals(str2)) {
                return null;
            }
            updateStoredUserAgent(c24334OooO0O0, oooO00o, str);
            return null;
        }
        AbstractC24338OooO0o0.OooO00o<Long> oooO00o3 = HEART_BEAT_COUNT_TAG;
        long jLongValue = ((Long) JavaDataStorageKt.getOrDefault(c24334OooO0O0, oooO00o3, 0L)).longValue();
        if (jLongValue + 1 == 30) {
            jLongValue = cleanUpStoredHeartBeats(c24334OooO0O0);
        }
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(c24334OooO0O0, oooO00o, new HashSet()));
        hashSet.add(str);
        c24334OooO0O0.OooO0oO(oooO00o, hashSet);
        c24334OooO0O0.OooO0oO(oooO00o3, Long.valueOf(jLongValue + 1));
        c24334OooO0O0.OooO0oO(oooO00o2, str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C32460OooOooO lambda$updateGlobalHeartBeat$3(long j, C24334OooO0O0 c24334OooO0O0) {
        c24334OooO0O0.OooO0oO(GLOBAL, Long.valueOf(j));
        return null;
    }

    private synchronized void removeStoredDate(C24334OooO0O0 c24334OooO0O0, String str) {
        try {
            AbstractC24338OooO0o0.OooO00o<?> storedUserAgentString = getStoredUserAgentString(c24334OooO0O0, str);
            if (storedUserAgentString == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(c24334OooO0O0, storedUserAgentString, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                c24334OooO0O0.OooO0o(storedUserAgentString);
            } else {
                c24334OooO0O0.getClass();
                c24334OooO0O0.OooO0oo(storedUserAgentString, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void updateStoredUserAgent(C24334OooO0O0 c24334OooO0O0, AbstractC24338OooO0o0.OooO00o<Set<String>> oooO00o, String str) {
        removeStoredDate(c24334OooO0O0, str);
        HashSet hashSet = new HashSet((Collection) JavaDataStorageKt.getOrDefault(c24334OooO0O0, oooO00o, new HashSet()));
        hashSet.add(str);
        c24334OooO0O0.OooO0oO(oooO00o, hashSet);
    }

    public synchronized void deleteAllHeartBeats() {
        this.firebaseDataStore.editSync(new InterfaceC32507OooOO0o() { // from class: com.google.firebase.heartbeatinfo.OooO0o
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                return this.f68457OooOo0o.lambda$deleteAllHeartBeats$0((C24334OooO0O0) obj);
            }
        });
    }

    public synchronized List<HeartBeatResult> getAllHeartBeats() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String formattedDate = getFormattedDate(System.currentTimeMillis());
            for (Map.Entry<AbstractC24338OooO0o0.OooO00o<?>, Object> entry : this.firebaseDataStore.getAllSync().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(formattedDate);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey().f81922OooO00o, new ArrayList(hashSet)));
                    }
                }
            }
            updateGlobalHeartBeat(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public int getHeartBeatCount() {
        return ((Long) this.firebaseDataStore.getSync(HEART_BEAT_COUNT_TAG, 0L)).intValue();
    }

    public synchronized long getLastGlobalHeartBeat() {
        return ((Long) this.firebaseDataStore.getSync(GLOBAL, -1L)).longValue();
    }

    public synchronized boolean isSameDateUtc(long j, long j2) {
        return getFormattedDate(j).equals(getFormattedDate(j2));
    }

    public synchronized void postHeartBeatCleanUp() {
        final String formattedDate = getFormattedDate(System.currentTimeMillis());
        this.firebaseDataStore.editSync(new InterfaceC32507OooOO0o() { // from class: com.google.firebase.heartbeatinfo.OooO0oO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                return this.f68463OooOo0o.lambda$postHeartBeatCleanUp$1(formattedDate, (C24334OooO0O0) obj);
            }
        });
    }

    public synchronized boolean shouldSendGlobalHeartBeat(long j) {
        return shouldSendSdkHeartBeat(GLOBAL, j);
    }

    public synchronized boolean shouldSendSdkHeartBeat(AbstractC24338OooO0o0.OooO00o<Long> oooO00o, long j) {
        if (isSameDateUtc(((Long) this.firebaseDataStore.getSync(oooO00o, -1L)).longValue(), j)) {
            return false;
        }
        this.firebaseDataStore.putSync(oooO00o, Long.valueOf(j));
        return true;
    }

    public synchronized void storeHeartBeat(long j, final String str) {
        final String formattedDate = getFormattedDate(j);
        final AbstractC24338OooO0o0.OooO00o<Set<String>> oooO00oOooO0o = C24340OooO0oo.OooO0o(str);
        this.firebaseDataStore.editSync(new InterfaceC32507OooOO0o() { // from class: com.google.firebase.heartbeatinfo.OooO0o0
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                HeartBeatInfoStorage heartBeatInfoStorage = this.f68459OooOo0o;
                String str2 = str;
                return heartBeatInfoStorage.lambda$storeHeartBeat$2(formattedDate, str2, oooO00oOooO0o, (C24334OooO0O0) obj);
            }
        });
    }

    public synchronized void updateGlobalHeartBeat(final long j) {
        this.firebaseDataStore.editSync(new InterfaceC32507OooOO0o() { // from class: com.google.firebase.heartbeatinfo.OooO0oo
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                return HeartBeatInfoStorage.lambda$updateGlobalHeartBeat$3(j, (C24334OooO0O0) obj);
            }
        });
    }

    public HeartBeatInfoStorage(JavaDataStorage javaDataStorage) {
        this.firebaseDataStore = javaDataStorage;
    }
}
