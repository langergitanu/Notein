package com.orion.notein.domain.models.papertheme;

import com.google.gson.annotations.Expose;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/ThemeCategory;", "", "id", "", "name", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class ThemeCategory {

    @Expose
    private final int id;

    @Expose
    private final String name;

    public ThemeCategory(int i, String name) {
        OooOOO0.OooO0oO(name, "name");
        this.id = i;
        this.name = name;
    }

    public static /* synthetic */ ThemeCategory copy$default(ThemeCategory themeCategory, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = themeCategory.id;
        }
        if ((i2 & 2) != 0) {
            str = themeCategory.name;
        }
        return themeCategory.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final ThemeCategory copy(int id, String name) {
        OooOOO0.OooO0oO(name, "name");
        return new ThemeCategory(id, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeCategory)) {
            return false;
        }
        ThemeCategory themeCategory = (ThemeCategory) other;
        return this.id == themeCategory.id && OooOOO0.OooO0O0(this.name, themeCategory.name);
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public String toString() {
        return "ThemeCategory(id=" + this.id + ", name=" + this.name + ")";
    }
}
