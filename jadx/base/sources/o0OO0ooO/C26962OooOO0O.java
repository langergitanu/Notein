package o0OO0ooO;

import com.orion.notein.domain.models.material.MaterialDownloader;
import java.io.File;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o0OO0ooO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26962OooOO0O implements MaterialDownloader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractApplicationC26277OooOoOO f93663OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OkHttpClient f93664OooO0O0;

    public C26962OooOO0O(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO, OkHttpClient okHttpClient) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(okHttpClient, "okHttpClient");
        this.f93663OooO00o = abstractApplicationC26277OooOoOO;
        this.f93664OooO0O0 = okHttpClient;
    }

    @Override // com.orion.notein.domain.models.material.MaterialDownloader
    public final String getBaseDir() {
        String absolutePath = new File(this.f93663OooO00o.getFilesDir(), "materials").getAbsolutePath();
        kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }
}
