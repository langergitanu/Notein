package com.orion.notein.domain.models.folder;

import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.hihonor.honorid.core.data.TmemberRight;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\b\u0018\u0000 I2\u00020\u0001:\u0001IB\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u00105\u001a\u0004\u0018\u000106J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010B\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010/J\u008e\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\t2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0010HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b3\u0010/\"\u0004\b4\u00101¨\u0006J"}, m80612d2 = {"Lcom/orion/notein/domain/models/folder/Folder;", "", "id", "", TmemberRight.TAG_USERID, NoteMeta.PROPERTY_PARENT_ID, "recoverParentId", NoteMeta.PROPERTY_TITLE, NoteMeta.PROPERTY_FAVORITE, "", NoteMeta.PROPERTY_IN_TRASH_BIN, C17625c.f52155b, "", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "tnPath", "sortKey", "", "coverColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getUserId", "setUserId", "getParentId", "setParentId", "getRecoverParentId", "setRecoverParentId", "getTitle", "setTitle", "getFavorite", "()Z", "setFavorite", "(Z)V", "getInTrashBin", "setInTrashBin", "getCreationTime", "()J", "setCreationTime", "(J)V", "getLastModificationTime", "setLastModificationTime", "getTnPath", "setTnPath", "getSortKey", "()Ljava/lang/Integer;", "setSortKey", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCoverColor", "setCoverColor", "getTnBitmap", "Landroid/graphics/Bitmap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZJJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/orion/notein/domain/models/folder/Folder;", "equals", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Folder {
    public static final String PROPERTY_FOLDER_ID = "folderId";
    private Integer coverColor;
    private long creationTime;
    private boolean favorite;
    private String id;
    private boolean inTrashBin;
    private long lastModificationTime;
    private String parentId;
    private String recoverParentId;
    private Integer sortKey;
    private String title;
    private String tnPath;
    private String userId;

    public Folder() {
        this(null, null, null, null, null, false, false, 0L, 0L, null, null, null, 4095, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTnPath() {
        return this.tnPath;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getSortKey() {
        return this.sortKey;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getCoverColor() {
        return this.coverColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecoverParentId() {
        return this.recoverParentId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getFavorite() {
        return this.favorite;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getInTrashBin() {
        return this.inTrashBin;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final Folder copy(String id, String userId, String parentId, String recoverParentId, String title, boolean favorite, boolean inTrashBin, long creationTime, long lastModificationTime, String tnPath, Integer sortKey, Integer coverColor) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        return new Folder(id, userId, parentId, recoverParentId, title, favorite, inTrashBin, creationTime, lastModificationTime, tnPath, sortKey, coverColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Folder)) {
            return false;
        }
        Folder folder = (Folder) other;
        return OooOOO0.OooO0O0(this.id, folder.id) && OooOOO0.OooO0O0(this.userId, folder.userId) && OooOOO0.OooO0O0(this.parentId, folder.parentId) && OooOOO0.OooO0O0(this.recoverParentId, folder.recoverParentId) && OooOOO0.OooO0O0(this.title, folder.title) && this.favorite == folder.favorite && this.inTrashBin == folder.inTrashBin && this.creationTime == folder.creationTime && this.lastModificationTime == folder.lastModificationTime && OooOOO0.OooO0O0(this.tnPath, folder.tnPath) && OooOOO0.OooO0O0(this.sortKey, folder.sortKey) && OooOOO0.OooO0O0(this.coverColor, folder.coverColor);
    }

    public final Integer getCoverColor() {
        return this.coverColor;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final boolean getFavorite() {
        return this.favorite;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInTrashBin() {
        return this.inTrashBin;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getRecoverParentId() {
        return this.recoverParentId;
    }

    public final Integer getSortKey() {
        return this.sortKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Bitmap getTnBitmap() {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.tnPath);
        if (bitmapDecodeFile == null) {
            return null;
        }
        return bitmapDecodeFile;
    }

    public final String getTnPath() {
        return this.tnPath;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.userId);
        String str = this.parentId;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.recoverParentId;
        int iOooO0O02 = OooO00o.OooO0O0(C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(OooO00o.OooO0O0((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title), 31, this.favorite), 31, this.inTrashBin), 31, this.creationTime), 31, this.lastModificationTime), 31, this.tnPath);
        Integer num = this.sortKey;
        int iHashCode2 = (iOooO0O02 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.coverColor;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setCoverColor(Integer num) {
        this.coverColor = num;
    }

    public final void setCreationTime(long j) {
        this.creationTime = j;
    }

    public final void setFavorite(boolean z) {
        this.favorite = z;
    }

    public final void setId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.id = str;
    }

    public final void setInTrashBin(boolean z) {
        this.inTrashBin = z;
    }

    public final void setLastModificationTime(long j) {
        this.lastModificationTime = j;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setRecoverParentId(String str) {
        this.recoverParentId = str;
    }

    public final void setSortKey(Integer num) {
        this.sortKey = num;
    }

    public final void setTitle(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.title = str;
    }

    public final void setTnPath(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.tnPath = str;
    }

    public final void setUserId(String str) {
        OooOOO0.OooO0oO(str, "<set-?>");
        this.userId = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.userId;
        String str3 = this.parentId;
        String str4 = this.recoverParentId;
        String str5 = this.title;
        boolean z = this.favorite;
        boolean z2 = this.inTrashBin;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        String str6 = this.tnPath;
        Integer num = this.sortKey;
        Integer num2 = this.coverColor;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("Folder(id=", str, ", userId=", str2, ", parentId=");
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", recoverParentId=", str4, ", title=");
        sbOooO0O0.append(str5);
        sbOooO0O0.append(", favorite=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", inTrashBin=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", tnPath=", sbOooO0O0);
        sbOooO0O0.append(str6);
        sbOooO0O0.append(", sortKey=");
        sbOooO0O0.append(num);
        sbOooO0O0.append(", coverColor=");
        sbOooO0O0.append(num2);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public Folder(String id, String userId, String str, String str2, String title, boolean z, boolean z2, long j, long j2, String tnPath, Integer num, Integer num2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(userId, "userId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(tnPath, "tnPath");
        this.id = id;
        this.userId = userId;
        this.parentId = str;
        this.recoverParentId = str2;
        this.title = title;
        this.favorite = z;
        this.inTrashBin = z2;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.tnPath = tnPath;
        this.sortKey = num;
        this.coverColor = num2;
    }

    public /* synthetic */ Folder(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, long j, long j2, String str6, Integer num, Integer num2, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "new folder" : str5, (i & 32) != 0 ? false : z, (i & 64) == 0 ? z2 : false, (i & 128) != 0 ? System.currentTimeMillis() : j, (i & 256) != 0 ? System.currentTimeMillis() : j2, (i & 512) == 0 ? str6 : "", (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : num2);
    }
}
