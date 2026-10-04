package com.orion.notein.domain.models.material;

import OooO.OooO00o;
import kotlin.Metadata;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/MaterialActionType;", "", "<init>", "(Ljava/lang/String;I)V", "DOWNLOAD", "APPLIED", "ADD_TEMPLATE", "ADD_FONT", "IMPORT_STICKER", "ADD_PALETTE", "GO_TO_CREATE", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MaterialActionType {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ MaterialActionType[] $VALUES;
    public static final MaterialActionType DOWNLOAD = new MaterialActionType("DOWNLOAD", 0);
    public static final MaterialActionType APPLIED = new MaterialActionType("APPLIED", 1);
    public static final MaterialActionType ADD_TEMPLATE = new MaterialActionType("ADD_TEMPLATE", 2);
    public static final MaterialActionType ADD_FONT = new MaterialActionType("ADD_FONT", 3);
    public static final MaterialActionType IMPORT_STICKER = new MaterialActionType("IMPORT_STICKER", 4);
    public static final MaterialActionType ADD_PALETTE = new MaterialActionType("ADD_PALETTE", 5);
    public static final MaterialActionType GO_TO_CREATE = new MaterialActionType("GO_TO_CREATE", 6);

    private static final /* synthetic */ MaterialActionType[] $values() {
        return new MaterialActionType[]{DOWNLOAD, APPLIED, ADD_TEMPLATE, ADD_FONT, IMPORT_STICKER, ADD_PALETTE, GO_TO_CREATE};
    }

    static {
        MaterialActionType[] materialActionTypeArr$values = $values();
        $VALUES = materialActionTypeArr$values;
        $ENTRIES = OooO00o.OooO0O0(materialActionTypeArr$values);
    }

    private MaterialActionType(String str, int i) {
    }

    public static InterfaceC34452OooO00o<MaterialActionType> getEntries() {
        return $ENTRIES;
    }

    public static MaterialActionType valueOf(String str) {
        return (MaterialActionType) Enum.valueOf(MaterialActionType.class, str);
    }

    public static MaterialActionType[] values() {
        return (MaterialActionType[]) $VALUES.clone();
    }
}
