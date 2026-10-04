package com.google.firebase.vertexai.common.util;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¨\u0006\u0003"}, m80612d2 = {"fullModelName", "", "name", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class UtilKt {
    public static final String fullModelName(String name) {
        OooOOO0.OooO0oO(name, "name");
        String str = C33599OooOo0O.OooOoOO(name, "/", false) ? name : null;
        return str == null ? "models/".concat(name) : str;
    }
}
