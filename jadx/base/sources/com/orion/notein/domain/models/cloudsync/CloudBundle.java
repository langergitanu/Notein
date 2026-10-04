package com.orion.notein.domain.models.cloudsync;

import OooO.OooO00o;
import com.huawei.hms.network.embedded.C18437z2;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003JC\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudBundle;", "", "file", "Ljava/io/File;", "contentTag", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "extra", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "metaHash", "", "mimeType", "<init>", "(Ljava/io/File;Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/io/File;", "getContentTag", "()Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "getExtra", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "getMetaHash", "()Ljava/lang/String;", "getMimeType", C18437z2.f56754h, "Lcom/orion/notein/domain/models/cloudsync/CloudBundle$BundleType;", "getType", "()Lcom/orion/notein/domain/models/cloudsync/CloudBundle$BundleType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "BundleType", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudBundle {
    private final CloudContentTag contentTag;
    private final CloudMetaExtra extra;
    private final File file;
    private final String metaHash;
    private final String mimeType;
    private final BundleType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudBundle$BundleType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "META_ONLY", "CONTENT_AND_META", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class BundleType {
        private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
        private static final /* synthetic */ BundleType[] $VALUES;
        public static final BundleType NONE = new BundleType("NONE", 0);
        public static final BundleType META_ONLY = new BundleType("META_ONLY", 1);
        public static final BundleType CONTENT_AND_META = new BundleType("CONTENT_AND_META", 2);

        private static final /* synthetic */ BundleType[] $values() {
            return new BundleType[]{NONE, META_ONLY, CONTENT_AND_META};
        }

        static {
            BundleType[] bundleTypeArr$values = $values();
            $VALUES = bundleTypeArr$values;
            $ENTRIES = OooO00o.OooO0O0(bundleTypeArr$values);
        }

        private BundleType(String str, int i) {
        }

        public static InterfaceC34452OooO00o<BundleType> getEntries() {
            return $ENTRIES;
        }

        public static BundleType valueOf(String str) {
            return (BundleType) Enum.valueOf(BundleType.class, str);
        }

        public static BundleType[] values() {
            return (BundleType[]) $VALUES.clone();
        }
    }

    public CloudBundle(File file, CloudContentTag cloudContentTag, CloudMetaExtra cloudMetaExtra, String str, String mimeType) {
        OooOOO0.OooO0oO(mimeType, "mimeType");
        this.file = file;
        this.contentTag = cloudContentTag;
        this.extra = cloudMetaExtra;
        this.metaHash = str;
        this.mimeType = mimeType;
        this.type = (file == null && cloudMetaExtra == null) ? BundleType.NONE : file == null ? BundleType.META_ONLY : BundleType.CONTENT_AND_META;
    }

    public static /* synthetic */ CloudBundle copy$default(CloudBundle cloudBundle, File file, CloudContentTag cloudContentTag, CloudMetaExtra cloudMetaExtra, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            file = cloudBundle.file;
        }
        if ((i & 2) != 0) {
            cloudContentTag = cloudBundle.contentTag;
        }
        if ((i & 4) != 0) {
            cloudMetaExtra = cloudBundle.extra;
        }
        if ((i & 8) != 0) {
            str = cloudBundle.metaHash;
        }
        if ((i & 16) != 0) {
            str2 = cloudBundle.mimeType;
        }
        String str3 = str2;
        CloudMetaExtra cloudMetaExtra2 = cloudMetaExtra;
        return cloudBundle.copy(file, cloudContentTag, cloudMetaExtra2, str, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CloudContentTag getContentTag() {
        return this.contentTag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CloudMetaExtra getExtra() {
        return this.extra;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMetaHash() {
        return this.metaHash;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final CloudBundle copy(File file, CloudContentTag contentTag, CloudMetaExtra extra, String metaHash, String mimeType) {
        OooOOO0.OooO0oO(mimeType, "mimeType");
        return new CloudBundle(file, contentTag, extra, metaHash, mimeType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudBundle)) {
            return false;
        }
        CloudBundle cloudBundle = (CloudBundle) other;
        return OooOOO0.OooO0O0(this.file, cloudBundle.file) && OooOOO0.OooO0O0(this.contentTag, cloudBundle.contentTag) && OooOOO0.OooO0O0(this.extra, cloudBundle.extra) && OooOOO0.OooO0O0(this.metaHash, cloudBundle.metaHash) && OooOOO0.OooO0O0(this.mimeType, cloudBundle.mimeType);
    }

    public final CloudContentTag getContentTag() {
        return this.contentTag;
    }

    public final CloudMetaExtra getExtra() {
        return this.extra;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getMetaHash() {
        return this.metaHash;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final BundleType getType() {
        return this.type;
    }

    public int hashCode() {
        File file = this.file;
        int iHashCode = (file == null ? 0 : file.hashCode()) * 31;
        CloudContentTag cloudContentTag = this.contentTag;
        int iHashCode2 = (iHashCode + (cloudContentTag == null ? 0 : cloudContentTag.hashCode())) * 31;
        CloudMetaExtra cloudMetaExtra = this.extra;
        int iHashCode3 = (iHashCode2 + (cloudMetaExtra == null ? 0 : cloudMetaExtra.hashCode())) * 31;
        String str = this.metaHash;
        return this.mimeType.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        File file = this.file;
        CloudContentTag cloudContentTag = this.contentTag;
        CloudMetaExtra cloudMetaExtra = this.extra;
        String str = this.metaHash;
        String str2 = this.mimeType;
        StringBuilder sb = new StringBuilder("CloudBundle(file=");
        sb.append(file);
        sb.append(", contentTag=");
        sb.append(cloudContentTag);
        sb.append(", extra=");
        sb.append(cloudMetaExtra);
        sb.append(", metaHash=");
        sb.append(str);
        sb.append(", mimeType=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, str2, ")");
    }
}
