package com.orion.notein.domain.models.material;

import OooO.OooO00o;
import com.facebook.soloader.OooOo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import oOo000Oo.C34429OooOOo0;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0017\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/MaterialCategory;", "", "apiTypes", "", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getApiTypes", "()Ljava/util/List;", "TEMPLATE", "STICKER", "FONT", "PALETTE", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MaterialCategory {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ MaterialCategory[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final List<MaterialCategory> DEFAULT_ORDER;
    public static final MaterialCategory FONT;
    public static final MaterialCategory PALETTE;
    public static final MaterialCategory STICKER;
    public static final MaterialCategory TEMPLATE;
    private final List<String> apiTypes;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/MaterialCategory$Companion;", "", "<init>", "()V", "DEFAULT_ORDER", "", "Lcom/orion/notein/domain/models/material/MaterialCategory;", "getDEFAULT_ORDER", "()Ljava/util/List;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final List<MaterialCategory> getDEFAULT_ORDER() {
            return MaterialCategory.DEFAULT_ORDER;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MaterialCategory[] $values() {
        return new MaterialCategory[]{TEMPLATE, STICKER, FONT, PALETTE};
    }

    static {
        MaterialCategory materialCategory = new MaterialCategory("TEMPLATE", 0, C34429OooOOo0.OooOO0o("template_single", "template_book"));
        TEMPLATE = materialCategory;
        MaterialCategory materialCategory2 = new MaterialCategory("STICKER", 1, OooOo.OooO0oO("sticker"));
        STICKER = materialCategory2;
        MaterialCategory materialCategory3 = new MaterialCategory("FONT", 2, OooOo.OooO0oO("font"));
        FONT = materialCategory3;
        MaterialCategory materialCategory4 = new MaterialCategory("PALETTE", 3, OooOo.OooO0oO("palette"));
        PALETTE = materialCategory4;
        MaterialCategory[] materialCategoryArr$values = $values();
        $VALUES = materialCategoryArr$values;
        $ENTRIES = OooO00o.OooO0O0(materialCategoryArr$values);
        INSTANCE = new Companion(null);
        DEFAULT_ORDER = C34429OooOOo0.OooOO0o(materialCategory, materialCategory2, materialCategory3, materialCategory4);
    }

    private MaterialCategory(String str, int i, List list) {
        this.apiTypes = list;
    }

    public static InterfaceC34452OooO00o<MaterialCategory> getEntries() {
        return $ENTRIES;
    }

    public static MaterialCategory valueOf(String str) {
        return (MaterialCategory) Enum.valueOf(MaterialCategory.class, str);
    }

    public static MaterialCategory[] values() {
        return (MaterialCategory[]) $VALUES.clone();
    }

    public final List<String> getApiTypes() {
        return this.apiTypes;
    }
}
