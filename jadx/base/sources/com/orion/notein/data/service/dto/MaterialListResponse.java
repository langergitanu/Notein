package com.orion.notein.data.service.dto;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/MaterialListResponse;", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/orion/notein/data/service/dto/MaterialDto;", "pagination", "Lcom/orion/notein/data/service/dto/PaginationDto;", "<init>", "(Ljava/util/List;Lcom/orion/notein/data/service/dto/PaginationDto;)V", "getItems", "()Ljava/util/List;", "getPagination", "()Lcom/orion/notein/data/service/dto/PaginationDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class MaterialListResponse {
    private final List<MaterialDto> items;
    private final PaginationDto pagination;

    public MaterialListResponse(List<MaterialDto> items, PaginationDto pagination) {
        OooOOO0.OooO0oO(items, "items");
        OooOOO0.OooO0oO(pagination, "pagination");
        this.items = items;
        this.pagination = pagination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MaterialListResponse copy$default(MaterialListResponse materialListResponse, List list, PaginationDto paginationDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = materialListResponse.items;
        }
        if ((i & 2) != 0) {
            paginationDto = materialListResponse.pagination;
        }
        return materialListResponse.copy(list, paginationDto);
    }

    public final List<MaterialDto> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaginationDto getPagination() {
        return this.pagination;
    }

    public final MaterialListResponse copy(List<MaterialDto> items, PaginationDto pagination) {
        OooOOO0.OooO0oO(items, "items");
        OooOOO0.OooO0oO(pagination, "pagination");
        return new MaterialListResponse(items, pagination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaterialListResponse)) {
            return false;
        }
        MaterialListResponse materialListResponse = (MaterialListResponse) other;
        return OooOOO0.OooO0O0(this.items, materialListResponse.items) && OooOOO0.OooO0O0(this.pagination, materialListResponse.pagination);
    }

    public final List<MaterialDto> getItems() {
        return this.items;
    }

    public final PaginationDto getPagination() {
        return this.pagination;
    }

    public int hashCode() {
        return this.pagination.hashCode() + (this.items.hashCode() * 31);
    }

    public String toString() {
        return "MaterialListResponse(items=" + this.items + ", pagination=" + this.pagination + ")";
    }
}
