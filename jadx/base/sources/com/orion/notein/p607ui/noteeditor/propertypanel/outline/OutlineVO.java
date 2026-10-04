package com.orion.notein.p607ui.noteeditor.propertypanel.outline;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import android.os.Parcel;
import android.os.Parcelable;
import com.aspose.slides.C22205OooOOo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.util.OooOOO;
import com.hihonor.honorid.core.data.ChildrenInfo;
import com.huawei.agconnect.credential.obs.C17625c;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0oOoOo.C31076OoooOOO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0001MB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b+\u0010)J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0010\u0010-\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u009a\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010\"J\u0010\u00105\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b5\u0010 J\u001a\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\"R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bA\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bD\u0010)R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bE\u0010)R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bF\u0010\"R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010.R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bI\u0010.R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bK\u00101¨\u0006N"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/outline/OutlineVO;", "Landroid/os/Parcelable;", "", "id", NoteMeta.PROPERTY_NOTE_ID, NoteMeta.PROPERTY_PARENT_ID, "", "pageIndex", NoteMeta.PROPERTY_TITLE, FirebaseAnalytics.Param.LEVEL, "", "expand", "hasChildren", "selected", "searchQuery", "", C17625c.f52155b, NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", ChildrenInfo.TAG_CHILDREN_INFO, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZZZLjava/lang/String;JJLjava/util/List;)V", "Lo0oOoOo/OoooOOO;", "mapToSortVO", "()Lo0oOoOo/OoooOOO;", "Landroid/os/Parcel;", "dest", "flags", "LoO00ooO/OooOooO;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "component9", "component10", "component11", "()J", "component12", "component13", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZZZLjava/lang/String;JJLjava/util/List;)Lcom/orion/notein/ui/noteeditor/propertypanel/outline/OutlineVO;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getNoteId", "getParentId", "I", "getPageIndex", "getTitle", "getLevel", "Z", "getExpand", "getHasChildren", "getSelected", "getSearchQuery", "J", "getCreationTime", "getLastModificationTime", "Ljava/util/List;", "getChildren", "Companion", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class OutlineVO implements Parcelable {
    public static final String FAKE_OUTLINE_ID = "fake_outline_id";
    private final List<String> children;
    private final long creationTime;
    private final boolean expand;
    private final boolean hasChildren;
    private final String id;
    private final long lastModificationTime;
    private final int level;
    private final String noteId;
    private final int pageIndex;
    private final String parentId;
    private final String searchQuery;
    private final boolean selected;
    private final String title;
    public static final Parcelable.Creator<OutlineVO> CREATOR = new OooO0O0();

    public static final class OooO0O0 implements Parcelable.Creator<OutlineVO> {
        @Override // android.os.Parcelable.Creator
        public final OutlineVO createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            OooOOO0.OooO0oO(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            boolean z3 = false;
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new OutlineVO(string, string2, string3, i, string4, i2, z3, z4, z2, parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final OutlineVO[] newArray(int i) {
            return new OutlineVO[i];
        }
    }

    public OutlineVO(String id, String noteId, String str, int i, String title, int i2, boolean z, boolean z2, boolean z3, String searchQuery, long j, long j2, List<String> children) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(searchQuery, "searchQuery");
        OooOOO0.OooO0oO(children, "children");
        this.id = id;
        this.noteId = noteId;
        this.parentId = str;
        this.pageIndex = i;
        this.title = title;
        this.level = i2;
        this.expand = z;
        this.hasChildren = z2;
        this.selected = z3;
        this.searchQuery = searchQuery;
        this.creationTime = j;
        this.lastModificationTime = j2;
        this.children = children;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getCreationTime() {
        return this.creationTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final List<String> component13() {
        return this.children;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getExpand() {
        return this.expand;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHasChildren() {
        return this.hasChildren;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final OutlineVO copy(String id, String noteId, String parentId, int pageIndex, String title, int level, boolean expand, boolean hasChildren, boolean selected, String searchQuery, long creationTime, long lastModificationTime, List<String> children) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(title, "title");
        OooOOO0.OooO0oO(searchQuery, "searchQuery");
        OooOOO0.OooO0oO(children, "children");
        return new OutlineVO(id, noteId, parentId, pageIndex, title, level, expand, hasChildren, selected, searchQuery, creationTime, lastModificationTime, children);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutlineVO)) {
            return false;
        }
        OutlineVO outlineVO = (OutlineVO) other;
        return OooOOO0.OooO0O0(this.id, outlineVO.id) && OooOOO0.OooO0O0(this.noteId, outlineVO.noteId) && OooOOO0.OooO0O0(this.parentId, outlineVO.parentId) && this.pageIndex == outlineVO.pageIndex && OooOOO0.OooO0O0(this.title, outlineVO.title) && this.level == outlineVO.level && this.expand == outlineVO.expand && this.hasChildren == outlineVO.hasChildren && this.selected == outlineVO.selected && OooOOO0.OooO0O0(this.searchQuery, outlineVO.searchQuery) && this.creationTime == outlineVO.creationTime && this.lastModificationTime == outlineVO.lastModificationTime && OooOOO0.OooO0O0(this.children, outlineVO.children);
    }

    public final List<String> getChildren() {
        return this.children;
    }

    public final long getCreationTime() {
        return this.creationTime;
    }

    public final boolean getExpand() {
        return this.expand;
    }

    public final boolean getHasChildren() {
        return this.hasChildren;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId);
        String str = this.parentId;
        return this.children.hashCode() + C20703o000000o.OooO0O0(C20703o000000o.OooO0O0(OooO00o.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(C20785Oooo00o.OooO00o(this.level, OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.pageIndex, (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.title), 31), 31, this.expand), 31, this.hasChildren), 31, this.selected), 31, this.searchQuery), 31, this.creationTime), 31, this.lastModificationTime);
    }

    public final C31076OoooOOO mapToSortVO() {
        return new C31076OoooOOO(this.creationTime, this.lastModificationTime, null, null, null, null, null, this.pageIndex, 124);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noteId;
        String str3 = this.parentId;
        int i = this.pageIndex;
        String str4 = this.title;
        int i2 = this.level;
        boolean z = this.expand;
        boolean z2 = this.hasChildren;
        boolean z3 = this.selected;
        String str5 = this.searchQuery;
        long j = this.creationTime;
        long j2 = this.lastModificationTime;
        List<String> list = this.children;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("OutlineVO(id=", str, ", noteId=", str2, ", parentId=");
        OooOO0.OooO0O0.OooO0Oo(i, str3, ", pageIndex=", ", title=", sbOooO0O0);
        OooOO0.OooO0O0.OooO0Oo(i2, str4, ", level=", ", expand=", sbOooO0O0);
        sbOooO0O0.append(z);
        sbOooO0O0.append(", hasChildren=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", selected=");
        sbOooO0O0.append(z3);
        sbOooO0O0.append(", searchQuery=");
        sbOooO0O0.append(str5);
        sbOooO0O0.append(", creationTime=");
        sbOooO0O0.append(j);
        C22205OooOOo.OooO0OO(j2, ", lastModificationTime=", ", children=", sbOooO0O0);
        return OooOOO.OooO0O0(")", sbOooO0O0, list);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        OooOOO0.OooO0oO(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.noteId);
        dest.writeString(this.parentId);
        dest.writeInt(this.pageIndex);
        dest.writeString(this.title);
        dest.writeInt(this.level);
        dest.writeInt(this.expand ? 1 : 0);
        dest.writeInt(this.hasChildren ? 1 : 0);
        dest.writeInt(this.selected ? 1 : 0);
        dest.writeString(this.searchQuery);
        dest.writeLong(this.creationTime);
        dest.writeLong(this.lastModificationTime);
        dest.writeStringList(this.children);
    }

    public /* synthetic */ OutlineVO(String str, String str2, String str3, int i, String str4, int i2, boolean z, boolean z2, boolean z3, String str5, long j, long j2, List list, int i3, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, (i3 & 4) != 0 ? null : str3, i, str4, i2, z, z2, z3, str5, j, j2, (i3 & 4096) != 0 ? C34434OooOoO.f123453OooOo0o : list);
    }
}
