package com.orion.notein.domain.models;

import OooO.OooO00o;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m80612d2 = {"Lcom/orion/notein/domain/models/LabelColor;", "", "LoO00ooO/OooOo0O;", "colorValue", "", "nameResId", "<init>", "(Ljava/lang/String;III)V", "I", "getColorValue-pVg5ArA", "()I", "getNameResId", "Companion", "RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "PURPLE", "GRAY", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LabelColor {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ LabelColor[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int colorValue;
    private final int nameResId;
    public static final LabelColor RED = new LabelColor("RED", 0, -2752486, R.string.label_color_red);
    public static final LabelColor ORANGE = new LabelColor("ORANGE", 1, -701178, R.string.label_color_orange);
    public static final LabelColor YELLOW = new LabelColor("YELLOW", 2, -808951, R.string.label_color_yellow);
    public static final LabelColor GREEN = new LabelColor("GREEN", 3, -12791385, R.string.label_color_green);
    public static final LabelColor BLUE = new LabelColor("BLUE", 4, -15893762, R.string.label_color_blue);
    public static final LabelColor PURPLE = new LabelColor("PURPLE", 5, -11329112, R.string.label_color_purple);
    public static final LabelColor GRAY = new LabelColor("GRAY", 6, -10854556, R.string.label_color_gray);

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/LabelColor$Companion;", "", "<init>", "()V", "LoO00ooO/OooOo0O;", "color", "Lcom/orion/notein/domain/models/LabelColor;", "fromValue-WZ4Q5Ns", "(I)Lcom/orion/notein/domain/models/LabelColor;", "fromValue", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: renamed from: fromValue-WZ4Q5Ns, reason: not valid java name */
        public final LabelColor m80735fromValueWZ4Q5Ns(int color) {
            for (LabelColor labelColor : LabelColor.values()) {
                if (labelColor.getColorValue() == color) {
                    return labelColor;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ LabelColor[] $values() {
        return new LabelColor[]{RED, ORANGE, YELLOW, GREEN, BLUE, PURPLE, GRAY};
    }

    static {
        LabelColor[] labelColorArr$values = $values();
        $VALUES = labelColorArr$values;
        $ENTRIES = OooO00o.OooO0O0(labelColorArr$values);
        INSTANCE = new Companion(null);
    }

    private LabelColor(String str, int i, int i2, int i3) {
        this.colorValue = i2;
        this.nameResId = i3;
    }

    public static InterfaceC34452OooO00o<LabelColor> getEntries() {
        return $ENTRIES;
    }

    public static LabelColor valueOf(String str) {
        return (LabelColor) Enum.valueOf(LabelColor.class, str);
    }

    public static LabelColor[] values() {
        return (LabelColor[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getColorValue-pVg5ArA, reason: not valid java name and from getter */
    public final int getColorValue() {
        return this.colorValue;
    }

    public final int getNameResId() {
        return this.nameResId;
    }
}
