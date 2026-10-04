package com.orion.notein.domain.models.page;

import OooO.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/PaperOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PaperOrientation {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ PaperOrientation[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PaperOrientation HORIZONTAL = new PaperOrientation("HORIZONTAL", 0);
    public static final PaperOrientation VERTICAL = new PaperOrientation("VERTICAL", 1);

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m80612d2 = {"Lcom/orion/notein/domain/models/page/PaperOrientation$Companion;", "", "<init>", "()V", "getOrientation", "Lcom/orion/notein/domain/models/page/PaperOrientation;", "width", "", "height", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final PaperOrientation getOrientation(int width, int height) {
            return width > height ? PaperOrientation.HORIZONTAL : PaperOrientation.VERTICAL;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PaperOrientation[] $values() {
        return new PaperOrientation[]{HORIZONTAL, VERTICAL};
    }

    static {
        PaperOrientation[] paperOrientationArr$values = $values();
        $VALUES = paperOrientationArr$values;
        $ENTRIES = OooO00o.OooO0O0(paperOrientationArr$values);
        INSTANCE = new Companion(null);
    }

    private PaperOrientation(String str, int i) {
    }

    public static InterfaceC34452OooO00o<PaperOrientation> getEntries() {
        return $ENTRIES;
    }

    public static PaperOrientation valueOf(String str) {
        return (PaperOrientation) Enum.valueOf(PaperOrientation.class, str);
    }

    public static PaperOrientation[] values() {
        return (PaperOrientation[]) $VALUES.clone();
    }
}
