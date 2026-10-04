package com.orion.notein.domain.models.cloudsync;

import android.support.v4.media.session.OooO00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oo000O.C31190OooO0oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0ooO.InterfaceC33908OooO;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.o000000O;
import oO0oO00.o00000OO;
import oO0oO000.OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC33908OooO
@Metadata(m80611d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000212B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u0012J\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0005¢\u0006\u0004\b&\u0010'J2\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u000fJ\u0010\u0010+\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0006\u00100¨\u00063"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "", "", "sha256Hash", "quickXorHash", "", "lastModified", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "LoO0oO00/o000000O;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLoO0oO00/o000000O;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "self", "LoO0oO000/OooO0O0;", "output", "LoO0o/OooO0o0;", "serialDesc", "LoO00ooO/OooOooO;", "write$Self$app_google_playRelease", "(Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;LoO0oO000/OooO0O0;LoO0o/OooO0o0;)V", "write$Self", "getLastModified", "", "isEmpty", "()Z", "other", "matches", "(Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;)Z", "Ljava/io/File;", "matchesForFile", "(Ljava/io/File;)Z", "isLastModifiedOldThan", "(J)Z", "copy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "toString", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "J", "Companion", "$serializer", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CloudContentTag {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName(alternate = {"last_modified"}, value = "lastModified")
    private long lastModified;

    @SerializedName(alternate = {"quick_xor_hash"}, value = "quickXorHash")
    private final String quickXorHash;

    @SerializedName(alternate = {"sha256_hash"}, value = "sha256Hash")
    private final String sha256Hash;

    @Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudContentTag$Companion;", "", "<init>", "()V", "Ljava/io/File;", "file", "", "lastModified", "Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", Constants.MessagePayloadKeys.FROM, "(Ljava/io/File;J)Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "fromLastModified", "(J)Lcom/orion/notein/domain/models/cloudsync/CloudContentTag;", "LoO0o0ooO/OooO0OO;", "serializer", "()LoO0o0ooO/OooO0OO;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final CloudContentTag from(File file, long lastModified) {
            OooOOO0.OooO0oO(file, "file");
            return new CloudContentTag(C31190OooO0oo.OooOOOo(file), C31190OooO0oo.OooOOOO(file), lastModified);
        }

        public final CloudContentTag fromLastModified(long lastModified) {
            return new CloudContentTag((String) null, (String) null, lastModified, 3, (C24018OooO0oo) null);
        }

        public final InterfaceC33911OooO0OO<CloudContentTag> serializer() {
            return CloudContentTag$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CloudContentTag() {
        this((String) null, (String) null, 0L, 7, (C24018OooO0oo) null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSha256Hash() {
        return this.sha256Hash;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getQuickXorHash() {
        return this.quickXorHash;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final long getLastModified() {
        return this.lastModified;
    }

    public static /* synthetic */ CloudContentTag copy$default(CloudContentTag cloudContentTag, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cloudContentTag.sha256Hash;
        }
        if ((i & 2) != 0) {
            str2 = cloudContentTag.quickXorHash;
        }
        if ((i & 4) != 0) {
            j = cloudContentTag.lastModified;
        }
        return cloudContentTag.copy(str, str2, j);
    }

    public static final /* synthetic */ void write$Self$app_google_playRelease(CloudContentTag self, OooO0O0 output, InterfaceC33531OooO0o0 serialDesc) {
        if (output.OooOoO0(serialDesc) || self.sha256Hash != null) {
            output.OooOo(serialDesc, 0, o00000OO.f122230OooO00o, self.sha256Hash);
        }
        if (output.OooOoO0(serialDesc) || self.quickXorHash != null) {
            output.OooOo(serialDesc, 1, o00000OO.f122230OooO00o, self.quickXorHash);
        }
        if (!output.OooOoO0(serialDesc) && self.lastModified == 0) {
            return;
        }
        output.OooOo0O(serialDesc, 2, self.lastModified);
    }

    public final CloudContentTag copy(String sha256Hash, String quickXorHash, long lastModified) {
        return new CloudContentTag(sha256Hash, quickXorHash, lastModified);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudContentTag)) {
            return false;
        }
        CloudContentTag cloudContentTag = (CloudContentTag) other;
        return OooOOO0.OooO0O0(this.sha256Hash, cloudContentTag.sha256Hash) && OooOOO0.OooO0O0(this.quickXorHash, cloudContentTag.quickXorHash) && this.lastModified == cloudContentTag.lastModified;
    }

    public final long getLastModified() {
        return this.lastModified;
    }

    public int hashCode() {
        String str = this.sha256Hash;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.quickXorHash;
        return Long.hashCode(this.lastModified) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isEmpty() {
        String str = this.sha256Hash;
        if (str != null && !C33599OooOo0O.Oooo0o0(str)) {
            return false;
        }
        String str2 = this.quickXorHash;
        return (str2 == null || C33599OooOo0O.Oooo0o0(str2)) && this.lastModified == 0;
    }

    public final boolean isLastModifiedOldThan(long other) {
        long j = 1000;
        return this.lastModified < (other / j) * j;
    }

    public final boolean matches(CloudContentTag other) {
        if (other == null) {
            return false;
        }
        long j = this.lastModified;
        return j != 0 && j == other.lastModified;
    }

    public final boolean matchesForFile(File other) {
        OooOOO0.OooO0oO(other, "other");
        String str = this.sha256Hash;
        if (str != null && !C33599OooOo0O.Oooo0o0(str)) {
            return C33595OooOOo.OooOOo(this.sha256Hash, C31190OooO0oo.OooOOOo(other), true);
        }
        String str2 = this.quickXorHash;
        if (str2 != null && !C33599OooOo0O.Oooo0o0(str2)) {
            return C33595OooOOo.OooOOo(this.quickXorHash, C31190OooO0oo.OooOOOO(other), true);
        }
        long j = 1000;
        long jLastModified = (other.lastModified() / j) * j;
        long j2 = this.lastModified;
        return j2 != 0 && j2 == jLastModified;
    }

    public String toString() {
        return OooO00o.OooO00o(this.lastModified, ")", OooO0o.OooO0O0("CloudContentTag(sha256Hash=", this.sha256Hash, ", quickXorHash=", this.quickXorHash, ", lastModified="));
    }

    public /* synthetic */ CloudContentTag(int i, String str, String str2, long j, o000000O o000000o2) {
        if ((i & 1) == 0) {
            this.sha256Hash = null;
        } else {
            this.sha256Hash = str;
        }
        if ((i & 2) == 0) {
            this.quickXorHash = null;
        } else {
            this.quickXorHash = str2;
        }
        if ((i & 4) == 0) {
            this.lastModified = 0L;
        } else {
            this.lastModified = j;
        }
        long j2 = this.lastModified;
        long j3 = 1000;
        if (j2 % j3 != 0) {
            this.lastModified = (j2 / j3) * j3;
        }
    }

    public CloudContentTag(String str, String str2, long j) {
        this.sha256Hash = str;
        this.quickXorHash = str2;
        this.lastModified = j;
        long j2 = 1000;
        if (j % j2 != 0) {
            this.lastModified = (j / j2) * j2;
        }
    }

    public /* synthetic */ CloudContentTag(String str, String str2, long j, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j);
    }
}
