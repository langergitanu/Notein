package com.microsoft.identity.common.java.logging;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface IRequestContext extends Map<String, String> {
    String toJsonString();
}
