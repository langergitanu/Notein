package o00OoooO;

import android.os.ParcelFileDescriptor;
import com.aspose.words.WarningType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import o00OoooO.C25179OooO0oO;

/* JADX INFO: renamed from: o00OoooO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25182OooO0oo implements C25179OooO0oO.InterfaceC25180OooO0Oo<ParcelFileDescriptor> {
    @Override // o00OoooO.C25179OooO0oO.InterfaceC25180OooO0Oo
    public final Class<ParcelFileDescriptor> OooO00o() {
        return ParcelFileDescriptor.class;
    }

    @Override // o00OoooO.C25179OooO0oO.InterfaceC25180OooO0Oo
    public final void OooO0O0(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // o00OoooO.C25179OooO0oO.InterfaceC25180OooO0Oo
    public final ParcelFileDescriptor OooO0OO(File file) throws FileNotFoundException {
        return ParcelFileDescriptor.open(file, WarningType.HINT);
    }
}
