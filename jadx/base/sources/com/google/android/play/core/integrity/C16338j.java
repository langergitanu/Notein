package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.j */
/* JADX INFO: loaded from: classes7.dex */
public final class C16338j implements InterfaceC16339k {
    @Override // com.google.android.play.core.integrity.InterfaceC16339k
    /* JADX INFO: renamed from: a */
    public final ApiException mo74978a(Bundle bundle) {
        int i = bundle.getInt("error");
        if (i == 0) {
            return null;
        }
        return new StandardIntegrityException(i, null);
    }
}
