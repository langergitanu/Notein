package com.orion.notein.domain.models.material;

import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p497xc.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/TemplateFile;", "", "path", "", "orientation", "Lcom/orion/notein/domain/models/material/Orientation;", "color", "colorName", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/material/Orientation;Ljava/lang/String;Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getOrientation", "()Lcom/orion/notein/domain/models/material/Orientation;", "getColor", "getColorName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TemplateFile {
    private final String color;
    private final String colorName;
    private final Orientation orientation;
    private final String path;

    public TemplateFile(String path, Orientation orientation, String color, String colorName) {
        OooOOO0.OooO0oO(path, "path");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(color, "color");
        OooOOO0.OooO0oO(colorName, "colorName");
        this.path = path;
        this.orientation = orientation;
        this.color = color;
        this.colorName = colorName;
    }

    public static /* synthetic */ TemplateFile copy$default(TemplateFile templateFile, String str, Orientation orientation, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = templateFile.path;
        }
        if ((i & 2) != 0) {
            orientation = templateFile.orientation;
        }
        if ((i & 4) != 0) {
            str2 = templateFile.color;
        }
        if ((i & 8) != 0) {
            str3 = templateFile.colorName;
        }
        return templateFile.copy(str, orientation, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getColorName() {
        return this.colorName;
    }

    public final TemplateFile copy(String path, Orientation orientation, String color, String colorName) {
        OooOOO0.OooO0oO(path, "path");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(color, "color");
        OooOOO0.OooO0oO(colorName, "colorName");
        return new TemplateFile(path, orientation, color, colorName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemplateFile)) {
            return false;
        }
        TemplateFile templateFile = (TemplateFile) other;
        return OooOOO0.OooO0O0(this.path, templateFile.path) && this.orientation == templateFile.orientation && OooOOO0.OooO0O0(this.color, templateFile.color) && OooOOO0.OooO0O0(this.colorName, templateFile.colorName);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorName() {
        return this.colorName;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.colorName.hashCode() + OooO00o.OooO0O0((this.orientation.hashCode() + (this.path.hashCode() * 31)) * 31, 31, this.color);
    }

    public String toString() {
        String str = this.path;
        Orientation orientation = this.orientation;
        String str2 = this.color;
        String str3 = this.colorName;
        StringBuilder sb = new StringBuilder("TemplateFile(path=");
        sb.append(str);
        sb.append(", orientation=");
        sb.append(orientation);
        sb.append(", color=");
        return C21445Oooo.OooO0O0(sb, str2, ", colorName=", str3, ")");
    }
}
