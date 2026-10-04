package com.orion.notein.domain.mapper;

import com.orion.notein.data.service.dto.MaterialDto;
import com.orion.notein.data.service.dto.MaterialSpecDto;
import com.orion.notein.data.service.dto.TemplateFileDto;
import com.orion.notein.domain.models.material.Creator;
import com.orion.notein.domain.models.material.Entitlement;
import com.orion.notein.domain.models.material.Font;
import com.orion.notein.domain.models.material.Material;
import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.material.PageSize;
import com.orion.notein.domain.models.material.Palette;
import com.orion.notein.domain.models.material.Sticker;
import com.orion.notein.domain.models.material.TemplateBook;
import com.orion.notein.domain.models.material.TemplateCollection;
import com.orion.notein.domain.models.material.TemplateFile;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J!\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0002J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u001fH\u0002J \u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0002J \u0010\"\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0002J \u0010$\u001a\u00020%2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0002J \u0010&\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0002¨\u0006)"}, m80612d2 = {"Lcom/orion/notein/domain/mapper/MaterialMapper;", "", "<init>", "()V", "fromDto", "Lcom/orion/notein/domain/models/material/Material;", "dto", "Lcom/orion/notein/data/service/dto/MaterialDto;", "parseEntitlement", "Lcom/orion/notein/domain/models/material/Entitlement;", "value", "", "inferPageSize", "Lcom/orion/notein/domain/models/material/PageSize;", "width", "", "height", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/orion/notein/domain/models/material/PageSize;", "inferOrientation", "Lcom/orion/notein/domain/models/material/Orientation;", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/orion/notein/domain/models/material/Orientation;", "inferOrientationFromFiles", "files", "", "Lcom/orion/notein/domain/models/material/TemplateFile;", "mapTemplateCollection", "Lcom/orion/notein/domain/models/material/TemplateCollection;", "creator", "Lcom/orion/notein/domain/models/material/Creator;", "entitlement", "mapTemplateFile", "Lcom/orion/notein/data/service/dto/TemplateFileDto;", "mapTemplateBook", "Lcom/orion/notein/domain/models/material/TemplateBook;", "mapSticker", "Lcom/orion/notein/domain/models/material/Sticker;", "mapFont", "Lcom/orion/notein/domain/models/material/Font;", "mapPalette", "Lcom/orion/notein/domain/models/material/Palette;", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MaterialMapper {
    private static final String TAG = "MaterialMapper";
    private static final String TYPE_FONT = "font";
    private static final String TYPE_PALETTE = "palette";
    private static final String TYPE_STICKER = "sticker";
    private static final String TYPE_TEMPLATE_BOOK = "template_book";
    private static final String TYPE_TEMPLATE_SINGLE = "template_single";

    private final Orientation inferOrientation(Integer width, Integer height) {
        return (width == null || height == null) ? Orientation.PORTRAIT : width.intValue() > height.intValue() ? Orientation.LANDSCAPE : Orientation.PORTRAIT;
    }

    private final Orientation inferOrientationFromFiles(List<TemplateFile> files) {
        if (files.isEmpty()) {
            return Orientation.PORTRAIT;
        }
        List<TemplateFile> list = files;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TemplateFile) it.next()).getOrientation());
        }
        List listOooo0 = OooOo.Oooo0(arrayList);
        return listOooo0.size() == 1 ? (Orientation) OooOo.Oooo0oO(listOooo0) : Orientation.BOTH;
    }

    private final PageSize inferPageSize(Integer width, Integer height) {
        if (width == null || height == null) {
            return PageSize.CUSTOM;
        }
        int iMin = Math.min(width.intValue(), height.intValue());
        int iMax = Math.max(width.intValue(), height.intValue());
        return (590 > iMin || iMin >= 601 || 837 > iMax || iMax >= 848) ? (415 > iMin || iMin >= 426 || 590 > iMax || iMax >= 601) ? (607 > iMin || iMin >= 618 || 787 > iMax || iMax >= 798) ? PageSize.CUSTOM : PageSize.LETTER : PageSize.f57844A5 : PageSize.f57843A4;
    }

    private final Font mapFont(MaterialDto dto, Creator creator, Entitlement entitlement) {
        String str;
        List<String> list;
        List<String> list2;
        Creator creator2;
        List<String> fontWeights;
        String fontFamily;
        MaterialSpecDto spec = dto.getSpec();
        String id = dto.getId();
        String title = dto.getTitle();
        String description = dto.getDescription();
        if (description == null) {
            description = "";
            str = description;
        } else {
            str = "";
        }
        String coverUrl = dto.getCoverUrl();
        List<String> previewUrl = dto.getPreviewUrl();
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (previewUrl == null) {
            previewUrl = c34434OooOoO;
        }
        String downloadUrl = dto.getDownloadUrl();
        if (downloadUrl == null) {
            downloadUrl = str;
        }
        Long fileSize = dto.getFileSize();
        long jLongValue = fileSize != null ? fileSize.longValue() : 0L;
        String str2 = (spec == null || (fontFamily = spec.getFontFamily()) == null) ? str : fontFamily;
        if (spec == null || (fontWeights = spec.getFontWeights()) == null) {
            list = c34434OooOoO;
            list2 = previewUrl;
            creator2 = creator;
        } else {
            list = fontWeights;
            creator2 = creator;
            list2 = previewUrl;
        }
        return new Font(id, title, description, coverUrl, list2, entitlement, creator2, downloadUrl, jLongValue, str2, list);
    }

    private final Palette mapPalette(MaterialDto dto, Creator creator, Entitlement entitlement) {
        String str;
        List<String> list;
        List<String> list2;
        Creator creator2;
        List<String> swatches;
        MaterialSpecDto spec = dto.getSpec();
        String id = dto.getId();
        String title = dto.getTitle();
        String description = dto.getDescription();
        if (description == null) {
            description = "";
            str = description;
        } else {
            str = "";
        }
        String coverUrl = dto.getCoverUrl();
        List<String> previewUrl = dto.getPreviewUrl();
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (previewUrl == null) {
            previewUrl = c34434OooOoO;
        }
        String downloadUrl = dto.getDownloadUrl();
        if (downloadUrl == null) {
            downloadUrl = str;
        }
        Long fileSize = dto.getFileSize();
        long jLongValue = fileSize != null ? fileSize.longValue() : 0L;
        if (spec == null || (swatches = spec.getSwatches()) == null) {
            list = c34434OooOoO;
            list2 = previewUrl;
            creator2 = creator;
        } else {
            list = swatches;
            creator2 = creator;
            list2 = previewUrl;
        }
        return new Palette(id, title, description, coverUrl, list2, entitlement, creator2, downloadUrl, jLongValue, list);
    }

    private final Sticker mapSticker(MaterialDto dto, Creator creator, Entitlement entitlement) {
        String str;
        Integer stickerCount;
        MaterialSpecDto spec = dto.getSpec();
        String id = dto.getId();
        String title = dto.getTitle();
        String description = dto.getDescription();
        if (description == null) {
            description = "";
            str = description;
        } else {
            str = "";
        }
        String coverUrl = dto.getCoverUrl();
        List<String> previewUrl = dto.getPreviewUrl();
        if (previewUrl == null) {
            previewUrl = C34434OooOoO.f123453OooOo0o;
        }
        String downloadUrl = dto.getDownloadUrl();
        String str2 = downloadUrl == null ? str : downloadUrl;
        Long fileSize = dto.getFileSize();
        return new Sticker(id, title, description, coverUrl, previewUrl, entitlement, creator, str2, fileSize != null ? fileSize.longValue() : 0L, (spec == null || (stickerCount = spec.getStickerCount()) == null) ? 0 : stickerCount.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.orion.notein.domain.mapper.MaterialMapper] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    private final TemplateBook mapTemplateBook(MaterialDto dto, Creator creator, Entitlement entitlement) {
        ?? arrayList;
        Orientation orientationInferOrientation;
        String str;
        Integer pages;
        List<TemplateFileDto> files;
        MaterialSpecDto spec = dto.getSpec();
        List<String> list = C34434OooOoO.f123453OooOo0o;
        if (spec == null || (files = spec.getFiles()) == null) {
            arrayList = list;
        } else {
            List<TemplateFileDto> list2 = files;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(mapTemplateFile((TemplateFileDto) it.next()));
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0(TAG);
        String id = dto.getId();
        String title = dto.getTitle();
        int size = arrayList.size();
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("mapTemplateBook: id=", id, ", title=", title, ", files.size=");
        sbOooO0O0.append(size);
        c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
        Collection collection = (Collection) arrayList;
        if (!collection.isEmpty()) {
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO00o("  files[0]: path=" + ((TemplateFile) arrayList.get(0)).getPath() + ", orientation=" + ((TemplateFile) arrayList.get(0)).getOrientation() + ", color=" + ((TemplateFile) arrayList.get(0)).getColor(), new Object[0]);
        }
        if (collection.isEmpty()) {
            orientationInferOrientation = inferOrientation(spec != null ? spec.getWidth() : null, spec != null ? spec.getHeight() : null);
        } else {
            orientationInferOrientation = inferOrientationFromFiles(arrayList);
        }
        Orientation orientation = orientationInferOrientation;
        String id2 = dto.getId();
        String title2 = dto.getTitle();
        String description = dto.getDescription();
        if (description == null) {
            description = "";
            str = description;
        } else {
            str = "";
        }
        String coverUrl = dto.getCoverUrl();
        List<String> previewUrl = dto.getPreviewUrl();
        if (previewUrl != null) {
            list = previewUrl;
        }
        String downloadUrl = dto.getDownloadUrl();
        String str2 = downloadUrl == null ? str : downloadUrl;
        Long fileSize = dto.getFileSize();
        return new TemplateBook(id2, title2, description, coverUrl, list, entitlement, creator, str2, fileSize != null ? fileSize.longValue() : 0L, inferPageSize(spec != null ? spec.getWidth() : null, spec != null ? spec.getHeight() : null), orientation, (spec == null || (pages = spec.getPages()) == null) ? 0 : pages.intValue(), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.orion.notein.domain.mapper.MaterialMapper] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3 */
    private final TemplateCollection mapTemplateCollection(MaterialDto dto, Creator creator, Entitlement entitlement) {
        ?? arrayList;
        Orientation orientationInferOrientation;
        Integer pages;
        List<TemplateFileDto> files;
        MaterialSpecDto spec = dto.getSpec();
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (spec == null || (files = spec.getFiles()) == null) {
            arrayList = c34434OooOoO;
        } else {
            List<TemplateFileDto> list = files;
            arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapTemplateFile((TemplateFileDto) it.next()));
            }
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0(TAG);
        String id = dto.getId();
        String title = dto.getTitle();
        int size = arrayList.size();
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("mapTemplateCollection: id=", id, ", title=", title, ", files.size=");
        sbOooO0O0.append(size);
        int iIntValue = 0;
        c20358OooO00o.OooO00o(sbOooO0O0.toString(), new Object[0]);
        Collection collection = (Collection) arrayList;
        if (!collection.isEmpty()) {
            c20358OooO00o.OooOOO0(TAG);
            c20358OooO00o.OooO00o("  files[0]: path=" + ((TemplateFile) arrayList.get(0)).getPath() + ", orientation=" + ((TemplateFile) arrayList.get(0)).getOrientation() + ", color=" + ((TemplateFile) arrayList.get(0)).getColor(), new Object[0]);
        }
        if (collection.isEmpty()) {
            orientationInferOrientation = inferOrientation(spec != null ? spec.getWidth() : null, spec != null ? spec.getHeight() : null);
        } else {
            orientationInferOrientation = inferOrientationFromFiles(arrayList);
        }
        Orientation orientation = orientationInferOrientation;
        if (!collection.isEmpty()) {
            iIntValue = arrayList.size();
        } else if (spec != null && (pages = spec.getPages()) != null) {
            iIntValue = pages.intValue();
        }
        int i = iIntValue;
        ?? r17 = arrayList;
        String id2 = dto.getId();
        String title2 = dto.getTitle();
        String description = dto.getDescription();
        if (description == null) {
            description = "";
        }
        String coverUrl = dto.getCoverUrl();
        List<String> previewUrl = dto.getPreviewUrl();
        if (previewUrl == null) {
            previewUrl = c34434OooOoO;
        }
        String downloadUrl = dto.getDownloadUrl();
        if (downloadUrl == null) {
            downloadUrl = "";
        }
        Long fileSize = dto.getFileSize();
        return new TemplateCollection(id2, title2, description, coverUrl, previewUrl, entitlement, creator, downloadUrl, fileSize != null ? fileSize.longValue() : 0L, inferPageSize(spec != null ? spec.getWidth() : null, spec != null ? spec.getHeight() : null), orientation, i, c34434OooOoO, r17);
    }

    private final TemplateFile mapTemplateFile(TemplateFileDto dto) {
        String lowerCase = dto.getOrientation().toLowerCase(Locale.ROOT);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        return new TemplateFile(dto.getPath(), lowerCase.equals("landscape") ? Orientation.LANDSCAPE : Orientation.PORTRAIT, dto.getColor(), dto.getColorName());
    }

    private final Entitlement parseEntitlement(String value) {
        String lowerCase = value.toLowerCase(Locale.ROOT);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 116765) {
            if (iHashCode != 3151468) {
                if (iHashCode == 3433164 && lowerCase.equals("paid")) {
                    return Entitlement.PAID;
                }
            } else if (lowerCase.equals(DrawToolFactory.LASSO_TYPE_FREE)) {
                return Entitlement.FREE;
            }
        } else if (lowerCase.equals("vip")) {
            return Entitlement.VIP;
        }
        return Entitlement.FREE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Material fromDto(MaterialDto dto) {
        OooOOO0.OooO0oO(dto, "dto");
        String authorId = dto.getAuthorId();
        if (authorId == null) {
            authorId = "";
        }
        String authorName = dto.getAuthorName();
        String authorDescription = dto.getAuthorDescription();
        Creator creator = new Creator(authorId, authorName, authorDescription != null ? authorDescription : "", dto.getAuthorAvatarUrl());
        Entitlement entitlement = parseEntitlement(dto.getEntitlement());
        String type = dto.getType();
        switch (type.hashCode()) {
            case -1890252483:
                if (type.equals(TYPE_STICKER)) {
                    return mapSticker(dto, creator, entitlement);
                }
                break;
            case -1237346387:
                if (type.equals(TYPE_TEMPLATE_SINGLE)) {
                    return mapTemplateCollection(dto, creator, entitlement);
                }
                break;
            case -798910853:
                if (type.equals(TYPE_PALETTE)) {
                    return mapPalette(dto, creator, entitlement);
                }
                break;
            case -180558962:
                if (type.equals(TYPE_TEMPLATE_BOOK)) {
                    return mapTemplateBook(dto, creator, entitlement);
                }
                break;
            case 3148879:
                if (type.equals(TYPE_FONT)) {
                    return mapFont(dto, creator, entitlement);
                }
                break;
        }
        throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown material type: ", dto.getType()));
    }
}
