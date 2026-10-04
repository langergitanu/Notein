package com.orion.notein.domain.models.search;

import OoooooO.C21445Oooo;
import androidx.appcompat.app.OooOOO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000f¨\u0006\u001a"}, m80612d2 = {"Lcom/orion/notein/domain/models/search/SearchResultCategory;", "", "searchType", "Lcom/orion/notein/domain/models/search/SearchType;", "groups", "", "Lcom/orion/notein/domain/models/search/SearchResultGroup;", "isInCompleted", "", "<init>", "(Lcom/orion/notein/domain/models/search/SearchType;Ljava/util/List;Z)V", "getSearchType", "()Lcom/orion/notein/domain/models/search/SearchType;", "getGroups", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class SearchResultCategory {
    private final List<SearchResultGroup> groups;
    private final boolean isInCompleted;
    private final SearchType searchType;

    public SearchResultCategory(SearchType searchType, List<SearchResultGroup> groups, boolean z) {
        OooOOO0.OooO0oO(searchType, "searchType");
        OooOOO0.OooO0oO(groups, "groups");
        this.searchType = searchType;
        this.groups = groups;
        this.isInCompleted = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResultCategory copy$default(SearchResultCategory searchResultCategory, SearchType searchType, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            searchType = searchResultCategory.searchType;
        }
        if ((i & 2) != 0) {
            list = searchResultCategory.groups;
        }
        if ((i & 4) != 0) {
            z = searchResultCategory.isInCompleted;
        }
        return searchResultCategory.copy(searchType, list, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SearchType getSearchType() {
        return this.searchType;
    }

    public final List<SearchResultGroup> component2() {
        return this.groups;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsInCompleted() {
        return this.isInCompleted;
    }

    public final SearchResultCategory copy(SearchType searchType, List<SearchResultGroup> groups, boolean isInCompleted) {
        OooOOO0.OooO0oO(searchType, "searchType");
        OooOOO0.OooO0oO(groups, "groups");
        return new SearchResultCategory(searchType, groups, isInCompleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultCategory)) {
            return false;
        }
        SearchResultCategory searchResultCategory = (SearchResultCategory) other;
        return this.searchType == searchResultCategory.searchType && OooOOO0.OooO0O0(this.groups, searchResultCategory.groups) && this.isInCompleted == searchResultCategory.isInCompleted;
    }

    public final List<SearchResultGroup> getGroups() {
        return this.groups;
    }

    public final SearchType getSearchType() {
        return this.searchType;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isInCompleted) + C21445Oooo.OooO00o(this.groups, this.searchType.hashCode() * 31, 31);
    }

    public final boolean isInCompleted() {
        return this.isInCompleted;
    }

    public String toString() {
        SearchType searchType = this.searchType;
        List<SearchResultGroup> list = this.groups;
        boolean z = this.isInCompleted;
        StringBuilder sb = new StringBuilder("SearchResultCategory(searchType=");
        sb.append(searchType);
        sb.append(", groups=");
        sb.append(list);
        sb.append(", isInCompleted=");
        return OooOOO.OooO00o(sb, ")", z);
    }

    public /* synthetic */ SearchResultCategory(SearchType searchType, List list, boolean z, int i, C24018OooO0oo c24018OooO0oo) {
        this(searchType, list, (i & 4) != 0 ? false : z);
    }
}
