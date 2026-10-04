package com.orion.notein.domain.models.page;

import OooOoo0.o00000;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.penkit.models.LayerInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006!"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/PageLayer;", "", "id", "", NoteMeta.PROPERTY_NOTE_ID, "visible", "", "extras", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getNoteId", "getVisible", "()Z", "getExtras", "getName", "toLayerInfo", "Lcom/orion/penkit/models/LayerInfo;", "activated", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PageLayer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String extras;
    private final String id;
    private final String name;
    private final String noteId;
    private final boolean visible;

    @Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b¨\u0006\f"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/PageLayer$Companion;", "", "<init>", "()V", "getDefaultPageLayers", "", "Lcom/orion/notein/domain/models/page/PageLayer;", NoteMeta.PROPERTY_NOTE_ID, "", "isRegularLayerId", "", "id", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final List<PageLayer> getDefaultPageLayers(String noteId) {
            OooOOO0.OooO0oO(noteId, "noteId");
            int i = 16;
            C24018OooO0oo c24018OooO0oo = null;
            boolean z = true;
            String str = null;
            String str2 = null;
            return C34429OooOOo0.OooOO0o(new PageLayer(LayerInfo.PAPER_THEME_LAYER_ID, noteId, z, str, str2, i, c24018OooO0oo), new PageLayer("default", noteId, z, str, str2, i, c24018OooO0oo));
        }

        public final boolean isRegularLayerId(String id) {
            OooOOO0.OooO0oO(id, "id");
            return (id.equals("none") || id.equals(LayerInfo.PAPER_THEME_LAYER_ID) || id.equals(LayerInfo.UNSPECIFIED_LAYER_ID)) ? false : true;
        }

        private Companion() {
        }
    }

    public PageLayer(String id, String noteId, boolean z, String str, String str2) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        this.id = id;
        this.noteId = noteId;
        this.visible = z;
        this.extras = str;
        this.name = str2;
    }

    public static /* synthetic */ PageLayer copy$default(PageLayer pageLayer, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageLayer.id;
        }
        if ((i & 2) != 0) {
            str2 = pageLayer.noteId;
        }
        if ((i & 4) != 0) {
            z = pageLayer.visible;
        }
        if ((i & 8) != 0) {
            str3 = pageLayer.extras;
        }
        if ((i & 16) != 0) {
            str4 = pageLayer.name;
        }
        String str5 = str4;
        boolean z2 = z;
        return pageLayer.copy(str, str2, z2, str3, str5);
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
    public final String getExtras() {
        return this.extras;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final PageLayer copy(String id, String noteId, boolean visible, String extras, String name) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(noteId, "noteId");
        return new PageLayer(id, noteId, visible, extras, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageLayer)) {
            return false;
        }
        PageLayer pageLayer = (PageLayer) other;
        return OooOOO0.OooO0O0(this.id, pageLayer.id) && OooOOO0.OooO0O0(this.noteId, pageLayer.noteId) && this.visible == pageLayer.visible && OooOOO0.OooO0O0(this.extras, pageLayer.extras) && OooOOO0.OooO0O0(this.name, pageLayer.name);
    }

    public final String getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iOooO0O0 = o00000.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.noteId), 31, this.visible);
        String str = this.extras;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final LayerInfo toLayerInfo(boolean activated) {
        return new LayerInfo(this.id, this.noteId, this.visible, activated, this.extras);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.noteId;
        boolean z = this.visible;
        String str3 = this.extras;
        String str4 = this.name;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("PageLayer(id=", str, ", noteId=", str2, ", visible=");
        sbOooO0O0.append(z);
        sbOooO0O0.append(", extras=");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", name=");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str4, ")");
    }

    public /* synthetic */ PageLayer(String str, String str2, boolean z, String str3, String str4, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, z, str3, (i & 16) != 0 ? null : str4);
    }
}
