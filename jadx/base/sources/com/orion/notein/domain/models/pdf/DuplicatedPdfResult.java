package com.orion.notein.domain.models.pdf;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/domain/models/pdf/DuplicatedPdfResult;", "", "duplicatedPdfPath", "", "srcPageNumberToDstPageNumber", "", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getDuplicatedPdfPath", "()Ljava/lang/String;", "getSrcPageNumberToDstPageNumber", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class DuplicatedPdfResult {
    private final String duplicatedPdfPath;
    private final Map<Integer, Integer> srcPageNumberToDstPageNumber;

    public DuplicatedPdfResult(String duplicatedPdfPath, Map<Integer, Integer> srcPageNumberToDstPageNumber) {
        OooOOO0.OooO0oO(duplicatedPdfPath, "duplicatedPdfPath");
        OooOOO0.OooO0oO(srcPageNumberToDstPageNumber, "srcPageNumberToDstPageNumber");
        this.duplicatedPdfPath = duplicatedPdfPath;
        this.srcPageNumberToDstPageNumber = srcPageNumberToDstPageNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DuplicatedPdfResult copy$default(DuplicatedPdfResult duplicatedPdfResult, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = duplicatedPdfResult.duplicatedPdfPath;
        }
        if ((i & 2) != 0) {
            map = duplicatedPdfResult.srcPageNumberToDstPageNumber;
        }
        return duplicatedPdfResult.copy(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuplicatedPdfPath() {
        return this.duplicatedPdfPath;
    }

    public final Map<Integer, Integer> component2() {
        return this.srcPageNumberToDstPageNumber;
    }

    public final DuplicatedPdfResult copy(String duplicatedPdfPath, Map<Integer, Integer> srcPageNumberToDstPageNumber) {
        OooOOO0.OooO0oO(duplicatedPdfPath, "duplicatedPdfPath");
        OooOOO0.OooO0oO(srcPageNumberToDstPageNumber, "srcPageNumberToDstPageNumber");
        return new DuplicatedPdfResult(duplicatedPdfPath, srcPageNumberToDstPageNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DuplicatedPdfResult)) {
            return false;
        }
        DuplicatedPdfResult duplicatedPdfResult = (DuplicatedPdfResult) other;
        return OooOOO0.OooO0O0(this.duplicatedPdfPath, duplicatedPdfResult.duplicatedPdfPath) && OooOOO0.OooO0O0(this.srcPageNumberToDstPageNumber, duplicatedPdfResult.srcPageNumberToDstPageNumber);
    }

    public final String getDuplicatedPdfPath() {
        return this.duplicatedPdfPath;
    }

    public final Map<Integer, Integer> getSrcPageNumberToDstPageNumber() {
        return this.srcPageNumberToDstPageNumber;
    }

    public int hashCode() {
        return this.srcPageNumberToDstPageNumber.hashCode() + (this.duplicatedPdfPath.hashCode() * 31);
    }

    public String toString() {
        return "DuplicatedPdfResult(duplicatedPdfPath=" + this.duplicatedPdfPath + ", srcPageNumberToDstPageNumber=" + this.srcPageNumberToDstPageNumber + ")";
    }
}
