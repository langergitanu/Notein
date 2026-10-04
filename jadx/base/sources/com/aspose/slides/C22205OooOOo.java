package com.aspose.slides;

import android.content.Context;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* JADX INFO: renamed from: com.aspose.slides.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22205OooOOo implements LibraryVersionComponent.VersionExtractor {
    public static float OooO00o(C12007ix c12007ix, float f, float f2) {
        return (c12007ix.m56550c5() / f) + f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Bundle, java.lang.Exception, java.lang.StringBuilder] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 3, list:
          (r0v0 ?? I:java.lang.StringBuilder) from 0x0002: INVOKE (r0v0 ?? I:java.lang.StringBuilder) DIRECT call: java.lang.StringBuilder.toString():java.lang.String A[MD:():java.lang.String (c)]
          (r0v0 ?? I:java.lang.Exception) from 0x0005: INVOKE (r0v0 ?? I:java.lang.Exception) VIRTUAL call: java.lang.Exception.getMessage():java.lang.String A[MD:():java.lang.String (c)]
          (r0v0 ?? I:android.os.Bundle) from 0x0008: RETURN (r0v0 ?? I:android.os.Bundle)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static android.os.Bundle OooO0O0(java.lang.String r1, boolean r2) {
        /*
            android.os.Bundle r0 = new android.os.Bundle
            r0.toString()
            r0.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.slides.C22205OooOOo.OooO0O0(java.lang.String, boolean):android.os.Bundle");
    }

    public static void OooO0OO(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$2((Context) obj);
    }
}
