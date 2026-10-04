package com.orion.notein.data.service.dto;

import OooO0Oo.C20398OooO0O0;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/PaginationDto;", "", "page", "", "size", "total", "<init>", "(III)V", "getPage", "()I", "getSize", "getTotal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PaginationDto {
    private final int page;
    private final int size;
    private final int total;

    public PaginationDto(int i, int i2, int i3) {
        this.page = i;
        this.size = i2;
        this.total = i3;
    }

    public static /* synthetic */ PaginationDto copy$default(PaginationDto paginationDto, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = paginationDto.page;
        }
        if ((i4 & 2) != 0) {
            i2 = paginationDto.size;
        }
        if ((i4 & 4) != 0) {
            i3 = paginationDto.total;
        }
        return paginationDto.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final PaginationDto copy(int page, int size, int total) {
        return new PaginationDto(page, size, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginationDto)) {
            return false;
        }
        PaginationDto paginationDto = (PaginationDto) other;
        return this.page == paginationDto.page && this.size == paginationDto.size && this.total == paginationDto.total;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Integer.hashCode(this.total) + C20785Oooo00o.OooO00o(this.size, Integer.hashCode(this.page) * 31, 31);
    }

    public String toString() {
        return C21023OooO0Oo.OooO0OO(")", this.total, C20398OooO0O0.OooO0O0("PaginationDto(page=", this.page, ", size=", ", total=", this.size));
    }
}
