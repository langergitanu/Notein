package com.orion.notein.domain.models.search;

import OooOoo0.o00000;
import OoooooO.C21445Oooo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0014\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m80612d2 = {"Lcom/orion/notein/domain/models/search/SearchResultGroup;", "", "searchType", "Lcom/orion/notein/domain/models/search/SearchType;", "searchResults", "", "Lcom/orion/notein/domain/models/search/ISearchResult;", "isInCompleted", "", "groupBy", "", "<init>", "(Lcom/orion/notein/domain/models/search/SearchType;Ljava/util/List;ZI)V", "getSearchType", "()Lcom/orion/notein/domain/models/search/SearchType;", "getSearchResults", "()Ljava/util/List;", "()Z", "getGroupBy", "()I", "deepCopy", "getGroupId", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class SearchResultGroup {
    public static final int GROUP_BY_NOTE = 0;
    private final int groupBy;
    private final boolean isInCompleted;
    private final List<ISearchResult> searchResults;
    private final SearchType searchType;

    @Metadata(m80613k = 3, m80614mv = {2, 1, 0}, m80616xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchType.values().length];
            try {
                iArr[SearchType.COMMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchType.OUTLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchResultGroup(SearchType searchType, List<? extends ISearchResult> searchResults, boolean z, int i) {
        OooOOO0.OooO0oO(searchType, "searchType");
        OooOOO0.OooO0oO(searchResults, "searchResults");
        this.searchType = searchType;
        this.searchResults = searchResults;
        this.isInCompleted = z;
        this.groupBy = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResultGroup copy$default(SearchResultGroup searchResultGroup, SearchType searchType, List list, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            searchType = searchResultGroup.searchType;
        }
        if ((i2 & 2) != 0) {
            list = searchResultGroup.searchResults;
        }
        if ((i2 & 4) != 0) {
            z = searchResultGroup.isInCompleted;
        }
        if ((i2 & 8) != 0) {
            i = searchResultGroup.groupBy;
        }
        return searchResultGroup.copy(searchType, list, z, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SearchType getSearchType() {
        return this.searchType;
    }

    public final List<ISearchResult> component2() {
        return this.searchResults;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsInCompleted() {
        return this.isInCompleted;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getGroupBy() {
        return this.groupBy;
    }

    public final SearchResultGroup copy(SearchType searchType, List<? extends ISearchResult> searchResults, boolean isInCompleted, int groupBy) {
        OooOOO0.OooO0oO(searchType, "searchType");
        OooOOO0.OooO0oO(searchResults, "searchResults");
        return new SearchResultGroup(searchType, searchResults, isInCompleted, groupBy);
    }

    public final SearchResultGroup deepCopy() {
        return deepCopy(false);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultGroup)) {
            return false;
        }
        SearchResultGroup searchResultGroup = (SearchResultGroup) other;
        return this.searchType == searchResultGroup.searchType && OooOOO0.OooO0O0(this.searchResults, searchResultGroup.searchResults) && this.isInCompleted == searchResultGroup.isInCompleted && this.groupBy == searchResultGroup.groupBy;
    }

    public final int getGroupBy() {
        return this.groupBy;
    }

    public final String getGroupId() {
        if (this.groupBy != 0) {
            return "";
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.searchType.ordinal()];
        if (i == 1) {
            Object objOooo0oO = OooOo.Oooo0oO(this.searchResults);
            OooOOO0.OooO0o0(objOooo0oO, "null cannot be cast to non-null type com.orion.notein.domain.models.search.CommentSearchResult");
            return ((CommentSearchResult) objOooo0oO).getComment().getNoteId();
        }
        if (i == 2) {
            Object objOooo0oO2 = OooOo.Oooo0oO(this.searchResults);
            OooOOO0.OooO0o0(objOooo0oO2, "null cannot be cast to non-null type com.orion.notein.domain.models.search.OutlineSearchResult");
            return ((OutlineSearchResult) objOooo0oO2).getOutline().getNoteId();
        }
        if (i != 3) {
            return "";
        }
        Object objOooo0oO3 = OooOo.Oooo0oO(this.searchResults);
        OooOOO0.OooO0o0(objOooo0oO3, "null cannot be cast to non-null type com.orion.notein.domain.models.search.TextSearchResult");
        return ((TextSearchResult) objOooo0oO3).getPage().getNoteId();
    }

    public final List<ISearchResult> getSearchResults() {
        return this.searchResults;
    }

    public final SearchType getSearchType() {
        return this.searchType;
    }

    public int hashCode() {
        return Integer.hashCode(this.groupBy) + o00000.OooO0O0(C21445Oooo.OooO00o(this.searchResults, this.searchType.hashCode() * 31, 31), 31, this.isInCompleted);
    }

    public final boolean isInCompleted() {
        return this.isInCompleted;
    }

    public String toString() {
        return "SearchResultGroup(searchType=" + this.searchType + ", searchResults=" + this.searchResults + ", isInCompleted=" + this.isInCompleted + ", groupBy=" + this.groupBy + ")";
    }

    public final SearchResultGroup deepCopy(boolean isInCompleted) {
        SearchType searchType = this.searchType;
        List<ISearchResult> list = this.searchResults;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ISearchResult) it.next()).deepCopy());
        }
        return new SearchResultGroup(searchType, arrayList, isInCompleted, this.groupBy);
    }

    public /* synthetic */ SearchResultGroup(SearchType searchType, List list, boolean z, int i, int i2, C24018OooO0oo c24018OooO0oo) {
        this(searchType, list, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i);
    }
}
