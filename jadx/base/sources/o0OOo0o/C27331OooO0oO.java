package o0OOo0o;

import java.io.File;
import java.io.FileFilter;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o0OOo0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27331OooO0oO implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        String name = file != null ? file.getName() : null;
        boolean z = false;
        if (name != null && C33595OooOOo.OooOOo0(name, "template", false)) {
            z = true;
        }
        return !z;
    }
}
