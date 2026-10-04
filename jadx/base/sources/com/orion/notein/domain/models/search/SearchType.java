package com.orion.notein.domain.models.search;

import OooO.OooO00o;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m80612d2 = {"Lcom/orion/notein/domain/models/search/SearchType;", "", "<init>", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "NOTE", "TEXT", "OUTLINE", "COMMENT", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SearchType {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ SearchType[] $VALUES;
    public static final SearchType UNKNOWN = new SearchType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
    public static final SearchType NOTE = new SearchType("NOTE", 1);
    public static final SearchType TEXT = new SearchType("TEXT", 2);
    public static final SearchType OUTLINE = new SearchType("OUTLINE", 3);
    public static final SearchType COMMENT = new SearchType("COMMENT", 4);

    private static final /* synthetic */ SearchType[] $values() {
        return new SearchType[]{UNKNOWN, NOTE, TEXT, OUTLINE, COMMENT};
    }

    static {
        SearchType[] searchTypeArr$values = $values();
        $VALUES = searchTypeArr$values;
        $ENTRIES = OooO00o.OooO0O0(searchTypeArr$values);
    }

    private SearchType(String str, int i) {
    }

    public static InterfaceC34452OooO00o<SearchType> getEntries() {
        return $ENTRIES;
    }

    public static SearchType valueOf(String str) {
        return (SearchType) Enum.valueOf(SearchType.class, str);
    }

    public static SearchType[] values() {
        return (SearchType[]) $VALUES.clone();
    }
}
