package o0Oo00o;

import com.google.gson.GsonBuilder;

/* JADX INFO: renamed from: o0Oo00o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28027OooO0Oo implements oO0O000o.OooO00o {
    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        return new GsonBuilder().addDeserializationExclusionStrategy(new C28030OooO0oO()).addSerializationExclusionStrategy(new C28030OooO0oO()).disableHtmlEscaping().create();
    }
}
