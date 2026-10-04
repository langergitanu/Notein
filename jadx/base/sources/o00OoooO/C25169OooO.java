package o00OoooO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o00OoooO.C25179OooO0oO;

/* JADX INFO: renamed from: o00OoooO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25169OooO implements C25179OooO0oO.InterfaceC25180OooO0Oo<InputStream> {
    @Override // o00OoooO.C25179OooO0oO.InterfaceC25180OooO0Oo
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    @Override // o00OoooO.C25179OooO0oO.InterfaceC25180OooO0Oo
    public final void OooO0O0(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // o00OoooO.C25179OooO0oO.InterfaceC25180OooO0Oo
    public final InputStream OooO0OO(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }
}
