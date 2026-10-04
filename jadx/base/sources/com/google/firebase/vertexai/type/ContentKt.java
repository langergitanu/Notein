package com.google.firebase.vertexai.type;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.vertexai.type.Content;
import com.huawei.hms.network.embedded.C18374u4;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m80612d2 = {"", "role", "Lkotlin/Function1;", "Lcom/google/firebase/vertexai/type/Content$Builder;", "LoO00ooO/OooOooO;", C18374u4.f56270c, "Lcom/google/firebase/vertexai/type/Content;", FirebaseAnalytics.Param.CONTENT, "(Ljava/lang/String;LoO0O000o/OooOO0o;)Lcom/google/firebase/vertexai/type/Content;", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ContentKt {
    public static final Content content(String str, InterfaceC32507OooOO0o<? super Content.Builder, C32460OooOooO> init) {
        OooOOO0.OooO0oO(init, "init");
        Content.Builder builder = new Content.Builder();
        builder.setRole(str);
        init.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ Content content$default(String str, InterfaceC32507OooOO0o interfaceC32507OooOO0o, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "user";
        }
        return content(str, interfaceC32507OooOO0o);
    }
}
