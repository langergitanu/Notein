package com.orion.penkit.models;

import OooOoo0.o00000;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m80612d2 = {"Lcom/orion/penkit/models/LayerInfo;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, "visible", "", "activated", "extras", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getNoteId", "getVisible", "()Z", "getActivated", "getExtras", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class LayerInfo {
    public static final String DEFAULT_LAYER_ID = "default";
    public static final String NONE_LAYER_ID = "none";
    public static final String PAPER_THEME_LAYER_ID = "paper_theme";
    public static final String UNSPECIFIED_LAYER_ID = "unspecified";
    private final boolean activated;
    private final String extras;
    private final String id;
    private final String noteId;
    private final boolean visible;

    public LayerInfo(String id, String noteId, boolean z, boolean z2, String str) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        this.id = id;
        this.noteId = noteId;
        this.visible = z;
        this.activated = z2;
        this.extras = str;
    }

    public static /* synthetic */ LayerInfo copy$default(LayerInfo layerInfo, String str, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = layerInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = layerInfo.noteId;
        }
        if ((i & 4) != 0) {
            z = layerInfo.visible;
        }
        if ((i & 8) != 0) {
            z2 = layerInfo.activated;
        }
        if ((i & 16) != 0) {
            str3 = layerInfo.extras;
        }
        String str4 = str3;
        boolean z3 = z;
        return layerInfo.copy(str, str2, z3, z2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getActivated() {
        return this.activated;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtras() {
        return this.extras;
    }

    public final LayerInfo copy(String id, String noteId, boolean visible, boolean activated, String extras) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        return new LayerInfo(id, noteId, visible, activated, extras);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LayerInfo)) {
            return false;
        }
        LayerInfo layerInfo = (LayerInfo) other;
        return OooOOO0.OooO0O0(this.id, layerInfo.id) && OooOOO0.OooO0O0(this.noteId, layerInfo.noteId) && this.visible == layerInfo.visible && this.activated == layerInfo.activated && OooOOO0.OooO0O0(this.extras, layerInfo.extras);
    }

    public final boolean getActivated() {
        return this.activated;
    }

    public final String getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(o00000.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId), 31, this.visible), 31, this.activated);
        String str = this.extras;
        return iOooO0O0 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noteId;
        boolean z = this.visible;
        boolean z2 = this.activated;
        String str3 = this.extras;
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("LayerInfo(id=", str, ", noteId=", str2, ", visible=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", activated=");
        sbOooO0O0.append(z2);
        sbOooO0O0.append(", extras=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str3, ")");
    }
}
