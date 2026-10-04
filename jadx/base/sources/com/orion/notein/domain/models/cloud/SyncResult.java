package com.orion.notein.domain.models.cloud;

import com.google.firebase.messaging.Constants;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OOOo0.C27174OooO0O0;
import oO0O000o.OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0018\u00010\u0007\u0012\"\b\u0002\u0010\t\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0014\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ¤\u0001\u0010\u001d\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\"\b\u0002\u0010\b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0018\u00010\u00072\"\b\u0002\u0010\t\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0013R1\u0010\b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R1\u0010\t\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b*\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b\r\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b/\u0010\u001a¨\u00060"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/SyncResult;", "", "", "", "Lo0OOOo0/OooO0O0;", "Lcom/orion/notein/domain/models/note/NoteMeta;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/Function0;", "cloudFileNotEmptyOnFirstlyFetchFunc", "cloudFileEmptyOnFirstlyFetchFunc", "", "cloudNotesCount", "", "isCloudDBVersionIsBiggerThanLocal", "shouldSetHMSCoreAutoStarted", "showOnlySyncOnWifi", "<init>", "(Ljava/util/Map;LoO0O000o/OooO00o;LoO0O000o/OooO00o;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/util/Map;", "component2", "()LoO0O000o/OooO00o;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "copy", "(Ljava/util/Map;LoO0O000o/OooO00o;LoO0O000o/OooO00o;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/orion/notein/domain/models/cloud/SyncResult;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getData", "LoO0O000o/OooO00o;", "getCloudFileNotEmptyOnFirstlyFetchFunc", "getCloudFileEmptyOnFirstlyFetchFunc", "Ljava/lang/Integer;", "getCloudNotesCount", "Ljava/lang/Boolean;", "getShouldSetHMSCoreAutoStarted", "getShowOnlySyncOnWifi", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class SyncResult {
    private final OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> cloudFileEmptyOnFirstlyFetchFunc;
    private final OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> cloudFileNotEmptyOnFirstlyFetchFunc;
    private final Integer cloudNotesCount;
    private final Map<String, C27174OooO0O0<NoteMeta>> data;
    private final Boolean isCloudDBVersionIsBiggerThanLocal;
    private final Boolean shouldSetHMSCoreAutoStarted;
    private final Boolean showOnlySyncOnWifi;

    public SyncResult() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncResult copy$default(SyncResult syncResult, Map map, OooO00o oooO00o, OooO00o oooO00o2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            map = syncResult.data;
        }
        if ((i & 2) != 0) {
            oooO00o = syncResult.cloudFileNotEmptyOnFirstlyFetchFunc;
        }
        if ((i & 4) != 0) {
            oooO00o2 = syncResult.cloudFileEmptyOnFirstlyFetchFunc;
        }
        if ((i & 8) != 0) {
            num = syncResult.cloudNotesCount;
        }
        if ((i & 16) != 0) {
            bool = syncResult.isCloudDBVersionIsBiggerThanLocal;
        }
        if ((i & 32) != 0) {
            bool2 = syncResult.shouldSetHMSCoreAutoStarted;
        }
        if ((i & 64) != 0) {
            bool3 = syncResult.showOnlySyncOnWifi;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        Boolean bool6 = bool;
        OooO00o oooO00o3 = oooO00o2;
        return syncResult.copy(map, oooO00o, oooO00o3, num, bool6, bool4, bool5);
    }

    public final Map<String, C27174OooO0O0<NoteMeta>> component1() {
        return this.data;
    }

    public final OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> component2() {
        return this.cloudFileNotEmptyOnFirstlyFetchFunc;
    }

    public final OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> component3() {
        return this.cloudFileEmptyOnFirstlyFetchFunc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCloudNotesCount() {
        return this.cloudNotesCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsCloudDBVersionIsBiggerThanLocal() {
        return this.isCloudDBVersionIsBiggerThanLocal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getShouldSetHMSCoreAutoStarted() {
        return this.shouldSetHMSCoreAutoStarted;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getShowOnlySyncOnWifi() {
        return this.showOnlySyncOnWifi;
    }

    public final SyncResult copy(Map<String, C27174OooO0O0<NoteMeta>> data, OooO00o<? extends Map<String, C27174OooO0O0<NoteMeta>>> cloudFileNotEmptyOnFirstlyFetchFunc, OooO00o<? extends Map<String, C27174OooO0O0<NoteMeta>>> cloudFileEmptyOnFirstlyFetchFunc, Integer cloudNotesCount, Boolean isCloudDBVersionIsBiggerThanLocal, Boolean shouldSetHMSCoreAutoStarted, Boolean showOnlySyncOnWifi) {
        OooOOO0.OooO0oO(data, "data");
        return new SyncResult(data, cloudFileNotEmptyOnFirstlyFetchFunc, cloudFileEmptyOnFirstlyFetchFunc, cloudNotesCount, isCloudDBVersionIsBiggerThanLocal, shouldSetHMSCoreAutoStarted, showOnlySyncOnWifi);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncResult)) {
            return false;
        }
        SyncResult syncResult = (SyncResult) other;
        return OooOOO0.OooO0O0(this.data, syncResult.data) && OooOOO0.OooO0O0(this.cloudFileNotEmptyOnFirstlyFetchFunc, syncResult.cloudFileNotEmptyOnFirstlyFetchFunc) && OooOOO0.OooO0O0(this.cloudFileEmptyOnFirstlyFetchFunc, syncResult.cloudFileEmptyOnFirstlyFetchFunc) && OooOOO0.OooO0O0(this.cloudNotesCount, syncResult.cloudNotesCount) && OooOOO0.OooO0O0(this.isCloudDBVersionIsBiggerThanLocal, syncResult.isCloudDBVersionIsBiggerThanLocal) && OooOOO0.OooO0O0(this.shouldSetHMSCoreAutoStarted, syncResult.shouldSetHMSCoreAutoStarted) && OooOOO0.OooO0O0(this.showOnlySyncOnWifi, syncResult.showOnlySyncOnWifi);
    }

    public final OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> getCloudFileEmptyOnFirstlyFetchFunc() {
        return this.cloudFileEmptyOnFirstlyFetchFunc;
    }

    public final OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> getCloudFileNotEmptyOnFirstlyFetchFunc() {
        return this.cloudFileNotEmptyOnFirstlyFetchFunc;
    }

    public final Integer getCloudNotesCount() {
        return this.cloudNotesCount;
    }

    public final Map<String, C27174OooO0O0<NoteMeta>> getData() {
        return this.data;
    }

    public final Boolean getShouldSetHMSCoreAutoStarted() {
        return this.shouldSetHMSCoreAutoStarted;
    }

    public final Boolean getShowOnlySyncOnWifi() {
        return this.showOnlySyncOnWifi;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> oooO00o = this.cloudFileNotEmptyOnFirstlyFetchFunc;
        int iHashCode2 = (iHashCode + (oooO00o == null ? 0 : oooO00o.hashCode())) * 31;
        OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> oooO00o2 = this.cloudFileEmptyOnFirstlyFetchFunc;
        int iHashCode3 = (iHashCode2 + (oooO00o2 == null ? 0 : oooO00o2.hashCode())) * 31;
        Integer num = this.cloudNotesCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isCloudDBVersionIsBiggerThanLocal;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldSetHMSCoreAutoStarted;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showOnlySyncOnWifi;
        return iHashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Boolean isCloudDBVersionIsBiggerThanLocal() {
        return this.isCloudDBVersionIsBiggerThanLocal;
    }

    public String toString() {
        return "SyncResult(data=" + this.data + ", cloudFileNotEmptyOnFirstlyFetchFunc=" + this.cloudFileNotEmptyOnFirstlyFetchFunc + ", cloudFileEmptyOnFirstlyFetchFunc=" + this.cloudFileEmptyOnFirstlyFetchFunc + ", cloudNotesCount=" + this.cloudNotesCount + ", isCloudDBVersionIsBiggerThanLocal=" + this.isCloudDBVersionIsBiggerThanLocal + ", shouldSetHMSCoreAutoStarted=" + this.shouldSetHMSCoreAutoStarted + ", showOnlySyncOnWifi=" + this.showOnlySyncOnWifi + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SyncResult(Map<String, C27174OooO0O0<NoteMeta>> data, OooO00o<? extends Map<String, C27174OooO0O0<NoteMeta>>> oooO00o, OooO00o<? extends Map<String, C27174OooO0O0<NoteMeta>>> oooO00o2, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        OooOOO0.OooO0oO(data, "data");
        this.data = data;
        this.cloudFileNotEmptyOnFirstlyFetchFunc = oooO00o;
        this.cloudFileEmptyOnFirstlyFetchFunc = oooO00o2;
        this.cloudNotesCount = num;
        this.isCloudDBVersionIsBiggerThanLocal = bool;
        this.shouldSetHMSCoreAutoStarted = bool2;
        this.showOnlySyncOnWifi = bool3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SyncResult(java.util.Map r2, oO0O000o.OooO00o r3, oO0O000o.OooO00o r4, java.lang.Integer r5, java.lang.Boolean r6, java.lang.Boolean r7, java.lang.Boolean r8, int r9, kotlin.jvm.internal.C24018OooO0oo r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            oOo000Oo.OooOoOO r2 = oOo000Oo.C34436OooOoOO.f123455OooOo0o
        L6:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = r0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            r7 = r0
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L35
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.cloud.SyncResult.<init>(java.util.Map, oO0O000o.OooO00o, oO0O000o.OooO00o, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.OooO0oo):void");
    }
}
