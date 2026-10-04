package com.orion.notein.p607ui.p609vo;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import androidx.appcompat.app.OooOOO;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011¨\u0006\u001c"}, m80612d2 = {"Lcom/orion/notein/ui/vo/LatestOpenedNoteVO;", "", NoteMeta.PROPERTY_NOTE_ID, "", NoteMeta.PROPERTY_TITLE, FirebaseAnalytics.Param.INDEX, "", "isSelected", "", "isDividerVisible", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZZ)V", "getNoteId", "()Ljava/lang/String;", "getTitle", "getIndex", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LatestOpenedNoteVO {
    private final int index;
    private final boolean isDividerVisible;
    private final boolean isSelected;
    private final String noteId;
    private final String title;

    public LatestOpenedNoteVO(String noteId, String title, int i, boolean z, boolean z2) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(title, "title");
        this.noteId = noteId;
        this.title = title;
        this.index = i;
        this.isSelected = z;
        this.isDividerVisible = z2;
    }

    public static /* synthetic */ LatestOpenedNoteVO copy$default(LatestOpenedNoteVO latestOpenedNoteVO, String str, String str2, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = latestOpenedNoteVO.noteId;
        }
        if ((i2 & 2) != 0) {
            str2 = latestOpenedNoteVO.title;
        }
        if ((i2 & 4) != 0) {
            i = latestOpenedNoteVO.index;
        }
        if ((i2 & 8) != 0) {
            z = latestOpenedNoteVO.isSelected;
        }
        if ((i2 & 16) != 0) {
            z2 = latestOpenedNoteVO.isDividerVisible;
        }
        boolean z3 = z2;
        int i3 = i;
        return latestOpenedNoteVO.copy(str, str2, i3, z, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsDividerVisible() {
        return this.isDividerVisible;
    }

    public final LatestOpenedNoteVO copy(String noteId, String title, int index, boolean isSelected, boolean isDividerVisible) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooOOO0.OooO0oO(title, "title");
        return new LatestOpenedNoteVO(noteId, title, index, isSelected, isDividerVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatestOpenedNoteVO)) {
            return false;
        }
        LatestOpenedNoteVO latestOpenedNoteVO = (LatestOpenedNoteVO) other;
        return OooOOO0.OooO0O0(this.noteId, latestOpenedNoteVO.noteId) && OooOOO0.OooO0O0(this.title, latestOpenedNoteVO.title) && this.index == latestOpenedNoteVO.index && this.isSelected == latestOpenedNoteVO.isSelected && this.isDividerVisible == latestOpenedNoteVO.isDividerVisible;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isDividerVisible) + o00000.OooO0O0(C20785Oooo00o.OooO00o(this.index, OooO00o.OooO0O0(this.noteId.hashCode() * 31, 31, this.title), 31), 31, this.isSelected);
    }

    public final boolean isDividerVisible() {
        return this.isDividerVisible;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.noteId;
        String str2 = this.title;
        int i = this.index;
        boolean z = this.isSelected;
        boolean z2 = this.isDividerVisible;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("LatestOpenedNoteVO(noteId=", str, ", title=", str2, ", index=");
        sbOooO0O0.append(i);
        sbOooO0O0.append(", isSelected=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", isDividerVisible=");
        return OooOOO.OooO00o(sbOooO0O0, ")", z2);
    }
}
