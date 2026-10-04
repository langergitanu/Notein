package com.orion.notein.p607ui.p609vo;

import OooOooo.C20785Oooo00o;
import Oooo0o0.C21009OooOooO;
import com.huawei.hms.network.embedded.C18437z2;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OO00OO.OooO00o;
import o0OOOoO0.C27199OooO0oo;
import o0oOoOo.o00O0O;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006'"}, m80612d2 = {"Lcom/orion/notein/ui/vo/TiledPagePreviewVOFilter;", "Ljava/io/Serializable;", "", C18437z2.f56754h, "", "description", "icon", "", "readOnly", "<init>", "(ILjava/lang/String;IZ)V", "Lkotlin/Function1;", "Lcom/orion/notein/ui/vo/TiledPagePreviewVO;", "getFilter", "()LoO0O000o/OooOO0o;", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "copy", "(ILjava/lang/String;IZ)Lcom/orion/notein/ui/vo/TiledPagePreviewVOFilter;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getType", "Ljava/lang/String;", "getDescription", "getIcon", "Z", "getReadOnly", "Companion", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TiledPagePreviewVOFilter implements Serializable {
    public static final int TYPE_ALL = 0;
    public static final int TYPE_COMMENT = 1;
    private final String description;
    private final int icon;
    private final boolean readOnly;
    private final int type;

    public TiledPagePreviewVOFilter(int i, String description, int i2, boolean z) {
        OooOOO0.OooO0oO(description, "description");
        this.type = i;
        this.description = description;
        this.icon = i2;
        this.readOnly = z;
    }

    public static /* synthetic */ TiledPagePreviewVOFilter copy$default(TiledPagePreviewVOFilter tiledPagePreviewVOFilter, int i, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = tiledPagePreviewVOFilter.type;
        }
        if ((i3 & 2) != 0) {
            str = tiledPagePreviewVOFilter.description;
        }
        if ((i3 & 4) != 0) {
            i2 = tiledPagePreviewVOFilter.icon;
        }
        if ((i3 & 8) != 0) {
            z = tiledPagePreviewVOFilter.readOnly;
        }
        return tiledPagePreviewVOFilter.copy(i, str, i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFilter$lambda$0(TiledPagePreviewVO it) {
        OooOOO0.OooO0oO(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFilter$lambda$1(TiledPagePreviewVO it) {
        OooOOO0.OooO0oO(it, "it");
        return it.getHasComment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFilter$lambda$2(TiledPagePreviewVO it) {
        OooOOO0.OooO0oO(it, "it");
        return true;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final TiledPagePreviewVOFilter copy(int type, String description, int icon, boolean readOnly) {
        OooOOO0.OooO0oO(description, "description");
        return new TiledPagePreviewVOFilter(type, description, icon, readOnly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TiledPagePreviewVOFilter)) {
            return false;
        }
        TiledPagePreviewVOFilter tiledPagePreviewVOFilter = (TiledPagePreviewVOFilter) other;
        return this.type == tiledPagePreviewVOFilter.type && OooOOO0.OooO0O0(this.description, tiledPagePreviewVOFilter.description) && this.icon == tiledPagePreviewVOFilter.icon && this.readOnly == tiledPagePreviewVOFilter.readOnly;
    }

    public final String getDescription() {
        return this.description;
    }

    public final InterfaceC32507OooOO0o<TiledPagePreviewVO, Boolean> getFilter() {
        int i = this.type;
        return i != 0 ? i != 1 ? new C27199OooO0oo(1) : new OooO00o(1) : new o00O0O(0);
    }

    public final int getIcon() {
        return this.icon;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.readOnly) + C20785Oooo00o.OooO00o(this.icon, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(Integer.hashCode(this.type) * 31, 31, this.description), 31);
    }

    public String toString() {
        int i = this.type;
        String str = this.description;
        int i2 = this.icon;
        boolean z = this.readOnly;
        StringBuilder sbOooO0OO = C21009OooOooO.OooO0OO(i, "TiledPagePreviewVOFilter(type=", ", description=", str, ", icon=");
        sbOooO0OO.append(i2);
        sbOooO0OO.append(", readOnly=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
