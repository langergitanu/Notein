package o0OOooO0;

import OooO0Oo.C20398OooO0O0;
import OooO0o.C20424OooO0Oo;
import OooOoOO.C20519OooO0Oo;
import OooOoo.C20593OooO0Oo;
import Oooo0.C20856OooooOo;
import Oooo0oO.C21023OooO0Oo;
import android.content.Context;
import androidx.core.view.PointerIconCompat;
import com.aspose.slides.C22201OooO0oO;
import com.aspose.slides.C22227OoooO;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaLocalStagedContentEntity;
import com.orion.notein.data.p602db.entity.cloudsync.CloudMetaRemoteEntity;
import com.orion.notein.data.p602db.entity.cloudsync.DriveSnapshotCacheEntity;
import com.orion.notein.domain.mapper.cloudsync.CloudMetaMapper;
import com.orion.notein.domain.models.cloudsync.CloudAuthRequest;
import com.orion.notein.domain.models.cloudsync.CloudAuthResult;
import com.orion.notein.domain.models.cloudsync.CloudBundle;
import com.orion.notein.domain.models.cloudsync.CloudContentTag;
import com.orion.notein.domain.models.cloudsync.CloudEvent;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtraKt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C24030OooOoo;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24340OooO0oo;
import o00o00O0.C25252OooO0Oo;
import o0OO000.C26439OooO0o0;
import o0OO000.C26442OooOO0o;
import o0OO000.C26443OooOOOo;
import o0OO000.C26444OooOOo;
import o0OO000.C26446OooOOoo;
import o0OO000.C26447OooOo0;
import o0OO000.C26452OooOoOO;
import o0OO000.C26453OooOoo0;
import o0OO000.InterfaceC26441OooO0oo;
import o0OO0OoO.C26713OooO0Oo;
import o0OO0OoO.C26715OooO0oO;
import o0OO0OoO.C26716OooO0oo;
import o0OO0OoO.C26717OooOO0o;
import o0OO0OoO.C26721OooOOoo;
import o0OO0OoO.C26723OooOo0O;
import o0OO0OoO.C26724OooOo0o;
import o0OO0OoO.C26728OooOoo;
import o0OO0OoO.C26733Oooo00O;
import o0OO0OoO.C26734Oooo00o;
import o0OO0OoO.C26739Oooo0oO;
import o0OOo0Oo.EnumC27285OooO;
import o0OOo0oo.C27624OooOOO0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32463OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0OOo0o.C33074OooOoO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0Oo.C33768Ooooo00;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33773Oooooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oO0o0oOo.C33898OooO0Oo;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;
import oOo000Oo.C34449Oooo0oo;
import oo0ooO.InterfaceC35006OooO00o;
import oo0ooO.InterfaceC35015OooOO0O;
import oo0ooO.InterfaceC35021OooOOo;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: renamed from: o0OOooO0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC27907OooOo0O implements o0OO0OoO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000o0O.OooOO0<AbstractC24338OooO0o0> f98677OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000 f98678OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f98679OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC35006OooO00o f98680OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC35015OooOO0O f98681OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final InterfaceC26441OooO0oo f98682OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC35021OooOOo f98683OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CloudMetaMapper f98684OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C27956o00000oo f98685OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00Ooo.OooOOO f98686OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C32447OooOOo f98687OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final EnumC27285OooO f98688OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C33772OooooOo f98689OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final String f98690OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C33898OooO0Oo f98691OooOOOO;

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO */
    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Map<String, CloudMetaLocalEntity> f98692OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Map<String, CloudMetaRemoteEntity> f98693OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final LinkedHashMap f98694OooO0OO;

        public OooO(Map localMetaMap, Map remoteMetaMap, LinkedHashMap linkedHashMap) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(localMetaMap, "localMetaMap");
            kotlin.jvm.internal.OooOOO0.OooO0oO(remoteMetaMap, "remoteMetaMap");
            this.f98692OooO00o = localMetaMap;
            this.f98693OooO0O0 = remoteMetaMap;
            this.f98694OooO0OO = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO)) {
                return false;
            }
            OooO oooO = (OooO) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98692OooO00o, oooO.f98692OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98693OooO0O0, oooO.f98693OooO0O0) && this.f98694OooO0OO.equals(oooO.f98694OooO0OO);
        }

        public final int hashCode() {
            return this.f98694OooO0OO.hashCode() + ((this.f98693OooO0O0.hashCode() + (this.f98692OooO00o.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "LookupMaps(localMetaMap=" + this.f98692OooO00o + ", remoteMetaMap=" + this.f98693OooO0O0 + ", snapshotMap=" + this.f98694OooO0OO + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f98695OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f98696OooO0O0;

        public OooO00o(ArrayList arrayList, ArrayList arrayList2) {
            this.f98695OooO00o = arrayList;
            this.f98696OooO0O0 = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f98695OooO00o.equals(oooO00o.f98695OooO00o) && this.f98696OooO0O0.equals(oooO00o.f98696OooO0O0);
        }

        public final int hashCode() {
            return this.f98696OooO0O0.hashCode() + (this.f98695OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "BatchChangesProcessedResult(events=" + this.f98695OooO00o + ", failedEvents=" + this.f98696OooO0O0 + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f98697OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f98698OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final String f98699OooO0OO;

        public OooO0O0(OooO0OO oooO0OO, String str, String str2) {
            this.f98697OooO00o = oooO0OO;
            this.f98698OooO0O0 = str;
            this.f98699OooO0OO = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f98697OooO00o == oooO0O0.f98697OooO00o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98698OooO0O0, oooO0O0.f98698OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98699OooO0OO, oooO0O0.f98699OooO0OO);
        }

        public final int hashCode() {
            int iHashCode = this.f98697OooO00o.hashCode() * 31;
            String str = this.f98698OooO0O0;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f98699OooO0OO;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BatchFailureEvent(stage=");
            sb.append(this.f98697OooO00o);
            sb.append(", errorCode=");
            sb.append(this.f98698OooO0O0);
            sb.append(", errorMsg=");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f98699OooO0OO, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO0OO */
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0OO f98700OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f98701OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO0OO[] f98702OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO0OO f98703OooOoO0;

        static {
            OooO0OO oooO0OO = new OooO0OO("DELETE", 0);
            f98701OooOo0o = oooO0OO;
            OooO0OO oooO0OO2 = new OooO0OO("RECONCILE", 1);
            f98700OooOo = oooO0OO2;
            OooO0OO oooO0OO3 = new OooO0OO("MIGRATE", 2);
            f98703OooOoO0 = oooO0OO3;
            OooO0OO[] oooO0OOArr = {oooO0OO, oooO0OO2, oooO0OO3};
            f98702OooOoO = oooO0OOArr;
            OooO.OooO00o.OooO0O0(oooO0OOArr);
        }

        public OooO0OO() {
            throw null;
        }

        public static OooO0OO valueOf(String str) {
            return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
        }

        public static OooO0OO[] values() {
            return (OooO0OO[]) f98702OooOoO.clone();
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO0Oo, reason: case insensitive filesystem */
    public static final class C27908OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f98704OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f98705OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f98706OooO0OO;

        public C27908OooO0Oo(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.f98704OooO00o = arrayList;
            this.f98705OooO0O0 = arrayList2;
            this.f98706OooO0OO = arrayList3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27908OooO0Oo)) {
                return false;
            }
            C27908OooO0Oo c27908OooO0Oo = (C27908OooO0Oo) obj;
            return this.f98704OooO00o.equals(c27908OooO0Oo.f98704OooO00o) && this.f98705OooO0O0.equals(c27908OooO0Oo.f98705OooO0O0) && this.f98706OooO0OO.equals(c27908OooO0Oo.f98706OooO0OO);
        }

        public final int hashCode() {
            return this.f98706OooO0OO.hashCode() + ((this.f98705OooO0O0.hashCode() + (this.f98704OooO00o.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ChangedMetaBuckets(delete=" + this.f98704OooO00o + ", normal=" + this.f98705OooO0O0 + ", reconcile=" + this.f98706OooO0OO + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO0o */
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<CloudMetaRemoteEntity> f98707OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Long f98708OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f98709OooO0OO;

        public OooO0o(List<CloudMetaRemoteEntity> items, Long l, boolean z) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(items, "items");
            this.f98707OooO00o = items;
            this.f98708OooO0O0 = l;
            this.f98709OooO0OO = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98707OooO00o, oooO0o.f98707OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98708OooO0O0, oooO0o.f98708OooO0O0) && this.f98709OooO0OO == oooO0o.f98709OooO0OO;
        }

        public final int hashCode() {
            int iHashCode = this.f98707OooO00o.hashCode() * 31;
            Long l = this.f98708OooO0O0;
            return Boolean.hashCode(this.f98709OooO0OO) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CloudMetaPullResult(items=");
            sb.append(this.f98707OooO00o);
            sb.append(", nextCursor=");
            sb.append(this.f98708OooO0O0);
            sb.append(", cursorInvalid=");
            return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f98709OooO0OO);
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO0o0, reason: case insensitive filesystem */
    public static abstract class AbstractC27909OooO0o0 {

        /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO0o0$OooO00o */
        public static final class OooO00o extends AbstractC27909OooO0o0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f98710OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final CloudMetaLocalEntity f98711OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final CloudMetaRemoteEntity f98712OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final DriveSnapshotCacheEntity f98713OooO0Oo;

            public OooO00o(CloudMetaLocalEntity cloudMetaLocalEntity, CloudMetaRemoteEntity cloudMetaRemoteEntity, DriveSnapshotCacheEntity driveSnapshotCacheEntity, String metaId) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(metaId, "metaId");
                this.f98710OooO00o = metaId;
                this.f98711OooO0O0 = cloudMetaLocalEntity;
                this.f98712OooO0OO = cloudMetaRemoteEntity;
                this.f98713OooO0Oo = driveSnapshotCacheEntity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO00o)) {
                    return false;
                }
                OooO00o oooO00o = (OooO00o) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98710OooO00o, oooO00o.f98710OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98711OooO0O0, oooO00o.f98711OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98712OooO0OO, oooO00o.f98712OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98713OooO0Oo, oooO00o.f98713OooO0Oo);
            }

            public final int hashCode() {
                int iHashCode = this.f98710OooO00o.hashCode() * 31;
                CloudMetaLocalEntity cloudMetaLocalEntity = this.f98711OooO0O0;
                int iHashCode2 = (iHashCode + (cloudMetaLocalEntity == null ? 0 : cloudMetaLocalEntity.hashCode())) * 31;
                CloudMetaRemoteEntity cloudMetaRemoteEntity = this.f98712OooO0OO;
                int iHashCode3 = (iHashCode2 + (cloudMetaRemoteEntity == null ? 0 : cloudMetaRemoteEntity.hashCode())) * 31;
                DriveSnapshotCacheEntity driveSnapshotCacheEntity = this.f98713OooO0Oo;
                return iHashCode3 + (driveSnapshotCacheEntity != null ? driveSnapshotCacheEntity.hashCode() : 0);
            }

            public final String toString() {
                return "Delete(metaId=" + this.f98710OooO00o + ", localMeta=" + this.f98711OooO0O0 + ", remoteMeta=" + this.f98712OooO0OO + ", snapshot=" + this.f98713OooO0Oo + ")";
            }
        }

        /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO0o0$OooO0O0 */
        public static final class OooO0O0 extends AbstractC27909OooO0o0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f98714OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final CloudMetaLocalEntity f98715OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final CloudMetaRemoteEntity f98716OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final DriveSnapshotCacheEntity f98717OooO0Oo;

            public OooO0O0(CloudMetaLocalEntity cloudMetaLocalEntity, CloudMetaRemoteEntity cloudMetaRemoteEntity, DriveSnapshotCacheEntity driveSnapshotCacheEntity, String metaId) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(metaId, "metaId");
                this.f98714OooO00o = metaId;
                this.f98715OooO0O0 = cloudMetaLocalEntity;
                this.f98716OooO0OO = cloudMetaRemoteEntity;
                this.f98717OooO0Oo = driveSnapshotCacheEntity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0O0)) {
                    return false;
                }
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98714OooO00o, oooO0O0.f98714OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98715OooO0O0, oooO0O0.f98715OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98716OooO0OO, oooO0O0.f98716OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98717OooO0Oo, oooO0O0.f98717OooO0Oo);
            }

            public final int hashCode() {
                int iHashCode = this.f98714OooO00o.hashCode() * 31;
                CloudMetaLocalEntity cloudMetaLocalEntity = this.f98715OooO0O0;
                return this.f98717OooO0Oo.hashCode() + ((this.f98716OooO0OO.hashCode() + ((iHashCode + (cloudMetaLocalEntity == null ? 0 : cloudMetaLocalEntity.hashCode())) * 31)) * 31);
            }

            public final String toString() {
                return "Normal(metaId=" + this.f98714OooO00o + ", localMeta=" + this.f98715OooO0O0 + ", remoteMeta=" + this.f98716OooO0OO + ", snapshot=" + this.f98717OooO0Oo + ")";
            }
        }

        /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO0o0$OooO0OO */
        public static final class OooO0OO extends AbstractC27909OooO0o0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f98718OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final CloudMetaLocalEntity f98719OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final CloudMetaRemoteEntity f98720OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final DriveSnapshotCacheEntity f98721OooO0Oo;

            public OooO0OO(CloudMetaLocalEntity cloudMetaLocalEntity, CloudMetaRemoteEntity cloudMetaRemoteEntity, DriveSnapshotCacheEntity driveSnapshotCacheEntity, String metaId) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(metaId, "metaId");
                this.f98718OooO00o = metaId;
                this.f98719OooO0O0 = cloudMetaLocalEntity;
                this.f98720OooO0OO = cloudMetaRemoteEntity;
                this.f98721OooO0Oo = driveSnapshotCacheEntity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0OO)) {
                    return false;
                }
                OooO0OO oooO0OO = (OooO0OO) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98718OooO00o, oooO0OO.f98718OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98719OooO0O0, oooO0OO.f98719OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98720OooO0OO, oooO0OO.f98720OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98721OooO0Oo, oooO0OO.f98721OooO0Oo);
            }

            public final int hashCode() {
                int iHashCode = this.f98718OooO00o.hashCode() * 31;
                CloudMetaLocalEntity cloudMetaLocalEntity = this.f98719OooO0O0;
                int iHashCode2 = (iHashCode + (cloudMetaLocalEntity == null ? 0 : cloudMetaLocalEntity.hashCode())) * 31;
                CloudMetaRemoteEntity cloudMetaRemoteEntity = this.f98720OooO0OO;
                return this.f98721OooO0Oo.hashCode() + ((iHashCode2 + (cloudMetaRemoteEntity != null ? cloudMetaRemoteEntity.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "Reconcile(metaId=" + this.f98718OooO00o + ", localMeta=" + this.f98719OooO0O0 + ", remoteMeta=" + this.f98720OooO0OO + ", snapshot=" + this.f98721OooO0Oo + ")";
            }
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO0oO, reason: case insensitive filesystem */
    public static final class C27910OooO0oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f98722OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f98723OooO0O0;

        public C27910OooO0oO(List<CloudEvent.MetaEvent> list, List<OooO0O0> list2) {
            this.f98722OooO00o = list;
            this.f98723OooO0O0 = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27910OooO0oO)) {
                return false;
            }
            C27910OooO0oO c27910OooO0oO = (C27910OooO0oO) obj;
            return this.f98722OooO00o.equals(c27910OooO0oO.f98722OooO00o) && this.f98723OooO0O0.equals(c27910OooO0oO.f98723OooO0O0);
        }

        public final int hashCode() {
            return this.f98723OooO0O0.hashCode() + (this.f98722OooO00o.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeleteBatchResult(events=");
            sb.append(this.f98722OooO00o);
            sb.append(", failedEvents=");
            return androidx.concurrent.futures.OooO0o.OooO0O0(sb, this.f98723OooO0O0, ")");
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooO0oo, reason: case insensitive filesystem */
    public static final class C27911OooO0oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Set<String> f98724OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f98725OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f98726OooO0OO;
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOO0 */
    public static abstract class OooOO0 {

        /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOO0$OooO00o */
        public static final class OooO00o extends OooOO0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f98727OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final String f98728OooO0O0;

            public OooO00o(String str, String str2) {
                this.f98727OooO00o = str;
                this.f98728OooO0O0 = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO00o)) {
                    return false;
                }
                OooO00o oooO00o = (OooO00o) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98727OooO00o, oooO00o.f98727OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98728OooO0O0, oooO00o.f98728OooO0O0);
            }

            public final int hashCode() {
                String str = this.f98727OooO00o;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f98728OooO0O0;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Failed(errorCode=");
                sb.append(this.f98727OooO00o);
                sb.append(", errorMsg=");
                return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f98728OooO0O0, ")");
            }
        }

        /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOO0$OooO0O0 */
        public static final class OooO0O0 extends OooOO0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final AbstractC27909OooO0o0.OooO0OO f98729OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final CloudMetaRemoteEntity f98730OooO0O0;

            public OooO0O0(AbstractC27909OooO0o0.OooO0OO oooO0OO, CloudMetaRemoteEntity cloudMetaRemoteEntity) {
                this.f98729OooO00o = oooO0OO;
                this.f98730OooO0O0 = cloudMetaRemoteEntity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0O0)) {
                    return false;
                }
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98729OooO00o, oooO0O0.f98729OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98730OooO0O0, oooO0O0.f98730OooO0O0);
            }

            public final int hashCode() {
                return this.f98730OooO0O0.hashCode() + (this.f98729OooO00o.hashCode() * 31);
            }

            public final String toString() {
                return "Success(item=" + this.f98729OooO00o + ", meta=" + this.f98730OooO0O0 + ")";
            }
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOO0O */
    public static final class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f98731OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f98732OooO0O0;

        public OooOO0O(List<CloudEvent.MetaEvent> list, List<OooO0O0> list2) {
            this.f98731OooO00o = list;
            this.f98732OooO0O0 = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOO0O)) {
                return false;
            }
            OooOO0O oooOO0O = (OooOO0O) obj;
            return this.f98731OooO00o.equals(oooOO0O.f98731OooO00o) && this.f98732OooO0O0.equals(oooOO0O.f98732OooO0O0);
        }

        public final int hashCode() {
            return this.f98732OooO0O0.hashCode() + (this.f98731OooO00o.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MigrateOutcome(events=");
            sb.append(this.f98731OooO00o);
            sb.append(", failedEvents=");
            return androidx.concurrent.futures.OooO0o.OooO0O0(sb, this.f98732OooO0O0, ")");
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOO0o, reason: case insensitive filesystem */
    public static final class C27912OooOO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f98733OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f98734OooO0O0;

        public C27912OooOO0o(int i, boolean z) {
            this.f98733OooO00o = i;
            this.f98734OooO0O0 = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27912OooOO0o)) {
                return false;
            }
            C27912OooOO0o c27912OooOO0o = (C27912OooOO0o) obj;
            return this.f98733OooO00o == c27912OooOO0o.f98733OooO00o && this.f98734OooO0O0 == c27912OooOO0o.f98734OooO0O0;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f98734OooO0O0) + (Integer.hashCode(this.f98733OooO00o) * 31);
        }

        public final String toString() {
            return "ProcessResult(eventCount=" + this.f98733OooO00o + ", hadErrors=" + this.f98734OooO0O0 + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOOO */
    public static abstract class OooOOO {

        /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOOO$OooO00o */
        public static final class OooO00o extends OooOOO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final String f98735OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final String f98736OooO0O0;

            public OooO00o(String str, String str2) {
                this.f98735OooO00o = str;
                this.f98736OooO0O0 = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO00o)) {
                    return false;
                }
                OooO00o oooO00o = (OooO00o) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98735OooO00o, oooO00o.f98735OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98736OooO0O0, oooO00o.f98736OooO0O0);
            }

            public final int hashCode() {
                String str = this.f98735OooO00o;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f98736OooO0O0;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Failed(errorCode=");
                sb.append(this.f98735OooO00o);
                sb.append(", errorMsg=");
                return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f98736OooO0O0, ")");
            }
        }

        /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOOO$OooO0O0 */
        public static final class OooO0O0 extends OooOOO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final AbstractC27909OooO0o0.OooO0OO f98737OooO00o;

            public OooO0O0(AbstractC27909OooO0o0.OooO0OO oooO0OO) {
                this.f98737OooO00o = oooO0OO;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98737OooO00o, ((OooO0O0) obj).f98737OooO00o);
            }

            public final int hashCode() {
                return this.f98737OooO00o.hashCode();
            }

            public final String toString() {
                return "NeedMigrate(item=" + this.f98737OooO00o + ")";
            }
        }

        /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOOO$OooO0OO */
        public static final class OooO0OO extends OooOOO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final AbstractC27909OooO0o0.OooO0OO f98738OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final CloudMetaRemoteEntity f98739OooO0O0;

            public OooO0OO(AbstractC27909OooO0o0.OooO0OO oooO0OO, CloudMetaRemoteEntity cloudMetaRemoteEntity) {
                this.f98738OooO00o = oooO0OO;
                this.f98739OooO0O0 = cloudMetaRemoteEntity;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0OO)) {
                    return false;
                }
                OooO0OO oooO0OO = (OooO0OO) obj;
                return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98738OooO00o, oooO0OO.f98738OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98739OooO0O0, oooO0OO.f98739OooO0O0);
            }

            public final int hashCode() {
                return this.f98739OooO0O0.hashCode() + (this.f98738OooO00o.hashCode() * 31);
            }

            public final String toString() {
                return "Success(item=" + this.f98738OooO00o + ", meta=" + this.f98739OooO0O0 + ")";
            }
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOOO0 */
    public static final class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<CloudEvent.MetaEvent> f98740OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<OooO0O0> f98741OooO0O0;

        public OooOOO0(List<CloudEvent.MetaEvent> list, List<OooO0O0> list2) {
            this.f98740OooO00o = list;
            this.f98741OooO0O0 = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOO0)) {
                return false;
            }
            OooOOO0 oooOOO0 = (OooOOO0) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98740OooO00o, oooOOO0.f98740OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98741OooO0O0, oooOOO0.f98741OooO0O0);
        }

        public final int hashCode() {
            return this.f98741OooO0O0.hashCode() + (this.f98740OooO00o.hashCode() * 31);
        }

        public final String toString() {
            return "ReconcileBatchResult(events=" + this.f98740OooO00o + ", failedEvents=" + this.f98741OooO0O0 + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOOOO */
    public static final class OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f98742OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList f98743OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f98744OooO0OO;

        public OooOOOO(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.f98742OooO00o = arrayList;
            this.f98743OooO0O0 = arrayList2;
            this.f98744OooO0OO = arrayList3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOOO)) {
                return false;
            }
            OooOOOO oooOOOO = (OooOOOO) obj;
            return this.f98742OooO00o.equals(oooOOOO.f98742OooO00o) && this.f98743OooO0O0.equals(oooOOOO.f98743OooO0O0) && this.f98744OooO0OO.equals(oooOOOO.f98744OooO0OO);
        }

        public final int hashCode() {
            return this.f98744OooO0OO.hashCode() + ((this.f98743OooO0O0.hashCode() + (this.f98742OooO00o.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ReconcileOutcome(events=" + this.f98742OooO00o + ", needMigrateItems=" + this.f98743OooO0O0 + ", failedEvents=" + this.f98744OooO0OO + ")";
        }
    }

    /* JADX INFO: renamed from: o0OOooO0.OooOo0O$OooOOOo, reason: case insensitive filesystem */
    public static final class C27913OooOOOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00000O0 f98745OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0o f98746OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Set<String> f98747OooO0OO;

        public C27913OooOOOo(o00000O0 o00000o02, OooO0o oooO0o, Set<String> set) {
            this.f98745OooO00o = o00000o02;
            this.f98746OooO0O0 = oooO0o;
            this.f98747OooO0OO = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27913OooOOOo)) {
                return false;
            }
            C27913OooOOOo c27913OooOOOo = (C27913OooOOOo) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98745OooO00o, c27913OooOOOo.f98745OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98746OooO0O0, c27913OooOOOo.f98746OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f98747OooO0OO, c27913OooOOOo.f98747OooO0OO);
        }

        public final int hashCode() {
            return this.f98747OooO0OO.hashCode() + ((this.f98746OooO0O0.hashCode() + (this.f98745OooO00o.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "RemoteFetchResult(driveBatch=" + this.f98745OooO00o + ", cloudMetaResult=" + this.f98746OooO0O0 + ", metaIds=" + this.f98747OooO0OO + ")";
        }
    }

    public AbstractC27907OooOo0O(o00000 backend, Context context, InterfaceC35006OooO00o cloudMetaLocalDao, InterfaceC35015OooOO0O cloudMetaRemoteDao, InterfaceC35021OooOOo driveSnapshotCacheDao, InterfaceC26441OooO0oo cloudMetaService, CloudMetaMapper cloudMetaMapper, C27956o00000oo syncCursorManager, o0000o0O.OooOO0<AbstractC24338OooO0o0> preferences) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(backend, "backend");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaLocalDao, "cloudMetaLocalDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaRemoteDao, "cloudMetaRemoteDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(driveSnapshotCacheDao, "driveSnapshotCacheDao");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaService, "cloudMetaService");
        kotlin.jvm.internal.OooOOO0.OooO0oO(cloudMetaMapper, "cloudMetaMapper");
        kotlin.jvm.internal.OooOOO0.OooO0oO(syncCursorManager, "syncCursorManager");
        kotlin.jvm.internal.OooOOO0.OooO0oO(preferences, "preferences");
        this.f98678OooO00o = backend;
        this.f98679OooO0O0 = context;
        this.f98680OooO0OO = cloudMetaLocalDao;
        this.f98681OooO0Oo = cloudMetaRemoteDao;
        this.f98683OooO0o0 = driveSnapshotCacheDao;
        this.f98682OooO0o = cloudMetaService;
        this.f98684OooO0oO = cloudMetaMapper;
        this.f98685OooO0oo = syncCursorManager;
        this.f98677OooO = preferences;
        this.f98686OooOO0 = new o00Ooo.OooOOO();
        this.f98687OooOO0O = C20519OooO0Oo.OooO0OO(new oO0O000o.OooO00o() { // from class: o0OOooO0.OooOo00
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                AbstractC27907OooOo0O abstractC27907OooOo0O = this.f98676OooOo0o;
                return new C27883OooO00o(abstractC27907OooOo0O.f98682OooO0o, abstractC27907OooOo0O.f98677OooO);
            }
        });
        this.f98688OooOO0o = backend.getType();
        this.f98690OooOOO0 = "drive_cloud";
        this.f98689OooOOO = C33773Oooooo.OooO00o(0, 32, EnumC33692OooO0OO.f121451OooOo);
        this.f98691OooOOOO = C33900OooO0o0.OooO00o();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, String str2, String str3, int i, String str4, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27921OooOooo c27921OooOooo;
        abstractC27907OooOo0O.getClass();
        if (abstractC32479OooO0OO instanceof C27921OooOooo) {
            c27921OooOooo = (C27921OooOooo) abstractC32479OooO0OO;
            int i2 = c27921OooOooo.f98793OooOoO;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27921OooOooo.f98793OooOoO = i2 - Integer.MIN_VALUE;
            } else {
                c27921OooOooo = new C27921OooOooo(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        C27921OooOooo c27921OooOooo2 = c27921OooOooo;
        Object objOooO0oo = c27921OooOooo2.f98791OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27921OooOooo2.f98793OooOoO;
        try {
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0oo);
                o0OO000.OooOO0O oooOO0O = new o0OO000.OooOO0O(new Integer(i), str4);
                InterfaceC26441OooO0oo interfaceC26441OooO0oo = abstractC27907OooOo0O.f98682OooO0o;
                c27921OooOooo2.f98792OooOo0o = abstractC27907OooOo0O;
                c27921OooOooo2.f98793OooOoO = 1;
                objOooO0oo = interfaceC26441OooO0oo.OooO0oo(str2, str3, str, oooOO0O, c27921OooOooo2);
                if (objOooO0oo == enumC32485OooO00o) {
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) c27921OooOooo2.f98792OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0oo);
                    return cloudMetaRemoteEntity;
                }
                abstractC27907OooOo0O = (AbstractC27907OooOo0O) c27921OooOooo2.f98792OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oo);
                CloudMetaRemoteEntity meta = ((C26442OooOO0o) objOooO0oo).getMeta();
                c27921OooOooo2.f98792OooOo0o = meta;
                c27921OooOooo2.f98793OooOoO = 3;
                return abstractC27907OooOo0O.o000000O(meta, c27921OooOooo2) != enumC32485OooO00o ? enumC32485OooO00o : meta;
            }
            abstractC27907OooOo0O = (AbstractC27907OooOo0O) c27921OooOooo2.f98792OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oo);
            c27921OooOooo2.f98792OooOo0o = abstractC27907OooOo0O;
            c27921OooOooo2.f98793OooOoO = 2;
            objOooO0oo = C33074OooOoO.OooO0o((C35238OooOoO) objOooO0oo, "commitCloudMetaLocked");
            if (objOooO0oo != enumC32485OooO00o) {
                CloudMetaRemoteEntity meta2 = ((C26442OooOO0o) objOooO0oo).getMeta();
                c27921OooOooo2.f98792OooOo0o = meta2;
                c27921OooOooo2.f98793OooOoO = 3;
                if (abstractC27907OooOo0O.o000000O(meta2, c27921OooOooo2) != enumC32485OooO00o) {
                }
            }
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r1 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Oooo0(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, CloudMetaRemoteEntity meta, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27948Oooooo c27948Oooooo;
        abstractC27907OooOo0O.getClass();
        if (abstractC32479OooO0OO instanceof C27948Oooooo) {
            c27948Oooooo = (C27948Oooooo) abstractC32479OooO0OO;
            int i = c27948Oooooo.f98937OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27948Oooooo.f98937OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27948Oooooo = new C27948Oooooo(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        C27948Oooooo c27948Oooooo2 = c27948Oooooo;
        Object objOooOOO0 = c27948Oooooo2.f98936OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27948Oooooo2.f98937OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooOOO0);
                kotlin.jvm.internal.OooOOO0.OooO0oO(meta, "meta");
                o0OO000.OooOo00 oooOo00 = new o0OO000.OooOo00(meta.getMetaVersion(), meta.getMimeType(), CloudMetaExtraKt.computeMetaHash(meta.getExtra()), meta.getContentTag(), meta.getDriveObjectKey(), meta.getExtra());
                InterfaceC26441OooO0oo interfaceC26441OooO0oo = abstractC27907OooOo0O.f98682OooO0o;
                String driveId = meta.getDriveId();
                String id = meta.getId();
                c27948Oooooo2.f98937OooOoO0 = 1;
                objOooOOO0 = interfaceC26441OooO0oo.OooOOO0(driveId, id, str, oooOo00, c27948Oooooo2);
                if (objOooOOO0 == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooOOO0);
                return (C26447OooOo0) objOooOOO0;
            }
            C32446OooOOOo.OooO0O0(objOooOOO0);
            c27948Oooooo2.f98937OooOoO0 = 2;
            objOooOOO0 = C33074OooOoO.OooO0o((C35238OooOoO) objOooOOO0, "preloadCloudMetaLocked");
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Oooo00o(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, String str2, String str3, o0OO000.OooOOO0 oooOOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27925Oooo00O c27925Oooo00O;
        String str4;
        String str5;
        abstractC27907OooOo0O.getClass();
        if (abstractC32479OooO0OO instanceof C27925Oooo00O) {
            c27925Oooo00O = (C27925Oooo00O) abstractC32479OooO0OO;
            int i = c27925Oooo00O.f98813OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27925Oooo00O.f98813OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27925Oooo00O = new C27925Oooo00O(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        C27925Oooo00O c27925Oooo00O2 = c27925Oooo00O;
        Object objOooO0Oo = c27925Oooo00O2.f98812OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27925Oooo00O2.f98813OooOoOO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                InterfaceC26441OooO0oo interfaceC26441OooO0oo = abstractC27907OooOo0O.f98682OooO0o;
                c27925Oooo00O2.f98810OooOo0o = str3;
                c27925Oooo00O2.f98809OooOo = abstractC27907OooOo0O;
                c27925Oooo00O2.f98813OooOoOO = 1;
                objOooO0Oo = interfaceC26441OooO0oo.OooO0Oo(str2, str3, str, oooOOO0, c27925Oooo00O2);
                if (objOooO0Oo != enumC32485OooO00o) {
                    str4 = str3;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) c27925Oooo00O2.f98810OooOo0o;
                        C32446OooOOOo.OooO0O0(objOooO0Oo);
                        return cloudMetaRemoteEntity;
                    }
                    abstractC27907OooOo0O = c27925Oooo00O2.f98809OooOo;
                    str5 = (String) c27925Oooo00O2.f98810OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    CloudMetaRemoteEntity meta = ((o0OO000.OooOOO) objOooO0Oo).getMeta();
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DriveCloudDS");
                    c20358OooO00o.OooO0o0("deleteMetaWithLock: deleted meta for " + str5 + ", new version=" + meta.getMetaVersion(), new Object[0]);
                    c27925Oooo00O2.f98810OooOo0o = meta;
                    c27925Oooo00O2.f98809OooOo = null;
                    c27925Oooo00O2.f98813OooOoOO = 3;
                    return abstractC27907OooOo0O.o000000O(meta, c27925Oooo00O2) != enumC32485OooO00o ? enumC32485OooO00o : meta;
                }
                abstractC27907OooOo0O = c27925Oooo00O2.f98809OooOo;
                str4 = (String) c27925Oooo00O2.f98810OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
            }
            c27925Oooo00O2.f98810OooOo0o = str4;
            c27925Oooo00O2.f98809OooOo = abstractC27907OooOo0O;
            c27925Oooo00O2.f98813OooOoOO = 2;
            objOooO0Oo = C33074OooOoO.OooO0o((C35238OooOoO) objOooO0Oo, "deleteMeta");
            if (objOooO0Oo != enumC32485OooO00o) {
                str5 = str4;
                CloudMetaRemoteEntity meta2 = ((o0OO000.OooOOO) objOooO0Oo).getMeta();
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("DriveCloudDS");
                c20358OooO00o2.OooO0o0("deleteMetaWithLock: deleted meta for " + str5 + ", new version=" + meta2.getMetaVersion(), new Object[0]);
                c27925Oooo00O2.f98810OooOo0o = meta2;
                c27925Oooo00O2.f98809OooOo = null;
                c27925Oooo00O2.f98813OooOoOO = 3;
                if (abstractC27907OooOo0O.o000000O(meta2, c27925Oooo00O2) != enumC32485OooO00o) {
                }
            }
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Oooo0O0(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, String str2, String str3, C26453OooOoo0 c26453OooOoo0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000OOo o000ooo2;
        abstractC27907OooOo0O.getClass();
        if (abstractC32479OooO0OO instanceof o000OOo) {
            o000ooo2 = (o000OOo) abstractC32479OooO0OO;
            int i = o000ooo2.f99008OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000ooo2.f99008OooOoO = i - Integer.MIN_VALUE;
            } else {
                o000ooo2 = new o000OOo(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        o000OOo o000ooo3 = o000ooo2;
        Object objOooO00o = o000ooo3.f99006OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000ooo3.f99008OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                InterfaceC26441OooO0oo interfaceC26441OooO0oo = abstractC27907OooOo0O.f98682OooO0o;
                o000ooo3.f99007OooOo0o = abstractC27907OooOo0O;
                o000ooo3.f99008OooOoO = 1;
                objOooO00o = interfaceC26441OooO0oo.OooO00o(str2, str3, str, c26453OooOoo0, o000ooo3);
                if (objOooO00o == enumC32485OooO00o) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) o000ooo3.f99007OooOo0o;
                    C32446OooOOOo.OooO0O0(objOooO00o);
                    return cloudMetaRemoteEntity;
                }
                abstractC27907OooOo0O = (AbstractC27907OooOo0O) o000ooo3.f99007OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO00o);
                CloudMetaRemoteEntity meta = ((C26452OooOoOO) objOooO00o).getMeta();
                o000ooo3.f99007OooOo0o = meta;
                o000ooo3.f99008OooOoO = 3;
                return abstractC27907OooOo0O.o000000O(meta, o000ooo3) != enumC32485OooO00o ? enumC32485OooO00o : meta;
            }
            abstractC27907OooOo0O = (AbstractC27907OooOo0O) o000ooo3.f99007OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            o000ooo3.f99007OooOo0o = abstractC27907OooOo0O;
            o000ooo3.f99008OooOoO = 2;
            objOooO00o = C33074OooOoO.OooO0o((C35238OooOoO) objOooO00o, "updateMeta");
            if (objOooO00o != enumC32485OooO00o) {
                CloudMetaRemoteEntity meta2 = ((C26452OooOoOO) objOooO00o).getMeta();
                o000ooo3.f99007OooOo0o = meta2;
                o000ooo3.f99008OooOoO = 3;
                if (abstractC27907OooOo0O.o000000O(meta2, o000ooo3) != enumC32485OooO00o) {
                }
            }
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r8.OooO0oO(r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Oooo0OO(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, CloudContentTag cloudContentTag, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27914OooOo0o c27914OooOo0o;
        Object objOooO;
        if (abstractC32479OooO0OO instanceof C27914OooOo0o) {
            c27914OooOo0o = (C27914OooOo0o) abstractC32479OooO0OO;
            int i = c27914OooOo0o.f98753OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27914OooOo0o.f98753OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27914OooOo0o = new C27914OooOo0o(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27914OooOo0o.f98750OooOoO;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27914OooOo0o.f98753OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
            c27914OooOo0o.f98749OooOo0o = abstractC27907OooOo0O;
            c27914OooOo0o.f98748OooOo = str;
            c27914OooOo0o.f98751OooOoO0 = cloudContentTag;
            c27914OooOo0o.f98753OooOoo0 = 1;
            objOooO = o00000Var.OooO(c27914OooOo0o);
            if (objOooO != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        cloudContentTag = c27914OooOo0o.f98751OooOoO0;
        str = c27914OooOo0o.f98748OooOo;
        abstractC27907OooOo0O = c27914OooOo0o.f98749OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
        if (objOooO instanceof C32445OooOOOO.OooO00o) {
            objOooO = null;
        }
        String str2 = (String) objOooO;
        if (str2 == null) {
            return C32460OooOooO.f116667OooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "DriveCloudDS", "addLocalPendingContent for ", str, ", driveId=");
        sbOooO00o.append(str2);
        c20358OooO00o.OooO00o(sbOooO00o.toString(), new Object[0]);
        CloudMetaLocalStagedContentEntity cloudMetaLocalStagedContentEntity = new CloudMetaLocalStagedContentEntity(str, str2, cloudContentTag);
        InterfaceC35006OooO00o interfaceC35006OooO00o = abstractC27907OooOo0O.f98680OooO0OO;
        c27914OooOo0o.f98749OooOo0o = null;
        c27914OooOo0o.f98748OooOo = null;
        c27914OooOo0o.f98751OooOoO0 = null;
        c27914OooOo0o.f98753OooOoo0 = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Oooo0o0(AbstractC27907OooOo0O abstractC27907OooOo0O, CloudAuthRequest cloudAuthRequest, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27904OooOo c27904OooOo;
        Object objOooO;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        CloudAuthResult cloudAuthResult;
        String str;
        if (abstractC32479OooO0OO instanceof C27904OooOo) {
            c27904OooOo = (C27904OooOo) abstractC32479OooO0OO;
            int i = c27904OooOo.f98674OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27904OooOo.f98674OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27904OooOo = new C27904OooOo(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object objOooOOoo = c27904OooOo.f98673OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27904OooOo.f98674OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOoo);
            o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
            c27904OooOo.f98671OooOo0o = abstractC27907OooOo0O;
            c27904OooOo.f98674OooOoOO = 1;
            objOooOOoo = o00000Var.OooOOoo(cloudAuthRequest, c27904OooOo);
            if (objOooOOoo != enumC32485OooO00o) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CloudAuthResult cloudAuthResult2 = (CloudAuthResult) c27904OooOo.f98671OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOoo);
                return cloudAuthResult2;
            }
            cloudAuthResult = c27904OooOo.f98670OooOo;
            abstractC27907OooOo0O2 = (AbstractC27907OooOo0O) c27904OooOo.f98671OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOoo);
            objOooO = ((C32445OooOOOO) objOooOOoo).f116639OooOo0o;
            if (objOooO instanceof C32445OooOOOO.OooO00o) {
                objOooO = null;
            }
            str = (String) objOooO;
            if (str != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("DriveCloudDS");
                c20358OooO00o.OooOO0O("authorize success but driveId is null, skip emitting AccountEvent", new Object[0]);
                return cloudAuthResult;
            }
            CloudEvent.AccountEvent accountEvent = new CloudEvent.AccountEvent(str, abstractC27907OooOo0O2.getType(), CloudEvent.AccountEvent.Type.LOGIN);
            C33772OooooOo c33772OooooOo = abstractC27907OooOo0O2.f98689OooOOO;
            c27904OooOo.f98671OooOo0o = cloudAuthResult;
            c27904OooOo.f98670OooOo = null;
            c27904OooOo.f98674OooOoOO = 3;
            return c33772OooooOo.emit(accountEvent, c27904OooOo) == enumC32485OooO00o ? enumC32485OooO00o : cloudAuthResult;
        }
        abstractC27907OooOo0O = (AbstractC27907OooOo0O) c27904OooOo.f98671OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOoo);
        CloudAuthResult cloudAuthResult3 = (CloudAuthResult) objOooOOoo;
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(cloudAuthResult3, CloudAuthResult.Success.INSTANCE)) {
            return cloudAuthResult3;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("DriveCloudDS");
        c20358OooO00o2.OooO0o0("authorize success", new Object[0]);
        o00000 o00000Var2 = abstractC27907OooOo0O.f98678OooO00o;
        c27904OooOo.f98671OooOo0o = abstractC27907OooOo0O;
        c27904OooOo.f98670OooOo = cloudAuthResult3;
        c27904OooOo.f98674OooOoOO = 2;
        objOooO = o00000Var2.OooO(c27904OooOo);
        if (objOooO != enumC32485OooO00o) {
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            cloudAuthResult = cloudAuthResult3;
            if (objOooO instanceof C32445OooOOOO.OooO00o) {
            }
            str = (String) objOooO;
            if (str != null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OoooO0(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27918OooOoo c27918OooOoo;
        Object objOooO;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        String str;
        if (abstractC32479OooO0OO instanceof C27918OooOoo) {
            c27918OooOoo = (C27918OooOoo) abstractC32479OooO0OO;
            int i = c27918OooOoo.f98778OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27918OooOoo.f98778OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27918OooOoo = new C27918OooOoo(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27918OooOoo.f98777OooOoO0;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27918OooOoo.f98778OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
            c27918OooOoo.f98775OooOo0o = abstractC27907OooOo0O;
            c27918OooOoo.f98778OooOoOO = 1;
            objOooO = o00000Var.OooO(c27918OooOoo);
            if (objOooO != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            abstractC27907OooOo0O = c27918OooOoo.f98775OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            str = c27918OooOoo.f98774OooOo;
            abstractC27907OooOo0O2 = c27918OooOoo.f98775OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (str != null) {
                return C32460OooOooO.f116667OooO00o;
            }
            C34406OooO00o.f123390OooO00o.OooO0o0("DriveCloudSyncDataSource: cancelAuthorize for driveId=".concat(str), new Object[0]);
            CloudEvent.AccountEvent accountEvent = new CloudEvent.AccountEvent(str, abstractC27907OooOo0O2.getType(), CloudEvent.AccountEvent.Type.LOGOUT);
            C33772OooooOo c33772OooooOo = abstractC27907OooOo0O2.f98689OooOOO;
            c27918OooOoo.f98775OooOo0o = null;
            c27918OooOoo.f98774OooOo = null;
            c27918OooOoo.f98778OooOoOO = 3;
        }
        if (objOooO instanceof C32445OooOOOO.OooO00o) {
            objOooO = null;
        }
        String str2 = (String) objOooO;
        o00000 o00000Var2 = abstractC27907OooOo0O.f98678OooO00o;
        c27918OooOoo.f98775OooOo0o = abstractC27907OooOo0O;
        c27918OooOoo.f98774OooOo = str2;
        c27918OooOoo.f98778OooOoOO = 2;
        if (o00000Var2.OooOO0o(c27918OooOoo) != obj2) {
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            str = str2;
            if (str != null) {
            }
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OoooO0O(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27920OooOooO c27920OooOooO;
        if (abstractC32479OooO0OO instanceof C27920OooOooO) {
            c27920OooOooO = (C27920OooOooO) abstractC32479OooO0OO;
            int i = c27920OooOooO.f98790OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27920OooOooO.f98790OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27920OooOooO = new C27920OooOooO(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27920OooOooO.f98789OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27920OooOooO.f98790OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
        c27920OooOooO.f98790OooOoO0 = 1;
        Serializable serializableOooO0Oo = o00000Var.OooO0Oo(c27920OooOooO);
        return serializableOooO0Oo == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO0Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OoooOOO(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, String str2, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27923Oooo0 c27923Oooo0;
        if (abstractC32479OooO0OO instanceof C27923Oooo0) {
            c27923Oooo0 = (C27923Oooo0) abstractC32479OooO0OO;
            int i2 = c27923Oooo0.f98801OooOo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27923Oooo0.f98801OooOo = i2 - Integer.MIN_VALUE;
            } else {
                c27923Oooo0 = new C27923Oooo0(abstractC32479OooO0OO);
            }
        }
        Object obj = c27923Oooo0.f98802OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27923Oooo0.f98801OooOo;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC32508OooOOOo c27927Oooo0O0 = new C27927Oooo0O0(i, str, str2, null, abstractC27907OooOo0O);
        c27923Oooo0.f98801OooOo = 1;
        Object objO00000O = abstractC27907OooOo0O.o00000O(str, c27927Oooo0O0, c27923Oooo0);
        return objO00000O == obj2 ? obj2 : objO00000O;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OoooOOo(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27930Oooo0o0 c27930Oooo0o0;
        if (abstractC32479OooO0OO instanceof C27930Oooo0o0) {
            c27930Oooo0o0 = (C27930Oooo0o0) abstractC32479OooO0OO;
            int i = c27930Oooo0o0.f98842OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27930Oooo0o0.f98842OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27930Oooo0o0 = new C27930Oooo0o0(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27930Oooo0o0.f98841OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27930Oooo0o0.f98842OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
        c27930Oooo0o0.f98842OooOoO0 = 1;
        Object objOooOo0 = o00000Var.OooOo0(c27930Oooo0o0);
        return objOooOo0 == enumC32485OooO00o ? enumC32485OooO00o : objOooOo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OoooOoo(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27932Oooo0oo c27932Oooo0oo;
        Object objOooO;
        if (abstractC32479OooO0OO instanceof C27932Oooo0oo) {
            c27932Oooo0oo = (C27932Oooo0oo) abstractC32479OooO0OO;
            int i = c27932Oooo0oo.f98852OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27932Oooo0oo.f98852OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27932Oooo0oo = new C27932Oooo0oo(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27932Oooo0oo.f98851OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27932Oooo0oo.f98852OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
            c27932Oooo0oo.f98849OooOo0o = abstractC27907OooOo0O;
            c27932Oooo0oo.f98848OooOo = str;
            c27932Oooo0oo.f98852OooOoOO = 1;
            objOooO = o00000Var.OooO(c27932Oooo0oo);
            if (objOooO != enumC32485OooO00o) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        str = c27932Oooo0oo.f98848OooOo;
        abstractC27907OooOo0O = c27932Oooo0oo.f98849OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO);
        if (thOooO00o != null) {
            return C32446OooOOOo.OooO00o(thOooO00o);
        }
        c27932Oooo0oo.f98849OooOo0o = null;
        c27932Oooo0oo.f98848OooOo = null;
        c27932Oooo0oo.f98852OooOoOO = 2;
        Object objOoooOoO = abstractC27907OooOo0O.OoooOoO((String) objOooO, str, c27932Oooo0oo);
        return objOoooOoO == enumC32485OooO00o ? enumC32485OooO00o : objOoooOoO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:14:0x002c, B:44:0x00b3, B:18:0x0039, B:39:0x009c, B:21:0x0047, B:34:0x0084, B:36:0x0089, B:41:0x00a2, B:24:0x004f, B:30:0x0069, B:27:0x005a), top: B:49:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:14:0x002c, B:44:0x00b3, B:18:0x0039, B:39:0x009c, B:21:0x0047, B:34:0x0084, B:36:0x0089, B:41:0x00a2, B:24:0x004f, B:30:0x0069, B:27:0x005a), top: B:49:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Ooooo00(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27922Oooo c27922Oooo;
        Object objOooO;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        String str2;
        String str3;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        Object objOoooo0o;
        if (abstractC32479OooO0OO instanceof C27922Oooo) {
            c27922Oooo = (C27922Oooo) abstractC32479OooO0OO;
            int i = c27922Oooo.f98800OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27922Oooo.f98800OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27922Oooo = new C27922Oooo(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object objOooO0Oo = c27922Oooo.f98797OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27922Oooo.f98800OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
                c27922Oooo.f98796OooOo0o = str;
                c27922Oooo.f98795OooOo = abstractC27907OooOo0O;
                c27922Oooo.f98800OooOoo0 = 1;
                objOooO = o00000Var.OooO(c27922Oooo);
                if (objOooO == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(objOooO0Oo);
                        return (DriveSnapshotCacheEntity) objOooO0Oo;
                    }
                    C32446OooOOOo.OooO0O0(objOooO0Oo);
                    objOoooo0o = ((C32445OooOOOO) objOooO0Oo).f116639OooOo0o;
                    C32446OooOOOo.OooO0O0(objOoooo0o);
                    return (DriveSnapshotCacheEntity) objOoooo0o;
                }
                str2 = c27922Oooo.f98798OooOoO0;
                abstractC27907OooOo0O2 = c27922Oooo.f98795OooOo;
                str3 = c27922Oooo.f98796OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0Oo);
                cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooO0Oo;
                if (cloudMetaRemoteEntity == null) {
                    String driveObjectKey = cloudMetaRemoteEntity.getDriveObjectKey();
                    c27922Oooo.f98796OooOo0o = null;
                    c27922Oooo.f98795OooOo = null;
                    c27922Oooo.f98798OooOoO0 = null;
                    c27922Oooo.f98800OooOoo0 = 3;
                    objOoooo0o = abstractC27907OooOo0O2.Ooooo0o(driveObjectKey, c27922Oooo);
                    if (objOoooo0o == enumC32485OooO00o) {
                    }
                    C32446OooOOOo.OooO0O0(objOoooo0o);
                    return (DriveSnapshotCacheEntity) objOoooo0o;
                }
                InterfaceC35021OooOOo interfaceC35021OooOOo = abstractC27907OooOo0O2.f98683OooO0o0;
                c27922Oooo.f98796OooOo0o = null;
                c27922Oooo.f98795OooOo = null;
                c27922Oooo.f98798OooOoO0 = null;
                c27922Oooo.f98800OooOoo0 = 4;
                objOooO0Oo = interfaceC35021OooOOo.OooO0Oo(str3, str2, c27922Oooo);
                return enumC32485OooO00o;
            }
            abstractC27907OooOo0O = c27922Oooo.f98795OooOo;
            str = c27922Oooo.f98796OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0Oo);
            objOooO = ((C32445OooOOOO) objOooO0Oo).f116639OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO);
            String str4 = (String) objOooO;
            c27922Oooo.f98796OooOo0o = str;
            c27922Oooo.f98795OooOo = abstractC27907OooOo0O;
            c27922Oooo.f98798OooOoO0 = str4;
            c27922Oooo.f98800OooOoo0 = 2;
            Object objOooO00o = abstractC27907OooOo0O.f98681OooO0Oo.OooO00o(str, str4, c27922Oooo);
            if (objOooO00o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            String str5 = str;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            str2 = str4;
            objOooO0Oo = objOooO00o;
            str3 = str5;
            cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooO0Oo;
            if (cloudMetaRemoteEntity == null) {
            }
            return enumC32485OooO00o;
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:15:0x0033, B:20:0x004d, B:46:0x00c5, B:48:0x00c9, B:51:0x00d6, B:53:0x00e3, B:55:0x0104, B:56:0x0127, B:57:0x0128, B:23:0x005f, B:36:0x00a2, B:39:0x00a7, B:42:0x00ac, B:26:0x006e, B:32:0x0089, B:29:0x0079), top: B:64:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9 A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:15:0x0033, B:20:0x004d, B:46:0x00c5, B:48:0x00c9, B:51:0x00d6, B:53:0x00e3, B:55:0x0104, B:56:0x0127, B:57:0x0128, B:23:0x005f, B:36:0x00a2, B:39:0x00a7, B:42:0x00ac, B:26:0x006e, B:32:0x0089, B:29:0x0079), top: B:64:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128 A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:15:0x0033, B:20:0x004d, B:46:0x00c5, B:48:0x00c9, B:51:0x00d6, B:53:0x00e3, B:55:0x0104, B:56:0x0127, B:57:0x0128, B:23:0x005f, B:36:0x00a2, B:39:0x00a7, B:42:0x00ac, B:26:0x006e, B:32:0x0089, B:29:0x0079), top: B:64:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooooO0(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27934OoooO0 c27934OoooO0;
        Object objOooO;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        String str2;
        Object obj;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        CloudMetaRemoteEntity cloudMetaRemoteEntity2;
        Object obj2;
        String str3;
        if (abstractC32479OooO0OO instanceof C27934OoooO0) {
            c27934OoooO0 = (C27934OoooO0) abstractC32479OooO0OO;
            int i = c27934OoooO0.f98867OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27934OoooO0.f98867OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27934OoooO0 = new C27934OoooO0(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        C27934OoooO0 c27934OoooO02 = c27934OoooO0;
        Object obj3 = c27934OoooO02.f98866OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27934OoooO02.f98867OooOoo;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj3);
                o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
                c27934OoooO02.f98863OooOo0o = str;
                c27934OoooO02.f98862OooOo = abstractC27907OooOo0O;
                c27934OoooO02.f98867OooOoo = 1;
                objOooO = o00000Var.OooO(c27934OoooO02);
                if (objOooO == enumC32485OooO00o) {
                }
            }
            if (i2 == 1) {
                abstractC27907OooOo0O = c27934OoooO02.f98862OooOo;
                str = c27934OoooO02.f98863OooOo0o;
                C32446OooOOOo.OooO0O0(obj3);
                objOooO = ((C32445OooOOOO) obj3).f116639OooOo0o;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj3);
                        return ((C32445OooOOOO) obj3).f116639OooOo0o;
                    }
                    str2 = c27934OoooO02.f98864OooOoO;
                    CloudMetaRemoteEntity cloudMetaRemoteEntity3 = (CloudMetaRemoteEntity) c27934OoooO02.f98865OooOoO0;
                    abstractC27907OooOo0O2 = c27934OoooO02.f98862OooOo;
                    str3 = c27934OoooO02.f98863OooOo0o;
                    C32446OooOOOo.OooO0O0(obj3);
                    obj2 = ((C32445OooOOOO) obj3).f116639OooOo0o;
                    cloudMetaRemoteEntity2 = cloudMetaRemoteEntity3;
                    if (obj2 instanceof C32445OooOOOO.OooO00o) {
                        C32446OooOOOo.OooO0O0(obj2);
                        c27934OoooO02.f98863OooOo0o = null;
                        c27934OoooO02.f98862OooOo = null;
                        c27934OoooO02.f98865OooOoO0 = null;
                        c27934OoooO02.f98864OooOoO = null;
                        c27934OoooO02.f98867OooOoo = 4;
                        Object objO00Ooo = abstractC27907OooOo0O2.o00Ooo(str2, str3, (DriveSnapshotCacheEntity) obj2, cloudMetaRemoteEntity2, c27934OoooO02);
                        return objO00Ooo == enumC32485OooO00o ? enumC32485OooO00o : objO00Ooo;
                    }
                    Throwable thOooO00o = C32445OooOOOO.OooO00o(obj2);
                    if ((thOooO00o instanceof o0OO000.OooOO0) && kotlin.jvm.internal.OooOOO0.OooO0O0(((o0OO000.OooOO0) thOooO00o).f90831OooOo0o, "1007")) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("DriveCloudDS");
                        c20358OooO00o.OooOO0O("fetchReconciledCloudMeta: drive file snapshot 404 for metaId=" + str3 + ", driveObjectKey=" + cloudMetaRemoteEntity2.getDriveObjectKey(), new Object[0]);
                        return cloudMetaRemoteEntity2;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("DriveCloudDS");
                    c20358OooO00o2.OooO0Oo(thOooO00o, "fetchReconciledCloudMeta: failed to fetch drive file snapshot for metaId=" + str3 + ", driveObjectKey=" + cloudMetaRemoteEntity2.getDriveObjectKey(), new Object[0]);
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
                    throw thOooO00o;
                }
                str2 = (String) c27934OoooO02.f98865OooOoO0;
                AbstractC27907OooOo0O abstractC27907OooOo0O3 = c27934OoooO02.f98862OooOo;
                String str4 = c27934OoooO02.f98863OooOo0o;
                C32446OooOOOo.OooO0O0(obj3);
                obj = ((C32445OooOOOO) obj3).f116639OooOo0o;
                abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
                str = str4;
                if (obj instanceof C32445OooOOOO.OooO00o) {
                    obj = null;
                }
                cloudMetaRemoteEntity = (CloudMetaRemoteEntity) obj;
                if (cloudMetaRemoteEntity != null) {
                    return null;
                }
                String driveObjectKey = cloudMetaRemoteEntity.getDriveObjectKey();
                c27934OoooO02.f98863OooOo0o = str;
                c27934OoooO02.f98862OooOo = abstractC27907OooOo0O2;
                c27934OoooO02.f98865OooOoO0 = cloudMetaRemoteEntity;
                c27934OoooO02.f98864OooOoO = str2;
                c27934OoooO02.f98867OooOoo = 3;
                Object objOoooo0o = abstractC27907OooOo0O2.Ooooo0o(driveObjectKey, c27934OoooO02);
                if (objOoooo0o != enumC32485OooO00o) {
                    cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
                    obj2 = objOoooo0o;
                    str3 = str;
                    if (obj2 instanceof C32445OooOOOO.OooO00o) {
                    }
                }
            }
            C32446OooOOOo.OooO0O0(objOooO);
            String str5 = (String) objOooO;
            c27934OoooO02.f98863OooOo0o = str;
            c27934OoooO02.f98862OooOo = abstractC27907OooOo0O;
            c27934OoooO02.f98865OooOoO0 = str5;
            c27934OoooO02.f98867OooOoo = 2;
            Object objOoooOoO = abstractC27907OooOo0O.OoooOoO(str5, str, c27934OoooO02);
            if (objOoooOoO != enumC32485OooO00o) {
                abstractC27907OooOo0O2 = abstractC27907OooOo0O;
                str2 = str5;
                obj = objOoooOoO;
                if (obj instanceof C32445OooOOOO.OooO00o) {
                }
                cloudMetaRemoteEntity = (CloudMetaRemoteEntity) obj;
                if (cloudMetaRemoteEntity != null) {
                }
            }
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooooOO(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, String str2, String str3, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27936OoooO0O c27936OoooO0O;
        Object objOooO;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        String str4;
        String str5;
        String str6;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        if (abstractC32479OooO0OO instanceof C27936OoooO0O) {
            c27936OoooO0O = (C27936OoooO0O) abstractC32479OooO0OO;
            int i = c27936OoooO0O.f98878OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27936OoooO0O.f98878OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27936OoooO0O = new C27936OoooO0O(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = c27936OoooO0O.f98877OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27936OoooO0O.f98878OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO00o);
            o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
            c27936OoooO0O.f98874OooOo0o = abstractC27907OooOo0O;
            c27936OoooO0O.f98873OooOo = str;
            c27936OoooO0O.f98876OooOoO0 = str2;
            c27936OoooO0O.f98875OooOoO = str3;
            c27936OoooO0O.f98878OooOoo = 1;
            objOooO = o00000Var.OooO(c27936OoooO0O);
            if (objOooO != enumC32485OooO00o) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO00o);
                return ((C32445OooOOOO) objOooO00o).f116639OooOo0o;
            }
            str4 = c27936OoooO0O.f98875OooOoO;
            str6 = c27936OoooO0O.f98876OooOoO0;
            str5 = c27936OoooO0O.f98873OooOo;
            abstractC27907OooOo0O2 = c27936OoooO0O.f98874OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO00o);
            cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooO00o;
            if (cloudMetaRemoteEntity != null) {
                return C32446OooOOOo.OooO00o(new FileNotFoundException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Remote CloudMeta not found for id: ", str5)));
            }
            String driveObjectKey = cloudMetaRemoteEntity.getDriveObjectKey();
            File file = new File(str6);
            o00000 o00000Var2 = abstractC27907OooOo0O2.f98678OooO00o;
            c27936OoooO0O.f98874OooOo0o = null;
            c27936OoooO0O.f98873OooOo = null;
            c27936OoooO0O.f98876OooOoO0 = null;
            c27936OoooO0O.f98875OooOoO = null;
            c27936OoooO0O.f98878OooOoo = 3;
            Object objOooOOOO = o00000Var2.OooOOOO(file, driveObjectKey, str4, c27936OoooO0O);
            return objOooOOOO == enumC32485OooO00o ? enumC32485OooO00o : objOooOOOO;
        }
        str3 = c27936OoooO0O.f98875OooOoO;
        str2 = c27936OoooO0O.f98876OooOoO0;
        str = c27936OoooO0O.f98873OooOo;
        abstractC27907OooOo0O = c27936OoooO0O.f98874OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO00o);
        objOooO = ((C32445OooOOOO) objOooO00o).f116639OooOo0o;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO);
        if (thOooO00o != null) {
            return C32446OooOOOo.OooO00o(thOooO00o);
        }
        c27936OoooO0O.f98874OooOo0o = abstractC27907OooOo0O;
        c27936OoooO0O.f98873OooOo = str;
        c27936OoooO0O.f98876OooOoO0 = str2;
        c27936OoooO0O.f98875OooOoO = str3;
        c27936OoooO0O.f98878OooOoo = 2;
        objOooO00o = abstractC27907OooOo0O.f98681OooO0Oo.OooO00o(str, (String) objOooO, c27936OoooO0O);
        if (objOooO00o != enumC32485OooO00o) {
            String str7 = str3;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            str4 = str7;
            String str8 = str2;
            str5 = str;
            str6 = str8;
            cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOooO00o;
            if (cloudMetaRemoteEntity != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OooooOo(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, String str2, String str3, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27933OoooO c27933OoooO;
        String str4;
        String str5;
        String str6;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o2;
        Object obj;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        long j2;
        long j3;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o3;
        String str7;
        String str8;
        AbstractC27907OooOo0O abstractC27907OooOo0O3;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        if (abstractC32479OooO0OO instanceof C27933OoooO) {
            c27933OoooO = (C27933OoooO) abstractC32479OooO0OO;
            int i = c27933OoooO.f98861OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27933OoooO.f98861OooOooo = i - Integer.MIN_VALUE;
            } else {
                c27933OoooO = new C27933OoooO(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c27933OoooO.f98858OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27933OoooO.f98861OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
            c27933OoooO.f98854OooOo0o = abstractC27907OooOo0O;
            c27933OoooO.f98853OooOo = str;
            str4 = str2;
            c27933OoooO.f98856OooOoO0 = str4;
            str5 = str3;
            c27933OoooO.f98855OooOoO = str5;
            c27933OoooO.f98857OooOoOO = interfaceC32507OooOO0o;
            c27933OoooO.f98859OooOoo0 = j;
            c27933OoooO.f98861OooOooo = 1;
            Serializable serializableOooO = o00000Var.OooO(c27933OoooO);
            if (serializableOooO != enumC32485OooO00o) {
                str6 = str;
                interfaceC32507OooOO0o2 = interfaceC32507OooOO0o;
                obj = serializableOooO;
                abstractC27907OooOo0O2 = abstractC27907OooOo0O;
                j2 = j;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
                return ((C32445OooOOOO) obj2).f116639OooOo0o;
            }
            j3 = c27933OoooO.f98859OooOoo0;
            interfaceC32507OooOO0o3 = c27933OoooO.f98857OooOoOO;
            str7 = c27933OoooO.f98855OooOoO;
            str4 = c27933OoooO.f98856OooOoO0;
            str8 = c27933OoooO.f98853OooOo;
            abstractC27907OooOo0O3 = c27933OoooO.f98854OooOo0o;
            C32446OooOOOo.OooO0O0(obj2);
            cloudMetaRemoteEntity = (CloudMetaRemoteEntity) obj2;
            if (cloudMetaRemoteEntity != null) {
                return C32446OooOOOo.OooO00o(new FileNotFoundException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Remote CloudMeta not found for id: ", str8)));
            }
            String driveObjectKey = cloudMetaRemoteEntity.getDriveObjectKey();
            File file = new File(str4);
            o00000 o00000Var2 = abstractC27907OooOo0O3.f98678OooO00o;
            c27933OoooO.f98854OooOo0o = null;
            c27933OoooO.f98853OooOo = null;
            c27933OoooO.f98856OooOoO0 = null;
            c27933OoooO.f98855OooOoO = null;
            c27933OoooO.f98857OooOoOO = null;
            c27933OoooO.f98861OooOooo = 3;
            Object objOooOOo = o00000Var2.OooOOo(driveObjectKey, file, str7, j3, interfaceC32507OooOO0o3, c27933OoooO);
            return objOooOOo == enumC32485OooO00o ? enumC32485OooO00o : objOooOOo;
        }
        long j4 = c27933OoooO.f98859OooOoo0;
        InterfaceC32507OooOO0o interfaceC32507OooOO0o4 = c27933OoooO.f98857OooOoOO;
        String str9 = c27933OoooO.f98855OooOoO;
        String str10 = c27933OoooO.f98856OooOoO0;
        str6 = c27933OoooO.f98853OooOo;
        abstractC27907OooOo0O2 = c27933OoooO.f98854OooOo0o;
        C32446OooOOOo.OooO0O0(obj2);
        interfaceC32507OooOO0o2 = interfaceC32507OooOO0o4;
        obj = ((C32445OooOOOO) obj2).f116639OooOo0o;
        j2 = j4;
        str4 = str10;
        str5 = str9;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
        if (thOooO00o != null) {
            return C32446OooOOOo.OooO00o(thOooO00o);
        }
        c27933OoooO.f98854OooOo0o = abstractC27907OooOo0O2;
        c27933OoooO.f98853OooOo = str6;
        c27933OoooO.f98856OooOoO0 = str4;
        c27933OoooO.f98855OooOoO = str5;
        c27933OoooO.f98857OooOoOO = interfaceC32507OooOO0o2;
        c27933OoooO.f98859OooOoo0 = j2;
        c27933OoooO.f98861OooOooo = 2;
        Object objOooO00o = abstractC27907OooOo0O2.f98681OooO0Oo.OooO00o(str6, (String) obj, c27933OoooO);
        if (objOooO00o != enumC32485OooO00o) {
            obj2 = objOooO00o;
            j3 = j2;
            interfaceC32507OooOO0o3 = interfaceC32507OooOO0o2;
            str7 = str5;
            str8 = str6;
            abstractC27907OooOo0O3 = abstractC27907OooOo0O2;
            cloudMetaRemoteEntity = (CloudMetaRemoteEntity) obj2;
            if (cloudMetaRemoteEntity != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Oooooo(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27957o000oOoO c27957o000oOoO;
        if (abstractC32479OooO0OO instanceof C27957o000oOoO) {
            c27957o000oOoO = (C27957o000oOoO) abstractC32479OooO0OO;
            int i = c27957o000oOoO.f99012OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27957o000oOoO.f99012OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27957o000oOoO = new C27957o000oOoO(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = c27957o000oOoO.f99011OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27957o000oOoO.f99012OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C27938OoooOOO c27938OoooOOO = new C27938OoooOOO(abstractC27907OooOo0O, str, null);
            c27957o000oOoO.f99012OooOoO0 = 1;
            objOooO0o = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c27938OoooOOO, c27957o000oOoO);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOooO0o);
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(objOooO0o, "withContext(...)");
        return objOooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object OoooooO(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27939OoooOOo c27939OoooOOo;
        Object objOooO;
        if (abstractC32479OooO0OO instanceof C27939OoooOOo) {
            c27939OoooOOo = (C27939OoooOOo) abstractC32479OooO0OO;
            int i = c27939OoooOOo.f98895OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27939OoooOOo.f98895OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27939OoooOOo = new C27939OoooOOo(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27939OoooOOo.f98894OooOoO0;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27939OoooOOo.f98895OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
            c27939OoooOOo.f98892OooOo0o = abstractC27907OooOo0O;
            c27939OoooOOo.f98891OooOo = str;
            c27939OoooOOo.f98895OooOoOO = 1;
            objOooO = o00000Var.OooO(c27939OoooOOo);
            if (objOooO != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        str = c27939OoooOOo.f98891OooOo;
        abstractC27907OooOo0O = c27939OoooOOo.f98892OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
        if (objOooO instanceof C32445OooOOOO.OooO00o) {
            objOooO = null;
        }
        String str2 = (String) objOooO;
        if (str2 == null) {
            return null;
        }
        c27939OoooOOo.f98892OooOo0o = null;
        c27939OoooOOo.f98891OooOo = null;
        c27939OoooOOo.f98895OooOoOO = 2;
        Object objOooO00o = abstractC27907OooOo0O.f98681OooO0Oo.OooO00o(str, str2, c27939OoooOOo);
        return objOooO00o == obj2 ? obj2 : objOooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object Ooooooo(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27940OoooOo0 c27940OoooOo0;
        if (abstractC32479OooO0OO instanceof C27940OoooOo0) {
            c27940OoooOo0 = (C27940OoooOo0) abstractC32479OooO0OO;
            int i = c27940OoooOo0.f98898OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27940OoooOo0.f98898OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27940OoooOo0 = new C27940OoooOo0(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27940OoooOo0.f98897OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27940OoooOo0.f98898OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
        c27940OoooOo0.f98898OooOoO0 = 1;
        Object objOooO0OO = o00000Var.OooO0OO(c27940OoooOo0);
        return objOooO0OO == enumC32485OooO00o ? enumC32485OooO00o : objOooO0OO;
    }

    public static C32443OooOOO o00000(List list, C27911OooO0oo c27911OooO0oo) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC27909OooO0o0.OooO0OO oooO0OO = (AbstractC27909OooO0o0.OooO0OO) it.next();
            String fileId = oooO0OO.f98721OooO0Oo.getId();
            c27911OooO0oo.getClass();
            kotlin.jvm.internal.OooOOO0.OooO0oO(fileId, "fileId");
            Set<String> set = c27911OooO0oo.f98724OooO00o;
            Boolean boolValueOf = set != null ? Boolean.valueOf(set.contains(fileId)) : null;
            if (boolValueOf != null ? boolValueOf.booleanValue() : true) {
                arrayList.add(oooO0OO);
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "DriveCloudDS", "validateDriveFilesExist: DriveFile ", fileId, " not found in cache, will delete metaId=");
                sbOooO00o.append(oooO0OO.f98718OooO00o);
                c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                arrayList2.add(oooO0OO);
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("DriveCloudDS");
        int size = list.size();
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("validateDriveFilesExist: cache lookup for ", size, " items, valid=", ", deleted=", size2);
        sbOooO0O0.append(size3);
        c20358OooO00o2.OooO00o(sbOooO0O0.toString(), new Object[0]);
        return new C32443OooOOO(arrayList, arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ef, code lost:
    
        if (r11 == r4) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x00f8, TRY_ENTER, TryCatch #0 {all -> 0x00f8, blocks: (B:13:0x002f, B:46:0x00f2, B:18:0x0046, B:31:0x0087, B:34:0x008d, B:37:0x0094, B:39:0x00b0, B:41:0x00b6, B:43:0x00cd, B:21:0x0052, B:27:0x006d, B:24:0x005d), top: B:51:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[Catch: all -> 0x00f8, TryCatch #0 {all -> 0x00f8, blocks: (B:13:0x002f, B:46:0x00f2, B:18:0x0046, B:31:0x0087, B:34:0x008d, B:37:0x0094, B:39:0x00b0, B:41:0x00b6, B:43:0x00cd, B:21:0x0052, B:27:0x006d, B:24:0x005d), top: B:51:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object o000oOoO(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27928Oooo0OO c27928Oooo0OO;
        Object objOooO;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        String str2;
        Object obj;
        String str3;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        Object objOoooOO0;
        if (abstractC32479OooO0OO instanceof C27928Oooo0OO) {
            c27928Oooo0OO = (C27928Oooo0OO) abstractC32479OooO0OO;
            int i = c27928Oooo0OO.f98832OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27928Oooo0OO.f98832OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27928Oooo0OO = new C27928Oooo0OO(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c27928Oooo0OO.f98829OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27928Oooo0OO.f98832OooOoo0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
                c27928Oooo0OO.f98828OooOo0o = str;
                c27928Oooo0OO.f98827OooOo = abstractC27907OooOo0O;
                c27928Oooo0OO.f98832OooOoo0 = 1;
                objOooO = o00000Var.OooO(c27928Oooo0OO);
                if (objOooO == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i2 == 1) {
                abstractC27907OooOo0O = c27928Oooo0OO.f98827OooOo;
                str = c27928Oooo0OO.f98828OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                objOooO = ((C32445OooOOOO) obj2).f116639OooOo0o;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                    objOoooOO0 = ((C32445OooOOOO) obj2).f116639OooOo0o;
                    C32446OooOOOo.OooO0O0(objOoooOO0);
                    return (CloudMetaRemoteEntity) objOoooOO0;
                }
                str2 = c27928Oooo0OO.f98830OooOoO0;
                abstractC27907OooOo0O2 = c27928Oooo0OO.f98827OooOo;
                str3 = c27928Oooo0OO.f98828OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                obj = ((C32445OooOOOO) obj2).f116639OooOo0o;
                if (obj instanceof C32445OooOOOO.OooO00o) {
                    obj = null;
                }
                cloudMetaRemoteEntity = (CloudMetaRemoteEntity) obj;
                if (cloudMetaRemoteEntity != null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DriveCloudDS");
                    c20358OooO00o.OooO00o("ensureRemoteMetaDeleted: remoteMeta is null for " + str3 + ", return success", new Object[0]);
                    return null;
                }
                if (cloudMetaRemoteEntity.isDeleted()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("DriveCloudDS");
                    c20358OooO00o2.OooO00o("ensureRemoteMetaDeleted: remoteMeta already deleted for " + str3, new Object[0]);
                    return cloudMetaRemoteEntity;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("DriveCloudDS");
                c20358OooO00o3.OooO00o("ensureRemoteMetaDeleted: marking remote as deleted for " + str3, new Object[0]);
                c27928Oooo0OO.f98828OooOo0o = null;
                c27928Oooo0OO.f98827OooOo = null;
                c27928Oooo0OO.f98830OooOoO0 = null;
                c27928Oooo0OO.f98832OooOoo0 = 3;
                objOoooOO0 = abstractC27907OooOo0O2.OoooOO0(str2, str3, cloudMetaRemoteEntity, c27928Oooo0OO);
            }
            C32446OooOOOo.OooO0O0(objOooO);
            String str4 = (String) objOooO;
            c27928Oooo0OO.f98828OooOo0o = str;
            c27928Oooo0OO.f98827OooOo = abstractC27907OooOo0O;
            c27928Oooo0OO.f98830OooOoO0 = str4;
            c27928Oooo0OO.f98832OooOoo0 = 2;
            Object objOoooOoO = abstractC27907OooOo0O.OoooOoO(str4, str, c27928Oooo0OO);
            if (objOoooOoO == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            String str5 = str;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            str2 = str4;
            obj = objOoooOoO;
            str3 = str5;
            if (obj instanceof C32445OooOOOO.OooO00o) {
            }
            cloudMetaRemoteEntity = (CloudMetaRemoteEntity) obj;
            if (cloudMetaRemoteEntity != null) {
            }
        } catch (Throwable th) {
            return C32446OooOOOo.OooO00o(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object o0OO00O(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, CloudBundle cloudBundle, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27959o00oO0o c27959o00oO0o;
        CloudBundle cloudBundle2;
        Object objOooO;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        String str2;
        CloudBundle cloudBundle3;
        String str3;
        boolean z2;
        CloudMetaLocalEntity cloudMetaLocalEntity;
        String str4;
        File file;
        int i;
        String str5;
        CloudContentTag cloudContentTag;
        AbstractC27907OooOo0O abstractC27907OooOo0O3 = abstractC27907OooOo0O;
        String str6 = str;
        boolean z3 = z;
        if (abstractC32479OooO0OO instanceof C27959o00oO0o) {
            c27959o00oO0o = (C27959o00oO0o) abstractC32479OooO0OO;
            int i2 = c27959o00oO0o.f99058Oooo00O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27959o00oO0o.f99058Oooo00O = i2 - Integer.MIN_VALUE;
            } else {
                c27959o00oO0o = new C27959o00oO0o(abstractC27907OooOo0O3, abstractC32479OooO0OO);
            }
        }
        Object obj = c27959o00oO0o.f99056OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27959o00oO0o.f99058Oooo00O;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "DriveCloudDS", "requestPushContent: Starting content upload for metaId=", str6, ", force=");
            sbOooO00o.append(z3);
            c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
            o00000 o00000Var = abstractC27907OooOo0O3.f98678OooO00o;
            c27959o00oO0o.f99049OooOo0o = abstractC27907OooOo0O3;
            c27959o00oO0o.f99048OooOo = str6;
            cloudBundle2 = cloudBundle;
            c27959o00oO0o.f99051OooOoO0 = cloudBundle2;
            c27959o00oO0o.f99053OooOoo = z3;
            c27959o00oO0o.f99058Oooo00O = 1;
            objOooO = o00000Var.OooO(c27959o00oO0o);
            if (objOooO != enumC32485OooO00o) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return ((C32445OooOOOO) obj).f116639OooOo0o;
                }
                int i4 = c27959o00oO0o.f99055OooOooO;
                z2 = c27959o00oO0o.f99053OooOoo;
                CloudContentTag cloudContentTag2 = c27959o00oO0o.f99054OooOoo0;
                File file2 = c27959o00oO0o.f99052OooOoOO;
                String str7 = c27959o00oO0o.f99050OooOoO;
                cloudBundle3 = c27959o00oO0o.f99051OooOoO0;
                String str8 = c27959o00oO0o.f99048OooOo;
                abstractC27907OooOo0O2 = c27959o00oO0o.f99049OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                i = i4;
                cloudContentTag = cloudContentTag2;
                file = file2;
                str4 = str7;
                str5 = str8;
                AbstractC27907OooOo0O abstractC27907OooOo0O4 = abstractC27907OooOo0O2;
                o00oO0O o00oo0o = new o00oO0O(cloudBundle3, (CloudMetaRemoteEntity) obj, str5, str4, i, cloudContentTag, abstractC27907OooOo0O4, z2, file, null);
                c27959o00oO0o.f99049OooOo0o = null;
                c27959o00oO0o.f99048OooOo = null;
                c27959o00oO0o.f99051OooOoO0 = null;
                c27959o00oO0o.f99050OooOoO = null;
                c27959o00oO0o.f99052OooOoOO = null;
                c27959o00oO0o.f99054OooOoo0 = null;
                c27959o00oO0o.f99058Oooo00O = 4;
                Object objO00000O = abstractC27907OooOo0O4.o00000O(str4, o00oo0o, c27959o00oO0o);
                return objO00000O != enumC32485OooO00o ? enumC32485OooO00o : objO00000O;
            }
            boolean z4 = c27959o00oO0o.f99053OooOoo;
            String str9 = c27959o00oO0o.f99050OooOoO;
            CloudBundle cloudBundle4 = c27959o00oO0o.f99051OooOoO0;
            str3 = c27959o00oO0o.f99048OooOo;
            AbstractC27907OooOo0O abstractC27907OooOo0O5 = c27959o00oO0o.f99049OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            z2 = z4;
            str2 = str9;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O5;
            cloudBundle3 = cloudBundle4;
            cloudMetaLocalEntity = (CloudMetaLocalEntity) obj;
            if (cloudMetaLocalEntity != null) {
                return C32446OooOOOo.OooO00o(new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Local CloudMeta not found for id: ", str3)));
            }
            File file3 = cloudBundle3.getFile();
            CloudContentTag contentTag = cloudBundle3.getContentTag();
            if (file3 == null || !file3.exists() || contentTag == null) {
                return C32446OooOOOo.OooO00o(new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Invalid content bundle for metaId: ", str3)));
            }
            int metaVersion = cloudMetaLocalEntity.getMetaVersion();
            c27959o00oO0o.f99049OooOo0o = abstractC27907OooOo0O2;
            c27959o00oO0o.f99048OooOo = str3;
            c27959o00oO0o.f99051OooOoO0 = cloudBundle3;
            c27959o00oO0o.f99050OooOoO = str2;
            c27959o00oO0o.f99052OooOoOO = file3;
            c27959o00oO0o.f99054OooOoo0 = contentTag;
            c27959o00oO0o.f99053OooOoo = z2;
            c27959o00oO0o.f99055OooOooO = metaVersion;
            c27959o00oO0o.f99058Oooo00O = 3;
            Object objOooO00o = abstractC27907OooOo0O2.f98681OooO0Oo.OooO00o(str3, str2, c27959o00oO0o);
            if (objOooO00o != enumC32485OooO00o) {
                str4 = str2;
                file = file3;
                i = metaVersion;
                str5 = str3;
                obj = objOooO00o;
                cloudContentTag = contentTag;
                AbstractC27907OooOo0O abstractC27907OooOo0O42 = abstractC27907OooOo0O2;
                o00oO0O o00oo0o2 = new o00oO0O(cloudBundle3, (CloudMetaRemoteEntity) obj, str5, str4, i, cloudContentTag, abstractC27907OooOo0O42, z2, file, null);
                c27959o00oO0o.f99049OooOo0o = null;
                c27959o00oO0o.f99048OooOo = null;
                c27959o00oO0o.f99051OooOoO0 = null;
                c27959o00oO0o.f99050OooOoO = null;
                c27959o00oO0o.f99052OooOoOO = null;
                c27959o00oO0o.f99054OooOoo0 = null;
                c27959o00oO0o.f99058Oooo00O = 4;
                Object objO00000O2 = abstractC27907OooOo0O42.o00000O(str4, o00oo0o2, c27959o00oO0o);
                if (objO00000O2 != enumC32485OooO00o) {
                }
            }
        }
        boolean z5 = c27959o00oO0o.f99053OooOoo;
        CloudBundle cloudBundle5 = c27959o00oO0o.f99051OooOoO0;
        String str10 = c27959o00oO0o.f99048OooOo;
        AbstractC27907OooOo0O abstractC27907OooOo0O6 = c27959o00oO0o.f99049OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
        z3 = z5;
        abstractC27907OooOo0O3 = abstractC27907OooOo0O6;
        cloudBundle2 = cloudBundle5;
        str6 = str10;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO);
        if (thOooO00o != null) {
            return C32446OooOOOo.OooO00o(thOooO00o);
        }
        String str11 = (String) objOooO;
        c27959o00oO0o.f99049OooOo0o = abstractC27907OooOo0O3;
        c27959o00oO0o.f99048OooOo = str6;
        c27959o00oO0o.f99051OooOoO0 = cloudBundle2;
        c27959o00oO0o.f99050OooOoO = str11;
        c27959o00oO0o.f99053OooOoo = z3;
        c27959o00oO0o.f99058Oooo00O = 2;
        Object objOooO00o2 = abstractC27907OooOo0O3.f98680OooO0OO.OooO00o(str6, str11, c27959o00oO0o);
        if (objOooO00o2 != enumC32485OooO00o) {
            abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
            str2 = str11;
            obj = objOooO00o2;
            cloudBundle3 = cloudBundle2;
            str3 = str6;
            z2 = z3;
            cloudMetaLocalEntity = (CloudMetaLocalEntity) obj;
            if (cloudMetaLocalEntity != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object o0Oo0oo(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27960o00ooo c27960o00ooo;
        Object objOooO;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        String str2;
        CloudMetaLocalEntity cloudMetaLocalEntity;
        if (abstractC32479OooO0OO instanceof C27960o00ooo) {
            c27960o00ooo = (C27960o00ooo) abstractC32479OooO0OO;
            int i = c27960o00ooo.f99064OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27960o00ooo.f99064OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27960o00ooo = new C27960o00ooo(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27960o00ooo.f99061OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27960o00ooo.f99064OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "DriveCloudDS", "requestDeleteFile: Preparing to delete file for metaId=", str), new Object[0]);
            o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
            c27960o00ooo.f99060OooOo0o = abstractC27907OooOo0O;
            c27960o00ooo.f99059OooOo = str;
            c27960o00ooo.f99064OooOoo0 = 1;
            objOooO = o00000Var.OooO(c27960o00ooo);
            if (objOooO != enumC32485OooO00o) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return ((C32445OooOOOO) obj).f116639OooOo0o;
            }
            String str3 = c27960o00ooo.f99062OooOoO0;
            str = c27960o00ooo.f99059OooOo;
            AbstractC27907OooOo0O abstractC27907OooOo0O3 = c27960o00ooo.f99060OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            str2 = str3;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
            String str4 = str;
            cloudMetaLocalEntity = (CloudMetaLocalEntity) obj;
            if (cloudMetaLocalEntity != null) {
                return C32446OooOOOo.OooO00o(new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Local CloudMeta not found for id: ", str4)));
            }
            oo000o oo000oVar = new oo000o(cloudMetaLocalEntity.getMetaVersion(), str4, str2, null, abstractC27907OooOo0O2);
            c27960o00ooo.f99060OooOo0o = null;
            c27960o00ooo.f99059OooOo = null;
            c27960o00ooo.f99062OooOoO0 = null;
            c27960o00ooo.f99064OooOoo0 = 3;
            Object objO00000O = abstractC27907OooOo0O2.o00000O(str2, oo000oVar, c27960o00ooo);
            return objO00000O == enumC32485OooO00o ? enumC32485OooO00o : objO00000O;
        }
        str = c27960o00ooo.f99059OooOo;
        abstractC27907OooOo0O = c27960o00ooo.f99060OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO);
        if (thOooO00o != null) {
            return C32446OooOOOo.OooO00o(thOooO00o);
        }
        String str5 = (String) objOooO;
        c27960o00ooo.f99060OooOo0o = abstractC27907OooOo0O;
        c27960o00ooo.f99059OooOo = str;
        c27960o00ooo.f99062OooOoO0 = str5;
        c27960o00ooo.f99064OooOoo0 = 2;
        Object objOooO00o = abstractC27907OooOo0O.f98680OooO0OO.OooO00o(str, str5, c27960o00ooo);
        if (objOooO00o != enumC32485OooO00o) {
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            str2 = str5;
            obj = objOooO00o;
            String str42 = str;
            cloudMetaLocalEntity = (CloudMetaLocalEntity) obj;
            if (cloudMetaLocalEntity != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object o0OoOo0(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27941OoooOoO c27941OoooOoO;
        if (abstractC32479OooO0OO instanceof C27941OoooOoO) {
            c27941OoooOoO = (C27941OoooOoO) abstractC32479OooO0OO;
            int i = c27941OoooOoO.f98901OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27941OoooOoO.f98901OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27941OoooOoO = new C27941OoooOoO(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27941OoooOoO.f98900OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27941OoooOoO.f98901OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
        c27941OoooOoO.f98901OooOoO0 = 1;
        Serializable serializableOooO = o00000Var.OooO(c27941OoooOoO);
        return serializableOooO == enumC32485OooO00o ? enumC32485OooO00o : serializableOooO;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd A[Catch: all -> 0x00e7, PHI: r2 r12 r13
      0x00cd: PHI (r2v6 java.lang.Object) = (r2v5 java.lang.Object), (r2v12 java.lang.Object) binds: [B:40:0x00ca, B:23:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r12v7 o0OOooO0.OooOo0O) = (r12v4 o0OOooO0.OooOo0O), (r12v20 o0OOooO0.OooOo0O) binds: [B:40:0x00ca, B:23:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r13v11 oO0o0oOo.OooO00o) = (r13v8 oO0o0oOo.OooO00o), (r13v24 oO0o0oOo.OooO00o) binds: [B:40:0x00ca, B:23:0x0053] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00e7, blocks: (B:42:0x00cd, B:39:0x00be), top: B:59:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object o0ooOoO(AbstractC27907OooOo0O abstractC27907OooOo0O, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00Oo0 o00oo02;
        Object objOooOo0;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        Object objOooO;
        Throwable th;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof o00Oo0) {
            o00oo02 = (o00Oo0) abstractC32479OooO0OO;
            int i = o00oo02.f99024OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oo02.f99024OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o00oo02 = new o00Oo0(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = o00oo02.f99023OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00oo02.f99024OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooOO0("pullRemoteChanges: starting pull operation", new Object[0]);
            o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
            o00oo02.f99021OooOo0o = abstractC27907OooOo0O;
            o00oo02.f99024OooOoOO = 1;
            objOooOo0 = o00000Var.OooOo0(o00oo02);
            if (objOooOo0 != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            abstractC27907OooOo0O = (AbstractC27907OooOo0O) o00oo02.f99021OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC33895OooO00o2 = (InterfaceC33895OooO00o) o00oo02.f99021OooOo0o;
                    try {
                        C32446OooOOOo.OooO0O0(obj);
                        objOooO00o = C32460OooOooO.f116667OooO00o;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            objOooO00o = C32446OooOOOo.OooO00o(th);
                        } finally {
                            interfaceC33895OooO00o2.OooOOO0(null);
                        }
                    }
                    return objOooO00o;
                }
                abstractC27907OooOo0O = (AbstractC27907OooOo0O) o00oo02.f99020OooOo;
                InterfaceC33895OooO00o interfaceC33895OooO00o3 = (InterfaceC33895OooO00o) o00oo02.f99021OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
                    interfaceC33895OooO00o = interfaceC33895OooO00o3;
                    C32446OooOOOo.OooO0O0(objOooO);
                    o00oo02.f99021OooOo0o = interfaceC33895OooO00o;
                    o00oo02.f99020OooOo = null;
                    o00oo02.f99024OooOoOO = 4;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o3;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
                if (abstractC27907OooOo0O.o0ooOOo((String) objOooO, o00oo02) != enumC32485OooO00o) {
                    interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                    return objOooO00o;
                }
                return enumC32485OooO00o;
            }
            InterfaceC33895OooO00o interfaceC33895OooO00o4 = (InterfaceC33895OooO00o) o00oo02.f99020OooOo;
            AbstractC27907OooOo0O abstractC27907OooOo0O2 = (AbstractC27907OooOo0O) o00oo02.f99021OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o4;
            abstractC27907OooOo0O = abstractC27907OooOo0O2;
            try {
                o00000 o00000Var2 = abstractC27907OooOo0O.f98678OooO00o;
                o00oo02.f99021OooOo0o = interfaceC33895OooO00o;
                o00oo02.f99020OooOo = abstractC27907OooOo0O;
                o00oo02.f99024OooOoOO = 3;
                objOooO = o00000Var2.OooO(o00oo02);
                if (objOooO == enumC32485OooO00o) {
                    C32446OooOOOo.OooO0O0(objOooO);
                    o00oo02.f99021OooOo0o = interfaceC33895OooO00o;
                    o00oo02.f99020OooOo = null;
                    o00oo02.f99024OooOoOO = 4;
                    if (abstractC27907OooOo0O.o0ooOOo((String) objOooO, o00oo02) != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            } catch (Throwable th4) {
                InterfaceC33895OooO00o interfaceC33895OooO00o5 = interfaceC33895OooO00o;
                th = th4;
                interfaceC33895OooO00o2 = interfaceC33895OooO00o5;
                objOooO00o = C32446OooOOOo.OooO00o(th);
            }
        }
        if (objOooOo0 instanceof C32445OooOOOO.OooO00o) {
            Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOo0);
            kotlin.jvm.internal.OooOOO0.OooO0Oo(thOooO00o);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DriveCloudDS");
            c20358OooO00o2.OooO0Oo(thOooO00o, "pullRemoteChanges: ensureReady failed", new Object[0]);
            return C32446OooOOOo.OooO00o(thOooO00o);
        }
        interfaceC33895OooO00o = abstractC27907OooOo0O.f98691OooOOOO;
        o00oo02.f99021OooOo0o = abstractC27907OooOo0O;
        o00oo02.f99020OooOo = interfaceC33895OooO00o;
        o00oo02.f99024OooOoOO = 2;
        if (interfaceC33895OooO00o.OooO00o(o00oo02) != enumC32485OooO00o) {
            o00000 o00000Var22 = abstractC27907OooOo0O.f98678OooO00o;
            o00oo02.f99021OooOo0o = interfaceC33895OooO00o;
            o00oo02.f99020OooOo = abstractC27907OooOo0O;
            o00oo02.f99024OooOoOO = 3;
            objOooO = o00000Var22.OooO(o00oo02);
            if (objOooO == enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object oo0o0Oo(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, CloudBundle cloudBundle, boolean z, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27961o0ooOO0 c27961o0ooOO0;
        String str2;
        CloudBundle cloudBundle2;
        boolean z2;
        Object objOooO;
        String str3;
        String str4;
        CloudBundle cloudBundle3;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        boolean z3;
        CloudMetaLocalEntity cloudMetaLocalEntity;
        int metaVersion;
        CloudMetaLocalEntity cloudMetaLocalEntity2;
        String str5;
        String str6;
        CloudMetaRemoteEntity cloudMetaRemoteEntity;
        String driveObjectKey;
        AbstractC27907OooOo0O abstractC27907OooOo0O3 = abstractC27907OooOo0O;
        if (abstractC32479OooO0OO instanceof C27961o0ooOO0) {
            c27961o0ooOO0 = (C27961o0ooOO0) abstractC32479OooO0OO;
            int i = c27961o0ooOO0.f99114Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27961o0ooOO0.f99114Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c27961o0ooOO0 = new C27961o0ooOO0(abstractC27907OooOo0O3, abstractC32479OooO0OO);
            }
        }
        Object obj = c27961o0ooOO0.f99112OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27961o0ooOO0.f99114Oooo000;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o00000 o00000Var = abstractC27907OooOo0O3.f98678OooO00o;
            c27961o0ooOO0.f99106OooOo0o = abstractC27907OooOo0O3;
            str2 = str;
            c27961o0ooOO0.f99105OooOo = str2;
            cloudBundle2 = cloudBundle;
            c27961o0ooOO0.f99108OooOoO0 = cloudBundle2;
            z2 = z;
            c27961o0ooOO0.f99111OooOoo0 = z2;
            c27961o0ooOO0.f99114Oooo000 = 1;
            objOooO = o00000Var.OooO(c27961o0ooOO0);
            if (objOooO != enumC32485OooO00o) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    return ((C32445OooOOOO) obj).f116639OooOo0o;
                }
                metaVersion = c27961o0ooOO0.f99110OooOoo;
                CloudMetaLocalEntity cloudMetaLocalEntity3 = c27961o0ooOO0.f99109OooOoOO;
                String str7 = c27961o0ooOO0.f99107OooOoO;
                cloudBundle3 = c27961o0ooOO0.f99108OooOoO0;
                str3 = c27961o0ooOO0.f99105OooOo;
                abstractC27907OooOo0O2 = c27961o0ooOO0.f99106OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                cloudMetaLocalEntity2 = cloudMetaLocalEntity3;
                str5 = str7;
                int i3 = metaVersion;
                CloudBundle cloudBundle4 = cloudBundle3;
                str6 = str3;
                AbstractC27907OooOo0O abstractC27907OooOo0O4 = abstractC27907OooOo0O2;
                cloudMetaRemoteEntity = (CloudMetaRemoteEntity) obj;
                if (cloudMetaRemoteEntity != null || (driveObjectKey = cloudMetaRemoteEntity.getDriveObjectKey()) == null) {
                    return C32446OooOOOo.OooO00o(new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Remote CloudMeta not found for meta-only upload: ", str6)));
                }
                o0ooOOo o0ooooo2 = new o0ooOOo(cloudBundle4, cloudMetaLocalEntity2, i3, driveObjectKey, str6, abstractC27907OooOo0O4, str5, null);
                c27961o0ooOO0.f99106OooOo0o = null;
                c27961o0ooOO0.f99105OooOo = null;
                c27961o0ooOO0.f99108OooOoO0 = null;
                c27961o0ooOO0.f99107OooOoO = null;
                c27961o0ooOO0.f99109OooOoOO = null;
                c27961o0ooOO0.f99114Oooo000 = 4;
                Object objO00000O = abstractC27907OooOo0O4.o00000O(str5, o0ooooo2, c27961o0ooOO0);
                return objO00000O == enumC32485OooO00o ? enumC32485OooO00o : objO00000O;
            }
            z3 = c27961o0ooOO0.f99111OooOoo0;
            str4 = c27961o0ooOO0.f99107OooOoO;
            cloudBundle3 = c27961o0ooOO0.f99108OooOoO0;
            str3 = c27961o0ooOO0.f99105OooOo;
            abstractC27907OooOo0O2 = c27961o0ooOO0.f99106OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            cloudMetaLocalEntity = (CloudMetaLocalEntity) obj;
            if (cloudMetaLocalEntity != null) {
                return C32446OooOOOo.OooO00o(new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Local CloudMeta not found for id: ", str3)));
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "DriveCloudDS", "requestPushMetaOnly: Starting meta-only upload for metaId=", str3, ", force=");
            sbOooO00o.append(z3);
            c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
            metaVersion = cloudMetaLocalEntity.getMetaVersion();
            c27961o0ooOO0.f99106OooOo0o = abstractC27907OooOo0O2;
            c27961o0ooOO0.f99105OooOo = str3;
            c27961o0ooOO0.f99108OooOoO0 = cloudBundle3;
            c27961o0ooOO0.f99107OooOoO = str4;
            c27961o0ooOO0.f99109OooOoOO = cloudMetaLocalEntity;
            c27961o0ooOO0.f99110OooOoo = metaVersion;
            c27961o0ooOO0.f99114Oooo000 = 3;
            Object objOooO00o = abstractC27907OooOo0O2.f98681OooO0Oo.OooO00o(str3, str4, c27961o0ooOO0);
            if (objOooO00o != enumC32485OooO00o) {
                cloudMetaLocalEntity2 = cloudMetaLocalEntity;
                str5 = str4;
                obj = objOooO00o;
                int i32 = metaVersion;
                CloudBundle cloudBundle42 = cloudBundle3;
                str6 = str3;
                AbstractC27907OooOo0O abstractC27907OooOo0O42 = abstractC27907OooOo0O2;
                cloudMetaRemoteEntity = (CloudMetaRemoteEntity) obj;
                if (cloudMetaRemoteEntity != null) {
                }
                return C32446OooOOOo.OooO00o(new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Remote CloudMeta not found for meta-only upload: ", str6)));
            }
        }
        boolean z4 = c27961o0ooOO0.f99111OooOoo0;
        CloudBundle cloudBundle5 = c27961o0ooOO0.f99108OooOoO0;
        String str8 = c27961o0ooOO0.f99105OooOo;
        AbstractC27907OooOo0O abstractC27907OooOo0O5 = c27961o0ooOO0.f99106OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
        z2 = z4;
        abstractC27907OooOo0O3 = abstractC27907OooOo0O5;
        cloudBundle2 = cloudBundle5;
        str2 = str8;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO);
        if (thOooO00o != null) {
            return C32446OooOOOo.OooO00o(thOooO00o);
        }
        String str9 = (String) objOooO;
        c27961o0ooOO0.f99106OooOo0o = abstractC27907OooOo0O3;
        c27961o0ooOO0.f99105OooOo = str2;
        c27961o0ooOO0.f99108OooOoO0 = cloudBundle2;
        c27961o0ooOO0.f99107OooOoO = str9;
        c27961o0ooOO0.f99111OooOoo0 = z2;
        c27961o0ooOO0.f99114Oooo000 = 2;
        Object objOooO00o2 = abstractC27907OooOo0O3.f98680OooO0OO.OooO00o(str2, str9, c27961o0ooOO0);
        if (objOooO00o2 != enumC32485OooO00o) {
            str3 = str2;
            str4 = str9;
            obj = objOooO00o2;
            cloudBundle3 = cloudBundle2;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
            z3 = z2;
            cloudMetaLocalEntity = (CloudMetaLocalEntity) obj;
            if (cloudMetaLocalEntity != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object ooOO(AbstractC27907OooOo0O abstractC27907OooOo0O, String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27942OoooOoo c27942OoooOoo;
        if (abstractC32479OooO0OO instanceof C27942OoooOoo) {
            c27942OoooOoo = (C27942OoooOoo) abstractC32479OooO0OO;
            int i = c27942OoooOoo.f98906OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27942OoooOoo.f98906OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27942OoooOoo = new C27942OoooOoo(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object objOoooooO = c27942OoooOoo.f98905OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27942OoooOoo.f98906OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOoooooO);
            c27942OoooOoo.f98903OooOo0o = abstractC27907OooOo0O;
            c27942OoooOoo.f98902OooOo = str;
            c27942OoooOoo.f98906OooOoOO = 1;
            abstractC27907OooOo0O.getClass();
            objOoooooO = OoooooO(abstractC27907OooOo0O, str, c27942OoooOoo);
            if (objOoooooO != enumC32485OooO00o) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objOoooooO);
            return ((C32445OooOOOO) objOoooooO).f116639OooOo0o;
        }
        str = c27942OoooOoo.f98902OooOo;
        abstractC27907OooOo0O = c27942OoooOoo.f98903OooOo0o;
        C32446OooOOOo.OooO0O0(objOoooooO);
        CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) objOoooooO;
        if (cloudMetaRemoteEntity == null) {
            return C32446OooOOOo.OooO00o(new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("CloudMeta not found for metaId=", str)));
        }
        if (C33599OooOo0O.Oooo0o0(cloudMetaRemoteEntity.getDriveObjectKey())) {
            return C32446OooOOOo.OooO00o(new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("DriveObjectKey is blank for metaId=", str)));
        }
        o00000 o00000Var = abstractC27907OooOo0O.f98678OooO00o;
        String driveObjectKey = cloudMetaRemoteEntity.getDriveObjectKey();
        c27942OoooOoo.f98903OooOo0o = null;
        c27942OoooOoo.f98902OooOo = null;
        c27942OoooOoo.f98906OooOoOO = 2;
        Object objOooOOO = o00000Var.OooOOO(driveObjectKey, c27942OoooOoo);
        return objOooOOO == enumC32485OooO00o ? enumC32485OooO00o : objOooOOO;
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooO(String str, o0OO0OoO.OooOOO0 oooOOO0) {
        return Oooooo(this, str, oooOOO0);
    }

    @Override // o0OO0OoO.OooO00o
    public final InterfaceC33721OooO0o OooO00o() {
        return this.f98678OooO00o.OooO00o();
    }

    @Override // o0OO0OoO.OooO00o
    public final InterfaceC33721OooO0o<Boolean> OooO0O0() {
        return this.f98678OooO00o.OooO0O0();
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooO0Oo(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return o0OoOo0(this, abstractC32479OooO0OO);
    }

    @Override // o0OO0OoO.OooO00o
    public final boolean OooO0o() {
        return this.f98678OooO00o.OooO0o();
    }

    @Override // o0OO0OoO.OooO00o
    public final InterfaceC33721OooO0o<String> OooO0o0() {
        return this.f98678OooO00o.OooOo00();
    }

    @Override // o0OO0OoO.OooO00o
    public final C33768Ooooo00 OooO0oO() {
        return C25252OooO0Oo.OooO0O0(this.f98689OooOOO);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooO0oo(String str, CloudBundle cloudBundle, boolean z, o0OO0OoO.Oooo0 oooo0) {
        return oo0o0Oo(this, str, cloudBundle, z, oooo0);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOO0(CloudMetaLocalEntity cloudMetaLocalEntity, C26739Oooo0oO c26739Oooo0oO) {
        Object objOooO0Oo = this.f98680OooO0OO.OooO0Oo(cloudMetaLocalEntity, c26739Oooo0oO);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0Oo != enumC32485OooO00o) {
            objOooO0Oo = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0Oo == enumC32485OooO00o ? objOooO0Oo : C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOO0O(String str, CloudContentTag cloudContentTag, o0OO0OoO.OooO0O0 oooO0O0) {
        return Oooo0OO(this, str, cloudContentTag, oooO0O0);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOO0o(String str, o0OO0OoO.OooO oooO) {
        return Ooooo00(this, str, oooO);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOOO(String str, C26716OooO0oo c26716OooO0oo) {
        return OoooOoo(this, str, c26716OooO0oo);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOOO0(String str, String str2, String str3, long j, InterfaceC32507OooOO0o interfaceC32507OooOO0o, C26717OooOO0o c26717OooOO0o) {
        return OooooOo(this, str, str2, str3, j, interfaceC32507OooOO0o, c26717OooOO0o);
    }

    @Override // o0OO0OoO.OooO00o
    public final C32460OooOooO OooOOOO() {
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // o0OO0OoO.OooO00o
    public final InterfaceC33721OooO0o<List<CloudMetaRemoteEntity>> OooOOOo(String driveId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(driveId, "driveId");
        return this.f98681OooO0Oo.OooO0Oo(driveId);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOOo(String str, C26723OooOo0O c26723OooOo0O) {
        return OoooooO(this, str, c26723OooOo0O);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOOo0(String str, C26728OooOoo c26728OooOoo) {
        return ooOO(this, str, c26728OooOoo);
    }

    @Override // o0OO0OoO.OooO00o
    public final InterfaceC33721OooO0o<List<CloudMetaLocalEntity>> OooOOoo(String driveId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(driveId, "driveId");
        return this.f98680OooO0OO.OooO0OO(driveId);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOo(CloudAuthRequest cloudAuthRequest, C27624OooOOO0 c27624OooOOO0) {
        return Oooo0o0(this, cloudAuthRequest, c27624OooOOO0);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOo0(o0OO0OoO.OooO0OO oooO0OO) {
        return OoooO0(this, oooO0OO);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOo00(o0OO0OoO.Oooo000 oooo000) {
        return o0ooOoO(this, oooo000);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOo0O(String str, C26715OooO0oO c26715OooO0oO) {
        return o000oOoO(this, str, c26715OooO0oO);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOo0o(String str, o0OO0OoO.OooOO0 oooOO02) {
        return OooooO0(this, str, oooOO02);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOoO(o0OO0OoO.OooOo oooOo) {
        return Ooooooo(this, oooOo);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOoO0(C26713OooO0Oo c26713OooO0Oo) {
        return OoooO0O(this, c26713OooO0Oo);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOoOO(String str, CloudBundle cloudBundle, boolean z, C26734Oooo00o c26734Oooo00o) {
        return o0OO00O(this, str, cloudBundle, z, c26734Oooo00o);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOoo(String str, String str2, C26724OooOo0o c26724OooOo0o) {
        return this.f98680OooO0OO.OooO00o(str, str2, c26724OooOo0o);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOoo0(String str, C26733Oooo00O c26733Oooo00O) {
        return o0Oo0oo(this, str, c26733Oooo00O);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOooO(String str, String str2, String str3, o0OO0OoO.OooOO0O oooOO0O) {
        return OooooOO(this, str, str2, str3, oooOO0O);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object OooOooo(o0OO0OoO.OooO0o oooO0o) {
        return OoooOOo(this, oooO0o);
    }

    public final CloudEvent.MetaEvent Oooo(CloudMetaLocalEntity cloudMetaLocalEntity, CloudMetaRemoteEntity cloudMetaRemoteEntity, DriveSnapshotCacheEntity driveSnapshotCacheEntity, String str) {
        CloudEvent.MetaEvent.Type type;
        CloudContentTag stagedContentTag;
        CloudContentTag contentTag;
        if (!driveSnapshotCacheEntity.getCTag().matches(cloudMetaRemoteEntity.getContentTag())) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooO0OO("buildEventFromNormalPath: remote content inconsistent for " + cloudMetaRemoteEntity.getId() + ", remoteContentTag " + cloudMetaRemoteEntity.getContentTag() + ", driveSnapshot: " + driveSnapshotCacheEntity.getCTag() + " skipping", new Object[0]);
            return null;
        }
        boolean z = cloudMetaLocalEntity != null && cloudMetaLocalEntity.getMetaVersion() == cloudMetaRemoteEntity.getMetaVersion();
        boolean zMatches = (cloudMetaLocalEntity == null || (contentTag = cloudMetaLocalEntity.getContentTag()) == null) ? false : driveSnapshotCacheEntity.getCTag().matches(contentTag);
        boolean z2 = (cloudMetaLocalEntity == null || (stagedContentTag = cloudMetaLocalEntity.getStagedContentTag()) == null || !driveSnapshotCacheEntity.getCTag().matches(stagedContentTag)) ? false : true;
        if (cloudMetaRemoteEntity.isDeleted() && cloudMetaLocalEntity != null && cloudMetaLocalEntity.getDeletedRemote() && z) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DriveCloudDS");
            c20358OooO00o2.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("buildEventFromNormalPath: cloud delete already acknowledged for ", driveSnapshotCacheEntity.getId()), new Object[0]);
            return null;
        }
        if (cloudMetaLocalEntity != null && z && zMatches) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("DriveCloudDS");
            c20358OooO00o3.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("buildEventFromNormalPath: already synced for ", driveSnapshotCacheEntity.getId()), new Object[0]);
            return null;
        }
        if (cloudMetaLocalEntity != null && z && !zMatches && !z2) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("DriveCloudDS");
            c20358OooO00o4.OooO0OO(C20593OooO0Oo.OooO0O0("buildEventFromNormalPath: unexpected state for ", driveSnapshotCacheEntity.getId(), ", skipping"), new Object[0]);
            return null;
        }
        Integer numValueOf = (!z2 || cloudMetaLocalEntity == null) ? null : Integer.valueOf(cloudMetaLocalEntity.getMetaVersion());
        if (cloudMetaLocalEntity == null) {
            if (cloudMetaRemoteEntity.isDeleted()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("DriveCloudDS");
                c20358OooO00o5.OooO0o0(C20593OooO0Oo.OooO0O0("buildEventFromNormalPath: cloud delete for non-existing local meta ", driveSnapshotCacheEntity.getId(), ", skipping"), new Object[0]);
                return null;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o6.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o6, "DriveCloudDS", "buildEventFromNormalPath: remote create detected for ", str, ", treating as update"), new Object[0]);
            type = CloudEvent.MetaEvent.Type.CLOUD_UPDATE;
        } else if (!cloudMetaRemoteEntity.isDeleted()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o7.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o7, "DriveCloudDS", "buildEventFromNormalPath: remote update detected for ", str), new Object[0]);
            type = CloudEvent.MetaEvent.Type.CLOUD_UPDATE;
        } else {
            if (cloudMetaLocalEntity.getDeletedRemote()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o8.OooOOO0("DriveCloudDS");
                c20358OooO00o8.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("buildEventFromNormalPath: cloud delete already acknowledged for ", driveSnapshotCacheEntity.getId()), new Object[0]);
                return null;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o9 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o9.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o9, "DriveCloudDS", "buildEventFromNormalPath: remote delete detected for ", str), new Object[0]);
            type = CloudEvent.MetaEvent.Type.CLOUD_DELETE;
        }
        return new CloudEvent.MetaEvent(cloudMetaRemoteEntity.getId(), cloudMetaLocalEntity != null ? cloudMetaLocalEntity.getDeleted() : false, cloudMetaRemoteEntity.isDeleted(), type, this.f98684OooO0oO.toRemoteDomain(cloudMetaRemoteEntity), numValueOf);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object Oooo000(String str, o0OO0OoO.OooOOOO oooOOOO) {
        return this.f98680OooO0OO.OooO0o0(str, oooOOOO);
    }

    @Override // o0OO0OoO.OooO00o
    public final Object Oooo00O(String str, C26721OooOOoo c26721OooOOoo) {
        return this.f98681OooO0Oo.OooO0o0(str, c26721OooOOoo);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb A[LOOP:0: B:76:0x01b5->B:78:0x01bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0o(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27916OooOoO0 c27916OooOoO0;
        ArrayList<AbstractC27909OooO0o0.OooO00o> arrayList2;
        String str2;
        String str3;
        Map linkedHashMap;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        ArrayList arrayList3;
        Iterator it;
        String str4;
        String str5;
        Object objOooO00o;
        Map map;
        CloudMetaRemoteEntity meta;
        Throwable thOooO00o;
        Object obj;
        int iOooO0Oo;
        if (abstractC32479OooO0OO instanceof C27916OooOoO0) {
            c27916OooOoO0 = (C27916OooOoO0) abstractC32479OooO0OO;
            int i = c27916OooOoO0.f98763OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27916OooOoO0.f98763OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27916OooOoO0 = new C27916OooOoO0(this, abstractC32479OooO0OO);
            }
        }
        Object objO0O0O00 = c27916OooOoO0.f98762OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27916OooOoO0.f98763OooOoOO;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        String str6 = "recycled";
        String str7 = "snapshot missing";
        int i3 = 0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objO0O0O00);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(arrayList.size(), "batchDeleteAndBuildEvents: processing ", " delete scenarios"), new Object[0]);
            if (arrayList.isEmpty()) {
                return new C27910OooO0oO(c34434OooOoO, c34434OooOoO);
            }
            arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                AbstractC27909OooO0o0.OooO00o oooO00o = (AbstractC27909OooO0o0.OooO00o) next;
                CloudMetaRemoteEntity cloudMetaRemoteEntity = oooO00o.f98712OooO0OO;
                String str8 = oooO00o.f98710OooO00o;
                if (cloudMetaRemoteEntity == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooO00o(C22201OooO0oO.OooO0O0(c20358OooO00o2, "DriveCloudDS", "batchDeleteAndBuildEvents: remoteMeta is null for ", str8, ", skipping"), new Object[i3]);
                    it = it2;
                    str4 = str6;
                    str5 = str7;
                } else {
                    String str9 = oooO00o.f98713OooO0Oo == null ? str7 : str6;
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    it = it2;
                    str4 = str6;
                    StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o3, "DriveCloudDS", "batchDeleteAndBuildEvents: ", str9, " for ");
                    sbOooO00o.append(str8);
                    str5 = str7;
                    c20358OooO00o3.OooOO0O(sbOooO00o.toString(), new Object[0]);
                    CloudMetaLocalEntity cloudMetaLocalEntity = oooO00o.f98711OooO0O0;
                    if (cloudMetaLocalEntity == null) {
                        StringBuilder sbOooO00o2 = C22227OoooO.OooO00o(c20358OooO00o3, "DriveCloudDS", "batchDeleteAndBuildEvents: cloud delete (", str9, ") for non-existing local meta ");
                        sbOooO00o2.append(str8);
                        c20358OooO00o3.OooO0o0(sbOooO00o2.toString(), new Object[0]);
                    }
                    if (cloudMetaLocalEntity == null || !cloudMetaLocalEntity.getDeletedRemote() || cloudMetaLocalEntity.getMetaVersion() < cloudMetaRemoteEntity.getMetaVersion()) {
                        arrayList2.add(next);
                    } else {
                        StringBuilder sbOooO00o3 = C22227OoooO.OooO00o(c20358OooO00o3, "DriveCloudDS", "batchDeleteAndBuildEvents: cloud delete (", str9, ") already acknowledged for ");
                        sbOooO00o3.append(str8);
                        c20358OooO00o3.OooO0o0(sbOooO00o3.toString(), new Object[0]);
                    }
                }
                it2 = it;
                str6 = str4;
                str7 = str5;
                i3 = 0;
            }
            str2 = str6;
            str3 = str7;
            if (arrayList2.isEmpty()) {
                return new C27910OooO0oO(c34434OooOoO, c34434OooOoO);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList2) {
                CloudMetaRemoteEntity cloudMetaRemoteEntity2 = ((AbstractC27909OooO0o0.OooO00o) obj2).f98712OooO0OO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(cloudMetaRemoteEntity2);
                if (!cloudMetaRemoteEntity2.isDeleted()) {
                    arrayList4.add(obj2);
                }
            }
            if (arrayList4.isEmpty()) {
                linkedHashMap = C34436OooOoOO.f123455OooOo0o;
                abstractC27907OooOo0O = this;
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o4.OooOOO0("DriveCloudDS");
                c20358OooO00o4.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(arrayList4.size(), "batchDeleteAndBuildEvents: calling batch delete for ", " items"), new Object[0]);
                try {
                    c27916OooOoO0.f98760OooOo0o = this;
                    c27916OooOoO0.f98759OooOo = arrayList2;
                    c27916OooOoO0.f98763OooOoOO = 1;
                    objO0O0O00 = o0O0O00(str, arrayList4, c27916OooOoO0);
                } catch (Throwable th) {
                    th = th;
                    abstractC27907OooOo0O = this;
                    arrayList3 = arrayList2;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                    arrayList2 = arrayList3;
                    thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                    if (thOooO00o != null) {
                    }
                    Iterable iterable = (Iterable) obj;
                    iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable, 10));
                    if (iOooO0Oo < 16) {
                    }
                    linkedHashMap = new LinkedHashMap(iOooO0Oo);
                    while (r0.hasNext()) {
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    while (r4.hasNext()) {
                    }
                    return new C27910OooO0oO(arrayList5, arrayList6);
                }
                if (objO0O0O00 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                abstractC27907OooOo0O = this;
                arrayList3 = arrayList2;
                objOooO00o = (List) objO0O0O00;
                arrayList2 = arrayList3;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                }
                Iterable iterable2 = (Iterable) obj;
                iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable2, 10));
                if (iOooO0Oo < 16) {
                }
                linkedHashMap = new LinkedHashMap(iOooO0Oo);
                while (r0.hasNext()) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList3 = c27916OooOoO0.f98759OooOo;
            abstractC27907OooOo0O = c27916OooOoO0.f98760OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(objO0O0O00);
                str2 = "recycled";
                str3 = "snapshot missing";
                try {
                    objOooO00o = (List) objO0O0O00;
                } catch (Throwable th2) {
                    th = th2;
                    objOooO00o = C32446OooOOOo.OooO00o(th);
                }
            } catch (Throwable th3) {
                th = th3;
                str2 = "recycled";
                str3 = "snapshot missing";
                objOooO00o = C32446OooOOOo.OooO00o(th);
                arrayList2 = arrayList3;
                thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (thOooO00o != null) {
                }
                Iterable iterable22 = (Iterable) obj;
                iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable22, 10));
                if (iOooO0Oo < 16) {
                }
                linkedHashMap = new LinkedHashMap(iOooO0Oo);
                while (r0.hasNext()) {
                }
                ArrayList arrayList52 = new ArrayList();
                ArrayList arrayList62 = new ArrayList();
                while (r4.hasNext()) {
                }
                return new C27910OooO0oO(arrayList52, arrayList62);
            }
            arrayList2 = arrayList3;
            thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
            if (thOooO00o != null) {
                obj = objOooO00o;
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o5.OooOOO0("DriveCloudDS");
                c20358OooO00o5.OooO0Oo(thOooO00o, "batchDeleteAndBuildEvents: batch delete failed", new Object[0]);
                obj = c34434OooOoO;
            }
            Iterable iterable222 = (Iterable) obj;
            iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(iterable222, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (Object obj3 : iterable222) {
                linkedHashMap.put(((C26439OooO0o0) obj3).getMetaId(), obj3);
            }
        }
        ArrayList arrayList522 = new ArrayList();
        ArrayList arrayList622 = new ArrayList();
        for (AbstractC27909OooO0o0.OooO00o oooO00o2 : arrayList2) {
            CloudMetaRemoteEntity cloudMetaRemoteEntity3 = oooO00o2.f98712OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(cloudMetaRemoteEntity3);
            String str10 = oooO00o2.f98713OooO0Oo == null ? str3 : str2;
            String str11 = oooO00o2.f98710OooO00o;
            C26439OooO0o0 c26439OooO0o0 = (C26439OooO0o0) linkedHashMap.get(str11);
            if (c26439OooO0o0 == null || c26439OooO0o0.OooO0o0()) {
                CloudMetaLocalEntity cloudMetaLocalEntity2 = oooO00o2.f98711OooO0O0;
                if (cloudMetaLocalEntity2 == null) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o6 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o6.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o6, "DriveCloudDS", "batchDeleteAndBuildEvents: skip delete event for non-existing local meta ", str11), new Object[0]);
                } else {
                    if (c26439OooO0o0 != null && (meta = c26439OooO0o0.getMeta()) != null) {
                        cloudMetaRemoteEntity3 = meta;
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o7 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o7.OooOOO0("DriveCloudDS");
                    int metaVersion = cloudMetaRemoteEntity3.getMetaVersion();
                    Integer num = new Integer(cloudMetaLocalEntity2.getMetaVersion());
                    map = linkedHashMap;
                    StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("batchDeleteAndBuildEvents: cloud delete (", str10, ") detected for ", str11, ", cloud metaVersion: ");
                    sbOooO0O0.append(metaVersion);
                    sbOooO0O0.append(", local metaVersion: ");
                    sbOooO0O0.append(num);
                    c20358OooO00o7.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                    arrayList522.add(new CloudEvent.MetaEvent(oooO00o2.f98710OooO00o, cloudMetaLocalEntity2.getDeleted(), true, CloudEvent.MetaEvent.Type.CLOUD_DELETE, abstractC27907OooOo0O.f98684OooO0oO.toRemoteDomain(cloudMetaRemoteEntity3), null, 32, null));
                    linkedHashMap = map;
                }
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o8 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o8.OooOOO0("DriveCloudDS");
                String errorCode = c26439OooO0o0.getErrorCode();
                String errorMsg = c26439OooO0o0.getErrorMsg();
                StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("batchDeleteAndBuildEvents: delete failed for ", str11, ": ", errorCode, " - ");
                sbOooO0O02.append(errorMsg);
                c20358OooO00o8.OooO0OO(sbOooO0O02.toString(), new Object[0]);
                arrayList622.add(new OooO0O0(OooO0OO.f98701OooOo0o, c26439OooO0o0.getErrorCode(), c26439OooO0o0.getErrorMsg()));
            }
            map = linkedHashMap;
            linkedHashMap = map;
        }
        return new C27910OooO0oO(arrayList522, arrayList622);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooo0oO(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27915OooOoO c27915OooOoO;
        List list;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        C26443OooOOOo c26443OooOOOo;
        if (abstractC32479OooO0OO instanceof C27915OooOoO) {
            c27915OooOoO = (C27915OooOoO) abstractC32479OooO0OO;
            int i = c27915OooOoO.f98758OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27915OooOoO.f98758OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27915OooOoO = new C27915OooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object objO000OOo = c27915OooOoO.f98757OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27915OooOoO.f98758OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objO000OOo);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC27909OooO0o0.OooO0OO oooO0OO = (AbstractC27909OooO0o0.OooO0OO) it.next();
                String mimeType = oooO0OO.f98721OooO0Oo.getMimeType();
                DriveSnapshotCacheEntity driveSnapshotCacheEntity = oooO0OO.f98721OooO0Oo;
                if (mimeType == null || mimeType.length() == 0) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DriveCloudDS");
                    c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("batchMigrateAndBuildEvents: miss mimeType in snapshot ", driveSnapshotCacheEntity.getId()), new Object[0]);
                    c26443OooOOOo = null;
                } else {
                    CloudMetaExtra extra = driveSnapshotCacheEntity.getExtra();
                    CloudMetaRemoteEntity cloudMetaRemoteEntity = oooO0OO.f98720OooO0OO;
                    c26443OooOOOo = new C26443OooOOOo(oooO0OO.f98718OooO00o, cloudMetaRemoteEntity != null ? cloudMetaRemoteEntity.getMetaVersion() : 0, CloudMetaExtraKt.computeMetaHash(extra), mimeType, driveSnapshotCacheEntity.getCTag(), driveSnapshotCacheEntity.getId(), extra);
                }
                if (c26443OooOOOo != null) {
                    arrayList2.add(c26443OooOOOo);
                }
            }
            if (arrayList2.isEmpty()) {
                C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
                return new OooOO0O(c34434OooOoO, c34434OooOoO);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DriveCloudDS");
            c20358OooO00o2.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(arrayList2.size(), "batchMigrateAndBuildEvents: migrating ", " items"), new Object[0]);
            c27915OooOoO.f98755OooOo0o = this;
            list = arrayList;
            c27915OooOoO.f98754OooOo = list;
            c27915OooOoO.f98758OooOoOO = 1;
            objO000OOo = o000OOo(str, arrayList2, c27915OooOoO);
            if (objO000OOo != enumC32485OooO00o) {
                abstractC27907OooOo0O = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(objO000OOo);
            return objO000OOo;
        }
        list = c27915OooOoO.f98754OooOo;
        abstractC27907OooOo0O = c27915OooOoO.f98755OooOo0o;
        C32446OooOOOo.OooO0O0(objO000OOo);
        c27915OooOoO.f98755OooOo0o = null;
        c27915OooOoO.f98754OooOo = null;
        c27915OooOoO.f98758OooOoOO = 2;
        Object objO00O0O = abstractC27907OooOo0O.o00O0O((List) objO000OOo, list, c27915OooOoO);
        return objO00O0O == enumC32485OooO00o ? enumC32485OooO00o : objO00O0O;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final java.lang.Object Oooo0oo(java.lang.String r18, java.util.ArrayList r19, o0OOooO0.AbstractC27907OooOo0O.C27911OooO0oo r20, oO00ooo.AbstractC32479OooO0OO r21) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOooO0.AbstractC27907OooOo0O.Oooo0oo(java.lang.String, java.util.ArrayList, o0OOooO0.OooOo0O$OooO0oo, oO00ooo.OooO0OO):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        if (r8 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooO(String str, C27913OooOOOo c27913OooOOOo, C27912OooOO0o c27912OooOO0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27924Oooo000 c27924Oooo000;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        Object objOooOO0;
        OooO0o oooO0o;
        Long l;
        Object objOooO00o;
        if (abstractC32479OooO0OO instanceof C27924Oooo000) {
            c27924Oooo000 = (C27924Oooo000) abstractC32479OooO0OO;
            int i = c27924Oooo000.f98808OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27924Oooo000.f98808OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27924Oooo000 = new C27924Oooo000(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27924Oooo000.f98805OooOoO;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27924Oooo000.f98808OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            int i3 = c27912OooOO0o.f98733OooO00o;
            boolean z = c27912OooOO0o.f98734OooO0O0;
            if (i3 != 0 || z) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "DriveCloudDS", "commitCursors: skip, eventCount=");
                sbOooO0O0.append(c27912OooOO0o.f98733OooO00o);
                sbOooO0O0.append(", hadErrors=");
                sbOooO0O0.append(z);
                c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                return C32460OooOooO.f116667OooO00o;
            }
            String str2 = c27913OooOOOo.f98745OooO00o.f98989OooO0OO;
            if (str2 != null) {
                c27924Oooo000.f98804OooOo0o = this;
                c27924Oooo000.f98803OooOo = str;
                c27924Oooo000.f98806OooOoO0 = c27913OooOOOo;
                c27924Oooo000.f98808OooOoo0 = 1;
                objOooOO0 = this.f98678OooO00o.OooOO0(str2, c27924Oooo000);
                if (objOooOO0 != obj2) {
                    abstractC27907OooOo0O = this;
                }
                return obj2;
            }
            abstractC27907OooOo0O = this;
            oooO0o = c27913OooOOOo.f98746OooO0O0;
            if (!oooO0o.f98709OooO0OO && (l = oooO0o.f98708OooO0O0) != null) {
                long jLongValue = l.longValue();
                C27956o00000oo c27956o00000oo = abstractC27907OooOo0O.f98685OooO0oo;
                c27924Oooo000.f98804OooOo0o = null;
                c27924Oooo000.f98803OooOo = null;
                c27924Oooo000.f98806OooOoO0 = null;
                c27924Oooo000.f98808OooOoo0 = 2;
                c27956o00000oo.getClass();
                objOooO00o = C24332OooO.OooO00o(c27956o00000oo.f98998OooO00o, new C27955o00000oO(C24340OooO0oo.OooO0Oo("sync_cursor_" + str), jLongValue, null), c27924Oooo000);
                if (objOooO00o != obj2) {
                    objOooO00o = C32460OooOooO.f116667OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        c27913OooOOOo = c27924Oooo000.f98806OooOoO0;
        str = c27924Oooo000.f98803OooOo;
        abstractC27907OooOo0O = c27924Oooo000.f98804OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooOO0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooOO0);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DriveCloudDS");
            c20358OooO00o2.OooOO0o(thOooO00o, "commitCursors: failed to commit drive cursor", new Object[0]);
        }
        oooO0o = c27913OooOOOo.f98746OooO0O0;
        if (!oooO0o.f98709OooO0OO) {
            long jLongValue2 = l.longValue();
            C27956o00000oo c27956o00000oo2 = abstractC27907OooOo0O.f98685OooO0oo;
            c27924Oooo000.f98804OooOo0o = null;
            c27924Oooo000.f98803OooOo = null;
            c27924Oooo000.f98806OooOoO0 = null;
            c27924Oooo000.f98808OooOoo0 = 2;
            c27956o00000oo2.getClass();
            objOooO00o = C24332OooO.OooO00o(c27956o00000oo2.f98998OooO00o, new C27955o00000oO(C24340OooO0oo.OooO0Oo("sync_cursor_" + str), jLongValue2, null), c27924Oooo000);
            if (objOooO00o != obj2) {
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x012d, code lost:
    
        if (r0 == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0198, code lost:
    
        if (r0 == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c0 -> B:25:0x00c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x012d -> B:39:0x0131). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0198 -> B:54:0x019b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooO00(String str, Set set, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27919OooOoo0 c27919OooOoo0;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        Collection arrayList;
        Iterator it;
        List list;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        String str2;
        Iterator it2;
        Map map;
        Collection collection;
        String str3;
        Collection arrayList2;
        Iterator it3;
        Map map2;
        Map map3;
        String str4;
        AbstractC27907OooOo0O abstractC27907OooOo0O3;
        if (abstractC32479OooO0OO instanceof C27919OooOoo0) {
            c27919OooOoo0 = (C27919OooOoo0) abstractC32479OooO0OO;
            int i = c27919OooOoo0.f98787OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27919OooOoo0.f98787OooOooo = i - Integer.MIN_VALUE;
                abstractC27907OooOo0O = this;
            } else {
                abstractC27907OooOo0O = this;
                c27919OooOoo0 = new C27919OooOoo0(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27919OooOoo0.f98784OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27919OooOoo0.f98787OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(set);
            ArrayList arrayListOo0o0Oo = oOo000Oo.OooOo.oo0o0Oo(100, 100, listO0ooOO0);
            arrayList = new ArrayList();
            it = arrayListOo0o0Oo.iterator();
            list = listO0ooOO0;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            str2 = str;
            if (it.hasNext()) {
            }
        } else if (i2 == 1) {
            it = (Iterator) c27919OooOoo0.f98783OooOoOO;
            arrayList = (Collection) c27919OooOoo0.f98781OooOoO;
            list = (List) c27919OooOoo0.f98782OooOoO0;
            String str5 = c27919OooOoo0.f98779OooOo;
            abstractC27907OooOo0O2 = c27919OooOoo0.f98780OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            C34431OooOo0.OooOo0o(arrayList, (Iterable) objOooO0O0);
            str2 = str5;
            if (it.hasNext()) {
                List list2 = (List) it.next();
                InterfaceC35015OooOO0O interfaceC35015OooOO0O = abstractC27907OooOo0O2.f98681OooO0Oo;
                c27919OooOoo0.f98780OooOo0o = abstractC27907OooOo0O2;
                c27919OooOoo0.f98779OooOo = str2;
                c27919OooOoo0.f98782OooOoO0 = list;
                c27919OooOoo0.f98781OooOoO = arrayList;
                c27919OooOoo0.f98783OooOoOO = it;
                c27919OooOoo0.f98787OooOooo = 1;
                Object objOooO0O02 = interfaceC35015OooOO0O.OooO0O0(list2, str2, c27919OooOoo0);
                if (objOooO0O02 != enumC32485OooO00o) {
                    str5 = str2;
                    objOooO0O0 = objOooO0O02;
                    C34431OooOo0.OooOo0o(arrayList, (Iterable) objOooO0O0);
                    str2 = str5;
                    if (it.hasNext()) {
                        List list3 = (List) arrayList;
                        int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list3, 10));
                        if (iOooO0Oo < 16) {
                            iOooO0Oo = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                        for (Object obj : list3) {
                            linkedHashMap.put(((CloudMetaRemoteEntity) obj).getId(), obj);
                        }
                        ArrayList arrayListOooo00O = oOo000Oo.OooOo.Oooo00O(list, 100);
                        ArrayList arrayList3 = new ArrayList();
                        it2 = arrayListOooo00O.iterator();
                        map = linkedHashMap;
                        collection = arrayList3;
                        str3 = str2;
                        if (it2.hasNext()) {
                        }
                    }
                }
                return enumC32485OooO00o;
            }
        } else if (i2 == 2) {
            it2 = c27919OooOoo0.f98785OooOoo0;
            collection = (Collection) c27919OooOoo0.f98783OooOoOO;
            map = (Map) c27919OooOoo0.f98781OooOoO;
            list = (List) c27919OooOoo0.f98782OooOoO0;
            str3 = c27919OooOoo0.f98779OooOo;
            abstractC27907OooOo0O2 = c27919OooOoo0.f98780OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            C34431OooOo0.OooOo0o(collection, (Iterable) objOooO0O0);
            if (it2.hasNext()) {
                List list4 = (List) collection;
                int iOooO0Oo2 = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list4, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iOooO0Oo2 >= 16 ? iOooO0Oo2 : 16);
                for (Object obj2 : list4) {
                    linkedHashMap2.put(((CloudMetaLocalEntity) obj2).getId(), obj2);
                }
                ArrayList arrayListOooo00O2 = oOo000Oo.OooOo.Oooo00O(list, 100);
                arrayList2 = new ArrayList();
                it3 = arrayListOooo00O2.iterator();
                map2 = linkedHashMap2;
                map3 = map;
                str4 = str3;
                abstractC27907OooOo0O3 = abstractC27907OooOo0O2;
                if (it3.hasNext()) {
                }
            } else {
                List list5 = (List) it2.next();
                InterfaceC35006OooO00o interfaceC35006OooO00o = abstractC27907OooOo0O2.f98680OooO0OO;
                c27919OooOoo0.f98780OooOo0o = abstractC27907OooOo0O2;
                c27919OooOoo0.f98779OooOo = str3;
                c27919OooOoo0.f98782OooOoO0 = list;
                c27919OooOoo0.f98781OooOoO = map;
                c27919OooOoo0.f98783OooOoOO = collection;
                c27919OooOoo0.f98785OooOoo0 = it2;
                c27919OooOoo0.f98787OooOooo = 2;
                objOooO0O0 = interfaceC35006OooO00o.OooO0O0(list5, str3, c27919OooOoo0);
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it3 = c27919OooOoo0.f98785OooOoo0;
            arrayList2 = (Collection) c27919OooOoo0.f98783OooOoOO;
            map2 = (Map) c27919OooOoo0.f98781OooOoO;
            map3 = (Map) c27919OooOoo0.f98782OooOoO0;
            str4 = c27919OooOoo0.f98779OooOo;
            abstractC27907OooOo0O3 = c27919OooOoo0.f98780OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            C34431OooOo0.OooOo0o(arrayList2, (Iterable) objOooO0O0);
            if (it3.hasNext()) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (DriveSnapshotCacheEntity driveSnapshotCacheEntity : (List) arrayList2) {
                    String cloudMetaId = driveSnapshotCacheEntity.getCloudMetaId();
                    if (cloudMetaId != null) {
                        CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) map3.get(cloudMetaId);
                        if (cloudMetaRemoteEntity != null && kotlin.jvm.internal.OooOOO0.OooO0O0(cloudMetaRemoteEntity.getDriveObjectKey(), driveSnapshotCacheEntity.getId())) {
                            linkedHashMap3.put(cloudMetaId, driveSnapshotCacheEntity);
                        } else if (cloudMetaRemoteEntity == null) {
                            linkedHashMap3.put(cloudMetaId, driveSnapshotCacheEntity);
                        } else {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("DriveCloudDS");
                            c20358OooO00o.OooO00o(androidx.concurrent.futures.OooO00o.OooO0OO(com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("buildLookupMaps: skip drive file ", driveSnapshotCacheEntity.getId(), " for ", cloudMetaId, ", driveObjectKey mismatch (expected: "), cloudMetaRemoteEntity.getDriveObjectKey(), ")"), new Object[0]);
                        }
                    }
                }
                return new OooO(map2, map3, linkedHashMap3);
            }
            List list6 = (List) it3.next();
            InterfaceC35021OooOOo interfaceC35021OooOOo = abstractC27907OooOo0O3.f98683OooO0o0;
            c27919OooOoo0.f98780OooOo0o = abstractC27907OooOo0O3;
            c27919OooOoo0.f98779OooOo = str4;
            c27919OooOoo0.f98782OooOoO0 = map3;
            c27919OooOoo0.f98781OooOoO = map2;
            c27919OooOoo0.f98783OooOoOO = arrayList2;
            c27919OooOoo0.f98785OooOoo0 = it3;
            c27919OooOoo0.f98787OooOooo = 3;
            objOooO0O0 = interfaceC35021OooOOo.OooO(list6, str4, c27919OooOoo0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
    
        if (r8 == r1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x0029, B:57:0x00d5, B:20:0x0045, B:46:0x00af, B:49:0x00b5, B:51:0x00b9, B:54:0x00c0, B:58:0x00dc, B:38:0x008a, B:40:0x008e, B:42:0x009b, B:59:0x00dd), top: B:65:0x0021, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:13:0x0029, B:57:0x00d5, B:20:0x0045, B:46:0x00af, B:49:0x00b5, B:51:0x00b9, B:54:0x00c0, B:58:0x00dc, B:38:0x008a, B:40:0x008e, B:42:0x009b, B:59:0x00dd), top: B:65:0x0021, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOO0(String str, String str2, CloudMetaRemoteEntity cloudMetaRemoteEntity, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27926Oooo00o c27926Oooo00o;
        Object objOooO00o;
        String str3;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        Object obj;
        Object objOoooOoO;
        String str4;
        Throwable th;
        CloudMetaRemoteEntity cloudMetaRemoteEntity2;
        Object objOoooOOO;
        if (abstractC32479OooO0OO instanceof C27926Oooo00o) {
            c27926Oooo00o = (C27926Oooo00o) abstractC32479OooO0OO;
            int i = c27926Oooo00o.f98819OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27926Oooo00o.f98819OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27926Oooo00o = new C27926Oooo00o(this, abstractC32479OooO0OO);
            }
        }
        Object obj2 = c27926Oooo00o.f98818OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27926Oooo00o.f98819OooOoo;
        try {
            try {
            } catch (Throwable th2) {
                objOooO00o = C32446OooOOOo.OooO00o(th2);
            }
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                if (cloudMetaRemoteEntity.isDeleted()) {
                    return cloudMetaRemoteEntity;
                }
                int metaVersion = cloudMetaRemoteEntity.getMetaVersion();
                c27926Oooo00o.f98815OooOo0o = str;
                c27926Oooo00o.f98814OooOo = str2;
                c27926Oooo00o.f98817OooOoO0 = this;
                c27926Oooo00o.f98819OooOoo = 1;
                Object objOoooOOO2 = OoooOOO(this, str, str2, metaVersion, c27926Oooo00o);
                if (objOoooOOO2 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str3 = str2;
                abstractC27907OooOo0O = this;
                obj = objOoooOOO2;
            } else if (i2 == 1) {
                AbstractC27907OooOo0O abstractC27907OooOo0O2 = c27926Oooo00o.f98817OooOoO0;
                String str5 = c27926Oooo00o.f98814OooOo;
                String str6 = c27926Oooo00o.f98815OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                abstractC27907OooOo0O = abstractC27907OooOo0O2;
                str = str6;
                str3 = str5;
                obj = ((C32445OooOOOO) obj2).f116639OooOo0o;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                    objOoooOOO = ((C32445OooOOOO) obj2).f116639OooOo0o;
                    C32446OooOOOo.OooO0O0(objOoooOOO);
                    objOooO00o = (CloudMetaRemoteEntity) objOoooOOO;
                    C32446OooOOOo.OooO0O0(objOooO00o);
                    return (CloudMetaRemoteEntity) objOooO00o;
                }
                th = c27926Oooo00o.f98816OooOoO;
                abstractC27907OooOo0O = c27926Oooo00o.f98817OooOoO0;
                str3 = c27926Oooo00o.f98814OooOo;
                str4 = c27926Oooo00o.f98815OooOo0o;
                C32446OooOOOo.OooO0O0(obj2);
                objOoooOoO = ((C32445OooOOOO) obj2).f116639OooOo0o;
                if (objOoooOoO instanceof C32445OooOOOO.OooO00o) {
                    objOoooOoO = null;
                }
                cloudMetaRemoteEntity2 = (CloudMetaRemoteEntity) objOoooOoO;
                if (cloudMetaRemoteEntity2 != null) {
                    throw th;
                }
                if (cloudMetaRemoteEntity2.isDeleted()) {
                    objOooO00o = cloudMetaRemoteEntity2;
                    C32446OooOOOo.OooO0O0(objOooO00o);
                    return (CloudMetaRemoteEntity) objOooO00o;
                }
                int metaVersion2 = cloudMetaRemoteEntity2.getMetaVersion();
                c27926Oooo00o.f98815OooOo0o = null;
                c27926Oooo00o.f98814OooOo = null;
                c27926Oooo00o.f98817OooOoO0 = null;
                c27926Oooo00o.f98816OooOoO = null;
                c27926Oooo00o.f98819OooOoo = 3;
                objOoooOOO = OoooOOO(abstractC27907OooOo0O, str4, str3, metaVersion2, c27926Oooo00o);
            }
            Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
            objOooO00o = obj;
            if (thOooO00o != null) {
                if (!(thOooO00o instanceof o0OO000.OooOO0) || !kotlin.jvm.internal.OooOOO0.OooO0O0(((o0OO000.OooOO0) thOooO00o).f90831OooOo0o, "1006")) {
                    throw thOooO00o;
                }
                c27926Oooo00o.f98815OooOo0o = str;
                c27926Oooo00o.f98814OooOo = str3;
                c27926Oooo00o.f98817OooOoO0 = abstractC27907OooOo0O;
                c27926Oooo00o.f98816OooOoO = thOooO00o;
                c27926Oooo00o.f98819OooOoo = 2;
                objOoooOoO = abstractC27907OooOo0O.OoooOoO(str, str3, c27926Oooo00o);
                if (objOoooOoO == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                str4 = str;
                th = thOooO00o;
                if (objOoooOoO instanceof C32445OooOOOO.OooO00o) {
                }
                cloudMetaRemoteEntity2 = (CloudMetaRemoteEntity) objOoooOoO;
                if (cloudMetaRemoteEntity2 != null) {
                }
            }
            C32446OooOOOo.OooO0O0(objOooO00o);
            return (CloudMetaRemoteEntity) objOooO00o;
        } catch (Throwable th3) {
            return C32446OooOOOo.OooO00o(th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable OoooOo0(ArrayList arrayList, C27911OooO0oo c27911OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27929Oooo0o c27929Oooo0o;
        Object objOooOO0O;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        List list;
        C27911OooO0oo c27911OooO0oo2;
        long j;
        if (abstractC32479OooO0OO instanceof C27929Oooo0o) {
            c27929Oooo0o = (C27929Oooo0o) abstractC32479OooO0OO;
            int i = c27929Oooo0o.f98838OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27929Oooo0o.f98838OooOoo = i - Integer.MIN_VALUE;
            } else {
                c27929Oooo0o = new C27929Oooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27929Oooo0o.f98837OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27929Oooo0o.f98838OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            c27929Oooo0o.f98834OooOo0o = this;
            c27929Oooo0o.f98833OooOo = arrayList;
            c27929Oooo0o.f98836OooOoO0 = c27911OooO0oo;
            c27929Oooo0o.f98835OooOoO = jCurrentTimeMillis;
            c27929Oooo0o.f98838OooOoo = 1;
            objOooOO0O = this.f98678OooO00o.OooOO0O(c27929Oooo0o);
            if (objOooOO0O == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            abstractC27907OooOo0O = this;
            list = arrayList;
            c27911OooO0oo2 = c27911OooO0oo;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c27929Oooo0o.f98835OooOoO;
            c27911OooO0oo2 = c27929Oooo0o.f98836OooOoO0;
            list = c27929Oooo0o.f98833OooOo;
            abstractC27907OooOo0O = c27929Oooo0o.f98834OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooOO0O = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        if (objOooOO0O instanceof C32445OooOOOO.OooO00o) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooOO0o(C32445OooOOOO.OooO00o(objOooOO0O), "validateDriveFilesExist: fetchAllExistedFileIds failed (" + jCurrentTimeMillis2 + "ms), disabling backend, assuming all " + list.size() + " files exist", new Object[0]);
            c27911OooO0oo2.f98726OooO0OO = true;
            return new C32443OooOOO(list, C34434OooOoO.f123453OooOo0o);
        }
        C32446OooOOOo.OooO0O0(objOooOO0O);
        Set<String> ids = (Set) objOooOO0O;
        c27911OooO0oo2.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(ids, "ids");
        c27911OooO0oo2.f98724OooO00o = ids;
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("DriveCloudDS");
        c20358OooO00o2.OooO00o("validateDriveFilesExist: fetched " + ids.size() + " file IDs in " + jCurrentTimeMillis2 + TranslateLanguage.MALAY, new Object[0]);
        abstractC27907OooOo0O.getClass();
        return o00000(list, c27911OooO0oo2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o0OOooO0.OooOo0O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OoooOoO(String str, String str2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27931Oooo0oO c27931Oooo0oO;
        Object objOooO00o;
        ?? r7;
        boolean z;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        if (abstractC32479OooO0OO instanceof C27931Oooo0oO) {
            c27931Oooo0oO = (C27931Oooo0oO) abstractC32479OooO0OO;
            int i = c27931Oooo0oO.f98847OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27931Oooo0oO.f98847OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c27931Oooo0oO = new C27931Oooo0oO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooOOO = c27931Oooo0oO.f98846OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27931Oooo0oO.f98847OooOoOO;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooOOO);
            try {
                InterfaceC26441OooO0oo interfaceC26441OooO0oo = this.f98682OooO0o;
                c27931Oooo0oO.f98844OooOo0o = this;
                c27931Oooo0oO.f98843OooOo = str2;
                c27931Oooo0oO.f98847OooOoOO = 1;
                objOooOOO = interfaceC26441OooO0oo.OooOOO(str, str2, c27931Oooo0oO);
                if (objOooOOO != enumC32485OooO00o) {
                    abstractC27907OooOo0O = this;
                }
            } catch (Throwable th2) {
                th = th2;
                str = this;
                objOooO00o = C32446OooOOOo.OooO00o(th);
                r7 = str;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) c27931Oooo0oO.f98844OooOo0o;
                C32446OooOOOo.OooO0O0(objOooOOO);
                return cloudMetaRemoteEntity;
            }
            str2 = c27931Oooo0oO.f98843OooOo;
            AbstractC27907OooOo0O abstractC27907OooOo0O2 = (AbstractC27907OooOo0O) c27931Oooo0oO.f98844OooOo0o;
            C32446OooOOOo.OooO0O0(objOooOOO);
            str = abstractC27907OooOo0O2;
            objOooO00o = ((C26446OooOOoo) objOooOOO).getItem();
            r7 = str;
            z = objOooO00o instanceof C32445OooOOOO.OooO00o;
            if (z) {
                if (z) {
                    objOooO00o = null;
                }
                CloudMetaRemoteEntity cloudMetaRemoteEntity2 = (CloudMetaRemoteEntity) objOooO00o;
                if (cloudMetaRemoteEntity2 != null && cloudMetaRemoteEntity2.getMetaVersion() != 0) {
                    c27931Oooo0oO.f98844OooOo0o = cloudMetaRemoteEntity2;
                    c27931Oooo0oO.f98843OooOo = null;
                    c27931Oooo0oO.f98847OooOoOO = 3;
                    return r7.f98681OooO0Oo.OooO0OO(new CloudMetaRemoteEntity[]{cloudMetaRemoteEntity2}, c27931Oooo0oO) == enumC32485OooO00o ? enumC32485OooO00o : cloudMetaRemoteEntity2;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("DriveCloudDS");
                c20358OooO00o.OooO0OO("fetchCloudMeta: invalid meta fetched for noteId=%s metaVersion=%s deleted=%s driveId=%s driveObjectKey=%s, skipping upsert", str2, cloudMetaRemoteEntity2 != null ? new Integer(cloudMetaRemoteEntity2.getMetaVersion()) : null, cloudMetaRemoteEntity2 != null ? new Long(cloudMetaRemoteEntity2.getDeleted()) : null, cloudMetaRemoteEntity2 != null ? cloudMetaRemoteEntity2.getDriveId() : null, cloudMetaRemoteEntity2 != null ? cloudMetaRemoteEntity2.getDriveObjectKey() : null);
            } else {
                Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
                if (!(thOooO00o instanceof o0OO000.OooOO0) || !kotlin.jvm.internal.OooOOO0.OooO0O0(((o0OO000.OooOO0) thOooO00o).f90831OooOo0o, "1005")) {
                    return objOooO00o;
                }
            }
            return null;
        }
        str2 = c27931Oooo0oO.f98843OooOo;
        AbstractC27907OooOo0O abstractC27907OooOo0O3 = (AbstractC27907OooOo0O) c27931Oooo0oO.f98844OooOo0o;
        C32446OooOOOo.OooO0O0(objOooOOO);
        abstractC27907OooOo0O = abstractC27907OooOo0O3;
        c27931Oooo0oO.f98844OooOo0o = abstractC27907OooOo0O;
        c27931Oooo0oO.f98843OooOo = str2;
        c27931Oooo0oO.f98847OooOoOO = 2;
        objOooOOO = C33074OooOoO.OooO0o((C35238OooOoO) objOooOOO, "fetchCloudMeta");
        str = abstractC27907OooOo0O;
        if (objOooOOO == enumC32485OooO00o) {
        }
        objOooO00o = ((C26446OooOOoo) objOooOOO).getItem();
        r7 = str;
        z = objOooO00o instanceof C32445OooOOOO.OooO00o;
        if (z) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ooooo0o(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27935OoooO00 c27935OoooO00;
        Object objOooOOo0;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        if (abstractC32479OooO0OO instanceof C27935OoooO00) {
            c27935OoooO00 = (C27935OoooO00) abstractC32479OooO0OO;
            int i = c27935OoooO00.f98871OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27935OoooO00.f98871OooOoO = i - Integer.MIN_VALUE;
            } else {
                c27935OoooO00 = new C27935OoooO00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27935OoooO00.f98869OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27935OoooO00.f98871OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c27935OoooO00.f98870OooOo0o = this;
            c27935OoooO00.f98871OooOoO = 1;
            objOooOOo0 = this.f98678OooO00o.OooOOo0(str, c27935OoooO00);
            if (objOooOOo0 != enumC32485OooO00o) {
                abstractC27907OooOo0O = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DriveSnapshotCacheEntity driveSnapshotCacheEntity = (DriveSnapshotCacheEntity) c27935OoooO00.f98870OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            return driveSnapshotCacheEntity;
        }
        abstractC27907OooOo0O = (AbstractC27907OooOo0O) c27935OoooO00.f98870OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooOOo0 = ((C32445OooOOOO) obj).f116639OooOo0o;
        boolean z = objOooOOo0 instanceof C32445OooOOOO.OooO00o;
        if (z) {
            return objOooOOo0;
        }
        if (z) {
            objOooOOo0 = null;
        }
        DriveSnapshotCacheEntity driveSnapshotCacheEntity2 = (DriveSnapshotCacheEntity) objOooOOo0;
        if (driveSnapshotCacheEntity2 == null) {
            return C32446OooOOOo.OooO00o(new IllegalStateException("Snapshot is null but result is success"));
        }
        c27935OoooO00.f98870OooOo0o = driveSnapshotCacheEntity2;
        c27935OoooO00.f98871OooOoO = 2;
        return abstractC27907OooOo0O.f98683OooO0o0.OooO0o(new DriveSnapshotCacheEntity[]{driveSnapshotCacheEntity2}, c27935OoooO00) == enumC32485OooO00o ? enumC32485OooO00o : driveSnapshotCacheEntity2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0168, code lost:
    
        if (r2 == r4) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ab A[LOOP:0: B:48:0x01a5->B:50:0x01ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020a A[LOOP:1: B:52:0x0204->B:54:0x020a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0168 -> B:40:0x016b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Oooooo0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27937OoooOO0 c27937OoooOO0;
        Set linkedHashSet;
        Object objO0ooOO0;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        o00000O0 o00000o02;
        String str2;
        String str3;
        Set set;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        o00000O0 o00000o03;
        Collection arrayList;
        Iterator it;
        Object objO00oO0O;
        Set set2;
        o00000O0 o00000o04;
        Iterator<T> it2;
        String str4 = str;
        if (abstractC32479OooO0OO instanceof C27937OoooOO0) {
            c27937OoooOO0 = (C27937OoooOO0) abstractC32479OooO0OO;
            int i = c27937OoooOO0.f98888OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27937OoooOO0.f98888OooOooo = i - Integer.MIN_VALUE;
            } else {
                c27937OoooOO0 = new C27937OoooOO0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = c27937OoooOO0.f98885OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27937OoooOO0.f98888OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0O0);
            linkedHashSet = new LinkedHashSet();
            c27937OoooOO0.f98881OooOo0o = this;
            c27937OoooOO0.f98880OooOo = str4;
            c27937OoooOO0.f98883OooOoO0 = linkedHashSet;
            c27937OoooOO0.f98888OooOooo = 1;
            objO0ooOO0 = o0ooOO0(str4, c27937OoooOO0);
            if (objO0ooOO0 != enumC32485OooO00o) {
                abstractC27907OooOo0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            Set set3 = c27937OoooOO0.f98883OooOoO0;
            String str5 = (String) c27937OoooOO0.f98880OooOo;
            abstractC27907OooOo0O = (AbstractC27907OooOo0O) c27937OoooOO0.f98881OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            linkedHashSet = set3;
            str4 = str5;
            objO0ooOO0 = objOooO0O0;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00000o04 = (o00000O0) c27937OoooOO0.f98880OooOo;
                set2 = (Set) c27937OoooOO0.f98881OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0O0);
                OooO0o oooO0o = (OooO0o) objOooO0O0;
                for (CloudMetaRemoteEntity cloudMetaRemoteEntity : oooO0o.f98707OooO00o) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DriveCloudDS");
                    String id = cloudMetaRemoteEntity.getId();
                    String driveObjectKey = cloudMetaRemoteEntity.getDriveObjectKey();
                    int metaVersion = cloudMetaRemoteEntity.getMetaVersion();
                    CloudContentTag contentTag = cloudMetaRemoteEntity.getContentTag();
                    long deleted = cloudMetaRemoteEntity.getDeleted();
                    StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("fetchRemoteData: cloud meta id=", id, ", driveObjectKey=", driveObjectKey, ", metaVersion=");
                    sbOooO0O0.append(metaVersion);
                    sbOooO0O0.append(", cTag=");
                    sbOooO0O0.append(contentTag);
                    sbOooO0O0.append(", deleted=");
                    sbOooO0O0.append(deleted);
                    c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
                }
                List<CloudMetaRemoteEntity> list = oooO0o.f98707OooO00o;
                List<CloudMetaRemoteEntity> list2 = list;
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((CloudMetaRemoteEntity) it2.next()).getId());
                }
                set2.addAll(arrayList2);
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("DriveCloudDS");
                c20358OooO00o2.OooO0o0(C21023OooO0Oo.OooO0OO(" unique metaIds", set2.size(), C20398OooO0O0.OooO0O0("fetchRemoteData: fetched ", o00000o04.f98987OooO00o.size(), " drive files, ", " cloud metas, total ", list.size())), new Object[0]);
                return new C27913OooOOOo(o00000o04, oooO0o, set2);
            }
            it = c27937OoooOO0.f98886OooOoo0;
            arrayList = c27937OoooOO0.f98884OooOoOO;
            o00000o03 = c27937OoooOO0.f98882OooOoO;
            set = c27937OoooOO0.f98883OooOoO0;
            str3 = (String) c27937OoooOO0.f98880OooOo;
            abstractC27907OooOo0O2 = (AbstractC27907OooOo0O) c27937OoooOO0.f98881OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0O0);
            C34431OooOo0.OooOo0o(arrayList, (Iterable) objOooO0O0);
            if (it.hasNext()) {
                set.addAll((List) arrayList);
                o00000o02 = o00000o03;
                linkedHashSet = set;
                str2 = str3;
                abstractC27907OooOo0O = abstractC27907OooOo0O2;
                c27937OoooOO0.f98881OooOo0o = linkedHashSet;
                c27937OoooOO0.f98880OooOo = o00000o02;
                c27937OoooOO0.f98883OooOoO0 = null;
                c27937OoooOO0.f98882OooOoO = null;
                c27937OoooOO0.f98884OooOoOO = null;
                c27937OoooOO0.f98886OooOoo0 = null;
                c27937OoooOO0.f98888OooOooo = 3;
                objO00oO0O = abstractC27907OooOo0O.o00oO0O(str2, c27937OoooOO0);
                if (objO00oO0O != enumC32485OooO00o) {
                    set2 = linkedHashSet;
                    o00000o04 = o00000o02;
                    objOooO0O0 = objO00oO0O;
                    OooO0o oooO0o2 = (OooO0o) objOooO0O0;
                    while (r0.hasNext()) {
                    }
                    List<CloudMetaRemoteEntity> list3 = oooO0o2.f98707OooO00o;
                    List<CloudMetaRemoteEntity> list22 = list3;
                    ArrayList arrayList22 = new ArrayList(C34428OooOOo.OooOOoo(list22, 10));
                    it2 = list22.iterator();
                    while (it2.hasNext()) {
                    }
                    set2.addAll(arrayList22);
                    C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o22.OooOOO0("DriveCloudDS");
                    c20358OooO00o22.OooO0o0(C21023OooO0Oo.OooO0OO(" unique metaIds", set2.size(), C20398OooO0O0.OooO0O0("fetchRemoteData: fetched ", o00000o04.f98987OooO00o.size(), " drive files, ", " cloud metas, total ", list3.size())), new Object[0]);
                    return new C27913OooOOOo(o00000o04, oooO0o2, set2);
                }
                return enumC32485OooO00o;
            }
            List list4 = (List) it.next();
            InterfaceC35021OooOOo interfaceC35021OooOOo = abstractC27907OooOo0O2.f98683OooO0o0;
            c27937OoooOO0.f98881OooOo0o = abstractC27907OooOo0O2;
            c27937OoooOO0.f98880OooOo = str3;
            c27937OoooOO0.f98883OooOoO0 = set;
            c27937OoooOO0.f98882OooOoO = o00000o03;
            c27937OoooOO0.f98884OooOoOO = arrayList;
            c27937OoooOO0.f98886OooOoo0 = it;
            c27937OoooOO0.f98888OooOooo = 2;
            objOooO0O0 = interfaceC35021OooOOo.OooO0O0(list4, str3, c27937OoooOO0);
        }
        o00000o02 = (o00000O0) objO0ooOO0;
        for (DriveSnapshotCacheEntity driveSnapshotCacheEntity : o00000o02.f98987OooO00o) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("DriveCloudDS");
            String id2 = driveSnapshotCacheEntity.getId();
            String cloudMetaId = driveSnapshotCacheEntity.getCloudMetaId();
            CloudContentTag cTag = driveSnapshotCacheEntity.getCTag();
            boolean recycled = driveSnapshotCacheEntity.getRecycled();
            long editedTimeMillis = driveSnapshotCacheEntity.getEditedTimeMillis();
            C27937OoooOO0 c27937OoooOO02 = c27937OoooOO0;
            StringBuilder sbOooO0O02 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("fetchRemoteData: drive file id=", id2, ", metaId=", cloudMetaId, ", cTag=");
            sbOooO0O02.append(cTag);
            sbOooO0O02.append(", recycled=");
            sbOooO0O02.append(recycled);
            sbOooO0O02.append(" lastModified=");
            sbOooO0O02.append(editedTimeMillis);
            c20358OooO00o3.OooO00o(sbOooO0O02.toString(), new Object[0]);
            str4 = str4;
            c27937OoooOO0 = c27937OoooOO02;
        }
        String str6 = str4;
        C27937OoooOO0 c27937OoooOO03 = c27937OoooOO0;
        List<DriveSnapshotCacheEntity> list5 = o00000o02.f98987OooO00o;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = list5.iterator();
        while (it3.hasNext()) {
            String cloudMetaId2 = ((DriveSnapshotCacheEntity) it3.next()).getCloudMetaId();
            if (cloudMetaId2 != null) {
                arrayList3.add(cloudMetaId2);
            }
        }
        linkedHashSet.addAll(arrayList3);
        List<String> list6 = o00000o02.f98988OooO0O0;
        if (list6.isEmpty()) {
            str2 = str6;
            c27937OoooOO0 = c27937OoooOO03;
            c27937OoooOO0.f98881OooOo0o = linkedHashSet;
            c27937OoooOO0.f98880OooOo = o00000o02;
            c27937OoooOO0.f98883OooOoO0 = null;
            c27937OoooOO0.f98882OooOoO = null;
            c27937OoooOO0.f98884OooOoOO = null;
            c27937OoooOO0.f98886OooOoo0 = null;
            c27937OoooOO0.f98888OooOooo = 3;
            objO00oO0O = abstractC27907OooOo0O.o00oO0O(str2, c27937OoooOO0);
            if (objO00oO0O != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        ArrayList arrayListOooo00O = oOo000Oo.OooOo.Oooo00O(list6, 100);
        str3 = str6;
        set = linkedHashSet;
        abstractC27907OooOo0O2 = abstractC27907OooOo0O;
        c27937OoooOO0 = c27937OoooOO03;
        o00000o03 = o00000o02;
        arrayList = new ArrayList();
        it = arrayListOooo00O.iterator();
        if (it.hasNext()) {
        }
    }

    @Override // o0OO0OoO.OooO00o
    public EnumC27285OooO getType() {
        return this.f98688OooOO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o000000(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo0o0Oo oo0o0oo;
        Object objO00000O;
        if (abstractC32479OooO0OO instanceof oo0o0Oo) {
            oo0o0oo = (oo0o0Oo) abstractC32479OooO0OO;
            int i = oo0o0oo.f99135OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0o0oo.f99135OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oo0o0oo = new oo0o0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = oo0o0oo.f99134OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo0o0oo.f99135OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC32508OooOOOo o0o0o00 = new o0O0O00(arrayList, this, null);
            oo0o0oo.f99135OooOoO0 = 1;
            objO00000O = o00000O(str, o0o0o00, oo0o0oo);
            if (objO00000O == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objO00000O = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objO00000O);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooO0Oo(thOooO00o, "batchReconcileAndBuildEvents: batch reconcile failed", new Object[0]);
        }
        C32446OooOOOo.OooO0O0(objO00000O);
        return objO00000O;
    }

    public final Object o000000O(CloudMetaRemoteEntity cloudMetaRemoteEntity, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objO000000o = o000000o(com.facebook.soloader.OooOo.OooO0oO(cloudMetaRemoteEntity), abstractC32479OooO0OO);
        return objO000000o == EnumC32485OooO00o.f116726OooOo0o ? objO000000o : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o000000o(List list, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000000 o000000Var;
        Object objOooO;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        Iterator it;
        List list2 = list;
        if (abstractC32479OooO0OO instanceof o000000) {
            o000000Var = (o000000) abstractC32479OooO0OO;
            int i = o000000Var.f98970OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000000Var.f98970OooOoOO = i - Integer.MIN_VALUE;
            } else {
                o000000Var = new o000000(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o000000Var.f98969OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000000Var.f98970OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (list2.isEmpty()) {
                return C32460OooOooO.f116667OooO00o;
            }
            List list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (((CloudMetaRemoteEntity) it2.next()).getDriveId().length() == 0) {
                        o000000Var.f98967OooOo0o = this;
                        o000000Var.f98966OooOo = list2;
                        o000000Var.f98970OooOoOO = 1;
                        objOooO = this.f98678OooO00o.OooO(o000000Var);
                        if (objOooO != enumC32485OooO00o) {
                            abstractC27907OooOo0O = this;
                        }
                        return enumC32485OooO00o;
                    }
                }
            }
            abstractC27907OooOo0O = this;
            it = oOo000Oo.OooOo.oo0o0Oo(100, 100, list2).iterator();
            while (it.hasNext()) {
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) o000000Var.f98966OooOo;
            abstractC27907OooOo0O = o000000Var.f98967OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            while (it.hasNext()) {
                List list4 = (List) it.next();
                InterfaceC35015OooOO0O interfaceC35015OooOO0O = abstractC27907OooOo0O.f98681OooO0Oo;
                CloudMetaRemoteEntity[] cloudMetaRemoteEntityArr = (CloudMetaRemoteEntity[]) list4.toArray(new CloudMetaRemoteEntity[0]);
                CloudMetaRemoteEntity[] cloudMetaRemoteEntityArr2 = (CloudMetaRemoteEntity[]) Arrays.copyOf(cloudMetaRemoteEntityArr, cloudMetaRemoteEntityArr.length);
                o000000Var.f98967OooOo0o = abstractC27907OooOo0O;
                o000000Var.f98966OooOo = it;
                o000000Var.f98970OooOoOO = 2;
                if (interfaceC35015OooOO0O.OooO0OO(cloudMetaRemoteEntityArr2, o000000Var) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
        list2 = (List) o000000Var.f98966OooOo;
        abstractC27907OooOo0O = o000000Var.f98967OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO = ((C32445OooOOOO) obj).f116639OooOo0o;
        C32446OooOOOo.OooO0O0(objOooO);
        String str = (String) objOooO;
        List<CloudMetaRemoteEntity> list5 = list2;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
        for (CloudMetaRemoteEntity cloudMetaRemoteEntityCopy$default : list5) {
            if (cloudMetaRemoteEntityCopy$default.getDriveId().length() == 0) {
                cloudMetaRemoteEntityCopy$default = CloudMetaRemoteEntity.copy$default(cloudMetaRemoteEntityCopy$default, null, str, null, 0, null, null, 0L, null, 0L, null, PointerIconCompat.TYPE_GRABBING, null);
            }
            arrayList.add(cloudMetaRemoteEntityCopy$default);
        }
        list2 = arrayList;
        it = oOo000Oo.OooOo.oo0o0Oo(100, 100, list2).iterator();
        while (it.hasNext()) {
        }
        return C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00000O(String str, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27952o000000o c27952o000000o;
        if (abstractC32479OooO0OO instanceof C27952o000000o) {
            c27952o000000o = (C27952o000000o) abstractC32479OooO0OO;
            int i = c27952o000000o.f98984OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27952o000000o.f98984OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27952o000000o = new C27952o000000o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27952o000000o.f98983OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27952o000000o.f98984OooOoO0;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27883OooO00o c27883OooO00o = (C27883OooO00o) this.f98687OooOO0O.getValue();
        c27952o000000o.f98984OooOoO0 = 1;
        Object objOooOOO0 = c27883OooO00o.OooOOO0(str, interfaceC32508OooOOOo, c27952o000000o);
        return objOooOOO0 == enumC32485OooO00o ? enumC32485OooO00o : objOooOOO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a3 -> B:21:0x00a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable o00000O0(ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o000000O o000000o2;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        long jCurrentTimeMillis;
        List list;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        List list2;
        Iterator it;
        List list3;
        o000000O o000000o3;
        if (abstractC32479OooO0OO instanceof o000000O) {
            o000000o2 = (o000000O) abstractC32479OooO0OO;
            int i = o000000o2.f98981Oooo00O;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000000o2.f98981Oooo00O = i - Integer.MIN_VALUE;
                abstractC27907OooOo0O = this;
            } else {
                abstractC27907OooOo0O = this;
                o000000o2 = new o000000O(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = o000000o2.f98979OooOooo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o000000o2.f98981Oooo00O;
        int i3 = 1;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            jCurrentTimeMillis = System.currentTimeMillis();
            list = arrayList2;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            list2 = arrayList3;
            it = arrayList.iterator();
            list3 = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = o000000o2.f98978OooOooO;
            String id = o000000o2.f98976OooOoo;
            AbstractC27909OooO0o0.OooO0OO oooO0OO = o000000o2.f98977OooOoo0;
            it = o000000o2.f98975OooOoOO;
            list2 = o000000o2.f98973OooOoO;
            list = o000000o2.f98974OooOoO0;
            List list4 = o000000o2.f98971OooOo;
            abstractC27907OooOo0O2 = o000000o2.f98972OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            Object obj2 = ((C32445OooOOOO) obj).f116639OooOo0o;
            if (obj2 instanceof C32445OooOOOO.OooO00o) {
                o000000o3 = o000000o2;
                C32446OooOOOo.OooO0O0(obj2);
                if (((Boolean) obj2).booleanValue()) {
                    list.add(oooO0OO);
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DriveCloudDS");
                    c20358OooO00o.OooO0o0(C22237OooO0o0.OooO00o("validateDriveFilesExist: DriveFile ", id, " not found, will delete metaId=", oooO0OO.f98718OooO00o), new Object[0]);
                    list2.add(oooO0OO);
                }
            } else {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("DriveCloudDS");
                o000000o3 = o000000o2;
                c20358OooO00o2.OooOO0o(C32445OooOOOO.OooO00o(obj2), C20593OooO0Oo.OooO0O0("validateDriveFilesExist: checkIfFileExists failed for ", id, ", assuming exists"), new Object[0]);
                list.add(oooO0OO);
            }
            o000000o2 = o000000o3;
            list3 = list4;
            i3 = 1;
            if (it.hasNext()) {
                oooO0OO = (AbstractC27909OooO0o0.OooO0OO) it.next();
                id = oooO0OO.f98721OooO0Oo.getId();
                o00000 o00000Var = abstractC27907OooOo0O2.f98678OooO00o;
                o000000o2.f98972OooOo0o = abstractC27907OooOo0O2;
                o000000o2.f98971OooOo = list3;
                o000000o2.f98974OooOoO0 = list;
                o000000o2.f98973OooOoO = list2;
                o000000o2.f98975OooOoOO = it;
                o000000o2.f98977OooOoo0 = oooO0OO;
                o000000o2.f98976OooOoo = id;
                o000000o2.f98978OooOooO = jCurrentTimeMillis;
                o000000o2.f98981Oooo00O = i3;
                Serializable serializableOooO0o0 = o00000Var.OooO0o0(id, o000000o2);
                if (serializableOooO0o0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                list4 = list3;
                obj2 = serializableOooO0o0;
                if (obj2 instanceof C32445OooOOOO.OooO00o) {
                }
                o000000o2 = o000000o3;
                list3 = list4;
                i3 = 1;
                if (it.hasNext()) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o3.OooOOO0("DriveCloudDS");
                    c20358OooO00o3.OooO00o("validateDriveFilesExist: one-by-one check for " + list3.size() + " items in " + jCurrentTimeMillis2 + "ms, valid=" + list.size() + ", deleted=" + list2.size(), new Object[0]);
                    return new C32443OooOOO(list, list2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o000OOo(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0Oo0oo o0oo0oo2;
        Object objO00000O;
        if (abstractC32479OooO0OO instanceof o0Oo0oo) {
            o0oo0oo2 = (o0Oo0oo) abstractC32479OooO0OO;
            int i = o0oo0oo2.f99092OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oo0oo2.f99092OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                o0oo0oo2 = new o0Oo0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = o0oo0oo2.f99091OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0oo0oo2.f99092OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC32508OooOOOo o0oo00o2 = new o0OO00O(arrayList, this, str, null);
            o0oo0oo2.f99092OooOoO0 = 1;
            objO00000O = o00000O(str, o0oo00o2, o0oo0oo2);
            if (objO00000O == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objO00000O = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objO00000O);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooO0Oo(thOooO00o, "batchMigrateAndBuildEvents: batch migrate failed", new Object[0]);
        }
        C32446OooOOOo.OooO0O0(objO00000O);
        return objO00000O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182 A[LOOP:2: B:67:0x017c->B:69:0x0182, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9 A[LOOP:3: B:71:0x01b3->B:73:0x01b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v10, types: [oOo000Oo.OooOoO] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00O0O(List list, List list2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27943Ooooo00 c27943Ooooo00;
        ArrayList arrayList;
        ArrayList<OooOO0.OooO0O0> arrayList2;
        ?? arrayList3;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        String id;
        if (abstractC32479OooO0OO instanceof C27943Ooooo00) {
            c27943Ooooo00 = (C27943Ooooo00) abstractC32479OooO0OO;
            int i = c27943Ooooo00.f98912OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27943Ooooo00.f98912OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27943Ooooo00 = new C27943Ooooo00(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27943Ooooo00.f98909OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27943Ooooo00.f98912OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list3 = list2;
            int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list3, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (Object obj2 : list3) {
                linkedHashMap.put(((AbstractC27909OooO0o0.OooO0OO) obj2).f98718OooO00o, obj2);
            }
            List<C26444OooOOo> list4 = list;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
            for (C26444OooOOo c26444OooOOo : list4) {
                CloudMetaRemoteEntity meta = c26444OooOOo.getMeta();
                AbstractC27909OooO0o0.OooO0OO oooO0OO = (meta == null || (id = meta.getId()) == null) ? null : (AbstractC27909OooO0o0.OooO0OO) linkedHashMap.get(id);
                arrayList.add((!c26444OooOOo.OooO0Oo() || meta == null || oooO0OO == null) ? new OooOO0.OooO00o(c26444OooOOo.getErrorCode(), c26444OooOOo.getErrorMsg()) : new OooOO0.OooO0O0(oooO0OO, meta));
            }
            arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof OooOO0.OooO0O0) {
                    arrayList2.add(obj3);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList3 = C34434OooOoO.f123453OooOo0o;
                ArrayList<OooOO0.OooO00o> arrayList4 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (obj4 instanceof OooOO0.OooO00o) {
                        arrayList4.add(obj4);
                    }
                }
                for (OooOO0.OooO00o oooO00o : arrayList4) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DriveCloudDS");
                    StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("batchMigrateAndBuildEvents: migrate failed: ", oooO00o.f98727OooO00o, " - ");
                    sbOooO0o0.append(oooO00o.f98728OooO0O0);
                    c20358OooO00o.OooO0OO(sbOooO0o0.toString(), new Object[0]);
                }
                ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(arrayList4, 10));
                for (OooOO0.OooO00o oooO00o2 : arrayList4) {
                    arrayList5.add(new OooO0O0(OooO0OO.f98703OooOoO0, oooO00o2.f98727OooO00o, oooO00o2.f98728OooO0O0));
                }
                return new OooOO0O(arrayList3, arrayList5);
            }
            ArrayList arrayList6 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList6.add(((OooOO0.OooO0O0) it.next()).f98730OooO0O0);
            }
            c27943Ooooo00.f98908OooOo0o = this;
            c27943Ooooo00.f98907OooOo = arrayList;
            c27943Ooooo00.f98910OooOoO0 = arrayList2;
            c27943Ooooo00.f98912OooOoo0 = 1;
            if (o000000o(arrayList6, c27943Ooooo00) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            abstractC27907OooOo0O = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList2 = c27943Ooooo00.f98910OooOoO0;
            arrayList = c27943Ooooo00.f98907OooOo;
            abstractC27907OooOo0O = c27943Ooooo00.f98908OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        arrayList3 = new ArrayList();
        for (OooOO0.OooO0O0 oooO0O0 : arrayList2) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DriveCloudDS");
            String str = oooO0O0.f98729OooO00o.f98718OooO00o;
            CloudMetaRemoteEntity cloudMetaRemoteEntity = oooO0O0.f98730OooO0O0;
            c20358OooO00o2.OooO0o0("batchMigrateAndBuildEvents: migrated meta for " + str + ", new version=" + cloudMetaRemoteEntity.getMetaVersion(), new Object[0]);
            AbstractC27909OooO0o0.OooO0OO oooO0OO2 = oooO0O0.f98729OooO00o;
            CloudEvent.MetaEvent metaEventOooo = abstractC27907OooOo0O.Oooo(oooO0OO2.f98719OooO0O0, cloudMetaRemoteEntity, oooO0OO2.f98721OooO0Oo, oooO0OO2.f98718OooO00o);
            if (metaEventOooo != null) {
                arrayList3.add(metaEventOooo);
            }
        }
        ArrayList<OooOO0.OooO00o> arrayList42 = new ArrayList();
        while (r13.hasNext()) {
        }
        while (r13.hasNext()) {
        }
        ArrayList arrayList52 = new ArrayList(C34428OooOOo.OooOOoo(arrayList42, 10));
        while (r12.hasNext()) {
        }
        return new OooOO0O(arrayList3, arrayList52);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00Oo0(List list, List list2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27944Ooooo0o c27944Ooooo0o;
        ArrayList arrayList;
        ArrayList<OooOOO.OooO0OO> arrayList2;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        if (abstractC32479OooO0OO instanceof C27944Ooooo0o) {
            c27944Ooooo0o = (C27944Ooooo0o) abstractC32479OooO0OO;
            int i = c27944Ooooo0o.f98918OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27944Ooooo0o.f98918OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27944Ooooo0o = new C27944Ooooo0o(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27944Ooooo0o.f98915OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27944Ooooo0o.f98918OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List list3 = list2;
            int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list3, 10));
            if (iOooO0Oo < 16) {
                iOooO0Oo = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
            for (Object obj2 : list3) {
                linkedHashMap.put(((AbstractC27909OooO0o0.OooO0OO) obj2).f98718OooO00o, obj2);
            }
            List<o0OO000.OooOo> list4 = list;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
            for (o0OO000.OooOo oooOo : list4) {
                CloudMetaRemoteEntity meta = oooOo.getMeta();
                String metaId = oooOo.getMetaId();
                AbstractC27909OooO0o0.OooO0OO oooO0OO = metaId != null ? (AbstractC27909OooO0o0.OooO0OO) linkedHashMap.get(metaId) : null;
                arrayList.add((!oooOo.OooO0o0() || meta == null || oooO0OO == null) ? ((kotlin.jvm.internal.OooOOO0.OooO0O0(oooOo.getErrorCode(), "1009") || kotlin.jvm.internal.OooOOO0.OooO0O0(oooOo.getErrorCode(), "1005")) && oooO0OO != null) ? new OooOOO.OooO0O0(oooO0OO) : new OooOOO.OooO00o(oooOo.getErrorCode(), oooOo.getErrorMsg()) : new OooOOO.OooO0OO(oooO0OO, meta));
            }
            arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (obj3 instanceof OooOOO.OooO0OO) {
                    arrayList2.add(obj3);
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((OooOOO.OooO0OO) it.next()).f98739OooO0O0);
                }
                c27944Ooooo0o.f98914OooOo0o = this;
                c27944Ooooo0o.f98913OooOo = arrayList;
                c27944Ooooo0o.f98916OooOoO0 = arrayList2;
                c27944Ooooo0o.f98918OooOoo0 = 1;
                if (o000000o(arrayList3, c27944Ooooo0o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
            abstractC27907OooOo0O = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList2 = c27944Ooooo0o.f98916OooOoO0;
            arrayList = c27944Ooooo0o.f98913OooOo;
            abstractC27907OooOo0O = c27944Ooooo0o.f98914OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        ArrayList arrayList4 = new ArrayList();
        for (OooOOO.OooO0OO oooO0OO2 : arrayList2) {
            AbstractC27909OooO0o0.OooO0OO oooO0OO3 = oooO0OO2.f98738OooO00o;
            CloudEvent.MetaEvent metaEventOooo = abstractC27907OooOo0O.Oooo(oooO0OO3.f98719OooO0O0, oooO0OO2.f98739OooO0O0, oooO0OO3.f98721OooO0Oo, oooO0OO3.f98718OooO00o);
            if (metaEventOooo != null) {
                arrayList4.add(metaEventOooo);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (obj4 instanceof OooOOO.OooO0O0) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = !arrayList5.isEmpty() ? arrayList5 : null;
        if (arrayList6 != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooO0o0("batchReconcileAndBuildEvents: STAGED_NOT_FOUND for %s, will migrate", oOo000Oo.OooOo.o000oOoO(arrayList6, ",", null, null, new C27905OooOo0(0), 30));
        }
        ArrayList arrayList7 = new ArrayList(C34428OooOOo.OooOOoo(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList7.add(((OooOOO.OooO0O0) it2.next()).f98737OooO00o);
        }
        ArrayList<OooOOO.OooO00o> arrayList8 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (obj5 instanceof OooOOO.OooO00o) {
                arrayList8.add(obj5);
            }
        }
        for (OooOOO.OooO00o oooO00o : arrayList8) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DriveCloudDS");
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("batchReconcileAndBuildEvents: reconcile failed: ", oooO00o.f98735OooO00o, " - ");
            sbOooO0o0.append(oooO00o.f98736OooO0O0);
            c20358OooO00o2.OooO0OO(sbOooO0o0.toString(), new Object[0]);
        }
        ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(arrayList8, 10));
        for (OooOOO.OooO00o oooO00o2 : arrayList8) {
            arrayList9.add(new OooO0O0(OooO0OO.f98700OooOo, oooO00o2.f98735OooO00o, oooO00o2.f98736OooO0O0));
        }
        return new OooOOOO(arrayList4, arrayList7, arrayList9);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00Ooo(String str, String str2, DriveSnapshotCacheEntity driveSnapshotCacheEntity, CloudMetaRemoteEntity cloudMetaRemoteEntity, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27945OooooO0 c27945OooooO0;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        DriveSnapshotCacheEntity driveSnapshotCacheEntity2;
        Object obj;
        CloudMetaRemoteEntity cloudMetaRemoteEntity2;
        String str3;
        String str4;
        if (abstractC32479OooO0OO instanceof C27945OooooO0) {
            c27945OooooO0 = (C27945OooooO0) abstractC32479OooO0OO;
            int i = c27945OooooO0.f98926OooOooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27945OooooO0.f98926OooOooO = i - Integer.MIN_VALUE;
            } else {
                c27945OooooO0 = new C27945OooooO0(this, abstractC32479OooO0OO);
            }
        }
        C27945OooooO0 c27945OooooO02 = c27945OooooO0;
        Object obj2 = c27945OooooO02.f98925OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27945OooooO02.f98926OooOooO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj2);
            if (cloudMetaRemoteEntity != null && driveSnapshotCacheEntity.getCTag().matches(cloudMetaRemoteEntity.getContentTag())) {
                return cloudMetaRemoteEntity;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooOO0O("maintainRemoteContentConsistency: inconsistent for " + str2 + ", driveSnapshot cTag=" + driveSnapshotCacheEntity.getCTag() + ", remoteMeta cTag=" + (cloudMetaRemoteEntity != null ? cloudMetaRemoteEntity.getContentTag() : null), new Object[0]);
            int metaVersion = cloudMetaRemoteEntity != null ? cloudMetaRemoteEntity.getMetaVersion() : 0;
            c27945OooooO02.f98920OooOo0o = this;
            c27945OooooO02.f98919OooOo = str;
            c27945OooooO02.f98922OooOoO0 = str2;
            c27945OooooO02.f98921OooOoO = driveSnapshotCacheEntity;
            c27945OooooO02.f98923OooOoOO = cloudMetaRemoteEntity;
            c27945OooooO02.f98926OooOooO = 1;
            Object objO0OOO0o = o0OOO0o(str, str2, driveSnapshotCacheEntity, metaVersion, c27945OooooO02);
            if (objO0OOO0o != enumC32485OooO00o) {
                abstractC27907OooOo0O = this;
                driveSnapshotCacheEntity2 = driveSnapshotCacheEntity;
                obj = objO0OOO0o;
                cloudMetaRemoteEntity2 = cloudMetaRemoteEntity;
                str3 = str;
                str4 = str2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj2);
            return ((C32445OooOOOO) obj2).f116639OooOo0o;
        }
        cloudMetaRemoteEntity2 = c27945OooooO02.f98923OooOoOO;
        driveSnapshotCacheEntity2 = c27945OooooO02.f98921OooOoO;
        str4 = c27945OooooO02.f98922OooOoO0;
        str3 = c27945OooooO02.f98919OooOo;
        AbstractC27907OooOo0O abstractC27907OooOo0O2 = c27945OooooO02.f98920OooOo0o;
        C32446OooOOOo.OooO0O0(obj2);
        obj = ((C32445OooOOOO) obj2).f116639OooOo0o;
        abstractC27907OooOo0O = abstractC27907OooOo0O2;
        if (!(obj instanceof C32445OooOOOO.OooO00o)) {
            return obj;
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(obj);
        if (thOooO00o instanceof o0OO000.OooOO0) {
            o0OO000.OooOO0 oooOO02 = (o0OO000.OooOO0) thOooO00o;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooOO02.f90831OooOo0o, "1009") || kotlin.jvm.internal.OooOOO0.OooO0O0(oooOO02.f90831OooOo0o, "1005")) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o2, "DriveCloudDS", "maintainRemoteContentConsistency: attempting migration for ", str4), new Object[0]);
                int metaVersion2 = cloudMetaRemoteEntity2 != null ? cloudMetaRemoteEntity2.getMetaVersion() : 0;
                c27945OooooO02.f98920OooOo0o = null;
                c27945OooooO02.f98919OooOo = null;
                c27945OooooO02.f98922OooOoO0 = null;
                c27945OooooO02.f98921OooOoO = null;
                c27945OooooO02.f98923OooOoOO = null;
                c27945OooooO02.f98926OooOooO = 2;
                Object objO00o0O = abstractC27907OooOo0O.o00o0O(str3, str4, driveSnapshotCacheEntity2, metaVersion2, c27945OooooO02);
                return objO00o0O == enumC32485OooO00o ? enumC32485OooO00o : objO00o0O;
            }
        }
        String str5 = str4;
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooO0Oo(thOooO00o, androidx.core.app.OooO.OooO0O0(c20358OooO00o3, "DriveCloudDS", "maintainRemoteContentConsistency: reconcile failed and cannot migrate for ", str5), new Object[0]);
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00o0O(String str, String str2, DriveSnapshotCacheEntity driveSnapshotCacheEntity, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27946OooooOO c27946OooooOO;
        if (abstractC32479OooO0OO instanceof C27946OooooOO) {
            c27946OooooOO = (C27946OooooOO) abstractC32479OooO0OO;
            int i2 = c27946OooooOO.f98929OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c27946OooooOO.f98929OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c27946OooooOO = new C27946OooooOO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27946OooooOO.f98928OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c27946OooooOO.f98929OooOoO0;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        String mimeType = driveSnapshotCacheEntity.getMimeType();
        if (mimeType == null || mimeType.length() == 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("migrateHistoricalMeta: miss mimeType in snapshot ", driveSnapshotCacheEntity.getId()), new Object[0]);
            throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("migrateHistoricalMeta: miss mimeType in snapshot ", driveSnapshotCacheEntity.getId()));
        }
        CloudMetaExtra extra = driveSnapshotCacheEntity.getExtra();
        InterfaceC32508OooOOOo c27947OooooOo = new C27947OooooOo(this, new CloudMetaRemoteEntity(str2, str, mimeType, i, CloudMetaExtraKt.computeMetaHash(extra), driveSnapshotCacheEntity.getId(), System.currentTimeMillis(), driveSnapshotCacheEntity.getCTag(), 0L, extra), str2, null);
        c27946OooooOO.f98929OooOoO0 = 1;
        Object objO00000O = o00000O(str, c27947OooooOo, c27946OooooOO);
        return objO00000O == obj2 ? obj2 : objO00000O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0251 -> B:65:0x0254). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x026d -> B:67:0x0274). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00oO0O(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws o0OO000.OooOO0 {
        o0OoOo0 o0oooo02;
        List arrayList;
        Object objOooOOo;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        Long l;
        String str2;
        List list;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        boolean z;
        int i;
        int i2;
        Long l2;
        int i3;
        String str3;
        AbstractC27907OooOo0O abstractC27907OooOo0O3;
        List list2;
        Long l3;
        o0OO000.OooOOOO oooOOOO;
        List list3;
        int i4;
        int i5;
        AbstractC27907OooOo0O abstractC27907OooOo0O4;
        String str4;
        AbstractC27907OooOo0O abstractC27907OooOo0O5;
        String str5;
        ArrayList arrayList2;
        int i6;
        String str6 = str;
        if (abstractC32479OooO0OO instanceof o0OoOo0) {
            o0oooo02 = (o0OoOo0) abstractC32479OooO0OO;
            int i7 = o0oooo02.f99104Oooo00o;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                o0oooo02.f99104Oooo00o = i7 - Integer.MIN_VALUE;
            } else {
                o0oooo02 = new o0OoOo0(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0o = o0oooo02.f99102Oooo000;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i8 = o0oooo02.f99104Oooo00o;
        int i9 = 1;
        if (i8 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0o);
            arrayList = new ArrayList();
            o0oooo02.f99094OooOo0o = this;
            o0oooo02.f99093OooOo = str6;
            o0oooo02.f99096OooOoO0 = arrayList;
            o0oooo02.f99104Oooo00o = 1;
            C27956o00000oo c27956o00000oo = this.f98685OooO0oo;
            c27956o00000oo.getClass();
            objOooOOo = C25252OooO0Oo.OooOOo(new o0000Ooo(c27956o00000oo.f98998OooO00o.getData(), C24340OooO0oo.OooO0Oo("sync_cursor_" + str6)), o0oooo02);
            if (objOooOOo != enumC32485OooO00o) {
                abstractC27907OooOo0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i8 == 1) {
            List list4 = o0oooo02.f99096OooOoO0;
            String str7 = o0oooo02.f99093OooOo;
            abstractC27907OooOo0O = o0oooo02.f99094OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0o);
            arrayList = list4;
            str6 = str7;
            objOooOOo = objOooO0o;
        } else {
            if (i8 == 2) {
                i = o0oooo02.f99100OooOooO;
                i4 = o0oooo02.f99098OooOoo;
                l2 = o0oooo02.f99095OooOoO;
                list = o0oooo02.f99096OooOoO0;
                str2 = o0oooo02.f99093OooOo;
                abstractC27907OooOo0O2 = o0oooo02.f99094OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                o0oooo02.f99094OooOo0o = abstractC27907OooOo0O2;
                o0oooo02.f99093OooOo = str2;
                o0oooo02.f99096OooOoO0 = list;
                o0oooo02.f99095OooOoO = l2;
                o0oooo02.f99098OooOoo = i4;
                o0oooo02.f99100OooOooO = i;
                o0oooo02.f99104Oooo00o = 3;
                objOooO0o = C33074OooOoO.OooO0o((C35238OooOoO) objOooO0o, "fetchCloudMetas");
                if (objOooO0o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i8 == 3) {
                i = o0oooo02.f99100OooOooO;
                i4 = o0oooo02.f99098OooOoo;
                Long l4 = o0oooo02.f99095OooOoO;
                List list5 = o0oooo02.f99096OooOoO0;
                String str8 = o0oooo02.f99093OooOo;
                AbstractC27907OooOo0O abstractC27907OooOo0O6 = o0oooo02.f99094OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                l3 = l4;
                str5 = str8;
                list2 = list5;
                abstractC27907OooOo0O5 = abstractC27907OooOo0O6;
                o0OO000.OooOOOO oooOOOO2 = (o0OO000.OooOOOO) objOooO0o;
                List<CloudMetaRemoteEntity> listOooO0OO = oooOOOO2.OooO0OO();
                arrayList2 = new ArrayList();
                while (r15.hasNext()) {
                }
                i3 = i9;
                list2.addAll(arrayList2);
                if (arrayList2.isEmpty()) {
                }
            } else if (i8 == 4) {
                i = o0oooo02.f99100OooOooO;
                i4 = o0oooo02.f99098OooOoo;
                list3 = o0oooo02.f99099OooOoo0;
                oooOOOO = o0oooo02.f99097OooOoOO;
                l3 = o0oooo02.f99095OooOoO;
                list2 = o0oooo02.f99096OooOoO0;
                str4 = o0oooo02.f99093OooOo;
                abstractC27907OooOo0O4 = o0oooo02.f99094OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                i3 = 1;
                AbstractC27907OooOo0O abstractC27907OooOo0O7 = abstractC27907OooOo0O4;
                str3 = str4;
                abstractC27907OooOo0O3 = abstractC27907OooOo0O7;
                Long nextCursor = oooOOOO.getNextCursor();
                boolean hasMore = oooOOOO.getHasMore();
                i5 = i4 + 1;
                if (oooOOOO.getCursorInvalid()) {
                }
            } else {
                if (i8 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = o0oooo02.f99100OooOooO;
                i5 = o0oooo02.f99098OooOoo;
                boolean z2 = o0oooo02.f99101OooOooo;
                list3 = o0oooo02.f99099OooOoo0;
                oooOOOO = o0oooo02.f99097OooOoOO;
                Long l5 = o0oooo02.f99095OooOoO;
                list2 = o0oooo02.f99096OooOoO0;
                str3 = o0oooo02.f99093OooOo;
                abstractC27907OooOo0O3 = o0oooo02.f99094OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0o);
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOO0O(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "DriveCloudDS", "fetchCloudMetas: cursor invalid, cleared saved cursor for driveId=", str3), new Object[0]);
                i = i10;
                i2 = i5;
                l = l5;
                str2 = str3;
                Long l6 = null;
                i3 = 1;
                if (!oooOOOO.getCursorInvalid() && l != null) {
                    l6 = l;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("DriveCloudDS");
                int size = oooOOOO.OooO0OO().size();
                int size2 = list3.size();
                int i11 = i;
                StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("fetchCloudMetas: page ", i2, ", fetched ", " items, valid ", size);
                sbOooO0O0.append(size2);
                sbOooO0O0.append(", hasMore=");
                sbOooO0O0.append(z2);
                c20358OooO00o2.OooO00o(sbOooO0O0.toString(), new Object[0]);
                i = i11;
                list = list2;
                abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
                l2 = l6;
                z = z2;
                o0oooo02 = o0oooo02;
                i9 = i3;
                if (!z) {
                    InterfaceC26441OooO0oo interfaceC26441OooO0oo = abstractC27907OooOo0O2.f98682OooO0o;
                    o0oooo02.f99094OooOo0o = abstractC27907OooOo0O2;
                    o0oooo02.f99093OooOo = str2;
                    o0oooo02.f99096OooOoO0 = list;
                    o0oooo02.f99095OooOoO = l2;
                    o0oooo02.f99097OooOoOO = null;
                    o0oooo02.f99099OooOoo0 = null;
                    o0oooo02.f99098OooOoo = i2;
                    o0oooo02.f99100OooOooO = i;
                    o0oooo02.f99104Oooo00o = 2;
                    Object objOooOO0 = interfaceC26441OooO0oo.OooOO0(str2, l, 100, o0oooo02);
                    if (objOooOO0 != enumC32485OooO00o) {
                        i4 = i2;
                        objOooO0o = objOooOO0;
                        o0oooo02.f99094OooOo0o = abstractC27907OooOo0O2;
                        o0oooo02.f99093OooOo = str2;
                        o0oooo02.f99096OooOoO0 = list;
                        o0oooo02.f99095OooOoO = l2;
                        o0oooo02.f99098OooOoo = i4;
                        o0oooo02.f99100OooOooO = i;
                        o0oooo02.f99104Oooo00o = 3;
                        objOooO0o = C33074OooOoO.OooO0o((C35238OooOoO) objOooO0o, "fetchCloudMetas");
                        if (objOooO0o != enumC32485OooO00o) {
                            String str9 = str2;
                            l3 = l2;
                            str5 = str9;
                            AbstractC27907OooOo0O abstractC27907OooOo0O8 = abstractC27907OooOo0O2;
                            list2 = list;
                            abstractC27907OooOo0O5 = abstractC27907OooOo0O8;
                            o0OO000.OooOOOO oooOOOO22 = (o0OO000.OooOOOO) objOooO0o;
                            List<CloudMetaRemoteEntity> listOooO0OO2 = oooOOOO22.OooO0OO();
                            arrayList2 = new ArrayList();
                            for (Object obj : listOooO0OO2) {
                                CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) obj;
                                if (C33599OooOo0O.Oooo0o0(cloudMetaRemoteEntity.getMimeType()) || C33599OooOo0O.Oooo0o0(cloudMetaRemoteEntity.getDriveObjectKey())) {
                                    i6 = i9;
                                } else {
                                    i6 = i9;
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(cloudMetaRemoteEntity.getDriveId(), str5)) {
                                        arrayList2.add(obj);
                                    }
                                }
                                i9 = i6;
                            }
                            i3 = i9;
                            list2.addAll(arrayList2);
                            if (arrayList2.isEmpty()) {
                                InterfaceC35015OooOO0O interfaceC35015OooOO0O = abstractC27907OooOo0O5.f98681OooO0Oo;
                                CloudMetaRemoteEntity[] cloudMetaRemoteEntityArr = (CloudMetaRemoteEntity[]) arrayList2.toArray(new CloudMetaRemoteEntity[0]);
                                CloudMetaRemoteEntity[] cloudMetaRemoteEntityArr2 = (CloudMetaRemoteEntity[]) Arrays.copyOf(cloudMetaRemoteEntityArr, cloudMetaRemoteEntityArr.length);
                                o0oooo02.f99094OooOo0o = abstractC27907OooOo0O5;
                                o0oooo02.f99093OooOo = str5;
                                o0oooo02.f99096OooOoO0 = list2;
                                o0oooo02.f99095OooOoO = l3;
                                o0oooo02.f99097OooOoOO = oooOOOO22;
                                o0oooo02.f99099OooOoo0 = arrayList2;
                                o0oooo02.f99098OooOoo = i4;
                                o0oooo02.f99100OooOooO = i;
                                o0oooo02.f99104Oooo00o = 4;
                                if (interfaceC35015OooOO0O.OooO0OO(cloudMetaRemoteEntityArr2, o0oooo02) != enumC32485OooO00o) {
                                    str4 = str5;
                                    list3 = arrayList2;
                                    abstractC27907OooOo0O4 = abstractC27907OooOo0O5;
                                    oooOOOO = oooOOOO22;
                                    AbstractC27907OooOo0O abstractC27907OooOo0O72 = abstractC27907OooOo0O4;
                                    str3 = str4;
                                    abstractC27907OooOo0O3 = abstractC27907OooOo0O72;
                                    Long nextCursor2 = oooOOOO.getNextCursor();
                                    boolean hasMore2 = oooOOOO.getHasMore();
                                    i5 = i4 + 1;
                                    if (oooOOOO.getCursorInvalid()) {
                                        C27956o00000oo c27956o00000oo2 = abstractC27907OooOo0O3.f98685OooO0oo;
                                        o0oooo02.f99094OooOo0o = abstractC27907OooOo0O3;
                                        o0oooo02.f99093OooOo = str3;
                                        o0oooo02.f99096OooOoO0 = list2;
                                        o0oooo02.f99095OooOoO = nextCursor2;
                                        o0oooo02.f99097OooOoOO = oooOOOO;
                                        o0oooo02.f99099OooOoo0 = list3;
                                        o0oooo02.f99101OooOooo = hasMore2;
                                        o0oooo02.f99098OooOoo = i5;
                                        o0oooo02.f99100OooOooO = i3;
                                        o0oooo02.f99104Oooo00o = 5;
                                        c27956o00000oo2.getClass();
                                        Object objOooO00o = C24332OooO.OooO00o(c27956o00000oo2.f98998OooO00o, new C27954o00000o0(C24340OooO0oo.OooO0Oo("sync_cursor_" + str3), null), o0oooo02);
                                        if (objOooO00o != EnumC32485OooO00o.f116726OooOo0o) {
                                            objOooO00o = C32460OooOooO.f116667OooO00o;
                                        }
                                        if (objOooO00o != enumC32485OooO00o) {
                                            l5 = nextCursor2;
                                            z2 = hasMore2;
                                            i10 = 1;
                                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o3.OooOO0O(androidx.core.app.OooO.OooO0O0(c20358OooO00o3, "DriveCloudDS", "fetchCloudMetas: cursor invalid, cleared saved cursor for driveId=", str3), new Object[0]);
                                            i = i10;
                                            i2 = i5;
                                            l = l5;
                                            str2 = str3;
                                            Long l62 = null;
                                            i3 = 1;
                                            if (!oooOOOO.getCursorInvalid()) {
                                                l62 = l;
                                            }
                                            C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o22.OooOOO0("DriveCloudDS");
                                            int size3 = oooOOOO.OooO0OO().size();
                                            int size22 = list3.size();
                                            int i112 = i;
                                            StringBuilder sbOooO0O02 = C20398OooO0O0.OooO0O0("fetchCloudMetas: page ", i2, ", fetched ", " items, valid ", size3);
                                            sbOooO0O02.append(size22);
                                            sbOooO0O02.append(", hasMore=");
                                            sbOooO0O02.append(z2);
                                            c20358OooO00o22.OooO00o(sbOooO0O02.toString(), new Object[0]);
                                            i = i112;
                                            list = list2;
                                            abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
                                            l2 = l62;
                                            z = z2;
                                            o0oooo02 = o0oooo02;
                                            i9 = i3;
                                            if (!z) {
                                                return new OooO0o(list, l2, i != 0 ? i9 : 0);
                                            }
                                        }
                                    } else {
                                        l = nextCursor2;
                                        i2 = i5;
                                        String str10 = str3;
                                        l62 = l3;
                                        str2 = str10;
                                        z2 = hasMore2;
                                        if (!oooOOOO.getCursorInvalid()) {
                                        }
                                        C34406OooO00o.C20358OooO00o c20358OooO00o222 = C34406OooO00o.f123390OooO00o;
                                        c20358OooO00o222.OooOOO0("DriveCloudDS");
                                        int size32 = oooOOOO.OooO0OO().size();
                                        int size222 = list3.size();
                                        int i1122 = i;
                                        StringBuilder sbOooO0O022 = C20398OooO0O0.OooO0O0("fetchCloudMetas: page ", i2, ", fetched ", " items, valid ", size32);
                                        sbOooO0O022.append(size222);
                                        sbOooO0O022.append(", hasMore=");
                                        sbOooO0O022.append(z2);
                                        c20358OooO00o222.OooO00o(sbOooO0O022.toString(), new Object[0]);
                                        i = i1122;
                                        list = list2;
                                        abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
                                        l2 = l62;
                                        z = z2;
                                        o0oooo02 = o0oooo02;
                                        i9 = i3;
                                        if (!z) {
                                        }
                                    }
                                }
                            } else {
                                str3 = str5;
                                list3 = arrayList2;
                                abstractC27907OooOo0O3 = abstractC27907OooOo0O5;
                                oooOOOO = oooOOOO22;
                                Long nextCursor22 = oooOOOO.getNextCursor();
                                boolean hasMore22 = oooOOOO.getHasMore();
                                i5 = i4 + 1;
                                if (oooOOOO.getCursorInvalid()) {
                                }
                            }
                        }
                    }
                    return enumC32485OooO00o;
                }
            }
        }
        l = (Long) objOooOOo;
        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o4, "DriveCloudDS", "fetchCloudMetas: starting incremental sync for driveId=", str6, ", cursor=");
        sbOooO00o.append(l);
        c20358OooO00o4.OooO0o0(sbOooO00o.toString(), new Object[0]);
        str2 = str6;
        list = arrayList;
        abstractC27907OooOo0O2 = abstractC27907OooOo0O;
        z = true;
        i = 0;
        i2 = 0;
        l2 = null;
        if (!z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00oO0o(String str, List list, OooO oooO, C27911OooO0oo c27911OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27951Ooooooo c27951Ooooooo;
        C27908OooO0Oo c27908OooO0Oo;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        OooOOO0 oooOOO0;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        String str2 = str;
        if (abstractC32479OooO0OO instanceof C27951Ooooooo) {
            c27951Ooooooo = (C27951Ooooooo) abstractC32479OooO0OO;
            int i = c27951Ooooooo.f98965OooOoo0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27951Ooooooo.f98965OooOoo0 = i - Integer.MIN_VALUE;
            } else {
                c27951Ooooooo = new C27951Ooooooo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooo0oo = c27951Ooooooo.f98962OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27951Ooooooo.f98965OooOoo0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooo0oo);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                CloudMetaLocalEntity cloudMetaLocalEntity = oooO.f98692OooO00o.get(str3);
                CloudMetaRemoteEntity cloudMetaRemoteEntity = oooO.f98693OooO0O0.get(str3);
                DriveSnapshotCacheEntity driveSnapshotCacheEntity = (DriveSnapshotCacheEntity) oooO.f98694OooO0OO.get(str3);
                Object oooO00o = (driveSnapshotCacheEntity == null || driveSnapshotCacheEntity.getRecycled()) ? new AbstractC27909OooO0o0.OooO00o(cloudMetaLocalEntity, cloudMetaRemoteEntity, driveSnapshotCacheEntity, str3) : (cloudMetaRemoteEntity == null || !driveSnapshotCacheEntity.getCTag().matches(cloudMetaRemoteEntity.getContentTag())) ? new AbstractC27909OooO0o0.OooO0OO(cloudMetaLocalEntity, cloudMetaRemoteEntity, driveSnapshotCacheEntity, str3) : new AbstractC27909OooO0o0.OooO0O0(cloudMetaLocalEntity, cloudMetaRemoteEntity, driveSnapshotCacheEntity, str3);
                if (oooO00o instanceof AbstractC27909OooO0o0.OooO00o) {
                    arrayList.add(oooO00o);
                } else if (oooO00o instanceof AbstractC27909OooO0o0.OooO0O0) {
                    arrayList2.add(oooO00o);
                } else {
                    if (!(oooO00o instanceof AbstractC27909OooO0o0.OooO0OO)) {
                        throw new C32442OooOO0o();
                    }
                    arrayList3.add(oooO00o);
                }
            }
            c27908OooO0Oo = new C27908OooO0Oo(arrayList, arrayList2, arrayList3);
            c27951Ooooooo.f98961OooOo0o = this;
            c27951Ooooooo.f98960OooOo = str2;
            c27951Ooooooo.f98963OooOoO0 = c27908OooO0Oo;
            c27951Ooooooo.f98965OooOoo0 = 1;
            objOooo0oo = Oooo0oo(str2, arrayList3, c27911OooO0oo, c27951Ooooooo);
            if (objOooo0oo != enumC32485OooO00o) {
                abstractC27907OooOo0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOOO0 = (OooOOO0) c27951Ooooooo.f98963OooOoO0;
            c27908OooO0Oo = (C27908OooO0Oo) c27951Ooooooo.f98960OooOo;
            abstractC27907OooOo0O2 = c27951Ooooooo.f98961OooOo0o;
            C32446OooOOOo.OooO0O0(objOooo0oo);
            C27910OooO0oO c27910OooO0oO = (C27910OooO0oO) objOooo0oo;
            ArrayList<AbstractC27909OooO0o0.OooO0O0> arrayList4 = c27908OooO0Oo.f98705OooO0O0;
            abstractC27907OooOo0O2.getClass();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(arrayList4.size(), "buildNormalEvents: processing ", " normal scenarios"), new Object[0]);
            ArrayList arrayList5 = new ArrayList();
            for (AbstractC27909OooO0o0.OooO0O0 oooO0O0 : arrayList4) {
                CloudEvent.MetaEvent metaEventOooo = abstractC27907OooOo0O2.Oooo(oooO0O0.f98715OooO0O0, oooO0O0.f98716OooO0OO, oooO0O0.f98717OooO0Oo, oooO0O0.f98714OooO00o);
                if (metaEventOooo != null) {
                    arrayList5.add(metaEventOooo);
                }
            }
            return new OooO00o(oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO((Collection) c27910OooO0oO.f98722OooO00o, arrayList5), oooOOO0.f98740OooO00o), oOo000Oo.OooOo.OooooOO((Collection) c27910OooO0oO.f98723OooO0O0, oooOOO0.f98741OooO0O0));
        }
        C27908OooO0Oo c27908OooO0Oo2 = (C27908OooO0Oo) c27951Ooooooo.f98963OooOoO0;
        String str4 = (String) c27951Ooooooo.f98960OooOo;
        abstractC27907OooOo0O = c27951Ooooooo.f98961OooOo0o;
        C32446OooOOOo.OooO0O0(objOooo0oo);
        c27908OooO0Oo = c27908OooO0Oo2;
        str2 = str4;
        OooOOO0 oooOOO02 = (OooOOO0) objOooo0oo;
        ArrayList arrayList6 = c27908OooO0Oo.f98704OooO00o;
        c27951Ooooooo.f98961OooOo0o = abstractC27907OooOo0O;
        c27951Ooooooo.f98960OooOo = c27908OooO0Oo;
        c27951Ooooooo.f98963OooOoO0 = oooOOO02;
        c27951Ooooooo.f98965OooOoo0 = 2;
        Object objOooo0o = abstractC27907OooOo0O.Oooo0o(str2, arrayList6, c27951Ooooooo);
        if (objOooo0o != enumC32485OooO00o) {
            objOooo0oo = objOooo0o;
            oooOOO0 = oooOOO02;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            C27910OooO0oO c27910OooO0oO2 = (C27910OooO0oO) objOooo0oo;
            ArrayList<AbstractC27909OooO0o0.OooO0O0> arrayList42 = c27908OooO0Oo.f98705OooO0O0;
            abstractC27907OooOo0O2.getClass();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DriveCloudDS");
            c20358OooO00o2.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(arrayList42.size(), "buildNormalEvents: processing ", " normal scenarios"), new Object[0]);
            ArrayList arrayList52 = new ArrayList();
            while (r2.hasNext()) {
            }
            return new OooO00o(oOo000Oo.OooOo.OooooOO(oOo000Oo.OooOo.OooooOO((Collection) c27910OooO0oO2.f98722OooO00o, arrayList52), oooOOO0.f98740OooO00o), oOo000Oo.OooOo.OooooOO((Collection) c27910OooO0oO2.f98723OooO0O0, oooOOO0.f98741OooO0O0));
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0115 -> B:39:0x011b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o00ooo(String str, C27913OooOOOo c27913OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27949Oooooo0 c27949Oooooo0;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        Collection arrayList;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        List list;
        C27949Oooooo0 c27949Oooooo02;
        Iterator it;
        C27913OooOOOo c27913OooOOOo2;
        String str2;
        C27913OooOOOo c27913OooOOOo3;
        List list2;
        Iterator it2;
        if (abstractC32479OooO0OO instanceof C27949Oooooo0) {
            c27949Oooooo0 = (C27949Oooooo0) abstractC32479OooO0OO;
            int i = c27949Oooooo0.f98946OooOooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27949Oooooo0.f98946OooOooo = i - Integer.MIN_VALUE;
                abstractC27907OooOo0O = this;
            } else {
                abstractC27907OooOo0O = this;
                c27949Oooooo0 = new C27949Oooooo0(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27949Oooooo0.f98943OooOoo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27949Oooooo0.f98946OooOooo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<DriveSnapshotCacheEntity> list3 = c27913OooOOOo.f98745OooO00o.f98987OooO00o;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String cloudMetaId = ((DriveSnapshotCacheEntity) obj2).getCloudMetaId();
                if (cloudMetaId == null || C33599OooOo0O.Oooo0o0(cloudMetaId)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                return c27913OooOOOo.f98747OooO0OO;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooOO0O(Oooo0oO.o0Oo0oo.OooO0O0(arrayList2.size(), "patchOrphanDriveFiles: found ", " drive files without metaId"), new Object[0]);
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((DriveSnapshotCacheEntity) it3.next()).getId());
            }
            ArrayList arrayListOo0o0Oo = oOo000Oo.OooOo.oo0o0Oo(100, 100, arrayList3);
            arrayList = new ArrayList();
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            list = arrayList2;
            c27949Oooooo02 = c27949Oooooo0;
            it = arrayListOo0o0Oo.iterator();
            c27913OooOOOo2 = c27913OooOOOo;
            str2 = str;
            if (it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list4 = (List) c27949Oooooo0.f98938OooOo;
            c27913OooOOOo3 = (C27913OooOOOo) c27949Oooooo0.f98939OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list2 = list4;
            Set<String> set = c27913OooOOOo3.f98747OooO0OO;
            ArrayList arrayList4 = new ArrayList();
            it2 = list2.iterator();
            while (it2.hasNext()) {
                String cloudMetaId2 = ((DriveSnapshotCacheEntity) it2.next()).getCloudMetaId();
                if (cloudMetaId2 != null) {
                    arrayList4.add(cloudMetaId2);
                }
            }
            set.addAll(arrayList4);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DriveCloudDS");
            c20358OooO00o2.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(list2.size(), "patchOrphanDriveFiles: patched ", " drive files"), new Object[0]);
            c27913OooOOOo2 = c27913OooOOOo3;
            return c27913OooOOOo2.f98747OooO0OO;
        }
        Iterator it4 = c27949Oooooo0.f98944OooOoo0;
        Collection collection = c27949Oooooo0.f98942OooOoOO;
        List list5 = c27949Oooooo0.f98940OooOoO;
        C27913OooOOOo c27913OooOOOo4 = c27949Oooooo0.f98941OooOoO0;
        String str3 = (String) c27949Oooooo0.f98938OooOo;
        abstractC27907OooOo0O2 = (AbstractC27907OooOo0O) c27949Oooooo0.f98939OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        List list6 = list5;
        arrayList = collection;
        c27949Oooooo02 = c27949Oooooo0;
        it = it4;
        str2 = str3;
        C34431OooOo0.OooOo0o(arrayList, (Iterable) obj);
        c27913OooOOOo2 = c27913OooOOOo4;
        list = list6;
        if (it.hasNext()) {
            List list7 = (List) it.next();
            InterfaceC35015OooOO0O interfaceC35015OooOO0O = abstractC27907OooOo0O2.f98681OooO0Oo;
            c27949Oooooo02.f98939OooOo0o = abstractC27907OooOo0O2;
            c27949Oooooo02.f98938OooOo = str2;
            c27949Oooooo02.f98941OooOoO0 = c27913OooOOOo2;
            c27949Oooooo02.f98940OooOoO = list;
            c27949Oooooo02.f98942OooOoOO = arrayList;
            c27949Oooooo02.f98944OooOoo0 = it;
            c27949Oooooo02.f98946OooOooo = 1;
            Object objOooO0oO = interfaceC35015OooOO0O.OooO0oO(str2, list7, c27949Oooooo02);
            if (objOooO0oO != enumC32485OooO00o) {
                List list8 = list;
                c27913OooOOOo4 = c27913OooOOOo2;
                obj = objOooO0oO;
                list6 = list8;
                C34431OooOo0.OooOo0o(arrayList, (Iterable) obj);
                c27913OooOOOo2 = c27913OooOOOo4;
                list = list6;
                if (it.hasNext()) {
                    List list9 = (List) arrayList;
                    int iOooO0Oo = oOo000Oo.Oooo0.OooO0Oo(C34428OooOOo.OooOOoo(list9, 10));
                    if (iOooO0Oo < 16) {
                        iOooO0Oo = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO0Oo);
                    for (Object obj3 : list9) {
                        linkedHashMap.put(((CloudMetaRemoteEntity) obj3).getDriveObjectKey(), obj3);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = list.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        DriveSnapshotCacheEntity driveSnapshotCacheEntity = (DriveSnapshotCacheEntity) it5.next();
                        CloudMetaRemoteEntity cloudMetaRemoteEntity = (CloudMetaRemoteEntity) linkedHashMap.get(driveSnapshotCacheEntity.getId());
                        DriveSnapshotCacheEntity driveSnapshotCacheEntityCopy$default = cloudMetaRemoteEntity != null ? DriveSnapshotCacheEntity.copy$default(driveSnapshotCacheEntity, null, null, cloudMetaRemoteEntity.getId(), null, null, null, 0L, 0L, 0L, false, 0L, 2043, null) : null;
                        if (driveSnapshotCacheEntityCopy$default != null) {
                            arrayList5.add(driveSnapshotCacheEntityCopy$default);
                        }
                    }
                    if (arrayList5.isEmpty()) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o3.OooOOO0("DriveCloudDS");
                        c20358OooO00o3.OooOO0O("patchOrphanDriveFiles: no matching CloudMeta found for orphan drive files", new Object[0]);
                        return c27913OooOOOo2.f98747OooO0OO;
                    }
                    InterfaceC35021OooOOo interfaceC35021OooOOo = abstractC27907OooOo0O2.f98683OooO0o0;
                    c27949Oooooo02.f98939OooOo0o = c27913OooOOOo2;
                    c27949Oooooo02.f98938OooOo = arrayList5;
                    c27949Oooooo02.f98941OooOoO0 = null;
                    c27949Oooooo02.f98940OooOoO = null;
                    c27949Oooooo02.f98942OooOoOO = null;
                    c27949Oooooo02.f98944OooOoo0 = null;
                    c27949Oooooo02.f98946OooOooo = 2;
                    if (interfaceC35021OooOOo.OooO0o0(arrayList5, c27949Oooooo02) != enumC32485OooO00o) {
                        c27913OooOOOo3 = c27913OooOOOo2;
                        list2 = arrayList5;
                        Set<String> set2 = c27913OooOOOo3.f98747OooO0OO;
                        ArrayList arrayList42 = new ArrayList();
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                        }
                        set2.addAll(arrayList42);
                        C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o22.OooOOO0("DriveCloudDS");
                        c20358OooO00o22.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(list2.size(), "patchOrphanDriveFiles: patched ", " drive files"), new Object[0]);
                        c27913OooOOOo2 = c27913OooOOOo3;
                        return c27913OooOOOo2.f98747OooO0OO;
                    }
                }
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o0O0O00(String str, ArrayList arrayList, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27962o0ooOoO c27962o0ooOoO;
        Object objO00000O;
        if (abstractC32479OooO0OO instanceof C27962o0ooOoO) {
            c27962o0ooOoO = (C27962o0ooOoO) abstractC32479OooO0OO;
            int i = c27962o0ooOoO.f99126OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27962o0ooOoO.f99126OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                c27962o0ooOoO = new C27962o0ooOoO(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c27962o0ooOoO.f99125OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27962o0ooOoO.f99126OooOoO0;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC27909OooO0o0.OooO00o oooO00o = (AbstractC27909OooO0o0.OooO00o) it.next();
                String str2 = oooO00o.f98710OooO00o;
                CloudMetaRemoteEntity cloudMetaRemoteEntity = oooO00o.f98712OooO0OO;
                arrayList2.add(new o0OO000.OooO0OO(str2, cloudMetaRemoteEntity != null ? cloudMetaRemoteEntity.getMetaVersion() : 0));
            }
            InterfaceC32508OooOOOo o0ooo0o2 = new o0OOO0o(arrayList2, this, str, null);
            c27962o0ooOoO.f99126OooOoO0 = 1;
            objO00000O = o00000O(str, o0ooo0o2, c27962o0ooOoO);
            if (objO00000O == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            objO00000O = ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objO00000O);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DriveCloudDS");
            c20358OooO00o.OooO0Oo(thOooO00o, "runBatchDelete: batch delete failed", new Object[0]);
        }
        C32446OooOOOo.OooO0O0(objO00000O);
        return objO00000O;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o0OOO0o(String str, String str2, DriveSnapshotCacheEntity driveSnapshotCacheEntity, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o00Ooo o00ooo2;
        if (abstractC32479OooO0OO instanceof o00Ooo) {
            o00ooo2 = (o00Ooo) abstractC32479OooO0OO;
            int i2 = o00ooo2.f99027OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o00ooo2.f99027OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                o00ooo2 = new o00Ooo(this, abstractC32479OooO0OO);
            }
        }
        o00Ooo o00ooo3 = o00ooo2;
        Object obj = o00ooo3.f99026OooOo0o;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = o00ooo3.f99027OooOoO0;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return ((C32445OooOOOO) obj).f116639OooOo0o;
        }
        C32446OooOOOo.OooO0O0(obj);
        InterfaceC32508OooOOOo c27958o00o0O = new C27958o00o0O(str2, str, driveSnapshotCacheEntity, i, this, null);
        o00ooo3.f99027OooOoO0 = 1;
        Object objO00000O = o00000O(str, c27958o00o0O, o00ooo3);
        return objO00000O == obj2 ? obj2 : objO00000O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r2 == r4) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x017b -> B:51:0x017e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o0ooOO0(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C27963ooOO c27963ooOO;
        Object objOooO0oo;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        o00000O0 o00000o02;
        List<DriveSnapshotCacheEntity> list;
        String str2;
        List<DriveSnapshotCacheEntity> list2;
        List<String> list3;
        long jCurrentTimeMillis;
        String str3;
        Iterator it;
        List<DriveSnapshotCacheEntity> list4;
        o00000O0 o00000o03;
        List<String> list5;
        String str4 = str;
        if (abstractC32479OooO0OO instanceof C27963ooOO) {
            c27963ooOO = (C27963ooOO) abstractC32479OooO0OO;
            int i = c27963ooOO.f99145Oooo000;
            if ((i & Integer.MIN_VALUE) != 0) {
                c27963ooOO.f99145Oooo000 = i - Integer.MIN_VALUE;
            } else {
                c27963ooOO = new C27963ooOO(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0oO = c27963ooOO.f99143OooOooO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c27963ooOO.f99145Oooo000;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooO0oO);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0o0(androidx.core.app.OooO.OooO0O0(c20358OooO00o, "DriveCloudDS", "pullDriveFileSnapshots: starting for driveId=", str4), new Object[0]);
            c27963ooOO.f99137OooOo0o = this;
            c27963ooOO.f99136OooOo = str4;
            c27963ooOO.f99145Oooo000 = 1;
            objOooO0oo = this.f98678OooO00o.OooO0oo(c27963ooOO);
            if (objOooO0oo != enumC32485OooO00o) {
                abstractC27907OooOo0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str4 = c27963ooOO.f99136OooOo;
            abstractC27907OooOo0O = c27963ooOO.f99137OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
            objOooO0oo = ((C32445OooOOOO) objOooO0oO).f116639OooOo0o;
        } else {
            if (i2 == 2) {
                str4 = c27963ooOO.f99136OooOo;
                abstractC27907OooOo0O = c27963ooOO.f99137OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                abstractC27907OooOo0O2 = abstractC27907OooOo0O;
                o00000o02 = new o00000O0(C34434OooOoO.f123453OooOo0o, (List) objOooO0oO, null);
                list = o00000o02.f98987OooO00o;
                if (!list.isEmpty()) {
                    InterfaceC35021OooOOo interfaceC35021OooOOo = abstractC27907OooOo0O2.f98683OooO0o0;
                    c27963ooOO.f99137OooOo0o = abstractC27907OooOo0O2;
                    c27963ooOO.f99136OooOo = str4;
                    c27963ooOO.f99139OooOoO0 = o00000o02;
                    c27963ooOO.f99138OooOoO = list;
                    c27963ooOO.f99145Oooo000 = 3;
                    if (interfaceC35021OooOOo.OooO0o0(list, c27963ooOO) != enumC32485OooO00o) {
                        str2 = str4;
                        list2 = list;
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("DriveCloudDS");
                        c20358OooO00o2.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(list2.size(), "pullDriveFileSnapshots: upserted ", " snapshots"), new Object[0]);
                        list = list2;
                        str4 = str2;
                    }
                    return enumC32485OooO00o;
                }
                list3 = o00000o02.f98988OooO0O0;
                if (!list3.isEmpty()) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("DriveCloudDS");
                int size = list.size();
                int size2 = list3.size();
                String str5 = o00000o02.f98989OooO0OO;
                StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("pullDriveFileSnapshots: completed, updated=", size, ", deleted=", ", cursor=", size2);
                sbOooO0O0.append(str5);
                c20358OooO00o3.OooO0o0(sbOooO0O0.toString(), new Object[0]);
                return o00000o02;
            }
            if (i2 == 3) {
                list2 = c27963ooOO.f99138OooOoO;
                o00000o02 = c27963ooOO.f99139OooOoO0;
                str2 = c27963ooOO.f99136OooOo;
                abstractC27907OooOo0O2 = c27963ooOO.f99137OooOo0o;
                C32446OooOOOo.OooO0O0(objOooO0oO);
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0("DriveCloudDS");
                c20358OooO00o22.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(list2.size(), "pullDriveFileSnapshots: upserted ", " snapshots"), new Object[0]);
                list = list2;
                str4 = str2;
                list3 = o00000o02.f98988OooO0O0;
                if (!list3.isEmpty()) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    str3 = str4;
                    it = oOo000Oo.OooOo.Oooo00O(list3, 100).iterator();
                    list4 = list;
                    o00000o03 = o00000o02;
                    list5 = list3;
                    if (it.hasNext()) {
                    }
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o32.OooOOO0("DriveCloudDS");
                int size3 = list.size();
                int size22 = list3.size();
                String str52 = o00000o02.f98989OooO0OO;
                StringBuilder sbOooO0O02 = C20398OooO0O0.OooO0O0("pullDriveFileSnapshots: completed, updated=", size3, ", deleted=", ", cursor=", size22);
                sbOooO0O02.append(str52);
                c20358OooO00o32.OooO0o0(sbOooO0O02.toString(), new Object[0]);
                return o00000o02;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = c27963ooOO.f99141OooOoo;
            it = c27963ooOO.f99142OooOoo0;
            list5 = c27963ooOO.f99140OooOoOO;
            list4 = c27963ooOO.f99138OooOoO;
            o00000O0 o00000o04 = c27963ooOO.f99139OooOoO0;
            String str6 = c27963ooOO.f99136OooOo;
            AbstractC27907OooOo0O abstractC27907OooOo0O3 = c27963ooOO.f99137OooOo0o;
            C32446OooOOOo.OooO0O0(objOooO0oO);
            o00000o03 = o00000o04;
            str3 = str6;
            jCurrentTimeMillis = j;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
            if (it.hasNext()) {
                List list6 = (List) it.next();
                InterfaceC35021OooOOo interfaceC35021OooOOo2 = abstractC27907OooOo0O2.f98683OooO0o0;
                c27963ooOO.f99137OooOo0o = abstractC27907OooOo0O2;
                c27963ooOO.f99136OooOo = str3;
                c27963ooOO.f99139OooOoO0 = o00000o03;
                c27963ooOO.f99138OooOoO = list4;
                c27963ooOO.f99140OooOoOO = list5;
                c27963ooOO.f99142OooOoo0 = it;
                c27963ooOO.f99141OooOoo = jCurrentTimeMillis;
                c27963ooOO.f99145Oooo000 = 4;
                long j2 = jCurrentTimeMillis;
                C27963ooOO c27963ooOO2 = c27963ooOO;
                if (interfaceC35021OooOOo2.OooO0oo(list6, str3, j2, c27963ooOO2) != enumC32485OooO00o) {
                    jCurrentTimeMillis = j2;
                    c27963ooOO = c27963ooOO2;
                    if (it.hasNext()) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("DriveCloudDS");
                        c20358OooO00o4.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(list5.size(), "pullDriveFileSnapshots: marked ", " files as recycled"), new Object[0]);
                        list3 = list5;
                        o00000o02 = o00000o03;
                        list = list4;
                        C34406OooO00o.C20358OooO00o c20358OooO00o322 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o322.OooOOO0("DriveCloudDS");
                        int size32 = list.size();
                        int size222 = list3.size();
                        String str522 = o00000o02.f98989OooO0OO;
                        StringBuilder sbOooO0O022 = C20398OooO0O0.OooO0O0("pullDriveFileSnapshots: completed, updated=", size32, ", deleted=", ", cursor=", size222);
                        sbOooO0O022.append(str522);
                        c20358OooO00o322.OooO0o0(sbOooO0O022.toString(), new Object[0]);
                        return o00000o02;
                    }
                }
                return enumC32485OooO00o;
            }
        }
        if (!(objOooO0oo instanceof C32445OooOOOO.OooO00o)) {
            C32446OooOOOo.OooO0O0(objOooO0oo);
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            o00000o02 = (o00000O0) objOooO0oo;
            list = o00000o02.f98987OooO00o;
            if (!list.isEmpty()) {
            }
            list3 = o00000o02.f98988OooO0O0;
            if (!list3.isEmpty()) {
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3222 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3222.OooOOO0("DriveCloudDS");
            int size322 = list.size();
            int size2222 = list3.size();
            String str5222 = o00000o02.f98989OooO0OO;
            StringBuilder sbOooO0O0222 = C20398OooO0O0.OooO0O0("pullDriveFileSnapshots: completed, updated=", size322, ", deleted=", ", cursor=", size2222);
            sbOooO0O0222.append(str5222);
            c20358OooO00o3222.OooO0o0(sbOooO0O0222.toString(), new Object[0]);
            return o00000o02;
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0oo);
        if (!(thOooO00o instanceof o0OO000.OooOO0) || !kotlin.jvm.internal.OooOOO0.OooO0O0(((o0OO000.OooOO0) thOooO00o).f90831OooOo0o, "1007")) {
            if (thOooO00o == null) {
                throw new IllegalStateException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown error fetching Drive snapshots for driveId=", str4));
            }
            throw thOooO00o;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o5.OooOOO0("DriveCloudDS");
        c20358OooO00o5.OooOO0O("pullDriveFileSnapshots: root folder not found, marking all cached as deleted", new Object[0]);
        InterfaceC35021OooOOo interfaceC35021OooOOo3 = abstractC27907OooOo0O.f98683OooO0o0;
        c27963ooOO.f99137OooOo0o = abstractC27907OooOo0O;
        c27963ooOO.f99136OooOo = str4;
        c27963ooOO.f99145Oooo000 = 2;
        objOooO0oO = interfaceC35021OooOOo3.OooO0oO(str4, c27963ooOO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a3, code lost:
    
        if (r7.OoooO(r5, r1, (o0OOooO0.AbstractC27907OooOo0O.C27912OooOO0o) r2, r3) != r4) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String, o0OOooO0.OooOo0O, o0OOooO0.OooOo0O$OooOOOo] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o0ooOOo(String str, AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        o00O0O o00o0o2;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        String str2;
        C27913OooOOOo c27913OooOOOo;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        Object objOoooO00;
        C27913OooOOOo c27913OooOOOo2;
        Set<String> set;
        String str3;
        ?? r6;
        C27913OooOOOo c27913OooOOOo3;
        String str4;
        AbstractC27907OooOo0O abstractC27907OooOo0O3;
        String str5;
        String str6 = str;
        if (abstractC32479OooO0OO instanceof o00O0O) {
            o00o0o2 = (o00O0O) abstractC32479OooO0OO;
            int i = o00o0o2.f99018OooOoo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o0o2.f99018OooOoo = i - Integer.MIN_VALUE;
            } else {
                o00o0o2 = new o00O0O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooooo0 = o00o0o2.f99017OooOoOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o00o0o2.f99018OooOoo;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(objOooooo0);
            o00o0o2.f99014OooOo0o = this;
            o00o0o2.f99013OooOo = str6;
            o00o0o2.f99018OooOoo = 1;
            objOooooo0 = Oooooo0(str6, o00o0o2);
            if (objOooooo0 != enumC32485OooO00o) {
                abstractC27907OooOo0O = this;
            }
            return enumC32485OooO00o;
        }
        if (i2 == 1) {
            str6 = o00o0o2.f99013OooOo;
            abstractC27907OooOo0O = o00o0o2.f99014OooOo0o;
            C32446OooOOOo.OooO0O0(objOooooo0);
        } else {
            if (i2 == 2) {
                c27913OooOOOo = o00o0o2.f99016OooOoO0;
                str2 = o00o0o2.f99013OooOo;
                abstractC27907OooOo0O2 = o00o0o2.f99014OooOo0o;
                C32446OooOOOo.OooO0O0(objOooooo0);
                Set set2 = (Set) objOooooo0;
                o00o0o2.f99014OooOo0o = abstractC27907OooOo0O2;
                o00o0o2.f99013OooOo = str2;
                o00o0o2.f99016OooOoO0 = c27913OooOOOo;
                o00o0o2.f99015OooOoO = set2;
                o00o0o2.f99018OooOoo = 3;
                objOoooO00 = abstractC27907OooOo0O2.OoooO00(str2, set2, o00o0o2);
                if (objOoooO00 != enumC32485OooO00o) {
                    String str7 = str2;
                    c27913OooOOOo2 = c27913OooOOOo;
                    set = set2;
                    objOooooo0 = objOoooO00;
                    str3 = str7;
                    OooO oooO = (OooO) objOooooo0;
                    abstractC27907OooOo0O2.getClass();
                    C32463OooO c32463OooO = new C32463OooO();
                    while (r1.hasNext()) {
                    }
                    C32463OooO c32463OooOOooO0Oo = C34449Oooo0oo.OooO0Oo(c32463OooO);
                    o00o0o2.f99014OooOo0o = abstractC27907OooOo0O2;
                    o00o0o2.f99013OooOo = str3;
                    o00o0o2.f99016OooOoO0 = c27913OooOOOo2;
                    r6 = 0;
                    o00o0o2.f99015OooOoO = null;
                    o00o0o2.f99018OooOoo = 4;
                    objOooooo0 = abstractC27907OooOo0O2.oo000o(str3, c32463OooOOooO0Oo, oooO, o00o0o2);
                    if (objOooooo0 != enumC32485OooO00o) {
                    }
                }
                return enumC32485OooO00o;
            }
            if (i2 == 3) {
                set = o00o0o2.f99015OooOoO;
                c27913OooOOOo2 = o00o0o2.f99016OooOoO0;
                str3 = o00o0o2.f99013OooOo;
                abstractC27907OooOo0O2 = o00o0o2.f99014OooOo0o;
                C32446OooOOOo.OooO0O0(objOooooo0);
                OooO oooO2 = (OooO) objOooooo0;
                abstractC27907OooOo0O2.getClass();
                C32463OooO c32463OooO2 = new C32463OooO();
                for (String str8 : set) {
                    CloudMetaLocalEntity cloudMetaLocalEntity = oooO2.f98692OooO00o.get(str8);
                    CloudMetaRemoteEntity cloudMetaRemoteEntity = oooO2.f98693OooO0O0.get(str8);
                    DriveSnapshotCacheEntity driveSnapshotCacheEntity = (DriveSnapshotCacheEntity) oooO2.f98694OooO0OO.get(str8);
                    if (cloudMetaLocalEntity == null) {
                        str5 = (cloudMetaRemoteEntity == null && driveSnapshotCacheEntity == null) ? null : "local meta missing, remote exists";
                    } else if (cloudMetaRemoteEntity != null || driveSnapshotCacheEntity != null) {
                        if (cloudMetaRemoteEntity == null && driveSnapshotCacheEntity != null) {
                            str5 = "remote meta missing but snapshot exists";
                        } else if (cloudMetaRemoteEntity != null && driveSnapshotCacheEntity == null) {
                            str5 = "snapshot missing but remote meta exists";
                        } else if (cloudMetaRemoteEntity != null && driveSnapshotCacheEntity != null) {
                            boolean z = cloudMetaLocalEntity.getMetaVersion() != cloudMetaRemoteEntity.getMetaVersion();
                            boolean z2 = (driveSnapshotCacheEntity.getCTag().matches(cloudMetaLocalEntity.getContentTag()) && driveSnapshotCacheEntity.getCTag().matches(cloudMetaRemoteEntity.getContentTag())) ? false : true;
                            if (z || z2) {
                                str5 = "version mismatch=" + z + ", content mismatch=" + z2;
                            }
                        }
                    }
                    if (str5 != null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "DriveCloudDS", "detectChangedMetaIds: ", str8, " - ");
                        sbOooO00o.append(str5);
                        c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                        c32463OooO2.add(str8);
                    }
                }
                C32463OooO c32463OooOOooO0Oo2 = C34449Oooo0oo.OooO0Oo(c32463OooO2);
                o00o0o2.f99014OooOo0o = abstractC27907OooOo0O2;
                o00o0o2.f99013OooOo = str3;
                o00o0o2.f99016OooOoO0 = c27913OooOOOo2;
                r6 = 0;
                o00o0o2.f99015OooOoO = null;
                o00o0o2.f99018OooOoo = 4;
                objOooooo0 = abstractC27907OooOo0O2.oo000o(str3, c32463OooOOooO0Oo2, oooO2, o00o0o2);
                if (objOooooo0 != enumC32485OooO00o) {
                    c27913OooOOOo3 = c27913OooOOOo2;
                    str4 = str3;
                    abstractC27907OooOo0O3 = abstractC27907OooOo0O2;
                    o00o0o2.f99014OooOo0o = r6;
                    o00o0o2.f99013OooOo = r6;
                    o00o0o2.f99016OooOoO0 = r6;
                    o00o0o2.f99018OooOoo = 5;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooooo0);
                return C32460OooOooO.f116667OooO00o;
            }
            c27913OooOOOo3 = o00o0o2.f99016OooOoO0;
            str4 = o00o0o2.f99013OooOo;
            abstractC27907OooOo0O3 = o00o0o2.f99014OooOo0o;
            C32446OooOOOo.OooO0O0(objOooooo0);
            r6 = 0;
            o00o0o2.f99014OooOo0o = r6;
            o00o0o2.f99013OooOo = r6;
            o00o0o2.f99016OooOoO0 = r6;
            o00o0o2.f99018OooOoo = 5;
        }
        C27913OooOOOo c27913OooOOOo4 = (C27913OooOOOo) objOooooo0;
        o00o0o2.f99014OooOo0o = abstractC27907OooOo0O;
        o00o0o2.f99013OooOo = str6;
        o00o0o2.f99016OooOoO0 = c27913OooOOOo4;
        o00o0o2.f99018OooOoo = 2;
        Object objO00ooo = abstractC27907OooOo0O.o00ooo(str6, c27913OooOOOo4, o00o0o2);
        if (objO00ooo != enumC32485OooO00o) {
            AbstractC27907OooOo0O abstractC27907OooOo0O4 = abstractC27907OooOo0O;
            str2 = str6;
            c27913OooOOOo = c27913OooOOOo4;
            objOooooo0 = objO00ooo;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O4;
            Set set22 = (Set) objOooooo0;
            o00o0o2.f99014OooOo0o = abstractC27907OooOo0O2;
            o00o0o2.f99013OooOo = str2;
            o00o0o2.f99016OooOoO0 = c27913OooOOOo;
            o00o0o2.f99015OooOoO = set22;
            o00o0o2.f99018OooOoo = 3;
            objOoooO00 = abstractC27907OooOo0O2.OoooO00(str2, set22, o00o0o2);
            if (objOoooO00 != enumC32485OooO00o) {
            }
        }
        return enumC32485OooO00o;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:25|(1:122)|26|27|118|28|29|128|30|31|124|32|33|132|34|35|(28:38|112|39|126|40|41|42|(0)|49|50|134|51|52|120|53|116|54|55|108|56|57|130|58|59|60|90|21|(3:93|(1:98)|(5:102|103|(0)|106|107))(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:25|122|26|27|118|28|29|128|30|31|124|32|33|132|34|35|(28:38|112|39|126|40|41|42|(0)|49|50|134|51|52|120|53|116|54|55|108|56|57|130|58|59|60|90|21|(3:93|(1:98)|(5:102|103|(0)|106|107))(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:15|(3:110|16|17)|(1:112)|39|126|40|41|42|(3:44|114|45)|49|50|134|51|52|120|53|116|54|55|108|56|57|130|58|59|60|90|21|(2:23|(17:25|122|26|27|118|28|29|128|30|31|124|32|33|132|34|35|(28:38|112|39|126|40|41|42|(0)|49|50|134|51|52|120|53|116|54|55|108|56|57|130|58|59|60|90|21|(3:93|(1:98)|(5:102|103|(0)|106|107))(0)))(2:91|92))(0)|101) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:15|110|16|17|112|39|126|40|41|42|(3:44|114|45)|49|50|134|51|52|120|53|116|54|55|108|56|57|130|58|59|60|90|21|(2:23|(17:25|122|26|27|118|28|29|128|30|31|124|32|33|132|34|35|(28:38|112|39|126|40|41|42|(0)|49|50|134|51|52|120|53|116|54|55|108|56|57|130|58|59|60|90|21|(3:93|(1:98)|(5:102|103|(0)|106|107))(0)))(2:91|92))(0)|101) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a8, code lost:
    
        r1 = r25;
        r4 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ac, code lost:
    
        r19 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b1, code lost:
    
        r27 = r5;
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b7, code lost:
    
        r27 = r5;
        r5 = r22;
        r1 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c1, code lost:
    
        r26 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c5, code lost:
    
        r27 = r5;
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01da, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01db, code lost:
    
        r25 = r1;
        r26 = r4;
        r27 = r5;
        r5 = r22;
        r9 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01e7, code lost:
    
        r4 = r16;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ec, code lost:
    
        r7 = r25;
        r15 = r10;
        r12 = r13;
        r13 = r14;
        r10 = r17;
        r14 = r20;
        r17 = r4;
        r4 = r11;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fa, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01fb, code lost:
    
        r17 = r1;
        r19 = r4;
        r1 = r7;
        r20 = r12;
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0203, code lost:
    
        r5 = r22;
        r9 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0208, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0209, code lost:
    
        r17 = r1;
        r19 = r4;
        r1 = r7;
        r20 = r12;
        r4 = r15;
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0214, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0215, code lost:
    
        r17 = r1;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0219, code lost:
    
        r5 = r6;
        r1 = r7;
        r20 = r12;
        r4 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0127 -> B:112:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01ec -> B:89:0x0227). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object oo000o(String str, C32463OooO c32463OooO, OooO oooO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C27950OoooooO c27950OoooooO;
        AbstractC27907OooOo0O abstractC27907OooOo0O;
        AbstractC27907OooOo0O abstractC27907OooOo0O2;
        int i;
        Iterator it;
        C27911OooO0oo c27911OooO0oo;
        int i2;
        List list;
        C27950OoooooO c27950OoooooO2;
        C24030OooOoo c24030OooOoo;
        String str2;
        OooO oooO2;
        Object objEmit;
        List list2;
        C24030OooOoo c24030OooOoo2;
        String str3;
        OooO oooO3;
        List list3;
        String str4;
        String str5;
        String str6;
        Object objO00oO0o;
        C27950OoooooO c27950OoooooO3;
        OooO oooO4;
        if (abstractC32479OooO0OO instanceof C27950OoooooO) {
            c27950OoooooO = (C27950OoooooO) abstractC32479OooO0OO;
            int i3 = c27950OoooooO.f98956Oooo0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c27950OoooooO.f98956Oooo0 = i3 - Integer.MIN_VALUE;
                abstractC27907OooOo0O = this;
            } else {
                abstractC27907OooOo0O = this;
                c27950OoooooO = new C27950OoooooO(abstractC27907OooOo0O, abstractC32479OooO0OO);
            }
        }
        Object obj = c27950OoooooO.f98958Oooo00O;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c27950OoooooO.f98956Oooo0;
        String str7 = "Batch ";
        String str8 = "DriveCloudDS";
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ArrayList arrayList = new ArrayList();
            C24030OooOoo c24030OooOoo3 = new C24030OooOoo();
            int iOooO0O0 = (c32463OooO.OooO0O0() + 99) / 100;
            C27911OooO0oo c27911OooO0oo2 = new C27911OooO0oo();
            abstractC27907OooOo0O2 = abstractC27907OooOo0O;
            i = iOooO0O0;
            it = oOo000Oo.OooOo.oo0o0Oo(100, 100, oOo000Oo.OooOo.o0ooOO0(c32463OooO)).iterator();
            c27911OooO0oo = c27911OooO0oo2;
            i2 = 0;
            list = arrayList;
            c27950OoooooO2 = c27950OoooooO;
            c24030OooOoo = c24030OooOoo3;
            str2 = str;
            oooO2 = oooO;
            if (!it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c24030OooOoo2 = (C24030OooOoo) c27950OoooooO.f98947OooOo;
            list2 = (List) c27950OoooooO.f98948OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            if (!list2.isEmpty()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0(str8);
                c20358OooO00o.OooO0o0(Oooo0oO.o0Oo0oo.OooO0O0(list2.size(), "processChanges: emitted ", " events"), new Object[0]);
            }
            return new C27912OooOO0o(list2.size(), c24030OooOoo2.f80938OooOo0o);
        }
        int i5 = c27950OoooooO.f98957Oooo000;
        i2 = c27950OoooooO.f98955OooOooo;
        int i6 = c27950OoooooO.f98954OooOooO;
        Iterator it2 = c27950OoooooO.f98952OooOoo;
        C27911OooO0oo c27911OooO0oo3 = c27950OoooooO.f98953OooOoo0;
        C24030OooOoo c24030OooOoo4 = c27950OoooooO.f98951OooOoOO;
        List list4 = c27950OoooooO.f98949OooOoO;
        OooO oooO5 = c27950OoooooO.f98950OooOoO0;
        String str9 = (String) c27950OoooooO.f98947OooOo;
        AbstractC27907OooOo0O abstractC27907OooOo0O3 = (AbstractC27907OooOo0O) c27950OoooooO.f98948OooOo0o;
        try {
            C32446OooOOOo.OooO0O0(obj);
            str5 = "Batch ";
            str6 = "DriveCloudDS";
            objO00oO0o = obj;
        } catch (Exception e) {
            e = e;
            oooO3 = oooO5;
            str4 = "Batch ";
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0(str8);
            c27950OoooooO3 = c27950OoooooO;
            c20358OooO00o2.OooO0Oo(e, C20856OooooOo.OooO0O0(str4, i5 + 1, "/", " failed", i6), new Object[0]);
            c24030OooOoo4.f80938OooOo0o = true;
            oooO2 = oooO3;
            Iterator it3 = it2;
            i = i6;
            c27911OooO0oo = c27911OooO0oo3;
            it = it3;
            str2 = str9;
            c24030OooOoo = c24030OooOoo4;
            abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
            str7 = str4;
            list = list4;
            c27950OoooooO2 = c27950OoooooO3;
            if (!it.hasNext()) {
            }
            return enumC32485OooO00o;
        }
        try {
        } catch (Exception e2) {
            e = e2;
            oooO4 = oooO5;
            str4 = str5;
            str8 = str6;
        }
        OooO00o oooO00o = (OooO00o) objO00oO0o;
        ArrayList arrayList2 = oooO00o.f98695OooO00o;
        ArrayList arrayList3 = oooO00o.f98696OooO0O0;
        list4.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            try {
            } catch (Exception e3) {
                e = e3;
                oooO3 = oooO5;
                str4 = str5;
                str8 = str6;
                C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o22.OooOOO0(str8);
                c27950OoooooO3 = c27950OoooooO;
                c20358OooO00o22.OooO0Oo(e, C20856OooooOo.OooO0O0(str4, i5 + 1, "/", " failed", i6), new Object[0]);
                c24030OooOoo4.f80938OooOo0o = true;
                oooO2 = oooO3;
                Iterator it32 = it2;
                i = i6;
                c27911OooO0oo = c27911OooO0oo3;
                it = it32;
                str2 = str9;
                c24030OooOoo = c24030OooOoo4;
                abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
                str7 = str4;
                list = list4;
                c27950OoooooO2 = c27950OoooooO3;
                if (!it.hasNext()) {
                }
                return enumC32485OooO00o;
            }
            c24030OooOoo4.f80938OooOo0o = true;
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        str8 = str6;
        c20358OooO00o3.OooOOO0(str8);
        c27950OoooooO3 = c27950OoooooO;
        int i7 = i5 + 1;
        int size = oooO00o.f98695OooO00o.size();
        int size2 = arrayList3.size();
        int i8 = i5;
        StringBuilder sb = new StringBuilder();
        oooO4 = oooO5;
        str4 = str5;
        sb.append(str4);
        sb.append(i7);
        sb.append("/");
        sb.append(i6);
        sb.append(" completed, events: ");
        sb.append(size);
        sb.append(", failed: ");
        sb.append(size2);
        c20358OooO00o3.OooO0o0(sb.toString(), new Object[0]);
        oooO2 = oooO4;
        Iterator it322 = it2;
        i = i6;
        c27911OooO0oo = c27911OooO0oo3;
        it = it322;
        str2 = str9;
        c24030OooOoo = c24030OooOoo4;
        abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
        str7 = str4;
        list = list4;
        c27950OoooooO2 = c27950OoooooO3;
        if (!it.hasNext()) {
            Object next = it.next();
            int i9 = i2 + 1;
            if (i2 < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            List list5 = (List) next;
            try {
            } catch (Exception e4) {
                e = e4;
                str3 = str2;
                oooO3 = oooO2;
                list3 = list;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0(str8);
            list3 = list;
            int size3 = list5.size();
            str5 = str7;
            StringBuilder sb2 = new StringBuilder();
            str6 = str8;
            sb2.append("Processing batch ");
            sb2.append(i9);
            sb2.append("/");
            sb2.append(i);
            sb2.append(", size: ");
            sb2.append(size3);
            c20358OooO00o4.OooO0o0(sb2.toString(), new Object[0]);
            c27950OoooooO2.f98948OooOo0o = abstractC27907OooOo0O2;
            c27950OoooooO2.f98947OooOo = str2;
            c27950OoooooO2.f98950OooOoO0 = oooO2;
            c27950OoooooO2.f98949OooOoO = list3;
            c27950OoooooO2.f98951OooOoOO = c24030OooOoo;
            c27950OoooooO2.f98953OooOoo0 = c27911OooO0oo;
            c27950OoooooO2.f98952OooOoo = it;
            c27950OoooooO2.f98954OooOooO = i;
            c27950OoooooO2.f98955OooOooo = i9;
            c27950OoooooO2.f98957Oooo000 = i2;
            c27950OoooooO2.f98956Oooo0 = 1;
            str3 = str2;
            oooO3 = oooO2;
            C27950OoooooO c27950OoooooO4 = c27950OoooooO2;
            C27911OooO0oo c27911OooO0oo4 = c27911OooO0oo;
            AbstractC27907OooOo0O abstractC27907OooOo0O4 = abstractC27907OooOo0O2;
            objO00oO0o = abstractC27907OooOo0O4.o00oO0o(str3, list5, oooO3, c27911OooO0oo4, c27950OoooooO4);
            c27950OoooooO = c27950OoooooO4;
            if (objO00oO0o != enumC32485OooO00o) {
                list4 = list3;
                c24030OooOoo4 = c24030OooOoo;
                i6 = i;
                it2 = it;
                str9 = str3;
                oooO5 = oooO3;
                c27911OooO0oo3 = c27911OooO0oo4;
                abstractC27907OooOo0O3 = abstractC27907OooOo0O4;
                i5 = i2;
                i2 = i9;
                OooO00o oooO00o2 = (OooO00o) objO00oO0o;
                ArrayList arrayList22 = oooO00o2.f98695OooO00o;
                ArrayList arrayList32 = oooO00o2.f98696OooO0O0;
                list4.addAll(arrayList22);
                if (!arrayList32.isEmpty()) {
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                str8 = str6;
                c20358OooO00o32.OooOOO0(str8);
                c27950OoooooO3 = c27950OoooooO;
                int i72 = i5 + 1;
                int size4 = oooO00o2.f98695OooO00o.size();
                int size22 = arrayList32.size();
                int i82 = i5;
                StringBuilder sb3 = new StringBuilder();
                oooO4 = oooO5;
                str4 = str5;
                sb3.append(str4);
                sb3.append(i72);
                sb3.append("/");
                sb3.append(i6);
                sb3.append(" completed, events: ");
                sb3.append(size4);
                sb3.append(", failed: ");
                sb3.append(size22);
                c20358OooO00o32.OooO0o0(sb3.toString(), new Object[0]);
                oooO2 = oooO4;
                Iterator it3222 = it2;
                i = i6;
                c27911OooO0oo = c27911OooO0oo3;
                it = it3222;
                str2 = str9;
                c24030OooOoo = c24030OooOoo4;
                abstractC27907OooOo0O2 = abstractC27907OooOo0O3;
                str7 = str4;
                list = list4;
                c27950OoooooO2 = c27950OoooooO3;
                if (!it.hasNext()) {
                    C27950OoooooO c27950OoooooO5 = c27950OoooooO2;
                    AbstractC27907OooOo0O abstractC27907OooOo0O5 = abstractC27907OooOo0O2;
                    List list6 = list;
                    c27950OoooooO5.f98948OooOo0o = list6;
                    c27950OoooooO5.f98947OooOo = c24030OooOoo;
                    c27950OoooooO5.f98950OooOoO0 = null;
                    c27950OoooooO5.f98949OooOoO = null;
                    c27950OoooooO5.f98951OooOoOO = null;
                    c27950OoooooO5.f98953OooOoo0 = null;
                    c27950OoooooO5.f98952OooOoo = null;
                    c27950OoooooO5.f98956Oooo0 = 2;
                    abstractC27907OooOo0O5.getClass();
                    if (list6.isEmpty() || (objEmit = abstractC27907OooOo0O5.f98689OooOOO.emit(new CloudEvent.MetaBatchEvent(list6), c27950OoooooO5)) != EnumC32485OooO00o.f116726OooOo0o) {
                        objEmit = C32460OooOooO.f116667OooO00o;
                    }
                    if (objEmit != enumC32485OooO00o) {
                        list2 = list6;
                        c24030OooOoo2 = c24030OooOoo;
                        if (!list2.isEmpty()) {
                        }
                        return new C27912OooOO0o(list2.size(), c24030OooOoo2.f80938OooOo0o);
                    }
                }
            }
        }
        return enumC32485OooO00o;
    }
}
