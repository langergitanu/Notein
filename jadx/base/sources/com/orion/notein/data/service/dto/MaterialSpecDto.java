package com.orion.notein.data.service.dto;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00107\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003JÎ\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\t\u0010?\u001a\u00020\bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b'\u0010\u0018R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b(\u0010\u0018R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001d¨\u0006@"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/MaterialSpecDto;", "", "width", "", "height", "pages", "chapters", "", "", "colorMode", "fileSizeMb", "", "pageSize", "files", "Lcom/orion/notein/data/service/dto/TemplateFileDto;", "swatches", "backgroundSuitability", "colorCount", "stickerCount", "fontFamily", "fontWeights", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getPages", "getChapters", "()Ljava/util/List;", "getColorMode", "()Ljava/lang/String;", "getFileSizeMb", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPageSize", "getFiles", "getSwatches", "getBackgroundSuitability", "getColorCount", "getStickerCount", "getFontFamily", "getFontWeights", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/orion/notein/data/service/dto/MaterialSpecDto;", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class MaterialSpecDto {

    @SerializedName("background_suitability")
    private final String backgroundSuitability;
    private final List<String> chapters;

    @SerializedName("color_count")
    private final Integer colorCount;

    @SerializedName("color_mode")
    private final String colorMode;

    @SerializedName("file_size_mb")
    private final Float fileSizeMb;
    private final List<TemplateFileDto> files;

    @SerializedName("font_family")
    private final String fontFamily;

    @SerializedName("font_weights")
    private final List<String> fontWeights;
    private final Integer height;

    @SerializedName("page_size")
    private final String pageSize;
    private final Integer pages;

    @SerializedName("style_count")
    private final Integer stickerCount;
    private final List<String> swatches;
    private final Integer width;

    public MaterialSpecDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBackgroundSuitability() {
        return this.backgroundSuitability;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getColorCount() {
        return this.colorCount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getStickerCount() {
        return this.stickerCount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final List<String> component14() {
        return this.fontWeights;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPages() {
        return this.pages;
    }

    public final List<String> component4() {
        return this.chapters;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getColorMode() {
        return this.colorMode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Float getFileSizeMb() {
        return this.fileSizeMb;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPageSize() {
        return this.pageSize;
    }

    public final List<TemplateFileDto> component8() {
        return this.files;
    }

    public final List<String> component9() {
        return this.swatches;
    }

    public final MaterialSpecDto copy(Integer width, Integer height, Integer pages, List<String> chapters, String colorMode, Float fileSizeMb, String pageSize, List<TemplateFileDto> files, List<String> swatches, String backgroundSuitability, Integer colorCount, Integer stickerCount, String fontFamily, List<String> fontWeights) {
        return new MaterialSpecDto(width, height, pages, chapters, colorMode, fileSizeMb, pageSize, files, swatches, backgroundSuitability, colorCount, stickerCount, fontFamily, fontWeights);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaterialSpecDto)) {
            return false;
        }
        MaterialSpecDto materialSpecDto = (MaterialSpecDto) other;
        return OooOOO0.OooO0O0(this.width, materialSpecDto.width) && OooOOO0.OooO0O0(this.height, materialSpecDto.height) && OooOOO0.OooO0O0(this.pages, materialSpecDto.pages) && OooOOO0.OooO0O0(this.chapters, materialSpecDto.chapters) && OooOOO0.OooO0O0(this.colorMode, materialSpecDto.colorMode) && OooOOO0.OooO0O0(this.fileSizeMb, materialSpecDto.fileSizeMb) && OooOOO0.OooO0O0(this.pageSize, materialSpecDto.pageSize) && OooOOO0.OooO0O0(this.files, materialSpecDto.files) && OooOOO0.OooO0O0(this.swatches, materialSpecDto.swatches) && OooOOO0.OooO0O0(this.backgroundSuitability, materialSpecDto.backgroundSuitability) && OooOOO0.OooO0O0(this.colorCount, materialSpecDto.colorCount) && OooOOO0.OooO0O0(this.stickerCount, materialSpecDto.stickerCount) && OooOOO0.OooO0O0(this.fontFamily, materialSpecDto.fontFamily) && OooOOO0.OooO0O0(this.fontWeights, materialSpecDto.fontWeights);
    }

    public final String getBackgroundSuitability() {
        return this.backgroundSuitability;
    }

    public final List<String> getChapters() {
        return this.chapters;
    }

    public final Integer getColorCount() {
        return this.colorCount;
    }

    public final String getColorMode() {
        return this.colorMode;
    }

    public final Float getFileSizeMb() {
        return this.fileSizeMb;
    }

    public final List<TemplateFileDto> getFiles() {
        return this.files;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final List<String> getFontWeights() {
        return this.fontWeights;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getPageSize() {
        return this.pageSize;
    }

    public final Integer getPages() {
        return this.pages;
    }

    public final Integer getStickerCount() {
        return this.stickerCount;
    }

    public final List<String> getSwatches() {
        return this.swatches;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.pages;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list = this.chapters;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.colorMode;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.fileSizeMb;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.pageSize;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TemplateFileDto> list2 = this.files;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.swatches;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.backgroundSuitability;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.colorCount;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.stickerCount;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str4 = this.fontFamily;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list4 = this.fontWeights;
        return iHashCode13 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        return "MaterialSpecDto(width=" + this.width + ", height=" + this.height + ", pages=" + this.pages + ", chapters=" + this.chapters + ", colorMode=" + this.colorMode + ", fileSizeMb=" + this.fileSizeMb + ", pageSize=" + this.pageSize + ", files=" + this.files + ", swatches=" + this.swatches + ", backgroundSuitability=" + this.backgroundSuitability + ", colorCount=" + this.colorCount + ", stickerCount=" + this.stickerCount + ", fontFamily=" + this.fontFamily + ", fontWeights=" + this.fontWeights + ")";
    }

    public MaterialSpecDto(Integer num, Integer num2, Integer num3, List<String> list, String str, Float f, String str2, List<TemplateFileDto> list2, List<String> list3, String str3, Integer num4, Integer num5, String str4, List<String> list4) {
        this.width = num;
        this.height = num2;
        this.pages = num3;
        this.chapters = list;
        this.colorMode = str;
        this.fileSizeMb = f;
        this.pageSize = str2;
        this.files = list2;
        this.swatches = list3;
        this.backgroundSuitability = str3;
        this.colorCount = num4;
        this.stickerCount = num5;
        this.fontFamily = str4;
        this.fontWeights = list4;
    }

    public /* synthetic */ MaterialSpecDto(Integer num, Integer num2, Integer num3, List list, String str, Float f, String str2, List list2, List list3, String str3, Integer num4, Integer num5, String str4, List list4, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? null : num5, (i & 4096) != 0 ? null : str4, (i & 8192) != 0 ? null : list4);
    }
}
