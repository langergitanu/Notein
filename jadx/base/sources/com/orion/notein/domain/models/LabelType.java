package com.orion.notein.domain.models;

import OooO.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m80612d2 = {"Lcom/orion/notein/domain/models/LabelType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FOLDER", "NOTE", "PAGE", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LabelType {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ LabelType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LabelType FOLDER = new LabelType("FOLDER", 0, 1);
    public static final LabelType NOTE = new LabelType("NOTE", 1, 17);
    public static final LabelType PAGE = new LabelType("PAGE", 2, 33);
    private final int value;

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/LabelType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/orion/notein/domain/models/LabelType;", "value", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final LabelType fromValue(int value) {
            for (LabelType labelType : LabelType.values()) {
                if (labelType.getValue() == value) {
                    return labelType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ LabelType[] $values() {
        return new LabelType[]{FOLDER, NOTE, PAGE};
    }

    static {
        LabelType[] labelTypeArr$values = $values();
        $VALUES = labelTypeArr$values;
        $ENTRIES = OooO00o.OooO0O0(labelTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private LabelType(String str, int i, int i2) {
        this.value = i2;
    }

    public static InterfaceC34452OooO00o<LabelType> getEntries() {
        return $ENTRIES;
    }

    public static LabelType valueOf(String str) {
        return (LabelType) Enum.valueOf(LabelType.class, str);
    }

    public static LabelType[] values() {
        return (LabelType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
