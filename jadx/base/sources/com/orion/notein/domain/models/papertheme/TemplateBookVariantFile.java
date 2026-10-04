package com.orion.notein.domain.models.papertheme;

import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.Expose;
import com.orion.notein.domain.models.material.Orientation;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/TemplateBookVariantFile;", "", "orientation", "Lcom/orion/notein/domain/models/material/Orientation;", "color", "", "colorName", "absolutePath", "<init>", "(Lcom/orion/notein/domain/models/material/Orientation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrientation", "()Lcom/orion/notein/domain/models/material/Orientation;", "getColor", "()Ljava/lang/String;", "getColorName", "getAbsolutePath", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TemplateBookVariantFile {

    @Expose
    private final String absolutePath;

    @Expose
    private final String color;

    @Expose
    private final String colorName;

    @Expose
    private final Orientation orientation;

    public TemplateBookVariantFile(Orientation orientation, String color, String colorName, String absolutePath) {
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(color, "color");
        OooOOO0.OooO0oO(colorName, "colorName");
        OooOOO0.OooO0oO(absolutePath, "absolutePath");
        this.orientation = orientation;
        this.color = color;
        this.colorName = colorName;
        this.absolutePath = absolutePath;
    }

    public static /* synthetic */ TemplateBookVariantFile copy$default(TemplateBookVariantFile templateBookVariantFile, Orientation orientation, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            orientation = templateBookVariantFile.orientation;
        }
        if ((i & 2) != 0) {
            str = templateBookVariantFile.color;
        }
        if ((i & 4) != 0) {
            str2 = templateBookVariantFile.colorName;
        }
        if ((i & 8) != 0) {
            str3 = templateBookVariantFile.absolutePath;
        }
        return templateBookVariantFile.copy(orientation, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColorName() {
        return this.colorName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAbsolutePath() {
        return this.absolutePath;
    }

    public final TemplateBookVariantFile copy(Orientation orientation, String color, String colorName, String absolutePath) {
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(color, "color");
        OooOOO0.OooO0oO(colorName, "colorName");
        OooOOO0.OooO0oO(absolutePath, "absolutePath");
        return new TemplateBookVariantFile(orientation, color, colorName, absolutePath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemplateBookVariantFile)) {
            return false;
        }
        TemplateBookVariantFile templateBookVariantFile = (TemplateBookVariantFile) other;
        return this.orientation == templateBookVariantFile.orientation && OooOOO0.OooO0O0(this.color, templateBookVariantFile.color) && OooOOO0.OooO0O0(this.colorName, templateBookVariantFile.colorName) && OooOOO0.OooO0O0(this.absolutePath, templateBookVariantFile.absolutePath);
    }

    public final String getAbsolutePath() {
        return this.absolutePath;
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

    public int hashCode() {
        return this.absolutePath.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(this.orientation.hashCode() * 31, 31, this.color), 31, this.colorName);
    }

    public String toString() {
        Orientation orientation = this.orientation;
        String str = this.color;
        String str2 = this.colorName;
        String str3 = this.absolutePath;
        StringBuilder sb = new StringBuilder("TemplateBookVariantFile(orientation=");
        sb.append(orientation);
        sb.append(", color=");
        sb.append(str);
        sb.append(", colorName=");
        return C21445Oooo.OooO0O0(sb, str2, ", absolutePath=", str3, ")");
    }
}
