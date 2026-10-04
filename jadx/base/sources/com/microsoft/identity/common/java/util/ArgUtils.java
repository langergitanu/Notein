package com.microsoft.identity.common.java.util;

import com.microsoft.identity.common.java.exception.ClientException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/microsoft/identity/common/java/util/ArgUtils;", "", "<init>", "()V", "o", "", "argName", "LoO00ooO/OooOooO;", "validateNonNullArg", "(Ljava/lang/Object;Ljava/lang/String;)V", "common4j"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class ArgUtils {
    public static final ArgUtils INSTANCE = new ArgUtils();

    private ArgUtils() {
    }

    public final void validateNonNullArg(Object o2, String argName) throws ClientException {
        OooOOO0.OooO0oO(argName, "argName");
        if (o2 == null || (((o2 instanceof char[]) && ((char[]) o2).length == 0) || (((o2 instanceof CharSequence) && C33599OooOo0O.Oooo0o0((CharSequence) o2)) || (((o2 instanceof String) && C33599OooOo0O.Oooo0o0((CharSequence) o2)) || (((o2 instanceof List) && ((List) o2).isEmpty()) || ((o2 instanceof Map) && ((Map) o2).isEmpty())))))) {
            throw new ClientException(argName, argName.concat(" cannot be null or empty"));
        }
    }
}
