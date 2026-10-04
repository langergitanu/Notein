package com.orion.notein.domain.models.material;

import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/Creator;", "", "id", "", "name", "description", "avatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getAvatarUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class Creator {
    private final String avatarUrl;
    private final String description;
    private final String id;
    private final String name;

    public Creator(String id, String name, String description, String str) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(description, "description");
        this.id = id;
        this.name = name;
        this.description = description;
        this.avatarUrl = str;
    }

    public static /* synthetic */ Creator copy$default(Creator creator, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creator.id;
        }
        if ((i & 2) != 0) {
            str2 = creator.name;
        }
        if ((i & 4) != 0) {
            str3 = creator.description;
        }
        if ((i & 8) != 0) {
            str4 = creator.avatarUrl;
        }
        return creator.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Creator copy(String id, String name, String description, String avatarUrl) {
        OooOOO0.OooO0oO(id, "id");
        OooOOO0.OooO0oO(name, "name");
        OooOOO0.OooO0oO(description, "description");
        return new Creator(id, name, description, avatarUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Creator)) {
            return false;
        }
        Creator creator = (Creator) other;
        return OooOOO0.OooO0O0(this.id, creator.id) && OooOOO0.OooO0O0(this.name, creator.name) && OooOOO0.OooO0O0(this.description, creator.description) && OooOOO0.OooO0O0(this.avatarUrl, creator.avatarUrl);
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(this.id.hashCode() * 31, 31, this.name), 31, this.description);
        String str = this.avatarUrl;
        return iOooO0O0 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        return C21445Oooo.OooO0O0(OooO0o.OooO0O0("Creator(id=", str, ", name=", str2, ", description="), this.description, ", avatarUrl=", this.avatarUrl, ")");
    }
}
