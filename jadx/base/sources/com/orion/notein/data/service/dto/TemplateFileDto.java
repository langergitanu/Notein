package com.orion.notein.data.service.dto;

import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/TemplateFileDto;", "", "path", "", "orientation", "color", "colorName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getOrientation", "getColor", "getColorName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TemplateFileDto {
    private final String color;

    @SerializedName("color_name")
    private final String colorName;
    private final String orientation;
    private final String path;

    public TemplateFileDto(String path, String orientation, String color, String colorName) {
        OooOOO0.OooO0oO(path, "path");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(color, "color");
        OooOOO0.OooO0oO(colorName, "colorName");
        this.path = path;
        this.orientation = orientation;
        this.color = color;
        this.colorName = colorName;
    }

    public static /* synthetic */ TemplateFileDto copy$default(TemplateFileDto templateFileDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = templateFileDto.path;
        }
        if ((i & 2) != 0) {
            str2 = templateFileDto.orientation;
        }
        if ((i & 4) != 0) {
            str3 = templateFileDto.color;
        }
        if ((i & 8) != 0) {
            str4 = templateFileDto.colorName;
        }
        return templateFileDto.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrientation() {
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

    public final TemplateFileDto copy(String path, String orientation, String color, String colorName) {
        OooOOO0.OooO0oO(path, "path");
        OooOOO0.OooO0oO(orientation, "orientation");
        OooOOO0.OooO0oO(color, "color");
        OooOOO0.OooO0oO(colorName, "colorName");
        return new TemplateFileDto(path, orientation, color, colorName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemplateFileDto)) {
            return false;
        }
        TemplateFileDto templateFileDto = (TemplateFileDto) other;
        return OooOOO0.OooO0O0(this.path, templateFileDto.path) && OooOOO0.OooO0O0(this.orientation, templateFileDto.orientation) && OooOOO0.OooO0O0(this.color, templateFileDto.color) && OooOOO0.OooO0O0(this.colorName, templateFileDto.colorName);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getColorName() {
        return this.colorName;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.colorName.hashCode() + OooO00o.OooO0O0(OooO00o.OooO0O0(this.path.hashCode() * 31, 31, this.orientation), 31, this.color);
    }

    public String toString() {
        String str = this.path;
        String str2 = this.orientation;
        return C21445Oooo.OooO0O0(OooO0o.OooO0O0("TemplateFileDto(path=", str, ", orientation=", str2, ", color="), this.color, ", colorName=", this.colorName, ")");
    }
}
