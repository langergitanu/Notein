package o0oOoOo;

import OooOoo0.o00000;
import OoooooO.C21445Oooo;
import java.util.List;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oOoOo.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31077OoooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110906OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f110907OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f110908OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<String> f110909OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f110910OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f110911OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f110912OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f110913OooO0oo;

    public C31077OoooOOo() {
        this(null, null, null, null, false, false, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31077OoooOOo)) {
            return false;
        }
        C31077OoooOOo c31077OoooOOo = (C31077OoooOOo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110906OooO00o, c31077OoooOOo.f110906OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110907OooO0O0, c31077OoooOOo.f110907OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110908OooO0OO, c31077OoooOOo.f110908OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110909OooO0Oo, c31077OoooOOo.f110909OooO0Oo) && this.f110911OooO0o0 == c31077OoooOOo.f110911OooO0o0 && this.f110910OooO0o == c31077OoooOOo.f110910OooO0o && this.f110912OooO0oO == c31077OoooOOo.f110912OooO0oO && this.f110913OooO0oo == c31077OoooOOo.f110913OooO0oo;
    }

    public final int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.f110906OooO00o.hashCode() * 31, 31, this.f110907OooO0O0);
        String str = this.f110908OooO0OO;
        return Boolean.hashCode(this.f110913OooO0oo) + o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(C21445Oooo.OooO00o(this.f110909OooO0Oo, (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f110911OooO0o0), 31, this.f110910OooO0o), 31, this.f110912OooO0oO);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerCollectionVO(id=");
        sb.append(this.f110906OooO00o);
        sb.append(", name=");
        sb.append(this.f110907OooO0O0);
        sb.append(", firstStickerImagePath=");
        sb.append(this.f110908OooO0OO);
        sb.append(", children=");
        sb.append(this.f110909OooO0Oo);
        sb.append(", builtIn=");
        sb.append(this.f110911OooO0o0);
        sb.append(", isAddType=");
        sb.append(this.f110910OooO0o);
        sb.append(", isSelected=");
        sb.append(this.f110912OooO0oO);
        sb.append(", isLatestType=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f110913OooO0oo);
    }

    public C31077OoooOOo(String id, String name, String str, List children, boolean z, boolean z2, int i) {
        id = (i & 1) != 0 ? "" : id;
        name = (i & 2) != 0 ? "" : name;
        str = (i & 4) != 0 ? null : str;
        children = (i & 8) != 0 ? C34434OooOoO.f123453OooOo0o : children;
        z = (i & 16) != 0 ? false : z;
        boolean z3 = (i & 32) == 0;
        z2 = (i & 64) != 0 ? false : z2;
        boolean z4 = (i & 128) == 0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(children, "children");
        this.f110906OooO00o = id;
        this.f110907OooO0O0 = name;
        this.f110908OooO0OO = str;
        this.f110909OooO0Oo = children;
        this.f110911OooO0o0 = z;
        this.f110910OooO0o = z3;
        this.f110912OooO0oO = z2;
        this.f110913OooO0oo = z4;
    }
}
