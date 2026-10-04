package com.google.firebase.vertexai.type;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo00O0O.AbstractC34457OooO0OO;
import oOo00O0O.C34474OooOoo0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m80612d2 = {"Lorg/json/JSONObject;", "LoOo00O0O/OooOoo0;", "toInternal", "(Lorg/json/JSONObject;)LoOo00O0O/OooOoo0;", "toPublic", "(LoOo00O0O/OooOoo0;)Lorg/json/JSONObject;", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class TypeKt {
    public static final C34474OooOoo0 toInternal(JSONObject jSONObject) {
        OooOOO0.OooO0oO(jSONObject, "<this>");
        AbstractC34457OooO0OO.OooO00o oooO00o = AbstractC34457OooO0OO.f123490OooO0Oo;
        String string = jSONObject.toString();
        OooOOO0.OooO0o(string, "toString()");
        oooO00o.getClass();
        return (C34474OooOoo0) oooO00o.OooO0O0(string, C34474OooOoo0.Companion.serializer());
    }

    public static final JSONObject toPublic(C34474OooOoo0 c34474OooOoo0) {
        OooOOO0.OooO0oO(c34474OooOoo0, "<this>");
        return new JSONObject(c34474OooOoo0.toString());
    }
}
