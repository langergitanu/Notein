package com.orion.notein.domain.models.material;

import OooO.OooO00o;
import kotlin.Metadata;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/domain/models/material/PageSize;", "", "<init>", "(Ljava/lang/String;I)V", "A4", "A5", "LETTER", "CUSTOM", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageSize {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ PageSize[] $VALUES;

    /* JADX INFO: renamed from: A4 */
    public static final PageSize f57843A4 = new PageSize("A4", 0);

    /* JADX INFO: renamed from: A5 */
    public static final PageSize f57844A5 = new PageSize("A5", 1);
    public static final PageSize LETTER = new PageSize("LETTER", 2);
    public static final PageSize CUSTOM = new PageSize("CUSTOM", 3);

    private static final /* synthetic */ PageSize[] $values() {
        return new PageSize[]{f57843A4, f57844A5, LETTER, CUSTOM};
    }

    static {
        PageSize[] pageSizeArr$values = $values();
        $VALUES = pageSizeArr$values;
        $ENTRIES = OooO00o.OooO0O0(pageSizeArr$values);
    }

    private PageSize(String str, int i) {
    }

    public static InterfaceC34452OooO00o<PageSize> getEntries() {
        return $ENTRIES;
    }

    public static PageSize valueOf(String str) {
        return (PageSize) Enum.valueOf(PageSize.class, str);
    }

    public static PageSize[] values() {
        return (PageSize[]) $VALUES.clone();
    }
}
