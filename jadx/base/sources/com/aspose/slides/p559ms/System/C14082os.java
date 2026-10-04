package com.aspose.slides.p559ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.os */
/* JADX INFO: loaded from: classes5.dex */
final class C14082os extends AbstractC14070jw {

    /* JADX INFO: renamed from: du */
    private boolean f47287du;

    public C14082os(boolean z) {
        this.f47287du = z;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14070jw, java.util.Comparator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public int compare(String str, String str2) {
        return this.f47287du ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14070jw, com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public int hashCodeT(String str) {
        if (str != null) {
            return this.f47287du ? str.toLowerCase().hashCode() : str.hashCode();
        }
        throw new ArgumentNullException("s");
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14070jw, com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public boolean equalsT(String str, String str2) {
        return this.f47287du ? compare(str, str2) == 0 : C14113y2.m67363du(str, str2);
    }
}
