package com.orion.notein.p607ui.noteeditor.propertypanel.comment;

import OooOo.C20485OooOoO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.concurrent.futures.OooO0O0;
import com.aspose.slides.internal.p332p7.OooO;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;
import o0oOoOo.C31076OoooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0010\u0010.\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0010\u00101\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b1\u0010/J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010*J\u0096\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\"J\u0010\u00106\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b6\u0010 J\u001a\u00109\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010&R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\bB\u0010 R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\bC\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010,R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bH\u0010\"R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010/R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\bK\u0010\"R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bL\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010D\u001a\u0004\bM\u0010*¨\u0006N"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/comment/CommentVO;", "Landroid/os/Parcelable;", "", "id", "", "pageIndex", NoteMeta.PROPERTY_TITLE, "", "selected", "bgColor", "underlineColor", "quoteType", "Landroid/graphics/Point;", "offset", "highlightText", "", C17625c.f52155b, "creationTimeStr", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "sortKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZIILjava/lang/Integer;Landroid/graphics/Point;Ljava/lang/String;JLjava/lang/String;JLjava/lang/Integer;)V", "Lo0oOoOo/OoooOOO;", "mapToSortVO", "()Lo0oOoOo/OoooOOO;", "Landroid/os/Parcel;", "dest", "flags", "LoO00ooO/OooOooO;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "()Ljava/lang/Integer;", "component8", "()Landroid/graphics/Point;", "component9", "component10", "()J", "component11", "component12", "component13", "copy", "(Ljava/lang/String;ILjava/lang/String;ZIILjava/lang/Integer;Landroid/graphics/Point;Ljava/lang/String;JLjava/lang/String;JLjava/lang/Integer;)Lcom/orion/notein/ui/noteeditor/propertypanel/comment/CommentVO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getPageIndex", "getTitle", "Z", "getSelected", "getBgColor", "getUnderlineColor", "Ljava/lang/Integer;", "getQuoteType", "Landroid/graphics/Point;", "getOffset", "getHighlightText", "J", "getCreationTime", "getCreationTimeStr", "getLastModificationTime", "getSortKey", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CommentVO implements Parcelable {
    public static final Parcelable.Creator<CommentVO> CREATOR = new OooO00o();
    private final int bgColor;
    private final long creationTime;
    private final String creationTimeStr;
    private final String highlightText;
    private final String id;
    private final long lastModificationTime;
    private final Point offset;
    private final int pageIndex;
    private final Integer quoteType;
    private final boolean selected;
    private final Integer sortKey;
    private final String title;
    private final int underlineColor;

    public static final class OooO00o implements Parcelable.Creator<CommentVO> {
        @Override // android.os.Parcelable.Creator
        public final CommentVO createFromParcel(Parcel parcel) {
            OooOOO0.OooO0oO(parcel, "parcel");
            return new CommentVO(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Point) parcel.readParcelable(CommentVO.class.getClassLoader()), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentVO[] newArray(int i) {
            return new CommentVO[i];
        }
    }

    public CommentVO(String id, int i, String title, boolean z, int i2, int i3, Integer num, Point offset, String highlightText, long j, String creationTimeStr, long j2, Integer num2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(offset, "offset");
        OooOOO0.OooO0oO(highlightText, "highlightText");
        OooOOO0.OooO0oO(creationTimeStr, "creationTimeStr");
        this.id = id;
        this.pageIndex = i;
        this.title = title;
        this.selected = z;
        this.bgColor = i2;
        this.underlineColor = i3;
        this.quoteType = num;
        this.offset = offset;
        this.highlightText = highlightText;
        this.creationTime = j;
        this.creationTimeStr = creationTimeStr;
        this.lastModificationTime = j2;
        this.sortKey = num2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCreationTimeStr() {
        return this.creationTimeStr;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getSortKey() {
        return this.sortKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getUnderlineColor() {
        return this.underlineColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getQuoteType() {
        return this.quoteType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Point getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getHighlightText() {
        return this.highlightText;
    }

    public final CommentVO copy(String id, int pageIndex, String title, boolean selected, int bgColor, int underlineColor, Integer quoteType, Point offset, String highlightText, long creationTime, String creationTimeStr, long lastModificationTime, Integer sortKey) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(offset, "offset");
        OooOOO0.OooO0oO(highlightText, "highlightText");
        OooOOO0.OooO0oO(creationTimeStr, "creationTimeStr");
        return new CommentVO(id, pageIndex, title, selected, bgColor, underlineColor, quoteType, offset, highlightText, creationTime, creationTimeStr, lastModificationTime, sortKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentVO)) {
            return false;
        }
        CommentVO commentVO = (CommentVO) other;
        return OooOOO0.OooO0O0(this.id, commentVO.id) && this.pageIndex == commentVO.pageIndex && OooOOO0.OooO0O0(this.title, commentVO.title) && this.selected == commentVO.selected && this.bgColor == commentVO.bgColor && this.underlineColor == commentVO.underlineColor && OooOOO0.OooO0O0(this.quoteType, commentVO.quoteType) && OooOOO0.OooO0O0(this.offset, commentVO.offset) && OooOOO0.OooO0O0(this.highlightText, commentVO.highlightText) && this.creationTime == commentVO.creationTime && OooOOO0.OooO0O0(this.creationTimeStr, commentVO.creationTimeStr) && this.lastModificationTime == commentVO.lastModificationTime && OooOOO0.OooO0O0(this.sortKey, commentVO.sortKey);
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final String getCreationTimeStr() {
        return this.creationTimeStr;
    }

    public final String getHighlightText() {
        return this.highlightText;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final Point getOffset() {
        return this.offset;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final Integer getQuoteType() {
        return this.quoteType;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final Integer getSortKey() {
        return this.sortKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getUnderlineColor() {
        return this.underlineColor;
    }

    public int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.underlineColor, C20785Oooo00o.OooO00o(this.bgColor, o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.pageIndex, this.id.hashCode() * 31, 31), 31, this.title), 31, this.selected), 31), 31);
        Integer num = this.quoteType;
        int iOooO0O0 = C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.offset.hashCode() + ((iOooO00o + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.highlightText), 31, this.creationTime), 31, this.creationTimeStr), 31, this.lastModificationTime);
        Integer num2 = this.sortKey;
        return iOooO0O0 + (num2 != null ? num2.hashCode() : 0);
    }

    public final C31076OoooOOO mapToSortVO() {
        return new C31076OoooOOO(this.creationTime, this.lastModificationTime, null, null, this.sortKey, null, null, this.pageIndex, 108);
    }

    public String toString() {
        String str = this.id;
        int i = this.pageIndex;
        String str2 = this.title;
        boolean z = this.selected;
        int i2 = this.bgColor;
        int i3 = this.underlineColor;
        Integer num = this.quoteType;
        Point point = this.offset;
        String str3 = this.highlightText;
        long j = this.creationTime;
        String str4 = this.creationTimeStr;
        long j2 = this.lastModificationTime;
        Integer num2 = this.sortKey;
        StringBuilder sbOooO0OO = C20485OooOoO.OooO0OO(i, "CommentVO(id=", str, ", pageIndex=", ", title=");
        sbOooO0OO.append(str2);
        sbOooO0OO.append(", selected=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(", bgColor=");
        C24472OooOoo.OooO0O0(sbOooO0OO, ", underlineColor=", ", quoteType=", i2, i3);
        sbOooO0OO.append(num);
        sbOooO0OO.append(", offset=");
        sbOooO0OO.append(point);
        sbOooO0OO.append(", highlightText=");
        OooO.OooO00o(j, str3, ", creationTime=", sbOooO0OO);
        OooO0O0.OooO0O0(sbOooO0OO, ", creationTimeStr=", str4, ", lastModificationTime=");
        sbOooO0OO.append(j2);
        sbOooO0OO.append(", sortKey=");
        sbOooO0OO.append(num2);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.pageIndex);
        dest.writeString(this.title);
        dest.writeInt(this.selected ? 1 : 0);
        dest.writeInt(this.bgColor);
        dest.writeInt(this.underlineColor);
        Integer num = this.quoteType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeParcelable(this.offset, flags);
        dest.writeString(this.highlightText);
        dest.writeLong(this.creationTime);
        dest.writeString(this.creationTimeStr);
        dest.writeLong(this.lastModificationTime);
        Integer num2 = this.sortKey;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ CommentVO(String str, int i, String str2, boolean z, int i2, int i3, Integer num, Point point, String str3, long j, String str4, long j2, Integer num2, int i4, C24018OooO0oo c24018OooO0oo) {
        this(str, i, str2, z, i2, i3, num, point, str3, j, str4, j2, (i4 & 4096) != 0 ? null : num2);
    }
}
