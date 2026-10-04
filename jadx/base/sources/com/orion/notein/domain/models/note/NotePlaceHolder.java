package com.orion.notein.domain.models.note;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import com.aspose.slides.internal.p332p7.OooO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.huawei.agconnect.credential.obs.C17625c;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001;B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J_\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\fHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R&\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006<"}, m80612d2 = {"Lcom/orion/notein/domain/models/note/NotePlaceHolder;", "", "id", "", NoteMeta.PROPERTY_PARENT_ID, NoteMeta.PROPERTY_TITLE, C17625c.f52155b, "", "filePath", "uri", "Landroid/net/Uri;", "state", "", "extras", "Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Landroid/net/Uri;ILandroid/os/Bundle;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getParentId", "setParentId", "getTitle", "setTitle", "getCreationTime", "()J", "setCreationTime", "(J)V", "getFilePath", "setFilePath", "getUri$annotations", "()V", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "getState", "()I", "setState", "(I)V", "getExtras", "()Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class NotePlaceHolder {
    public static final int IMPORTING = 0;
    public static final int IMPORT_ERROR = 1;
    public static final String STATE = "state";
    public static final int SYNCING = 4;
    public static final int TO_DOWNLOAD_FROM_CLOUD = 2;
    public static final int TO_SYNC_WITH_CLOUD = 3;
    public static final int WAIT_TO_INPUT_PASSWORD = 5;
    private long creationTime;
    private Bundle extras;
    private String filePath;
    private String id;
    private String parentId;
    private int state;
    private String title;
    private Uri uri;

    public NotePlaceHolder() {
        this(null, null, null, 0L, null, null, 0, null, 255, null);
    }

    public static /* synthetic */ NotePlaceHolder copy$default(NotePlaceHolder notePlaceHolder, String str, String str2, String str3, long j, String str4, Uri uri, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notePlaceHolder.id;
        }
        if ((i2 & 2) != 0) {
            str2 = notePlaceHolder.parentId;
        }
        if ((i2 & 4) != 0) {
            str3 = notePlaceHolder.title;
        }
        if ((i2 & 8) != 0) {
            j = notePlaceHolder.creationTime;
        }
        if ((i2 & 16) != 0) {
            str4 = notePlaceHolder.filePath;
        }
        if ((i2 & 32) != 0) {
            uri = notePlaceHolder.uri;
        }
        if ((i2 & 64) != 0) {
            i = notePlaceHolder.state;
        }
        if ((i2 & 128) != 0) {
            bundle = notePlaceHolder.extras;
        }
        long j2 = j;
        String str5 = str3;
        return notePlaceHolder.copy(str, str2, str5, j2, str4, uri, i, bundle);
    }

    public static /* synthetic */ void getUri$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Bundle getExtras() {
        return this.extras;
    }

    public final NotePlaceHolder copy(String id, String parentId, String title, long creationTime, String filePath, Uri uri, int state, Bundle extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(extras, "extras");
        return new NotePlaceHolder(id, parentId, title, creationTime, filePath, uri, state, extras);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotePlaceHolder)) {
            return false;
        }
        NotePlaceHolder notePlaceHolder = (NotePlaceHolder) other;
        return OooOOO0.OooO0O0(this.id, notePlaceHolder.id) && OooOOO0.OooO0O0(this.parentId, notePlaceHolder.parentId) && OooOOO0.OooO0O0(this.title, notePlaceHolder.title) && this.creationTime == notePlaceHolder.creationTime && OooOOO0.OooO0O0(this.filePath, notePlaceHolder.filePath) && OooOOO0.OooO0O0(this.uri, notePlaceHolder.uri) && this.state == notePlaceHolder.state && OooOOO0.OooO0O0(this.extras, notePlaceHolder.extras);
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getId() {
        return this.id;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final int getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.parentId;
        int iOooO0O0 = C20703o000000o.OooO0O0(OooO00o.OooO0O0((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.creationTime);
        String str2 = this.filePath;
        int iHashCode2 = (iOooO0O0 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Uri uri = this.uri;
        return this.extras.hashCode() + C20785Oooo00o.OooO00o(this.state, (iHashCode2 + (uri != null ? uri.hashCode() : 0)) * 31, 31);
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setExtras(Bundle bundle) {
        OooOOO0.OooO0oO(bundle, "<set-?>");
        this.extras = bundle;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public final void setId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.id = str;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setTitle(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.title = str;
    }

    public final void setUri(Uri uri) {
        this.uri = uri;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.parentId;
        String str3 = this.title;
        long j = this.creationTime;
        String str4 = this.filePath;
        Uri uri = this.uri;
        int i = this.state;
        Bundle bundle = this.extras;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("NotePlaceHolder(id=", str, ", parentId=", str2, ", title=");
        OooO.OooO00o(j, str3, ", creationTime=", sbOooO0O0);
        sbOooO0O0.append(", filePath=");
        sbOooO0O0.append(str4);
        sbOooO0O0.append(", uri=");
        sbOooO0O0.append(uri);
        sbOooO0O0.append(", state=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", extras=");
        sbOooO0O0.append(bundle);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public NotePlaceHolder(String id, String str, String title, long j, String str2, Uri uri, int i, Bundle extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(extras, "extras");
        this.id = id;
        this.parentId = str;
        this.title = title;
        this.creationTime = j;
        this.filePath = str2;
        this.uri = uri;
        this.state = i;
        this.extras = extras;
    }

    public /* synthetic */ NotePlaceHolder(String str, String str2, String str3, long j, String str4, Uri uri, int i, Bundle bundle, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? System.currentTimeMillis() : j, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : uri, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? BundleKt.bundleOf() : bundle);
    }
}
