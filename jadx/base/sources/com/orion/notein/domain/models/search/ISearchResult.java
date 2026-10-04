package com.orion.notein.domain.models.search;

import kotlin.Metadata;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0000H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m80612d2 = {"Lcom/orion/notein/domain/models/search/ISearchResult;", "", "", "getQuery", "()Ljava/lang/String;", "getId", "getTnPath", "LoO00ooO/OooOOO;", "", "getTnSize", "()LoO00ooO/OooOOO;", "getName", "deepCopy", "()Lcom/orion/notein/domain/models/search/ISearchResult;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface ISearchResult {
    ISearchResult deepCopy();

    String getId();

    String getName();

    String getQuery();

    String getTnPath();

    C32443OooOOO<Integer, Integer> getTnSize();
}
