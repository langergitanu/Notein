package oO0O000;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO0O000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32499OooO0Oo extends IOException {
    public C32499OooO0Oo(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        sb.append(": ".concat(str));
        String string = sb.toString();
        OooOOO0.OooO0o(string, "toString(...)");
        super(string);
    }
}
