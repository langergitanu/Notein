package com.orion.notein.domain.models.cloud;

import OooOoo0.o00000;
import androidx.core.app.FrameMetricsAggregator;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OOOo0.C27174OooO0O0;
import oO0O000o.OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b-\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\"\b\u0002\u0010\f\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0018\u00010\t\u0012\"\b\u0002\u0010\r\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u001d\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010!J¸\u0001\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\"\b\u0002\u0010\f\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0018\u00010\t2\"\b\u0002\u0010\r\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001aR1\u0010\f\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u001cR1\u0010\r\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b5\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b\u0010\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010!R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b:\u0010!¨\u0006;"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloud/SyncVO;", "", "", "", "resourceNotExistsNoteIds", "", "resourceConflictNoteIdToTitleMap", "", "spaceIsFull", "Lkotlin/Function0;", "Lo0OOOo0/OooO0O0;", "Lcom/orion/notein/domain/models/note/NoteMeta;", "cloudFileNotEmptyOnFirstlyFetchFunc", "cloudFileEmptyOnFirstlyFetchFunc", "", "cloudNotesCount", "isCloudDBVersionIsBiggerThanLocal", "shouldSetHMSCoreAutoStarted", "showOnlySyncOnWifi", "<init>", "(Ljava/util/Set;Ljava/util/Map;ZLoO0O000o/OooO00o;LoO0O000o/OooO00o;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/util/Set;", "component2", "()Ljava/util/Map;", "component3", "()Z", "component4", "()LoO0O000o/OooO00o;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "copy", "(Ljava/util/Set;Ljava/util/Map;ZLoO0O000o/OooO00o;LoO0O000o/OooO00o;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/orion/notein/domain/models/cloud/SyncVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getResourceNotExistsNoteIds", "Ljava/util/Map;", "getResourceConflictNoteIdToTitleMap", "Z", "getSpaceIsFull", "LoO0O000o/OooO00o;", "getCloudFileNotEmptyOnFirstlyFetchFunc", "getCloudFileEmptyOnFirstlyFetchFunc", "Ljava/lang/Integer;", "getCloudNotesCount", "Ljava/lang/Boolean;", "getShouldSetHMSCoreAutoStarted", "getShowOnlySyncOnWifi", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class SyncVO {
    private final OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> cloudFileEmptyOnFirstlyFetchFunc;
    private final OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> cloudFileNotEmptyOnFirstlyFetchFunc;
    private final Integer cloudNotesCount;
    private final Boolean isCloudDBVersionIsBiggerThanLocal;
    private final Map<String, String> resourceConflictNoteIdToTitleMap;
    private final Set<String> resourceNotExistsNoteIds;
    private final Boolean shouldSetHMSCoreAutoStarted;
    private final Boolean showOnlySyncOnWifi;
    private final boolean spaceIsFull;

    public SyncVO() {
        this(null, null, false, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncVO copy$default(SyncVO syncVO, Set set, Map map, boolean z, OooO00o oooO00o, OooO00o oooO00o2, Integer num, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            set = syncVO.resourceNotExistsNoteIds;
        }
        if ((i & 2) != 0) {
            map = syncVO.resourceConflictNoteIdToTitleMap;
        }
        if ((i & 4) != 0) {
            z = syncVO.spaceIsFull;
        }
        if ((i & 8) != 0) {
            oooO00o = syncVO.cloudFileNotEmptyOnFirstlyFetchFunc;
        }
        if ((i & 16) != 0) {
            oooO00o2 = syncVO.cloudFileEmptyOnFirstlyFetchFunc;
        }
        if ((i & 32) != 0) {
            num = syncVO.cloudNotesCount;
        }
        if ((i & 64) != 0) {
            bool = syncVO.isCloudDBVersionIsBiggerThanLocal;
        }
        if ((i & 128) != 0) {
            bool2 = syncVO.shouldSetHMSCoreAutoStarted;
        }
        if ((i & 256) != 0) {
            bool3 = syncVO.showOnlySyncOnWifi;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        Integer num2 = num;
        Boolean bool6 = bool;
        OooO00o oooO00o3 = oooO00o2;
        boolean z2 = z;
        return syncVO.copy(set, map, z2, oooO00o, oooO00o3, num2, bool6, bool4, bool5);
    }

    public final Set<String> component1() {
        return this.resourceNotExistsNoteIds;
    }

    public final Map<String, String> component2() {
        return this.resourceConflictNoteIdToTitleMap;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSpaceIsFull() {
        return this.spaceIsFull;
    }

    public final OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> component4() {
        return this.cloudFileNotEmptyOnFirstlyFetchFunc;
    }

    public final OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> component5() {
        return this.cloudFileEmptyOnFirstlyFetchFunc;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCloudNotesCount() {
        return this.cloudNotesCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsCloudDBVersionIsBiggerThanLocal() {
        return this.isCloudDBVersionIsBiggerThanLocal;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getShouldSetHMSCoreAutoStarted() {
        return this.shouldSetHMSCoreAutoStarted;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getShowOnlySyncOnWifi() {
        return this.showOnlySyncOnWifi;
    }

    public final SyncVO copy(Set<String> resourceNotExistsNoteIds, Map<String, String> resourceConflictNoteIdToTitleMap, boolean spaceIsFull, OooO00o<? extends Map<String, C27174OooO0O0<NoteMeta>>> cloudFileNotEmptyOnFirstlyFetchFunc, OooO00o<? extends Map<String, C27174OooO0O0<NoteMeta>>> cloudFileEmptyOnFirstlyFetchFunc, Integer cloudNotesCount, Boolean isCloudDBVersionIsBiggerThanLocal, Boolean shouldSetHMSCoreAutoStarted, Boolean showOnlySyncOnWifi) {
        OooOOO0.OooO0oO(resourceNotExistsNoteIds, "resourceNotExistsNoteIds");
        OooOOO0.OooO0oO(resourceConflictNoteIdToTitleMap, "resourceConflictNoteIdToTitleMap");
        return new SyncVO(resourceNotExistsNoteIds, resourceConflictNoteIdToTitleMap, spaceIsFull, cloudFileNotEmptyOnFirstlyFetchFunc, cloudFileEmptyOnFirstlyFetchFunc, cloudNotesCount, isCloudDBVersionIsBiggerThanLocal, shouldSetHMSCoreAutoStarted, showOnlySyncOnWifi);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncVO)) {
            return false;
        }
        SyncVO syncVO = (SyncVO) other;
        return OooOOO0.OooO0O0(this.resourceNotExistsNoteIds, syncVO.resourceNotExistsNoteIds) && OooOOO0.OooO0O0(this.resourceConflictNoteIdToTitleMap, syncVO.resourceConflictNoteIdToTitleMap) && this.spaceIsFull == syncVO.spaceIsFull && OooOOO0.OooO0O0(this.cloudFileNotEmptyOnFirstlyFetchFunc, syncVO.cloudFileNotEmptyOnFirstlyFetchFunc) && OooOOO0.OooO0O0(this.cloudFileEmptyOnFirstlyFetchFunc, syncVO.cloudFileEmptyOnFirstlyFetchFunc) && OooOOO0.OooO0O0(this.cloudNotesCount, syncVO.cloudNotesCount) && OooOOO0.OooO0O0(this.isCloudDBVersionIsBiggerThanLocal, syncVO.isCloudDBVersionIsBiggerThanLocal) && OooOOO0.OooO0O0(this.shouldSetHMSCoreAutoStarted, syncVO.shouldSetHMSCoreAutoStarted) && OooOOO0.OooO0O0(this.showOnlySyncOnWifi, syncVO.showOnlySyncOnWifi);
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

    public final Map<String, String> getResourceConflictNoteIdToTitleMap() {
        return this.resourceConflictNoteIdToTitleMap;
    }

    public final Set<String> getResourceNotExistsNoteIds() {
        return this.resourceNotExistsNoteIds;
    }

    public final Boolean getShouldSetHMSCoreAutoStarted() {
        return this.shouldSetHMSCoreAutoStarted;
    }

    public final Boolean getShowOnlySyncOnWifi() {
        return this.showOnlySyncOnWifi;
    }

    public final boolean getSpaceIsFull() {
        return this.spaceIsFull;
    }

    public int hashCode() {
        int iOooO0O0 = o00000.OooO0O0((this.resourceConflictNoteIdToTitleMap.hashCode() + (this.resourceNotExistsNoteIds.hashCode() * 31)) * 31, 31, this.spaceIsFull);
        OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> oooO00o = this.cloudFileNotEmptyOnFirstlyFetchFunc;
        int iHashCode = (iOooO0O0 + (oooO00o == null ? 0 : oooO00o.hashCode())) * 31;
        OooO00o<Map<String, C27174OooO0O0<NoteMeta>>> oooO00o2 = this.cloudFileEmptyOnFirstlyFetchFunc;
        int iHashCode2 = (iHashCode + (oooO00o2 == null ? 0 : oooO00o2.hashCode())) * 31;
        Integer num = this.cloudNotesCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isCloudDBVersionIsBiggerThanLocal;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldSetHMSCoreAutoStarted;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showOnlySyncOnWifi;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Boolean isCloudDBVersionIsBiggerThanLocal() {
        return this.isCloudDBVersionIsBiggerThanLocal;
    }

    public String toString() {
        return "SyncVO(resourceNotExistsNoteIds=" + this.resourceNotExistsNoteIds + ", resourceConflictNoteIdToTitleMap=" + this.resourceConflictNoteIdToTitleMap + ", spaceIsFull=" + this.spaceIsFull + ", cloudFileNotEmptyOnFirstlyFetchFunc=" + this.cloudFileNotEmptyOnFirstlyFetchFunc + ", cloudFileEmptyOnFirstlyFetchFunc=" + this.cloudFileEmptyOnFirstlyFetchFunc + ", cloudNotesCount=" + this.cloudNotesCount + ", isCloudDBVersionIsBiggerThanLocal=" + this.isCloudDBVersionIsBiggerThanLocal + ", shouldSetHMSCoreAutoStarted=" + this.shouldSetHMSCoreAutoStarted + ", showOnlySyncOnWifi=" + this.showOnlySyncOnWifi + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SyncVO(Set<String> resourceNotExistsNoteIds, Map<String, String> resourceConflictNoteIdToTitleMap, boolean z, OooO00o<? extends Map<String, C27174OooO0O0<NoteMeta>>> oooO00o, OooO00o<? extends Map<String, C27174OooO0O0<NoteMeta>>> oooO00o2, Integer num, Boolean bool, Boolean bool2, Boolean bool3) {
        OooOOO0.OooO0oO(resourceNotExistsNoteIds, "resourceNotExistsNoteIds");
        OooOOO0.OooO0oO(resourceConflictNoteIdToTitleMap, "resourceConflictNoteIdToTitleMap");
        this.resourceNotExistsNoteIds = resourceNotExistsNoteIds;
        this.resourceConflictNoteIdToTitleMap = resourceConflictNoteIdToTitleMap;
        this.spaceIsFull = z;
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
    public /* synthetic */ SyncVO(java.util.Set r2, java.util.Map r3, boolean r4, oO0O000o.OooO00o r5, oO0O000o.OooO00o r6, java.lang.Integer r7, java.lang.Boolean r8, java.lang.Boolean r9, java.lang.Boolean r10, int r11, kotlin.jvm.internal.C24018OooO0oo r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            oOo000Oo.OooOoo0 r2 = oOo000Oo.C34438OooOoo0.f123458OooOo0o
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            oOo000Oo.OooOoOO r3 = oOo000Oo.C34436OooOoOO.f123455OooOo0o
        Lc:
            r12 = r11 & 4
            if (r12 == 0) goto L11
            r4 = 0
        L11:
            r12 = r11 & 8
            r0 = 0
            if (r12 == 0) goto L17
            r5 = r0
        L17:
            r12 = r11 & 16
            if (r12 == 0) goto L1c
            r6 = r0
        L1c:
            r12 = r11 & 32
            if (r12 == 0) goto L21
            r7 = r0
        L21:
            r12 = r11 & 64
            if (r12 == 0) goto L26
            r8 = r0
        L26:
            r12 = r11 & 128(0x80, float:1.8E-43)
            if (r12 == 0) goto L2b
            r9 = r0
        L2b:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L3a
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L44
        L3a:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L44:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.cloud.SyncVO.<init>(java.util.Set, java.util.Map, boolean, oO0O000o.OooO00o, oO0O000o.OooO00o, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.OooO0oo):void");
    }
}
