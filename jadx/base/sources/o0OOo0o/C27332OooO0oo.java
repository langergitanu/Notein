package o0OOo0o;

import com.orion.notein.domain.models.backup.BackupFile;
import java.io.File;
import java.io.FileFilter;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: o0OOo0o.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27332OooO0oo implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        String name = file != null ? file.getName() : null;
        boolean z = false;
        if (name != null && C33595OooOOo.OooOOo0(name, BackupFile.EXTENSION_NOTEIN_FILE, false)) {
            z = true;
        }
        return !z;
    }
}
